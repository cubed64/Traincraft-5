//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.05.2021 - 23:09:26
// Last changed on: 08.05.2021 - 23:09:26

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelPRECO_Truck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelPRECO_Truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[66];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 79
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 79
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 380
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 381
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2 wheel
		bodyModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 79 axle
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 79 axle
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 79
		bodyModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 79
		bodyModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2 wheel
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 72
		bodyModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 73
		bodyModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 74
		bodyModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 17
		bodyModel[19] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 334
		bodyModel[20] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 335
		bodyModel[21] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 336
		bodyModel[22] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 337
		bodyModel[23] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 17
		bodyModel[24] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 17
		bodyModel[25] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 17
		bodyModel[26] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 17
		bodyModel[27] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 17
		bodyModel[28] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 83
		bodyModel[29] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 84
		bodyModel[30] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 85
		bodyModel[31] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 86
		bodyModel[32] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 347
		bodyModel[33] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 83
		bodyModel[34] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 83
		bodyModel[35] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 351
		bodyModel[36] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 352
		bodyModel[37] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 74
		bodyModel[38] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 74
		bodyModel[39] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 74
		bodyModel[40] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 74
		bodyModel[41] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 365
		bodyModel[42] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 366
		bodyModel[43] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 74
		bodyModel[44] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 74
		bodyModel[45] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 365
		bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 366
		bodyModel[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 17
		bodyModel[48] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 74
		bodyModel[49] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 386
		bodyModel[50] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 117
		bodyModel[51] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 442
		bodyModel[52] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 442
		bodyModel[53] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 442
		bodyModel[54] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 74
		bodyModel[55] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 117
		bodyModel[56] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 117
		bodyModel[57] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 117
		bodyModel[58] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 399
		bodyModel[59] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 117
		bodyModel[60] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 442
		bodyModel[61] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 442
		bodyModel[62] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 442
		bodyModel[63] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 117
		bodyModel[64] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 117
		bodyModel[65] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 117

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[0].setRotationPoint(-6.5F, 7F, -6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[1].setRotationPoint(6.5F, 7F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[2].setRotationPoint(5.75F, 6.25F, 8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[3].setRotationPoint(-7.25F, 6.25F, 8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 380
		bodyModel[4].setRotationPoint(5.75F, 6.25F, -9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 381
		bodyModel[5].setRotationPoint(-7.25F, 6.25F, -9.5F);

		bodyModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[6].setRotationPoint(-6.5F, 7F, 6F);

		bodyModel[7].addBox(-1F, -1F, 0F, 2, 2, 14, 0F); // Box 79 axle
		bodyModel[7].setRotationPoint(-6.5F, 7F, -7F);

		bodyModel[8].addBox(-1F, -1F, 0F, 2, 2, 14, 0F); // Box 79 axle
		bodyModel[8].setRotationPoint(6.5F, 7F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[9].setRotationPoint(5.5F, 6F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[10].setRotationPoint(-7.5F, 6F, 7F);

		bodyModel[11].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[11].setRotationPoint(6.5F, 7F, 6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 72
		bodyModel[12].setRotationPoint(5.5F, 6F, -8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 73
		bodyModel[13].setRotationPoint(-7.5F, 6F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[14].setRotationPoint(-8.75F, 4F, -8.25F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 2
		bodyModel[15].setRotationPoint(-2F, 3.5F, -7.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-1.5F, 4F, -7.25F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-1.5F, 4F, -3.25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[18].setRotationPoint(-1.5F, 6F, -4.25F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 334
		bodyModel[19].setRotationPoint(-2F, 3.5F, 3.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[20].setRotationPoint(-1.5F, 4F, 3.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[21].setRotationPoint(-1.5F, 4F, 2.25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 337
		bodyModel[22].setRotationPoint(-1.5F, 6F, 3.25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 17
		bodyModel[23].setRotationPoint(-1.5F, 6F, -3.25F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 17
		bodyModel[24].setRotationPoint(7.25F, 6F, 7.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 17
		bodyModel[25].setRotationPoint(4.75F, 6F, 7.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 17
		bodyModel[26].setRotationPoint(-5.75F, 6F, 7.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 17
		bodyModel[27].setRotationPoint(-8.25F, 6F, 7.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 83
		bodyModel[28].setRotationPoint(7.25F, 6F, -8.25F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 84
		bodyModel[29].setRotationPoint(4.75F, 6F, -8.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 85
		bodyModel[30].setRotationPoint(-5.75F, 6F, -8.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 86
		bodyModel[31].setRotationPoint(-8.25F, 6F, -8.25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[32].setRotationPoint(-8.75F, 4F, 7.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[33].setRotationPoint(5.5F, 8.5F, -8.25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[34].setRotationPoint(-7.5F, 8.5F, -8.25F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[35].setRotationPoint(5.5F, 8.5F, 7.25F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[36].setRotationPoint(-7.5F, 8.5F, 7.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[37].setRotationPoint(8.75F, 4F, -8.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -2F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -2F, 0F, -1.55F, 0.35F, 0F, 1.25F, -0.325F, 0F, 1.25F, -0.325F, 0F, -1.55F, 0.35F, 0F); // Box 74
		bodyModel[38].setRotationPoint(8.75F, 4F, -8.25F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,-0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F); // Box 74
		bodyModel[39].setRotationPoint(9.6F, 6.67F, -7.25F);
		bodyModel[39].rotateAngleZ = 0.78539816F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,-0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F); // Box 74
		bodyModel[40].setRotationPoint(-10.3F, 5.97F, -7.25F);
		bodyModel[40].rotateAngleZ = -0.78539816F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[41].setRotationPoint(8.75F, 4F, 7.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -2F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -2F, 0F, -1.55F, 0.35F, 0F, 1.25F, -0.325F, 0F, 1.25F, -0.325F, 0F, -1.55F, 0.35F, 0F); // Box 366
		bodyModel[42].setRotationPoint(8.75F, 4F, 7.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 74
		bodyModel[43].setRotationPoint(-9.75F, 4F, -8.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.75F, 0F, 0F, 1.25F, -0.325F, 0F, -1.55F, 0.35F, 0F, -1.55F, 0.35F, 0F, 1.25F, -0.325F, 0F); // Box 74
		bodyModel[44].setRotationPoint(-9.75F, 4F, -8.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 365
		bodyModel[45].setRotationPoint(-9.75F, 4F, 7.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.75F, 0F, 0F, 1.25F, -0.325F, 0F, -1.55F, 0.35F, 0F, -1.55F, 0.35F, 0F, 1.25F, -0.325F, 0F); // Box 366
		bodyModel[46].setRotationPoint(-9.75F, 4F, 7.25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 17
		bodyModel[47].setRotationPoint(-1.5F, 5F, -1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[48].setRotationPoint(-0.75F, 3F, -8.25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[49].setRotationPoint(-0.75F, 3F, 7.25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 117
		bodyModel[50].setRotationPoint(-2.25F, 7.12F, -7.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 442
		bodyModel[51].setRotationPoint(-0.5F, 6.67F, -7.75F);
		bodyModel[51].rotateAngleX = -0.78539816F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.5F, -0.375F, 0.125F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 442
		bodyModel[52].setRotationPoint(-1F, 7.02F, -7.75F);
		bodyModel[52].rotateAngleX = -0.78539816F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, 0F, -0.375F, 0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 442
		bodyModel[53].setRotationPoint(2.75F, 7.02F, -7.75F);
		bodyModel[53].rotateAngleX = -0.78539816F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74
		bodyModel[54].setRotationPoint(-1F, 6F, -8.25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.2F, 0.275F, -0.25F, 0.2F, 0.275F, -0.25F, 0.2F, -0.275F, -0.25F, 0.2F, -0.275F); // Box 117
		bodyModel[55].setRotationPoint(-2.5F, 6F, -7.25F);
		bodyModel[55].rotateAngleX = -0.19198622F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 117
		bodyModel[56].setRotationPoint(1F, 7.12F, -7.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.2F, 0.275F, -0.25F, 0.2F, 0.275F, -0.25F, 0.2F, -0.275F, -0.25F, 0.2F, -0.275F); // Box 117
		bodyModel[57].setRotationPoint(1.25F, 6F, -7.25F);
		bodyModel[57].rotateAngleX = -0.19198622F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 399
		bodyModel[58].setRotationPoint(-1F, 6F, 7.25F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 117
		bodyModel[59].setRotationPoint(1F, 7.12F, 7.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 442
		bodyModel[60].setRotationPoint(-1F, 6.67F, 7.75F);
		bodyModel[60].rotateAngleX = -0.78539816F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.5F, -0.375F, 0.125F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 442
		bodyModel[61].setRotationPoint(0.5F, 7.02F, 7.75F);
		bodyModel[61].rotateAngleX = -0.78539816F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, 0F, -0.375F, 0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 442
		bodyModel[62].setRotationPoint(-3.75F, 7.02F, 7.75F);
		bodyModel[62].rotateAngleX = -0.78539816F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.2F, -0.275F, -0.25F, 0.2F, -0.275F, -0.25F, 0.2F, 0.275F, -0.25F, 0.2F, 0.275F); // Box 117
		bodyModel[63].setRotationPoint(-2.25F, 6F, 7.25F);
		bodyModel[63].rotateAngleX = 0.19198622F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 117
		bodyModel[64].setRotationPoint(-2.75F, 7.12F, 7.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.2F, -0.275F, -0.25F, 0.2F, -0.275F, -0.25F, 0.2F, 0.275F, -0.25F, 0.2F, 0.275F); // Box 117
		bodyModel[65].setRotationPoint(1.5F, 6F, 7.25F);
		bodyModel[65].rotateAngleX = 0.19198622F;
	}
}