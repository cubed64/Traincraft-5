//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: TypeA
// Model Creator: Bida
// Created on: 27.08.2022 - 08:00:41
// Last changed on: 27.08.2022 - 08:00:41

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelTypeAnew extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelTypeAnew() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[115];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 30 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 46 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 47 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 48 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 39, 29, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 39, 29, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 15, 17, textureX, textureY); // Box 84 fric
		bodyModel[7] = new ModelRendererTurbo(this, 8, 17, textureX, textureY); // Box 173 rolly
		bodyModel[8] = new ModelRendererTurbo(this, 8, 17, textureX, textureY); // Box 69 rolly
		bodyModel[9] = new ModelRendererTurbo(this, 8, 17, textureX, textureY); // Box 12 rolly
		bodyModel[10] = new ModelRendererTurbo(this, 8, 17, textureX, textureY); // Box 13 rolly
		bodyModel[11] = new ModelRendererTurbo(this, 38, 14, textureX, textureY); // Box 52
		bodyModel[12] = new ModelRendererTurbo(this, 38, 17, textureX, textureY); // Box 53
		bodyModel[13] = new ModelRendererTurbo(this, 38, 21, textureX, textureY); // Box 48
		bodyModel[14] = new ModelRendererTurbo(this, 34, 25, textureX, textureY); // Box 47
		bodyModel[15] = new ModelRendererTurbo(this, 31, 14, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "cull"); // Box 22 rolly cully
		bodyModel[17] = new ModelRendererTurbo(this, 15, 17, textureX, textureY); // Box 23 fricc
		bodyModel[18] = new ModelRendererTurbo(this, 15, 17, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 15, 17, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "cull"); // Box 26 rolly cully
		bodyModel[21] = new ModelRendererTurbo(this, 33, 4, textureX, textureY); // Box 65
		bodyModel[22] = new ModelRendererTurbo(this, 26, 7, textureX, textureY); // Box 59
		bodyModel[23] = new ModelRendererTurbo(this, 26, 4, textureX, textureY); // Box 88
		bodyModel[24] = new ModelRendererTurbo(this, 26, 7, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 31, 1, textureX, textureY); // Box 89
		bodyModel[26] = new ModelRendererTurbo(this, 40, 1, textureX, textureY); // Box 57
		bodyModel[27] = new ModelRendererTurbo(this, 26, 1, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 56, 58, textureX, textureY); // Box 71
		bodyModel[29] = new ModelRendererTurbo(this, 41, 50, textureX, textureY); // Box 73
		bodyModel[30] = new ModelRendererTurbo(this, 56, 58, textureX, textureY); // Box 116
		bodyModel[31] = new ModelRendererTurbo(this, 25, 12, textureX, textureY); // Box 142
		bodyModel[32] = new ModelRendererTurbo(this, 42, 8, textureX, textureY); // Box 71
		bodyModel[33] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 184
		bodyModel[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 32, 8, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 54, 8, textureX, textureY); // Box 49
		bodyModel[38] = new ModelRendererTurbo(this, 48, 21, textureX, textureY); // Box 50
		bodyModel[39] = new ModelRendererTurbo(this, 48, 17, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 48, 14, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 53, 14, textureX, textureY); // Box 53
		bodyModel[42] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 54
		bodyModel[43] = new ModelRendererTurbo(this, 60, 1, textureX, textureY); // Box 55
		bodyModel[44] = new ModelRendererTurbo(this, 60, 4, textureX, textureY); // Box 56
		bodyModel[45] = new ModelRendererTurbo(this, 46, 1, textureX, textureY); // Box 57
		bodyModel[46] = new ModelRendererTurbo(this, 60, 7, textureX, textureY); // Box 58
		bodyModel[47] = new ModelRendererTurbo(this, 60, 7, textureX, textureY); // Box 59
		bodyModel[48] = new ModelRendererTurbo(this, 59, 12, textureX, textureY); // Box 60
		bodyModel[49] = new ModelRendererTurbo(this, 56, 58, textureX, textureY); // Box 61
		bodyModel[50] = new ModelRendererTurbo(this, 41, 50, textureX, textureY); // Box 62
		bodyModel[51] = new ModelRendererTurbo(this, 56, 58, textureX, textureY); // Box 63
		bodyModel[52] = new ModelRendererTurbo(this, 37, 8, textureX, textureY); // Box 137
		bodyModel[53] = new ModelRendererTurbo(this, 49, 8, textureX, textureY); // Box 65
		bodyModel[54] = new ModelRendererTurbo(this, 36, 31, textureX, textureY); // Box 135
		bodyModel[55] = new ModelRendererTurbo(this, 42, 34, textureX, textureY); // Box 136
		bodyModel[56] = new ModelRendererTurbo(this, 36, 34, textureX, textureY); // Box 137
		bodyModel[57] = new ModelRendererTurbo(this, 36, 34, textureX, textureY); // Box 149
		bodyModel[58] = new ModelRendererTurbo(this, 42, 34, textureX, textureY); // Box 150
		bodyModel[59] = new ModelRendererTurbo(this, 42, 34, textureX, textureY); // Box 76
		bodyModel[60] = new ModelRendererTurbo(this, 36, 34, textureX, textureY); // Box 77
		bodyModel[61] = new ModelRendererTurbo(this, 36, 34, textureX, textureY); // Box 78
		bodyModel[62] = new ModelRendererTurbo(this, 42, 34, textureX, textureY); // Box 79
		bodyModel[63] = new ModelRendererTurbo(this, 36, 31, textureX, textureY); // Box 80
		bodyModel[64] = new ModelRendererTurbo(this, 10, 25, textureX, textureY); // Box 372
		bodyModel[65] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 121
		bodyModel[66] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 122
		bodyModel[67] = new ModelRendererTurbo(this, 14, 46, textureX, textureY); // Box 96
		bodyModel[68] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 134
		bodyModel[69] = new ModelRendererTurbo(this, 1, 46, textureX, textureY); // Box 135
		bodyModel[70] = new ModelRendererTurbo(this, 1, 46, textureX, textureY); // Box 88
		bodyModel[71] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "cull"); // Box 90 rolly cully
		bodyModel[72] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "cull"); // Box 91 rolly cully
		bodyModel[73] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 121
		bodyModel[74] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 122
		bodyModel[75] = new ModelRendererTurbo(this, 36, 31, textureX, textureY); // Box 123
		bodyModel[76] = new ModelRendererTurbo(this, 42, 34, textureX, textureY); // Box 124
		bodyModel[77] = new ModelRendererTurbo(this, 36, 34, textureX, textureY); // Box 125
		bodyModel[78] = new ModelRendererTurbo(this, 36, 34, textureX, textureY); // Box 126
		bodyModel[79] = new ModelRendererTurbo(this, 42, 34, textureX, textureY); // Box 127
		bodyModel[80] = new ModelRendererTurbo(this, 42, 34, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 36, 34, textureX, textureY); // Box 129
		bodyModel[82] = new ModelRendererTurbo(this, 36, 31, textureX, textureY); // Box 130
		bodyModel[83] = new ModelRendererTurbo(this, 42, 34, textureX, textureY); // Box 131
		bodyModel[84] = new ModelRendererTurbo(this, 36, 34, textureX, textureY); // Box 132
		bodyModel[85] = new ModelRendererTurbo(this, 33, 4, textureX, textureY); // Box 133
		bodyModel[86] = new ModelRendererTurbo(this, 40, 1, textureX, textureY); // Box 134
		bodyModel[87] = new ModelRendererTurbo(this, 31, 1, textureX, textureY); // Box 135
		bodyModel[88] = new ModelRendererTurbo(this, 26, 1, textureX, textureY); // Box 136
		bodyModel[89] = new ModelRendererTurbo(this, 26, 4, textureX, textureY); // Box 137
		bodyModel[90] = new ModelRendererTurbo(this, 26, 7, textureX, textureY); // Box 138
		bodyModel[91] = new ModelRendererTurbo(this, 26, 7, textureX, textureY); // Box 139
		bodyModel[92] = new ModelRendererTurbo(this, 25, 12, textureX, textureY); // Box 140
		bodyModel[93] = new ModelRendererTurbo(this, 60, 7, textureX, textureY); // Box 141
		bodyModel[94] = new ModelRendererTurbo(this, 59, 12, textureX, textureY); // Box 142
		bodyModel[95] = new ModelRendererTurbo(this, 60, 7, textureX, textureY); // Box 143
		bodyModel[96] = new ModelRendererTurbo(this, 60, 4, textureX, textureY); // Box 144
		bodyModel[97] = new ModelRendererTurbo(this, 60, 1, textureX, textureY); // Box 145
		bodyModel[98] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 146
		bodyModel[99] = new ModelRendererTurbo(this, 46, 1, textureX, textureY); // Box 147
		bodyModel[100] = new ModelRendererTurbo(this, 42, 8, textureX, textureY); // Box 148
		bodyModel[101] = new ModelRendererTurbo(this, 37, 8, textureX, textureY); // Box 149
		bodyModel[102] = new ModelRendererTurbo(this, 32, 8, textureX, textureY); // Box 150
		bodyModel[103] = new ModelRendererTurbo(this, 49, 8, textureX, textureY); // Box 151
		bodyModel[104] = new ModelRendererTurbo(this, 54, 8, textureX, textureY); // Box 152
		bodyModel[105] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 153
		bodyModel[106] = new ModelRendererTurbo(this, 34, 25, textureX, textureY); // Box 154
		bodyModel[107] = new ModelRendererTurbo(this, 38, 21, textureX, textureY); // Box 155
		bodyModel[108] = new ModelRendererTurbo(this, 38, 17, textureX, textureY); // Box 156
		bodyModel[109] = new ModelRendererTurbo(this, 38, 14, textureX, textureY); // Box 157
		bodyModel[110] = new ModelRendererTurbo(this, 31, 14, textureX, textureY); // Box 158
		bodyModel[111] = new ModelRendererTurbo(this, 48, 21, textureX, textureY); // Box 159
		bodyModel[112] = new ModelRendererTurbo(this, 48, 17, textureX, textureY); // Box 160
		bodyModel[113] = new ModelRendererTurbo(this, 48, 14, textureX, textureY); // Box 161
		bodyModel[114] = new ModelRendererTurbo(this, 53, 14, textureX, textureY); // Box 162

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[0].setRotationPoint(7F, 7F, 6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[1].setRotationPoint(-7F, 7F, 6F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[2].setRotationPoint(-7F, 7F, -6F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[3].setRotationPoint(7F, 7F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[4].setRotationPoint(-8F, 6F, -9F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[5].setRotationPoint(6F, 6F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84 fric
		bodyModel[6].setRotationPoint(-8F, 6F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173 rolly
		bodyModel[7].setRotationPoint(-8F, 6F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 69 rolly
		bodyModel[8].setRotationPoint(-8F, 6F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 12 rolly
		bodyModel[9].setRotationPoint(6F, 6F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 13 rolly
		bodyModel[10].setRotationPoint(6F, 6F, 8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[11].setRotationPoint(-6F, 5F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 53
		bodyModel[12].setRotationPoint(-6F, 6F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F); // Box 48
		bodyModel[13].setRotationPoint(-6F, 7F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 47
		bodyModel[14].setRotationPoint(-5F, 7F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 21
		bodyModel[15].setRotationPoint(-8F, 5F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 22 rolly cully
		bodyModel[16].setRotationPoint(-8F, 6F, -9.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 23 fricc
		bodyModel[17].setRotationPoint(6F, 6F, -9.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 24
		bodyModel[18].setRotationPoint(-8F, 6F, 8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 25
		bodyModel[19].setRotationPoint(6F, 6F, 8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 26 rolly cully
		bodyModel[20].setRotationPoint(6F, 6F, -9.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[21].setRotationPoint(-5.5F, 4.5F, -8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 59
		bodyModel[22].setRotationPoint(-9.5F, 5.5F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F); // Box 88
		bodyModel[23].setRotationPoint(-9.5F, 5F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 32
		bodyModel[24].setRotationPoint(-5.5F, 6.5F, -8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 89
		bodyModel[25].setRotationPoint(-8.5F, 4.5F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		bodyModel[26].setRotationPoint(-5.5F, 4.5F, -8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 36
		bodyModel[27].setRotationPoint(-9F, 4.5F, -8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 71
		bodyModel[28].setRotationPoint(-10.5F, 5F, -7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
		bodyModel[29].setRotationPoint(-10.5F, 6F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[30].setRotationPoint(-10.5F, 5F, 5.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 142
		bodyModel[31].setRotationPoint(-8F, 8.5F, -8.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 71
		bodyModel[32].setRotationPoint(-1F, 6.5F, -8.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 184
		bodyModel[33].setRotationPoint(-1.5F, 3.5F, -7.5F);
		bodyModel[33].rotateAngleX = -0.78539816F;

		bodyModel[34].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 46
		bodyModel[34].setRotationPoint(-3F, 4F, -7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
		bodyModel[35].setRotationPoint(-3.5F, 4.5F, -7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 48
		bodyModel[36].setRotationPoint(-4.75F, 4.5F, -9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 49
		bodyModel[37].setRotationPoint(3.75F, 4.5F, -9.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 50
		bodyModel[38].setRotationPoint(5F, 7F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 51
		bodyModel[39].setRotationPoint(5F, 6F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[40].setRotationPoint(5F, 5F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[41].setRotationPoint(6F, 5F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[42].setRotationPoint(5.5F, 4.5F, -8.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55
		bodyModel[43].setRotationPoint(8F, 4.5F, -8.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F); // Box 56
		bodyModel[44].setRotationPoint(8.5F, 5F, -8.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		bodyModel[45].setRotationPoint(4.5F, 4.5F, -8.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 58
		bodyModel[46].setRotationPoint(4.5F, 6.5F, -8.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 59
		bodyModel[47].setRotationPoint(8.5F, 5.5F, -8.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 60
		bodyModel[48].setRotationPoint(6F, 8.5F, -8.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 61
		bodyModel[49].setRotationPoint(9.5F, 5F, -7.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 62
		bodyModel[50].setRotationPoint(9.5F, 6F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[51].setRotationPoint(9.5F, 5F, 5.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -1.5F, 0.1F, 0.1F, -1.5F, 0.1F, 0.1F, -1.5F, 0.1F, 0.1F, -1.5F, 0.1F); // Box 137
		bodyModel[52].setRotationPoint(-4.75F, 6F, -8.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -1.5F, 0.1F, 0.1F, -1.5F, 0.1F, 0.1F, -1.5F, 0.1F, 0.1F, -1.5F, 0.1F); // Box 65
		bodyModel[53].setRotationPoint(3.75F, 6F, -8.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[54].setRotationPoint(-11F, 8F, -7.25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 136
		bodyModel[55].setRotationPoint(9.5F, 7F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 137
		bodyModel[56].setRotationPoint(10F, 5F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 149
		bodyModel[57].setRotationPoint(-11F, 5F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 150
		bodyModel[58].setRotationPoint(-10.5F, 7F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 76
		bodyModel[59].setRotationPoint(-3.5F, 7F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 77
		bodyModel[60].setRotationPoint(-3F, 5F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 78
		bodyModel[61].setRotationPoint(2F, 5F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 79
		bodyModel[62].setRotationPoint(2.5F, 7F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[63].setRotationPoint(2F, 8F, -7.25F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 372
		bodyModel[64].setRotationPoint(-2F, 4.5F, -2F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 121
		bodyModel[65].setRotationPoint(-1.5F, 4.5F, -6F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 122
		bodyModel[66].setRotationPoint(-1.5F, 4.5F, 5F);

		bodyModel[67].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 96
		bodyModel[67].setRotationPoint(-2.5F, 5.5F, -7F);

		bodyModel[68].addBox(0F, 0F, 0F, 12, 4, 10, 0F); // Box 134
		bodyModel[68].setRotationPoint(-6F, 5F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[69].setRotationPoint(-9F, 6F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 88
		bodyModel[70].setRotationPoint(6F, 6F, -5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 90 rolly cully
		bodyModel[71].setRotationPoint(-8F, 6F, 8.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 91 rolly cully
		bodyModel[72].setRotationPoint(6F, 6F, 8.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 121
		bodyModel[73].setRotationPoint(-3F, 4F, 7.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 122
		bodyModel[74].setRotationPoint(-1.5F, 3.5F, 7.5F);
		bodyModel[74].rotateAngleX = -0.78539816F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 123
		bodyModel[75].setRotationPoint(2F, 8F, 6.25F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 124
		bodyModel[76].setRotationPoint(2.5F, 7F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 125
		bodyModel[77].setRotationPoint(2F, 5F, 6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 126
		bodyModel[78].setRotationPoint(10F, 5F, 5.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 127
		bodyModel[79].setRotationPoint(9.5F, 7F, 5.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[80].setRotationPoint(-3.5F, 7F, 6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 129
		bodyModel[81].setRotationPoint(-3F, 5F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 130
		bodyModel[82].setRotationPoint(-11F, 8F, 6.25F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 131
		bodyModel[83].setRotationPoint(-10.5F, 7F, 5.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 132
		bodyModel[84].setRotationPoint(-11F, 5F, 5.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[85].setRotationPoint(-5.5F, 4.5F, 7.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 134
		bodyModel[86].setRotationPoint(-5.5F, 4.5F, 7.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 135
		bodyModel[87].setRotationPoint(-8.5F, 4.5F, 7.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 136
		bodyModel[88].setRotationPoint(-9F, 4.5F, 7.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[89].setRotationPoint(-9.5F, 5F, 7.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 138
		bodyModel[90].setRotationPoint(-9.5F, 5.5F, 7.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 139
		bodyModel[91].setRotationPoint(-5.5F, 6.5F, 7.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 140
		bodyModel[92].setRotationPoint(-8F, 8.5F, 7.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 141
		bodyModel[93].setRotationPoint(4.5F, 6.5F, 7.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 142
		bodyModel[94].setRotationPoint(6F, 8.5F, 7.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 143
		bodyModel[95].setRotationPoint(8.5F, 5.5F, 7.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 144
		bodyModel[96].setRotationPoint(8.5F, 5F, 7.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 145
		bodyModel[97].setRotationPoint(8F, 4.5F, 7.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[98].setRotationPoint(5.5F, 4.5F, 7.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147
		bodyModel[99].setRotationPoint(4.5F, 4.5F, 7.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 148
		bodyModel[100].setRotationPoint(-1F, 6.5F, 7.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -1.5F, 0.1F, 0.1F, -1.5F, 0.1F, 0.1F, -1.5F, 0.1F, 0.1F, -1.5F, 0.1F); // Box 149
		bodyModel[101].setRotationPoint(-4.75F, 6F, 7.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 150
		bodyModel[102].setRotationPoint(-4.75F, 4.5F, 8.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -1.5F, 0.1F, 0.1F, -1.5F, 0.1F, 0.1F, -1.5F, 0.1F, 0.1F, -1.5F, 0.1F); // Box 151
		bodyModel[103].setRotationPoint(3.75F, 6F, 7.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 152
		bodyModel[104].setRotationPoint(3.75F, 4.5F, 8.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[105].setRotationPoint(-3.5F, 4.5F, 6.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[106].setRotationPoint(-5F, 7F, 8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 155
		bodyModel[107].setRotationPoint(-6F, 7F, 8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 156
		bodyModel[108].setRotationPoint(-6F, 6F, 8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[109].setRotationPoint(-6F, 5F, 8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 158
		bodyModel[110].setRotationPoint(-8F, 5F, 8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[111].setRotationPoint(5F, 7F, 8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 160
		bodyModel[112].setRotationPoint(5F, 6F, 8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[113].setRotationPoint(5F, 5F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[114].setRotationPoint(6F, 5F, 8F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 115; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
	}
}