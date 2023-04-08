package com.jcirmodelsquad.tcjcir.extras.packets;

import com.jcirmodelsquad.tcjcir.features.geometry.TrackPosition;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.DimensionManager;
import train.common.api.EntityRollingStock;

public class MissionStatusPacket implements IMessage {

    public int dimensionId, entity;
    public boolean status;

    public MissionStatusPacket() {}

    public MissionStatusPacket(int entity, boolean status) {
        this.dimensionId = Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId;
        this.entity = entity;
        this.status = status;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
        this.entity = buf.readInt();
        this.dimensionId = buf.readInt();
        this.status = buf.readBoolean();

        Entity geometryCar = DimensionManager.getWorld(dimensionId).getEntityByID(entity);

        if (geometryCar instanceof ExperimentalGeometryCar) {
            ((ExperimentalGeometryCar) geometryCar).missionStarted = status;
            if (!status) {
                ((ExperimentalGeometryCar) geometryCar).generateTrackReportAsFile();
            } else {
                ((ExperimentalGeometryCar) geometryCar).missionStartLocation =
                        new TrackPosition((int) geometryCar.posX, (int) geometryCar.posY, (int) geometryCar.posZ);
            }
        }
    }

    @Override
    public void toBytes(ByteBuf buf) {

        Entity geometryCar = Minecraft.getMinecraft().theWorld.getEntityByID(entity);

        if (geometryCar instanceof ExperimentalGeometryCar) {
            ((ExperimentalGeometryCar) geometryCar).missionStarted = status;
        }

        buf.writeInt(entity);
        buf.writeInt(dimensionId);
        buf.writeBoolean(status);
    }

}
