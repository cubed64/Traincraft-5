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

public class ModelSMT_PS_Truck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelSMT_PS_Truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[96];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 79 axle
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 79 axle
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 79
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 79
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 79
		bodyModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 17
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 79
		bodyModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 17
		bodyModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 17
		bodyModel[20] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 17
		bodyModel[21] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 17
		bodyModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17
		bodyModel[23] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 17
		bodyModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 66
		bodyModel[25] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 37
		bodyModel[26] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 37
		bodyModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 66
		bodyModel[29] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 68
		bodyModel[30] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 68
		bodyModel[31] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 144
		bodyModel[32] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 144
		bodyModel[33] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 144
		bodyModel[34] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 144
		bodyModel[35] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 79
		bodyModel[36] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 79
		bodyModel[37] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 79
		bodyModel[38] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 79
		bodyModel[39] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 526
		bodyModel[40] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 527
		bodyModel[41] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 82
		bodyModel[42] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 79
		bodyModel[43] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 79
		bodyModel[44] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 79
		bodyModel[45] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 79
		bodyModel[46] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 526
		bodyModel[47] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 527
		bodyModel[48] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 80
		bodyModel[49] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 37
		bodyModel[50] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 37
		bodyModel[51] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 37
		bodyModel[52] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 17
		bodyModel[53] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 2
		bodyModel[54] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 17
		bodyModel[55] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 17
		bodyModel[56] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 467
		bodyModel[57] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 468
		bodyModel[58] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 469
		bodyModel[59] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 470
		bodyModel[60] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 471
		bodyModel[61] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 472
		bodyModel[62] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 473
		bodyModel[63] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 474
		bodyModel[64] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 475
		bodyModel[65] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 476
		bodyModel[66] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 477
		bodyModel[67] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 478
		bodyModel[68] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 479
		bodyModel[69] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 480
		bodyModel[70] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 481
		bodyModel[71] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 482
		bodyModel[72] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 483
		bodyModel[73] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 484
		bodyModel[74] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 485
		bodyModel[75] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 486
		bodyModel[76] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 487
		bodyModel[77] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 488
		bodyModel[78] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 489
		bodyModel[79] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 490
		bodyModel[80] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 491
		bodyModel[81] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 492
		bodyModel[82] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 493
		bodyModel[83] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 494
		bodyModel[84] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 495
		bodyModel[85] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 496
		bodyModel[86] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 497
		bodyModel[87] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 498
		bodyModel[88] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 499
		bodyModel[89] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 79
		bodyModel[90] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 79
		bodyModel[91] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 79
		bodyModel[92] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 268
		bodyModel[93] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 269
		bodyModel[94] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 270
		bodyModel[95] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 79

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[0].setRotationPoint(-6F, 7F, -6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[1].setRotationPoint(6F, 7F, -6F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[2].setRotationPoint(-6F, 7F, 6F);

		bodyModel[3].addBox(-1F, -1F, 0F, 2, 2, 13, 0F); // Box 79 axle
		bodyModel[3].setRotationPoint(-6F, 7F, -6.5F);

		bodyModel[4].addBox(-1F, -1F, 0F, 2, 2, 13, 0F); // Box 79 axle
		bodyModel[4].setRotationPoint(6F, 7F, -6.5F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[5].setRotationPoint(6F, 7F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[6].setRotationPoint(5.25F, 6.25F, 8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[7].setRotationPoint(-6.75F, 6.25F, 8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 17
		bodyModel[8].setRotationPoint(6.75F, 5.25F, 6.75F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 79
		bodyModel[9].setRotationPoint(-7F, 6F, 6.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 17
		bodyModel[10].setRotationPoint(4.25F, 5.25F, 6.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 17
		bodyModel[11].setRotationPoint(-5.25F, 5.25F, 6.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 17
		bodyModel[12].setRotationPoint(-7.75F, 5.25F, 6.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[13].setRotationPoint(-8.5F, 4.25F, 6.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[14].setRotationPoint(5F, 5.5F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-6.5F, 5.5F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-3.5F, 7.75F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(3.5F, 7.75F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[18].setRotationPoint(3.25F, 7.25F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.55F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 17
		bodyModel[19].setRotationPoint(3.75F, 5.5F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[20].setRotationPoint(-4.5F, 7.75F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[21].setRotationPoint(-4.5F, 7.25F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 17
		bodyModel[22].setRotationPoint(-4.75F, 5.5F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 17
		bodyModel[23].setRotationPoint(-1.5F, 7.25F, 6.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 66
		bodyModel[24].setRotationPoint(-2F, 5F, 6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F); // Box 37
		bodyModel[25].setRotationPoint(-2F, 6.1F, 7.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F); // Box 37
		bodyModel[26].setRotationPoint(-2F, 5.4F, 7.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0.25F, -0.5F, -0.35F, 0.25F, -0.5F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0.25F, -0.5F, -0.35F, 0.25F); // Box 37
		bodyModel[27].setRotationPoint(-2F, 5.75F, 7.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 66
		bodyModel[28].setRotationPoint(-2F, 6.5F, 6.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 68
		bodyModel[29].setRotationPoint(-7F, 6F, 8.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 68
		bodyModel[30].setRotationPoint(5F, 6F, 8.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 144
		bodyModel[31].setRotationPoint(2.75F, 4.75F, 6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 144
		bodyModel[32].setRotationPoint(2.75F, 7.25F, 6.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 144
		bodyModel[33].setRotationPoint(-3.75F, 4.75F, 6.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 144
		bodyModel[34].setRotationPoint(-3.75F, 7.25F, 6.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[35].setRotationPoint(8.5F, 4.25F, 6.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[36].setRotationPoint(8.5F, 4.25F, 4.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[37].setRotationPoint(8.5F, 5.25F, 4.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[38].setRotationPoint(8.5F, 6.25F, -4.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[39].setRotationPoint(8.5F, 4.25F, -6.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[40].setRotationPoint(8.5F, 5.25F, -5.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[41].setRotationPoint(8.5F, 4.25F, -8.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 79
		bodyModel[42].setRotationPoint(-9.5F, 4.25F, 6.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[43].setRotationPoint(-9F, 4.25F, 4.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[44].setRotationPoint(-9F, 5.25F, 4.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[45].setRotationPoint(-9F, 6.25F, -4.75F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[46].setRotationPoint(-9F, 4.25F, -6.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[47].setRotationPoint(-9F, 5.25F, -5.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 80
		bodyModel[48].setRotationPoint(-9.5F, 4.25F, -8.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F); // Box 37
		bodyModel[49].setRotationPoint(-2F, 6.1F, 5.25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F); // Box 37
		bodyModel[50].setRotationPoint(-2F, 5.4F, 5.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.35F, 0.25F, -0.5F, -0.35F, 0.25F, -0.5F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0.25F, -0.5F, -0.35F, 0.25F, -0.5F, -0.23F, 0F, -0.5F, -0.23F, 0F); // Box 37
		bodyModel[51].setRotationPoint(-2F, 5.75F, 4.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[52].setRotationPoint(-1.5F, 4.75F, -6.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 2
		bodyModel[53].setRotationPoint(-1F, 4.5F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 17
		bodyModel[54].setRotationPoint(1.5F, 5F, -6.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 17
		bodyModel[55].setRotationPoint(-2.5F, 5F, -6.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 467
		bodyModel[56].setRotationPoint(5.25F, 6.25F, -9.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 468
		bodyModel[57].setRotationPoint(-6.75F, 6.25F, -9.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 469
		bodyModel[58].setRotationPoint(6.75F, 5.25F, -8.75F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 470
		bodyModel[59].setRotationPoint(5F, 6F, -8.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 471
		bodyModel[60].setRotationPoint(-7F, 6F, -8.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 472
		bodyModel[61].setRotationPoint(4.25F, 5.25F, -8.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 473
		bodyModel[62].setRotationPoint(-5.25F, 5.25F, -8.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 474
		bodyModel[63].setRotationPoint(-7.75F, 5.25F, -8.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		bodyModel[64].setRotationPoint(-8.5F, 4.25F, -8.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 476
		bodyModel[65].setRotationPoint(5F, 5.5F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 477
		bodyModel[66].setRotationPoint(-6.5F, 5.5F, -8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		bodyModel[67].setRotationPoint(-3.5F, 7.75F, -8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[68].setRotationPoint(3.5F, 7.75F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 480
		bodyModel[69].setRotationPoint(3.25F, 7.25F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.55F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 481
		bodyModel[70].setRotationPoint(3.75F, 5.5F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 482
		bodyModel[71].setRotationPoint(-4.5F, 7.75F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 483
		bodyModel[72].setRotationPoint(-4.5F, 7.25F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 484
		bodyModel[73].setRotationPoint(-4.75F, 5.5F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 485
		bodyModel[74].setRotationPoint(-1.5F, 7.25F, -7.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 486
		bodyModel[75].setRotationPoint(-2F, 5F, -8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F); // Box 487
		bodyModel[76].setRotationPoint(-2F, 6.1F, -9.25F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F); // Box 488
		bodyModel[77].setRotationPoint(-2F, 5.4F, -9.25F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.35F, 0.25F, -0.5F, -0.35F, 0.25F, -0.5F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0.25F, -0.5F, -0.35F, 0.25F, -0.5F, -0.23F, 0F, -0.5F, -0.23F, 0F); // Box 489
		bodyModel[78].setRotationPoint(-2F, 5.75F, -9.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 490
		bodyModel[79].setRotationPoint(-2F, 6.5F, -8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[80].setRotationPoint(-7F, 6F, -9.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[81].setRotationPoint(5F, 6F, -9.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 493
		bodyModel[82].setRotationPoint(2.75F, 4.75F, -8.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 494
		bodyModel[83].setRotationPoint(2.75F, 7.25F, -8.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 495
		bodyModel[84].setRotationPoint(-3.75F, 4.75F, -8.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 496
		bodyModel[85].setRotationPoint(-3.75F, 7.25F, -8.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F); // Box 497
		bodyModel[86].setRotationPoint(-2F, 6.1F, -7.25F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F); // Box 498
		bodyModel[87].setRotationPoint(-2F, 5.4F, -7.25F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0.25F, -0.5F, -0.35F, 0.25F, -0.5F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0.25F, -0.5F, -0.35F, 0.25F); // Box 499
		bodyModel[88].setRotationPoint(-2F, 5.75F, -6.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 79
		bodyModel[89].setRotationPoint(-2.5F, 4F, 6.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 79
		bodyModel[90].setRotationPoint(2.5F, 4F, 6.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 79
		bodyModel[91].setRotationPoint(-6.5F, 4F, 6.75F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 268
		bodyModel[92].setRotationPoint(-2.5F, 4F, -8.75F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 269
		bodyModel[93].setRotationPoint(2.5F, 4F, -8.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 270
		bodyModel[94].setRotationPoint(-6.5F, 4F, -8.75F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 79
		bodyModel[95].setRotationPoint(5F, 6F, 6.5F);
	}
}