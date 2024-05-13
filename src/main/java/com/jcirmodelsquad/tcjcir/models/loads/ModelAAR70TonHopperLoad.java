//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: pipe falling sfx 1
// Model Creator: biba
// Created on: 10.06.2023 - 17:24:09
// Last changed on: 10.06.2023 - 17:24:09

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelAAR70TonHopperLoad extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public ModelAAR70TonHopperLoad() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[3];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Rock load
		bodyModel[1] = new ModelRendererTurbo(this, 152, 18, textureX, textureY); // Rock load
		bodyModel[2] = new ModelRendererTurbo(this, 90, 1, textureX, textureY); // Rock load

		bodyModel[0].addShapeBox(0F, 0F, 0F, 23, 16, 21, 0F,-12.5F, 0F, -10.5F, -10.5F, 0F, -10.5F, -10.5F, 0F, -10.5F, -12.5F, 0F, -10.5F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F); // Rock load
		bodyModel[0].setRotationPoint(-32.5F, -16.5F, -10.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 22, 16, 21, 0F,-11.25F, 0F, -10.5F, -10.75F, 0F, -10.5F, -10.75F, 0F, -10.5F, -11.25F, 0F, -10.5F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F); // Rock load
		bodyModel[1].setRotationPoint(10.5F, -16.5F, -10.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 20, 16, 21, 0F,-8.25F, 0F, -10.5F, -11.75F, 0F, -10.5F, -11.75F, 0F, -10.5F, -8.25F, 0F, -10.5F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F); // Rock load
		bodyModel[2].setRotationPoint(-9.5F, -16.5F, -10.5F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 3; i++) {
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