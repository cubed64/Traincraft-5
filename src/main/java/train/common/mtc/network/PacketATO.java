package train.common.mtc.network;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import train.common.api.Locomotive;

public class PacketATO implements IMessage {

   public int entity;
   public int status;


   public PacketATO() {}

   public PacketATO(int entity, int status) {
      this.entity = entity;
      this.status = status;
   }

   public void fromBytes(ByteBuf buf) {
      this.entity = buf.readInt();
      this.status = buf.readInt();
      if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
         Entity entity = Minecraft.getMinecraft().theWorld.getEntityByID(this.entity);
         if (entity instanceof Locomotive) {
            Locomotive locomotive = (Locomotive)entity;
            locomotive.atoStatus = this.status;

         }
      }


   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(this.entity);
      buf.writeInt(this.status);
   }
}
