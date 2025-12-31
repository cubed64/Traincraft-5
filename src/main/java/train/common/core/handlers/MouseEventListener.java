package train.common.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.MouseEvent;
import train.common.blocks.BlockTCRail;
import train.common.core.network.ITCPacket.PacketScrollingItemBlockSelect;
import train.common.items.ItemTCRail;

public class MouseEventListener
{
    public long lastScroll = 0;
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onMouseEvent(MouseEvent event) {
        // We only want to process wheel events
        if (event.button < 0 && event.dwheel != 0) {
            EntityPlayer entityPlayer = Minecraft.getMinecraft().thePlayer;
            if (entityPlayer != null && entityPlayer.isSneaking()) {
                ItemStack itemStack = entityPlayer.getHeldItem();
                if (itemStack != null && itemStack.getItem() instanceof ItemTCRail) {
                    if (System.currentTimeMillis() - lastScroll < 300) { //limit how fast you can scroll through the items
                        event.setCanceled(true);
                        return;
                    }
                    PacketHandler.sendPacketToServer(new PacketScrollingItemBlockSelect(entityPlayer.inventory.currentItem, event.dwheel > 0));
                    lastScroll = System.currentTimeMillis();
                    event.setCanceled(true);
                }
            }
        }
    }
}
