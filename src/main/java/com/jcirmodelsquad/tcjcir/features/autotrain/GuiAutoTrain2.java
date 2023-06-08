package com.jcirmodelsquad.tcjcir.features.autotrain;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import train.common.api.Locomotive;
import train.common.library.Info;

public class GuiAutoTrain2 extends GuiScreen {
    public int xSize = 305;
    public int ySize = 274;
    public int guiLeft;
    public int guiTop;

    private static final float guiScaler = 0.00390625F;

    private Locomotive loco;

    public GuiAutoTrain2(Locomotive loco) {
        this.loco = loco;
    }


    @Override
    public void initGui() {
        this.guiLeft = (this.width - 176) / 2;
        this.guiTop = (this.height - 166) / 2;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float par3){
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
        int width = sr.getScaledWidth();
        int height = sr.getScaledHeight();

        drawDefaultBackground();
        drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "autotrain_logo.png"), 0, 0, 0, 0, 9425, 2805, 9425, 2805, 0.02);
        super.drawScreen(mouseX, mouseY, par3);
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



}
