package train.common.core.network.AdminBook;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChatComponentText;
import train.common.api.Locomotive;

public class PacketAdminBookToggleChunkLoading implements IMessage
{
    boolean loadChunks;

    public  PacketAdminBookToggleChunkLoading()
    {

    }

    public PacketAdminBookToggleChunkLoading(boolean loadChunks)
    {
        this.loadChunks = loadChunks;
    }

    /**
     * Convert from the supplied buffer into your specific message type
     *
     * @param buf
     */
    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.loadChunks = buf.readBoolean();
    }

    /**
     * Deconstruct your message into the supplied byte buffer
     *
     * @param buf
     */
    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeBoolean(this.loadChunks);
    }

    public static class Handler implements IMessageHandler<PacketAdminBookToggleChunkLoading, IMessage>
    {

        @Override
        public IMessage onMessage(PacketAdminBookToggleChunkLoading message, MessageContext context)
        {
            for (Object entity : context.getServerHandler().playerEntity.getEntityWorld().loadedEntityList)
            {
                if (entity instanceof Locomotive && ((Locomotive) entity).IsChunkLoading())
                {
                    ((Locomotive) entity).setPacketChunkLoading(message.loadChunks);
                    context.getServerHandler().playerEntity.addChatMessage(new ChatComponentText("Stop loading chunks for: " + ((Locomotive) entity).getTrainName()));
                }
            }

            return null;
        }
    }
}
