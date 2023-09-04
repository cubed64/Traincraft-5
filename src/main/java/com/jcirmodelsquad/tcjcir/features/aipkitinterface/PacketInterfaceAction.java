package com.jcirmodelsquad.tcjcir.features.aipkitinterface;

import com.google.gson.JsonObject;
import com.jcirmodelsquad.tcjcir.features.autotrain.AutoTrain2;
import com.jcirmodelsquad.tcjcir.features.autotrain.IAT2Compatible;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.DimensionManager;
import train.common.api.Locomotive;

public class PacketInterfaceAction implements IMessage {
    private int dimensionId;
    private int entityId;

    private String action;

    public PacketInterfaceAction() {}

    public PacketInterfaceAction(int entityId, String action) {
        this.entityId = entityId;
        this.action = action;
        this.dimensionId = Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId;
    }


    @Override
    public void fromBytes(ByteBuf buf) {
        this.dimensionId = buf.readInt();
        this.entityId = buf.readInt();
        action = ByteBufUtils.readUTF8String(buf);
        Locomotive loco = (Locomotive) DimensionManager.getWorld(this.dimensionId).getEntityByID(entityId);
        if (loco instanceof IAT2Compatible) {
            AutoTrain2 autoTrain2 = ((IAT2Compatible) loco).getDriver();
            if (action.startsWith("setdrivescripta")) {
                JsonObject ds = autoTrain2.parseDriveScript(action.substring(15));
                autoTrain2.loadDriveScript(ds);
            } else if (action.startsWith("setdrivescriptb")) {
                JsonObject ds = autoTrain2.parseDriveScript(action.substring(15));
                autoTrain2.loadDriveScript(ds);
            } else if (action.equals("initautotrain")) {
                autoTrain2.init();
            }

        }

    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(dimensionId);
        buf.writeInt(entityId);
        ByteBufUtils.writeUTF8String(buf, action);
    }
}
