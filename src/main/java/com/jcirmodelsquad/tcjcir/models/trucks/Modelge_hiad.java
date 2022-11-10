//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GE_HIAD
// Model Creator: Biba
// Created on: 07.11.2022 - 14:30:33
// Last changed on: 07.11.2022 - 14:30:33

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelge_hiad extends ModelConverter//Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public Modelge_hiad() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[149];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4 ax
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 173 br
		bodyModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 22 br
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 23 br
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 68 br
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 69 br
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 70 br
		bodyModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 123 ax
		bodyModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 124 ax
		bodyModel[9] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 0 wh
		bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3 wh
		bodyModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4 wh
		bodyModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 10 wh
		bodyModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 11 wh
		bodyModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 98
		bodyModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 101
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 102
		bodyModel[17] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 103
		bodyModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 186
		bodyModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 30 wh
		bodyModel[20] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 52 pivot point
		bodyModel[21] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 53
		bodyModel[22] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 54
		bodyModel[23] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 55
		bodyModel[24] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 56
		bodyModel[25] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 186
		bodyModel[26] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 187
		bodyModel[27] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 188
		bodyModel[28] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 189
		bodyModel[29] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 190
		bodyModel[30] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 191
		bodyModel[31] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 192
		bodyModel[32] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 193
		bodyModel[33] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 194
		bodyModel[34] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 195
		bodyModel[35] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 196
		bodyModel[36] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 197
		bodyModel[37] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 198
		bodyModel[38] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 199
		bodyModel[39] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 200
		bodyModel[40] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 201
		bodyModel[41] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 202
		bodyModel[42] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 203
		bodyModel[43] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 204
		bodyModel[44] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 205
		bodyModel[45] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 207 shock absorber mount
		bodyModel[46] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 232
		bodyModel[47] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 209
		bodyModel[48] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 210
		bodyModel[49] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 211
		bodyModel[50] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 212
		bodyModel[51] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 213
		bodyModel[52] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 214
		bodyModel[53] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 215
		bodyModel[54] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 216
		bodyModel[55] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 217
		bodyModel[56] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 218
		bodyModel[57] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 220
		bodyModel[58] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 221
		bodyModel[59] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 222
		bodyModel[60] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 223
		bodyModel[61] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 224
		bodyModel[62] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 226
		bodyModel[63] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 227
		bodyModel[64] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 228
		bodyModel[65] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 229
		bodyModel[66] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 230
		bodyModel[67] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 231
		bodyModel[68] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 232
		bodyModel[69] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 233
		bodyModel[70] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 234
		bodyModel[71] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 235
		bodyModel[72] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 236
		bodyModel[73] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 237
		bodyModel[74] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 238
		bodyModel[75] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 239
		bodyModel[76] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 240
		bodyModel[77] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 241
		bodyModel[78] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 242
		bodyModel[79] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 243
		bodyModel[80] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 244
		bodyModel[81] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 245
		bodyModel[82] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 246
		bodyModel[83] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 247
		bodyModel[84] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 248
		bodyModel[85] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 249
		bodyModel[86] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 250
		bodyModel[87] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 251
		bodyModel[88] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 252
		bodyModel[89] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 253
		bodyModel[90] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 254
		bodyModel[91] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 255
		bodyModel[92] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 256
		bodyModel[93] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 257
		bodyModel[94] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 258
		bodyModel[95] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 259
		bodyModel[96] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 260
		bodyModel[97] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 261
		bodyModel[98] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 262
		bodyModel[99] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 263
		bodyModel[100] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 264
		bodyModel[101] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 265
		bodyModel[102] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 266
		bodyModel[103] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 267
		bodyModel[104] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 268
		bodyModel[105] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 269
		bodyModel[106] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 27
		bodyModel[107] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 29
		bodyModel[108] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 91
		bodyModel[109] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 116
		bodyModel[110] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 117
		bodyModel[111] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 118
		bodyModel[112] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 219
		bodyModel[113] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 220
		bodyModel[114] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 221
		bodyModel[115] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 222
		bodyModel[116] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 223
		bodyModel[117] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 224
		bodyModel[118] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 282
		bodyModel[119] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 283
		bodyModel[120] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 125
		bodyModel[121] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 126
		bodyModel[122] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 127
		bodyModel[123] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 128 shock absorber mount
		bodyModel[124] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 129
		bodyModel[125] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 130
		bodyModel[126] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 131
		bodyModel[127] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 132
		bodyModel[128] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 133
		bodyModel[129] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 134
		bodyModel[130] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 135
		bodyModel[131] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 136
		bodyModel[132] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 137
		bodyModel[133] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 138
		bodyModel[134] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 139
		bodyModel[135] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 80
		bodyModel[136] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 86
		bodyModel[137] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 142
		bodyModel[138] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 143
		bodyModel[139] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 144
		bodyModel[140] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 145
		bodyModel[141] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 158
		bodyModel[142] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 159
		bodyModel[143] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 154
		bodyModel[144] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 155
		bodyModel[145] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 156
		bodyModel[146] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 157
		bodyModel[147] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 158
		bodyModel[148] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 159

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 4 ax
		bodyModel[0].setRotationPoint(-9.5F, 6F, -8.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173 br
		bodyModel[1].setRotationPoint(-9.5F, 6F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 22 br
		bodyModel[2].setRotationPoint(1.5F, 6F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 br
		bodyModel[3].setRotationPoint(12.5F, 6F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 68 br
		bodyModel[4].setRotationPoint(1.5F, 6F, 8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 69 br
		bodyModel[5].setRotationPoint(-9.5F, 6F, 8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 70 br
		bodyModel[6].setRotationPoint(12.5F, 6F, 8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 123 ax
		bodyModel[7].setRotationPoint(1.5F, 6F, -8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 124 ax
		bodyModel[8].setRotationPoint(12.5F, 6F, -8.5F);

		bodyModel[9].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 0 wh
		bodyModel[9].setRotationPoint(-8.5F, 7F, -5.75F);

		bodyModel[10].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 3 wh
		bodyModel[10].setRotationPoint(-8.5F, 7F, 5.75F);

		bodyModel[11].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 4 wh
		bodyModel[11].setRotationPoint(2.5F, 7F, 5.75F);

		bodyModel[12].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10 wh
		bodyModel[12].setRotationPoint(13.5F, 7F, -5.75F);

		bodyModel[13].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11 wh
		bodyModel[13].setRotationPoint(13.5F, 7F, 5.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 98
		bodyModel[14].setRotationPoint(-11.5F, 4F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 101
		bodyModel[15].setRotationPoint(-10.5F, 3F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[16].setRotationPoint(-11.5F, 3F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[17].setRotationPoint(-8.5F, 3F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, -0.25F); // Box 186
		bodyModel[18].setRotationPoint(-7.5F, 5.5F, 7F);

		bodyModel[19].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wh
		bodyModel[19].setRotationPoint(3F, 7F, -5.75F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 52 pivot point
		bodyModel[20].setRotationPoint(-2F, 3F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[21].setRotationPoint(4.5F, 3F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[22].setRotationPoint(-1.5F, 3F, 7F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 55
		bodyModel[23].setRotationPoint(0.5F, 3F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 56
		bodyModel[24].setRotationPoint(-5.5F, 4F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 186
		bodyModel[25].setRotationPoint(-11.5F, 8F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[26].setRotationPoint(-11.5F, 8F, 7F);

		bodyModel[27].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 188
		bodyModel[27].setRotationPoint(-10.6F, 6F, 8F);
		bodyModel[27].rotateAngleY = 0.78539816F;

		bodyModel[28].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 189
		bodyModel[28].setRotationPoint(-6.4F, 6F, 8F);
		bodyModel[28].rotateAngleY = 0.78539816F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[29].setRotationPoint(-10.5F, 6F, 7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[30].setRotationPoint(-7.5F, 6F, 7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[31].setRotationPoint(3.5F, 6F, 7F);

		bodyModel[32].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 193
		bodyModel[32].setRotationPoint(0.4F, 6F, 8F);
		bodyModel[32].rotateAngleY = 0.78539816F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[33].setRotationPoint(0.5F, 6F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 195
		bodyModel[34].setRotationPoint(-0.5F, 8F, 8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[35].setRotationPoint(-0.5F, 8F, 7F);

		bodyModel[36].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 197
		bodyModel[36].setRotationPoint(4.6F, 6F, 8F);
		bodyModel[36].rotateAngleY = 0.78539816F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[37].setRotationPoint(14.5F, 6F, 7F);

		bodyModel[38].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 199
		bodyModel[38].setRotationPoint(11.4F, 6F, 8F);
		bodyModel[38].rotateAngleY = 0.78539816F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[39].setRotationPoint(11.5F, 6F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 201
		bodyModel[40].setRotationPoint(10.5F, 8F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[41].setRotationPoint(10.5F, 8F, 7F);

		bodyModel[42].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 203
		bodyModel[42].setRotationPoint(15.6F, 6F, 8F);
		bodyModel[42].rotateAngleY = 0.78539816F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 204
		bodyModel[43].setRotationPoint(-11F, 3F, 9.5F);
		bodyModel[43].rotateAngleX = -0.78539816F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 205
		bodyModel[44].setRotationPoint(14F, 3F, 9.5F);
		bodyModel[44].rotateAngleX = -0.78539816F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207 shock absorber mount
		bodyModel[45].setRotationPoint(12.5F, 6F, 8.25F);

		bodyModel[46].addShapeBox(0F, 0F, -0.75F, 1, 4, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 232
		bodyModel[46].setRotationPoint(13F, 3.25F, 10.5F);
		bodyModel[46].rotateAngleX = -0.38397244F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -0.25F, 0F); // Box 209
		bodyModel[47].setRotationPoint(-11.5F, 5.5F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, -0.25F); // Box 210
		bodyModel[48].setRotationPoint(3.5F, 5.5F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -0.25F, 0F); // Box 211
		bodyModel[49].setRotationPoint(-0.5F, 5.5F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, -0.25F); // Box 212
		bodyModel[50].setRotationPoint(14.5F, 5.5F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -0.25F, 0F); // Box 213
		bodyModel[51].setRotationPoint(10.5F, 5.5F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 214
		bodyModel[52].setRotationPoint(-0.5F, 4F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 215
		bodyModel[53].setRotationPoint(5.5F, 4F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 216
		bodyModel[54].setRotationPoint(10.5F, 4F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[55].setRotationPoint(15.5F, 3F, 7F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 218
		bodyModel[56].setRotationPoint(13.5F, 3F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[57].setRotationPoint(11.5F, 3F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 221
		bodyModel[58].setRotationPoint(16.5F, 4.5F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 222
		bodyModel[59].setRotationPoint(18.5F, 4.5F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 223
		bodyModel[60].setRotationPoint(17.5F, 4.5F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[61].setRotationPoint(17.5F, 6F, -2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 226
		bodyModel[62].setRotationPoint(16.5F, 4F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 227
		bodyModel[63].setRotationPoint(-5.5F, 4F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[64].setRotationPoint(-8.5F, 3F, -9F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 229
		bodyModel[65].setRotationPoint(-10.5F, 3F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[66].setRotationPoint(-11.5F, 3F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 231
		bodyModel[67].setRotationPoint(-11.5F, 4F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -0.25F, 0F); // Box 232
		bodyModel[68].setRotationPoint(-11.5F, 5.5F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, -0.25F); // Box 233
		bodyModel[69].setRotationPoint(-7.5F, 5.5F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -0.25F, 0F); // Box 234
		bodyModel[70].setRotationPoint(-0.5F, 5.5F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 235
		bodyModel[71].setRotationPoint(-0.5F, 4F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[72].setRotationPoint(-1.5F, 3F, -9F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 237
		bodyModel[73].setRotationPoint(0.5F, 3F, -9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[74].setRotationPoint(4.5F, 3F, -9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, -0.25F); // Box 239
		bodyModel[75].setRotationPoint(3.5F, 5.5F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 240
		bodyModel[76].setRotationPoint(5.5F, 4F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -0.25F, 0F); // Box 241
		bodyModel[77].setRotationPoint(10.5F, 5.5F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 242
		bodyModel[78].setRotationPoint(10.5F, 4F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[79].setRotationPoint(11.5F, 3F, -9F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 244
		bodyModel[80].setRotationPoint(13.5F, 3F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[81].setRotationPoint(15.5F, 3F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 246
		bodyModel[82].setRotationPoint(16.5F, 4F, -9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, -0.25F); // Box 247
		bodyModel[83].setRotationPoint(14.5F, 5.5F, -9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 248
		bodyModel[84].setRotationPoint(16.5F, 4.5F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 249
		bodyModel[85].setRotationPoint(18.5F, 4.5F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[86].setRotationPoint(-10.5F, 6F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[87].setRotationPoint(-7.5F, 6F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 252
		bodyModel[88].setRotationPoint(-11.5F, 8F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[89].setRotationPoint(-11.5F, 8F, -9F);

		bodyModel[90].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 254
		bodyModel[90].setRotationPoint(-10.6F, 6F, -8F);
		bodyModel[90].rotateAngleY = 0.78539816F;

		bodyModel[91].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 255
		bodyModel[91].setRotationPoint(-6.4F, 6F, -8F);
		bodyModel[91].rotateAngleY = 0.78539816F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[92].setRotationPoint(-0.5F, 8F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 257
		bodyModel[93].setRotationPoint(-0.5F, 8F, -8F);

		bodyModel[94].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 258
		bodyModel[94].setRotationPoint(0.4F, 6F, -8F);
		bodyModel[94].rotateAngleY = 0.78539816F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[95].setRotationPoint(0.5F, 6F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[96].setRotationPoint(3.5F, 6F, -9F);

		bodyModel[97].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 261
		bodyModel[97].setRotationPoint(4.6F, 6F, -8F);
		bodyModel[97].rotateAngleY = 0.78539816F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[98].setRotationPoint(10.5F, 8F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 263
		bodyModel[99].setRotationPoint(10.5F, 8F, -8F);

		bodyModel[100].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 264
		bodyModel[100].setRotationPoint(15.6F, 6F, -8F);
		bodyModel[100].rotateAngleY = 0.78539816F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[101].setRotationPoint(14.5F, 6F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[102].setRotationPoint(11.5F, 6F, -9F);

		bodyModel[103].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 267
		bodyModel[103].setRotationPoint(11.4F, 6F, -8F);
		bodyModel[103].rotateAngleY = 0.78539816F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 268
		bodyModel[104].setRotationPoint(14F, 3F, -9.5F);
		bodyModel[104].rotateAngleX = -0.78539816F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 269
		bodyModel[105].setRotationPoint(-11F, 3F, -9.5F);
		bodyModel[105].rotateAngleX = -0.78539816F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 27
		bodyModel[106].setRotationPoint(-2.5F, 5F, -7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[107].setRotationPoint(-5.5F, 6F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 91
		bodyModel[108].setRotationPoint(-5F, 8F, -7.25F);
		bodyModel[108].rotateAngleZ = 0.26179939F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[109].setRotationPoint(5.5F, 6F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 117
		bodyModel[110].setRotationPoint(8.5F, 6F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 118
		bodyModel[111].setRotationPoint(6F, 8F, -7.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 219
		bodyModel[112].setRotationPoint(-2.5F, 5F, 6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 220
		bodyModel[113].setRotationPoint(-5F, 8F, 6.25F);
		bodyModel[113].rotateAngleZ = 0.26179939F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 221
		bodyModel[114].setRotationPoint(-5.5F, 6F, 6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 222
		bodyModel[115].setRotationPoint(5.5F, 6F, 6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 223
		bodyModel[116].setRotationPoint(6F, 8F, 6.25F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 224
		bodyModel[117].setRotationPoint(8.5F, 6F, 6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 282
		bodyModel[118].setRotationPoint(-4.5F, 4F, 9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F); // Box 283
		bodyModel[119].setRotationPoint(-4.5F, 4F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 125
		bodyModel[120].setRotationPoint(13F, 3F, 9F);

		bodyModel[121].addShapeBox(0F, 0F, -0.75F, 1, 4, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 126
		bodyModel[121].setRotationPoint(-9F, 3.25F, 10.5F);
		bodyModel[121].rotateAngleX = -0.38397244F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 127
		bodyModel[122].setRotationPoint(-9F, 3F, 9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 shock absorber mount
		bodyModel[123].setRotationPoint(-9.5F, 6F, 8.25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 129
		bodyModel[124].setRotationPoint(-5F, 4F, -7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[125].setRotationPoint(-5F, 4F, 2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 131
		bodyModel[126].setRotationPoint(7F, 4F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[127].setRotationPoint(7F, 4F, 2F);

		bodyModel[128].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 133
		bodyModel[128].setRotationPoint(8F, 4F, -2F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 3, 10, 0F); // Box 134
		bodyModel[129].setRotationPoint(12F, 5.5F, -5F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 4, 10, 0F); // Box 135
		bodyModel[130].setRotationPoint(15F, 5F, -5F);

		bodyModel[131].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Box 136
		bodyModel[131].setRotationPoint(4F, 5F, -5F);

		bodyModel[132].addBox(0F, 0F, 0F, 3, 3, 10, 0F); // Box 137
		bodyModel[132].setRotationPoint(1F, 5.5F, -5F);

		bodyModel[133].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Box 138
		bodyModel[133].setRotationPoint(-7F, 5F, -5F);

		bodyModel[134].addBox(0F, 0F, 0F, 3, 3, 10, 0F); // Box 139
		bodyModel[134].setRotationPoint(-10F, 5.5F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[135].setRotationPoint(1.5F, 1.75F, 6.75F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[136].setRotationPoint(1.5F, 1.75F, -8.75F);

		bodyModel[137].addShapeBox(-1F, 0F, 0F, 2, 6, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F); // Box 142
		bodyModel[137].setRotationPoint(8.25F, 2F, -6F);
		bodyModel[137].rotateAngleY = -0.19198622F;

		bodyModel[138].addShapeBox(-1F, 0F, -3F, 2, 6, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F); // Box 143
		bodyModel[138].setRotationPoint(8.25F, 2F, 6F);
		bodyModel[138].rotateAngleY = 0.19198622F;

		bodyModel[139].addShapeBox(-1F, 0F, 0F, 2, 6, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F); // Box 144
		bodyModel[139].setRotationPoint(-4F, 2.25F, -6F);
		bodyModel[139].rotateAngleY = -1.57079633F;

		bodyModel[140].addShapeBox(-1F, 0F, 0F, 2, 6, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F); // Box 145
		bodyModel[140].setRotationPoint(-4F, 2.25F, 6F);
		bodyModel[140].rotateAngleY = -1.57079633F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[141].setRotationPoint(-9.5F, 4F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0.25F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 159
		bodyModel[142].setRotationPoint(-5.5F, 4F, -10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F); // Box 154
		bodyModel[143].setRotationPoint(-5.5F, 4F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[144].setRotationPoint(-9.5F, 4F, 9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[145].setRotationPoint(11.5F, 4F, 9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, 0F); // Box 157
		bodyModel[146].setRotationPoint(10.5F, 4F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 158
		bodyModel[147].setRotationPoint(10.5F, 4F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 159
		bodyModel[148].setRotationPoint(11.5F, 4F, -10F);
	}
}