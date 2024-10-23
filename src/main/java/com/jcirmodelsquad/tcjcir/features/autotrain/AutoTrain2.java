package com.jcirmodelsquad.tcjcir.features.autotrain;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.util.Vec3;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;

import java.util.LinkedList;
import java.util.List;

import static com.jcirmodelsquad.tcjcir.extras.PeachyUtil.xyz;

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

    public List<Action> driveScriptA = new LinkedList<>();
    public String driveScriptName = "";
    public List<Action> driveScriptB = new LinkedList<>();
    public Action doneAction = null;

    public int position, speedPosition = 0;

    private long lastMills = 0L;
    private long lastMillsRTD = 0L;

    public String status = "";

    public JsonObject statusJSON;
    public JsonArray driveScriptJSON;

    public int ttId = -1;


    public AutoTrain2(Locomotive locomotive) {
        this.locomotive = locomotive;
        doneAction = new Action("switchover", null, "", "");
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
        driveScriptName = driveScript.get("name").getAsString();
        pdmMode = driveScript.get("pdmMode").getAsBoolean();
        ttId = driveScript.get("ttId").getAsInt();
        for (JsonElement act : driveScript.get("actions").getAsJsonArray()) {
            JsonObject jAct = act.getAsJsonObject();
            driveScriptA.add(new Action(jAct.get("action").getAsString(), xyz(jAct.get("x").getAsInt(), jAct.get("y").getAsInt(),
                    jAct.get("z").getAsInt()), jAct.get("param1").getAsString(), jAct.get("param2").getAsString()));

        }
    }


    public void init() {
        //Initialize everything.


        /*//Hardcoded for world test A
        if (!switchback) {
            driveScriptA.add(new Action("stationStop", xyz(119, 64, 85), "Station 1", "20"));
        *//*driveScript.add(new Action("trackSwitch", xyz(119, 64, 90), "false", ""));
        driveScript.add(new Action("trackSwitch", xyz(119, 64, 130), "false", ""));*//*
       *//* driveScript.add(new Action("speedLimit", xyz(120, 64, 146), "60", ""));
        driveScript.add(new Action("trackSwitch", xyz(29, 64, 216), "false", ""));
        driveScript.add(new Action("trackSwitch", xyz(24, 64, 216), "false", ""));*//*
            driveScriptA.add(new Action("stationStop", xyz(-4, 64, 255), "Station 2", "20"));
        *//*driveScript.add(new Action("speedLimit", xyz(-10, 64, 263), "100", ""));
        driveScript.add(new Action("speedLimit", xyz(-10, 64, 711), "40", ""));
        driveScript.add(new Action("trackSwitch", xyz(33, 64, 740), "true", ""));*//*
            //driveScriptA.add(new Action("stationStop", xyz(72, 64, 734), "Station 3", "20"));

            //driveScriptB.add(new Action("stationStop", xyz(-4, 64, 252), "Station 2", "20"));
            driveScriptB.add(new Action("stationStop", xyz(119, 64, 70), "Station 1", "20"));

            //Sync this drivescript with the other side.
            if (findOtherSide() != null) {
                AutoTrain2 driver = ((IAT2Compatible) findOtherSide()).getDriver();
                driver.driveScriptA = driveScriptB;
                driver.driveScriptB = driveScriptA;

            }
        }*/

        driveScriptJSON = new JsonArray();
        for (Action action : driveScriptA) {
            driveScriptJSON.add(action.toJSON());
        }

        statusJSON = new JsonObject();

        if (ttId != -1) {
            //Oh. First, connect to the TrainTalk channel.
            locomotive.attemptConnection(ttId);
            locomotive.setMTCStatus(1, 3, 0);
        }
        status = "ready";
        syncDatawatcher();
    }


    public boolean isThere(double x, double y, double z, Action action) {
        return (int) x == action.position.xCoord && (int) y == action.position.yCoord && (int) z == action.position.zCoord;
    }

    public void activate() {
    }
    public void start() {
        locomotive.setMTCStatus(1, 3, 1);

        /*if (locomotive.riddenByEntity != null)
            ((EntityPlayer) locomotive.riddenByEntity).addChatMessage(new ChatComponentText("MTC is now being controlled by AutoTrain-2. To disable, deactivate MTC"));*/
        active = true;

        lastMillsRTD = System.currentTimeMillis();
        lastMills = System.currentTimeMillis();
        status = "drive";
        syncDatawatcher();
    }

    public void drive() {

        statusJSON.addProperty("status", status);
        statusJSON.addProperty("progress", String.valueOf(position));

        if (driveScriptA.get(position).getPosition() != null) {
            Action action = driveScriptA.get(position);


            if (action.getAction().equals("stationStop")) {
                    locomotive.setStationStop(action.position);
             /*   position++;
                System.out.println("New current action is: " + driveScript.get(position));
                syncDatawatcher();
                return;*/

            }


            //Do the thing. next position pls.
           /* if (position + 1 < driveScript.size()) {
                //Prepare the next one.
                Action nextAction = driveScript.get(position + 1);
                switch (nextAction.action) {

                    case "stationStop": {
                        locomotive.stationStop3 = nextAction.position;
                        Traincraft.mtcChannel.sendToAllAround(new PacketStopPoint(locomotive.getEntityId(), nextAction.position.xCoord, nextAction.position.yCoord, nextAction.position.zCoord, 1),
                                new NetworkRegistry.TargetPoint(locomotive.worldObj.provider.dimensionId, locomotive.posX, locomotive.posY, locomotive.posZ, 150.0D));
                        break;
                    }

                    *//*case "trackSwitch": {

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
                    }*//*
                }
            }
*/

        }

        if (locomotive.stationStop && (status.equals("stationStop") || status.equals("readyToDepart"))) {
            int timeUntilDeparture = Integer.parseInt(driveScriptA.get(position).param2) * 1000;
            int timeUntilRTD = (Integer.parseInt(driveScriptA.get(position).param2) - 10) * 1000;


            if (System.currentTimeMillis() > lastMills + timeUntilDeparture) {

                locomotive.setParkingBrake(false);
                locomotive.setMTCStatus(1, 3, 1);
                locomotive.setStationStop(xyz(0,0,0));

                position++;
                lastMills = 0L;
                lastMillsRTD = 0L;
                status = "drive";

                locomotive.stationStop = false;
                if (position + 1 > driveScriptA.size()) {
                    System.out.println("We're finished!");
                    status = "done";
                    locomotive.atoStatus = 0;
                    active = false;


                    if (doneAction != null) {
                        if (doneAction.action.equals("switchover")) {
                            runSwitchover();
                        }
                    }

                    syncDatawatcher();
                } else {
                    System.out.println("Leaving!");
                    locomotive.renderRefs.addProperty("doors", true);
                    syncDatawatcher();
                }

            } else if (System.currentTimeMillis() > lastMillsRTD + timeUntilRTD && !status.equals("readyToDepart")) {
                lastMillsRTD = 0L;
                status = "readyToDepart";
                System.out.println("Ready to depart");
                syncDatawatcher();
            }
        } else {
            lastMillsRTD = System.currentTimeMillis();
            lastMills = System.currentTimeMillis();
        }

        //Look for ones ahead.


    }

    public Locomotive findOtherSide() {


        try {


            if ((locomotive.cartLinked1).trainHandler != null && (locomotive.cartLinked1).trainHandler.getTrains().size() != 0 && (locomotive.cartLinked1).trainHandler.getTrains().size() > 1) {

                for (int i = 0; i < (locomotive.cartLinked1).trainHandler.getTrains().size(); i++) {
                    EntityRollingStock stock = (locomotive.cartLinked1).trainHandler.getTrains().get(i);
                    if (stock != locomotive && stock instanceof Locomotive) {
                        return (Locomotive) stock;
                    }
                    //distances.put((int) getDistance(stock.posX, stock.posY, stock.posZ), xyz((int) stock.posX, (int) stock.posY, (int) stock.posZ));
                }
            }

        } catch (Exception ignored) {

        }
return null;
    }


    public void runSwitchover() {
        //Switch the drivescripts.
        Locomotive backLoco = findOtherSide();

        if (backLoco != null) {
            AutoTrain2 otherDriver = ((IAT2Compatible)backLoco).getDriver();

            //Shut down this side, and move to the other side.

            locomotive.setParkingBrake(false);
            locomotive.setMTCStatus(0,3,0);

            locomotive.canBePulled = true;
            locomotive.setCanBeAdjusted(true);
            locomotive.isLocoTurnedOn = false;
            position = 0;
            locomotive.disconnectFromServer();

            this.active = false;

            //Now start up the other side.
            backLoco.canBePulled = false;
            otherDriver.driveScriptA = driveScriptB;
            this.driveScriptA = otherDriver.driveScriptB;
            backLoco.setCanBeAdjusted(false);
            backLoco.isLocoTurnedOn = true;
            otherDriver.init();
            otherDriver.start();


        } else {
            System.out.println("Could not switchover, as there is not another locomotive. Derailed!?!??");
        }


    }

    public void syncDatawatcher() {
        statusJSON.addProperty("status", status);
        statusJSON.addProperty("progress", String.valueOf(position));
        statusJSON.add("driveScript", driveScriptJSON);

        locomotive.getDataWatcher().updateObject(29, statusJSON.toString());
    }


    public void stationStop() {
        status = "stationStop";
        locomotive.renderRefs.addProperty("doors", false);
        System.out.println("station stop!");
        syncDatawatcher();
    }

}


