/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;
import train.common.tile.TileBridgePillar;

public class ModelBridgePillar extends ModelBase {
	private IModelCustom bridgePillar;
	private static boolean baked = false;
	protected static int list = -1;
	public ModelBridgePillar()
	{
		if (!baked)
		{
			bridgePillar = new net.minecraftforge.client.model.AdvancedModelLoader().loadModel(new ResourceLocation(Info.modelPrefix + "bridge_block.obj"));
			list = GL11.glGenLists(1);
			GL11.glNewList(list, GL11.GL_COMPILE);
			bridgePillar.renderAll();
			GL11.glEndList();
		}

	}
	
	public void render()
	{
		GL11.glCallList(list);
	}
	
	public void render(TileBridgePillar pillar, double x, double y, double z) {
		GL11.glPushMatrix();

		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_slope.png"));
		GL11.glColor4f(1, 1, 1, 1);
		int facing = pillar.getWorldObj().getBlockMetadata((int) pillar.xCoord, (int) pillar.yCoord, (int) pillar.zCoord);
		switch (facing)
		{
			case 2:
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glRotatef(90, 0, 1, 0);
				break;
		}
		render();
		GL11.glPopMatrix();
	}
}
