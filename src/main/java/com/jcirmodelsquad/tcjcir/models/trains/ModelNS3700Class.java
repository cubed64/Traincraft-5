//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NS 3700 Class
// Model Creator: Bidahochi
// Created on: 11.12.2022 - 13:30:57
// Last changed on: 11.12.2022 - 13:30:57

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelNS3700Class extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelNS3700Class() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[184];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 98
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 63 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 64 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 65 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 66 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 67
		bodyModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 62
		bodyModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 63 wheel
		bodyModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 64 wheel
		bodyModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 91
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 89 p wheel
		bodyModel[12] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 90 p wheel
		bodyModel[13] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 42
		bodyModel[30] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 43
		bodyModel[31] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 44
		bodyModel[32] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 45
		bodyModel[33] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 46
		bodyModel[34] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 47
		bodyModel[35] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 97
		bodyModel[36] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 112
		bodyModel[37] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 71
		bodyModel[38] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 101
		bodyModel[39] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 102
		bodyModel[40] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 232
		bodyModel[41] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 233
		bodyModel[42] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 56
		bodyModel[44] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29
		bodyModel[45] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 54
		bodyModel[46] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 55
		bodyModel[47] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 56
		bodyModel[48] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 57
		bodyModel[49] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 58
		bodyModel[50] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 56
		bodyModel[51] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 65
		bodyModel[52] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 66
		bodyModel[53] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 67
		bodyModel[54] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 72
		bodyModel[57] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 73
		bodyModel[58] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 74
		bodyModel[59] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 75
		bodyModel[60] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 76 lamp
		bodyModel[61] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 77 lamp
		bodyModel[62] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 78
		bodyModel[63] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 79
		bodyModel[64] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 80
		bodyModel[65] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 81
		bodyModel[66] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 83
		bodyModel[67] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 84
		bodyModel[68] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 85
		bodyModel[69] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 86
		bodyModel[70] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 87
		bodyModel[71] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 88
		bodyModel[72] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 89
		bodyModel[73] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 90
		bodyModel[74] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 91
		bodyModel[75] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 92
		bodyModel[76] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 93
		bodyModel[77] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 94
		bodyModel[78] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 95
		bodyModel[79] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 96
		bodyModel[80] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 97
		bodyModel[81] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 98
		bodyModel[82] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 101
		bodyModel[83] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 102
		bodyModel[84] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 103
		bodyModel[85] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 105
		bodyModel[86] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 106
		bodyModel[87] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 108
		bodyModel[88] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 109
		bodyModel[89] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 110
		bodyModel[90] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 111
		bodyModel[91] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 112
		bodyModel[92] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 114
		bodyModel[93] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 115
		bodyModel[94] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 116
		bodyModel[95] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 117
		bodyModel[96] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 118
		bodyModel[97] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 119
		bodyModel[98] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 120
		bodyModel[99] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 121
		bodyModel[100] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 122 lamp
		bodyModel[101] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 123
		bodyModel[102] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 124
		bodyModel[103] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 125
		bodyModel[104] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 119
		bodyModel[105] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 120
		bodyModel[106] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 121
		bodyModel[107] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 122
		bodyModel[108] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 123
		bodyModel[109] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 124
		bodyModel[110] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 125
		bodyModel[111] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 126
		bodyModel[112] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 127
		bodyModel[113] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 129
		bodyModel[115] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 130
		bodyModel[116] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 131
		bodyModel[117] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 132
		bodyModel[118] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 133
		bodyModel[119] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 134
		bodyModel[120] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 135
		bodyModel[121] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 136
		bodyModel[122] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 137
		bodyModel[123] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 138
		bodyModel[124] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 139
		bodyModel[125] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 140
		bodyModel[126] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 141
		bodyModel[127] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 142
		bodyModel[128] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 143
		bodyModel[129] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 144
		bodyModel[130] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 145
		bodyModel[131] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 146
		bodyModel[132] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 147
		bodyModel[133] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 242e
		bodyModel[134] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 149
		bodyModel[135] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 150
		bodyModel[136] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 151
		bodyModel[137] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 105
		bodyModel[138] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 106
		bodyModel[139] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 107
		bodyModel[140] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 108
		bodyModel[141] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 109
		bodyModel[142] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 110
		bodyModel[143] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 158
		bodyModel[144] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 159
		bodyModel[145] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 160
		bodyModel[146] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 161
		bodyModel[147] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 162
		bodyModel[148] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 163
		bodyModel[149] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 164
		bodyModel[150] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 165
		bodyModel[151] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 166
		bodyModel[152] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 167
		bodyModel[153] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 168
		bodyModel[154] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 169
		bodyModel[155] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 170
		bodyModel[156] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 171
		bodyModel[157] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 172
		bodyModel[158] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 203
		bodyModel[159] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 204
		bodyModel[160] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 205
		bodyModel[161] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 206
		bodyModel[162] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 207
		bodyModel[163] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 208
		bodyModel[164] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 209
		bodyModel[165] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 214
		bodyModel[166] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 215
		bodyModel[167] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 216
		bodyModel[168] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 216
		bodyModel[169] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 217
		bodyModel[170] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 218
		bodyModel[171] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 219
		bodyModel[172] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 220
		bodyModel[173] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 233
		bodyModel[174] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 234
		bodyModel[175] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 239
		bodyModel[176] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 240
		bodyModel[177] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 241
		bodyModel[178] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 242
		bodyModel[179] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 251
		bodyModel[180] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 252
		bodyModel[181] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 253
		bodyModel[182] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 254
		bodyModel[183] = new ModelRendererTurbo(this, 282, 79, textureX, textureY); // Box 183

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 98
		bodyModel[0].setRotationPoint(-32F, 3.5F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 62
		bodyModel[1].setRotationPoint(6.5F, 4F, -6F);

		bodyModel[2].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 63 wheel
		bodyModel[2].setRotationPoint(7.5F, 5F, -6F);

		bodyModel[3].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 64 wheel
		bodyModel[3].setRotationPoint(7.5F, 5F, 6F);

		bodyModel[4].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 65 wheel
		bodyModel[4].setRotationPoint(18.5F, 5F, 6F);

		bodyModel[5].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 66 wheel
		bodyModel[5].setRotationPoint(18.5F, 5F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 67
		bodyModel[6].setRotationPoint(17.5F, 4F, -6F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 62
		bodyModel[7].setRotationPoint(-4.5F, 4F, -6F);

		bodyModel[8].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 63 wheel
		bodyModel[8].setRotationPoint(-3.5F, 5F, -6F);

		bodyModel[9].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 64 wheel
		bodyModel[9].setRotationPoint(-3.5F, 5F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 91
		bodyModel[10].setRotationPoint(-24.5F, 7F, -6F);

		bodyModel[11].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 89 p wheel
		bodyModel[11].setRotationPoint(-24F, 7.5F, -6F);

		bodyModel[12].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 90 p wheel
		bodyModel[12].setRotationPoint(-24F, 7.5F, 6F);

		bodyModel[13].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 17
		bodyModel[13].setRotationPoint(-14F, 7.5F, -6F);

		bodyModel[14].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 18
		bodyModel[14].setRotationPoint(-14F, 7.5F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 19
		bodyModel[15].setRotationPoint(-14.5F, 7F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 49, 1, 20, 0F); // Box 29
		bodyModel[16].setRotationPoint(-27F, 1F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 30
		bodyModel[17].setRotationPoint(-5.5F, -1F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[18].setRotationPoint(-1.5F, -1F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[19].setRotationPoint(-8.5F, -1F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[20].setRotationPoint(9.5F, -1F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 34
		bodyModel[21].setRotationPoint(5.5F, -1F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[22].setRotationPoint(2.5F, -1F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[23].setRotationPoint(20.5F, -1F, -8F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 37
		bodyModel[24].setRotationPoint(16.5F, -1F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[25].setRotationPoint(13.5F, -1F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[26].setRotationPoint(13.5F, -1F, 5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[27].setRotationPoint(9.5F, -1F, 5F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 41
		bodyModel[28].setRotationPoint(5.5F, -1F, 5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[29].setRotationPoint(2.5F, -1F, 5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[30].setRotationPoint(-1.5F, -1F, 5F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 44
		bodyModel[31].setRotationPoint(-5.5F, -1F, 5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[32].setRotationPoint(-8.5F, -1F, 5F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 46
		bodyModel[33].setRotationPoint(16.5F, -1F, 5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[34].setRotationPoint(20.5F, -1F, 5F);

		bodyModel[35].addBox(0F, 0F, 0F, 28, 3, 6, 0F); // Box 97
		bodyModel[35].setRotationPoint(-23F, -14F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 28, 6, 12, 0F); // Box 112
		bodyModel[36].setRotationPoint(-23F, -11F, -6F);

		bodyModel[37].addBox(0F, 0F, 0F, 28, 3, 6, 0F); // Box 71
		bodyModel[37].setRotationPoint(-23F, -5F, -3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 28, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[38].setRotationPoint(-23F, -14F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 28, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[39].setRotationPoint(-23F, -14F, 3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 28, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[40].setRotationPoint(-23F, -5F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 28, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 233
		bodyModel[41].setRotationPoint(-23F, -5F, 3F);

		bodyModel[42].addBox(0F, 0F, 0F, 14, 14, 12, 0F); // Box 55
		bodyModel[42].setRotationPoint(5F, -13F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 14, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
		bodyModel[43].setRotationPoint(5F, -14F, -5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[44].setRotationPoint(-23.5F, -10F, -5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[45].setRotationPoint(-23.5F, -6F, -5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 55
		bodyModel[46].setRotationPoint(-23.5F, -6F, 2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[47].setRotationPoint(-23.5F, -13F, 2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[48].setRotationPoint(-23.5F, -13F, -5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[49].setRotationPoint(-23.5F, -13F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[50].setRotationPoint(-23.5F, -6F, -2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[51].setRotationPoint(-23.75F, -10F, -5.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[52].setRotationPoint(-23.75F, -7F, -5.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 7, 3, 8, 0F); // Box 67
		bodyModel[53].setRotationPoint(-23F, -2F, -4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[54].setRotationPoint(-29F, 3F, -10F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 71
		bodyModel[55].setRotationPoint(-29F, 4F, -10F);

		bodyModel[56].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 72
		bodyModel[56].setRotationPoint(-31F, 4.5F, -7F);
		bodyModel[56].rotateAngleX = 0.78539816F;

		bodyModel[57].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 73
		bodyModel[57].setRotationPoint(-31F, 4.5F, 7F);
		bodyModel[57].rotateAngleX = 0.78539816F;

		bodyModel[58].addBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 74
		bodyModel[58].setRotationPoint(-30F, 4.5F, 7F);
		bodyModel[58].rotateAngleX = 0.78539816F;

		bodyModel[59].addBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 75
		bodyModel[59].setRotationPoint(-30F, 4.5F, -7F);
		bodyModel[59].rotateAngleX = 0.78539816F;

		bodyModel[60].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 76 lamp
		bodyModel[60].setRotationPoint(-29F, 1.5F, -7F);
		bodyModel[60].rotateAngleX = 0.78539816F;

		bodyModel[61].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 77 lamp
		bodyModel[61].setRotationPoint(-29F, 1.5F, 7F);
		bodyModel[61].rotateAngleX = 0.78539816F;

		bodyModel[62].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 78
		bodyModel[62].setRotationPoint(-28.5F, 1F, 7F);

		bodyModel[63].addShapeBox(0F, -1F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[63].setRotationPoint(-28.5F, 3F, 7F);

		bodyModel[64].addShapeBox(0F, -1F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[64].setRotationPoint(-28.5F, 3F, -7F);

		bodyModel[65].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 81
		bodyModel[65].setRotationPoint(-28.5F, 1F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 83
		bodyModel[66].setRotationPoint(-27F, 2F, -10F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 7, 3, 0F); // Box 84
		bodyModel[67].setRotationPoint(-21F, -21F, -1.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 85
		bodyModel[68].setRotationPoint(-21F, -20.5F, -1.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 5, 3, 5, 0F); // Box 86
		bodyModel[69].setRotationPoint(-10F, -18F, -2.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 87
		bodyModel[70].setRotationPoint(-9F, -19F, -1.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 88
		bodyModel[71].setRotationPoint(10F, -17F, -1.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 89
		bodyModel[72].setRotationPoint(-10F, -15F, -2.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 90
		bodyModel[73].setRotationPoint(9.5F, -18F, -2F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 15, 20, 0F); // Box 91
		bodyModel[74].setRotationPoint(16F, -14F, -10F);

		bodyModel[75].addBox(0F, 0F, 0F, 10, 15, 1, 0F); // Box 92
		bodyModel[75].setRotationPoint(17F, -14F, -10F);

		bodyModel[76].addBox(0F, 0F, 0F, 10, 15, 1, 0F); // Box 93
		bodyModel[76].setRotationPoint(17F, -14F, 9F);

		bodyModel[77].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 94
		bodyModel[77].setRotationPoint(22F, 1F, -10F);

		bodyModel[78].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 95
		bodyModel[78].setRotationPoint(22F, 1F, 9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[79].setRotationPoint(22F, 1F, -9F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 97
		bodyModel[80].setRotationPoint(24F, 3F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[81].setRotationPoint(15F, -15F, -10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[82].setRotationPoint(15F, -18F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 102
		bodyModel[83].setRotationPoint(15F, -18F, 3F);

		bodyModel[84].addBox(0F, 0F, 0F, 17, 1, 6, 0F); // Box 103
		bodyModel[84].setRotationPoint(15F, -18F, -3F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 105
		bodyModel[85].setRotationPoint(16F, -17F, -7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[86].setRotationPoint(16F, -16F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 108
		bodyModel[87].setRotationPoint(15F, -16.5F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 109
		bodyModel[88].setRotationPoint(15F, -16.5F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[89].setRotationPoint(15F, -15F, 9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[90].setRotationPoint(16F, -16F, 7F);

		bodyModel[91].addBox(0F, 0F, 0F, 5, 3, 18, 0F); // Box 112
		bodyModel[91].setRotationPoint(-21.5F, 3.5F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[92].setRotationPoint(-21.5F, 4.5F, 9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 115
		bodyModel[93].setRotationPoint(-21.5F, 4.5F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[94].setRotationPoint(-21.5F, 1.5F, -8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 117
		bodyModel[95].setRotationPoint(-21.5F, 1.5F, 7F);

		bodyModel[96].addBox(0F, 0F, 0F, 5, 2, 14, 0F); // Box 118
		bodyModel[96].setRotationPoint(-21.5F, 1.5F, -7F);

		bodyModel[97].addBox(0F, 0F, 0F, 32, 5, 8, 0F); // Box 119
		bodyModel[97].setRotationPoint(-9F, 2F, -4F);

		bodyModel[98].addBox(0F, 0F, 0F, 18, 3, 8, 0F); // Box 120
		bodyModel[98].setRotationPoint(-27F, 2F, -4F);

		bodyModel[99].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 121
		bodyModel[99].setRotationPoint(-24.5F, -13.5F, 0F);

		bodyModel[100].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 122 lamp
		bodyModel[100].setRotationPoint(-25F, -13F, 0F);
		bodyModel[100].rotateAngleX = 0.78539816F;

		bodyModel[101].addShapeBox(0F, -1F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[101].setRotationPoint(-24.5F, -11.5F, 0F);

		bodyModel[102].addBox(0F, 0F, 0F, 5, 3, 5, 0F); // Box 124
		bodyModel[102].setRotationPoint(-2F, -2F, -2.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 125
		bodyModel[103].setRotationPoint(-13F, -2F, -1.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 119
		bodyModel[104].setRotationPoint(19F, -6F, -1.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 120
		bodyModel[105].setRotationPoint(19F, -7F, -6F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 121
		bodyModel[106].setRotationPoint(19F, -14F, -6F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 122
		bodyModel[107].setRotationPoint(19F, -7F, 3F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 123
		bodyModel[108].setRotationPoint(19F, -12F, 3F);

		bodyModel[109].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 124
		bodyModel[109].setRotationPoint(19F, -12F, 0F);
		bodyModel[109].rotateAngleX = 0.54105207F;

		bodyModel[110].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 125
		bodyModel[110].setRotationPoint(19F, -9F, 0F);
		bodyModel[110].rotateAngleX = 0.36651914F;

		bodyModel[111].addBox(0F, -1F, -3F, 0, 6, 5, 0F); // Box 126
		bodyModel[111].setRotationPoint(20.01F, -12F, 0F);
		bodyModel[111].rotateAngleX = 0.38397244F;

		bodyModel[112].addBox(0F, -1F, -1F, 6, 2, 2, 0F); // Box 127
		bodyModel[112].setRotationPoint(-22F, 5F, -8.5F);
		bodyModel[112].rotateAngleX = 0.78539816F;

		bodyModel[113].addBox(0F, -1F, -1F, 6, 2, 2, 0F); // Box 128
		bodyModel[113].setRotationPoint(-22F, 5F, 8.5F);
		bodyModel[113].rotateAngleX = 0.78539816F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 129
		bodyModel[114].setRotationPoint(-16.5F, 3.5F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 130
		bodyModel[115].setRotationPoint(-16.5F, 5.5F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 131
		bodyModel[116].setRotationPoint(-18.5F, 4.5F, -9F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 132
		bodyModel[117].setRotationPoint(-13.5F, 3.5F, -9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 133
		bodyModel[118].setRotationPoint(-26.5F, 4.5F, -9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 134
		bodyModel[119].setRotationPoint(-26.5F, 4.5F, 8F);

		bodyModel[120].addShapeBox(0.5F, 1F, 0F, 23, 1, 1, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 135
		bodyModel[120].setRotationPoint(-3.5F, 5F, -7F);

		bodyModel[121].addBox(0F, -0.5F, 0F, 10, 1, 1, 0F); // Box 136
		bodyModel[121].setRotationPoint(-12F, 5F, -8F);
		bodyModel[121].rotateAngleZ = -0.15707963F;

		bodyModel[122].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 137
		bodyModel[122].setRotationPoint(-13.5F, 3.5F, 7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 138
		bodyModel[123].setRotationPoint(-18.5F, 4.5F, 8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 139
		bodyModel[124].setRotationPoint(-16.5F, 3.5F, 8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 140
		bodyModel[125].setRotationPoint(-16.5F, 5.5F, 8F);

		bodyModel[126].addShapeBox(0.5F, 1F, 0F, 23, 1, 1, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 141
		bodyModel[126].setRotationPoint(-3.5F, 5F, 6F);

		bodyModel[127].addBox(0F, -0.5F, 0F, 10, 1, 1, 0F); // Box 142
		bodyModel[127].setRotationPoint(-12F, 5F, 7F);
		bodyModel[127].rotateAngleZ = -0.15707963F;

		bodyModel[128].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 143
		bodyModel[128].setRotationPoint(10F, -8F, 6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, 6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -2F); // Box 144
		bodyModel[129].setRotationPoint(-7F, -8F, 6F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 145
		bodyModel[130].setRotationPoint(-8F, -2F, 4F);

		bodyModel[131].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 146
		bodyModel[131].setRotationPoint(14F, -8F, 5.75F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 147
		bodyModel[132].setRotationPoint(14F, -6F, 5.75F);

		bodyModel[133].addBox(-1.5F, -1.5F, 0F, 3, 3, 10, 0F); // Box 242e
		bodyModel[133].setRotationPoint(0F, -1F, -8F);
		bodyModel[133].rotateAngleY = 1.57079633F;
		bodyModel[133].rotateAngleZ = 0.78539816F;

		bodyModel[134].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 149
		bodyModel[134].setRotationPoint(-9F, -1F, -10F);

		bodyModel[135].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 150
		bodyModel[135].setRotationPoint(-1F, -1F, -10F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 151
		bodyModel[136].setRotationPoint(-17F, -1F, -8F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 105
		bodyModel[137].setRotationPoint(5F, -2F, -10F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 106
		bodyModel[138].setRotationPoint(7.5F, -2F, -10F);

		bodyModel[139].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 107
		bodyModel[139].setRotationPoint(7.5F, -5F, -10F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 108
		bodyModel[140].setRotationPoint(5F, -5F, -10F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 109
		bodyModel[141].setRotationPoint(5.5F, -3F, -9.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 110
		bodyModel[142].setRotationPoint(8F, -3F, -9.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 36, 0, 1, 0F); // Box 158
		bodyModel[143].setRotationPoint(-23F, -8F, -7F);

		bodyModel[144].addBox(0F, 0F, 0F, 32, 0, 1, 0F); // Box 159
		bodyModel[144].setRotationPoint(-23F, -8F, 6F);

		bodyModel[145].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 160
		bodyModel[145].setRotationPoint(21F, -18.5F, -2F);

		bodyModel[146].addBox(0F, 0F, 0F, 14, 2, 11, 0F); // Box 161
		bodyModel[146].setRotationPoint(-26F, 5.5F, -5.5F);

		bodyModel[147].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 162
		bodyModel[147].setRotationPoint(-19.5F, 7.5F, -6F);
		bodyModel[147].rotateAngleX = 0.78539816F;

		bodyModel[148].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 163
		bodyModel[148].setRotationPoint(-19.5F, 7.5F, 6F);
		bodyModel[148].rotateAngleX = 0.78539816F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 164
		bodyModel[149].setRotationPoint(-21.5F, 7F, -6.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 165
		bodyModel[150].setRotationPoint(-21.5F, 7F, 5.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 16, 0, 14, 0F); // Box 166
		bodyModel[151].setRotationPoint(-27F, 8.5F, -7F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 0, 8, 0F); // Box 167
		bodyModel[152].setRotationPoint(-24.25F, -8.75F, -4F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 5, 0, 0F); // Box 168
		bodyModel[153].setRotationPoint(-28F, 3F, -9.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 5, 0, 0F); // Box 169
		bodyModel[154].setRotationPoint(-28F, 3F, 9.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[155].setRotationPoint(-23F, -4F, -4F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[156].setRotationPoint(-23F, -4F, 3F);

		bodyModel[157].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 172
		bodyModel[157].setRotationPoint(-16F, -1F, -7.5F);
		bodyModel[157].rotateAngleZ = -0.85521133F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 203
		bodyModel[158].setRotationPoint(2F, -6F, 8F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 204
		bodyModel[159].setRotationPoint(2.5F, -3F, 8.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 205
		bodyModel[160].setRotationPoint(2F, -2F, 8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 206
		bodyModel[161].setRotationPoint(2F, 1F, 8F);

		bodyModel[162].addShapeBox(-1F, -1F, 0F, 2, 2, 4, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 207
		bodyModel[162].setRotationPoint(-26.5F, 6.5F, -2F);
		bodyModel[162].rotateAngleZ = 0.78539816F;

		bodyModel[163].addBox(0F, 0F, 0F, 4, 7, 1, 0F); // Box 208
		bodyModel[163].setRotationPoint(27F, -7F, -8F);

		bodyModel[164].addBox(0F, 0F, 0F, 4, 7, 1, 0F); // Box 209
		bodyModel[164].setRotationPoint(27F, -7F, 7F);

		bodyModel[165].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 214
		bodyModel[165].setRotationPoint(23F, 3.5F, -1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[166].setRotationPoint(27F, -14F, -10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[167].setRotationPoint(27F, -14F, 9F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 18, 3, 0F); // Box 216
		bodyModel[168].setRotationPoint(26F, -15F, -9F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 18, 3, 0F); // Box 217
		bodyModel[169].setRotationPoint(26F, -15F, 6F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[170].setRotationPoint(26F, -16F, -9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[171].setRotationPoint(26F, -16F, 6F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 220
		bodyModel[172].setRotationPoint(26F, -17F, -6F);

		bodyModel[173].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 233
		bodyModel[173].setRotationPoint(-28F, 8F, -10.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 234
		bodyModel[174].setRotationPoint(-28F, 8F, 9.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 239
		bodyModel[175].setRotationPoint(24F, 4F, -9.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 240
		bodyModel[176].setRotationPoint(24F, 4F, 9.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 241
		bodyModel[177].setRotationPoint(24F, 8F, -10.5F);

		bodyModel[178].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 242
		bodyModel[178].setRotationPoint(24F, 8F, 9.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 251
		bodyModel[179].setRotationPoint(24F, 5F, -10.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 252
		bodyModel[180].setRotationPoint(24F, 5F, 9.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 253
		bodyModel[181].setRotationPoint(-28F, 5F, -10.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 254
		bodyModel[182].setRotationPoint(-28F, 5F, 9.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 183
		bodyModel[183].setRotationPoint(14.5F, -18.5F, -0.5F);
	}
	//public float[] getTrans() { return new float[]{ -1.3f, 0.18f, 0.0f}; }
}