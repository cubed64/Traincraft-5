package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;

import java.nio.charset.StandardCharsets;

public class PacketAddNote implements IMessage {
    private int entity;
    private String note;
    private int noteLength;

    public PacketAddNote() {
    }

    public PacketAddNote(int entity, String note) {
        this.entity = entity;
        this.note = note;
    }

    public void toBytes(ByteBuf bbuf) {
        bbuf.writeInt(entity);
        bbuf.writeInt(note.getBytes(StandardCharsets.UTF_8).length);
        bbuf.writeBytes(note.getBytes(StandardCharsets.UTF_8));


    }

    public void fromBytes(ByteBuf bbuf) {
        this.entity = bbuf.readInt();
        int noteLength = bbuf.readInt();
        this.note = new String(bbuf.readBytes(noteLength).array(), StandardCharsets.UTF_8);


    }

    public static class Handler implements IMessageHandler<PacketAddNote, IMessage> {

        @Override
        public IMessage onMessage(PacketAddNote message, MessageContext context) {

            Entity entity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.entity);

            if (entity instanceof AbstractTrains) {

                entity.getDataWatcher().updateObject(31, message.note);
                ((AbstractTrains) entity).trainNote = message.note;

            }

            return null;
        }
    }
}
