package train.common.mtc.tile;

import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.network.NetworkRegistry;
import li.cil.oc.api.Network;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.*;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.mtc.network.PacketMTC;
import train.common.mtc.network.PacketSpeedLimit;
import train.common.mtc.network.PacketStopPoint;
import train.common.mtc.packets.*;

import java.util.List;


    public class TileMTCMultiTransmitter extends TileEntity implements SimpleComponent {
        public boolean isActivated;
        public int speedLimit;
        public int nextSpeedLimit;
        public boolean hadSentPacket = false;
        public boolean hadSentMTCPacket = false;
        public boolean enforceSpeedLimits;
        public Vec3 speedChangeCoords = Vec3.createVectorHelper(0,0,0);
        public Vec3 stopCoords = Vec3.createVectorHelper(0,0,0);
        public String serverUUID = "";
        public String signalBlock = "";
        public int mtcType;
        public int mtcStatus;
        public boolean doTransmitSpeedLimits = false;
        public boolean doTransmitMTCData = false;
        public boolean doTransmitStopPoint = false;

        public AxisAlignedBB boundingBox = null;



        @Override
        public String getComponentName() {
            return "mtc_multi_transmitter";
        }

        @Override
        public AxisAlignedBB getRenderBoundingBox() {
            if (boundingBox == null) {
                boundingBox = AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord + 2, yCoord + 2, zCoord + 2);
            }
            return boundingBox;
        }

        @Override
        public void updateEntity() {
            if (worldObj == null) {
                return;
            }
            if (worldObj.isRemote) {
                return;
            }
            if (isActivated) {
                List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(null, this.getRenderBoundingBox());
                if (list.size() == 0) {
                    hadSentPacket = false;
                    hadSentMTCPacket = false;
                    //Reset everything.
                }

                if (list.size() > 0) {
                    for (Object obj : list) {
                        if (obj instanceof Locomotive) {
                            Locomotive daTrain = (Locomotive) obj;
                            daTrain.enforceSpeedLimits = enforceSpeedLimits;

                            if (doTransmitSpeedLimits && !daTrain.mtcOverridePressed) {

                                if (daTrain.mtcStatus == 0 && !hadSentMTCPacket) {
                                    daTrain.mtcStatus = 1;
                                    Traincraft.mtcChannel.sendToAllAround(new PacketMTC(daTrain.getEntityId(), 1, 1), new NetworkRegistry.TargetPoint(worldObj.provider.dimensionId, daTrain.posX, daTrain.posY, daTrain.posZ, 150.0D));
                                    hadSentMTCPacket = true;
                                }

                                if (daTrain.speedLimit != speedLimit && daTrain.riddenByEntity != null) {
                                    // worldObj.playSoundAtEntity(daTrain.ridingEntity, Info.resourceLocation + ":" + "mtc_speedchange", 1.0F, 1.0F);
                                    // worldObj.playSoundAtEntity(this, Info.resourceLocation + ":" + sounds.getHornString(), sounds.getHornVolume(), 1.0F);
                                    //Traincraft.playSoundOnClientChannel.sendTo(new PacketPlaySoundOnClient(7, "tc:mtc_speedchange"), (EntityPlayerMP) daTrain.riddenByEntity);
                                }
                                daTrain.speedLimit = speedLimit;
                                if (!hadSentPacket) {
                                    hadSentPacket = true;
                                    Traincraft.mtcChannel.sendToAllAround(new PacketSpeedLimit(
                                            daTrain.getEntityId(), speedLimit, nextSpeedLimit, speedChangeCoords.xCoord, speedChangeCoords.yCoord,  speedChangeCoords.zCoord
                                    ), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, daTrain.posX, daTrain.posY, daTrain.posZ, 150.0D));

                                    daTrain.nextSpeedLimit = nextSpeedLimit;
                                    daTrain.speedChange3 = speedChangeCoords;


                                }
                            }

                            if (doTransmitStopPoint && daTrain.mtcStatus == 1 || daTrain.mtcStatus == 2) {
                                if (stopCoords.xCoord == 0) {
                                    daTrain.stopPoint3 = stopCoords;
                                    Traincraft.mtcChannel.sendToAllAround(
                                            new PacketStopPoint(
                                                    daTrain.getEntityId(),
                                                    stopCoords.xCoord,
                                                    stopCoords.yCoord,
                                                    stopCoords.zCoord, 0
                                            ), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, daTrain.posX, daTrain.posY, daTrain.posZ, 150.0D)
                                    );

                                }
                            }

                            if (doTransmitMTCData) {
                                daTrain.mtcStatus = mtcStatus;
                                Traincraft.mtcChannel.sendToAllAround(new PacketMTC(daTrain.getEntityId(), mtcStatus, 0) , new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, daTrain.posX, daTrain.posY, daTrain.posZ, 150.0D));
                                daTrain.currentSignalBlock = this.signalBlock;
                                daTrain.mtcType = mtcType;
                                if (mtcType == 2 && !daTrain.isConnecting) {
                                    daTrain.stationStop = false;
                                    daTrain.speedGoingDown = false;
                                   // if (!serverUUID.equals("") &&  !(daTrain.serverUUID.equals(serverUUID))) {
                                        daTrain.isConnecting = true;
                                        //daTrain.connectingUUID = this.serverUUID;
                                   //     daTrain.attemptConnection(serverUUID);
                               //     }
                                } else if (serverUUID.equals("end")) {
                                    //End communications with the server
                                    daTrain.disconnectFromServer();
                                    //daTrain.serverUUID = "";
                                }
                            }

                        }


                    }
                }
            }
        }

        @Callback
        public Object[] activate(Context context, Arguments args) {
            this.isActivated = true;
            return new Object[]{true};
        }

        @Callback
        public Object[] deactivate(Context context, Arguments args) {
            this.isActivated = false;
            return new Object[]{true};
        }

        @Callback
        public Object[] doSpeedLimits(Context context, Arguments args) {
            if (args.isBoolean(0)) {
                doTransmitSpeedLimits = args.checkBoolean(0);
            }
            return new Object[]{true};
        }

        @Callback
        public Object[] doMTCData(Context context, Arguments args) {
            if (args.isBoolean(0)) {
                doTransmitMTCData = args.checkBoolean(0);
            }
            return new Object[]{true};
        }

        @Callback
        public Object[] doStopPoints(Context context, Arguments args) {
            if (args.isBoolean(0)) {
                doTransmitStopPoint = args.checkBoolean(0);
            }
            return new Object[]{true};
        }

        //Info Transmitter
        @Callback
        @Optional.Method(modid = "OpenComputers")
        public Object[] setSpeedLimit(Context context, Arguments args) {
            if (args.isInteger(0)) {
                this.speedLimit = args.checkInteger(0);
            }
            System.out.println(args.isInteger(0));

            return new Object[]{true};
        }

        @Callback
        @Optional.Method(modid = "OpenComputers")
        public Object[] setNextSpeedLimit(Context context, Arguments args) {
            if (args.isInteger(0)) {
                this.nextSpeedLimit = args.checkInteger(0);
            }
            return new Object[]{true};
        }

        @Callback
        public Object[] setNextCoordinates(Context context, Arguments args) {
            if (args.isInteger(0) && args.isInteger(1) && args.isInteger(2)) {
                speedChangeCoords = Vec3.createVectorHelper(args.checkInteger(0), args.checkInteger(1), args.checkInteger(2));
            }
            return new Object[]{true};
        }

        //MTC Transmitter
        @Callback
        public Object[] setMTCStatus(Context context, Arguments args) {
            if (args.isInteger(0)) {
                this.mtcStatus = args.checkInteger(0);
            }
            return new Object[]{true};
        }

        @Callback
        @Optional.Method(modid = "OpenComputers")
        public Object[] setServerUUID(Context context, Arguments args) {
            if (args.isString(0)) {
                this.serverUUID = args.checkString(0);
            }
            return new Object[]{true};
        }

        @Callback
        public Object[] setMTCType(Context context, Arguments args) {
            if (args.isInteger(0)) {
                this.mtcType = args.checkInteger(0);
            }
            return new Object[]{true};
        }

        @Callback
        public Object[] setSignalBlock(Context context, Arguments args) {
            if (args.isString(0)) {
                this.signalBlock = args.checkString(0);
            }
            return new Object[]{true};
        }

        //Stop Point Transmitter
        @Callback
        public Object[] setStopCoordinates(Context context, Arguments args) {
            if (args.isInteger(0) && args.isInteger(1) && args.isInteger(2)) {
                stopCoords = Vec3.createVectorHelper(args.checkInteger(0), args.checkInteger(1), args.checkInteger(2));
            }
            return new Object[]{true};
        }
        @Override
        public void readFromNBT(NBTTagCompound nbt) {
            super.readFromNBT(nbt);
            isActivated = nbt.getBoolean("isActivated");
            speedLimit = nbt.getInteger("speedLimit");
            enforceSpeedLimits = nbt.getBoolean("enforceSpeedLimits");
            speedChangeCoords = Vec3.createVectorHelper(nbt.getInteger("speedChangeX"), nbt.getInteger("speedChangeY"), nbt.getInteger("speedChangeZ"));

            stopCoords = Vec3.createVectorHelper(nbt.getInteger("speedChangeX"), nbt.getInteger("speedChangeY"), nbt.getInteger("speedChangeZ"));


            serverUUID = nbt.getString("serverUUID");
            signalBlock = nbt.getString("signalBlock");
            mtcType = nbt.getInteger("mtcType");
            mtcStatus = nbt.getInteger("mtcStatus");

            doTransmitSpeedLimits = nbt.getBoolean("doTransmitSpeedLimits");
            doTransmitMTCData = nbt.getBoolean("doTransmitMTCData");
            doTransmitStopPoint = nbt.getBoolean("doTransmitStopPoint");

        }

        @Override
        public void writeToNBT(NBTTagCompound nbt) {
            super.writeToNBT(nbt);
            nbt.setBoolean("isActivated", isActivated);
            nbt.setInteger("speedLimit", speedLimit);
            nbt.setBoolean("enforceSpeedLimits", enforceSpeedLimits);

            nbt.setInteger("speedChangeX", (int) speedChangeCoords.xCoord);
            nbt.setInteger("speedChangeY", (int) speedChangeCoords.yCoord);
            nbt.setInteger("speedChangeZ", (int) speedChangeCoords.zCoord);

            nbt.setInteger("stopCoordsX", (int) stopCoords.xCoord);
            nbt.setInteger("stopCoordsY", (int) stopCoords.yCoord);
            nbt.setInteger("stopCoordsZ", (int) stopCoords.zCoord);

            nbt.setString("serverUUID", serverUUID);
            nbt.setString("signalBlock", signalBlock);
            nbt.setInteger("mtcType", mtcType);
            nbt.setInteger("mtcStatus", mtcStatus);

            nbt.setBoolean("doTransmitSpeedLimits", doTransmitSpeedLimits);
            nbt.setBoolean("doTransmitMTCData", doTransmitMTCData);
            nbt.setBoolean("doTransmitStopPoint", doTransmitStopPoint);

        }



    }

