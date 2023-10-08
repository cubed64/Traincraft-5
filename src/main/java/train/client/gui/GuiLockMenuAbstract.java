package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import train.common.entity.TrustedPlayer;
import train.common.library.Info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 02skaplan
 * <p>Lock and Trusted Players Menu</p>
 * <p>Allows players to lock and unlock a piece of rolling stock and add & remove trusted individuals from using the rolling stock.</p>
 */
@SuppressWarnings("unchecked")
@SideOnly(Side.CLIENT)
public abstract class GuiLockMenuAbstract extends GuiScreen {
    private final EntityPlayer editingPlayer;
    final private int MENU_TEXTURE_WIDTH = 176;
    final private int MENU_TEXTURE_HEIGHT = 222;
    /**
     * X-coordinate of top left of GUI.
     */
    private int GUI_ANCHOR_X;
    /**
     * X-coordinate of top center of GUI.
     */
    private int GUI_ANCHOR_MID_X;
    private int TEXTBOX_LEFT_ANCHOR;
    /**
     * Y-coordinate of top left of GUI.
     */
    private int GUI_ANCHOR_Y;
    private GuiButtonLockMenu lockUnlockButton;
    private GuiButtonLockMenu closeButton;
    protected GuiButtonLockMenu closeAndSavetoAll;
    protected final int MAX_TRUSTEES;
    protected final int textBoxWidth;
    protected final int textBoxHeight;
    protected final int textBoxAndButtonWidth; //
    private int numberOfActiveTextboxes = 1;
    protected final List<TrustedPlayer> currentTrustees;
    private final List<GuiTextField> textFieldList = new ArrayList<>();

    /**
     * @author 02skaplan
     */
    public GuiLockMenuAbstract(EntityPlayer editingPlayer) {
        this.editingPlayer = editingPlayer;
        currentTrustees = new ArrayList<>();
        MAX_TRUSTEES = 6;
        textBoxWidth = 100;
        textBoxHeight = 20;
        textBoxAndButtonWidth = textBoxWidth + 17 + 5;
    }

    /**
     * Initial setup for buttons and GUI anchors.
     */
    @Override
    public void initGui() {
        GUI_ANCHOR_MID_X = (this.width) / 2;
        GUI_ANCHOR_Y = (this.height) / 2 - (MENU_TEXTURE_HEIGHT / 2);
        GUI_ANCHOR_X = GUI_ANCHOR_MID_X - (MENU_TEXTURE_WIDTH) / 2;
        TEXTBOX_LEFT_ANCHOR = GUI_ANCHOR_MID_X - (textBoxAndButtonWidth / 2) - 7;
        this.buttonList.clear();
        this.buttonList.add(this.lockUnlockButton = new GuiButtonLockMenu(0, GUI_ANCHOR_MID_X - (17 / 2), GUI_ANCHOR_Y + 10, 17, 25, getLocked() ? GuiButtonLockMenu.Type.LOCKED : GuiButtonLockMenu.Type.UNLOCKED));
        this.buttonList.add(this.closeButton = new GuiButtonLockMenu(1, GUI_ANCHOR_X + MENU_TEXTURE_WIDTH - 22, GUI_ANCHOR_Y + 4, 17, 17, GuiButtonLockMenu.Type.CLOSE));
        this.buttonList.add(this.closeAndSavetoAll = new GuiButtonLockMenu(2, GUI_ANCHOR_X + MENU_TEXTURE_WIDTH - 41, GUI_ANCHOR_Y + 4, 17, 17, GuiButtonLockMenu.Type.SAVETOALL));

        textFieldList.clear();
        for (int i = 0; i < MAX_TRUSTEES; i ++) { // Add text boxes, line select delete buttons, import current trustees to textboxes.
            this.buttonList.add(new GuiButtonLockMenu(i + 3, TEXTBOX_LEFT_ANCHOR + textBoxWidth + 3, (GUI_ANCHOR_Y + 55 + (i * (textBoxHeight + 5))) + 2, 17, 17, GuiButtonLockMenu.Type.REMOVE));
            textFieldList.add(new GuiTextField(fontRendererObj, TEXTBOX_LEFT_ANCHOR, (GUI_ANCHOR_Y + 55 + (i * (textBoxHeight + 5))), textBoxWidth, textBoxHeight));
            textFieldList.get(i).setCanLoseFocus(true);
            textFieldList.get(i).setMaxStringLength(16);
            if (i < currentTrustees.size())
                textFieldList.get(i).setText(currentTrustees.get(i).getDisplayName());
        }
        for (int i = 0; i < MAX_TRUSTEES; i++) { // Add break access buttons (done in separate loop to preserve order of list).
            if (i < currentTrustees.size()) {
                boolean hasBreakAccess = currentTrustees.get(i).hasBreakAccess();
                this.buttonList.add(new GuiButtonLockMenu(i + 3 + MAX_TRUSTEES, TEXTBOX_LEFT_ANCHOR + textBoxWidth + 22, (GUI_ANCHOR_Y + 55 + (i * (textBoxHeight + 5))) + 2, 17, 17, hasBreakAccess ? GuiButtonLockMenu.Type.BREAKACCESSON : GuiButtonLockMenu.Type.BREAKACCESSOFF));
            } else
                this.buttonList.add(new GuiButtonLockMenu(i + 3 + MAX_TRUSTEES, TEXTBOX_LEFT_ANCHOR + textBoxWidth + 22, (GUI_ANCHOR_Y + 55 + (i * (textBoxHeight + 5))) + 2, 17, 17, GuiButtonLockMenu.Type.BREAKACCESSOFF));
        }
        numberOfActiveTextboxes = currentTrustees.size() == 0 ? 1 : currentTrustees.size();
        this.updateButtons();
    }

    protected void updateButtons() {
        this.lockUnlockButton.showButton = true;
        this.lockUnlockButton.visible = true;
        this.lockUnlockButton.setType(getLocked() ? GuiButtonLockMenu.Type.LOCKED : GuiButtonLockMenu.Type.UNLOCKED, this.lockUnlockButton.getTexture());
        this.closeButton.showButton = true;
        this.closeButton.visible = true;
        this.closeAndSavetoAll.showButton = true;
        this.closeAndSavetoAll.visible = true;
        for (int i = 0; i < MAX_TRUSTEES; i ++) {
            textFieldList.get(i).setVisible(i < numberOfActiveTextboxes);
            ((GuiButtonLockMenu) this.buttonList.get(i + 3)).visible = i < numberOfActiveTextboxes;
            ((GuiButtonLockMenu) this.buttonList.get(i + 3)).showButton = i < numberOfActiveTextboxes;
            ((GuiButtonLockMenu) this.buttonList.get(i + 3 + MAX_TRUSTEES)).visible = i < numberOfActiveTextboxes;
            ((GuiButtonLockMenu) this.buttonList.get(i + 3 + MAX_TRUSTEES)).showButton = i < numberOfActiveTextboxes;
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float par3) {
        // Draw background.
        mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_lockmenu.png"));
        this.drawTexturedModalRect(GUI_ANCHOR_X, GUI_ANCHOR_Y, 0, 0, MENU_TEXTURE_WIDTH, MENU_TEXTURE_HEIGHT);
        super.drawScreen(mouseX, mouseY, par3);
        for (int i = 0; i < numberOfActiveTextboxes; i++) {
            textFieldList.get(i).drawTextBox();
        }
        // Draw Hovering Tooltips
        // I split this up to hopefully reduce the amount of statements it has to process.
        fontRendererObj.drawString(StatCollector.translateToLocal("lockmenu.Title_Trusted_Players.name"), GUI_ANCHOR_MID_X - (fontRendererObj.getStringWidth(StatCollector.translateToLocal("lockmenu.Title_Trusted_Players.name")) / 2), GUI_ANCHOR_Y + 40, -16777216);
        if (lockUnlockButton.getTexture() == GuiButtonLockMenu.Texture.ACTIVE)
            if (getLocked())
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("lockmenu.Unlock.name")), mouseX, mouseY, fontRendererObj);
            else
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("lockmenu.Lock.name")), mouseX, mouseY, fontRendererObj);
        if (closeButton.getTexture() == GuiButtonLockMenu.Texture.ACTIVE)
            drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("lockmenu.Save and Close.name")), mouseX, mouseY, fontRendererObj);
        if (closeAndSavetoAll.getTexture() == GuiButtonLockMenu.Texture.ACTIVE)
            drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("lockmenu.Save To All Cars in Consist.name")), mouseX, mouseY, fontRendererObj);
        if (!textFieldList.get(numberOfActiveTextboxes - 1).isFocused()) { // Get the last text box on the page...
            if (!textFieldList.get(numberOfActiveTextboxes - 1).getText().equalsIgnoreCase("")) { // If the text box is not empty...
                if (numberOfActiveTextboxes < MAX_TRUSTEES) { // Add another text box if there is room on the page.
                    numberOfActiveTextboxes++;
                    updateButtons();
                }
            }
        }

    }

    @Override
    protected void actionPerformed(GuiButton clickedButton) {
        if (clickedButton.enabled) {
            editingPlayer.playSound("random.click", 1f, 1f);
            if (clickedButton.id == 0) { // Main Lock Button
                setLocked(!getLocked());
                updateButtons();
            } else if (clickedButton.id == 1) { // Save and Close Button
                sendUpdatePacket(false);
                this.mc.thePlayer.closeScreen();
            } else if (clickedButton.id == 2) {
                sendUpdatePacket(true);
                this.mc.thePlayer.closeScreen();
            } else if (clickedButton.id > 2 && clickedButton.id < MAX_TRUSTEES + 3) { // Line Select Delete Buttons
                int textBoxToBeCleared = clickedButton.id - 3;
                textFieldList.get(textBoxToBeCleared).setText("");
                if (textBoxToBeCleared < numberOfActiveTextboxes) {
                    for (int i = textBoxToBeCleared; i < MAX_TRUSTEES - 1; i++) {
                        textFieldList.get(i).setText(textFieldList.get(i + 1).getText()); // Shift down text boxes.
                        ((GuiButtonLockMenu) this.buttonList.get(i + 3 + MAX_TRUSTEES)).setType(((GuiButtonLockMenu) this.buttonList.get(i + 3 + MAX_TRUSTEES)).getType(), GuiButtonLockMenu.Texture.INACTIVE); // Shift down break access buttons.
                    }
                    textFieldList.get(numberOfActiveTextboxes - 1).setText("");
                    if (numberOfActiveTextboxes != 1)
                        numberOfActiveTextboxes--;
                    updateButtons();
                }
            } else if (clickedButton.id > MAX_TRUSTEES + 2) { // Break Access Buttons
                GuiButtonLockMenu testVar = ((GuiButtonLockMenu) clickedButton);
                if (testVar.getType() == GuiButtonLockMenu.Type.BREAKACCESSOFF)
                    testVar.setType(GuiButtonLockMenu.Type.BREAKACCESSON, testVar.getTexture());
                else
                    testVar.setType(GuiButtonLockMenu.Type.BREAKACCESSOFF, testVar.getTexture());
            }
        }
    }
    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
    }

    @Override
    public void mouseClicked(int x, int y, int par3) {
        super.mouseClicked(x, y, par3);
        for (GuiTextField textField : textFieldList) {
            textField.mouseClicked(x, y, par3);
        }
    }

    @Override
    protected void keyTyped(char eventChar, int eventKey) {
        if (eventKey == 1) { // If ESC...
            this.mc.thePlayer.closeScreen();
        }
        for (int i = 0; i < MAX_TRUSTEES; i++) {
            GuiTextField textField = textFieldList.get(i);
            if (textField.isFocused()) {
                textField.textboxKeyTyped(eventChar, eventKey);
                if (eventChar == '\r') {
                    textField.setFocused(false);
                    if (textFieldList.size() > i + 1)
                        textFieldList.get(i + 1).setFocused(true);
                }
                break;
            }
        }
    }

    protected List<TrustedPlayer> exportTrustedPlayers() {
        List<TrustedPlayer> newTrustees = new ArrayList<>();
        for (int i = 0; i < numberOfActiveTextboxes; i++) {
            if (!textFieldList.get(i).getText().isEmpty()) {
                newTrustees.add(new TrustedPlayer(textFieldList.get(i).getText().trim(), ((GuiButtonLockMenu) this.buttonList.get(i + 3 + MAX_TRUSTEES)).getType() == GuiButtonLockMenu.Type.BREAKACCESSON));
            }
        }
        return newTrustees;
    }

    public abstract boolean getLocked();
    public abstract void setLocked(boolean locked);
    public abstract void sendUpdatePacket(boolean propagate);

}
