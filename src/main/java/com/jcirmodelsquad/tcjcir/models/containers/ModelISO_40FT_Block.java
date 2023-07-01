//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ISO_40FT_Block
// Model Creator: Bida
// Created on: 01.07.2023 - 12:05:12
// Last changed on: 01.07.2023 - 12:05:12
package com.jcirmodelsquad.tcjcir.models.containers;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelISO_40FT_Block extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public ModelISO_40FT_Block() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 42, 12, textureX, textureY); // 40ft Container2

		bodyModel[0].addShapeBox(0F, 0F, 0F, 62, 21, 18, 0F,0F, 11F, 0F, 34F, 11F, 0F, 34F, 11F, 14F, 0F, 11F, 14F, 0F, 0F, 0F, 34F, 0F, 0F, 34F, 0F, 14F, 0F, 0F, 14F); // 40ft Container2
		bodyModel[0].setRotationPoint(-48F, -5F, -16F);
	}
}