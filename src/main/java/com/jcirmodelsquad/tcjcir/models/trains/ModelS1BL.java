//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: S1BL
// Model Creator: Bida
// Created on: 15.07.2021 - 18:10:46
// Last changed on: 15.07.2021 - 18:10:46

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB2_new;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelS1BL extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelS1BL() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[260];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 73, 8, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 31, 8, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 10, 6, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 52, 6, textureX, textureY); // Box 30
		bodyModel[12] = new ModelRendererTurbo(this, 114, 81, textureX, textureY); // Box 31
		bodyModel[13] = new ModelRendererTurbo(this, 125, 78, textureX, textureY); // Box 32
		bodyModel[14] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 33
		bodyModel[15] = new ModelRendererTurbo(this, 217, 102, textureX, textureY); // Box 35
		bodyModel[16] = new ModelRendererTurbo(this, 183, 102, textureX, textureY); // Box 36
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[18] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[19] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[20] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[21] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[22] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[23] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[24] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[25] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[26] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[27] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[28] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[29] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[30] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[31] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[32] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[33] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[34] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[35] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[36] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[37] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[39] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[40] = new ModelRendererTurbo(this, 82, 132, textureX, textureY); // Box 196
		bodyModel[41] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[42] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[43] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[44] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[45] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[46] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[47] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[48] = new ModelRendererTurbo(this, 101, 105, textureX, textureY); // box65
		bodyModel[49] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[50] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[51] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[52] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[53] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[54] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[55] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[56] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[57] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[58] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[59] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[60] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[61] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[62] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[63] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[64] = new ModelRendererTurbo(this, 149, 65, textureX, textureY); // Box 284
		bodyModel[65] = new ModelRendererTurbo(this, 156, 79, textureX, textureY); // Box 285
		bodyModel[66] = new ModelRendererTurbo(this, 179, 81, textureX, textureY); // Box 288
		bodyModel[67] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 300
		bodyModel[68] = new ModelRendererTurbo(this, 179, 90, textureX, textureY); // Box 303
		bodyModel[69] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[70] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[71] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[72] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[73] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[74] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[75] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[76] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[77] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[78] = new ModelRendererTurbo(this, 71, 133, textureX, textureY); // Box 2603
		bodyModel[79] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[80] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[81] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[82] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[83] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "lamp"); // Box 190 ditchlight f1
		bodyModel[84] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[85] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[86] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[87] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[88] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[89] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[90] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[91] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[92] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[93] = new ModelRendererTurbo(this, 156, 65, textureX, textureY); // Box 279
		bodyModel[94] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[95] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[96] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[97] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[98] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[99] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[100] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[101] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[102] = new ModelRendererTurbo(this, 83, 54, textureX, textureY); // Box 298
		bodyModel[103] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[104] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 300
		bodyModel[105] = new ModelRendererTurbo(this, 70, 59, textureX, textureY); // Box 301
		bodyModel[106] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[107] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[108] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[109] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[110] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[111] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[112] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[113] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[114] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 52 door swing right
		bodyModel[115] = new ModelRendererTurbo(this, 56, 5, textureX, textureY); // Box 314 door swing right
		bodyModel[116] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[117] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[118] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[119] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[120] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[121] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[122] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[123] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[124] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[125] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[126] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[127] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[128] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[129] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[130] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[131] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[132] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[133] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[134] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[135] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "lamp"); // Box 446 ditchlight f1
		bodyModel[136] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[137] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[138] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[139] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[140] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[141] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[142] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[143] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[144] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[145] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[146] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[147] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 6 PRIME3-1
		bodyModel[148] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 7 PRIME3-3
		bodyModel[149] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 8 PRIME3-2
		bodyModel[150] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 9 PRIME3-4
		bodyModel[151] = new ModelRendererTurbo(this, 161, 56, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[152] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428
		bodyModel[153] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 413
		bodyModel[154] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[155] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 369
		bodyModel[156] = new ModelRendererTurbo(this, 440, 44, textureX, textureY); // Box 370
		bodyModel[157] = new ModelRendererTurbo(this, 446, 53, textureX, textureY); // Box 371
		bodyModel[158] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[159] = new ModelRendererTurbo(this, 448, 98, textureX, textureY); // Box 278
		bodyModel[160] = new ModelRendererTurbo(this, 470, 98, textureX, textureY); // Box 279
		bodyModel[161] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[162] = new ModelRendererTurbo(this, 134, 78, textureX, textureY); // Box 688
		bodyModel[163] = new ModelRendererTurbo(this, 206, 99, textureX, textureY); // Box 37
		bodyModel[164] = new ModelRendererTurbo(this, 240, 99, textureX, textureY); // Box 38
		bodyModel[165] = new ModelRendererTurbo(this, 215, 99, textureX, textureY); // Box 557
		bodyModel[166] = new ModelRendererTurbo(this, 249, 99, textureX, textureY); // Box 558
		bodyModel[167] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[168] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[169] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[170] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[171] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[172] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[173] = new ModelRendererTurbo(this, 111, 99, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[174] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[175] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[176] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[177] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[178] = new ModelRendererTurbo(this, 28, 101, textureX, textureY); // Box 316
		bodyModel[179] = new ModelRendererTurbo(this, 40, 100, textureX, textureY); // Box 317
		bodyModel[180] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 318
		bodyModel[181] = new ModelRendererTurbo(this, 42, 101, textureX, textureY); // Box 319
		bodyModel[182] = new ModelRendererTurbo(this, 116, 45, textureX, textureY); // Box 276
		bodyModel[183] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[184] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[185] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[186] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[187] = new ModelRendererTurbo(this, 16, 50, textureX, textureY); // Box 5
		bodyModel[188] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[189] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[190] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[191] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[192] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[193] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[194] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[195] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[196] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[197] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 376
		bodyModel[198] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 377
		bodyModel[199] = new ModelRendererTurbo(this, 245, 24, textureX, textureY); // Box 378
		bodyModel[200] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 6 PRIME4-1
		bodyModel[201] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 7 PRIME4-3
		bodyModel[202] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 8 PRIME4-2
		bodyModel[203] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 9 PRIME4-4
		bodyModel[204] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428
		bodyModel[205] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[206] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[207] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[208] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[209] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[210] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[211] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[212] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[213] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[214] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[215] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[216] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[217] = new ModelRendererTurbo(this, 56, 90, textureX, textureY); // Box 410
		bodyModel[218] = new ModelRendererTurbo(this, 69, 90, textureX, textureY); // Box 310
		bodyModel[219] = new ModelRendererTurbo(this, 84, 95, textureX, textureY); // Box 81
		bodyModel[220] = new ModelRendererTurbo(this, 99, 112, textureX, textureY); // Box 81
		bodyModel[221] = new ModelRendererTurbo(this, 103, 108, textureX, textureY); // Box 275
		bodyModel[222] = new ModelRendererTurbo(this, 94, 95, textureX, textureY); // Box 250
		bodyModel[223] = new ModelRendererTurbo(this, 99, 108, textureX, textureY); // Box 276
		bodyModel[224] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 106 cab backbox
		bodyModel[225] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[226] = new ModelRendererTurbo(this, 151, 14, textureX, textureY); // Box 184 o2 generator
		bodyModel[227] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[228] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322
		bodyModel[229] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757
		bodyModel[230] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758
		bodyModel[231] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 440
		bodyModel[232] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631
		bodyModel[233] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 882
		bodyModel[234] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 883
		bodyModel[235] = new ModelRendererTurbo(this, 173, 7, textureX, textureY); // Box 409 commander base
		bodyModel[236] = new ModelRendererTurbo(this, 173, 3, textureX, textureY, "lamp"); // Box 410 commander beacon
		bodyModel[237] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[238] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[239] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[240] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[241] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[242] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[243] = new ModelRendererTurbo(this, 72, 195, textureX, textureY); // Box 530 fridge?
		bodyModel[244] = new ModelRendererTurbo(this, 28, 197, textureX, textureY); // Box 412 cs
		bodyModel[245] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[246] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[247] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[248] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[249] = new ModelRendererTurbo(this, 245, 24, textureX, textureY); // Box 544
		bodyModel[250] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 545
		bodyModel[251] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 546
		bodyModel[252] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[253] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[254] = new ModelRendererTurbo(this, 110, 3, textureX, textureY); // Box 165
		bodyModel[255] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 167
		bodyModel[256] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[257] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[258] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[259] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-9F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-42.01F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 57, 20, 14, 0F); // Box 6
		bodyModel[3].setRotationPoint(-19F, -21F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 7
		bodyModel[4].setRotationPoint(-31F, -19F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[5].setRotationPoint(-42F, -1F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 18, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[6].setRotationPoint(-9F, 2F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[7].setRotationPoint(10F, 4F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 24
		bodyModel[8].setRotationPoint(-31F, -19F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 25
		bodyModel[9].setRotationPoint(-32F, -5F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 28
		bodyModel[10].setRotationPoint(-20F, -19F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 30
		bodyModel[11].setRotationPoint(-32F, -19F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 31
		bodyModel[12].setRotationPoint(-35F, -5F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 32
		bodyModel[13].setRotationPoint(-36F, -3F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 33
		bodyModel[14].setRotationPoint(-36F, -5F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 35
		bodyModel[15].setRotationPoint(-19F, -5F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 36
		bodyModel[16].setRotationPoint(-19F, -5F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[17].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[18].setRotationPoint(-38F, 2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[19].setRotationPoint(-32F, -22F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[20].setRotationPoint(-32F, -22F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[21].setRotationPoint(-20F, -22F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[22].setRotationPoint(-32F, -22F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 148
		bodyModel[23].setRotationPoint(38F, -22F, -1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[24].setRotationPoint(38F, -22F, 1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[25].setRotationPoint(38F, -22F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[26].setRotationPoint(-38F, 1.5F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[27].setRotationPoint(-9F, 5F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[28].setRotationPoint(-9F, 5F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[29].setRotationPoint(-31F, -23F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[30].setRotationPoint(-32F, -23F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[31].setRotationPoint(-20F, -23F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[32].setRotationPoint(-32F, -23F, 1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[33].setRotationPoint(-20F, -23F, 1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[34].setRotationPoint(-20F, -22F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[35].setRotationPoint(-20F, -22F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[36].setRotationPoint(-31F, -23F, 1F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[37].setRotationPoint(-33F, -23F, -1F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[38].setRotationPoint(-38.75F, -13.75F, -2F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[39].setRotationPoint(-39F, -1F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[40].setRotationPoint(-39F, 7F, 10F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[41].setRotationPoint(-42F, 8F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[42].setRotationPoint(-39F, 7F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[43].setRotationPoint(-42F, -1F, 7F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[44].setRotationPoint(-42F, 2F, 7F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[45].setRotationPoint(-42F, -1F, -8F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[46].setRotationPoint(-42F, 2F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[47].setRotationPoint(-42F, 8F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[48].setRotationPoint(-42F, 8F, -9F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[49].setRotationPoint(38F, -1F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[50].setRotationPoint(38F, 7F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[51].setRotationPoint(38F, 7F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[52].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[53].setRotationPoint(42F, 8F, -9F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[54].setRotationPoint(-42F, -1F, 10F);

		bodyModel[55].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[55].setRotationPoint(-42F, -1F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[56].setRotationPoint(-42F, -9F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 76, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[57].setRotationPoint(-38F, 1F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[58].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[59].setRotationPoint(42.01F, -1F, -10F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[60].setRotationPoint(42.01F, -1F, 10F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[61].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[62].setRotationPoint(42.01F, -1F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[63].setRotationPoint(-35.5F, -11F, 6.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 284
		bodyModel[64].setRotationPoint(-24F, -24.5F, 3F);

		bodyModel[65].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[65].setRotationPoint(-19F, -13F, 11.01F);

		bodyModel[66].addBox(0F, 0F, 0F, 43, 8, 0, 0F); // Box 288
		bodyModel[66].setRotationPoint(-4F, -9F, 11F);

		bodyModel[67].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[67].setRotationPoint(-19F, -13F, -11.01F);

		bodyModel[68].addBox(0F, 0F, 0F, 43, 8, 0, 0F); // Box 303
		bodyModel[68].setRotationPoint(-4F, -9F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[69].setRotationPoint(39F, -9F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[70].setRotationPoint(10F, 4F, -9.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[71].setRotationPoint(9F, 1F, 8.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[72].setRotationPoint(-11F, 4F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[73].setRotationPoint(-11F, 4F, -9.5F);

		bodyModel[74].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[74].setRotationPoint(-10.5F, 5.5F, 10.01F);
		bodyModel[74].rotateAngleZ = -0.2268928F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[75].setRotationPoint(-11F, 2.5F, 8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[76].setRotationPoint(-11F, 1.5F, 8.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[77].setRotationPoint(-10.75F, 3F, 8.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[78].setRotationPoint(-38F, 1F, 7F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[79].setRotationPoint(-39F, -1F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[80].setRotationPoint(36F, 1F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[81].setRotationPoint(38F, -1F, -10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[82].setRotationPoint(-42F, 1F, -3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[83].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[84].setRotationPoint(37F, 1F, -3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[85].setRotationPoint(-33.1F, -23F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[86].setRotationPoint(-33.1F, -21F, -1F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[87].setRotationPoint(-39.35F, -13.7F, -2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[88].setRotationPoint(-39.35F, -13.7F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[89].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[90].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[91].setRotationPoint(36F, 1F, 7F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[92].setRotationPoint(38F, -1F, 7F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[93].setRotationPoint(-27F, -24.5F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[94].setRotationPoint(39F, -4F, -11.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[95].setRotationPoint(39F, -4F, 10.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[96].setRotationPoint(39F, -9F, 9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 36, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[97].setRotationPoint(-19F, -22F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 36, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[98].setRotationPoint(-19F, -22F, 3F);

		bodyModel[99].addBox(0F, 0F, 0F, 36, 1, 6, 0F); // Box 294
		bodyModel[99].setRotationPoint(-19F, -22F, -3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[100].setRotationPoint(-8F, -13F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[101].setRotationPoint(-8F, -13F, 11F);

		bodyModel[102].addBox(0F, 0F, 0F, 6, 12, 14, 0F); // Box 298
		bodyModel[102].setRotationPoint(-38F, -13F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[103].setRotationPoint(-38F, -14F, -1F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[104].setRotationPoint(-38F, -14F, -7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[105].setRotationPoint(-38F, -14F, 1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[106].setRotationPoint(-39F, -13F, -7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[107].setRotationPoint(-39F, -13F, 1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[108].setRotationPoint(-39F, -13F, -1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[109].setRotationPoint(-38.85F, -12.7F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[110].setRotationPoint(-38.85F, -12.7F, 5F);

		bodyModel[111].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[111].setRotationPoint(-32F, -23F, -1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[112].setRotationPoint(9F, 3F, -6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[113].setRotationPoint(-12F, 3F, -6F);

		bodyModel[114].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[114].setRotationPoint(-31.5F, -19F, -10.5F);

		bodyModel[115].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[115].setRotationPoint(-19.5F, -19F, 10.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[116].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[117].setRotationPoint(-42.01F, 7F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[118].setRotationPoint(-37.5F, -14F, -1F);

		bodyModel[119].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[119].setRotationPoint(-32F, 1F, 9F);
		bodyModel[119].rotateAngleZ = -0.27925268F;

		bodyModel[120].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[120].setRotationPoint(-35F, 1F, 9F);

		bodyModel[121].addBox(0F, 0F, 0F, 21, 18, 1, 0F); // Box 283
		bodyModel[121].setRotationPoint(17F, -19F, -7.75F);

		bodyModel[122].addBox(0F, 0F, 0F, 21, 18, 1, 0F); // Box 284
		bodyModel[122].setRotationPoint(17F, -19F, 6.75F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[123].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[123].rotateAngleY = -3.14159265F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[124].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[124].rotateAngleY = -3.14159265F;

		bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[125].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[125].rotateAngleY = -3.14159265F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[126].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[126].rotateAngleY = -3.14159265F;

		bodyModel[127].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[127].setRotationPoint(-42F, 6F, -8F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[128].setRotationPoint(-42F, 6F, 8F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[129].setRotationPoint(39F, 6F, 8F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[130].setRotationPoint(39F, 6F, -8F);

		bodyModel[131].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[131].setRotationPoint(-33F, -24.5F, -1.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[132].setRotationPoint(-32F, -24.5F, -0.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[133].setRotationPoint(-33F, -24.5F, 0.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[134].setRotationPoint(-31.5F, -23.5F, -0.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[135].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[136].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[137].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[137].setRotationPoint(39F, 8F, -11F);

		bodyModel[138].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[138].setRotationPoint(39F, 2F, -9F);

		bodyModel[139].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[139].setRotationPoint(39F, -1F, -8F);

		bodyModel[140].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[140].setRotationPoint(39F, 8F, 8F);

		bodyModel[141].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[141].setRotationPoint(39F, 2F, 7F);

		bodyModel[142].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[142].setRotationPoint(39F, -1F, 7F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[143].setRotationPoint(4.5F, -22.5F, -6.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[144].setRotationPoint(3F, -23.25F, -5.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[145].setRotationPoint(2F, -23.5F, -6.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[146].setRotationPoint(3.5F, -23.25F, -7.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[147].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[148].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[149].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[150].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[151].setRotationPoint(-29.5F, -22F, 7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[152].setRotationPoint(-29F, -23F, 7.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[153].setRotationPoint(-23F, -24F, 0F);

		bodyModel[154].addBox(0F, 0F, 0F, 21, 3, 16, 0F); // Box 298
		bodyModel[154].setRotationPoint(17F, -22F, -8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[155].setRotationPoint(17F, -23F, 1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[156].setRotationPoint(17F, -23F, -8F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[157].setRotationPoint(17F, -23F, -1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[158].setRotationPoint(37F, -23F, -1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[159].setRotationPoint(38F, -23F, -8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 279
		bodyModel[160].setRotationPoint(38F, -23F, 1F);

		bodyModel[161].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[161].setRotationPoint(38F, -23.25F, 0F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[162].setRotationPoint(-36F, -5F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[163].setRotationPoint(-10F, -3F, -10F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[164].setRotationPoint(-10F, -3F, 7F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[165].setRotationPoint(-10F, -5F, -11F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[166].setRotationPoint(-10F, -5F, 10F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[167].setRotationPoint(38.75F, -21.25F, -2F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[168].setRotationPoint(42F, -1F, -7F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[169].setRotationPoint(42F, -9F, -2F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[170].setRotationPoint(42F, -9F, 2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[171].setRotationPoint(42F, -1F, 2F);

		bodyModel[172].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[172].setRotationPoint(42F, -1F, 2F);
		bodyModel[172].rotateAngleY = -3.14159265F;
		bodyModel[172].rotateAngleZ = -1.48352986F;

		bodyModel[173].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[173].setRotationPoint(-42F, -1F, -2F);
		bodyModel[173].rotateAngleZ = -1.48352986F;

		bodyModel[174].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[174].setRotationPoint(-43F, -9F, -2F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[175].setRotationPoint(-43F, -9F, 2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[176].setRotationPoint(-43F, -1F, -7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[177].setRotationPoint(-43F, -1F, 2F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[178].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[179].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[180].setRotationPoint(-37F, -13.75F, 3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[181].setRotationPoint(-37F, -13.75F, 6F);

		bodyModel[182].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 276
		bodyModel[182].setRotationPoint(-37F, -12.5F, 7.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[183].setRotationPoint(-30F, -19F, -11F);
		bodyModel[183].rotateAngleX = -0.61086524F;

		bodyModel[184].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[184].setRotationPoint(-28F, -17F, -11F);

		bodyModel[185].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[185].setRotationPoint(-28.01F, -17F, 11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[186].setRotationPoint(-28F, -17F, 10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[187].setRotationPoint(-28F, -18F, 10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[188].setRotationPoint(-30F, -19F, 11F);
		bodyModel[188].rotateAngleX = 0.61086524F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[189].setRotationPoint(-46F, 7F, 0F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[190].setRotationPoint(-46F, 7F, -10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[191].setRotationPoint(-45F, 6F, 0F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[192].setRotationPoint(-45F, 5F, 2F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[193].setRotationPoint(-45F, 6F, -10F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[194].setRotationPoint(-45F, 5F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[195].setRotationPoint(-45F, 4F, 2F);

		bodyModel[196].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[196].setRotationPoint(-45F, 4F, -8F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[197].setRotationPoint(-15.5F, -17.5F, 6.15F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[198].setRotationPoint(-18F, -17.5F, 6.15F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[199].setRotationPoint(-18F, -20F, 6.15F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[200].setRotationPoint(-24F, -24.5F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[201].setRotationPoint(-24F, -24.5F, -1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[202].setRotationPoint(-24F, -24.5F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[203].setRotationPoint(-24F, -24.5F, -1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[204].setRotationPoint(-24F, -24F, -1F);

		bodyModel[205].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[205].setRotationPoint(-42F, 5F, 8F);

		bodyModel[206].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[206].setRotationPoint(-42F, 5F, -10F);

		bodyModel[207].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[207].setRotationPoint(39F, 5F, -10F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[208].setRotationPoint(39F, 5F, 8F);

		bodyModel[209].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[209].setRotationPoint(39F, 4F, 8F);

		bodyModel[210].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[210].setRotationPoint(-42F, 4F, 8F);

		bodyModel[211].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[211].setRotationPoint(-42F, 4F, -8F);

		bodyModel[212].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[212].setRotationPoint(39F, 4F, -8F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[213].setRotationPoint(-12F, 5F, -9F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[214].setRotationPoint(-10F, 5F, -9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[215].setRotationPoint(9F, 5F, -9F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[216].setRotationPoint(11F, 5F, -9F);

		bodyModel[217].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 410
		bodyModel[217].setRotationPoint(-38F, -13F, 11F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 310
		bodyModel[218].setRotationPoint(-39F, -13F, 11F);

		bodyModel[219].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 81
		bodyModel[219].setRotationPoint(-39.01F, -8F, -11F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[220].setRotationPoint(-39.01F, -5F, -11.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		bodyModel[221].setRotationPoint(-39F, -12F, -9.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 7, 8, 0, 0F); // Box 250
		bodyModel[222].setRotationPoint(-39F, -13F, -11F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[223].setRotationPoint(-39F, -13F, -11F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 12, 24, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -12F, -0.5F, -6F, -12F); // Box 106 cab backbox
		bodyModel[224].setRotationPoint(-22F, -22F, -6F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[225].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[226].setRotationPoint(-29F, -24.5F, -4F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		bodyModel[227].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[228].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[229].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[230].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758
		bodyModel[230].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[231].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[231].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631
		bodyModel[232].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[233].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[234].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[235].setRotationPoint(-28.5F, -24F, -0.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[236].setRotationPoint(-28.5F, -25F, -0.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[237].setRotationPoint(-38F, 1F, -11F);

		bodyModel[238].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 117 numberboard
		bodyModel[238].setRotationPoint(-33.05F, -22F, -1F);
		bodyModel[238].rotateAngleY = 0.14835299F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[239].setRotationPoint(-33.05F, -22F, 1F);
		bodyModel[239].rotateAngleY = -0.14835299F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[240].setRotationPoint(-33F, -22F, -6F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 175
		bodyModel[241].setRotationPoint(-33F, -22F, 1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[242].setRotationPoint(9.25F, 0.75F, 8.5F);

		bodyModel[243].addBox(0F, 0F, 0F, 2, 8, 3, 0F); // Box 530 fridge?
		bodyModel[243].setRotationPoint(-22F, -13F, -5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[244].setRotationPoint(-24.8F, -15F, -5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[245].setRotationPoint(-31.5F, -13F, -3F);
		bodyModel[245].rotateAngleY = -0.45378561F;

		bodyModel[246].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[246].setRotationPoint(-31.5F, -15F, -3F);
		bodyModel[246].rotateAngleY = -0.45378561F;

		bodyModel[247].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[247].setRotationPoint(-31.5F, -9F, -3F);
		bodyModel[247].rotateAngleY = -0.45378561F;

		bodyModel[248].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[248].setRotationPoint(-31F, -18F, 6.5F);
		bodyModel[248].rotateAngleY = 0.17453293F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[249].setRotationPoint(-18F, -20F, -7.15F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[250].setRotationPoint(-18F, -17.5F, -7.15F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[251].setRotationPoint(-15.5F, -17.5F, -7.15F);

		bodyModel[252].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[252].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[252].rotateAngleX = 1.57079633F;

		bodyModel[253].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[253].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[253].rotateAngleX = -1.57079633F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[254].setRotationPoint(-31F, -20F, -11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[255].setRotationPoint(-31F, -20F, 7F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[256].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[257].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[258].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[259].setRotationPoint(41.75F, -1F, 3F);
	}

	ModelFB2_new theTrucks2 = new ModelFB2_new();
	//ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 260; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	/*public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.9D, 1.45D, 0.0D});
			}
		};
	}*/
	public float[] getTrans() { return new float[]{-0F, 0.155F, 0F}; }//-1.7F, 0.155F, 0F

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}
}