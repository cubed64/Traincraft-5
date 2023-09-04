package com.jcirmodelsquad.tcjcir.features.autotrain;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import com.jcirmodelsquad.tcjcir.features.aipkitinterface.AipkitInterfaceGUIState;
import train.common.api.Locomotive;

import static com.jcirmodelsquad.tcjcir.features.aipkitinterface.AipkitInterfaceGUIState.*;

public class GUIAipkitInterface extends GuiScreen {
    public int xSize = 305;
    public int ySize = 274;
    public int guiLeft;
    public int guiTop;

    private Locomotive loco;

    public GUIAipkitInterface(Locomotive loco) {
        this.loco = loco;
    }


    @Override
    public void initGui() {
        if (!AipkitInterfaceGUIState.isInit) {
            AipkitInterfaceGUIState.init(loco);
        }
        AipkitInterfaceGUIState.loco = loco;

        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float par3){
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(),
                Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
        int width = sr.getScaledWidth();
        int height = sr.getScaledHeight();

        int initialPos = (int) (height / 2.6);
        int fontSize = sr.getScaleFactor();


        drawDefaultBackground();
        //drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "autotrain_logo.png"), 0, 0, 0, 0, 9425, 2805, 9425, 2805, 0.02);

        //Computer Frame
        drawRect((int) (width * 0.1), (int) (height * 0.1), (int) (width / 1.1), (int) (height / 1.1), 0xFF00AAAA);
        drawRect((int) (width * 0.11), (int) (height * 0.12), (int) (width / 1.11), (int) (height / 1.12), 0xFF101010);

        //Title
        GL11.glPushMatrix();
        GL11.glScalef(fontSize, fontSize, fontSize);
            drawRect((int) (width * 0.056), (int) (height * 0.025) * fontSize, (int) (width / 2.22), (int) (height * 0.05) * fontSize, 0x7000AAAA);


        fontRendererObj.drawString(category,( width / 2 -  mc.fontRenderer.getStringWidth(category)) / fontSize,
                (int) (height * 0.065)
                , 0xFFFFFF00);
        GL11.glPopMatrix();


        if (!infoString.isEmpty()) {
            GL11.glPushMatrix();
            GL11.glScalef(fontSize, fontSize, fontSize);

            initialPos = (int) (height / 1.9);

            String[] text = infoString.split("\n");


            for (String str : text) {
                fontRendererObj.drawString(str, (width / 2 - mc.fontRenderer.getStringWidth(str)) / fontSize,
                        height / 8, 0xFFFFFF);
                GL11.glTranslatef(0, 10, 0);
            }
            GL11.glPopMatrix();

        }


        for (int i = 0; i < options.length; i++) {
            GL11.glPushMatrix();
            GL11.glScalef(fontSize, fontSize, fontSize);

            if (position == i) {
                drawRect((int) (width * 0.056), initialPos / fontSize - 2, (int) (width / 2.22), initialPos / fontSize + 10, 0xFF555555);
            }
            String text = options[i];

            fontRendererObj.drawString(text,( width / 2 -  mc.fontRenderer.getStringWidth(text)) / fontSize,
                    (int) (initialPos / fontSize), 0xFFFFFF);
            initialPos = (int) (initialPos + ((height / 2) * 0.1) * fontSize);
            GL11.glPopMatrix();
        }
        super.drawScreen(mouseX, mouseY, par3);
    }

    @Override
    public void keyTyped(char par1, int par2) {
        if (par2 == Keyboard.KEY_ESCAPE) {
            //  PeachysRailtech.updateVariableChannel.sendToServer(new UpdateBaseTimeoutPacket(baseTile.xCoord, baseTile.yCoord, baseTile.zCoord, timeoutAmount));
            mc.thePlayer.closeScreen();
        }
        if (par2 == Keyboard.KEY_DOWN) {
            position++;
            if (position > options.length - 1) {
                position = 0;
            }

        } else if (par2 == Keyboard.KEY_UP) {
            position--;
            if (position < 0) {
                position = options.length - 1;
            }
        } else if (par2 == Keyboard.KEY_RETURN) {
            AipkitInterfaceGUIState.menuSelection();
        } else if (par2 == Keyboard.KEY_EQUALS) {
            AipkitInterfaceGUIState.init(loco);
        }

        System.out.println(options[position]);
    }



    public static void drawTexturedRect(ResourceLocation texture, double x, double y, int u, int v, int width, int height, int imageWidth, int imageHeight, double scale) {
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        double minU = (double)u / (double)imageWidth;
        double maxU = (double)(u + width) / (double)imageWidth;
        double minV = (double)v / (double)imageHeight;
        double maxV = (double)(v + height) / (double)imageHeight;
        net.minecraft.client.renderer.Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x + scale*(double)width, y + scale*(double)height, 0, maxU, maxV);
        tessellator.addVertexWithUV(x + scale*(double)width, y, 0, maxU, minV);
        tessellator.addVertexWithUV(x, y, 0, minU, minV);
        tessellator.addVertexWithUV(x, y + scale*(double)height, 0, minU, maxV);
        tessellator.draw();
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

}
