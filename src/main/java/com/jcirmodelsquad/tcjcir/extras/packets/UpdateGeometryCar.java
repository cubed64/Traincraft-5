package com.jcirmodelsquad.tcjcir.extras.packets;

import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.DimensionManager;
import scala.collection.parallel.ParIterableLike;

public class UpdateGeometryCar implements IMessage {

    public int dimensionId, entity;
    public String railroadName, lineType, operatingCrew;

    public UpdateGeometryCar() {}

    public UpdateGeometryCar(int dimensionId, int entity, String railroadName, String lineType, String operatingCrew) {
        this.dimensionId = dimensionId;
        this.entity = entity;
        this.railroadName = railroadName;
        this.lineType = lineType;
        this.operatingCrew = operatingCrew;
    }


    @Override
    public void fromBytes(ByteBuf buf) {
        this.entity = buf.readInt();
        this.dimensionId = buf.readInt();

        railroadName = ByteBufUtils.readUTF8String(buf);
        lineType = ByteBufUtils.readUTF8String(buf);
        operatingCrew = ByteBufUtils.readUTF8String(buf);

        Entity geometryCar = Minecraft.getMinecraft().theWorld.getEntityByID(entity);

        if (geometryCar instanceof ExperimentalGeometryCar) {
            ((ExperimentalGeometryCar) geometryCar).railroadLine = railroadName;
            ((ExperimentalGeometryCar) geometryCar).lineType = lineType;
            ((ExperimentalGeometryCar) geometryCar).operatingCrew = operatingCrew;
        }
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entity);
        buf.writeInt(dimensionId);
        ByteBufUtils.writeUTF8String(buf, railroadName);
        ByteBufUtils.writeUTF8String(buf, lineType);
        ByteBufUtils.writeUTF8String(buf, operatingCrew);

        Entity geometryCar = Minecraft.getMinecraft().theWorld.getEntityByID(entity);

        if (geometryCar instanceof ExperimentalGeometryCar) {
            ((ExperimentalGeometryCar) geometryCar).railroadLine = railroadName;
            ((ExperimentalGeometryCar) geometryCar).lineType = lineType;
            ((ExperimentalGeometryCar) geometryCar).operatingCrew = operatingCrew;
        }


    }

}
