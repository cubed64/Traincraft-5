package train.common.mtc.network;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import train.client.MovingTrainSound;
import train.common.api.Locomotive;

public class PacketSpeedLimit implements IMessage {
    private int entityId;
    private int speedLimit, nextSpeedLimit;
    private double xNextSpeedLimit, yNextSpeedLimit, zNextSpeedLimit;

    public PacketSpeedLimit() {}

    public PacketSpeedLimit(int entityId, int speedLimit, int nextSpeedLimit) {
        this.entityId = entityId;
        this.speedLimit = speedLimit;
        this.nextSpeedLimit = nextSpeedLimit;
    }

    public PacketSpeedLimit(int entityId, int speedLimit, int nextSpeedLimit, double xNextSpeedLimit, double yNextSpeedLimit, double zNextSpeedLimit) {
        this.entityId = entityId;
        this.speedLimit = speedLimit;
        this.nextSpeedLimit = nextSpeedLimit;
        this.xNextSpeedLimit = xNextSpeedLimit;
        this.yNextSpeedLimit = yNextSpeedLimit;
        this.zNextSpeedLimit = zNextSpeedLimit;
    }
    @Override
    public void fromBytes(ByteBuf bbuf) {

        entityId = bbuf.readInt();
        speedLimit = bbuf.readInt();
        nextSpeedLimit = bbuf.readInt();
        xNextSpeedLimit = bbuf.readDouble();
        yNextSpeedLimit = bbuf.readDouble();
        zNextSpeedLimit = bbuf.readDouble();

        if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
            Entity entity = Minecraft.getMinecraft().theWorld.getEntityByID(entityId);
            if (entity instanceof Locomotive) {
                Locomotive locomotive = (Locomotive)entity;
                if (locomotive.riddenByEntity != null && (locomotive.speedLimit != speedLimit || locomotive.nextSpeedLimit != nextSpeedLimit)) {
                    Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord
                            .func_147673_a(new ResourceLocation("tc:mtc_speedchange")));
                }

                locomotive.speedLimit = speedLimit;
                locomotive.nextSpeedLimit = nextSpeedLimit;
                if (xNextSpeedLimit != 0) {
                    locomotive.speedChange3 = Vec3.createVectorHelper(xNextSpeedLimit, yNextSpeedLimit, zNextSpeedLimit);

                }
            }
        }
    }

    @Override
    public void toBytes(ByteBuf bbuf) {

        bbuf.writeInt(entityId);
        bbuf.writeInt(speedLimit);
        bbuf.writeInt(nextSpeedLimit);
        bbuf.writeDouble(xNextSpeedLimit);
        bbuf.writeDouble(yNextSpeedLimit);
        bbuf.writeDouble(zNextSpeedLimit);

    }
}