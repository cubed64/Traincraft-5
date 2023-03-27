//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Amfleet Wagon
// Model Creator: 
// Created on: 04.02.2017 - 10:56:06
// Last changed on: 04.02.2017 - 10:56:06

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelAmCafe2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAmCafe2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[170];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 169, 62, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 282, 9, textureX, textureY); // Box 23
		bodyModel[9] = new ModelRendererTurbo(this, 314, 9, textureX, textureY); // Box 17
		bodyModel[10] = new ModelRendererTurbo(this, 346, 9, textureX, textureY); // Box 18
		bodyModel[11] = new ModelRendererTurbo(this, 378, 9, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 1, 15, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 29
		bodyModel[15] = new ModelRendererTurbo(this, 136, 17, textureX, textureY); // Box 31
		bodyModel[16] = new ModelRendererTurbo(this, 11, 128, textureX, textureY); // Box 50
		bodyModel[17] = new ModelRendererTurbo(this, 247, 25, textureX, textureY); // Box 67
		bodyModel[18] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 68
		bodyModel[19] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 69
		bodyModel[20] = new ModelRendererTurbo(this, 201, 48, textureX, textureY); // Box 70
		bodyModel[21] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 72
		bodyModel[22] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 81
		bodyModel[23] = new ModelRendererTurbo(this, 11, 128, textureX, textureY); // Box 98
		bodyModel[24] = new ModelRendererTurbo(this, 114, 26, textureX, textureY); // Box 147
		bodyModel[25] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 154
		bodyModel[26] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 155
		bodyModel[27] = new ModelRendererTurbo(this, 184, 24, textureX, textureY); // Box 156
		bodyModel[28] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 194
		bodyModel[29] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 100
		bodyModel[30] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 101
		bodyModel[31] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 104
		bodyModel[32] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 105
		bodyModel[33] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 109
		bodyModel[34] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 110
		bodyModel[35] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 125
		bodyModel[36] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 126
		bodyModel[37] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 129
		bodyModel[38] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 130
		bodyModel[39] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 131
		bodyModel[40] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 132
		bodyModel[41] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 144
		bodyModel[42] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 152
		bodyModel[43] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 153
		bodyModel[44] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 172
		bodyModel[45] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 173
		bodyModel[46] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 174
		bodyModel[47] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 175
		bodyModel[48] = new ModelRendererTurbo(this, 123, 73, textureX, textureY); // Box 114
		bodyModel[49] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 115
		bodyModel[50] = new ModelRendererTurbo(this, 438, 35, textureX, textureY); // Box 116
		bodyModel[51] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 117
		bodyModel[52] = new ModelRendererTurbo(this, 392, 49, textureX, textureY); // Box 118
		bodyModel[53] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 119
		bodyModel[54] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 120
		bodyModel[55] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 121
		bodyModel[56] = new ModelRendererTurbo(this, 94, 44, textureX, textureY); // Box 122
		bodyModel[57] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 142
		bodyModel[58] = new ModelRendererTurbo(this, 21, 227, textureX, textureY); // Box 144
		bodyModel[59] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 146
		bodyModel[60] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 148
		bodyModel[61] = new ModelRendererTurbo(this, 21, 239, textureX, textureY); // Box 150
		bodyModel[62] = new ModelRendererTurbo(this, 33, 239, textureX, textureY); // Box 151
		bodyModel[63] = new ModelRendererTurbo(this, 27, 239, textureX, textureY); // Box 152
		bodyModel[64] = new ModelRendererTurbo(this, 270, 244, textureX, textureY); // Box 185
		bodyModel[65] = new ModelRendererTurbo(this, 136, 188, textureX, textureY); // Box 195
		bodyModel[66] = new ModelRendererTurbo(this, 136, 188, textureX, textureY); // Box 196
		bodyModel[67] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 199
		bodyModel[68] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 201
		bodyModel[69] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 195
		bodyModel[70] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 196
		bodyModel[71] = new ModelRendererTurbo(this, 57, 237, textureX, textureY); // Box 188
		bodyModel[72] = new ModelRendererTurbo(this, 57, 237, textureX, textureY); // Box 189
		bodyModel[73] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 192
		bodyModel[74] = new ModelRendererTurbo(this, 57, 237, textureX, textureY); // Box 193
		bodyModel[75] = new ModelRendererTurbo(this, 9, 260, textureX, textureY); // Box 194
		bodyModel[76] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 195
		bodyModel[77] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 196
		bodyModel[78] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 198
		bodyModel[79] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 199
		bodyModel[80] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 200
		bodyModel[81] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 201
		bodyModel[82] = new ModelRendererTurbo(this, 22, 27, textureX, textureY); // Box 193
		bodyModel[83] = new ModelRendererTurbo(this, 22, 27, textureX, textureY); // Box 194
		bodyModel[84] = new ModelRendererTurbo(this, 22, 27, textureX, textureY); // Box 195
		bodyModel[85] = new ModelRendererTurbo(this, 22, 27, textureX, textureY); // Box 196
		bodyModel[86] = new ModelRendererTurbo(this, 207, 132, textureX, textureY); // Box 197
		bodyModel[87] = new ModelRendererTurbo(this, 315, 120, textureX, textureY); // Box 198
		bodyModel[88] = new ModelRendererTurbo(this, 302, 120, textureX, textureY); // Box 199
		bodyModel[89] = new ModelRendererTurbo(this, 8, 92, textureX, textureY); // Box 197
		bodyModel[90] = new ModelRendererTurbo(this, 339, 247, textureX, textureY); // Box 198
		bodyModel[91] = new ModelRendererTurbo(this, 231, 247, textureX, textureY); // Box 199
		bodyModel[92] = new ModelRendererTurbo(this, 339, 269, textureX, textureY); // Box 200
		bodyModel[93] = new ModelRendererTurbo(this, 231, 269, textureX, textureY); // Box 201
		bodyModel[94] = new ModelRendererTurbo(this, 377, 234, textureX, textureY); // Box 202
		bodyModel[95] = new ModelRendererTurbo(this, 199, 234, textureX, textureY); // Box 204
		bodyModel[96] = new ModelRendererTurbo(this, 367, 267, textureX, textureY); // Box 206
		bodyModel[97] = new ModelRendererTurbo(this, 207, 267, textureX, textureY); // Box 207
		bodyModel[98] = new ModelRendererTurbo(this, 226, 203, textureX, textureY); // Box 208
		bodyModel[99] = new ModelRendererTurbo(this, 59, 97, textureX, textureY); // Box 209
		bodyModel[100] = new ModelRendererTurbo(this, 392, 260, textureX, textureY); // Box 210
		bodyModel[101] = new ModelRendererTurbo(this, 186, 260, textureX, textureY); // Box 211
		bodyModel[102] = new ModelRendererTurbo(this, 165, 267, textureX, textureY); // Box 212
		bodyModel[103] = new ModelRendererTurbo(this, 413, 267, textureX, textureY); // Box 213
		bodyModel[104] = new ModelRendererTurbo(this, 10, 163, textureX, textureY); // Box 200
		bodyModel[105] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 198
		bodyModel[106] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 199
		bodyModel[107] = new ModelRendererTurbo(this, 21, 227, textureX, textureY); // Box 200
		bodyModel[108] = new ModelRendererTurbo(this, 363, 239, textureX, textureY); // Box 176
		bodyModel[109] = new ModelRendererTurbo(this, 347, 239, textureX, textureY); // Box 177
		bodyModel[110] = new ModelRendererTurbo(this, 255, 239, textureX, textureY); // Box 178
		bodyModel[111] = new ModelRendererTurbo(this, 239, 239, textureX, textureY); // Box 179
		bodyModel[112] = new ModelRendererTurbo(this, 347, 239, textureX, textureY); // Box 183
		bodyModel[113] = new ModelRendererTurbo(this, 239, 239, textureX, textureY); // Box 184
		bodyModel[114] = new ModelRendererTurbo(this, 255, 239, textureX, textureY); // Box 185
		bodyModel[115] = new ModelRendererTurbo(this, 363, 239, textureX, textureY); // Box 186
		bodyModel[116] = new ModelRendererTurbo(this, 1, 54, textureX, textureY); // Box 188
		bodyModel[117] = new ModelRendererTurbo(this, 136, 188, textureX, textureY); // Box 292
		bodyModel[118] = new ModelRendererTurbo(this, 184, 24, textureX, textureY); // Box 293
		bodyModel[119] = new ModelRendererTurbo(this, 136, 188, textureX, textureY); // Box 294
		bodyModel[120] = new ModelRendererTurbo(this, 114, 26, textureX, textureY); // Box 295
		bodyModel[121] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 296
		bodyModel[122] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 297
		bodyModel[123] = new ModelRendererTurbo(this, 45, 243, textureX, textureY); // Box 190
		bodyModel[124] = new ModelRendererTurbo(this, 45, 243, textureX, textureY); // Box 191
		bodyModel[125] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 192
		bodyModel[126] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 193
		bodyModel[127] = new ModelRendererTurbo(this, 281, 100, textureX, textureY); // Box 199
		bodyModel[128] = new ModelRendererTurbo(this, 226, 132, textureX, textureY); // Box 188
		bodyModel[129] = new ModelRendererTurbo(this, 264, 132, textureX, textureY); // Box 197
		bodyModel[130] = new ModelRendererTurbo(this, 245, 132, textureX, textureY); // Box 188
		bodyModel[131] = new ModelRendererTurbo(this, 328, 120, textureX, textureY); // Box 198
		bodyModel[132] = new ModelRendererTurbo(this, 341, 120, textureX, textureY); // Box 199
		bodyModel[133] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 19
		bodyModel[134] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 23
		bodyModel[135] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 18
		bodyModel[136] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 17
		bodyModel[137] = new ModelRendererTurbo(this, 438, 63, textureX, textureY); // Box 116
		bodyModel[138] = new ModelRendererTurbo(this, 59, 208, textureX, textureY); // Box 201
		bodyModel[139] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 215
		bodyModel[140] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 216
		bodyModel[141] = new ModelRendererTurbo(this, 33, 239, textureX, textureY); // Box 218
		bodyModel[142] = new ModelRendererTurbo(this, 21, 239, textureX, textureY); // Box 219
		bodyModel[143] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 220
		bodyModel[144] = new ModelRendererTurbo(this, 21, 227, textureX, textureY); // Box 221
		bodyModel[145] = new ModelRendererTurbo(this, 21, 227, textureX, textureY); // Box 222
		bodyModel[146] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 223
		bodyModel[147] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 224
		bodyModel[148] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // Box 225
		bodyModel[149] = new ModelRendererTurbo(this, 45, 243, textureX, textureY); // Box 226
		bodyModel[150] = new ModelRendererTurbo(this, 27, 239, textureX, textureY); // Box 227
		bodyModel[151] = new ModelRendererTurbo(this, 39, 239, textureX, textureY); // Box 228
		bodyModel[152] = new ModelRendererTurbo(this, 45, 243, textureX, textureY); // Box 187
		bodyModel[153] = new ModelRendererTurbo(this, 169, 36, textureX, textureY); // Box 127
		bodyModel[154] = new ModelRendererTurbo(this, 169, 42, textureX, textureY); // Box 154
		bodyModel[155] = new ModelRendererTurbo(this, 59, 208, textureX, textureY); // Box 201
		bodyModel[156] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 215
		bodyModel[157] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 216
		bodyModel[158] = new ModelRendererTurbo(this, 33, 239, textureX, textureY); // Box 218
		bodyModel[159] = new ModelRendererTurbo(this, 21, 239, textureX, textureY); // Box 219
		bodyModel[160] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 220
		bodyModel[161] = new ModelRendererTurbo(this, 21, 227, textureX, textureY); // Box 221
		bodyModel[162] = new ModelRendererTurbo(this, 21, 227, textureX, textureY); // Box 222
		bodyModel[163] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 223
		bodyModel[164] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 224
		bodyModel[165] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // Box 225
		bodyModel[166] = new ModelRendererTurbo(this, 45, 243, textureX, textureY); // Box 226
		bodyModel[167] = new ModelRendererTurbo(this, 27, 239, textureX, textureY); // Box 227
		bodyModel[168] = new ModelRendererTurbo(this, 39, 239, textureX, textureY); // Box 228
		bodyModel[169] = new ModelRendererTurbo(this, 45, 243, textureX, textureY); // Box 187

		bodyModel[0].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 
		bodyModel[0].setRotationPoint(-38F, -7.5F, -11.99F);
		bodyModel[0].rotateAngleX = -3.00196631F;

		bodyModel[1].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 4
		bodyModel[1].setRotationPoint(-38F, -15.18F, -13.1F);
		bodyModel[1].rotateAngleX = -3.24631241F;

		bodyModel[2].addBox(0F, 2F, 0F, 2, 6, 1, 0F); // Box 5
		bodyModel[2].setRotationPoint(-38F, -19F, -13.12F);
		bodyModel[2].rotateAngleX = -3.43829863F;

		bodyModel[3].addBox(0F, 0F, 0F, 75, 3, 1, 0F); // Box 8
		bodyModel[3].setRotationPoint(-38F, -26.27F, -10.99F);
		bodyModel[3].rotateAngleX = 2.40855437F;

		bodyModel[4].addBox(0F, 0F, 0F, 75, 3, 1, 0F); // Box 9
		bodyModel[4].setRotationPoint(-38F, -28.29F, -9.24F);
		bodyModel[4].rotateAngleX = -4.2062435F;

		bodyModel[5].addBox(0F, 0F, 0F, 75, 3, 1, 0F); // Box 11
		bodyModel[5].setRotationPoint(37F, -28.29F, 9.24F);
		bodyModel[5].rotateAngleX = -4.2062435F;
		bodyModel[5].rotateAngleY = -3.14159265F;

		bodyModel[6].addBox(0F, 0F, 0F, 75, 3, 1, 0F); // Box 12
		bodyModel[6].setRotationPoint(37F, -26.27F, 10.99F);
		bodyModel[6].rotateAngleX = 2.40855437F;
		bodyModel[6].rotateAngleY = -3.14159265F;

		bodyModel[7].addBox(0F, 2F, 0F, 66, 6, 1, 0F); // Box 14
		bodyModel[7].setRotationPoint(37F, -19F, 13.12F);
		bodyModel[7].rotateAngleX = -3.43829863F;
		bodyModel[7].rotateAngleY = -3.14159265F;

		bodyModel[8].addShapeBox(0F, 1F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[8].setRotationPoint(-28F, -3.87F, -10.8F);
		bodyModel[8].rotateAngleX = -2.82743339F;

		bodyModel[9].addShapeBox(0F, 1F, 0F, 2, 3, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[9].setRotationPoint(33F, -3.87F, -10.8F);
		bodyModel[9].rotateAngleX = -2.82743339F;

		bodyModel[10].addShapeBox(0F, 1F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[10].setRotationPoint(35F, -3.87F, 10.8F);
		bodyModel[10].rotateAngleX = -2.82743339F;
		bodyModel[10].rotateAngleY = -3.14159265F;

		bodyModel[11].addShapeBox(0F, 1F, 0F, 2, 3, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[11].setRotationPoint(-26F, -3.87F, 10.8F);
		bodyModel[11].rotateAngleX = -2.82743339F;
		bodyModel[11].rotateAngleY = -3.14159265F;

		bodyModel[12].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 20
		bodyModel[12].setRotationPoint(-36F, -7.4F, -12F);
		bodyModel[12].rotateAngleX = -3.00196631F;

		bodyModel[13].addBox(0F, 0F, 0F, 66, 8, 1, 0F); // Box 21
		bodyModel[13].setRotationPoint(-29F, -7.5F, -11.99F);
		bodyModel[13].rotateAngleX = -3.00196631F;

		bodyModel[14].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // Box 29
		bodyModel[14].setRotationPoint(-29F, -15.18F, -13.1F);
		bodyModel[14].rotateAngleX = -3.24631241F;

		bodyModel[15].addBox(0F, 2F, 0F, 66, 6, 1, 0F); // Box 31
		bodyModel[15].setRotationPoint(-29F, -19F, -13.12F);
		bodyModel[15].rotateAngleX = -3.43829863F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 33, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[16].setRotationPoint(-16.5F, -17F, -13.12F);
		bodyModel[16].rotateAngleX = -3.24631241F;

		bodyModel[17].addBox(0F, 0F, 0F, 15, 6, 1, 0F); // Box 67
		bodyModel[17].setRotationPoint(37F, -15.18F, 13.1F);
		bodyModel[17].rotateAngleX = -3.24631241F;
		bodyModel[17].rotateAngleY = -3.14159265F;

		bodyModel[18].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 68
		bodyModel[18].setRotationPoint(-36F, -15.18F, 13.1F);
		bodyModel[18].rotateAngleX = -3.24631241F;
		bodyModel[18].rotateAngleY = -3.14159265F;

		bodyModel[19].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 69
		bodyModel[19].setRotationPoint(-36F, -7.5F, 11.99F);
		bodyModel[19].rotateAngleX = -3.00196631F;
		bodyModel[19].rotateAngleY = -3.14159265F;

		bodyModel[20].addBox(0F, 0F, 0F, 66, 8, 1, 0F); // Box 70
		bodyModel[20].setRotationPoint(37F, -7.5F, 11.99F);
		bodyModel[20].rotateAngleX = -3.00196631F;
		bodyModel[20].rotateAngleY = -3.14159265F;

		bodyModel[21].addBox(0F, 2F, 0F, 2, 6, 1, 0F); // Box 72
		bodyModel[21].setRotationPoint(-36F, -19F, 13.12F);
		bodyModel[21].rotateAngleX = -3.43829863F;
		bodyModel[21].rotateAngleY = -3.14159265F;

		bodyModel[22].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 81
		bodyModel[22].setRotationPoint(-29F, -7.4F, 12F);
		bodyModel[22].rotateAngleX = -3.00196631F;
		bodyModel[22].rotateAngleY = -3.14159265F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 33, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[23].setRotationPoint(15.5F, -17F, 13.12F);
		bodyModel[23].rotateAngleX = -3.24631241F;
		bodyModel[23].rotateAngleY = -3.14159265F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 147
		bodyModel[24].setRotationPoint(-39.05F, -25.6F, -3.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[25].setRotationPoint(-39.05F, -25.6F, -5.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[26].setRotationPoint(-39.05F, -25.6F, 3.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 156
		bodyModel[27].setRotationPoint(-39.05F, -8.6F, -5.5F);

		bodyModel[28].addBox(0F, 1.5F, 0.5F, 8, 6, 0, 0F); // Box 194
		bodyModel[28].setRotationPoint(-36.5F, -7.4F, -12F);
		bodyModel[28].rotateAngleX = -3.00196631F;

		bodyModel[29].addBox(0F, 0F, 0F, 75, 7, 1, 0F); // Box 100
		bodyModel[29].setRotationPoint(-38F, -29.62F, -7F);
		bodyModel[29].rotateAngleX = -4.60766923F;

		bodyModel[30].addBox(0F, 0F, 0F, 75, 7, 1, 0F); // Box 101
		bodyModel[30].setRotationPoint(37F, -29.62F, 7F);
		bodyModel[30].rotateAngleX = -4.60766923F;
		bodyModel[30].rotateAngleY = -3.14159265F;

		bodyModel[31].addShapeBox(0F, 7F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[31].setRotationPoint(-36F, -19F, -13.12F);
		bodyModel[31].rotateAngleX = -3.43829863F;

		bodyModel[32].addShapeBox(0F, 7F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[32].setRotationPoint(-30F, -19F, -13.12F);
		bodyModel[32].rotateAngleX = -3.43829863F;

		bodyModel[33].addShapeBox(0F, 7F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[33].setRotationPoint(-35F, -19F, 13.12F);
		bodyModel[33].rotateAngleX = -3.43829863F;
		bodyModel[33].rotateAngleY = -3.14159265F;

		bodyModel[34].addShapeBox(0F, 7F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[34].setRotationPoint(-29F, -19F, 13.12F);
		bodyModel[34].rotateAngleX = -3.43829863F;
		bodyModel[34].rotateAngleY = -3.14159265F;

		bodyModel[35].addBox(0F, 0F, 0F, 15, 6, 1, 0F); // Box 125
		bodyModel[35].setRotationPoint(22F, -15.18F, -13.1F);
		bodyModel[35].rotateAngleX = -3.24631241F;

		bodyModel[36].addBox(0F, 0F, 0F, 45, 2, 1, 0F); // Box 126
		bodyModel[36].setRotationPoint(-23F, -15.18F, -13.1F);
		bodyModel[36].rotateAngleX = -3.24631241F;

		bodyModel[37].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[37].setRotationPoint(-23F, -15.18F, -13.1F);
		bodyModel[37].rotateAngleX = -3.24631241F;

		bodyModel[38].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[38].setRotationPoint(-23F, -15.18F, -13.1F);
		bodyModel[38].rotateAngleX = -3.24631241F;

		bodyModel[39].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[39].setRotationPoint(-10F, -15.18F, -13.1F);
		bodyModel[39].rotateAngleX = -3.24631241F;

		bodyModel[40].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 132
		bodyModel[40].setRotationPoint(-10F, -15.18F, -13.1F);
		bodyModel[40].rotateAngleX = -3.24631241F;

		bodyModel[41].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 144
		bodyModel[41].setRotationPoint(-36.5F, -21.69F, -12.8F);
		bodyModel[41].rotateAngleX = -3.43829863F;

		bodyModel[42].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // Box 152
		bodyModel[42].setRotationPoint(-23F, -15.18F, 13.1F);
		bodyModel[42].rotateAngleX = -3.24631241F;
		bodyModel[42].rotateAngleY = -3.14159265F;

		bodyModel[43].addBox(0F, 0F, 0F, 45, 2, 1, 0F); // Box 153
		bodyModel[43].setRotationPoint(22F, -15.18F, 13.1F);
		bodyModel[43].rotateAngleX = -3.24631241F;
		bodyModel[43].rotateAngleY = -3.14159265F;

		bodyModel[44].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[44].setRotationPoint(22F, -15.18F, 13.1F);
		bodyModel[44].rotateAngleX = -3.24631241F;
		bodyModel[44].rotateAngleY = -3.14159265F;

		bodyModel[45].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[45].setRotationPoint(22F, -15.18F, 13.1F);
		bodyModel[45].rotateAngleX = -3.24631241F;
		bodyModel[45].rotateAngleY = -3.14159265F;

		bodyModel[46].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[46].setRotationPoint(9F, -15.18F, 13.1F);
		bodyModel[46].rotateAngleX = -3.24631241F;
		bodyModel[46].rotateAngleY = -3.14159265F;

		bodyModel[47].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 175
		bodyModel[47].setRotationPoint(9F, -15.18F, 13.1F);
		bodyModel[47].rotateAngleX = -3.24631241F;
		bodyModel[47].rotateAngleY = -3.14159265F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 73, 1, 24, 0F,0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[48].setRotationPoint(-37.01F, -7.5F, -12F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 17, 17, 0F); // Box 115
		bodyModel[49].setRotationPoint(-28F, -7.51F, -13F);
		bodyModel[49].rotateAngleX = 1.57079633F;

		bodyModel[50].addBox(0F, 0F, 0F, 0, 26, 24, 0F); // Box 116
		bodyModel[50].setRotationPoint(36F, -7.4F, -13F);
		bodyModel[50].rotateAngleX = 1.57079633F;

		bodyModel[51].addBox(0F, 0F, 0F, 4, 24, 7, 0F); // Box 117
		bodyModel[51].setRotationPoint(-28F, -24.52F, -12F);
		bodyModel[51].rotateAngleX = 1.57079633F;

		bodyModel[52].addBox(0F, 0F, 0F, 4, 1, 17, 0F); // Box 118
		bodyModel[52].setRotationPoint(-28F, -7.51F, 12F);
		bodyModel[52].rotateAngleX = 1.57079633F;

		bodyModel[53].addBox(0F, 0F, 0F, 4, 17, 17, 0F); // Box 119
		bodyModel[53].setRotationPoint(23F, -7.51F, -13F);
		bodyModel[53].rotateAngleX = 1.57079633F;

		bodyModel[54].addBox(0F, 0F, 0F, 4, 24, 7, 0F); // Box 120
		bodyModel[54].setRotationPoint(23F, -24.4F, -12F);
		bodyModel[54].rotateAngleX = 1.57079633F;

		bodyModel[55].addBox(0F, 0F, 0F, 4, 1, 17, 0F); // Box 121
		bodyModel[55].setRotationPoint(23F, -7.51F, 12F);
		bodyModel[55].rotateAngleX = 1.57079633F;

		bodyModel[56].addBox(0F, 0F, 0F, 0, 26, 24, 0F); // Box 122
		bodyModel[56].setRotationPoint(-37F, -7.4F, -13F);
		bodyModel[56].rotateAngleX = 1.57079633F;

		bodyModel[57].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 142
		bodyModel[57].setRotationPoint(-16.75F, -11.4F, -4.39F);
		bodyModel[57].rotateAngleZ = 3.40339204F;

		bodyModel[58].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 144
		bodyModel[58].setRotationPoint(-18.5F, -17.8F, -4.4F);
		bodyModel[58].rotateAngleZ = 3.22885912F;

		bodyModel[59].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 146
		bodyModel[59].setRotationPoint(-11F, -11.4F, -4.4F);
		bodyModel[59].rotateAngleZ = 4.71238898F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 148
		bodyModel[60].setRotationPoint(-11F, -12.4F, 2.6F);
		bodyModel[60].rotateAngleZ = 4.71238898F;

		bodyModel[61].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 150
		bodyModel[61].setRotationPoint(-12F, -13.4F, 2.6F);
		bodyModel[61].rotateAngleZ = 4.71238898F;

		bodyModel[62].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 151
		bodyModel[62].setRotationPoint(-12.99F, -13.9F, 2.59F);
		bodyModel[62].rotateAngleZ = 4.71238898F;

		bodyModel[63].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 152
		bodyModel[63].setRotationPoint(-12F, -13.4F, -12.6F);
		bodyModel[63].rotateAngleZ = 4.71238898F;

		bodyModel[64].addBox(0F, 0F, 0F, 20, 6, 16, 0F); // Box 185
		bodyModel[64].setRotationPoint(-10F, -7F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 195
		bodyModel[65].setRotationPoint(-39.05F, -23.6F, 3.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 196
		bodyModel[66].setRotationPoint(-39.05F, -23.6F, -5.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[67].setRotationPoint(36.05F, -25.6F, 3.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[68].setRotationPoint(36.05F, -25.6F, -5.5F);

		bodyModel[69].addBox(0F, 0F, 0.5F, 7, 7, 0, 0F); // Box 195
		bodyModel[69].setRotationPoint(-29F, -14.69F, 13.04F);
		bodyModel[69].rotateAngleX = -3.24631241F;
		bodyModel[69].rotateAngleY = -3.14159265F;

		bodyModel[70].addBox(0F, 0F, 0.5F, 7, 7, 0, 0F); // Box 196
		bodyModel[70].setRotationPoint(-36F, -14.69F, -13.04F);
		bodyModel[70].rotateAngleX = -3.24631241F;

		bodyModel[71].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 188
		bodyModel[71].setRotationPoint(-1F, -26.5F, -3F);
		bodyModel[71].rotateAngleX = 3.36848546F;

		bodyModel[72].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 189
		bodyModel[72].setRotationPoint(-13F, -26.5F, -3F);
		bodyModel[72].rotateAngleX = 3.36848546F;

		bodyModel[73].addBox(0F, 0F, 0F, 47, 1, 8, 0F); // Box 192
		bodyModel[73].setRotationPoint(-24F, -26F, -10.5F);
		bodyModel[73].rotateAngleX = 0.08726646F;

		bodyModel[74].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 193
		bodyModel[74].setRotationPoint(12F, -26.5F, -3F);
		bodyModel[74].rotateAngleX = 3.36848546F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 47, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 194
		bodyModel[75].setRotationPoint(-24F, -28F, -2.55F);

		bodyModel[76].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[76].setRotationPoint(-9F, -15.18F, 13.1F);
		bodyModel[76].rotateAngleX = -3.24631241F;
		bodyModel[76].rotateAngleY = -3.14159265F;

		bodyModel[77].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[77].setRotationPoint(-22F, -15.18F, 13.1F);
		bodyModel[77].rotateAngleX = -3.24631241F;
		bodyModel[77].rotateAngleY = -3.14159265F;

		bodyModel[78].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[78].setRotationPoint(8F, -15.18F, -13.1F);
		bodyModel[78].rotateAngleX = -3.24631241F;

		bodyModel[79].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[79].setRotationPoint(8F, -15.18F, -13.1F);
		bodyModel[79].rotateAngleX = -3.24631241F;

		bodyModel[80].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[80].setRotationPoint(21F, -15.18F, -13.1F);
		bodyModel[80].rotateAngleX = -3.24631241F;

		bodyModel[81].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 201
		bodyModel[81].setRotationPoint(21F, -15.18F, -13.1F);
		bodyModel[81].rotateAngleX = -3.24631241F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 193
		bodyModel[82].setRotationPoint(36.01F, -22F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[83].setRotationPoint(36.01F, -22F, 6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 195
		bodyModel[84].setRotationPoint(-38.01F, -22F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		bodyModel[85].setRotationPoint(-38.01F, -22F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[86].setRotationPoint(-37.99F, -12.5F, -12.99F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 1F, 0F, 0F, 1F); // Box 198
		bodyModel[87].setRotationPoint(-37.99F, -30.5F, 4F);
		bodyModel[87].rotateAngleX = -1.57079633F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 1F, 0F, 0F, 1F); // Box 199
		bodyModel[88].setRotationPoint(-37.99F, -30.5F, -3F);
		bodyModel[88].rotateAngleX = -1.57079633F;

		bodyModel[89].addBox(0F, 0F, 0F, 1, 2, 24, 0F); // Box 197
		bodyModel[89].setRotationPoint(-37F, -6.5F, -12F);

		bodyModel[90].addBox(0F, 0F, 0F, 14, 3, 8, 0F); // Box 198
		bodyModel[90].setRotationPoint(-26F, -4F, -4F);

		bodyModel[91].addBox(0F, 0F, 0F, 14, 3, 8, 0F); // Box 199
		bodyModel[91].setRotationPoint(12F, -4F, -4F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 200
		bodyModel[92].setRotationPoint(-21F, -4.5F, -9F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 201
		bodyModel[93].setRotationPoint(17F, -4.5F, -9F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 3, 16, 0F); // Box 202
		bodyModel[94].setRotationPoint(-20.5F, -7F, -8F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 3, 16, 0F); // Box 204
		bodyModel[95].setRotationPoint(17.5F, -7F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 206
		bodyModel[96].setRotationPoint(-20.5F, -3.5F, -8.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 207
		bodyModel[97].setRotationPoint(17.5F, -3.5F, -8.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 48, 1, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16.5F, 0F, 0F, -16.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -16.5F, 0F, -0.5F, -16.5F); // Box 208
		bodyModel[98].setRotationPoint(-24F, -3.25F, -8.25F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 2, 24, 0F); // Box 209
		bodyModel[99].setRotationPoint(35F, -6.5F, -12F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Box 210
		bodyModel[100].setRotationPoint(-26F, -7F, -8.5F);
		bodyModel[100].rotateAngleZ = 0.34906585F;

		bodyModel[101].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Box 211
		bodyModel[101].setRotationPoint(26F, -7F, 8.5F);
		bodyModel[101].rotateAngleY = -3.14159265F;
		bodyModel[101].rotateAngleZ = 0.34906585F;

		bodyModel[102].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Box 212
		bodyModel[102].setRotationPoint(20.2F, -6.6F, -8.49F);
		bodyModel[102].rotateAngleZ = 0.78539816F;

		bodyModel[103].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Box 213
		bodyModel[103].setRotationPoint(-20.2F, -6.6F, 8.51F);
		bodyModel[103].rotateAngleY = -3.14159265F;
		bodyModel[103].rotateAngleZ = 0.78539816F;

		bodyModel[104].addBox(0F, 0F, 0F, 79, 2, 4, 0F); // Box 200
		bodyModel[104].setRotationPoint(-40F, -7F, -2F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 198
		bodyModel[105].setRotationPoint(-11F, -11.4F, -11.6F);
		bodyModel[105].rotateAngleZ = 4.71238898F;

		bodyModel[106].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 199
		bodyModel[106].setRotationPoint(-16.75F, -11.4F, -11.59F);
		bodyModel[106].rotateAngleZ = 3.40339204F;

		bodyModel[107].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 200
		bodyModel[107].setRotationPoint(-18.5F, -17.8F, -11.6F);
		bodyModel[107].rotateAngleZ = 3.22885912F;

		bodyModel[108].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 176
		bodyModel[108].setRotationPoint(24.5F, -3F, 6F);

		bodyModel[109].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 177
		bodyModel[109].setRotationPoint(13.5F, -3F, 6F);

		bodyModel[110].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 178
		bodyModel[110].setRotationPoint(-13.5F, -3F, 6F);

		bodyModel[111].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 179
		bodyModel[111].setRotationPoint(-24.5F, -3F, 6F);

		bodyModel[112].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 183
		bodyModel[112].setRotationPoint(13.5F, -3F, -6F);

		bodyModel[113].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 184
		bodyModel[113].setRotationPoint(-24.5F, -3F, -6F);

		bodyModel[114].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 185
		bodyModel[114].setRotationPoint(-13.5F, -3F, -6F);

		bodyModel[115].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 186
		bodyModel[115].setRotationPoint(24.5F, -3F, -6F);

		bodyModel[116].addBox(0F, 0F, 0F, 75, 1, 1, 0F); // Box 188
		bodyModel[116].setRotationPoint(37F, -31.35F, 0.5F);
		bodyModel[116].rotateAngleY = -3.14159265F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 292
		bodyModel[117].setRotationPoint(35.95F, -23.6F, -5.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 293
		bodyModel[118].setRotationPoint(35.95F, -8.6F, -5.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 294
		bodyModel[119].setRotationPoint(35.95F, -23.6F, 3.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 295
		bodyModel[120].setRotationPoint(35.95F, -25.6F, -3.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 296
		bodyModel[121].setRotationPoint(-28.5F, -21.69F, 12.8F);
		bodyModel[121].rotateAngleX = -3.43829863F;
		bodyModel[121].rotateAngleY = -3.14159265F;

		bodyModel[122].addBox(0F, 1.5F, 0.5F, 8, 6, 0, 0F); // Box 297
		bodyModel[122].setRotationPoint(-28.5F, -7.4F, 12F);
		bodyModel[122].rotateAngleX = -3.00196631F;
		bodyModel[122].rotateAngleY = -3.14159265F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[123].setRotationPoint(-11F, -13.4F, 2.6F);
		bodyModel[123].rotateAngleZ = 4.71238898F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[124].setRotationPoint(-11F, -13.4F, -12.6F);
		bodyModel[124].rotateAngleZ = 4.71238898F;

		bodyModel[125].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[125].setRotationPoint(-9F, -15.18F, 13.1F);
		bodyModel[125].rotateAngleX = -3.24631241F;
		bodyModel[125].rotateAngleY = -3.14159265F;

		bodyModel[126].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[126].setRotationPoint(-22F, -15.18F, 13.1F);
		bodyModel[126].rotateAngleX = -3.24631241F;
		bodyModel[126].rotateAngleY = -3.14159265F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 9, 23, 1, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 199
		bodyModel[127].setRotationPoint(27F, -30F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[128].setRotationPoint(-37.99F, -12.5F, 4.99F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[129].setRotationPoint(36.01F, -12.5F, -12.99F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[130].setRotationPoint(36.01F, -12.5F, 4.99F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 1F, 0F, 0F, 1F); // Box 198
		bodyModel[131].setRotationPoint(36.01F, -30.5F, 4F);
		bodyModel[131].rotateAngleX = -1.57079633F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 1F, 0F, 0F, 1F); // Box 199
		bodyModel[132].setRotationPoint(36.01F, -30.5F, -3F);
		bodyModel[132].rotateAngleX = -1.57079633F;

		bodyModel[133].addShapeBox(0F, 1F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[133].setRotationPoint(-28F, -3.87F, 10.8F);
		bodyModel[133].rotateAngleX = -2.82743339F;
		bodyModel[133].rotateAngleY = -3.14159265F;

		bodyModel[134].addShapeBox(0F, 1F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[134].setRotationPoint(-38F, -3.87F, -10.8F);
		bodyModel[134].rotateAngleX = -2.82743339F;

		bodyModel[135].addShapeBox(0F, 1F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[135].setRotationPoint(37F, -3.87F, 10.8F);
		bodyModel[135].rotateAngleX = -2.82743339F;
		bodyModel[135].rotateAngleY = -3.14159265F;

		bodyModel[136].addShapeBox(0F, 1F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[136].setRotationPoint(35F, -3.87F, -10.8F);
		bodyModel[136].rotateAngleX = -2.82743339F;

		bodyModel[137].addBox(0F, 0F, 0F, 0, 26, 24, 0F); // Box 116
		bodyModel[137].setRotationPoint(35.94F, -7.4F, -13F);
		bodyModel[137].rotateAngleX = 1.57079633F;

		bodyModel[138].addBox(0F, 0F, -2F, 1, 11, 16, 0F); // Box 201
		bodyModel[138].setRotationPoint(5F, -14.4F, -11.4F);
		bodyModel[138].rotateAngleZ = 4.71238898F;

		bodyModel[139].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 215
		bodyModel[139].setRotationPoint(17F, -11.4F, -4.4F);
		bodyModel[139].rotateAngleZ = 4.71238898F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 216
		bodyModel[140].setRotationPoint(17F, -12.4F, 2.6F);
		bodyModel[140].rotateAngleZ = 4.71238898F;

		bodyModel[141].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 218
		bodyModel[141].setRotationPoint(12.01F, -13.9F, 3.59F);
		bodyModel[141].rotateAngleY = -3.14159265F;
		bodyModel[141].rotateAngleZ = 4.71238898F;

		bodyModel[142].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 219
		bodyModel[142].setRotationPoint(17F, -13.4F, 2.6F);
		bodyModel[142].rotateAngleZ = 4.71238898F;

		bodyModel[143].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 220
		bodyModel[143].setRotationPoint(16.25F, -11.4F, 2.61F);
		bodyModel[143].rotateAngleY = -3.14159265F;
		bodyModel[143].rotateAngleZ = 3.40339204F;

		bodyModel[144].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 221
		bodyModel[144].setRotationPoint(18F, -17.8F, 2.6F);
		bodyModel[144].rotateAngleY = -3.14159265F;
		bodyModel[144].rotateAngleZ = 3.22885912F;

		bodyModel[145].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 222
		bodyModel[145].setRotationPoint(18F, -17.8F, -4.6F);
		bodyModel[145].rotateAngleY = -3.14159265F;
		bodyModel[145].rotateAngleZ = 3.22885912F;

		bodyModel[146].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 223
		bodyModel[146].setRotationPoint(16.25F, -11.4F, -4.59F);
		bodyModel[146].rotateAngleY = -3.14159265F;
		bodyModel[146].rotateAngleZ = 3.40339204F;

		bodyModel[147].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 224
		bodyModel[147].setRotationPoint(17F, -11.4F, -11.6F);
		bodyModel[147].rotateAngleZ = 4.71238898F;

		bodyModel[148].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // Box 225
		bodyModel[148].setRotationPoint(17F, -12.4F, -12.6F);
		bodyModel[148].rotateAngleZ = 4.71238898F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[149].setRotationPoint(10F, -13.4F, -11.6F);
		bodyModel[149].rotateAngleY = -3.14159265F;
		bodyModel[149].rotateAngleZ = 4.71238898F;

		bodyModel[150].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 227
		bodyModel[150].setRotationPoint(17F, -13.4F, -12.6F);
		bodyModel[150].rotateAngleZ = 4.71238898F;

		bodyModel[151].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 228
		bodyModel[151].setRotationPoint(12.01F, -13.9F, -11.61F);
		bodyModel[151].rotateAngleY = -3.14159265F;
		bodyModel[151].rotateAngleZ = 4.71238898F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[152].setRotationPoint(10F, -13.4F, 3.6F);
		bodyModel[152].rotateAngleY = -3.14159265F;
		bodyModel[152].rotateAngleZ = 4.71238898F;

		bodyModel[153].addBox(0F, 2F, 0F, 17, 4, 1, 0F); // Box 127
		bodyModel[153].setRotationPoint(-9F, -15.18F, -13.1F);
		bodyModel[153].rotateAngleX = -3.24631241F;

		bodyModel[154].addBox(0F, 2F, 0F, 17, 4, 1, 0F); // Box 154
		bodyModel[154].setRotationPoint(8F, -15.18F, 13.1F);
		bodyModel[154].rotateAngleX = -3.24631241F;
		bodyModel[154].rotateAngleY = -3.14159265F;

		bodyModel[155].addBox(0F, 0F, -2F, 1, 11, 16, 0F); // Box 201
		bodyModel[155].setRotationPoint(5F, -14.4F, -11.4F);
		bodyModel[155].rotateAngleZ = 4.71238898F;

		bodyModel[156].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 215
		bodyModel[156].setRotationPoint(17F, -11.4F, -4.4F);
		bodyModel[156].rotateAngleZ = 4.71238898F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 216
		bodyModel[157].setRotationPoint(17F, -12.4F, 2.6F);
		bodyModel[157].rotateAngleZ = 4.71238898F;

		bodyModel[158].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 218
		bodyModel[158].setRotationPoint(12.01F, -13.9F, 3.59F);
		bodyModel[158].rotateAngleY = -3.14159265F;
		bodyModel[158].rotateAngleZ = 4.71238898F;

		bodyModel[159].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 219
		bodyModel[159].setRotationPoint(17F, -13.4F, 2.6F);
		bodyModel[159].rotateAngleZ = 4.71238898F;

		bodyModel[160].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 220
		bodyModel[160].setRotationPoint(16.25F, -11.4F, 2.61F);
		bodyModel[160].rotateAngleY = -3.14159265F;
		bodyModel[160].rotateAngleZ = 3.40339204F;

		bodyModel[161].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 221
		bodyModel[161].setRotationPoint(18F, -17.8F, 2.6F);
		bodyModel[161].rotateAngleY = -3.14159265F;
		bodyModel[161].rotateAngleZ = 3.22885912F;

		bodyModel[162].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 222
		bodyModel[162].setRotationPoint(18F, -17.8F, -4.6F);
		bodyModel[162].rotateAngleY = -3.14159265F;
		bodyModel[162].rotateAngleZ = 3.22885912F;

		bodyModel[163].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 223
		bodyModel[163].setRotationPoint(16.25F, -11.4F, -4.59F);
		bodyModel[163].rotateAngleY = -3.14159265F;
		bodyModel[163].rotateAngleZ = 3.40339204F;

		bodyModel[164].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 224
		bodyModel[164].setRotationPoint(17F, -11.4F, -11.6F);
		bodyModel[164].rotateAngleZ = 4.71238898F;

		bodyModel[165].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // Box 225
		bodyModel[165].setRotationPoint(17F, -12.4F, -12.6F);
		bodyModel[165].rotateAngleZ = 4.71238898F;

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[166].setRotationPoint(10F, -13.4F, -11.6F);
		bodyModel[166].rotateAngleY = -3.14159265F;
		bodyModel[166].rotateAngleZ = 4.71238898F;

		bodyModel[167].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 227
		bodyModel[167].setRotationPoint(17F, -13.4F, -12.6F);
		bodyModel[167].rotateAngleZ = 4.71238898F;

		bodyModel[168].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 228
		bodyModel[168].setRotationPoint(12.01F, -13.9F, -11.61F);
		bodyModel[168].rotateAngleY = -3.14159265F;
		bodyModel[168].rotateAngleZ = 4.71238898F;

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[169].setRotationPoint(10F, -13.4F, 3.6F);
		bodyModel[169].rotateAngleY = -3.14159265F;
		bodyModel[169].rotateAngleZ = 4.71238898F;
	}
}