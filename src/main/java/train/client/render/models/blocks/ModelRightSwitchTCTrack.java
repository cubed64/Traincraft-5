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
public class ModelRightSwitchTCTrack extends ModelBase {
	private IModelCustom modelMediumRightSwitchActive;
	private IModelCustom modelMediumRightSwitchInactive;
	private IModelCustom modelMediumRightParallelSwitchInactive;
	private IModelCustom modelMediumRightParallelSwitchActive;
	private IModelCustom modelLargeRightSwitchActive;
	private IModelCustom modelLargeRightSwitchInactive;

	public ModelRightSwitchTCTrack() {
		modelMediumRightSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_switch_small_active.obj"));
		modelMediumRightSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_switch_small_inactive_new.obj"));
		modelMediumRightParallelSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_switch_parallel_inactive.obj"));
		modelMediumRightParallelSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_switch_parallel_active.obj"));
		modelLargeRightSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_switch_medium_active.obj"));
		modelLargeRightSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_switch_medium_inactive.obj"));
		
	}

	public void renderMediumActive() {
		modelMediumRightSwitchActive.renderAll();
	}
	public void renderMediumInactive() {
		modelMediumRightSwitchInactive.renderAll();
	}
	public void renderMediumParallelInactive() {
		modelMediumRightParallelSwitchInactive.renderAll();
	}
	public void renderMediumParallelActive() {
		modelMediumRightParallelSwitchActive.renderAll();
	}
	public void renderLarge90Active() {
		modelLargeRightSwitchActive.renderAll();
	}
	public void renderLarge90Inactive() {
		modelLargeRightSwitchInactive.renderAll();
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z)
	{
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
		render( type, tcRail.getTrackType().getVariant(), facing, tcRail.getSwitchState(), x, y, z, 1, 1, 1, 1);
	}

	public void render(String type, RailVariants railVariant, int facing, boolean active, double x, double y, double z, float r, float g, float b, float a) {
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

		// Bind the texture, so that OpenGL properly textures our block.
		if (RailVariants.EMBEDDED.equals(railVariant))
		{
			tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_embedded.png"));
		}
		else
		{
			tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		}
		// Push a blank matrix onto the stack

		GL11.glColor4f(r, g, b, a);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);

		if (facing == 3) {
			if(type.equals("medium")){
				GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
			}
			if(type.equals("large_90")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 4.0f);
			}
			if(type.equals("medium_parallel")){
				GL11.glRotatef(-90, 0, 1, 0);
			}
		}
		if (facing == 1) {
			if(type.equals("medium")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
			}
			if(type.equals("large_90")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 4.0f);
			}
			if(type.equals("medium_parallel")){
				GL11.glRotatef(90, 0, 1, 0);
			}
		}
		if(facing == 2){
			if(type.equals("medium")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
			}
			if(type.equals("large_90")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 4.0f);
			}
			if(type.equals("medium_parallel")){
				//do something if needed
			}
		}
		if(facing == 0){
			if(type.equals("medium")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
			}
			if(type.equals("large_90")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 4.0f);
			}
			if(type.equals("medium_parallel")){
				GL11.glRotatef(180, 0, 1, 0);
			}
		}
		if(type.equals("medium")&&!active)this.renderMediumInactive();
		if(type.equals("medium")&&active)this.renderMediumActive();
		if(type.equals("medium_parallel")&&!active)this.renderMediumParallelInactive();
		if(type.equals("medium_parallel")&&active)this.renderMediumParallelActive();
		if(type.equals("large_90")&&!active)this.renderLarge90Inactive();
		if(type.equals("large_90")&&active)this.renderLarge90Active();
		
		//if(type.equals("large"))this.renderLarge();

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}

}
