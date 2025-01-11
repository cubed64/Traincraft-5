//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Buckeye 3 Axle Late
// Model Creator: Prof_Binky
// Created on: 01.08.2021 - 22:09:46
// Last changed on: 01.08.2021 - 22:09:46

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located


import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBuckeye3AxleLate extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelBuckeye3AxleLate() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[138];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[3] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 104 cap
		bodyModel[4] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 31 cap
		bodyModel[5] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 36 cap
		bodyModel[6] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 39 cap
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45 wheel
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 wheel
		bodyModel[10] = new ModelRendererTurbo(this, 37, 7, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 82, 3, textureX, textureY); // Box 141
		bodyModel[12] = new ModelRendererTurbo(this, 82, 3, textureX, textureY); // Box 142
		bodyModel[13] = new ModelRendererTurbo(this, 24, 11, textureX, textureY); // Box 89
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 31 cap
		bodyModel[16] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 39 cap
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44 wheel
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45 wheel
		bodyModel[19] = new ModelRendererTurbo(this, 91, 56, textureX, textureY); // Box 125
		bodyModel[20] = new ModelRendererTurbo(this, 80, 52, textureX, textureY); // Box 126
		bodyModel[21] = new ModelRendererTurbo(this, 93, 61, textureX, textureY); // Box 133
		bodyModel[22] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 136
		bodyModel[23] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 137
		bodyModel[24] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 138
		bodyModel[25] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 140
		bodyModel[26] = new ModelRendererTurbo(this, 92, 47, textureX, textureY); // Box 88
		bodyModel[27] = new ModelRendererTurbo(this, 88, 54, textureX, textureY); // Box 125
		bodyModel[28] = new ModelRendererTurbo(this, 102, 52, textureX, textureY); // Box 125
		bodyModel[29] = new ModelRendererTurbo(this, 112, 52, textureX, textureY); // Box 171
		bodyModel[30] = new ModelRendererTurbo(this, 109, 57, textureX, textureY); // Box 171
		bodyModel[31] = new ModelRendererTurbo(this, 102, 56, textureX, textureY); // Box 171
		bodyModel[32] = new ModelRendererTurbo(this, 107, 52, textureX, textureY); // Box 171
		bodyModel[33] = new ModelRendererTurbo(this, 102, 49, textureX, textureY); // Box 171
		bodyModel[34] = new ModelRendererTurbo(this, 85, 46, textureX, textureY); // Box 171
		bodyModel[35] = new ModelRendererTurbo(this, 58, 56, textureX, textureY); // Box 125
		bodyModel[36] = new ModelRendererTurbo(this, 71, 52, textureX, textureY); // Box 126
		bodyModel[37] = new ModelRendererTurbo(this, 59, 60, textureX, textureY); // Box 133
		bodyModel[38] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 136
		bodyModel[39] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 137
		bodyModel[40] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 138
		bodyModel[41] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 140
		bodyModel[42] = new ModelRendererTurbo(this, 59, 47, textureX, textureY); // Box 88
		bodyModel[43] = new ModelRendererTurbo(this, 67, 54, textureX, textureY); // Box 125
		bodyModel[44] = new ModelRendererTurbo(this, 53, 52, textureX, textureY); // Box 125
		bodyModel[45] = new ModelRendererTurbo(this, 39, 52, textureX, textureY); // Box 171
		bodyModel[46] = new ModelRendererTurbo(this, 46, 57, textureX, textureY); // Box 171
		bodyModel[47] = new ModelRendererTurbo(this, 51, 56, textureX, textureY); // Box 171
		bodyModel[48] = new ModelRendererTurbo(this, 48, 52, textureX, textureY); // Box 171
		bodyModel[49] = new ModelRendererTurbo(this, 51, 49, textureX, textureY); // Box 171
		bodyModel[50] = new ModelRendererTurbo(this, 66, 46, textureX, textureY); // Box 171
		bodyModel[51] = new ModelRendererTurbo(this, 80, 49, textureX, textureY); // Box 171
		bodyModel[52] = new ModelRendererTurbo(this, 69, 49, textureX, textureY); // Box 171
		bodyModel[53] = new ModelRendererTurbo(this, 93, 44, textureX, textureY); // Box 171
		bodyModel[54] = new ModelRendererTurbo(this, 60, 44, textureX, textureY); // Box 171
		bodyModel[55] = new ModelRendererTurbo(this, 80, 55, textureX, textureY); // Box 171
		bodyModel[56] = new ModelRendererTurbo(this, 73, 55, textureX, textureY); // Box 171
		bodyModel[57] = new ModelRendererTurbo(this, 80, 46, textureX, textureY); // Box 171
		bodyModel[58] = new ModelRendererTurbo(this, 75, 46, textureX, textureY); // Box 171
		bodyModel[59] = new ModelRendererTurbo(this, 58, 51, textureX, textureY, "cull"); // Fucky spring cover cull
		bodyModel[60] = new ModelRendererTurbo(this, 58, 11, textureX, textureY); // Box 89
		bodyModel[61] = new ModelRendererTurbo(this, 8, 21, textureX, textureY, "cull"); // Friction cover cull
		bodyModel[62] = new ModelRendererTurbo(this, 8, 21, textureX, textureY, "cull"); // Friction cover cull
		bodyModel[63] = new ModelRendererTurbo(this, 8, 21, textureX, textureY, "cull"); // Friction cover cull
		bodyModel[64] = new ModelRendererTurbo(this, 85, 24, textureX, textureY); // Box 171
		bodyModel[65] = new ModelRendererTurbo(this, 66, 24, textureX, textureY); // Box 171
		bodyModel[66] = new ModelRendererTurbo(this, 80, 27, textureX, textureY); // Box 171
		bodyModel[67] = new ModelRendererTurbo(this, 69, 27, textureX, textureY); // Box 171
		bodyModel[68] = new ModelRendererTurbo(this, 80, 33, textureX, textureY); // Box 171
		bodyModel[69] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 171
		bodyModel[70] = new ModelRendererTurbo(this, 80, 24, textureX, textureY); // Box 171
		bodyModel[71] = new ModelRendererTurbo(this, 75, 24, textureX, textureY); // Box 171
		bodyModel[72] = new ModelRendererTurbo(this, 91, 34, textureX, textureY); // Box 125
		bodyModel[73] = new ModelRendererTurbo(this, 80, 30, textureX, textureY); // Box 126
		bodyModel[74] = new ModelRendererTurbo(this, 93, 39, textureX, textureY); // Box 133
		bodyModel[75] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 136
		bodyModel[76] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 137
		bodyModel[77] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 138
		bodyModel[78] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 140
		bodyModel[79] = new ModelRendererTurbo(this, 92, 25, textureX, textureY); // Box 88
		bodyModel[80] = new ModelRendererTurbo(this, 88, 32, textureX, textureY); // Box 125
		bodyModel[81] = new ModelRendererTurbo(this, 102, 29, textureX, textureY); // Box 125
		bodyModel[82] = new ModelRendererTurbo(this, 112, 29, textureX, textureY); // Box 171
		bodyModel[83] = new ModelRendererTurbo(this, 109, 34, textureX, textureY); // Box 171
		bodyModel[84] = new ModelRendererTurbo(this, 102, 33, textureX, textureY); // Box 171
		bodyModel[85] = new ModelRendererTurbo(this, 107, 29, textureX, textureY); // Box 171
		bodyModel[86] = new ModelRendererTurbo(this, 102, 26, textureX, textureY); // Box 171
		bodyModel[87] = new ModelRendererTurbo(this, 93, 22, textureX, textureY); // Box 171
		bodyModel[88] = new ModelRendererTurbo(this, 71, 30, textureX, textureY); // Box 126
		bodyModel[89] = new ModelRendererTurbo(this, 67, 32, textureX, textureY); // Box 125
		bodyModel[90] = new ModelRendererTurbo(this, 59, 38, textureX, textureY); // Box 133
		bodyModel[91] = new ModelRendererTurbo(this, 59, 25, textureX, textureY); // Box 88
		bodyModel[92] = new ModelRendererTurbo(this, 53, 30, textureX, textureY); // Box 125
		bodyModel[93] = new ModelRendererTurbo(this, 39, 30, textureX, textureY); // Box 171
		bodyModel[94] = new ModelRendererTurbo(this, 46, 35, textureX, textureY); // Box 171
		bodyModel[95] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 171
		bodyModel[96] = new ModelRendererTurbo(this, 48, 30, textureX, textureY); // Box 171
		bodyModel[97] = new ModelRendererTurbo(this, 51, 27, textureX, textureY); // Box 171
		bodyModel[98] = new ModelRendererTurbo(this, 60, 22, textureX, textureY); // Box 171
		bodyModel[99] = new ModelRendererTurbo(this, 58, 29, textureX, textureY, "cull"); // Fucky spring cover cull
		bodyModel[100] = new ModelRendererTurbo(this, 58, 34, textureX, textureY); // Box 125
		bodyModel[101] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 136
		bodyModel[102] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 137
		bodyModel[103] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 138
		bodyModel[104] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 140
		bodyModel[105] = new ModelRendererTurbo(this, 37, 7, textureX, textureY); // Box 23
		bodyModel[106] = new ModelRendererTurbo(this, 24, 11, textureX, textureY); // Box 89
		bodyModel[107] = new ModelRendererTurbo(this, 58, 11, textureX, textureY); // Box 89
		bodyModel[108] = new ModelRendererTurbo(this, 8, 21, textureX, textureY, "cull"); // Friction cover cull
		bodyModel[109] = new ModelRendererTurbo(this, 8, 21, textureX, textureY, "cull"); // Friction cover cull
		bodyModel[110] = new ModelRendererTurbo(this, 8, 21, textureX, textureY, "cull"); // Friction cover cull
		bodyModel[111] = new ModelRendererTurbo(this, 90, 8, textureX, textureY); // Box 28
		bodyModel[112] = new ModelRendererTurbo(this, 73, 5, textureX, textureY); // Box 260
		bodyModel[113] = new ModelRendererTurbo(this, 64, 8, textureX, textureY); // Box 260
		bodyModel[114] = new ModelRendererTurbo(this, 90, 13, textureX, textureY); // Box 260
		bodyModel[115] = new ModelRendererTurbo(this, 108, 13, textureX, textureY); // Box 260
		bodyModel[116] = new ModelRendererTurbo(this, 73, 5, textureX, textureY); // Box 260
		bodyModel[117] = new ModelRendererTurbo(this, 64, 8, textureX, textureY); // Box 260
		bodyModel[118] = new ModelRendererTurbo(this, 90, 13, textureX, textureY); // Box 260
		bodyModel[119] = new ModelRendererTurbo(this, 108, 13, textureX, textureY); // Box 260
		bodyModel[120] = new ModelRendererTurbo(this, 64, 5, textureX, textureY); // Box 260
		bodyModel[121] = new ModelRendererTurbo(this, 64, 5, textureX, textureY); // Box 260
		bodyModel[122] = new ModelRendererTurbo(this, 34, 27, textureX, textureY); // Box 89
		bodyModel[123] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 91
		bodyModel[124] = new ModelRendererTurbo(this, 39, 27, textureX, textureY); // Box 171
		bodyModel[125] = new ModelRendererTurbo(this, 33, 30, textureX, textureY); // Box 89
		bodyModel[126] = new ModelRendererTurbo(this, 34, 49, textureX, textureY); // Box 89
		bodyModel[127] = new ModelRendererTurbo(this, 33, 55, textureX, textureY); // Box 91
		bodyModel[128] = new ModelRendererTurbo(this, 39, 49, textureX, textureY); // Box 171
		bodyModel[129] = new ModelRendererTurbo(this, 33, 52, textureX, textureY); // Box 89
		bodyModel[130] = new ModelRendererTurbo(this, 121, 26, textureX, textureY); // Box 89
		bodyModel[131] = new ModelRendererTurbo(this, 122, 32, textureX, textureY); // Box 91
		bodyModel[132] = new ModelRendererTurbo(this, 110, 26, textureX, textureY); // Box 171
		bodyModel[133] = new ModelRendererTurbo(this, 122, 29, textureX, textureY); // Box 89
		bodyModel[134] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 89
		bodyModel[135] = new ModelRendererTurbo(this, 122, 55, textureX, textureY); // Box 91
		bodyModel[136] = new ModelRendererTurbo(this, 110, 49, textureX, textureY); // Box 171
		bodyModel[137] = new ModelRendererTurbo(this, 122, 52, textureX, textureY); // Box 89

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 14
		bodyModel[0].setRotationPoint(-11F, 6F, -8.5F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 16 wheel
		bodyModel[1].setRotationPoint(-10F, 7F, -5.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 22
		bodyModel[2].setRotationPoint(-1F, 6F, -8.5F);

		bodyModel[3].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104 cap
		bodyModel[3].setRotationPoint(-10F, 7F, -9F);

		bodyModel[4].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 31 cap
		bodyModel[4].setRotationPoint(0F, 7F, -9F);

		bodyModel[5].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 36 cap
		bodyModel[5].setRotationPoint(-10F, 7F, 8F);

		bodyModel[6].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 39 cap
		bodyModel[6].setRotationPoint(0F, 7F, 8F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 44 wheel
		bodyModel[7].setRotationPoint(0F, 7F, -5.5F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 45 wheel
		bodyModel[8].setRotationPoint(0F, 7F, 5.5F);

		bodyModel[9].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[9].setRotationPoint(-10F, 7F, 5.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 23
		bodyModel[10].setRotationPoint(-6.5F, 6F, -3.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 141
		bodyModel[11].setRotationPoint(-1.5F, 4F, -4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[12].setRotationPoint(-1.5F, 4F, 2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0.5F, -0.5F, -0.375F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -1.5F, -0.5F, -0.375F, -1.5F, -0.5F); // Box 89
		bodyModel[13].setRotationPoint(-6.5F, 6F, 3.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 22
		bodyModel[14].setRotationPoint(9F, 6F, -8.5F);

		bodyModel[15].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 31 cap
		bodyModel[15].setRotationPoint(10F, 7F, -9F);

		bodyModel[16].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 39 cap
		bodyModel[16].setRotationPoint(10F, 7F, 8F);

		bodyModel[17].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 44 wheel
		bodyModel[17].setRotationPoint(10F, 7F, -5.5F);

		bodyModel[18].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 45 wheel
		bodyModel[18].setRotationPoint(10F, 7F, 5.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 125
		bodyModel[19].setRotationPoint(-6F, 8F, 5.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 3F, 0F); // Box 126
		bodyModel[20].setRotationPoint(-3F, 5F, 7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.6F, 0F, 0F, -0.15F, 0F, 0F, -0.4F, 0F, 0F, -1.15F, 0F, 0F, 0.6F, 0F, 0F, -0.15F, 0F, -0.25F, -0.4F, 0F, -0.25F, -1.15F); // Box 133
		bodyModel[21].setRotationPoint(-6F, 8F, 8.35F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 136
		bodyModel[22].setRotationPoint(-5F, 5F, 6.00000000000001F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 137
		bodyModel[23].setRotationPoint(-6F, 5F, 5.50000000000001F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 138
		bodyModel[24].setRotationPoint(-6F, 5F, 6.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 140
		bodyModel[25].setRotationPoint(-5F, 5F, 7.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.75F, 0.125F, 0F, 0.75F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.75F, 0.125F, 0F, 0.75F); // Box 88
		bodyModel[26].setRotationPoint(-6F, 5.5F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[27].setRotationPoint(-4F, 6F, 7.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 125
		bodyModel[28].setRotationPoint(-7F, 5F, 6.75F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 171
		bodyModel[29].setRotationPoint(-11F, 5F, 6.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 171
		bodyModel[30].setRotationPoint(-8F, 8F, 6.75F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 171
		bodyModel[31].setRotationPoint(-8F, 7F, 6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[32].setRotationPoint(-8F, 5F, 6.75F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 171
		bodyModel[33].setRotationPoint(-8F, 4F, 6.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 171
		bodyModel[34].setRotationPoint(0F, 4F, 7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 125
		bodyModel[35].setRotationPoint(4F, 8F, 5.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-2F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.75F, -0.5F, 0F); // Box 126
		bodyModel[36].setRotationPoint(0F, 5F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.6F, 0F, 0F, -0.15F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, -0.15F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 133
		bodyModel[37].setRotationPoint(4F, 8F, 7.6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 136
		bodyModel[38].setRotationPoint(4F, 5F, 5.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 137
		bodyModel[39].setRotationPoint(5F, 5F, 5.50000000000001F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 138
		bodyModel[40].setRotationPoint(5F, 5F, 6.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.01F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.01F, -1.25F, 0F, -0.01F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -0.01F, -4.25F, 0F); // Box 140
		bodyModel[41].setRotationPoint(4F, 5F, 6.99999999999999F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.4F, 0.125F, 0F, 0.4F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.4F, 0.125F, 0F, 0.4F); // Box 88
		bodyModel[42].setRotationPoint(4F, 5.5F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[43].setRotationPoint(3F, 6F, 6F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 125
		bodyModel[44].setRotationPoint(6F, 5F, 6.75F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 171
		bodyModel[45].setRotationPoint(8F, 5F, 6.75F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[46].setRotationPoint(7F, 8F, 6.75F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 171
		bodyModel[47].setRotationPoint(6F, 7F, 6.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[48].setRotationPoint(7F, 5F, 6.75F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 171
		bodyModel[49].setRotationPoint(6F, 4F, 6.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 171
		bodyModel[50].setRotationPoint(-3F, 4F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 171
		bodyModel[51].setRotationPoint(-4F, 4F, 7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 171
		bodyModel[52].setRotationPoint(0F, 4F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F); // Box 171
		bodyModel[53].setRotationPoint(-6F, 4F, 6.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 171
		bodyModel[54].setRotationPoint(4F, 4F, 6.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F); // Box 171
		bodyModel[55].setRotationPoint(-3F, 6F, 6.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F); // Box 171
		bodyModel[56].setRotationPoint(1F, 6F, 7F);

		bodyModel[57].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,0.05F, 0F, 0.075F, 0.05F, 0F, 0.075F, 0.05F, 0F, 0.075F, 0.05F, 0F, 0.075F, 0.05F, 0.5F, 0.075F, 0.05F, 0.5F, 0.075F, 0.05F, 0.5F, 0.075F, 0.05F, 0.5F, 0.075F); // Box 171
		bodyModel[57].setRotationPoint(3F, 5F, 7.5F);

		bodyModel[58].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,0.05F, 0F, 0.075F, 0.05F, 0F, 0.075F, 0.05F, 0F, 0.075F, 0.05F, 0F, 0.075F, 0.05F, 0.5F, 0.075F, 0.05F, 0.5F, 0.075F, 0.05F, 0.5F, 0.075F, 0.05F, 0.5F, 0.075F); // Box 171
		bodyModel[58].setRotationPoint(-2F, 5F, 6F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Fucky spring cover cull
		bodyModel[59].setRotationPoint(4F, 6F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.375F, 0.5F, -0.5F, -0.375F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -1.5F, -0.5F, -0.375F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[60].setRotationPoint(-6.5F, 6F, -6.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Friction cover cull
		bodyModel[61].setRotationPoint(-11F, 6F, 8.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Friction cover cull
		bodyModel[62].setRotationPoint(-1F, 6F, 8.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Friction cover cull
		bodyModel[63].setRotationPoint(9F, 6F, 8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 171
		bodyModel[64].setRotationPoint(0F, 4F, -8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 171
		bodyModel[65].setRotationPoint(-3F, 4F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 171
		bodyModel[66].setRotationPoint(-4F, 4F, -8.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 171
		bodyModel[67].setRotationPoint(0F, 4F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F); // Box 171
		bodyModel[68].setRotationPoint(-3F, 6F, -7.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F); // Box 171
		bodyModel[69].setRotationPoint(1F, 6F, -8F);

		bodyModel[70].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,0.05F, 0F, 0.075F, 0.05F, 0F, 0.075F, 0.05F, 0F, 0.075F, 0.05F, 0F, 0.075F, 0.05F, 0.5F, 0.075F, 0.05F, 0.5F, 0.075F, 0.05F, 0.5F, 0.075F, 0.05F, 0.5F, 0.075F); // Box 171
		bodyModel[70].setRotationPoint(3F, 5F, -8.5F);

		bodyModel[71].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,0.05F, 0F, 0.075F, 0.05F, 0F, 0.075F, 0.05F, 0F, 0.075F, 0.05F, 0F, 0.075F, 0.05F, 0.5F, 0.075F, 0.05F, 0.5F, 0.075F, 0.05F, 0.5F, 0.075F, 0.05F, 0.5F, 0.075F); // Box 171
		bodyModel[71].setRotationPoint(-2F, 5F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 125
		bodyModel[72].setRotationPoint(-6F, 8F, -8.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 3F, 0F); // Box 126
		bodyModel[73].setRotationPoint(-3F, 5F, -8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1.15F, 0F, 0F, -0.4F, 0F, 0F, -0.15F, 0F, 0F, 0.6F, 0F, -0.25F, -1.15F, 0F, -0.25F, -0.4F, 0F, 0F, -0.15F, 0F, 0F, 0.6F); // Box 133
		bodyModel[74].setRotationPoint(-6F, 8F, -9.35F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 136
		bodyModel[75].setRotationPoint(-6F, 5F, -7.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 137
		bodyModel[76].setRotationPoint(-5F, 5F, -8.24999999999999F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 138
		bodyModel[77].setRotationPoint(-5F, 5F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 140
		bodyModel[78].setRotationPoint(-6F, 5F, -6.50000000000001F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.125F, 0F, 0.75F, 0.125F, 0F, 0.75F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.75F, 0.125F, 0F, 0.75F, 0.125F, 0F, 0F, 0.125F, 0F, 0F); // Box 88
		bodyModel[79].setRotationPoint(-6F, 5.5F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[80].setRotationPoint(-4F, 6F, -8.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 125
		bodyModel[81].setRotationPoint(-7F, 5F, -7.75F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 171
		bodyModel[82].setRotationPoint(-11F, 5F, -7.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 171
		bodyModel[83].setRotationPoint(-8F, 8F, -7.75F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 171
		bodyModel[84].setRotationPoint(-8F, 7F, -7.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[85].setRotationPoint(-8F, 5F, -7.75F);

		bodyModel[86].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 171
		bodyModel[86].setRotationPoint(-8F, 4F, -7.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F); // Box 171
		bodyModel[87].setRotationPoint(-6F, 4F, -8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-2F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.75F, -0.5F, 0F); // Box 126
		bodyModel[88].setRotationPoint(0F, 5F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[89].setRotationPoint(3F, 6F, -7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.15F, 0F, 0F, 0.6F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, 0F, -0.15F, 0F, 0F, 0.6F); // Box 133
		bodyModel[90].setRotationPoint(4F, 8F, -8.6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.125F, 0F, 0.75F, 0.125F, 0F, 0.75F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.75F, 0.125F, 0F, 0.75F, 0.125F, 0F, 0F, 0.125F, 0F, 0F); // Box 88
		bodyModel[91].setRotationPoint(4F, 5.5F, -8F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 125
		bodyModel[92].setRotationPoint(6F, 5F, -7.75F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 171
		bodyModel[93].setRotationPoint(8F, 5F, -7.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[94].setRotationPoint(7F, 8F, -7.75F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 171
		bodyModel[95].setRotationPoint(6F, 7F, -7.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[96].setRotationPoint(7F, 5F, -7.75F);

		bodyModel[97].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 171
		bodyModel[97].setRotationPoint(6F, 4F, -7.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F); // Box 171
		bodyModel[98].setRotationPoint(4F, 4F, -7.75F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Fucky spring cover cull
		bodyModel[99].setRotationPoint(4F, 6F, -8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 125
		bodyModel[100].setRotationPoint(4F, 8F, -7.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 136
		bodyModel[101].setRotationPoint(5F, 5F, -7.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.01F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.01F, -1F, 0F, -0.01F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0.01F, -4.5F, 0F); // Box 137
		bodyModel[102].setRotationPoint(4F, 5F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 138
		bodyModel[103].setRotationPoint(4F, 5F, -6.75000000000001F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 140
		bodyModel[104].setRotationPoint(5F, 5F, -6.50000000000001F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 23
		bodyModel[105].setRotationPoint(3.5F, 6F, -3.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0.5F, -0.5F, -0.375F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -1.5F, -0.5F, -0.375F, -1.5F, -0.5F); // Box 89
		bodyModel[106].setRotationPoint(3.5F, 6F, 3.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.375F, 0.5F, -0.5F, -0.375F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -1.5F, -0.5F, -0.375F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[107].setRotationPoint(3.5F, 6F, -6.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Friction cover cull
		bodyModel[108].setRotationPoint(-11F, 6F, -9.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Friction cover cull
		bodyModel[109].setRotationPoint(-1F, 6F, -9.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Friction cover cull
		bodyModel[110].setRotationPoint(9F, 6F, -9.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[111].setRotationPoint(-5.5F, 5F, -1.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 260
		bodyModel[112].setRotationPoint(-1.5F, 4F, 4F);

		bodyModel[113].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 260
		bodyModel[113].setRotationPoint(-6.5F, 5F, 4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 260
		bodyModel[114].setRotationPoint(-5.5F, 5F, 1.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 260
		bodyModel[115].setRotationPoint(2.5F, 5F, 1.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 260
		bodyModel[116].setRotationPoint(-1.5F, 4F, -5F);

		bodyModel[117].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 260
		bodyModel[117].setRotationPoint(-6.5F, 5F, -5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[118].setRotationPoint(-5.5F, 5F, -3.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[119].setRotationPoint(2.5F, 5F, -3.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[120].setRotationPoint(-1.5F, 3.5F, -5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[121].setRotationPoint(-1.5F, 3.5F, 4F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 89
		bodyModel[122].setRotationPoint(11.75F, 4.5F, -7.75F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 91
		bodyModel[123].setRotationPoint(11F, 5.5F, -7.75F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[124].setRotationPoint(8F, 4F, -7.75F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[125].setRotationPoint(11F, 4.5F, -7.75F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 89
		bodyModel[126].setRotationPoint(11.75F, 4.5F, 6.75F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 91
		bodyModel[127].setRotationPoint(11F, 5.5F, 6.75F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[128].setRotationPoint(8F, 4F, 6.75F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[129].setRotationPoint(11F, 4.5F, 6.75F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[130].setRotationPoint(-12.75F, 4.5F, -7.75F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F); // Box 91
		bodyModel[131].setRotationPoint(-12F, 5.5F, -7.75F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[132].setRotationPoint(-12F, 4F, -7.75F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[133].setRotationPoint(-12F, 4.5F, -7.75F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[134].setRotationPoint(-12.75F, 4.5F, 6.75F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F); // Box 91
		bodyModel[135].setRotationPoint(-12F, 5.5F, 6.75F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[136].setRotationPoint(-12F, 4F, 6.75F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[137].setRotationPoint(-12F, 4.5F, 6.75F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("cull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			}else{
				m.render(f5);
			}
		}
	}
}