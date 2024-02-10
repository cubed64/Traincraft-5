//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.02.2024 - 09:03:17
// Last changed on: 10.02.2024 - 09:03:17

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelhazmat_plac_29080 extends ModelConverter //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public Modelhazmat_plac_29080() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[4];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 108 hazmat plac
		bodyModel[1] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 108 hazmat plac
		bodyModel[2] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 108 hazmat plac
		bodyModel[3] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 108 hazmat plac

		bodyModel[0].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[0].setRotationPoint(-27.5F, 0F, 11.04F);
		bodyModel[0].rotateAngleY = -3.14159265F;
		bodyModel[0].rotateAngleZ = -0.78539816F;

		bodyModel[1].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[1].setRotationPoint(27.5F, 0F, -11.04F);
		bodyModel[1].rotateAngleZ = -0.78539816F;

		bodyModel[2].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[2].setRotationPoint(-35.54F, 0F, 0F);
		bodyModel[2].rotateAngleY = -1.57079633F;
		bodyModel[2].rotateAngleZ = -0.78539816F;

		bodyModel[3].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[3].setRotationPoint(35.54F, 0F, 0F);
		bodyModel[3].rotateAngleY = 1.57079633F;
		bodyModel[3].rotateAngleZ = -0.78539816F;
	}
}