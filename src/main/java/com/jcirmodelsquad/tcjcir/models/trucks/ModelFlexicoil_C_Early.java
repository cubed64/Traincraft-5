//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Flexicoil C1 (early)
// Model Creator: Bida
// Created on: 12.02.2022 - 19:29:09
// Last changed on: 12.02.2022 - 19:29:09

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelFlexicoil_C_Early extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelFlexicoil_C_Early() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[147];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 0 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 1 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 1, 36, textureX, textureY); // Box 4 axle front
		bodyModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 3 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 4 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 1, 36, textureX, textureY); // Box 5 axle mid
		bodyModel[6] = new ModelRendererTurbo(this, 1, 36, textureX, textureY); // Box 9 axle rear
		bodyModel[7] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 10 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 11 wheel
		bodyModel[9] = new ModelRendererTurbo(this, 14, 57, textureX, textureY); // Box 173
		bodyModel[10] = new ModelRendererTurbo(this, 14, 57, textureX, textureY); // Box 22
		bodyModel[11] = new ModelRendererTurbo(this, 14, 57, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 107, 5, textureX, textureY); // Box 64
		bodyModel[13] = new ModelRendererTurbo(this, 121, 4, textureX, textureY); // Box 65
		bodyModel[14] = new ModelRendererTurbo(this, 14, 57, textureX, textureY); // Box 68
		bodyModel[15] = new ModelRendererTurbo(this, 14, 57, textureX, textureY); // Box 69
		bodyModel[16] = new ModelRendererTurbo(this, 14, 57, textureX, textureY); // Box 70
		bodyModel[17] = new ModelRendererTurbo(this, 87, 1, textureX, textureY); // Box 100
		bodyModel[18] = new ModelRendererTurbo(this, 94, 1, textureX, textureY); // Box 101
		bodyModel[19] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 112
		bodyModel[20] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 116
		bodyModel[21] = new ModelRendererTurbo(this, 60, 1, textureX, textureY); // Box 117
		bodyModel[22] = new ModelRendererTurbo(this, 80, 1, textureX, textureY); // Box 120
		bodyModel[23] = new ModelRendererTurbo(this, 53, 1, textureX, textureY); // Box 95
		bodyModel[24] = new ModelRendererTurbo(this, 39, 1, textureX, textureY); // Box 96
		bodyModel[25] = new ModelRendererTurbo(this, 46, 1, textureX, textureY); // Box 97
		bodyModel[26] = new ModelRendererTurbo(this, 114, 1, textureX, textureY); // Box 98
		bodyModel[27] = new ModelRendererTurbo(this, 107, 1, textureX, textureY); // Box 99
		bodyModel[28] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 117
		bodyModel[29] = new ModelRendererTurbo(this, -3, 49, textureX, textureY); // Box 117
		bodyModel[30] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 118
		bodyModel[31] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 111
		bodyModel[32] = new ModelRendererTurbo(this, -3, 49, textureX, textureY); // Box 123
		bodyModel[33] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 124
		bodyModel[34] = new ModelRendererTurbo(this, 80, 5, textureX, textureY); // Box 110
		bodyModel[35] = new ModelRendererTurbo(this, 80, 5, textureX, textureY); // Box 101
		bodyModel[36] = new ModelRendererTurbo(this, 80, 5, textureX, textureY); // Box 102
		bodyModel[37] = new ModelRendererTurbo(this, 42, 14, textureX, textureY); // Box 103
		bodyModel[38] = new ModelRendererTurbo(this, 37, 13, textureX, textureY); // Box 104
		bodyModel[39] = new ModelRendererTurbo(this, 28, 12, textureX, textureY); // Box 105
		bodyModel[40] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 106
		bodyModel[41] = new ModelRendererTurbo(this, 94, 25, textureX, textureY); // Box 107
		bodyModel[42] = new ModelRendererTurbo(this, 107, 25, textureX, textureY); // Box 108
		bodyModel[43] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 109
		bodyModel[44] = new ModelRendererTurbo(this, 87, 25, textureX, textureY); // Box 110
		bodyModel[45] = new ModelRendererTurbo(this, 80, 25, textureX, textureY); // Box 111
		bodyModel[46] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 112
		bodyModel[47] = new ModelRendererTurbo(this, 60, 25, textureX, textureY); // Box 113
		bodyModel[48] = new ModelRendererTurbo(this, 53, 25, textureX, textureY); // Box 114
		bodyModel[49] = new ModelRendererTurbo(this, 39, 25, textureX, textureY); // Box 115
		bodyModel[50] = new ModelRendererTurbo(this, 46, 25, textureX, textureY); // Box 116
		bodyModel[51] = new ModelRendererTurbo(this, 114, 25, textureX, textureY); // Box 117
		bodyModel[52] = new ModelRendererTurbo(this, 42, 19, textureX, textureY); // Box 119
		bodyModel[53] = new ModelRendererTurbo(this, 37, 19, textureX, textureY); // Box 120
		bodyModel[54] = new ModelRendererTurbo(this, 42, 14, textureX, textureY); // Box 121
		bodyModel[55] = new ModelRendererTurbo(this, 42, 19, textureX, textureY); // Box 122
		bodyModel[56] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 123
		bodyModel[57] = new ModelRendererTurbo(this, 37, 19, textureX, textureY); // Box 124
		bodyModel[58] = new ModelRendererTurbo(this, 37, 13, textureX, textureY); // Box 125
		bodyModel[59] = new ModelRendererTurbo(this, 28, 12, textureX, textureY); // Box 126
		bodyModel[60] = new ModelRendererTurbo(this, 28, 12, textureX, textureY); // Box 127
		bodyModel[61] = new ModelRendererTurbo(this, 28, 12, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 3, 18, textureX, textureY); // Box 129
		bodyModel[63] = new ModelRendererTurbo(this, 3, 18, textureX, textureY); // Box 130
		bodyModel[64] = new ModelRendererTurbo(this, 62, 48, textureX, textureY); // Box 131
		bodyModel[65] = new ModelRendererTurbo(this, 81, 45, textureX, textureY); // Box 133
		bodyModel[66] = new ModelRendererTurbo(this, 62, 48, textureX, textureY); // Box 134
		bodyModel[67] = new ModelRendererTurbo(this, 81, 45, textureX, textureY); // Box 135
		bodyModel[68] = new ModelRendererTurbo(this, 80, 29, textureX, textureY); // Box 136
		bodyModel[69] = new ModelRendererTurbo(this, 80, 29, textureX, textureY); // Box 137
		bodyModel[70] = new ModelRendererTurbo(this, 80, 29, textureX, textureY); // Box 138
		bodyModel[71] = new ModelRendererTurbo(this, 62, 48, textureX, textureY); // Box 139
		bodyModel[72] = new ModelRendererTurbo(this, 81, 45, textureX, textureY); // Box 140
		bodyModel[73] = new ModelRendererTurbo(this, 73, 5, textureX, textureY); // Box 142
		bodyModel[74] = new ModelRendererTurbo(this, 87, 5, textureX, textureY); // Box 143
		bodyModel[75] = new ModelRendererTurbo(this, 39, 4, textureX, textureY); // Box 144
		bodyModel[76] = new ModelRendererTurbo(this, 53, 5, textureX, textureY); // Box 145
		bodyModel[77] = new ModelRendererTurbo(this, 53, 29, textureX, textureY); // Box 154
		bodyModel[78] = new ModelRendererTurbo(this, 39, 28, textureX, textureY); // Box 155
		bodyModel[79] = new ModelRendererTurbo(this, 87, 29, textureX, textureY); // Box 156
		bodyModel[80] = new ModelRendererTurbo(this, 73, 29, textureX, textureY); // Box 157
		bodyModel[81] = new ModelRendererTurbo(this, 107, 29, textureX, textureY); // Box 158
		bodyModel[82] = new ModelRendererTurbo(this, 121, 28, textureX, textureY); // Box 159
		bodyModel[83] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 153
		bodyModel[84] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 155
		bodyModel[85] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 156
		bodyModel[86] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 121
		bodyModel[87] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 172
		bodyModel[88] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 173
		bodyModel[89] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 176
		bodyModel[90] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 177
		bodyModel[91] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 178
		bodyModel[92] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 179
		bodyModel[93] = new ModelRendererTurbo(this, 97, 47, textureX, textureY); // Box 180
		bodyModel[94] = new ModelRendererTurbo(this, 97, 47, textureX, textureY); // Box 181
		bodyModel[95] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 182
		bodyModel[96] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 183
		bodyModel[97] = new ModelRendererTurbo(this, 28, 23, textureX, textureY); // Box 184
		bodyModel[98] = new ModelRendererTurbo(this, 28, 23, textureX, textureY); // Box 185
		bodyModel[99] = new ModelRendererTurbo(this, -3, 49, textureX, textureY); // Box 186
		bodyModel[100] = new ModelRendererTurbo(this, -3, 49, textureX, textureY); // Box 187
		bodyModel[101] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 188
		bodyModel[102] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 189
		bodyModel[103] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 198
		bodyModel[104] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 203
		bodyModel[105] = new ModelRendererTurbo(this, 19, 59, textureX, textureY); // Box 204
		bodyModel[106] = new ModelRendererTurbo(this, 19, 59, textureX, textureY); // Box 205
		bodyModel[107] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 141
		bodyModel[108] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 142
		bodyModel[109] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 119
		bodyModel[110] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 120
		bodyModel[111] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 116
		bodyModel[112] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 146
		bodyModel[113] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 147
		bodyModel[114] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 148
		bodyModel[115] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 149
		bodyModel[116] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 150
		bodyModel[117] = new ModelRendererTurbo(this, -3, 49, textureX, textureY); // Box 151
		bodyModel[118] = new ModelRendererTurbo(this, 28, 23, textureX, textureY); // Box 152
		bodyModel[119] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 153
		bodyModel[120] = new ModelRendererTurbo(this, -3, 49, textureX, textureY); // Box 154
		bodyModel[121] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 155
		bodyModel[122] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 156
		bodyModel[123] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 157
		bodyModel[124] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 158
		bodyModel[125] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 159
		bodyModel[126] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 160
		bodyModel[127] = new ModelRendererTurbo(this, 74, 19, textureX, textureY); // Box 130
		bodyModel[128] = new ModelRendererTurbo(this, 74, 19, textureX, textureY); // Box 162
		bodyModel[129] = new ModelRendererTurbo(this, 74, 19, textureX, textureY); // Box 163
		bodyModel[130] = new ModelRendererTurbo(this, 78, 21, textureX, textureY); // Box 164
		bodyModel[131] = new ModelRendererTurbo(this, 74, 43, textureX, textureY); // Box 165
		bodyModel[132] = new ModelRendererTurbo(this, 74, 43, textureX, textureY); // Box 166
		bodyModel[133] = new ModelRendererTurbo(this, 74, 43, textureX, textureY); // Box 167
		bodyModel[134] = new ModelRendererTurbo(this, 78, 21, textureX, textureY); // Box 168
		bodyModel[135] = new ModelRendererTurbo(this, 78, 21, textureX, textureY); // Box 169
		bodyModel[136] = new ModelRendererTurbo(this, 80, 45, textureX, textureY); // Box 170
		bodyModel[137] = new ModelRendererTurbo(this, 80, 45, textureX, textureY); // Box 171
		bodyModel[138] = new ModelRendererTurbo(this, 80, 45, textureX, textureY); // Box 172
		bodyModel[139] = new ModelRendererTurbo(this, 53, 29, textureX, textureY); // Box 173
		bodyModel[140] = new ModelRendererTurbo(this, 87, 29, textureX, textureY); // Box 174
		bodyModel[141] = new ModelRendererTurbo(this, 73, 29, textureX, textureY); // Box 175
		bodyModel[142] = new ModelRendererTurbo(this, 107, 29, textureX, textureY); // Box 176
		bodyModel[143] = new ModelRendererTurbo(this, 53, 5, textureX, textureY); // Box 177
		bodyModel[144] = new ModelRendererTurbo(this, 73, 5, textureX, textureY); // Box 178
		bodyModel[145] = new ModelRendererTurbo(this, 87, 5, textureX, textureY); // Box 179
		bodyModel[146] = new ModelRendererTurbo(this, 107, 5, textureX, textureY); // Box 180

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 0 wheel
		bodyModel[0].setRotationPoint(-11F, 7F, -6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 1 wheel
		bodyModel[1].setRotationPoint(0F, 7F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4 axle front
		bodyModel[2].setRotationPoint(-12F, 6F, -9F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 3 wheel
		bodyModel[3].setRotationPoint(-11F, 7F, 6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 4 wheel
		bodyModel[4].setRotationPoint(0F, 7F, 6F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5 axle mid
		bodyModel[5].setRotationPoint(-1F, 6F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 9 axle rear
		bodyModel[6].setRotationPoint(10F, 6F, -9F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10 wheel
		bodyModel[7].setRotationPoint(11F, 7F, -6F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11 wheel
		bodyModel[8].setRotationPoint(11F, 7F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[9].setRotationPoint(-12F, 6F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 22
		bodyModel[10].setRotationPoint(-1F, 6F, -9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23
		bodyModel[11].setRotationPoint(10F, 6F, -9.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[12].setRotationPoint(-10F, 6F, 7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 65
		bodyModel[13].setRotationPoint(-14F, 5F, 7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 68
		bodyModel[14].setRotationPoint(-1F, 6F, 8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 69
		bodyModel[15].setRotationPoint(-12F, 6F, 8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 70
		bodyModel[16].setRotationPoint(10F, 6F, 8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 100
		bodyModel[17].setRotationPoint(-3F, 4F, 8F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 101
		bodyModel[18].setRotationPoint(-8F, 4.5F, 8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 112
		bodyModel[19].setRotationPoint(-14F, 4F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[20].setRotationPoint(1F, 4F, 8F);

		bodyModel[21].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 117
		bodyModel[21].setRotationPoint(3F, 4.5F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[22].setRotationPoint(-1F, 3F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 95
		bodyModel[23].setRotationPoint(8F, 4F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[24].setRotationPoint(12F, 4F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[25].setRotationPoint(10F, 3F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[26].setRotationPoint(-12F, 3F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[27].setRotationPoint(-10F, 4F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 117
		bodyModel[28].setRotationPoint(-11.5F, 3F, 9.5F);
		bodyModel[28].rotateAngleX = -0.78539816F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 117
		bodyModel[29].setRotationPoint(-8.5F, 3.8F, 6.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 118
		bodyModel[30].setRotationPoint(-10.5F, 3.8F, 9.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 111
		bodyModel[31].setRotationPoint(9.5F, 3F, 9.5F);
		bodyModel[31].rotateAngleX = -0.78539816F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F); // Box 123
		bodyModel[32].setRotationPoint(7.5F, 3.8F, 6.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 124
		bodyModel[33].setRotationPoint(8.5F, 3.8F, 9.25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 110
		bodyModel[34].setRotationPoint(10F, 4.5F, 7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 101
		bodyModel[35].setRotationPoint(-1F, 4.5F, 7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 102
		bodyModel[36].setRotationPoint(-12F, 4.5F, 7.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[37].setRotationPoint(4F, 3F, 7.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[38].setRotationPoint(6.5F, 3F, 7.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 105
		bodyModel[39].setRotationPoint(4.5F, 3.5F, 5.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 106
		bodyModel[40].setRotationPoint(4.5F, 3F, -9F);

		bodyModel[41].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 107
		bodyModel[41].setRotationPoint(-8F, 4.5F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[42].setRotationPoint(-10F, 4F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 109
		bodyModel[43].setRotationPoint(-14F, 4F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 110
		bodyModel[44].setRotationPoint(-3F, 4F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[45].setRotationPoint(-1F, 3F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[46].setRotationPoint(1F, 4F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 113
		bodyModel[47].setRotationPoint(3F, 4.5F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 114
		bodyModel[48].setRotationPoint(8F, 4F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[49].setRotationPoint(12F, 4F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[50].setRotationPoint(10F, 3F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[51].setRotationPoint(-12F, 3F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[52].setRotationPoint(4F, 3F, -8.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[53].setRotationPoint(6.5F, 3F, -8.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 121
		bodyModel[54].setRotationPoint(-5F, 3F, 7.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 122
		bodyModel[55].setRotationPoint(-5F, 3F, -8.75F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 123
		bodyModel[56].setRotationPoint(-6.5F, 3F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[57].setRotationPoint(-7.5F, 3F, -8.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[58].setRotationPoint(-7.5F, 3F, 7.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 126
		bodyModel[59].setRotationPoint(4.5F, 3F, -7.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 127
		bodyModel[60].setRotationPoint(-6.5F, 3F, -7.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 128
		bodyModel[61].setRotationPoint(-6.5F, 3.5F, 5.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 129
		bodyModel[62].setRotationPoint(4.5F, 4.5F, -8F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 130
		bodyModel[63].setRotationPoint(-6.5F, 4.5F, -8F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 5, 10, 0F); // Box 131
		bodyModel[64].setRotationPoint(7F, 4F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 133
		bodyModel[65].setRotationPoint(11F, 5F, -5F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 5, 10, 0F); // Box 134
		bodyModel[66].setRotationPoint(-11F, 4F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[67].setRotationPoint(-14F, 5F, -5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 136
		bodyModel[68].setRotationPoint(-1F, 4.5F, -8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 137
		bodyModel[69].setRotationPoint(-12F, 4.5F, -8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 138
		bodyModel[70].setRotationPoint(10F, 4.5F, -8.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 5, 10, 0F); // Box 139
		bodyModel[71].setRotationPoint(-3F, 4F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 140
		bodyModel[72].setRotationPoint(1F, 5F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[73].setRotationPoint(1F, 6F, 7.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 143
		bodyModel[74].setRotationPoint(-3F, 6F, 7.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[75].setRotationPoint(12F, 5F, 7.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 145
		bodyModel[76].setRotationPoint(8F, 6F, 7.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 154
		bodyModel[77].setRotationPoint(8F, 6F, -8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[78].setRotationPoint(12F, 5F, -8.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 156
		bodyModel[79].setRotationPoint(-3F, 6F, -8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[80].setRotationPoint(1F, 6F, -8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[81].setRotationPoint(-10F, 6F, -8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 159
		bodyModel[82].setRotationPoint(-14F, 5F, -8.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[83].setRotationPoint(6.5F, 4.5F, 6.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 155
		bodyModel[84].setRotationPoint(-7.5F, 4.5F, 6.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 156
		bodyModel[85].setRotationPoint(-7.5F, 7.5F, 6.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 121
		bodyModel[86].setRotationPoint(6.5F, 7.5F, 6.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 172
		bodyModel[87].setRotationPoint(3.5F, 4.5F, 6.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 173
		bodyModel[88].setRotationPoint(3.5F, 7.5F, 6.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[89].setRotationPoint(6.5F, 4.5F, -7.25F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 177
		bodyModel[90].setRotationPoint(6.5F, 7.5F, -7.25F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 178
		bodyModel[91].setRotationPoint(-7.5F, 4.5F, -7.25F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 179
		bodyModel[92].setRotationPoint(-7.5F, 7.5F, -7.25F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 5, 11, 0F); // Box 180
		bodyModel[93].setRotationPoint(-7F, 4F, -5.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 5, 11, 0F); // Box 181
		bodyModel[94].setRotationPoint(3F, 4F, -5.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 182
		bodyModel[95].setRotationPoint(-4.5F, 7.5F, -7.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 183
		bodyModel[96].setRotationPoint(-4.5F, 4.5F, -7.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 184
		bodyModel[97].setRotationPoint(-11.5F, 3F, -9.5F);
		bodyModel[97].rotateAngleX = -0.78539816F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 185
		bodyModel[98].setRotationPoint(9.5F, 3F, -9.5F);
		bodyModel[98].rotateAngleX = -0.78539816F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 186
		bodyModel[99].setRotationPoint(7.5F, 3.8F, -10.25F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 187
		bodyModel[100].setRotationPoint(-8.5F, 3.8F, -10.25F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[101].setRotationPoint(-10.5F, 3.8F, -10.25F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 189
		bodyModel[102].setRotationPoint(8.5F, 3.8F, -10.25F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 198
		bodyModel[103].setRotationPoint(3.5F, 4.5F, -7.25F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 203
		bodyModel[104].setRotationPoint(-4.5F, 4.5F, 6.75F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 204
		bodyModel[105].setRotationPoint(-3F, 3F, -1F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 205
		bodyModel[106].setRotationPoint(2F, 3F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 141
		bodyModel[107].setRotationPoint(3.5F, 7.5F, -7.25F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 142
		bodyModel[108].setRotationPoint(-4.5F, 7.5F, 6.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 119
		bodyModel[109].setRotationPoint(-15F, 4.5F, 6.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 120
		bodyModel[110].setRotationPoint(-14.5F, 7.5F, 6.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, -1F); // Box 116
		bodyModel[111].setRotationPoint(-15F, 4F, 4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 146
		bodyModel[112].setRotationPoint(14F, 4.5F, 6.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 147
		bodyModel[113].setRotationPoint(13.5F, 7.5F, 6.75F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 148
		bodyModel[114].setRotationPoint(14F, 4F, 4F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 149
		bodyModel[115].setRotationPoint(-1F, 3F, 9.5F);
		bodyModel[115].rotateAngleX = -0.78539816F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 150
		bodyModel[116].setRotationPoint(0F, 3.8F, 9.25F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 151
		bodyModel[117].setRotationPoint(2F, 3.8F, 6.25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 152
		bodyModel[118].setRotationPoint(-1F, 3F, -9.5F);
		bodyModel[118].rotateAngleX = -0.78539816F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 153
		bodyModel[119].setRotationPoint(-2F, 3.8F, -10.25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 154
		bodyModel[120].setRotationPoint(-3F, 3.8F, -10.25F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 155
		bodyModel[121].setRotationPoint(-15F, 4F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 156
		bodyModel[122].setRotationPoint(14F, 4F, -9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 157
		bodyModel[123].setRotationPoint(-15F, 4.5F, -7.25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 158
		bodyModel[124].setRotationPoint(-14.5F, 7.5F, -7.25F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 159
		bodyModel[125].setRotationPoint(14F, 4.5F, -7.25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 160
		bodyModel[126].setRotationPoint(13.5F, 7.5F, -7.25F);

		bodyModel[127].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 130
		bodyModel[127].setRotationPoint(-14F, 9F, 6.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 162
		bodyModel[128].setRotationPoint(-4F, 9F, 6.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 163
		bodyModel[129].setRotationPoint(6F, 9F, 6.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 164
		bodyModel[130].setRotationPoint(10F, 8F, 7.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 165
		bodyModel[131].setRotationPoint(-14F, 9F, -7.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 166
		bodyModel[132].setRotationPoint(-4F, 9F, -7.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 167
		bodyModel[133].setRotationPoint(6F, 9F, -7.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 168
		bodyModel[134].setRotationPoint(-1F, 8F, 7.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 169
		bodyModel[135].setRotationPoint(-12F, 8F, 7.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 170
		bodyModel[136].setRotationPoint(-12F, 8F, -8.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 171
		bodyModel[137].setRotationPoint(-1F, 8F, -8.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 172
		bodyModel[138].setRotationPoint(10F, 8F, -8.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[139].setRotationPoint(8F, 5F, -8.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[140].setRotationPoint(-3F, 5F, -8.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[141].setRotationPoint(1F, 5F, -8.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[142].setRotationPoint(-10F, 5F, -8.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[143].setRotationPoint(8F, 5F, 7.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[144].setRotationPoint(1F, 5F, 7.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[145].setRotationPoint(-3F, 5F, 7.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[146].setRotationPoint(-10F, 5F, 7.5F);
	}
}