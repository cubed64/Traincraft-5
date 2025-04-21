//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.04.2025 - 18:49:10
// Last changed on: 20.04.2025 - 18:49:10

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelgsi_60_foot_bulk_stakes extends ModelConverter //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public Modelgsi_60_foot_bulk_stakes() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 20, 4, textureX, textureY); // Box 308
		bodyModel[1] = new ModelRendererTurbo(this, 20, 4, textureX, textureY); // Box 309
		bodyModel[2] = new ModelRendererTurbo(this, 20, 4, textureX, textureY); // Box 310
		bodyModel[3] = new ModelRendererTurbo(this, 20, 4, textureX, textureY); // Box 311
		bodyModel[4] = new ModelRendererTurbo(this, 20, 4, textureX, textureY); // Box 312
		bodyModel[5] = new ModelRendererTurbo(this, 26, 4, textureX, textureY); // Box 313
		bodyModel[6] = new ModelRendererTurbo(this, 26, 4, textureX, textureY); // Box 314
		bodyModel[7] = new ModelRendererTurbo(this, 26, 4, textureX, textureY); // Box 315
		bodyModel[8] = new ModelRendererTurbo(this, 26, 4, textureX, textureY); // Box 316
		bodyModel[9] = new ModelRendererTurbo(this, 26, 4, textureX, textureY); // Box 317
		bodyModel[10] = new ModelRendererTurbo(this, 20, 4, textureX, textureY); // Box 361
		bodyModel[11] = new ModelRendererTurbo(this, 26, 4, textureX, textureY); // Box 362

		bodyModel[0].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 308
		bodyModel[0].setRotationPoint(-32F, -18F, -12F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 309
		bodyModel[1].setRotationPoint(31F, -18F, -12F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 310
		bodyModel[2].setRotationPoint(-18F, -18F, -12F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 311
		bodyModel[3].setRotationPoint(17F, -18F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 312
		bodyModel[4].setRotationPoint(3F, -18F, -12F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 313
		bodyModel[5].setRotationPoint(-32F, -18F, 11F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 314
		bodyModel[6].setRotationPoint(31F, -18F, 11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 315
		bodyModel[7].setRotationPoint(-18F, -18F, 11F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 316
		bodyModel[8].setRotationPoint(17F, -18F, 11F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 317
		bodyModel[9].setRotationPoint(3F, -18F, 11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 361
		bodyModel[10].setRotationPoint(-4F, -18F, -12F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 362
		bodyModel[11].setRotationPoint(-4F, -18F, 11F);
	}
}