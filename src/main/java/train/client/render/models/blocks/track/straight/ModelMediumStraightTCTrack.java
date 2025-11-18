package train.client.render.models.blocks.track.straight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.track.AbstractTrackModel;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelMediumStraightTCTrack extends AbstractTrackModel {
	private IModelCustom modelMediumStraight;
	private static int listMediumStraight = -1;
	private static boolean baked = false;

	public ModelMediumStraightTCTrack()
	{
		if (!baked)
		{
			modelMediumStraight = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/straight/1x1.obj"));

			// Bake into OpenGL display list
			listMediumStraight = GL11.glGenLists(1);
			GL11.glNewList(listMediumStraight, GL11.GL_COMPILE);
			modelMediumStraight.renderAll();
			GL11.glEndList();

			baked = true;
		}
	}


	private void render() {
		GL11.glCallList(listMediumStraight);
	}

	public void render(TileTCRail tcRail, double x, double y, double z)
	{
		// Bind the texture, so that OpenGL properly textures our block.
		tmt.Tessellator.bindTexture(train.common.enums.TrackResourceLocations.GetResourceLocation(tcRail.getTrackType().getVariant()));

		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

		GL11.glColor4f(1, 1, 1, 1);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);
		int facing = getRailDirection(tcRail);

		switch (facing)
		{
			case 3:
				GL11.glRotatef(-90, 0, 1, 0);
			break;
			case 1:
				GL11.glRotatef(90, 0, 1, 0);
			break;
			case 0:
				GL11.glRotatef(180, 0, 1, 0);
			break;
		}

		for (int i = 0; i < 3; i++)
		{
			render();
			GL11.glTranslatef(0.0f, 0.0f, -1.0f);
		}

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}
}