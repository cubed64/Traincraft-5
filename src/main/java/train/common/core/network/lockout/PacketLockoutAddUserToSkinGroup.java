package train.common.core.network.lockout;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import train.common.utils.lockout.LockoutPermissionsUtil;

public class PacketLockoutAddUserToSkinGroup implements IMessage
{
    String UserUUID;
    String UserName;
    String LockoutGroup;

    public PacketLockoutAddUserToSkinGroup()
    {

    }

    public PacketLockoutAddUserToSkinGroup(String userUUID, String username, String lockoutGroup)
    {
        UserUUID = userUUID;
        UserName = username;
        LockoutGroup = lockoutGroup;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        UserUUID = ByteBufUtils.readUTF8String(buf);
        UserName = ByteBufUtils.readUTF8String(buf);
        LockoutGroup = ByteBufUtils.readUTF8String(buf);
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        ByteBufUtils.writeUTF8String(buf, UserUUID);
        ByteBufUtils.writeUTF8String(buf, UserName);
        ByteBufUtils.writeUTF8String(buf, LockoutGroup);
    }

    public static class Handler implements IMessageHandler<PacketLockoutAddUserToSkinGroup, IMessage>
    {
        @Override
        public IMessage onMessage(PacketLockoutAddUserToSkinGroup message, MessageContext ctx)
        {
            new LockoutPermissionsUtil().AddUserToGroup(message.UserName, message.UserUUID, message.LockoutGroup);
            return null;
        }
    }
}
