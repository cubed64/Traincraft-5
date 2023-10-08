package train.common.core.network;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;
import train.common.entity.TrustedPlayer;
import train.common.tile.TileSwitchStand;

import java.util.ArrayList;
import java.util.List;

public class PacketUpdateSwitchStand implements IMessage {

    boolean isLocked;
    int switchStandX;
    int switchStandY;
    int switchStandZ;
    List<TrustedPlayer> trustedList = new ArrayList<>();

    /**
     * <p>Empty constructor is VERY NECESSARY. Do not REMOVE or Forge will get very angry!</p>
     */
    public PacketUpdateSwitchStand(){}

    /**
     * <p>Client -> Server communication packet to update lock and trusted list for switch stands.</p>
     * <p>Used to update the server to changes to the lock status of locked switches.</p>
     * <p>Server handles syncing from server -> client by use of getDescriptionPacket() S35TileEntityUpdate packet.</p>
     * @param isLocked Locked status. True for locked, false for unlocked.
     * @param trustedList Trusted players list.
     * @param switchStand Switch stand tile entity.
     */
    public PacketUpdateSwitchStand(boolean isLocked, List<TrustedPlayer> trustedList, TileSwitchStand switchStand) {
        this.isLocked = isLocked;
        this.trustedList = trustedList;
        switchStandX = switchStand.xCoord;
        switchStandY = switchStand.yCoord;
        switchStandZ = switchStand.zCoord;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {
        isLocked = bbuf.readBoolean();
        switchStandX = bbuf.readInt();
        switchStandY = bbuf.readInt();
        switchStandZ = bbuf.readInt();
        if (bbuf.readBoolean()) {
            NBTTagCompound nbtTagCompound = ByteBufUtils.readTag(bbuf);
            if (nbtTagCompound.hasKey("trustedList")) {
                NBTTagList trustedList = nbtTagCompound.getTagList("trustedList", Constants.NBT.TAG_COMPOUND);
                for (int i = 0; i < trustedList.tagCount(); i++) {
                    this.trustedList.add(new TrustedPlayer(trustedList.getCompoundTagAt(i).getString("playerName"), trustedList.getCompoundTagAt(i).getBoolean("breakAccess")));
                }
            }
        }
    }

    @Override
    public void toBytes(ByteBuf bbuf) {
        bbuf.writeBoolean(isLocked);
        bbuf.writeInt(switchStandX);
        bbuf.writeInt(switchStandY);
        bbuf.writeInt(switchStandZ);
        bbuf.writeBoolean(!trustedList.isEmpty());
        if (!trustedList.isEmpty()) {
            NBTTagCompound nbtTagCompound = new NBTTagCompound();
            TrustedPlayer.exportToNBT(trustedList, nbtTagCompound);
            ByteBufUtils.writeTag(bbuf, nbtTagCompound);
        }
    }

    public static class Handler implements IMessageHandler<PacketUpdateSwitchStand, IMessage> {

        @Override
        public IMessage onMessage(PacketUpdateSwitchStand message, MessageContext context) {
            // Always runs on the server side.
            TileSwitchStand switchStand = ((TileSwitchStand) context.getServerHandler().playerEntity.worldObj.getTileEntity(message.switchStandX, message.switchStandY, message.switchStandZ));
            switchStand.setLocked(message.isLocked);
            switchStand.setTrustedList(message.trustedList);
            /* By marking the block for update and marking the TE dirty, we can force the server to handle the return message
            through its default method of S35TileEntityUpdate packets. */
            context.getServerHandler().playerEntity.worldObj.markBlockForUpdate(message.switchStandX, message.switchStandY, message.switchStandZ);
            switchStand.markDirty();
            return null;
        }
    }
}