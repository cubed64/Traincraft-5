package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.BaseClass.AbstractTrackModel;
import train.common.enums.TrackResourceLocations;
import train.common.items.RailVariants;
import train.common.library.EnumTracks;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelSmallStraightTCTrack extends AbstractTrackModel {
	
	private IModelCustom modelSmallStraight;
	private IModelCustom modelRoadCrossing;

	private IModelCustom modelRoadCrossingDynamic;

	protected String[] ballastTexture = new String[2];

	public ModelSmallStraightTCTrack() {
		modelSmallStraight = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/straight/1x1.obj"));
		modelRoadCrossing = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/straight/1x1_crossing.obj"));
		modelRoadCrossingDynamic = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/straight/track_roadcrossing_dynamic.obj"));
	}

	private void render(String type)
	{
		switch (type)
		{
			case "crossing":
				modelRoadCrossing.renderAll();
			break;
			case "crossing1":
				modelRoadCrossing.renderAll();
			break;
			case "crossing2":
				modelRoadCrossing.renderAll();
			break;
			default:
			{
				modelSmallStraight.renderAll();
			}
		}

        //render( type, tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord), x, y, z, 1, 1, 1, 1);
	}

	private void setupRender(int facing, double x, double y, double z, float r, float g, float b, float a)
	{
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);
		GL11.glColor4f(r, g, b, a);

		switch (facing)
		{
			case 3:
				GL11.glRotatef(90, 0, 1, 0);
				break;
			case 1:
				GL11.glRotatef(90, 0, 1, 0);
				break;
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
		tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing_base.png"));
		modelRoadCrossing.renderAll();
		SetupDynamicBallast(ballastTextureInput);
		tmt.Tessellator.bindTexture(new ResourceLocation(ballastTexture[0],  "textures/blocks/" + ballastTexture[1] +".png"));
		SetupDynamicBallastColour(ballastColour);
		modelRoadCrossingDynamic.renderAll();

	}

	public void renderDynamic(RailVariants variants, int facing, double x, double y, double z, float r, float g, float b, float a, String ballastTexture, int colour)
	{
		setupRender(facing, x, y, z, r, g, b, a);

		// GL11.glTranslatef(0.0f, 0.0f, -1.0f);
		renderDynamic(variants, ballastTexture, colour);

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
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
		renderDynamic( tcRail.getTrackType().getVariant(), getRailDirection(tcRail) , x, y, z, 1, 1, 1, 1, iconName, colour);
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z)
	{
		render(tcRail.getTrackType(), type, getRailDirection(tcRail), x, y, z, 1, 1, 1, 1 );
	}

	public void render(EnumTracks enumTracks, String type, int facing, double x, double y, double z, float r, float g, float b, float a )
	{
		setupRender(facing, x, y, z, r, g, b, a);

		// Bind the texture, so that OpenGL properly textures our block.
		switch (type)
		{
			case "crossing":
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing.png"));
			break;
			case "crossing1":
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing_1.png"));
			break;
			case "crossing2":
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing_2.png"));
			break;
			default:
			{
				tmt.Tessellator.bindTexture(train.common.enums.TrackResourceLocations.GetResourceLocation(enumTracks.getVariant()));
			}
		}

		render(type);

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}

}
