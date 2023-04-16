package train.client.gui;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.*;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Vec3;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.input.Keyboard;
import train.common.Traincraft;
import train.common.items.ItemPositionMarker;
import train.common.mtc.tile.TileTransmitterSpeed;
import train.common.mtc.network.PacketUpdateSpeedTransmitter;

import java.util.ArrayList;
import java.util.List;

public class GuiSpeedTransmitter extends GuiScreen {
    private TileTransmitterSpeed baseTile;


    private GuiTextField speedLimitField;
    private GuiTextField nextSpeedLimitField;
    private GuiTextField nextSpeedXField;
    private GuiTextField nextSpeedYField;
    private GuiTextField nextSpeedZField;
    private GuiTextField profileTextField;
    private GuiTextField onRedstoneProfileField;

    private GuiTextField directionUpField;
    private GuiTextField directionDownField;

    private GuiButton profileChange;
    private GuiButton onRedstone; //On Redstone: Do nothing, secondary profile
    private GuiButton done; //On Redstone: Do nothing, secondary profile
    private GuiButton addFromItem;
    private GuiButton directionalToggle;

    private GuiButton inferDirection;

    public int xSize = 305;
    public int ySize = 274;
    public int guiLeft;
    public int guiTop;

    public List<int[]> speedProfiles = new ArrayList<>();

    int profile = 0;
    int redstoneReaction;
    int redstoneProfile;

    boolean directional;
    int upProfile;
    int downProfile;

    NBTTagCompound autofillCompound;

    //0: Do nothing
    //1: Activate/Deactivate
    //2: Use Profile 2
    public GuiSpeedTransmitter() {
        speedProfiles.add(new int[]{0, 0, 0, 0, 0});
        speedProfiles.add(new int[]{0, 0, 0, 0, 0});
        speedProfiles.add(new int[]{0, 0, 0, 0, 0});
        speedProfiles.add(new int[]{0, 0, 0, 0, 0});
    }

    public GuiSpeedTransmitter(TileEntity te) {
        baseTile = (TileTransmitterSpeed)te;
    }

    @Override
    public void initGui() {
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
        int width = sr.getScaledWidth();
        int height = sr.getScaledHeight();
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
        int theW = mc.fontRenderer.getStringWidth("MTC Speed Transmitter");

        speedLimitField = new GuiTextField(fontRendererObj, width / 2 + 5, 46, 27, 15);
        nextSpeedLimitField = new GuiTextField(fontRendererObj, width / 2 + 5, 66, 27, 15);
        nextSpeedXField = new GuiTextField(fontRendererObj, width / 2 + 5, 86, 50, 15);
        nextSpeedYField = new GuiTextField(fontRendererObj, width / 2 + 5, 106, 50, 15);
        nextSpeedZField = new GuiTextField(fontRendererObj, width / 2 + 5, 126, 50, 15);
        profileTextField = new GuiTextField(fontRendererObj, width / 2 + 130, 148, 15, 15);
        directionUpField = new GuiTextField(fontRendererObj, width / 2 - 15, 195, 15, 15);
        directionDownField = new GuiTextField(fontRendererObj, width / 2 + 110, 195, 15, 15);


      //  onRedstoneProfileField = new GuiTextField(fontRendererObj, width / 2 + 20, 160, 50, 15);

        speedProfiles = baseTile.speedProfiles;

        speedLimitField.setText(String.valueOf(speedProfiles.get(0)[0]));
        nextSpeedLimitField.setText(String.valueOf(speedProfiles.get(0)[1]));
        nextSpeedXField.setText(String.valueOf(speedProfiles.get(0)[2]));
        nextSpeedYField.setText(String.valueOf(speedProfiles.get(0)[3]));
        nextSpeedZField.setText(String.valueOf(speedProfiles.get(0)[4]));

        directionUpField.setText(String.valueOf(baseTile.directionUpProfile));
        directionDownField.setText(String.valueOf(baseTile.directionDownProfile));

       // nextSpeedY = new GuiTextField(fontRendererObj, width / 2 - 12, 36, 27, 15);
       // nextSpeedZ = new GuiTextField(fontRendererObj, width / 2 - 12, 39, 27, 15);
        onRedstone = new GuiButton(2, width / 2 + 4, 146, 120/**/, 20,
                baseTile.onRedstone == 0 ? "Do nothing" : (baseTile.onRedstone == 1 ? "Activate/Deactivate" : "Change to profile: "));
        done = new GuiButton(1, width / 2 - 30, 220, 60, 20, "Done");
        profileChange = new GuiButton(3, width / 2 - 30, 20, 60, 20, "Profile 0");
        addFromItem = new GuiButton(4, width / 2 - 60, 180, 130, 20, "Fill from Position Marker");

        directionalToggle = new GuiButton(5, width / 2 + 4, 170, 120/**/, 20, baseTile.directional ? "Bi-Directional" : "Uni-Directional");
        inferDirection = new GuiButton(6, width / 2 + 120, 170, 80/**/, 20, "Infer Direction");

       buttonList.add(onRedstone);
       buttonList.add(done);
       buttonList.add(profileChange);
       buttonList.add(directionalToggle);
       buttonList.add(inferDirection);

       directional = baseTile.directional;

       if (Minecraft.getMinecraft().thePlayer.getHeldItem() != null && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() instanceof ItemPositionMarker) {
           NBTTagCompound tagCompound = Minecraft.getMinecraft().thePlayer.getHeldItem().getTagCompound();
           System.out.println(tagCompound==null);
            if (tagCompound != null) {
                autofillCompound = tagCompound;
                buttonList.add(addFromItem);
            }
       }
        profileTextField.setText(String.valueOf(baseTile.onRedstoneProfile));
        redstoneReaction = baseTile.onRedstone;
        redstoneProfile = baseTile.onRedstoneProfile;
        profileTextField.setMaxStringLength(1);

        directionUpField.setMaxStringLength(1);
        directionDownField.setMaxStringLength(1);
        /*timeoutTime = new GuiTextField(fontRendererObj, width / 2 - 8, 26, 27, 15);
        timeoutTime.setText(String.valueOf(timeoutAmount));
        increaseButton = new GuiButton(1, width / 2 + 25, 24, 20, 20, "+");
        decreaseButton = new GuiButton(2, width / 2 + 45, 24, 20, 20, "-");
        crossingStatusButton = new GuiButton(3, width / 2 - 20, 64, 60, 20, "Activate");
        buttonList.add(increaseButton);
        buttonList.add(decreaseButton);
        buttonList.add(crossingStatusButton);*/
    /*    buttonList.add(increaseButton);
        buttonList.add(decreaseButton);*/

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
        int width = sr.getScaledWidth();
        int height = sr.getScaledHeight();

        /*this.guiLeft = (sr.getScaledWidth() - this.xSize) / 2;

        int x = width / 2;
        int y = height / 2;

        this.guiTop = (sr.getScaledHeight() - this.ySize) / 2;*/
        drawDefaultBackground();
        int padding = 2;
        int margin = 4;
       // Gui.drawRect(width / 2 + 40, height / 2 + 40,width / 2 + 50, height / 2 + 80, 0xFFFFFFFF);

        int theW = mc.fontRenderer.getStringWidth("MTC Speed Transmitter");
        fontRendererObj.drawString("MTC Speed Transmitter", width / 2 - theW / 2, 6 , 0xFFFFFF);
        fontRendererObj.drawString("Speed Limit: ", width / 2 - theW / 2, 50 , 0xFFFFFF);
        fontRendererObj.drawString("Next Speed Limit: ", width / 2 - theW / 2 - 26, 69 , 0xFFFFFF);
        if (!nextSpeedLimitField.getText().equals("")) {
            if (!nextSpeedLimitField.getText().equals("0")) {
                fontRendererObj.drawString("X Coordinate:", width / 2 - theW / 2 - 10, 89, 0xFFFFFF);
                fontRendererObj.drawString("Y Coordinate:", width / 2 - theW / 2 - 10, 109, 0xFFFFFF);
                fontRendererObj.drawString("Z Coordinate:", width / 2 - theW / 2 - 10, 129, 0xFFFFFF);
                nextSpeedXField.drawTextBox();
                nextSpeedYField.drawTextBox();
                nextSpeedZField.drawTextBox();
            }
        }
        fontRendererObj.drawString("On redstone:", width / 2 - theW / 2 - 8, 152, 0xFFFFFF);
        fontRendererObj.drawString("Directional?", width / 2 - theW / 2 - 8, 175, 0xFFFFFF);

        if (redstoneReaction == 2) {
            profileTextField.drawTextBox();
        }

        if (directional) {
            directionUpField.drawTextBox();
            directionDownField.drawTextBox();
            if (baseTile.directionUp != -1) {
                fontRendererObj.drawString("Up " + ForgeDirection.getOrientation(baseTile.directionUp), width / 2 - theW / 2 - 8, 200, 0xFFFFFF);
                fontRendererObj.drawString("Down " + ForgeDirection.getOrientation(baseTile.directionDown), width / 2 - theW / 2 + 80, 200, 0xFFFFFF);
            } else {
                fontRendererObj.drawString("Up ????", width / 2 - theW / 2 - 8, 200, 0xFFFFFF);
                fontRendererObj.drawString("Down ???? ", width / 2 - theW / 2 + 80, 200, 0xFFFFFF);
            }

        }


       /* if (baseTile.isActivated) {
            crossingStatusButton.displayString = "Deactivate";
        } else {
            crossingStatusButton.displayString = "Activate";
        }*/
       // timeoutTime.drawTextBox();
        //timeoutTime.setText(String.valueOf(timeoutAmount));
        speedLimitField.drawTextBox();
        nextSpeedLimitField.drawTextBox();
        //nextSpeedX.drawTextBox();
       // nextSpeedY.drawTextBox();
        //nextSpeedZ.drawTextBox();

        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected void actionPerformed(GuiButton button) {
        if (button.id == 1) {
            //Do button 1 stuff here.
            int profil = 0;
            for (int[] array : speedProfiles) {
                Traincraft.mtcBlockChannel.sendToServer(new PacketUpdateSpeedTransmitter(baseTile.xCoord, baseTile.yCoord, baseTile.zCoord,
                        array[0], array[1], Vec3.createVectorHelper(array[2], array[3], array[4]), profil, redstoneReaction, redstoneProfile, directional, upProfile, downProfile));
                profil++;
            }

            mc.thePlayer.closeScreen();
        }

        if (button.id == 2) {
            //Switch mode.
            if (redstoneReaction == 0) {
                //Change it to activate/deactivate.
                redstoneReaction = 1;
                onRedstone.displayString = "Activate/Deactivate";
            } else if (redstoneReaction == 1) {
                //Change it to change to a profile.
                redstoneReaction = 2;
                onRedstone.displayString = "Change to profile:";
            } else if (redstoneReaction == 2) {
                //Change it to do nothing.
                redstoneReaction = 0;
                onRedstone.displayString = "Do nothing";
            }
        }
        if (button.id == 3) {
            //Switch profile.
            if (profile == 3) {
                profile = 0;
            } else {
                profile++;
            }

            profileChange.displayString = "Profile " + profile;
            speedLimitField.setText(String.valueOf(speedProfiles.get(profile)[0]));
            nextSpeedLimitField.setText(String.valueOf(speedProfiles.get(profile)[1]));
            nextSpeedXField.setText(String.valueOf(speedProfiles.get(profile)[2]));
            nextSpeedYField.setText(String.valueOf(speedProfiles.get(profile)[3]));
            nextSpeedZField.setText(String.valueOf(speedProfiles.get(profile)[4]));
        }
        if (button.id == 4) {
            if (autofillCompound != null) {
                speedProfiles.get(profile)[2] = autofillCompound.getInteger("coordinateX");
                speedProfiles.get(profile)[3] = autofillCompound.getInteger("coordinateY");
                speedProfiles.get(profile)[4] = autofillCompound.getInteger("coordinateZ");
                nextSpeedXField.setText(String.valueOf(speedProfiles.get(profile)[2]));
                nextSpeedYField.setText(String.valueOf(speedProfiles.get(profile)[3]));
                nextSpeedZField.setText(String.valueOf(speedProfiles.get(profile)[4]));
            }

        }

        if (button.id == 5) {
            directional = !directional;
            directionalToggle.displayString = directional ? "Bi-Directional" : "Uni-Directional";
        }

        if (button.id == 6) {
            baseTile.inferDirection();

        }
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        if (speedLimitField.isFocused()) speedLimitField.updateCursorCounter();
        if (nextSpeedLimitField.isFocused()) nextSpeedLimitField.updateCursorCounter();
        if (nextSpeedXField.isFocused()) nextSpeedXField.updateCursorCounter();
        if (nextSpeedYField.isFocused()) nextSpeedYField.updateCursorCounter();
        if (nextSpeedZField.isFocused()) nextSpeedZField.updateCursorCounter();
        if (profileTextField.isFocused()) profileTextField.updateCursorCounter();
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    @Override
    protected void keyTyped(char par1, int par2) {
        if (par2 == Keyboard.KEY_ESCAPE) {
          //  PeachysRailtech.updateVariableChannel.sendToServer(new UpdateBaseTimeoutPacket(baseTile.xCoord, baseTile.yCoord, baseTile.zCoord, timeoutAmount));
            mc.thePlayer.closeScreen();
        }

        if (speedLimitField.isFocused() && (Character.isDigit(par1) || par2 == Keyboard.KEY_BACK)) speedLimitField.textboxKeyTyped(par1, par2);
        if (nextSpeedLimitField.isFocused() && (Character.isDigit(par1) || par2 == Keyboard.KEY_BACK)) nextSpeedLimitField.textboxKeyTyped(par1, par2);
        if (nextSpeedXField.isFocused() && (Character.isDigit(par1) || par2 == Keyboard.KEY_BACK)) nextSpeedXField.textboxKeyTyped(par1, par2);
        if (nextSpeedYField.isFocused() && (Character.isDigit(par1) || par2 == Keyboard.KEY_BACK)) nextSpeedYField.textboxKeyTyped(par1, par2);
        if (nextSpeedZField.isFocused() && (Character.isDigit(par1) || par2 == Keyboard.KEY_BACK)) nextSpeedZField.textboxKeyTyped(par1, par2);
        if (profileTextField.isFocused() && (Character.isDigit(par1) || par2 == Keyboard.KEY_BACK) && Character.getNumericValue(par1) < 4) profileTextField.textboxKeyTyped(par1, par2);
        if (directionUpField.isFocused() && (Character.isDigit(par1) || par2 == Keyboard.KEY_BACK) && Character.getNumericValue(par1) < 2) directionUpField.textboxKeyTyped(par1, par2);
        if (directionDownField.isFocused() && (Character.isDigit(par1) || par2 == Keyboard.KEY_BACK) && Character.getNumericValue(par1) < 2) directionDownField.textboxKeyTyped(par1, par2);

         speedProfiles.get(profile)[0] = isInteger(speedLimitField.getText()) ? Integer.parseInt(speedLimitField.getText()) : 0;
         speedProfiles.get(profile)[1] = isInteger(nextSpeedLimitField.getText()) ? Integer.parseInt(nextSpeedLimitField.getText()) : 0;
         speedProfiles.get(profile)[2] = isInteger(nextSpeedXField.getText()) ? Integer.parseInt(nextSpeedXField.getText()) : 0;
         speedProfiles.get(profile)[3] = isInteger(nextSpeedYField.getText()) ? Integer.parseInt(nextSpeedYField.getText()) : 0;
         speedProfiles.get(profile)[4] = isInteger(nextSpeedZField.getText()) ? Integer.parseInt(nextSpeedZField.getText()) : 0;
         redstoneProfile = isInteger(profileTextField.getText()) ? Integer.parseInt(profileTextField.getText()) : 0;
         upProfile = isInteger(directionUpField.getText()) ? Integer.parseInt(directionUpField.getText()) : 0;
         downProfile = isInteger(directionDownField.getText()) ? Integer.parseInt(directionDownField.getText()) : 0;
         System.out.println("w");
    }

    @Override
    protected void mouseClicked(int par1, int par2, int par3) {
       // timeoutTime.mouseClicked(par1, par2, par3);
        super.mouseClicked(par1, par2, par3);
        speedLimitField.mouseClicked(par1, par2, par3);
        nextSpeedLimitField.mouseClicked(par1, par2, par3);
        nextSpeedXField.mouseClicked(par1, par2, par3);
        nextSpeedYField.mouseClicked(par1, par2, par3);
        nextSpeedZField.mouseClicked(par1, par2, par3);
        profileTextField.mouseClicked(par1, par2, par3);
        directionDownField.mouseClicked(par1, par2, par3);
        directionUpField.mouseClicked(par1, par2, par3);
    }
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}


