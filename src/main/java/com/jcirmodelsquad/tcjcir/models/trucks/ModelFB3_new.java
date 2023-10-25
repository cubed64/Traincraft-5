//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 09.04.2020 - 17:21:58
// Last changed on: 09.04.2020 - 17:21:58

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located


import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelFB3_new extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelFB3_new() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[138];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 0 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 1 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 3 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 4 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 10 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 11 wheel
		bodyModel[9] = new ModelRendererTurbo(this, 63, 81, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 107, 81, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 85, 85, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 81, 80, textureX, textureY, "cull"); // Box 15 cull
		bodyModel[13] = new ModelRendererTurbo(this, 8, 120, textureX, textureY); // Box 173
		bodyModel[14] = new ModelRendererTurbo(this, 74, 81, textureX, textureY); // Box 25
		bodyModel[15] = new ModelRendererTurbo(this, 58, 81, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 64, 85, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 64, 90, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 71, 85, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 110, 90, textureX, textureY); // Box 34
		bodyModel[20] = new ModelRendererTurbo(this, 118, 81, textureX, textureY); // Box 37
		bodyModel[21] = new ModelRendererTurbo(this, 74, 94, textureX, textureY); // Box 69
		bodyModel[22] = new ModelRendererTurbo(this, 74, 96, textureX, textureY); // Box 77
		bodyModel[23] = new ModelRendererTurbo(this, 74, 98, textureX, textureY); // Box 78
		bodyModel[24] = new ModelRendererTurbo(this, 63, 40, textureX, textureY, "cull"); // Box 85 cull
		bodyModel[25] = new ModelRendererTurbo(this, 77, 40, textureX, textureY, "cull"); // Box 92 cull
		bodyModel[26] = new ModelRendererTurbo(this, 64, 36, textureX, textureY); // Box 94
		bodyModel[27] = new ModelRendererTurbo(this, 78, 36, textureX, textureY); // Box 95
		bodyModel[28] = new ModelRendererTurbo(this, 64, 33, textureX, textureY); // Box 96
		bodyModel[29] = new ModelRendererTurbo(this, 78, 33, textureX, textureY); // Box 97
		bodyModel[30] = new ModelRendererTurbo(this, 61, 54, textureX, textureY); // Box 154
		bodyModel[31] = new ModelRendererTurbo(this, 56, 54, textureX, textureY); // Box 156
		bodyModel[32] = new ModelRendererTurbo(this, 98, 40, textureX, textureY, "cull"); // Box 129 cull
		bodyModel[33] = new ModelRendererTurbo(this, 99, 36, textureX, textureY); // Box 131
		bodyModel[34] = new ModelRendererTurbo(this, 99, 33, textureX, textureY); // Box 132
		bodyModel[35] = new ModelRendererTurbo(this, 84, 40, textureX, textureY, "cull"); // Box 134 cull
		bodyModel[36] = new ModelRendererTurbo(this, 85, 36, textureX, textureY); // Box 136
		bodyModel[37] = new ModelRendererTurbo(this, 85, 33, textureX, textureY); // Box 137
		bodyModel[38] = new ModelRendererTurbo(this, 74, 103, textureX, textureY); // Box 138 mount point
		bodyModel[39] = new ModelRendererTurbo(this, 62, 112, textureX, textureY); // Box 134
		bodyModel[40] = new ModelRendererTurbo(this, 48, 108, textureX, textureY); // Box 135
		bodyModel[41] = new ModelRendererTurbo(this, 61, 98, textureX, textureY); // Box 131
		bodyModel[42] = new ModelRendererTurbo(this, 93, 112, textureX, textureY); // Box 132
		bodyModel[43] = new ModelRendererTurbo(this, 25, 108, textureX, textureY); // Box 133
		bodyModel[44] = new ModelRendererTurbo(this, 95, 96, textureX, textureY); // Box 134
		bodyModel[45] = new ModelRendererTurbo(this, 28, 81, textureX, textureY); // Box 92
		bodyModel[46] = new ModelRendererTurbo(this, 14, 81, textureX, textureY); // Box 138
		bodyModel[47] = new ModelRendererTurbo(this, 7, 81, textureX, textureY); // Box 139
		bodyModel[48] = new ModelRendererTurbo(this, 1, 75, textureX, textureY); // Box 140
		bodyModel[49] = new ModelRendererTurbo(this, 21, 81, textureX, textureY); // Box 141
		bodyModel[50] = new ModelRendererTurbo(this, 15, 68, textureX, textureY); // Box 147
		bodyModel[51] = new ModelRendererTurbo(this, 3, 88, textureX, textureY); // Box 148
		bodyModel[52] = new ModelRendererTurbo(this, 24, 90, textureX, textureY); // Box 149
		bodyModel[53] = new ModelRendererTurbo(this, 71, 36, textureX, textureY); // Box 150
		bodyModel[54] = new ModelRendererTurbo(this, 71, 33, textureX, textureY); // Box 151
		bodyModel[55] = new ModelRendererTurbo(this, 70, 40, textureX, textureY, "cull"); // Box 153 cull
		bodyModel[56] = new ModelRendererTurbo(this, 92, 33, textureX, textureY); // Box 155
		bodyModel[57] = new ModelRendererTurbo(this, 92, 36, textureX, textureY); // Box 156
		bodyModel[58] = new ModelRendererTurbo(this, 91, 40, textureX, textureY, "cull"); // Box 158 cull
		bodyModel[59] = new ModelRendererTurbo(this, 96, 49, textureX, textureY); // Box 184 late brake
		bodyModel[60] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 185 late brake
		bodyModel[61] = new ModelRendererTurbo(this, 76, 50, textureX, textureY); // Box 186
		bodyModel[62] = new ModelRendererTurbo(this, 91, 51, textureX, textureY); // Box 187
		bodyModel[63] = new ModelRendererTurbo(this, 91, 49, textureX, textureY); // Box 188
		bodyModel[64] = new ModelRendererTurbo(this, 77, 48, textureX, textureY); // Box 189
		bodyModel[65] = new ModelRendererTurbo(this, 56, 59, textureX, textureY); // Box 106
		bodyModel[66] = new ModelRendererTurbo(this, 92, 89, textureX, textureY); // Box 168
		bodyModel[67] = new ModelRendererTurbo(this, 83, 89, textureX, textureY); // Box 169
		bodyModel[68] = new ModelRendererTurbo(this, 110, 85, textureX, textureY); // Box 170
		bodyModel[69] = new ModelRendererTurbo(this, 103, 85, textureX, textureY); // Box 171
		bodyModel[70] = new ModelRendererTurbo(this, 67, 54, textureX, textureY); // Box 173
		bodyModel[71] = new ModelRendererTurbo(this, 67, 59, textureX, textureY); // Box 174
		bodyModel[72] = new ModelRendererTurbo(this, 72, 54, textureX, textureY); // Box 175
		bodyModel[73] = new ModelRendererTurbo(this, 109, 57, textureX, textureY); // Box 181 early brake
		bodyModel[74] = new ModelRendererTurbo(this, 100, 57, textureX, textureY); // Box 182 early brake
		bodyModel[75] = new ModelRendererTurbo(this, 28, 73, textureX, textureY); // Box 544
		bodyModel[76] = new ModelRendererTurbo(this, 28, 60, textureX, textureY); // Box 545
		bodyModel[77] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 546
		bodyModel[78] = new ModelRendererTurbo(this, 19, 62, textureX, textureY); // Box 547
		bodyModel[79] = new ModelRendererTurbo(this, 5, 52, textureX, textureY); // Box 75 traction motor cable ducts
		bodyModel[80] = new ModelRendererTurbo(this, 5, 52, textureX, textureY); // Box 75 traction motor cable ducts
		bodyModel[81] = new ModelRendererTurbo(this, 10, 60, textureX, textureY); // Box 120
		bodyModel[82] = new ModelRendererTurbo(this, 10, 73, textureX, textureY); // Box 124
		bodyModel[83] = new ModelRendererTurbo(this, 19, 75, textureX, textureY); // Box 125
		bodyModel[84] = new ModelRendererTurbo(this, 10, 70, textureX, textureY); // Box 127
		bodyModel[85] = new ModelRendererTurbo(this, 5, 52, textureX, textureY); // Box 75 traction motor cable ducts
		bodyModel[86] = new ModelRendererTurbo(this, 2, 94, textureX, textureY); // Box 131
		bodyModel[87] = new ModelRendererTurbo(this, 45, 96, textureX, textureY); // Box 132
		bodyModel[88] = new ModelRendererTurbo(this, 91, 80, textureX, textureY, "cull"); // Box 126 cull
		bodyModel[89] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 22
		bodyModel[90] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 563
		bodyModel[91] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 564
		bodyModel[92] = new ModelRendererTurbo(this, 1, 120, textureX, textureY); // Box 565
		bodyModel[93] = new ModelRendererTurbo(this, 8, 116, textureX, textureY); // Box 566
		bodyModel[94] = new ModelRendererTurbo(this, 32, 68, textureX, textureY); // Box 567
		bodyModel[95] = new ModelRendererTurbo(this, 2, 70, textureX, textureY); // Box 568
		bodyModel[96] = new ModelRendererTurbo(this, 107, 67, textureX, textureY); // Box 569
		bodyModel[97] = new ModelRendererTurbo(this, 110, 76, textureX, textureY); // Box 570
		bodyModel[98] = new ModelRendererTurbo(this, 118, 67, textureX, textureY); // Box 571
		bodyModel[99] = new ModelRendererTurbo(this, 110, 71, textureX, textureY); // Box 572
		bodyModel[100] = new ModelRendererTurbo(this, 103, 71, textureX, textureY); // Box 573
		bodyModel[101] = new ModelRendererTurbo(this, 87, 98, textureX, textureY); // Box 575
		bodyModel[102] = new ModelRendererTurbo(this, 63, 50, textureX, textureY); // Box 579
		bodyModel[103] = new ModelRendererTurbo(this, 64, 48, textureX, textureY); // Box 580
		bodyModel[104] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 581
		bodyModel[105] = new ModelRendererTurbo(this, 69, 49, textureX, textureY); // Box 587 late brake
		bodyModel[106] = new ModelRendererTurbo(this, 50, 50, textureX, textureY); // Box 588
		bodyModel[107] = new ModelRendererTurbo(this, 51, 48, textureX, textureY); // Box 589
		bodyModel[108] = new ModelRendererTurbo(this, 63, 67, textureX, textureY); // Box 590
		bodyModel[109] = new ModelRendererTurbo(this, 74, 67, textureX, textureY); // Box 591
		bodyModel[110] = new ModelRendererTurbo(this, 58, 67, textureX, textureY); // Box 592
		bodyModel[111] = new ModelRendererTurbo(this, 64, 71, textureX, textureY); // Box 593
		bodyModel[112] = new ModelRendererTurbo(this, 64, 76, textureX, textureY); // Box 594
		bodyModel[113] = new ModelRendererTurbo(this, 71, 71, textureX, textureY); // Box 595
		bodyModel[114] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 596
		bodyModel[115] = new ModelRendererTurbo(this, 87, 94, textureX, textureY); // Box 597
		bodyModel[116] = new ModelRendererTurbo(this, 81, 66, textureX, textureY, "cull"); // Box 598 cull
		bodyModel[117] = new ModelRendererTurbo(this, 91, 66, textureX, textureY, "cull"); // Box 599 cull
		bodyModel[118] = new ModelRendererTurbo(this, 85, 71, textureX, textureY); // Box 600
		bodyModel[119] = new ModelRendererTurbo(this, 89, 96, textureX, textureY); // Box 602
		bodyModel[120] = new ModelRendererTurbo(this, 92, 75, textureX, textureY); // Box 603
		bodyModel[121] = new ModelRendererTurbo(this, 83, 75, textureX, textureY); // Box 604
		bodyModel[122] = new ModelRendererTurbo(this, 96, 71, textureX, textureY); // Box 605
		bodyModel[123] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 606
		bodyModel[124] = new ModelRendererTurbo(this, 83, 54, textureX, textureY); // Box 607
		bodyModel[125] = new ModelRendererTurbo(this, 78, 54, textureX, textureY); // Box 608
		bodyModel[126] = new ModelRendererTurbo(this, 78, 59, textureX, textureY); // Box 609
		bodyModel[127] = new ModelRendererTurbo(this, 89, 54, textureX, textureY); // Box 610
		bodyModel[128] = new ModelRendererTurbo(this, 89, 59, textureX, textureY); // Box 611
		bodyModel[129] = new ModelRendererTurbo(this, 94, 54, textureX, textureY); // Box 612
		bodyModel[130] = new ModelRendererTurbo(this, 109, 57, textureX, textureY); // Box 613 early brake
		bodyModel[131] = new ModelRendererTurbo(this, 100, 57, textureX, textureY); // Box 614 early brake
		bodyModel[132] = new ModelRendererTurbo(this, 56, 49, textureX, textureY); // Box 145 late brake
		bodyModel[133] = new ModelRendererTurbo(this, 96, 85, textureX, textureY); // Box 147
		bodyModel[134] = new ModelRendererTurbo(this, 78, 85, textureX, textureY); // Box 148
		bodyModel[135] = new ModelRendererTurbo(this, 78, 71, textureX, textureY); // Box 149
		bodyModel[136] = new ModelRendererTurbo(this, 100, 81, textureX, textureY); // Box 151
		bodyModel[137] = new ModelRendererTurbo(this, 100, 67, textureX, textureY); // Box 152

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 0 wheel
		bodyModel[0].setRotationPoint(-11F, 7F, -5.5F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 1 wheel
		bodyModel[1].setRotationPoint(0F, 7F, -5.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[2].setRotationPoint(-12F, 6F, -9F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 3 wheel
		bodyModel[3].setRotationPoint(-11F, 7F, 5.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 4 wheel
		bodyModel[4].setRotationPoint(0F, 7F, 5.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[5].setRotationPoint(-1F, 6F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 9
		bodyModel[6].setRotationPoint(10F, 6F, -9F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10 wheel
		bodyModel[7].setRotationPoint(11F, 7F, -5.5F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11 wheel
		bodyModel[8].setRotationPoint(11F, 7F, 5.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12
		bodyModel[9].setRotationPoint(-13F, 3.5F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 13
		bodyModel[10].setRotationPoint(9F, 3.5F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 14
		bodyModel[11].setRotationPoint(-2F, 3.5F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 15 cull
		bodyModel[12].setRotationPoint(-7F, 4F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F); // Box 173
		bodyModel[13].setRotationPoint(-12F, 6F, -9.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F); // Box 25
		bodyModel[14].setRotationPoint(-9F, 4.5F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 26
		bodyModel[15].setRotationPoint(-14F, 3.5F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 27
		bodyModel[16].setRotationPoint(-14F, 5.5F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F); // Box 28
		bodyModel[17].setRotationPoint(-14F, 5.5F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 29
		bodyModel[18].setRotationPoint(-10F, 5.5F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 34
		bodyModel[19].setRotationPoint(12F, 5.5F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 37
		bodyModel[20].setRotationPoint(13F, 3.5F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 69
		bodyModel[21].setRotationPoint(-14F, 8.5F, -8.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 77
		bodyModel[22].setRotationPoint(-2F, 8.5F, -8.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 78
		bodyModel[23].setRotationPoint(9F, 8.5F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85 cull
		bodyModel[24].setRotationPoint(-12F, 6F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92 cull
		bodyModel[25].setRotationPoint(10F, 6F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 94
		bodyModel[26].setRotationPoint(-11.5F, 4F, -9.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 95
		bodyModel[27].setRotationPoint(10.5F, 4F, -9.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 96
		bodyModel[28].setRotationPoint(-11.5F, 3F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 97
		bodyModel[29].setRotationPoint(10.5F, 3F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 154
		bodyModel[30].setRotationPoint(-4F, 5.5F, -7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 156
		bodyModel[31].setRotationPoint(-8F, 5.5F, -7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 129 cull
		bodyModel[32].setRotationPoint(-12F, 6F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 131
		bodyModel[33].setRotationPoint(-11.5F, 4F, 8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 132
		bodyModel[34].setRotationPoint(-11.5F, 3F, 9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 134 cull
		bodyModel[35].setRotationPoint(10F, 6F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 136
		bodyModel[36].setRotationPoint(10.5F, 4F, 8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 137
		bodyModel[37].setRotationPoint(10.5F, 3F, 9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F); // Box 138 mount point
		bodyModel[38].setRotationPoint(-1.5F, 2.25F, -1.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 5, 5, 10, 0F); // Box 134
		bodyModel[39].setRotationPoint(-13.5F, 4F, -5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 135
		bodyModel[40].setRotationPoint(-8.5F, 5F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[41].setRotationPoint(2.5F, 5F, -5F);

		bodyModel[42].addBox(0F, 0F, 0F, 7, 5, 10, 0F); // Box 132
		bodyModel[42].setRotationPoint(-4.5F, 4F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[43].setRotationPoint(7.5F, 5F, -5F);

		bodyModel[44].addBox(0F, 0F, 0F, 5, 5, 10, 0F); // Box 134
		bodyModel[44].setRotationPoint(8.5F, 4F, -5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.25F, -2F, 0F); // Box 92
		bodyModel[45].setRotationPoint(5.4F, 3F, 6.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.25F, -2F, 0F); // Box 138
		bodyModel[46].setRotationPoint(5.4F, 3F, -8.25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.25F, -2F, 0F); // Box 139
		bodyModel[47].setRotationPoint(-6.6F, 3F, -8.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[48].setRotationPoint(-7F, 2.5F, -8.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.25F, -2F, 0F); // Box 141
		bodyModel[49].setRotationPoint(-6.6F, 3F, 6.25F);

		bodyModel[50].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 147
		bodyModel[50].setRotationPoint(-2.5F, 2.5F, -1.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 148
		bodyModel[51].setRotationPoint(-7F, 5F, -8F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 149
		bodyModel[52].setRotationPoint(5F, 5F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 150
		bodyModel[53].setRotationPoint(-0.5F, 4F, -9.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 151
		bodyModel[54].setRotationPoint(-0.5F, 3F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153 cull
		bodyModel[55].setRotationPoint(-1F, 6F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 155
		bodyModel[56].setRotationPoint(-0.5F, 3F, 9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 156
		bodyModel[57].setRotationPoint(-0.5F, 4F, 8.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 158 cull
		bodyModel[58].setRotationPoint(-1F, 6F, 9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 184 late brake
		bodyModel[59].setRotationPoint(-12F, 3F, -10F);
		bodyModel[59].rotateAngleX = -0.78539816F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 185 late brake
		bodyModel[60].setRotationPoint(10F, 3F, -10F);
		bodyModel[60].rotateAngleX = -0.78539816F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 186
		bodyModel[61].setRotationPoint(8F, 3.8F, -10.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 187
		bodyModel[62].setRotationPoint(-9F, 3.8F, -10.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[63].setRotationPoint(-11F, 3.8F, -10.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 189
		bodyModel[64].setRotationPoint(9F, 3.8F, -10.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[65].setRotationPoint(-7.5F, 7.75F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 168
		bodyModel[66].setRotationPoint(1F, 5.5F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 169
		bodyModel[67].setRotationPoint(-3F, 5.5F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 170
		bodyModel[68].setRotationPoint(12F, 5.5F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 171
		bodyModel[69].setRotationPoint(8F, 5.5F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 173
		bodyModel[70].setRotationPoint(3F, 5.5F, -7.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[71].setRotationPoint(3.5F, 7.75F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 175
		bodyModel[72].setRotationPoint(7F, 5.5F, -7.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.7F, -0.1F, -0.7F, -0.7F); // Box 181 early brake
		bodyModel[73].setRotationPoint(4F, 7.5F, -7.17F);
		bodyModel[73].rotateAngleX = -0.78539816F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.7F, -0.1F, -0.7F, -0.7F); // Box 182 early brake
		bodyModel[74].setRotationPoint(-6F, 7.5F, -7.17F);
		bodyModel[74].rotateAngleX = -0.78539816F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 544
		bodyModel[75].setRotationPoint(-7F, 2.5F, 4.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 545
		bodyModel[76].setRotationPoint(5F, 2.5F, 4.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[77].setRotationPoint(5F, 2.5F, -8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		bodyModel[78].setRotationPoint(5F, 2.5F, 0.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F); // Box 75 traction motor cable ducts
		bodyModel[79].setRotationPoint(-11F, 2F, 2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F); // Box 75 traction motor cable ducts
		bodyModel[80].setRotationPoint(9F, 2F, -3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 120
		bodyModel[81].setRotationPoint(5F, 2.5F, -4.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 124
		bodyModel[82].setRotationPoint(-7F, 2.5F, -4.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[83].setRotationPoint(-7F, 2.5F, 0.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 127
		bodyModel[84].setRotationPoint(-2.5F, 2.5F, -3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F); // Box 75 traction motor cable ducts
		bodyModel[85].setRotationPoint(-4F, 2F, -3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[86].setRotationPoint(-6.5F, 6F, -3.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[87].setRotationPoint(5.5F, 6F, -3.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 126 cull
		bodyModel[88].setRotationPoint(4F, 4F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0.75F, -4.25F, 0F, 0.75F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 22
		bodyModel[89].setRotationPoint(-11.9F, 4F, -8.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0.75F, -4.25F, 0F, 0.75F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 563
		bodyModel[90].setRotationPoint(-0.9F, 4F, -8.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0.75F, -4.25F, 0F, 0.75F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 564
		bodyModel[91].setRotationPoint(10.1F, 4F, -8.75F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F); // Box 565
		bodyModel[92].setRotationPoint(-1F, 6F, -9.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F); // Box 566
		bodyModel[93].setRotationPoint(10F, 6F, -9.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 3F, 0.5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 3F, 0.5F, 0F, 3F, 0F, 0F, 0F); // Box 567
		bodyModel[94].setRotationPoint(2.5F, 2.5F, -1.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.5F, 0F, 3F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0.5F, 0F, 3F, 0.5F, 0F, 3F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0.5F, 0F, 3F); // Box 568
		bodyModel[95].setRotationPoint(-4.5F, 2.5F, -1.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[96].setRotationPoint(9F, 3.5F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 570
		bodyModel[97].setRotationPoint(12F, 5.5F, 8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[98].setRotationPoint(13F, 3.5F, 8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 572
		bodyModel[99].setRotationPoint(12F, 5.5F, 8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 573
		bodyModel[100].setRotationPoint(8F, 5.5F, 8F);

		bodyModel[101].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 575
		bodyModel[101].setRotationPoint(9F, 8.5F, 7.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F); // Box 579
		bodyModel[102].setRotationPoint(8F, 3.8F, 7.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 580
		bodyModel[103].setRotationPoint(9F, 3.8F, 9.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0.75F, -4.25F, 0F, 0.75F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 581
		bodyModel[104].setRotationPoint(10.1F, 4F, 7.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 587 late brake
		bodyModel[105].setRotationPoint(10F, 3F, 10F);
		bodyModel[105].rotateAngleX = -0.78539816F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 588
		bodyModel[106].setRotationPoint(-9F, 3.8F, 7.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 589
		bodyModel[107].setRotationPoint(-11F, 3.8F, 9.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[108].setRotationPoint(-13F, 3.5F, 8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 591
		bodyModel[109].setRotationPoint(-9F, 4.5F, 8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[110].setRotationPoint(-14F, 3.5F, 8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 593
		bodyModel[111].setRotationPoint(-14F, 5.5F, 8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F); // Box 594
		bodyModel[112].setRotationPoint(-14F, 5.5F, 8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 595
		bodyModel[113].setRotationPoint(-10F, 5.5F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0.75F, -4.25F, 0F, 0.75F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 596
		bodyModel[114].setRotationPoint(-11.9F, 4F, 7.75F);

		bodyModel[115].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 597
		bodyModel[115].setRotationPoint(-14F, 8.5F, 7.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 598 cull
		bodyModel[116].setRotationPoint(-7F, 4F, 7.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 599 cull
		bodyModel[117].setRotationPoint(4F, 4F, 7.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		bodyModel[118].setRotationPoint(-2F, 3.5F, 8F);

		bodyModel[119].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 602
		bodyModel[119].setRotationPoint(-2F, 8.5F, 7.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 603
		bodyModel[120].setRotationPoint(1F, 5.5F, 8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 604
		bodyModel[121].setRotationPoint(-3F, 5.5F, 8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 605
		bodyModel[122].setRotationPoint(2F, 4.5F, 8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0.75F, -4.25F, 0F, 0.75F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 606
		bodyModel[123].setRotationPoint(-0.9F, 4F, 7.75F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[124].setRotationPoint(-4F, 5.5F, 6.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 608
		bodyModel[125].setRotationPoint(-8F, 5.5F, 6.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 609
		bodyModel[126].setRotationPoint(-7.5F, 7.75F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 610
		bodyModel[127].setRotationPoint(3F, 5.5F, 6.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 611
		bodyModel[128].setRotationPoint(3.5F, 7.75F, 7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 612
		bodyModel[129].setRotationPoint(7F, 5.5F, 6.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.7F, -0.1F, -0.7F, -0.7F); // Box 613 early brake
		bodyModel[130].setRotationPoint(4F, 7.5F, 7.17F);
		bodyModel[130].rotateAngleX = -0.78539816F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.7F, -0.1F, -0.7F, -0.7F); // Box 614 early brake
		bodyModel[131].setRotationPoint(-6F, 7.5F, 7.17F);
		bodyModel[131].rotateAngleX = -0.78539816F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 145 late brake
		bodyModel[132].setRotationPoint(-12F, 3F, 10F);
		bodyModel[132].rotateAngleX = -0.78539816F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F); // Box 147
		bodyModel[133].setRotationPoint(2F, 4.5F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 148
		bodyModel[134].setRotationPoint(-4F, 4.5F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[135].setRotationPoint(-4F, 4.5F, 8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 151
		bodyModel[136].setRotationPoint(7F, 4.5F, -9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[137].setRotationPoint(7F, 4.5F, 8F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 138; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
	}
}