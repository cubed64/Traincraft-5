//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: wk boulder
// Model Creator: 
// Created on: 01.06.2025 - 18:37:19
// Last changed on: 01.06.2025 - 18:37:19

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located


import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelboulder extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public Modelboulder() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[6];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 64, textureX, textureY); // Box 10
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		bodyModel[2] = new ModelRendererTurbo(this, 32, 160, textureX, textureY); // Box 15
		bodyModel[3] = new ModelRendererTurbo(this, 133, 91, textureX, textureY, "cull"); // Box 19 cull strap
		bodyModel[4] = new ModelRendererTurbo(this, 132, 125, textureX, textureY, "cull"); // Box 20 cull strap
		bodyModel[5] = new ModelRendererTurbo(this, 133, 73, textureX, textureY); // Box 21 strap

		bodyModel[0].addBox(0F, 0F, 0F, 16, 48, 48, 0F); // Box 10
		bodyModel[0].setRotationPoint(-8F, -38F, -24F);

		bodyModel[1].addBox(0F, 0F, 0F, 48, 48, 16, 0F); // Box 13
		bodyModel[1].setRotationPoint(-24F, -38F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 48, 16, 48, 0F); // Box 15
		bodyModel[2].setRotationPoint(-24F, -22F, -24F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 36, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, -3F, 0F, 16F, -3F); // Box 19 cull strap
		bodyModel[3].setRotationPoint(-18F, -22F, -24.01F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 36, 16, 16, 0F,0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, -3F, 0F, 16F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20 cull strap
		bodyModel[4].setRotationPoint(-18F, -22F, 8.01F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 36, 0, 16, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F); // Box 21 strap
		bodyModel[5].setRotationPoint(-18F, -38.01F, -8.01F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 6; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
}