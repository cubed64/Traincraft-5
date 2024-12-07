//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HTCR2
// Model Creator: bida
// Created on: 28.05.2024 - 21:07:52
// Last changed on: 28.05.2024 - 21:07:52

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelHTCR2_peter_edition extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelHTCR2_peter_edition() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[138];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 36, 30, textureX, textureY); // Box 0 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 36, 30, textureX, textureY); // Box 1 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 13, 20, textureX, textureY); // Box 4 axle front
		bodyModel[3] = new ModelRendererTurbo(this, 36, 30, textureX, textureY); // Box 3 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 36, 30, textureX, textureY); // Box 4 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 13, 20, textureX, textureY); // Box 5 axle mid
		bodyModel[6] = new ModelRendererTurbo(this, 50, 1, textureX, textureY); // Box 9 axle rear
		bodyModel[7] = new ModelRendererTurbo(this, 36, 30, textureX, textureY); // Box 10 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 36, 30, textureX, textureY); // Box 11 wheel
		bodyModel[9] = new ModelRendererTurbo(this, 66, 26, textureX, textureY); // Box 173
		bodyModel[10] = new ModelRendererTurbo(this, 59, 26, textureX, textureY); // Box 22
		bodyModel[11] = new ModelRendererTurbo(this, 52, 26, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 59, 26, textureX, textureY); // Box 68
		bodyModel[13] = new ModelRendererTurbo(this, 66, 26, textureX, textureY); // Box 69
		bodyModel[14] = new ModelRendererTurbo(this, 52, 26, textureX, textureY); // Box 70
		bodyModel[15] = new ModelRendererTurbo(this, 18, 60, textureX, textureY); // Box 204
		bodyModel[16] = new ModelRendererTurbo(this, 18, 60, textureX, textureY); // Box 205
		bodyModel[17] = new ModelRendererTurbo(this, 1, 59, textureX, textureY); // Box 184
		bodyModel[18] = new ModelRendererTurbo(this, 11, 59, textureX, textureY); // Box 187
		bodyModel[19] = new ModelRendererTurbo(this, 9, 62, textureX, textureY); // Box 188
		bodyModel[20] = new ModelRendererTurbo(this, 1, 54, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 9, 60, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 6, 54, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 2, 43, textureX, textureY); // Box 117
		bodyModel[24] = new ModelRendererTurbo(this, 12, 52, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 27, 43, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 2, 47, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 39, 52, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 52, 43, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 57, 42, textureX, textureY); // Box 151
		bodyModel[30] = new ModelRendererTurbo(this, 58, 52, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 12, 52, textureX, textureY); // Box 48
		bodyModel[32] = new ModelRendererTurbo(this, 39, 52, textureX, textureY); // Box 49
		bodyModel[33] = new ModelRendererTurbo(this, 58, 52, textureX, textureY); // Box 51
		bodyModel[34] = new ModelRendererTurbo(this, 59, 23, textureX, textureY, "cull"); // Box 52  cull
		bodyModel[35] = new ModelRendererTurbo(this, 66, 23, textureX, textureY, "cull"); // Box 53 cull
		bodyModel[36] = new ModelRendererTurbo(this, 52, 23, textureX, textureY, "cull"); // Box 54 cull
		bodyModel[37] = new ModelRendererTurbo(this, 59, 23, textureX, textureY, "cull"); // Box 55 cull
		bodyModel[38] = new ModelRendererTurbo(this, 66, 23, textureX, textureY, "cull"); // Box 56 cull
		bodyModel[39] = new ModelRendererTurbo(this, 52, 23, textureX, textureY, "cull"); // Box 57 cull
		bodyModel[40] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Box 198
		bodyModel[41] = new ModelRendererTurbo(this, 6, 22, textureX, textureY); // Box 156
		bodyModel[42] = new ModelRendererTurbo(this, 16, 29, textureX, textureY); // Box 167
		bodyModel[43] = new ModelRendererTurbo(this, 17, 26, textureX, textureY); // Box 61
		bodyModel[44] = new ModelRendererTurbo(this, 11, 17, textureX, textureY); // Box 159
		bodyModel[45] = new ModelRendererTurbo(this, 11, 22, textureX, textureY); // Box 160
		bodyModel[46] = new ModelRendererTurbo(this, 16, 22, textureX, textureY); // Box 64
		bodyModel[47] = new ModelRendererTurbo(this, 16, 17, textureX, textureY); // Box 65
		bodyModel[48] = new ModelRendererTurbo(this, 55, 22, textureX, textureY); // Box 66
		bodyModel[49] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 67
		bodyModel[50] = new ModelRendererTurbo(this, 1, 22, textureX, textureY); // Box 68
		bodyModel[51] = new ModelRendererTurbo(this, 75, 26, textureX, textureY); // Box 69
		bodyModel[52] = new ModelRendererTurbo(this, 8, 26, textureX, textureY); // Box 70
		bodyModel[53] = new ModelRendererTurbo(this, 7, 29, textureX, textureY); // Box 71
		bodyModel[54] = new ModelRendererTurbo(this, 58, 32, textureX, textureY); // Box 137
		bodyModel[55] = new ModelRendererTurbo(this, 58, 32, textureX, textureY); // Box 73
		bodyModel[56] = new ModelRendererTurbo(this, 36, 21, textureX, textureY); // Box 74
		bodyModel[57] = new ModelRendererTurbo(this, 44, 21, textureX, textureY); // Box 75
		bodyModel[58] = new ModelRendererTurbo(this, 38, 25, textureX, textureY); // Box 76
		bodyModel[59] = new ModelRendererTurbo(this, 40, 17, textureX, textureY); // Box 77
		bodyModel[60] = new ModelRendererTurbo(this, 40, 17, textureX, textureY); // Box 78
		bodyModel[61] = new ModelRendererTurbo(this, 38, 25, textureX, textureY); // Box 79
		bodyModel[62] = new ModelRendererTurbo(this, 36, 21, textureX, textureY); // Box 81
		bodyModel[63] = new ModelRendererTurbo(this, 44, 21, textureX, textureY); // Box 82
		bodyModel[64] = new ModelRendererTurbo(this, 58, 32, textureX, textureY); // Box 83
		bodyModel[65] = new ModelRendererTurbo(this, 58, 32, textureX, textureY); // Box 84
		bodyModel[66] = new ModelRendererTurbo(this, 40, 5, textureX, textureY); // Box 85
		bodyModel[67] = new ModelRendererTurbo(this, 38, 13, textureX, textureY); // Box 86
		bodyModel[68] = new ModelRendererTurbo(this, 36, 9, textureX, textureY); // Box 88
		bodyModel[69] = new ModelRendererTurbo(this, 44, 9, textureX, textureY); // Box 89
		bodyModel[70] = new ModelRendererTurbo(this, 76, 32, textureX, textureY); // Box 90
		bodyModel[71] = new ModelRendererTurbo(this, 76, 32, textureX, textureY); // Box 91
		bodyModel[72] = new ModelRendererTurbo(this, 65, 30, textureX, textureY); // Box 94
		bodyModel[73] = new ModelRendererTurbo(this, 49, 30, textureX, textureY); // Box 96
		bodyModel[74] = new ModelRendererTurbo(this, 1, 59, textureX, textureY); // Box 97
		bodyModel[75] = new ModelRendererTurbo(this, 11, 59, textureX, textureY); // Box 98
		bodyModel[76] = new ModelRendererTurbo(this, 9, 62, textureX, textureY); // Box 99
		bodyModel[77] = new ModelRendererTurbo(this, 1, 54, textureX, textureY); // Box 100
		bodyModel[78] = new ModelRendererTurbo(this, 9, 60, textureX, textureY); // Box 101
		bodyModel[79] = new ModelRendererTurbo(this, 6, 54, textureX, textureY); // Box 102
		bodyModel[80] = new ModelRendererTurbo(this, 2, 43, textureX, textureY); // Box 103
		bodyModel[81] = new ModelRendererTurbo(this, 27, 43, textureX, textureY); // Box 104
		bodyModel[82] = new ModelRendererTurbo(this, 2, 47, textureX, textureY); // Box 105
		bodyModel[83] = new ModelRendererTurbo(this, 52, 43, textureX, textureY); // Box 106
		bodyModel[84] = new ModelRendererTurbo(this, 65, 30, textureX, textureY); // Box 107
		bodyModel[85] = new ModelRendererTurbo(this, 49, 30, textureX, textureY); // Box 108
		bodyModel[86] = new ModelRendererTurbo(this, 58, 32, textureX, textureY); // Box 109
		bodyModel[87] = new ModelRendererTurbo(this, 58, 32, textureX, textureY); // Box 110
		bodyModel[88] = new ModelRendererTurbo(this, 44, 21, textureX, textureY); // Box 111
		bodyModel[89] = new ModelRendererTurbo(this, 36, 21, textureX, textureY); // Box 112
		bodyModel[90] = new ModelRendererTurbo(this, 38, 25, textureX, textureY); // Box 113
		bodyModel[91] = new ModelRendererTurbo(this, 40, 17, textureX, textureY); // Box 114
		bodyModel[92] = new ModelRendererTurbo(this, 40, 17, textureX, textureY); // Box 115
		bodyModel[93] = new ModelRendererTurbo(this, 38, 25, textureX, textureY); // Box 116
		bodyModel[94] = new ModelRendererTurbo(this, 44, 21, textureX, textureY); // Box 117
		bodyModel[95] = new ModelRendererTurbo(this, 36, 21, textureX, textureY); // Box 118
		bodyModel[96] = new ModelRendererTurbo(this, 58, 32, textureX, textureY); // Box 119
		bodyModel[97] = new ModelRendererTurbo(this, 58, 32, textureX, textureY); // Box 120
		bodyModel[98] = new ModelRendererTurbo(this, 40, 5, textureX, textureY); // Box 121
		bodyModel[99] = new ModelRendererTurbo(this, 38, 13, textureX, textureY); // Box 122
		bodyModel[100] = new ModelRendererTurbo(this, 44, 9, textureX, textureY); // Box 123
		bodyModel[101] = new ModelRendererTurbo(this, 36, 9, textureX, textureY); // Box 124
		bodyModel[102] = new ModelRendererTurbo(this, 76, 32, textureX, textureY); // Box 125
		bodyModel[103] = new ModelRendererTurbo(this, 76, 32, textureX, textureY); // Box 126
		bodyModel[104] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Box 127
		bodyModel[105] = new ModelRendererTurbo(this, 6, 22, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 16, 29, textureX, textureY); // Box 129
		bodyModel[107] = new ModelRendererTurbo(this, 17, 26, textureX, textureY); // Box 130
		bodyModel[108] = new ModelRendererTurbo(this, 11, 17, textureX, textureY); // Box 131
		bodyModel[109] = new ModelRendererTurbo(this, 11, 22, textureX, textureY); // Box 132
		bodyModel[110] = new ModelRendererTurbo(this, 16, 22, textureX, textureY); // Box 133
		bodyModel[111] = new ModelRendererTurbo(this, 16, 17, textureX, textureY); // Box 134
		bodyModel[112] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 135
		bodyModel[113] = new ModelRendererTurbo(this, 1, 22, textureX, textureY); // Box 136
		bodyModel[114] = new ModelRendererTurbo(this, 8, 26, textureX, textureY); // Box 137
		bodyModel[115] = new ModelRendererTurbo(this, 7, 29, textureX, textureY); // Box 138
		bodyModel[116] = new ModelRendererTurbo(this, 97, 45, textureX, textureY); // Box 134
		bodyModel[117] = new ModelRendererTurbo(this, 99, 31, textureX, textureY); // Box 135
		bodyModel[118] = new ModelRendererTurbo(this, 73, 3, textureX, textureY); // Box 141
		bodyModel[119] = new ModelRendererTurbo(this, 99, 31, textureX, textureY); // Box 142
		bodyModel[120] = new ModelRendererTurbo(this, 98, 12, textureX, textureY); // Box 143
		bodyModel[121] = new ModelRendererTurbo(this, 100, 12, textureX, textureY); // Box 144
		bodyModel[122] = new ModelRendererTurbo(this, 26, 21, textureX, textureY); // Box 164
		bodyModel[123] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 146
		bodyModel[124] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 147
		bodyModel[125] = new ModelRendererTurbo(this, 26, 16, textureX, textureY); // Box 148
		bodyModel[126] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 149
		bodyModel[127] = new ModelRendererTurbo(this, 21, 16, textureX, textureY); // Box 150
		bodyModel[128] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 151
		bodyModel[129] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 152
		bodyModel[130] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 153
		bodyModel[131] = new ModelRendererTurbo(this, 21, 21, textureX, textureY); // Box 155
		bodyModel[132] = new ModelRendererTurbo(this, 78, 48, textureX, textureY); // Box 156
		bodyModel[133] = new ModelRendererTurbo(this, 36, 2, textureX, textureY); // Box 157
		bodyModel[134] = new ModelRendererTurbo(this, 6, 34, textureX, textureY, "cull"); // Box 159 cull vertical braces
		bodyModel[135] = new ModelRendererTurbo(this, 6, 34, textureX, textureY, "cull"); // Box 160 cull vertical braces
		bodyModel[136] = new ModelRendererTurbo(this, 23, 54, textureX, textureY); // Box 440
		bodyModel[137] = new ModelRendererTurbo(this, 34, 56, textureX, textureY); // Box 137

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 0 wheel
		bodyModel[0].setRotationPoint(-11F, 7F, -5.5F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 1 wheel
		bodyModel[1].setRotationPoint(0F, 7F, -5.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4 axle front
		bodyModel[2].setRotationPoint(-12F, 6F, -9F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 3 wheel
		bodyModel[3].setRotationPoint(-11F, 7F, 5.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 4 wheel
		bodyModel[4].setRotationPoint(0F, 7F, 5.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5 axle mid
		bodyModel[5].setRotationPoint(-1F, 6F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 9 axle rear
		bodyModel[6].setRotationPoint(10F, 6F, -9F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10 wheel
		bodyModel[7].setRotationPoint(11F, 7F, -5.5F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11 wheel
		bodyModel[8].setRotationPoint(11F, 7F, 5.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[9].setRotationPoint(-12F, 6F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 22
		bodyModel[10].setRotationPoint(-1F, 6F, -9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23
		bodyModel[11].setRotationPoint(10F, 6F, -9.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 68
		bodyModel[12].setRotationPoint(-1F, 6F, 8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 69
		bodyModel[13].setRotationPoint(-12F, 6F, 8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 70
		bodyModel[14].setRotationPoint(10F, 6F, 8.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 204
		bodyModel[15].setRotationPoint(0.5F, 3F, -1F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 205
		bodyModel[16].setRotationPoint(-4.5F, 3F, -1F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 184
		bodyModel[17].setRotationPoint(-11.5F, 2.4F, -9.5F);
		bodyModel[17].rotateAngleX = -0.78539816F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 187
		bodyModel[18].setRotationPoint(-8.5F, 3.2F, -10.25F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[19].setRotationPoint(-10.5F, 3.2F, -10.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 23
		bodyModel[20].setRotationPoint(-0.5F, 2.4F, -9.5F);
		bodyModel[20].rotateAngleX = -0.78539816F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(0.5F, 3.2F, -10.25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(2.5F, 3.2F, -10.25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[23].setRotationPoint(-14F, 2.5F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[24].setRotationPoint(-8F, 5.25F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 31
		bodyModel[25].setRotationPoint(-2.5F, 2.5F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 31, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[26].setRotationPoint(-14F, 3.25F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[27].setRotationPoint(3F, 5.25F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 41
		bodyModel[28].setRotationPoint(9F, 2.5F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 1F); // Box 151
		bodyModel[29].setRotationPoint(17F, 3F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[30].setRotationPoint(14F, 5.25F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[31].setRotationPoint(-8F, 5.25F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[32].setRotationPoint(3F, 5.25F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[33].setRotationPoint(14F, 5.25F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 52  cull
		bodyModel[34].setRotationPoint(-1F, 6F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 53 cull
		bodyModel[35].setRotationPoint(-12F, 6F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 54 cull
		bodyModel[36].setRotationPoint(10F, 6F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 55 cull
		bodyModel[37].setRotationPoint(-1F, 6F, 9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 56 cull
		bodyModel[38].setRotationPoint(-12F, 6F, 9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 57 cull
		bodyModel[39].setRotationPoint(10F, 6F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 198
		bodyModel[40].setRotationPoint(-4F, 6F, -7.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 156
		bodyModel[41].setRotationPoint(-4F, 7F, -7.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 167
		bodyModel[42].setRotationPoint(3.25F, 8.51F, -7.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 61
		bodyModel[43].setRotationPoint(3.75F, 7.5F, -7.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 159
		bodyModel[44].setRotationPoint(3.5F, 4.5F, -7.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 160
		bodyModel[45].setRotationPoint(3F, 7.5F, -7.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 64
		bodyModel[46].setRotationPoint(7F, 7.5F, -7.25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 65
		bodyModel[47].setRotationPoint(6.5F, 4.5F, -7.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 66
		bodyModel[48].setRotationPoint(5.5F, 6.5F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 67
		bodyModel[49].setRotationPoint(-7.5F, 4.5F, -7.25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 68
		bodyModel[50].setRotationPoint(-8F, 7.5F, -7.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 69
		bodyModel[51].setRotationPoint(-5F, 6.5F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 70
		bodyModel[52].setRotationPoint(-7.25F, 7.5F, -7.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, -0.4F, 0.5F, -0.5F, -0.4F, 0.5F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 71
		bodyModel[53].setRotationPoint(-7.75F, 8.5F, -7.75F);
		bodyModel[53].rotateAngleZ = 0.13962634F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F); // Box 137
		bodyModel[54].setRotationPoint(-13.75F, 4.5F, -8.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F); // Box 73
		bodyModel[55].setRotationPoint(-10.25F, 4.5F, -8.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 74
		bodyModel[56].setRotationPoint(-13.5F, 6.5F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 75
		bodyModel[57].setRotationPoint(-10F, 6.5F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[58].setRotationPoint(-12.5F, 7.5F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 77
		bodyModel[59].setRotationPoint(-11.5F, 5F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 78
		bodyModel[60].setRotationPoint(-0.5F, 5F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[61].setRotationPoint(-1.5F, 7.5F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 81
		bodyModel[62].setRotationPoint(-2.5F, 6.5F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 82
		bodyModel[63].setRotationPoint(1F, 6.5F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F); // Box 83
		bodyModel[64].setRotationPoint(0.75F, 4.5F, -8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F); // Box 84
		bodyModel[65].setRotationPoint(-2.75F, 4.5F, -8.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 85
		bodyModel[66].setRotationPoint(10.5F, 5F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[67].setRotationPoint(9.5F, 7.5F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 88
		bodyModel[68].setRotationPoint(8.5F, 6.5F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 89
		bodyModel[69].setRotationPoint(12F, 6.5F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F); // Box 90
		bodyModel[70].setRotationPoint(11.75F, 4.5F, -8.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F); // Box 91
		bodyModel[71].setRotationPoint(8.25F, 4.5F, -8.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 94
		bodyModel[72].setRotationPoint(4.5F, 2F, -9.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 96
		bodyModel[73].setRotationPoint(-6.5F, 2F, -9.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 97
		bodyModel[74].setRotationPoint(-11.5F, 2.4F, 9.5F);
		bodyModel[74].rotateAngleX = -0.78539816F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 98
		bodyModel[75].setRotationPoint(-8.5F, 3.2F, 6.25F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 99
		bodyModel[76].setRotationPoint(-10.5F, 3.2F, 9.25F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 100
		bodyModel[77].setRotationPoint(-0.5F, 2.4F, 9.5F);
		bodyModel[77].rotateAngleX = -0.78539816F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 101
		bodyModel[78].setRotationPoint(0.5F, 3.2F, 9.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 102
		bodyModel[79].setRotationPoint(2.5F, 3.2F, 6.25F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[80].setRotationPoint(-14F, 2.5F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 104
		bodyModel[81].setRotationPoint(-2.5F, 2.5F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 31, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[82].setRotationPoint(-14F, 3.25F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 106
		bodyModel[83].setRotationPoint(9F, 2.5F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 107
		bodyModel[84].setRotationPoint(4.5F, 2F, 7.25F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 108
		bodyModel[85].setRotationPoint(-6.5F, 2F, 7.25F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F); // Box 109
		bodyModel[86].setRotationPoint(-13.75F, 4.5F, 7.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F); // Box 110
		bodyModel[87].setRotationPoint(-10.25F, 4.5F, 7.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 111
		bodyModel[88].setRotationPoint(-13.5F, 6.5F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 112
		bodyModel[89].setRotationPoint(-10F, 6.5F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[90].setRotationPoint(-12.5F, 7.5F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 114
		bodyModel[91].setRotationPoint(-11.5F, 5F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 115
		bodyModel[92].setRotationPoint(-0.5F, 5F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[93].setRotationPoint(-1.5F, 7.5F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 117
		bodyModel[94].setRotationPoint(-2.5F, 6.5F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 118
		bodyModel[95].setRotationPoint(1F, 6.5F, 7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F); // Box 119
		bodyModel[96].setRotationPoint(0.75F, 4.5F, 7.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F); // Box 120
		bodyModel[97].setRotationPoint(-2.75F, 4.5F, 7.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 121
		bodyModel[98].setRotationPoint(10.5F, 5F, 7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[99].setRotationPoint(9.5F, 7.5F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 123
		bodyModel[100].setRotationPoint(8.5F, 6.5F, 7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 124
		bodyModel[101].setRotationPoint(12F, 6.5F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F); // Box 125
		bodyModel[102].setRotationPoint(11.75F, 4.5F, 7.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F); // Box 126
		bodyModel[103].setRotationPoint(8.25F, 4.5F, 7.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[104].setRotationPoint(-4F, 6F, 6.25F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 128
		bodyModel[105].setRotationPoint(-4F, 7F, 6.25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 129
		bodyModel[106].setRotationPoint(3.25F, 8.51F, 6.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 130
		bodyModel[107].setRotationPoint(3.75F, 7.5F, 6.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 131
		bodyModel[108].setRotationPoint(3.5F, 4.5F, 6.25F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 132
		bodyModel[109].setRotationPoint(3F, 7.5F, 6.25F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 133
		bodyModel[110].setRotationPoint(7F, 7.5F, 6.25F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 134
		bodyModel[111].setRotationPoint(6.5F, 4.5F, 6.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 135
		bodyModel[112].setRotationPoint(-7.5F, 4.5F, 6.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 136
		bodyModel[113].setRotationPoint(-8F, 7.5F, 6.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 137
		bodyModel[114].setRotationPoint(-7.25F, 7.5F, 6.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0.1F, 0.5F, -0.5F, 0.1F, 0.5F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 138
		bodyModel[115].setRotationPoint(-7.75F, 8.5F, 6.75F);
		bodyModel[115].rotateAngleZ = 0.13962634F;

		bodyModel[116].addBox(0F, 0F, 0F, 5, 5, 10, 0F); // Box 134
		bodyModel[116].setRotationPoint(-10F, 4F, -5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[117].setRotationPoint(-13F, 5F, -5F);

		bodyModel[118].addBox(0F, 0F, 0F, 5, 5, 10, 0F); // Box 141
		bodyModel[118].setRotationPoint(1F, 4F, -5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[119].setRotationPoint(-2F, 5F, -5F);

		bodyModel[120].addBox(0F, 0F, 0F, 5, 5, 10, 0F); // Box 143
		bodyModel[120].setRotationPoint(12F, 4F, -5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[121].setRotationPoint(9F, 5F, -5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 164
		bodyModel[122].setRotationPoint(-13.5F, 4F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 146
		bodyModel[123].setRotationPoint(-8.5F, 6.5F, -9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147
		bodyModel[124].setRotationPoint(2.5F, 6.5F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 148
		bodyModel[125].setRotationPoint(-2.5F, 4F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[126].setRotationPoint(6.5F, 6.5F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 150
		bodyModel[127].setRotationPoint(-2.5F, 4F, 9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 151
		bodyModel[128].setRotationPoint(2.5F, 6.5F, 8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[129].setRotationPoint(6.5F, 6.5F, 8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		bodyModel[130].setRotationPoint(-8.5F, 6.5F, 8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 155
		bodyModel[131].setRotationPoint(12.5F, 4F, 9F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 156
		bodyModel[132].setRotationPoint(-6F, 3.5F, -7F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 157
		bodyModel[133].setRotationPoint(5F, 3.5F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 159 cull vertical braces
		bodyModel[134].setRotationPoint(-7F, 5F, -9.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 160 cull vertical braces
		bodyModel[135].setRotationPoint(-7F, 5F, 8.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 440
		bodyModel[136].setRotationPoint(-3.5F, 2F, -2F);

		bodyModel[137].addBox(0F, 0F, 0F, 7, 1, 6, 0F); // Box 137
		bodyModel[137].setRotationPoint(-4.5F, 3.75F, -3F);
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