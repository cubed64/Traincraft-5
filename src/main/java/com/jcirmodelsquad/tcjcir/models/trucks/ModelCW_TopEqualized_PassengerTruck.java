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

public class ModelCW_TopEqualized_PassengerTruck extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public ModelCW_TopEqualized_PassengerTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[146];

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
		bodyModel[6] = new ModelRendererTurbo(this, 149, 55, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 91, 55, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 98, 55, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 76, 42, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 75, 39, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 76, 42, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 151, 42, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 140, 39, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 151, 42, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 148, 43, textureX, textureY); // Box axlez
		bodyModel[16] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Box axlez
		bodyModel[17] = new ModelRendererTurbo(this, 40, 44, textureX, textureY); // Box axlez
		bodyModel[18] = new ModelRendererTurbo(this, 103, 20, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 124, 20, textureX, textureY); // Box 36
		bodyModel[20] = new ModelRendererTurbo(this, 124, 26, textureX, textureY); // Box 37
		bodyModel[21] = new ModelRendererTurbo(this, 103, 26, textureX, textureY); // Box 38
		bodyModel[22] = new ModelRendererTurbo(this, 124, 32, textureX, textureY); // Box 39
		bodyModel[23] = new ModelRendererTurbo(this, 103, 32, textureX, textureY); // Box 40
		bodyModel[24] = new ModelRendererTurbo(this, 117, 37, textureX, textureY); // Box interior crossmembers
		bodyModel[25] = new ModelRendererTurbo(this, 108, 42, textureX, textureY); // Box interior crossmembers
		bodyModel[26] = new ModelRendererTurbo(this, 117, 38, textureX, textureY); // Box interior crossmembers
		bodyModel[27] = new ModelRendererTurbo(this, 94, 38, textureX, textureY); // Box interior crossmembers
		bodyModel[28] = new ModelRendererTurbo(this, 117, 42, textureX, textureY); // Box interior crossmembers
		bodyModel[29] = new ModelRendererTurbo(this, 108, 37, textureX, textureY); // Box interior crossmembers
		bodyModel[30] = new ModelRendererTurbo(this, 64, 4, textureX, textureY); // Box 52
		bodyModel[31] = new ModelRendererTurbo(this, 131, 40, textureX, textureY); // Box springles
		bodyModel[32] = new ModelRendererTurbo(this, 131, 40, textureX, textureY); // Box springles
		bodyModel[33] = new ModelRendererTurbo(this, 82, 56, textureX, textureY); // Box 62
		bodyModel[34] = new ModelRendererTurbo(this, 77, 4, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 156, 54, textureX, textureY); // Box 66
		bodyModel[36] = new ModelRendererTurbo(this, 117, 31, textureX, textureY); // Box cull
		bodyModel[37] = new ModelRendererTurbo(this, 48, 36, textureX, textureY); // Box brakeshoes
		bodyModel[38] = new ModelRendererTurbo(this, 34, 36, textureX, textureY); // Box brakeshoes
		bodyModel[39] = new ModelRendererTurbo(this, 29, 36, textureX, textureY); // Box brakeshoes
		bodyModel[40] = new ModelRendererTurbo(this, 43, 36, textureX, textureY); // Box brakeshoes
		bodyModel[41] = new ModelRendererTurbo(this, 17, 36, textureX, textureY); // Box brakeshoes
		bodyModel[42] = new ModelRendererTurbo(this, 12, 36, textureX, textureY); // Box brakeshoes
		bodyModel[43] = new ModelRendererTurbo(this, 119, 3, textureX, textureY); // Box 86
		bodyModel[44] = new ModelRendererTurbo(this, 87, 3, textureX, textureY); // Box 88
		bodyModel[45] = new ModelRendererTurbo(this, 104, 1, textureX, textureY); // Box 89
		bodyModel[46] = new ModelRendererTurbo(this, 105, 7, textureX, textureY); // Box 90
		bodyModel[47] = new ModelRendererTurbo(this, 46, 4, textureX, textureY); // Box 97
		bodyModel[48] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 100
		bodyModel[49] = new ModelRendererTurbo(this, 28, 14, textureX, textureY); // Box 101
		bodyModel[50] = new ModelRendererTurbo(this, 44, 14, textureX, textureY); // Box 102
		bodyModel[51] = new ModelRendererTurbo(this, 110, 34, textureX, textureY); // Box 106
		bodyModel[52] = new ModelRendererTurbo(this, 103, 20, textureX, textureY); // Box 122
		bodyModel[53] = new ModelRendererTurbo(this, 50, 7, textureX, textureY); // Box cull fricts
		bodyModel[54] = new ModelRendererTurbo(this, 124, 20, textureX, textureY); // Box 124
		bodyModel[55] = new ModelRendererTurbo(this, 64, 1, textureX, textureY); // Box 125
		bodyModel[56] = new ModelRendererTurbo(this, 86, 40, textureX, textureY); // Box springles
		bodyModel[57] = new ModelRendererTurbo(this, 156, 48, textureX, textureY); // Box 130
		bodyModel[58] = new ModelRendererTurbo(this, 77, 1, textureX, textureY); // Box 131
		bodyModel[59] = new ModelRendererTurbo(this, 44, 14, textureX, textureY); // Box 135
		bodyModel[60] = new ModelRendererTurbo(this, 149, 50, textureX, textureY); // Box 137
		bodyModel[61] = new ModelRendererTurbo(this, 91, 50, textureX, textureY); // Box 138
		bodyModel[62] = new ModelRendererTurbo(this, 98, 50, textureX, textureY); // Box 139
		bodyModel[63] = new ModelRendererTurbo(this, 50, 7, textureX, textureY); // Box cull fricts
		bodyModel[64] = new ModelRendererTurbo(this, 124, 32, textureX, textureY); // Box 142
		bodyModel[65] = new ModelRendererTurbo(this, 103, 32, textureX, textureY); // Box 143
		bodyModel[66] = new ModelRendererTurbo(this, 86, 40, textureX, textureY); // Box springles
		bodyModel[67] = new ModelRendererTurbo(this, 82, 50, textureX, textureY); // Box 145
		bodyModel[68] = new ModelRendererTurbo(this, 46, 1, textureX, textureY); // Box 149
		bodyModel[69] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 151
		bodyModel[70] = new ModelRendererTurbo(this, 28, 14, textureX, textureY); // Box 153
		bodyModel[71] = new ModelRendererTurbo(this, 124, 26, textureX, textureY); // Box 157
		bodyModel[72] = new ModelRendererTurbo(this, 103, 26, textureX, textureY); // Box 158
		bodyModel[73] = new ModelRendererTurbo(this, 50, 7, textureX, textureY); // Box cull fricts
		bodyModel[74] = new ModelRendererTurbo(this, 34, 40, textureX, textureY); // Box brakeshoes
		bodyModel[75] = new ModelRendererTurbo(this, 48, 40, textureX, textureY); // Box brakeshoes
		bodyModel[76] = new ModelRendererTurbo(this, 43, 40, textureX, textureY); // Box brakeshoes
		bodyModel[77] = new ModelRendererTurbo(this, 29, 40, textureX, textureY); // Box brakeshoes
		bodyModel[78] = new ModelRendererTurbo(this, 17, 40, textureX, textureY); // Box brakeshoes
		bodyModel[79] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box brakeshoes
		bodyModel[80] = new ModelRendererTurbo(this, 23, 54, textureX, textureY); // Box dynamoo
		bodyModel[81] = new ModelRendererTurbo(this, 64, 7, textureX, textureY); // Box roller bearings
		bodyModel[82] = new ModelRendererTurbo(this, 64, 7, textureX, textureY); // Box roller bearings
		bodyModel[83] = new ModelRendererTurbo(this, 64, 7, textureX, textureY); // Box roller bearings
		bodyModel[84] = new ModelRendererTurbo(this, 71, 7, textureX, textureY); // Box roller bearings
		bodyModel[85] = new ModelRendererTurbo(this, 71, 7, textureX, textureY); // Box roller bearings
		bodyModel[86] = new ModelRendererTurbo(this, 71, 7, textureX, textureY); // Box roller bearings
		bodyModel[87] = new ModelRendererTurbo(this, 57, 7, textureX, textureY); // Box 144
		bodyModel[88] = new ModelRendererTurbo(this, 57, 7, textureX, textureY); // Box 145
		bodyModel[89] = new ModelRendererTurbo(this, 57, 7, textureX, textureY); // Box 146
		bodyModel[90] = new ModelRendererTurbo(this, 35, 14, textureX, textureY); // Box 147
		bodyModel[91] = new ModelRendererTurbo(this, 35, 14, textureX, textureY); // Box 148
		bodyModel[92] = new ModelRendererTurbo(this, 94, 21, textureX, textureY); // Box interior crossmembers
		bodyModel[93] = new ModelRendererTurbo(this, 94, 26, textureX, textureY); // Box interior crossmembers
		bodyModel[94] = new ModelRendererTurbo(this, 84, 21, textureX, textureY); // Box 150
		bodyModel[95] = new ModelRendererTurbo(this, 86, 26, textureX, textureY); // Box 151
		bodyModel[96] = new ModelRendererTurbo(this, 82, 20, textureX, textureY); // Box interior crossmembers
		bodyModel[97] = new ModelRendererTurbo(this, 143, 21, textureX, textureY); // Box interior crossmembers
		bodyModel[98] = new ModelRendererTurbo(this, 143, 26, textureX, textureY); // Box interior crossmembers
		bodyModel[99] = new ModelRendererTurbo(this, 133, 21, textureX, textureY); // Box 150
		bodyModel[100] = new ModelRendererTurbo(this, 135, 26, textureX, textureY); // Box 151
		bodyModel[101] = new ModelRendererTurbo(this, 131, 20, textureX, textureY); // Box interior crossmembers
		bodyModel[102] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box interior crossmembers
		bodyModel[103] = new ModelRendererTurbo(this, 97, 14, textureX, textureY); // Box interior crossmembers
		bodyModel[104] = new ModelRendererTurbo(this, 87, 9, textureX, textureY); // Box 150
		bodyModel[105] = new ModelRendererTurbo(this, 89, 14, textureX, textureY); // Box 151
		bodyModel[106] = new ModelRendererTurbo(this, 85, 9, textureX, textureY); // Box interior crossmembers
		bodyModel[107] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box interior crossmembers
		bodyModel[108] = new ModelRendererTurbo(this, 129, 14, textureX, textureY); // Box interior crossmembers
		bodyModel[109] = new ModelRendererTurbo(this, 119, 9, textureX, textureY); // Box 150
		bodyModel[110] = new ModelRendererTurbo(this, 121, 14, textureX, textureY); // Box 151
		bodyModel[111] = new ModelRendererTurbo(this, 117, 9, textureX, textureY); // Box interior crossmembers
		bodyModel[112] = new ModelRendererTurbo(this, 71, 24, textureX, textureY); // Box 105
		bodyModel[113] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 130
		bodyModel[114] = new ModelRendererTurbo(this, 79, 19, textureX, textureY); // Box 131
		bodyModel[115] = new ModelRendererTurbo(this, 50, 19, textureX, textureY); // Box 190
		bodyModel[116] = new ModelRendererTurbo(this, 62, 19, textureX, textureY); // Box 193
		bodyModel[117] = new ModelRendererTurbo(this, 54, 24, textureX, textureY); // Box 194
		bodyModel[118] = new ModelRendererTurbo(this, 72, 19, textureX, textureY); // Box 131
		bodyModel[119] = new ModelRendererTurbo(this, 55, 19, textureX, textureY); // Box 131
		bodyModel[120] = new ModelRendererTurbo(this, 71, 16, textureX, textureY); // Box 167
		bodyModel[121] = new ModelRendererTurbo(this, 68, 11, textureX, textureY); // Box 168
		bodyModel[122] = new ModelRendererTurbo(this, 80, 11, textureX, textureY); // Box 169
		bodyModel[123] = new ModelRendererTurbo(this, 51, 11, textureX, textureY); // Box 170
		bodyModel[124] = new ModelRendererTurbo(this, 63, 11, textureX, textureY); // Box 171
		bodyModel[125] = new ModelRendererTurbo(this, 54, 16, textureX, textureY); // Box 172
		bodyModel[126] = new ModelRendererTurbo(this, 73, 11, textureX, textureY); // Box 173
		bodyModel[127] = new ModelRendererTurbo(this, 56, 11, textureX, textureY); // Box 174
		bodyModel[128] = new ModelRendererTurbo(this, 117, 34, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 110, 31, textureX, textureY); // Box 129
		bodyModel[130] = new ModelRendererTurbo(this, 27, 32, textureX, textureY); // Box 442
		bodyModel[131] = new ModelRendererTurbo(this, 34, 32, textureX, textureY); // Box 442
		bodyModel[132] = new ModelRendererTurbo(this, 27, 29, textureX, textureY); // Box 442
		bodyModel[133] = new ModelRendererTurbo(this, 34, 29, textureX, textureY); // Box 442
		bodyModel[134] = new ModelRendererTurbo(this, 45, 30, textureX, textureY); // Box 658
		bodyModel[135] = new ModelRendererTurbo(this, 38, 30, textureX, textureY); // Box 660
		bodyModel[136] = new ModelRendererTurbo(this, 45, 33, textureX, textureY); // Box 138
		bodyModel[137] = new ModelRendererTurbo(this, 38, 33, textureX, textureY); // Box 139
		bodyModel[138] = new ModelRendererTurbo(this, 22, 29, textureX, textureY); // Box 7
		bodyModel[139] = new ModelRendererTurbo(this, 17, 29, textureX, textureY); // Box 7
		bodyModel[140] = new ModelRendererTurbo(this, 12, 29, textureX, textureY); // Box 7
		bodyModel[141] = new ModelRendererTurbo(this, 22, 32, textureX, textureY); // Box 143
		bodyModel[142] = new ModelRendererTurbo(this, 17, 32, textureX, textureY); // Box 144
		bodyModel[143] = new ModelRendererTurbo(this, 12, 32, textureX, textureY); // Box 145
		bodyModel[144] = new ModelRendererTurbo(this, 49, 30, textureX, textureY); // Box 660
		bodyModel[145] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 145

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

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 7
		bodyModel[6].setRotationPoint(-12.5F, 4F, -8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 8
		bodyModel[7].setRotationPoint(11.5F, 4F, -8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 23, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-11.5F, 4F, -8.5F);

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

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 31
		bodyModel[18].setRotationPoint(-10.5F, 5.5F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[19].setRotationPoint(-7.5F, 5.5F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[20].setRotationPoint(1F, 5.5F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[21].setRotationPoint(-2F, 5.5F, -8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[22].setRotationPoint(9.5F, 5.5F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 40
		bodyModel[23].setRotationPoint(6.5F, 5.5F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box interior crossmembers
		bodyModel[24].setRotationPoint(-5F, 4.5F, -6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box interior crossmembers
		bodyModel[25].setRotationPoint(3F, 4.5F, -6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box interior crossmembers
		bodyModel[26].setRotationPoint(-5F, 5F, -4.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box interior crossmembers
		bodyModel[27].setRotationPoint(3F, 5F, -4.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box interior crossmembers
		bodyModel[28].setRotationPoint(-5F, 4.5F, 4.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box interior crossmembers
		bodyModel[29].setRotationPoint(3F, 4.5F, 4.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, 0F); // Box 52
		bodyModel[30].setRotationPoint(-6.75F, 5.5F, -8.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, -1.99F, 0F, 0.75F, -1.99F); // Box springles
		bodyModel[31].setRotationPoint(3F, 6.25F, -9.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, -1.99F, 0F, 0.75F, -1.99F); // Box springles
		bodyModel[32].setRotationPoint(-5F, 6.25F, -9.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, -0.49F, 0.125F, -0.25F, -0.49F, 0.125F, 0.01F, 0.125F, 0.125F, 0.01F, 0.125F, 0.125F, 0.01F, -0.49F, 0.125F, 0.01F, -0.49F); // Box 62
		bodyModel[33].setRotationPoint(-6.25F, 3.5F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[34].setRotationPoint(-6.25F, 5.5F, -8.25F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, -0.49F, 0.125F, -0.25F, -0.49F, 0.125F, 0.01F, 0.125F, 0.125F, 0.01F, 0.125F, 0.125F, 0.01F, -0.49F, 0.125F, 0.01F, -0.49F); // Box 66
		bodyModel[35].setRotationPoint(5.25F, 3.5F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box cull
		bodyModel[36].setRotationPoint(-5F, 5.5F, -7.25F);

		bodyModel[37].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[37].setRotationPoint(-11.5F, 8F, -6.5F);
		bodyModel[37].rotateAngleZ = 0.21816616F;

		bodyModel[38].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[38].setRotationPoint(-3F, 8F, -6.5F);
		bodyModel[38].rotateAngleZ = 0.21816616F;

		bodyModel[39].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[39].setRotationPoint(3F, 8F, -6.5F);
		bodyModel[39].rotateAngleZ = -0.21816616F;

		bodyModel[40].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[40].setRotationPoint(-5.5F, 8F, -6.5F);
		bodyModel[40].rotateAngleZ = -0.21816616F;

		bodyModel[41].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[41].setRotationPoint(11.5F, 8F, -6.5F);
		bodyModel[41].rotateAngleZ = -0.21816616F;

		bodyModel[42].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[42].setRotationPoint(5.5F, 8F, -6.5F);
		bodyModel[42].rotateAngleZ = 0.21816616F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 1.75F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 1.75F, 0F, 0F); // Box 86
		bodyModel[43].setRotationPoint(-3.25F, 4.25F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 1.75F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 1.75F, 0F, 0F); // Box 88
		bodyModel[44].setRotationPoint(-3.25F, 4.25F, 2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[45].setRotationPoint(-1.25F, 4.25F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[46].setRotationPoint(-1.25F, 3.5F, -1.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[47].setRotationPoint(5.25F, 5.5F, -8.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, 0F); // Box 100
		bodyModel[48].setRotationPoint(1.75F, 5.5F, -8.25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 101
		bodyModel[49].setRotationPoint(7.5F, 5.5F, -8.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 102
		bodyModel[50].setRotationPoint(-8.5F, 5.5F, -8.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 106
		bodyModel[51].setRotationPoint(3F, 5.5F, -7.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 122
		bodyModel[52].setRotationPoint(-10.5F, 5.5F, 6.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull fricts
		bodyModel[53].setRotationPoint(-9.5F, 6F, 8.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[54].setRotationPoint(-7.5F, 5.5F, 6.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, 0F); // Box 125
		bodyModel[55].setRotationPoint(-6.75F, 5.5F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, -1.99F, 0F, 0.75F, -1.99F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box springles
		bodyModel[56].setRotationPoint(-5F, 6.25F, 4.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.125F, -0.25F, -0.49F, 0.125F, -0.25F, -0.49F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, 0.01F, -0.49F, 0.125F, 0.01F, -0.49F, 0.125F, 0.01F, 0.125F, 0.125F, 0.01F, 0.125F); // Box 130
		bodyModel[57].setRotationPoint(-6.25F, 3.5F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[58].setRotationPoint(-6.25F, 5.5F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 135
		bodyModel[59].setRotationPoint(-8.5F, 5.5F, 6.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F); // Box 137
		bodyModel[60].setRotationPoint(-12.5F, 4F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F); // Box 138
		bodyModel[61].setRotationPoint(11.5F, 4F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 23, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 139
		bodyModel[62].setRotationPoint(-11.5F, 4F, 6.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull fricts
		bodyModel[63].setRotationPoint(7.5F, 6F, 8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[64].setRotationPoint(9.5F, 5.5F, 6.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 143
		bodyModel[65].setRotationPoint(6.5F, 5.5F, 6.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, -1.99F, 0F, 0.75F, -1.99F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box springles
		bodyModel[66].setRotationPoint(3F, 6.25F, 4.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.125F, -0.25F, -0.49F, 0.125F, -0.25F, -0.49F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, 0.01F, -0.49F, 0.125F, 0.01F, -0.49F, 0.125F, 0.01F, 0.125F, 0.125F, 0.01F, 0.125F); // Box 145
		bodyModel[67].setRotationPoint(5.25F, 3.5F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[68].setRotationPoint(5.25F, 5.5F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, 0F); // Box 151
		bodyModel[69].setRotationPoint(1.75F, 5.5F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 153
		bodyModel[70].setRotationPoint(7.5F, 5.5F, 6.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[71].setRotationPoint(1F, 5.5F, 6.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 158
		bodyModel[72].setRotationPoint(-2F, 5.5F, 6.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull fricts
		bodyModel[73].setRotationPoint(-1F, 6F, 8.5F);

		bodyModel[74].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[74].setRotationPoint(-11.5F, 8F, 5.5F);
		bodyModel[74].rotateAngleZ = 0.21816616F;

		bodyModel[75].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[75].setRotationPoint(-3F, 8F, 5.5F);
		bodyModel[75].rotateAngleZ = 0.21816616F;

		bodyModel[76].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[76].setRotationPoint(3F, 8F, 5.5F);
		bodyModel[76].rotateAngleZ = -0.21816616F;

		bodyModel[77].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[77].setRotationPoint(-5.5F, 8F, 5.5F);
		bodyModel[77].rotateAngleZ = -0.21816616F;

		bodyModel[78].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[78].setRotationPoint(11.5F, 8F, 5.5F);
		bodyModel[78].rotateAngleZ = -0.21816616F;

		bodyModel[79].addShapeBox(-0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box brakeshoes
		bodyModel[79].setRotationPoint(5.5F, 8F, 5.5F);
		bodyModel[79].rotateAngleZ = 0.21816616F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box dynamoo
		bodyModel[80].setRotationPoint(-9.5F, 6F, -2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box roller bearings
		bodyModel[81].setRotationPoint(-9.5F, 6F, -9.25F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box roller bearings
		bodyModel[82].setRotationPoint(-1F, 6F, -9.25F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box roller bearings
		bodyModel[83].setRotationPoint(7.5F, 6F, -9.25F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box roller bearings
		bodyModel[84].setRotationPoint(-9.5F, 6F, 8.25F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box roller bearings
		bodyModel[85].setRotationPoint(-1F, 6F, 8.25F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box roller bearings
		bodyModel[86].setRotationPoint(7.5F, 6F, 8.25F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 144
		bodyModel[87].setRotationPoint(-9.5F, 6F, -9.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 145
		bodyModel[88].setRotationPoint(7.5F, 6F, -9.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 146
		bodyModel[89].setRotationPoint(-1F, 6F, -9.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 147
		bodyModel[90].setRotationPoint(-1F, 5.5F, 6.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 148
		bodyModel[91].setRotationPoint(-1F, 5.5F, -8.75F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box interior crossmembers
		bodyModel[92].setRotationPoint(5F, 4F, -6.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box interior crossmembers
		bodyModel[93].setRotationPoint(5F, 5.5F, -5.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 150
		bodyModel[94].setRotationPoint(5F, 4F, 4.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 151
		bodyModel[95].setRotationPoint(5F, 5.5F, 4.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box interior crossmembers
		bodyModel[96].setRotationPoint(5F, 5.5F, -4.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box interior crossmembers
		bodyModel[97].setRotationPoint(-6F, 4F, -6.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box interior crossmembers
		bodyModel[98].setRotationPoint(-6F, 5.5F, -5.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 150
		bodyModel[99].setRotationPoint(-6F, 4F, 4.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 151
		bodyModel[100].setRotationPoint(-6F, 5.5F, 4.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box interior crossmembers
		bodyModel[101].setRotationPoint(-6F, 5.5F, -4.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box interior crossmembers
		bodyModel[102].setRotationPoint(2.5F, 4F, -6.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box interior crossmembers
		bodyModel[103].setRotationPoint(2.5F, 5.5F, -5.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 150
		bodyModel[104].setRotationPoint(2.5F, 4F, 4.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 151
		bodyModel[105].setRotationPoint(2.5F, 5.5F, 4.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box interior crossmembers
		bodyModel[106].setRotationPoint(2.5F, 6F, -4.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box interior crossmembers
		bodyModel[107].setRotationPoint(-3F, 4F, -6.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box interior crossmembers
		bodyModel[108].setRotationPoint(-3F, 5.5F, -5.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 150
		bodyModel[109].setRotationPoint(-3F, 4F, 4.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 151
		bodyModel[110].setRotationPoint(-3F, 5.5F, 4.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box interior crossmembers
		bodyModel[111].setRotationPoint(-3F, 6F, -4.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 105
		bodyModel[112].setRotationPoint(-5.5F, 8.5F, -7.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 130
		bodyModel[113].setRotationPoint(-3.5F, 5.5F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 131
		bodyModel[114].setRotationPoint(-6F, 5.5F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 190
		bodyModel[115].setRotationPoint(4.5F, 5.5F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 193
		bodyModel[116].setRotationPoint(2F, 5.5F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 194
		bodyModel[117].setRotationPoint(2.5F, 8.5F, -7.25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F); // Box 131
		bodyModel[118].setRotationPoint(-5F, 6F, -7.25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F); // Box 131
		bodyModel[119].setRotationPoint(3F, 6F, -7.25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 167
		bodyModel[120].setRotationPoint(-5.5F, 8.5F, 6.25F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 168
		bodyModel[121].setRotationPoint(-3.5F, 5.5F, 6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 169
		bodyModel[122].setRotationPoint(-6F, 5.5F, 6F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 170
		bodyModel[123].setRotationPoint(4.5F, 5.5F, 6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 171
		bodyModel[124].setRotationPoint(2F, 5.5F, 6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 172
		bodyModel[125].setRotationPoint(2.5F, 8.5F, 6.25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 173
		bodyModel[126].setRotationPoint(-5F, 6F, 6.25F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 174
		bodyModel[127].setRotationPoint(3F, 6F, 6.25F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[128].setRotationPoint(-5F, 5.5F, 6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 129
		bodyModel[129].setRotationPoint(3F, 5.5F, 6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 442
		bodyModel[130].setRotationPoint(-13.5F, 3.75F, 9.37F);
		bodyModel[130].rotateAngleX = -0.78539816F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 442
		bodyModel[131].setRotationPoint(-12F, 4.1F, 9.37F);
		bodyModel[131].rotateAngleX = -0.78539816F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 442
		bodyModel[132].setRotationPoint(-13.5F, 3.85F, -9.37F);
		bodyModel[132].rotateAngleX = -0.78539816F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 442
		bodyModel[133].setRotationPoint(-12F, 4.2F, -9.37F);
		bodyModel[133].rotateAngleX = -0.78539816F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.05F, 0F, 0.12F, -0.55F, 0F, 0.12F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.05F, 0F, 0.12F, -0.55F, 0F, 0.12F); // Box 658
		bodyModel[134].setRotationPoint(-9F, 4.55F, -9.62F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.3675F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.3675F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 660
		bodyModel[135].setRotationPoint(-11.25F, 4.55F, -9.62F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.55F, 0F, 0.12F, 0.05F, 0F, 0.12F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.55F, 0F, 0.12F, 0.05F, 0F, 0.12F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 138
		bodyModel[136].setRotationPoint(-9F, 4.55F, 8.62F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -0.5F, -0.3675F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3675F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[137].setRotationPoint(-11.25F, 4.55F, 8.62F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 7
		bodyModel[138].setRotationPoint(-13.5F, 4.5F, -7.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 7
		bodyModel[139].setRotationPoint(-14F, 4.25F, -7.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.125F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.625F, -0.375F); // Box 7
		bodyModel[140].setRotationPoint(-14.5F, 4.5F, -7.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 143
		bodyModel[141].setRotationPoint(-13.5F, 4.5F, 6.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[142].setRotationPoint(-14F, 4.25F, 6.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.375F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.125F, -0.125F, 0F, -0.625F, -0.375F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, -0.625F, -0.125F); // Box 145
		bodyModel[143].setRotationPoint(-14.5F, 4.5F, 6.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 660
		bodyModel[144].setRotationPoint(-12.75F, 4.3F, -8.48F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 145
		bodyModel[145].setRotationPoint(-12.75F, 4.3F, 8.48F);
	}
}