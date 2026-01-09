package train.client.gui.specialbuttons;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.core.network.PacketSetTrainLockedToClient;
import train.common.library.GuiIDs;
import train.common.utils.TranslationUtil;

public final class TransportLockGuiHandler {

    private TransportLockGuiHandler()
    {
    }

    public static GuiButton createLockButton(
            EntityRollingStock stock,
            EntityPlayer player,
            int baseX,
            int baseY,
            int offsetX,
            int offsetY,
            int buttonWidth
    )
    {
        if (!stock.getTrainLockedFromPacket())
        {
            return new GuiButton(3, baseX + offsetX, baseY + offsetY, buttonWidth, 10, TranslationUtil.translate("train.unlocked.name"));
        }

        if (stock.getTransportOwner().equalsIgnoreCase(player.getDisplayName()))
        {
            return new GuiButton(3, baseX + offsetX, baseY + offsetY, buttonWidth, 10, TranslationUtil.translate("train.locked.name"));
        }

        if (stock.isPlayerTrusted(player.getDisplayName()))
        {
            if (stock.isPlayerTrustedToBreak(player.getDisplayName()))
            {
                return new GuiButton(3, baseX + offsetX, baseY + offsetY, buttonWidth, 10, TranslationUtil.translate("train.trustedplus.name"));
            }

            return new GuiButton(3, baseX + offsetX, baseY + offsetY, buttonWidth, 10, TranslationUtil.translate("train.trusted.name"));
        }

        return null;
    }

    public static void handleLockButton(
            GuiScreen gui,
            GuiButton button,
            EntityPlayer player,
            EntityRollingStock stock,
            boolean shiftDown
    )
    {
        if (player == null || stock == null) return;

        // Ownership check
        if (!player.getCommandSenderName().equalsIgnoreCase(stock.getTransportOwner())) {
            player.addChatMessage(new ChatComponentText(TranslationUtil.translate("train.owner.name")));
            return;
        }

        // Toggle lock (non-shift)
        if (!shiftDown) {
            toggleLock(stock, button, gui);
        }

        if (!shiftDown) {
            sendLockPacket(stock);
        }
        else {
            openLockMenu(gui, player, stock);
        }
    }

    private static void toggleLock(EntityRollingStock stock, GuiButton button, GuiScreen gui)
    {
        if (!stock.getTrainLockedFromPacket()) {
            stock.locked = true;
            button.displayString = TranslationUtil.translate("train.locked.name");
        }
        else {
            stock.locked = false;
            button.displayString = TranslationUtil.translate("train.unlocked.name");
        }
        gui.initGui();
    }

    private static void sendLockPacket(EntityRollingStock stock)
    {
        Traincraft.lockChannel.sendToServer(
                new PacketSetTrainLockedToClient(
                        stock.locked,
                        stock.getTrustedList(),
                        stock.getEntityId(),
                        false
                )
        );
    }

    private static void openLockMenu(GuiScreen gui, EntityPlayer player, EntityRollingStock stock)
    {
        gui.mc.thePlayer.closeScreen();
        player.openGui(
                Traincraft.instance,
                GuiIDs.LOCK_MENU,
                player.getEntityWorld(),
                stock.getEntityId(),
                -1,
                (int) stock.posZ
        );
    }
}