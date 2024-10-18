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

public class ModelCN_6Wheel_LightweightTruck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelCN_6Wheel_LightweightTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[163];

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
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 79 axle
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 79
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 79
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2 wheel
		bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 72
		bodyModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 73
		bodyModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 2 wheel
		bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 79
		bodyModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 381
		bodyModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 2 wheel
		bodyModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 79 axle
		bodyModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 79
		bodyModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 73
		bodyModel[21] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 410
		bodyModel[22] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 411
		bodyModel[23] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 413
		bodyModel[24] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 414
		bodyModel[25] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 415
		bodyModel[26] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 416
		bodyModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 417
		bodyModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 418
		bodyModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 420
		bodyModel[30] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 421
		bodyModel[31] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 422
		bodyModel[32] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 423
		bodyModel[33] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 424
		bodyModel[34] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 425
		bodyModel[35] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 427
		bodyModel[36] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 428
		bodyModel[37] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 429
		bodyModel[38] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 430
		bodyModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 432
		bodyModel[40] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 337
		bodyModel[41] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 337
		bodyModel[42] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 337
		bodyModel[43] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 420
		bodyModel[44] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 422
		bodyModel[45] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 337
		bodyModel[46] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 434
		bodyModel[47] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 337
		bodyModel[48] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 337
		bodyModel[49] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 337
		bodyModel[50] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 419
		bodyModel[51] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 422
		bodyModel[52] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 337
		bodyModel[53] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 420
		bodyModel[54] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 421
		bodyModel[55] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 420
		bodyModel[56] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 420
		bodyModel[57] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 456
		bodyModel[58] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 457
		bodyModel[59] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 458
		bodyModel[60] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 460
		bodyModel[61] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 463
		bodyModel[62] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 464
		bodyModel[63] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 466
		bodyModel[64] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 467
		bodyModel[65] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 446
		bodyModel[66] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 447
		bodyModel[67] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 448
		bodyModel[68] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 449
		bodyModel[69] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 450
		bodyModel[70] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 451
		bodyModel[71] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 452
		bodyModel[72] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 144
		bodyModel[73] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 144
		bodyModel[74] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 446
		bodyModel[75] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 447
		bodyModel[76] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 448
		bodyModel[77] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 449
		bodyModel[78] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 450
		bodyModel[79] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 451
		bodyModel[80] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 452
		bodyModel[81] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 144
		bodyModel[82] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 144
		bodyModel[83] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 37
		bodyModel[84] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 37
		bodyModel[85] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 37
		bodyModel[86] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 37
		bodyModel[87] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 37
		bodyModel[88] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 37
		bodyModel[89] = new ModelRendererTurbo(this, 114, 16, textureX, textureY); // Box 5
		bodyModel[90] = new ModelRendererTurbo(this, 153, 16, textureX, textureY); // Box 5
		bodyModel[91] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 5
		bodyModel[92] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 2
		bodyModel[93] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 538
		bodyModel[94] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 442
		bodyModel[95] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 442
		bodyModel[96] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 537
		bodyModel[97] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 537
		bodyModel[98] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 537
		bodyModel[99] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 537
		bodyModel[100] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 538
		bodyModel[101] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 511
		bodyModel[102] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 512
		bodyModel[103] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 513
		bodyModel[104] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 514
		bodyModel[105] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 515
		bodyModel[106] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 516
		bodyModel[107] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 517
		bodyModel[108] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 518
		bodyModel[109] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 519
		bodyModel[110] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 520
		bodyModel[111] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 521
		bodyModel[112] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 522
		bodyModel[113] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 523
		bodyModel[114] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 524
		bodyModel[115] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 525
		bodyModel[116] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 526
		bodyModel[117] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 527
		bodyModel[118] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 528
		bodyModel[119] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 529
		bodyModel[120] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 530
		bodyModel[121] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 531
		bodyModel[122] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 532
		bodyModel[123] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 533
		bodyModel[124] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 534
		bodyModel[125] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 535
		bodyModel[126] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 536
		bodyModel[127] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 537
		bodyModel[128] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 538
		bodyModel[129] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 539
		bodyModel[130] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 540
		bodyModel[131] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 541
		bodyModel[132] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 542
		bodyModel[133] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 543
		bodyModel[134] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 544
		bodyModel[135] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 545
		bodyModel[136] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 546
		bodyModel[137] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 547
		bodyModel[138] = new ModelRendererTurbo(this, 193, 22, textureX, textureY); // Box 548
		bodyModel[139] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 549
		bodyModel[140] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 550
		bodyModel[141] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 551
		bodyModel[142] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 552
		bodyModel[143] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 553
		bodyModel[144] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 554
		bodyModel[145] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 555
		bodyModel[146] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 556
		bodyModel[147] = new ModelRendererTurbo(this, 313, 22, textureX, textureY); // Box 557
		bodyModel[148] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 558
		bodyModel[149] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 559
		bodyModel[150] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 560
		bodyModel[151] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 561
		bodyModel[152] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 562
		bodyModel[153] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 563
		bodyModel[154] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 564
		bodyModel[155] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 565
		bodyModel[156] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 566
		bodyModel[157] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 567
		bodyModel[158] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 568
		bodyModel[159] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 569
		bodyModel[160] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 570
		bodyModel[161] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 442
		bodyModel[162] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 442

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[0].setRotationPoint(0F, 7F, -6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[1].setRotationPoint(9.5F, 7F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[2].setRotationPoint(8.75F, 6.25F, 8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[3].setRotationPoint(-0.75F, 6.25F, 8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 380
		bodyModel[4].setRotationPoint(8.75F, 6.25F, -9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 381
		bodyModel[5].setRotationPoint(-0.75F, 6.25F, -9.5F);

		bodyModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[6].setRotationPoint(0F, 7F, 6F);

		bodyModel[7].addBox(-1F, -1F, 0F, 2, 2, 13, 0F); // Box 79 axle
		bodyModel[7].setRotationPoint(0F, 7F, -6.5F);

		bodyModel[8].addBox(-1F, -1F, 0F, 2, 2, 13, 0F); // Box 79 axle
		bodyModel[8].setRotationPoint(9.5F, 7F, -6.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 79
		bodyModel[9].setRotationPoint(8.5F, 6F, 6.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 79
		bodyModel[10].setRotationPoint(-1F, 6F, 6.5F);

		bodyModel[11].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[11].setRotationPoint(9.5F, 7F, 6F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 72
		bodyModel[12].setRotationPoint(8.5F, 6F, -8.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 73
		bodyModel[13].setRotationPoint(-1F, 6F, -8.5F);

		bodyModel[14].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[14].setRotationPoint(-9.5F, 7F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[15].setRotationPoint(-10.25F, 6.25F, 8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 381
		bodyModel[16].setRotationPoint(-10.25F, 6.25F, -9.5F);

		bodyModel[17].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[17].setRotationPoint(-9.5F, 7F, 6F);

		bodyModel[18].addBox(-1F, -1F, 0F, 2, 2, 13, 0F); // Box 79 axle
		bodyModel[18].setRotationPoint(-9.5F, 7F, -6.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 79
		bodyModel[19].setRotationPoint(-10.5F, 6F, 6.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 73
		bodyModel[20].setRotationPoint(-10.5F, 6F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[21].setRotationPoint(-10.5F, 8.5F, 6.25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 411
		bodyModel[22].setRotationPoint(-10F, 5.5F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 413
		bodyModel[23].setRotationPoint(-12.25F, 5.5F, 6.25F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 414
		bodyModel[24].setRotationPoint(-8.5F, 5.5F, 6.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 415
		bodyModel[25].setRotationPoint(-11.5F, 6F, 6.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 416
		bodyModel[26].setRotationPoint(-8.5F, 6F, 6.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[27].setRotationPoint(-1F, 8.5F, 6.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 418
		bodyModel[28].setRotationPoint(-1F, 5.5F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 420
		bodyModel[29].setRotationPoint(-2.75F, 5.5F, 6.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 421
		bodyModel[30].setRotationPoint(1F, 5.5F, 6.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 422
		bodyModel[31].setRotationPoint(-2F, 6F, 6.25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 423
		bodyModel[32].setRotationPoint(1F, 6F, 6.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[33].setRotationPoint(8.5F, 8.5F, 6.25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 425
		bodyModel[34].setRotationPoint(8.5F, 5.5F, 6.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 427
		bodyModel[35].setRotationPoint(6.75F, 5.5F, 6.25F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 428
		bodyModel[36].setRotationPoint(10.5F, 5.5F, 6.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 429
		bodyModel[37].setRotationPoint(7.5F, 6F, 6.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[38].setRotationPoint(10.5F, 6F, 6.25F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 25, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 432
		bodyModel[39].setRotationPoint(-12.25F, 4.5F, 6.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[40].setRotationPoint(-13.25F, 4.5F, -8.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[41].setRotationPoint(-13.25F, 4.5F, -6.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 337
		bodyModel[42].setRotationPoint(-13.25F, 4.5F, -5.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 420
		bodyModel[43].setRotationPoint(-13.25F, 4.5F, 5.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 422
		bodyModel[44].setRotationPoint(-13.25F, 4.5F, 4.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[45].setRotationPoint(-13.25F, 6.5F, -4.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 434
		bodyModel[46].setRotationPoint(-13.25F, 4.5F, 6.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[47].setRotationPoint(12.25F, 4.5F, -8.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[48].setRotationPoint(12.25F, 4.5F, -6.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 337
		bodyModel[49].setRotationPoint(12.25F, 4.5F, -5.25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 419
		bodyModel[50].setRotationPoint(12.25F, 4.5F, 6.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[51].setRotationPoint(12.25F, 4.5F, 4.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[52].setRotationPoint(12.25F, 6.5F, -4.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 420
		bodyModel[53].setRotationPoint(12.25F, 4.5F, 5.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[54].setRotationPoint(1.75F, 3.5F, 6.25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[55].setRotationPoint(-2.5F, 3.5F, 6.25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[56].setRotationPoint(-1.75F, 3.5F, 6.25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 456
		bodyModel[57].setRotationPoint(-6.75F, 8F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, -0.25F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 457
		bodyModel[58].setRotationPoint(-8.25F, 7.5F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Box 458
		bodyModel[59].setRotationPoint(-8F, 8F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.25F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F); // Box 460
		bodyModel[60].setRotationPoint(-2.25F, 6.25F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0.5F, -1.5F, 0F); // Box 463
		bodyModel[61].setRotationPoint(7.25F, 7.5F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 464
		bodyModel[62].setRotationPoint(6F, 8F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 466
		bodyModel[63].setRotationPoint(3.25F, 8F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F); // Box 467
		bodyModel[64].setRotationPoint(1.25F, 6.25F, 7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 446
		bodyModel[65].setRotationPoint(3.5F, 5.63F, 6.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 447
		bodyModel[66].setRotationPoint(3.5F, 7.13F, 6.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 448
		bodyModel[67].setRotationPoint(3.5F, 6.73F, 7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 449
		bodyModel[68].setRotationPoint(3.5F, 6.03F, 7.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 450
		bodyModel[69].setRotationPoint(3.5F, 6.38F, 8.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, -0.5F, -0.5F, -0.58F, -0.5F, -0.5F, -0.58F, 0F, 0F, -0.58F, 0F); // Box 451
		bodyModel[70].setRotationPoint(3.5F, 7.88F, 6.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.62F, -0.5F, -0.5F, -0.62F, -0.5F, -0.5F, -0.62F, 0F, 0F, -0.62F, 0F); // Box 452
		bodyModel[71].setRotationPoint(3.5F, 5.5F, 6.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.01F, -0.5F, -0.01F, -0.51F, -0.5F, -0.01F, -0.51F, -0.5F, -0.51F, -0.01F, -0.5F, -0.51F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 144
		bodyModel[72].setRotationPoint(5.5F, 5F, 6.75F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 144
		bodyModel[73].setRotationPoint(5.5F, 7.5F, 6.75F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 446
		bodyModel[74].setRotationPoint(-5F, 5.63F, 6.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 447
		bodyModel[75].setRotationPoint(-5F, 7.13F, 6.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 448
		bodyModel[76].setRotationPoint(-5F, 6.73F, 7.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 449
		bodyModel[77].setRotationPoint(-5F, 6.03F, 7.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 450
		bodyModel[78].setRotationPoint(-5F, 6.38F, 8.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, -0.5F, -0.5F, -0.58F, -0.5F, -0.5F, -0.58F, 0F, 0F, -0.58F, 0F); // Box 451
		bodyModel[79].setRotationPoint(-5F, 7.88F, 6.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.62F, -0.5F, -0.5F, -0.62F, -0.5F, -0.5F, -0.62F, 0F, 0F, -0.62F, 0F); // Box 452
		bodyModel[80].setRotationPoint(-5F, 5.5F, 6.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.01F, -0.5F, -0.01F, -0.51F, -0.5F, -0.01F, -0.51F, -0.5F, -0.51F, -0.01F, -0.5F, -0.51F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 144
		bodyModel[81].setRotationPoint(-7F, 5F, 6.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 144
		bodyModel[82].setRotationPoint(-7F, 7.5F, 6.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[83].setRotationPoint(3.5F, 6.73F, 5.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 37
		bodyModel[84].setRotationPoint(3.5F, 6.03F, 5.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 37
		bodyModel[85].setRotationPoint(3.5F, 6.38F, 4.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[86].setRotationPoint(-5F, 6.73F, 5.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 37
		bodyModel[87].setRotationPoint(-5F, 6.03F, 5.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 37
		bodyModel[88].setRotationPoint(-5F, 6.38F, 4.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[89].setRotationPoint(3.5F, 4.5F, -6.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[90].setRotationPoint(-5F, 4.5F, -6.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[91].setRotationPoint(-3.5F, 4.5F, -3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, -0.75F, 0.01F, 0.01F, -0.75F, 0.01F, 0.01F, -0.75F, 0.01F, 0.01F, -0.75F, 0.01F); // Box 2
		bodyModel[92].setRotationPoint(-1F, 4.25F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.495F, 0F, 0F, 0.495F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.495F, -0.75F, 0F, 0.495F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 538
		bodyModel[93].setRotationPoint(-12.75F, 4.7F, 8.26F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[94].setRotationPoint(-11.5F, 4.25F, 8.96F);
		bodyModel[94].rotateAngleX = -0.78539816F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 442
		bodyModel[95].setRotationPoint(-13.5F, 4.47F, 8.25F);
		bodyModel[95].rotateAngleX = -0.78539816F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.18F, 0F, 0F, -0.18F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.18F, 0F, 0F, -0.18F); // Box 537
		bodyModel[96].setRotationPoint(-9F, 4.95F, 8.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.8475F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.8475F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 537
		bodyModel[97].setRotationPoint(-9F, 4.95F, 8.82F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.65F, 0.15F, -0.05F, 0F, 0.15F, -0.05F, 0F, 0F, -0.75F, -0.5975F, 0F, -0.75F, -0.65F, -0.15F, -0.05F, 0F, -0.15F, -0.05F, 0F, 0F, -0.75F, -0.5975F, 0F, -0.75F); // Box 537
		bodyModel[98].setRotationPoint(-12.5F, 4.95F, 8.82F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.25F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[99].setRotationPoint(-12.15F, 4.95F, 8.07F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 538
		bodyModel[100].setRotationPoint(-14.25F, 4.57F, 8.25F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 511
		bodyModel[101].setRotationPoint(-10.5F, 8.5F, -8.25F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 512
		bodyModel[102].setRotationPoint(-10F, 5.5F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 513
		bodyModel[103].setRotationPoint(-12.25F, 5.5F, -8.25F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 514
		bodyModel[104].setRotationPoint(-8.5F, 5.5F, -8.25F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 515
		bodyModel[105].setRotationPoint(-11.5F, 6F, -8.25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 516
		bodyModel[106].setRotationPoint(-8.5F, 6F, -8.25F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 517
		bodyModel[107].setRotationPoint(-1F, 8.5F, -8.25F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 518
		bodyModel[108].setRotationPoint(-1F, 5.5F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 519
		bodyModel[109].setRotationPoint(-2.75F, 5.5F, -8.25F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 520
		bodyModel[110].setRotationPoint(1F, 5.5F, -8.25F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 521
		bodyModel[111].setRotationPoint(-2F, 6F, -8.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 522
		bodyModel[112].setRotationPoint(1F, 6F, -8.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 523
		bodyModel[113].setRotationPoint(8.5F, 8.5F, -8.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 524
		bodyModel[114].setRotationPoint(8.5F, 5.5F, -7.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 525
		bodyModel[115].setRotationPoint(6.75F, 5.5F, -8.25F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[116].setRotationPoint(10.5F, 5.5F, -8.25F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 527
		bodyModel[117].setRotationPoint(7.5F, 6F, -8.25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[118].setRotationPoint(10.5F, 6F, -8.25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 25, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[119].setRotationPoint(-12.25F, 4.5F, -8.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 530
		bodyModel[120].setRotationPoint(1.75F, 3.5F, -8.25F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 531
		bodyModel[121].setRotationPoint(-2.5F, 3.5F, -8.25F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[122].setRotationPoint(-1.75F, 3.5F, -8.25F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 533
		bodyModel[123].setRotationPoint(-6.75F, 8F, -8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, -0.25F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 534
		bodyModel[124].setRotationPoint(-8.25F, 7.5F, -8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Box 535
		bodyModel[125].setRotationPoint(-8F, 8F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.25F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F); // Box 536
		bodyModel[126].setRotationPoint(-2.25F, 6.25F, -8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0.5F, -1.5F, 0F); // Box 537
		bodyModel[127].setRotationPoint(7.25F, 7.5F, -8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 538
		bodyModel[128].setRotationPoint(6F, 8F, -8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 539
		bodyModel[129].setRotationPoint(3.25F, 8F, -8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F); // Box 540
		bodyModel[130].setRotationPoint(1.25F, 6.25F, -8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 541
		bodyModel[131].setRotationPoint(3.5F, 5.63F, -8.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 542
		bodyModel[132].setRotationPoint(3.5F, 7.13F, -8.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 543
		bodyModel[133].setRotationPoint(3.5F, 6.73F, -9.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 544
		bodyModel[134].setRotationPoint(3.5F, 6.03F, -9.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 545
		bodyModel[135].setRotationPoint(3.5F, 6.38F, -10.25F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.58F, 0F, -0.5F, -0.58F, 0F, -0.5F, -0.58F, -0.5F, 0F, -0.58F, -0.5F); // Box 546
		bodyModel[136].setRotationPoint(3.5F, 7.88F, -7.75F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.62F, 0F, -0.5F, -0.62F, 0F, -0.5F, -0.62F, -0.5F, 0F, -0.62F, -0.5F); // Box 547
		bodyModel[137].setRotationPoint(3.5F, 5.5F, -7.75F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.01F, -0.5F, -0.51F, -0.51F, -0.5F, -0.51F, -0.51F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, 0F, -4.5F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 548
		bodyModel[138].setRotationPoint(5.5F, 5F, -8.75F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 549
		bodyModel[139].setRotationPoint(5.5F, 7.5F, -8.75F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 550
		bodyModel[140].setRotationPoint(-5F, 5.63F, -8.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 551
		bodyModel[141].setRotationPoint(-5F, 7.13F, -8.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 552
		bodyModel[142].setRotationPoint(-5F, 6.73F, -9.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 553
		bodyModel[143].setRotationPoint(-5F, 6.03F, -9.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 554
		bodyModel[144].setRotationPoint(-5F, 6.38F, -10.25F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.58F, 0F, -0.5F, -0.58F, 0F, -0.5F, -0.58F, -0.5F, 0F, -0.58F, -0.5F); // Box 555
		bodyModel[145].setRotationPoint(-5F, 7.88F, -7.75F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.62F, 0F, -0.5F, -0.62F, 0F, -0.5F, -0.62F, -0.5F, 0F, -0.62F, -0.5F); // Box 556
		bodyModel[146].setRotationPoint(-5F, 5.5F, -7.75F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.01F, -0.5F, -0.51F, -0.51F, -0.5F, -0.51F, -0.51F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, 0F, -4.5F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 557
		bodyModel[147].setRotationPoint(-7F, 5F, -8.75F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 558
		bodyModel[148].setRotationPoint(-7F, 7.5F, -8.75F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 559
		bodyModel[149].setRotationPoint(3.5F, 6.73F, -7.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 560
		bodyModel[150].setRotationPoint(3.5F, 6.03F, -7.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 561
		bodyModel[151].setRotationPoint(3.5F, 6.38F, -6.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 562
		bodyModel[152].setRotationPoint(-5F, 6.73F, -7.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 563
		bodyModel[153].setRotationPoint(-5F, 6.03F, -7.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 564
		bodyModel[154].setRotationPoint(-5F, 6.38F, -6.75F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.495F, 0F, 0F, 0.495F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.495F, -0.75F, 0F, 0.495F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 565
		bodyModel[155].setRotationPoint(-12.75F, 4.7F, -8.26F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.18F, -0.75F, 0F, -0.18F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.18F, -0.75F, 0F, -0.18F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 566
		bodyModel[156].setRotationPoint(-9F, 4.95F, -9.25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.75F, -1F, 0F, -0.75F, -0.8475F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -0.8475F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[157].setRotationPoint(-9F, 4.95F, -9.82F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5975F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.15F, -0.05F, -0.65F, 0.15F, -0.05F, -0.5975F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.15F, -0.05F, -0.65F, -0.15F, -0.05F); // Box 568
		bodyModel[158].setRotationPoint(-12.5F, 4.95F, -9.82F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 569
		bodyModel[159].setRotationPoint(-12.15F, 4.95F, -9.07F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 570
		bodyModel[160].setRotationPoint(-14.25F, 4.57F, -8.25F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[161].setRotationPoint(-11.5F, 4.25F, -8.96F);
		bodyModel[161].rotateAngleX = -0.78539816F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 442
		bodyModel[162].setRotationPoint(-13.5F, 4.47F, -8.25F);
		bodyModel[162].rotateAngleX = -0.78539816F;
	}
}