package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import train.client.render.RenderRollingStock;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.api.Freight;
import train.common.core.network.PacketCargoSelection;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;

import java.util.Collections;

/**
 * @author 02skaplan
 * <p>GUI for Cargo Selection</p>
 * <p>Allows players to select different models & textures for cargo in freight cars.</p>
 */
@SuppressWarnings("unchecked")
@SideOnly(Side.CLIENT)
public class GuiCargoSelection extends GuiAbstractPaintbrush {
    private float yaw = 0;
    private final EnumTrains fakeTrain;
    private final AbstractTrains renderEntity;
    private GuiButtonPaintbrushMenu playPauseButton;
    private boolean doRotation = true;
    /**
     * Used to vary the amount of cargo stored in a display entity to give illusion of loading animation.
     */
    int renderIteration = 0;

    /**
     * @author 02skaplan
     */
    public GuiCargoSelection(EntityPlayer editingPlayer, EntityRollingStock rollingStock) {
        super(editingPlayer, rollingStock);
        fakeTrain = EnumTrains.getCurrentTrain(rollingStock.getCartItem().getItem());
        renderEntity = fakeTrain.getEntity(Minecraft.getMinecraft().theWorld);

        /* Need to re-run these even after calling super because cargo uses selectedOption for current page
         and super() uses selectedOption - 1. */
        currentPage = selectedOption / RESULTS_PER_PAGE;
        hasNextPage = optionsOnCurrentPage + RESULTS_PER_PAGE * currentPage < totalOptions;
        optionsOnCurrentPage = Math.min(RESULTS_PER_PAGE, totalOptions - currentPage * RESULTS_PER_PAGE);
    }


    @Override
    protected void updateButtons() {
        super.updateButtons();
        this.playPauseButton.showButton = true;
        this.playPauseButton.visible = true;
        this.playPauseButton.setType(doRotation ? GuiButtonPaintbrushMenu.Type.PLAY : GuiButtonPaintbrushMenu.Type.PAUSE, playPauseButton.getTexture());
        if (currentPage == (getSelectedOption() / RESULTS_PER_PAGE)) { // If overlay is on current page, set the selected overlay to active and the rest to inactive.
            int numberOfActiveOverlayInGUI = getSelectedOption() % RESULTS_PER_PAGE; // Which button corresponds to the active overlay...
            for (int i = 3; i < 11; i++) {
                if (buttonList.get(i) instanceof GuiButtonPaintbrushMenu) {
                    if (i - 3 == numberOfActiveOverlayInGUI) {
                        ((GuiButtonPaintbrushMenu) buttonList.get(i)).setType(GuiButtonPaintbrushMenu.Type.SELECTIONBOX, GuiButtonPaintbrushMenu.Texture.ACTIVE);
                    } else {
                        ((GuiButtonPaintbrushMenu) buttonList.get(i)).setType(GuiButtonPaintbrushMenu.Type.SELECTIONBOX, GuiButtonPaintbrushMenu.Texture.INACTIVE);
                    }
                }
            }
        } else { // If selected overlay is not on current page, set all buttons to inactive.
            for (int i = 3; i < 11; i++) {
                if (buttonList.get(i) instanceof GuiButtonPaintbrushMenu) {
                    ((GuiButtonPaintbrushMenu) buttonList.get(i)).setType(GuiButtonPaintbrushMenu.Type.SELECTIONBOX, GuiButtonPaintbrushMenu.Texture.INACTIVE);
                }
            }
        }

    }

    @Override
    public void drawInBackground() {
        renderIteration++;
        float offsetX = GUI_ANCHOR_X;
        float offsetY = GUI_ANCHOR_Y + 12;
        // Display the model with each texture.
        RenderRollingStock.setRenderModeGUI(true); // VERY IMPORTANT CALL! Forces renderer to render in full bright.
        RenderRollingStock.setRenderGUIFullBright(true);

        // Trick the entity into thinking it is amount of cargo is changing.
        // If the load is dynamic, it will cycle between the different states to show the loading animation.
        if (renderIteration == 10) {
            renderIteration = 0;
            if (((Freight) renderEntity).getAmmountOfCargo() == ((Freight) renderEntity).getSizeInventory() - 1)
                renderEntity.getDataWatcher().updateObject(22, 1);
            else
                renderEntity.getDataWatcher().updateObject(22, renderEntity.getDataWatcher().getWatchableObjectInt(22) + 1);
        }

        float bogieOffset = (float) Math.abs(fakeTrain.getBogieLocoPosition()) * 0.5f;
        for (int i = 0; i < optionsOnCurrentPage; i++) {
            renderEntity.setColor(rollingStock.getColor());
            renderEntity.getCargoManager().setSelectedCargo(i + RESULTS_PER_PAGE * currentPage);
            GL11.glColor4f(1, 1, 1, 1);
            GL11.glPushMatrix();
            GL11.glTranslated(offsetX + 50, offsetY + 50, 400);
            GL11.glScalef(-fakeTrain.getGuiRenderScale(), fakeTrain.getGuiRenderScale(), fakeTrain.getGuiRenderScale());
            GL11.glRotatef(180, 0, 0, 1);
            GL11.glRotatef(yaw, 0, 1, 0);
            RenderManager.instance.renderEntityWithPosYaw(renderEntity, bogieOffset, 0, 0, 0, 0);
            GL11.glPopMatrix();

            // Handle rotation of entity(s) in GUI.
            offsetX += 95;
            if (offsetX > GUI_ANCHOR_X + 292) {
                offsetX = GUI_ANCHOR_X;
                offsetY += 92;
            }
        }
        if (doRotation)
            yaw += 0.5F;
        RenderRollingStock.setRenderModeGUI(false); // VERY IMPORTANT CALL! Forces renderer to render in full bright.
        RenderRollingStock.setRenderGUIFullBright(false);
    }

    @Override
    public void drawInForeground(int mouseX, int mouseY) {
        // Draw tooltips.
        GuiButtonPaintbrushMenu loopButton;
        for (int i = 0; i < optionsOnCurrentPage; i++) {
            loopButton = ((GuiButtonPaintbrushMenu) buttonList.get(i + 3));
            if (mouseX > loopButton.xPosition && mouseX < loopButton.xPosition + loopButton.width && mouseY > loopButton.yPosition && mouseY < loopButton.yPosition + loopButton.height)
                if (i == 0 && currentPage == 0) {
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.No Cargo.name")), mouseX, mouseY, fontRendererObj);
                } else {
                    drawHoveringText(Collections.singletonList(rollingStock.getCargoManager().getCargoSpecificationList()[i - 1 + RESULTS_PER_PAGE * currentPage][0].textureName), mouseX, mouseY, fontRendererObj);
                }
        }
        if (playPauseButton.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE) {
            if (doRotation)
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Pause.name")), mouseX, mouseY, fontRendererObj);
            else
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Play.name")), mouseX, mouseY, fontRendererObj);
        }
    }

    @Override
    public void selectAndSendUpdatePacket(int choice) {
        int cargoNumber = (currentPage * RESULTS_PER_PAGE) + (choice - 3);
        // Send an update packet to the server of cargo change.
        // We don't actually change the texture on the client yet; we let the server know we changed it.
        // After the server recognizes that we changed it, it will send an update packet out to all clients.
        rollingStock.getCargoManager().setSelectedCargo(cargoNumber);
        Traincraft.cargoSelectionChannel.sendToServer(new PacketCargoSelection(cargoNumber, rollingStock.getEntityId(), rollingStock.dimension));
    }

    @Override
    public void closeButtonAction() {
        editingPlayer.openGui(Traincraft.instance, GuiIDs.PAINTBRUSH, editingPlayer.getEntityWorld(), rollingStock.getEntityId(), -1, (int) editingPlayer.posZ);
    }

    @Override
    public int getTotalOptions() {
        // Needs to be + 1 to account for the "no cargo" option.
        return rollingStock.getCargoManager().getCargoSpecificationList().length + 1;
    }

    @Override
    public int getSelectedOption() {
        return rollingStock.getCargoManager().getSelectedCargo();
    }

    @Override
    public void addExtraButtons() {
        this.buttonList.add(this.playPauseButton = new GuiButtonPaintbrushMenu(12, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 29, 22, 22, GuiButtonPaintbrushMenu.Type.PLAY));
    }

    @Override
    public void handleExtraButtons(int buttonID) {
        if (buttonID == 12) {
            doRotation = !doRotation;
            updateButtons();
        }
    }
}