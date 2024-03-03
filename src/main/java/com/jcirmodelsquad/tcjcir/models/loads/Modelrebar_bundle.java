//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: rebar bundle
// Model Creator: bida
// Created on: 01.03.2024 - 21:01:12
// Last changed on: 01.03.2024 - 21:01:12

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelrebar_bundle extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public Modelrebar_bundle() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[9];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 12, 14, textureX, textureY); // Box 46 rebar bunch
		bodyModel[1] = new ModelRendererTurbo(this, 1, 34, textureX, textureY); // Box 48
		bodyModel[2] = new ModelRendererTurbo(this, 6, 34, textureX, textureY); // Box 49
		bodyModel[3] = new ModelRendererTurbo(this, 11, 34, textureX, textureY); // Box 50
		bodyModel[4] = new ModelRendererTurbo(this, 17, 34, textureX, textureY); // Box 51
		bodyModel[5] = new ModelRendererTurbo(this, 22, 34, textureX, textureY); // Box 52
		bodyModel[6] = new ModelRendererTurbo(this, 27, 34, textureX, textureY); // Box 53
		bodyModel[7] = new ModelRendererTurbo(this, 32, 34, textureX, textureY); // Box 54
		bodyModel[8] = new ModelRendererTurbo(this, 37, 34, textureX, textureY); // Box 55

		bodyModel[0].addShapeBox(0F, 0F, 0F, 55, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -16F, 0F, -6F, -16F); // Box 46 rebar bunch
		bodyModel[0].setRotationPoint(-27.5F, 4F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[1].setRotationPoint(-24F, 1F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[2].setRotationPoint(23F, 1F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[3].setRotationPoint(23F, 1F, 8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 51
		bodyModel[4].setRotationPoint(-24F, 1F, 8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[5].setRotationPoint(-11F, 1F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[6].setRotationPoint(10F, 1F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 54
		bodyModel[7].setRotationPoint(10F, 1F, 8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 55
		bodyModel[8].setRotationPoint(-11F, 1F, 8F);
	}
}