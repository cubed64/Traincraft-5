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

public class ModelPS_2410_Truck extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public ModelPS_2410_Truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[148];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 42, 54, textureX, textureY); // weelz
		bodyModel[1] = new ModelRendererTurbo(this, 42, 54, textureX, textureY); // weelz
		bodyModel[2] = new ModelRendererTurbo(this, 42, 54, textureX, textureY); // weelz
		bodyModel[3] = new ModelRendererTurbo(this, 42, 54, textureX, textureY); // weelz
		bodyModel[4] = new ModelRendererTurbo(this, 42, 54, textureX, textureY); // weelz
		bodyModel[5] = new ModelRendererTurbo(this, 42, 54, textureX, textureY); // weelz
		bodyModel[6] = new ModelRendererTurbo(this, 147, 54, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 93, 54, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 98, 54, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 76, 42, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 75, 39, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 76, 42, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 151, 42, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 140, 39, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 151, 42, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 145, 43, textureX, textureY); // Box axlez
		bodyModel[16] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Box axlez
		bodyModel[17] = new ModelRendererTurbo(this, 40, 44, textureX, textureY); // Box axlez
		bodyModel[18] = new ModelRendererTurbo(this, 49, 22, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 58, 22, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 67, 22, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 103, 20, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 124, 20, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 124, 26, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 103, 26, textureX, textureY); // Box 38
		bodyModel[25] = new ModelRendererTurbo(this, 124, 32, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 103, 32, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 117, 37, textureX, textureY); // Box interior crossmembers
		bodyModel[28] = new ModelRendererTurbo(this, 108, 42, textureX, textureY); // Box interior crossmembers
		bodyModel[29] = new ModelRendererTurbo(this, 117, 38, textureX, textureY); // Box interior crossmembers
		bodyModel[30] = new ModelRendererTurbo(this, 94, 38, textureX, textureY); // Box interior crossmembers
		bodyModel[31] = new ModelRendererTurbo(this, 117, 42, textureX, textureY); // Box interior crossmembers
		bodyModel[32] = new ModelRendererTurbo(this, 108, 37, textureX, textureY); // Box interior crossmembers
		bodyModel[33] = new ModelRendererTurbo(this, 71, 4, textureX, textureY); // Box 48
		bodyModel[34] = new ModelRendererTurbo(this, 62, 4, textureX, textureY); // Box 49
		bodyModel[35] = new ModelRendererTurbo(this, 57, 4, textureX, textureY); // Box 52
		bodyModel[36] = new ModelRendererTurbo(this, 131, 40, textureX, textureY); // Box springles
		bodyModel[37] = new ModelRendererTurbo(this, 131, 40, textureX, textureY); // Box springles
		bodyModel[38] = new ModelRendererTurbo(this, 79, 54, textureX, textureY); // Box springles
		bodyModel[39] = new ModelRendererTurbo(this, 94, 58, textureX, textureY); // Box 62
		bodyModel[40] = new ModelRendererTurbo(this, 94, 61, textureX, textureY); // Box 63
		bodyModel[41] = new ModelRendererTurbo(this, 94, 58, textureX, textureY); // Box 66
		bodyModel[42] = new ModelRendererTurbo(this, 32, 27, textureX, textureY); // Box 68
		bodyModel[43] = new ModelRendererTurbo(this, 26, 30, textureX, textureY); // Box 69
		bodyModel[44] = new ModelRendererTurbo(this, 17, 30, textureX, textureY); // Box 71
		bodyModel[45] = new ModelRendererTurbo(this, 134, 30, textureX, textureY); // Box cull
		bodyModel[46] = new ModelRendererTurbo(this, 84, 25, textureX, textureY); // Box 78
		bodyModel[47] = new ModelRendererTurbo(this, 48, 36, textureX, textureY); // Box brakeshoes
		bodyModel[48] = new ModelRendererTurbo(this, 34, 36, textureX, textureY); // Box brakeshoes
		bodyModel[49] = new ModelRendererTurbo(this, 29, 36, textureX, textureY); // Box brakeshoes
		bodyModel[50] = new ModelRendererTurbo(this, 43, 36, textureX, textureY); // Box brakeshoes
		bodyModel[51] = new ModelRendererTurbo(this, 17, 36, textureX, textureY); // Box brakeshoes
		bodyModel[52] = new ModelRendererTurbo(this, 12, 36, textureX, textureY); // Box brakeshoes
		bodyModel[53] = new ModelRendererTurbo(this, 119, 3, textureX, textureY); // Box 86
		bodyModel[54] = new ModelRendererTurbo(this, 87, 3, textureX, textureY); // Box 88
		bodyModel[55] = new ModelRendererTurbo(this, 104, 1, textureX, textureY); // Box 89
		bodyModel[56] = new ModelRendererTurbo(this, 105, 7, textureX, textureY); // Box 90
		bodyModel[57] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 91
		bodyModel[58] = new ModelRendererTurbo(this, 70, 25, textureX, textureY); // Box 92
		bodyModel[59] = new ModelRendererTurbo(this, 63, 25, textureX, textureY); // Box 93
		bodyModel[60] = new ModelRendererTurbo(this, 56, 25, textureX, textureY); // Box 94
		bodyModel[61] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 95
		bodyModel[62] = new ModelRendererTurbo(this, 79, 54, textureX, textureY); // Box springles
		bodyModel[63] = new ModelRendererTurbo(this, 94, 61, textureX, textureY); // Box 97
		bodyModel[64] = new ModelRendererTurbo(this, 43, 4, textureX, textureY); // Box 98
		bodyModel[65] = new ModelRendererTurbo(this, 36, 4, textureX, textureY); // Box 99
		bodyModel[66] = new ModelRendererTurbo(this, 52, 4, textureX, textureY); // Box 100
		bodyModel[67] = new ModelRendererTurbo(this, 28, 14, textureX, textureY); // Box 101
		bodyModel[68] = new ModelRendererTurbo(this, 42, 14, textureX, textureY); // Box 102
		bodyModel[69] = new ModelRendererTurbo(this, 22, 27, textureX, textureY); // Box 103
		bodyModel[70] = new ModelRendererTurbo(this, 33, 30, textureX, textureY); // Box 104
		bodyModel[71] = new ModelRendererTurbo(this, 89, 30, textureX, textureY); // Box 106
		bodyModel[72] = new ModelRendererTurbo(this, 27, 27, textureX, textureY); // Box 108
		bodyModel[73] = new ModelRendererTurbo(this, 32, 27, textureX, textureY); // Box 111
		bodyModel[74] = new ModelRendererTurbo(this, 26, 30, textureX, textureY); // Box 112
		bodyModel[75] = new ModelRendererTurbo(this, 33, 30, textureX, textureY); // Box 113
		bodyModel[76] = new ModelRendererTurbo(this, 22, 27, textureX, textureY); // Box 115
		bodyModel[77] = new ModelRendererTurbo(this, 17, 30, textureX, textureY); // Box 116
		bodyModel[78] = new ModelRendererTurbo(this, 27, 27, textureX, textureY); // Box 120
		bodyModel[79] = new ModelRendererTurbo(this, 67, 15, textureX, textureY); // Box 121
		bodyModel[80] = new ModelRendererTurbo(this, 103, 20, textureX, textureY); // Box 122
		bodyModel[81] = new ModelRendererTurbo(this, 50, 7, textureX, textureY); // Box cull fricts
		bodyModel[82] = new ModelRendererTurbo(this, 124, 20, textureX, textureY); // Box 124
		bodyModel[83] = new ModelRendererTurbo(this, 71, 1, textureX, textureY); // Box 125
		bodyModel[84] = new ModelRendererTurbo(this, 62, 1, textureX, textureY); // Box 126
		bodyModel[85] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 127
		bodyModel[86] = new ModelRendererTurbo(this, 86, 40, textureX, textureY); // Box springles
		bodyModel[87] = new ModelRendererTurbo(this, 79, 54, textureX, textureY); // Box springles
		bodyModel[88] = new ModelRendererTurbo(this, 94, 58, textureX, textureY); // Box 130
		bodyModel[89] = new ModelRendererTurbo(this, 94, 61, textureX, textureY); // Box 131
		bodyModel[90] = new ModelRendererTurbo(this, 134, 35, textureX, textureY); // Box 132
		bodyModel[91] = new ModelRendererTurbo(this, 84, 18, textureX, textureY); // Box 133
		bodyModel[92] = new ModelRendererTurbo(this, 77, 18, textureX, textureY); // Box 134
		bodyModel[93] = new ModelRendererTurbo(this, 42, 14, textureX, textureY); // Box 135
		bodyModel[94] = new ModelRendererTurbo(this, 90, 51, textureX, textureY); // Box 136
		bodyModel[95] = new ModelRendererTurbo(this, 147, 50, textureX, textureY); // Box 137
		bodyModel[96] = new ModelRendererTurbo(this, 93, 50, textureX, textureY); // Box 138
		bodyModel[97] = new ModelRendererTurbo(this, 98, 50, textureX, textureY); // Box 139
		bodyModel[98] = new ModelRendererTurbo(this, 58, 15, textureX, textureY); // Box 140
		bodyModel[99] = new ModelRendererTurbo(this, 50, 7, textureX, textureY); // Box cull fricts
		bodyModel[100] = new ModelRendererTurbo(this, 124, 32, textureX, textureY); // Box 142
		bodyModel[101] = new ModelRendererTurbo(this, 103, 32, textureX, textureY); // Box 143
		bodyModel[102] = new ModelRendererTurbo(this, 86, 40, textureX, textureY); // Box springles
		bodyModel[103] = new ModelRendererTurbo(this, 94, 58, textureX, textureY); // Box 145
		bodyModel[104] = new ModelRendererTurbo(this, 70, 18, textureX, textureY); // Box 146
		bodyModel[105] = new ModelRendererTurbo(this, 63, 18, textureX, textureY); // Box 147
		bodyModel[106] = new ModelRendererTurbo(this, 79, 54, textureX, textureY); // Box springles
		bodyModel[107] = new ModelRendererTurbo(this, 94, 61, textureX, textureY); // Box 149
		bodyModel[108] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Box 150
		bodyModel[109] = new ModelRendererTurbo(this, 36, 1, textureX, textureY); // Box 151
		bodyModel[110] = new ModelRendererTurbo(this, 52, 1, textureX, textureY); // Box 152
		bodyModel[111] = new ModelRendererTurbo(this, 28, 14, textureX, textureY); // Box 153
		bodyModel[112] = new ModelRendererTurbo(this, 89, 35, textureX, textureY); // Box 154
		bodyModel[113] = new ModelRendererTurbo(this, 49, 15, textureX, textureY); // Box 156
		bodyModel[114] = new ModelRendererTurbo(this, 124, 26, textureX, textureY); // Box 157
		bodyModel[115] = new ModelRendererTurbo(this, 103, 26, textureX, textureY); // Box 158
		bodyModel[116] = new ModelRendererTurbo(this, 56, 18, textureX, textureY); // Box 159
		bodyModel[117] = new ModelRendererTurbo(this, 49, 18, textureX, textureY); // Box 160
		bodyModel[118] = new ModelRendererTurbo(this, 50, 7, textureX, textureY); // Box cull fricts
		bodyModel[119] = new ModelRendererTurbo(this, 90, 51, textureX, textureY); // Box 163
		bodyModel[120] = new ModelRendererTurbo(this, 90, 51, textureX, textureY); // Box 164
		bodyModel[121] = new ModelRendererTurbo(this, 90, 51, textureX, textureY); // Box 165
		bodyModel[122] = new ModelRendererTurbo(this, 34, 40, textureX, textureY); // Box brakeshoes
		bodyModel[123] = new ModelRendererTurbo(this, 48, 40, textureX, textureY); // Box brakeshoes
		bodyModel[124] = new ModelRendererTurbo(this, 43, 40, textureX, textureY); // Box brakeshoes
		bodyModel[125] = new ModelRendererTurbo(this, 29, 40, textureX, textureY); // Box brakeshoes
		bodyModel[126] = new ModelRendererTurbo(this, 17, 40, textureX, textureY); // Box brakeshoes
		bodyModel[127] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box brakeshoes
		bodyModel[128] = new ModelRendererTurbo(this, 78, 35, textureX, textureY); // Box 172
		bodyModel[129] = new ModelRendererTurbo(this, 150, 32, textureX, textureY); // Box 173
		bodyModel[130] = new ModelRendererTurbo(this, 75, 32, textureX, textureY); // Box 174
		bodyModel[131] = new ModelRendererTurbo(this, 78, 35, textureX, textureY); // Box 175
		bodyModel[132] = new ModelRendererTurbo(this, 82, 32, textureX, textureY); // Box 176
		bodyModel[133] = new ModelRendererTurbo(this, 143, 35, textureX, textureY); // Box 177
		bodyModel[134] = new ModelRendererTurbo(this, 143, 35, textureX, textureY); // Box 178
		bodyModel[135] = new ModelRendererTurbo(this, 143, 32, textureX, textureY); // Box 179
		bodyModel[136] = new ModelRendererTurbo(this, 23, 54, textureX, textureY); // Box dynamoo
		bodyModel[137] = new ModelRendererTurbo(this, 64, 7, textureX, textureY); // Box roller bearings
		bodyModel[138] = new ModelRendererTurbo(this, 64, 7, textureX, textureY); // Box roller bearings
		bodyModel[139] = new ModelRendererTurbo(this, 64, 7, textureX, textureY); // Box roller bearings
		bodyModel[140] = new ModelRendererTurbo(this, 71, 7, textureX, textureY); // Box roller bearings
		bodyModel[141] = new ModelRendererTurbo(this, 71, 7, textureX, textureY); // Box roller bearings
		bodyModel[142] = new ModelRendererTurbo(this, 71, 7, textureX, textureY); // Box roller bearings
		bodyModel[143] = new ModelRendererTurbo(this, 57, 7, textureX, textureY); // Box 144
		bodyModel[144] = new ModelRendererTurbo(this, 57, 7, textureX, textureY); // Box 145
		bodyModel[145] = new ModelRendererTurbo(this, 57, 7, textureX, textureY); // Box 146
		bodyModel[146] = new ModelRendererTurbo(this, 35, 14, textureX, textureY); // Box 147
		bodyModel[147] = new ModelRendererTurbo(this, 35, 14, textureX, textureY); // Box 148

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // weelz
		bodyModel[0].setRotationPoint(-8.5F, 7F, -6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // weelz
		bodyModel[1].setRotationPoint(0F, 7F, -6F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // weelz
		bodyModel[2].setRotationPoint(8.5F, 7F, -6F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // weelz
		bodyModel[3].setRotationPoint(8.5F, 7F, 6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // weelz
		bodyModel[4].setRotationPoint(0F, 7F, 6F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // weelz
		bodyModel[5].setRotationPoint(-8.5F, 7F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-12.5F, 4F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 8
		bodyModel[7].setRotationPoint(11.5F, 4F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 9
		bodyModel[8].setRotationPoint(-11.5F, 4F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-12.5F, 4F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 11
		bodyModel[10].setRotationPoint(-12.5F, 6.5F, -4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 15
		bodyModel[11].setRotationPoint(-12.5F, 4F, 4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 16
		bodyModel[12].setRotationPoint(11.5F, 4F, 4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 17
		bodyModel[13].setRotationPoint(11.5F, 6.5F, -4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 18
		bodyModel[14].setRotationPoint(11.5F, 4F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box axlez
		bodyModel[15].setRotationPoint(-9.5F, 6F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box axlez
		bodyModel[16].setRotationPoint(-1F, 6F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box axlez
		bodyModel[17].setRotationPoint(7.5F, 6F, -8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 22
		bodyModel[18].setRotationPoint(-10F, 4.5F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 23
		bodyModel[19].setRotationPoint(-1.5F, 4.5F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 24
		bodyModel[20].setRotationPoint(7F, 4.5F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 31
		bodyModel[21].setRotationPoint(-10.5F, 6F, -8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 36
		bodyModel[22].setRotationPoint(-7.5F, 6F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 37
		bodyModel[23].setRotationPoint(1F, 6F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 38
		bodyModel[24].setRotationPoint(-2F, 6F, -8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		bodyModel[25].setRotationPoint(9.5F, 6F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 40
		bodyModel[26].setRotationPoint(6.5F, 6F, -8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box interior crossmembers
		bodyModel[27].setRotationPoint(-5.25F, 4.5F, -6.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box interior crossmembers
		bodyModel[28].setRotationPoint(3.25F, 4.5F, -6.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box interior crossmembers
		bodyModel[29].setRotationPoint(-5.25F, 5F, -4.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box interior crossmembers
		bodyModel[30].setRotationPoint(3.25F, 5F, -4.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box interior crossmembers
		bodyModel[31].setRotationPoint(-5.25F, 4.5F, 4.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box interior crossmembers
		bodyModel[32].setRotationPoint(3.25F, 4.5F, 4.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 2.125F, 0F, 0F, 2.125F, 0F, 0F, 0.25F, 0F); // Box 48
		bodyModel[33].setRotationPoint(-7.5F, 6F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, 0F); // Box 49
		bodyModel[34].setRotationPoint(-5.5F, 8.25F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.25F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F); // Box 52
		bodyModel[35].setRotationPoint(-2.5F, 8.25F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -2F, 0F, 1F, -2F); // Box springles
		bodyModel[36].setRotationPoint(3F, 6F, -9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -2F, 0F, 1F, -2F); // Box springles
		bodyModel[37].setRotationPoint(-5F, 6F, -9.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box springles
		bodyModel[38].setRotationPoint(-6.25F, 4.25F, -8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0F, 0.125F, 0F, 0F); // Box 62
		bodyModel[39].setRotationPoint(-6.25F, 5F, -8.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 63
		bodyModel[40].setRotationPoint(-6.25F, 7.5F, -8.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0F, 0.125F, 0F, 0F); // Box 66
		bodyModel[41].setRotationPoint(5.25F, 5F, -8.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.375F, -0.25F, 0.25F, -0.375F, -0.25F, 0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 68
		bodyModel[42].setRotationPoint(3.25F, 4.5F, -9.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 69
		bodyModel[43].setRotationPoint(-1F, 4F, -9.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 1F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, -1F, 0F); // Box 71
		bodyModel[44].setRotationPoint(0.5F, 5F, -9.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box cull
		bodyModel[45].setRotationPoint(-4.5F, 5.5F, -9.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 78
		bodyModel[46].setRotationPoint(-10.5F, 5.5F, -8.5F);

		bodyModel[47].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[47].setRotationPoint(-11.5F, 8F, -6.5F);
		bodyModel[47].rotateAngleZ = 0.21816616F;

		bodyModel[48].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[48].setRotationPoint(-3F, 8F, -6.5F);
		bodyModel[48].rotateAngleZ = 0.21816616F;

		bodyModel[49].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[49].setRotationPoint(3F, 8F, -6.5F);
		bodyModel[49].rotateAngleZ = -0.21816616F;

		bodyModel[50].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[50].setRotationPoint(-5.5F, 8F, -6.5F);
		bodyModel[50].rotateAngleZ = -0.21816616F;

		bodyModel[51].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[51].setRotationPoint(11.5F, 8F, -6.5F);
		bodyModel[51].rotateAngleZ = -0.21816616F;

		bodyModel[52].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[52].setRotationPoint(5.5F, 8F, -6.5F);
		bodyModel[52].rotateAngleZ = 0.21816616F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0.5F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F); // Box 86
		bodyModel[53].setRotationPoint(-3.25F, 4.25F, -4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0.5F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F); // Box 88
		bodyModel[54].setRotationPoint(-3.25F, 4.25F, 2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[55].setRotationPoint(-1.25F, 4.25F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[56].setRotationPoint(-1.25F, 3.5F, -1.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 91
		bodyModel[57].setRotationPoint(-7.5F, 5.5F, -8.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[58].setRotationPoint(1F, 5.5F, -8.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[59].setRotationPoint(-2F, 5.5F, -8.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[60].setRotationPoint(9.5F, 5.5F, -8.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[61].setRotationPoint(6.5F, 5.5F, -8.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box springles
		bodyModel[62].setRotationPoint(5.25F, 4.25F, -8.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 97
		bodyModel[63].setRotationPoint(5.25F, 7.5F, -8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, 0F); // Box 98
		bodyModel[64].setRotationPoint(2.5F, 8.25F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2.125F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 2.125F, 0F); // Box 99
		bodyModel[65].setRotationPoint(5.5F, 6F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F); // Box 100
		bodyModel[66].setRotationPoint(1.5F, 8.25F, -8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 101
		bodyModel[67].setRotationPoint(7.5F, 5.5F, -8.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 102
		bodyModel[68].setRotationPoint(-8.5F, 5.5F, -8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 103
		bodyModel[69].setRotationPoint(-4.25F, 4.5F, -9.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.125F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 1F, 0F, 0F, 0.125F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, -0.5F, 0F); // Box 104
		bodyModel[70].setRotationPoint(-3.5F, 5F, -9.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 106
		bodyModel[71].setRotationPoint(3.5F, 5.5F, -9.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 108
		bodyModel[72].setRotationPoint(-0.25F, 3F, -9.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 111
		bodyModel[73].setRotationPoint(3.25F, 4.5F, 8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 112
		bodyModel[74].setRotationPoint(-1F, 4F, 8.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.25F); // Box 113
		bodyModel[75].setRotationPoint(0.5F, 5F, 8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, -0.25F, 0.25F, -0.375F, -0.25F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 115
		bodyModel[76].setRotationPoint(-4.25F, 4.5F, 8.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.125F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.25F, 0F, 0.125F, -0.25F, 0F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.25F, 0F, -0.5F, -0.25F); // Box 116
		bodyModel[77].setRotationPoint(-3.5F, 5F, 8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 120
		bodyModel[78].setRotationPoint(-0.25F, 3F, 8.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 121
		bodyModel[79].setRotationPoint(-10F, 4.5F, 7.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 122
		bodyModel[80].setRotationPoint(-10.5F, 6F, 6.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull fricts
		bodyModel[81].setRotationPoint(-9.5F, 6F, 8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 124
		bodyModel[82].setRotationPoint(-7.5F, 6F, 6.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 2.125F, 0F, 0F, 2.125F, 0F, 0F, 0.25F, 0F); // Box 125
		bodyModel[83].setRotationPoint(-7.5F, 6F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, 0F); // Box 126
		bodyModel[84].setRotationPoint(-5.5F, 8.25F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.25F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F); // Box 127
		bodyModel[85].setRotationPoint(-2.5F, 8.25F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box springles
		bodyModel[86].setRotationPoint(-5F, 6F, 4.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box springles
		bodyModel[87].setRotationPoint(-6.25F, 4.25F, 7.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 130
		bodyModel[88].setRotationPoint(-6.25F, 5F, 7.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 131
		bodyModel[89].setRotationPoint(-6.25F, 7.5F, 7.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 132
		bodyModel[90].setRotationPoint(-4.5F, 5.5F, 6.25F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 133
		bodyModel[91].setRotationPoint(-10.5F, 5.5F, 6.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 134
		bodyModel[92].setRotationPoint(-7.5F, 5.5F, 6.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 135
		bodyModel[93].setRotationPoint(-8.5F, 5.5F, 6.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[94].setRotationPoint(-4.5F, 5F, 9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 137
		bodyModel[95].setRotationPoint(-12.5F, 4F, 6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F); // Box 138
		bodyModel[96].setRotationPoint(11.5F, 4F, 6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 139
		bodyModel[97].setRotationPoint(-11.5F, 4F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 140
		bodyModel[98].setRotationPoint(7F, 4.5F, 7.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull fricts
		bodyModel[99].setRotationPoint(7.5F, 6F, 8.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 142
		bodyModel[100].setRotationPoint(9.5F, 6F, 6.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 143
		bodyModel[101].setRotationPoint(6.5F, 6F, 6.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box springles
		bodyModel[102].setRotationPoint(3F, 6F, 4.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 145
		bodyModel[103].setRotationPoint(5.25F, 5F, 7.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 146
		bodyModel[104].setRotationPoint(9.5F, 5.5F, 6.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147
		bodyModel[105].setRotationPoint(6.5F, 5.5F, 6.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box springles
		bodyModel[106].setRotationPoint(5.25F, 4.25F, 7.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 149
		bodyModel[107].setRotationPoint(5.25F, 7.5F, 7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, 0F); // Box 150
		bodyModel[108].setRotationPoint(2.5F, 8.25F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2.125F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 2.125F, 0F); // Box 151
		bodyModel[109].setRotationPoint(5.5F, 6F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F); // Box 152
		bodyModel[110].setRotationPoint(1.5F, 8.25F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 153
		bodyModel[111].setRotationPoint(7.5F, 5.5F, 6.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 154
		bodyModel[112].setRotationPoint(3.5F, 5.5F, 6.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 156
		bodyModel[113].setRotationPoint(-1.5F, 4.5F, 7.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 157
		bodyModel[114].setRotationPoint(1F, 6F, 6.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 158
		bodyModel[115].setRotationPoint(-2F, 6F, 6.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 159
		bodyModel[116].setRotationPoint(1F, 5.5F, 6.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 160
		bodyModel[117].setRotationPoint(-2F, 5.5F, 6.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull fricts
		bodyModel[118].setRotationPoint(-1F, 6F, 8.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[119].setRotationPoint(3.5F, 5F, 9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[120].setRotationPoint(-4.5F, 5F, -9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[121].setRotationPoint(3.5F, 5F, -9F);

		bodyModel[122].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[122].setRotationPoint(-11.5F, 8F, 5.5F);
		bodyModel[122].rotateAngleZ = 0.21816616F;

		bodyModel[123].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[123].setRotationPoint(-3F, 8F, 5.5F);
		bodyModel[123].rotateAngleZ = 0.21816616F;

		bodyModel[124].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[124].setRotationPoint(3F, 8F, 5.5F);
		bodyModel[124].rotateAngleZ = -0.21816616F;

		bodyModel[125].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[125].setRotationPoint(-5.5F, 8F, 5.5F);
		bodyModel[125].rotateAngleZ = -0.21816616F;

		bodyModel[126].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[126].setRotationPoint(11.5F, 8F, 5.5F);
		bodyModel[126].rotateAngleZ = -0.21816616F;

		bodyModel[127].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[127].setRotationPoint(5.5F, 8F, 5.5F);
		bodyModel[127].rotateAngleZ = 0.21816616F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[128].setRotationPoint(-10.25F, 5F, -3.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 173
		bodyModel[129].setRotationPoint(-12.25F, 5F, -3.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 174
		bodyModel[130].setRotationPoint(-12.25F, 5F, 2.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[131].setRotationPoint(-10.25F, 5F, 2.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[132].setRotationPoint(10.25F, 5F, -3.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[133].setRotationPoint(5.25F, 5F, -3.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[134].setRotationPoint(5.25F, 5F, 2.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[135].setRotationPoint(10.25F, 5F, 2.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box dynamoo
		bodyModel[136].setRotationPoint(-9.5F, 6F, -1.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box roller bearings
		bodyModel[137].setRotationPoint(-9.5F, 6F, -9.25F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box roller bearings
		bodyModel[138].setRotationPoint(-1F, 6F, -9.25F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box roller bearings
		bodyModel[139].setRotationPoint(7.5F, 6F, -9.25F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box roller bearings
		bodyModel[140].setRotationPoint(-9.5F, 6F, 8.25F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box roller bearings
		bodyModel[141].setRotationPoint(-1F, 6F, 8.25F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box roller bearings
		bodyModel[142].setRotationPoint(7.5F, 6F, 8.25F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 144
		bodyModel[143].setRotationPoint(-9.5F, 6F, -9.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 145
		bodyModel[144].setRotationPoint(7.5F, 6F, -9.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 146
		bodyModel[145].setRotationPoint(-1F, 6F, -9.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 147
		bodyModel[146].setRotationPoint(-0.5F, 5.5F, 6.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 148
		bodyModel[147].setRotationPoint(-0.5F, 5.5F, -8.5F);
	}
}