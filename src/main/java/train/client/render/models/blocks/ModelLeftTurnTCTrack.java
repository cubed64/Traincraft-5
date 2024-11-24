package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.renderhelper.ModelRenderHelper;
import train.common.items.RailVariants;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelLeftTurnTCTrack extends ModelBase {
	private IModelCustom modelMediumLeftTurn;
	private IModelCustom modelLargeLeftTurn;
	private IModelCustom modelVeryLargeLeftTurn;
	private IModelCustom modelSuperLargeLeftTurn;

	public ModelLeftTurnTCTrack() {
		modelMediumLeftTurn = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_medium.obj"));
		modelLargeLeftTurn = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_big.obj"));
		modelVeryLargeLeftTurn = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_very_big.obj"));
		modelSuperLargeLeftTurn = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_super_big_left.obj"));
	}

	public void renderMedium() {
		modelMediumLeftTurn.renderAll();
	}
	public void renderLarge() {
		modelLargeLeftTurn.renderAll();
	}
	public void renderVeryLarge() {
		modelVeryLargeLeftTurn.renderAll();
	}
	public void renderSuperLarge() { modelSuperLargeLeftTurn.renderAll();}

	private void setRotation(byte facing)
	{
		switch(facing)
		{
			case 0:
				GL11.glRotatef(180, 0, 1, 0);
				break;
			case 1:
				GL11.glRotatef(90, 0, 1, 0);
				break;
			case 2:
				GL11.glRotatef(0, 0, 1, 0);
				break;
			case 3:
				GL11.glRotatef(-90, 0, 1, 0);
				break;
			default:

				break;
		}
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z) {
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
		render( type, tcRail.getTrackType().getVariant(), facing, x, y, z, 1, 1, 1, 1);
	}

	public void render(String type, RailVariants variants, int facing, double x, double y, double z, float r, float g, float b, float a) {
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 1.5f, (float) y, (float) z + 5.5f);

		// Bind the texture, so that OpenGL properly textures our block.
		switch (variants)
		{
			case EMBEDDED:
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_embedded.png"));
				break;
			default:
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
				break;
		}

		GL11.glColor4f(r, g, b, a);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);


		setRotation((byte)facing);

		switch (type)
		{
			case "super_large":
			case "embedded_super_large":
				switch (facing)
				{
					case 3:
						GL11.glTranslatef(-5.5f,0f,1.5f);
					break;
					case 1:
						GL11.glTranslatef(4.5f,0f,-0.5f);
					break;
					case 2:
						GL11.glTranslatef(-1.5f,0f,-4.5f);
					break;
					default:
						GL11.glTranslatef(0.5f,0f,5.5f);
					break;
				}
				this.renderSuperLarge();
			break;
			case "very_large":
			case "embedded_very_large":
				switch (facing)
				{
					case 3:
						GL11.glTranslatef(-5.5f, 0.0f, 1.54f);
						break;
					case 1:
						GL11.glTranslatef(4.5f, 0.0f, -0.455f);
						break;
					case 2:
						GL11.glTranslatef(-1.5f, 0.0f, -4.469f);
						break;
					default:
						GL11.glTranslatef(0.5f, 0.0f, 5.54f);
						break;
				}
				this.renderVeryLarge();
			break;
			case "large":
			case "embedded_large":
				switch (facing)
				{
					case 3:
						GL11.glTranslatef(-10.0f, 0.0f, 2.0f);
						break;
					case 1:
						GL11.glTranslatef(0.0f, 0.0f, 0.0f);
						break;
					case 2:
						GL11.glTranslatef(-6.0f, 0.0f, -4.0f);
						break;
					default:
						GL11.glTranslatef(-4.0f, 0.0f, 6.0f);
						break;
				}
				this.renderLarge();
			break;
			case "medium":
			case "embedded_medium":
				switch (facing)
				{
					case 3:
						GL11.glTranslatef(-8.0f, 0.0f, 2.0f);
						break;
					case 1:
						GL11.glTranslatef(2.0f, 0.0f, 0.0f);
						break;
					case 2:
						GL11.glTranslatef(-4.0f, 0.0f, -4.0f);
						break;
					default:
						GL11.glTranslatef(-2.0f, 0.0f, 6.0f);
						break;
				}
				this.renderMedium();
			break;
		}

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}

}
