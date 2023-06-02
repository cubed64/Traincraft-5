package com.jcirmodelsquad.tcjcir.features.signal.vbc;


import mods.railcraft.api.signals.IControllerTile;
import mods.railcraft.api.signals.SignalAspect;
import mods.railcraft.api.signals.SignalController;
import mods.railcraft.api.signals.SimpleSignalController;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.Vec3;


public class TileVBCController extends TileEntity implements IControllerTile {

    public SimpleSignalController signalController = new SimpleSignalController("Virtual Block Control Receiver", this);
    public SignalAspect currentAspect;

    int systemId = 0;
    boolean trackSideA = true;
    String sectionId = "TST-1";
    Vec3 pos;


    public TileVBCController() {

    }



   public void updateEntity() {

       if (worldObj.getTileEntity(xCoord, yCoord, zCoord + 1) instanceof TileEntitySign) {
           TileEntitySign sign = (TileEntitySign) worldObj.getTileEntity(xCoord, yCoord, zCoord + 1);
           this.sectionId = sign.signText[0];
           VBCTracking.getInstance().registeredReceivers.put(sectionId, Vec3.createVectorHelper(xCoord, yCoord, zCoord));
           signalController.setName(sectionId);
       }
      if(worldObj != null) {
          if (worldObj.isRemote) {return;}

      }
   }

  @Override
   public void readFromNBT(NBTTagCompound nbttagcompound) {
      super.readFromNBT(nbttagcompound);
      signalController.readFromNBT(nbttagcompound);
      //this.uniqueID = nbttagcompound.getString("uniqueID");

   }

   @Override
   public void writeToNBT(NBTTagCompound nbttagcompound) {
      super.writeToNBT(nbttagcompound);
       signalController.writeToNBT(nbttagcompound);

       // nbttagcompound.setString("uniqueID", uniqueID);
   }


   public void updateAspect(SignalAspect aspect) {
        signalController.setAspect(aspect);
   }
    @Override
    public SignalController getController() {
        return signalController;
    }

    /*public void receiveMessage(MTCMessage message) {
        //System.out.println(message.message);
        JsonObject jMessage = new JsonParser().parse(message.message.toString()).getAsJsonObject();
        if (jMessage.get("funct").getAsString().equals("attemptconnection")) {
            //Attempting connection. Okay, accept it.
            //Give it an inital speed limit, as we do not know the position of the train yet.
            JsonObject sendingObj = new JsonObject();
            sendingObj.addProperty("funct", "startlevel2");
            sendingObj.addProperty("mtcStatus", "1");
            sendingObj.addProperty("speedLimit", "10");
            sendingObj.addProperty("nextSpeedLimit", "0");
            sendMessage(new MTCMessage(this.uniqueID, message.UUIDFrom, sendingObj.toString(), jMessage.get("entityID").getAsInt()));
        }
        if (jMessage.get("funct").getAsString().equals("update")) {
            //Attempting connection. Okay, accept it.
            //Give it an inital speed limit, as we do not know the position of the train yet.
            int x = jMessage.get("posX").getAsInt();
            int y = jMessage.get("posY").getAsInt();
            int z = jMessage.get("posZ").getAsInt();
            JsonObject sendingObj = new JsonObject();
            for (SignalSection section : signalSections) {

                if(x>=section.startPos.xCoord && x<= section.endPos.xCoord &&
                        y>=section.startPos.yCoord  && y<=section.endPos.yCoord  &&
                        z>=section.startPos.zCoord && z<=section.endPos.zCoord){
                    //section.occupiedBy = jMessage.get("entityID").getAsInt();
                    //System.out.println(section.identifier + " occupied");
                    sendingObj.addProperty("speedLimit", section.speedLimit);
                }
            }

            sendingObj.addProperty("funct", "startlevel2");
            sendingObj.addProperty("mtcStatus", "1");

            sendingObj.addProperty("nextSpeedLimit", "0");
            sendMessage(new MTCMessage(this.uniqueID, message.UUIDFrom, sendingObj.toString(), jMessage.get("entityID").getAsInt()));
        }


       *//* if(x>=box.boundingBox.minX && x<=box.boundingBox.maxX &&
                y>=box.boundingBox.minY && y<=box.boundingBox.maxY &&
                z>=box.boundingBox.minZ && z<=box.boundingBox.maxZ){
            return true;
        }
*//*
    }

    public void sendMessage(MTCMessage message) {
        if (message.system != 0) {
            if (worldObj.getEntityByID(message.system) instanceof Locomotive) {
                Locomotive loco = (Locomotive) worldObj.getEntityByID(message.system);
                loco.receiveMessage(message);
            }
        }
    }*/
}
