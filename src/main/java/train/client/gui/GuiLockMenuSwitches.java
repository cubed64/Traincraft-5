package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import train.common.Traincraft;
import train.common.core.network.PacketUpdateSwitchStand;
import train.common.tile.TileSwitchStand;

/**
 * @author 02skaplan
 * <p>Lock and Trusted Players Menu</p>
 * <p>Allows players to lock and unlock a piece of rolling stock and add & remove trusted individuals from using the rolling stock.</p>
 */
@SideOnly(Side.CLIENT)
public class GuiLockMenuSwitches extends GuiLockMenuAbstract {
    private final TileSwitchStand switchStand;

    /**
     * @author 02skaplan
     */
    public GuiLockMenuSwitches(EntityPlayer editingPlayer, TileSwitchStand switchStand) {
        super(editingPlayer);
        this.switchStand = switchStand;
        currentTrustees.addAll(switchStand.getTrustedList());
    }

    @Override
    protected void updateButtons() {
        super.updateButtons();
        closeAndSavetoAll.showButton = false;
        closeAndSavetoAll.visible = false;
    }
    @Override
    public boolean getLocked() {
        return switchStand.isLocked();
    }

    @Override
    public void setLocked(boolean locked) {
        switchStand.setLocked(locked);
    }

    @Override
    public void sendUpdatePacket(boolean propagate) {
        Traincraft.switchStandLockChannel.sendToServer(new PacketUpdateSwitchStand(switchStand.isLocked(), exportTrustedPlayers(), switchStand));
    }
}
