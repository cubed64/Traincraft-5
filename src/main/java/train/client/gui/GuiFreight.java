package train.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import train.common.Traincraft;
import train.common.api.Freight;
import train.common.core.network.PacketAddNote;
import train.common.core.network.PacketSetTrainLockedToClient;
import train.common.inventory.InventoryFreight;
import train.common.library.Info;

import java.util.List;

public class GuiFreight extends GuiContainer {

	private Freight freight;
	private int inventoryRows;
	private EntityPlayer player;
	private GuiTCTextField trainNote;

	private float yaw;
	private float roll;
	private boolean rollDown;
	private GuiButton buttonLock;

	public GuiFreight(EntityPlayer player, InventoryPlayer inventoryplayer, Entity entityminecart) {
		super(new InventoryFreight(inventoryplayer, (Freight) entityminecart));
		freight = (Freight) entityminecart;
		this.player = player;
		inventoryRows = 0;
		char c = '\336';
		int i = c - 108;
		inventoryRows = (freight.getSizeInventory() / 9);
		ySize = i + inventoryRows * 18;
	}

	@Override
	public void initGui() {
		super.initGui();
		buttonList.clear();
		ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
		int var1 = (this.width - xSize) / 2;
		int var2 = (this.height - ySize) / 2;
		int width = sr.getScaledWidth();
		int height = sr.getScaledHeight();

		if (!freight.getTrainLockedFromPacket()) {
			this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 124, var2 - 10, 51, 10, "Unlocked"));
		}
		else {
			if (freight.getTrainOwner().equalsIgnoreCase(player.getDisplayName()))
				this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 130, var2 - 10, 43, 10, "Locked"));
			else if (freight.isPlayerTrusted(player.getDisplayName()))
				if (freight.isPlayerTrustedToBreak(player.getDisplayName()))
					this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 125, var2 - 10, 48, 10, "Trusted+"));
				else
					this.buttonList.add(this.buttonLock = new GuiButton(3, var1 + 128, var2 - 10, 45, 10, "Trusted"));
		}

		trainNote = new GuiTCTextField(fontRendererObj, width/2 - 85, height/2 - 120, 170,15);
		trainNote.setText(freight.getTrainNote());
	}


	@Override
	protected void actionPerformed(GuiButton guibutton) {
		if (guibutton.id == 3) {
			if (player != null && player.getCommandSenderName().equalsIgnoreCase(freight.getTrainOwner())) {
				if (!freight.getTrainLockedFromPacket() && !isShiftKeyDown()) {
					freight.locked = true;
					guibutton.displayString = "Locked";
					this.initGui();
				} else if (!isShiftKeyDown()) {
					freight.locked = false;
					guibutton.displayString = "UnLocked";
					this.initGui();
				}
				AxisAlignedBB box = freight.boundingBox.expand(5, 5, 5);
				List lis3 = freight.worldObj.getEntitiesWithinAABBExcludingEntity(freight, box);
				if (lis3 != null && lis3.size() > 0) {
					for (Object entity : lis3) {
						if (entity instanceof EntityPlayer) {
							if (!isShiftKeyDown()) {
								Traincraft.lockChannel.sendToServer(new PacketSetTrainLockedToClient(freight.locked, freight.getTrustedList(), freight.getEntityId(), false));
							}
						}
					}
				}
			}
			else if (player != null) {
				player.addChatMessage(new ChatComponentText("You are not the owner!"));
			}
		}
	}

	@Override
	protected void drawCreativeTabHoveringText(String str, int t, int g) {

		String state = "";
		if (freight.getTrainLockedFromPacket()) {
			if (freight.getTrainOwner().equalsIgnoreCase(player.getDisplayName()))
				state = "Locked";
			else if (freight.isPlayerTrusted(player.getDisplayName()))
				if (freight.isPlayerTrustedToBreak(player.getDisplayName()))
					state = "Trusted Access+";
				else
					state = "Trusted Access";
		} else
			state = "Unlocked";

		int textWidth = fontRendererObj.getStringWidth("the GUI, change speed, destroy it.");
		int startX = 90;
		int startY = 5;

		int i4 = 0xf0100010;
		drawGradientRect(startX - 3, startY - 4, startX + textWidth + 3, startY + 8 + 4 + 40, i4, i4);
		drawGradientRect(startX - 4, startY - 3, startX + textWidth + 4, startY + 8 + 3 + 40, i4, i4);
		int colour1 = 0x505000ff;
		int colour2 = (colour1 & 0xfefefe) >> 1 | colour1 & 0xff000000;
		drawGradientRect(startX - 3, startY - 3, startX + textWidth + 3, startY + 8 + 3 + 40, colour1, colour2);
		drawGradientRect(startX - 2, startY - 2, startX + textWidth + 2, startY + 8 + 2 + 40, i4, i4);
		fontRendererObj.drawStringWithShadow(str, startX, startY, -1);
		fontRendererObj.drawStringWithShadow("only its owner can open", startX, startY + 10, -1);
		fontRendererObj.drawStringWithShadow("the GUI and destroy it.", startX, startY + 20, -1);
		fontRendererObj.drawStringWithShadow("Current state: " + state, startX, startY + 30, -1);
		fontRendererObj.drawStringWithShadow("Owner: " + freight.getTrainOwner().trim(), startX, startY + 40, -1);
	}

	public boolean intersectsWith(int mouseX, int mouseY) {
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		return (mouseX >= j + 124 && mouseX <= j + 174 && mouseY >= k - 10 && mouseY <= k);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		
		fontRendererObj.drawString(freight.getCommandSenderName(), 10, 6, 0x404040);
		fontRendererObj.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
		
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		
		if (intersectsWith(i, j)) {
			drawCreativeTabHoveringText("When a freight is locked,", i, j);
		}
		ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
		int width = sr.getScaledWidth();
		int height = sr.getScaledHeight();

		int textboxB = 296;
		int textboxA = 131;
		if (i >= textboxA && i <= textboxB && j >= 216 && j <= 230) {
			int textWidth = fontRendererObj.getStringWidth("the GUI, change speed, destroy it.");
			int startX = 90;
			int startY = 5;

			int i4 = 0xf0100010;
			drawGradientRect(startX - 3, startY - 4, startX + textWidth + 3, startY + 8 + 4 + 40, i4, i4);
			drawGradientRect(startX - 4, startY - 3, startX + textWidth + 4, startY + 8 + 3 + 40, i4, i4);
			int colour1 = 0x505000ff;
			int colour2 = (colour1 & 0xfefefe) >> 1 | colour1 & 0xff000000;
			drawGradientRect(startX - 3, startY - 3, startX + textWidth + 3, startY + 8 + 3 + 40, colour1, colour2);
			drawGradientRect(startX - 2, startY - 2, startX + textWidth + 2, startY + 8 + 2 + 40, i4, i4);
			//fontRendererObj.drawStringWithShadow("Give the train a note here", startX, startY, -1);

			//fontRendererObj.drawStringWithShadow("Owner: " + freight.getTrainOwner().trim(), startX, startY + 40, -1);

		}
		//ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);

		//trainNote = new GuiTCTextField(fontRendererObj, width/2 - 85, height/2 + 95, 170,15);


	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int t, int g) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "container.png"));
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		drawTexturedModalRect(j, k, 0, 0, xSize, inventoryRows * 18 + 17);
		drawTexturedModalRect(j, k + inventoryRows * 18 + 17, 0, 126, xSize, 96);
	}
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
		trainNote.drawTextBox();
	}

	@Override
	public void updateScreen() {
		super.updateScreen();
		if (trainNote.isFocused()) {
			trainNote.updateCursorCounter();
		}
	}

	@Override
	protected void keyTyped(char par1, int par2) {


		if (trainNote.isFocused()) {
			trainNote.textboxKeyTyped(par1, par2);
		} else if (par1 == 1 || (par2 == this.mc.gameSettings.keyBindInventory.getKeyCode() || par2 == Keyboard.KEY_ESCAPE)){
			Traincraft.lockChannel.sendToServer(new PacketAddNote(freight.getEntityId(), trainNote.getText()));
			mc.thePlayer.closeScreen();
		} else {
			super.keyTyped(par1, par2);
		}





	}


	@Override
	protected void mouseClicked(int par1, int par2, int par3) {
		trainNote.mouseClicked(par1, par2, par3);
		super.mouseClicked(par1, par2, par3);
	}
}