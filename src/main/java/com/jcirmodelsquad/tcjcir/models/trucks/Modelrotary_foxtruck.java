//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: rotary_foxtruc
// Model Creator: bida
// Created on: 05.11.2023 - 19:56:43
// Last changed on: 05.11.2023 - 19:56:43

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelrotary_foxtruck extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Modelrotary_foxtruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[38];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 14, 44, textureX, textureY); // Box 14
		bodyModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 16 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 14, 44, textureX, textureY); // Box 22
		bodyModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 44 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 45 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 46 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 23, 57, textureX, textureY); // Box 88
		bodyModel[7] = new ModelRendererTurbo(this, 23, 57, textureX, textureY); // Box 51
		bodyModel[8] = new ModelRendererTurbo(this, 23, 57, textureX, textureY); // Box 67
		bodyModel[9] = new ModelRendererTurbo(this, 23, 57, textureX, textureY); // Box 68
		bodyModel[10] = new ModelRendererTurbo(this, 1, 38, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 11, 45, textureX, textureY); // Box 39
		bodyModel[16] = new ModelRendererTurbo(this, 11, 45, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 35, 32, textureX, textureY); // Box 178
		bodyModel[18] = new ModelRendererTurbo(this, 40, 32, textureX, textureY); // Box 179
		bodyModel[19] = new ModelRendererTurbo(this, 40, 32, textureX, textureY); // Box 182
		bodyModel[20] = new ModelRendererTurbo(this, 35, 32, textureX, textureY); // Box 183
		bodyModel[21] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 6, 45, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 6, 45, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 6, 45, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 6, 45, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 11, 49, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 11, 49, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 35, 32, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 40, 32, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 35, 32, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 40, 32, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 29, 38, textureX, textureY); // Box 28
		bodyModel[33] = new ModelRendererTurbo(this, 41, 32, textureX, textureY); // Box 22
		bodyModel[34] = new ModelRendererTurbo(this, 38, 48, textureX, textureY); // Box 23
		bodyModel[35] = new ModelRendererTurbo(this, 41, 40, textureX, textureY); // Box 89
		bodyModel[36] = new ModelRendererTurbo(this, 22, 9, textureX, textureY); // Box 37 roller bearing
		bodyModel[37] = new ModelRendererTurbo(this, 22, 9, textureX, textureY); // Box 38 roller bearing

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 14
		bodyModel[0].setRotationPoint(-6F, 6F, -8.5F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 16 wheel
		bodyModel[1].setRotationPoint(-5F, 7F, -5.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 22
		bodyModel[2].setRotationPoint(4F, 6F, -8.5F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 44 wheel
		bodyModel[3].setRotationPoint(5F, 7F, -5.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 45 wheel
		bodyModel[4].setRotationPoint(5F, 7F, 5.5F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[5].setRotationPoint(-5F, 7F, 5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 88
		bodyModel[6].setRotationPoint(-6F, 6F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 51
		bodyModel[7].setRotationPoint(4F, 6F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[8].setRotationPoint(-6F, 6F, 8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[9].setRotationPoint(4F, 6F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-6F, 4F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, -0.5F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F); // Box 11
		bodyModel[11].setRotationPoint(-7F, 4F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F, 0F, -0.4F, 0.25F); // Box 13
		bodyModel[12].setRotationPoint(-4F, 4F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, -0.5F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F); // Box 14
		bodyModel[13].setRotationPoint(3F, 4F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F, 0F, -0.4F, 0.25F); // Box 15
		bodyModel[14].setRotationPoint(6F, 4F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[15].setRotationPoint(-7F, 8.1F, -8.25F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(3F, 8.1F, -8.25F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 178
		bodyModel[17].setRotationPoint(-1.5F, 4.75F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 179
		bodyModel[18].setRotationPoint(-1.5F, 7.75F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 182
		bodyModel[19].setRotationPoint(0.5F, 7.75F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 183
		bodyModel[20].setRotationPoint(0.5F, 4.75F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-6F, 4F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F, 0F, -0.4F, 0.25F); // Box 23
		bodyModel[22].setRotationPoint(-4F, 4F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, -0.5F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F); // Box 24
		bodyModel[23].setRotationPoint(-7F, 4F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, -0.5F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F); // Box 25
		bodyModel[24].setRotationPoint(3F, 4F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F, 0F, -0.4F, 0.25F); // Box 26
		bodyModel[25].setRotationPoint(6F, 4F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(-7F, 8.1F, 6.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(3F, 8.1F, 6.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(0.5F, 4.75F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 30
		bodyModel[29].setRotationPoint(0.5F, 7.75F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[30].setRotationPoint(-1.5F, 4.75F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 32
		bodyModel[31].setRotationPoint(-1.5F, 7.75F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[32].setRotationPoint(-1.5F, 4.75F, -1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[33].setRotationPoint(-2F, 5.75F, -7.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 3, 7, 0F); // Box 23
		bodyModel[34].setRotationPoint(-2F, 5.75F, -3.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F); // Box 89
		bodyModel[35].setRotationPoint(-2F, 5.75F, 3.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 37 roller bearing
		bodyModel[36].setRotationPoint(4F, 6F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 38 roller bearing
		bodyModel[37].setRotationPoint(-6F, 6F, -9F);
	}
}