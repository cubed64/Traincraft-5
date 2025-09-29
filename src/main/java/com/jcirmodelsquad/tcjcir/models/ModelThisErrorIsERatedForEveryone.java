//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ModelThisErrorIsERatedForEveryone
// Model Creator: TBEA
// Created on: 31.08.2025 - 18:55:27
// Last changed on: 31.08.2025 - 18:55:27

package com.jcirmodelsquad.tcjcir.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelThisErrorIsERatedForEveryone extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelThisErrorIsERatedForEveryone() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[4];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 1, 12, 5, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, -2F, 0F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 1
		bodyModel[1].setRotationPoint(-4F, 8F, 0F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 1
		bodyModel[2].setRotationPoint(-4F, 3F, 0F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 1
		bodyModel[3].setRotationPoint(-4F, -2F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}