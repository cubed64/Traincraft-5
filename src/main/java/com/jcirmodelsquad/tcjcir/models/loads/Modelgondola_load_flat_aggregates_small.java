//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: gondola_load_flat_aggregates_small
// Model Creator: 
// Created on: 08.02.2024 - 20:50:36
// Last changed on: 08.02.2024 - 20:50:36

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelgondola_load_flat_aggregates_small extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 32;

	public Modelgondola_load_flat_aggregates_small() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Box 1 FLAT AGGREGATES SMOL

		bodyModel[0].addBox(0F, 0F, 0F, 56, 1, 18, 0F); // Box 1 FLAT AGGREGATES SMOL
		bodyModel[0].setRotationPoint(-28F, 1F, -9F);
	}
}