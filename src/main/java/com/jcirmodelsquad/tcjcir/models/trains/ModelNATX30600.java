//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NATX30600galTank
// Model Creator: Bida
// Created on: 16.07.2022 - 20:47:45
// Last changed on: 16.07.2022 - 20:47:45

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelNATX30600 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelNATX30600() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[163];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 4, 102, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 13
		bodyModel[2] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 28
		bodyModel[3] = new ModelRendererTurbo(this, 13, 104, textureX, textureY); // Box 75
		bodyModel[4] = new ModelRendererTurbo(this, 4, 102, textureX, textureY); // Box 1 coupler
		bodyModel[5] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 28
		bodyModel[6] = new ModelRendererTurbo(this, 13, 104, textureX, textureY); // Box 253
		bodyModel[7] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 254
		bodyModel[8] = new ModelRendererTurbo(this, 166, 31, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 176, 14, textureX, textureY); // Box 4
		bodyModel[10] = new ModelRendererTurbo(this, 180, 1, textureX, textureY); // Box 5
		bodyModel[11] = new ModelRendererTurbo(this, 341, 1, textureX, textureY); // Box 5
		bodyModel[12] = new ModelRendererTurbo(this, 337, 14, textureX, textureY); // Box 4
		bodyModel[13] = new ModelRendererTurbo(this, 176, 58, textureX, textureY); // Box 4
		bodyModel[14] = new ModelRendererTurbo(this, 180, 75, textureX, textureY); // Box 5
		bodyModel[15] = new ModelRendererTurbo(this, 341, 75, textureX, textureY); // Box 5
		bodyModel[16] = new ModelRendererTurbo(this, 337, 58, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 12, 40, textureX, textureY, "cull"); // Box 75 cull platform
		bodyModel[18] = new ModelRendererTurbo(this, 12, 72, textureX, textureY, "cull"); // Box 206 cull platform
		bodyModel[19] = new ModelRendererTurbo(this, 144, 31, textureX, textureY); // Box 4
		bodyModel[20] = new ModelRendererTurbo(this, 132, 25, textureX, textureY); // Box 5
		bodyModel[21] = new ModelRendererTurbo(this, 110, 25, textureX, textureY); // Box 5
		bodyModel[22] = new ModelRendererTurbo(this, 96, 31, textureX, textureY); // Box 4
		bodyModel[23] = new ModelRendererTurbo(this, 144, 58, textureX, textureY); // Box 4
		bodyModel[24] = new ModelRendererTurbo(this, 131, 66, textureX, textureY); // Box 5
		bodyModel[25] = new ModelRendererTurbo(this, 111, 66, textureX, textureY); // Box 5
		bodyModel[26] = new ModelRendererTurbo(this, 96, 58, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 97, 45, textureX, textureY); // Box 3
		bodyModel[28] = new ModelRendererTurbo(this, 145, 45, textureX, textureY); // Box 3
		bodyModel[29] = new ModelRendererTurbo(this, 121, 45, textureX, textureY); // Box 3
		bodyModel[30] = new ModelRendererTurbo(this, 44, 30, textureX, textureY); // Box 124
		bodyModel[31] = new ModelRendererTurbo(this, 68, 44, textureX, textureY); // Box 126
		bodyModel[32] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 127
		bodyModel[33] = new ModelRendererTurbo(this, 44, 50, textureX, textureY); // Box 280
		bodyModel[34] = new ModelRendererTurbo(this, 68, 64, textureX, textureY); // Box 281
		bodyModel[35] = new ModelRendererTurbo(this, 62, 64, textureX, textureY); // Box 282
		bodyModel[36] = new ModelRendererTurbo(this, 101, 102, textureX, textureY); // Box 236
		bodyModel[37] = new ModelRendererTurbo(this, 101, 104, textureX, textureY); // Box 247
		bodyModel[38] = new ModelRendererTurbo(this, 85, 78, textureX, textureY); // Box 53
		bodyModel[39] = new ModelRendererTurbo(this, 100, 108, textureX, textureY); // Box 54
		bodyModel[40] = new ModelRendererTurbo(this, 100, 106, textureX, textureY); // Box 55
		bodyModel[41] = new ModelRendererTurbo(this, 91, 106, textureX, textureY); // Box 342
		bodyModel[42] = new ModelRendererTurbo(this, 91, 106, textureX, textureY); // Box 351
		bodyModel[43] = new ModelRendererTurbo(this, 90, 104, textureX, textureY); // Box 55
		bodyModel[44] = new ModelRendererTurbo(this, 90, 104, textureX, textureY); // Box 56
		bodyModel[45] = new ModelRendererTurbo(this, 40, 97, textureX, textureY); // Box 266
		bodyModel[46] = new ModelRendererTurbo(this, 6, 108, textureX, textureY); // Box 59
		bodyModel[47] = new ModelRendererTurbo(this, 6, 108, textureX, textureY); // Box 60
		bodyModel[48] = new ModelRendererTurbo(this, 6, 108, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 6, 108, textureX, textureY); // Box 62
		bodyModel[50] = new ModelRendererTurbo(this, 59, 42, textureX, textureY, "cull"); // Box 65 cull
		bodyModel[51] = new ModelRendererTurbo(this, 59, 62, textureX, textureY, "cull"); // Box 68 cull
		bodyModel[52] = new ModelRendererTurbo(this, 133, 108, textureX, textureY); // Box 108
		bodyModel[53] = new ModelRendererTurbo(this, 133, 108, textureX, textureY); // Box 108
		bodyModel[54] = new ModelRendererTurbo(this, 101, 112, textureX, textureY); // Box 73
		bodyModel[55] = new ModelRendererTurbo(this, 100, 118, textureX, textureY); // Box 74
		bodyModel[56] = new ModelRendererTurbo(this, 101, 116, textureX, textureY); // Box 75
		bodyModel[57] = new ModelRendererTurbo(this, 100, 114, textureX, textureY); // Box 76
		bodyModel[58] = new ModelRendererTurbo(this, 91, 106, textureX, textureY); // Box 77
		bodyModel[59] = new ModelRendererTurbo(this, 90, 104, textureX, textureY); // Box 78
		bodyModel[60] = new ModelRendererTurbo(this, 85, 88, textureX, textureY); // Box 79
		bodyModel[61] = new ModelRendererTurbo(this, 14, 97, textureX, textureY); // Box 80
		bodyModel[62] = new ModelRendererTurbo(this, 91, 106, textureX, textureY); // Box 81
		bodyModel[63] = new ModelRendererTurbo(this, 90, 104, textureX, textureY); // Box 82
		bodyModel[64] = new ModelRendererTurbo(this, 284, 105, textureX, textureY); // Box 72
		bodyModel[65] = new ModelRendererTurbo(this, 287, 116, textureX, textureY); // Box 87
		bodyModel[66] = new ModelRendererTurbo(this, 285, 119, textureX, textureY); // Box 87
		bodyModel[67] = new ModelRendererTurbo(this, 282, 120, textureX, textureY); // Box 132
		bodyModel[68] = new ModelRendererTurbo(this, 282, 126, textureX, textureY); // Box 125
		bodyModel[69] = new ModelRendererTurbo(this, 111, 89, textureX, textureY); // Box 88
		bodyModel[70] = new ModelRendererTurbo(this, 53, 97, textureX, textureY); // Box 89
		bodyModel[71] = new ModelRendererTurbo(this, 27, 97, textureX, textureY); // Box 90
		bodyModel[72] = new ModelRendererTurbo(this, 111, 87, textureX, textureY); // Box 91
		bodyModel[73] = new ModelRendererTurbo(this, 118, 122, textureX, textureY); // Box 491
		bodyModel[74] = new ModelRendererTurbo(this, 125, 121, textureX, textureY); // Box 93
		bodyModel[75] = new ModelRendererTurbo(this, 132, 122, textureX, textureY); // Box 94
		bodyModel[76] = new ModelRendererTurbo(this, 105, 122, textureX, textureY); // Box 95
		bodyModel[77] = new ModelRendererTurbo(this, 150, 122, textureX, textureY); // Box 286
		bodyModel[78] = new ModelRendererTurbo(this, 139, 122, textureX, textureY); // Box 287
		bodyModel[79] = new ModelRendererTurbo(this, 294, 122, textureX, textureY); // Box 98
		bodyModel[80] = new ModelRendererTurbo(this, 294, 122, textureX, textureY); // Box 99
		bodyModel[81] = new ModelRendererTurbo(this, 139, 89, textureX, textureY, "cull"); // Box 141 roof railings cull
		bodyModel[82] = new ModelRendererTurbo(this, 214, 90, textureX, textureY); // Box 138
		bodyModel[83] = new ModelRendererTurbo(this, 176, 95, textureX, textureY); // Box 140
		bodyModel[84] = new ModelRendererTurbo(this, 133, 79, textureX, textureY); // Box 506
		bodyModel[85] = new ModelRendererTurbo(this, 142, 79, textureX, textureY); // Box 507
		bodyModel[86] = new ModelRendererTurbo(this, 133, 79, textureX, textureY); // Box 509
		bodyModel[87] = new ModelRendererTurbo(this, 80, 73, textureX, textureY); // Box 510
		bodyModel[88] = new ModelRendererTurbo(this, 142, 79, textureX, textureY); // Box 511
		bodyModel[89] = new ModelRendererTurbo(this, 233, 88, textureX, textureY); // Box 513
		bodyModel[90] = new ModelRendererTurbo(this, 155, 116, textureX, textureY); // Box 514
		bodyModel[91] = new ModelRendererTurbo(this, 164, 116, textureX, textureY); // Box 515
		bodyModel[92] = new ModelRendererTurbo(this, 243, 92, textureX, textureY); // Box 286
		bodyModel[93] = new ModelRendererTurbo(this, 233, 93, textureX, textureY); // Box 116
		bodyModel[94] = new ModelRendererTurbo(this, 248, 92, textureX, textureY); // Box 117
		bodyModel[95] = new ModelRendererTurbo(this, 66, 101, textureX, textureY); // Box 118
		bodyModel[96] = new ModelRendererTurbo(this, 79, 112, textureX, textureY, "cull"); // Box 119 cull
		bodyModel[97] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Box 367
		bodyModel[98] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Box 368
		bodyModel[99] = new ModelRendererTurbo(this, 110, 99, textureX, textureY); // Box 298
		bodyModel[100] = new ModelRendererTurbo(this, 66, 101, textureX, textureY); // Box 299
		bodyModel[101] = new ModelRendererTurbo(this, 53, 112, textureX, textureY, "cull"); // Box 301 cull
		bodyModel[102] = new ModelRendererTurbo(this, 66, 108, textureX, textureY); // Box 302
		bodyModel[103] = new ModelRendererTurbo(this, 1, 112, textureX, textureY, "cull"); // Box 303 cull
		bodyModel[104] = new ModelRendererTurbo(this, 110, 99, textureX, textureY); // Box 304
		bodyModel[105] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Box 305
		bodyModel[106] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Box 306
		bodyModel[107] = new ModelRendererTurbo(this, 27, 112, textureX, textureY, "cull"); // Box 307 cull
		bodyModel[108] = new ModelRendererTurbo(this, 66, 108, textureX, textureY); // Box 308
		bodyModel[109] = new ModelRendererTurbo(this, 161, 122, textureX, textureY); // Box 309
		bodyModel[110] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Box 80
		bodyModel[111] = new ModelRendererTurbo(this, 1, 88, textureX, textureY); // Box 718
		bodyModel[112] = new ModelRendererTurbo(this, 1, 82, textureX, textureY); // Box 720
		bodyModel[113] = new ModelRendererTurbo(this, 1, 84, textureX, textureY); // Box 721
		bodyModel[114] = new ModelRendererTurbo(this, 237, 122, textureX, textureY); // Box 118
		bodyModel[115] = new ModelRendererTurbo(this, 228, 122, textureX, textureY); // Box 119
		bodyModel[116] = new ModelRendererTurbo(this, 248, 122, textureX, textureY); // Box 129
		bodyModel[117] = new ModelRendererTurbo(this, 259, 122, textureX, textureY); // Box 196
		bodyModel[118] = new ModelRendererTurbo(this, 259, 125, textureX, textureY); // Box 199
		bodyModel[119] = new ModelRendererTurbo(this, 259, 125, textureX, textureY); // Box 727
		bodyModel[120] = new ModelRendererTurbo(this, 263, 123, textureX, textureY); // Box 728
		bodyModel[121] = new ModelRendererTurbo(this, 266, 120, textureX, textureY); // Box 124
		bodyModel[122] = new ModelRendererTurbo(this, 267, 118, textureX, textureY); // Box 731
		bodyModel[123] = new ModelRendererTurbo(this, 235, 92, textureX, textureY); // Box 730
		bodyModel[124] = new ModelRendererTurbo(this, 270, 118, textureX, textureY); // Box 325
		bodyModel[125] = new ModelRendererTurbo(this, 145, 79, textureX, textureY); // Box 328
		bodyModel[126] = new ModelRendererTurbo(this, 145, 79, textureX, textureY); // Box 329
		bodyModel[127] = new ModelRendererTurbo(this, 301, 106, textureX, textureY); // Box 330
		bodyModel[128] = new ModelRendererTurbo(this, 43, 114, textureX, textureY); // Box 331
		bodyModel[129] = new ModelRendererTurbo(this, 17, 106, textureX, textureY); // Box 332
		bodyModel[130] = new ModelRendererTurbo(this, 17, 106, textureX, textureY); // Box 333
		bodyModel[131] = new ModelRendererTurbo(this, 69, 106, textureX, textureY); // Box 334
		bodyModel[132] = new ModelRendererTurbo(this, 69, 106, textureX, textureY); // Box 335
		bodyModel[133] = new ModelRendererTurbo(this, 43, 114, textureX, textureY); // Box 336
		bodyModel[134] = new ModelRendererTurbo(this, 186, 118, textureX, textureY); // Box 108 hazmat plac
		bodyModel[135] = new ModelRendererTurbo(this, 189, 122, textureX, textureY); // Box 614
		bodyModel[136] = new ModelRendererTurbo(this, 186, 118, textureX, textureY); // Box 108 hazmat plac
		bodyModel[137] = new ModelRendererTurbo(this, 189, 122, textureX, textureY); // Box 614
		bodyModel[138] = new ModelRendererTurbo(this, 186, 118, textureX, textureY); // Box 108 hazmat plac
		bodyModel[139] = new ModelRendererTurbo(this, 186, 118, textureX, textureY); // Box 108 hazmat plac
		bodyModel[140] = new ModelRendererTurbo(this, 189, 123, textureX, textureY); // Box 343
		bodyModel[141] = new ModelRendererTurbo(this, 189, 123, textureX, textureY); // Box 344
		bodyModel[142] = new ModelRendererTurbo(this, 178, 119, textureX, textureY); // Box 345
		bodyModel[143] = new ModelRendererTurbo(this, 178, 123, textureX, textureY); // Box 346
		bodyModel[144] = new ModelRendererTurbo(this, 138, 116, textureX, textureY); // Box 347
		bodyModel[145] = new ModelRendererTurbo(this, 205, 116, textureX, textureY, "cull"); // Box 168 cull underpipe supports
		bodyModel[146] = new ModelRendererTurbo(this, 121, 45, textureX, textureY); // Box 162
		bodyModel[147] = new ModelRendererTurbo(this, 110, 25, textureX, textureY); // Box 163
		bodyModel[148] = new ModelRendererTurbo(this, 144, 31, textureX, textureY); // Box 164
		bodyModel[149] = new ModelRendererTurbo(this, 132, 25, textureX, textureY); // Box 165
		bodyModel[150] = new ModelRendererTurbo(this, 96, 31, textureX, textureY); // Box 166
		bodyModel[151] = new ModelRendererTurbo(this, 97, 45, textureX, textureY); // Box 167
		bodyModel[152] = new ModelRendererTurbo(this, 131, 66, textureX, textureY); // Box 168
		bodyModel[153] = new ModelRendererTurbo(this, 144, 58, textureX, textureY); // Box 169
		bodyModel[154] = new ModelRendererTurbo(this, 111, 66, textureX, textureY); // Box 170
		bodyModel[155] = new ModelRendererTurbo(this, 96, 58, textureX, textureY); // Box 171
		bodyModel[156] = new ModelRendererTurbo(this, 145, 45, textureX, textureY); // Box 172
		bodyModel[157] = new ModelRendererTurbo(this, 150, 79, textureX, textureY); // Box 173
		bodyModel[158] = new ModelRendererTurbo(this, 150, 79, textureX, textureY); // Box 174
		bodyModel[159] = new ModelRendererTurbo(this, 79, 12, textureX, textureY); // Box 159 extended bracket
		bodyModel[160] = new ModelRendererTurbo(this, 53, 12, textureX, textureY); // Box 160 extended bracket
		bodyModel[161] = new ModelRendererTurbo(this, 27, 12, textureX, textureY); // Box 161 extended bracket
		bodyModel[162] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 162 extended bracket

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-44.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 14, 2, 4, 0F); // Box 13
		bodyModel[1].setRotationPoint(-41.5F, 3.5F, -2F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[2].setRotationPoint(-31F, 5.1F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[3].setRotationPoint(-27.5F, 2.5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[4].setRotationPoint(41.5F, 3F, -1.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[5].setRotationPoint(28F, 5.1F, -1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 253
		bodyModel[6].setRotationPoint(21.5F, 2.5F, -2F);

		bodyModel[7].addBox(0F, 0F, 0F, 14, 2, 4, 0F); // Box 254
		bodyModel[7].setRotationPoint(27.5F, 3.5F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 67, 6, 20, 0F,0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[8].setRotationPoint(-33.5F, -10F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 67, 6, 10, 0F,0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[9].setRotationPoint(-33.5F, -17F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 67, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -6F, 0F, 1.16F, -6F); // Box 5
		bodyModel[10].setRotationPoint(-33.5F, -17.5F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 67, 6, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.16F, -6F, 0F, 1.16F, -6F, 0F, 1.16F, 0F, 0F, 1.16F, 0F); // Box 5
		bodyModel[11].setRotationPoint(-33.5F, -17.5F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 67, 6, 10, 0F,0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[12].setRotationPoint(-33.5F, -17F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 67, 6, 10, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, -1.5F, -4F, 0F, -1.5F, -4F); // Box 4
		bodyModel[13].setRotationPoint(-33.5F, -3F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 67, 6, 6, 0F,0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -6F, 0F, 1.16F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[14].setRotationPoint(-33.5F, -2.5F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 67, 6, 6, 0F,0F, 1.16F, -6F, 0F, 1.16F, -6F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[15].setRotationPoint(-33.5F, -2.5F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 67, 6, 10, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -6F, 0F, -1.5F, -6F); // Box 4
		bodyModel[16].setRotationPoint(-33.5F, -3F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 75 cull platform
		bodyModel[17].setRotationPoint(-41.5F, 2F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 206 cull platform
		bodyModel[18].setRotationPoint(37.5F, 2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[19].setRotationPoint(33.5F, -17F, 3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F); // Box 5
		bodyModel[20].setRotationPoint(33.5F, -17.5F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F); // Box 5
		bodyModel[21].setRotationPoint(33.5F, -17.5F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, -1.5F, -4F, -3F, -1.5F, -4F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[22].setRotationPoint(33.5F, -17F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, -1.5F, -4F, 0F, -1.5F, -4F); // Box 4
		bodyModel[23].setRotationPoint(33.5F, -3F, 3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[24].setRotationPoint(33.5F, -2.5F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 1.16F, -2F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[25].setRotationPoint(33.5F, -2.5F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, -3F, -1.5F, -3F, 0F, -1.5F, -3F); // Box 4
		bodyModel[26].setRotationPoint(33.5F, -3F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 0F, -3F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, 0F, 0.34F, 0F, -3F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F); // Box 3
		bodyModel[27].setRotationPoint(33.5F, -10F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 1F, 0F, 0.34F, 1F, -3F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, -3F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[28].setRotationPoint(33.5F, -10F, 4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[29].setRotationPoint(33.5F, -10F, -3F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 9, 22, 0F); // Box 124
		bodyModel[30].setRotationPoint(-37.51F, -7F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[31].setRotationPoint(-37.51F, -7F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[32].setRotationPoint(-37.51F, -7F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 9, 22, 0F); // Box 280
		bodyModel[33].setRotationPoint(37.51F, -7F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[34].setRotationPoint(37.51F, -7F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[35].setRotationPoint(37.51F, -7F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 14, 1, 0, 0F); // Box 236
		bodyModel[36].setRotationPoint(-41.5F, 2.5F, -11.01F);

		bodyModel[37].addBox(0F, 0F, 0F, 14, 1, 0, 0F); // Box 247
		bodyModel[37].setRotationPoint(-41.5F, 2.5F, 11.01F);

		bodyModel[38].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 53
		bodyModel[38].setRotationPoint(-41.51F, 2.5F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 14, 0, 1, 0F); // Box 54
		bodyModel[39].setRotationPoint(-41.5F, 3.5F, -11.01F);

		bodyModel[40].addBox(0F, 0F, 0F, 14, 0, 1, 0F); // Box 55
		bodyModel[40].setRotationPoint(-41.5F, 3.5F, 9.99F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 342
		bodyModel[41].setRotationPoint(-41.5F, 3.5F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 351
		bodyModel[42].setRotationPoint(-41.5F, 3.5F, 11F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 55
		bodyModel[43].setRotationPoint(-41.5F, 3F, -11.75F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 56
		bodyModel[44].setRotationPoint(-41.5F, 3F, 10.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[45].setRotationPoint(-41.5F, 3.5F, -7F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 59
		bodyModel[46].setRotationPoint(-44.5F, 2F, 0F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 60
		bodyModel[47].setRotationPoint(-44.5F, 5F, -1F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 61
		bodyModel[48].setRotationPoint(42.5F, 5F, 0F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 62
		bodyModel[49].setRotationPoint(42.5F, 2F, -1F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 65 cull
		bodyModel[50].setRotationPoint(-37.5F, -8F, -3F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 68 cull
		bodyModel[51].setRotationPoint(36.5F, -8F, -3F);

		bodyModel[52].addBox(0F, 0F, 0F, 55, 0, 6, 0F); // Box 108
		bodyModel[52].setRotationPoint(-27.5F, 3.5F, 11F);
		bodyModel[52].rotateAngleX = 2.35619449F;

		bodyModel[53].addBox(0F, 0F, 0F, 55, 0, 6, 0F); // Box 108
		bodyModel[53].setRotationPoint(-27.5F, 3.5F, -11F);
		bodyModel[53].rotateAngleX = 0.78539816F;

		bodyModel[54].addBox(0F, 0F, 0F, 14, 1, 0, 0F); // Box 73
		bodyModel[54].setRotationPoint(27.5F, 2.5F, -11.01F);

		bodyModel[55].addBox(0F, 0F, 0F, 14, 0, 1, 0F); // Box 74
		bodyModel[55].setRotationPoint(27.5F, 3.5F, 9.99F);

		bodyModel[56].addBox(0F, 0F, 0F, 14, 1, 0, 0F); // Box 75
		bodyModel[56].setRotationPoint(27.5F, 2.5F, 11.01F);

		bodyModel[57].addBox(0F, 0F, 0F, 14, 0, 1, 0F); // Box 76
		bodyModel[57].setRotationPoint(27.5F, 3.5F, -11.01F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 77
		bodyModel[58].setRotationPoint(37.5F, 3.5F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 78
		bodyModel[59].setRotationPoint(37.5F, 3F, -11.75F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 79
		bodyModel[60].setRotationPoint(41.51F, 2.5F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 80
		bodyModel[61].setRotationPoint(40.5F, 3.5F, 2F);

		bodyModel[62].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 81
		bodyModel[62].setRotationPoint(37.5F, 3.5F, 11F);

		bodyModel[63].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 82
		bodyModel[63].setRotationPoint(37.5F, 3F, 10.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[64].setRotationPoint(-39.01F, -5F, 2F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[65].setRotationPoint(-39F, -3.5F, 3.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 87
		bodyModel[66].setRotationPoint(-38.5F, -4F, 2.5F);

		bodyModel[67].addBox(-1F, 0F, 0F, 1, 5, 0, 0F); // Box 132
		bodyModel[67].setRotationPoint(-37.5F, -1.5F, 4F);
		bodyModel[67].rotateAngleZ = -0.03490659F;

		bodyModel[68].addBox(0F, 0F, 0F, 19, 1, 0, 0F); // Box 125
		bodyModel[68].setRotationPoint(-38.75F, 3.5F, 4F);
		bodyModel[68].rotateAngleY = -0.05235988F;
		bodyModel[68].rotateAngleZ = -0.01745329F;

		bodyModel[69].addBox(0F, 0F, 0F, 0, 1, 9, 0F); // Box 88
		bodyModel[69].setRotationPoint(-41.51F, 3.5F, 2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 89
		bodyModel[70].setRotationPoint(-41.5F, 3.5F, 2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[71].setRotationPoint(40.5F, 3.5F, -7F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 1, 9, 0F); // Box 91
		bodyModel[72].setRotationPoint(41.51F, 3.5F, -11F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 491
		bodyModel[73].setRotationPoint(-37F, 0F, -10.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 93
		bodyModel[74].setRotationPoint(-36F, -1F, -10.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 94
		bodyModel[75].setRotationPoint(-35F, 0F, -10.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 95
		bodyModel[76].setRotationPoint(-37F, 2F, -11F);

		bodyModel[77].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[77].setRotationPoint(-37.5F, 1F, 8.5F);
		bodyModel[77].rotateAngleX = -0.78539816F;

		bodyModel[78].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[78].setRotationPoint(-34.5F, 1F, 8.5F);
		bodyModel[78].rotateAngleX = -0.78539816F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[79].setRotationPoint(-37.5F, -4F, 5.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[80].setRotationPoint(-37.5F, -4F, 2.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 12, 6, 12, 0F); // Box 141 roof railings cull
		bodyModel[81].setRotationPoint(-6F, -21.5F, -6F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 138
		bodyModel[82].setRotationPoint(-2F, -18.5F, -2F);

		bodyModel[83].addBox(0F, 0F, 0F, 12, 0, 12, 0F); // Box 140
		bodyModel[83].setRotationPoint(-6F, -16.5F, -6F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 17, 0, 0F); // Box 506
		bodyModel[84].setRotationPoint(-2F, -10F, 11F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 507
		bodyModel[85].setRotationPoint(-2F, -10F, 11F);
		bodyModel[85].rotateAngleX = -2.47836754F;

		bodyModel[86].addBox(0F, 0F, 0F, 4, 17, 0, 0F); // Box 509
		bodyModel[86].setRotationPoint(-2F, -10F, -11F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 0, 22, 0F); // Box 510
		bodyModel[87].setRotationPoint(-2F, -3F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 511
		bodyModel[88].setRotationPoint(-2F, -10F, -11F);
		bodyModel[88].rotateAngleX = 2.47836754F;

		bodyModel[89].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 513
		bodyModel[89].setRotationPoint(3F, -20.5F, -1F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[90].setRotationPoint(-1F, 4F, -1F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 515
		bodyModel[91].setRotationPoint(-1F, 5F, -1F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 286
		bodyModel[92].setRotationPoint(7F, -19.5F, -0.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 116
		bodyModel[93].setRotationPoint(3F, -18.5F, -1F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 117
		bodyModel[94].setRotationPoint(-8F, -19.5F, -0.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 118
		bodyModel[95].setRotationPoint(-30.5F, 3.5F, -11F);
		bodyModel[95].rotateAngleX = 0.68067841F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119 cull
		bodyModel[96].setRotationPoint(-30.5F, 3.5F, -7F);
		bodyModel[96].rotateAngleX = 2.03330858F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 367
		bodyModel[97].setRotationPoint(-30.5F, 3.75F, 3.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 368
		bodyModel[98].setRotationPoint(-30.5F, 3.75F, -5.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 298
		bodyModel[99].setRotationPoint(-30.5F, 3.5F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, -6F, 3, 0, 6, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[100].setRotationPoint(-30.5F, 3.5F, 11F);
		bodyModel[100].rotateAngleX = -0.68067841F;

		bodyModel[101].addShapeBox(-3F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301 cull
		bodyModel[101].setRotationPoint(-30.5F, 3.5F, 7F);
		bodyModel[101].rotateAngleX = 2.03330858F;
		bodyModel[101].rotateAngleY = -3.14159265F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 302
		bodyModel[102].setRotationPoint(27.5F, 3.5F, -11F);
		bodyModel[102].rotateAngleX = 0.68067841F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303 cull
		bodyModel[103].setRotationPoint(27.5F, 3.5F, -7F);
		bodyModel[103].rotateAngleX = 2.03330858F;

		bodyModel[104].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 304
		bodyModel[104].setRotationPoint(27.5F, 3.5F, -10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 305
		bodyModel[105].setRotationPoint(28.5F, 3.75F, -5.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 306
		bodyModel[106].setRotationPoint(28.5F, 3.75F, 3.5F);

		bodyModel[107].addShapeBox(-3F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307 cull
		bodyModel[107].setRotationPoint(27.5F, 3.5F, 7F);
		bodyModel[107].rotateAngleX = 2.03330858F;
		bodyModel[107].rotateAngleY = -3.14159265F;

		bodyModel[108].addShapeBox(0F, 0F, -6F, 3, 0, 6, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[108].setRotationPoint(27.5F, 3.5F, 11F);
		bodyModel[108].rotateAngleX = -0.68067841F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[109].setRotationPoint(-31.5F, 2.5F, 8F);

		bodyModel[110].addBox(0F, -1F, 0F, 11, 3, 0, 0F); // Box 80
		bodyModel[110].setRotationPoint(-43F, 4.5F, -0.5F);
		bodyModel[110].rotateAngleY = 1.44862328F;

		bodyModel[111].addShapeBox(3F, -1F, 0F, 5, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 718
		bodyModel[111].setRotationPoint(-43F, 4.5F, -0.5F);
		bodyModel[111].rotateAngleY = 1.44862328F;

		bodyModel[112].addShapeBox(-8F, -1F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 720
		bodyModel[112].setRotationPoint(43F, 4.5F, 0.5F);
		bodyModel[112].rotateAngleY = 1.44862328F;

		bodyModel[113].addBox(-11F, -1F, 0F, 11, 3, 0, 0F); // Box 721
		bodyModel[113].setRotationPoint(43F, 4.5F, 0.5F);
		bodyModel[113].rotateAngleY = 1.44862328F;

		bodyModel[114].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[114].setRotationPoint(-18F, 4.5F, 3F);
		bodyModel[114].rotateAngleX = -0.78539816F;

		bodyModel[115].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[115].setRotationPoint(-20F, 4.5F, 3F);
		bodyModel[115].rotateAngleX = -0.78539816F;

		bodyModel[116].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 129
		bodyModel[116].setRotationPoint(-18.5F, 1.5F, 2F);

		bodyModel[117].addBox(-0.5F, 0F, -2F, 1, 0, 5, 0F); // Box 196
		bodyModel[117].setRotationPoint(-21F, 4.26F, 0F);
		bodyModel[117].rotateAngleY = -0.31415927F;

		bodyModel[118].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[118].setRotationPoint(-21F, 4.25F, 0F);
		bodyModel[118].rotateAngleY = -0.31415927F;

		bodyModel[119].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 727
		bodyModel[119].setRotationPoint(-14F, 4.25F, 0F);
		bodyModel[119].rotateAngleY = -0.31415927F;

		bodyModel[120].addBox(-0.5F, 0F, -2F, 1, 0, 4, 0F); // Box 728
		bodyModel[120].setRotationPoint(-14F, 4.26F, 0F);
		bodyModel[120].rotateAngleY = -0.31415927F;

		bodyModel[121].addBox(-0.5F, 0F, 0F, 1, 0, 7, 0F); // Box 124
		bodyModel[121].setRotationPoint(-21F, 4.26F, 0F);
		bodyModel[121].rotateAngleY = -1.57079633F;

		bodyModel[122].addBox(-0.5F, 0F, 0F, 1, 0, 9, 0F); // Box 731
		bodyModel[122].setRotationPoint(-21.5F, 4.26F, -2F);
		bodyModel[122].rotateAngleX = -0.29670597F;
		bodyModel[122].rotateAngleY = 1.32645023F;

		bodyModel[123].addBox(-0.5F, 0F, 0F, 1, 0, 35, 0F); // Box 730
		bodyModel[123].setRotationPoint(-13.5F, 4.26F, 2F);
		bodyModel[123].rotateAngleX = -0.01745329F;
		bodyModel[123].rotateAngleY = -1.57079633F;

		bodyModel[124].addBox(-0.5F, 0F, 0F, 1, 0, 9, 0F); // Box 325
		bodyModel[124].setRotationPoint(21.25F, 4.9F, 2F);
		bodyModel[124].rotateAngleX = -0.2268928F;
		bodyModel[124].rotateAngleY = -1.79768913F;

		bodyModel[125].addBox(0F, 0F, 0F, 3, 0, 6, 0F); // Box 328
		bodyModel[125].setRotationPoint(-1.5F, 3.5F, 11F);
		bodyModel[125].rotateAngleX = 2.75762022F;

		bodyModel[126].addBox(-3F, 0F, 0F, 3, 0, 6, 0F); // Box 329
		bodyModel[126].setRotationPoint(-1.5F, 3.5F, -11F);
		bodyModel[126].rotateAngleX = 2.75762022F;
		bodyModel[126].rotateAngleY = -3.14159265F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 3, 16, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[127].setRotationPoint(-35F, -0.5F, -8.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[128].setRotationPoint(29F, 1.5F, -2F);

		bodyModel[129].addShapeBox(-3F, 0F, 0F, 0, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[129].setRotationPoint(26F, 3.5F, 7F);
		bodyModel[129].rotateAngleX = 2.03330858F;
		bodyModel[129].rotateAngleY = -3.14159265F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[130].setRotationPoint(29F, 3.5F, -7F);
		bodyModel[130].rotateAngleX = 2.03330858F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[131].setRotationPoint(-29F, 3.5F, -7F);
		bodyModel[131].rotateAngleX = 2.03330858F;

		bodyModel[132].addShapeBox(-3F, 0F, 0F, 0, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[132].setRotationPoint(-32F, 3.5F, 7F);
		bodyModel[132].rotateAngleX = 2.03330858F;
		bodyModel[132].rotateAngleY = -3.14159265F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 336
		bodyModel[133].setRotationPoint(-34F, 1.5F, -2F);

		bodyModel[134].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[134].setRotationPoint(37.53F, 0F, 0F);
		bodyModel[134].rotateAngleY = -1.57079633F;
		bodyModel[134].rotateAngleZ = -0.78539816F;

		bodyModel[135].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 614
		bodyModel[135].setRotationPoint(37.52F, -1F, -0.5F);

		bodyModel[136].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[136].setRotationPoint(-37.53F, 0F, 0F);
		bodyModel[136].rotateAngleY = -1.57079633F;
		bodyModel[136].rotateAngleZ = -0.78539816F;

		bodyModel[137].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 614
		bodyModel[137].setRotationPoint(-37.52F, -1F, -0.5F);

		bodyModel[138].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[138].setRotationPoint(-29F, 0F, 11.03F);
		bodyModel[138].rotateAngleZ = -0.78539816F;

		bodyModel[139].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[139].setRotationPoint(29F, 0F, -11.03F);
		bodyModel[139].rotateAngleZ = -0.78539816F;

		bodyModel[140].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 343
		bodyModel[140].setRotationPoint(28.5F, -0.5F, -11F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 344
		bodyModel[141].setRotationPoint(-29.5F, -0.5F, 11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[142].setRotationPoint(28F, 0.5F, 10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 346
		bodyModel[143].setRotationPoint(-30F, 0.5F, -11F);

		bodyModel[144].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 347
		bodyModel[144].setRotationPoint(-3F, 3F, -1F);

		bodyModel[145].addBox(0F, 0F, 0F, 30, 3, 2, 0F); // Box 168 cull underpipe supports
		bodyModel[145].setRotationPoint(-10F, 2.5F, 1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 162
		bodyModel[146].setRotationPoint(-36.5F, -10F, -3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,-3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F); // Box 163
		bodyModel[147].setRotationPoint(-36.5F, -17.5F, -6F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,-3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F); // Box 164
		bodyModel[148].setRotationPoint(-36.5F, -17F, 3F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F); // Box 165
		bodyModel[149].setRotationPoint(-36.5F, -17.5F, 0F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,-3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 166
		bodyModel[150].setRotationPoint(-36.5F, -17F, -10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,-3F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, -3F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F); // Box 167
		bodyModel[151].setRotationPoint(-36.5F, -10F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F); // Box 168
		bodyModel[152].setRotationPoint(-36.5F, -2.5F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -4F, -3F, -1.5F, -4F); // Box 169
		bodyModel[153].setRotationPoint(-36.5F, -3F, 3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 1.16F, -3F, 0F, 1.16F, -2F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 170
		bodyModel[154].setRotationPoint(-36.5F, -2.5F, -6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,-3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -3F, -3F, -1.5F, -3F); // Box 171
		bodyModel[155].setRotationPoint(-36.5F, -3F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 1F, 0F, 0.34F, 1F, 0F, 0.34F, 0F, -3F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, 0F, 0.34F, 0F, -3F, 0.34F, 0F); // Box 172
		bodyModel[156].setRotationPoint(-36.5F, -10F, 4F);

		bodyModel[157].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 173
		bodyModel[157].setRotationPoint(-1.5F, 7F, 11F);
		bodyModel[157].rotateAngleX = 2.40855437F;

		bodyModel[158].addBox(-3F, 0F, 0F, 3, 0, 8, 0F); // Box 174
		bodyModel[158].setRotationPoint(-1.5F, 7F, -11F);
		bodyModel[158].rotateAngleX = 2.40855437F;
		bodyModel[158].rotateAngleY = -3.14159265F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 159 extended bracket
		bodyModel[159].setRotationPoint(-30.5F, 3.5F, -7F);
		bodyModel[159].rotateAngleX = 2.03330858F;

		bodyModel[160].addShapeBox(-3F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 160 extended bracket
		bodyModel[160].setRotationPoint(-30.5F, 3.5F, 7F);
		bodyModel[160].rotateAngleX = 2.03330858F;
		bodyModel[160].rotateAngleY = -3.14159265F;

		bodyModel[161].addShapeBox(-3F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 161 extended bracket
		bodyModel[161].setRotationPoint(27.5F, 3.5F, 7F);
		bodyModel[161].rotateAngleX = 2.03330858F;
		bodyModel[161].rotateAngleY = -3.14159265F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 162 extended bracket
		bodyModel[162].setRotationPoint(27.5F, 3.5F, -7F);
		bodyModel[162].rotateAngleX = 2.03330858F;
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 163; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.81,-0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.62,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f, f1, f2, f3, f4, f5);
	}
	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }
}