//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.07.2023 - 16:09:18
// Last changed on: 07.07.2023 - 16:09:18

package com.jcirmodelsquad.tcjcir.models; //Path where the model is located

import tmt.ModelBase;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelMTCMarker extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMTCMarker() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[5];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 11, 21, textureX, textureY); // Box 4

		bodyModel[0].addBox(0F, 0F, 0F, 2, 46, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-4F, -37F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 13, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1
		bodyModel[1].setRotationPoint(0F, -35F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 13, 2, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(-2F, -33F, 0F);

		bodyModel[3].addBox(0F, 0F, 0F, 13, 2, 1, 0F); // Box 3
		bodyModel[3].setRotationPoint(-2F, -26F, 0F);

		bodyModel[4].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 4
		bodyModel[4].setRotationPoint(-7F, 8F, -3F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}