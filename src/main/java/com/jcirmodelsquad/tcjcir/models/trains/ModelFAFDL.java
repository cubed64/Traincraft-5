//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FAFDL
// Model Creator: Binky, Dominik, & Bida
// Created on: 02.06.2022 - 22:57:18
// Last changed on: 02.06.2022 - 22:57:18

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
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


public class ModelFAFDL extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelFAFDL() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[408];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 425, 140, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 439, 134, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 127, 140, textureX, textureY); // Box 120
		bodyModel[3] = new ModelRendererTurbo(this, 105, 134, textureX, textureY); // Box 121
		bodyModel[4] = new ModelRendererTurbo(this, 125, 34, textureX, textureY); // Box 34
		bodyModel[5] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 436, 128, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 422, 128, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 138, 128, textureX, textureY); // Box 79
		bodyModel[9] = new ModelRendererTurbo(this, 119, 125, textureX, textureY); // Box 122
		bodyModel[10] = new ModelRendererTurbo(this, 110, 125, textureX, textureY); // Box 122
		bodyModel[11] = new ModelRendererTurbo(this, 438, 122, textureX, textureY); // Box 193
		bodyModel[12] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 195
		bodyModel[13] = new ModelRendererTurbo(this, 439, 125, textureX, textureY); // Box 197
		bodyModel[14] = new ModelRendererTurbo(this, 304, 53, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 86, 147, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 458, 147, textureX, textureY); // Box 214
		bodyModel[17] = new ModelRendererTurbo(this, 86, 134, textureX, textureY); // Box 121
		bodyModel[18] = new ModelRendererTurbo(this, 458, 134, textureX, textureY); // Box 216
		bodyModel[19] = new ModelRendererTurbo(this, 287, 55, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 76, 87, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 1, 82, textureX, textureY); // Box 219
		bodyModel[22] = new ModelRendererTurbo(this, 35, 136, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 63, 99, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 10, 99, textureX, textureY); // Box 223
		bodyModel[25] = new ModelRendererTurbo(this, 10, 82, textureX, textureY); // Box 224
		bodyModel[26] = new ModelRendererTurbo(this, 35, 112, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[27] = new ModelRendererTurbo(this, 48, 96, textureX, textureY); // Box 103
		bodyModel[28] = new ModelRendererTurbo(this, 43, 106, textureX, textureY); // Box 103
		bodyModel[29] = new ModelRendererTurbo(this, 33, 96, textureX, textureY); // Box 270
		bodyModel[30] = new ModelRendererTurbo(this, 38, 106, textureX, textureY); // Box 274
		bodyModel[31] = new ModelRendererTurbo(this, 35, 88, textureX, textureY); // Box 103
		bodyModel[32] = new ModelRendererTurbo(this, 58, 91, textureX, textureY); // Box 103
		bodyModel[33] = new ModelRendererTurbo(this, 23, 91, textureX, textureY); // Box 284
		bodyModel[34] = new ModelRendererTurbo(this, 43, 109, textureX, textureY); // Box 103
		bodyModel[35] = new ModelRendererTurbo(this, 48, 109, textureX, textureY); // Box 103
		bodyModel[36] = new ModelRendererTurbo(this, 53, 115, textureX, textureY); // Box 103
		bodyModel[37] = new ModelRendererTurbo(this, 58, 115, textureX, textureY); // Box 103
		bodyModel[38] = new ModelRendererTurbo(this, 28, 115, textureX, textureY); // Box 273
		bodyModel[39] = new ModelRendererTurbo(this, 23, 115, textureX, textureY); // Box 274
		bodyModel[40] = new ModelRendererTurbo(this, 38, 109, textureX, textureY); // Box 276
		bodyModel[41] = new ModelRendererTurbo(this, 48, 112, textureX, textureY); // Box 103
		bodyModel[42] = new ModelRendererTurbo(this, 48, 115, textureX, textureY); // Box 103
		bodyModel[43] = new ModelRendererTurbo(this, 33, 112, textureX, textureY); // Box 300
		bodyModel[44] = new ModelRendererTurbo(this, 33, 115, textureX, textureY); // Box 301
		bodyModel[45] = new ModelRendererTurbo(this, 28, 109, textureX, textureY); // Box 303
		bodyModel[46] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 315
		bodyModel[47] = new ModelRendererTurbo(this, 55, 79, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 51, 70, textureX, textureY); // Box 121
		bodyModel[49] = new ModelRendererTurbo(this, 18, 79, textureX, textureY); // Box 334
		bodyModel[50] = new ModelRendererTurbo(this, 51, 73, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 16, 70, textureX, textureY); // Box 306
		bodyModel[52] = new ModelRendererTurbo(this, 9, 77, textureX, textureY); // Box 308
		bodyModel[53] = new ModelRendererTurbo(this, 63, 106, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 77, 102, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[55] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 1
		bodyModel[56] = new ModelRendererTurbo(this, 35, 128, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 65, 118, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 10, 106, textureX, textureY); // Box 324
		bodyModel[59] = new ModelRendererTurbo(this, 2, 97, textureX, textureY, "cull"); // Box 325 cull
		bodyModel[60] = new ModelRendererTurbo(this, 12, 118, textureX, textureY); // Box 327
		bodyModel[61] = new ModelRendererTurbo(this, 119, 8, textureX, textureY); // Box 335
		bodyModel[62] = new ModelRendererTurbo(this, 104, 6, textureX, textureY); // Box 337
		bodyModel[63] = new ModelRendererTurbo(this, 15, 33, textureX, textureY); // Box 338
		bodyModel[64] = new ModelRendererTurbo(this, 47, 33, textureX, textureY); // Box 339
		bodyModel[65] = new ModelRendererTurbo(this, 75, 22, textureX, textureY); // Box 343
		bodyModel[66] = new ModelRendererTurbo(this, 75, 2, textureX, textureY); // Box 344
		bodyModel[67] = new ModelRendererTurbo(this, 108, 18, textureX, textureY); // Box 346
		bodyModel[68] = new ModelRendererTurbo(this, 108, 14, textureX, textureY); // Box 347
		bodyModel[69] = new ModelRendererTurbo(this, 88, 4, textureX, textureY); // Box 342
		bodyModel[70] = new ModelRendererTurbo(this, 124, 4, textureX, textureY); // Box 344
		bodyModel[71] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 345
		bodyModel[72] = new ModelRendererTurbo(this, 108, 22, textureX, textureY); // Box 346
		bodyModel[73] = new ModelRendererTurbo(this, 103, 26, textureX, textureY); // Box 347
		bodyModel[74] = new ModelRendererTurbo(this, 88, 24, textureX, textureY); // Box 348
		bodyModel[75] = new ModelRendererTurbo(this, 119, 22, textureX, textureY); // Box 349
		bodyModel[76] = new ModelRendererTurbo(this, 124, 30, textureX, textureY); // Box 350
		bodyModel[77] = new ModelRendererTurbo(this, 97, 34, textureX, textureY); // Box 351
		bodyModel[78] = new ModelRendererTurbo(this, 43, 60, textureX, textureY); // Box 354
		bodyModel[79] = new ModelRendererTurbo(this, 47, 50, textureX, textureY); // Box 355
		bodyModel[80] = new ModelRendererTurbo(this, 68, 77, textureX, textureY); // Box 360
		bodyModel[81] = new ModelRendererTurbo(this, 44, 86, textureX, textureY); // Box 361
		bodyModel[82] = new ModelRendererTurbo(this, 75, 58, textureX, textureY); // Box 363
		bodyModel[83] = new ModelRendererTurbo(this, 15, 50, textureX, textureY); // Box 364
		bodyModel[84] = new ModelRendererTurbo(this, 11, 60, textureX, textureY); // Box 370
		bodyModel[85] = new ModelRendererTurbo(this, 111, 131, textureX, textureY); // Box 121
		bodyModel[86] = new ModelRendererTurbo(this, 80, 53, textureX, textureY); // Box 131
		bodyModel[87] = new ModelRendererTurbo(this, 125, 1, textureX, textureY); // Box 404
		bodyModel[88] = new ModelRendererTurbo(this, 88, 1, textureX, textureY); // Box 405
		bodyModel[89] = new ModelRendererTurbo(this, 439, 131, textureX, textureY); // Box 406
		bodyModel[90] = new ModelRendererTurbo(this, 0, 53, textureX, textureY); // Box 410
		bodyModel[91] = new ModelRendererTurbo(this, 68, 59, textureX, textureY); // Box 363
		bodyModel[92] = new ModelRendererTurbo(this, 8, 59, textureX, textureY); // Box 392
		bodyModel[93] = new ModelRendererTurbo(this, 16, 73, textureX, textureY); // Box 393
		bodyModel[94] = new ModelRendererTurbo(this, 62, 48, textureX, textureY); // Box 398
		bodyModel[95] = new ModelRendererTurbo(this, 4, 48, textureX, textureY); // Box 403
		bodyModel[96] = new ModelRendererTurbo(this, 3, 69, textureX, textureY); // Box 471
		bodyModel[97] = new ModelRendererTurbo(this, 66, 60, textureX, textureY, "lamp"); // Numberboard L type 2
		bodyModel[98] = new ModelRendererTurbo(this, 78, 71, textureX, textureY, "lamp"); // Markerlight L type 2
		bodyModel[99] = new ModelRendererTurbo(this, 3, 71, textureX, textureY, "lamp"); // Markerlight R type 2
		bodyModel[100] = new ModelRendererTurbo(this, 91, 13, textureX, textureY); // Box 343
		bodyModel[101] = new ModelRendererTurbo(this, 91, 5, textureX, textureY); // Box 626
		bodyModel[102] = new ModelRendererTurbo(this, 425, 127, textureX, textureY); // Right side door
		bodyModel[103] = new ModelRendererTurbo(this, 127, 127, textureX, textureY); // Left side door
		bodyModel[104] = new ModelRendererTurbo(this, 103, 125, textureX, textureY); // Box 123
		bodyModel[105] = new ModelRendererTurbo(this, 80, 47, textureX, textureY); // Box 131
		bodyModel[106] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 409
		bodyModel[107] = new ModelRendererTurbo(this, 28, 91, textureX, textureY); // Box 279
		bodyModel[108] = new ModelRendererTurbo(this, 53, 103, textureX, textureY); // Box 103
		bodyModel[109] = new ModelRendererTurbo(this, 53, 105, textureX, textureY); // Box 103
		bodyModel[110] = new ModelRendererTurbo(this, 53, 101, textureX, textureY); // Box 103
		bodyModel[111] = new ModelRendererTurbo(this, 53, 99, textureX, textureY); // Box 103
		bodyModel[112] = new ModelRendererTurbo(this, 30, 103, textureX, textureY); // Box 729
		bodyModel[113] = new ModelRendererTurbo(this, 30, 101, textureX, textureY); // Box 731
		bodyModel[114] = new ModelRendererTurbo(this, 30, 99, textureX, textureY); // Box 732
		bodyModel[115] = new ModelRendererTurbo(this, 48, 99, textureX, textureY); // Box 103
		bodyModel[116] = new ModelRendererTurbo(this, 33, 99, textureX, textureY); // Box 268
		bodyModel[117] = new ModelRendererTurbo(this, 48, 103, textureX, textureY); // Box 103
		bodyModel[118] = new ModelRendererTurbo(this, 33, 103, textureX, textureY); // Box 272
		bodyModel[119] = new ModelRendererTurbo(this, 108, 122, textureX, textureY); // Box 122
		bodyModel[120] = new ModelRendererTurbo(this, 453, 125, textureX, textureY); // Box 322
		bodyModel[121] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Box 408
		bodyModel[122] = new ModelRendererTurbo(this, 43, 96, textureX, textureY); // Box 103
		bodyModel[123] = new ModelRendererTurbo(this, 48, 106, textureX, textureY); // Box 103
		bodyModel[124] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 273
		bodyModel[125] = new ModelRendererTurbo(this, 38, 96, textureX, textureY); // Box 276
		bodyModel[126] = new ModelRendererTurbo(this, 33, 109, textureX, textureY); // Box 270
		bodyModel[127] = new ModelRendererTurbo(this, 35, 78, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 3, 58, textureX, textureY); // Box 391
		bodyModel[129] = new ModelRendererTurbo(this, 50, 118, textureX, textureY); // Box 247
		bodyModel[130] = new ModelRendererTurbo(this, 53, 91, textureX, textureY); // Box 103
		bodyModel[131] = new ModelRendererTurbo(this, 53, 105, textureX, textureY); // Box 103
		bodyModel[132] = new ModelRendererTurbo(this, 30, 105, textureX, textureY); // Box 730
		bodyModel[133] = new ModelRendererTurbo(this, 63, 82, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 70, 69, textureX, textureY); // Box 228
		bodyModel[135] = new ModelRendererTurbo(this, 8, 60, textureX, textureY, "lamp"); // Numberboard R type 2
		bodyModel[136] = new ModelRendererTurbo(this, 47, 76, textureX, textureY); // Box 0
		bodyModel[137] = new ModelRendererTurbo(this, 26, 76, textureX, textureY); // Box 336
		bodyModel[138] = new ModelRendererTurbo(this, 121, 16, textureX, textureY); // Box 0
		bodyModel[139] = new ModelRendererTurbo(this, 53, 109, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 339, 53, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 389, 128, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 141, 128, textureX, textureY); // Box 6
		bodyModel[143] = new ModelRendererTurbo(this, 260, 109, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 487, 121, textureX, textureY); // Box 128
		bodyModel[145] = new ModelRendererTurbo(this, 487, 153, textureX, textureY); // Box 128
		bodyModel[146] = new ModelRendererTurbo(this, 490, 144, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 498, 144, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 503, 143, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 485, 163, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 485, 131, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 142, 16, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 140, 8, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 144, 4, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 140, 22, textureX, textureY); // Box 32
		bodyModel[156] = new ModelRendererTurbo(this, 144, 30, textureX, textureY); // Box 33
		bodyModel[157] = new ModelRendererTurbo(this, 145, 34, textureX, textureY); // Box 34
		bodyModel[158] = new ModelRendererTurbo(this, 276, 85, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 264, 91, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 283, 99, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 292, 101, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 265, 99, textureX, textureY); // Box 32
		bodyModel[163] = new ModelRendererTurbo(this, 264, 101, textureX, textureY); // Box 33
		bodyModel[164] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 2
		bodyModel[165] = new ModelRendererTurbo(this, 491, 63, textureX, textureY); // Box 2
		bodyModel[166] = new ModelRendererTurbo(this, 124, 128, textureX, textureY); // Box 80
		bodyModel[167] = new ModelRendererTurbo(this, 375, 146, textureX, textureY); // Box 0
		bodyModel[168] = new ModelRendererTurbo(this, 177, 146, textureX, textureY); // Box 120
		bodyModel[169] = new ModelRendererTurbo(this, 375, 131, textureX, textureY); // Right side door
		bodyModel[170] = new ModelRendererTurbo(this, 177, 131, textureX, textureY); // Left side door
		bodyModel[171] = new ModelRendererTurbo(this, 303, 128, textureX, textureY); // Box 0
		bodyModel[172] = new ModelRendererTurbo(this, 191, 128, textureX, textureY); // Box 6
		bodyModel[173] = new ModelRendererTurbo(this, 375, 128, textureX, textureY); // Box 193
		bodyModel[174] = new ModelRendererTurbo(this, 177, 128, textureX, textureY); // Box 122
		bodyModel[175] = new ModelRendererTurbo(this, 80, 44, textureX, textureY); // Box 198
		bodyModel[176] = new ModelRendererTurbo(this, 372, 128, textureX, textureY); // Box 0
		bodyModel[177] = new ModelRendererTurbo(this, 386, 128, textureX, textureY); // Box 0
		bodyModel[178] = new ModelRendererTurbo(this, 188, 128, textureX, textureY); // Box 79
		bodyModel[179] = new ModelRendererTurbo(this, 174, 128, textureX, textureY); // Box 80
		bodyModel[180] = new ModelRendererTurbo(this, 340, 78, textureX, textureY); // Box 0
		bodyModel[181] = new ModelRendererTurbo(this, 388, 35, textureX, textureY); // Box 2
		bodyModel[182] = new ModelRendererTurbo(this, 444, 33, textureX, textureY); // Box 2
		bodyModel[183] = new ModelRendererTurbo(this, 361, 29, textureX, textureY); // Box 0
		bodyModel[184] = new ModelRendererTurbo(this, 441, 28, textureX, textureY); // Box 0
		bodyModel[185] = new ModelRendererTurbo(this, 444, 41, textureX, textureY); // Box 0
		bodyModel[186] = new ModelRendererTurbo(this, 468, 41, textureX, textureY); // Box 0
		bodyModel[187] = new ModelRendererTurbo(this, 364, 42, textureX, textureY); // Box 0
		bodyModel[188] = new ModelRendererTurbo(this, 388, 42, textureX, textureY); // Box 0
		bodyModel[189] = new ModelRendererTurbo(this, 8, 215, textureX, textureY); // Box 0
		bodyModel[190] = new ModelRendererTurbo(this, 43, 211, textureX, textureY); // Box 0
		bodyModel[191] = new ModelRendererTurbo(this, 31, 217, textureX, textureY); // Box 0
		bodyModel[192] = new ModelRendererTurbo(this, 32, 225, textureX, textureY); // Box 0
		bodyModel[193] = new ModelRendererTurbo(this, 31, 227, textureX, textureY); // Box 0
		bodyModel[194] = new ModelRendererTurbo(this, 50, 225, textureX, textureY); // Box 32
		bodyModel[195] = new ModelRendererTurbo(this, 59, 227, textureX, textureY); // Box 33
		bodyModel[196] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 406
		bodyModel[197] = new ModelRendererTurbo(this, 6, 33, textureX, textureY); // Box 401
		bodyModel[198] = new ModelRendererTurbo(this, 5, 52, textureX, textureY); // Box 402
		bodyModel[199] = new ModelRendererTurbo(this, 59, 167, textureX, textureY); // Box 402
		bodyModel[200] = new ModelRendererTurbo(this, 49, 155, textureX, textureY); // Box 401
		bodyModel[201] = new ModelRendererTurbo(this, 59, 164, textureX, textureY); // Box 402
		bodyModel[202] = new ModelRendererTurbo(this, 49, 164, textureX, textureY); // Box 401
		bodyModel[203] = new ModelRendererTurbo(this, 60, 33, textureX, textureY); // Box 663
		bodyModel[204] = new ModelRendererTurbo(this, 29, 167, textureX, textureY); // Box 664
		bodyModel[205] = new ModelRendererTurbo(this, 27, 155, textureX, textureY); // Box 665
		bodyModel[206] = new ModelRendererTurbo(this, 31, 164, textureX, textureY); // Box 666
		bodyModel[207] = new ModelRendererTurbo(this, 29, 164, textureX, textureY); // Box 667
		bodyModel[208] = new ModelRendererTurbo(this, 73, 52, textureX, textureY); // Box 668
		bodyModel[209] = new ModelRendererTurbo(this, 59, 182, textureX, textureY); // Box 197
		bodyModel[210] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 678
		bodyModel[211] = new ModelRendererTurbo(this, 56, 225, textureX, textureY); // Box 0
		bodyModel[212] = new ModelRendererTurbo(this, 16, 182, textureX, textureY); // Box 120
		bodyModel[213] = new ModelRendererTurbo(this, 26, 155, textureX, textureY); // Box 120
		bodyModel[214] = new ModelRendererTurbo(this, 59, 191, textureX, textureY); // Box 197
		bodyModel[215] = new ModelRendererTurbo(this, 11, 193, textureX, textureY); // Box 674
		bodyModel[216] = new ModelRendererTurbo(this, 260, 145, textureX, textureY); // Box 54
		bodyModel[217] = new ModelRendererTurbo(this, 260, 150, textureX, textureY); // Box 54
		bodyModel[218] = new ModelRendererTurbo(this, 263, 150, textureX, textureY); // Box 54
		bodyModel[219] = new ModelRendererTurbo(this, 298, 145, textureX, textureY); // Box 150
		bodyModel[220] = new ModelRendererTurbo(this, 300, 150, textureX, textureY); // Box 151
		bodyModel[221] = new ModelRendererTurbo(this, 297, 150, textureX, textureY); // Box 152
		bodyModel[222] = new ModelRendererTurbo(this, 360, 7, textureX, textureY); // Box 0
		bodyModel[223] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0
		bodyModel[224] = new ModelRendererTurbo(this, 369, 13, textureX, textureY); // Box 0
		bodyModel[225] = new ModelRendererTurbo(this, 352, 1, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 386, 1, textureX, textureY); // Box 0
		bodyModel[227] = new ModelRendererTurbo(this, 352, 13, textureX, textureY); // Box 102
		bodyModel[228] = new ModelRendererTurbo(this, 386, 13, textureX, textureY); // Box 103
		bodyModel[229] = new ModelRendererTurbo(this, 340, 19, textureX, textureY); // Box 0
		bodyModel[230] = new ModelRendererTurbo(this, 267, 4, textureX, textureY); // Box 0 Dynamics
		bodyModel[231] = new ModelRendererTurbo(this, 280, 2, textureX, textureY); // Box 0 Dynamics
		bodyModel[232] = new ModelRendererTurbo(this, 293, 4, textureX, textureY); // Box 0 Dynamics
		bodyModel[233] = new ModelRendererTurbo(this, 253, 1, textureX, textureY); // Box 0 Dynamics
		bodyModel[234] = new ModelRendererTurbo(this, 189, 148, textureX, textureY); // Box 0
		bodyModel[235] = new ModelRendererTurbo(this, 342, 178, textureX, textureY); // Box 0 FA-2 & after
		bodyModel[236] = new ModelRendererTurbo(this, 282, 178, textureX, textureY); // Box 0 FA-2 & after
		bodyModel[237] = new ModelRendererTurbo(this, 295, 165, textureX, textureY); // Box 0 FA-2 & after
		bodyModel[238] = new ModelRendererTurbo(this, 299, 169, textureX, textureY); // Box 0 FA-2 & after
		bodyModel[239] = new ModelRendererTurbo(this, 286, 222, textureX, textureY); // Box 0 FA-2 & after
		bodyModel[240] = new ModelRendererTurbo(this, 472, 127, textureX, textureY, "lamp"); // Markerlight R type 1
		bodyModel[241] = new ModelRendererTurbo(this, 462, 130, textureX, textureY); // Box 216
		bodyModel[242] = new ModelRendererTurbo(this, 86, 130, textureX, textureY); // Box 228
		bodyModel[243] = new ModelRendererTurbo(this, 86, 127, textureX, textureY, "lamp"); // Markerlight L type 1
		bodyModel[244] = new ModelRendererTurbo(this, 92, 126, textureX, textureY, "lamp"); // Numberboard L type 1
		bodyModel[245] = new ModelRendererTurbo(this, 465, 126, textureX, textureY, "lamp"); // Numberboard R type 1
		bodyModel[246] = new ModelRendererTurbo(this, 142, 48, textureX, textureY); // Box 301
		bodyModel[247] = new ModelRendererTurbo(this, 142, 51, textureX, textureY); // Box 644
		bodyModel[248] = new ModelRendererTurbo(this, 153, 48, textureX, textureY); // Box 302
		bodyModel[249] = new ModelRendererTurbo(this, 153, 51, textureX, textureY); // Box 643
		bodyModel[250] = new ModelRendererTurbo(this, 134, 46, textureX, textureY); // Box 114
		bodyModel[251] = new ModelRendererTurbo(this, 134, 43, textureX, textureY); // Box 74
		bodyModel[252] = new ModelRendererTurbo(this, 134, 49, textureX, textureY); // Box 78
		bodyModel[253] = new ModelRendererTurbo(this, 139, 47, textureX, textureY); // Box 470
		bodyModel[254] = new ModelRendererTurbo(this, 131, 48, textureX, textureY); // Box 471
		bodyModel[255] = new ModelRendererTurbo(this, 133, 40, textureX, textureY); // Box 472
		bodyModel[256] = new ModelRendererTurbo(this, 137, 103, textureX, textureY, "cull"); // Box 6 Front Vent Cull
		bodyModel[257] = new ModelRendererTurbo(this, 137, 93, textureX, textureY); // Box 6 FA-2 and after
		bodyModel[258] = new ModelRendererTurbo(this, 184, 93, textureX, textureY); // Box 6 FA2 and after
		bodyModel[259] = new ModelRendererTurbo(this, 135, 55, textureX, textureY); // Box 644
		bodyModel[260] = new ModelRendererTurbo(this, 132, 54, textureX, textureY); // Box 644
		bodyModel[261] = new ModelRendererTurbo(this, 308, 26, textureX, textureY, "cull"); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[262] = new ModelRendererTurbo(this, 310, 16, textureX, textureY, "cull"); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[263] = new ModelRendererTurbo(this, 297, 19, textureX, textureY, "cull"); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[264] = new ModelRendererTurbo(this, 329, 19, textureX, textureY, "cull"); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[265] = new ModelRendererTurbo(this, 128, 150, textureX, textureY); // Box 120
		bodyModel[266] = new ModelRendererTurbo(this, 178, 151, textureX, textureY); // Box 120
		bodyModel[267] = new ModelRendererTurbo(this, 128, 152, textureX, textureY); // Box 120
		bodyModel[268] = new ModelRendererTurbo(this, 128, 147, textureX, textureY); // Box 120
		bodyModel[269] = new ModelRendererTurbo(this, 251, 147, textureX, textureY); // Box 120
		bodyModel[270] = new ModelRendererTurbo(this, 251, 152, textureX, textureY); // Box 120
		bodyModel[271] = new ModelRendererTurbo(this, 251, 150, textureX, textureY); // Box 120
		bodyModel[272] = new ModelRendererTurbo(this, 426, 150, textureX, textureY); // Box 120
		bodyModel[273] = new ModelRendererTurbo(this, 376, 151, textureX, textureY); // Box 120
		bodyModel[274] = new ModelRendererTurbo(this, 426, 152, textureX, textureY); // Box 120
		bodyModel[275] = new ModelRendererTurbo(this, 426, 147, textureX, textureY); // Box 120
		bodyModel[276] = new ModelRendererTurbo(this, 303, 147, textureX, textureY); // Box 120
		bodyModel[277] = new ModelRendererTurbo(this, 303, 152, textureX, textureY); // Box 120
		bodyModel[278] = new ModelRendererTurbo(this, 303, 150, textureX, textureY); // Box 120
		bodyModel[279] = new ModelRendererTurbo(this, 483, 143, textureX, textureY); // Box 128
		bodyModel[280] = new ModelRendererTurbo(this, 485, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[281] = new ModelRendererTurbo(this, 490, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[282] = new ModelRendererTurbo(this, 503, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[283] = new ModelRendererTurbo(this, 498, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[284] = new ModelRendererTurbo(this, 290, 123, textureX, textureY, "lamp"); // backing light type 1
		bodyModel[285] = new ModelRendererTurbo(this, 283, 123, textureX, textureY); // backing light type 1 socket
		bodyModel[286] = new ModelRendererTurbo(this, 28, 118, textureX, textureY, "lamp"); // Headlight BR
		bodyModel[287] = new ModelRendererTurbo(this, 28, 118, textureX, textureY, "lamp"); // Headlight BL
		bodyModel[288] = new ModelRendererTurbo(this, 144, 38, textureX, textureY); // Box 296
		bodyModel[289] = new ModelRendererTurbo(this, 142, 41, textureX, textureY); // Box 295
		bodyModel[290] = new ModelRendererTurbo(this, 144, 44, textureX, textureY); // Box 294
		bodyModel[291] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 293
		bodyModel[292] = new ModelRendererTurbo(this, 194, 53, textureX, textureY); // Box 364 prime base
		bodyModel[293] = new ModelRendererTurbo(this, 203, 53, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[294] = new ModelRendererTurbo(this, 203, 53, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[295] = new ModelRendererTurbo(this, 203, 53, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[296] = new ModelRendererTurbo(this, 203, 53, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[297] = new ModelRendererTurbo(this, 185, 53, textureX, textureY, "cull"); // Box 495 c ull
		bodyModel[298] = new ModelRendererTurbo(this, 142, 61, textureX, textureY); // Box 327
		bodyModel[299] = new ModelRendererTurbo(this, 144, 55, textureX, textureY); // Box 328
		bodyModel[300] = new ModelRendererTurbo(this, 144, 67, textureX, textureY); // Box 329
		bodyModel[301] = new ModelRendererTurbo(this, 153, 61, textureX, textureY); // Box 330
		bodyModel[302] = new ModelRendererTurbo(this, 146, 58, textureX, textureY); // Box 331
		bodyModel[303] = new ModelRendererTurbo(this, 146, 64, textureX, textureY); // Box 332
		bodyModel[304] = new ModelRendererTurbo(this, 312, 146, textureX, textureY); // Box 0
		bodyModel[305] = new ModelRendererTurbo(this, 315, 146, textureX, textureY); // Box 0
		bodyModel[306] = new ModelRendererTurbo(this, 248, 146, textureX, textureY); // Box 79
		bodyModel[307] = new ModelRendererTurbo(this, 245, 146, textureX, textureY); // Box 80
		bodyModel[308] = new ModelRendererTurbo(this, 137, 103, textureX, textureY, "cull"); // Box 6 Front Vent Cull
		bodyModel[309] = new ModelRendererTurbo(this, 137, 93, textureX, textureY); // Box 6 FA-2 and after
		bodyModel[310] = new ModelRendererTurbo(this, 184, 93, textureX, textureY); // Box 6 FA2 and after
		bodyModel[311] = new ModelRendererTurbo(this, 214, 113, textureX, textureY); // Box 6 FA/FPA-2 and 4 vent
		bodyModel[312] = new ModelRendererTurbo(this, 214, 113, textureX, textureY); // Box 6 FA/FPA-2 and 4 vent
		bodyModel[313] = new ModelRendererTurbo(this, 29, 128, textureX, textureY, BoxName.ditch); // Box 445 ditchlight front b
		bodyModel[314] = new ModelRendererTurbo(this, 20, 128, textureX, textureY); // Ditchlight box
		bodyModel[315] = new ModelRendererTurbo(this, 29, 128, textureX, textureY, BoxName.ditch); // Box 445 ditchlight front b
		bodyModel[316] = new ModelRendererTurbo(this, 20, 128, textureX, textureY); // Ditchlight box
		bodyModel[317] = new ModelRendererTurbo(this, 27, 103, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[318] = new ModelRendererTurbo(this, 27, 103, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[319] = new ModelRendererTurbo(this, 5, 123, textureX, textureY, "lamp"); // Headlight TB
		bodyModel[320] = new ModelRendererTurbo(this, 5, 118, textureX, textureY, "lamp"); // Headlight TT
		bodyModel[321] = new ModelRendererTurbo(this, 13, 128, textureX, textureY, "lamp"); // Headlight BB
		bodyModel[322] = new ModelRendererTurbo(this, 13, 123, textureX, textureY, "lamp"); // Headlight BT
		bodyModel[323] = new ModelRendererTurbo(this, 86, 150, textureX, textureY); // Box 121
		bodyModel[324] = new ModelRendererTurbo(this, 468, 150, textureX, textureY); // Box 326
		bodyModel[325] = new ModelRendererTurbo(this, 463, 150, textureX, textureY); // Box 328
		bodyModel[326] = new ModelRendererTurbo(this, 95, 150, textureX, textureY); // Box 328
		bodyModel[327] = new ModelRendererTurbo(this, 158, 57, textureX, textureY); // Box 364 prime base
		bodyModel[328] = new ModelRendererTurbo(this, 167, 57, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[329] = new ModelRendererTurbo(this, 167, 57, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[330] = new ModelRendererTurbo(this, 167, 57, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[331] = new ModelRendererTurbo(this, 167, 57, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[332] = new ModelRendererTurbo(this, 274, 238, textureX, textureY); // Box 0
		bodyModel[333] = new ModelRendererTurbo(this, 286, 239, textureX, textureY); // Box 0
		bodyModel[334] = new ModelRendererTurbo(this, 65, 123, textureX, textureY); // Box 0
		bodyModel[335] = new ModelRendererTurbo(this, 23, 118, textureX, textureY); // Box 247
		bodyModel[336] = new ModelRendererTurbo(this, 70, 119, textureX, textureY); // Box 0
		bodyModel[337] = new ModelRendererTurbo(this, 70, 125, textureX, textureY); // Box 0
		bodyModel[338] = new ModelRendererTurbo(this, 55, 76, textureX, textureY); // Box 356
		bodyModel[339] = new ModelRendererTurbo(this, 71, 81, textureX, textureY); // Box 357
		bodyModel[340] = new ModelRendererTurbo(this, 45, 75, textureX, textureY); // Box 358
		bodyModel[341] = new ModelRendererTurbo(this, 16, 76, textureX, textureY); // Box 368
		bodyModel[342] = new ModelRendererTurbo(this, 34, 75, textureX, textureY); // Box 390
		bodyModel[343] = new ModelRendererTurbo(this, 10, 81, textureX, textureY); // Box 330
		bodyModel[344] = new ModelRendererTurbo(this, 100, 125, textureX, textureY); // Box 122
		bodyModel[345] = new ModelRendererTurbo(this, 460, 125, textureX, textureY); // Box 442
		bodyModel[346] = new ModelRendererTurbo(this, 100, 123, textureX, textureY); // Box 122
		bodyModel[347] = new ModelRendererTurbo(this, 454, 123, textureX, textureY); // Box 544
		bodyModel[348] = new ModelRendererTurbo(this, 326, 216, textureX, textureY); // Box 2
		bodyModel[349] = new ModelRendererTurbo(this, 320, 190, textureX, textureY); // Box 10
		bodyModel[350] = new ModelRendererTurbo(this, 339, 245, textureX, textureY); // Box 157
		bodyModel[351] = new ModelRendererTurbo(this, 339, 237, textureX, textureY); // Box 158
		bodyModel[352] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[353] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[354] = new ModelRendererTurbo(this, 178, 246, textureX, textureY); // Box 31
		bodyModel[355] = new ModelRendererTurbo(this, 174, 227, textureX, textureY); // Box 33
		bodyModel[356] = new ModelRendererTurbo(this, 179, 202, textureX, textureY); // Box 16
		bodyModel[357] = new ModelRendererTurbo(this, 179, 193, textureX, textureY); // Box 17
		bodyModel[358] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 18
		bodyModel[359] = new ModelRendererTurbo(this, 233, 186, textureX, textureY); // Box 19
		bodyModel[360] = new ModelRendererTurbo(this, 174, 211, textureX, textureY); // Box 20
		bodyModel[361] = new ModelRendererTurbo(this, 153, 214, textureX, textureY); // Box 46
		bodyModel[362] = new ModelRendererTurbo(this, 148, 226, textureX, textureY); // Box 47
		bodyModel[363] = new ModelRendererTurbo(this, 156, 201, textureX, textureY); // Box 51
		bodyModel[364] = new ModelRendererTurbo(this, 138, 216, textureX, textureY); // Box 56
		bodyModel[365] = new ModelRendererTurbo(this, 168, 203, textureX, textureY); // Box 66
		bodyModel[366] = new ModelRendererTurbo(this, 144, 203, textureX, textureY); // Box 67
		bodyModel[367] = new ModelRendererTurbo(this, 164, 190, textureX, textureY); // Box 69
		bodyModel[368] = new ModelRendererTurbo(this, 151, 191, textureX, textureY); // Box 75
		bodyModel[369] = new ModelRendererTurbo(this, 146, 190, textureX, textureY); // Box 34
		bodyModel[370] = new ModelRendererTurbo(this, 157, 184, textureX, textureY); // Box 71
		bodyModel[371] = new ModelRendererTurbo(this, 232, 239, textureX, textureY); // Box 36
		bodyModel[372] = new ModelRendererTurbo(this, 264, 239, textureX, textureY); // Box 37
		bodyModel[373] = new ModelRendererTurbo(this, 232, 224, textureX, textureY); // Box 38
		bodyModel[374] = new ModelRendererTurbo(this, 234, 233, textureX, textureY); // Box 39
		bodyModel[375] = new ModelRendererTurbo(this, 232, 218, textureX, textureY); // Box 40
		bodyModel[376] = new ModelRendererTurbo(this, 240, 223, textureX, textureY); // Box 41
		bodyModel[377] = new ModelRendererTurbo(this, 258, 218, textureX, textureY); // Box 42
		bodyModel[378] = new ModelRendererTurbo(this, 256, 234, textureX, textureY); // Box 43
		bodyModel[379] = new ModelRendererTurbo(this, 258, 224, textureX, textureY); // Box 44
		bodyModel[380] = new ModelRendererTurbo(this, 246, 239, textureX, textureY); // Box 45
		bodyModel[381] = new ModelRendererTurbo(this, 238, 241, textureX, textureY); // Box 46
		bodyModel[382] = new ModelRendererTurbo(this, 257, 242, textureX, textureY); // Box 47
		bodyModel[383] = new ModelRendererTurbo(this, 252, 249, textureX, textureY); // Box 48
		bodyModel[384] = new ModelRendererTurbo(this, 252, 244, textureX, textureY); // Box 49
		bodyModel[385] = new ModelRendererTurbo(this, 247, 249, textureX, textureY); // Box 50
		bodyModel[386] = new ModelRendererTurbo(this, 221, 229, textureX, textureY); // Box 51
		bodyModel[387] = new ModelRendererTurbo(this, 271, 229, textureX, textureY); // Box 79
		bodyModel[388] = new ModelRendererTurbo(this, 232, 181, textureX, textureY); // Box 80
		bodyModel[389] = new ModelRendererTurbo(this, 232, 196, textureX, textureY); // Box 81
		bodyModel[390] = new ModelRendererTurbo(this, 286, 233, textureX, textureY); // Box 84
		bodyModel[391] = new ModelRendererTurbo(this, 300, 233, textureX, textureY); // Box 86
		bodyModel[392] = new ModelRendererTurbo(this, 275, 203, textureX, textureY); // Box 101
		bodyModel[393] = new ModelRendererTurbo(this, 275, 203, textureX, textureY); // Box 102
		bodyModel[394] = new ModelRendererTurbo(this, 275, 203, textureX, textureY); // Box 103
		bodyModel[395] = new ModelRendererTurbo(this, 275, 203, textureX, textureY); // Box 104
		bodyModel[396] = new ModelRendererTurbo(this, 275, 203, textureX, textureY); // Box 105
		bodyModel[397] = new ModelRendererTurbo(this, 275, 203, textureX, textureY); // Box 106
		bodyModel[398] = new ModelRendererTurbo(this, 286, 246, textureX, textureY); // Box 109
		bodyModel[399] = new ModelRendererTurbo(this, 300, 246, textureX, textureY); // Box 110
		bodyModel[400] = new ModelRendererTurbo(this, 202, 180, textureX, textureY); // Box 2
		bodyModel[401] = new ModelRendererTurbo(this, 153, 207, textureX, textureY); // Box 73
		bodyModel[402] = new ModelRendererTurbo(this, 183, 185, textureX, textureY); // Box 21
		bodyModel[403] = new ModelRendererTurbo(this, 110, 200, textureX, textureY); // Box 413 cs
		bodyModel[404] = new ModelRendererTurbo(this, 106, 193, textureX, textureY); // Box 86 cs
		bodyModel[405] = new ModelRendererTurbo(this, 111, 208, textureX, textureY); // Box 531 cs
		bodyModel[406] = new ModelRendererTurbo(this, 76, 196, textureX, textureY); // Box 106 cab backbox
		bodyModel[407] = new ModelRendererTurbo(this, 260, 137, textureX, textureY); // Box 602

		bodyModel[0].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(-20.5F, -4F, 10F);

		bodyModel[1].addBox(0F, 0F, 0F, 8, 11, 1, 0F); // Box 0
		bodyModel[1].setRotationPoint(-28.5F, -10F, 10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 120
		bodyModel[2].setRotationPoint(-20.5F, -4F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 8, 11, 1, 0F); // Box 121
		bodyModel[3].setRotationPoint(-28.5F, -10F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[4].setRotationPoint(-20.5F, -17F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[5].setRotationPoint(-23.5F, -17F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 0
		bodyModel[6].setRotationPoint(-16F, -14F, 11F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 0
		bodyModel[7].setRotationPoint(-21F, -14F, 11F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 79
		bodyModel[8].setRotationPoint(-16F, -14F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[9].setRotationPoint(-21.5F, -15F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[10].setRotationPoint(-23.9F, -15F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[11].setRotationPoint(-23.5F, -16F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[12].setRotationPoint(-23.9F, -15F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[13].setRotationPoint(-21.5F, -15F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 8, 1, 20, 0F); // Box 0
		bodyModel[14].setRotationPoint(-33.5F, 1F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-33.5F, 1F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 214
		bodyModel[16].setRotationPoint(-33.5F, 1F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 121
		bodyModel[17].setRotationPoint(-33.5F, -10F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 216
		bodyModel[18].setRotationPoint(-33.5F, -10F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 0
		bodyModel[19].setRotationPoint(-35.5F, 1F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-35.5F, -10F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 219
		bodyModel[21].setRotationPoint(-35.5F, -10F, 8F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 7, 6, 0F); // Box 0
		bodyModel[22].setRotationPoint(-36.5F, 1F, -3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(-36.5F, 1F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 223
		bodyModel[24].setRotationPoint(-36.5F, 1F, 3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 224
		bodyModel[25].setRotationPoint(-36.5F, -10F, 3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[26].setRotationPoint(-36.5F, -8F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[27].setRotationPoint(-36.75F, -11F, -1.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[28].setRotationPoint(-36.75F, -9F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 270
		bodyModel[29].setRotationPoint(-36.75F, -11F, 0.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[30].setRotationPoint(-36.75F, -9F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 103
		bodyModel[31].setRotationPoint(-36.5F, -11.5F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[32].setRotationPoint(-36.5F, -11F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[33].setRotationPoint(-36.5F, -11F, 2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 103
		bodyModel[34].setRotationPoint(-36.5F, -7F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[35].setRotationPoint(-36.5F, -7F, -1.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[36].setRotationPoint(-36.5F, -5F, -1.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[37].setRotationPoint(-36.5F, -5F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[38].setRotationPoint(-36.5F, -5F, 0.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[39].setRotationPoint(-36.5F, -5F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 276
		bodyModel[40].setRotationPoint(-36.5F, -7F, 0F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 103
		bodyModel[41].setRotationPoint(-36.5F, -6.5F, -1.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[42].setRotationPoint(-36.5F, -5.5F, -1.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[43].setRotationPoint(-36.5F, -6.5F, 0.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[44].setRotationPoint(-36.5F, -5.5F, 0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[45].setRotationPoint(-36.5F, -7F, 1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.27F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 315
		bodyModel[46].setRotationPoint(-36.5F, -11.8F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-2F, -0.4F, 0F, 1F, -0.4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[47].setRotationPoint(-36.5F, -11.5F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 121
		bodyModel[48].setRotationPoint(-33.5F, -11F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 1F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 334
		bodyModel[49].setRotationPoint(-36.5F, -11.5F, 3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[50].setRotationPoint(-33.5F, -11F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 306
		bodyModel[51].setRotationPoint(-33.5F, -11F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0.1F, 0F, -1F, 0.1F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F); // Box 308
		bodyModel[52].setRotationPoint(-35.5F, -11F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[53].setRotationPoint(-36.5F, 2F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,-2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[54].setRotationPoint(-35.5F, 2F, -10F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 1
		bodyModel[55].setRotationPoint(-38.5F, 3F, -1.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[56].setRotationPoint(-37F, 2F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[57].setRotationPoint(-36.5F, 8F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 324
		bodyModel[58].setRotationPoint(-36.5F, 2F, 3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F); // Box 325 cull
		bodyModel[59].setRotationPoint(-35.5F, 2F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 327
		bodyModel[60].setRotationPoint(-36.5F, 8F, 3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1.5F, 0F); // Box 335
		bodyModel[61].setRotationPoint(-21.5F, -19F, 2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-0.4F, -1.2F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -5F, -1F, 0F, -0.4F, 0.7F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -5F, 1F, 0F); // Box 337
		bodyModel[62].setRotationPoint(-25.5F, -18.5F, 2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 1F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 338
		bodyModel[63].setRotationPoint(-26.5F, -16F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 2F, -2F, 0F); // Box 339
		bodyModel[64].setRotationPoint(-26.5F, -16F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2F, -2F, 0F, 2F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[65].setRotationPoint(-26.5F, -18F, -10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 2F, -1.5F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -2F, 1F, 0F); // Box 344
		bodyModel[66].setRotationPoint(-26.5F, -18F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1F); // Box 346
		bodyModel[67].setRotationPoint(-25.5F, -18.5F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.4F, 0.7F, 0F); // Box 347
		bodyModel[68].setRotationPoint(-25.5F, -18.5F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-0.4F, -1.2F, 0F, -3.6F, -1.2F, 0F, 1F, -1F, 0F, -2F, -2F, 2F, -0.4F, 0.7F, 0F, -3.6F, 0.7F, 0F, 1F, 1F, 0F, -2F, 1.5F, 2F); // Box 342
		bodyModel[69].setRotationPoint(-25.5F, -18.5F, 2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 344
		bodyModel[70].setRotationPoint(-20.5F, -18F, 8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -1F, 0F, 0.5F, 1F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[71].setRotationPoint(-23.5F, -17F, 9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, -0.4F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, 0F); // Box 346
		bodyModel[72].setRotationPoint(-25.5F, -18.5F, -2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-5F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.4F, 0.7F, 0F); // Box 347
		bodyModel[73].setRotationPoint(-25.5F, -18.5F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-2F, -2F, 2F, 1F, -1F, 0F, -3.6F, -1.2F, 0F, -0.4F, -1.2F, 0F, -2F, 1.5F, 2F, 1F, 1F, 0F, -3.6F, 0.7F, 0F, -0.4F, 0.7F, 0F); // Box 348
		bodyModel[74].setRotationPoint(-25.5F, -18.5F, -8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 349
		bodyModel[75].setRotationPoint(-21.5F, -19F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 350
		bodyModel[76].setRotationPoint(-20.5F, -18F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, -1F); // Box 351
		bodyModel[77].setRotationPoint(-23.5F, -17F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.9F, 0F, 0F, -0.6F, 0F, 0F, 0.3F, 0F, 0F, -0.2F, 0F, 0F, 0.9F, 0F, 0F, 0.6F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F); // Box 354
		bodyModel[78].setRotationPoint(-34.5F, -12F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 355
		bodyModel[79].setRotationPoint(-30.5F, -12F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-2F, 0F, -1F, 0F, 0F, -1F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[80].setRotationPoint(-35.5F, -11F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.3F, 0F, 0F, -0.27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 361
		bodyModel[81].setRotationPoint(-36.5F, -11.8F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[82].setRotationPoint(-28.5F, -11F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 364
		bodyModel[83].setRotationPoint(-30.5F, -12F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, -0.6F, 0F, 0F, -0.9F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, 0.6F, 0F, 0F, 0.9F, 0F); // Box 370
		bodyModel[84].setRotationPoint(-34.5F, -12F, 0F);

		bodyModel[85].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 121
		bodyModel[85].setRotationPoint(-25.5F, -11F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.225F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.625F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0.85F, 0F, 0F); // Box 131
		bodyModel[86].setRotationPoint(-26.05F, -11F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[87].setRotationPoint(-20.5F, -17F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[88].setRotationPoint(-23.5F, -17F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 406
		bodyModel[89].setRotationPoint(-25.5F, -11F, 10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0.225F, 0F, 0F, 0.85F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0.625F, 0F, 0F); // Box 410
		bodyModel[90].setRotationPoint(-26.05F, -11F, 10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 363
		bodyModel[91].setRotationPoint(-28.5F, -11F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[92].setRotationPoint(-28.5F, -11F, 8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 393
		bodyModel[93].setRotationPoint(-33.5F, -11F, 9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.6F, 0F, -0.3F, -0.6F, 0F, -1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.6F, 0F, -0.3F, 0.6F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 398
		bodyModel[94].setRotationPoint(-27.5F, -12F, -8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0.3F, 0F, -1F, 0.3F, 0F, -0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -0.3F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 403
		bodyModel[95].setRotationPoint(-27.5F, -12F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[96].setRotationPoint(-36.5F, -8F, 7.5F);
		bodyModel[96].rotateAngleY = -0.78539816F;

		bodyModel[97].addShapeBox(0F, 0F, -5F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Numberboard L type 2
		bodyModel[97].setRotationPoint(-36.51F, -8F, -7.5F);
		bodyModel[97].rotateAngleY = 0.78539816F;

		bodyModel[98].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight L type 2
		bodyModel[98].setRotationPoint(-34.45F, -8.75F, -8.95F);
		bodyModel[98].rotateAngleY = 0.78539816F;

		bodyModel[99].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markerlight R type 2
		bodyModel[99].setRotationPoint(-34.45F, -8.75F, 8.95F);
		bodyModel[99].rotateAngleY = -0.78539816F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 1, 9, 0F,-1.9F, -0.95F, 0F, 1.9F, -0.95F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.9F, 0.95F, 0F, 1.9F, 0.95F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 343
		bodyModel[100].setRotationPoint(-25.9F, -18.2F, -10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 1, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.9F, -0.95F, 0F, -1.9F, -0.95F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.9F, 0.95F, 0F, -1.9F, 0.95F, 0F); // Box 626
		bodyModel[101].setRotationPoint(-25.9F, -18.2F, 1F);

		bodyModel[102].addBox(-3F, 0F, 0F, 4, 11, 1, 0F); // Right side door
		bodyModel[102].setRotationPoint(-17.5F, -15F, 10F);

		bodyModel[103].addBox(-3F, 0F, -1F, 4, 11, 1, 0F); // Left side door
		bodyModel[103].setRotationPoint(-17.5F, -15F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 123
		bodyModel[104].setRotationPoint(-25.9F, -15F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.975F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.625F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0.85F, 0F, 0F); // Box 131
		bodyModel[105].setRotationPoint(-25.65F, -15F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.975F, 0F, 0F, 0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0.625F, 0F, 0F); // Box 409
		bodyModel[106].setRotationPoint(-25.65F, -15F, 10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, -4F, 0F); // Box 279
		bodyModel[107].setRotationPoint(-36.75F, -11F, 1.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.565F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, -0.9F, 0F, -0.565F, -0.9F, 0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.005F, -0.68F, 0F, -0.005F, -0.68F); // Box 103
		bodyModel[108].setRotationPoint(-36.76F, -9.85F, -1.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.575F, 0F, 0F, -0.575F, 0F, 0F, -0.575F, -0.36F, 0F, -0.575F, -0.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.495F, 0F, 0F, 0.495F); // Box 103
		bodyModel[109].setRotationPoint(-36.76F, -9F, -1.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.005F, -0.68F, 0F, -0.005F, -0.68F, 0F, -0.565F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, -0.9F, 0F, -0.565F, -0.9F); // Box 103
		bodyModel[110].setRotationPoint(-36.76F, -10.15F, -1.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.495F, 0F, 0F, 0.495F, 0F, -0.575F, 0F, 0F, -0.575F, 0F, 0F, -0.575F, -0.36F, 0F, -0.575F, -0.36F); // Box 103
		bodyModel[111].setRotationPoint(-36.76F, -11F, -1.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.565F, -0.9F, 0F, -0.565F, -0.9F, 0F, -0.565F, 0F, 0F, -0.565F, 0F, 0F, -0.005F, -0.68F, 0F, -0.005F, -0.68F, 0F, -0.005F, 0F, 0F, -0.005F, 0F); // Box 729
		bodyModel[112].setRotationPoint(-36.76F, -9.85F, 0.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.005F, -0.68F, 0F, -0.005F, -0.68F, 0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.565F, -0.9F, 0F, -0.565F, -0.9F, 0F, -0.565F, 0F, 0F, -0.565F, 0F); // Box 731
		bodyModel[113].setRotationPoint(-36.76F, -10.15F, 0.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0.495F, 0F, 0F, 0.495F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.575F, -0.36F, 0F, -0.575F, -0.36F, 0F, -0.575F, 0F, 0F, -0.575F, 0F); // Box 732
		bodyModel[114].setRotationPoint(-36.76F, -11F, 0.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F); // Box 103
		bodyModel[115].setRotationPoint(-36.75F, -10.5F, -1.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[116].setRotationPoint(-36.75F, -10.5F, 0.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[117].setRotationPoint(-36.75F, -9.5F, -1.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[118].setRotationPoint(-36.75F, -9.5F, 0.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[119].setRotationPoint(-23.5F, -16F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 322
		bodyModel[120].setRotationPoint(-25.9F, -15F, 10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.175F, 0F, 0F); // Box 408
		bodyModel[121].setRotationPoint(-24.5F, -16F, 10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F); // Box 103
		bodyModel[122].setRotationPoint(-36.75F, -11F, -1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[123].setRotationPoint(-36.75F, -9F, -1.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[124].setRotationPoint(-36.75F, -9F, 0.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 276
		bodyModel[125].setRotationPoint(-36.75F, -11F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 270
		bodyModel[126].setRotationPoint(-36.5F, -7F, 0.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[127].setRotationPoint(-35.5F, -11.5F, -3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[128].setRotationPoint(-28.5F, -11F, 10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[129].setRotationPoint(-35.5F, -11F, -3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, -4F, 0F); // Box 103
		bodyModel[130].setRotationPoint(-36.75F, -11F, -2.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.575F, 0F, 0F, -0.575F, 0F, 0F, -0.575F, -0.36F, 0F, -0.575F, -0.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.495F, 0F, 0F, 0.495F); // Box 103
		bodyModel[131].setRotationPoint(-36.76F, -9F, -1.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.575F, -0.36F, 0F, -0.575F, -0.36F, 0F, -0.575F, 0F, 0F, -0.575F, 0F, 0F, 0F, 0.495F, 0F, 0F, 0.495F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		bodyModel[132].setRotationPoint(-36.76F, -9F, 0.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[133].setRotationPoint(-36.5F, -10F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[134].setRotationPoint(-36.5F, -8F, -7.5F);
		bodyModel[134].rotateAngleY = 0.78539816F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Numberboard R type 2
		bodyModel[135].setRotationPoint(-36.51F, -8F, 7.5F);
		bodyModel[135].rotateAngleY = -0.78539816F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, -1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[136].setRotationPoint(-35.5F, -11.5F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0.03F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, -1F, -0.6F, 0F); // Box 336
		bodyModel[137].setRotationPoint(-35.5F, -11.5F, 3F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 0
		bodyModel[138].setRotationPoint(-21.5F, -19F, -2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[139].setRotationPoint(-36.5F, -7F, -2F);

		bodyModel[140].addBox(0F, 0F, 0F, 64, 1, 22, 0F); // Box 0
		bodyModel[140].setRotationPoint(-28.5F, 1F, -11F);

		bodyModel[141].addBox(0F, 0F, 0F, 15, 17, 1, 0F); // Box 0
		bodyModel[141].setRotationPoint(-16.5F, -16F, 10F);

		bodyModel[142].addBox(0F, 0F, 0F, 15, 17, 1, 0F); // Box 6
		bodyModel[142].setRotationPoint(-16.5F, -16F, -11F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 0
		bodyModel[143].setRotationPoint(34.5F, -16F, -10F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[144].setRotationPoint(35.5F, -15F, -4F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[145].setRotationPoint(35.5F, 1F, -4F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[146].setRotationPoint(35.5F, -14F, -4F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[147].setRotationPoint(35.5F, -14F, 3F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[148].setRotationPoint(36.5F, -14F, 3F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[149].setRotationPoint(36.5F, 1F, -5F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[150].setRotationPoint(36.5F, -15F, -5F);

		bodyModel[151].addBox(0F, 0F, 0F, 53, 1, 4, 0F); // Box 0
		bodyModel[151].setRotationPoint(-17.5F, -19F, -2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 53, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[152].setRotationPoint(-17.5F, -19F, 2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 53, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[153].setRotationPoint(-17.5F, -18F, 8F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[154].setRotationPoint(-17.5F, -17F, 10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 53, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[155].setRotationPoint(-17.5F, -19F, -8F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 53, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[156].setRotationPoint(-17.5F, -18F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[157].setRotationPoint(-17.5F, -17F, -11F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 0
		bodyModel[158].setRotationPoint(34.5F, -18F, -2F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 0
		bodyModel[159].setRotationPoint(34.5F, -17F, -8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[160].setRotationPoint(34.5F, -18F, 2F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[161].setRotationPoint(34.5F, -17F, 8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[162].setRotationPoint(34.5F, -18F, -8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[163].setRotationPoint(34.5F, -17F, -10F);

		bodyModel[164].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[164].setRotationPoint(35.5F, 3F, -1.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[165].setRotationPoint(32.5F, 2F, -3.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 80
		bodyModel[166].setRotationPoint(-21F, -14F, -12F);

		bodyModel[167].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 0
		bodyModel[167].setRotationPoint(-1.5F, -2F, 10F);

		bodyModel[168].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 120
		bodyModel[168].setRotationPoint(-1.5F, -2F, -11F);

		bodyModel[169].addBox(-3F, 0F, 0F, 4, 13, 1, 0F); // Right side door
		bodyModel[169].setRotationPoint(1.5F, -15F, 10F);

		bodyModel[170].addBox(-3F, 0F, -1F, 4, 13, 1, 0F); // Left side door
		bodyModel[170].setRotationPoint(1.5F, -15F, -10F);

		bodyModel[171].addBox(0F, 0F, 0F, 33, 17, 1, 0F); // Box 0
		bodyModel[171].setRotationPoint(2.5F, -16F, 10F);

		bodyModel[172].addBox(0F, 0F, 0F, 33, 17, 1, 0F); // Box 6
		bodyModel[172].setRotationPoint(2.5F, -16F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[173].setRotationPoint(-1.5F, -16F, 10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[174].setRotationPoint(-1.5F, -16F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.175F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 198
		bodyModel[175].setRotationPoint(-24.5F, -16F, -11F);

		bodyModel[176].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 0
		bodyModel[176].setRotationPoint(3F, -14F, 11F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 0
		bodyModel[177].setRotationPoint(-2F, -14F, 11F);

		bodyModel[178].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 79
		bodyModel[178].setRotationPoint(3F, -14F, -12F);

		bodyModel[179].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 80
		bodyModel[179].setRotationPoint(-2F, -14F, -12F);

		bodyModel[180].addBox(0F, 0F, 0F, 70, 1, 12, 0F); // Box 0
		bodyModel[180].setRotationPoint(-35.5F, 2F, -6F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[181].setRotationPoint(-21.5F, 2.5F, -2F);

		bodyModel[182].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[182].setRotationPoint(19F, 2.5F, -2F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 0
		bodyModel[183].setRotationPoint(-20.5F, 2F, -11F);

		bodyModel[184].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 0
		bodyModel[184].setRotationPoint(20F, 2F, -11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[185].setRotationPoint(20F, 3F, -9F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[186].setRotationPoint(20F, 3F, 2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[187].setRotationPoint(-20.5F, 3F, -9F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[188].setRotationPoint(-20.5F, 3F, 2F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 0
		bodyModel[189].setRotationPoint(-16.5F, -16F, -10F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 0
		bodyModel[190].setRotationPoint(-16.5F, -18F, -2F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 0
		bodyModel[191].setRotationPoint(-16.5F, -17F, -8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[192].setRotationPoint(-16.5F, -18F, 2F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[193].setRotationPoint(-16.5F, -17F, 8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[194].setRotationPoint(-16.5F, -18F, -8F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[195].setRotationPoint(-16.5F, -17F, -10F);

		bodyModel[196].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 406
		bodyModel[196].setRotationPoint(-27.5F, -11F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.6F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0.6F, 0F, -0.7F, 0.6F, 0F); // Box 401
		bodyModel[197].setRotationPoint(-27.5F, -12F, 0F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[198].setRotationPoint(-26.5F, -11F, 8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 402
		bodyModel[199].setRotationPoint(-26.5F, -11F, 8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.7F, 0F, -1.4F, -0.7F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.4F, 0F, 0F); // Box 401
		bodyModel[200].setRotationPoint(-27.5F, -12F, 0F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.2F, 0F, -0.4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.6F, -1F, 0F); // Box 402
		bodyModel[201].setRotationPoint(-26.5F, -11F, 7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[202].setRotationPoint(-26.1F, -12F, 0F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.7F, -0.8F, 0F, 0.6F, -0.8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0.6F, 0F, 0.6F, 0.6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 663
		bodyModel[203].setRotationPoint(-27.5F, -12F, -8F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.6F, -1F, 0F); // Box 664
		bodyModel[204].setRotationPoint(-26.5F, -11F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1.4F, -0.7F, 0F, -0.6F, -0.7F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 665
		bodyModel[205].setRotationPoint(-27.5F, -12F, -7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0.3F, 0F, -0.6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.4F, -1F, 0F); // Box 666
		bodyModel[206].setRotationPoint(-26.5F, -11F, -8F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.7F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[207].setRotationPoint(-26.1F, -12F, -7F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 668
		bodyModel[208].setRotationPoint(-26.5F, -11F, -10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 197
		bodyModel[209].setRotationPoint(-26.5F, -10F, 3.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		bodyModel[210].setRotationPoint(-26.5F, -10F, -10.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 2, 18, 10, 0F); // Box 0
		bodyModel[211].setRotationPoint(-15.5F, -17F, -5F);

		bodyModel[212].addBox(0F, 0F, 0F, 11, 5, 20, 0F); // Box 120
		bodyModel[212].setRotationPoint(-27.5F, -4F, -10F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 6, 20, 0F); // Box 120
		bodyModel[213].setRotationPoint(-27.5F, -10F, -10F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 197
		bodyModel[214].setRotationPoint(-26.5F, -5F, 1.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		bodyModel[215].setRotationPoint(-26.5F, -5F, -10.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 54
		bodyModel[216].setRotationPoint(35.5F, 2F, -11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 54
		bodyModel[217].setRotationPoint(35.5F, 4.5F, -11F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 54
		bodyModel[218].setRotationPoint(35.5F, 4.5F, -10F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 150
		bodyModel[219].setRotationPoint(35.5F, 2F, 9F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 151
		bodyModel[220].setRotationPoint(35.5F, 4.5F, 10F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[221].setRotationPoint(35.5F, 4.5F, 9F);

		bodyModel[222].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 0
		bodyModel[222].setRotationPoint(14F, -19.5F, -2F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 0
		bodyModel[223].setRotationPoint(18F, -19.5F, 2F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[224].setRotationPoint(18F, -19.5F, -6F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 0
		bodyModel[225].setRotationPoint(14F, -19.5F, 2F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 0
		bodyModel[226].setRotationPoint(22F, -19.5F, 2F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[227].setRotationPoint(14F, -19.5F, -6F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -4F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[228].setRotationPoint(22F, -19.5F, -6F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 12, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[229].setRotationPoint(14F, -19.51F, -6F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 Dynamics
		bodyModel[230].setRotationPoint(-10F, -19.5F, -2F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 Dynamics
		bodyModel[231].setRotationPoint(-5.5F, -19.5F, -2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 Dynamics
		bodyModel[232].setRotationPoint(-1F, -19.5F, -2F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F); // Box 0 Dynamics
		bodyModel[233].setRotationPoint(-12.5F, -19.5F, -2F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0
		bodyModel[234].setRotationPoint(-12.5F, -18F, -2F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 0 FA-2 & after
		bodyModel[235].setRotationPoint(13.5F, -14F, -10F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-2 & after
		bodyModel[236].setRotationPoint(13.5F, -14F, 7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 13, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-2 & after
		bodyModel[237].setRotationPoint(13.5F, -17F, -10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 13, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-2 & after
		bodyModel[238].setRotationPoint(13.5F, -18F, -8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 11, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-2 & after
		bodyModel[239].setRotationPoint(11F, -5F, 0.5F);

		bodyModel[240].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight R type 1
		bodyModel[240].setRotationPoint(-32.2F, -8F, 10.7F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 216
		bodyModel[241].setRotationPoint(-32.5F, -8.75F, 10F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.1F); // Box 228
		bodyModel[242].setRotationPoint(-32.5F, -8.75F, -11F);

		bodyModel[243].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight L type 1
		bodyModel[243].setRotationPoint(-32.2F, -8F, -10.7F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Numberboard L type 1
		bodyModel[244].setRotationPoint(-31.5F, -8.75F, -11.01F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Numberboard R type 1
		bodyModel[245].setRotationPoint(-31.5F, -8.75F, 11.01F);

		bodyModel[246].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 301
		bodyModel[246].setRotationPoint(-22F, -20F, 3.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 644
		bodyModel[247].setRotationPoint(-19F, -20F, -4.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[248].setRotationPoint(-19F, -19F, 3.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
		bodyModel[249].setRotationPoint(-19F, -19F, -4.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[250].setRotationPoint(-14.5F, -20.35F, -5.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[251].setRotationPoint(-14.5F, -21.35F, -5.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[252].setRotationPoint(-14.25F, -19.85F, -5.25F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 470
		bodyModel[253].setRotationPoint(-14.5F, -21.35F, -6F);
		bodyModel[253].rotateAngleX = -0.13089969F;

		bodyModel[254].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 471
		bodyModel[254].setRotationPoint(-14.5F, -21.35F, -4F);
		bodyModel[254].rotateAngleX = 0.13089969F;

		bodyModel[255].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 472
		bodyModel[255].setRotationPoint(-14.5F, -21.35F, -6F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 26, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 Front Vent Cull
		bodyModel[256].setRotationPoint(-15.5F, -15F, -11.02F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 22, 8, 1, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -11F, -4F, 0F, -11F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 FA-2 and after
		bodyModel[257].setRotationPoint(3.5F, -15F, -11.02F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 FA2 and after
		bodyModel[258].setRotationPoint(25.5F, -15F, -11.02F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[259].setRotationPoint(-17F, -20F, 1.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[260].setRotationPoint(-15.5F, -20.8F, 3F);

		bodyModel[261].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[261].setRotationPoint(10F, -19.65F, -4F);

		bodyModel[262].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[262].setRotationPoint(11F, -20.65F, -4F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[263].setRotationPoint(10F, -20.65F, -4F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 CP winterization hatch cull FA/FPA-2
		bodyModel[264].setRotationPoint(15F, -20.65F, -4F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 120
		bodyModel[265].setRotationPoint(-20.5F, 4F, -11.01F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[266].setRotationPoint(-1.5F, 2F, -11.01F);

		bodyModel[267].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[267].setRotationPoint(-20.5F, 5F, -10.76F);

		bodyModel[268].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[268].setRotationPoint(-20.5F, 2F, -11.01F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[269].setRotationPoint(31.5F, 2F, -11.01F);

		bodyModel[270].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[270].setRotationPoint(31.5F, 5F, -10.76F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 120
		bodyModel[271].setRotationPoint(31.5F, 4F, -11.01F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 120
		bodyModel[272].setRotationPoint(-20.5F, 4F, 11.01F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[273].setRotationPoint(-1.5F, 2F, 11.01F);

		bodyModel[274].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[274].setRotationPoint(-20.5F, 5F, 10.76F);

		bodyModel[275].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[275].setRotationPoint(-20.5F, 2F, 11.01F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[276].setRotationPoint(31.5F, 2F, 11.01F);

		bodyModel[277].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[277].setRotationPoint(31.5F, 5F, 10.76F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 120
		bodyModel[278].setRotationPoint(31.5F, 4F, 11.01F);

		bodyModel[279].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[279].setRotationPoint(36.5F, -14F, -5F);

		bodyModel[280].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[280].setRotationPoint(36.5F, -17F, -5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[281].setRotationPoint(36.5F, -17F, -4F);

		bodyModel[282].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[282].setRotationPoint(36.5F, -17F, 4F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[283].setRotationPoint(36.5F, -17F, 3F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[284].setRotationPoint(36F, -8F, 5.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // backing light type 1 socket
		bodyModel[285].setRotationPoint(35.25F, -8F, 5.5F);

		bodyModel[286].addShapeBox(0F, -0.6F, 0.1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.75F, -0.9F, 0F, -0.75F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight BR
		bodyModel[286].setRotationPoint(-36F, -5.5F, 0F);

		bodyModel[287].addShapeBox(0F, -0.6F, -1.2F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.75F, -0.9F, 0F, -0.75F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight BL
		bodyModel[287].setRotationPoint(-36F, -5.5F, 0F);

		bodyModel[288].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 296
		bodyModel[288].setRotationPoint(-18.25F, -19.25F, 8.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 295
		bodyModel[289].setRotationPoint(-17.25F, -19.5F, 7.5F);

		bodyModel[290].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 294
		bodyModel[290].setRotationPoint(-18.75F, -19.25F, 6.5F);

		bodyModel[291].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 293
		bodyModel[291].setRotationPoint(-16.75F, -18.5F, 7.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[292].setRotationPoint(-17F, -19.5F, 7F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[293].setRotationPoint(-17F, -20F, 7F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[294].setRotationPoint(-17F, -20F, 7F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[295].setRotationPoint(-17F, -20F, 7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[296].setRotationPoint(-17F, -20F, 7F);

		bodyModel[297].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 495 c ull
		bodyModel[297].setRotationPoint(-17F, -18.5F, 7F);

		bodyModel[298].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[298].setRotationPoint(-1.5F, -19.5F, -9F);

		bodyModel[299].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[299].setRotationPoint(-0.5F, -19.25F, -8F);

		bodyModel[300].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[300].setRotationPoint(-1F, -19.25F, -10F);

		bodyModel[301].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[301].setRotationPoint(1F, -18.5F, -9F);

		bodyModel[302].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[302].setRotationPoint(0F, -20.5F, -8.25F);

		bodyModel[303].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[303].setRotationPoint(0F, -20.5F, -9.5F);

		bodyModel[304].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[304].setRotationPoint(35F, -5F, 11F);

		bodyModel[305].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[305].setRotationPoint(32F, -5F, 11F);

		bodyModel[306].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 79
		bodyModel[306].setRotationPoint(35F, -5F, -12F);

		bodyModel[307].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 80
		bodyModel[307].setRotationPoint(32F, -5F, -12F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 26, 8, 1, 0F,0F, 0F, -0.75F, -13F, 0F, -0.75F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.75F, -13F, -4F, -0.75F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 6 Front Vent Cull
		bodyModel[308].setRotationPoint(-15.5F, -15F, 10.02F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 22, 8, 1, 0F,0F, 0F, -0.75F, -11F, 0F, -0.75F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.75F, -11F, -4F, -0.75F, -11F, -4F, 0F, 0F, -4F, 0F); // Box 6 FA-2 and after
		bodyModel[309].setRotationPoint(3.5F, -15F, 10.02F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, 0F, -0.75F, -9F, 0F, -0.75F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.75F, -9F, -4F, -0.75F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 6 FA2 and after
		bodyModel[310].setRotationPoint(25.5F, -15F, 10.02F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0F, 0F, -0.75F, -11F, 0F, -0.75F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -11F, 0F, -0.75F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 6 FA/FPA-2 and 4 vent
		bodyModel[311].setRotationPoint(14.5F, -15F, 10.02F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 6 FA/FPA-2 and 4 vent
		bodyModel[312].setRotationPoint(14.5F, -15F, -11.02F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 445 ditchlight front b
		bodyModel[313].setRotationPoint(-38.25F, -0.5F, -6.5F);

		bodyModel[314].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Ditchlight box
		bodyModel[314].setRotationPoint(-37.5F, -0.5F, -6.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 445 ditchlight front b
		bodyModel[315].setRotationPoint(-38.25F, -0.5F, 4.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Ditchlight box
		bodyModel[316].setRotationPoint(-37.5F, -0.5F, 4.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[317].setRotationPoint(-37.25F, -7F, -3.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[318].setRotationPoint(-37.25F, -7F, 3.5F);

		bodyModel[319].addShapeBox(0F, 0.1F, -0.6F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight TB
		bodyModel[319].setRotationPoint(-36F, -9.5F, 0F);

		bodyModel[320].addShapeBox(0F, -1.2F, -0.6F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight TT
		bodyModel[320].setRotationPoint(-36F, -9.5F, 0F);

		bodyModel[321].addShapeBox(0F, 0.1F, -0.6F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.75F, -0.9F, 0F, -0.75F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight BB
		bodyModel[321].setRotationPoint(-35.75F, -5.5F, 0F);

		bodyModel[322].addShapeBox(0F, -1.2F, -0.6F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.75F, -0.9F, 0F, -0.75F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight BT
		bodyModel[322].setRotationPoint(-35.75F, -5.5F, 0F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, -0.35F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.35F); // Box 121
		bodyModel[323].setRotationPoint(-33.5F, 2F, -10.35F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0.35F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.35F); // Box 326
		bodyModel[324].setRotationPoint(-33.5F, 2F, 9.35F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.17F, 0F, 0F, -0.03F, 0F, 0F, 0.03F, 0F, 0F, -0.17F, 0F, 0F, 0.17F, -1F, 0F, 0.17F, -1F, 0F, -0.17F, 0F, 0F, -0.17F); // Box 328
		bodyModel[325].setRotationPoint(-30.5F, 2F, 9.77F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.17F, 0F, 0F, 0.03F, 0F, 0F, -0.03F, 0F, 0F, 0.17F, 0F, 0F, -0.17F, -1F, 0F, -0.17F, -1F, 0F, 0.17F, 0F, 0F, 0.17F); // Box 328
		bodyModel[326].setRotationPoint(-30.5F, 2F, -10.77F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[327].setRotationPoint(-17F, -20F, -1F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[328].setRotationPoint(-17F, -20.5F, -1F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[329].setRotationPoint(-17F, -20.5F, -1F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[330].setRotationPoint(-17F, -20.5F, -1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[331].setRotationPoint(-17F, -20.5F, -1F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[332].setRotationPoint(19.3F, -14F, 0F);
		bodyModel[332].rotateAngleY = -0.76794487F;

		bodyModel[333].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[333].setRotationPoint(18F, -1F, -2F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[334].setRotationPoint(-36.5F, -8F, -3F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[335].setRotationPoint(-36.5F, -8F, 2F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[336].setRotationPoint(-36.5F, -8F, -2F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[337].setRotationPoint(-36.5F, -4F, -2F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0.12F, 0F, 0F, 0.4F, 0F, 0F, 0.175F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.4F, 0F, 0F, -0.15F, 0F); // Box 356
		bodyModel[338].setRotationPoint(-33.5F, -11F, -9F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.175F, 0F, 0F, 0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.155F, 0F, 0F, -0.1F, 0F); // Box 357
		bodyModel[339].setRotationPoint(-34.5F, -11F, -9F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.38F, 0F, 0F, -0.3F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.35F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 358
		bodyModel[340].setRotationPoint(-30.5F, -11.5F, -9F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.175F, 0F, 0F, 0.4F, 0F, 0F, 0.12F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.4F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[341].setRotationPoint(-33.5F, -11F, 8F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.38F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.35F, 0F); // Box 390
		bodyModel[342].setRotationPoint(-30.5F, -11.5F, 8F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.175F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.155F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 330
		bodyModel[343].setRotationPoint(-34.5F, -11F, 8F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[344].setRotationPoint(-23.9F, -15F, -12F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[345].setRotationPoint(-23.9F, -15F, 11F);

		bodyModel[346].addShapeBox(0F, 0F, -1F, 3, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[346].setRotationPoint(-23.9F, -14.99F, -11F);
		bodyModel[346].rotateAngleX = 0.52359878F;

		bodyModel[347].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[347].setRotationPoint(-23.9F, -14.99F, 11F);
		bodyModel[347].rotateAngleX = -0.52359878F;

		bodyModel[348].addBox(0F, 0F, 0F, 15, 4, 16, 0F); // Box 2
		bodyModel[348].setRotationPoint(-6.5F, 5F, -8F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 15, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[349].setRotationPoint(-6.5F, 2F, -11F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[350].setRotationPoint(-6.5F, 5F, -11F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[351].setRotationPoint(-6.5F, 5F, 8F);

		bodyModel[352].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[352].setRotationPoint(-3.5F, 1.5F, -11.25F);
		bodyModel[352].rotateAngleX = 1.57079633F;

		bodyModel[353].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[353].setRotationPoint(-3.5F, 1.5F, 11.25F);
		bodyModel[353].rotateAngleX = -1.57079633F;

		bodyModel[354].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[354].setRotationPoint(-6.5F, 0F, -3.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 15, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[355].setRotationPoint(-6.5F, -7F, -5.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[356].setRotationPoint(-6.5F, -13F, -6F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[357].setRotationPoint(-6.5F, -13F, 0F);

		bodyModel[358].addShapeBox(0F, 0F, -2F, 14, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[358].setRotationPoint(-6F, -15F, -4F);
		bodyModel[358].rotateAngleX = 0.27925268F;

		bodyModel[359].addShapeBox(0F, 0F, -2F, 14, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[359].setRotationPoint(-6F, -15F, 4F);
		bodyModel[359].rotateAngleX = -0.27925268F;

		bodyModel[360].addShapeBox(0F, 0F, 0F, 15, 4, 11, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[360].setRotationPoint(-6.5F, -11F, -5.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F); // Box 46
		bodyModel[361].setRotationPoint(-11.5F, -7F, -1.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[362].setRotationPoint(-11.5F, -4.5F, -4F);

		bodyModel[363].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 51
		bodyModel[363].setRotationPoint(-11.5F, -9F, -1.5F);

		bodyModel[364].addBox(0F, 0F, 0F, 1, 9, 6, 0F); // Box 56
		bodyModel[364].setRotationPoint(-7.5F, -11F, -3F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 66
		bodyModel[365].setRotationPoint(-11.5F, -11F, -3F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 67
		bodyModel[366].setRotationPoint(-11.5F, -11F, 2F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[367].setRotationPoint(-8.5F, -13F, -5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[368].setRotationPoint(-8.5F, -9F, -4F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[369].setRotationPoint(-8.5F, -13F, 1F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[370].setRotationPoint(-8.5F, -13F, -1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[371].setRotationPoint(8.5F, -11F, -5.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[372].setRotationPoint(8.5F, -11F, 4.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[373].setRotationPoint(8F, -16F, -1F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		bodyModel[374].setRotationPoint(8F, -16F, -3F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 40
		bodyModel[375].setRotationPoint(8F, -16F, 1F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[376].setRotationPoint(8F, -13.5F, -3.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 42
		bodyModel[377].setRotationPoint(8F, -12F, 1F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[378].setRotationPoint(8F, -12F, -3F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44
		bodyModel[379].setRotationPoint(8F, -11.5F, -1F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[380].setRotationPoint(8.5F, -9F, -1F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[381].setRotationPoint(8F, -4F, -1F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[382].setRotationPoint(9F, -11F, 1F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 48
		bodyModel[383].setRotationPoint(8.5F, -6F, -3F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[384].setRotationPoint(8.5F, -9F, -3F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[385].setRotationPoint(8.5F, -9F, -2F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[386].setRotationPoint(9.5F, -16F, -7F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[387].setRotationPoint(9.5F, -16F, 4F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 80
		bodyModel[388].setRotationPoint(-7.5F, -12.5F, -7F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 81
		bodyModel[389].setRotationPoint(-7.5F, -12.5F, 5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[390].setRotationPoint(-5.5F, -5.5F, -6.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[391].setRotationPoint(2.5F, -5.5F, -6.5F);

		bodyModel[392].addBox(0F, 0F, 0F, 0, 3, 13, 0F); // Box 101
		bodyModel[392].setRotationPoint(-5.25F, -14.25F, -6.5F);

		bodyModel[393].addBox(0F, 0F, 0F, 0, 3, 13, 0F); // Box 102
		bodyModel[393].setRotationPoint(-2.75F, -14.25F, -6.5F);

		bodyModel[394].addBox(0F, 0F, 0F, 0, 3, 13, 0F); // Box 103
		bodyModel[394].setRotationPoint(-0.25F, -14.25F, -6.5F);

		bodyModel[395].addBox(0F, 0F, 0F, 0, 3, 13, 0F); // Box 104
		bodyModel[395].setRotationPoint(2.25F, -14.25F, -6.5F);

		bodyModel[396].addBox(0F, 0F, 0F, 0, 3, 13, 0F); // Box 105
		bodyModel[396].setRotationPoint(4.75F, -14.25F, -6.5F);

		bodyModel[397].addBox(0F, 0F, 0F, 0, 3, 13, 0F); // Box 106
		bodyModel[397].setRotationPoint(7.25F, -14.25F, -6.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 109
		bodyModel[398].setRotationPoint(-5.5F, -5.5F, 5.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 110
		bodyModel[399].setRotationPoint(2.5F, -5.5F, 5.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[400].setRotationPoint(5.05F, -20.5F, -3F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[401].setRotationPoint(-11.5F, -2F, -1.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 21
		bodyModel[402].setRotationPoint(5F, -19.5F, -3F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[403].setRotationPoint(-26.5F, -12F, -5F);
		bodyModel[403].rotateAngleY = -0.45378561F;

		bodyModel[404].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[404].setRotationPoint(-26.5F, -14F, -5F);
		bodyModel[404].rotateAngleY = -0.45378561F;

		bodyModel[405].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[405].setRotationPoint(-26.5F, -8F, -5F);
		bodyModel[405].rotateAngleY = -0.45378561F;

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 12, 24, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -12F, -0.5F, -6F, -12F); // Box 106 cab backbox
		bodyModel[406].setRotationPoint(-17.25F, -18F, -6F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 0, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 602
		bodyModel[407].setRotationPoint(35.51F, 2F, -9F);
	}
	ModelTypeBnew theBetterTrucks = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderLocomotiveModel(bodyModel, entity, f5);

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 9||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.19, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.53, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.19, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.53, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}

	public float[] getTrans() {
		return new float[]{-1.4F, 0.125F, 0.00F};
	}

	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{1.0D, 1.19D, 0.0D});
			}
		};
	}
}