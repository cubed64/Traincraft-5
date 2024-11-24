package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelSlopeTCTrack extends ModelBase {
	
	private IModelCustom	modeltrack;
	private IModelCustom	modelSlopeWood;
	private IModelCustom	modelSlopeBallast;
	private String[] ballastTexture = new String[2];

	public ModelSlopeTCTrack() {
		modeltrack = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_slope.obj"));
		modelSlopeWood = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "supports_wood.obj"));
		modelSlopeBallast = net.minecraftforge.client.model.AdvancedModelLoader
				.loadModel(new ResourceLocation(Info.modelPrefix + "supports_ballast.obj"));
	}
	
	public void render(String type, String ballast, int ballastColour)
	{
		switch (type)
		{
			case "wood":
				FMLClientHandler.instance().getClient().renderEngine
						.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_slope.png"));
				modelSlopeWood.renderAll();
				FMLClientHandler.instance().getClient().renderEngine
						.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
				modeltrack.renderAll();
				break;
			case "gravel":
				FMLClientHandler.instance().getClient().renderEngine
						.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/blocks/gravel.png"));
				modelSlopeBallast.renderAll();
				FMLClientHandler.instance().getClient().renderEngine
						.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
				modeltrack.renderAll();
				break;
			case "ballast":
				FMLClientHandler.instance().getClient().renderEngine
						.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/blocks/ballast_test.png"));
				modelSlopeBallast.renderAll();
				FMLClientHandler.instance().getClient().renderEngine
						.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
				modeltrack.renderAll();
				break;
			case "snow":
				FMLClientHandler.instance().getClient().renderEngine
						.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/blocks/snowgravel.png"));
				modelSlopeBallast.renderAll();
				FMLClientHandler.instance().getClient().renderEngine
						.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
				modeltrack.renderAll();
				break;
			case "peagravel":
				FMLClientHandler.instance().getClient().renderEngine
						.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/blocks/peagravel.png"));
				modelSlopeBallast.renderAll();
				FMLClientHandler.instance().getClient().renderEngine
						.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
				modeltrack.renderAll();
				break;
			case "dynamic":
				tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
				modeltrack.renderAll();
				SetupDynamicBallast(ballast);
				tmt.Tessellator.bindTexture(new ResourceLocation(ballastTexture[0],  "textures/blocks/" + ballastTexture[1] +".png"));
				SetupDynamicBallastColour(ballastColour);
				modelSlopeBallast.renderAll();
			break;
			case "embedded_dynamic":
				tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_embedded.png"));
				modeltrack.renderAll();
				SetupDynamicBallast(ballast);
				tmt.Tessellator.bindTexture(new ResourceLocation(ballastTexture[0],  "textures/blocks/" + ballastTexture[1] +".png"));
				SetupDynamicBallastColour(ballastColour);
				modelSlopeBallast.renderAll();
				break;
		}
	}

	private void SetupDynamicBallastColour(int ballastColour)
	{
		float r = (float)(ballastColour >> 16 & 255) / 255.0F;
		float g = (float)(ballastColour >> 8 & 255) / 255.0F;
		float b = (float)(ballastColour & 255) / 255.0F;
		GL11.glColor4f(r,g,b,1);
	}

	private void SetupDynamicBallast(String ballast)
	{
		if (ballast.contains(":")) {
			ballastTexture = ballast.split(":", 5);
		}
		else {
			ballastTexture[0] = "minecraft";
			ballastTexture[1] = ballast;
		}
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z)
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

		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
		render( type, facing, x, y, z, 1, 1, 1, 1, iconName, colour);
	}

	public void render(String type, int facing, double x, double y, double z, float r, float g, float b, float a, String ballastTexture, int colour)
	{
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();
		
		// Move the object into the correct position on the block (because the OBJ's origin is the
		// center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

		GL11.glColor4f(r, g, b, a);
		// GL11.glScalef(0.5f, 0.5f, 0.5f);

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

		// GL11.glTranslatef(0.0f, 0.0f, -1.0f);
		render(type, ballastTexture, colour);
		
		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}
}