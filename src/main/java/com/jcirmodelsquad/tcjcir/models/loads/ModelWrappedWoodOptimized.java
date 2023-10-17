//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: WrappedWood3Optimized
// Model Creator: bida
// Created on: 01.11.2020 - 16:21:37
// Last changed on: 01.11.2020 - 16:21:37

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelWrappedWoodOptimized extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelWrappedWoodOptimized() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[7];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 98, 47, textureX, textureY); // Box 4 support
		bodyModel[1] = new ModelRendererTurbo(this, 63, 47, textureX, textureY); // Box 3 support
		bodyModel[2] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 1 wood hyper
		bodyModel[3] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[4] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[5] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[6] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 support
		bodyModel[0].setRotationPoint(3.5F, 9F, -4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 support
		bodyModel[1].setRotationPoint(-5.5F, 9F, -4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 32, 15, 16, 0F,-7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F); // Box 1 wood hyper
		bodyModel[2].setRotationPoint(-16F, -5F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[3].setRotationPoint(-5F, 5F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[4].setRotationPoint(-5F, 10F, -4F);
		bodyModel[4].rotateAngleX = 1.57079633F;

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[5].setRotationPoint(4F, 10F, -4F);
		bodyModel[5].rotateAngleX = 1.57079633F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[6].setRotationPoint(4F, 5F, -8F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 7; i++) {
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