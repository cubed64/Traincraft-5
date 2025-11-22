//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NS 3700 Temder
// Model Creator: Bidahochi
// Created on: 14.03.2023 - 22:05:54
// Last changed on: 14.03.2023 - 22:05:54

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelNS3700Tender extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelNS3700Tender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[69];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 20
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 21
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 23
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 24
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 26
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 173
		bodyModel[9] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 174
		bodyModel[10] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 175
		bodyModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 176
		bodyModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 177
		bodyModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 178
		bodyModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 179
		bodyModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 180
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 181
		bodyModel[17] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 182
		bodyModel[18] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 183
		bodyModel[19] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 184
		bodyModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 185
		bodyModel[21] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 186
		bodyModel[22] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 187
		bodyModel[23] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 188
		bodyModel[24] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 189
		bodyModel[25] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 190
		bodyModel[26] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 191
		bodyModel[27] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 192
		bodyModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 193
		bodyModel[29] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 194
		bodyModel[30] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 195
		bodyModel[31] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 196 lamp
		bodyModel[32] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 197
		bodyModel[33] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 198
		bodyModel[34] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 199
		bodyModel[35] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 200
		bodyModel[36] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 201
		bodyModel[37] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 202
		bodyModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 210
		bodyModel[39] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 211
		bodyModel[40] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 212
		bodyModel[41] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 213
		bodyModel[42] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 215
		bodyModel[43] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 172
		bodyModel[44] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 173
		bodyModel[45] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 174
		bodyModel[46] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 175
		bodyModel[47] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 225
		bodyModel[48] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 226
		bodyModel[49] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 227
		bodyModel[50] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 228
		bodyModel[51] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 229
		bodyModel[52] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 230
		bodyModel[53] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 231
		bodyModel[54] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 232
		bodyModel[55] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 235
		bodyModel[56] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 236
		bodyModel[57] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 237
		bodyModel[58] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 238
		bodyModel[59] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 243
		bodyModel[60] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 245
		bodyModel[61] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 247
		bodyModel[62] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 249
		bodyModel[63] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 250
		bodyModel[64] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 22
		bodyModel[65] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 25
		bodyModel[66] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 244
		bodyModel[67] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 246
		bodyModel[68] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 248

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 4
		bodyModel[0].setRotationPoint(17F, 3.5F, -1F);

		bodyModel[1].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 20
		bodyModel[1].setRotationPoint(11F, 6.5F, -6F);

		bodyModel[2].addBox(-1F, -1F, 0F, 2, 2, 16, 0F); // Box 21
		bodyModel[2].setRotationPoint(11F, 6.5F, -8F);

		bodyModel[3].addBox(-1F, -1F, 0F, 2, 2, 16, 0F); // Box 23
		bodyModel[3].setRotationPoint(0F, 6.5F, -8F);

		bodyModel[4].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 24
		bodyModel[4].setRotationPoint(0F, 6.5F, -6F);

		bodyModel[5].addBox(-1F, -1F, 0F, 2, 2, 16, 0F); // Box 26
		bodyModel[5].setRotationPoint(-11F, 6.5F, -8F);

		bodyModel[6].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 27
		bodyModel[6].setRotationPoint(-11F, 6.5F, -6F);

		bodyModel[7].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 28
		bodyModel[7].setRotationPoint(-11F, 6.5F, 6F);

		bodyModel[8].addBox(0F, 0F, 0F, 34, 1, 20, 0F); // Box 173
		bodyModel[8].setRotationPoint(-18F, 3F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 31, 10, 18, 0F); // Box 174
		bodyModel[9].setRotationPoint(-15F, -7F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 20, 6, 14, 0F); // Box 175
		bodyModel[10].setRotationPoint(-10F, -13F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[11].setRotationPoint(-12F, -13F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[12].setRotationPoint(-14F, -9F, -7.01F);

		bodyModel[13].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 178
		bodyModel[13].setRotationPoint(-15F, -9F, -7F);

		bodyModel[14].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 179
		bodyModel[14].setRotationPoint(-15F, -9F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[15].setRotationPoint(-14F, -9F, 7.01F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[16].setRotationPoint(-12F, -13F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 6, 2, 0, 0F); // Box 182
		bodyModel[17].setRotationPoint(10F, -9F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[18].setRotationPoint(10F, -13F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[19].setRotationPoint(12F, -9F, 7.01F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[20].setRotationPoint(12F, -9F, -7.01F);

		bodyModel[21].addBox(0F, 0F, 0F, 6, 2, 0, 0F); // Box 186
		bodyModel[21].setRotationPoint(10F, -9F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[22].setRotationPoint(10F, -13F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 31, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[23].setRotationPoint(-15F, -8F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 31, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[24].setRotationPoint(-15F, -8F, 7F);

		bodyModel[25].addBox(0F, 0F, 0F, 31, 1, 14, 0F); // Box 190
		bodyModel[25].setRotationPoint(-15F, -8F, -7F);

		bodyModel[26].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[26].setRotationPoint(18.5F, 4.5F, 7F);
		bodyModel[26].rotateAngleX = 0.78539816F;

		bodyModel[27].addBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F); // Box 192
		bodyModel[27].setRotationPoint(16.5F, 4.5F, 7F);
		bodyModel[27].rotateAngleX = 0.78539816F;

		bodyModel[28].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[28].setRotationPoint(18.5F, 4.5F, -7F);
		bodyModel[28].rotateAngleX = 0.78539816F;

		bodyModel[29].addBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F); // Box 194
		bodyModel[29].setRotationPoint(16.5F, 4.5F, -7F);
		bodyModel[29].rotateAngleX = 0.78539816F;

		bodyModel[30].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 195
		bodyModel[30].setRotationPoint(16F, 3F, -10F);

		bodyModel[31].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 196 lamp
		bodyModel[31].setRotationPoint(16.5F, 1.5F, 7F);
		bodyModel[31].rotateAngleX = 0.78539816F;

		bodyModel[32].addShapeBox(0F, -1F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[32].setRotationPoint(16F, 3F, 7F);

		bodyModel[33].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 198
		bodyModel[33].setRotationPoint(16F, 1F, 7F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 9, 1, 0F); // Box 199
		bodyModel[34].setRotationPoint(-14.5F, -6.5F, 8.75F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 9, 1, 0F); // Box 200
		bodyModel[35].setRotationPoint(15.5F, -6.5F, 8.75F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 9, 1, 0F); // Box 201
		bodyModel[36].setRotationPoint(15.5F, -6.5F, -9.75F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 9, 1, 0F); // Box 202
		bodyModel[37].setRotationPoint(-14.5F, -6.5F, -9.75F);

		bodyModel[38].addBox(0F, 0F, 0F, 33, 2, 10, 0F); // Box 210
		bodyModel[38].setRotationPoint(-17F, 4F, -5F);

		bodyModel[39].addBox(0F, 0F, 0F, 33, 2, 1, 0F); // Box 211
		bodyModel[39].setRotationPoint(-17F, 3.5F, -7F);

		bodyModel[40].addBox(0F, 0F, 0F, 33, 2, 1, 0F); // Box 212
		bodyModel[40].setRotationPoint(-17F, 3.5F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[41].setRotationPoint(-18F, 3.5F, -7F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 215
		bodyModel[42].setRotationPoint(-20F, 3.5F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 172
		bodyModel[43].setRotationPoint(-11F, 4F, 6.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 173
		bodyModel[44].setRotationPoint(-15F, 4F, 6.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 174
		bodyModel[45].setRotationPoint(-11F, 4F, -7.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 175
		bodyModel[46].setRotationPoint(-15F, 4F, -7.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 225
		bodyModel[47].setRotationPoint(0F, 4F, -7.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 226
		bodyModel[48].setRotationPoint(-4F, 4F, -7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 227
		bodyModel[49].setRotationPoint(-4F, 4F, 6.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 228
		bodyModel[50].setRotationPoint(0F, 4F, 6.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 229
		bodyModel[51].setRotationPoint(11F, 4F, -7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 230
		bodyModel[52].setRotationPoint(7F, 4F, -7.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 231
		bodyModel[53].setRotationPoint(7F, 4F, 6.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 232
		bodyModel[54].setRotationPoint(11F, 4F, 6.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 235
		bodyModel[55].setRotationPoint(-18F, 8F, 9.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 236
		bodyModel[56].setRotationPoint(-18F, 8F, -10.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 237
		bodyModel[57].setRotationPoint(-18F, 4F, -9.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 238
		bodyModel[58].setRotationPoint(-18F, 4F, 9.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 243
		bodyModel[59].setRotationPoint(14F, 4F, -9.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 245
		bodyModel[60].setRotationPoint(14F, 8F, -10.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 247
		bodyModel[61].setRotationPoint(14F, 5F, -10.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 249
		bodyModel[62].setRotationPoint(-18F, 5F, -10.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 250
		bodyModel[63].setRotationPoint(-18F, 5F, 9.5F);

		bodyModel[64].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 22
		bodyModel[64].setRotationPoint(11F, 6.5F, 6F);

		bodyModel[65].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 25
		bodyModel[65].setRotationPoint(0F, 6.5F, 6F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 244
		bodyModel[66].setRotationPoint(14F, 4F, 9.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 246
		bodyModel[67].setRotationPoint(14F, 8F, 9.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 248
		bodyModel[68].setRotationPoint(14F, 5F, 9.5F);
	}
	//public float[] getTrans() { return new float[]{ 0.0f, 0.18f, 0.0f}; }
}