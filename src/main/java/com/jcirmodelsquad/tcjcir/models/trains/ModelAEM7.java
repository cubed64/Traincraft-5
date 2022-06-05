//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AEM-7
// Model Creator: 
// Created on: 22.10.2021 - 20:13:55
// Last changed on: 22.10.2021 - 20:13:55

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelAEM7 extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelAEM7() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[9];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 56, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 4, 46, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 2, 36, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 25, 40, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 25, 38, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 25, 38, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 27, 57, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 27, 57, textureX, textureY); // Box 9

		bodyModel[0].addBox(0F, 0F, 0F, 9, 1, 6, 0F); // Box 1
		bodyModel[0].setRotationPoint(-4F, 9F, -3F);

		bodyModel[1].addBox(0F, 0F, 0F, 8, 4, 5, 0F); // Box 2
		bodyModel[1].setRotationPoint(-3.5F, 5F, -2.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F); // Box 3
		bodyModel[2].setRotationPoint(-3F, 4F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 4
		bodyModel[3].setRotationPoint(-4F, 7.5F, -1F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 5
		bodyModel[4].setRotationPoint(2F, 4F, 0F);
		bodyModel[4].rotateAngleZ = 0.75049158F;

		bodyModel[5].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 6
		bodyModel[5].setRotationPoint(4F, -1F, 0F);
		bodyModel[5].rotateAngleZ = -0.64577182F;

		bodyModel[6].addBox(0F, 0F, -2F, 0, 1, 4, 0F); // Box 7
		bodyModel[6].setRotationPoint(4F, -1F, 0F);
		bodyModel[6].rotateAngleZ = -0.64577182F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-2F, 2F, -1.25F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-2F, 2F, 1.25F);
	}
	public float[] getTrans() {
		return new float[]{-1.15F, 2.5F, 0F};
	}
	public float[] getScale() {
		return new float[] { 4F, 4.5F, 4F };
	}
}