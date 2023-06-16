//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: B23-30A
// Model Creator: Biba
// Created on: 20.04.2023 - 21:59:09
// Last changed on: 20.04.2023 - 21:59:09

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

public class ModelB23 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelB23() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[432];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);

		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[7] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[8] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[9] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[10] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[11] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[12] = new ModelRendererTurbo(this, 82, 132, textureX, textureY); // Box 196
		bodyModel[13] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[14] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[15] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[16] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[17] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[18] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[19] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[20] = new ModelRendererTurbo(this, 101, 105, textureX, textureY); // box65
		bodyModel[21] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[22] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[23] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[25] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[26] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[27] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[28] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[29] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[30] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[31] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[32] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[33] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[34] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[35] = new ModelRendererTurbo(this, 77, 120, textureX, textureY); // Box 2603
		bodyModel[36] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[37] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[38] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[39] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[40] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[41] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[43] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[44] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[45] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[46] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[47] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[48] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[49] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[50] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[51] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[52] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[53] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[54] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[55] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[56] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[57] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[58] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[59] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[60] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[61] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[62] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[63] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[64] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[65] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[66] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[67] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[68] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[69] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[70] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[71] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318 ph1 mounting stuff
		bodyModel[72] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322 ph1 mounting stuff
		bodyModel[73] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757 ph1 mounting stuff
		bodyModel[74] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758 ph1 mounting stuff
		bodyModel[75] = new ModelRendererTurbo(this, 256, 128, textureX, textureY); // Box 440 front mounting stuff
		bodyModel[76] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631 front mounting stuff
		bodyModel[77] = new ModelRendererTurbo(this, 240, 127, textureX, textureY); // Box 882 front mounting stuff
		bodyModel[78] = new ModelRendererTurbo(this, 240, 127, textureX, textureY); // Box 883 front mounting stuff
		bodyModel[79] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[80] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[81] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[82] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[83] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[84] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[85] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[86] = new ModelRendererTurbo(this, 1, 139, textureX, textureY); // Box 32
		bodyModel[87] = new ModelRendererTurbo(this, 12, 136, textureX, textureY); // Box 33
		bodyModel[88] = new ModelRendererTurbo(this, 83, 54, textureX, textureY); // Box 298
		bodyModel[89] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[90] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[91] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[92] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[93] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[94] = new ModelRendererTurbo(this, 7, 136, textureX, textureY); // Box 688
		bodyModel[95] = new ModelRendererTurbo(this, 1, 130, textureX, textureY); // Box 37
		bodyModel[96] = new ModelRendererTurbo(this, 14, 130, textureX, textureY); // Box 38
		bodyModel[97] = new ModelRendererTurbo(this, 7, 127, textureX, textureY); // Box 557
		bodyModel[98] = new ModelRendererTurbo(this, 12, 127, textureX, textureY); // Box 558
		bodyModel[99] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[100] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[101] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[102] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[103] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 300
		bodyModel[104] = new ModelRendererTurbo(this, 70, 59, textureX, textureY); // Box 301
		bodyModel[105] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[106] = new ModelRendererTurbo(this, 28, 101, textureX, textureY); // Box 316
		bodyModel[107] = new ModelRendererTurbo(this, 40, 100, textureX, textureY); // Box 317
		bodyModel[108] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 318
		bodyModel[109] = new ModelRendererTurbo(this, 42, 101, textureX, textureY); // Box 319
		bodyModel[110] = new ModelRendererTurbo(this, 73, 8, textureX, textureY); // Box 7
		bodyModel[111] = new ModelRendererTurbo(this, 31, 8, textureX, textureY); // Box 24
		bodyModel[112] = new ModelRendererTurbo(this, 10, 6, textureX, textureY); // Box 28
		bodyModel[113] = new ModelRendererTurbo(this, 52, 6, textureX, textureY); // Box 30
		bodyModel[114] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[115] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[116] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[117] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[118] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[119] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[120] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[121] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[122] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[123] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[124] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[125] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[126] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[127] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 52 door swing right
		bodyModel[128] = new ModelRendererTurbo(this, 56, 5, textureX, textureY); // Box 314 door swing right
		bodyModel[129] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[130] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[131] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[132] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[133] = new ModelRendererTurbo(this, 110, 3, textureX, textureY); // Box 165
		bodyModel[134] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 167
		bodyModel[135] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[136] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[137] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[138] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[139] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[140] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[141] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[142] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[143] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[144] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[145] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[146] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[147] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[148] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[149] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[150] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[151] = new ModelRendererTurbo(this, 249, 29, textureX, textureY); // Box 285
		bodyModel[152] = new ModelRendererTurbo(this, 249, 22, textureX, textureY); // Box 157
		bodyModel[153] = new ModelRendererTurbo(this, 344, 197, textureX, textureY); // Box 144
		bodyModel[154] = new ModelRendererTurbo(this, 360, 226, textureX, textureY); // Box 292
		bodyModel[155] = new ModelRendererTurbo(this, 351, 221, textureX, textureY); // Box 133
		bodyModel[156] = new ModelRendererTurbo(this, 351, 228, textureX, textureY); // Box 138
		bodyModel[157] = new ModelRendererTurbo(this, 360, 221, textureX, textureY); // Box 347
		bodyModel[158] = new ModelRendererTurbo(this, 331, 212, textureX, textureY); // Box 178
		bodyModel[159] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18 early stack
		bodyModel[160] = new ModelRendererTurbo(this, 246, 68, textureX, textureY); // Box 21 early stack
		bodyModel[161] = new ModelRendererTurbo(this, 248, 41, textureX, textureY); // Box 18 late stack
		bodyModel[162] = new ModelRendererTurbo(this, 246, 49, textureX, textureY); // Box 21 late stack
		bodyModel[163] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 405 EXTRA STACC
		bodyModel[164] = new ModelRendererTurbo(this, 256, 115, textureX, textureY); // Box 182 ph2 mounting stuff
		bodyModel[165] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 183 ph2 mounting stuff
		bodyModel[166] = new ModelRendererTurbo(this, 176, 140, textureX, textureY); // Box 184 ph2 mounting stuff
		bodyModel[167] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 185 ph2 mounting stuff
		bodyModel[168] = new ModelRendererTurbo(this, 8, 62, textureX, textureY); // Box 133
		bodyModel[169] = new ModelRendererTurbo(this, 8, 58, textureX, textureY); // Box 187
		bodyModel[170] = new ModelRendererTurbo(this, 446, 58, textureX, textureY); // Box 371
		bodyModel[171] = new ModelRendererTurbo(this, 407, 188, textureX, textureY); // Box 547
		bodyModel[172] = new ModelRendererTurbo(this, 439, 62, textureX, textureY); // Box 190
		bodyModel[173] = new ModelRendererTurbo(this, 439, 47, textureX, textureY); // Box 191
		bodyModel[174] = new ModelRendererTurbo(this, 407, 207, textureX, textureY); // Box 192
		bodyModel[175] = new ModelRendererTurbo(this, 320, 211, textureX, textureY); // Box 194
		bodyModel[176] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[177] = new ModelRendererTurbo(this, 331, 225, textureX, textureY); // Box 201
		bodyModel[178] = new ModelRendererTurbo(this, 320, 224, textureX, textureY); // Box 202
		bodyModel[179] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[180] = new ModelRendererTurbo(this, 144, 38, textureX, textureY); // Box 566
		bodyModel[181] = new ModelRendererTurbo(this, 144, 35, textureX, textureY); // Box 565
		bodyModel[182] = new ModelRendererTurbo(this, 144, 32, textureX, textureY); // Box 564
		bodyModel[183] = new ModelRendererTurbo(this, 142, 27, textureX, textureY, "cull"); // Box 561 cull bell holder
		bodyModel[184] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear down early
		bodyModel[185] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear up early
		bodyModel[186] = new ModelRendererTurbo(this, 461, 104, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[187] = new ModelRendererTurbo(this, 454, 102, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[188] = new ModelRendererTurbo(this, 474, 102, textureX, textureY, "lamp"); // Box 290 gyralight rear r
		bodyModel[189] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 165 numberboard early
		bodyModel[190] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 167 numberboard early
		bodyModel[191] = new ModelRendererTurbo(this, 474, 92, textureX, textureY); // Box 215 numberboard late HOLDER
		bodyModel[192] = new ModelRendererTurbo(this, 474, 92, textureX, textureY); // Box 216 numberboard late HOLDER
		bodyModel[193] = new ModelRendererTurbo(this, 487, 100, textureX, textureY, "lamp"); // Box 284 Headlight Rear down late
		bodyModel[194] = new ModelRendererTurbo(this, 487, 100, textureX, textureY, "lamp"); // Box 285 Headlight Rear up late
		bodyModel[195] = new ModelRendererTurbo(this, 487, 93, textureX, textureY); // Box 219 late headlight plate
		bodyModel[196] = new ModelRendererTurbo(this, 336, 112, textureX, textureY); // Box 220 what'le it be fellas? ketchup? or mustard!
		bodyModel[197] = new ModelRendererTurbo(this, 334, 122, textureX, textureY); // Box 221 what'le it be fellas? ketchup? or mustard!
		bodyModel[198] = new ModelRendererTurbo(this, 113, 36, textureX, textureY); // Box 355 brakewheel
		bodyModel[199] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[200] = new ModelRendererTurbo(this, 424, 81, textureX, textureY); // Box 535
		bodyModel[201] = new ModelRendererTurbo(this, 424, 81, textureX, textureY); // Box 293
		bodyModel[202] = new ModelRendererTurbo(this, 477, 10, textureX, textureY); // Box 293
		bodyModel[203] = new ModelRendererTurbo(this, 409, 82, textureX, textureY); // Box 229
		bodyModel[204] = new ModelRendererTurbo(this, 432, 90, textureX, textureY); // Box 230
		bodyModel[205] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 293 late air
		bodyModel[206] = new ModelRendererTurbo(this, 409, 82, textureX, textureY); // Box 232
		bodyModel[207] = new ModelRendererTurbo(this, 432, 90, textureX, textureY); // Box 233
		bodyModel[208] = new ModelRendererTurbo(this, 477, 10, textureX, textureY); // Box 234
		bodyModel[209] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 235
		bodyModel[210] = new ModelRendererTurbo(this, 501, 61, textureX, textureY); // Box 236 b30-7a early
		bodyModel[211] = new ModelRendererTurbo(this, 501, 61, textureX, textureY); // Box 237 b30-7a early
		bodyModel[212] = new ModelRendererTurbo(this, 468, 76, textureX, textureY); // Box 238 b30-7
		bodyModel[213] = new ModelRendererTurbo(this, 468, 83, textureX, textureY); // Box 239 b30-7
		bodyModel[214] = new ModelRendererTurbo(this, 468, 76, textureX, textureY); // Box 240 b30-7
		bodyModel[215] = new ModelRendererTurbo(this, 468, 83, textureX, textureY); // Box 241 b30-7
		bodyModel[216] = new ModelRendererTurbo(this, 56, 67, textureX, textureY); // Box 289
		bodyModel[217] = new ModelRendererTurbo(this, 44, 66, textureX, textureY); // Box 295
		bodyModel[218] = new ModelRendererTurbo(this, 25, 66, textureX, textureY); // Box 296
		bodyModel[219] = new ModelRendererTurbo(this, 10, 66, textureX, textureY); // Box 297
		bodyModel[220] = new ModelRendererTurbo(this, 1, 96, textureX, textureY, "lamp"); // Box 298 headlight f hh
		bodyModel[221] = new ModelRendererTurbo(this, 1, 96, textureX, textureY, "lamp"); // Box 299 headlight f hh
		bodyModel[222] = new ModelRendererTurbo(this, 19, 74, textureX, textureY); // Box 303
		bodyModel[223] = new ModelRendererTurbo(this, 34, 78, textureX, textureY); // Box 304
		bodyModel[224] = new ModelRendererTurbo(this, 41, 74, textureX, textureY); // Box 305
		bodyModel[225] = new ModelRendererTurbo(this, 34, 74, textureX, textureY); // Box 306
		bodyModel[226] = new ModelRendererTurbo(this, 50, 72, textureX, textureY); // Box 307
		bodyModel[227] = new ModelRendererTurbo(this, 10, 72, textureX, textureY); // Box 308
		bodyModel[228] = new ModelRendererTurbo(this, 37, 62, textureX, textureY); // Box 402
		bodyModel[229] = new ModelRendererTurbo(this, 8, 50, textureX, textureY); // Box 388 numberboard hh HOLDER
		bodyModel[230] = new ModelRendererTurbo(this, 8, 50, textureX, textureY); // Box 389 numberboard hh HOLDER
		bodyModel[231] = new ModelRendererTurbo(this, 8, 100, textureX, textureY); // Box 237
		bodyModel[232] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 238
		bodyModel[233] = new ModelRendererTurbo(this, 8, 107, textureX, textureY); // Box 239
		bodyModel[234] = new ModelRendererTurbo(this, 499, 91, textureX, textureY, "lamp"); // Box 215 numberboard late
		bodyModel[235] = new ModelRendererTurbo(this, 499, 91, textureX, textureY, "lamp"); // Box 216 numberboard late
		bodyModel[236] = new ModelRendererTurbo(this, 11, 99, textureX, textureY, "lamp"); // Box 388 numberboard hh
		bodyModel[237] = new ModelRendererTurbo(this, 11, 99, textureX, textureY, "lamp"); // Box 389 numberboard hh
		bodyModel[238] = new ModelRendererTurbo(this, 504, 112, textureX, textureY); // Box 566
		bodyModel[239] = new ModelRendererTurbo(this, 504, 109, textureX, textureY); // Box 565
		bodyModel[240] = new ModelRendererTurbo(this, 504, 106, textureX, textureY); // Box 564
		bodyModel[241] = new ModelRendererTurbo(this, 502, 101, textureX, textureY, "cull"); // Box 561 cull bell holder
		bodyModel[242] = new ModelRendererTurbo(this, 460, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[243] = new ModelRendererTurbo(this, 98, 145, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[244] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[245] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[246] = new ModelRendererTurbo(this, 128, 45, textureX, textureY); // Box 354
		bodyModel[247] = new ModelRendererTurbo(this, 130, 42, textureX, textureY); // Box 355
		bodyModel[248] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Box 356
		bodyModel[249] = new ModelRendererTurbo(this, 139, 45, textureX, textureY); // Box 357
		bodyModel[250] = new ModelRendererTurbo(this, 210, 32, textureX, textureY); // Box 286
		bodyModel[251] = new ModelRendererTurbo(this, 219, 35, textureX, textureY); // Box 287
		bodyModel[252] = new ModelRendererTurbo(this, 210, 38, textureX, textureY); // Box 288
		bodyModel[253] = new ModelRendererTurbo(this, 208, 35, textureX, textureY); // Box 289
		bodyModel[254] = new ModelRendererTurbo(this, 139, 42, textureX, textureY); // Box 332
		bodyModel[255] = new ModelRendererTurbo(this, 132, 39, textureX, textureY); // Box 331
		bodyModel[256] = new ModelRendererTurbo(this, 212, 29, textureX, textureY); // Box 526
		bodyModel[257] = new ModelRendererTurbo(this, 212, 41, textureX, textureY); // Box 527
		bodyModel[258] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[259] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[260] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[261] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[262] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[263] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[264] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[265] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[266] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[267] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[268] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[269] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[270] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[271] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[272] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[273] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[274] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[275] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[276] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[277] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[278] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[279] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[280] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[281] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[282] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[283] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[284] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[285] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[286] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[287] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[288] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[289] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[290] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[291] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[292] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[293] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[294] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[295] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[296] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[297] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[298] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[299] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[300] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[301] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[302] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[303] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[304] = new ModelRendererTurbo(this, 151, 14, textureX, textureY); // Box 184 o2 generator
		bodyModel[305] = new ModelRendererTurbo(this, 136, 66, textureX, textureY, "cull"); // Box 418 cull platform atsf
		bodyModel[306] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull atsf bit
		bodyModel[307] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[308] = new ModelRendererTurbo(this, 156, 68, textureX, textureY); // Box 308
		bodyModel[309] = new ModelRendererTurbo(this, 63, 6, textureX, textureY); // Box 309 cab roof vent
		bodyModel[310] = new ModelRendererTurbo(this, 145, 84, textureX, textureY); // Box 310
		bodyModel[311] = new ModelRendererTurbo(this, 145, 82, textureX, textureY); // Box 311
		bodyModel[312] = new ModelRendererTurbo(this, 145, 82, textureX, textureY); // Box 312
		bodyModel[313] = new ModelRendererTurbo(this, 145, 84, textureX, textureY); // Box 313
		bodyModel[314] = new ModelRendererTurbo(this, 125, 138, textureX, textureY, "cull"); // Box 314 cull anticlimber
		bodyModel[315] = new ModelRendererTurbo(this, 148, 144, textureX, textureY, "cull"); // Box 315 cull anticlimber
		bodyModel[316] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 745
		bodyModel[317] = new ModelRendererTurbo(this, 206, 49, textureX, textureY); // Box 746
		bodyModel[318] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 747
		bodyModel[319] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 748
		bodyModel[320] = new ModelRendererTurbo(this, 166, 42, textureX, textureY); // Box 333
		bodyModel[321] = new ModelRendererTurbo(this, 176, 45, textureX, textureY); // Box 334
		bodyModel[322] = new ModelRendererTurbo(this, 166, 45, textureX, textureY); // Box 335
		bodyModel[323] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 336
		bodyModel[324] = new ModelRendererTurbo(this, 157, 64, textureX, textureY, "cull"); // Box 324 cull platform sp
		bodyModel[325] = new ModelRendererTurbo(this, 148, 12, textureX, textureY); // Box 364 prime base
		bodyModel[326] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "lamp"); // Box 6 PRIME2-1
		bodyModel[327] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "lamp"); // Box 7 PRIME2-3
		bodyModel[328] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "lamp"); // Box 8 PRIME2-2
		bodyModel[329] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "lamp"); // Box 9 PRIME2-4
		bodyModel[330] = new ModelRendererTurbo(this, 146, 16, textureX, textureY, "cull"); // Box 330 cull sp beacon holder
		bodyModel[331] = new ModelRendererTurbo(this, 234, 101, textureX, textureY); // Box 331 sp thing
		bodyModel[332] = new ModelRendererTurbo(this, 137, 1, textureX, textureY, "lamp"); // Box 401 sp emergency gyra
		bodyModel[333] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 400 sp E gyra box
		bodyModel[334] = new ModelRendererTurbo(this, 142, -1, textureX, textureY); // Box 335 sp e gyra box holder stick
		bodyModel[335] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 336 tiny mini mexico tank
		bodyModel[336] = new ModelRendererTurbo(this, 493, 103, textureX, textureY); // Box 414 sp e gyra holdy rear
		bodyModel[337] = new ModelRendererTurbo(this, 494, 98, textureX, textureY, "lamp"); // Box 415 sp e gyra reart
		bodyModel[338] = new ModelRendererTurbo(this, 494, 108, textureX, textureY, "cull"); // Box 416 cull sp e gyra holdy rear
		bodyModel[339] = new ModelRendererTurbo(this, 339, 122, textureX, textureY); // Box 340 spee pee lol
		bodyModel[340] = new ModelRendererTurbo(this, 341, 112, textureX, textureY); // Box 341 spee pee lol
		bodyModel[341] = new ModelRendererTurbo(this, 156, 65, textureX, textureY); // Box 279
		bodyModel[342] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 6 PRIME4-1
		bodyModel[343] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 7 PRIME4-3
		bodyModel[344] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 8 PRIME4-2
		bodyModel[345] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 9 PRIME4-4
		bodyModel[346] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428 prime base
		bodyModel[347] = new ModelRendererTurbo(this, 182, 8, textureX, textureY); // Box 409 commander base
		bodyModel[348] = new ModelRendererTurbo(this, 182, 4, textureX, textureY, "lamp"); // Box 410 commander beacon
		bodyModel[349] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[350] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[351] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[352] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[353] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[354] = new ModelRendererTurbo(this, 16, 50, textureX, textureY); // Box 5
		bodyModel[355] = new ModelRendererTurbo(this, 251, 101, textureX, textureY); // Box 355 special sus box
		bodyModel[356] = new ModelRendererTurbo(this, 174, 29, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[357] = new ModelRendererTurbo(this, 155, 29, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[358] = new ModelRendererTurbo(this, 178, 27, textureX, textureY); // Box 563
		bodyModel[359] = new ModelRendererTurbo(this, 159, 27, textureX, textureY); // Box 564
		bodyModel[360] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 6 PRIME3-1
		bodyModel[361] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 7 PRIME3-3
		bodyModel[362] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 8 PRIME3-2
		bodyModel[363] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 9 PRIME3-4
		bodyModel[364] = new ModelRendererTurbo(this, 161, 56, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[365] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428 prime base
		bodyModel[366] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[367] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[368] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "lamp"); // Box 190 ditchlight f1
		bodyModel[369] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "lamp"); // Box 275 ditchlight f2
		bodyModel[370] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[371] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "lamp"); // Box 445 ditchlight f2
		bodyModel[372] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "lamp"); // Box 446 ditchlight f1
		bodyModel[373] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[374] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[375] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 101
		bodyModel[376] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "lamp"); // Box 276 ditchlight r1
		bodyModel[377] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "lamp"); // Box 278 ditchlight r2
		bodyModel[378] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[379] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "lamp"); // Box 441 ditchlight r2
		bodyModel[380] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[381] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "lamp"); // Box 443 ditchlight r1
		bodyModel[382] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[383] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[384] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[385] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245
		bodyModel[386] = new ModelRendererTurbo(this, 142, 59, textureX, textureY); // Box 364 prime base
		bodyModel[387] = new ModelRendererTurbo(this, 142, 55, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[388] = new ModelRendererTurbo(this, 142, 55, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[389] = new ModelRendererTurbo(this, 142, 55, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[390] = new ModelRendererTurbo(this, 142, 55, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[391] = new ModelRendererTurbo(this, 162, 108, textureX, textureY); // Box 250
		bodyModel[392] = new ModelRendererTurbo(this, 162, 99, textureX, textureY); // Box 410
		bodyModel[393] = new ModelRendererTurbo(this, 92, 117, textureX, textureY); // Box 406
		bodyModel[394] = new ModelRendererTurbo(this, 97, 125, textureX, textureY); // Box 407
		bodyModel[395] = new ModelRendererTurbo(this, 139, 125, textureX, textureY); // Box 293
		bodyModel[396] = new ModelRendererTurbo(this, 142, 117, textureX, textureY); // Box 294
		bodyModel[397] = new ModelRendererTurbo(this, 155, 101, textureX, textureY); // Box 399
		bodyModel[398] = new ModelRendererTurbo(this, 155, 110, textureX, textureY); // Box 400
		bodyModel[399] = new ModelRendererTurbo(this, 156, 79, textureX, textureY); // Box 285
		bodyModel[400] = new ModelRendererTurbo(this, 179, 81, textureX, textureY); // Box 288
		bodyModel[401] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 300
		bodyModel[402] = new ModelRendererTurbo(this, 179, 90, textureX, textureY); // Box 303
		bodyModel[403] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[404] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[405] = new ModelRendererTurbo(this, 442, 109, textureX, textureY); // Box 296
		bodyModel[406] = new ModelRendererTurbo(this, 444, 124, textureX, textureY); // Box 280
		bodyModel[407] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[408] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[409] = new ModelRendererTurbo(this, 155, 99, textureX, textureY); // Box 411
		bodyModel[410] = new ModelRendererTurbo(this, 155, 108, textureX, textureY); // Box 412
		bodyModel[411] = new ModelRendererTurbo(this, 94, 34, textureX, textureY, "cull"); // Box 339 cull ccrcl beacon holdy
		bodyModel[412] = new ModelRendererTurbo(this, 101, 34, textureX, textureY, "cull"); // Box 340 cull ccrcl beacon holdy
		bodyModel[413] = new ModelRendererTurbo(this, 102, 30, textureX, textureY, "lamp"); // Box 410 commander beacon ccrcl
		bodyModel[414] = new ModelRendererTurbo(this, 95, 30, textureX, textureY, "lamp"); // Box 342 commander beacon ccrcl
		bodyModel[415] = new ModelRendererTurbo(this, 116, 42, textureX, textureY); // Box 324
		bodyModel[416] = new ModelRendererTurbo(this, 370, 88, textureX, textureY); // Box 379 big box boye
		bodyModel[417] = new ModelRendererTurbo(this, 30, 197, textureX, textureY); // Box 412 cs
		bodyModel[418] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[419] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[420] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[421] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[422] = new ModelRendererTurbo(this, 133, 55, textureX, textureY, "lamp"); // Box 6 PRIME5-1
		bodyModel[423] = new ModelRendererTurbo(this, 133, 55, textureX, textureY, "lamp"); // Box 7 PRIME5-3
		bodyModel[424] = new ModelRendererTurbo(this, 133, 55, textureX, textureY, "lamp"); // Box 8 PRIME5-2
		bodyModel[425] = new ModelRendererTurbo(this, 133, 55, textureX, textureY, "lamp"); // Box 9 PRIME5-4
		bodyModel[426] = new ModelRendererTurbo(this, 133, 59, textureX, textureY); // Box 428 prime base
		bodyModel[427] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[428] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[429] = new ModelRendererTurbo(this, 67, 186, textureX, textureY); // Box 429 backwall
		bodyModel[430] = new ModelRendererTurbo(this, 90, 192, textureX, textureY, "cull"); // Box 430 backwall cull bit
		bodyModel[431] = new ModelRendererTurbo(this, 101, 186, textureX, textureY); // Box 431 backpannel bulgy bit

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-9F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-42.01F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[3].setRotationPoint(-42F, -1F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 18, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[4].setRotationPoint(-9F, 2F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[5].setRotationPoint(10F, 4F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[6].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[7].setRotationPoint(-38F, 2F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[8].setRotationPoint(-38F, 1.5F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[9].setRotationPoint(-9F, 5F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[10].setRotationPoint(-9F, 5F, 8F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[11].setRotationPoint(-39F, -1F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[12].setRotationPoint(-39F, 7F, 10F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[13].setRotationPoint(-42F, 8F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[14].setRotationPoint(-39F, 7F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[15].setRotationPoint(-42F, -1F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[16].setRotationPoint(-42F, 2F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[17].setRotationPoint(-42F, -1F, -8F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[18].setRotationPoint(-42F, 2F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[19].setRotationPoint(-42F, 8F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[20].setRotationPoint(-42F, 8F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[21].setRotationPoint(38F, -1F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[22].setRotationPoint(38F, 7F, 10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[23].setRotationPoint(38F, 7F, -11F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[24].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[25].setRotationPoint(42F, 8F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[26].setRotationPoint(42.01F, -1F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[27].setRotationPoint(10F, 4F, -9.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[28].setRotationPoint(9F, 1F, 8.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[29].setRotationPoint(-11F, 4F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[30].setRotationPoint(-11F, 4F, -9.5F);

		bodyModel[31].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[31].setRotationPoint(-10.5F, 5.5F, 10.01F);
		bodyModel[31].rotateAngleZ = -0.2268928F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[32].setRotationPoint(-11F, 2.5F, 8.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[33].setRotationPoint(-11F, 1.5F, 8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[34].setRotationPoint(-10.75F, 3F, 8.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[35].setRotationPoint(-38F, 1F, 7F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[36].setRotationPoint(-39F, -1F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 263
		bodyModel[37].setRotationPoint(37F, 1F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[38].setRotationPoint(38F, -1F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[39].setRotationPoint(-42F, 1F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[40].setRotationPoint(37F, 1F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[41].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[42].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 270434
		bodyModel[43].setRotationPoint(37F, 1F, 7F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[44].setRotationPoint(38F, -1F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[45].setRotationPoint(9F, 3F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[46].setRotationPoint(-12F, 3F, -6F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[47].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[48].setRotationPoint(-42.01F, 7F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[49].setRotationPoint(-42F, 6F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[50].setRotationPoint(-42F, 6F, 8F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[51].setRotationPoint(39F, 6F, 8F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[52].setRotationPoint(39F, 6F, -8F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[53].setRotationPoint(39F, 8F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[54].setRotationPoint(39F, 2F, -9F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[55].setRotationPoint(39F, 8F, 8F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[56].setRotationPoint(39F, 2F, 7F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[57].setRotationPoint(39F, -1F, 7F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[58].setRotationPoint(-42F, 5F, 8F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[59].setRotationPoint(-42F, 5F, -10F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[60].setRotationPoint(39F, 5F, -10F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[61].setRotationPoint(39F, 5F, 8F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[62].setRotationPoint(39F, 4F, 8F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[63].setRotationPoint(-42F, 4F, 8F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[64].setRotationPoint(-42F, 4F, -8F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[65].setRotationPoint(39F, 4F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[66].setRotationPoint(-12F, 5F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[67].setRotationPoint(-10F, 5F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[68].setRotationPoint(9F, 5F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[69].setRotationPoint(11F, 5F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[70].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318 ph1 mounting stuff
		bodyModel[71].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322 ph1 mounting stuff
		bodyModel[72].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757 ph1 mounting stuff
		bodyModel[73].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758 ph1 mounting stuff
		bodyModel[74].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[75].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440 front mounting stuff
		bodyModel[75].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631 front mounting stuff
		bodyModel[76].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882 front mounting stuff
		bodyModel[77].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883 front mounting stuff
		bodyModel[78].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[79].setRotationPoint(-38F, 1F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[80].setRotationPoint(9.25F, 0.75F, 8.5F);

		bodyModel[81].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[81].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[81].rotateAngleX = 1.57079633F;

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[82].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[82].rotateAngleX = -1.57079633F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 76, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[83].setRotationPoint(-38F, 1F, -7F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[84].setRotationPoint(39F, -1F, -8F);

		bodyModel[85].addBox(0F, 0F, 0F, 25, 4, 22, 0F); // Box 25
		bodyModel[85].setRotationPoint(-35F, -5F, -11F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 32
		bodyModel[86].setRotationPoint(-36F, -3F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 33
		bodyModel[87].setRotationPoint(-36F, -5F, 7F);

		bodyModel[88].addBox(0F, 0F, 0F, 6, 12, 14, 0F); // Box 298
		bodyModel[88].setRotationPoint(-38F, -13F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[89].setRotationPoint(-39F, -13F, -7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[90].setRotationPoint(-39F, -13F, 1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[91].setRotationPoint(-39F, -13F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[92].setRotationPoint(-38.85F, -12.7F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[93].setRotationPoint(-38.85F, -12.7F, 5F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[94].setRotationPoint(-36F, -5F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[95].setRotationPoint(-10F, -3F, -10F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[96].setRotationPoint(-10F, -3F, 7F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[97].setRotationPoint(-10F, -5F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[98].setRotationPoint(-10F, -5F, 10F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[99].setRotationPoint(-38.75F, -13.75F, -2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[100].setRotationPoint(-39.5F, -13.7F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[101].setRotationPoint(-39.5F, -13.7F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[102].setRotationPoint(-38F, -14F, -1F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[103].setRotationPoint(-38F, -14F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[104].setRotationPoint(-38F, -14F, 1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[105].setRotationPoint(-37.5F, -14F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[106].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[107].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[108].setRotationPoint(-37F, -13.75F, 3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[109].setRotationPoint(-37F, -13.75F, 6F);

		bodyModel[110].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 7
		bodyModel[110].setRotationPoint(-31F, -19F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 24
		bodyModel[111].setRotationPoint(-31F, -19F, 10F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 28
		bodyModel[112].setRotationPoint(-20F, -19F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 30
		bodyModel[113].setRotationPoint(-32F, -19F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[114].setRotationPoint(-32F, -22F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[115].setRotationPoint(-32F, -22F, -11F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[116].setRotationPoint(-20F, -22F, -7F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[117].setRotationPoint(-32F, -22F, -7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[118].setRotationPoint(-31F, -23F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[119].setRotationPoint(-32F, -23F, -7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[120].setRotationPoint(-20F, -23F, -7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[121].setRotationPoint(-32F, -23F, 1F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[122].setRotationPoint(-20F, -23F, 1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[123].setRotationPoint(-20F, -22F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[124].setRotationPoint(-20F, -22F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[125].setRotationPoint(-31F, -23F, 1F);

		bodyModel[126].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[126].setRotationPoint(-32F, -23F, -1F);

		bodyModel[127].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[127].setRotationPoint(-31.5F, -19F, -10.5F);

		bodyModel[128].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[128].setRotationPoint(-19.5F, -19F, 10.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[129].setRotationPoint(-30F, -19F, -11F);
		bodyModel[129].rotateAngleX = -0.61086524F;

		bodyModel[130].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[130].setRotationPoint(-28F, -17F, -11F);

		bodyModel[131].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[131].setRotationPoint(-28.01F, -17F, 11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[132].setRotationPoint(-30F, -19F, 11F);
		bodyModel[132].rotateAngleX = 0.61086524F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[133].setRotationPoint(-31F, -20F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[134].setRotationPoint(-31F, -20F, 7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 48
		bodyModel[135].setRotationPoint(-33F, -22.75F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[136].setRotationPoint(-33.25F, -22.75F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[137].setRotationPoint(-33.25F, -20.75F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 117 numberboard
		bodyModel[138].setRotationPoint(-33.1F, -21.75F, -1F);
		bodyModel[138].rotateAngleY = 0.14835299F;

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[139].setRotationPoint(-33.1F, -21.75F, 1F);
		bodyModel[139].rotateAngleY = -0.14835299F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[140].setRotationPoint(-33F, -21.75F, -6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 175
		bodyModel[141].setRotationPoint(-33F, -21.75F, 1F);

		bodyModel[142].addBox(0F, 0F, 0F, 57, 20, 14, 0F); // Box 6
		bodyModel[142].setRotationPoint(-19F, -21F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 29, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[143].setRotationPoint(-19F, -22F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 29, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[144].setRotationPoint(-19F, -22F, 3F);

		bodyModel[145].addBox(0F, 0F, 0F, 36, 1, 6, 0F); // Box 294
		bodyModel[145].setRotationPoint(-19F, -22F, -3F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 148
		bodyModel[146].setRotationPoint(38F, -22F, -1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[147].setRotationPoint(38F, -22F, 1F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[148].setRotationPoint(38F, -22F, -8F);

		bodyModel[149].addBox(0F, 0F, 0F, 28, 20, 1, 0F); // Box 283
		bodyModel[149].setRotationPoint(10F, -21F, -7.75F);

		bodyModel[150].addBox(0F, 0F, 0F, 28, 20, 1, 0F); // Box 284
		bodyModel[150].setRotationPoint(10F, -21F, 6.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[151].setRotationPoint(10F, -22F, -8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 157
		bodyModel[152].setRotationPoint(10F, -22F, 3F);

		bodyModel[153].addBox(0F, 0F, 0F, 20, 3, 20, 0F); // Box 144
		bodyModel[153].setRotationPoint(17F, -22F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, -0.35F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 292
		bodyModel[154].setRotationPoint(17F, -19F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 133
		bodyModel[155].setRotationPoint(37F, -22F, 7.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 138
		bodyModel[156].setRotationPoint(37F, -22F, -10.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.35F, -1F, 0F, 0F, -1F, 0F); // Box 347
		bodyModel[157].setRotationPoint(17F, -19F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, -1F, -1F, -1.35F, -1.27F, 0F, 0.35F, -1.27F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -1.35F, 0.5F, 0F, 0.35F, 0.5F, 0F); // Box 178
		bodyModel[158].setRotationPoint(38F, -23.5F, 0F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18 early stack
		bodyModel[159].setRotationPoint(11.5F, -23.5F, -2.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21 early stack
		bodyModel[160].setRotationPoint(11F, -22.5F, -3F);

		bodyModel[161].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18 late stack
		bodyModel[161].setRotationPoint(10.5F, -23.5F, -3F);

		bodyModel[162].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 21 late stack
		bodyModel[162].setRotationPoint(10F, -22.5F, -3.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 405 EXTRA STACC
		bodyModel[163].setRotationPoint(10.5F, -24.5F, -3F);

		bodyModel[164].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 182 ph2 mounting stuff
		bodyModel[164].setRotationPoint(23.5F, 2.5F, -2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 183 ph2 mounting stuff
		bodyModel[165].setRotationPoint(24.5F, 2F, 6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 184 ph2 mounting stuff
		bodyModel[166].setRotationPoint(23.5F, 1F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 185 ph2 mounting stuff
		bodyModel[167].setRotationPoint(24.5F, 2F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[168].setRotationPoint(-33F, -19F, -1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[169].setRotationPoint(-33F, -23.5F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[170].setRotationPoint(17F, -23F, -1F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 38, 0, 18, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, -1.28F, -9F, 0F, -1.28F, -9F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 1.28F, -9F, 0F, 1.28F, -9F); // Box 547
		bodyModel[171].setRotationPoint(18F, -23.51F, 1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 20, 1, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.77F, 0F, 0F, -0.77F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[172].setRotationPoint(17F, -23F, 1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 20, 1, 9, 0F,0F, -0.77F, 0F, 0F, -0.77F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[173].setRotationPoint(17F, -23F, -10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 38, 0, 18, 0F,0F, -1.28F, -9F, -19F, -1.28F, -9F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 1.28F, -9F, -19F, 1.28F, -9F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[174].setRotationPoint(18F, -23.51F, -19F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.35F, -0.77F, 0F, 0F, -0.77F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[175].setRotationPoint(37F, -23F, 1F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[176].setRotationPoint(37F, -23F, -1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.35F, -1.27F, 0F, -1.35F, -1.27F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0.35F, 0.5F, 0F, -1.35F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 201
		bodyModel[177].setRotationPoint(38F, -23.5F, -10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.77F, 0F, -0.35F, -0.77F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[178].setRotationPoint(37F, -23F, -10F);

		bodyModel[179].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[179].setRotationPoint(38F, -23.25F, 0F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 566
		bodyModel[180].setRotationPoint(-34.75F, -21F, -0.25F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 565
		bodyModel[181].setRotationPoint(-35F, -21.5F, -0.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[182].setRotationPoint(-35F, -22.5F, -0.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 561 cull bell holder
		bodyModel[183].setRotationPoint(-35F, -22.5F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down early
		bodyModel[184].setRotationPoint(38.1F, -17F, -1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up early
		bodyModel[185].setRotationPoint(38.1F, -19F, -1F);

		bodyModel[186].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[186].setRotationPoint(38.5F, -21.25F, -2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[187].setRotationPoint(40.25F, -21.2F, -2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight rear r
		bodyModel[188].setRotationPoint(40.25F, -21.2F, 0F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165 numberboard early
		bodyModel[189].setRotationPoint(38.3F, -19F, -6.25F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 167 numberboard early
		bodyModel[190].setRotationPoint(38.3F, -19F, 1.25F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 215 numberboard late HOLDER
		bodyModel[191].setRotationPoint(38.6F, -19F, -6.25F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 216 numberboard late HOLDER
		bodyModel[192].setRotationPoint(38.6F, -19F, 1.25F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down late
		bodyModel[193].setRotationPoint(38.45F, -17F, -1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up late
		bodyModel[194].setRotationPoint(38.45F, -19F, -1F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 219 late headlight plate
		bodyModel[195].setRotationPoint(38.2F, -19F, -1F);

		bodyModel[196].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 220 what'le it be fellas? ketchup? or mustard!
		bodyModel[196].setRotationPoint(6F, 1.5F, -11.25F);
		bodyModel[196].rotateAngleX = 1.57079633F;

		bodyModel[197].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 221 what'le it be fellas? ketchup? or mustard!
		bodyModel[197].setRotationPoint(-7F, 1.5F, 11.25F);
		bodyModel[197].rotateAngleX = -1.57079633F;

		bodyModel[198].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[198].setRotationPoint(-37.5F, -13F, 7.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[199].setRotationPoint(-35.5F, -11F, 6.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 535
		bodyModel[200].setRotationPoint(26.75F, -15F, -8.25F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[201].setRotationPoint(26.75F, -15F, 7.25F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[202].setRotationPoint(23.5F, -15F, 7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[203].setRotationPoint(26.5F, -7.5F, 7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[204].setRotationPoint(30.5F, -7F, 7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293 late air
		bodyModel[205].setRotationPoint(17.5F, -8F, 7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[206].setRotationPoint(26.5F, -7.5F, -8F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[207].setRotationPoint(30.5F, -7F, -8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[208].setRotationPoint(23.5F, -15F, -8F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[209].setRotationPoint(17.5F, -8F, -8F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 236 b30-7a early
		bodyModel[210].setRotationPoint(21F, -15F, -8F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 237 b30-7a early
		bodyModel[211].setRotationPoint(21F, -15F, 7F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 238 b30-7
		bodyModel[212].setRotationPoint(26.75F, -15F, 7.25F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 239 b30-7
		bodyModel[213].setRotationPoint(26.75F, -9F, 7.25F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 240 b30-7
		bodyModel[214].setRotationPoint(26.75F, -15F, -8.25F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 241 b30-7
		bodyModel[215].setRotationPoint(26.75F, -9F, -8.25F);

		bodyModel[216].addBox(0F, 0F, 0F, 6, 8, 14, 0F); // Box 289
		bodyModel[216].setRotationPoint(-38F, -21F, -7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[217].setRotationPoint(-38F, -22F, -7F);

		bodyModel[218].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 296
		bodyModel[218].setRotationPoint(-38F, -22F, -3F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[219].setRotationPoint(-38F, -22F, 3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 298 headlight f hh
		bodyModel[220].setRotationPoint(-39.5F, -18.75F, -1F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 299 headlight f hh
		bodyModel[221].setRotationPoint(-39.5F, -16.75F, -1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[222].setRotationPoint(-39F, -21F, 1F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 304
		bodyModel[223].setRotationPoint(-39F, -21F, -1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[224].setRotationPoint(-39F, -21F, -7F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[225].setRotationPoint(-39F, -22F, -1F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[226].setRotationPoint(-39F, -22F, -7F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 308
		bodyModel[227].setRotationPoint(-39F, -22F, 1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[228].setRotationPoint(-38.75F, -22.5F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F); // Box 388 numberboard hh HOLDER
		bodyModel[229].setRotationPoint(-39.5F, -17F, 1.25F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 389 numberboard hh HOLDER
		bodyModel[230].setRotationPoint(-39.5F, -17F, -6.25F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0.225F, 0F, 0F, 0.225F, 0F, 0F, 0.225F, 0F, 0F, 0.225F); // Box 237
		bodyModel[231].setRotationPoint(-39.25F, -19.25F, -1F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.5F, 0.225F, 0F, -0.5F, 0.225F, 0F, -0.5F, 0.225F, 0F, -0.5F, 0.225F, 0F, -0.25F, 0.225F, 0F, -0.25F, 0.225F, 0F, -0.25F, 0.225F, 0F, -0.25F, 0.225F); // Box 238
		bodyModel[232].setRotationPoint(-39.25F, -18.75F, -1F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.225F, 0F, 0F, 0.225F, 0F, 0F, 0.225F, 0F, 0F, 0.225F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 239
		bodyModel[233].setRotationPoint(-39.25F, -15F, -1F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 215 numberboard late
		bodyModel[234].setRotationPoint(38.6F, -19F, -6.25F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F); // Box 216 numberboard late 
		bodyModel[235].setRotationPoint(38.6F, -19F, 1.25F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F); // Box 388 numberboard hh 
		bodyModel[236].setRotationPoint(-39.5F, -17F, 1.25F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F); // Box 389 numberboard hh
		bodyModel[237].setRotationPoint(-39.5F, -17F, -6.25F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 566
		bodyModel[238].setRotationPoint(40.25F, -21.5F, -0.25F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 565
		bodyModel[239].setRotationPoint(40F, -22F, -0.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[240].setRotationPoint(40F, -23F, -0.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 561 cull bell holder
		bodyModel[241].setRotationPoint(39F, -23F, -1F);

		bodyModel[242].addBox(-3F, 0F, 0F, 3, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[242].setRotationPoint(42F, -1F, 2F);
		bodyModel[242].rotateAngleY = -3.14159265F;
		bodyModel[242].rotateAngleZ = -1.48352986F;

		bodyModel[243].addBox(-3F, 0F, 0F, 3, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[243].setRotationPoint(-42F, -1F, -2F);
		bodyModel[243].rotateAngleZ = -1.48352986F;

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[244].setRotationPoint(37.85F, -15F, -7F);
		bodyModel[244].rotateAngleY = -0.05235988F;

		bodyModel[245].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[245].setRotationPoint(37.85F, -15F, 7F);
		bodyModel[245].rotateAngleY = 0.05235988F;

		bodyModel[246].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[246].setRotationPoint(-39F, -23.5F, -4F);

		bodyModel[247].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[247].setRotationPoint(-38F, -23.25F, -3F);

		bodyModel[248].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[248].setRotationPoint(-38.5F, -23.25F, -5F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[249].setRotationPoint(-36.5F, -22.5F, -4F);

		bodyModel[250].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[250].setRotationPoint(36.5F, -24.5F, 4.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[251].setRotationPoint(37F, -23.75F, 3.5F);

		bodyModel[252].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[252].setRotationPoint(37F, -24.5F, 2.5F);

		bodyModel[253].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[253].setRotationPoint(36.5F, -24.75F, 3.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[254].setRotationPoint(-37.5F, -24.5F, -4.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[255].setRotationPoint(-37.5F, -24.5F, -3.25F);

		bodyModel[256].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 526
		bodyModel[256].setRotationPoint(37F, -25.75F, 4.25F);

		bodyModel[257].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 527
		bodyModel[257].setRotationPoint(37F, -25.75F, 3F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[258].setRotationPoint(-46F, 7F, 0F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[259].setRotationPoint(-46F, 7F, -10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[260].setRotationPoint(-45F, 6F, 0F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[261].setRotationPoint(-45F, 5F, 2F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[262].setRotationPoint(-45F, 6F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[263].setRotationPoint(-45F, 5F, -10F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[264].setRotationPoint(-45F, 4F, 2F);

		bodyModel[265].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[265].setRotationPoint(-45F, 4F, -8F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[266].setRotationPoint(44F, 6F, 0F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[267].setRotationPoint(44F, 6F, -10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[268].setRotationPoint(45F, 7F, -10F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[269].setRotationPoint(45F, 7F, 0F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[270].setRotationPoint(44F, 5F, 2F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[271].setRotationPoint(44F, 4F, 2F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[272].setRotationPoint(44F, 5F, -10F);

		bodyModel[273].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[273].setRotationPoint(44F, 4F, -8F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[274].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[275].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[276].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[277].setRotationPoint(41.75F, -1F, 3F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[278].setRotationPoint(42F, -1F, -7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[279].setRotationPoint(42F, -1F, 2F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[280].setRotationPoint(-43F, -1F, -7F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[281].setRotationPoint(-43F, -1F, 2F);

		bodyModel[282].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 418
		bodyModel[282].setRotationPoint(4.5F, -22F, -6.5F);

		bodyModel[283].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[283].setRotationPoint(3F, -22.75F, -5.5F);

		bodyModel[284].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[284].setRotationPoint(2F, -23F, -6.5F);

		bodyModel[285].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[285].setRotationPoint(3.5F, -22.75F, -7.5F);

		bodyModel[286].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 61
		bodyModel[286].setRotationPoint(-42F, -1F, 10F);

		bodyModel[287].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 63
		bodyModel[287].setRotationPoint(-42F, -1F, -11F);

		bodyModel[288].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[288].setRotationPoint(-42F, -9F, -8F);

		bodyModel[289].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 259
		bodyModel[289].setRotationPoint(42.01F, -1F, 10F);

		bodyModel[290].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[290].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[291].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 269
		bodyModel[291].setRotationPoint(42.01F, -1F, -11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[292].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[293].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[294].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[295].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[296].setRotationPoint(42F, -1F, -7F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[297].setRotationPoint(42F, -9F, -2F);

		bodyModel[298].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[298].setRotationPoint(42F, -9F, 2F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[299].setRotationPoint(42F, -1F, 2F);

		bodyModel[300].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[300].setRotationPoint(-43F, -9F, -2F);

		bodyModel[301].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[301].setRotationPoint(-43F, -9F, 2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[302].setRotationPoint(-43F, -1F, -7F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[303].setRotationPoint(-43F, -1F, 2F);

		bodyModel[304].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[304].setRotationPoint(-30.5F, -24.5F, -4F);

		bodyModel[305].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 418 cull platform atsf
		bodyModel[305].setRotationPoint(-25F, -24.5F, -2.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull atsf bit
		bodyModel[306].setRotationPoint(-25F, -23.5F, 3.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[307].setRotationPoint(-25F, -24.5F, 5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[308].setRotationPoint(-24F, -25.5F, 0F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 309 cab roof vent
		bodyModel[309].setRotationPoint(-21F, -22.5F, -5F);
		bodyModel[309].rotateAngleX = 0.15707963F;

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 310
		bodyModel[310].setRotationPoint(-40F, -1F, -9F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 311
		bodyModel[311].setRotationPoint(-40F, -1F, 8F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 312
		bodyModel[312].setRotationPoint(39F, -1F, 8F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[313].setRotationPoint(39F, -1F, -9F);

		bodyModel[314].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 314 cull anticlimber
		bodyModel[314].setRotationPoint(-43F, -1F, -9F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 315 cull anticlimber
		bodyModel[315].setRotationPoint(-44F, -1F, -8F);

		bodyModel[316].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 745
		bodyModel[316].setRotationPoint(-13.5F, -23F, -0.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[317].setRotationPoint(-16F, -24F, -0.5F);

		bodyModel[318].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[318].setRotationPoint(-15F, -23.75F, 0.5F);

		bodyModel[319].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[319].setRotationPoint(-13.5F, -23.75F, -1.5F);

		bodyModel[320].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 333
		bodyModel[320].setRotationPoint(-18F, -23.5F, 3.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 334
		bodyModel[321].setRotationPoint(-16.5F, -23F, 4.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 335
		bodyModel[322].setRotationPoint(-17F, -24F, 4.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[323].setRotationPoint(-18F, -23.5F, 5.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 5, 2, 7, 0F); // Box 324 cull platform sp
		bodyModel[324].setRotationPoint(-25F, -24.5F, -3.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[325].setRotationPoint(-33F, -25F, -1F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[326].setRotationPoint(-33F, -25.5F, -1F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[327].setRotationPoint(-33F, -25.5F, -1F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[328].setRotationPoint(-33F, -25.5F, -1F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[329].setRotationPoint(-33F, -25.5F, -1F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 330 cull sp beacon holder
		bodyModel[330].setRotationPoint(-33F, -24F, -1.5F);

		bodyModel[331].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 331 sp thing
		bodyModel[331].setRotationPoint(-19F, -9F, -11F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 401 sp emergency gyra
		bodyModel[332].setRotationPoint(-33.1F, -25.5F, -1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 400 sp E gyra box
		bodyModel[333].setRotationPoint(-33F, -25.5F, -1F);

		bodyModel[334].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 335 sp e gyra box holder stick
		bodyModel[334].setRotationPoint(-31F, -23.5F, -1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 18, 1, 20, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 336 tiny mini mexico tank
		bodyModel[335].setRotationPoint(-9F, 5F, -10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 414 sp e gyra holdy rear
		bodyModel[336].setRotationPoint(39.01F, -23.6F, -1F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 415 sp e gyra reart
		bodyModel[337].setRotationPoint(39.9F, -23.6F, -1F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.05F, 0.3F, -0.5F, 0.05F, 0.3F, -0.5F, 0.05F, 0.3F, 0F, 0.05F, 0.3F, 0F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0F, 0.5F, 0.3F); // Box 416 cull sp e gyra holdy rear
		bodyModel[338].setRotationPoint(39F, -23.76F, -1F);

		bodyModel[339].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 340 spee pee lol
		bodyModel[339].setRotationPoint(-7F, 1.5F, -11.25F);
		bodyModel[339].rotateAngleX = 1.57079633F;

		bodyModel[340].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 341 spee pee lol
		bodyModel[340].setRotationPoint(6F, 1.5F, 11.25F);
		bodyModel[340].rotateAngleX = -1.57079633F;

		bodyModel[341].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[341].setRotationPoint(-27F, -25F, 0F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[342].setRotationPoint(-24F, -24.5F, -1F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[343].setRotationPoint(-24F, -24.5F, -1F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[344].setRotationPoint(-24F, -24.5F, -1F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[345].setRotationPoint(-24F, -24.5F, -1F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[346].setRotationPoint(-24F, -24F, -1F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[347].setRotationPoint(-28.5F, -24F, -0.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[348].setRotationPoint(-28.5F, -25F, -0.5F);

		bodyModel[349].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[349].setRotationPoint(-33F, -24.5F, -1.5F);

		bodyModel[350].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[350].setRotationPoint(-32F, -24.5F, -0.5F);

		bodyModel[351].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[351].setRotationPoint(-33F, -24.5F, 0.5F);

		bodyModel[352].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[352].setRotationPoint(-31.5F, -23.5F, -0.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[353].setRotationPoint(-28F, -17F, 10F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[354].setRotationPoint(-28F, -18F, 10F);

		bodyModel[355].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 355 special sus box
		bodyModel[355].setRotationPoint(-35F, -8F, 7F);

		bodyModel[356].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[356].setRotationPoint(-27F, -23F, -9.5F);

		bodyModel[357].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[357].setRotationPoint(-27F, -23F, 6.5F);

		bodyModel[358].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[358].setRotationPoint(-26.5F, -24F, -8F);

		bodyModel[359].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[359].setRotationPoint(-26.5F, -24F, 8F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[360].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[361].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[362].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[363].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[364].setRotationPoint(-29.5F, -22F, 7F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[365].setRotationPoint(-29F, -23F, 7.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[366].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[367].setRotationPoint(-42.5F, 0F, -8.75F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[368].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[369].setRotationPoint(-42.75F, 0F, -8.75F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[370].setRotationPoint(-42.5F, 0F, 6.75F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[371].setRotationPoint(-42.75F, 0F, 6.75F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[372].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[373].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[374].setRotationPoint(41F, -4F, -6.75F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[375].setRotationPoint(42F, 0F, -8.75F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[376].setRotationPoint(41.75F, -4F, -6.75F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[377].setRotationPoint(42.25F, 0F, -8.75F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[378].setRotationPoint(42F, 0F, 6.75F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[379].setRotationPoint(42.25F, 0F, 6.75F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[380].setRotationPoint(41F, -4F, 4.75F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[381].setRotationPoint(41.75F, -4F, 4.75F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[382].setRotationPoint(-18F, -19.25F, -9F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[383].setRotationPoint(-18F, -20.25F, -9F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[384].setRotationPoint(-17.75F, -18.75F, -8.75F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[385].setRotationPoint(-18F, -21.25F, -8.8F);

		bodyModel[386].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 364 prime base
		bodyModel[386].setRotationPoint(-31F, -23.5F, -3.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[387].setRotationPoint(-31F, -24.5F, -3.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[388].setRotationPoint(-31F, -24.5F, -3.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[389].setRotationPoint(-31F, -24.5F, -3.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[390].setRotationPoint(-31F, -24.5F, -3.5F);

		bodyModel[391].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 250
		bodyModel[391].setRotationPoint(-36F, -13F, -11F);

		bodyModel[392].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 410
		bodyModel[392].setRotationPoint(-36F, -13F, 11F);

		bodyModel[393].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 406
		bodyModel[393].setRotationPoint(-39F, -10F, 9F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		bodyModel[394].setRotationPoint(-39F, -6F, 10.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 293
		bodyModel[395].setRotationPoint(-39F, -6F, -11.5F);

		bodyModel[396].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 294
		bodyModel[396].setRotationPoint(-39F, -10F, -11F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F); // Box 399
		bodyModel[397].setRotationPoint(-39F, -13F, 11F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F); // Box 400
		bodyModel[398].setRotationPoint(-39F, -13F, -11F);

		bodyModel[399].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[399].setRotationPoint(-19F, -13F, 11.01F);

		bodyModel[400].addBox(0F, 0F, 0F, 43, 8, 0, 0F); // Box 288
		bodyModel[400].setRotationPoint(-4F, -9F, 11F);

		bodyModel[401].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[401].setRotationPoint(-19F, -13F, -11.01F);

		bodyModel[402].addBox(0F, 0F, 0F, 43, 8, 0, 0F); // Box 303
		bodyModel[402].setRotationPoint(-4F, -9F, -11F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[403].setRotationPoint(-8F, -13F, -11F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[404].setRotationPoint(-8F, -13F, 11F);

		bodyModel[405].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[405].setRotationPoint(39F, -9F, -11F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[406].setRotationPoint(39F, -6F, -11.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[407].setRotationPoint(39F, -6F, 10.5F);

		bodyModel[408].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[408].setRotationPoint(39F, -9F, 9F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 411
		bodyModel[409].setRotationPoint(-39F, -13F, 11F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 412
		bodyModel[410].setRotationPoint(-39F, -13F, -11F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F); // Box 339 cull ccrcl beacon holdy
		bodyModel[411].setRotationPoint(-31F, -22F, 7F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F); // Box 340 cull ccrcl beacon holdy
		bodyModel[412].setRotationPoint(-31F, -22F, -9F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon ccrcl
		bodyModel[413].setRotationPoint(-31F, -23.75F, -8.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 342 commander beacon ccrcl
		bodyModel[414].setRotationPoint(-31F, -23.75F, 7.5F);

		bodyModel[415].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 324
		bodyModel[415].setRotationPoint(-33F, -24F, -1.5F);

		bodyModel[416].addBox(0F, 0F, 0F, 9, 5, 15, 0F); // Box 379 big box boye
		bodyModel[416].setRotationPoint(-14F, -24F, -7.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[417].setRotationPoint(-25.05F, -15F, -5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[418].setRotationPoint(-31.75F, -13F, -3F);
		bodyModel[418].rotateAngleY = -0.45378561F;

		bodyModel[419].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[419].setRotationPoint(-31.75F, -15F, -3F);
		bodyModel[419].rotateAngleY = -0.45378561F;

		bodyModel[420].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[420].setRotationPoint(-31.75F, -9F, -3F);
		bodyModel[420].rotateAngleY = -0.45378561F;

		bodyModel[421].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[421].setRotationPoint(-31F, -17F, 6.5F);
		bodyModel[421].rotateAngleY = 0.17453293F;

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
		bodyModel[422].setRotationPoint(-37F, -24F, -1F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
		bodyModel[423].setRotationPoint(-37F, -24F, -1F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
		bodyModel[424].setRotationPoint(-37F, -24F, -1F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
		bodyModel[425].setRotationPoint(-37F, -24F, -1F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[426].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[427].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[427].setRotationPoint(-33F, 1F, 9F);
		bodyModel[427].rotateAngleZ = -0.27925268F;

		bodyModel[428].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[428].setRotationPoint(-36F, 1F, 9F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 17, 10, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 429 backwall
		bodyModel[429].setRotationPoint(-21F, -22F, -5F);

		bodyModel[430].addBox(0F, 0F, 0F, 1, 11, 4, 0F); // Box 430 backwall cull bit
		bodyModel[430].setRotationPoint(-21F, -16F, 1F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -5.125F, 0.125F, -0.125F, -5.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -5.125F, 0.125F, -5.125F, -5F); // Box 431 backpannel bulgy bit
		bodyModel[431].setRotationPoint(-21F, -21F, 0F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 432; i++) {
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
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 0) {
			//fb2 black late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14236){
			//type b silver early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 8||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 17){
			//fb2 sp late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_sp.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 16){
			//fb2 silver late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7){
			//fb2 grey late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 9){
			//fb2 CRASH SMASH XPLODE late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_de_bleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			//type b black late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.8D, 1.45D, 0.0D});
			}
		};
	}
	public float[] getTrans() { return new float[]{-1.525F, 0.155F, 0F}; }

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}
}