//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CF7 anglecab
// Model Creator: bida
// Created on: 15.11.2017 - 19:11:37
// Last changed on: 15.11.2017 - 19:11:37

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

import java.util.ArrayList;

public class ModelCF7_H_Angle extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelCF7_H_Angle() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[129];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 84, 116, textureX, textureY); // Box 31
		bodyModel[1] = new ModelRendererTurbo(this, 78, 100, textureX, textureY); // Box 33
		bodyModel[2] = new ModelRendererTurbo(this, 84, 91, textureX, textureY); // Box 34
		bodyModel[3] = new ModelRendererTurbo(this, 23, 83, textureX, textureY); // Box 61
		bodyModel[4] = new ModelRendererTurbo(this, 21, 94, textureX, textureY); // Box 162
		bodyModel[5] = new ModelRendererTurbo(this, 16, 84, textureX, textureY); // Box 163
		bodyModel[6] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 164
		bodyModel[7] = new ModelRendererTurbo(this, 45, 95, textureX, textureY); // Box 166
		bodyModel[8] = new ModelRendererTurbo(this, -11, 65, textureX, textureY); // Box 91
		bodyModel[9] = new ModelRendererTurbo(this, 3, 62, textureX, textureY); // Box 93
		bodyModel[10] = new ModelRendererTurbo(this, 42, 115, textureX, textureY); // Box 4
		bodyModel[11] = new ModelRendererTurbo(this, 67, 147, textureX, textureY); // Box 70
		bodyModel[12] = new ModelRendererTurbo(this, 102, 165, textureX, textureY); // Box 72
		bodyModel[13] = new ModelRendererTurbo(this, 38, 165, textureX, textureY); // Box 190
		bodyModel[14] = new ModelRendererTurbo(this, 3, 147, textureX, textureY); // Box 313
		bodyModel[15] = new ModelRendererTurbo(this, 22, 45, textureX, textureY); // Box 53
		bodyModel[16] = new ModelRendererTurbo(this, 13, 45, textureX, textureY); // Box 54
		bodyModel[17] = new ModelRendererTurbo(this, 31, 39, textureX, textureY); // Box 55
		bodyModel[18] = new ModelRendererTurbo(this, 4, 45, textureX, textureY); // Box 235
		bodyModel[19] = new ModelRendererTurbo(this, 31, 59, textureX, textureY); // Box 125
		bodyModel[20] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Box 110
		bodyModel[21] = new ModelRendererTurbo(this, 162, 91, textureX, textureY); // Box 111
		bodyModel[22] = new ModelRendererTurbo(this, 57, 71, textureX, textureY); // Box 73
		bodyModel[23] = new ModelRendererTurbo(this, 72, 67, textureX, textureY); // Box 193
		bodyModel[24] = new ModelRendererTurbo(this, 73, 76, textureX, textureY); // Box 343
		bodyModel[25] = new ModelRendererTurbo(this, 25, 134, textureX, textureY); // Box 135
		bodyModel[26] = new ModelRendererTurbo(this, 4, 156, textureX, textureY, "lamp"); // Box 136 headlight front
		bodyModel[27] = new ModelRendererTurbo(this, 2, 147, textureX, textureY, "lamp"); // Box 137 numberboard
		bodyModel[28] = new ModelRendererTurbo(this, 2, 138, textureX, textureY, "lamp"); // Box 138 numberboard
		bodyModel[29] = new ModelRendererTurbo(this, 70, 192, textureX, textureY); // Box 141
		bodyModel[30] = new ModelRendererTurbo(this, 151, 197, textureX, textureY); // Box 262
		bodyModel[31] = new ModelRendererTurbo(this, 164, 200, textureX, textureY); // Box 263
		bodyModel[32] = new ModelRendererTurbo(this, 171, 197, textureX, textureY); // Box 264
		bodyModel[33] = new ModelRendererTurbo(this, 43, 92, textureX, textureY); // Box 145
		bodyModel[34] = new ModelRendererTurbo(this, 162, 116, textureX, textureY); // Box 146
		bodyModel[35] = new ModelRendererTurbo(this, 126, 94, textureX, textureY); // Box 147
		bodyModel[36] = new ModelRendererTurbo(this, 113, 50, textureX, textureY); // Box 148
		bodyModel[37] = new ModelRendererTurbo(this, 114, 70, textureX, textureY); // Box 153
		bodyModel[38] = new ModelRendererTurbo(this, 126, 114, textureX, textureY); // Box 158
		bodyModel[39] = new ModelRendererTurbo(this, 185, 201, textureX, textureY, "lamp"); // Box 159 headlight rear
		bodyModel[40] = new ModelRendererTurbo(this, 80, 185, textureX, textureY); // Box 160
		bodyModel[41] = new ModelRendererTurbo(this, 121, 187, textureX, textureY); // Box 164
		bodyModel[42] = new ModelRendererTurbo(this, 61, 60, textureX, textureY); // Box 90
		bodyModel[43] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 318
		bodyModel[44] = new ModelRendererTurbo(this, 235, 74, textureX, textureY); // Box 168
		bodyModel[45] = new ModelRendererTurbo(this, 219, 119, textureX, textureY); // Box 169
		bodyModel[46] = new ModelRendererTurbo(this, 210, 65, textureX, textureY); // Box 170
		bodyModel[47] = new ModelRendererTurbo(this, 205, 85, textureX, textureY); // Box 171
		bodyModel[48] = new ModelRendererTurbo(this, 209, 104, textureX, textureY); // Box 172
		bodyModel[49] = new ModelRendererTurbo(this, 214, 50, textureX, textureY); // Box 173
		bodyModel[50] = new ModelRendererTurbo(this, 219, 119, textureX, textureY); // Box 174
		bodyModel[51] = new ModelRendererTurbo(this, 235, 74, textureX, textureY); // Box 175
		bodyModel[52] = new ModelRendererTurbo(this, 4, 183, textureX, textureY); // Box 182
		bodyModel[53] = new ModelRendererTurbo(this, 159, 17, textureX, textureY); // Box 183
		bodyModel[54] = new ModelRendererTurbo(this, 159, 3, textureX, textureY); // Box 184
		bodyModel[55] = new ModelRendererTurbo(this, 5, 83, textureX, textureY); // Box 185
		bodyModel[56] = new ModelRendererTurbo(this, 23, 83, textureX, textureY); // Box 186
		bodyModel[57] = new ModelRendererTurbo(this, 5, 83, textureX, textureY); // Box 187
		bodyModel[58] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Box 191
		bodyModel[59] = new ModelRendererTurbo(this, 80, 185, textureX, textureY); // Box 194
		bodyModel[60] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 195
		bodyModel[61] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 196
		bodyModel[62] = new ModelRendererTurbo(this, 42, 115, textureX, textureY); // Box 204
		bodyModel[63] = new ModelRendererTurbo(this, 38, 95, textureX, textureY); // Box 206
		bodyModel[64] = new ModelRendererTurbo(this, 159, 1, textureX, textureY); // Box 210
		bodyModel[65] = new ModelRendererTurbo(this, 114, 187, textureX, textureY); // Box 211
		bodyModel[66] = new ModelRendererTurbo(this, 114, 187, textureX, textureY); // Box 212
		bodyModel[67] = new ModelRendererTurbo(this, 121, 187, textureX, textureY); // Box 213
		bodyModel[68] = new ModelRendererTurbo(this, 1, 126, textureX, textureY); // Box 214
		bodyModel[69] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 215
		bodyModel[70] = new ModelRendererTurbo(this, 10, 126, textureX, textureY); // Box 216
		bodyModel[71] = new ModelRendererTurbo(this, 166, 1, textureX, textureY); // Box 217
		bodyModel[72] = new ModelRendererTurbo(this, 22, 134, textureX, textureY); // Box 218
		bodyModel[73] = new ModelRendererTurbo(this, 22, 127, textureX, textureY); // Box 219
		bodyModel[74] = new ModelRendererTurbo(this, 26, 130, textureX, textureY); // Box 220
		bodyModel[75] = new ModelRendererTurbo(this, 22, 137, textureX, textureY); // Box 221
		bodyModel[76] = new ModelRendererTurbo(this, 46, 71, textureX, textureY); // Box 222
		bodyModel[77] = new ModelRendererTurbo(this, 37, 71, textureX, textureY); // Box 223
		bodyModel[78] = new ModelRendererTurbo(this, 4, 89, textureX, textureY); // Box 118
		bodyModel[79] = new ModelRendererTurbo(this, 159, 192, textureX, textureY); // Box 119
		bodyModel[80] = new ModelRendererTurbo(this, 159, 15, textureX, textureY); // Box 121
		bodyModel[81] = new ModelRendererTurbo(this, -4, 64, textureX, textureY); // Box 126
		bodyModel[82] = new ModelRendererTurbo(this, -11, 65, textureX, textureY); // Box 130
		bodyModel[83] = new ModelRendererTurbo(this, -4, 64, textureX, textureY); // Box 131
		bodyModel[84] = new ModelRendererTurbo(this, 3, 62, textureX, textureY); // Box 132
		bodyModel[85] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 143
		bodyModel[86] = new ModelRendererTurbo(this, 71, 69, textureX, textureY); // Box 102
		bodyModel[87] = new ModelRendererTurbo(this, 181, 69, textureX, textureY); // Box 103
		bodyModel[88] = new ModelRendererTurbo(this, 92, 65, textureX, textureY); // Box 104
		bodyModel[89] = new ModelRendererTurbo(this, 160, 65, textureX, textureY); // Box 105
		bodyModel[90] = new ModelRendererTurbo(this, 23, 106, textureX, textureY); // Box 107
		bodyModel[91] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 108
		bodyModel[92] = new ModelRendererTurbo(this, 23, 106, textureX, textureY); // Box 109
		bodyModel[93] = new ModelRendererTurbo(this, 24, 144, textureX, textureY, "lamp"); // Box 110 beacon
		bodyModel[94] = new ModelRendererTurbo(this, 42, 103, textureX, textureY); // Box 111
		bodyModel[95] = new ModelRendererTurbo(this, 38, 127, textureX, textureY); // Box 101
		bodyModel[96] = new ModelRendererTurbo(this, 38, 121, textureX, textureY); // Box 102
		bodyModel[97] = new ModelRendererTurbo(this, 66, 139, textureX, textureY); // Box 184 03 generator
		bodyModel[98] = new ModelRendererTurbo(this, 67, 131, textureX, textureY, "cull"); // Box 104 antella plate cull
		bodyModel[99] = new ModelRendererTurbo(this, 10, 132, textureX, textureY); // Box 105
		bodyModel[100] = new ModelRendererTurbo(this, 1, 135, textureX, textureY); // Box 106
		bodyModel[101] = new ModelRendererTurbo(this, 1, 132, textureX, textureY); // Box 107
		bodyModel[102] = new ModelRendererTurbo(this, 67, 123, textureX, textureY, "cull"); // Box 108 antenna plate cull
		bodyModel[103] = new ModelRendererTurbo(this, 30, 12, textureX, textureY); // Box 4
		bodyModel[104] = new ModelRendererTurbo(this, 30, 12, textureX, textureY); // Box 102
		bodyModel[105] = new ModelRendererTurbo(this, 37, 31, textureX, textureY); // Box 47 wheel
		bodyModel[106] = new ModelRendererTurbo(this, 37, 31, textureX, textureY); // Box 46 wheel
		bodyModel[107] = new ModelRendererTurbo(this, 37, 31, textureX, textureY); // Box 47 wheel
		bodyModel[108] = new ModelRendererTurbo(this, 37, 31, textureX, textureY); // Box 46 wheel
		bodyModel[109] = new ModelRendererTurbo(this, 1, 22, textureX, textureY); // Box 108
		bodyModel[110] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 111
		bodyModel[112] = new ModelRendererTurbo(this, 34, 22, textureX, textureY); // Box 112
		bodyModel[113] = new ModelRendererTurbo(this, 34, 22, textureX, textureY); // Box 113
		bodyModel[114] = new ModelRendererTurbo(this, 34, 16, textureX, textureY); // Box 114
		bodyModel[115] = new ModelRendererTurbo(this, 34, 16, textureX, textureY); // Box 115
		bodyModel[116] = new ModelRendererTurbo(this, 30, 12, textureX, textureY); // Box 4
		bodyModel[117] = new ModelRendererTurbo(this, 30, 12, textureX, textureY); // Box 102
		bodyModel[118] = new ModelRendererTurbo(this, 37, 31, textureX, textureY); // Box 47 wheel
		bodyModel[119] = new ModelRendererTurbo(this, 37, 31, textureX, textureY); // Box 46 wheel
		bodyModel[120] = new ModelRendererTurbo(this, 37, 31, textureX, textureY); // Box 47 wheel
		bodyModel[121] = new ModelRendererTurbo(this, 37, 31, textureX, textureY); // Box 46 wheel
		bodyModel[122] = new ModelRendererTurbo(this, 1, 22, textureX, textureY); // Box 108
		bodyModel[123] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 110
		bodyModel[124] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 111
		bodyModel[125] = new ModelRendererTurbo(this, 34, 22, textureX, textureY); // Box 112
		bodyModel[126] = new ModelRendererTurbo(this, 34, 22, textureX, textureY); // Box 113
		bodyModel[127] = new ModelRendererTurbo(this, 34, 16, textureX, textureY); // Box 114
		bodyModel[128] = new ModelRendererTurbo(this, 34, 16, textureX, textureY); // Box 115

		bodyModel[0].addBox(0F, 0F, 0F, 17, 2, 4, 0F); // Box 31
		bodyModel[0].setRotationPoint(-24F, 1F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 56, 3, 10, 0F); // Box 33
		bodyModel[1].setRotationPoint(-28F, 1F, -5F);

		bodyModel[2].addBox(0F, 0F, 0F, 17, 2, 4, 0F); // Box 34
		bodyModel[2].setRotationPoint(-24F, 1F, 5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 61
		bodyModel[3].setRotationPoint(-24F, 3F, -9F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 162
		bodyModel[4].setRotationPoint(-30F, 1F, 1F);
		bodyModel[4].rotateAngleY = -0.15707963F;

		bodyModel[5].addBox(0F, 0F, -1F, 1, 2, 2, 0F); // Box 163
		bodyModel[5].setRotationPoint(-30F, 1F, 0F);

		bodyModel[6].addBox(0F, 0F, -6F, 1, 2, 6, 0F); // Box 164
		bodyModel[6].setRotationPoint(-30F, 1F, -1F);
		bodyModel[6].rotateAngleY = 0.15707963F;

		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 166
		bodyModel[7].setRotationPoint(-29F, -2F, -4F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 0, 14, 0F); // Box 91
		bodyModel[8].setRotationPoint(-28F, 2F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 0, 18, 0F); // Box 93
		bodyModel[9].setRotationPoint(-28F, 8F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 8, 2, 3, 0F); // Box 4
		bodyModel[10].setRotationPoint(-31F, 4F, -1.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 18, 16, 0F); // Box 70
		bodyModel[11].setRotationPoint(-8F, -17F, -8F);

		bodyModel[12].addBox(0F, 0F, 0F, 13, 15, 1, 0F); // Box 72
		bodyModel[12].setRotationPoint(-20F, -14F, 8F);

		bodyModel[13].addBox(0F, 0F, 0F, 13, 15, 1, 0F); // Box 190
		bodyModel[13].setRotationPoint(-20F, -14F, -9F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 18, 16, 0F); // Box 313
		bodyModel[14].setRotationPoint(-20F, -17F, -8F);

		bodyModel[15].addBox(0F, 0F, -3F, 1, 10, 3, 0F); // Box 53
		bodyModel[15].setRotationPoint(-26F, -9F, -1.5F);
		bodyModel[15].rotateAngleY = 0.29670597F;

		bodyModel[16].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 54
		bodyModel[16].setRotationPoint(-26F, -9F, -1.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 5, 10, 9, 0F); // Box 55
		bodyModel[17].setRotationPoint(-25F, -9F, -4.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 235
		bodyModel[18].setRotationPoint(-26F, -9F, 1.5F);
		bodyModel[18].rotateAngleY = -0.29670597F;

		bodyModel[19].addBox(0F, 0F, 0F, 5, 1, 9, 0F); // Box 125
		bodyModel[19].setRotationPoint(-25F, -9F, -4.5F);
		bodyModel[19].rotateAngleZ = 0.12217305F;

		bodyModel[20].addBox(0F, 0F, 0F, 0, 16, 18, 0F); // Box 110
		bodyModel[20].setRotationPoint(-28.01F, -7F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 17, 2, 4, 0F); // Box 111
		bodyModel[21].setRotationPoint(7F, 1F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 73
		bodyModel[22].setRotationPoint(-24F, -2F, 4F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 193
		bodyModel[23].setRotationPoint(-22F, -2F, -9F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 343
		bodyModel[24].setRotationPoint(-23F, -1F, -9F);

		bodyModel[25].addBox(0F, 0F, 0F, 13, 1, 14, 0F); // Box 135
		bodyModel[25].setRotationPoint(-20F, -18F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 136 headlight front
		bodyModel[26].setRotationPoint(-22F, -18F, -1F);

		bodyModel[27].addBox(0F, 0F, -4F, 2, 4, 4, 0F); // Box 137 numberboard
		bodyModel[27].setRotationPoint(-22F, -18F, -1F);
		bodyModel[27].rotateAngleY = 0.52359878F;

		bodyModel[28].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 138 numberboard
		bodyModel[28].setRotationPoint(-22F, -18F, 1F);
		bodyModel[28].rotateAngleY = -0.52359878F;

		bodyModel[29].addBox(0F, 0F, 0F, 30, 17, 10, 0F); // Box 141
		bodyModel[29].setRotationPoint(-7F, -16F, -5F);

		bodyModel[30].addBox(-1F, 0F, -5F, 1, 17, 5, 0F); // Box 262
		bodyModel[30].setRotationPoint(26F, -16F, -1F);
		bodyModel[30].rotateAngleY = -0.64577182F;

		bodyModel[31].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 263
		bodyModel[31].setRotationPoint(25F, -16F, -1F);

		bodyModel[32].addBox(-1F, 0F, 0F, 1, 17, 5, 0F); // Box 264
		bodyModel[32].setRotationPoint(26F, -16F, 1F);
		bodyModel[32].rotateAngleY = 0.64577182F;

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // Box 145
		bodyModel[33].setRotationPoint(28F, 1F, -4.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 17, 2, 4, 0F); // Box 146
		bodyModel[34].setRotationPoint(7F, 1F, 5F);

		bodyModel[35].addBox(0F, 0F, 0F, 14, 1, 4, 0F); // Box 147
		bodyModel[35].setRotationPoint(-7F, 1F, -9F);

		bodyModel[36].addBox(0F, 0F, 0F, 14, 1, 18, 0F); // Box 148
		bodyModel[36].setRotationPoint(-7F, 4F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 14, 2, 17, 0F); // Box 153
		bodyModel[37].setRotationPoint(-7F, 2F, -8.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 14, 1, 4, 0F); // Box 158
		bodyModel[38].setRotationPoint(-7F, 1F, 5F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 159 headlight rear
		bodyModel[39].setRotationPoint(25.5F, -15F, -1F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 160
		bodyModel[40].setRotationPoint(-6F, -17F, -2F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 164
		bodyModel[41].setRotationPoint(5.5F, -17F, -1F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 90
		bodyModel[42].setRotationPoint(-7F, -2F, 5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[43].setRotationPoint(-6F, -1F, 5F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 3, 2, 0F); // Box 168
		bodyModel[44].setRotationPoint(-6.5F, 7F, -8F);
		bodyModel[44].rotateAngleX = 0.82030475F;

		bodyModel[45].addBox(0F, 0F, 0F, 9, 3, 2, 0F); // Box 169
		bodyModel[45].setRotationPoint(-2F, 7F, -8F);
		bodyModel[45].rotateAngleX = 0.82030475F;

		bodyModel[46].addBox(0F, 0F, 0F, 4, 2, 16, 0F); // Box 170
		bodyModel[46].setRotationPoint(-6.5F, 5F, -8F);

		bodyModel[47].addBox(0F, 0F, 0F, 9, 2, 16, 0F); // Box 171
		bodyModel[47].setRotationPoint(-2F, 5F, -8F);

		bodyModel[48].addBox(0F, 0F, 0F, 9, 2, 12, 0F); // Box 172
		bodyModel[48].setRotationPoint(-2F, 7F, -6F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 173
		bodyModel[49].setRotationPoint(-6.5F, 7F, -6F);

		bodyModel[50].addBox(0F, 0F, -2F, 9, 3, 2, 0F); // Box 174
		bodyModel[50].setRotationPoint(-2F, 7F, 8F);
		bodyModel[50].rotateAngleX = -0.82030475F;

		bodyModel[51].addBox(0F, 0F, -2F, 4, 3, 2, 0F); // Box 175
		bodyModel[51].setRotationPoint(-6.5F, 7F, 8F);
		bodyModel[51].rotateAngleX = -0.82030475F;

		bodyModel[52].addBox(0F, 0F, 0F, 1, 7, 6, 0F); // Box 182
		bodyModel[52].setRotationPoint(-19F, -10F, -3F);

		bodyModel[53].addBox(0F, 0F, 0F, 48, 11, 0, 0F); // Box 183
		bodyModel[53].setRotationPoint(-24F, -10F, -9F);

		bodyModel[54].addBox(0F, 0F, 0F, 48, 11, 0, 0F); // Box 184
		bodyModel[54].setRotationPoint(-24F, -10F, 9F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 185
		bodyModel[55].setRotationPoint(-24F, 3F, 5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 186
		bodyModel[56].setRotationPoint(24F, 3F, 9F);
		bodyModel[56].rotateAngleY = -3.14159265F;

		bodyModel[57].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 187
		bodyModel[57].setRotationPoint(24F, 3F, -5F);
		bodyModel[57].rotateAngleY = -3.14159265F;

		bodyModel[58].addBox(0F, 0F, 0F, 0, 16, 18, 0F); // Box 191
		bodyModel[58].setRotationPoint(28.01F, -7F, -9F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 194
		bodyModel[59].setRotationPoint(-1.5F, -17F, -2F);

		bodyModel[60].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 195
		bodyModel[60].setRotationPoint(18F, -17F, -2F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 196
		bodyModel[61].setRotationPoint(13.5F, -17F, -2F);

		bodyModel[62].addBox(-8F, 0F, 0F, 8, 2, 3, 0F); // Box 204
		bodyModel[62].setRotationPoint(23F, 4F, 1.5F);
		bodyModel[62].rotateAngleY = -3.14159265F;

		bodyModel[63].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 206
		bodyModel[63].setRotationPoint(29F, -2F, 4F);
		bodyModel[63].rotateAngleY = -3.14159265F;

		bodyModel[64].addBox(0F, -1F, 0F, 3, 1, 0, 0F); // Box 210
		bodyModel[64].setRotationPoint(-23.25F, -7F, 9F);
		bodyModel[64].rotateAngleZ = 0.85521133F;

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 211
		bodyModel[65].setRotationPoint(7.5F, -17F, -1F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 212
		bodyModel[66].setRotationPoint(9.5F, -17F, -1F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 213
		bodyModel[67].setRotationPoint(11.5F, -17F, -1F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 214
		bodyModel[68].setRotationPoint(-23.5F, -20F, 0.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 215
		bodyModel[69].setRotationPoint(-23F, -20F, -1.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 216
		bodyModel[70].setRotationPoint(-21.5F, -20F, -0.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 217
		bodyModel[71].setRotationPoint(-6F, -10F, 9F);
		bodyModel[71].rotateAngleZ = -0.6981317F;

		bodyModel[72].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 218
		bodyModel[72].setRotationPoint(-11F, -19.5F, -6F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 219
		bodyModel[73].setRotationPoint(-19F, -19.5F, 5F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 220
		bodyModel[74].setRotationPoint(-17F, -18.5F, 5F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 221
		bodyModel[75].setRotationPoint(-11F, -18.5F, -6F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 11, 0, 0F); // Box 222
		bodyModel[76].setRotationPoint(-25.75F, -10F, -3.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 11, 0, 0F); // Box 223
		bodyModel[77].setRotationPoint(-25.75F, -10F, 3.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 118
		bodyModel[78].setRotationPoint(-29F, 1F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 119
		bodyModel[79].setRotationPoint(23F, -16F, -3F);

		bodyModel[80].addBox(0F, -1F, 0F, 3, 1, 0, 0F); // Box 121
		bodyModel[80].setRotationPoint(-23.25F, -7F, -9F);
		bodyModel[80].rotateAngleZ = 0.85521133F;

		bodyModel[81].addBox(0F, 0F, 0F, 4, 0, 16, 0F); // Box 126
		bodyModel[81].setRotationPoint(-28F, 5F, -8F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 0, 14, 0F); // Box 130
		bodyModel[82].setRotationPoint(24F, 2F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 0, 16, 0F); // Box 131
		bodyModel[83].setRotationPoint(24F, 5F, -8F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 0, 18, 0F); // Box 132
		bodyModel[84].setRotationPoint(24F, 8F, -9F);

		bodyModel[85].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 143
		bodyModel[85].setRotationPoint(-28F, -0.3F, -8.15F);
		bodyModel[85].rotateAngleY = -1.57079633F;
		bodyModel[85].rotateAngleZ = 2.02458193F;

		bodyModel[86].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 102
		bodyModel[86].setRotationPoint(-8F, 3F, -9F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 103
		bodyModel[87].setRotationPoint(7F, 3F, -9F);

		bodyModel[88].addBox(-1F, 0F, 0F, 1, 3, 18, 0F); // Box 104
		bodyModel[88].setRotationPoint(-7F, 5F, -9F);
		bodyModel[88].rotateAngleZ = -2.30383461F;

		bodyModel[89].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 105
		bodyModel[89].setRotationPoint(7F, 5F, -9F);
		bodyModel[89].rotateAngleZ = 2.30383461F;

		bodyModel[90].addBox(-7F, 0F, 0F, 7, 1, 0, 0F); // Box 107
		bodyModel[90].setRotationPoint(-28F, -0.3F, 8.15F);
		bodyModel[90].rotateAngleY = -1.57079633F;
		bodyModel[90].rotateAngleZ = -2.02458193F;

		bodyModel[91].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 108
		bodyModel[91].setRotationPoint(28F, -0.3F, -8.15F);
		bodyModel[91].rotateAngleY = -1.57079633F;
		bodyModel[91].rotateAngleZ = 2.02458193F;

		bodyModel[92].addBox(-7F, 0F, 0F, 7, 1, 0, 0F); // Box 109
		bodyModel[92].setRotationPoint(28F, -0.3F, 8.15F);
		bodyModel[92].rotateAngleY = -1.57079633F;
		bodyModel[92].rotateAngleZ = -2.02458193F;

		bodyModel[93].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 110 beacon
		bodyModel[93].setRotationPoint(-19F, -19F, -6F);

		bodyModel[94].addBox(-2F, -1F, 0F, 2, 1, 9, 0F); // Box 111
		bodyModel[94].setRotationPoint(29F, 2F, -4.5F);
		bodyModel[94].rotateAngleZ = 0.62831853F;

		bodyModel[95].addBox(0F, 0F, 0F, 13, 5, 1, 0F); // Box 101
		bodyModel[95].setRotationPoint(-20F, -18F, -7F);
		bodyModel[95].rotateAngleX = -0.4712389F;

		bodyModel[96].addBox(0F, 0F, -1F, 13, 5, 1, 0F); // Box 102
		bodyModel[96].setRotationPoint(-20F, -18F, 7F);
		bodyModel[96].rotateAngleX = 0.4712389F;

		bodyModel[97].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 184 03 generator
		bodyModel[97].setRotationPoint(-16F, -20F, -3F);

		bodyModel[98].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 104 antella plate cull
		bodyModel[98].setRotationPoint(-20.5F, -20F, -2.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 105
		bodyModel[99].setRotationPoint(-18.5F, -19.5F, 5F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 106
		bodyModel[100].setRotationPoint(-20F, -19.5F, 4F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 107
		bodyModel[101].setRotationPoint(-20.5F, -19.5F, 6F);

		bodyModel[102].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 108 antenna plate cull
		bodyModel[102].setRotationPoint(-11.5F, -20F, -2.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 4
		bodyModel[103].setRotationPoint(-20.5F, 6F, -8F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 102
		bodyModel[104].setRotationPoint(-11.5F, 6F, -8F);

		bodyModel[105].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[105].setRotationPoint(-19.5F, 7F, -5.5F);

		bodyModel[106].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[106].setRotationPoint(-19.5F, 7F, 5.5F);

		bodyModel[107].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[107].setRotationPoint(-10.5F, 7F, -5.5F);

		bodyModel[108].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[108].setRotationPoint(-10.5F, 7F, 5.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 15, 4, 1, 0F); // Box 108
		bodyModel[109].setRotationPoint(-22.5F, 5F, -7F);

		bodyModel[110].addBox(0F, 0F, 0F, 15, 4, 1, 0F); // Box 110
		bodyModel[110].setRotationPoint(-22.5F, 5F, 6F);

		bodyModel[111].addBox(0F, 0F, 0F, 13, 5, 9, 0F); // Box 111
		bodyModel[111].setRotationPoint(-21.5F, 4F, -4.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 112
		bodyModel[112].setRotationPoint(-19.5F, 4F, -8F);

		bodyModel[113].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 113
		bodyModel[113].setRotationPoint(-12.5F, 4F, -8F);

		bodyModel[114].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 114
		bodyModel[114].setRotationPoint(-12.5F, 4F, 6F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 115
		bodyModel[115].setRotationPoint(-19.5F, 4F, 6F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 4
		bodyModel[116].setRotationPoint(9.5F, 6F, -8F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 102
		bodyModel[117].setRotationPoint(18.5F, 6F, -8F);

		bodyModel[118].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[118].setRotationPoint(10.5F, 7F, -5.5F);

		bodyModel[119].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[119].setRotationPoint(10.5F, 7F, 5.5F);

		bodyModel[120].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[120].setRotationPoint(19.5F, 7F, -5.5F);

		bodyModel[121].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[121].setRotationPoint(19.5F, 7F, 5.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 15, 4, 1, 0F); // Box 108
		bodyModel[122].setRotationPoint(7.5F, 5F, -7F);

		bodyModel[123].addBox(0F, 0F, 0F, 15, 4, 1, 0F); // Box 110
		bodyModel[123].setRotationPoint(7.5F, 5F, 6F);

		bodyModel[124].addBox(0F, 0F, 0F, 13, 5, 9, 0F); // Box 111
		bodyModel[124].setRotationPoint(8.5F, 4F, -4.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 112
		bodyModel[125].setRotationPoint(10.5F, 4F, -8F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 113
		bodyModel[126].setRotationPoint(17.5F, 4F, -8F);

		bodyModel[127].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 114
		bodyModel[127].setRotationPoint(17.5F, 4F, 6F);

		bodyModel[128].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 115
		bodyModel[128].setRotationPoint(10.5F, 4F, 6F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				m.render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if(m.boxName.equals("cull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			}else{
				m.render(f5);
			}
		}
	}

	public float[] getTrans() {
		return new float[]{-1.0F, 0.15F, 0.00F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.90D, 1.40D, 0.0D});
			}
		};
	}
}