package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import train.common.api.EntityRollingStock;

public class PacketPaintbrushColor implements IMessage {

    int paintbrushColor;
    int	entityID;
    public PacketPaintbrushColor() {}
    public PacketPaintbrushColor(int paintbrushColor, int trainEntity) {
        this.paintbrushColor = paintbrushColor;
        this.entityID = trainEntity;
    }
    @Override
    public void fromBytes(ByteBuf bbuf) {
        this.paintbrushColor = bbuf.readInt();
        this.entityID = bbuf.readInt();
    }
    @Override
    public void toBytes(ByteBuf bbuf) {
        bbuf.writeInt(this.paintbrushColor);
        bbuf.writeInt(this.entityID);
    }
    public static class Handler implements IMessageHandler<PacketPaintbrushColor, IMessage> {
        @Override
        public IMessage onMessage(PacketPaintbrushColor message, MessageContext context) {
            Entity rollingStockEntity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.entityID);
            if (rollingStockEntity instanceof EntityRollingStock) {
                ((EntityRollingStock) rollingStockEntity).setColor(message.paintbrushColor);
            }
            return null;
        }
    }
}