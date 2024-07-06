//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CE8 (Ph 2)
// Model Creator: Biba
// Created on: 05.01.2023 - 20:59:28
// Last changed on: 05.01.2023 - 20:59:28

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelNewBlombergA1ATruck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.enums.BoxName;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelCE8 extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCE8() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[362];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 48, 150, textureX, textureY); // Box 48
		bodyModel[2] = new ModelRendererTurbo(this, 28, 220, textureX, textureY); // Box 132
		bodyModel[3] = new ModelRendererTurbo(this, 7, 220, textureX, textureY); // Box 133
		bodyModel[4] = new ModelRendererTurbo(this, 46, 157, textureX, textureY); // Box 135
		bodyModel[5] = new ModelRendererTurbo(this, 52, 165, textureX, textureY); // Box 139
		bodyModel[6] = new ModelRendererTurbo(this, 128, 229, textureX, textureY); // Box 336
		bodyModel[7] = new ModelRendererTurbo(this, 152, 216, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 85, 180, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 49, 180, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 15, 165, textureX, textureY); // Box 61
		bodyModel[11] = new ModelRendererTurbo(this, 37, 165, textureX, textureY); // Box 356
		bodyModel[12] = new ModelRendererTurbo(this, 24, 160, textureX, textureY); // Box 151
		bodyModel[13] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 184
		bodyModel[14] = new ModelRendererTurbo(this, 31, 202, textureX, textureY); // Box 150
		bodyModel[15] = new ModelRendererTurbo(this, 18, 212, textureX, textureY); // Box 582
		bodyModel[16] = new ModelRendererTurbo(this, 20, 210, textureX, textureY); // Box 38
		bodyModel[17] = new ModelRendererTurbo(this, 26, 194, textureX, textureY); // Box 7
		bodyModel[18] = new ModelRendererTurbo(this, 42, 204, textureX, textureY); // Box 374
		bodyModel[19] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 41
		bodyModel[20] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 42
		bodyModel[21] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 43
		bodyModel[22] = new ModelRendererTurbo(this, 33, 203, textureX, textureY); // Box 49
		bodyModel[23] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 50
		bodyModel[24] = new ModelRendererTurbo(this, 21, 200, textureX, textureY); // Box 51
		bodyModel[25] = new ModelRendererTurbo(this, 105, 186, textureX, textureY); // Box 63
		bodyModel[26] = new ModelRendererTurbo(this, 4, 186, textureX, textureY); // Box 65
		bodyModel[27] = new ModelRendererTurbo(this, 4, 187, textureX, textureY); // Box 66
		bodyModel[28] = new ModelRendererTurbo(this, 9, 185, textureX, textureY); // Box 67
		bodyModel[29] = new ModelRendererTurbo(this, 9, 187, textureX, textureY); // Box 68
		bodyModel[30] = new ModelRendererTurbo(this, 9, 184, textureX, textureY); // Box 69
		bodyModel[31] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 70
		bodyModel[32] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 71
		bodyModel[33] = new ModelRendererTurbo(this, 48, 157, textureX, textureY); // Box 72
		bodyModel[34] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 73
		bodyModel[35] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 74
		bodyModel[36] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 75
		bodyModel[37] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 76
		bodyModel[38] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 77
		bodyModel[39] = new ModelRendererTurbo(this, 33, 205, textureX, textureY); // Box 78
		bodyModel[40] = new ModelRendererTurbo(this, 42, 205, textureX, textureY); // Box 79
		bodyModel[41] = new ModelRendererTurbo(this, 78, 187, textureX, textureY); // Box 69
		bodyModel[42] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 129
		bodyModel[43] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 130
		bodyModel[44] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 133
		bodyModel[45] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 134
		bodyModel[46] = new ModelRendererTurbo(this, 45, 160, textureX, textureY); // Box 61
		bodyModel[47] = new ModelRendererTurbo(this, 89, 160, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 74, 157, textureX, textureY); // Box 80
		bodyModel[49] = new ModelRendererTurbo(this, 83, 160, textureX, textureY); // Box 144
		bodyModel[50] = new ModelRendererTurbo(this, 63, 156, textureX, textureY); // Box 145
		bodyModel[51] = new ModelRendererTurbo(this, 54, 157, textureX, textureY); // Box 147
		bodyModel[52] = new ModelRendererTurbo(this, 51, 160, textureX, textureY); // Box 148
		bodyModel[53] = new ModelRendererTurbo(this, 86, 160, textureX, textureY); // Box 430
		bodyModel[54] = new ModelRendererTurbo(this, 48, 160, textureX, textureY); // Box 433
		bodyModel[55] = new ModelRendererTurbo(this, 367, 199, textureX, textureY); // Box 378
		bodyModel[56] = new ModelRendererTurbo(this, 367, 205, textureX, textureY); // Box 379
		bodyModel[57] = new ModelRendererTurbo(this, 367, 202, textureX, textureY); // Box 380
		bodyModel[58] = new ModelRendererTurbo(this, 24, 168, textureX, textureY); // Box 415
		bodyModel[59] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 261
		bodyModel[60] = new ModelRendererTurbo(this, 95, 150, textureX, textureY); // Box 209
		bodyModel[61] = new ModelRendererTurbo(this, 93, 157, textureX, textureY); // Box 210
		bodyModel[62] = new ModelRendererTurbo(this, 99, 165, textureX, textureY); // Box 211
		bodyModel[63] = new ModelRendererTurbo(this, 128, 229, textureX, textureY); // Box 2
		bodyModel[64] = new ModelRendererTurbo(this, 129, 216, textureX, textureY); // Box 346
		bodyModel[65] = new ModelRendererTurbo(this, 139, 158, textureX, textureY); // Box 259
		bodyModel[66] = new ModelRendererTurbo(this, 142, 164, textureX, textureY); // Box 260
		bodyModel[67] = new ModelRendererTurbo(this, 152, 164, textureX, textureY); // Box 246
		bodyModel[68] = new ModelRendererTurbo(this, 132, 180, textureX, textureY); // Box 20
		bodyModel[69] = new ModelRendererTurbo(this, 96, 180, textureX, textureY); // Box 21
		bodyModel[70] = new ModelRendererTurbo(this, 95, 157, textureX, textureY); // Box 80
		bodyModel[71] = new ModelRendererTurbo(this, 31, 189, textureX, textureY); // Box 126
		bodyModel[72] = new ModelRendererTurbo(this, 9, 197, textureX, textureY); // Box 127
		bodyModel[73] = new ModelRendererTurbo(this, 95, 160, textureX, textureY); // Box 222
		bodyModel[74] = new ModelRendererTurbo(this, 92, 160, textureX, textureY); // Box 223
		bodyModel[75] = new ModelRendererTurbo(this, 98, 160, textureX, textureY); // Box 224
		bodyModel[76] = new ModelRendererTurbo(this, 101, 157, textureX, textureY); // Box 225
		bodyModel[77] = new ModelRendererTurbo(this, 110, 156, textureX, textureY); // Box 226
		bodyModel[78] = new ModelRendererTurbo(this, 121, 157, textureX, textureY); // Box 227
		bodyModel[79] = new ModelRendererTurbo(this, 130, 160, textureX, textureY); // Box 228
		bodyModel[80] = new ModelRendererTurbo(this, 133, 160, textureX, textureY); // Box 229
		bodyModel[81] = new ModelRendererTurbo(this, 136, 160, textureX, textureY); // Box 230
		bodyModel[82] = new ModelRendererTurbo(this, 42, 192, textureX, textureY); // Box 616
		bodyModel[83] = new ModelRendererTurbo(this, 33, 192, textureX, textureY); // Box 617
		bodyModel[84] = new ModelRendererTurbo(this, 33, 190, textureX, textureY); // Box 618
		bodyModel[85] = new ModelRendererTurbo(this, 4, 200, textureX, textureY); // Box 619
		bodyModel[86] = new ModelRendererTurbo(this, 9, 198, textureX, textureY); // Box 620
		bodyModel[87] = new ModelRendererTurbo(this, 9, 200, textureX, textureY); // Box 621
		bodyModel[88] = new ModelRendererTurbo(this, 4, 199, textureX, textureY); // Box 622
		bodyModel[89] = new ModelRendererTurbo(this, 42, 191, textureX, textureY); // Box 623
		bodyModel[90] = new ModelRendererTurbo(this, 20, 210, textureX, textureY); // Box 624
		bodyModel[91] = new ModelRendererTurbo(this, 18, 212, textureX, textureY); // Box 625
		bodyModel[92] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 626
		bodyModel[93] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 627
		bodyModel[94] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 628
		bodyModel[95] = new ModelRendererTurbo(this, 21, 200, textureX, textureY); // Box 629
		bodyModel[96] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 630
		bodyModel[97] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 631
		bodyModel[98] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 632
		bodyModel[99] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 633
		bodyModel[100] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 634
		bodyModel[101] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 635
		bodyModel[102] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 636
		bodyModel[103] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 637
		bodyModel[104] = new ModelRendererTurbo(this, 288, 196, textureX, textureY); // Box 37
		bodyModel[105] = new ModelRendererTurbo(this, 78, 187, textureX, textureY); // Box 143
		bodyModel[106] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 131
		bodyModel[107] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 132
		bodyModel[108] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 135
		bodyModel[109] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 136
		bodyModel[110] = new ModelRendererTurbo(this, 125, 230, textureX, textureY); // Box 38
		bodyModel[111] = new ModelRendererTurbo(this, 229, 244, textureX, textureY); // Box 39
		bodyModel[112] = new ModelRendererTurbo(this, 175, 216, textureX, textureY); // Box 40
		bodyModel[113] = new ModelRendererTurbo(this, 173, 226, textureX, textureY); // Box 94
		bodyModel[114] = new ModelRendererTurbo(this, 173, 226, textureX, textureY); // Box 95
		bodyModel[115] = new ModelRendererTurbo(this, 229, 249, textureX, textureY); // Box 599
		bodyModel[116] = new ModelRendererTurbo(this, 175, 221, textureX, textureY); // Box 600
		bodyModel[117] = new ModelRendererTurbo(this, 71, 228, textureX, textureY); // Box 42
		bodyModel[118] = new ModelRendererTurbo(this, 52, 234, textureX, textureY); // Box 44
		bodyModel[119] = new ModelRendererTurbo(this, 1, 232, textureX, textureY); // Box 324
		bodyModel[120] = new ModelRendererTurbo(this, 52, 241, textureX, textureY); // Box 325
		bodyModel[121] = new ModelRendererTurbo(this, 126, 236, textureX, textureY); // Box 128 engine oil sump
		bodyModel[122] = new ModelRendererTurbo(this, 291, 234, textureX, textureY); // Box 347
		bodyModel[123] = new ModelRendererTurbo(this, 291, 234, textureX, textureY); // Box 130
		bodyModel[124] = new ModelRendererTurbo(this, 220, 232, textureX, textureY); // Box 93
		bodyModel[125] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 292
		bodyModel[126] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 101
		bodyModel[127] = new ModelRendererTurbo(this, 158, 29, textureX, textureY, "cull"); // Box 488 handrail extension cull
		bodyModel[128] = new ModelRendererTurbo(this, 144, 50, textureX, textureY, "cull"); // Box 488 handrail extension cull
		bodyModel[129] = new ModelRendererTurbo(this, 220, 246, textureX, textureY); // Box 526
		bodyModel[130] = new ModelRendererTurbo(this, 220, 246, textureX, textureY); // Box 527
		bodyModel[131] = new ModelRendererTurbo(this, 213, 244, textureX, textureY); // Box 528 kartrak my beloved
		bodyModel[132] = new ModelRendererTurbo(this, 213, 244, textureX, textureY); // Box 529 kartrak my beloved
		bodyModel[133] = new ModelRendererTurbo(this, 140, 53, textureX, textureY); // Box 519 frame stripe fix
		bodyModel[134] = new ModelRendererTurbo(this, 154, 32, textureX, textureY); // Box 520 frame stripe fix
		bodyModel[135] = new ModelRendererTurbo(this, 330, 250, textureX, textureY); // Box 142
		bodyModel[136] = new ModelRendererTurbo(this, 330, 250, textureX, textureY); // Box 143
		bodyModel[137] = new ModelRendererTurbo(this, 410, 193, textureX, textureY); // Box 53
		bodyModel[138] = new ModelRendererTurbo(this, 423, 196, textureX, textureY); // Box 54
		bodyModel[139] = new ModelRendererTurbo(this, 408, 166, textureX, textureY); // Box 55
		bodyModel[140] = new ModelRendererTurbo(this, 403, 196, textureX, textureY, "lamp"); // Box 71 markerlight cull
		bodyModel[141] = new ModelRendererTurbo(this, 430, 193, textureX, textureY); // Box 235
		bodyModel[142] = new ModelRendererTurbo(this, 403, 196, textureX, textureY, "lamp"); // Box 124 markerlight cull
		bodyModel[143] = new ModelRendererTurbo(this, 408, 152, textureX, textureY); // Box 125
		bodyModel[144] = new ModelRendererTurbo(this, 402, 213, textureX, textureY); // Box 143
		bodyModel[145] = new ModelRendererTurbo(this, 443, 200, textureX, textureY); // Box 338
		bodyModel[146] = new ModelRendererTurbo(this, 456, 200, textureX, textureY); // Box 340
		bodyModel[147] = new ModelRendererTurbo(this, 454, 198, textureX, textureY); // Box 344
		bodyModel[148] = new ModelRendererTurbo(this, 304, 130, textureX, textureY); // Box 52 door swing right
		bodyModel[149] = new ModelRendererTurbo(this, 379, 103, textureX, textureY); // Box 68
		bodyModel[150] = new ModelRendererTurbo(this, 395, 96, textureX, textureY); // Box 69
		bodyModel[151] = new ModelRendererTurbo(this, 348, 117, textureX, textureY); // Box 70
		bodyModel[152] = new ModelRendererTurbo(this, 337, 104, textureX, textureY); // Box 74
		bodyModel[153] = new ModelRendererTurbo(this, 348, 101, textureX, textureY); // Box 75
		bodyModel[154] = new ModelRendererTurbo(this, 322, 101, textureX, textureY); // Box 76
		bodyModel[155] = new ModelRendererTurbo(this, 396, 133, textureX, textureY); // Box 72
		bodyModel[156] = new ModelRendererTurbo(this, 315, 133, textureX, textureY); // Box 190
		bodyModel[157] = new ModelRendererTurbo(this, 348, 111, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[158] = new ModelRendererTurbo(this, 348, 111, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[159] = new ModelRendererTurbo(this, 339, 99, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[160] = new ModelRendererTurbo(this, 339, 99, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[161] = new ModelRendererTurbo(this, 269, 118, textureX, textureY); // Box 313
		bodyModel[162] = new ModelRendererTurbo(this, 385, 130, textureX, textureY); // Box 314 door swing right
		bodyModel[163] = new ModelRendererTurbo(this, 107, 123, textureX, textureY); // Box 316
		bodyModel[164] = new ModelRendererTurbo(this, 288, 107, textureX, textureY); // Box 332
		bodyModel[165] = new ModelRendererTurbo(this, 326, 111, textureX, textureY); // Box 333
		bodyModel[166] = new ModelRendererTurbo(this, 395, 123, textureX, textureY); // Box 67
		bodyModel[167] = new ModelRendererTurbo(this, 93, 135, textureX, textureY); // Box 106
		bodyModel[168] = new ModelRendererTurbo(this, 70, 19, textureX, textureY); // Box 176
		bodyModel[169] = new ModelRendererTurbo(this, 73, 20, textureX, textureY); // Box 177
		bodyModel[170] = new ModelRendererTurbo(this, 90, 141, textureX, textureY); // Box 193
		bodyModel[171] = new ModelRendererTurbo(this, 77, 143, textureX, textureY); // Box 343
		bodyModel[172] = new ModelRendererTurbo(this, 56, 143, textureX, textureY); // Box 73 low engi box
		bodyModel[173] = new ModelRendererTurbo(this, 78, 27, textureX, textureY); // Box 192
		bodyModel[174] = new ModelRendererTurbo(this, 87, 25, textureX, textureY); // Box 196
		bodyModel[175] = new ModelRendererTurbo(this, 89, 20, textureX, textureY); // Box 317
		bodyModel[176] = new ModelRendererTurbo(this, 78, 25, textureX, textureY); // Box 319
		bodyModel[177] = new ModelRendererTurbo(this, 403, 208, textureX, textureY, "lamp"); // Box 573 Headlight Front Nose
		bodyModel[178] = new ModelRendererTurbo(this, 403, 201, textureX, textureY); // Box 574 nose light mount
		bodyModel[179] = new ModelRendererTurbo(this, 403, 208, textureX, textureY, "lamp"); // Box 575 Headlight Front Nose
		bodyModel[180] = new ModelRendererTurbo(this, 182, 142, textureX, textureY); // Box 90
		bodyModel[181] = new ModelRendererTurbo(this, 202, 144, textureX, textureY); // Box 91
		bodyModel[182] = new ModelRendererTurbo(this, 193, 144, textureX, textureY); // Box 318
		bodyModel[183] = new ModelRendererTurbo(this, 204, 146, textureX, textureY); // Box 414
		bodyModel[184] = new ModelRendererTurbo(this, 438, 129, textureX, textureY); // Box 412 cs1
		bodyModel[185] = new ModelRendererTurbo(this, 458, 131, textureX, textureY); // Box 413 cs1
		bodyModel[186] = new ModelRendererTurbo(this, 450, 125, textureX, textureY); // Box 86 cs1
		bodyModel[187] = new ModelRendererTurbo(this, 501, 144, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[188] = new ModelRendererTurbo(this, 435, 123, textureX, textureY); // Box 476 cs1 radio
		bodyModel[189] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 482
		bodyModel[190] = new ModelRendererTurbo(this, 463, 116, textureX, textureY); // Box 487 cab heater
		bodyModel[191] = new ModelRendererTurbo(this, 73, 39, textureX, textureY); // Box 81
		bodyModel[192] = new ModelRendererTurbo(this, 70, 40, textureX, textureY); // Box 81
		bodyModel[193] = new ModelRendererTurbo(this, 78, 41, textureX, textureY); // Box 61
		bodyModel[194] = new ModelRendererTurbo(this, 83, 41, textureX, textureY); // Box 174
		bodyModel[195] = new ModelRendererTurbo(this, 78, 43, textureX, textureY); // Box 191
		bodyModel[196] = new ModelRendererTurbo(this, 428, 114, textureX, textureY); // Box 334
		bodyModel[197] = new ModelRendererTurbo(this, 428, 107, textureX, textureY); // Box 335
		bodyModel[198] = new ModelRendererTurbo(this, 375, 234, textureX, textureY); // Box 184 o2 generator
		bodyModel[199] = new ModelRendererTurbo(this, 252, 129, textureX, textureY); // box64
		bodyModel[200] = new ModelRendererTurbo(this, 235, 129, textureX, textureY); // box65
		bodyModel[201] = new ModelRendererTurbo(this, 487, 189, textureX, textureY, "cull"); // Box 3 cull AWW 2window
		bodyModel[202] = new ModelRendererTurbo(this, 489, 184, textureX, textureY); // Box 5 AWW 2window
		bodyModel[203] = new ModelRendererTurbo(this, 487, 206, textureX, textureY, "cull"); // Box 3 cull AWW 2window
		bodyModel[204] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 5 AWW 2window
		bodyModel[205] = new ModelRendererTurbo(this, 263, 136, textureX, textureY); // Box 350
		bodyModel[206] = new ModelRendererTurbo(this, 266, 136, textureX, textureY); // Box 351
		bodyModel[207] = new ModelRendererTurbo(this, 225, 90, textureX, textureY); // Box 262
		bodyModel[208] = new ModelRendererTurbo(this, 214, 94, textureX, textureY); // Box 263
		bodyModel[209] = new ModelRendererTurbo(this, 195, 90, textureX, textureY); // Box 264
		bodyModel[210] = new ModelRendererTurbo(this, 244, 94, textureX, textureY); // Box 265
		bodyModel[211] = new ModelRendererTurbo(this, 244, 101, textureX, textureY, "lamp"); // Box 247 Headlight Rear
		bodyModel[212] = new ModelRendererTurbo(this, 244, 101, textureX, textureY, "lamp"); // Box 248 Headlight Rear
		bodyModel[213] = new ModelRendererTurbo(this, 225, 119, textureX, textureY); // Box 252
		bodyModel[214] = new ModelRendererTurbo(this, 225, 109, textureX, textureY); // Box 253
		bodyModel[215] = new ModelRendererTurbo(this, 239, 109, textureX, textureY); // Box 254
		bodyModel[216] = new ModelRendererTurbo(this, 234, 109, textureX, textureY); // Box 43
		bodyModel[217] = new ModelRendererTurbo(this, 235, 113, textureX, textureY); // Box 43
		bodyModel[218] = new ModelRendererTurbo(this, 238, 87, textureX, textureY); // Box 333
		bodyModel[219] = new ModelRendererTurbo(this, 247, 86, textureX, textureY, "lamp"); // Box 334 Rear Gyralight L
		bodyModel[220] = new ModelRendererTurbo(this, 254, 86, textureX, textureY, "lamp"); // Box 335 Rear Gyralight R
		bodyModel[221] = new ModelRendererTurbo(this, 246, 111, textureX, textureY); // Box 601
		bodyModel[222] = new ModelRendererTurbo(this, 215, 90, textureX, textureY); // Box 402
		bodyModel[223] = new ModelRendererTurbo(this, 251, 92, textureX, textureY, "lamp"); // Box 117 Numberboard R
		bodyModel[224] = new ModelRendererTurbo(this, 251, 92, textureX, textureY, "lamp"); // Box 118 Numberboard R
		bodyModel[225] = new ModelRendererTurbo(this, 46, 83, textureX, textureY); // Box 51
		bodyModel[226] = new ModelRendererTurbo(this, 132, 73, textureX, textureY); // Box 78
		bodyModel[227] = new ModelRendererTurbo(this, 107, 73, textureX, textureY); // Box 319
		bodyModel[228] = new ModelRendererTurbo(this, 182, 73, textureX, textureY); // Box 320
		bodyModel[229] = new ModelRendererTurbo(this, 157, 73, textureX, textureY); // Box 321
		bodyModel[230] = new ModelRendererTurbo(this, 132, 73, textureX, textureY); // Box 237
		bodyModel[231] = new ModelRendererTurbo(this, 157, 73, textureX, textureY); // Box 238
		bodyModel[232] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Box 153 stack 1
		bodyModel[233] = new ModelRendererTurbo(this, 192, 82, textureX, textureY); // Box 154 stack 2
		bodyModel[234] = new ModelRendererTurbo(this, 192, 82, textureX, textureY); // Box 155 stack 3
		bodyModel[235] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Box 156 stack 4
		bodyModel[236] = new ModelRendererTurbo(this, 84, 61, textureX, textureY); // Box 609
		bodyModel[237] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 610
		bodyModel[238] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 256
		bodyModel[239] = new ModelRendererTurbo(this, 84, 61, textureX, textureY); // Box 257
		bodyModel[240] = new ModelRendererTurbo(this, 380, 204, textureX, textureY); // Box 364 prime base
		bodyModel[241] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[242] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[243] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[244] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[245] = new ModelRendererTurbo(this, 389, 199, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[246] = new ModelRendererTurbo(this, 389, 199, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[247] = new ModelRendererTurbo(this, 389, 199, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[248] = new ModelRendererTurbo(this, 389, 199, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[249] = new ModelRendererTurbo(this, 380, 199, textureX, textureY); // Box 428
		bodyModel[250] = new ModelRendererTurbo(this, 154, 8, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[251] = new ModelRendererTurbo(this, 161, 16, textureX, textureY); // Box 450
		bodyModel[252] = new ModelRendererTurbo(this, 367, 190, textureX, textureY); // Box 427
		bodyModel[253] = new ModelRendererTurbo(this, 367, 193, textureX, textureY); // Box 428
		bodyModel[254] = new ModelRendererTurbo(this, 367, 196, textureX, textureY); // Box 429
		bodyModel[255] = new ModelRendererTurbo(this, 376, 193, textureX, textureY); // Box 430
		bodyModel[256] = new ModelRendererTurbo(this, 387, 181, textureX, textureY); // Box 354
		bodyModel[257] = new ModelRendererTurbo(this, 396, 187, textureX, textureY); // Box 355
		bodyModel[258] = new ModelRendererTurbo(this, 385, 187, textureX, textureY); // Box 356
		bodyModel[259] = new ModelRendererTurbo(this, 387, 193, textureX, textureY); // Box 357
		bodyModel[260] = new ModelRendererTurbo(this, 389, 190, textureX, textureY); // Box 358
		bodyModel[261] = new ModelRendererTurbo(this, 389, 184, textureX, textureY); // Box 359
		bodyModel[262] = new ModelRendererTurbo(this, 161, 18, textureX, textureY); // Box 285
		bodyModel[263] = new ModelRendererTurbo(this, 381, 195, textureX, textureY); // Box 409 commander base
		bodyModel[264] = new ModelRendererTurbo(this, 381, 191, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[265] = new ModelRendererTurbo(this, 400, 176, textureX, textureY); // Box 114
		bodyModel[266] = new ModelRendererTurbo(this, 400, 173, textureX, textureY); // Box 74
		bodyModel[267] = new ModelRendererTurbo(this, 400, 179, textureX, textureY); // Box 78
		bodyModel[268] = new ModelRendererTurbo(this, 398, 168, textureX, textureY); // Box 245
		bodyModel[269] = new ModelRendererTurbo(this, 459, 172, textureX, textureY); // Box 285
		bodyModel[270] = new ModelRendererTurbo(this, 472, 172, textureX, textureY); // Box 286
		bodyModel[271] = new ModelRendererTurbo(this, 473, 166, textureX, textureY); // Box 287
		bodyModel[272] = new ModelRendererTurbo(this, 468, 168, textureX, textureY); // Box 288
		bodyModel[273] = new ModelRendererTurbo(this, 468, 165, textureX, textureY); // Box 289
		bodyModel[274] = new ModelRendererTurbo(this, 475, 162, textureX, textureY); // Box 290
		bodyModel[275] = new ModelRendererTurbo(this, 498, 172, textureX, textureY); // Box 393
		bodyModel[276] = new ModelRendererTurbo(this, 486, 166, textureX, textureY); // Box 394
		bodyModel[277] = new ModelRendererTurbo(this, 485, 172, textureX, textureY); // Box 395
		bodyModel[278] = new ModelRendererTurbo(this, 497, 168, textureX, textureY); // Box 396
		bodyModel[279] = new ModelRendererTurbo(this, 497, 165, textureX, textureY); // Box 397
		bodyModel[280] = new ModelRendererTurbo(this, 488, 162, textureX, textureY); // Box 398
		bodyModel[281] = new ModelRendererTurbo(this, 380, 212, textureX, textureY); // Box 364 prime base
		bodyModel[282] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[283] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[284] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[285] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[286] = new ModelRendererTurbo(this, 163, 171, textureX, textureY); // Box 22
		bodyModel[287] = new ModelRendererTurbo(this, 215, 171, textureX, textureY); // Box 23
		bodyModel[288] = new ModelRendererTurbo(this, 176, 169, textureX, textureY); // Box 24
		bodyModel[289] = new ModelRendererTurbo(this, 228, 169, textureX, textureY); // Box 25
		bodyModel[290] = new ModelRendererTurbo(this, 319, 171, textureX, textureY); // Box 431
		bodyModel[291] = new ModelRendererTurbo(this, 267, 171, textureX, textureY); // Box 432
		bodyModel[292] = new ModelRendererTurbo(this, 280, 169, textureX, textureY); // Box 433
		bodyModel[293] = new ModelRendererTurbo(this, 332, 169, textureX, textureY); // Box 434
		bodyModel[294] = new ModelRendererTurbo(this, 367, 177, textureX, textureY); // Box 327
		bodyModel[295] = new ModelRendererTurbo(this, 369, 171, textureX, textureY); // Box 328
		bodyModel[296] = new ModelRendererTurbo(this, 369, 183, textureX, textureY); // Box 329
		bodyModel[297] = new ModelRendererTurbo(this, 378, 177, textureX, textureY); // Box 330
		bodyModel[298] = new ModelRendererTurbo(this, 371, 174, textureX, textureY); // Box 331
		bodyModel[299] = new ModelRendererTurbo(this, 371, 180, textureX, textureY); // Box 332
		bodyModel[300] = new ModelRendererTurbo(this, 390, 171, textureX, textureY); // Box 323
		bodyModel[301] = new ModelRendererTurbo(this, 390, 174, textureX, textureY); // Box 324
		bodyModel[302] = new ModelRendererTurbo(this, 390, 168, textureX, textureY); // Box 325
		bodyModel[303] = new ModelRendererTurbo(this, 389, 164, textureX, textureY); // Box 326
		bodyModel[304] = new ModelRendererTurbo(this, 224, 18, textureX, textureY); // Box 243
		bodyModel[305] = new ModelRendererTurbo(this, 229, 19, textureX, textureY); // Box 244
		bodyModel[306] = new ModelRendererTurbo(this, 224, 18, textureX, textureY); // Box 245
		bodyModel[307] = new ModelRendererTurbo(this, 218, 40, textureX, textureY); // Box 249
		bodyModel[308] = new ModelRendererTurbo(this, 213, 39, textureX, textureY); // Box 250
		bodyModel[309] = new ModelRendererTurbo(this, 213, 39, textureX, textureY); // Box 251
		bodyModel[310] = new ModelRendererTurbo(this, 113, 20, textureX, textureY); // Box 92
		bodyModel[311] = new ModelRendererTurbo(this, 92, 41, textureX, textureY); // Box 99
		bodyModel[312] = new ModelRendererTurbo(this, 105, 20, textureX, textureY); // Box 322
		bodyModel[313] = new ModelRendererTurbo(this, 95, 20, textureX, textureY); // Box 244
		bodyModel[314] = new ModelRendererTurbo(this, 102, 20, textureX, textureY); // Box 246
		bodyModel[315] = new ModelRendererTurbo(this, 92, 20, textureX, textureY); // Box 245
		bodyModel[316] = new ModelRendererTurbo(this, 110, 20, textureX, textureY); // Box 247
		bodyModel[317] = new ModelRendererTurbo(this, 331, 111, textureX, textureY); // Box 336
		bodyModel[318] = new ModelRendererTurbo(this, 317, 113, textureX, textureY, "lamp"); // Box 337 Front Gyralight L
		bodyModel[319] = new ModelRendererTurbo(this, 324, 113, textureX, textureY, "lamp"); // Box 338 Front Gyralight R
		bodyModel[320] = new ModelRendererTurbo(this, 361, 227, textureX, textureY); // Box 278
		bodyModel[321] = new ModelRendererTurbo(this, 361, 224, textureX, textureY); // Box 279
		bodyModel[322] = new ModelRendererTurbo(this, 361, 221, textureX, textureY); // Box 280
		bodyModel[323] = new ModelRendererTurbo(this, 356, 224, textureX, textureY, "cull"); // Box 281 cull
		bodyModel[324] = new ModelRendererTurbo(this, 344, 230, textureX, textureY, "cull"); // Box 271 cull
		bodyModel[325] = new ModelRendererTurbo(this, 344, 233, textureX, textureY); // Box 272
		bodyModel[326] = new ModelRendererTurbo(this, 344, 236, textureX, textureY); // Box 273
		bodyModel[327] = new ModelRendererTurbo(this, 339, 233, textureX, textureY); // Box 274
		bodyModel[328] = new ModelRendererTurbo(this, 33, 135, textureX, textureY); // DBox 89 actual dynamic fan
		bodyModel[329] = new ModelRendererTurbo(this, 5, 129, textureX, textureY); // DBox 91
		bodyModel[330] = new ModelRendererTurbo(this, 15, 119, textureX, textureY); // DBox 101
		bodyModel[331] = new ModelRendererTurbo(this, 2, 119, textureX, textureY); // DBox 105
		bodyModel[332] = new ModelRendererTurbo(this, 36, 119, textureX, textureY); // DBox 172
		bodyModel[333] = new ModelRendererTurbo(this, 15, 124, textureX, textureY); // DBox 173
		bodyModel[334] = new ModelRendererTurbo(this, 2, 124, textureX, textureY); // DBox 176
		bodyModel[335] = new ModelRendererTurbo(this, 36, 124, textureX, textureY); // DBox 177
		bodyModel[336] = new ModelRendererTurbo(this, 15, 145, textureX, textureY); // DBox 178
		bodyModel[337] = new ModelRendererTurbo(this, 36, 145, textureX, textureY); // DBox 179
		bodyModel[338] = new ModelRendererTurbo(this, 36, 150, textureX, textureY); // DBox 180
		bodyModel[339] = new ModelRendererTurbo(this, 15, 150, textureX, textureY); // DBox 181
		bodyModel[340] = new ModelRendererTurbo(this, 2, 150, textureX, textureY); // DBox 182
		bodyModel[341] = new ModelRendererTurbo(this, 2, 145, textureX, textureY); // DBox 183
		bodyModel[342] = new ModelRendererTurbo(this, 360, 231, textureX, textureY); // Box 311
		bodyModel[343] = new ModelRendererTurbo(this, 355, 231, textureX, textureY); // Box 312
		bodyModel[344] = new ModelRendererTurbo(this, 174, 61, textureX, textureY); // Box 354
		bodyModel[345] = new ModelRendererTurbo(this, 174, 61, textureX, textureY); // Box 355
		bodyModel[346] = new ModelRendererTurbo(this, 82, 73, textureX, textureY); // Box 356 dynamic fan
		bodyModel[347] = new ModelRendererTurbo(this, 398, 230, textureX, textureY, "cull"); // Box 73 antenna plate cull
		bodyModel[348] = new ModelRendererTurbo(this, 376, 226, textureX, textureY); // Box 457
		bodyModel[349] = new ModelRendererTurbo(this, 82, 73, textureX, textureY); // Box 359 dynamic fan
		bodyModel[350] = new ModelRendererTurbo(this, 335, 226, textureX, textureY); // Box 78
		bodyModel[351] = new ModelRendererTurbo(this, 335, 226, textureX, textureY); // Box 188
		bodyModel[352] = new ModelRendererTurbo(this, 335, 221, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f up2
		bodyModel[353] = new ModelRendererTurbo(this, 335, 221, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f up2
		bodyModel[354] = new ModelRendererTurbo(this, 328, 226, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[355] = new ModelRendererTurbo(this, 328, 221, textureX, textureY); // Box 190 mu plug
		bodyModel[356] = new ModelRendererTurbo(this, 321, 226, textureX, textureY); // Box 239
		bodyModel[357] = new ModelRendererTurbo(this, 321, 221, textureX, textureY, BoxName.ditch); // Box 24 ditchlight r up2
		bodyModel[358] = new ModelRendererTurbo(this, 321, 221, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r up2
		bodyModel[359] = new ModelRendererTurbo(this, 321, 226, textureX, textureY); // Box 242
		bodyModel[360] = new ModelRendererTurbo(this, 371, 210, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[361] = new ModelRendererTurbo(this, 371, 205, textureX, textureY); // Box 190 mu plug

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[0].setRotationPoint(-48.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 48
		bodyModel[1].setRotationPoint(-45.01F, 1F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[2].setRotationPoint(-47.01F, 6.5F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[3].setRotationPoint(-47.01F, 6.5F, 0F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 135
		bodyModel[4].setRotationPoint(-45.01F, 7.5F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 139
		bodyModel[5].setRotationPoint(-45.01F, 8.5F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 336
		bodyModel[6].setRotationPoint(-46F, 3F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[7].setRotationPoint(-45F, 2F, -3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[8].setRotationPoint(-45.01F, 8.5F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[9].setRotationPoint(-45.01F, 8.5F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0F, -1F, -5.5F, 0F); // Box 61
		bodyModel[10].setRotationPoint(-46F, 1F, 3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F); // Box 356
		bodyModel[11].setRotationPoint(-46F, 1F, -6F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 151
		bodyModel[12].setRotationPoint(-46F, 1F, -2.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 90, 2, 12, 0F); // Box 184
		bodyModel[13].setRotationPoint(-45F, 1F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 150
		bodyModel[14].setRotationPoint(-41F, 1F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 582
		bodyModel[15].setRotationPoint(-45F, 8.5F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 38
		bodyModel[16].setRotationPoint(-45F, 7.5F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 28, 2, 22, 0F); // Box 7
		bodyModel[17].setRotationPoint(-40F, 0F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[18].setRotationPoint(-40F, 2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[19].setRotationPoint(-45F, 6.25F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[20].setRotationPoint(-45F, 4.5F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[21].setRotationPoint(-45F, 2.75F, -7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 49
		bodyModel[22].setRotationPoint(-40F, 2F, -9F);
		bodyModel[22].rotateAngleY = 0.5846853F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[23].setRotationPoint(-45F, 5.25F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[24].setRotationPoint(-45F, 3.5F, -6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 82, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[25].setRotationPoint(-41F, 3F, -6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[26].setRotationPoint(-40F, 2F, 11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[27].setRotationPoint(-40F, 2F, 9F);

		bodyModel[28].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[28].setRotationPoint(-40F, 2F, 9F);
		bodyModel[28].rotateAngleY = -0.5846853F;

		bodyModel[29].addShapeBox(0F, 0F, -4F, 0, 5, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 68
		bodyModel[29].setRotationPoint(-40F, 4F, 9F);
		bodyModel[29].rotateAngleY = -0.5846853F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 69
		bodyModel[30].setRotationPoint(-41F, 1F, 6F);

		bodyModel[31].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 70
		bodyModel[31].setRotationPoint(-45F, 8.5F, 9F);

		bodyModel[32].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 71
		bodyModel[32].setRotationPoint(-45F, 7.5F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 72
		bodyModel[33].setRotationPoint(-45.01F, 7F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[34].setRotationPoint(-45F, 6.25F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[35].setRotationPoint(-45F, 5.25F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[36].setRotationPoint(-45F, 4.5F, 6.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[37].setRotationPoint(-45F, 3.5F, 6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[38].setRotationPoint(-45F, 2.75F, 5.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 78
		bodyModel[39].setRotationPoint(-40F, 4F, -9F);
		bodyModel[39].rotateAngleY = 0.5846853F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
		bodyModel[40].setRotationPoint(-40F, 2F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[41].setRotationPoint(-28.75F, 2.75F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[42].setRotationPoint(-28.25F, 2F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[43].setRotationPoint(-28.25F, 2F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[44].setRotationPoint(-27.25F, 2F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[45].setRotationPoint(-27.25F, 2F, 9F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[46].setRotationPoint(-45.01F, 0F, 10F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[47].setRotationPoint(-45.01F, 0F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 80
		bodyModel[48].setRotationPoint(-45.01F, -7F, -7F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[49].setRotationPoint(-45.01F, -7F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 145
		bodyModel[50].setRotationPoint(-46.01F, -7F, -2.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[51].setRotationPoint(-45.01F, -7F, 3F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[52].setRotationPoint(-45.01F, -7F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 430
		bodyModel[53].setRotationPoint(-45.01F, -7F, -8F);
		bodyModel[53].rotateAngleY = -3.14159265F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 433
		bodyModel[54].setRotationPoint(-45.01F, -7F, 9F);
		bodyModel[54].rotateAngleY = -3.14159265F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[55].setRotationPoint(-43.5F, 3F, 4.3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 379
		bodyModel[56].setRotationPoint(-43.25F, 4.5F, 4.55F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 380
		bodyModel[57].setRotationPoint(-43.5F, 4F, 4.3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 415
		bodyModel[58].setRotationPoint(-46.25F, 1F, -2.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 261
		bodyModel[59].setRotationPoint(45.5F, 3F, -1.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 209
		bodyModel[60].setRotationPoint(45.01F, 1F, -10F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 210
		bodyModel[61].setRotationPoint(45.01F, 7.5F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 211
		bodyModel[62].setRotationPoint(45.01F, 8.5F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 2
		bodyModel[63].setRotationPoint(45F, 3F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 346
		bodyModel[64].setRotationPoint(40F, 2F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[65].setRotationPoint(45F, 1F, -5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[66].setRotationPoint(45F, 1F, -7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 246
		bodyModel[67].setRotationPoint(45F, 1F, 5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 20
		bodyModel[68].setRotationPoint(45.01F, 8.5F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[69].setRotationPoint(45.01F, 8.5F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 80
		bodyModel[70].setRotationPoint(45.01F, 7F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 126
		bodyModel[71].setRotationPoint(39F, 1F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 127
		bodyModel[72].setRotationPoint(39F, 1F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 222
		bodyModel[73].setRotationPoint(45.01F, -7F, -8F);
		bodyModel[73].rotateAngleY = -3.14159265F;

		bodyModel[74].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 223
		bodyModel[74].setRotationPoint(45.01F, 0F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 224
		bodyModel[75].setRotationPoint(45.01F, -7F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 225
		bodyModel[76].setRotationPoint(45.01F, -7F, -7F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 226
		bodyModel[77].setRotationPoint(46.01F, -7F, -2.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[78].setRotationPoint(45.01F, -7F, 3F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 228
		bodyModel[79].setRotationPoint(45.01F, -7F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 229
		bodyModel[80].setRotationPoint(45.01F, -7F, 9F);
		bodyModel[80].rotateAngleY = -3.14159265F;

		bodyModel[81].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 230
		bodyModel[81].setRotationPoint(45.01F, 0F, 10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 616
		bodyModel[82].setRotationPoint(40F, 2F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 617
		bodyModel[83].setRotationPoint(40F, 4F, -9F);
		bodyModel[83].rotateAngleY = -0.5846853F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 618
		bodyModel[84].setRotationPoint(40F, 2F, -9F);
		bodyModel[84].rotateAngleY = -0.5846853F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 619
		bodyModel[85].setRotationPoint(40F, 2F, 9F);

		bodyModel[86].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[86].setRotationPoint(40F, 2F, 9F);
		bodyModel[86].rotateAngleY = 0.5846853F;

		bodyModel[87].addShapeBox(0F, 0F, -4F, 0, 5, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 621
		bodyModel[87].setRotationPoint(40F, 4F, 9F);
		bodyModel[87].rotateAngleY = 0.5846853F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 622
		bodyModel[88].setRotationPoint(38F, 2F, 11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 623
		bodyModel[89].setRotationPoint(38F, 2F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 624
		bodyModel[90].setRotationPoint(40F, 7.5F, -9F);

		bodyModel[91].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 625
		bodyModel[91].setRotationPoint(40F, 8.5F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F); // Box 626
		bodyModel[92].setRotationPoint(40F, 6.25F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 627
		bodyModel[93].setRotationPoint(41F, 5.25F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 628
		bodyModel[94].setRotationPoint(41F, 4.5F, -8.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 629
		bodyModel[95].setRotationPoint(41F, 3.5F, -6.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 630
		bodyModel[96].setRotationPoint(42F, 2.75F, -7.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 631
		bodyModel[97].setRotationPoint(40F, 7.5F, 9F);

		bodyModel[98].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 632
		bodyModel[98].setRotationPoint(40F, 8.5F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 633
		bodyModel[99].setRotationPoint(41F, 5.25F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,-1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		bodyModel[100].setRotationPoint(40F, 6.25F, 7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 635
		bodyModel[101].setRotationPoint(41F, 3.5F, 6.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 636
		bodyModel[102].setRotationPoint(41F, 4.5F, 6.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 637
		bodyModel[103].setRotationPoint(42F, 2.75F, 5.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 28, 2, 22, 0F); // Box 37
		bodyModel[104].setRotationPoint(12F, 0F, -11F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[105].setRotationPoint(24.75F, 2.75F, -2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 131
		bodyModel[106].setRotationPoint(25.25F, 2F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 132
		bodyModel[107].setRotationPoint(25.25F, 2F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[108].setRotationPoint(26.25F, 2F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 136
		bodyModel[109].setRotationPoint(26.25F, 2F, 9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 24, 3, 21, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[110].setRotationPoint(-12F, 0F, -10.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[111].setRotationPoint(12F, 2F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 40
		bodyModel[112].setRotationPoint(-16F, 2F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[113].setRotationPoint(-12F, 3.5F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[114].setRotationPoint(-12F, 3.5F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[115].setRotationPoint(12F, 2F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 600
		bodyModel[116].setRotationPoint(-16F, 2F, 9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 17, 2, 20, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 42
		bodyModel[117].setRotationPoint(-8F, 4F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 44
		bodyModel[118].setRotationPoint(-8F, 6F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 17, 3, 16, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 324
		bodyModel[119].setRotationPoint(-8F, 6F, -8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0.5F, -0.25F, -2F); // Box 325
		bodyModel[120].setRotationPoint(-8F, 6F, 8F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128 engine oil sump
		bodyModel[121].setRotationPoint(12F, 3F, -3F);
		bodyModel[121].rotateAngleZ = -1.11701072F;

		bodyModel[122].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 16, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 347
		bodyModel[122].setRotationPoint(-10F, 6.5F, -8F);
		bodyModel[122].rotateAngleZ = 0.78539816F;

		bodyModel[123].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 16, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 130
		bodyModel[123].setRotationPoint(11F, 6.5F, -8F);
		bodyModel[123].rotateAngleZ = 0.78539816F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 24, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[124].setRotationPoint(-12F, 0F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 292
		bodyModel[125].setRotationPoint(4F, 2.5F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
		bodyModel[126].setRotationPoint(4F, 2.5F, 10F);

		bodyModel[127].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 488 handrail extension cull
		bodyModel[127].setRotationPoint(-8F, 0.5F, 10F);

		bodyModel[128].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 488 handrail extension cull
		bodyModel[128].setRotationPoint(-8F, 0.5F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 526
		bodyModel[129].setRotationPoint(3F, 0.5F, 9.95F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 527
		bodyModel[130].setRotationPoint(3F, 0.5F, -10.95F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 528 kartrak my beloved
		bodyModel[131].setRotationPoint(-4.5F, 0.5F, 9.75F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 529 kartrak my beloved
		bodyModel[132].setRotationPoint(-4.5F, 0.5F, -10.75F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 24, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519 frame stripe fix
		bodyModel[133].setRotationPoint(-12F, 0F, -10.51F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 24, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520 frame stripe fix
		bodyModel[134].setRotationPoint(-12F, 0F, 10.51F);

		bodyModel[135].addBox(0F, 0F, 0F, 22, 4, 0, 0F); // Box 142
		bodyModel[135].setRotationPoint(-10.5F, 3F, -8.01F);

		bodyModel[136].addBox(0F, 0F, 0F, 22, 4, 0, 0F); // Box 143
		bodyModel[136].setRotationPoint(-10.5F, 3F, 8.01F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyModel[137].setRotationPoint(-42F, -13F, 1F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 54
		bodyModel[138].setRotationPoint(-42F, -13F, -1F);

		bodyModel[139].addBox(0F, 0F, 0F, 6, 14, 12, 0F); // Box 55
		bodyModel[139].setRotationPoint(-41F, -13F, -6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F); // Box 71 markerlight cull
		bodyModel[140].setRotationPoint(-41.25F, -12F, -5.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[141].setRotationPoint(-42F, -13F, -6F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 markerlight cull
		bodyModel[142].setRotationPoint(-41.25F, -12F, 3.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[143].setRotationPoint(-41F, -14F, -6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[144].setRotationPoint(-41.5F, -13.5F, -1F);

		bodyModel[145].addBox(0F, 0F, 0F, 6, 11, 0, 0F); // Box 338
		bodyModel[145].setRotationPoint(-41.5F, -14F, -5.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 11, 0, 0F); // Box 340
		bodyModel[146].setRotationPoint(-41.5F, -14F, 5.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 344
		bodyModel[147].setRotationPoint(-38.5F, -14F, 5.5F);
		bodyModel[147].rotateAngleY = -0.78539816F;

		bodyModel[148].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[148].setRotationPoint(-34.5F, -18F, -9.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 15, 1, 18, 0F); // Box 68
		bodyModel[149].setRotationPoint(-35F, -22F, -9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[150].setRotationPoint(-35F, -22F, 9F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 13, 17, 0F); // Box 70
		bodyModel[151].setRotationPoint(-21F, -18F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[152].setRotationPoint(-38F, -22F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[153].setRotationPoint(-37F, -22F, -6F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[154].setRotationPoint(-37F, -22F, 1F);

		bodyModel[155].addBox(0F, 0F, 0F, 14, 13, 1, 0F); // Box 72
		bodyModel[155].setRotationPoint(-35F, -18F, 10F);

		bodyModel[156].addBox(0F, 0F, 0F, 15, 13, 1, 0F); // Box 190
		bodyModel[156].setRotationPoint(-35F, -18F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[157].setRotationPoint(-35.05F, -21F, -6F);
		bodyModel[157].rotateAngleY = 0.38397244F;

		bodyModel[158].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[158].setRotationPoint(-35.05F, -21F, 6F);
		bodyModel[158].rotateAngleY = -0.38397244F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[159].setRotationPoint(-37.75F, -22F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[160].setRotationPoint(-37.75F, -20F, -1F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 13, 16, 0F); // Box 313
		bodyModel[161].setRotationPoint(-35F, -18F, -6F);

		bodyModel[162].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[162].setRotationPoint(-20.5F, -18F, 10.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 15, 5, 22, 0F); // Box 316
		bodyModel[163].setRotationPoint(-35F, -5F, -11F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[164].setRotationPoint(-35F, -21F, -9F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[165].setRotationPoint(-21F, -21F, -9F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[166].setRotationPoint(-35F, -22F, -11F);

		bodyModel[167].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 106
		bodyModel[167].setRotationPoint(-40F, -5F, -11.01F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[168].setRotationPoint(-40.5F, -5F, 10.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 0, 16, 2, 0F); // Box 177
		bodyModel[169].setRotationPoint(-40.5F, -11F, 9F);

		bodyModel[170].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 193
		bodyModel[170].setRotationPoint(-38F, -4F, -11F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 343
		bodyModel[171].setRotationPoint(-39F, -2F, -11F);

		bodyModel[172].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 73 low engi box
		bodyModel[172].setRotationPoint(-40F, -2F, 6F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 192
		bodyModel[173].setRotationPoint(-40F, -10F, 11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.25F, 0F, 0F); // Box 196
		bodyModel[174].setRotationPoint(-36.5F, -11F, 11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 317
		bodyModel[175].setRotationPoint(-35.5F, -13F, 11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[176].setRotationPoint(-40.5F, -11F, 11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 573 Headlight Front Nose
		bodyModel[177].setRotationPoint(-42.75F, -10F, -1F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 574 nose light mount
		bodyModel[178].setRotationPoint(-43F, -12F, -1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 575 Headlight Front Nose
		bodyModel[179].setRotationPoint(-42.75F, -12F, -1F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 90
		bodyModel[180].setRotationPoint(-20F, -4F, 7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[181].setRotationPoint(-20F, -5F, 11.01F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[182].setRotationPoint(-19F, -2F, 7F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 414
		bodyModel[183].setRotationPoint(-19F, -4F, 11.01F);

		bodyModel[184].addBox(0.5F, 0F, 0.5F, 4, 9, 3, 0F); // Box 412 cs1
		bodyModel[184].setRotationPoint(-29F, -14F, 0F);
		bodyModel[184].rotateAngleY = -0.26179939F;

		bodyModel[185].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // Box 413 cs1
		bodyModel[185].setRotationPoint(-34.1F, -12F, 4F);
		bodyModel[185].rotateAngleY = -0.59341195F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 86 cs1
		bodyModel[186].setRotationPoint(-34.1F, -14F, 4F);
		bodyModel[186].rotateAngleY = -0.59341195F;

		bodyModel[187].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[187].setRotationPoint(-34F, -12F, -4F);

		bodyModel[188].addShapeBox(0.5F, 0F, 0.5F, 4, 2, 3, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 476 cs1 radio
		bodyModel[188].setRotationPoint(-29F, -16F, 0F);
		bodyModel[188].rotateAngleY = -0.26179939F;

		bodyModel[189].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 482
		bodyModel[189].setRotationPoint(-22F, -21F, -6F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487 cab heater
		bodyModel[190].setRotationPoint(-34F, -10F, -6F);

		bodyModel[191].addBox(0F, 0F, 0F, 0, 16, 2, 0F); // Box 81
		bodyModel[191].setRotationPoint(-40.5F, -11F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[192].setRotationPoint(-40.5F, -5F, -11.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 61
		bodyModel[193].setRotationPoint(-40.5F, -11F, -11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[194].setRotationPoint(-38.5F, -11F, -11F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 191
		bodyModel[195].setRotationPoint(-40F, -10F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[196].setRotationPoint(-34F, -21F, 6F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[197].setRotationPoint(-34F, -21F, -9F);

		bodyModel[198].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[198].setRotationPoint(-30.5F, -23.75F, -4F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[199].setRotationPoint(-34F, -18F, 11F);
		bodyModel[199].rotateAngleX = 0.26179939F;

		bodyModel[200].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[200].setRotationPoint(-34F, -18.25F, -11.97F);
		bodyModel[200].rotateAngleX = -0.26179939F;

		bodyModel[201].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull AWW 2window
		bodyModel[201].setRotationPoint(-34F, -17F, 10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 AWW 2window
		bodyModel[202].setRotationPoint(-34F, -18F, 10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull AWW 2window
		bodyModel[203].setRotationPoint(-27F, -17F, -10F);
		bodyModel[203].rotateAngleY = -3.14159265F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 AWW 2window
		bodyModel[204].setRotationPoint(-27F, -18F, -10F);
		bodyModel[204].rotateAngleY = -3.14159265F;

		bodyModel[205].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[205].setRotationPoint(-34F, -16F, -12F);

		bodyModel[206].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[206].setRotationPoint(-34F, -16F, 11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[207].setRotationPoint(40F, -20F, 1F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 21, 2, 0F); // Box 263
		bodyModel[208].setRotationPoint(40F, -20F, -1F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[209].setRotationPoint(40F, -20F, -7F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 265
		bodyModel[210].setRotationPoint(42.5F, -18.5F, -1F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Rear
		bodyModel[211].setRotationPoint(42.75F, -18.5F, -1F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Rear
		bodyModel[212].setRotationPoint(42.75F, -16.5F, -1F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[213].setRotationPoint(40F, -1F, 1F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[214].setRotationPoint(40F, -8F, 1F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[215].setRotationPoint(40F, -8F, 5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[216].setRotationPoint(39.75F, -7F, 3.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 43
		bodyModel[217].setRotationPoint(39.75F, -5F, 4F);

		bodyModel[218].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 333
		bodyModel[218].setRotationPoint(42F, -20.5F, -2F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 334 Rear Gyralight L
		bodyModel[219].setRotationPoint(43.25F, -20.5F, -2F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 335 Rear Gyralight R
		bodyModel[220].setRotationPoint(43.25F, -20.5F, 0F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 601
		bodyModel[221].setRotationPoint(42F, -8F, 2.75F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[222].setRotationPoint(39.5F, -20.5F, -1F);

		bodyModel[223].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard R
		bodyModel[223].setRotationPoint(40.51F, -17F, -6F);
		bodyModel[223].rotateAngleY = -0.4712389F;

		bodyModel[224].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard R
		bodyModel[224].setRotationPoint(40.51F, -17F, 6F);
		bodyModel[224].rotateAngleY = 0.4712389F;

		bodyModel[225].addBox(0F, 0F, 0F, 60, 20, 14, 0F); // Box 51
		bodyModel[225].setRotationPoint(-20F, -20F, -7F);

		bodyModel[226].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 78
		bodyModel[226].setRotationPoint(-12F, -20.75F, -3F);

		bodyModel[227].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 319
		bodyModel[227].setRotationPoint(3F, -20.75F, -3F);

		bodyModel[228].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 320
		bodyModel[228].setRotationPoint(10F, -20.75F, -3F);

		bodyModel[229].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 321
		bodyModel[229].setRotationPoint(25F, -20.75F, -3F);

		bodyModel[230].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 237
		bodyModel[230].setRotationPoint(-19F, -20.75F, -3F);

		bodyModel[231].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 238
		bodyModel[231].setRotationPoint(32F, -20.75F, -3F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 153 stack 1
		bodyModel[232].setRotationPoint(-5.25F, -22F, -1.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 154 stack 2
		bodyModel[233].setRotationPoint(-2.75F, -22F, -1.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 155 stack 3
		bodyModel[234].setRotationPoint(19.75F, -22F, -1.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 156 stack 4
		bodyModel[235].setRotationPoint(22.25F, -22F, -1.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 609
		bodyModel[236].setRotationPoint(5.5F, -18.5F, 6.1F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 610
		bodyModel[237].setRotationPoint(27F, -18.5F, 6.1F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[238].setRotationPoint(27F, -18.5F, -7.1F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 257
		bodyModel[239].setRotationPoint(5.5F, -18.5F, -7.1F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[240].setRotationPoint(-34F, -23F, -8.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[241].setRotationPoint(-34F, -23.5F, -8.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[242].setRotationPoint(-34F, -23.5F, -8.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[243].setRotationPoint(-34F, -23.5F, -8.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[244].setRotationPoint(-34F, -23.5F, -8.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[245].setRotationPoint(-34F, -23.5F, 6.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[246].setRotationPoint(-34F, -23.5F, 6.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[247].setRotationPoint(-34F, -23.5F, 6.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[248].setRotationPoint(-34F, -23.5F, 6.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[249].setRotationPoint(-34F, -23F, 6.5F);

		bodyModel[250].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[250].setRotationPoint(-25F, -24F, -2.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[251].setRotationPoint(-24F, -25F, 0F);

		bodyModel[252].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[252].setRotationPoint(-34F, -23.5F, -8.5F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[253].setRotationPoint(-33F, -23.5F, -7.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[254].setRotationPoint(-34F, -23.5F, -6.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[255].setRotationPoint(-32.5F, -22.5F, -7.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[256].setRotationPoint(-24.5F, -23.5F, -5F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[257].setRotationPoint(-23F, -22.75F, -6F);

		bodyModel[258].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[258].setRotationPoint(-25.5F, -23.75F, -6F);

		bodyModel[259].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[259].setRotationPoint(-25F, -23.5F, -7F);

		bodyModel[260].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 358
		bodyModel[260].setRotationPoint(-24F, -24.75F, -6.5F);

		bodyModel[261].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[261].setRotationPoint(-24F, -24.75F, -5.25F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[262].setRotationPoint(-25.5F, -23F, 6F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[263].setRotationPoint(-25F, -23F, -0.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[264].setRotationPoint(-25F, -24F, -0.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[265].setRotationPoint(-19F, -18.25F, -9F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[266].setRotationPoint(-19F, -19.25F, -9F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[267].setRotationPoint(-18.75F, -17.75F, -8.75F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[268].setRotationPoint(-19F, -20.25F, -8.8F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -3F, -0.5F, -1F, 1F, 1F, 0F, 1F, 1F); // Box 285
		bodyModel[269].setRotationPoint(-28F, -26F, 7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -3F, -0.5F, 0F, -3F, -3F); // Box 286
		bodyModel[270].setRotationPoint(-28F, -26F, 5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 287
		bodyModel[271].setRotationPoint(-28F, -28F, 5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 288
		bodyModel[272].setRotationPoint(-28F, -28F, 8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[273].setRotationPoint(-28F, -29F, 8F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[274].setRotationPoint(-28F, -29F, 6F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 1F, 1F, -1F, 1F, 1F, 1F, -3F, -0.5F, 0F, 0F, -3F); // Box 393
		bodyModel[275].setRotationPoint(-28F, -26F, -10F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[276].setRotationPoint(-28F, -28F, -8F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -3F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 395
		bodyModel[277].setRotationPoint(-28F, -26F, -8F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 396
		bodyModel[278].setRotationPoint(-28F, -28F, -9F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[279].setRotationPoint(-28F, -29F, -9F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[280].setRotationPoint(-28F, -29F, -8F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[281].setRotationPoint(-37.5F, -25F, -1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[282].setRotationPoint(-37.5F, -25.5F, -1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[283].setRotationPoint(-37.5F, -25.5F, -1F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[284].setRotationPoint(-37.5F, -25.5F, -1F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[285].setRotationPoint(-37.5F, -25.5F, -1F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[286].setRotationPoint(-49F, 7.5F, 0F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[287].setRotationPoint(-49F, 7.5F, -10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[288].setRotationPoint(-48F, 6.5F, 0F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[289].setRotationPoint(-48F, 6.5F, -10F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 431
		bodyModel[290].setRotationPoint(48F, 7.5F, 0F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 432
		bodyModel[291].setRotationPoint(48F, 7.5F, -10F);

		bodyModel[292].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 433
		bodyModel[292].setRotationPoint(48F, 6.5F, -10F);

		bodyModel[293].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 434
		bodyModel[293].setRotationPoint(48F, 6.5F, 0F);

		bodyModel[294].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[294].setRotationPoint(4.5F, -21.5F, -6F);

		bodyModel[295].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[295].setRotationPoint(5.5F, -21.25F, -5F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[296].setRotationPoint(5F, -21.25F, -7F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[297].setRotationPoint(7F, -20.5F, -6F);

		bodyModel[298].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[298].setRotationPoint(6F, -22.5F, -5.25F);

		bodyModel[299].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[299].setRotationPoint(6F, -22.5F, -6.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 323
		bodyModel[300].setRotationPoint(1F, -18F, 7.7F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 324
		bodyModel[301].setRotationPoint(1.25F, -17.5F, 7.95F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[302].setRotationPoint(1F, -19F, 7.7F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 326
		bodyModel[303].setRotationPoint(1F, -20F, 7F);

		bodyModel[304].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[304].setRotationPoint(40.5F, -8F, 9F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[305].setRotationPoint(40.5F, -6F, 10.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[306].setRotationPoint(40F, -8F, 11F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[307].setRotationPoint(40.5F, -6F, -11.5F);

		bodyModel[308].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[308].setRotationPoint(40.5F, -8F, -11F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[309].setRotationPoint(40F, -8F, -11F);

		bodyModel[310].addBox(0F, 0F, 0F, 55, 8, 0, 0F); // Box 92
		bodyModel[310].setRotationPoint(-15F, -8F, 11F);

		bodyModel[311].addBox(0F, 0F, 0F, 60, 8, 0, 0F); // Box 99
		bodyModel[311].setRotationPoint(-20F, -8F, -11F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, 0.25F, -0.5F, 0F); // Box 322
		bodyModel[312].setRotationPoint(-17F, -10F, 11F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.75F, 2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, 2F, 0F, -0.5F, -2F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.5F, -2F, 0F); // Box 244
		bodyModel[313].setRotationPoint(-20.5F, -11F, 11F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 246
		bodyModel[314].setRotationPoint(-18F, -10.5F, 11F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 245
		bodyModel[315].setRotationPoint(-20.5F, -13F, 11F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 247
		bodyModel[316].setRotationPoint(-15.5F, -8F, 11F);

		bodyModel[317].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[317].setRotationPoint(-37.5F, -24F, -2F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 Front Gyralight L
		bodyModel[318].setRotationPoint(-38.25F, -24F, 0F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 Front Gyralight R
		bodyModel[319].setRotationPoint(-38.25F, -24F, -2F);

		bodyModel[320].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[320].setRotationPoint(-38F, -24.5F, -1.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[321].setRotationPoint(-37F, -24.5F, -0.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[322].setRotationPoint(-39F, -24.5F, 0.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 281 cull
		bodyModel[323].setRotationPoint(-36F, -23.5F, -0.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 271 cull
		bodyModel[324].setRotationPoint(-37F, -24F, 7F);

		bodyModel[325].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[325].setRotationPoint(-34F, -24F, 6F);

		bodyModel[326].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 273
		bodyModel[326].setRotationPoint(-36F, -24F, 5F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 274
		bodyModel[327].setRotationPoint(-34F, -23F, 6F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // DBox 89 actual dynamic fan
		bodyModel[328].setRotationPoint(6.5F, -21.5F, -3F);

		bodyModel[329].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // DBox 91
		bodyModel[329].setRotationPoint(6.5F, -21F, -7F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // DBox 101
		bodyModel[330].setRotationPoint(5.5F, -19F, 7F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // DBox 105
		bodyModel[331].setRotationPoint(1.5F, -19F, 7F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // DBox 172
		bodyModel[332].setRotationPoint(13.5F, -19F, 7F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 173
		bodyModel[333].setRotationPoint(5.5F, -21F, 7F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // DBox 176
		bodyModel[334].setRotationPoint(1.5F, -21F, 7F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // DBox 177
		bodyModel[335].setRotationPoint(13.5F, -21F, 7F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 178
		bodyModel[336].setRotationPoint(5.5F, -21F, -9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 179
		bodyModel[337].setRotationPoint(13.5F, -21F, -9F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // DBox 180
		bodyModel[338].setRotationPoint(13.5F, -19F, -9F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 181
		bodyModel[339].setRotationPoint(5.5F, -19F, -9F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // DBox 182
		bodyModel[340].setRotationPoint(1.5F, -19F, -9F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 183
		bodyModel[341].setRotationPoint(1.5F, -21F, -9F);

		bodyModel[342].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 311
		bodyModel[342].setRotationPoint(36F, -21.5F, 5F);

		bodyModel[343].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 312
		bodyModel[343].setRotationPoint(36F, -20.5F, 5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 354
		bodyModel[344].setRotationPoint(-19F, -18.5F, 6.1F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 355
		bodyModel[345].setRotationPoint(-19F, -18.5F, -7.1F);

		bodyModel[346].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 356 dynamic fan
		bodyModel[346].setRotationPoint(0F, -20.75F, -3F);

		bodyModel[347].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 73 antenna plate cull
		bodyModel[347].setRotationPoint(-36F, -24F, -3F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[348].setRotationPoint(-35F, -25F, 0F);

		bodyModel[349].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 359 dynamic fan
		bodyModel[349].setRotationPoint(13F, -20.75F, -3F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[350].setRotationPoint(-45F, -2F, 3.75F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[351].setRotationPoint(-45F, -2F, -5.75F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up2
		bodyModel[352].setRotationPoint(-45.25F, -2F, 3.75F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up2
		bodyModel[353].setRotationPoint(-45.25F, -2F, -5.75F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[354].setRotationPoint(-45.25F, -3F, -4.75F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[355].setRotationPoint(-45.5F, -3F, -4.75F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[356].setRotationPoint(44F, -2F, -5.75F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 24 ditchlight r up2
		bodyModel[357].setRotationPoint(44.25F, -2F, -5.75F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up2
		bodyModel[358].setRotationPoint(44.25F, -2F, 3.75F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[359].setRotationPoint(44F, -2F, 3.75F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[360].setRotationPoint(44.5F, -3F, 2.75F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[361].setRotationPoint(44.75F, -3F, 2.75F);
	}
	ModelNewBlombergA1ATruck theTruck = new ModelNewBlombergA1ATruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderLocomotiveModel(bodyModel, entity , f5);

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBlombergA1ATruckSilverFncc.png"));

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/NewBlombergA1ATruckBlack.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.67, -0.02, 0);
		theTruck.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(3.35, 0, 0);
		theTruck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}