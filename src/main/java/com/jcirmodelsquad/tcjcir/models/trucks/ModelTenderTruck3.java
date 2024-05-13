//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.05.2024 - 19:56:07
// Last changed on: 07.05.2024 - 19:56:07

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelTenderTruck3 extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelTenderTruck3() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[95];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 30
		bodyModel[2] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 66
		bodyModel[3] = new ModelRendererTurbo(this, 20, 5, textureX, textureY); // Box 96
		bodyModel[4] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 46
		bodyModel[5] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 47
		bodyModel[6] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 48
		bodyModel[7] = new ModelRendererTurbo(this, 66, 12, textureX, textureY); // Box 69
		bodyModel[8] = new ModelRendererTurbo(this, 42, 2, textureX, textureY); // Box 124
		bodyModel[9] = new ModelRendererTurbo(this, 64, 1, textureX, textureY); // Box 3
		bodyModel[10] = new ModelRendererTurbo(this, 4, 21, textureX, textureY); // Box 91
		bodyModel[11] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 95
		bodyModel[12] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 66
		bodyModel[13] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 95
		bodyModel[14] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 118
		bodyModel[15] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 108
		bodyModel[16] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 109
		bodyModel[17] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 111
		bodyModel[18] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 113
		bodyModel[19] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 114
		bodyModel[20] = new ModelRendererTurbo(this, 66, 12, textureX, textureY); // Box 115
		bodyModel[21] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 141
		bodyModel[22] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 142
		bodyModel[23] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 143
		bodyModel[24] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 144
		bodyModel[25] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 145
		bodyModel[26] = new ModelRendererTurbo(this, 4, 21, textureX, textureY); // Box 146
		bodyModel[27] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 147
		bodyModel[28] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 148
		bodyModel[29] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 177
		bodyModel[30] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 185
		bodyModel[31] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 186
		bodyModel[32] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 193
		bodyModel[33] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 194
		bodyModel[34] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 201
		bodyModel[35] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 202
		bodyModel[36] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 203
		bodyModel[37] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 204
		bodyModel[38] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 207
		bodyModel[39] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 208
		bodyModel[40] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 209
		bodyModel[41] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 210
		bodyModel[42] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 211
		bodyModel[43] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 212
		bodyModel[44] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 213
		bodyModel[45] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 214
		bodyModel[46] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 215
		bodyModel[47] = new ModelRendererTurbo(this, 4, 21, textureX, textureY); // Box 216
		bodyModel[48] = new ModelRendererTurbo(this, 66, 12, textureX, textureY); // Box 217
		bodyModel[49] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 218
		bodyModel[50] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 219
		bodyModel[51] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 220
		bodyModel[52] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 221
		bodyModel[53] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 222
		bodyModel[54] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 223
		bodyModel[55] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 224
		bodyModel[56] = new ModelRendererTurbo(this, 64, 5, textureX, textureY); // Box 264
		bodyModel[57] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 265
		bodyModel[58] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 266
		bodyModel[59] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 267
		bodyModel[60] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 268
		bodyModel[61] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 269
		bodyModel[62] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 270
		bodyModel[63] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 271
		bodyModel[64] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 272
		bodyModel[65] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 273
		bodyModel[66] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 274
		bodyModel[67] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 275
		bodyModel[68] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 276
		bodyModel[69] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 277
		bodyModel[70] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 278
		bodyModel[71] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 279
		bodyModel[72] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 280
		bodyModel[73] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 281
		bodyModel[74] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 282
		bodyModel[75] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 283
		bodyModel[76] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 284
		bodyModel[77] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 285
		bodyModel[78] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 286
		bodyModel[79] = new ModelRendererTurbo(this, 4, 21, textureX, textureY); // Box 287
		bodyModel[80] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 288
		bodyModel[81] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 289
		bodyModel[82] = new ModelRendererTurbo(this, 91, 59, textureX, textureY); // Box 290
		bodyModel[83] = new ModelRendererTurbo(this, 33, 43, textureX, textureY); // Box 291
		bodyModel[84] = new ModelRendererTurbo(this, 60, 49, textureX, textureY); // Box 292
		bodyModel[85] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 293
		bodyModel[86] = new ModelRendererTurbo(this, 37, 52, textureX, textureY); // Box 294
		bodyModel[87] = new ModelRendererTurbo(this, 65, 53, textureX, textureY); // Box 295
		bodyModel[88] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 296
		bodyModel[89] = new ModelRendererTurbo(this, 70, 41, textureX, textureY); // Box 297
		bodyModel[90] = new ModelRendererTurbo(this, 49, 51, textureX, textureY); // Box 298
		bodyModel[91] = new ModelRendererTurbo(this, 66, 12, textureX, textureY); // Box 299
		bodyModel[92] = new ModelRendererTurbo(this, 66, 12, textureX, textureY); // Box 300
		bodyModel[93] = new ModelRendererTurbo(this, 66, 12, textureX, textureY); // Box 301
		bodyModel[94] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 302

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 5
		bodyModel[0].setRotationPoint(6.5F, 6F, -7.5F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30
		bodyModel[1].setRotationPoint(7.5F, 7F, 6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
		bodyModel[2].setRotationPoint(-4.5F, 4.5F, -7F);
		bodyModel[2].rotateAngleZ = -0.20071286F;

		bodyModel[3].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 96
		bodyModel[3].setRotationPoint(-3.5F, 5F, -3.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46
		bodyModel[4].setRotationPoint(-7.5F, 7F, 6F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47
		bodyModel[5].setRotationPoint(-7.5F, 7F, -6F);

		bodyModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48
		bodyModel[6].setRotationPoint(7.5F, 7F, -6F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 69
		bodyModel[7].setRotationPoint(-9F, 9.01F, -7.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[8].setRotationPoint(-2F, 4.5F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 3
		bodyModel[9].setRotationPoint(-10F, 4F, -7.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 91
		bodyModel[10].setRotationPoint(-10F, 8F, -6.5F);

		bodyModel[11].addShapeBox(-1F, 3F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 95
		bodyModel[11].setRotationPoint(4.5F, 4.5F, -7F);
		bodyModel[11].rotateAngleZ = 0.20071286F;

		bodyModel[12].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
		bodyModel[12].setRotationPoint(4.5F, 4.5F, -7F);
		bodyModel[12].rotateAngleZ = 0.20071286F;

		bodyModel[13].addShapeBox(0F, 3F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 95
		bodyModel[13].setRotationPoint(-4.5F, 4.5F, -7F);
		bodyModel[13].rotateAngleZ = -0.20071286F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 118
		bodyModel[14].setRotationPoint(-10F, 6F, -7.5F);

		bodyModel[15].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 108
		bodyModel[15].setRotationPoint(0F, 7F, -6F);

		bodyModel[16].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 109
		bodyModel[16].setRotationPoint(0F, 7F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[17].setRotationPoint(1F, 6F, -7.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 113
		bodyModel[18].setRotationPoint(-3F, 6F, -7.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[19].setRotationPoint(-2.5F, 6F, -7.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 115
		bodyModel[20].setRotationPoint(-1.5F, 9.01F, -7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 141
		bodyModel[21].setRotationPoint(-10.5F, 6F, -7.5F);

		bodyModel[22].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[22].setRotationPoint(-3F, 4.5F, -7F);
		bodyModel[22].rotateAngleZ = 0.20071286F;

		bodyModel[23].addShapeBox(-1F, 3F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 143
		bodyModel[23].setRotationPoint(-3F, 4.5F, -7F);
		bodyModel[23].rotateAngleZ = 0.20071286F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 144
		bodyModel[24].setRotationPoint(3F, 4.5F, -7F);
		bodyModel[24].rotateAngleZ = -0.20071286F;

		bodyModel[25].addShapeBox(0F, 3F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 145
		bodyModel[25].setRotationPoint(3F, 4.5F, -7F);
		bodyModel[25].rotateAngleZ = -0.20071286F;

		bodyModel[26].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 146
		bodyModel[26].setRotationPoint(-2.5F, 8F, -6.5F);

		bodyModel[27].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 147
		bodyModel[27].setRotationPoint(-10F, 4.5F, -6.5F);
		bodyModel[27].rotateAngleZ = 0.12217305F;

		bodyModel[28].addShapeBox(-1F, 3F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 148
		bodyModel[28].setRotationPoint(-10F, 4.5F, -6.5F);
		bodyModel[28].rotateAngleZ = 0.12217305F;

		bodyModel[29].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 177
		bodyModel[29].setRotationPoint(-10F, 4.5F, -7F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 185
		bodyModel[30].setRotationPoint(-1F, 6F, -7.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 186
		bodyModel[31].setRotationPoint(-8.5F, 6F, -7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[32].setRotationPoint(-1F, 6F, -8.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[33].setRotationPoint(-8.5F, 6F, -8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[34].setRotationPoint(-1.5F, 5.75F, -8.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[35].setRotationPoint(-0.5F, 4.75F, -8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[36].setRotationPoint(-8F, 4.75F, -8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[37].setRotationPoint(-9F, 5.75F, -8.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 1, 13, 0F); // Box 207
		bodyModel[38].setRotationPoint(-5.5F, 5F, -6.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[39].setRotationPoint(-5.5F, 4F, -6.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[40].setRotationPoint(-5.5F, 4F, 3.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 1, 13, 0F); // Box 210
		bodyModel[41].setRotationPoint(3.5F, 5F, -6.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[42].setRotationPoint(3.5F, 4F, -6.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[43].setRotationPoint(3.5F, 4F, 3.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[44].setRotationPoint(-6.5F, 6F, -7.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 214
		bodyModel[45].setRotationPoint(5F, 6F, -7.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[46].setRotationPoint(8.5F, 6F, -7.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 216
		bodyModel[47].setRotationPoint(5F, 8F, -6.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 217
		bodyModel[48].setRotationPoint(6F, 9.01F, -7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 218
		bodyModel[49].setRotationPoint(4.5F, 6F, -7.5F);

		bodyModel[50].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 219
		bodyModel[50].setRotationPoint(11F, 4.5F, -7F);

		bodyModel[51].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 220
		bodyModel[51].setRotationPoint(11F, 4.5F, -6.5F);
		bodyModel[51].rotateAngleZ = -0.10471976F;

		bodyModel[52].addShapeBox(-1F, 3F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 221
		bodyModel[52].setRotationPoint(11F, 4.5F, -6.5F);
		bodyModel[52].rotateAngleZ = -0.10471976F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[53].setRotationPoint(6F, 5.75F, -8.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[54].setRotationPoint(6.5F, 6F, -8.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[55].setRotationPoint(7F, 4.75F, -8.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 264
		bodyModel[56].setRotationPoint(-10F, 4F, 6.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 265
		bodyModel[57].setRotationPoint(-10F, 6F, 6.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[58].setRotationPoint(1F, 6F, 6.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 267
		bodyModel[59].setRotationPoint(-3F, 6F, 6.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 268
		bodyModel[60].setRotationPoint(-2.5F, 6F, 6.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 269
		bodyModel[61].setRotationPoint(-10.5F, 6F, 6.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[62].setRotationPoint(-6.5F, 6F, 6.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 271
		bodyModel[63].setRotationPoint(5F, 6F, 6.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[64].setRotationPoint(8.5F, 6F, 6.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 273
		bodyModel[65].setRotationPoint(4.5F, 6F, 6.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[66].setRotationPoint(-4.5F, 4.5F, 6F);
		bodyModel[66].rotateAngleZ = -0.20071286F;

		bodyModel[67].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 275
		bodyModel[67].setRotationPoint(-10F, 8F, 6.5F);

		bodyModel[68].addShapeBox(-1F, 3F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 276
		bodyModel[68].setRotationPoint(4.5F, 4.5F, 6F);
		bodyModel[68].rotateAngleZ = 0.20071286F;

		bodyModel[69].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[69].setRotationPoint(4.5F, 4.5F, 6F);
		bodyModel[69].rotateAngleZ = 0.20071286F;

		bodyModel[70].addShapeBox(0F, 3F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 278
		bodyModel[70].setRotationPoint(-4.5F, 4.5F, 6F);
		bodyModel[70].rotateAngleZ = -0.20071286F;

		bodyModel[71].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[71].setRotationPoint(-3F, 4.5F, 6F);
		bodyModel[71].rotateAngleZ = 0.20071286F;

		bodyModel[72].addShapeBox(-1F, 3F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 280
		bodyModel[72].setRotationPoint(-3F, 4.5F, 6F);
		bodyModel[72].rotateAngleZ = 0.20071286F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[73].setRotationPoint(3F, 4.5F, 6F);
		bodyModel[73].rotateAngleZ = -0.20071286F;

		bodyModel[74].addShapeBox(0F, 3F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 282
		bodyModel[74].setRotationPoint(3F, 4.5F, 6F);
		bodyModel[74].rotateAngleZ = -0.20071286F;

		bodyModel[75].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 283
		bodyModel[75].setRotationPoint(-2.5F, 8F, 6.5F);

		bodyModel[76].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[76].setRotationPoint(-10F, 4.5F, 5.5F);
		bodyModel[76].rotateAngleZ = 0.12217305F;

		bodyModel[77].addShapeBox(-1F, 3F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 285
		bodyModel[77].setRotationPoint(-10F, 4.5F, 5.5F);
		bodyModel[77].rotateAngleZ = 0.12217305F;

		bodyModel[78].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[78].setRotationPoint(-10F, 4.5F, 5F);

		bodyModel[79].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 287
		bodyModel[79].setRotationPoint(5F, 8F, 6.5F);

		bodyModel[80].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[80].setRotationPoint(11F, 4.5F, 5.5F);
		bodyModel[80].rotateAngleZ = -0.10471976F;

		bodyModel[81].addShapeBox(-1F, 3F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		bodyModel[81].setRotationPoint(11F, 4.5F, 5.5F);
		bodyModel[81].rotateAngleZ = -0.10471976F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 290
		bodyModel[82].setRotationPoint(-1F, 6F, 7.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 291
		bodyModel[83].setRotationPoint(-8.5F, 6F, 7.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 292
		bodyModel[84].setRotationPoint(-1.5F, 5.75F, 7.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 293
		bodyModel[85].setRotationPoint(-0.5F, 4.75F, 7.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 294
		bodyModel[86].setRotationPoint(-8F, 4.75F, 7.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 295
		bodyModel[87].setRotationPoint(-9F, 5.75F, 7.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 296
		bodyModel[88].setRotationPoint(6F, 5.75F, 7.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 297
		bodyModel[89].setRotationPoint(6.5F, 6F, 7.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 298
		bodyModel[90].setRotationPoint(7F, 4.75F, 7.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 299
		bodyModel[91].setRotationPoint(-9F, 9.01F, 6.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 300
		bodyModel[92].setRotationPoint(-1.5F, 9.01F, 6.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 301
		bodyModel[93].setRotationPoint(6F, 9.01F, 6.5F);

		bodyModel[94].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[94].setRotationPoint(11F, 4.5F, 5F);
	}
}

//this is a truck