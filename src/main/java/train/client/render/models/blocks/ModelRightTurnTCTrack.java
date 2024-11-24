package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.items.RailVariants;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelRightTurnTCTrack extends ModelBase {
	private IModelCustom modelMediumRightTurn;
	private IModelCustom modelLargeRightTurn;
	private IModelCustom modelVeryLargeRightTurn;
	private IModelCustom modelSuperLargeRightTurn;

	public ModelRightTurnTCTrack() {
		modelMediumRightTurn = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_medium.obj"));
		modelLargeRightTurn = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_big.obj"));
		modelVeryLargeRightTurn = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_very_big.obj"));
		modelSuperLargeRightTurn = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_super_big_right.obj"));
	}

	public void renderMedium() {
		modelMediumRightTurn.renderAll();
	}

	public void renderLarge() {
		modelLargeRightTurn.renderAll();
	}
	public void renderVeryLarge() {
		modelVeryLargeRightTurn.renderAll();
	}
	public void renderSuperLarge() {modelSuperLargeRightTurn.renderAll();}

	private void setRotation(byte facing)
	{
		switch(facing)
		{
			case 0:
				GL11.glRotatef(-90, 0, 1, 0);
				break;
			case 1:
				GL11.glRotatef(180, 0, 1, 0);
				break;
			case 2:
				GL11.glRotatef(90, 0, 1, 0);
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
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

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
				GL11.glTranslatef(14.5f, 0.0f, 15.5f);
				this.renderSuperLarge();
				break;
			case "very_large":
			case "embedded_very_large":
				GL11.glTranslatef(8.5f, 0.0f, 9.54f);
				this.renderVeryLarge();
				break;
			case "large":
			case "embedded_large":
				GL11.glTranslatef(-1.0f, 0.0f, 5.0f);
				this.renderLarge();
				break;
			case "medium":
			case "embedded_medium":
				GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
				this.renderMedium();
				break;
		}

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}
}