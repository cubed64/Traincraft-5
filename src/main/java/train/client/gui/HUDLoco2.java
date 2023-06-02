package train.client.gui;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;
import train.common.api.Locomotive;
import train.common.library.Info;

public class HUDLoco2 extends GuiScreen {

    private Minecraft game;
    private int windowWidth, windowHeight;
    private boolean inLoco = false;
    public static int guiTop;
    public static int guiLeft;


    @SubscribeEvent
    public void onGameRender(RenderGameOverlayEvent.Text event){

    if (game != null && game.thePlayer != null && game.thePlayer.ridingEntity != null && game.thePlayer.ridingEntity instanceof Locomotive && Minecraft.isGuiEnabled()) {
            inLoco = true;
            renderSkillHUD(event, (Locomotive) game.thePlayer.ridingEntity);
        } else {
        inLoco = false;
        this.game = this.mc = Minecraft.getMinecraft();
            this.fontRendererObj = this.game.fontRenderer;
        }
    }

    @SubscribeEvent(priority= EventPriority.NORMAL)
    public void onRenderPre(RenderGameOverlayEvent.Pre event) {
//8052d0
        //windowWidth = event.resolution.getScaledWidth_double();
        windowHeight = event.resolution.getScaledHeight();

        if (event.type == RenderGameOverlayEvent.ElementType.HOTBAR && inLoco) {
           // event.setCanceled(true);
            GL11.glPushMatrix();
            //GL11.glTranslated((event.resolution.getScaledWidth_double() / 2 ) - 140, -1, 0.0);

        } else {
            //GL11.glTranslated(-0.6, 0.0, 0.0);
        }

    }

    @SubscribeEvent(priority= EventPriority.NORMAL)
    public void onRenderPost(RenderGameOverlayEvent.Post event) {

        if (event.type == RenderGameOverlayEvent.ElementType.HOTBAR && inLoco) {
            GL11.glPopMatrix();
            // GL11.glTranslated(-0.6, 0.0, 0.0);
        }
    }

    public void renderSkillHUD(RenderGameOverlayEvent event, Locomotive rcCar) {
        guiLeft=new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
        guiTop=new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();
        rcCar.distanceFromSpeedChange = rcCar.getDistance(rcCar.speedChange3.xCoord, rcCar.speedChange3.yCoord,rcCar.speedChange3.zCoord);

        int x = event.resolution.getScaledWidth() / 2;
        int y = event.resolution.getScaledHeight() / 2;
        windowHeight = event.resolution.getScaledHeight();
        int padding = 2;
        int margin = 4;
        int xPos = 0 + margin;
        int yPos = 0 + margin;
        // x1, y1, x2, y2, color
        this.width = 300;
        this.height = 256;

        double speedScaled = Math.abs((rcCar.getSpeed() * (int)(guiLeft*0.275f)) / rcCar.getMaxSpeed());

        this.drawGradientRect((int)(guiLeft*0.009f),(int)(guiTop*0.75f),(int)(guiLeft*0.3f),(int)(guiTop*0.95f)
                /*event.resolution.getScaledWidth() / 2 - 50) + 50,(event.resolution.getScaledHeight() / 2 - 50) + 50, (event.resolution.getScaledWidth() / 2 - 50) + 80, (event.resolution.getScaledHeight() / 2 - 50) + 40*/, 0xA1999999, 0xa1F3F3F3);
        Gui.drawRect((int)(guiLeft*0.020f),(int)(guiTop*0.79f),(int)(guiLeft*0.288f),(int)(guiTop*0.82f), 0xFF555555);
        Gui.drawRect((int)(guiLeft*0.020f),(int)(guiTop*0.79f), (int) ((int)(guiLeft*0.020f) + speedScaled),(int)(guiTop*0.82f), 0xFFFFFFFF);
        drawRect((int)(guiLeft*0.20f),(int)(guiTop*0.83f),(int)(guiLeft*0.287f),(int)(guiTop*0.88f), 0xAA000000);

        int width = this.game.fontRenderer.getStringWidth(String.valueOf(Math.round(rcCar.getSpeed())));

       /*GL11.glPushMatrix(); //Start new matrix
        GL11.glScalef(1.2f,1.2f,1.2f);
        GL11.glTranslated((width * -5), (width * -5), (width * 3))*/;//scale it to 0.5 size on each side. Must be float e.g.: 2.0F*/
        int numDigits = String.valueOf(Math.round(rcCar.getSpeed())).length();
        int speedPositions = 0;
        if (numDigits == 1) {
            speedPositions = (int)(guiLeft*0.219f);

        } else if (numDigits == 2) {
            speedPositions = (int)(guiLeft*0.213f);
        } else {
            speedPositions = (int)(guiLeft*0.208f);
        }
        fontRendererObj.drawStringWithShadow(Math.round(rcCar.getSpeed()) + "km/h",speedPositions,(int)(guiTop*0.845f), 0xFFFFFF); //fr - fontRenderer
        /*GL11.glPopMatrix();*/

        fontRendererObj.drawStringWithShadow(EnumChatFormatting.YELLOW  + rcCar.getTrainName(),(int)(guiLeft*0.020f),(int)(guiTop*0.76f), 0xFFFFFF);
        GL11.glPushMatrix();

        GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        Tessellator tes = Tessellator.instance;
        tes.startDrawing(GL11.GL_TRIANGLES);
        tes.addVertex((int)(guiLeft*0.020f), guiTop*0.79f, 0);
        tes.addVertex((int)(guiLeft*0.030f), guiTop*0.69f, 0);
        tes.addVertex((int)(guiLeft*0.040f), guiTop*0.79f, 0);
        tes.draw();
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_BLEND);
        //GL11.glTranslated((int)(guiLeft*0.020f),(int)(guiTop*0.79f), 0);
        GL11.glPopMatrix();
    }

    public static int percentTop(int value){return (int)(guiTop*(value*0.01f));}
    public static int percentLeft(int value){return (int)(guiLeft*(value*0.01f));}

    public static void drawTexturedRect(ResourceLocation texture, double x, double y, int u, int v, int width, int height, int imageWidth, int imageHeight, double scale) {
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        double minU = (double)u / (double)imageWidth;
        double maxU = (double)(u + width) / (double)imageWidth;
        double minV = (double)v / (double)imageHeight;
        double maxV = (double)(v + height) / (double)imageHeight;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x + scale*(double)width, y + scale*(double)height, 0, maxU, maxV);
        tessellator.addVertexWithUV(x + scale*(double)width, y, 0, maxU, minV);
        tessellator.addVertexWithUV(x, y, 0, minU, minV);
        tessellator.addVertexWithUV(x, y + scale*(double)height, 0, minU, maxV);
        tessellator.draw();
    }
}
