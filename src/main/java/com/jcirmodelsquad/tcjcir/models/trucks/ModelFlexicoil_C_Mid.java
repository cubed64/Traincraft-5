//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Flexicoil Cs (mid)
// Model Creator: Bida
// Created on: 12.02.2022 - 19:29:09
// Last changed on: 12.02.2022 - 19:29:09

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelFlexicoil_C_Mid extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelFlexicoil_C_Mid() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[149];

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
		bodyModel[17] = new ModelRendererTurbo(this, 112, 10, textureX, textureY); // Box 94
		bodyModel[18] = new ModelRendererTurbo(this, 87, 1, textureX, textureY); // Box 100
		bodyModel[19] = new ModelRendererTurbo(this, 94, 1, textureX, textureY); // Box 101
		bodyModel[20] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Box 107
		bodyModel[21] = new ModelRendererTurbo(this, 44, 10, textureX, textureY); // Box 108
		bodyModel[22] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 112
		bodyModel[23] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 116
		bodyModel[24] = new ModelRendererTurbo(this, 60, 1, textureX, textureY); // Box 117
		bodyModel[25] = new ModelRendererTurbo(this, 80, 1, textureX, textureY); // Box 120
		bodyModel[26] = new ModelRendererTurbo(this, 112, 34, textureX, textureY); // Box 142
		bodyModel[27] = new ModelRendererTurbo(this, 78, 34, textureX, textureY); // Box 145
		bodyModel[28] = new ModelRendererTurbo(this, 44, 34, textureX, textureY); // Box 146
		bodyModel[29] = new ModelRendererTurbo(this, 53, 1, textureX, textureY); // Box 95
		bodyModel[30] = new ModelRendererTurbo(this, 39, 1, textureX, textureY); // Box 96
		bodyModel[31] = new ModelRendererTurbo(this, 46, 1, textureX, textureY); // Box 97
		bodyModel[32] = new ModelRendererTurbo(this, 114, 1, textureX, textureY); // Box 98
		bodyModel[33] = new ModelRendererTurbo(this, 107, 1, textureX, textureY); // Box 99
		bodyModel[34] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 117
		bodyModel[35] = new ModelRendererTurbo(this, -3, 49, textureX, textureY); // Box 117
		bodyModel[36] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 118
		bodyModel[37] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 111
		bodyModel[38] = new ModelRendererTurbo(this, -3, 49, textureX, textureY); // Box 123
		bodyModel[39] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 124
		bodyModel[40] = new ModelRendererTurbo(this, 80, 5, textureX, textureY); // Box 110
		bodyModel[41] = new ModelRendererTurbo(this, 80, 5, textureX, textureY); // Box 101
		bodyModel[42] = new ModelRendererTurbo(this, 80, 5, textureX, textureY); // Box 102
		bodyModel[43] = new ModelRendererTurbo(this, 42, 14, textureX, textureY); // Box 103
		bodyModel[44] = new ModelRendererTurbo(this, 37, 13, textureX, textureY); // Box 104
		bodyModel[45] = new ModelRendererTurbo(this, 28, 12, textureX, textureY); // Box 105
		bodyModel[46] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 106
		bodyModel[47] = new ModelRendererTurbo(this, 94, 25, textureX, textureY); // Box 107
		bodyModel[48] = new ModelRendererTurbo(this, 107, 25, textureX, textureY); // Box 108
		bodyModel[49] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 109
		bodyModel[50] = new ModelRendererTurbo(this, 87, 25, textureX, textureY); // Box 110
		bodyModel[51] = new ModelRendererTurbo(this, 80, 25, textureX, textureY); // Box 111
		bodyModel[52] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 112
		bodyModel[53] = new ModelRendererTurbo(this, 60, 25, textureX, textureY); // Box 113
		bodyModel[54] = new ModelRendererTurbo(this, 53, 25, textureX, textureY); // Box 114
		bodyModel[55] = new ModelRendererTurbo(this, 39, 25, textureX, textureY); // Box 115
		bodyModel[56] = new ModelRendererTurbo(this, 46, 25, textureX, textureY); // Box 116
		bodyModel[57] = new ModelRendererTurbo(this, 114, 25, textureX, textureY); // Box 117
		bodyModel[58] = new ModelRendererTurbo(this, 42, 19, textureX, textureY); // Box 119
		bodyModel[59] = new ModelRendererTurbo(this, 37, 19, textureX, textureY); // Box 120
		bodyModel[60] = new ModelRendererTurbo(this, 42, 14, textureX, textureY); // Box 121
		bodyModel[61] = new ModelRendererTurbo(this, 42, 19, textureX, textureY); // Box 122
		bodyModel[62] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 123
		bodyModel[63] = new ModelRendererTurbo(this, 37, 19, textureX, textureY); // Box 124
		bodyModel[64] = new ModelRendererTurbo(this, 37, 13, textureX, textureY); // Box 125
		bodyModel[65] = new ModelRendererTurbo(this, 28, 12, textureX, textureY); // Box 126
		bodyModel[66] = new ModelRendererTurbo(this, 28, 12, textureX, textureY); // Box 127
		bodyModel[67] = new ModelRendererTurbo(this, 28, 12, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 3, 18, textureX, textureY); // Box 129
		bodyModel[69] = new ModelRendererTurbo(this, 3, 18, textureX, textureY); // Box 130
		bodyModel[70] = new ModelRendererTurbo(this, 62, 48, textureX, textureY); // Box 131
		bodyModel[71] = new ModelRendererTurbo(this, 81, 45, textureX, textureY); // Box 133
		bodyModel[72] = new ModelRendererTurbo(this, 62, 48, textureX, textureY); // Box 134
		bodyModel[73] = new ModelRendererTurbo(this, 81, 45, textureX, textureY); // Box 135
		bodyModel[74] = new ModelRendererTurbo(this, 80, 29, textureX, textureY); // Box 136
		bodyModel[75] = new ModelRendererTurbo(this, 80, 29, textureX, textureY); // Box 137
		bodyModel[76] = new ModelRendererTurbo(this, 80, 29, textureX, textureY); // Box 138
		bodyModel[77] = new ModelRendererTurbo(this, 62, 48, textureX, textureY); // Box 139
		bodyModel[78] = new ModelRendererTurbo(this, 81, 45, textureX, textureY); // Box 140
		bodyModel[79] = new ModelRendererTurbo(this, 73, 5, textureX, textureY); // Box 142
		bodyModel[80] = new ModelRendererTurbo(this, 87, 5, textureX, textureY); // Box 143
		bodyModel[81] = new ModelRendererTurbo(this, 39, 4, textureX, textureY); // Box 144
		bodyModel[82] = new ModelRendererTurbo(this, 53, 5, textureX, textureY); // Box 145
		bodyModel[83] = new ModelRendererTurbo(this, 91, 13, textureX, textureY); // Box 135
		bodyModel[84] = new ModelRendererTurbo(this, 57, 13, textureX, textureY); // Box 147
		bodyModel[85] = new ModelRendererTurbo(this, 95, 16, textureX, textureY); // Box 148
		bodyModel[86] = new ModelRendererTurbo(this, 106, 16, textureX, textureY); // Box 137
		bodyModel[87] = new ModelRendererTurbo(this, 90, 16, textureX, textureY); // Box 150
		bodyModel[88] = new ModelRendererTurbo(this, 56, 16, textureX, textureY); // Box 151
		bodyModel[89] = new ModelRendererTurbo(this, 61, 16, textureX, textureY); // Box 152
		bodyModel[90] = new ModelRendererTurbo(this, 72, 16, textureX, textureY); // Box 153
		bodyModel[91] = new ModelRendererTurbo(this, 53, 29, textureX, textureY); // Box 154
		bodyModel[92] = new ModelRendererTurbo(this, 39, 28, textureX, textureY); // Box 155
		bodyModel[93] = new ModelRendererTurbo(this, 87, 29, textureX, textureY); // Box 156
		bodyModel[94] = new ModelRendererTurbo(this, 73, 29, textureX, textureY); // Box 157
		bodyModel[95] = new ModelRendererTurbo(this, 107, 29, textureX, textureY); // Box 158
		bodyModel[96] = new ModelRendererTurbo(this, 121, 28, textureX, textureY); // Box 159
		bodyModel[97] = new ModelRendererTurbo(this, 91, 37, textureX, textureY); // Box 160
		bodyModel[98] = new ModelRendererTurbo(this, 57, 37, textureX, textureY); // Box 161
		bodyModel[99] = new ModelRendererTurbo(this, 106, 40, textureX, textureY); // Box 162
		bodyModel[100] = new ModelRendererTurbo(this, 90, 40, textureX, textureY); // Box 163
		bodyModel[101] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 164
		bodyModel[102] = new ModelRendererTurbo(this, 56, 40, textureX, textureY); // Box 165
		bodyModel[103] = new ModelRendererTurbo(this, 61, 40, textureX, textureY); // Box 166
		bodyModel[104] = new ModelRendererTurbo(this, 95, 40, textureX, textureY); // Box 167
		bodyModel[105] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 153
		bodyModel[106] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 155
		bodyModel[107] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 156
		bodyModel[108] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 121
		bodyModel[109] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 172
		bodyModel[110] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 173
		bodyModel[111] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 176
		bodyModel[112] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 177
		bodyModel[113] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 178
		bodyModel[114] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 179
		bodyModel[115] = new ModelRendererTurbo(this, 97, 47, textureX, textureY); // Box 180
		bodyModel[116] = new ModelRendererTurbo(this, 97, 47, textureX, textureY); // Box 181
		bodyModel[117] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 182
		bodyModel[118] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 183
		bodyModel[119] = new ModelRendererTurbo(this, 28, 23, textureX, textureY); // Box 184
		bodyModel[120] = new ModelRendererTurbo(this, 28, 23, textureX, textureY); // Box 185
		bodyModel[121] = new ModelRendererTurbo(this, -3, 49, textureX, textureY); // Box 186
		bodyModel[122] = new ModelRendererTurbo(this, -3, 49, textureX, textureY); // Box 187
		bodyModel[123] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 188
		bodyModel[124] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 189
		bodyModel[125] = new ModelRendererTurbo(this, 91, 10, textureX, textureY); // Box 190
		bodyModel[126] = new ModelRendererTurbo(this, 57, 10, textureX, textureY); // Box 191
		bodyModel[127] = new ModelRendererTurbo(this, 57, 34, textureX, textureY); // Box 192
		bodyModel[128] = new ModelRendererTurbo(this, 91, 34, textureX, textureY); // Box 193
		bodyModel[129] = new ModelRendererTurbo(this, 83, 41, textureX, textureY); // Box 194
		bodyModel[130] = new ModelRendererTurbo(this, 77, 42, textureX, textureY); // Box 195
		bodyModel[131] = new ModelRendererTurbo(this, 77, 42, textureX, textureY); // Box 196
		bodyModel[132] = new ModelRendererTurbo(this, 83, 41, textureX, textureY); // Box 197
		bodyModel[133] = new ModelRendererTurbo(this, 81, 36, textureX, textureY); // Box 198
		bodyModel[134] = new ModelRendererTurbo(this, 77, 18, textureX, textureY); // Box 199
		bodyModel[135] = new ModelRendererTurbo(this, 83, 17, textureX, textureY); // Box 200
		bodyModel[136] = new ModelRendererTurbo(this, 83, 17, textureX, textureY); // Box 201
		bodyModel[137] = new ModelRendererTurbo(this, 77, 18, textureX, textureY); // Box 202
		bodyModel[138] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 203
		bodyModel[139] = new ModelRendererTurbo(this, 19, 59, textureX, textureY); // Box 204
		bodyModel[140] = new ModelRendererTurbo(this, 19, 59, textureX, textureY); // Box 205
		bodyModel[141] = new ModelRendererTurbo(this, 53, 29, textureX, textureY); // Box 173
		bodyModel[142] = new ModelRendererTurbo(this, 87, 29, textureX, textureY); // Box 174
		bodyModel[143] = new ModelRendererTurbo(this, 73, 29, textureX, textureY); // Box 175
		bodyModel[144] = new ModelRendererTurbo(this, 107, 29, textureX, textureY); // Box 176
		bodyModel[145] = new ModelRendererTurbo(this, 53, 5, textureX, textureY); // Box 177
		bodyModel[146] = new ModelRendererTurbo(this, 73, 5, textureX, textureY); // Box 178
		bodyModel[147] = new ModelRendererTurbo(this, 87, 5, textureX, textureY); // Box 179
		bodyModel[148] = new ModelRendererTurbo(this, 107, 5, textureX, textureY); // Box 180

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

		bodyModel[17].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 94
		bodyModel[17].setRotationPoint(-13F, 9F, 7.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 100
		bodyModel[18].setRotationPoint(-3F, 4F, 8F);

		bodyModel[19].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 101
		bodyModel[19].setRotationPoint(-8F, 4.5F, 8F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 107
		bodyModel[20].setRotationPoint(-2F, 9F, 7.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 108
		bodyModel[21].setRotationPoint(9F, 9F, 7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 112
		bodyModel[22].setRotationPoint(-14F, 4F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[23].setRotationPoint(1F, 4F, 8F);

		bodyModel[24].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 117
		bodyModel[24].setRotationPoint(3F, 4.5F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[25].setRotationPoint(-1F, 3F, 8F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 142
		bodyModel[26].setRotationPoint(-13F, 9F, -8.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 145
		bodyModel[27].setRotationPoint(-2F, 9F, -8.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 146
		bodyModel[28].setRotationPoint(9F, 9F, -8.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 95
		bodyModel[29].setRotationPoint(8F, 4F, 8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[30].setRotationPoint(12F, 4F, 8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[31].setRotationPoint(10F, 3F, 8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[32].setRotationPoint(-12F, 3F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[33].setRotationPoint(-10F, 4F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 117
		bodyModel[34].setRotationPoint(-11.5F, 3F, 9.5F);
		bodyModel[34].rotateAngleX = -0.78539816F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 117
		bodyModel[35].setRotationPoint(-8.5F, 3.8F, 6.25F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 118
		bodyModel[36].setRotationPoint(-10.5F, 3.8F, 9.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 111
		bodyModel[37].setRotationPoint(9.5F, 3F, 9.5F);
		bodyModel[37].rotateAngleX = -0.78539816F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F); // Box 123
		bodyModel[38].setRotationPoint(7.5F, 3.8F, 6.25F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 124
		bodyModel[39].setRotationPoint(8.5F, 3.8F, 9.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 110
		bodyModel[40].setRotationPoint(10F, 4.5F, 7.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 101
		bodyModel[41].setRotationPoint(-1F, 4.5F, 7.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 102
		bodyModel[42].setRotationPoint(-12F, 4.5F, 7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[43].setRotationPoint(4F, 3F, 7.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[44].setRotationPoint(6.5F, 3F, 7.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 105
		bodyModel[45].setRotationPoint(4.5F, 3.5F, 5.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 106
		bodyModel[46].setRotationPoint(4.5F, 3F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 107
		bodyModel[47].setRotationPoint(-8F, 4.5F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[48].setRotationPoint(-10F, 4F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 109
		bodyModel[49].setRotationPoint(-14F, 4F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 110
		bodyModel[50].setRotationPoint(-3F, 4F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[51].setRotationPoint(-1F, 3F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[52].setRotationPoint(1F, 4F, -9F);

		bodyModel[53].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 113
		bodyModel[53].setRotationPoint(3F, 4.5F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 114
		bodyModel[54].setRotationPoint(8F, 4F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[55].setRotationPoint(12F, 4F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[56].setRotationPoint(10F, 3F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[57].setRotationPoint(-12F, 3F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[58].setRotationPoint(4F, 3F, -8.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[59].setRotationPoint(6.5F, 3F, -8.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 121
		bodyModel[60].setRotationPoint(-5F, 3F, 7.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 122
		bodyModel[61].setRotationPoint(-5F, 3F, -8.75F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 123
		bodyModel[62].setRotationPoint(-6.5F, 3F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[63].setRotationPoint(-7.5F, 3F, -8.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[64].setRotationPoint(-7.5F, 3F, 7.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 126
		bodyModel[65].setRotationPoint(4.5F, 3F, -7.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 127
		bodyModel[66].setRotationPoint(-6.5F, 3F, -7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 128
		bodyModel[67].setRotationPoint(-6.5F, 3.5F, 5.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 129
		bodyModel[68].setRotationPoint(4.5F, 4.5F, -8F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 130
		bodyModel[69].setRotationPoint(-6.5F, 4.5F, -8F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Box 131
		bodyModel[70].setRotationPoint(7F, 4F, -5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 133
		bodyModel[71].setRotationPoint(11F, 5F, -5F);

		bodyModel[72].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Box 134
		bodyModel[72].setRotationPoint(-11F, 4F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[73].setRotationPoint(-14F, 5F, -5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 136
		bodyModel[74].setRotationPoint(-1F, 4.5F, -8.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 137
		bodyModel[75].setRotationPoint(-12F, 4.5F, -8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 138
		bodyModel[76].setRotationPoint(10F, 4.5F, -8.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Box 139
		bodyModel[77].setRotationPoint(-3F, 4F, -5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 140
		bodyModel[78].setRotationPoint(1F, 5F, -5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[79].setRotationPoint(1F, 6F, 7.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 143
		bodyModel[80].setRotationPoint(-3F, 6F, 7.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[81].setRotationPoint(12F, 5F, 7.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 145
		bodyModel[82].setRotationPoint(8F, 6F, 7.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[83].setRotationPoint(-9.25F, 7.5F, 7.25F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147
		bodyModel[84].setRotationPoint(1.75F, 7.5F, 7.25F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 148
		bodyModel[85].setRotationPoint(-7.25F, 8.5F, 6.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 137
		bodyModel[86].setRotationPoint(-7.75F, 7.5F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 150
		bodyModel[87].setRotationPoint(-4.75F, 7.5F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 151
		bodyModel[88].setRotationPoint(6.25F, 7.5F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -1F, 0F); // Box 152
		bodyModel[89].setRotationPoint(3.75F, 8.5F, 6.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 153
		bodyModel[90].setRotationPoint(3.25F, 7.5F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 154
		bodyModel[91].setRotationPoint(8F, 6F, -8.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[92].setRotationPoint(12F, 5F, -8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 156
		bodyModel[93].setRotationPoint(-3F, 6F, -8.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[94].setRotationPoint(1F, 6F, -8.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[95].setRotationPoint(-10F, 6F, -8.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 159
		bodyModel[96].setRotationPoint(-14F, 5F, -8.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 160
		bodyModel[97].setRotationPoint(-9.25F, 7.5F, -8.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 161
		bodyModel[98].setRotationPoint(1.75F, 7.5F, -8.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 162
		bodyModel[99].setRotationPoint(-7.75F, 7.5F, -8.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 163
		bodyModel[100].setRotationPoint(-4.75F, 7.5F, -8.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 164
		bodyModel[101].setRotationPoint(3.25F, 7.5F, -8.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 165
		bodyModel[102].setRotationPoint(6.25F, 7.5F, -8.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -1F, 0F); // Box 166
		bodyModel[103].setRotationPoint(3.75F, 8.5F, -8.25F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 167
		bodyModel[104].setRotationPoint(-7.25F, 8.5F, -8.25F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[105].setRotationPoint(6.5F, 4.5F, 5.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 155
		bodyModel[106].setRotationPoint(-7.5F, 4.5F, 5.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 156
		bodyModel[107].setRotationPoint(-7.5F, 7.5F, 5.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 121
		bodyModel[108].setRotationPoint(6.5F, 7.5F, 5.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 172
		bodyModel[109].setRotationPoint(3.5F, 4.5F, 5.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 173
		bodyModel[110].setRotationPoint(3.5F, 7.5F, 5.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[111].setRotationPoint(6.5F, 4.5F, -6.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 177
		bodyModel[112].setRotationPoint(6.5F, 7.5F, -6.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 178
		bodyModel[113].setRotationPoint(-7.5F, 4.5F, -6.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 179
		bodyModel[114].setRotationPoint(-7.5F, 7.5F, -6.25F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 5, 11, 0F); // Box 180
		bodyModel[115].setRotationPoint(-7F, 4F, -5.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 4, 5, 11, 0F); // Box 181
		bodyModel[116].setRotationPoint(3F, 4F, -5.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 182
		bodyModel[117].setRotationPoint(-4.5F, 7.5F, -6.25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 183
		bodyModel[118].setRotationPoint(-4.5F, 4.5F, -6.25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 184
		bodyModel[119].setRotationPoint(-11.5F, 3F, -9.5F);
		bodyModel[119].rotateAngleX = -0.78539816F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 185
		bodyModel[120].setRotationPoint(9.5F, 3F, -9.5F);
		bodyModel[120].rotateAngleX = -0.78539816F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 186
		bodyModel[121].setRotationPoint(7.5F, 3.8F, -10.25F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 187
		bodyModel[122].setRotationPoint(-8.5F, 3.8F, -10.25F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[123].setRotationPoint(-10.5F, 3.8F, -10.25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 189
		bodyModel[124].setRotationPoint(8.5F, 3.8F, -10.25F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 190
		bodyModel[125].setRotationPoint(-9.25F, 8.5F, 7.45F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 191
		bodyModel[126].setRotationPoint(1.75F, 8.5F, 7.45F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[127].setRotationPoint(1.75F, 8.5F, -8.95F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 193
		bodyModel[128].setRotationPoint(-9.25F, 8.5F, -8.95F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 194
		bodyModel[129].setRotationPoint(-5.5F, 6.5F, -6.5F);
		bodyModel[129].rotateAngleX = -0.78539816F;

		bodyModel[130].addShapeBox(0F, 0.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 195
		bodyModel[130].setRotationPoint(-6.5F, 6.5F, -6.5F);
		bodyModel[130].rotateAngleX = -0.78539816F;

		bodyModel[131].addShapeBox(0F, 0.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 196
		bodyModel[131].setRotationPoint(4.5F, 6.5F, -6.5F);
		bodyModel[131].rotateAngleX = -0.78539816F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 197
		bodyModel[132].setRotationPoint(5.5F, 6.5F, -6.5F);
		bodyModel[132].rotateAngleX = -0.78539816F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 198
		bodyModel[133].setRotationPoint(3.5F, 4.5F, -6.25F);

		bodyModel[134].addShapeBox(0F, 0.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 199
		bodyModel[134].setRotationPoint(5.5F, 6.5F, 6.5F);
		bodyModel[134].rotateAngleX = -0.78539816F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 200
		bodyModel[135].setRotationPoint(4.5F, 6.5F, 6.5F);
		bodyModel[135].rotateAngleX = -0.78539816F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 201
		bodyModel[136].setRotationPoint(-6.5F, 6.5F, 6.5F);
		bodyModel[136].rotateAngleX = -0.78539816F;

		bodyModel[137].addShapeBox(0F, 0.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 202
		bodyModel[137].setRotationPoint(-5.5F, 6.5F, 6.5F);
		bodyModel[137].rotateAngleX = -0.78539816F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 203
		bodyModel[138].setRotationPoint(-4.5F, 4.5F, 5.75F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 204
		bodyModel[139].setRotationPoint(-3F, 3F, -1F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 205
		bodyModel[140].setRotationPoint(2F, 3F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[141].setRotationPoint(8F, 5F, -8.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[142].setRotationPoint(-3F, 5F, -8.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[143].setRotationPoint(1F, 5F, -8.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[144].setRotationPoint(-10F, 5F, -8.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[145].setRotationPoint(8F, 5F, 7.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[146].setRotationPoint(1F, 5F, 7.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[147].setRotationPoint(-3F, 5F, 7.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[148].setRotationPoint(-10F, 5F, 7.5F);
	}
}