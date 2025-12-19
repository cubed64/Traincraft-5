//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: rotary coupler
// Model Creator: bida
// Created on: 10.12.2025 - 23:40:14
// Last changed on: 10.12.2025 - 23:40:14

package com.jcirmodelsquad.tcjcir.models.detailkits; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelRotaryPlowCoupler extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelRotaryPlowCoupler() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[4];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);

		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 332 coupler detachable
		bodyModel[1] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 333 detachable beam
		bodyModel[2] = new ModelRendererTurbo(this, 10, 13, textureX, textureY); // Box 334 detachable beam
		bodyModel[3] = new ModelRendererTurbo(this, 1, -18, textureX, textureY); // Box 335 cutbar detachable beam

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 332 coupler detachable
		bodyModel[0].setRotationPoint(-37.5F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 333 detachable beam
		bodyModel[1].setRotationPoint(-32.5F, 3F, -13F);
		bodyModel[1].rotateAngleY = 1.57079633F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F); // Box 334 detachable beam
		bodyModel[2].setRotationPoint(-34.5F, 3F, -2F);

		bodyModel[3].addBox(0F, -3F, 0F, 0, 3, 25, 0F); // Box 335 cutbar detachable beam
		bodyModel[3].setRotationPoint(-35F, 4F, -12.5F);
		bodyModel[3].rotateAngleZ = -0.55850536F;
	}
}