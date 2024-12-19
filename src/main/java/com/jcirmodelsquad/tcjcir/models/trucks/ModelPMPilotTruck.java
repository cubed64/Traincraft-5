//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PM Pilot Truck
// Model Creator: Prof_Binky
// Created on: 16.12.2024 - 21:01:35
// Last changed on: 16.12.2024 - 21:01:35

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelPMPilotTruck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelPMPilotTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[13];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 77, 197, textureX, textureY); // Box 27
		bodyModel[1] = new ModelRendererTurbo(this, 77, 197, textureX, textureY); // Box 27
		bodyModel[2] = new ModelRendererTurbo(this, 73, 188, textureX, textureY); // Box 56
		bodyModel[3] = new ModelRendererTurbo(this, 75, 206, textureX, textureY,"cull"); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 93, 214, textureX, textureY); // Box 3
		bodyModel[5] = new ModelRendererTurbo(this, 76, 214, textureX, textureY); // Box 3
		bodyModel[6] = new ModelRendererTurbo(this, 93, 199, textureX, textureY); // Box 37
		bodyModel[7] = new ModelRendererTurbo(this, 100, 199, textureX, textureY); // Box 37
		bodyModel[8] = new ModelRendererTurbo(this, 89, 224, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 75, 227, textureX, textureY); // Box 3
		bodyModel[10] = new ModelRendererTurbo(this, 75, 224, textureX, textureY); // Box 3
		bodyModel[11] = new ModelRendererTurbo(this, 83, 230, textureX, textureY); // Box 3
		bodyModel[12] = new ModelRendererTurbo(this, 99, 227, textureX, textureY); // Box 3

		bodyModel[0].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 27
		bodyModel[0].setRotationPoint(-8F, 5F, 5.51F);

		bodyModel[1].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 27
		bodyModel[1].setRotationPoint(-8F, 5F, -5.51F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 56
		bodyModel[2].setRotationPoint(-6.5F, 6.5F, -7.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 3
		bodyModel[3].setRotationPoint(-9.5F, 6F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 3
		bodyModel[4].setRotationPoint(-8.5F, 5F, -7F);

		bodyModel[5].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 3
		bodyModel[5].setRotationPoint(-8.5F, 5F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[6].setRotationPoint(-6.5F, 6.5F, -8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 37
		bodyModel[7].setRotationPoint(-6.5F, 6.5F, 7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, -5.5F, 0F, 0.5F, 5.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -5.5F, 0F, -0.5F, 5.5F, 0F, 0.5F, 0F); // Box 3
		bodyModel[8].setRotationPoint(-1.5F, 7.5F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 5.5F, 0F, 0.5F, -5.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 5.5F, 0F, -0.5F, -5.5F, 0F, 0.5F, 0F); // Box 3
		bodyModel[9].setRotationPoint(-1.5F, 7.5F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 3
		bodyModel[10].setRotationPoint(-3.5F, 7.5F, 6F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 3
		bodyModel[11].setRotationPoint(5.5F, 7F, -1.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 3
		bodyModel[12].setRotationPoint(-3.5F, 7.5F, -7F);
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