//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PM Trailing Truck
// Model Creator: Prof_Binky
// Created on: 16.12.2024 - 21:09:19
// Last changed on: 16.12.2024 - 21:09:19

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelPMTrailingTruck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelPMTrailingTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[31];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 23, 197, textureX, textureY); // Box 27
		bodyModel[1] = new ModelRendererTurbo(this, 1, 198, textureX, textureY); // Box 27
		bodyModel[2] = new ModelRendererTurbo(this, 23, 197, textureX, textureY); // Box 27
		bodyModel[3] = new ModelRendererTurbo(this, 1, 198, textureX, textureY); // Box 27
		bodyModel[4] = new ModelRendererTurbo(this, 1, 189, textureX, textureY); // Box 56
		bodyModel[5] = new ModelRendererTurbo(this, 1, 189, textureX, textureY); // Box 56
		bodyModel[6] = new ModelRendererTurbo(this, 23, 217, textureX, textureY,"cull"); // Trailing truck part cull
		bodyModel[7] = new ModelRendererTurbo(this, 23, 223, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 54, 220, textureX, textureY,"cull"); // Truck support cull
		bodyModel[9] = new ModelRendererTurbo(this, 22, 223, textureX, textureY); // Box 3
		bodyModel[10] = new ModelRendererTurbo(this, 54, 211, textureX, textureY,"cull"); // Truck support cull
		bodyModel[11] = new ModelRendererTurbo(this, 23, 207, textureX, textureY,"cull"); // Trailing truck part cull
		bodyModel[12] = new ModelRendererTurbo(this, 54, 207, textureX, textureY); // Box 3
		bodyModel[13] = new ModelRendererTurbo(this, 54, 216, textureX, textureY); // Box 3
		bodyModel[14] = new ModelRendererTurbo(this, 16, 221, textureX, textureY); // Box 69
		bodyModel[15] = new ModelRendererTurbo(this, 16, 211, textureX, textureY); // Box 69
		bodyModel[16] = new ModelRendererTurbo(this, 16, 207, textureX, textureY); // Box 69
		bodyModel[17] = new ModelRendererTurbo(this, 36, 191, textureX, textureY); // Box 3
		bodyModel[18] = new ModelRendererTurbo(this, 175, 156, textureX, textureY); // Box 3
		bodyModel[19] = new ModelRendererTurbo(this, 23, 213, textureX, textureY); // Box 3
		bodyModel[20] = new ModelRendererTurbo(this, 39, 213, textureX, textureY); // Box 3
		bodyModel[21] = new ModelRendererTurbo(this, 29, 226, textureX, textureY); // Box 37
		bodyModel[22] = new ModelRendererTurbo(this, 39, 226, textureX, textureY); // Box 37
		bodyModel[23] = new ModelRendererTurbo(this, 29, 233, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 39, 233, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 61, 219, textureX, textureY); // Box 2
		bodyModel[26] = new ModelRendererTurbo(this, 61, 210, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 39, 223, textureX, textureY); // Box 3
		bodyModel[28] = new ModelRendererTurbo(this, 59, 217, textureX, textureY); // Box 3
		bodyModel[29] = new ModelRendererTurbo(this, 59, 208, textureX, textureY); // Box 3
		bodyModel[30] = new ModelRendererTurbo(this, 16, 217, textureX, textureY); // Box 69

		bodyModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 27
		bodyModel[0].setRotationPoint(2.5F, 4F, -5.51F);

		bodyModel[1].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 27
		bodyModel[1].setRotationPoint(-5.5F, 5F, -5.51F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 27
		bodyModel[2].setRotationPoint(2.5F, 4F, 5.51F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 27
		bodyModel[3].setRotationPoint(-5.5F, 5F, 5.51F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 56
		bodyModel[4].setRotationPoint(-4F, 6.5F, -7.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 56
		bodyModel[5].setRotationPoint(4.5F, 6F, -7.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Trailing truck part cull
		bodyModel[6].setRotationPoint(-5.5F, 4F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[7].setRotationPoint(-5.5F, 8F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Truck support cull
		bodyModel[8].setRotationPoint(8.5F, 6F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 3
		bodyModel[9].setRotationPoint(10.5F, 7F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Truck support cull
		bodyModel[10].setRotationPoint(8.5F, 6F, 6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Trailing truck part cull
		bodyModel[11].setRotationPoint(-5.5F, 4F, 6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[12].setRotationPoint(8.5F, 4F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[13].setRotationPoint(8.5F, 4F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 69
		bodyModel[14].setRotationPoint(-7.5F, 6F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 69
		bodyModel[15].setRotationPoint(-7.5F, 6F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 69
		bodyModel[16].setRotationPoint(-7.5F, 4F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 3
		bodyModel[17].setRotationPoint(-8.5F, 6F, -6F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 3
		bodyModel[18].setRotationPoint(-11.5F, 7F, -2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[19].setRotationPoint(-5.5F, 8F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 3
		bodyModel[20].setRotationPoint(2.5F, 8F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[21].setRotationPoint(4.5F, 6F, -8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 37
		bodyModel[22].setRotationPoint(4.5F, 6F, 7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[23].setRotationPoint(-4F, 6.5F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 37
		bodyModel[24].setRotationPoint(-4F, 6.5F, 7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[25].setRotationPoint(10.5F, 6F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[26].setRotationPoint(10.5F, 6F, 1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 3
		bodyModel[27].setRotationPoint(2.5F, 8F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[28].setRotationPoint(9.5F, 6F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[29].setRotationPoint(9.5F, 6F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 69
		bodyModel[30].setRotationPoint(-7.5F, 4F, -7F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (ModelRendererTurbo m : bodyModel) {
			if (m.boxName.equals("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				m.render(f5);
			}
		}
	}
}