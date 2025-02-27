//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: bethgon_load
// Model Creator: 
// Created on: 24.02.2025 - 14:35:58
// Last changed on: 24.02.2025 - 14:35:58

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBethgon_load extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelBethgon_load() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[9];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // load 3
		bodyModel[1] = new ModelRendererTurbo(this, 2, 20, textureX, textureY); // load 2
		bodyModel[2] = new ModelRendererTurbo(this, 3, 11, textureX, textureY); // load 1
		bodyModel[3] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // load 4
		bodyModel[4] = new ModelRendererTurbo(this, 284, 8, textureX, textureY); // load 5
		bodyModel[5] = new ModelRendererTurbo(this, 251, 3, textureX, textureY); // load 6
		bodyModel[6] = new ModelRendererTurbo(this, 318, 3, textureX, textureY); // load 9
		bodyModel[7] = new ModelRendererTurbo(this, 151, 4, textureX, textureY); // load 8
		bodyModel[8] = new ModelRendererTurbo(this, 217, 3, textureX, textureY); // load 7

		bodyModel[0].addShapeBox(0F, 0F, 0F, 55, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // load 3
		bodyModel[0].setRotationPoint(-27.5F, -13F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 55, 0, 7, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // load 2
		bodyModel[1].setRotationPoint(-27.5F, -13F, 3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 55, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // load 1
		bodyModel[2].setRotationPoint(-27.5F, -18F, -3F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 0, 6, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // load 4
		bodyModel[3].setRotationPoint(-35.5F, -13F, -3F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 8, 0, 6, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // load 5
		bodyModel[4].setRotationPoint(27.5F, -13F, -3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -7F, 0F, 0F, -7F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // load 6
		bodyModel[5].setRotationPoint(27.5F, -18F, 3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,0F, 0F, -7F, -8F, 0F, -7F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // load 9
		bodyModel[6].setRotationPoint(27.5F, -18F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,-8F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // load 8
		bodyModel[7].setRotationPoint(-35.5F, -18F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -8F, 0F, -7F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // load 7
		bodyModel[8].setRotationPoint(-35.5F, -18F, 3F);
	}
}