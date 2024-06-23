package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import train.common.api.Locomotive;

public class PacketLocomotiveDitchLights implements IMessage
{
    byte ditchLightsMode;
    int	entityID;

    public PacketLocomotiveDitchLights()
    {

    }

    public PacketLocomotiveDitchLights(byte ditchLightsMode, int trainEntity)
    {
    	this.ditchLightsMode = ditchLightsMode;
    	this.entityID = trainEntity;
    }

    @Override
    public void fromBytes(ByteBuf bbuf)
    {
		this.ditchLightsMode = bbuf.readByte();
		this.entityID = bbuf.readInt();
    }

    @Override
    public void toBytes(ByteBuf bbuf)
    {
		bbuf.writeByte(this.ditchLightsMode);
		bbuf.writeInt(this.entityID);
    }

    public static class Handler implements IMessageHandler<PacketLocomotiveDitchLights, IMessage>
    {

        @Override
        public IMessage onMessage(PacketLocomotiveDitchLights message, MessageContext context)
        {
			
			Entity TrainEntity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.entityID);
			
			if (TrainEntity instanceof Locomotive) {

				((Locomotive) TrainEntity).setPacketLocomotiveDitchLightsMode(message.ditchLightsMode);

			}

            return null;
        }
    }
}