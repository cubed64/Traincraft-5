package train.common.core.network.AdminBook;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import train.common.Traincraft;

import java.io.UnsupportedEncodingException;

public class PacketAdminBook implements IMessage
{
    /**the key to define what function to use*/
    private int key;
    private int ID;
    private String datacsv;

    public PacketAdminBook()
    {

    }

    public PacketAdminBook(int key, int ID, String data)
    {
        this.key = key;
        this.ID = ID;
        this.datacsv = data;
    }

    /**reads the packet on server to get the variables from the Byte Buffer*/
    @Override
    public void fromBytes(ByteBuf bbuf)
    {
        try
        {
            String data = new String(bbuf.array(), "UTF-8");
            if (!data.equals(""))
            {
                key = Integer.parseInt(data.substring(data.indexOf(":")+1, data.indexOf(",")));
                data = data.substring(data.indexOf(",") + 1, data.length());
                ID = Integer.parseInt(data.substring(0, data.indexOf(",")));
                datacsv = data.substring(data.indexOf(",") + 1, data.length());
            }
        } catch (UnsupportedEncodingException e){

        }
    }

    /**puts the variables into a Byte Buffer so they can be sent to server*/
    @Override
    public void toBytes(ByteBuf bbuf)
    {
        try
        {
            StringBuilder sb=new StringBuilder();
            sb.append(":");
            sb.append(key);
            sb.append(",");
            sb.append(ID);
            sb.append(",");
            sb.append(datacsv);
            bbuf.writeBytes(sb.toString().getBytes("UTF-8"));

        }
        catch (UnsupportedEncodingException e)
        {

        }
    }

    public static class Handler implements IMessageHandler<PacketAdminBook, IMessage>
    {
        @Override
        public IMessage onMessage(PacketAdminBook message, MessageContext context)
        {
            Traincraft.proxy.openadmingui(message.datacsv);

            return null;
        }

    }
}