//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: P32-40-42 truck
// Model Creator: Bida
// Created on: 07.05.2022 - 19:40:12
// Last changed on: 07.05.2022 - 19:40:12

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelGenesisTruck extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelGenesisTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[118];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 138
		bodyModel[7] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 140
		bodyModel[8] = new ModelRendererTurbo(this, 41, 2, textureX, textureY); // Box 111
		bodyModel[9] = new ModelRendererTurbo(this, 36, 2, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 83, 2, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 96, 2, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 47, 6, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 40, 5, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 52, 5, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 40, 9, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 52, 9, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 90, 5, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 85, 6, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 78, 5, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 78, 9, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 90, 9, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 63, 1, textureX, textureY); // Box 88
		bodyModel[25] = new ModelRendererTurbo(this, 54, 1, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 74, 1, textureX, textureY); // Box 32
		bodyModel[27] = new ModelRendererTurbo(this, 61, 22, textureX, textureY); // Box 33
		bodyModel[28] = new ModelRendererTurbo(this, 76, 24, textureX, textureY); // Box 34
		bodyModel[29] = new ModelRendererTurbo(this, 46, 24, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 47, 9, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 85, 9, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 73, 10, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 68, 8, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 68, 8, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 70, 5, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 66, 5, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 99, 4, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 55, 18, textureX, textureY); // Box 148
		bodyModel[39] = new ModelRendererTurbo(this, 57, 14, textureX, textureY); // Box 46
		bodyModel[40] = new ModelRendererTurbo(this, 77, 18, textureX, textureY); // Box 47
		bodyModel[41] = new ModelRendererTurbo(this, 75, 14, textureX, textureY); // Box 48
		bodyModel[42] = new ModelRendererTurbo(this, 60, 18, textureX, textureY); // Box 49
		bodyModel[43] = new ModelRendererTurbo(this, 46, 14, textureX, textureY); // Box 133
		bodyModel[44] = new ModelRendererTurbo(this, 84, 14, textureX, textureY); // Box 51
		bodyModel[45] = new ModelRendererTurbo(this, 44, 18, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 59, 5, textureX, textureY); // Box 53
		bodyModel[47] = new ModelRendererTurbo(this, 64, 5, textureX, textureY); // Box 54
		bodyModel[48] = new ModelRendererTurbo(this, 74, 1, textureX, textureY); // Box 55
		bodyModel[49] = new ModelRendererTurbo(this, 63, 1, textureX, textureY); // Box 56
		bodyModel[50] = new ModelRendererTurbo(this, 54, 1, textureX, textureY); // Box 57
		bodyModel[51] = new ModelRendererTurbo(this, 41, 2, textureX, textureY); // Box 58
		bodyModel[52] = new ModelRendererTurbo(this, 83, 2, textureX, textureY); // Box 59
		bodyModel[53] = new ModelRendererTurbo(this, 96, 2, textureX, textureY); // Box 60
		bodyModel[54] = new ModelRendererTurbo(this, 36, 2, textureX, textureY); // Box 61
		bodyModel[55] = new ModelRendererTurbo(this, 40, 9, textureX, textureY); // Box 62
		bodyModel[56] = new ModelRendererTurbo(this, 52, 9, textureX, textureY); // Box 63
		bodyModel[57] = new ModelRendererTurbo(this, 46, 14, textureX, textureY); // Box 64
		bodyModel[58] = new ModelRendererTurbo(this, 52, 5, textureX, textureY); // Box 65
		bodyModel[59] = new ModelRendererTurbo(this, 40, 5, textureX, textureY); // Box 66
		bodyModel[60] = new ModelRendererTurbo(this, 47, 6, textureX, textureY); // Box 67
		bodyModel[61] = new ModelRendererTurbo(this, 85, 6, textureX, textureY); // Box 68
		bodyModel[62] = new ModelRendererTurbo(this, 78, 5, textureX, textureY); // Box 69
		bodyModel[63] = new ModelRendererTurbo(this, 90, 5, textureX, textureY); // Box 70
		bodyModel[64] = new ModelRendererTurbo(this, 78, 9, textureX, textureY); // Box 71
		bodyModel[65] = new ModelRendererTurbo(this, 84, 14, textureX, textureY); // Box 72
		bodyModel[66] = new ModelRendererTurbo(this, 90, 9, textureX, textureY); // Box 73
		bodyModel[67] = new ModelRendererTurbo(this, 60, 18, textureX, textureY); // Box 74
		bodyModel[68] = new ModelRendererTurbo(this, 57, 14, textureX, textureY); // Box 75
		bodyModel[69] = new ModelRendererTurbo(this, 55, 18, textureX, textureY); // Box 76
		bodyModel[70] = new ModelRendererTurbo(this, 75, 14, textureX, textureY); // Box 77
		bodyModel[71] = new ModelRendererTurbo(this, 77, 18, textureX, textureY); // Box 78
		bodyModel[72] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 79
		bodyModel[73] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 80
		bodyModel[74] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 81
		bodyModel[75] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 82
		bodyModel[76] = new ModelRendererTurbo(this, 46, 24, textureX, textureY); // Box 83
		bodyModel[77] = new ModelRendererTurbo(this, 76, 24, textureX, textureY); // Box 84
		bodyModel[78] = new ModelRendererTurbo(this, 73, 10, textureX, textureY); // Box 85
		bodyModel[79] = new ModelRendererTurbo(this, 68, 8, textureX, textureY); // Box 86
		bodyModel[80] = new ModelRendererTurbo(this, 70, 5, textureX, textureY); // Box 87
		bodyModel[81] = new ModelRendererTurbo(this, 68, 8, textureX, textureY); // Box 88
		bodyModel[82] = new ModelRendererTurbo(this, 66, 5, textureX, textureY); // Box 89
		bodyModel[83] = new ModelRendererTurbo(this, 47, 9, textureX, textureY); // Box 90
		bodyModel[84] = new ModelRendererTurbo(this, 85, 9, textureX, textureY); // Box 91
		bodyModel[85] = new ModelRendererTurbo(this, 60, 30, textureX, textureY); // Box 124
		bodyModel[86] = new ModelRendererTurbo(this, 41, 31, textureX, textureY); // Box 96
		bodyModel[87] = new ModelRendererTurbo(this, 81, 31, textureX, textureY); // Box 97
		bodyModel[88] = new ModelRendererTurbo(this, 63, 36, textureX, textureY); // Box 98
		bodyModel[89] = new ModelRendererTurbo(this, 73, 29, textureX, textureY); // Box 99
		bodyModel[90] = new ModelRendererTurbo(this, 53, 29, textureX, textureY); // Box 100
		bodyModel[91] = new ModelRendererTurbo(this, 53, 29, textureX, textureY); // Box 101
		bodyModel[92] = new ModelRendererTurbo(this, 73, 29, textureX, textureY); // Box 102
		bodyModel[93] = new ModelRendererTurbo(this, 63, 36, textureX, textureY); // Box 103
		bodyModel[94] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 104
		bodyModel[95] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 105
		bodyModel[96] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 106
		bodyModel[97] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 107
		bodyModel[98] = new ModelRendererTurbo(this, 99, 4, textureX, textureY); // Box 108
		bodyModel[99] = new ModelRendererTurbo(this, 61, 22, textureX, textureY); // Box 109
		bodyModel[100] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 110
		bodyModel[101] = new ModelRendererTurbo(this, 44, 18, textureX, textureY); // Box 111
		bodyModel[102] = new ModelRendererTurbo(this, 64, 5, textureX, textureY); // Box 112
		bodyModel[103] = new ModelRendererTurbo(this, 59, 5, textureX, textureY); // Box 113
		bodyModel[104] = new ModelRendererTurbo(this, 14, 22, textureX, textureY); // Box 114
		bodyModel[105] = new ModelRendererTurbo(this, 29, 22, textureX, textureY); // Box 115
		bodyModel[106] = new ModelRendererTurbo(this, 5, 22, textureX, textureY); // Box 116
		bodyModel[107] = new ModelRendererTurbo(this, 63, 13, textureX, textureY); // Box 117
		bodyModel[108] = new ModelRendererTurbo(this, 15, 26, textureX, textureY); // Box 118
		bodyModel[109] = new ModelRendererTurbo(this, 6, 26, textureX, textureY); // Box 119
		bodyModel[110] = new ModelRendererTurbo(this, 30, 26, textureX, textureY); // Box 120
		bodyModel[111] = new ModelRendererTurbo(this, 14, 22, textureX, textureY); // Box 121
		bodyModel[112] = new ModelRendererTurbo(this, 15, 26, textureX, textureY); // Box 122
		bodyModel[113] = new ModelRendererTurbo(this, 5, 22, textureX, textureY); // Box 123
		bodyModel[114] = new ModelRendererTurbo(this, 6, 26, textureX, textureY); // Box 124
		bodyModel[115] = new ModelRendererTurbo(this, 30, 26, textureX, textureY); // Box 125
		bodyModel[116] = new ModelRendererTurbo(this, 29, 22, textureX, textureY); // Box 126
		bodyModel[117] = new ModelRendererTurbo(this, 63, 13, textureX, textureY); // Box 127

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-9F, 6F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(7F, 6F, -9F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[2].setRotationPoint(8F, 7F, 6F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[3].setRotationPoint(-8F, 7F, 6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[4].setRotationPoint(-8F, 7F, -6F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[5].setRotationPoint(8F, 7F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 138
		bodyModel[6].setRotationPoint(-10.25F, 3.5F, -8.25F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 140
		bodyModel[7].setRotationPoint(-6.75F, 3.5F, -8.25F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 111
		bodyModel[8].setRotationPoint(-10F, 3.5F, -8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 13
		bodyModel[9].setRotationPoint(-11F, 3.5F, -8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 14
		bodyModel[10].setRotationPoint(5F, 3.5F, -8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 15
		bodyModel[11].setRotationPoint(10F, 3.5F, -8.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 16
		bodyModel[12].setRotationPoint(-8.5F, 5F, -8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[13].setRotationPoint(-10.5F, 5F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[14].setRotationPoint(-7.5F, 5F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 19
		bodyModel[15].setRotationPoint(-10.5F, 7F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[16].setRotationPoint(-7.5F, 7F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[17].setRotationPoint(8.5F, 5F, -8.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 22
		bodyModel[18].setRotationPoint(7.5F, 5F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[19].setRotationPoint(5.5F, 5F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 24
		bodyModel[20].setRotationPoint(5.5F, 7F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[21].setRotationPoint(8.5F, 7F, -8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 26
		bodyModel[22].setRotationPoint(9.25F, 3.5F, -8.25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 27
		bodyModel[23].setRotationPoint(5.75F, 3.5F, -8.25F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 88
		bodyModel[24].setRotationPoint(-2F, 4F, -8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 31
		bodyModel[25].setRotationPoint(-5F, 3.5F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 32
		bodyModel[26].setRotationPoint(2F, 3.5F, -8.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 33
		bodyModel[27].setRotationPoint(-1.5F, 6F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[28].setRotationPoint(1.5F, 6F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[29].setRotationPoint(-6.5F, 6F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 36
		bodyModel[30].setRotationPoint(-8.5F, 3.5F, -9.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 37
		bodyModel[31].setRotationPoint(7.5F, 3.5F, -9.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 38
		bodyModel[32].setRotationPoint(-0.5F, 4F, -9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[33].setRotationPoint(-0.75F, 4F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[34].setRotationPoint(0.75F, 4F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[35].setRotationPoint(-0.75F, 6F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 42
		bodyModel[36].setRotationPoint(-0.5F, 3F, -9.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 6, 4, 8, 0F); // Box 43
		bodyModel[37].setRotationPoint(-9.5F, 4.5F, -4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 148
		bodyModel[38].setRotationPoint(-4.5F, 7F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[39].setRotationPoint(-4.5F, 5F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 47
		bodyModel[40].setRotationPoint(3.5F, 7F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[41].setRotationPoint(3.5F, 5F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 49
		bodyModel[42].setRotationPoint(-3.5F, 6.25F, -6.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 133
		bodyModel[43].setRotationPoint(-8F, 8F, -8.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 51
		bodyModel[44].setRotationPoint(7F, 8F, -8.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 52
		bodyModel[45].setRotationPoint(-5.5F, 4F, -9.5F);
		bodyModel[45].rotateAngleZ = -0.08726646F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 53
		bodyModel[46].setRotationPoint(-6.5F, 3F, -9.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 54
		bodyModel[47].setRotationPoint(-2.25F, 4.25F, -9.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 55
		bodyModel[48].setRotationPoint(2F, 3.5F, 7.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 56
		bodyModel[49].setRotationPoint(-2F, 4F, 7.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		bodyModel[50].setRotationPoint(-5F, 3.5F, 7.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 58
		bodyModel[51].setRotationPoint(-10F, 3.5F, 7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 59
		bodyModel[52].setRotationPoint(5F, 3.5F, 7.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 60
		bodyModel[53].setRotationPoint(10F, 3.5F, 7.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 61
		bodyModel[54].setRotationPoint(-11F, 3.5F, 7.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 62
		bodyModel[55].setRotationPoint(-10.5F, 7F, 7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[56].setRotationPoint(-7.5F, 7F, 7.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 64
		bodyModel[57].setRotationPoint(-9F, 8F, 7.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[58].setRotationPoint(-7.5F, 5F, 7.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[59].setRotationPoint(-10.5F, 5F, 7.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 67
		bodyModel[60].setRotationPoint(-8.5F, 5F, 7.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 68
		bodyModel[61].setRotationPoint(7.5F, 5F, 7.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[62].setRotationPoint(5.5F, 5F, 7.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[63].setRotationPoint(8.5F, 5F, 7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 71
		bodyModel[64].setRotationPoint(5.5F, 7F, 7.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 72
		bodyModel[65].setRotationPoint(7F, 8F, 7.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[66].setRotationPoint(8.5F, 7F, 7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 74
		bodyModel[67].setRotationPoint(-3.5F, 6.25F, 5.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 75
		bodyModel[68].setRotationPoint(-4.5F, 5F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 76
		bodyModel[69].setRotationPoint(-4.5F, 7F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 77
		bodyModel[70].setRotationPoint(3.5F, 5F, 6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 78
		bodyModel[71].setRotationPoint(3.5F, 7F, 6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 79
		bodyModel[72].setRotationPoint(-6.75F, 3.5F, 7.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 80
		bodyModel[73].setRotationPoint(-10.25F, 3.5F, 7.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 81
		bodyModel[74].setRotationPoint(5.75F, 3.5F, 7.25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 82
		bodyModel[75].setRotationPoint(9.25F, 3.5F, 7.25F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 83
		bodyModel[76].setRotationPoint(-6.5F, 6F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 84
		bodyModel[77].setRotationPoint(1.5F, 6F, 7F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 85
		bodyModel[78].setRotationPoint(-0.5F, 4F, 8.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[79].setRotationPoint(0.75F, 4F, 8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[80].setRotationPoint(-0.75F, 6F, 8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[81].setRotationPoint(-0.75F, 4F, 8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 89
		bodyModel[82].setRotationPoint(-0.5F, 3F, 6.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 90
		bodyModel[83].setRotationPoint(-8.5F, 3.5F, 8.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 91
		bodyModel[84].setRotationPoint(7.5F, 3.5F, 8.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[85].setRotationPoint(-2F, 3.5F, -2F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 96
		bodyModel[86].setRotationPoint(-2F, 4F, -7.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 97
		bodyModel[87].setRotationPoint(-2F, 4F, 4.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 98
		bodyModel[88].setRotationPoint(2F, 4F, -1.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 99
		bodyModel[89].setRotationPoint(1F, 4F, 1.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 100
		bodyModel[90].setRotationPoint(1F, 4F, -4.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 101
		bodyModel[91].setRotationPoint(-3F, 4F, -4.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 102
		bodyModel[92].setRotationPoint(-3F, 4F, 1.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 103
		bodyModel[93].setRotationPoint(-4F, 4F, -1.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 104
		bodyModel[94].setRotationPoint(1.25F, 1F, -7.25F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 105
		bodyModel[95].setRotationPoint(-2.25F, 1F, -7.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 106
		bodyModel[96].setRotationPoint(1.25F, 1F, 6.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 107
		bodyModel[97].setRotationPoint(-2.25F, 1F, 6.25F);

		bodyModel[98].addBox(0F, 0F, 0F, 6, 4, 8, 0F); // Box 108
		bodyModel[98].setRotationPoint(3.5F, 4.5F, -4F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 109
		bodyModel[99].setRotationPoint(-1.5F, 6F, 5F);

		bodyModel[100].addBox(0F, 0F, 0F, 7, 2, 8, 0F); // Box 110
		bodyModel[100].setRotationPoint(-3.5F, 4.5F, -4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 111
		bodyModel[101].setRotationPoint(-5.5F, 4F, 8.5F);
		bodyModel[101].rotateAngleZ = -0.08726646F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 112
		bodyModel[102].setRotationPoint(-2.25F, 4.25F, 8.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 113
		bodyModel[103].setRotationPoint(-6.5F, 3F, 8.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[104].setRotationPoint(-2.5F, 8F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 115
		bodyModel[105].setRotationPoint(2.5F, 8F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 116
		bodyModel[106].setRotationPoint(-4.5F, 8F, -9F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 117
		bodyModel[107].setRotationPoint(1F, 4F, -10.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[108].setRotationPoint(-2.5F, 8.5F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[109].setRotationPoint(-4.25F, 9F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 120
		bodyModel[110].setRotationPoint(3.25F, 9F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 121
		bodyModel[111].setRotationPoint(-2.5F, 8F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 122
		bodyModel[112].setRotationPoint(-2.5F, 8.5F, 7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, -2F); // Box 123
		bodyModel[113].setRotationPoint(-4.5F, 8F, 7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[114].setRotationPoint(-4.25F, 9F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[115].setRotationPoint(3.25F, 9F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -0.5F, 0F); // Box 126
		bodyModel[116].setRotationPoint(2.5F, 8F, 7F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 127
		bodyModel[117].setRotationPoint(1F, 4F, 8.5F);
	}
}