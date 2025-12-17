package train.common.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.world.BlockEvent;
import train.common.blocks.BlockSwitchStand;
import train.common.entity.TrustedPlayer;
import train.common.items.ItemPadlock;
import train.common.tile.TileSwitchStand;

public class BlockBreakHandler {
    @SubscribeEvent
    public void onBlockBreakEvent(BlockEvent.BreakEvent breakEvent) {
        if (breakEvent.block instanceof BlockSwitchStand || breakEvent.world.getBlock(breakEvent.x, breakEvent.y + 1, breakEvent.z) instanceof  BlockSwitchStand) {
            TileSwitchStand switchStand;
            if (breakEvent.block instanceof  BlockSwitchStand) {
                switchStand =  ((TileSwitchStand) breakEvent.world.getTileEntity(breakEvent.x, breakEvent.y, breakEvent.z));
            } else {
                switchStand =  ((TileSwitchStand) breakEvent.world.getTileEntity(breakEvent.x, breakEvent.y + 1, breakEvent.z));
            }
            if (switchStand.isLocked() &&
                    (!(breakEvent.getPlayer().getDisplayName().equalsIgnoreCase(switchStand.getOwner())) && !TrustedPlayer.isPlayerTrustedToBreak(breakEvent.getPlayer().getDisplayName(), switchStand.getTrustedList()))) {
                if (breakEvent.getPlayer().canCommandSenderUseCommand(2, "") && breakEvent.getPlayer().inventory.getCurrentItem() != null &&
                        breakEvent.getPlayer().inventory.getCurrentItem().getItem() instanceof ItemPadlock) {
                    breakEvent.getPlayer().addChatMessage(new ChatComponentText("Broke switch stand owned by " + switchStand.getOwner() + " with operator permission."));
                } else {
                    breakEvent.setCanceled(true);
                    breakEvent.getPlayer().addChatMessage(new ChatComponentText("This switch stand is locked by " + switchStand.getOwner() + "!"));
                }
            }
        }
    }
}