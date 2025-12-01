/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render.models.blocks;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.render.RenderTCRail;
import train.common.items.RailVariants;
import train.common.library.EnumTracks;
import train.common.library.Info;

public class ModelAmericanStopper
{
    private IModelCustom track;

    public ModelAmericanStopper(float scale)
    {
        track =  net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "american_bumper.obj"));
    }

    public void render(float f5, int facing)
    {
        switch (facing) {
            case 0:
                RenderTCRail.modelSmallStraight.render(EnumTracks.SMALL_STRAIGHT, "", facing, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(-180,0,1,0);
                renderBlock();
                break;
            case 7:
                RenderTCRail.modelSmallDiagonalStraight.render("", RailVariants.NORMAL, facing, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(-135, 0 , 1, 0);
                renderBlock();
                break;
            case 1:
                RenderTCRail.modelSmallStraight.render(EnumTracks.SMALL_STRAIGHT, "", facing, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(90, 0 , 1, 0);
                renderBlock();
                break;
            case 4:
                RenderTCRail.modelSmallDiagonalStraight.render("", RailVariants.NORMAL, facing, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(135, 0 , 1, 0);
                renderBlock();
                break;
            case 2:
                RenderTCRail.modelSmallStraight.render(EnumTracks.SMALL_STRAIGHT, "", facing, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                renderBlock();
                break;
            case 3:
                RenderTCRail.modelSmallStraight.render(EnumTracks.SMALL_STRAIGHT, "", facing, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(-90, 0 , 1, 0);
                renderBlock();
                break;
            case 6:
                RenderTCRail.modelSmallDiagonalStraight.render("", RailVariants.NORMAL, facing, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(-45F, 0 , 1, 0);
                renderBlock();
                break;
            case 5:
                RenderTCRail.modelSmallDiagonalStraight.render("", RailVariants.NORMAL, facing, -0.5, 0, -0.5, 1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
                renderBlock();
                break;
        }
    }

    private void renderBlock()
    {
        GL11.glTranslatef(0, 0, 0f);
        tmt.Tessellator
                .bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "american_stopper.png"));
        GL11.glColor4f(1, 1, 1, 1);
        track.renderAll();
        GL11.glPopMatrix();
    }

    public void renderInHand(float f5) {
        RenderTCRail.modelSmallStraight.render(EnumTracks.SMALL_STRAIGHT, "", 1, -0.5, 0, -0.5, 1, 1, 1, 1);
        GL11.glRotatef(90, 0, 1, 0);
        tmt.Tessellator
                .bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "american_stopper.png"));
        GL11.glColor4f(1, 1, 1, 1);
        track.renderAll();
    }
}
