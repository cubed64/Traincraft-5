package train.common.mtc.vbc;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.network.NetworkRegistry;
import dan200.computercraft.api.lua.ILuaContext;
import dan200.computercraft.api.lua.LuaException;
import dan200.computercraft.api.peripheral.IComputerAccess;
import dan200.computercraft.api.peripheral.IPeripheral;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.mtc.PDMMessage;
import train.common.mtc.packets.PacketATOSetStopPoint;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class TileVBCController extends TileEntity {

   public ArrayList<SignalSection> signalSections = new ArrayList<SignalSection>();
   public String uniqueID = "";
    public TileVBCController() {
        initSections();
        if (uniqueID.equals("")) {
            uniqueID = UUID.randomUUID().toString();
        }
    }
   public void initSections() {
       signalSections.add(new SignalSection(
               Vec3.createVectorHelper(108, 5, 522),
               Vec3.createVectorHelper(125, 5, 522),
               20, "TEST-1"));
       signalSections.add(new SignalSection(
               Vec3.createVectorHelper(126, 5, 522),
               Vec3.createVectorHelper(142, 5, 522),
               20, "TEST-2"));
       signalSections.add(new SignalSection(
               Vec3.createVectorHelper(143, 5, 522),
               Vec3.createVectorHelper(158, 5, 522),
               10, "TEST-3"));
       signalSections.add(new SignalSection(
               Vec3.createVectorHelper(159, 5, 522),
               Vec3.createVectorHelper(175, 5, 522),
               10, "TEST-4"));

   }
   public void updateEntity() {

      if(worldObj != null) {
          if (worldObj.isRemote) {return;}

            /*List<Object> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(null, this.getRenderBoundingBox());

            for (Object obj : list) {
               if (obj instanceof Locomotive) {
                  Locomotive daTrain = (Locomotive) obj;
                  if (daTrain.mtcOverridePressed) {
                     return;
                  }
                  if (daTrain.mtcStatus == 1 | daTrain.mtcStatus == 2) {
                     if (this.stopX == 0) {
                        return;
                     }

                     daTrain.xFromStopPoint = this.stopX;
                     daTrain.yFromStopPoint = this.stopY;
                     daTrain.zFromStopPoint = this.stopZ;
                     Traincraft.atoSetStopPoint.sendToAllAround(new PacketATOSetStopPoint(daTrain.getEntityId(), Double.valueOf(this.stopX), Double.valueOf(this.stopY), Double.valueOf(this.stopZ), daTrain.xStationStop, daTrain.yStationStop, daTrain.zStationStop), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, daTrain.posX, daTrain.posY, daTrain.posZ, 150.0D));
                  }
               }
            }*/


      }
   }




  @Override
   public void readFromNBT(NBTTagCompound nbttagcompound) {
      super.readFromNBT(nbttagcompound);

      this.uniqueID = nbttagcompound.getString("uniqueID");

   }

   @Override
   public void writeToNBT(NBTTagCompound nbttagcompound) {
      super.writeToNBT(nbttagcompound);
       nbttagcompound.setString("uniqueID", uniqueID);
   }

    public void receiveMessage(PDMMessage message) {
        System.out.println(message.message);
        JsonObject jMessage = new JsonParser().parse(message.message.toString()).getAsJsonObject();
        if (jMessage.get("funct").getAsString().equals("attemptconnection")) {
            //Attempting connection. Okay, accept it.
            //Give it an inital speed limit, as we do not know the position of the train yet.
            JsonObject sendingObj = new JsonObject();
            sendingObj.addProperty("funct", "startlevel2");
            sendingObj.addProperty("mtcStatus", "1");
            sendingObj.addProperty("speedLimit", "10");
            sendingObj.addProperty("nextSpeedLimit", "0");
            sendMessage(new PDMMessage(this.uniqueID, message.UUIDFrom, sendingObj.toString(), jMessage.get("entityID").getAsInt()));
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
                    section.occupiedBy = jMessage.get("entityID").getAsInt();
                    System.out.println(section.identifier + " occupied");
                    sendingObj.addProperty("speedLimit", section.speedLimit);
                }
            }

            sendingObj.addProperty("funct", "startlevel2");
            sendingObj.addProperty("mtcStatus", "1");

            sendingObj.addProperty("nextSpeedLimit", "0");
            sendMessage(new PDMMessage(this.uniqueID, message.UUIDFrom, sendingObj.toString(), jMessage.get("entityID").getAsInt()));
        }


       /* if(x>=box.boundingBox.minX && x<=box.boundingBox.maxX &&
                y>=box.boundingBox.minY && y<=box.boundingBox.maxY &&
                z>=box.boundingBox.minZ && z<=box.boundingBox.maxZ){
            return true;
        }
*/
    }

    public void sendMessage(PDMMessage message) {
        if (message.system != 0) {
            if (worldObj.getEntityByID(message.system) instanceof Locomotive) {
                Locomotive loco = (Locomotive) worldObj.getEntityByID(message.system);
                loco.receiveMessage(message);
            }
        }
    }
}
