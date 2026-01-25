//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.08.2025 - 09:52:46
// Last changed on: 10.08.2025 - 09:52:46

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelAndrews_Truck;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelSP_B50_AAR extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelSP_B50_AAR() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[190];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 23, 13, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 43, textureX, textureY); // Box 87
		bodyModel[2] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 111, 23, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 23, 13, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 24, 53, textureX, textureY, "cull"); // Box cull brake stand thingy
		bodyModel[7] = new ModelRendererTurbo(this, 6, 1, textureX, textureY); // Box 80
		bodyModel[8] = new ModelRendererTurbo(this, 27, 1, textureX, textureY); // Box 81
		bodyModel[9] = new ModelRendererTurbo(this, 32, 46, textureX, textureY); // Box 87
		bodyModel[10] = new ModelRendererTurbo(this, 2, 29, textureX, textureY); // Box 286
		bodyModel[11] = new ModelRendererTurbo(this, 2, 26, textureX, textureY); // Box 287
		bodyModel[12] = new ModelRendererTurbo(this, 13, 34, textureX, textureY); // Box 118
		bodyModel[13] = new ModelRendererTurbo(this, 14, 31, textureX, textureY); // Box 119
		bodyModel[14] = new ModelRendererTurbo(this, -6, 15, textureX, textureY); // Box 196
		bodyModel[15] = new ModelRendererTurbo(this, 5, 21, textureX, textureY); // Box 199
		bodyModel[16] = new ModelRendererTurbo(this, -1, 44, textureX, textureY); // Box 122
		bodyModel[17] = new ModelRendererTurbo(this, -12, 39, textureX, textureY); // Box 124
		bodyModel[18] = new ModelRendererTurbo(this, 4, 41, textureX, textureY, "cull"); // Box cull brakebits
		bodyModel[19] = new ModelRendererTurbo(this, 1, 24, textureX, textureY); // Box 202
		bodyModel[20] = new ModelRendererTurbo(this, 3, 39, textureX, textureY); // Box 128
		bodyModel[21] = new ModelRendererTurbo(this, 22, 32, textureX, textureY, "cull"); // Box cull brakebits
		bodyModel[22] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 302
		bodyModel[23] = new ModelRendererTurbo(this, 31, 26, textureX, textureY); // Box 42
		bodyModel[24] = new ModelRendererTurbo(this, 31, 15, textureX, textureY); // Box 215
		bodyModel[25] = new ModelRendererTurbo(this, 85, 26, textureX, textureY); // Box 216
		bodyModel[26] = new ModelRendererTurbo(this, 85, 15, textureX, textureY); // Box 217
		bodyModel[27] = new ModelRendererTurbo(this, 47, 24, textureX, textureY); // Box 42
		bodyModel[28] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Box 215
		bodyModel[29] = new ModelRendererTurbo(this, 71, 24, textureX, textureY); // Box 42
		bodyModel[30] = new ModelRendererTurbo(this, 71, 13, textureX, textureY); // Box 215
		bodyModel[31] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 40
		bodyModel[32] = new ModelRendererTurbo(this, 39, 39, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 362, 47, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 20, 39, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 371, 70, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 371, 83, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 67, 39, textureX, textureY); // Box 36
		bodyModel[38] = new ModelRendererTurbo(this, 307, 25, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 125, 85, textureX, textureY); // Box 106
		bodyModel[40] = new ModelRendererTurbo(this, 78, 82, textureX, textureY); // Box 106
		bodyModel[41] = new ModelRendererTurbo(this, 171, 97, textureX, textureY, "cull"); // foot holds cull
		bodyModel[42] = new ModelRendererTurbo(this, 294, 87, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[43] = new ModelRendererTurbo(this, 267, 89, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[44] = new ModelRendererTurbo(this, 314, 77, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[45] = new ModelRendererTurbo(this, 303, 77, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[46] = new ModelRendererTurbo(this, 285, 87, textureX, textureY, "cull"); // Box 40
		bodyModel[47] = new ModelRendererTurbo(this, 256, 78, textureX, textureY,"cull"); // Box 40 cul
		bodyModel[48] = new ModelRendererTurbo(this, 245, 78, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[49] = new ModelRendererTurbo(this, 276, 89, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[50] = new ModelRendererTurbo(this, 67, 92, textureX, textureY, "cull"); // side skirting cull
		bodyModel[51] = new ModelRendererTurbo(this, 383, 25, textureX, textureY); // Box 49
		bodyModel[52] = new ModelRendererTurbo(this, 358, 3, textureX, textureY); // Box 49
		bodyModel[53] = new ModelRendererTurbo(this, 307, 3, textureX, textureY); // Box 49
		bodyModel[54] = new ModelRendererTurbo(this, 125, 82, textureX, textureY); // Box 106
		bodyModel[55] = new ModelRendererTurbo(this, 78, 85, textureX, textureY); // Box 106
		bodyModel[56] = new ModelRendererTurbo(this, 383, 3, textureX, textureY); // Box 49
		bodyModel[57] = new ModelRendererTurbo(this, 40, 82, textureX, textureY, "cull"); // side skirting cull
		bodyModel[58] = new ModelRendererTurbo(this, 72, 89, textureX, textureY); // Box 49
		bodyModel[59] = new ModelRendererTurbo(this, 75, 89, textureX, textureY); // Box 49
		bodyModel[60] = new ModelRendererTurbo(this, 167, 89, textureX, textureY); // Box 49
		bodyModel[61] = new ModelRendererTurbo(this, 170, 89, textureX, textureY); // Box 49
		bodyModel[62] = new ModelRendererTurbo(this, 45, 34, textureX, textureY); // Box 72
		bodyModel[63] = new ModelRendererTurbo(this, 209, 54, textureX, textureY); // Box 113
		bodyModel[64] = new ModelRendererTurbo(this, 209, 51, textureX, textureY); // Box 114
		bodyModel[65] = new ModelRendererTurbo(this, 274, 61, textureX, textureY); // Box 44
		bodyModel[66] = new ModelRendererTurbo(this, 259, 57, textureX, textureY); // Box 46
		bodyModel[67] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 49
		bodyModel[68] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 108
		bodyModel[69] = new ModelRendererTurbo(this, 232, 57, textureX, textureY); // Box 136
		bodyModel[70] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 138
		bodyModel[71] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 139
		bodyModel[72] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 140
		bodyModel[73] = new ModelRendererTurbo(this, 232, 57, textureX, textureY); // Box 147
		bodyModel[74] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 148
		bodyModel[75] = new ModelRendererTurbo(this, 258, 61, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 129
		bodyModel[77] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 130
		bodyModel[78] = new ModelRendererTurbo(this, 358, 25, textureX, textureY); // Box 131
		bodyModel[79] = new ModelRendererTurbo(this, 286, 57, textureX, textureY); // Box 132
		bodyModel[80] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 133
		bodyModel[81] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 134
		bodyModel[82] = new ModelRendererTurbo(this, 232, 57, textureX, textureY); // Box 135
		bodyModel[83] = new ModelRendererTurbo(this, 232, 57, textureX, textureY); // Box 136
		bodyModel[84] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 137
		bodyModel[85] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 138
		bodyModel[86] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 139
		bodyModel[87] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 140
		bodyModel[88] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 141
		bodyModel[89] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 142
		bodyModel[90] = new ModelRendererTurbo(this, 301, 58, textureX, textureY); // Box 143
		bodyModel[91] = new ModelRendererTurbo(this, 301, 58, textureX, textureY); // Box 144
		bodyModel[92] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 145
		bodyModel[93] = new ModelRendererTurbo(this, 328, 61, textureX, textureY); // Box 146
		bodyModel[94] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 147
		bodyModel[95] = new ModelRendererTurbo(this, 312, 61, textureX, textureY); // Box 148
		bodyModel[96] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 149
		bodyModel[97] = new ModelRendererTurbo(this, 110, 31, textureX, textureY, "cull"); // Box 118 cull walkway
		bodyModel[98] = new ModelRendererTurbo(this, 246, 31, textureX, textureY, "cull"); // Box 215 cull support
		bodyModel[99] = new ModelRendererTurbo(this, 246, 25, textureX, textureY, "cull"); // Box cull support
		bodyModel[100] = new ModelRendererTurbo(this, 134, 39, textureX, textureY, "cull"); // Box cull walkway ends
		bodyModel[101] = new ModelRendererTurbo(this, 117, 37, textureX, textureY, "cull"); // Box cull walkway ends
		bodyModel[102] = new ModelRendererTurbo(this, 259, 57, textureX, textureY); // Box 155
		bodyModel[103] = new ModelRendererTurbo(this, 258, 61, textureX, textureY); // Box 156
		bodyModel[104] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 157
		bodyModel[105] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 158
		bodyModel[106] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 159
		bodyModel[107] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 160
		bodyModel[108] = new ModelRendererTurbo(this, 232, 57, textureX, textureY); // Box 161
		bodyModel[109] = new ModelRendererTurbo(this, 232, 57, textureX, textureY); // Box 162
		bodyModel[110] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 163
		bodyModel[111] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 164
		bodyModel[112] = new ModelRendererTurbo(this, 274, 61, textureX, textureY); // Box 165
		bodyModel[113] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 166
		bodyModel[114] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 167
		bodyModel[115] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 168
		bodyModel[116] = new ModelRendererTurbo(this, 232, 57, textureX, textureY); // Box 169
		bodyModel[117] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 170
		bodyModel[118] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 171
		bodyModel[119] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 172
		bodyModel[120] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 173
		bodyModel[121] = new ModelRendererTurbo(this, 301, 58, textureX, textureY); // Box 174
		bodyModel[122] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 175
		bodyModel[123] = new ModelRendererTurbo(this, 328, 61, textureX, textureY); // Box 176
		bodyModel[124] = new ModelRendererTurbo(this, 286, 57, textureX, textureY); // Box 177
		bodyModel[125] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 178
		bodyModel[126] = new ModelRendererTurbo(this, 232, 57, textureX, textureY); // Box 179
		bodyModel[127] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 180
		bodyModel[128] = new ModelRendererTurbo(this, 231, 60, textureX, textureY); // Box 181
		bodyModel[129] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 182
		bodyModel[130] = new ModelRendererTurbo(this, 301, 58, textureX, textureY); // Box 183
		bodyModel[131] = new ModelRendererTurbo(this, 285, 57, textureX, textureY); // Box 184
		bodyModel[132] = new ModelRendererTurbo(this, 312, 61, textureX, textureY); // Box 185
		bodyModel[133] = new ModelRendererTurbo(this, 323, 54, textureX, textureY); // Box 189
		bodyModel[134] = new ModelRendererTurbo(this, 323, 54, textureX, textureY); // Box 139
		bodyModel[135] = new ModelRendererTurbo(this, 296, 106, textureX, textureY); // Box 6
		bodyModel[136] = new ModelRendererTurbo(this, 332, 102, textureX, textureY); // Box 141
		bodyModel[137] = new ModelRendererTurbo(this, 332, 99, textureX, textureY); // Box 142
		bodyModel[138] = new ModelRendererTurbo(this, 251, 106, textureX, textureY); // Box 143
		bodyModel[139] = new ModelRendererTurbo(this, 331, 106, textureX, textureY); // Box 144
		bodyModel[140] = new ModelRendererTurbo(this, 46, 53, textureX, textureY); // Box 150
		bodyModel[141] = new ModelRendererTurbo(this, 25, 46, textureX, textureY); // Box 151
		bodyModel[142] = new ModelRendererTurbo(this, 45, 40, textureX, textureY); // Box 152
		bodyModel[143] = new ModelRendererTurbo(this, 26, 43, textureX, textureY); // Box 153
		bodyModel[144] = new ModelRendererTurbo(this, 108, 88, textureX, textureY, "cull"); // side skirting cull
		bodyModel[145] = new ModelRendererTurbo(this, 376, 106, textureX, textureY); // Box 161
		bodyModel[146] = new ModelRendererTurbo(this, 421, 106, textureX, textureY); // Box 162
		bodyModel[147] = new ModelRendererTurbo(this, 399, 102, textureX, textureY); // Box 163
		bodyModel[148] = new ModelRendererTurbo(this, 399, 99, textureX, textureY); // Box 164
		bodyModel[149] = new ModelRendererTurbo(this, 456, 106, textureX, textureY); // Box 165
		bodyModel[150] = new ModelRendererTurbo(this, 200, 102, textureX, textureY, "cull"); // Box footholds cull
		bodyModel[151] = new ModelRendererTurbo(this, 103, 88, textureX, textureY); // Box 169
		bodyModel[152] = new ModelRendererTurbo(this, 98, 88, textureX, textureY); // Box 170
		bodyModel[153] = new ModelRendererTurbo(this, 93, 88, textureX, textureY); // Box 171
		bodyModel[154] = new ModelRendererTurbo(this, 67, 97, textureX, textureY, "cull"); // Box side skirting cull
		bodyModel[155] = new ModelRendererTurbo(this, 40, 82, textureX, textureY,"cull"); // Box cull side detailings
		bodyModel[156] = new ModelRendererTurbo(this, 360, 47, textureX, textureY); // Box 162
		bodyModel[157] = new ModelRendererTurbo(this, 174, 76, textureX, textureY); // Box 12
		bodyModel[158] = new ModelRendererTurbo(this, 174, 76, textureX, textureY); // Box 165
		bodyModel[159] = new ModelRendererTurbo(this, 174, 76, textureX, textureY); // Box 166
		bodyModel[160] = new ModelRendererTurbo(this, 174, 76, textureX, textureY); // Box 167
		bodyModel[161] = new ModelRendererTurbo(this, 434, 39, textureX, textureY, "cull"); // Box cull destboards
		bodyModel[162] = new ModelRendererTurbo(this, 445, 39, textureX, textureY, "cull"); // Box cull destboards
		bodyModel[163] = new ModelRendererTurbo(this, 434, 31, textureX, textureY, "cull"); // Box cull destboard
		bodyModel[164] = new ModelRendererTurbo(this, 445, 31, textureX, textureY, "cull"); // Box cull destboards
		bodyModel[165] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 243
		bodyModel[166] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 168
		bodyModel[167] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 173
		bodyModel[168] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 174
		bodyModel[169] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 175
		bodyModel[170] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 176
		bodyModel[171] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 177
		bodyModel[172] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 178
		bodyModel[173] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 179
		bodyModel[174] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 180
		bodyModel[175] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 181
		bodyModel[176] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 182
		bodyModel[177] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 183
		bodyModel[178] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 184
		bodyModel[179] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 185
		bodyModel[180] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 186
		bodyModel[181] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 187
		bodyModel[182] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 188
		bodyModel[183] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 189
		bodyModel[184] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 190
		bodyModel[185] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 191
		bodyModel[186] = new ModelRendererTurbo(this, 41, 93, textureX, textureY); // Box 192
		bodyModel[187] = new ModelRendererTurbo(this, 360, 47, textureX, textureY); // Box 193
		bodyModel[188] = new ModelRendererTurbo(this, 245, 25, textureX, textureY, "cull"); // Box cull end thing for bida
		bodyModel[189] = new ModelRendererTurbo(this, 262, 27, textureX, textureY, "cull"); // Box cull end thing for bida

		bodyModel[0].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-24.5F, 5F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[1].setRotationPoint(-31.5F, -18.5F, 3F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[2].setRotationPoint(30.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 61, 2, 5, 0F); // Box 0
		bodyModel[3].setRotationPoint(-30.5F, 3F, -2.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[4].setRotationPoint(-33.5F, 3F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[5].setRotationPoint(20.5F, 5F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box cull brake stand thingy
		bodyModel[6].setRotationPoint(-32.5F, -12.5F, 2F);

		bodyModel[7].addBox(0F, -1F, 0F, 10, 2, 0, 0F); // Box 80
		bodyModel[7].setRotationPoint(-32F, 5F, 0.5F);
		bodyModel[7].rotateAngleY = 1.37881011F;
		bodyModel[7].rotateAngleZ = 0.10471976F;

		bodyModel[8].addBox(-10F, -1F, 0F, 10, 2, 0, 0F); // Box 81
		bodyModel[8].setRotationPoint(32F, 5F, -0.5F);
		bodyModel[8].rotateAngleY = 1.37881011F;
		bodyModel[8].rotateAngleZ = -0.10471976F;

		bodyModel[9].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 87
		bodyModel[9].setRotationPoint(-31F, -19F, 2.5F);

		bodyModel[10].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[10].setRotationPoint(6.5F, 5F, -4.5F);
		bodyModel[10].rotateAngleX = -0.78539816F;

		bodyModel[11].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[11].setRotationPoint(8.5F, 5F, -4.5F);
		bodyModel[11].rotateAngleX = -0.78539816F;

		bodyModel[12].addShapeBox(0F, -1F, -1F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[12].setRotationPoint(1F, 5.75F, 4.5F);
		bodyModel[12].rotateAngleX = -0.78539816F;

		bodyModel[13].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 119
		bodyModel[13].setRotationPoint(-1F, 5.75F, 4.5F);
		bodyModel[13].rotateAngleX = -0.78539816F;

		bodyModel[14].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[14].setRotationPoint(-3.75F, 5.26F, 1F);
		bodyModel[14].rotateAngleY = -0.31415927F;

		bodyModel[15].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[15].setRotationPoint(-4F, 5.25F, 0F);
		bodyModel[15].rotateAngleY = -0.31415927F;

		bodyModel[16].addBox(-0.5F, 0F, -2F, 1, 0, 5, 0F); // Box 122
		bodyModel[16].setRotationPoint(9F, 5.26F, 0F);
		bodyModel[16].rotateAngleY = -0.10471976F;

		bodyModel[17].addBox(-0.5F, 0F, 0F, 1, 0, 13, 0F); // Box 124
		bodyModel[17].setRotationPoint(-4F, 5.26F, 0F);
		bodyModel[17].rotateAngleY = -1.57079633F;

		bodyModel[18].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box cull brakebits
		bodyModel[18].setRotationPoint(7F, 4.5F, -2.25F);

		bodyModel[19].addShapeBox(-14.5F, -0.75F, -0.5F, 14, 0, 1, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[19].setRotationPoint(-6.75F, 6.01F, -2.5F);
		bodyModel[19].rotateAngleY = -0.08726646F;
		bodyModel[19].rotateAngleZ = 0.06981317F;

		bodyModel[20].addShapeBox(-9.5F, -0.75F, -0.5F, 9, 0, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 128
		bodyModel[20].setRotationPoint(8.5F, 6.01F, 2.5F);
		bodyModel[20].rotateAngleY = -3.2637657F;
		bodyModel[20].rotateAngleZ = 0.08726646F;

		bodyModel[21].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box cull brakebits
		bodyModel[21].setRotationPoint(1.5F, 3F, 3.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 302
		bodyModel[22].setRotationPoint(7.5F, 3F, -5.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 42
		bodyModel[23].setRotationPoint(-24F, 2.8F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 215
		bodyModel[24].setRotationPoint(-24F, 2.8F, 2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 216
		bodyModel[25].setRotationPoint(21F, 2.8F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 217
		bodyModel[26].setRotationPoint(21F, 2.8F, 2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 42
		bodyModel[27].setRotationPoint(-6.5F, 2.8F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 215
		bodyModel[28].setRotationPoint(-6.5F, 2.8F, 2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 42
		bodyModel[29].setRotationPoint(4.5F, 2.8F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 215
		bodyModel[30].setRotationPoint(4.5F, 2.8F, 2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 28, 1, 0, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[31].setRotationPoint(-31F, 4.5F, 3.51F);
		bodyModel[31].rotateAngleY = 0.03708825F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 21, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[32].setRotationPoint(-31F, -16F, 3.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 58, 1, 21, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[33].setRotationPoint(-29F, 1.99F, -10.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 20, 22, 0F); // Box 36
		bodyModel[34].setRotationPoint(-30F, -17F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 60, 2, 10, 0F,0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 39
		bodyModel[35].setRotationPoint(-30F, -19.5F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 60, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 39
		bodyModel[36].setRotationPoint(-30F, -19.5F, 0F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 20, 22, 0F); // Box 36
		bodyModel[37].setRotationPoint(29F, -17F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 24, 20, 1, 0F); // Box 49
		bodyModel[38].setRotationPoint(-29F, -17F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 106
		bodyModel[39].setRotationPoint(-6F, -18F, -11.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 106
		bodyModel[40].setRotationPoint(-6F, 3F, -11.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 22, 0F,0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // foot holds cull
		bodyModel[41].setRotationPoint(26.5F, 4F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[42].setRotationPoint(29.75F, -7F, 7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 40 cul
		bodyModel[43].setRotationPoint(26.5F, -7F, 10.87F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 20, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 40 cul
		bodyModel[44].setRotationPoint(29.75F, -17F, -10.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 20, 3, 0F,0.25F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 40 cul
		bodyModel[45].setRotationPoint(-30.75F, -17F, 7.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 40
		bodyModel[46].setRotationPoint(-30.75F, -7F, -10.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 20, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F); // Box 40 cul
		bodyModel[47].setRotationPoint(-29.49F, -17F, 10.87F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 20, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 40 cul
		bodyModel[48].setRotationPoint(26.54F, -17F, -11.87F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[49].setRotationPoint(-29.49F, -7F, -11.87F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 60, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // side skirting cull
		bodyModel[50].setRotationPoint(-30F, 3F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 24, 20, 1, 0F); // Box 49
		bodyModel[51].setRotationPoint(5F, -17F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 11, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[52].setRotationPoint(-5.5F, -17F, -11.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 24, 20, 1, 0F); // Box 49
		bodyModel[53].setRotationPoint(-29F, -17F, 10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[54].setRotationPoint(-15F, -18F, 10.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[55].setRotationPoint(-15F, 3F, 10.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 24, 20, 1, 0F); // Box 49
		bodyModel[56].setRotationPoint(5F, -17F, 10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // side skirting cull
		bodyModel[57].setRotationPoint(-23.5F, 3F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[58].setRotationPoint(-17F, 3F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[59].setRotationPoint(-15F, 3F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[60].setRotationPoint(14F, 3F, 11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[61].setRotationPoint(16F, 3F, 11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[62].setRotationPoint(-31.51F, -20F, 1.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 60, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 113
		bodyModel[63].setRotationPoint(-30F, -18F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 60, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[64].setRotationPoint(-30F, -18F, 10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 44
		bodyModel[65].setRotationPoint(-31F, -15.5F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 46
		bodyModel[66].setRotationPoint(-31F, -15.5F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 49
		bodyModel[67].setRotationPoint(-31F, -13.75F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F); // Box 108
		bodyModel[68].setRotationPoint(-31F, -13.75F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 136
		bodyModel[69].setRotationPoint(-31F, -13F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 138
		bodyModel[70].setRotationPoint(-31F, -13F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 139
		bodyModel[71].setRotationPoint(-31F, -11.25F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F); // Box 140
		bodyModel[72].setRotationPoint(-31F, -11.25F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 147
		bodyModel[73].setRotationPoint(-31F, -10.5F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 148
		bodyModel[74].setRotationPoint(-31F, -10.5F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 128
		bodyModel[75].setRotationPoint(-31F, -15.5F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 129
		bodyModel[76].setRotationPoint(-31F, -13F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 130
		bodyModel[77].setRotationPoint(-31F, -10.5F, 6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 11, 20, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[78].setRotationPoint(-5.5F, -17F, 10.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 132
		bodyModel[79].setRotationPoint(-31F, -2F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 133
		bodyModel[80].setRotationPoint(-31F, -2.75F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 134
		bodyModel[81].setRotationPoint(-31F, -4.5F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 135
		bodyModel[82].setRotationPoint(-31F, -4.5F, -6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 136
		bodyModel[83].setRotationPoint(-31F, -7F, -6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 137
		bodyModel[84].setRotationPoint(-31F, -7F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 138
		bodyModel[85].setRotationPoint(-31F, -5.25F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F); // Box 139
		bodyModel[86].setRotationPoint(-31F, -5.25F, 6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 140
		bodyModel[87].setRotationPoint(-31F, -4.5F, 6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 141
		bodyModel[88].setRotationPoint(-31F, -7F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F); // Box 142
		bodyModel[89].setRotationPoint(-31F, -2.75F, 6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 143
		bodyModel[90].setRotationPoint(-31F, -2F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 144
		bodyModel[91].setRotationPoint(-31F, -2F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 145
		bodyModel[92].setRotationPoint(-31F, 0.5F, -6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 146
		bodyModel[93].setRotationPoint(-31F, 0.5F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 147
		bodyModel[94].setRotationPoint(-31F, -0.25F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 148
		bodyModel[95].setRotationPoint(-31F, 0.5F, 6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F); // Box 149
		bodyModel[96].setRotationPoint(-31F, -0.25F, 6F);

		bodyModel[97].addBox(0F, 0F, 0F, 63, 1, 4, 0F); // Box 118 cull walkway
		bodyModel[97].setRotationPoint(-31.5F, -19.75F, -2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F); // Box 215 cull support
		bodyModel[98].setRotationPoint(-31.5F, -18.75F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F); // Box cull support
		bodyModel[99].setRotationPoint(30.5F, -18.75F, -2F);

		bodyModel[100].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box cull walkway ends
		bodyModel[100].setRotationPoint(-29.5F, -19.75F, 2F);
		bodyModel[100].rotateAngleX = -0.10471976F;

		bodyModel[101].addBox(0F, 0F, -8F, 4, 1, 8, 0F); // Box cull walkway ends
		bodyModel[101].setRotationPoint(25.5F, -19.75F, -2F);
		bodyModel[101].rotateAngleX = 0.10471976F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 155
		bodyModel[102].setRotationPoint(30F, -15.5F, -6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 156
		bodyModel[103].setRotationPoint(30F, -15.5F, 6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 157
		bodyModel[104].setRotationPoint(30F, -13.75F, 6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 158
		bodyModel[105].setRotationPoint(30F, -13F, 6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 159
		bodyModel[106].setRotationPoint(30F, -10.5F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 160
		bodyModel[107].setRotationPoint(30F, -11.25F, 6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 161
		bodyModel[108].setRotationPoint(30F, -10.5F, -6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 162
		bodyModel[109].setRotationPoint(30F, -13F, -6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 163
		bodyModel[110].setRotationPoint(30F, -13F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 164
		bodyModel[111].setRotationPoint(30F, -13.75F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 165
		bodyModel[112].setRotationPoint(30F, -15.5F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 166
		bodyModel[113].setRotationPoint(30F, -11.25F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 167
		bodyModel[114].setRotationPoint(30F, -10.5F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 168
		bodyModel[115].setRotationPoint(30F, -7F, 6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 169
		bodyModel[116].setRotationPoint(30F, -7F, -6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 170
		bodyModel[117].setRotationPoint(30F, -7F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 171
		bodyModel[118].setRotationPoint(30F, -5.25F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 172
		bodyModel[119].setRotationPoint(30F, -4.5F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 173
		bodyModel[120].setRotationPoint(30F, -2.75F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 174
		bodyModel[121].setRotationPoint(30F, -2F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175
		bodyModel[122].setRotationPoint(30F, -0.25F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 176
		bodyModel[123].setRotationPoint(30F, 0.5F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 177
		bodyModel[124].setRotationPoint(30F, -2F, -6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 178
		bodyModel[125].setRotationPoint(30F, 0.5F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 179
		bodyModel[126].setRotationPoint(30F, -4.5F, -6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 180
		bodyModel[127].setRotationPoint(30F, -5.25F, 6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 181
		bodyModel[128].setRotationPoint(30F, -4.5F, 6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 182
		bodyModel[129].setRotationPoint(30F, -2.75F, 6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 183
		bodyModel[130].setRotationPoint(30F, -2F, 6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 184
		bodyModel[131].setRotationPoint(30F, -0.25F, 6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 185
		bodyModel[132].setRotationPoint(30F, 0.5F, 6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[133].setRotationPoint(-31F, -17F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 139
		bodyModel[134].setRotationPoint(30F, -17F, -9F);

		bodyModel[135].addBox(0F, 0F, 0F, 16, 20, 1, 0F); // Box 6
		bodyModel[135].setRotationPoint(-8F, -17F, -11.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 141
		bodyModel[136].setRotationPoint(-9F, 3F, -11.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[137].setRotationPoint(-9F, -18F, -11.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 21, 20, 1, 0F); // Box 143
		bodyModel[138].setRotationPoint(-29F, -17F, -11F);

		bodyModel[139].addBox(0F, 0F, 0F, 21, 20, 1, 0F); // Box 144
		bodyModel[139].setRotationPoint(8F, -17F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 150
		bodyModel[140].setRotationPoint(-32.5F, 1.5F, 2F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 151
		bodyModel[141].setRotationPoint(-31F, -5F, 2.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 152
		bodyModel[142].setRotationPoint(-31.51F, -6F, 1.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 153
		bodyModel[143].setRotationPoint(-31.5F, -4.5F, 3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // side skirting cull
		bodyModel[144].setRotationPoint(-12F, 4F, -11F);

		bodyModel[145].addBox(0F, 0F, 0F, 21, 20, 1, 0F); // Box 161
		bodyModel[145].setRotationPoint(8F, -17F, 10F);

		bodyModel[146].addBox(0F, 0F, 0F, 16, 20, 1, 0F); // Box 162
		bodyModel[146].setRotationPoint(-8F, -17F, 10.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[147].setRotationPoint(-23F, -18F, 10.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 164
		bodyModel[148].setRotationPoint(-23F, 3F, 10.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 21, 20, 1, 0F); // Box 165
		bodyModel[149].setRotationPoint(-29F, -17F, 10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 3, 22, 0F,0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box footholds cull
		bodyModel[150].setRotationPoint(-29.5F, 4F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[151].setRotationPoint(14F, 4F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 170
		bodyModel[152].setRotationPoint(-16F, 4F, 11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[153].setRotationPoint(10F, 4F, 11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 60, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box side skirting cull
		bodyModel[154].setRotationPoint(-30F, 3F, 9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull side detailings
		bodyModel[155].setRotationPoint(21.5F, 3F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.75F, -0.5F, 6F, -0.75F, -0.5F, 6F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[156].setRotationPoint(-8F, 1.99F, -11.49F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 12
		bodyModel[157].setRotationPoint(15F, 3F, 3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.5F); // Box 165
		bodyModel[158].setRotationPoint(15F, 3F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.5F); // Box 166
		bodyModel[159].setRotationPoint(-16F, 3F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 167
		bodyModel[160].setRotationPoint(-16F, 3F, 3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull destboards
		bodyModel[161].setRotationPoint(-30.87F, -12.25F, -9.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull destboards
		bodyModel[162].setRotationPoint(29.87F, -12.5F, 5.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull destboard
		bodyModel[163].setRotationPoint(-30.87F, -6.25F, -9.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull destboards
		bodyModel[164].setRotationPoint(29.87F, -6.5F, 5.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 243
		bodyModel[165].setRotationPoint(-0.5F, -20.25F, 0.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 168
		bodyModel[166].setRotationPoint(-0.5F, -20.25F, -9.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 173
		bodyModel[167].setRotationPoint(10F, -20.25F, -9.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 174
		bodyModel[168].setRotationPoint(10F, -20.25F, 0.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 175
		bodyModel[169].setRotationPoint(5F, -20.25F, -9.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 176
		bodyModel[170].setRotationPoint(5F, -20.25F, 0.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 177
		bodyModel[171].setRotationPoint(15F, -20.25F, -9.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 178
		bodyModel[172].setRotationPoint(15F, -20.25F, 0.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 179
		bodyModel[173].setRotationPoint(20F, -20.25F, -9.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 180
		bodyModel[174].setRotationPoint(20F, -20.25F, 0.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 181
		bodyModel[175].setRotationPoint(25F, -20.25F, -9.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 182
		bodyModel[176].setRotationPoint(25F, -20.25F, 0.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 183
		bodyModel[177].setRotationPoint(-26F, -20.25F, -9.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 184
		bodyModel[178].setRotationPoint(-26F, -20.25F, 0.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 185
		bodyModel[179].setRotationPoint(-21F, -20.25F, -9.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 186
		bodyModel[180].setRotationPoint(-21F, -20.25F, 0.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 187
		bodyModel[181].setRotationPoint(-16F, -20.25F, -9.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 188
		bodyModel[182].setRotationPoint(-16F, -20.25F, 0.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 189
		bodyModel[183].setRotationPoint(-11F, -20.25F, -9.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 190
		bodyModel[184].setRotationPoint(-11F, -20.25F, 0.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 191
		bodyModel[185].setRotationPoint(-6F, -20.25F, -9.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 192
		bodyModel[186].setRotationPoint(-6F, -20.25F, 0.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.75F, 0F, 6F, -0.75F, 0F, 6F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 193
		bodyModel[187].setRotationPoint(-8F, 1.99F, 10.49F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull end thing for bida
		bodyModel[188].setRotationPoint(-32.5F, 1.25F, -6F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull end thing for bida
		bodyModel[189].setRotationPoint(30.5F, 1.25F, -6F);
	}
	ModelAndrews_Truck bogie2 = new ModelAndrews_Truck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 189; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9534){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Andrews_Truck_black.png"));
		}
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.42,-0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.82,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}