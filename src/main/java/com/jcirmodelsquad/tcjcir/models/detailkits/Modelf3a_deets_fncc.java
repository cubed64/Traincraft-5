//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: f3a_fncc_detailkit
// Model Creator: bidauh
// Created on: 29.10.2025 - 01:26:22
// Last changed on: 29.10.2025 - 01:26:22

package com.jcirmodelsquad.tcjcir.models.detailkits; //Path where the model is located

import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.client.renderhelper.ModelRenderHelper;

public class Modelf3a_deets_fncc extends ModelConverter //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public Modelf3a_deets_fncc() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[9];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Box 364 prime base fncc
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY, "cull"); // Box 537 cull fncc beacon holde
		bodyModel[6] = new ModelRendererTurbo(this, 10, 2, textureX, textureY); // Box 288 fncc rear headlight mounter
		bodyModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, "lamp"); // Box 289 headligh rear fncc
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, "lamp"); // Box 290 headlight rear fncc

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base fncc
		bodyModel[0].setRotationPoint(-21F, -21F, -1F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[1].setRotationPoint(-21F, -21.75F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[2].setRotationPoint(-21F, -21.75F, -1F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[3].setRotationPoint(-21F, -21.75F, -1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[4].setRotationPoint(-21F, -21.75F, -1F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.125F, 0.5F, 0.125F, 0.125F, 0.5F, 0.125F, 0.125F, 0.5F, 0.125F, 0.125F, 0.5F, 0.125F, 0.125F, 0.3F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.3F, 0.125F); // Box 537 cull fncc beacon holde
		bodyModel[5].setRotationPoint(-21F, -19.5F, -1F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288 fncc rear headlight mounter
		bodyModel[6].setRotationPoint(32F, -18.25F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 headligh rear fncc
		bodyModel[7].setRotationPoint(32.75F, -18.2F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 headlight rear fncc
		bodyModel[8].setRotationPoint(32.75F, -18.2F, 0F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

	}
}