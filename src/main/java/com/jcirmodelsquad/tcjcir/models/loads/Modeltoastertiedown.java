//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: toastertiedown
// Model Creator: 
// Created on: 26.10.2023 - 12:00:04
// Last changed on: 26.10.2023 - 12:00:04

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located


import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modeltoastertiedown extends ModelConverter //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public Modeltoastertiedown() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 6, 6, textureX, textureY, "cull"); // Box 121 cull toaster tiedown

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 3.02F, 1F, 0F, 3.02F, 1F, 0F, -2F, -24F, 0F, -2F, -24F, 0F, -8.02F, 5F, 0F, -8.02F, 5F); // Box 121 cull toaster tiedown
		bodyModel[0].setRotationPoint(-0.5F, 7F, -12F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 1; i++) {
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
//this is quite possibly the worst coded joke item