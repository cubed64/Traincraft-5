//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: F3a
// Model Creator: Bidahochi
// Created on: 22.06.2020 - 11:10:51
// Last changed on: 22.06.2020 - 11:10:51

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelF3a_new extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelF3a_new() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[425];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 248, 148, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 215, 172, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 215, 180, textureX, textureY); // Box 1 coupler
		bodyModel[3] = new ModelRendererTurbo(this, 252, 105, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 252, 78, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 214, 83, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 214, 110, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 240, 180, textureX, textureY, "cull"); // Box 1 cull rear draft gear
		bodyModel[8] = new ModelRendererTurbo(this, 235, 193, textureX, textureY); // Box 1
		bodyModel[9] = new ModelRendererTurbo(this, 250, 193, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 369, 85, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 226, 24, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 223, 16, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 226, 10, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 227, 30, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 227, 5, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 228, 35, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 228, 2, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 357, 86, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 375, 94, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 49, 47, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 60, 39, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 74, 42, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 20, 47, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 73, 146, textureX, textureY); // Box 117
		bodyModel[26] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 118
		bodyModel[27] = new ModelRendererTurbo(this, 84, 47, textureX, textureY); // Box 129
		bodyModel[28] = new ModelRendererTurbo(this, 113, 38, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 239, 89, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 226, 75, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 239, 116, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 226, 102, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 81, 4, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 249, 46, textureX, textureY); // Box 0 dynamic fan large
		bodyModel[35] = new ModelRendererTurbo(this, 254, 223, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 45
		bodyModel[37] = new ModelRendererTurbo(this, 306, 211, textureX, textureY); // Box 50
		bodyModel[38] = new ModelRendererTurbo(this, 220, 233, textureX, textureY); // Box 324
		bodyModel[39] = new ModelRendererTurbo(this, 239, 209, textureX, textureY); // Box 139
		bodyModel[40] = new ModelRendererTurbo(this, 264, 231, textureX, textureY); // Box 140
		bodyModel[41] = new ModelRendererTurbo(this, 264, 237, textureX, textureY); // Box 141
		bodyModel[42] = new ModelRendererTurbo(this, 72, 179, textureX, textureY); // Box 151
		bodyModel[43] = new ModelRendererTurbo(this, 177, 47, textureX, textureY, "cull"); // Box 153 cull handrails
		bodyModel[44] = new ModelRendererTurbo(this, 162, 47, textureX, textureY, "cull"); // Box 154 cull handrails
		bodyModel[45] = new ModelRendererTurbo(this, 213, 103, textureX, textureY, "cull"); // Box 350 cull mirrors
		bodyModel[46] = new ModelRendererTurbo(this, 60, 73, textureX, textureY); // Box 299
		bodyModel[47] = new ModelRendererTurbo(this, 71, 73, textureX, textureY); // Box 300
		bodyModel[48] = new ModelRendererTurbo(this, 60, 70, textureX, textureY); // Box 301
		bodyModel[49] = new ModelRendererTurbo(this, 71, 70, textureX, textureY); // Box 302
		bodyModel[50] = new ModelRendererTurbo(this, 190, 47, textureX, textureY, "cull"); // Box 178 cull handrails
		bodyModel[51] = new ModelRendererTurbo(this, 149, 47, textureX, textureY, "cull"); // Box 180 cull handrails
		bodyModel[52] = new ModelRendererTurbo(this, 1, 174, textureX, textureY); // Box 183 CNW Gong
		bodyModel[53] = new ModelRendererTurbo(this, 313, 57, textureX, textureY, "cull"); // Box 186 winterization hatch cull
		bodyModel[54] = new ModelRendererTurbo(this, 472, 176, textureX, textureY); // Box 187 Steam/HEP gen exhaust
		bodyModel[55] = new ModelRendererTurbo(this, 491, 176, textureX, textureY); // Box 188 Steam/HEP gen exhaust
		bodyModel[56] = new ModelRendererTurbo(this, 203, 47, textureX, textureY, "cull"); // Box 199 cull handrails
		bodyModel[57] = new ModelRendererTurbo(this, 140, 47, textureX, textureY, "cull"); // Box 201 cull handrails
		bodyModel[58] = new ModelRendererTurbo(this, 364, 79, textureX, textureY); // Box 202
		bodyModel[59] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 203
		bodyModel[60] = new ModelRendererTurbo(this, 182, 6, textureX, textureY); // Box 131 cs an shit
		bodyModel[61] = new ModelRendererTurbo(this, 181, 10, textureX, textureY); // Box 131 cs ab shit
		bodyModel[62] = new ModelRendererTurbo(this, 166, 11, textureX, textureY); // Box 131 cs1
		bodyModel[63] = new ModelRendererTurbo(this, 157, 9, textureX, textureY); // Box 131 cs1
		bodyModel[64] = new ModelRendererTurbo(this, 152, 11, textureX, textureY); // Box 131 cs1
		bodyModel[65] = new ModelRendererTurbo(this, 157, 4, textureX, textureY); // Box 131 cs1
		bodyModel[66] = new ModelRendererTurbo(this, 371, 81, textureX, textureY); // Box 231
		bodyModel[67] = new ModelRendererTurbo(this, 405, 94, textureX, textureY, "lamp"); // Box 247 headlight rear left
		bodyModel[68] = new ModelRendererTurbo(this, 209, 182, textureX, textureY); // Box 222 mu hoses
		bodyModel[69] = new ModelRendererTurbo(this, 396, 160, textureX, textureY); // Box 438
		bodyModel[70] = new ModelRendererTurbo(this, 396, 160, textureX, textureY); // Box 439
		bodyModel[71] = new ModelRendererTurbo(this, 57, 160, textureX, textureY); // Box 278
		bodyModel[72] = new ModelRendererTurbo(this, 37, 165, textureX, textureY); // Box 280
		bodyModel[73] = new ModelRendererTurbo(this, 55, 126, textureX, textureY); // Box 282
		bodyModel[74] = new ModelRendererTurbo(this, 126, 21, textureX, textureY); // Box 293
		bodyModel[75] = new ModelRendererTurbo(this, 85, 160, textureX, textureY); // Box 294
		bodyModel[76] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Box 296
		bodyModel[77] = new ModelRendererTurbo(this, 20, 50, textureX, textureY); // Box 311
		bodyModel[78] = new ModelRendererTurbo(this, 218, 75, textureX, textureY); // Box 312
		bodyModel[79] = new ModelRendererTurbo(this, 60, 46, textureX, textureY); // Box 323
		bodyModel[80] = new ModelRendererTurbo(this, 73, 47, textureX, textureY); // Box 324
		bodyModel[81] = new ModelRendererTurbo(this, 84, 50, textureX, textureY); // Box 325
		bodyModel[82] = new ModelRendererTurbo(this, 218, 102, textureX, textureY); // Box 326
		bodyModel[83] = new ModelRendererTurbo(this, 36, 46, textureX, textureY); // Box 327
		bodyModel[84] = new ModelRendererTurbo(this, 25, 47, textureX, textureY); // Box 328
		bodyModel[85] = new ModelRendererTurbo(this, 36, 39, textureX, textureY); // Box 330
		bodyModel[86] = new ModelRendererTurbo(this, 26, 42, textureX, textureY); // Box 331
		bodyModel[87] = new ModelRendererTurbo(this, 85, 179, textureX, textureY); // Box 333
		bodyModel[88] = new ModelRendererTurbo(this, 71, 187, textureX, textureY); // Box 334
		bodyModel[89] = new ModelRendererTurbo(this, 253, 172, textureX, textureY); // Box 441
		bodyModel[90] = new ModelRendererTurbo(this, 14, 165, textureX, textureY); // Box 167
		bodyModel[91] = new ModelRendererTurbo(this, 23, 165, textureX, textureY); // Box 166
		bodyModel[92] = new ModelRendererTurbo(this, 23, 160, textureX, textureY); // Box 165
		bodyModel[93] = new ModelRendererTurbo(this, 10, 160, textureX, textureY); // Box 164
		bodyModel[94] = new ModelRendererTurbo(this, 172, 28, textureX, textureY); // Box 865
		bodyModel[95] = new ModelRendererTurbo(this, 100, 180, textureX, textureY); // Box 1296
		bodyModel[96] = new ModelRendererTurbo(this, 238, 102, textureX, textureY); // Box 329 door swing left cab
		bodyModel[97] = new ModelRendererTurbo(this, 209, 27, textureX, textureY); // Box 326
		bodyModel[98] = new ModelRendererTurbo(this, 210, 30, textureX, textureY); // Box 327
		bodyModel[99] = new ModelRendererTurbo(this, 210, 24, textureX, textureY); // Box 328
		bodyModel[100] = new ModelRendererTurbo(this, 320, 108, textureX, textureY); // Box 329 door swing left hood
		bodyModel[101] = new ModelRendererTurbo(this, 320, 81, textureX, textureY); // Box 332 door swing right hood
		bodyModel[102] = new ModelRendererTurbo(this, 332, 105, textureX, textureY); // Box 333
		bodyModel[103] = new ModelRendererTurbo(this, 332, 78, textureX, textureY); // Box 334
		bodyModel[104] = new ModelRendererTurbo(this, 320, 74, textureX, textureY); // Box 335
		bodyModel[105] = new ModelRendererTurbo(this, 320, 101, textureX, textureY); // Box 336
		bodyModel[106] = new ModelRendererTurbo(this, 320, 93, textureX, textureY); // Box 337
		bodyModel[107] = new ModelRendererTurbo(this, 320, 120, textureX, textureY); // Box 338
		bodyModel[108] = new ModelRendererTurbo(this, 100, 1, textureX, textureY); // Box 602
		bodyModel[109] = new ModelRendererTurbo(this, 108, 1, textureX, textureY); // Box 603
		bodyModel[110] = new ModelRendererTurbo(this, 92, 1, textureX, textureY); // Box 604
		bodyModel[111] = new ModelRendererTurbo(this, 136, 4, textureX, textureY); // Box 605
		bodyModel[112] = new ModelRendererTurbo(this, 116, 3, textureX, textureY); // Box 606
		bodyModel[113] = new ModelRendererTurbo(this, 62, 7, textureX, textureY); // Box 356
		bodyModel[114] = new ModelRendererTurbo(this, 73, 3, textureX, textureY); // Box 357
		bodyModel[115] = new ModelRendererTurbo(this, 61, 5, textureX, textureY); // Box 358
		bodyModel[116] = new ModelRendererTurbo(this, 125, 4, textureX, textureY); // Box 359
		bodyModel[117] = new ModelRendererTurbo(this, 172, 10, textureX, textureY); // Box 360 cs ab shit
		bodyModel[118] = new ModelRendererTurbo(this, 176, 19, textureX, textureY); // Box 361
		bodyModel[119] = new ModelRendererTurbo(this, 135, 30, textureX, textureY); // Box 362 watercooler
		bodyModel[120] = new ModelRendererTurbo(this, 8, 174, textureX, textureY, "lamp"); // Box 186 headlight 2beam top A
		bodyModel[121] = new ModelRendererTurbo(this, 8, 179, textureX, textureY, "lamp"); // Box 187 headlight 2beam top A
		bodyModel[122] = new ModelRendererTurbo(this, 31, 143, textureX, textureY); // Box 389
		bodyModel[123] = new ModelRendererTurbo(this, 30, 147, textureX, textureY); // Box 390
		bodyModel[124] = new ModelRendererTurbo(this, 21, 147, textureX, textureY); // Box 391
		bodyModel[125] = new ModelRendererTurbo(this, 22, 143, textureX, textureY); // Box 392
		bodyModel[126] = new ModelRendererTurbo(this, 7, 184, textureX, textureY, "lamp"); // Box 169 headlight big top
		bodyModel[127] = new ModelRendererTurbo(this, 13, 139, textureX, textureY, "lamp"); // Box 186 headlight 2beam bottom A
		bodyModel[128] = new ModelRendererTurbo(this, 13, 144, textureX, textureY, "lamp"); // Box 187 headlight 2beam bottom A
		bodyModel[129] = new ModelRendererTurbo(this, 12, 149, textureX, textureY, "lamp"); // Box 169 headlight big bottom
		bodyModel[130] = new ModelRendererTurbo(this, 30, 151, textureX, textureY, "lamp"); // Box 186 headlight 2beam bottom B
		bodyModel[131] = new ModelRendererTurbo(this, 21, 151, textureX, textureY, "lamp"); // Box 187 headlight 2beam bottom B
		bodyModel[132] = new ModelRendererTurbo(this, 23, 186, textureX, textureY, "lamp"); // Box 186 headlight 2beam top B
		bodyModel[133] = new ModelRendererTurbo(this, 16, 186, textureX, textureY, "lamp"); // Box 187 headlight 2beam top B
		bodyModel[134] = new ModelRendererTurbo(this, 4, 166, textureX, textureY); // Box 403 headlight cover
		bodyModel[135] = new ModelRendererTurbo(this, 9, 166, textureX, textureY); // Box 404 headlight cover
		bodyModel[136] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Box 405 headlight cover
		bodyModel[137] = new ModelRendererTurbo(this, 4, 169, textureX, textureY); // Box 406 headlight cover
		bodyModel[138] = new ModelRendererTurbo(this, 136, 24, textureX, textureY); // Box 407 watercooler
		bodyModel[139] = new ModelRendererTurbo(this, 118, 9, textureX, textureY); // Box 409
		bodyModel[140] = new ModelRendererTurbo(this, 100, 9, textureX, textureY); // Box 410
		bodyModel[141] = new ModelRendererTurbo(this, 107, 6, textureX, textureY); // Box 411
		bodyModel[142] = new ModelRendererTurbo(this, 61, 32, textureX, textureY); // Box 413
		bodyModel[143] = new ModelRendererTurbo(this, 37, 32, textureX, textureY); // Box 414
		bodyModel[144] = new ModelRendererTurbo(this, 50, 35, textureX, textureY); // Box 415
		bodyModel[145] = new ModelRendererTurbo(this, 74, 36, textureX, textureY); // Box 416
		bodyModel[146] = new ModelRendererTurbo(this, 26, 36, textureX, textureY); // Box 417
		bodyModel[147] = new ModelRendererTurbo(this, 405, 99, textureX, textureY, "lamp"); // Box 418 headlight rear right
		bodyModel[148] = new ModelRendererTurbo(this, 108, 182, textureX, textureY); // Box 424
		bodyModel[149] = new ModelRendererTurbo(this, 42, 182, textureX, textureY); // Box 425
		bodyModel[150] = new ModelRendererTurbo(this, 237, 54, textureX, textureY); // Box 439
		bodyModel[151] = new ModelRendererTurbo(this, 251, 101, textureX, textureY); // Box 440
		bodyModel[152] = new ModelRendererTurbo(this, 251, 74, textureX, textureY); // Box 441
		bodyModel[153] = new ModelRendererTurbo(this, 393, 86, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[154] = new ModelRendererTurbo(this, 272, 56, textureX, textureY); // Box 464 gn fuckshit cube
		bodyModel[155] = new ModelRendererTurbo(this, 237, 54, textureX, textureY); // Box 484
		bodyModel[156] = new ModelRendererTurbo(this, 417, 191, textureX, textureY); // Box 5
		bodyModel[157] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 6
		bodyModel[158] = new ModelRendererTurbo(this, 409, 229, textureX, textureY); // Box 10
		bodyModel[159] = new ModelRendererTurbo(this, 358, 242, textureX, textureY); // Box 13
		bodyModel[160] = new ModelRendererTurbo(this, 461, 229, textureX, textureY); // Box 14
		bodyModel[161] = new ModelRendererTurbo(this, 471, 243, textureX, textureY); // Box 9
		bodyModel[162] = new ModelRendererTurbo(this, 466, 238, textureX, textureY); // Box 21
		bodyModel[163] = new ModelRendererTurbo(this, 94, 35, textureX, textureY); // Box 13
		bodyModel[164] = new ModelRendererTurbo(this, 370, 217, textureX, textureY); // Box 10
		bodyModel[165] = new ModelRendererTurbo(this, 370, 217, textureX, textureY); // Box 10
		bodyModel[166] = new ModelRendererTurbo(this, 417, 184, textureX, textureY); // Box 7
		bodyModel[167] = new ModelRendererTurbo(this, 95, 38, textureX, textureY); // Box 513
		bodyModel[168] = new ModelRendererTurbo(this, 373, 246, textureX, textureY); // Box 522
		bodyModel[169] = new ModelRendererTurbo(this, 392, 218, textureX, textureY); // Box 523
		bodyModel[170] = new ModelRendererTurbo(this, 113, 127, textureX, textureY); // Box 538 nose mu plug
		bodyModel[171] = new ModelRendererTurbo(this, 32, 73, textureX, textureY); // Box 468 horn gn
		bodyModel[172] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 469 horn gn
		bodyModel[173] = new ModelRendererTurbo(this, 30, 70, textureX, textureY); // Box 470 horn gn
		bodyModel[174] = new ModelRendererTurbo(this, 32, 76, textureX, textureY); // Box 471 horn gn
		bodyModel[175] = new ModelRendererTurbo(this, 22, 125, textureX, textureY); // Box 403 headlight backpart
		bodyModel[176] = new ModelRendererTurbo(this, 31, 125, textureX, textureY); // Box 404 headlight backpart
		bodyModel[177] = new ModelRendererTurbo(this, 53, 63, textureX, textureY); // Box 404 she wheel on my antenna till i wagon
		bodyModel[178] = new ModelRendererTurbo(this, 40, 63, textureX, textureY); // Box 405 she wheel on my antenna till i wagon
		bodyModel[179] = new ModelRendererTurbo(this, 220, 192, textureX, textureY); // Box 429 front mu hose extender
		bodyModel[180] = new ModelRendererTurbo(this, 227, 192, textureX, textureY); // Box 430 front mu hose extender
		bodyModel[181] = new ModelRendererTurbo(this, 3, 155, textureX, textureY); // Box 431 headlight nose plate
		bodyModel[182] = new ModelRendererTurbo(this, 3, 155, textureX, textureY); // Box 432 headlight nose plate
		bodyModel[183] = new ModelRendererTurbo(this, 3, 160, textureX, textureY); // Box 433 nose plate
		bodyModel[184] = new ModelRendererTurbo(this, 288, 57, textureX, textureY, "cull"); // Box 186 winterization hatch cull tall
		bodyModel[185] = new ModelRendererTurbo(this, 444, 158, textureX, textureY, "cull"); // Box 522 atsf tall arrestor cull
		bodyModel[186] = new ModelRendererTurbo(this, 450, 152, textureX, textureY); // Box 523 atsf tall arrestor tip
		bodyModel[187] = new ModelRendererTurbo(this, 444, 158, textureX, textureY, "cull"); // Box 522 atsf tall arrestor cull
		bodyModel[188] = new ModelRendererTurbo(this, 450, 152, textureX, textureY); // Box 523 atsf tall arrestor tip
		bodyModel[189] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 412 cs2
		bodyModel[190] = new ModelRendererTurbo(this, 39, 8, textureX, textureY); // Box 413 cs2
		bodyModel[191] = new ModelRendererTurbo(this, 31, 1, textureX, textureY); // Box 86 cs2
		bodyModel[192] = new ModelRendererTurbo(this, 40, 16, textureX, textureY); // Box 531 cs2
		bodyModel[193] = new ModelRendererTurbo(this, 198, 208, textureX, textureY); // Box 342
		bodyModel[194] = new ModelRendererTurbo(this, 191, 208, textureX, textureY); // Box 343
		bodyModel[195] = new ModelRendererTurbo(this, 229, 208, textureX, textureY); // Box 345
		bodyModel[196] = new ModelRendererTurbo(this, 200, 211, textureX, textureY); // Box 456
		bodyModel[197] = new ModelRendererTurbo(this, 198, 215, textureX, textureY); // Box 458
		bodyModel[198] = new ModelRendererTurbo(this, 229, 215, textureX, textureY); // Box 459
		bodyModel[199] = new ModelRendererTurbo(this, 191, 215, textureX, textureY); // Box 461
		bodyModel[200] = new ModelRendererTurbo(this, 197, 211, textureX, textureY); // Box 462
		bodyModel[201] = new ModelRendererTurbo(this, 227, 211, textureX, textureY); // Box 463
		bodyModel[202] = new ModelRendererTurbo(this, 200, 218, textureX, textureY); // Box 464
		bodyModel[203] = new ModelRendererTurbo(this, 227, 218, textureX, textureY); // Box 465
		bodyModel[204] = new ModelRendererTurbo(this, 197, 218, textureX, textureY); // Box 466
		bodyModel[205] = new ModelRendererTurbo(this, 338, 209, textureX, textureY); // Box 46
		bodyModel[206] = new ModelRendererTurbo(this, 339, 220, textureX, textureY); // Box 48
		bodyModel[207] = new ModelRendererTurbo(this, 313, 220, textureX, textureY); // Box 99
		bodyModel[208] = new ModelRendererTurbo(this, 312, 209, textureX, textureY); // Box 95
		bodyModel[209] = new ModelRendererTurbo(this, 277, 213, textureX, textureY); // Box 96 air tank pipe
		bodyModel[210] = new ModelRendererTurbo(this, 282, 212, textureX, textureY); // Box 130
		bodyModel[211] = new ModelRendererTurbo(this, 283, 213, textureX, textureY); // Box 131
		bodyModel[212] = new ModelRendererTurbo(this, 283, 213, textureX, textureY); // Box 132
		bodyModel[213] = new ModelRendererTurbo(this, 46, 70, textureX, textureY, "cull"); // Box 483 cull horn mount gn
		bodyModel[214] = new ModelRendererTurbo(this, 112, 131, textureX, textureY); // Box 468 nose mu plug
		bodyModel[215] = new ModelRendererTurbo(this, 190, 11, textureX, textureY); // Box 474 cs1 gaugepannel
		bodyModel[216] = new ModelRendererTurbo(this, 199, -2, textureX, textureY); // Box 475 cs1 gaugepannel hd
		bodyModel[217] = new ModelRendererTurbo(this, 204, 16, textureX, textureY, "lamp"); // Box 591 speedoooo glowe
		bodyModel[218] = new ModelRendererTurbo(this, 220, 150, textureX, textureY); // Box 482
		bodyModel[219] = new ModelRendererTurbo(this, 243, 152, textureX, textureY); // Box 483
		bodyModel[220] = new ModelRendererTurbo(this, 230, 170, textureX, textureY); // Box 4
		bodyModel[221] = new ModelRendererTurbo(this, 232, 178, textureX, textureY); // Box 485
		bodyModel[222] = new ModelRendererTurbo(this, 252, 189, textureX, textureY); // Box 719
		bodyModel[223] = new ModelRendererTurbo(this, 397, 154, textureX, textureY); // Box 129
		bodyModel[224] = new ModelRendererTurbo(this, 397, 154, textureX, textureY); // Box 130
		bodyModel[225] = new ModelRendererTurbo(this, 392, 160, textureX, textureY); // Box 133
		bodyModel[226] = new ModelRendererTurbo(this, 392, 160, textureX, textureY); // Box 134
		bodyModel[227] = new ModelRendererTurbo(this, 397, 154, textureX, textureY); // Box 726
		bodyModel[228] = new ModelRendererTurbo(this, 393, 154, textureX, textureY); // Box 727
		bodyModel[229] = new ModelRendererTurbo(this, 393, 154, textureX, textureY); // Box 728
		bodyModel[230] = new ModelRendererTurbo(this, 397, 154, textureX, textureY); // Box 729
		bodyModel[231] = new ModelRendererTurbo(this, 392, 152, textureX, textureY); // Box 730
		bodyModel[232] = new ModelRendererTurbo(this, 392, 152, textureX, textureY); // Box 731
		bodyModel[233] = new ModelRendererTurbo(this, 359, 82, textureX, textureY); // Box 734
		bodyModel[234] = new ModelRendererTurbo(this, 377, 82, textureX, textureY); // Box 735
		bodyModel[235] = new ModelRendererTurbo(this, 403, 182, textureX, textureY); // Box 184 stack
		bodyModel[236] = new ModelRendererTurbo(this, 403, 182, textureX, textureY); // Box 185 stack
		bodyModel[237] = new ModelRendererTurbo(this, 218, 39, textureX, textureY, "cull"); // Box 501 cull pipe cooler gn thing
		bodyModel[238] = new ModelRendererTurbo(this, 255, 237, textureX, textureY); // Box 502 fuel filler no pannel
		bodyModel[239] = new ModelRendererTurbo(this, 255, 237, textureX, textureY); // Box 503 fuel filler no pannel
		bodyModel[240] = new ModelRendererTurbo(this, 295, 230, textureX, textureY); // Box 506
		bodyModel[241] = new ModelRendererTurbo(this, 3, 112, textureX, textureY); // Box 623 NJT GONG
		bodyModel[242] = new ModelRendererTurbo(this, 2, 117, textureX, textureY); // Box 624njt gong holder
		bodyModel[243] = new ModelRendererTurbo(this, 73, 231, textureX, textureY); // Box 419 pilot passenger
		bodyModel[244] = new ModelRendererTurbo(this, 424, 104, textureX, textureY); // Box 314
		bodyModel[245] = new ModelRendererTurbo(this, 440, 104, textureX, textureY); // Box 316
		bodyModel[246] = new ModelRendererTurbo(this, 425, 93, textureX, textureY); // Box 445
		bodyModel[247] = new ModelRendererTurbo(this, 422, 111, textureX, textureY); // Box 448
		bodyModel[248] = new ModelRendererTurbo(this, 436, 99, textureX, textureY); // Box 453
		bodyModel[249] = new ModelRendererTurbo(this, 424, 99, textureX, textureY); // Box 454
		bodyModel[250] = new ModelRendererTurbo(this, 419, 100, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[251] = new ModelRendererTurbo(this, 445, 100, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[252] = new ModelRendererTurbo(this, 450, 104, textureX, textureY); // Box 128
		bodyModel[253] = new ModelRendererTurbo(this, 412, 104, textureX, textureY); // Box 128
		bodyModel[254] = new ModelRendererTurbo(this, 445, 104, textureX, textureY); // Box 128
		bodyModel[255] = new ModelRendererTurbo(this, 419, 104, textureX, textureY); // Box 128
		bodyModel[256] = new ModelRendererTurbo(this, 426, 90, textureX, textureY); // Box 128
		bodyModel[257] = new ModelRendererTurbo(this, 423, 83, textureX, textureY); // Box 128
		bodyModel[258] = new ModelRendererTurbo(this, 435, 83, textureX, textureY); // Box 153
		bodyModel[259] = new ModelRendererTurbo(this, 431, 82, textureX, textureY); // Box 128
		bodyModel[260] = new ModelRendererTurbo(this, 423, 96, textureX, textureY); // Box 128
		bodyModel[261] = new ModelRendererTurbo(this, 431, 106, textureX, textureY); // Box 190 rear mu plug
		bodyModel[262] = new ModelRendererTurbo(this, 405, 89, textureX, textureY, "lamp"); // Box 670 headlight rear left up
		bodyModel[263] = new ModelRendererTurbo(this, 149, 60, textureX, textureY, "cull"); // Box 631 cull
		bodyModel[264] = new ModelRendererTurbo(this, 136, 55, textureX, textureY, "cull"); // Box 636 cull
		bodyModel[265] = new ModelRendererTurbo(this, 162, 65, textureX, textureY, "cull"); // Box 637 cull
		bodyModel[266] = new ModelRendererTurbo(this, 203, 55, textureX, textureY, "cull"); // Box 638 cull
		bodyModel[267] = new ModelRendererTurbo(this, 190, 60, textureX, textureY, "cull"); // Box 639 cull
		bodyModel[268] = new ModelRendererTurbo(this, 177, 65, textureX, textureY, "cull"); // Box 640 cull
		bodyModel[269] = new ModelRendererTurbo(this, 81, 134, textureX, textureY); // Box 760
		bodyModel[270] = new ModelRendererTurbo(this, 81, 126, textureX, textureY); // Box 768
		bodyModel[271] = new ModelRendererTurbo(this, 17, 174, textureX, textureY); // Box 103
		bodyModel[272] = new ModelRendererTurbo(this, 16, 170, textureX, textureY); // Box 103
		bodyModel[273] = new ModelRendererTurbo(this, 23, 170, textureX, textureY); // Box 103
		bodyModel[274] = new ModelRendererTurbo(this, 24, 174, textureX, textureY); // Box 103
		bodyModel[275] = new ModelRendererTurbo(this, 17, 178, textureX, textureY); // Box 103
		bodyModel[276] = new ModelRendererTurbo(this, 24, 178, textureX, textureY); // Box 103
		bodyModel[277] = new ModelRendererTurbo(this, 16, 182, textureX, textureY); // Box 103
		bodyModel[278] = new ModelRendererTurbo(this, 23, 182, textureX, textureY); // Box 103
		bodyModel[279] = new ModelRendererTurbo(this, 73, 140, textureX, textureY); // Box 781
		bodyModel[280] = new ModelRendererTurbo(this, 103, 23, textureX, textureY); // Box 782 dont forgor meee
		bodyModel[281] = new ModelRendererTurbo(this, 122, 119, textureX, textureY); // Box 111
		bodyModel[282] = new ModelRendererTurbo(this, 122, 116, textureX, textureY); // Box 144
		bodyModel[283] = new ModelRendererTurbo(this, 117, 119, textureX, textureY); // Box 111
		bodyModel[284] = new ModelRendererTurbo(this, 117, 116, textureX, textureY); // Box 144
		bodyModel[285] = new ModelRendererTurbo(this, 117, 113, textureX, textureY, "lamp"); // Box 123 Markerlight Early
		bodyModel[286] = new ModelRendererTurbo(this, 122, 113, textureX, textureY, "lamp"); // Box 144 numberboard early
		bodyModel[287] = new ModelRendererTurbo(this, 122, 113, textureX, textureY, "lamp"); // Box 111 numberboard early
		bodyModel[288] = new ModelRendererTurbo(this, 117, 113, textureX, textureY, "lamp"); // Box 453 Markerlight Early
		bodyModel[289] = new ModelRendererTurbo(this, 99, 122, textureX, textureY); // Box 468
		bodyModel[290] = new ModelRendererTurbo(this, 108, 118, textureX, textureY, "lamp"); // Box 469 numberboard
		bodyModel[291] = new ModelRendererTurbo(this, 112, 115, textureX, textureY, "lamp"); // Box 470 markerlight
		bodyModel[292] = new ModelRendererTurbo(this, 360, 88, textureX, textureY); // Box 815
		bodyModel[293] = new ModelRendererTurbo(this, 375, 88, textureX, textureY); // Box 816
		bodyModel[294] = new ModelRendererTurbo(this, 361, 94, textureX, textureY); // Box 817
		bodyModel[295] = new ModelRendererTurbo(this, 140, 67, textureX, textureY, "cull"); // Box 821 cull
		bodyModel[296] = new ModelRendererTurbo(this, 140, 63, textureX, textureY, "cull"); // Box 822 cull
		bodyModel[297] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 823
		bodyModel[298] = new ModelRendererTurbo(this, 108, 118, textureX, textureY, "lamp"); // Box 824 numberboard
		bodyModel[299] = new ModelRendererTurbo(this, 112, 115, textureX, textureY, "lamp"); // Box 825 markerlight
		bodyModel[300] = new ModelRendererTurbo(this, 55, 134, textureX, textureY); // Box 827
		bodyModel[301] = new ModelRendererTurbo(this, 238, 75, textureX, textureY); // Box 828 door swing right cab
		bodyModel[302] = new ModelRendererTurbo(this, 10, 125, textureX, textureY, "cull"); // Box 149 cull nose grabs
		bodyModel[303] = new ModelRendererTurbo(this, 3, 129, textureX, textureY, "cull"); // Box 818 cull lift lugs
		bodyModel[304] = new ModelRendererTurbo(this, 3, 125, textureX, textureY, "cull"); // Box 819 cull lift lugs
		bodyModel[305] = new ModelRendererTurbo(this, 44, 165, textureX, textureY); // Box 467
		bodyModel[306] = new ModelRendererTurbo(this, 40, 146, textureX, textureY); // Box 470
		bodyModel[307] = new ModelRendererTurbo(this, 100, 165, textureX, textureY); // Box 471
		bodyModel[308] = new ModelRendererTurbo(this, 100, 146, textureX, textureY); // Box 474
		bodyModel[309] = new ModelRendererTurbo(this, 45, 157, textureX, textureY); // Box 478
		bodyModel[310] = new ModelRendererTurbo(this, 99, 157, textureX, textureY); // Box 479
		bodyModel[311] = new ModelRendererTurbo(this, 58, 151, textureX, textureY); // Box 480
		bodyModel[312] = new ModelRendererTurbo(this, 84, 151, textureX, textureY); // Box 482
		bodyModel[313] = new ModelRendererTurbo(this, 101, 140, textureX, textureY); // Box 487
		bodyModel[314] = new ModelRendererTurbo(this, 41, 140, textureX, textureY); // Box 488
		bodyModel[315] = new ModelRendererTurbo(this, 101, 131, textureX, textureY); // Box 490
		bodyModel[316] = new ModelRendererTurbo(this, 41, 131, textureX, textureY); // Box 491
		bodyModel[317] = new ModelRendererTurbo(this, 213, 76, textureX, textureY, "cull"); // Box 493 cull mirrors
		bodyModel[318] = new ModelRendererTurbo(this, 203, 67, textureX, textureY, "cull"); // Box 494 cull
		bodyModel[319] = new ModelRendererTurbo(this, 203, 63, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[320] = new ModelRendererTurbo(this, 341, 39, textureX, textureY, "cull"); // Box 444 CULL f3a mesh grill
		bodyModel[321] = new ModelRendererTurbo(this, 342, 51, textureX, textureY); // Box 445 f3a mesh grill bottom
		bodyModel[322] = new ModelRendererTurbo(this, 317, 46, textureX, textureY); // Box 683 fan
		bodyModel[323] = new ModelRendererTurbo(this, 269, 49, textureX, textureY); // Box 450 fan
		bodyModel[324] = new ModelRendererTurbo(this, 285, 46, textureX, textureY); // Box 451 fan
		bodyModel[325] = new ModelRendererTurbo(this, 301, 49, textureX, textureY); // Box 452 fan
		bodyModel[326] = new ModelRendererTurbo(this, 341, 1, textureX, textureY, "cull"); // Box 455 CULL f3a mesh grill
		bodyModel[327] = new ModelRendererTurbo(this, 342, 13, textureX, textureY); // Box 456 f3a mesh grill bottom
		bodyModel[328] = new ModelRendererTurbo(this, 253, 39, textureX, textureY); // Box 457 dynamic fan small
		bodyModel[329] = new ModelRendererTurbo(this, 285, 39, textureX, textureY); // Box 458 f3a tall fan
		bodyModel[330] = new ModelRendererTurbo(this, 301, 42, textureX, textureY); // Box 459 f3a tall fan
		bodyModel[331] = new ModelRendererTurbo(this, 317, 39, textureX, textureY); // Box 460 f3a tall fan
		bodyModel[332] = new ModelRendererTurbo(this, 269, 42, textureX, textureY); // Box 461 f3a tall fan
		bodyModel[333] = new ModelRendererTurbo(this, 389, 225, textureX, textureY); // Box 298
		bodyModel[334] = new ModelRendererTurbo(this, 383, 233, textureX, textureY); // Box 299
		bodyModel[335] = new ModelRendererTurbo(this, 389, 248, textureX, textureY); // Box 300
		bodyModel[336] = new ModelRendererTurbo(this, 411, 241, textureX, textureY); // Box 465
		bodyModel[337] = new ModelRendererTurbo(this, 411, 214, textureX, textureY); // Box 466
		bodyModel[338] = new ModelRendererTurbo(this, 409, 198, textureX, textureY); // Box 467
		bodyModel[339] = new ModelRendererTurbo(this, 389, 200, textureX, textureY); // Box 468
		bodyModel[340] = new ModelRendererTurbo(this, 372, 225, textureX, textureY); // Box 469
		bodyModel[341] = new ModelRendererTurbo(this, 372, 225, textureX, textureY); // Box 470
		bodyModel[342] = new ModelRendererTurbo(this, 411, 228, textureX, textureY); // Box 471
		bodyModel[343] = new ModelRendererTurbo(this, 392, 194, textureX, textureY); // Box 472
		bodyModel[344] = new ModelRendererTurbo(this, 392, 194, textureX, textureY); // Box 473
		bodyModel[345] = new ModelRendererTurbo(this, 372, 231, textureX, textureY); // Box 474
		bodyModel[346] = new ModelRendererTurbo(this, 374, 240, textureX, textureY); // Box 0
		bodyModel[347] = new ModelRendererTurbo(this, 374, 240, textureX, textureY); // Box 0
		bodyModel[348] = new ModelRendererTurbo(this, 483, 229, textureX, textureY, "cull"); // Box 477 cull equipment rack
		bodyModel[349] = new ModelRendererTurbo(this, 491, 247, textureX, textureY); // Box 478
		bodyModel[350] = new ModelRendererTurbo(this, 491, 247, textureX, textureY); // Box 479
		bodyModel[351] = new ModelRendererTurbo(this, 484, 219, textureX, textureY); // Box 480 lube filter
		bodyModel[352] = new ModelRendererTurbo(this, 468, 211, textureX, textureY); // Box 481 engine water tank
		bodyModel[353] = new ModelRendererTurbo(this, 475, 232, textureX, textureY); // Box 482
		bodyModel[354] = new ModelRendererTurbo(this, 467, 189, textureX, textureY); // Box 0 Steam/HEP gen
		bodyModel[355] = new ModelRendererTurbo(this, 486, 189, textureX, textureY); // Box 485 Steam/HEP gen
		bodyModel[356] = new ModelRendererTurbo(this, 337, 229, textureX, textureY); // Box 429 dynamics internal
		bodyModel[357] = new ModelRendererTurbo(this, 71, 35, textureX, textureY); // Box 430
		bodyModel[358] = new ModelRendererTurbo(this, 57, 179, textureX, textureY); // Box 431
		bodyModel[359] = new ModelRendererTurbo(this, 44, 180, textureX, textureY); // Box 432
		bodyModel[360] = new ModelRendererTurbo(this, 84, 142, textureX, textureY); // Box 434
		bodyModel[361] = new ModelRendererTurbo(this, 58, 142, textureX, textureY); // Box 435
		bodyModel[362] = new ModelRendererTurbo(this, 239, 217, textureX, textureY); // Box 423
		bodyModel[363] = new ModelRendererTurbo(this, 239, 213, textureX, textureY); // Box 424
		bodyModel[364] = new ModelRendererTurbo(this, 31, 139, textureX, textureY); // Box 427
		bodyModel[365] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 428
		bodyModel[366] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Box 429
		bodyModel[367] = new ModelRendererTurbo(this, 22, 139, textureX, textureY); // Box 430
		bodyModel[368] = new ModelRendererTurbo(this, 22, 130, textureX, textureY); // Box 431
		bodyModel[369] = new ModelRendererTurbo(this, 31, 130, textureX, textureY); // Box 432
		bodyModel[370] = new ModelRendererTurbo(this, 72, 162, textureX, textureY); // Box 433
		bodyModel[371] = new ModelRendererTurbo(this, 341, 65, textureX, textureY); // Box 416 late grills
		bodyModel[372] = new ModelRendererTurbo(this, 341, 26, textureX, textureY); // Box 417 late grills
		bodyModel[373] = new ModelRendererTurbo(this, 53, 224, textureX, textureY); // Box 426 pilot snow
		bodyModel[374] = new ModelRendererTurbo(this, 40, 221, textureX, textureY); // Box 428 pilot snow
		bodyModel[375] = new ModelRendererTurbo(this, 57, 215, textureX, textureY); // Box 430 pilot snow
		bodyModel[376] = new ModelRendererTurbo(this, 53, 220, textureX, textureY); // Box 431 pilot snow
		bodyModel[377] = new ModelRendererTurbo(this, 50, 216, textureX, textureY, "cull"); // Box 432 pilot snow CULL
		bodyModel[378] = new ModelRendererTurbo(this, 79, 224, textureX, textureY); // Box 433 pilot snow
		bodyModel[379] = new ModelRendererTurbo(this, 104, 221, textureX, textureY); // Box 434 pilot snow
		bodyModel[380] = new ModelRendererTurbo(this, 79, 215, textureX, textureY); // Box 435 pilot snow
		bodyModel[381] = new ModelRendererTurbo(this, 79, 220, textureX, textureY); // Box 436 pilot snow
		bodyModel[382] = new ModelRendererTurbo(this, 100, 216, textureX, textureY, "cull"); // Box 437 pilot snow CULL
		bodyModel[383] = new ModelRendererTurbo(this, 58, 229, textureX, textureY); // Box 438 pilot passenger
		bodyModel[384] = new ModelRendererTurbo(this, 44, 232, textureX, textureY); // Box 448 pilot passenger
		bodyModel[385] = new ModelRendererTurbo(this, 47, 231, textureX, textureY, "cull"); // Box 451 pilot passenger CULL
		bodyModel[386] = new ModelRendererTurbo(this, 54, 231, textureX, textureY); // Box 452 pilot passenger
		bodyModel[387] = new ModelRendererTurbo(this, 84, 229, textureX, textureY); // Box 453 pilot passenger
		bodyModel[388] = new ModelRendererTurbo(this, 106, 232, textureX, textureY); // Box 454 pilot passenger
		bodyModel[389] = new ModelRendererTurbo(this, 99, 231, textureX, textureY, "cull"); // Box 455 pilot passenger CULL
		bodyModel[390] = new ModelRendererTurbo(this, 96, 231, textureX, textureY); // Box 456 pilot passenger
		bodyModel[391] = new ModelRendererTurbo(this, 107, 239, textureX, textureY, "cull"); // Box 458 pilot passenger CULL
		bodyModel[392] = new ModelRendererTurbo(this, 41, 239, textureX, textureY, "cull"); // Box 459 pilot passenger CULL
		bodyModel[393] = new ModelRendererTurbo(this, 72, 243, textureX, textureY); // Box 460 pilot passenger coupler cover
		bodyModel[394] = new ModelRendererTurbo(this, 73, 197, textureX, textureY); // Box 464 pilot norma
		bodyModel[395] = new ModelRendererTurbo(this, 62, 191, textureX, textureY); // Box 469 pilot norma
		bodyModel[396] = new ModelRendererTurbo(this, 44, 196, textureX, textureY); // Box 472 pilot norma
		bodyModel[397] = new ModelRendererTurbo(this, 63, 200, textureX, textureY); // Box 473 pilot norma
		bodyModel[398] = new ModelRendererTurbo(this, 56, 204, textureX, textureY); // Box 474 pilot norma
		bodyModel[399] = new ModelRendererTurbo(this, 47, 203, textureX, textureY); // Box 477 pilot norma
		bodyModel[400] = new ModelRendererTurbo(this, 88, 202, textureX, textureY, "cull"); // Box 480 pilot normal CULL
		bodyModel[401] = new ModelRendererTurbo(this, 49, 192, textureX, textureY); // Box 481 pilot norma
		bodyModel[402] = new ModelRendererTurbo(this, 80, 191, textureX, textureY); // Box 482 pilot norma
		bodyModel[403] = new ModelRendererTurbo(this, 108, 196, textureX, textureY); // Box 483 pilot norma
		bodyModel[404] = new ModelRendererTurbo(this, 79, 200, textureX, textureY); // Box 484 pilot norma
		bodyModel[405] = new ModelRendererTurbo(this, 94, 204, textureX, textureY); // Box 485 pilot norma
		bodyModel[406] = new ModelRendererTurbo(this, 101, 203, textureX, textureY); // Box 486 pilot norma
		bodyModel[407] = new ModelRendererTurbo(this, 95, 192, textureX, textureY); // Box 487 pilot norma
		bodyModel[408] = new ModelRendererTurbo(this, 62, 202, textureX, textureY, "cull"); // Box 488 pilot normal CULL
		bodyModel[409] = new ModelRendererTurbo(this, 462, 94, textureX, textureY); // Box 410
		bodyModel[410] = new ModelRendererTurbo(this, 462, 100, textureX, textureY); // Box 411
		bodyModel[411] = new ModelRendererTurbo(this, 463, 83, textureX, textureY); // Box 412
		bodyModel[412] = new ModelRendererTurbo(this, 463, 88, textureX, textureY); // Box 414
		bodyModel[413] = new ModelRendererTurbo(this, 463, 106, textureX, textureY); // Box 415
		bodyModel[414] = new ModelRendererTurbo(this, 461, 112, textureX, textureY); // Box 416 interior engine bit
		bodyModel[415] = new ModelRendererTurbo(this, 461, 112, textureX, textureY); // Box 417 interior engine bit
		bodyModel[416] = new ModelRendererTurbo(this, 227, 98, textureX, textureY); // Box 418 sandcap fill
		bodyModel[417] = new ModelRendererTurbo(this, 331, 101, textureX, textureY); // Box 419 sandcap fill
		bodyModel[418] = new ModelRendererTurbo(this, 405, 84, textureX, textureY, "lamp"); // Box 420 headlight rear very high
		bodyModel[419] = new ModelRendererTurbo(this, 255, 231, textureX, textureY); // Box 420 fuel filler with skirting
		bodyModel[420] = new ModelRendererTurbo(this, 255, 231, textureX, textureY); // Box 421 fuel filler with skirting
		bodyModel[421] = new ModelRendererTurbo(this, 1, 182, textureX, textureY, "lamp"); // Box 425 HEADLIGHT FULL TOP
		bodyModel[422] = new ModelRendererTurbo(this, 1, 188, textureX, textureY, "lamp"); // Box 426 HEADLIGHT FULL TOP
		bodyModel[423] = new ModelRendererTurbo(this, 1, 185, textureX, textureY, "lamp"); // Box 427 HEADLIGHT FULL TOP
		bodyModel[424] = new ModelRendererTurbo(this, 1, 179, textureX, textureY, "lamp"); // Box 428 HEADLIGHT FULL TOP

		bodyModel[0].addBox(0F, 0F, 0F, 59, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27.5F, 0F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(-35.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[2].setRotationPoint(31.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 32, 17, 1, 0F); // Box 0
		bodyModel[3].setRotationPoint(-11.5F, -15F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 32, 17, 1, 0F); // Box 0
		bodyModel[4].setRotationPoint(-11.5F, -15F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-25.5F, -10F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-25.5F, -10F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 1 cull rear draft gear
		bodyModel[7].setRotationPoint(31.5F, 2F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[8].setRotationPoint(31.5F, 2F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 1
		bodyModel[9].setRotationPoint(31.5F, 2F, 4F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 0
		bodyModel[10].setRotationPoint(31.5F, -16F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 51, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-19.5F, -19F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 52, 1, 6, 0F); // Box 0
		bodyModel[12].setRotationPoint(-19.5F, -19F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 51, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-19.5F, -19F, 3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-19.5F, -18.5F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-19.5F, -18.5F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-19.5F, -16F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(-19.5F, -16F, 10F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[18].setRotationPoint(31.5F, -18F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(31.5F, -18F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0.5F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-24F, -18F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(-21.5F, -19F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -1.75F, 0F, 1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0.75F, 0F, 1F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(-21.5F, -19F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -2.5F, 0F, 1F, -1.5F, 0F, 1F, 0.5F, 0F, -0.5F, -0.75F, 0F, -1F, 1.5F, 0F, 1F, 1.5F, 0F, 1F, -0.5F, 0F, -0.5F, -0.25F, 0F); // Box 0
		bodyModel[23].setRotationPoint(-21.5F, -18F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -1F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(-20.5F, -16F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-2F, -0.25F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[25].setRotationPoint(-30.25F, -14.5F, -2F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 118
		bodyModel[26].setRotationPoint(-27.25F, -14.5F, -2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 129
		bodyModel[27].setRotationPoint(-20.5F, -16F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-11.5F, -18F, -10F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 0
		bodyModel[29].setRotationPoint(-15.5F, -4F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[30].setRotationPoint(-19.5F, -15F, 10F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 0
		bodyModel[31].setRotationPoint(-15.5F, -4F, -11F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[32].setRotationPoint(-19.5F, -15F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Box 0
		bodyModel[33].setRotationPoint(-23F, -11.5F, -10F);

		bodyModel[34].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 0 dynamic fan large
		bodyModel[34].setRotationPoint(-9.5F, -20F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[35].setRotationPoint(0.5F, 4F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[36].setRotationPoint(-5F, 3.5F, -10.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[37].setRotationPoint(-5F, 3.5F, 9.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 2, 16, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[38].setRotationPoint(0.5F, 7F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[39].setRotationPoint(-4.5F, 2F, -8.5F);
		bodyModel[39].rotateAngleY = 1.57079633F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[40].setRotationPoint(4F, 1.5F, -10.45F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[41].setRotationPoint(4F, 1.5F, 9.45F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 151
		bodyModel[42].setRotationPoint(-34F, 1.03F, -2.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 153 cull handrails
		bodyModel[43].setRotationPoint(-16F, -14F, -11.75F);

		bodyModel[44].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 154 cull handrails
		bodyModel[44].setRotationPoint(-16F, -14F, 10.75F);

		bodyModel[45].addShapeBox(0F, -4F, -1F, 1, 4, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F); // Box 350 cull mirrors
		bodyModel[45].setRotationPoint(-19.5F, -11F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 299
		bodyModel[46].setRotationPoint(-17F, -20.5F, -5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[47].setRotationPoint(-17F, -19.5F, -5F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 301
		bodyModel[48].setRotationPoint(-17F, -20.5F, 4F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[49].setRotationPoint(-14F, -19.5F, 4F);

		bodyModel[50].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 178 cull handrails
		bodyModel[50].setRotationPoint(20F, -9F, -11.75F);

		bodyModel[51].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 180 cull handrails
		bodyModel[51].setRotationPoint(20F, -9F, 10.75F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 183 CNW Gong
		bodyModel[52].setRotationPoint(-32.25F, -13.5F, -1F);

		bodyModel[53].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 186 winterization hatch cull
		bodyModel[53].setRotationPoint(18.9F, -21F, -3F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 187 Steam/HEP gen exhaust
		bodyModel[54].setRotationPoint(27.5F, -20F, -3F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 188 Steam/HEP gen exhaust
		bodyModel[55].setRotationPoint(29F, -20F, 1F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 199 cull handrails
		bodyModel[56].setRotationPoint(29F, -4F, -11.75F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 201 cull handrails
		bodyModel[57].setRotationPoint(29F, -4F, 10.75F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 202
		bodyModel[58].setRotationPoint(32.5F, -19F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[59].setRotationPoint(32.5F, -19F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 131 cs an shit
		bodyModel[60].setRotationPoint(-21F, -12.5F, 6.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 131 cs ab shit
		bodyModel[61].setRotationPoint(-21.5F, -11.5F, 7.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 131 cs1
		bodyModel[62].setRotationPoint(-19F, -10.5F, 1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 cs1
		bodyModel[63].setRotationPoint(-20F, -10.5F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 131 cs1
		bodyModel[64].setRotationPoint(-21F, -10.5F, 1F);

		bodyModel[65].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,-0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F); // Box 131 cs1
		bodyModel[65].setRotationPoint(-19.5F, -12.5F, 1.5F);
		bodyModel[65].rotateAngleY = -0.78539816F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 231
		bodyModel[66].setRotationPoint(32.5F, -19F, 3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear left
		bodyModel[67].setRotationPoint(32F, -8.5F, -9F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 5, 20, 0F); // Box 222 mu hoses
		bodyModel[68].setRotationPoint(32.51F, 2F, -10F);

		bodyModel[69].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 438
		bodyModel[69].setRotationPoint(18F, 2.5F, -2F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 439
		bodyModel[70].setRotationPoint(-18.5F, 2.5F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 278
		bodyModel[71].setRotationPoint(-30.5F, -10F, 2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[72].setRotationPoint(-27.5F, -10F, 10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -4F, 1.5F, 0F); // Box 282
		bodyModel[73].setRotationPoint(-27.25F, -14.5F, 2F);

		bodyModel[74].addBox(0F, 0F, 0F, 12, 4, 20, 0F); // Box 293
		bodyModel[74].setRotationPoint(-22.5F, -4F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 294
		bodyModel[75].setRotationPoint(-30.5F, -10F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[76].setRotationPoint(-27.5F, -10F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-2.5F, 0.5F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0.25F, 1F, 0F, -0.25F, 1F, 0F, 0.25F, 1F, 0F, -1.25F, 1F, 0F); // Box 311
		bodyModel[77].setRotationPoint(-23F, -15F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 312
		bodyModel[78].setRotationPoint(-22F, -15F, 10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-3F, 0.25F, 0F, 3.25F, 0.5F, 0F, 2.5F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0.5F, 0F, -0.25F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F); // Box 323
		bodyModel[79].setRotationPoint(-24F, -17F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-3.5F, -1F, 0F, 3.5F, -1F, 0F, 3.25F, 1F, -1F, -3F, 0.75F, -1F, -1F, 2F, 0F, 1F, 2F, 0F, -0.25F, 0.5F, -1F, 0F, 0F, -1F); // Box 324
		bodyModel[80].setRotationPoint(-24F, -16.5F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -1.25F, 1F, 0F, 0.25F, 1F, 0F, -0.25F, 1F, 0F, 0.25F, 1F, 0F); // Box 325
		bodyModel[81].setRotationPoint(-23F, -15F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 326
		bodyModel[82].setRotationPoint(-22F, -15F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-2.5F, 1F, 0F, 2.5F, 1F, 0F, 3.25F, 0.5F, 0F, -3F, 0.25F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 1F, 0F, 0F, 0.5F, 0F); // Box 327
		bodyModel[83].setRotationPoint(-24F, -17F, 2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-3F, 0.75F, 0F, 3.25F, 1F, 0F, 3.5F, -1F, -1F, -3.5F, -1F, -1F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, 1F, 2F, -1F, -1F, 2F, -1F); // Box 328
		bodyModel[84].setRotationPoint(-24F, -16.5F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, -1.75F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.5F, 0F, -0.5F, 0.75F, 0F); // Box 330
		bodyModel[85].setRotationPoint(-21.5F, -19F, 2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.75F, 0F, 1F, 0.5F, 0F, 1F, -1.5F, 0F, -1F, -2.5F, 0F, -0.5F, -0.25F, 0F, 1F, -0.5F, 0F, 1F, 1.5F, 0F, -1F, 1.5F, 0F); // Box 331
		bodyModel[86].setRotationPoint(-21.5F, -18F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 2F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 333
		bodyModel[87].setRotationPoint(-33.5F, 1.5F, -8F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 334
		bodyModel[88].setRotationPoint(-33.5F, 2F, -2F);

		bodyModel[89].addBox(0F, 0F, 0F, 62, 2, 12, 0F); // Box 441
		bodyModel[89].setRotationPoint(-30.5F, 0.75F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F); // Box 167
		bodyModel[90].setRotationPoint(-31F, -12.5F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 166
		bodyModel[91].setRotationPoint(-31F, -12.5F, -2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[92].setRotationPoint(-31F, -14.5F, -2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[93].setRotationPoint(-31F, -14.5F, 0F);

		bodyModel[94].addBox(0F, 0F, 0F, 7, 2, 9, 0F); // Box 865
		bodyModel[94].setRotationPoint(-22.5F, -5.5F, 1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-4F, 0F, -2F, 3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, -2F, 3F, -4F, -3F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 1296
		bodyModel[95].setRotationPoint(-31.5F, 1.5F, -13F);

		bodyModel[96].addShapeBox(-4.5F, 0F, -0.5F, 5, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left cab
		bodyModel[96].setRotationPoint(-11.5F, -15F, -10.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 326
		bodyModel[97].setRotationPoint(-19F, -19F, -3F);
		bodyModel[97].rotateAngleY = 1.57079633F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, -0.5F); // Box 327
		bodyModel[98].setRotationPoint(-19F, -19F, -7F);
		bodyModel[98].rotateAngleY = 1.57079633F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F); // Box 328
		bodyModel[99].setRotationPoint(-19F, -19F, 2F);
		bodyModel[99].rotateAngleY = 1.57079633F;

		bodyModel[100].addShapeBox(-3.5F, 0F, -0.5F, 4, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left hood
		bodyModel[100].setRotationPoint(24F, -10F, -10.5F);

		bodyModel[101].addShapeBox(-3.5F, 0F, -0.5F, 4, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right hood
		bodyModel[101].setRotationPoint(24F, -10F, 10.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 8, 17, 1, 0F); // Box 333
		bodyModel[102].setRotationPoint(24.5F, -15F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 8, 17, 1, 0F); // Box 334
		bodyModel[103].setRotationPoint(24.5F, -15F, 10F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 335
		bodyModel[104].setRotationPoint(20.5F, -15F, 10F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 336
		bodyModel[105].setRotationPoint(20.5F, -15F, -11F);

		bodyModel[106].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 337
		bodyModel[106].setRotationPoint(20.5F, 0F, 10F);

		bodyModel[107].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 338
		bodyModel[107].setRotationPoint(20.5F, 0F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[108].setRotationPoint(-23F, -12.5F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[109].setRotationPoint(-23F, -12.5F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[110].setRotationPoint(-23F, -13.5F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[111].setRotationPoint(-23F, -13.5F, 2F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[112].setRotationPoint(-25F, -13.5F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[113].setRotationPoint(-22F, -10.5F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[114].setRotationPoint(-22F, -13.5F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 358
		bodyModel[115].setRotationPoint(-22F, -12.5F, -10F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Box 359
		bodyModel[116].setRotationPoint(-23F, -11.5F, 2F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 360 cs ab shit
		bodyModel[117].setRotationPoint(-22F, -10.5F, 4F);

		bodyModel[118].addBox(0F, 0F, 0F, 7, 2, 5, 0F); // Box 361
		bodyModel[118].setRotationPoint(-22.5F, -5.5F, -10F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 362 watercooler
		bodyModel[119].setRotationPoint(-20.5F, -10F, -5F);

		bodyModel[120].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top A
		bodyModel[120].setRotationPoint(-31.3F, -12.5F, 0F);

		bodyModel[121].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top A
		bodyModel[121].setRotationPoint(-31.3F, -12.5F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 389
		bodyModel[122].setRotationPoint(-33F, -6F, -2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, -0.5F, -0.35F, -0.65F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[123].setRotationPoint(-33F, -5F, -2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 391
		bodyModel[124].setRotationPoint(-33F, -5F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, -0.5F, -0.65F, -0.35F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 392
		bodyModel[125].setRotationPoint(-33F, -6F, 1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight big top
		bodyModel[126].setRotationPoint(-31.3F, -13.75F, -1.25F);

		bodyModel[127].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam bottom A
		bodyModel[127].setRotationPoint(-32.5F, -6F, 0F);

		bodyModel[128].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam bottom A
		bodyModel[128].setRotationPoint(-32.5F, -6F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight big bottom
		bodyModel[129].setRotationPoint(-32.5F, -7.25F, -1.25F);

		bodyModel[130].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam bottom B
		bodyModel[130].setRotationPoint(-32.5F, -6F, 0F);
		bodyModel[130].rotateAngleX = 1.57079633F;

		bodyModel[131].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam bottom B
		bodyModel[131].setRotationPoint(-32.5F, -6F, 0F);
		bodyModel[131].rotateAngleX = 1.57079633F;

		bodyModel[132].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top B
		bodyModel[132].setRotationPoint(-31.3F, -12.5F, 0F);
		bodyModel[132].rotateAngleX = 1.57079633F;

		bodyModel[133].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top B
		bodyModel[133].setRotationPoint(-31.3F, -12.5F, 0F);
		bodyModel[133].rotateAngleX = 1.57079633F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403 headlight cover
		bodyModel[134].setRotationPoint(-31.76F, -14.5F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404 headlight cover
		bodyModel[135].setRotationPoint(-31.76F, -14.5F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405 headlight cover
		bodyModel[136].setRotationPoint(-31.76F, -12.5F, -2F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406 headlight cover
		bodyModel[137].setRotationPoint(-31.76F, -12.5F, 0F);

		bodyModel[138].addShapeBox(-1F, 0F, -1F, 2, 3, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 407 watercooler
		bodyModel[138].setRotationPoint(-19.5F, -13F, -4F);
		bodyModel[138].rotateAngleY = -0.78539816F;

		bodyModel[139].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Box 409
		bodyModel[139].setRotationPoint(-25F, -13.5F, 2F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Box 410
		bodyModel[140].setRotationPoint(-25F, -13.5F, -3F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 411
		bodyModel[141].setRotationPoint(-25F, -13.5F, -2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F); // Box 413
		bodyModel[142].setRotationPoint(-19.5F, -19F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[143].setRotationPoint(-19.5F, -19F, 2F);

		bodyModel[144].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 415
		bodyModel[144].setRotationPoint(-20F, -19.75F, -2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 416
		bodyModel[145].setRotationPoint(-19.5F, -17.25F, -10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[146].setRotationPoint(-19.5F, -17.25F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 418 headlight rear right
		bodyModel[147].setRotationPoint(32F, -8.5F, 7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[148].setRotationPoint(-27.5F, 1.5F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[149].setRotationPoint(-27.5F, 1.5F, 10F);

		bodyModel[150].addBox(0F, 0F, 0F, 3, 0, 23, 0F); // Box 439
		bodyModel[150].setRotationPoint(-15F, 1F, -11.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 440
		bodyModel[151].setRotationPoint(-15F, -4.01F, -11.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 441
		bodyModel[152].setRotationPoint(-15F, -4.01F, 10.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 13, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[153].setRotationPoint(32F, -12F, -2F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 464 gn fuckshit cube
		bodyModel[154].setRotationPoint(-2.5F, -20F, -5F);

		bodyModel[155].addBox(0F, 0F, 0F, 3, 0, 23, 0F); // Box 484
		bodyModel[155].setRotationPoint(-15F, -1.5F, -11.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[156].setRotationPoint(1.5F, -14F, -6F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[157].setRotationPoint(1.5F, -14F, 2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 10
		bodyModel[158].setRotationPoint(0.5F, -16F, -2F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 7, 6, 0F); // Box 13
		bodyModel[159].setRotationPoint(0.5F, -10F, -3F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[160].setRotationPoint(20.5F, -5F, -6F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[161].setRotationPoint(20.5F, -12F, -4F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[162].setRotationPoint(20.5F, -8F, -2F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 18, 12, 0F); // Box 13
		bodyModel[163].setRotationPoint(-12.5F, -18F, -6F);

		bodyModel[164].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 10
		bodyModel[164].setRotationPoint(-4.5F, -13F, 2F);

		bodyModel[165].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 10
		bodyModel[165].setRotationPoint(-4.5F, -13F, -6F);

		bodyModel[166].addBox(0F, 0F, 0F, 19, 2, 4, 0F); // Box 7
		bodyModel[166].setRotationPoint(1.5F, -14F, -2F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[167].setRotationPoint(-11.5F, -18F, 6F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[168].setRotationPoint(-8.5F, -6F, -1.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 523
		bodyModel[169].setRotationPoint(-3.5F, -12F, -1.5F);

		bodyModel[170].addBox(-0.5F, -0.5F, -0.5F, 2, 2, 1, 0F); // Box 538 nose mu plug
		bodyModel[170].setRotationPoint(-30F, -12.4F, -3.25F);

		bodyModel[171].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 468 horn gn
		bodyModel[171].setRotationPoint(1F, -22F, -0.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 469 horn gn
		bodyModel[172].setRotationPoint(2F, -21F, -0.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 470 horn gn
		bodyModel[173].setRotationPoint(-1F, -22F, 0.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 471 horn gn
		bodyModel[174].setRotationPoint(0F, -22F, -1.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403 headlight backpart
		bodyModel[175].setRotationPoint(-32.25F, -8F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404 headlight backpart
		bodyModel[176].setRotationPoint(-32.25F, -8F, -2F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 404 she wheel on my antenna till i wagon
		bodyModel[177].setRotationPoint(-11F, -23F, 0F);

		bodyModel[178].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 405 she wheel on my antenna till i wagon
		bodyModel[178].setRotationPoint(-12.5F, -21F, -2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.875F, 0F, 0F, -0.875F, 0F, 0F); // Box 429 front mu hose extender
		bodyModel[179].setRotationPoint(-32.84F, 2.5F, 4F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, 0.875F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 430 front mu hose extender
		bodyModel[180].setRotationPoint(-32.84F, 2.5F, -7F);

		bodyModel[181].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 431 headlight nose plate
		bodyModel[181].setRotationPoint(-32.1F, -12.55F, 0F);

		bodyModel[182].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 432 headlight nose plate
		bodyModel[182].setRotationPoint(-32.1F, -12.45F, 0F);

		bodyModel[183].addShapeBox(0F, -1.85F, -1F, 1, 4, 2, 0F,0F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 433 nose plate
		bodyModel[183].setRotationPoint(-31.9F, -12.5F, 0F);

		bodyModel[184].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 186 winterization hatch cull tall
		bodyModel[184].setRotationPoint(18.9F, -23F, -3F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 atsf tall arrestor cull
		bodyModel[185].setRotationPoint(4.5F, -23F, -2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523 atsf tall arrestor tip
		bodyModel[186].setRotationPoint(4.5F, -24F, -2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 atsf tall arrestor cull
		bodyModel[187].setRotationPoint(17F, -23F, -2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523 atsf tall arrestor tip
		bodyModel[188].setRotationPoint(17F, -24F, -2F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs2
		bodyModel[189].setRotationPoint(-15.8F, -14F, -0.0500000000000003F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs2
		bodyModel[190].setRotationPoint(-22.5F, -12F, 1.95F);
		bodyModel[190].rotateAngleY = -0.45378561F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs2
		bodyModel[191].setRotationPoint(-22.5F, -14F, 1.95F);
		bodyModel[191].rotateAngleY = -0.45378561F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs2
		bodyModel[192].setRotationPoint(-22.5F, -8F, 1.95F);
		bodyModel[192].rotateAngleY = -0.45378561F;

		bodyModel[193].addShapeBox(0F, 0F, 0F, 15, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[193].setRotationPoint(-5.5F, 2F, -10.75F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 343
		bodyModel[194].setRotationPoint(-8.5F, 2F, -10.75F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[195].setRotationPoint(9.5F, 2F, -10.75F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 456
		bodyModel[196].setRotationPoint(-4.5F, 4F, -10.75F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 15, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[197].setRotationPoint(-5.5F, 2F, 10.75F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[198].setRotationPoint(9.5F, 2F, 10.75F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 461
		bodyModel[199].setRotationPoint(-8.5F, 2F, 10.75F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Box 462
		bodyModel[200].setRotationPoint(-6F, 4F, -10.75F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F); // Box 463
		bodyModel[201].setRotationPoint(9F, 4F, -10.75F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 464
		bodyModel[202].setRotationPoint(-4.5F, 4F, 10.75F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F); // Box 465
		bodyModel[203].setRotationPoint(-6F, 4F, 10.75F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F); // Box 466
		bodyModel[204].setRotationPoint(9F, 4F, 10.75F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[205].setRotationPoint(-5F, 3.5F, -9.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 48
		bodyModel[206].setRotationPoint(-5F, 6.5F, -8.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 99
		bodyModel[207].setRotationPoint(-5F, 6.5F, 2.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[208].setRotationPoint(-5F, 3.5F, 2.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 96 air tank pipe
		bodyModel[209].setRotationPoint(-6F, 2F, -0.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 130
		bodyModel[210].setRotationPoint(-5F, 4F, -1F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[211].setRotationPoint(-5F, 5F, -2F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[212].setRotationPoint(-5F, 5F, 1F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 3F); // Box 483 cull horn mount gn
		bodyModel[213].setRotationPoint(1.5F, -20.5F, -2F);

		bodyModel[214].addShapeBox(-0.5F, -0.5F, -0.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 468 nose mu plug
		bodyModel[214].setRotationPoint(-30.35F, -11.75F, 3.5F);

		bodyModel[215].addShapeBox(0F, -2F, 0F, 1, 2, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474 cs1 gaugepannel
		bodyModel[215].setRotationPoint(-22.75F, -10.75F, 3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 0, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, -3F, -5F); // Box 475 cs1 gaugepannel hd
		bodyModel[216].setRotationPoint(-21.73F, -13.75F, 3F);

		bodyModel[217].addShapeBox(0F, 0F, 1F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 591 speedoooo glowe
		bodyModel[217].setRotationPoint(-23.1F, -14.5F, 2.25F);
		bodyModel[217].rotateAngleY = -1.23918377F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 482
		bodyModel[218].setRotationPoint(-30.5F, 0F, -8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.75F, 0F, -1.125F, 0F, 0F, 1.875F, 0F, 0F, 1.875F, 0.75F, 0F, -1.125F, 0.75F, 0F, -1.125F, 0F, 0F, 1.875F, 0F, 0F, 1.875F, 0.75F, 0F, -1.125F); // Box 483
		bodyModel[219].setRotationPoint(-31.5F, 0F, -5.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[220].setRotationPoint(-32F, 2.5F, -2F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 485
		bodyModel[221].setRotationPoint(28.5F, 2.5F, -2F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 62, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 719
		bodyModel[222].setRotationPoint(-30.5F, 2.75F, -6.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[223].setRotationPoint(-18F, 1.75F, -10.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[224].setRotationPoint(-18F, 1.75F, 6.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 133
		bodyModel[225].setRotationPoint(-17F, 2F, -11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 134
		bodyModel[226].setRotationPoint(-17F, 2F, 9F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[227].setRotationPoint(18.5F, 1.75F, -10.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 727
		bodyModel[228].setRotationPoint(19.5F, 2F, -10.95F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 728
		bodyModel[229].setRotationPoint(19.5F, 2F, 8.95F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 729
		bodyModel[230].setRotationPoint(18.5F, 1.75F, 6.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		bodyModel[231].setRotationPoint(-18F, 0.75F, -10.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		bodyModel[232].setRotationPoint(18.5F, 0.75F, -10.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[233].setRotationPoint(32.5F, -18.5F, -10F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 2F, 0F); // Box 735
		bodyModel[234].setRotationPoint(32.5F, -18.5F, 7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,-0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F); // Box 184 stack
		bodyModel[235].setRotationPoint(4.5F, -20.75F, -1.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,-0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F); // Box 185 stack
		bodyModel[236].setRotationPoint(17F, -20.75F, -1.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F); // Box 501 cull pipe cooler gn thing
		bodyModel[237].setRotationPoint(-8F, -21F, -3F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 502 fuel filler no pannel
		bodyModel[238].setRotationPoint(5F, 3F, 7.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 503 fuel filler no pannel
		bodyModel[239].setRotationPoint(5F, 3F, -10.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 8, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 506
		bodyModel[240].setRotationPoint(0.5F, 3.25F, -9F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 623 NJT GONG
		bodyModel[241].setRotationPoint(-33.75F, -2.5F, -1F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 624njt gong holder
		bodyModel[242].setRotationPoint(-33.25F, -3F, -1.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 419 pilot passenger
		bodyModel[243].setRotationPoint(-34.5F, 2.5F, -2F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 314
		bodyModel[244].setRotationPoint(32.5F, -14F, -4F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 316
		bodyModel[245].setRotationPoint(32.5F, -14F, 3F);

		bodyModel[246].addBox(0F, 0F, -1F, 8, 1, 1, 0F); // Box 445
		bodyModel[246].setRotationPoint(32.5F, -15F, -4F);
		bodyModel[246].rotateAngleY = 1.57079633F;

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 448
		bodyModel[247].setRotationPoint(32.5F, 1F, -5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[248].setRotationPoint(32.5F, -14F, 0F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 454
		bodyModel[249].setRotationPoint(32.5F, -14F, -3F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 128 weird lifting lugs
		bodyModel[250].setRotationPoint(32.5F, -17F, -4F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[251].setRotationPoint(32.5F, -17F, 3F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[252].setRotationPoint(34F, -13F, 3F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[253].setRotationPoint(34F, -13F, -5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[254].setRotationPoint(33.5F, -14F, 3F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[255].setRotationPoint(33.5F, -14F, -3.5F);

		bodyModel[256].addShapeBox(0F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[256].setRotationPoint(33.5F, -14.5F, -3.5F);
		bodyModel[256].rotateAngleY = 1.57079633F;

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[257].setRotationPoint(34F, -16F, -5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[258].setRotationPoint(34F, -16F, 1F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[259].setRotationPoint(34F, -16F, -1F);

		bodyModel[260].addShapeBox(0F, 0F, -1F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[260].setRotationPoint(34F, -14F, -5F);
		bodyModel[260].rotateAngleY = 1.57079633F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 rear mu plug
		bodyModel[261].setRotationPoint(32.5F, -14F, -2F);
		bodyModel[261].rotateAngleZ = -0.27925268F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 670 headlight rear left up
		bodyModel[262].setRotationPoint(32F, -10.5F, -9F);

		bodyModel[263].addShapeBox(0F, 0F, -1F, 5, 6, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, -0.5F, -1.25F, -1.25F, -0.5F, -1.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 631 cull
		bodyModel[263].setRotationPoint(20.5F, 2F, 11F);

		bodyModel[264].addShapeBox(0F, 0F, -1F, 5, 6, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, -0.5F, -1.25F, -1.25F, -0.5F, -1.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 636 cull
		bodyModel[264].setRotationPoint(28.5F, 2F, 11F);

		bodyModel[265].addShapeBox(0F, 0F, -1F, 5, 6, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, -0.5F, -1.25F, -1.25F, -0.5F, -1.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 637 cull
		bodyModel[265].setRotationPoint(-15.5F, 2F, 11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Box 638 cull
		bodyModel[266].setRotationPoint(28.5F, 2F, -11F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Box 639 cull
		bodyModel[267].setRotationPoint(20.5F, 2F, -11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Box 640 cull
		bodyModel[268].setRotationPoint(-15.5F, 2F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,1F, -3F, 0F, 0F, -1.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, 1.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[269].setRotationPoint(-27.25F, -14.5F, -8F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-4F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
		bodyModel[270].setRotationPoint(-27.25F, -14.5F, -8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, -0.25F, -0.65F, -0.35F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[271].setRotationPoint(-31.75F, -14.5F, 1F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[272].setRotationPoint(-31.75F, -14.5F, 0F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, -0.25F, -0.35F, -0.65F, -0.25F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[273].setRotationPoint(-31.75F, -14.5F, -2F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[274].setRotationPoint(-31.75F, -14.5F, -2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, -0.5F, -0.65F, -0.35F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[275].setRotationPoint(-31.75F, -12.5F, 1F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[276].setRotationPoint(-31.75F, -12.5F, -2F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[277].setRotationPoint(-31.75F, -11.5F, 0F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, -0.5F, -0.35F, -0.65F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[278].setRotationPoint(-31.75F, -11.5F, -2F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 781
		bodyModel[279].setRotationPoint(-23.25F, -14.5F, -2F);

		bodyModel[280].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 782 dont forgor meee
		bodyModel[280].setRotationPoint(-25F, -1.5F, -3F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 111
		bodyModel[281].setRotationPoint(-26.25F, -8.25F, -11.25F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 144
		bodyModel[282].setRotationPoint(-26.25F, -8.25F, 10.25F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.75F); // Box 111
		bodyModel[283].setRotationPoint(-27.25F, -8.25F, -11.25F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F); // Box 144
		bodyModel[284].setRotationPoint(-27.25F, -8.25F, 10.25F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 123 Markerlight Early
		bodyModel[285].setRotationPoint(-26.65F, -8F, 9.9F);
		bodyModel[285].rotateAngleY = 0.64577182F;

		bodyModel[286].addShapeBox(0F, 0F, -5F, 3, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 144 numberboard early
		bodyModel[286].setRotationPoint(-26.25F, -8F, 15.3F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 111 numberboard early
		bodyModel[287].setRotationPoint(-26.25F, -8F, -11.3F);

		bodyModel[288].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 453 Markerlight Early
		bodyModel[288].setRotationPoint(-26.65F, -8F, -9.9F);
		bodyModel[288].rotateAngleY = -0.64577182F;

		bodyModel[289].addShapeBox(0F, 0F, -1F, 1, 2, 5, 0F,0F, 0.125F, 0.125F, 0.225F, 0.25F, 0.375F, 0.225F, 0.25F, 0.375F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.1F, 0.25F, 0.375F, 0.1F, 0.25F, 0.375F, 0F, 0.125F, 0.125F); // Box 468
		bodyModel[289].setRotationPoint(-28.25F, -8.5F, -10.25F);
		bodyModel[289].rotateAngleY = 0.73303829F;

		bodyModel[290].addShapeBox(0F, 0F, -1F, 1, 2, 5, 0F,0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F); // Box 469 numberboard
		bodyModel[290].setRotationPoint(-28.25F, -8.5F, -10.25F);
		bodyModel[290].rotateAngleY = 0.73303829F;

		bodyModel[291].addShapeBox(0.6F, -1.5F, 1.25F, 1, 1, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 470 markerlight
		bodyModel[291].setRotationPoint(-28.25F, -8.5F, -10.5F);
		bodyModel[291].rotateAngleY = 0.73303829F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815
		bodyModel[292].setRotationPoint(31.5F, -19F, -7F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 816
		bodyModel[293].setRotationPoint(31.5F, -19F, 3F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 817
		bodyModel[294].setRotationPoint(31.5F, -18F, -10F);

		bodyModel[295].addShapeBox(0F, 0F, -1F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 821 cull
		bodyModel[295].setRotationPoint(-25.5F, 4F, 10.75F);

		bodyModel[296].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 822 cull
		bodyModel[296].setRotationPoint(-25.5F, 2F, 10.75F);

		bodyModel[297].addShapeBox(0F, 0F, -4F, 1, 2, 5, 0F,0F, 0.125F, 0.125F, 0.225F, 0.25F, 0.375F, 0.225F, 0.25F, 0.375F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.1F, 0.25F, 0.375F, 0.1F, 0.25F, 0.375F, 0F, 0.125F, 0.125F); // Box 823
		bodyModel[297].setRotationPoint(-28.25F, -8.5F, 10.25F);
		bodyModel[297].rotateAngleY = -0.73303829F;

		bodyModel[298].addShapeBox(0F, 0F, -4F, 1, 2, 5, 0F,0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F); // Box 824 numberboard
		bodyModel[298].setRotationPoint(-28.25F, -8.5F, 10.25F);
		bodyModel[298].rotateAngleY = -0.73303829F;

		bodyModel[299].addShapeBox(0.6F, -1.5F, -2.25F, 1, 1, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 825 markerlight
		bodyModel[299].setRotationPoint(-28.25F, -8.5F, 10.5F);
		bodyModel[299].rotateAngleY = -0.73303829F;

		bodyModel[300].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, -1.5F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 1.5F, 0F, 1F, 3F, 0F); // Box 827
		bodyModel[300].setRotationPoint(-27.25F, -14.5F, 2F);

		bodyModel[301].addShapeBox(-4.5F, 0F, -0.5F, 5, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 828 door swing right cab
		bodyModel[301].setRotationPoint(-11.5F, -15F, 10.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 149 cull nose grabs
		bodyModel[302].setRotationPoint(-32.25F, -8F, -3F);
		bodyModel[302].rotateAngleZ = -0.15707963F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 7F, 0F, -1F, 7F); // Box 818 cull lift lugs
		bodyModel[303].setRotationPoint(-32.85F, -8F, -4F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 7F, 0F, -1F, 7F); // Box 819 cull lift lugs
		bodyModel[304].setRotationPoint(-34.25F, -1F, -4F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,-1F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -3F); // Box 467
		bodyModel[305].setRotationPoint(-29.5F, -10F, 10F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, -2F, -2.75F, 0F, 0F, -2F, -3F, 0F, 1F, 0F, 0F, 0.5F, 0F, -2F, 1.75F, -1F, 0F, 1F, -3F); // Box 470
		bodyModel[306].setRotationPoint(-28.25F, -13.5F, 8F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 2F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 2F); // Box 471
		bodyModel[307].setRotationPoint(-29.5F, -10F, -11F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -2F, -3F, -2F, -2.75F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, -2F, 1.75F, -1F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 474
		bodyModel[308].setRotationPoint(-28.25F, -13.5F, -11F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.25F, 0.5F, -1F, -0.75F, -0.25F, -4F, -0.75F, -0.25F, 3F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 3F, 0F, 0F, 0F); // Box 478
		bodyModel[309].setRotationPoint(-29.5F, -11F, 7F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.75F, -0.25F, 3F, -0.75F, -0.25F, -4F, -1.25F, 0.5F, -1F, 0F, 0F, 0F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F); // Box 479
		bodyModel[310].setRotationPoint(-29.5F, -11F, -8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 1.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -1F, 0F, 0F); // Box 480
		bodyModel[311].setRotationPoint(-30.25F, -12.5F, 2F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, 1.25F, 0.5F, 0F); // Box 482
		bodyModel[312].setRotationPoint(-30.25F, -12.5F, -8F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.25F, -0.25F, 0F, 0.2F, 0F, 0F, -1.75F, 2F, 0F, -2.25F, 2F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, -2F, 0F, -2.25F, -2F, 0F); // Box 487
		bodyModel[313].setRotationPoint(-25.5F, -11F, -11F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-2.25F, 2F, 0F, -1.75F, 2F, 0F, 0.2F, 0F, 0F, -0.25F, -0.25F, 0F, -2.25F, -2F, 0F, -1.75F, -2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[314].setRotationPoint(-25.5F, -11F, 8F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, 0F, 1F, 0F, -0.95F, 0.47F, 1.45F, 0F, 0.47F, 1.45F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 490
		bodyModel[315].setRotationPoint(-23.25F, -13.5F, -8F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.47F, 1.45F, -0.95F, 0.47F, 1.45F); // Box 491
		bodyModel[316].setRotationPoint(-23.25F, -13.5F, 2F);

		bodyModel[317].addShapeBox(0F, -4F, 1F, 1, 4, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F); // Box 493 cull mirrors
		bodyModel[317].setRotationPoint(-19.5F, -11F, 10F);

		bodyModel[318].addShapeBox(0F, 0F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 494 cull
		bodyModel[318].setRotationPoint(-25.5F, 4F, -9.75F);

		bodyModel[319].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 495 cull
		bodyModel[319].setRotationPoint(-25.5F, 2F, -9.75F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 84, 10, 1, 0F,0F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5F, 0F, -42F, -5F, 0F, -42F, -5F, -0.5F, 0F, -5F, -0.5F); // Box 444 CULL f3a mesh grill
		bodyModel[320].setRotationPoint(-10.5F, -15F, -11.01F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 60, 12, 0, 0F,0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, 0F, -6F, 0F); // Box 445 f3a mesh grill bottom
		bodyModel[321].setRotationPoint(-10.5F, -10F, -11.01F);

		bodyModel[322].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 683 fan
		bodyModel[322].setRotationPoint(19F, -20F, -2.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 450 fan
		bodyModel[323].setRotationPoint(-0.5F, -20F, -2.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 451 fan
		bodyModel[324].setRotationPoint(6.5F, -20F, -2.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 452 fan
		bodyModel[325].setRotationPoint(12F, -20F, -2.5F);

		bodyModel[326].addShapeBox(0F, 0F, -1F, 84, 10, 1, 0F,0F, 0F, -0.5F, -42F, 0F, -0.5F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, -42F, -5F, -0.5F, -42F, -5F, 0F, 0F, -5F, 0F); // Box 455 CULL f3a mesh grill
		bodyModel[326].setRotationPoint(-10.5F, -15F, 11.01F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 60, 12, 0, 0F,0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, 0F, -6F, 0F); // Box 456 f3a mesh grill bottom
		bodyModel[327].setRotationPoint(-10.5F, -10F, 11.01F);

		bodyModel[328].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 457 dynamic fan small
		bodyModel[328].setRotationPoint(-8.5F, -20F, -2.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458 f3a tall fan
		bodyModel[329].setRotationPoint(6.5F, -21F, -2.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459 f3a tall fan
		bodyModel[330].setRotationPoint(12F, -21F, -2.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460 f3a tall fan
		bodyModel[331].setRotationPoint(19F, -21F, -2.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461 f3a tall fan
		bodyModel[332].setRotationPoint(-0.5F, -21F, -2.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 298
		bodyModel[333].setRotationPoint(-5.5F, -9F, -2F);

		bodyModel[334].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Box 299
		bodyModel[334].setRotationPoint(-5.5F, -6F, -5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[335].setRotationPoint(-5.5F, -2F, -2F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 19, 4, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 465
		bodyModel[336].setRotationPoint(1.5F, -4F, -5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 19, 3, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 466
		bodyModel[337].setRotationPoint(1.5F, -9F, -5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 19, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[338].setRotationPoint(1.5F, -12F, -6F);

		bodyModel[339].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 468
		bodyModel[339].setRotationPoint(0.5F, -13F, -7F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 469
		bodyModel[340].setRotationPoint(-3.5F, -10F, 3F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 470
		bodyModel[341].setRotationPoint(-3.5F, -10F, -5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 19, 2, 10, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 471
		bodyModel[342].setRotationPoint(1.5F, -6F, -5F);

		bodyModel[343].addShapeBox(0F, -1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[343].setRotationPoint(2.5F, -15F, 0F);
		bodyModel[343].rotateAngleX = 0.78539816F;

		bodyModel[344].addShapeBox(0F, -1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[344].setRotationPoint(12F, -15F, 0F);
		bodyModel[344].rotateAngleX = 0.78539816F;

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[345].setRotationPoint(-8.5F, -8.5F, -2.5F);

		bodyModel[346].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[346].setRotationPoint(-6.5F, -4.3F, 1F);
		bodyModel[346].rotateAngleX = -1.10828408F;

		bodyModel[347].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[347].setRotationPoint(-6.5F, -4.3F, -1F);
		bodyModel[347].rotateAngleX = 1.10828408F;

		bodyModel[348].addBox(0F, 0F, 0F, 4, 11, 6, 0F); // Box 477 cull equipment rack
		bodyModel[348].setRotationPoint(22F, -11F, -3F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 478
		bodyModel[349].setRotationPoint(24F, -3F, -4F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 479
		bodyModel[350].setRotationPoint(21F, -3F, 1F);

		bodyModel[351].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 480 lube filter
		bodyModel[351].setRotationPoint(24F, -8F, -3F);
		bodyModel[351].rotateAngleZ = 0.78539816F;

		bodyModel[352].addBox(0F, 0F, 0F, 4, 5, 6, 0F); // Box 481 engine water tank
		bodyModel[352].setRotationPoint(23F, -16.01F, -3F);

		bodyModel[353].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 482
		bodyModel[353].setRotationPoint(22F, -18.01F, -1F);

		bodyModel[354].addBox(0F, 0F, 0F, 4, 10, 5, 0F); // Box 0 Steam/HEP gen
		bodyModel[354].setRotationPoint(27F, -10F, -6F);

		bodyModel[355].addBox(0F, 0F, 0F, 4, 10, 5, 0F); // Box 485 Steam/HEP gen
		bodyModel[355].setRotationPoint(27.5F, -10F, 0F);

		bodyModel[356].addBox(0F, 0F, 0F, 9, 3, 8, 0F); // Box 429 dynamics internal
		bodyModel[356].setRotationPoint(-9F, -18F, -4F);

		bodyModel[357].addBox(0F, 0F, 0F, 1, 0, 20, 0F); // Box 430
		bodyModel[357].setRotationPoint(-10.5F, -2F, -10F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, -2F, -4F, 0F); // Box 431
		bodyModel[358].setRotationPoint(-33.5F, 1.5F, 2F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -3F, -4F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 3F, -4F, -3F, -4F, -4F, -2F); // Box 432
		bodyModel[359].setRotationPoint(-31.5F, 1.5F, 8F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 1F, 2F, 0F, -1F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F); // Box 434
		bodyModel[360].setRotationPoint(-29.25F, -12.5F, -8F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 1.75F, 0F, 1F, 2F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[361].setRotationPoint(-29.25F, -12.5F, 2F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[362].setRotationPoint(9F, 2F, -8.5F);
		bodyModel[362].rotateAngleY = 1.57079633F;

		bodyModel[363].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[363].setRotationPoint(1F, 2F, -8.5F);
		bodyModel[363].rotateAngleY = 1.57079633F;

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 427
		bodyModel[364].setRotationPoint(-33F, -8F, -2F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, -0.25F, -0.35F, -0.65F, -0.25F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 428
		bodyModel[365].setRotationPoint(-33F, -8F, -2F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 429
		bodyModel[366].setRotationPoint(-33F, -8F, 0F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, -0.25F, -0.65F, -0.35F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[367].setRotationPoint(-33F, -8F, 1F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F); // Box 431
		bodyModel[368].setRotationPoint(-32.25F, -6F, 0F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 432
		bodyModel[369].setRotationPoint(-32.25F, -6F, -2F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 12, 4, 0F,-2F, 0F, 0F, 1.25F, 2.5F, 0F, 1.25F, 2.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[370].setRotationPoint(-33.5F, -10F, -2F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 84, 10, 1, 0F,0F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -42F, -5F, 0F, -42F, -5F, 0F, 0F, -5F, 0F); // Box 416 late grills
		bodyModel[371].setRotationPoint(-10.5F, -15F, -11.15F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 84, 10, 1, 0F,0F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -42F, -5F, 0F, -42F, -5F, 0F, 0F, -5F, 0F); // Box 417 late grills
		bodyModel[372].setRotationPoint(-10.5F, -15F, 10.15F);

		bodyModel[373].addShapeBox(0F, 0F, -1F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 1.5F); // Box 426 pilot snow
		bodyModel[373].setRotationPoint(-34F, 7F, 0F);
		bodyModel[373].rotateAngleY = 1.57079633F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,1.225F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Box 428 pilot snow
		bodyModel[374].setRotationPoint(-29.5F, 2.5F, 8F);

		bodyModel[375].addShapeBox(0F, 0F, -1F, 9, 3, 1, 0F,-0.7F, 0F, 0.13F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, -0.7F, 0F, -0.13F, 0F, 0F, 0.82F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.82F); // Box 430 pilot snow
		bodyModel[375].setRotationPoint(-34F, 2.5F, 2F);
		bodyModel[375].rotateAngleY = 1.57079633F;

		bodyModel[376].addShapeBox(0F, 0F, -1F, 11, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 431 pilot snow
		bodyModel[376].setRotationPoint(-34F, 5F, 0F);
		bodyModel[376].rotateAngleY = 1.57079633F;

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.052F, 0F, 0F, -0.575F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.82F, 0F, 0F, -1.82F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 432 pilot snow CULL
		bodyModel[377].setRotationPoint(-31F, 8F, 9F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -2.5F); // Box 433 pilot snow
		bodyModel[378].setRotationPoint(-34F, 7F, 0F);
		bodyModel[378].rotateAngleY = -1.57079633F;

		bodyModel[379].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.225F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3.2F, 0F, 0F, 0.25F, 0F, 0F); // Box 434 pilot snow
		bodyModel[379].setRotationPoint(-29.5F, 2.5F, -11F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-0.7F, 0F, -0.13F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, -0.7F, 0F, 0.13F, 0F, 0F, -0.82F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0.82F); // Box 435 pilot snow
		bodyModel[380].setRotationPoint(-34F, 2.5F, -2F);
		bodyModel[380].rotateAngleY = -1.57079633F;

		bodyModel[381].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -4.5F, 0F, -0.5F, 4.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F); // Box 436 pilot snow
		bodyModel[381].setRotationPoint(-34F, 5F, 0F);
		bodyModel[381].rotateAngleY = -1.57079633F;

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.575F, 0F, 0F, 0.052F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.82F, 0F, 0F, 0.82F, 0F, 0F); // Box 437 pilot snow CULL
		bodyModel[382].setRotationPoint(-31F, 8F, -11F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 438 pilot passenger
		bodyModel[383].setRotationPoint(-33.5F, 2.5F, 2F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 448 pilot passenger
		bodyModel[384].setRotationPoint(-27.5F, 2F, 10F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.7F, 0F, -2.85F, -2.66F, 0F, -2F, 1.275F, -0.5F, 0F, -1.275F, -0.5F, 0F, 0.5F, -0.5F, -2.85F, -1.5F, -0.5F, -2F); // Box 451 pilot passenger CULL
		bodyModel[385].setRotationPoint(-31.5F, 2.5F, 8F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.2F, 0F, -0.1F, 0.5F, 0F, -1F, -0.5F, 0F, 1F, -0.16F, 0F, 0F, 0.25F, 0F, -0.17F, 0.5F, -2F, -1F, -0.5F, -2F, 1F, 0.3F, 0F, -0.03F); // Box 452 pilot passenger
		bodyModel[386].setRotationPoint(-29F, 2.5F, 9F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Box 453 pilot passenger
		bodyModel[387].setRotationPoint(-33.5F, 2.5F, -8F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 454 pilot passenger
		bodyModel[388].setRotationPoint(-27.5F, 2F, -11F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-2.66F, 0F, -2F, 1.7F, 0F, -2.85F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, -2F, 0.5F, -0.5F, -2.85F, -1.275F, -0.5F, 0F, 1.275F, -0.5F, 0F); // Box 455 pilot passenger CULL
		bodyModel[389].setRotationPoint(-31.5F, 2.5F, -12F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.16F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, -1F, -0.2F, 0F, -0.1F, 0.3F, 0F, -0.03F, -0.5F, -2F, 1F, 0.5F, -2F, -1F, 0.25F, 0F, -0.17F); // Box 456 pilot passenger
		bodyModel[390].setRotationPoint(-29F, 2.5F, -10F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.225F, 0F, 0F, 1.225F, 0F, 0F, 0.225F, 0F, 0F, -0.225F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458 pilot passenger CULL
		bodyModel[391].setRotationPoint(-34F, 8F, -8F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.225F, 0F, 0F, 0.225F, 0F, 0F, 1.225F, 0F, 0F, -1.225F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 459 pilot passenger CULL
		bodyModel[392].setRotationPoint(-34F, 8F, 5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,-0.75F, -0.125F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, -0.125F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 460 pilot passenger coupler cover
		bodyModel[393].setRotationPoint(-36F, 3F, -2F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.325F, 0F, 0F, 0.325F, 0F, 0F, 0.325F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 464 pilot norma
		bodyModel[394].setRotationPoint(-33.5F, 6F, -2F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F); // Box 469 pilot norma
		bodyModel[395].setRotationPoint(-32.5F, 3F, 2F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, -1F, -0.5F, 1F, -1F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 472 pilot norma
		bodyModel[396].setRotationPoint(-27.5F, 3F, 10F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-1F, -0.5F, 0F, 1F, -0.5F, 0F, 3F, -0.5F, -0.5F, -3F, -0.5F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 473 pilot norma
		bodyModel[397].setRotationPoint(-33.5F, 4F, 2F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-1F, -0.5F, 0F, 1F, -0.5F, 0F, 1.6F, -0.5F, -1.4F, -2.2F, -0.5F, -1F, 1F, 0F, 1F, -1F, 0F, 1F, -0.4F, 0F, -2.4F, -0.2F, 0F, -2F); // Box 474 pilot norma
		bodyModel[398].setRotationPoint(-31.5F, 4F, 7.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-1.2F, -0.5F, 0F, 0.6F, -0.5F, 0.4F, 2F, -0.5F, -2.5F, -3F, -0.5F, -1.5F, 0.8F, 0F, 1F, -1.4F, 0F, 1.4F, -1.4F, 0F, -4.4F, 0.8F, 0F, -4F); // Box 477 pilot norma
		bodyModel[399].setRotationPoint(-30.5F, 4F, 8.5F);

		bodyModel[400].addShapeBox(0F, 0F, 2F, 2, 2, 1, 0F,-0.3F, 0F, -0.7F, -0.25F, 0F, 0.5F, -0.2F, 0F, -0.6F, -0.3F, 0F, 0.15F, 0.5F, -0.2F, -1.1F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, -0.4F, 0.1F, -0.2F, 0.5F); // Box 480 pilot normal CULL
		bodyModel[400].setRotationPoint(-30F, 5.4F, -11F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 3F, 0.5F, -3F, -4F, 0.5F, -2F, -1F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 3F, -0.5F, -4F, -4F, -0.5F, -3F); // Box 481 pilot norma
		bodyModel[401].setRotationPoint(-31.5F, 3F, 8F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, -2F, -0.5F, -0.5F, 2F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 482 pilot norma
		bodyModel[402].setRotationPoint(-32.5F, 3F, -8F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 483 pilot norma
		bodyModel[403].setRotationPoint(-27.5F, 3F, -11F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-3F, -0.5F, -0.5F, 3F, -0.5F, -0.5F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 484 pilot norma
		bodyModel[404].setRotationPoint(-33.5F, 4F, -8F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-2.2F, -0.5F, -1F, 1.6F, -0.5F, -1.4F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.2F, 0F, -2F, -0.4F, 0F, -2.4F, -1F, 0F, 1F, 1F, 0F, 1F); // Box 485 pilot norma
		bodyModel[405].setRotationPoint(-31.5F, 4F, -9.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-3F, -0.5F, -1.5F, 2F, -0.5F, -2.5F, 0.6F, -0.5F, 0.4F, -1.2F, -0.5F, 0F, 0.8F, 0F, -4F, -1.4F, 0F, -4.4F, -1.4F, 0F, 1.4F, 0.8F, 0F, 1F); // Box 486 pilot norma
		bodyModel[406].setRotationPoint(-30.5F, 4F, -11.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-4F, 0.5F, -2F, 3F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4F, -0.5F, -3F, 3F, -0.5F, -4F, 1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F); // Box 487 pilot norma
		bodyModel[407].setRotationPoint(-31.5F, 3F, -13F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0F, 0.15F, -0.2F, 0F, -0.6F, -0.25F, 0F, 0.5F, -0.3F, 0F, -0.7F, 0.1F, -0.2F, 0.5F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, 0.5F, 0.5F, -0.2F, -1.1F); // Box 488 pilot normal CULL
		bodyModel[408].setRotationPoint(-30F, 5.4F, 8F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 22, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[409].setRotationPoint(8.5F, -13F, 11F);
		bodyModel[409].rotateAngleY = -1.57079633F;

		bodyModel[410].addShapeBox(0F, 0F, 0F, 22, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[410].setRotationPoint(12.5F, -13F, 11F);
		bodyModel[410].rotateAngleY = -1.57079633F;

		bodyModel[411].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 412
		bodyModel[411].setRotationPoint(-8.5F, -14F, 11F);
		bodyModel[411].rotateAngleY = -1.57079633F;

		bodyModel[412].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 414
		bodyModel[412].setRotationPoint(-2.5F, -14F, 11F);
		bodyModel[412].rotateAngleY = -1.57079633F;

		bodyModel[413].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 415
		bodyModel[413].setRotationPoint(23.5F, -13F, 11F);
		bodyModel[413].rotateAngleY = -1.57079633F;

		bodyModel[414].addShapeBox(0F, 0F, 0F, 19, 3, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416 interior engine bit
		bodyModel[414].setRotationPoint(0.5F, -16F, 5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 19, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 417 interior engine bit
		bodyModel[415].setRotationPoint(0.5F, -16F, -10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.01F, 0F, 0F, 19.01F, 0F, 0F, 19.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 19.01F, 0F, 0F, 19.01F, 0F, 0F, 0.01F, 0F, 0F); // Box 418 sandcap fill
		bodyModel[416].setRotationPoint(-19F, -5.5F, 11F);
		bodyModel[416].rotateAngleY = -1.57079633F;

		bodyModel[417].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.02F, 0F, 0F, 19.02F, 0F, 0F, 19.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 19.02F, 0F, 0F, 19.02F, 0F, 0F, 0.02F, 0F, 0F); // Box 419 sandcap fill
		bodyModel[417].setRotationPoint(14F, -7.5F, 11F);
		bodyModel[417].rotateAngleY = -1.57079633F;

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 420 headlight rear very high
		bodyModel[418].setRotationPoint(32F, -17F, -1F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420 fuel filler with skirting
		bodyModel[419].setRotationPoint(5F, 2.5F, 7.85F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 421 fuel filler with skirting
		bodyModel[420].setRotationPoint(5F, 2.5F, -10.85F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425 HEADLIGHT FULL TOP
		bodyModel[421].setRotationPoint(-31.25F, -14.5F, -2F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426 HEADLIGHT FULL TOP
		bodyModel[422].setRotationPoint(-31.25F, -12.5F, -2F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 427 HEADLIGHT FULL TOP
		bodyModel[423].setRotationPoint(-31.25F, -12.5F, 0F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 HEADLIGHT FULL TOP
		bodyModel[424].setRotationPoint(-31.25F, -14.5F, 0F);
	}
	ModelBlombergBnew theTrucc = new ModelBlombergBnew();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 356) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-0.9, -0.01, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.2, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 832) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Espee.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-0.9, -0.01, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.2, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.025, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//front
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glTranslated(1.25, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//rear
			GL11.glPopMatrix();
		}
	}
	public float[] getTrans() {
		return new float[]{-1.3F, 0.145F, 0F}; }

	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.9675D, 1.25D, 0.0D});
				add(new double[]{0.19D, 1.25D, 0.0D});
			}
		};
	}
}