//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SDL_lightweight_truck
// Model Creator: Bida
// Created on: 02.07.2020 - 10:53:42
// Last changed on: 02.07.2020 - 10:53:42

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSDL39Truck extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelSDL39Truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[120];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 46, 13, textureX, textureY); // Box 22
		bodyModel[4] = new ModelRendererTurbo(this, 50, 29, textureX, textureY); // Box 68
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4 wheel
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[8] = new ModelRendererTurbo(this, 46, 13, textureX, textureY); // Box 22
		bodyModel[9] = new ModelRendererTurbo(this, 50, 29, textureX, textureY); // Box 68
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11 wheel
		bodyModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12 wheel
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 46, 13, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 50, 29, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 39, 8, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 39, 5, textureX, textureY); // Box 31
		bodyModel[17] = new ModelRendererTurbo(this, 50, 5, textureX, textureY); // Box 32
		bodyModel[18] = new ModelRendererTurbo(this, 57, 5, textureX, textureY); // Box 37
		bodyModel[19] = new ModelRendererTurbo(this, 94, 5, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 101, 5, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 83, 5, textureX, textureY); // Box 33
		bodyModel[22] = new ModelRendererTurbo(this, 87, 40, textureX, textureY); // Box 41
		bodyModel[23] = new ModelRendererTurbo(this, 44, 17, textureX, textureY); // Box 69
		bodyModel[24] = new ModelRendererTurbo(this, 44, 17, textureX, textureY); // Box 52
		bodyModel[25] = new ModelRendererTurbo(this, 44, 17, textureX, textureY); // Box 53
		bodyModel[26] = new ModelRendererTurbo(this, 87, 21, textureX, textureY); // Box 55
		bodyModel[27] = new ModelRendererTurbo(this, 80, 21, textureX, textureY); // Box 56
		bodyModel[28] = new ModelRendererTurbo(this, 68, 21, textureX, textureY); // Box 57
		bodyModel[29] = new ModelRendererTurbo(this, 61, 21, textureX, textureY); // Box 58
		bodyModel[30] = new ModelRendererTurbo(this, 54, 21, textureX, textureY); // Box 59
		bodyModel[31] = new ModelRendererTurbo(this, 43, 21, textureX, textureY); // Box 60
		bodyModel[32] = new ModelRendererTurbo(this, 98, 21, textureX, textureY); // Box 61
		bodyModel[33] = new ModelRendererTurbo(this, 105, 21, textureX, textureY); // Box 62
		bodyModel[34] = new ModelRendererTurbo(this, 87, 40, textureX, textureY); // Box 71
		bodyModel[35] = new ModelRendererTurbo(this, 83, 29, textureX, textureY); // Box 78
		bodyModel[36] = new ModelRendererTurbo(this, 48, 33, textureX, textureY); // Box 81
		bodyModel[37] = new ModelRendererTurbo(this, 48, 33, textureX, textureY); // Box 82
		bodyModel[38] = new ModelRendererTurbo(this, 48, 33, textureX, textureY); // Box 83
		bodyModel[39] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 53
		bodyModel[41] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 111
		bodyModel[42] = new ModelRendererTurbo(this, 71, 33, textureX, textureY); // Box 123
		bodyModel[43] = new ModelRendererTurbo(this, 73, 38, textureX, textureY); // Box 124
		bodyModel[44] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 185
		bodyModel[45] = new ModelRendererTurbo(this, 71, 33, textureX, textureY); // Box 186
		bodyModel[46] = new ModelRendererTurbo(this, 73, 38, textureX, textureY); // Box 189
		bodyModel[47] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 149
		bodyModel[48] = new ModelRendererTurbo(this, 73, 38, textureX, textureY); // Box 150
		bodyModel[49] = new ModelRendererTurbo(this, 71, 33, textureX, textureY); // Box 151
		bodyModel[50] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 152
		bodyModel[51] = new ModelRendererTurbo(this, 71, 33, textureX, textureY); // Box 100
		bodyModel[52] = new ModelRendererTurbo(this, 73, 38, textureX, textureY); // Box 101
		bodyModel[53] = new ModelRendererTurbo(this, 41, 11, textureX, textureY); // Box 102
		bodyModel[54] = new ModelRendererTurbo(this, 53, 12, textureX, textureY); // Box 103
		bodyModel[55] = new ModelRendererTurbo(this, 53, 9, textureX, textureY); // Box 104
		bodyModel[56] = new ModelRendererTurbo(this, 53, 9, textureX, textureY); // Box 105
		bodyModel[57] = new ModelRendererTurbo(this, 39, 8, textureX, textureY); // Box 106
		bodyModel[58] = new ModelRendererTurbo(this, 41, 11, textureX, textureY); // Box 107
		bodyModel[59] = new ModelRendererTurbo(this, 53, 12, textureX, textureY); // Box 108
		bodyModel[60] = new ModelRendererTurbo(this, 53, 9, textureX, textureY); // Box 109
		bodyModel[61] = new ModelRendererTurbo(this, 39, 8, textureX, textureY); // Box 110
		bodyModel[62] = new ModelRendererTurbo(this, 41, 11, textureX, textureY); // Box 111
		bodyModel[63] = new ModelRendererTurbo(this, 53, 12, textureX, textureY); // Box 112
		bodyModel[64] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 113
		bodyModel[65] = new ModelRendererTurbo(this, 84, 1, textureX, textureY); // Box 114
		bodyModel[66] = new ModelRendererTurbo(this, 57, 28, textureX, textureY); // Box 115
		bodyModel[67] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 116
		bodyModel[68] = new ModelRendererTurbo(this, 43, 24, textureX, textureY); // Box 117
		bodyModel[69] = new ModelRendererTurbo(this, 45, 27, textureX, textureY); // Box 118
		bodyModel[70] = new ModelRendererTurbo(this, 43, 24, textureX, textureY); // Box 119
		bodyModel[71] = new ModelRendererTurbo(this, 45, 27, textureX, textureY); // Box 120
		bodyModel[72] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 121
		bodyModel[73] = new ModelRendererTurbo(this, 57, 28, textureX, textureY); // Box 122
		bodyModel[74] = new ModelRendererTurbo(this, 45, 27, textureX, textureY); // Box 123
		bodyModel[75] = new ModelRendererTurbo(this, 43, 24, textureX, textureY); // Box 124
		bodyModel[76] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 125
		bodyModel[77] = new ModelRendererTurbo(this, 57, 28, textureX, textureY); // Box 126
		bodyModel[78] = new ModelRendererTurbo(this, 82, 37, textureX, textureY); // Box 155
		bodyModel[79] = new ModelRendererTurbo(this, 82, 41, textureX, textureY); // Box 156
		bodyModel[80] = new ModelRendererTurbo(this, 82, 37, textureX, textureY); // Box 178
		bodyModel[81] = new ModelRendererTurbo(this, 82, 41, textureX, textureY); // Box 179
		bodyModel[82] = new ModelRendererTurbo(this, 82, 34, textureX, textureY); // Box 131
		bodyModel[83] = new ModelRendererTurbo(this, 50, 24, textureX, textureY); // Box 101
		bodyModel[84] = new ModelRendererTurbo(this, 50, 24, textureX, textureY); // Box 102
		bodyModel[85] = new ModelRendererTurbo(this, 75, 21, textureX, textureY); // Box 134
		bodyModel[86] = new ModelRendererTurbo(this, 50, 24, textureX, textureY); // Box 135
		bodyModel[87] = new ModelRendererTurbo(this, 60, 42, textureX, textureY); // Box 121
		bodyModel[88] = new ModelRendererTurbo(this, 60, 42, textureX, textureY); // Box 122
		bodyModel[89] = new ModelRendererTurbo(this, 16, 29, textureX, textureY); // Box 123
		bodyModel[90] = new ModelRendererTurbo(this, 46, 43, textureX, textureY); // Box 124
		bodyModel[91] = new ModelRendererTurbo(this, 46, 43, textureX, textureY); // Box 125
		bodyModel[92] = new ModelRendererTurbo(this, 51, 41, textureX, textureY); // Box 127
		bodyModel[93] = new ModelRendererTurbo(this, 51, 41, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 18, 31, textureX, textureY); // Box 130
		bodyModel[95] = new ModelRendererTurbo(this, 16, 29, textureX, textureY); // Box 144
		bodyModel[96] = new ModelRendererTurbo(this, 39, 42, textureX, textureY); // Box 145
		bodyModel[97] = new ModelRendererTurbo(this, 88, 17, textureX, textureY); // Box 146
		bodyModel[98] = new ModelRendererTurbo(this, 61, 17, textureX, textureY); // Box 147
		bodyModel[99] = new ModelRendererTurbo(this, 82, 41, textureX, textureY); // Box 148
		bodyModel[100] = new ModelRendererTurbo(this, 82, 37, textureX, textureY); // Box 149
		bodyModel[101] = new ModelRendererTurbo(this, 92, 41, textureX, textureY); // Box 150
		bodyModel[102] = new ModelRendererTurbo(this, 92, 37, textureX, textureY); // Box 151
		bodyModel[103] = new ModelRendererTurbo(this, 82, 45, textureX, textureY); // Box 148
		bodyModel[104] = new ModelRendererTurbo(this, 82, 45, textureX, textureY); // Box 153
		bodyModel[105] = new ModelRendererTurbo(this, 82, 41, textureX, textureY); // Box 154
		bodyModel[106] = new ModelRendererTurbo(this, 82, 37, textureX, textureY); // Box 155
		bodyModel[107] = new ModelRendererTurbo(this, 92, 37, textureX, textureY); // Box 156
		bodyModel[108] = new ModelRendererTurbo(this, 92, 41, textureX, textureY); // Box 157
		bodyModel[109] = new ModelRendererTurbo(this, 83, 29, textureX, textureY); // Box 158
		bodyModel[110] = new ModelRendererTurbo(this, 82, 34, textureX, textureY); // Box 159
		bodyModel[111] = new ModelRendererTurbo(this, 25, 40, textureX, textureY); // Box 204
		bodyModel[112] = new ModelRendererTurbo(this, 25, 40, textureX, textureY); // Box 205
		bodyModel[113] = new ModelRendererTurbo(this, 71, 5, textureX, textureY); // Box 115
		bodyModel[114] = new ModelRendererTurbo(this, 64, 5, textureX, textureY); // Box 116
		bodyModel[115] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 117
		bodyModel[116] = new ModelRendererTurbo(this, 46, 8, textureX, textureY); // Box 118
		bodyModel[117] = new ModelRendererTurbo(this, 46, 8, textureX, textureY); // Box 119
		bodyModel[118] = new ModelRendererTurbo(this, 46, 8, textureX, textureY); // Box 120
		bodyModel[119] = new ModelRendererTurbo(this, 39, 42, textureX, textureY); // Box 145

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 1 wheel
		bodyModel[0].setRotationPoint(-4F, 7F, -5.5F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 4 wheel
		bodyModel[1].setRotationPoint(-4F, 7F, 5.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[2].setRotationPoint(-5F, 6F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 22
		bodyModel[3].setRotationPoint(-5F, 6F, -9.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 68
		bodyModel[4].setRotationPoint(-5F, 6F, 8.5F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 1 wheel
		bodyModel[5].setRotationPoint(3.5F, 7F, -5.5F);

		bodyModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 4 wheel
		bodyModel[6].setRotationPoint(3.5F, 7F, 5.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[7].setRotationPoint(2.5F, 6F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 22
		bodyModel[8].setRotationPoint(2.5F, 6F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 68
		bodyModel[9].setRotationPoint(2.5F, 6F, 8.5F);

		bodyModel[10].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11 wheel
		bodyModel[10].setRotationPoint(13F, 7F, -5.5F);

		bodyModel[11].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 12 wheel
		bodyModel[11].setRotationPoint(13F, 7F, 5.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 13
		bodyModel[12].setRotationPoint(12F, 6F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 14
		bodyModel[13].setRotationPoint(12F, 6F, -9.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 15
		bodyModel[14].setRotationPoint(12F, 6F, 8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 27
		bodyModel[15].setRotationPoint(-7F, 5.5F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 31
		bodyModel[16].setRotationPoint(-7F, 4.5F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[17].setRotationPoint(-3F, 4.5F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[18].setRotationPoint(-1F, 4.5F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 29
		bodyModel[19].setRotationPoint(10F, 4.5F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 30
		bodyModel[20].setRotationPoint(12F, 4.5F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 33
		bodyModel[21].setRotationPoint(6F, 4.5F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 41
		bodyModel[22].setRotationPoint(7.75F, 5.5F, -8F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 69
		bodyModel[23].setRotationPoint(-6F, 8.5F, -8.75F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 52
		bodyModel[24].setRotationPoint(11F, 8.5F, -8.75F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 53
		bodyModel[25].setRotationPoint(1.5F, 8.5F, -8.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 55
		bodyModel[26].setRotationPoint(6F, 4.5F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F); // Box 56
		bodyModel[27].setRotationPoint(3.5F, 4.5F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F); // Box 57
		bodyModel[28].setRotationPoint(1.5F, 4.5F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[29].setRotationPoint(-1F, 4.5F, 8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[30].setRotationPoint(-3F, 4.5F, 8F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 60
		bodyModel[31].setRotationPoint(-7F, 4.5F, 8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 61
		bodyModel[32].setRotationPoint(10F, 4.5F, 8F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 62
		bodyModel[33].setRotationPoint(12F, 4.5F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 71
		bodyModel[34].setRotationPoint(7.75F, 5.5F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 78
		bodyModel[35].setRotationPoint(0F, 6F, 6.25F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 81
		bodyModel[36].setRotationPoint(11F, 8.5F, 7.75F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 82
		bodyModel[37].setRotationPoint(1.5F, 8.5F, 7.75F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 83
		bodyModel[38].setRotationPoint(-6F, 8.5F, 7.75F);

		bodyModel[39].addBox(0F, 0F, 0F, 21, 4, 10, 0F); // Box 51
		bodyModel[39].setRotationPoint(-6F, 4.5F, -5F);

		bodyModel[40].addBox(0F, 0F, 0F, 6, 1, 10, 0F); // Box 53
		bodyModel[40].setRotationPoint(1F, 3.75F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 111
		bodyModel[41].setRotationPoint(12F, 3.5F, 9.5F);
		bodyModel[41].rotateAngleX = -0.78539816F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F); // Box 123
		bodyModel[42].setRotationPoint(10F, 4.5F, 6.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 124
		bodyModel[43].setRotationPoint(11F, 4.5F, 9.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 185
		bodyModel[44].setRotationPoint(12F, 3.5F, -9.5F);
		bodyModel[44].rotateAngleX = -0.78539816F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 186
		bodyModel[45].setRotationPoint(10F, 4.5F, -10.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 189
		bodyModel[46].setRotationPoint(11F, 4.5F, -10.25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 149
		bodyModel[47].setRotationPoint(-5F, 3.5F, 9.5F);
		bodyModel[47].rotateAngleX = -0.78539816F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 150
		bodyModel[48].setRotationPoint(-4F, 4.5F, 9.25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 151
		bodyModel[49].setRotationPoint(-2F, 4.5F, 6.25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 152
		bodyModel[50].setRotationPoint(-5F, 3.5F, -9.5F);
		bodyModel[50].rotateAngleX = -0.78539816F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 100
		bodyModel[51].setRotationPoint(-2F, 4.5F, -10.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[52].setRotationPoint(-4F, 4.5F, -10.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
		bodyModel[53].setRotationPoint(-6F, 6.5F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[54].setRotationPoint(-3F, 6.5F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[55].setRotationPoint(-3F, 5.75F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[56].setRotationPoint(4.5F, 5.75F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 106
		bodyModel[57].setRotationPoint(0.5F, 5.75F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 107
		bodyModel[58].setRotationPoint(1.5F, 6.5F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[59].setRotationPoint(4.5F, 6.5F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[60].setRotationPoint(14F, 5.5F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 110
		bodyModel[61].setRotationPoint(10F, 5.75F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 111
		bodyModel[62].setRotationPoint(11F, 6.5F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[63].setRotationPoint(14F, 6.5F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[64].setRotationPoint(-1F, 4.5F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[65].setRotationPoint(6F, 4.5F, -10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 115
		bodyModel[66].setRotationPoint(-3F, 6.5F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 116
		bodyModel[67].setRotationPoint(-3F, 5.75F, 8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -1F, 0F, -0.125F); // Box 117
		bodyModel[68].setRotationPoint(-7F, 5.5F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 118
		bodyModel[69].setRotationPoint(-6F, 6.5F, 8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -1F, 0F, -0.125F); // Box 119
		bodyModel[70].setRotationPoint(0.5F, 5.75F, 8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 120
		bodyModel[71].setRotationPoint(1.5F, 6.5F, 8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 121
		bodyModel[72].setRotationPoint(4.5F, 5.75F, 8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 122
		bodyModel[73].setRotationPoint(4.5F, 6.5F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 123
		bodyModel[74].setRotationPoint(11F, 6.5F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -1F, 0F, -0.125F); // Box 124
		bodyModel[75].setRotationPoint(10F, 5.75F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 125
		bodyModel[76].setRotationPoint(14F, 5.5F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 126
		bodyModel[77].setRotationPoint(14F, 6.5F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 155
		bodyModel[78].setRotationPoint(-1.5F, 5F, 6.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 156
		bodyModel[79].setRotationPoint(-1.5F, 7F, 6.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 178
		bodyModel[80].setRotationPoint(-1.5F, 5F, -7.25F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 179
		bodyModel[81].setRotationPoint(-1.5F, 7F, -7.25F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0.5F, -0.5F); // Box 131
		bodyModel[82].setRotationPoint(-1.5F, 7F, 6.85F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 101
		bodyModel[83].setRotationPoint(2.5F, 5F, 7.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 102
		bodyModel[84].setRotationPoint(-5F, 5F, 7.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 134
		bodyModel[85].setRotationPoint(3F, 4.5F, 8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 135
		bodyModel[86].setRotationPoint(12F, 5F, 7.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 121
		bodyModel[87].setRotationPoint(8.5F, 3.5F, 7.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 122
		bodyModel[88].setRotationPoint(8.5F, 3.5F, -8.75F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 123
		bodyModel[89].setRotationPoint(7F, 3.5F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[90].setRotationPoint(6F, 3.5F, -8.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[91].setRotationPoint(6F, 3.5F, 7.75F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 127
		bodyModel[92].setRotationPoint(7F, 3.5F, -8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 128
		bodyModel[93].setRotationPoint(7F, 4F, 6.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 130
		bodyModel[94].setRotationPoint(7F, 5F, -8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 144
		bodyModel[95].setRotationPoint(-0.75F, 3.5F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 145
		bodyModel[96].setRotationPoint(-0.75F, 3.75F, 7.75F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 146
		bodyModel[97].setRotationPoint(6F, 4.5F, 9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 147
		bodyModel[98].setRotationPoint(-1F, 4.5F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 148
		bodyModel[99].setRotationPoint(6F, 7F, 6.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149
		bodyModel[100].setRotationPoint(6F, 5F, 6.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 150
		bodyModel[101].setRotationPoint(9.5F, 7F, 6.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 151
		bodyModel[102].setRotationPoint(9.5F, 5F, 6.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 148
		bodyModel[103].setRotationPoint(5.5F, 8.5F, 6.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		bodyModel[104].setRotationPoint(5.5F, 8.5F, -7.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 154
		bodyModel[105].setRotationPoint(6F, 7F, -7.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[106].setRotationPoint(6F, 5F, -7.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[107].setRotationPoint(9.5F, 5F, -7.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 157
		bodyModel[108].setRotationPoint(9.5F, 7F, -7.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 158
		bodyModel[109].setRotationPoint(0F, 6F, -7.25F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0.5F, 0F); // Box 159
		bodyModel[110].setRotationPoint(-1.5F, 7F, -7.85F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 204
		bodyModel[111].setRotationPoint(-3F, 3.5F, -1F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 205
		bodyModel[112].setRotationPoint(2F, 3.5F, -1F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 115
		bodyModel[113].setRotationPoint(3F, 4.5F, -9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F); // Box 116
		bodyModel[114].setRotationPoint(1.5F, 4.5F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F); // Box 117
		bodyModel[115].setRotationPoint(3.5F, 4.5F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 118
		bodyModel[116].setRotationPoint(2.5F, 5F, -8.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 119
		bodyModel[117].setRotationPoint(-5F, 5F, -8.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 120
		bodyModel[118].setRotationPoint(12F, 5F, -8.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 145
		bodyModel[119].setRotationPoint(-0.75F, 3.75F, -8.75F);
	}
}