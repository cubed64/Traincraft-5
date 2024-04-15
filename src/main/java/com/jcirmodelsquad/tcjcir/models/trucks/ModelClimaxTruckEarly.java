//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: climax truck early
// Model Creator: bida
// Created on: 17.11.2021 - 12:37:07
// Last changed on: 17.11.2021 - 12:37:07

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelClimaxTruckEarly extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelClimaxTruckEarly() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[68];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 130 rod gear
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 30 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 46 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 47 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 48 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4 axle
		bodyModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 24 axle
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 130 rod gear
		bodyModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 239 rod
		bodyModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 154 wheel gear
		bodyModel[10] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 62 wheel gear
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 116
		bodyModel[12] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 69
		bodyModel[13] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 90
		bodyModel[14] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 98
		bodyModel[15] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 71
		bodyModel[17] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 144
		bodyModel[18] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 144
		bodyModel[19] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 45
		bodyModel[20] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 52
		bodyModel[21] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 39
		bodyModel[22] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 276
		bodyModel[23] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 277
		bodyModel[24] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 283
		bodyModel[25] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 287
		bodyModel[26] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 288
		bodyModel[27] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 289
		bodyModel[28] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 291
		bodyModel[29] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 108
		bodyModel[30] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 293
		bodyModel[31] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 294
		bodyModel[32] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 295
		bodyModel[33] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 296
		bodyModel[34] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 297
		bodyModel[35] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 298
		bodyModel[36] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 299
		bodyModel[37] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 300
		bodyModel[38] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 301
		bodyModel[39] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 290
		bodyModel[54] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 56
		bodyModel[55] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 58
		bodyModel[57] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 62
		bodyModel[61] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 64
		bodyModel[62] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 185
		bodyModel[63] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 67
		bodyModel[64] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 68
		bodyModel[65] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 69
		bodyModel[66] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 70
		bodyModel[67] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 71

		bodyModel[0].addShapeBox(0F, -1.5F, -1.5F, 0, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 130 rod gear
		bodyModel[0].setRotationPoint(7F, 6F, 0F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[1].setRotationPoint(4.5F, 7F, 5.5F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[2].setRotationPoint(-4.5F, 7F, 5.5F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[3].setRotationPoint(-4.5F, 7F, -5.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[4].setRotationPoint(4.5F, 7F, -5.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 4 axle
		bodyModel[5].setRotationPoint(-5.5F, 6F, -8.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 24 axle
		bodyModel[6].setRotationPoint(3.5F, 6F, -8.5F);

		bodyModel[7].addShapeBox(0F, -1.5F, -1.5F, 0, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 130 rod gear
		bodyModel[7].setRotationPoint(-7F, 6F, 0F);

		bodyModel[8].addShapeBox(0F, -0.5F, -0.5F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239 rod
		bodyModel[8].setRotationPoint(-7.5F, 6F, 0F);
		bodyModel[8].rotateAngleX = 0.78539816F;

		bodyModel[9].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 154 wheel gear
		bodyModel[9].setRotationPoint(-4.5F, 7F, 1.25F);

		bodyModel[10].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 62 wheel gear
		bodyModel[10].setRotationPoint(4.5F, 7F, -1.25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 116
		bodyModel[11].setRotationPoint(3.5F, 6F, 8.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 69
		bodyModel[12].setRotationPoint(-5.5F, 6F, 8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[13].setRotationPoint(3.5F, 6F, -9.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[14].setRotationPoint(-5.5F, 6F, -9.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 26
		bodyModel[15].setRotationPoint(-1F, 7.5F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 71
		bodyModel[16].setRotationPoint(-1F, 4.5F, -8.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[17].setRotationPoint(-1.1F, 4F, -7.74F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[18].setRotationPoint(0.100000000000001F, 4F, -7.74F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		bodyModel[19].setRotationPoint(-1.5F, 4.5F, -8.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 52
		bodyModel[20].setRotationPoint(0.5F, 4.5F, -8.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[21].setRotationPoint(-6.5F, 7.5F, -8.25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 276
		bodyModel[22].setRotationPoint(-8F, 4F, -8.25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 277
		bodyModel[23].setRotationPoint(-3F, 4.5F, -8.25F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 283
		bodyModel[24].setRotationPoint(-3.75F, 4.5F, -8.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 287
		bodyModel[25].setRotationPoint(-6.25F, 4.5F, -8.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 288
		bodyModel[26].setRotationPoint(-5F, 3F, -7.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 289
		bodyModel[27].setRotationPoint(-7.25F, 4.5F, -8.25F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 0, 13, 0F); // Box 291
		bodyModel[28].setRotationPoint(-8F, 4F, -6.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 108
		bodyModel[29].setRotationPoint(-8.5F, 8F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 293
		bodyModel[30].setRotationPoint(-8.5F, 6F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 294
		bodyModel[31].setRotationPoint(-9F, 7.5F, -5.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 0, 13, 0F); // Box 295
		bodyModel[32].setRotationPoint(7F, 4F, -6.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 296
		bodyModel[33].setRotationPoint(5.25F, 4.5F, -8.25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 297
		bodyModel[34].setRotationPoint(2.75F, 4.5F, -8.25F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 298
		bodyModel[35].setRotationPoint(4F, 3F, -7.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 299
		bodyModel[36].setRotationPoint(2F, 4.5F, -8.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 300
		bodyModel[37].setRotationPoint(6.25F, 4.5F, -8.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 301
		bodyModel[38].setRotationPoint(-1F, 4.5F, -6.25F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 39
		bodyModel[39].setRotationPoint(6.25F, 4.5F, 6.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[40].setRotationPoint(-6.5F, 7.5F, 6.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[41].setRotationPoint(5.25F, 4.5F, 6.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 42
		bodyModel[42].setRotationPoint(2.75F, 4.5F, 6.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 43
		bodyModel[43].setRotationPoint(2F, 4.5F, 6.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 44
		bodyModel[44].setRotationPoint(0.5F, 4.5F, 6.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		bodyModel[45].setRotationPoint(-1.5F, 4.5F, 6.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 46
		bodyModel[46].setRotationPoint(-3F, 4.5F, 6.25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 47
		bodyModel[47].setRotationPoint(-3.75F, 4.5F, 6.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 48
		bodyModel[48].setRotationPoint(-6.25F, 4.5F, 6.25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 49
		bodyModel[49].setRotationPoint(-7.25F, 4.5F, 6.25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 50
		bodyModel[50].setRotationPoint(-8F, 4F, 6.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[51].setRotationPoint(-1F, 4.5F, 2.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[52].setRotationPoint(-1F, 4.5F, 6.75F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 5, 13, 0F); // Box 290
		bodyModel[53].setRotationPoint(-8F, 4F, -6.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 56
		bodyModel[54].setRotationPoint(-8.5F, 8F, 5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 57
		bodyModel[55].setRotationPoint(-8.5F, 6F, 5F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 5, 13, 0F); // Box 58
		bodyModel[56].setRotationPoint(8F, 4F, -6.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 59
		bodyModel[57].setRotationPoint(7.5F, 6F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 60
		bodyModel[58].setRotationPoint(7.5F, 8F, -6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 61
		bodyModel[59].setRotationPoint(7.5F, 8F, 5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 62
		bodyModel[60].setRotationPoint(7.5F, 6F, 5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[61].setRotationPoint(8F, 7.5F, -5.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 185
		bodyModel[62].setRotationPoint(-2F, 3.5F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 67
		bodyModel[63].setRotationPoint(-5F, 3F, 6.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 68
		bodyModel[64].setRotationPoint(4F, 3F, 6.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 69
		bodyModel[65].setRotationPoint(-1F, 7.5F, 6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 70
		bodyModel[66].setRotationPoint(0.100000000000001F, 4F, 5.74F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 71
		bodyModel[67].setRotationPoint(-1.1F, 4F, 5.74F);
	}
}