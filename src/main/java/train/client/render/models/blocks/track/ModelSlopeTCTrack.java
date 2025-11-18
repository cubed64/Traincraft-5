package train.client.render.models.blocks.track;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.enums.TrackResourceLocations;
import train.common.items.BallastTypes;
import train.common.items.RailVariants;
import train.common.library.Info;
import train.common.tile.TileTCRail;


@SideOnly(Side.CLIENT)
public class ModelSlopeTCTrack extends AbstractTrackModel
{
    protected IModelCustom modelTrack;
    private int listTrack = -1;
    protected IModelCustom modelSlopeWood;
    private int listSlopeWood = -1;
    protected IModelCustom modelSlopeBallast;
    private int listSlopeBallast = -1;
    protected String[] ballastTexture = new String[2];

    public ModelSlopeTCTrack(String trackOBJ, String slopeBallastOBJ)
    {
        if (!baked) {
            modelTrack = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + trackOBJ));
            listTrack = GL11.glGenLists(1);
            GL11.glNewList(listTrack, GL11.GL_COMPILE);
            modelTrack.renderAll();
            GL11.glEndList();

            modelSlopeBallast = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + slopeBallastOBJ));
            listSlopeBallast = GL11.glGenLists(1);
            GL11.glNewList(listSlopeBallast, GL11.GL_COMPILE);
            modelSlopeBallast.renderAll();
            GL11.glEndList();

            baked = true;
        }
    }

    public ModelSlopeTCTrack(String trackOBJ, String slopeWoodSupportOBJ, String slopeBallastOBJ)
    {
        if (!baked) {
            modelTrack = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + trackOBJ));
            listTrack = GL11.glGenLists(1);
            GL11.glNewList(listTrack, GL11.GL_COMPILE);
            modelTrack.renderAll();
            GL11.glEndList();

            modelSlopeWood = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + slopeWoodSupportOBJ));
            listSlopeWood = GL11.glGenLists(1);
            GL11.glNewList(listSlopeWood, GL11.GL_COMPILE);
            modelSlopeWood.renderAll();
            GL11.glEndList();

            modelSlopeBallast = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + slopeBallastOBJ));
            listSlopeBallast = GL11.glGenLists(1);
            GL11.glNewList(listSlopeBallast, GL11.GL_COMPILE);
            modelSlopeBallast.renderAll();
            GL11.glEndList();

            baked = true;
        }
    }

    protected void SetupDynamicBallastColour(int ballastColour)
    {
        float r = (float)(ballastColour >> 16 & 255) / 255.0F;
        float g = (float)(ballastColour >> 8 & 255) / 255.0F;
        float b = (float)(ballastColour & 255) / 255.0F;
        GL11.glColor4f(r,g,b,1);
    }

    protected void SetupDynamicBallast(String ballast)
    {
        if (ballast.contains(":")) {
            ballastTexture = ballast.split(":");
            ballastTexture[0] = ballastTexture[0].toLowerCase();
        }
        else {
            ballastTexture[0] = "minecraft";
            ballastTexture[1] = ballast;
        }
    }

    public void renderDynamic(RailVariants variants, String ballastTextureInput, int ballastColour)
    {
        tmt.Tessellator.bindTexture(TrackResourceLocations.GetResourceLocation(variants));
        GL11.glCallList(listTrack);
        SetupDynamicBallast(ballastTextureInput);
        tmt.Tessellator.bindTexture(new ResourceLocation(ballastTexture[0],  "textures/blocks/" + ballastTexture[1] +".png"));
        SetupDynamicBallastColour(ballastColour);
        GL11.glCallList(listSlopeBallast);
    }

    public void render(RailVariants variants, BallastTypes ballast)
    {
        tmt.Tessellator.bindTexture(TrackResourceLocations.GetResourceLocation(variants));
        GL11.glCallList(listTrack);

        tmt.Tessellator.bindTexture(TrackResourceLocations.GetBallasetResourceLocation(ballast));
        if (BallastTypes.WOODSUPPORT.equals(ballast))
        {
            GL11.glCallList(listSlopeWood);
        }
        else
        {
            GL11.glCallList(listSlopeBallast);
        }
    }

    public void renderDynamic(TileTCRail tcRail, double x, double y, double z)
    {
        String iconName;
        Block block = Block.getBlockById(tcRail.getBallastMaterial());
        IIcon icon = block.getIcon(1, tcRail.ballastMetadata);
        int colour = block.colorMultiplier(tcRail.getWorldObj(), tcRail.xCoord, tcRail.yCoord - 1, tcRail.zCoord);
        if (icon != null) {
            iconName = icon.getIconName();
        }
        else {
            iconName = "tc:ballast_test";
            colour = 16777215;
        }
        renderDynamic( tcRail.getTrackType().getVariant(), getRailDirection(tcRail), x, y, z, 1, 1, 1, 1, iconName, colour);
    }

    public void render(TileTCRail tcRail, double x, double y, double z)
    {
        render(tcRail.getTrackType().getVariant(), tcRail.getTrackType().getBallastType(), getRailDirection(tcRail), x, y, z, 1, 1, 1, 1);
    }

    private void setupRender(int facing, double x, double y, double z, float r, float g, float b, float a)
    {
        // Push a blank matrix onto the stack
        GL11.glPushMatrix();

        // Move the object into the correct position on the block (because the OBJ's origin is the
        // center of the object)
        GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

        GL11.glColor4f(r, g, b, a);
        // GL11.glScalef(0.5f, 0.5f, 0.5f);

        switch (facing) {
            case 0:
                GL11.glRotatef(180,0,1,0);
                break;
            case 7:
                GL11.glTranslatef(-0.5f, 0, -0.5f);
                GL11.glRotatef(180,0,1,0);
                break;
            case 1:
                GL11.glRotatef(90,0,1,0);
                break;
            case 4:
                GL11.glTranslatef(0.5f, 0, -0.5f);
                GL11.glRotatef(90,0,1,0);
                break;
            case 3:
                GL11.glRotatef(-90, 0 , 1, 0);
                break;
            case 6:
                GL11.glTranslatef(-0.5f, 0, 0.5f);
                GL11.glRotatef(-90, 0 , 1, 0);
                break;
            case 5:
                GL11.glTranslatef(0.5f,0,0.5f);
                break;
        }

    }

    public void renderDynamic(RailVariants variants, int facing, double x, double y, double z, float r, float g, float b, float a, String ballastTexture, int colour)
    {
        setupRender(facing, x, y, z, r, g, b, a);

        // GL11.glTranslatef(0.0f, 0.0f, -1.0f);
        renderDynamic(variants, ballastTexture, colour);

        // Pop this matrix from the stack.
        GL11.glPopMatrix();
    }

    public void render(RailVariants variants, BallastTypes ballastType, int facing, double x, double y, double z, float r, float g, float b, float a)
    {
        setupRender(facing, x, y, z, r, g, b, a);

        // GL11.glTranslatef(0.0f, 0.0f, -1.0f);
        render(variants, ballastType);

        // Pop this matrix from the stack.
        GL11.glPopMatrix();
    }
}
