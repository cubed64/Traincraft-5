package com.jcirmodelsquad.tcjcir.features.autotrain;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import cpw.mods.fml.common.network.NetworkRegistry;
import ebf.XmlBuilder;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.Vec3;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;
import train.common.core.network.PacketParkingBrake;
import train.common.mtc.network.*;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import java.util.LinkedList;
import java.util.List;

public class AutoTrain2 {

    public static class Action {
        public String action;
        public Vec3 position;

        public String param1;
        public String param2;

        public Action(String action, Vec3 position, String param1, String param2) {
            this.position = position;
            this.action = action;
            this.param1 = param1;
            this.param2 = param2;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getParam1() {
            return param1;
        }

        public void setParam1(String param1) {
            this.param1 = param1;
        }

        public String getParam2() {
            return param2;
        }

        public void setParam2(String param2) {
            this.param2 = param2;
        }

        public Vec3 getPosition() {
            return position;
        }

        public void setPosition(Vec3 position) {
            this.position = position;
        }

        @Override
        public String toString() {
            return "Action{" +
                    "action='" + action + '\'' +
                    ", position=" + (position != null ? position.toString() : "null") +
                    ", param1='" + param1 + '\'' +
                    ", param2='" + param2 + '\'' +
                    '}';
        }

        public JsonObject toJSON() {
            JsonObject result = new JsonObject();
            result.addProperty("action", action);
            result.addProperty("position", (position != null ? position.toString() : "null"));
            result.addProperty("param1", param1);
            result.addProperty("param2", param2);
            return result;
        }
    }


    public Locomotive locomotive;

    public boolean active = false;
    public boolean pdmMode = true;
    /*PDM lets track switches and speed limits be determined by a Dynamic Signal Server, instead of onboard.
    PDM Stands for Peach Driverless Metro, it's an old thing, you wouldn't get it.*/

    public List<Action> driveScript = new LinkedList<>();

    public Action doneAction = null;

    public int position, speedPosition = 0;

    private long lastMills = 0L;
    private long lastMillsRTD = 0L;

    public String status = "";

    public XmlBuilder statusXML;
    public JsonArray driveScriptJSON;

    public int ttId = -1;


    public AutoTrain2(Locomotive locomotive) {
        this.locomotive = locomotive;
        init();
    }


    public JsonObject parseDriveScript(String input) {
        //DriveScripts are json. Here is an example.
        /*
        {
    "name" : "TestWorld Up",
    "version" : "drivescript0.5",
    "pdmMode" : true,
    "drivescript" : [
        {"action" : "stationStop", "xyz" : "119|64|85", "param1" : "Station 1", "param2" : "20"},
        {"action" : "stationStop", "xyz" : "-10|64|259", "param1" : "Station 2", "param2" : "20"},
        {"action" : "stationStop", "xyz" : "67|64|735", "param1" : "Station 3", "param2" : "20"}
    ],
    "doneAction" : {"action" : "switchover", "xyz" : "", "param1" : "TestWorld Down", "param2" : "10"}
}
        *
        *
        * */

        try {
            return new JsonParser().parse(input).getAsJsonObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void loadDriveScript(JsonObject driveScript) {

    }


    public void init() {
        //Initialize everything.
        driveScriptJSON = new JsonArray();
        statusXML = new XmlBuilder();

        //Hardcoded for world test A
        /*driveScript.add(new Action("speedLimit", null, "40", ""));*/
        driveScript.add(new Action("stationStop", xyz(119, 64, 85), "Station 1", "20"));
        /*driveScript.add(new Action("trackSwitch", xyz(119, 64, 90), "false", ""));
        driveScript.add(new Action("trackSwitch", xyz(119, 64, 130), "false", ""));*/
       /* driveScript.add(new Action("speedLimit", xyz(120, 64, 146), "60", ""));
        driveScript.add(new Action("trackSwitch", xyz(29, 64, 216), "false", ""));
        driveScript.add(new Action("trackSwitch", xyz(24, 64, 216), "false", ""));*/
        driveScript.add(new Action("stationStop", xyz(-10, 64, 259), "Station 2", "20"));
        /*driveScript.add(new Action("speedLimit", xyz(-10, 64, 263), "100", ""));
        driveScript.add(new Action("speedLimit", xyz(-10, 64, 711), "40", ""));
        driveScript.add(new Action("trackSwitch", xyz(33, 64, 740), "true", ""));*/
        driveScript.add(new Action("stationStop", xyz(67, 64, 735), "Station 3", "20"));
        /*for (Action action : driveScript) {
            if (action.action.equals("speedLimit")) {
                speedChanges.add(action);
            }
            driveScriptJSON.add(action.toJSON());
        }*/

        ttId = 0;
    }

    static public Vec3 xyz(int x, int y, int z) {
        return Vec3.createVectorHelper(x, y, z);
    }

    public boolean isThere(double x, double y, double z, Action action) {
        return (int) x == action.position.xCoord && (int) y == action.position.yCoord && (int) z == action.position.zCoord;
    }

    public void start(Locomotive locomotive) {

        if (ttId != -1) {
            //Oh. First, connect to the TrainTalk channel.
            locomotive.attemptConnection(ttId);

        }

        locomotive.mtcStatus = 1;
        locomotive.mtcType = 3;
        locomotive.atoStatus = 1;
        Traincraft.mtcChannel.sendToAllAround(new PacketMTCStatus(locomotive.getEntityId(), 1, 3),
                new NetworkRegistry.TargetPoint(locomotive.worldObj.provider.dimensionId,
                        locomotive.posX, locomotive.posY, locomotive.posZ, 150.0D));
        Traincraft.mtcChannel.sendToAllAround(new PacketATO(locomotive.getEntityId(), 1), new NetworkRegistry.TargetPoint(
                locomotive.worldObj.provider.dimensionId, locomotive.posX, locomotive.posY, locomotive.posZ, 150.0D));

        /*if (locomotive.riddenByEntity != null)
            ((EntityPlayer) locomotive.riddenByEntity).addChatMessage(new ChatComponentText("MTC is now being controlled by AutoTrain-2. To disable, deactivate MTC"));*/
        active = true;

        lastMillsRTD = System.currentTimeMillis();
        lastMills = System.currentTimeMillis();
        status = "drive";
        syncDatawatcher();
    }

    public void drive() {
        statusXML.putString("status", status);
        statusXML.putString("progress", String.valueOf(position));

        if (driveScript.get(position).getPosition() == null || isThere(locomotive.posX, locomotive.posY, locomotive.posZ, driveScript.get(position))) {
            Action action = driveScript.get(position);

            /*switch (action.action) {

                case "speedLimit": {

                    if (!pdmMode) break;

                    System.out.println("speed!?");
                    int nextSpeed = 0;
                    double speedX = 0, speedY = 0, speedZ = 0;

                    speedPosition++;
                    boolean inBounds = (speedPosition >= 0) && (speedPosition < speedChanges.size());

                    if (inBounds) {
                        Action speedAction = speedChanges.get(speedPosition);
                        nextSpeed = Integer.parseInt(speedAction.param1);
                        speedX = speedAction.position.xCoord;
                        speedY = speedAction.position.yCoord;
                        speedZ = speedAction.position.zCoord;
                    }

                    locomotive.speedLimit = Integer.parseInt(action.param1);
                    locomotive.nextSpeedLimit = nextSpeed;
                    locomotive.speedChange3 = xyz((int) speedX, (int) speedY, (int) speedZ);
                    Traincraft.mtcChannel.sendToAllAround(new PacketSpeedLimit(locomotive.getEntityId(), Integer.parseInt(action.param1), nextSpeed, speedX, speedY, speedZ),
                            new NetworkRegistry.TargetPoint(locomotive.worldObj.provider.dimensionId, locomotive.posX, locomotive.posY, locomotive.posZ, 150.0D));
                    break;
                }
            }*/
            //Do the thing. next position pls.
            if (position + 1 < driveScript.size()) {
                //Prepare the next one.
                Action nextAction = driveScript.get(position + 1);
                switch (nextAction.action) {

                    case "stationStop": {
                        locomotive.stationStop3 = nextAction.position;
                        Traincraft.mtcChannel.sendToAllAround(new PacketStopPoint(locomotive.getEntityId(), nextAction.position.xCoord, nextAction.position.yCoord, nextAction.position.zCoord, 1),
                                new NetworkRegistry.TargetPoint(locomotive.worldObj.provider.dimensionId, locomotive.posX, locomotive.posY, locomotive.posZ, 150.0D));
                        break;
                    }

                    case "trackSwitch": {

                        if (!pdmMode) break;

                        //Find the track switch and talk to it.
                        TileEntity tileSwitch = locomotive.worldObj.getTileEntity((int) nextAction.position.xCoord, (int) nextAction.position.yCoord, (int) nextAction.position.zCoord);
                        TileTCRail trackSwitch = null;

                        if (tileSwitch instanceof TileTCRailGag) {
                            TileTCRailGag gag = (TileTCRailGag) tileSwitch;

                            trackSwitch = (TileTCRail) locomotive.worldObj.getTileEntity(gag.originX, gag.originY, gag.originZ);
                            if (locomotive.riddenByEntity != null)
                                ((EntityPlayer) locomotive.riddenByEntity).addChatMessage(new ChatComponentText("The switch on this action is not at the correct position. The switch will still be activated, but this is still considered to a be a configuration error."));

                        } else if (tileSwitch instanceof TileTCRail) {
                            trackSwitch = (TileTCRail) tileSwitch;
                        }

                        if (trackSwitch != null) {
                            trackSwitch.setSwitchState(Boolean.parseBoolean(action.param1), true);
                            System.out.println("Switched");
                        }
                    }
                }
            }


            position++;
            System.out.println("New current action is: " + driveScript.get(position));

            syncDatawatcher();
            return;
        }

        if (driveScript.get(position) != null && driveScript.get(position).action.equals("stationStop") && (status.equals("stationStop") || status.equals("readyToDepart"))) {
            int timeUntilDeparture = Integer.parseInt(driveScript.get(position).param2) * 1000;
            int timeUntilRTD = (Integer.parseInt(driveScript.get(position).param2) - 10) * 1000;

            if (System.currentTimeMillis() > lastMillsRTD + timeUntilRTD && !status.equals("readyToDepart")) {
                lastMillsRTD = 0L;
                status = "readyToDepart";
                System.out.println("Ready to depart");
                syncDatawatcher();
            }

            if (System.currentTimeMillis() > lastMills + timeUntilDeparture) {

                locomotive.parkingBrake = false;
                locomotive.atoStatus = 1;
                locomotive.stationStop = false;
                Traincraft.mtcChannel.sendToAllAround(new PacketATO(locomotive.getEntityId(), 1), new NetworkRegistry.TargetPoint(
                        locomotive.worldObj.provider.dimensionId, locomotive.posX, locomotive.posY, locomotive.posZ, 150.0D));
                Traincraft.brakeChannel.sendToAllAround(new PacketParkingBrake(false, locomotive.getEntityId()),
                        new NetworkRegistry.TargetPoint(locomotive.worldObj.provider.dimensionId, locomotive.posX, locomotive.posY, locomotive.posZ, 150.0D));

                // position++;
                lastMills = 0L;
                lastMillsRTD = 0L;
                status = "drive";

                if (position + 1 == driveScript.size()) {
                    System.out.println("We're finished!");
                    status = "done";
                    locomotive.atoStatus = 0;
                    active = false;

                    if (doneAction != null) {
                        if (doneAction.action.equals("switchover")) {

                        }
                    }

                    syncDatawatcher();
                } else {
                    position++;
                    System.out.println("Leaving!");
                    locomotive.renderRefs.addProperty("doors", true);
                    syncDatawatcher();
                }

            }
        } else {
            lastMillsRTD = System.currentTimeMillis();
            lastMills = System.currentTimeMillis();
        }

        //Look for ones ahead.


    }

    public Locomotive findOtherSide() {


            if ((locomotive.cartLinked1).train != null && (locomotive.cartLinked1).train.getTrains().size() != 0 && (locomotive.cartLinked1).train.getTrains().size() > 1) {

                for (int i = 0; i < (locomotive.cartLinked1).train.getTrains().size(); i++) {
                    EntityRollingStock stock = (locomotive.cartLinked1).train.getTrains().get(i);
                    if (stock != locomotive && stock instanceof Locomotive) {
                        return (Locomotive) stock;
                    }
                    //distances.put((int) getDistance(stock.posX, stock.posY, stock.posZ), xyz((int) stock.posX, (int) stock.posY, (int) stock.posZ));
                }
            }


return null;
    }


    public void syncDatawatcher() {
        statusXML.putString("status", status);
        statusXML.putString("progress", String.valueOf(position));

        locomotive.getDataWatcher().updateObject(29, statusXML.toXMLString());
        locomotive.getDataWatcher().updateObject(30, driveScriptJSON.toString());
    }


    public void stationStop() {
        status = "stationStop";
        locomotive.renderRefs.addProperty("doors", false);
        syncDatawatcher();
    }

}


