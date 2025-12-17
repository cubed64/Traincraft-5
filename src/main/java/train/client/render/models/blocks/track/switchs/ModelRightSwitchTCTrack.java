package train.client.render.models.blocks.track.switchs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import org.lwjgl.opengl.GL11;
import train.common.items.RailVariants;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelRightSwitchTCTrack extends AbstractSwitchTCTrack
{

	public ModelRightSwitchTCTrack()
	{
		if (!baked)
		{
			modelMediumSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/4x4_right.obj"));
			listMediumSwitchActive = GL11.glGenLists(1);
			GL11.glNewList(listMediumSwitchActive, GL11.GL_COMPILE);
			modelMediumSwitchActive.renderAll();
			GL11.glEndList();

			modelMediumSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/4x4_right.obj"));
			listMediumSwitchInactive = GL11.glGenLists(1);
			GL11.glNewList(listMediumSwitchInactive, GL11.GL_COMPILE);
			modelMediumSwitchInactive.renderAll();
			GL11.glEndList();

			modelMediumParallelSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/4x11_right.obj"));
			listMediumParallelSwitchActive = GL11.glGenLists(1);
			GL11.glNewList(listMediumParallelSwitchActive, GL11.GL_COMPILE);
			modelMediumParallelSwitchActive.renderAll();
			GL11.glEndList();

			modelMediumParallelSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/4x11_right.obj"));
			listMediumParallelSwitchInactive = GL11.glGenLists(1);
			GL11.glNewList(listMediumParallelSwitchInactive, GL11.GL_COMPILE);
			modelMediumParallelSwitchInactive.renderAll();
			GL11.glEndList();

			modelLargeParallelSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/4x17_right.obj"));
			listLargeParallelSwitchActive = GL11.glGenLists(1);
			GL11.glNewList(listLargeParallelSwitchActive, GL11.GL_COMPILE);
			modelLargeParallelSwitchActive.renderAll();
			GL11.glEndList();

			modelLargeParallelSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/4x17_right.obj"));
			listLargeParallelSwitchInactive = GL11.glGenLists(1);
			GL11.glNewList(listLargeParallelSwitchInactive, GL11.GL_COMPILE);
			modelLargeParallelSwitchInactive.renderAll();
			GL11.glEndList();

			modelLargeSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/6x6_right.obj"));
			listLargeSwitchActive = GL11.glGenLists(1);
			GL11.glNewList(listLargeSwitchActive, GL11.GL_COMPILE);
			modelLargeSwitchActive.renderAll();
			GL11.glEndList();

			modelLargeSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/6x6_right.obj"));
			listLargeSwitchInactive = GL11.glGenLists(1);
			GL11.glNewList(listLargeSwitchInactive, GL11.GL_COMPILE);
			modelLargeSwitchInactive.renderAll();
			GL11.glEndList();

			modelMedium45degreeSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/3x5_right.obj"));
			listMedium45degreeSwitchActive = GL11.glGenLists(1);
			GL11.glNewList(listMedium45degreeSwitchActive, GL11.GL_COMPILE);
			modelMedium45degreeSwitchActive.renderAll();
			GL11.glEndList();

			modelMedium45degreeSwitchInActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/3x5_right.obj"));
			listMedium45degreeSwitchInActive = GL11.glGenLists(1);
			GL11.glNewList(listMedium45degreeSwitchInActive, GL11.GL_COMPILE);
			modelMedium45degreeSwitchInActive.renderAll();
			GL11.glEndList();

			modelLarge45degreeSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/4x8_right.obj"));
			listLarge45degreeSwitchActive = GL11.glGenLists(1);
			GL11.glNewList(listLarge45degreeSwitchActive, GL11.GL_COMPILE);
			modelLarge45degreeSwitchActive.renderAll();
			GL11.glEndList();

			modelLarge45degreeSwitchInActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/4x8_right.obj"));
			listLarge45degreeSwitchInActive = GL11.glGenLists(1);
			GL11.glNewList(listLarge45degreeSwitchInActive, GL11.GL_COMPILE);
			modelLarge45degreeSwitchInActive.renderAll();
			GL11.glEndList();

			modelVeryLargeSwitchActive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/11x11_right.obj"));
			listVeryLargeSwitchActive = GL11.glGenLists(1);
			GL11.glNewList(listVeryLargeSwitchActive, GL11.GL_COMPILE);
			modelVeryLargeSwitchActive.renderAll();
			GL11.glEndList();

			modelVeryLargeSwitchInactive = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/11x11_right.obj"));
			listVeryLargeSwitchInactive = GL11.glGenLists(1);
			GL11.glNewList(listVeryLargeSwitchInactive, GL11.GL_COMPILE);
			modelVeryLargeSwitchInactive.renderAll();
			GL11.glEndList();

			modelCrossover10x2SwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/active/crossover_10x2_right.obj"));
			listCrossover10x2SwitchActive = GL11.glGenLists(1);
			GL11.glNewList(listCrossover10x2SwitchActive, GL11.GL_COMPILE);
			modelCrossover10x2SwitchActive.renderAll();
			GL11.glEndList();

			modelCrossover10x2SwitchInactive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/switch/inactive/crossover_10x2_right.obj"));
			listCrossover10x2SwitchInactive = GL11.glGenLists(1);
			GL11.glNewList(listCrossover10x2SwitchInactive, GL11.GL_COMPILE);
			modelCrossover10x2SwitchInactive.renderAll();
			GL11.glEndList();

			baked = true;
		}
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z)
	{
		render( type, tcRail.getTrackType().getVariant(), getRailDirection(tcRail), tcRail.getSwitchState(), x, y, z, 1, 1, 1, 1);
	}

	public void render(String type, RailVariants railVariant, int facing, boolean active, double x, double y, double z, float r, float g, float b, float a) {
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

		// Bind the texture, so that OpenGL properly textures our block.
		tmt.Tessellator.bindTexture(train.common.enums.TrackResourceLocations.GetResourceLocation(railVariant));
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
			if(type.equals("very_large_90")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_parallel")){
				GL11.glRotatef(-90, 0, 1, 0);
			}
			if(type.equals("large_parallel")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_45degree")){
				GL11.glTranslatef(0.0f, 0.0f, 0);
				GL11.glRotatef(-90, 0, 1, 0);
			}
			if(type.equals("large_45degree")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 1.5f);
			}
			if(type.equals("crossover_10x2")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
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
			if(type.equals("very_large_90")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_parallel")){
				GL11.glRotatef(90, 0, 1, 0);
			}
			if(type.equals("large_parallel")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_45degree")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0);
			}
			if(type.equals("large_45degree")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 1.5f);
			}
			if(type.equals("crossover_10x2")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
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
			if(type.equals("very_large_90")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_parallel")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0.0f);
			}
			if(type.equals("large_parallel")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}

			if(type.equals("medium_45degree")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0f);
			}

			if(type.equals("large_45degree")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 1.5f);
			}
			if(type.equals("crossover_10x2")){
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
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
			if(type.equals("very_large_90")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_parallel")){
				GL11.glRotatef(180, 0, 1, 0);
			}
			if(type.equals("large_parallel")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
			if(type.equals("medium_45degree")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, 0.0f);
			}
			if(type.equals("large_45degree")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 1.5f);
			}
			if(type.equals("crossover_10x2")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(-0.5f, 0.0f, 0.5f);
			}
		}
		if(type.equals("medium")&&!active)this.renderMediumInactive();
		else if(type.equals("medium")&&active)this.renderMediumActive();
		else if(type.equals("medium_parallel")&&!active)this.renderMediumParallelInactive();
		else if(type.equals("medium_parallel")&&active)this.renderMediumParallelActive();
		else if(type.equals("large_parallel")&&!active)this.renderLargeParallelInactive();
		else if(type.equals("large_parallel")&&active)this.renderLargeParallelActive();
		else if(type.equals("large_90")&&!active)this.renderLarge90Inactive();
		else if(type.equals("large_90")&&active)this.renderLarge90Active();
		else if(type.equals("very_large_90")&&!active)this.renderVeryLarge90Inactive();
		else if(type.equals("very_large_90")&&active)this.renderVeryLarge90Active();
		else if(type.equals("medium_45degree")&&active)this.renderMedium45degreeActive();
		else if(type.equals("medium_45degree")&&!active)this.renderMedium45degreeInActive();
		else if(type.equals("large_45degree")&&active)this.renderLarge45degreeActive();
		else if(type.equals("large_45degree")&&!active)this.renderLarge45degreeInActive();
		else if(type.equals("crossover_10x2")&&active)this.renderCrossover10x2Active();
		else if (type.equals("crossover_10x2")&&!active)this.renderCrossover10x2Inactive();
		//if(type.equals("large"))this.renderLarge();

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}

}
