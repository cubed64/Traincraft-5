///This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator:
// Created on: 18.11.2021 - 11:29:10
// Last changed on: 18.11.2021 - 11:29:10

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruckEarly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelGSC53FootBulkheadFlat extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGSC53FootBulkheadFlat() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[305];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 206, 114, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 30, 114, textureX, textureY); // Box 144
		bodyModel[2] = new ModelRendererTurbo(this, 233, 74, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 276, 120, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 100, 120, textureX, textureY); // Box 154
		bodyModel[5] = new ModelRendererTurbo(this, 8, 133, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 302, 109, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 235, 86, textureX, textureY); // Box 264
		bodyModel[8] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 282, 74, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 102, 163, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 128, 161, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 184, 161, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 159, 163, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 230, 109, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 238, 109, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 222, 109, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 118, 107, textureX, textureY); // Box 238
		bodyModel[18] = new ModelRendererTurbo(this, 110, 107, textureX, textureY); // Box 245
		bodyModel[19] = new ModelRendererTurbo(this, 126, 107, textureX, textureY); // Box 246
		bodyModel[20] = new ModelRendererTurbo(this, 285, 86, textureX, textureY); // Box 264
		bodyModel[21] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 219, 135, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 245, 133, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 278, 136, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 304, 133, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 339, 153, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 244, 161, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 217, 164, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 277, 109, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 270, 109, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 261, 109, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 246, 109, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 70, 107, textureX, textureY); // Box 241
		bodyModel[34] = new ModelRendererTurbo(this, 78, 107, textureX, textureY); // Box 242
		bodyModel[35] = new ModelRendererTurbo(this, 86, 107, textureX, textureY); // Box 243
		bodyModel[36] = new ModelRendererTurbo(this, 102, 107, textureX, textureY); // Box 244
		bodyModel[37] = new ModelRendererTurbo(this, 102, 135, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 128, 133, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 159, 135, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 294, 109, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 286, 109, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 54, 107, textureX, textureY); // Box 241
		bodyModel[43] = new ModelRendererTurbo(this, 62, 107, textureX, textureY); // Box 242
		bodyModel[44] = new ModelRendererTurbo(this, 343, 85, textureX, textureY); // Box 80
		bodyModel[45] = new ModelRendererTurbo(this, 343, 82, textureX, textureY); // Box 81
		bodyModel[46] = new ModelRendererTurbo(this, 337, 93, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 332, 93, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 337, 87, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 329, 74, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 175, 124, textureX, textureY,"cull"); // Box 144  Cull
		bodyModel[52] = new ModelRendererTurbo(this, 30, 125, textureX, textureY,"cull"); // Box 144  Cull
		bodyModel[53] = new ModelRendererTurbo(this, 207, 124, textureX, textureY,"cull"); // Box 260 Cull
		bodyModel[54] = new ModelRendererTurbo(this, 352, 123, textureX, textureY,"cull"); // Box 261 Cull
		bodyModel[55] = new ModelRendererTurbo(this, 151, 207, textureX, textureY); // Box 154
		bodyModel[56] = new ModelRendererTurbo(this, 287, 230, textureX, textureY); // Box 28
		bodyModel[57] = new ModelRendererTurbo(this, 301, 237, textureX, textureY); // Box 28
		bodyModel[58] = new ModelRendererTurbo(this, 329, 207, textureX, textureY); // Box 154
		bodyModel[59] = new ModelRendererTurbo(this, 62, 230, textureX, textureY); // Box 28
		bodyModel[60] = new ModelRendererTurbo(this, 15, 207, textureX, textureY); // Box 154
		bodyModel[61] = new ModelRendererTurbo(this, 77, 237, textureX, textureY); // Box 28
		bodyModel[62] = new ModelRendererTurbo(this, 224, 237, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 224, 247, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 185, 245, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 242, 237, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 185, 249, textureX, textureY); // Box 0
		bodyModel[67] = new ModelRendererTurbo(this, 242, 241, textureX, textureY); // Box 0
		bodyModel[68] = new ModelRendererTurbo(this, 185, 237, textureX, textureY); // Box 275
		bodyModel[69] = new ModelRendererTurbo(this, 242, 245, textureX, textureY); // Box 276
		bodyModel[70] = new ModelRendererTurbo(this, 185, 241, textureX, textureY); // Box 277
		bodyModel[71] = new ModelRendererTurbo(this, 242, 249, textureX, textureY); // Box 278
		bodyModel[72] = new ModelRendererTurbo(this, 196, 207, textureX, textureY); // Box 154
		bodyModel[73] = new ModelRendererTurbo(this, 240, 207, textureX, textureY); // Box 154
		bodyModel[74] = new ModelRendererTurbo(this, 107, 207, textureX, textureY); // Box 154
		bodyModel[75] = new ModelRendererTurbo(this, 152, 212, textureX, textureY); // Box 154
		bodyModel[76] = new ModelRendererTurbo(this, 196, 212, textureX, textureY); // Box 154
		bodyModel[77] = new ModelRendererTurbo(this, 264, 215, textureX, textureY); // Box 154
		bodyModel[78] = new ModelRendererTurbo(this, 108, 216, textureX, textureY); // Box 154
		bodyModel[79] = new ModelRendererTurbo(this, 177, 215, textureX, textureY); // Box 154
		bodyModel[80] = new ModelRendererTurbo(this, 221, 216, textureX, textureY); // Box 154
		bodyModel[81] = new ModelRendererTurbo(this, 245, 210, textureX, textureY); // Box 154
		bodyModel[82] = new ModelRendererTurbo(this, 133, 216, textureX, textureY); // Box 154
		bodyModel[83] = new ModelRendererTurbo(this, 177, 207, textureX, textureY); // Box 294
		bodyModel[84] = new ModelRendererTurbo(this, 221, 207, textureX, textureY); // Box 295
		bodyModel[85] = new ModelRendererTurbo(this, 245, 218, textureX, textureY); // Box 296
		bodyModel[86] = new ModelRendererTurbo(this, 133, 209, textureX, textureY); // Box 298
		bodyModel[87] = new ModelRendererTurbo(this, 156, 238, textureX, textureY); // Box 286
		bodyModel[88] = new ModelRendererTurbo(this, 167, 238, textureX, textureY); // Box 287
		bodyModel[89] = new ModelRendererTurbo(this, 163, 234, textureX, textureY); // Box 302
		bodyModel[90] = new ModelRendererTurbo(this, 145, 238, textureX, textureY); // Box 118
		bodyModel[91] = new ModelRendererTurbo(this, 138, 238, textureX, textureY); // Box 119
		bodyModel[92] = new ModelRendererTurbo(this, 146, 234, textureX, textureY); // Box 129
		bodyModel[93] = new ModelRendererTurbo(this, 120, 239, textureX, textureY); // Box 130
		bodyModel[94] = new ModelRendererTurbo(this, 121, 235, textureX, textureY); // Box 130
		bodyModel[95] = new ModelRendererTurbo(this, 128, 239, textureX, textureY); // Box 130
		bodyModel[96] = new ModelRendererTurbo(this, 130, 235, textureX, textureY); // Box 130
		bodyModel[97] = new ModelRendererTurbo(this, 175, 121, textureX, textureY); // Box 144
		bodyModel[98] = new ModelRendererTurbo(this, 352, 120, textureX, textureY); // Box 312
		bodyModel[99] = new ModelRendererTurbo(this, 259, 76, textureX, textureY); // Box 144
		bodyModel[100] = new ModelRendererTurbo(this, 239, 75, textureX, textureY); // Box 317
		bodyModel[101] = new ModelRendererTurbo(this, 299, 48, textureX, textureY); // Box 371
		bodyModel[102] = new ModelRendererTurbo(this, 348, 43, textureX, textureY); // Box 372
		bodyModel[103] = new ModelRendererTurbo(this, 355, 40, textureX, textureY); // Box 373
		bodyModel[104] = new ModelRendererTurbo(this, 299, 60, textureX, textureY); // Box 374
		bodyModel[105] = new ModelRendererTurbo(this, 347, 43, textureX, textureY); // Box 375
		bodyModel[106] = new ModelRendererTurbo(this, 341, 37, textureX, textureY,"cull"); // Box 376 cull
		bodyModel[107] = new ModelRendererTurbo(this, 337, 90, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 360, 45, textureX, textureY); // Box 372
		bodyModel[109] = new ModelRendererTurbo(this, 305, 53, textureX, textureY,"cull"); // Box 376 cull
		bodyModel[110] = new ModelRendererTurbo(this, 299, 34, textureX, textureY); // Box 331
		bodyModel[111] = new ModelRendererTurbo(this, 287, 33, textureX, textureY); // Box 332
		bodyModel[112] = new ModelRendererTurbo(this, 274, 36, textureX, textureY); // Box 333
		bodyModel[113] = new ModelRendererTurbo(this, 282, 39, textureX, textureY); // Box 335
		bodyModel[114] = new ModelRendererTurbo(this, 305, 37, textureX, textureY,"cull"); // Box 376 cull
		bodyModel[115] = new ModelRendererTurbo(this, 305, 42, textureX, textureY,"cull"); // Box 376 cull
		bodyModel[116] = new ModelRendererTurbo(this, 78, 51, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 182, 51, textureX, textureY); // Box 486
		bodyModel[118] = new ModelRendererTurbo(this, 32, 56, textureX, textureY); // Box 496
		bodyModel[119] = new ModelRendererTurbo(this, 265, 35, textureX, textureY); // Box 372
		bodyModel[120] = new ModelRendererTurbo(this, 155, 104, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 141, 104, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 76, 104, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 88, 104, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 102, 104, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 128, 104, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 242, 106, textureX, textureY); // Box 338
		bodyModel[127] = new ModelRendererTurbo(this, 254, 106, textureX, textureY); // Box 339
		bodyModel[128] = new ModelRendererTurbo(this, 322, 106, textureX, textureY); // Box 340
		bodyModel[129] = new ModelRendererTurbo(this, 309, 106, textureX, textureY); // Box 341
		bodyModel[130] = new ModelRendererTurbo(this, 296, 106, textureX, textureY); // Box 342
		bodyModel[131] = new ModelRendererTurbo(this, 268, 106, textureX, textureY); // Box 343
		bodyModel[132] = new ModelRendererTurbo(this, 335, 106, textureX, textureY); // Box 344
		bodyModel[133] = new ModelRendererTurbo(this, 219, 112, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 41, 111, textureX, textureY); // Box 0
		bodyModel[135] = new ModelRendererTurbo(this, 68, 133, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 43, 104, textureX, textureY); // Box 0
		bodyModel[137] = new ModelRendererTurbo(this, 353, 106, textureX, textureY); // Box 337
		bodyModel[138] = new ModelRendererTurbo(this, 46, 107, textureX, textureY); // Box 241
		bodyModel[139] = new ModelRendererTurbo(this, 68, 161, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 173, 104, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 220, 106, textureX, textureY); // Box 337
		bodyModel[142] = new ModelRendererTurbo(this, 234, 106, textureX, textureY); // Box 337
		bodyModel[143] = new ModelRendererTurbo(this, 167, 102, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 347, 104, textureX, textureY); // Box 337
		bodyModel[145] = new ModelRendererTurbo(this, 57, 104, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 304, 161, textureX, textureY); // Box 0
		bodyModel[147] = new ModelRendererTurbo(this, 278, 164, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 254, 109, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 94, 107, textureX, textureY); // Box 243
		bodyModel[150] = new ModelRendererTurbo(this, 115, 104, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 282, 106, textureX, textureY); // Box 342
		bodyModel[152] = new ModelRendererTurbo(this, 294, 120, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 332, 120, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 294, 124, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 71, 120, textureX, textureY); // Box 158
		bodyModel[156] = new ModelRendererTurbo(this, 62, 123, textureX, textureY); // Box 159
		bodyModel[157] = new ModelRendererTurbo(this, 71, 124, textureX, textureY); // Box 160
		bodyModel[158] = new ModelRendererTurbo(this, 48, 120, textureX, textureY); // Box 159
		bodyModel[159] = new ModelRendererTurbo(this, 62, 120, textureX, textureY); // Box 159
		bodyModel[160] = new ModelRendererTurbo(this, 323, 123, textureX, textureY); // Box 254
		bodyModel[161] = new ModelRendererTurbo(this, 323, 120, textureX, textureY); // Box 255
		bodyModel[162] = new ModelRendererTurbo(this, 246, 120, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 223, 120, textureX, textureY); // Box 0
		bodyModel[164] = new ModelRendererTurbo(this, 246, 124, textureX, textureY); // Box 0
		bodyModel[165] = new ModelRendererTurbo(this, 117, 120, textureX, textureY); // Box 155
		bodyModel[166] = new ModelRendererTurbo(this, 155, 120, textureX, textureY); // Box 156
		bodyModel[167] = new ModelRendererTurbo(this, 117, 124, textureX, textureY); // Box 157
		bodyModel[168] = new ModelRendererTurbo(this, 146, 123, textureX, textureY); // Box 159
		bodyModel[169] = new ModelRendererTurbo(this, 146, 120, textureX, textureY); // Box 159
		bodyModel[170] = new ModelRendererTurbo(this, 237, 123, textureX, textureY); // Box 256
		bodyModel[171] = new ModelRendererTurbo(this, 237, 120, textureX, textureY); // Box 257
		bodyModel[172] = new ModelRendererTurbo(this, 307, 85, textureX, textureY); // Box 364
		bodyModel[173] = new ModelRendererTurbo(this, 258, 84, textureX, textureY); // Box 364
		bodyModel[174] = new ModelRendererTurbo(this, 289, 75, textureX, textureY); // Box 144
		bodyModel[175] = new ModelRendererTurbo(this, 308, 74, textureX, textureY); // Box 317
		bodyModel[176] = new ModelRendererTurbo(this, 210, 56, textureX, textureY); // Box 495
		bodyModel[177] = new ModelRendererTurbo(this, 210, 54, textureX, textureY); // Box 496
		bodyModel[178] = new ModelRendererTurbo(this, 121, 56, textureX, textureY); // Box 498
		bodyModel[179] = new ModelRendererTurbo(this, 45, 53, textureX, textureY); // Box 360
		bodyModel[180] = new ModelRendererTurbo(this, 32, 58, textureX, textureY); // Box 495
		bodyModel[181] = new ModelRendererTurbo(this, 45, 58, textureX, textureY); // Box 360
		bodyModel[182] = new ModelRendererTurbo(this, 101, 53, textureX, textureY); // Box 0
		bodyModel[183] = new ModelRendererTurbo(this, 63, 71, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[184] = new ModelRendererTurbo(this, 77, 79, textureX, textureY); // Box 487
		bodyModel[185] = new ModelRendererTurbo(this, 78, 52, textureX, textureY); // Box 487
		bodyModel[186] = new ModelRendererTurbo(this, 130, 51, textureX, textureY); // Box 486
		bodyModel[187] = new ModelRendererTurbo(this, 39, 78, textureX, textureY); // Box 0
		bodyModel[188] = new ModelRendererTurbo(this, 159, 55, textureX, textureY); // Box 495
		bodyModel[189] = new ModelRendererTurbo(this, 45, 78, textureX, textureY); // Box 360
		bodyModel[190] = new ModelRendererTurbo(this, 159, 53, textureX, textureY); // Box 495
		bodyModel[191] = new ModelRendererTurbo(this, 45, 73, textureX, textureY); // Box 360
		bodyModel[192] = new ModelRendererTurbo(this, 32, 62, textureX, textureY); // Box 495
		bodyModel[193] = new ModelRendererTurbo(this, 45, 68, textureX, textureY); // Box 360
		bodyModel[194] = new ModelRendererTurbo(this, 32, 60, textureX, textureY); // Box 495
		bodyModel[195] = new ModelRendererTurbo(this, 45, 63, textureX, textureY); // Box 360
		bodyModel[196] = new ModelRendererTurbo(this, 32, 66, textureX, textureY); // Box 495
		bodyModel[197] = new ModelRendererTurbo(this, 32, 64, textureX, textureY); // Box 495
		bodyModel[198] = new ModelRendererTurbo(this, 181, 45, textureX, textureY); // Box 371
		bodyModel[199] = new ModelRendererTurbo(this, 128, 46, textureX, textureY); // Box 371
		bodyModel[200] = new ModelRendererTurbo(this, 185, 7, textureX, textureY); // Box 486
		bodyModel[201] = new ModelRendererTurbo(this, 27, 7, textureX, textureY); // Box 496
		bodyModel[202] = new ModelRendererTurbo(this, 209, 12, textureX, textureY); // Box 495
		bodyModel[203] = new ModelRendererTurbo(this, 209, 10, textureX, textureY); // Box 496
		bodyModel[204] = new ModelRendererTurbo(this, 119, 4, textureX, textureY); // Box 498
		bodyModel[205] = new ModelRendererTurbo(this, 39, 3, textureX, textureY); // Box 360
		bodyModel[206] = new ModelRendererTurbo(this, 27, 9, textureX, textureY); // Box 495
		bodyModel[207] = new ModelRendererTurbo(this, 39, 8, textureX, textureY); // Box 360
		bodyModel[208] = new ModelRendererTurbo(this, 78, 29, textureX, textureY); // Box 487
		bodyModel[209] = new ModelRendererTurbo(this, 77, 9, textureX, textureY); // Box 487
		bodyModel[210] = new ModelRendererTurbo(this, 131, 7, textureX, textureY); // Box 486
		bodyModel[211] = new ModelRendererTurbo(this, 39, 23, textureX, textureY); // Box 0
		bodyModel[212] = new ModelRendererTurbo(this, 159, 9, textureX, textureY); // Box 495
		bodyModel[213] = new ModelRendererTurbo(this, 39, 30, textureX, textureY); // Box 360
		bodyModel[214] = new ModelRendererTurbo(this, 159, 7, textureX, textureY); // Box 495
		bodyModel[215] = new ModelRendererTurbo(this, 39, 25, textureX, textureY); // Box 360
		bodyModel[216] = new ModelRendererTurbo(this, 27, 13, textureX, textureY); // Box 495
		bodyModel[217] = new ModelRendererTurbo(this, 39, 19, textureX, textureY); // Box 360
		bodyModel[218] = new ModelRendererTurbo(this, 27, 11, textureX, textureY); // Box 495
		bodyModel[219] = new ModelRendererTurbo(this, 39, 13, textureX, textureY); // Box 360
		bodyModel[220] = new ModelRendererTurbo(this, 27, 17, textureX, textureY); // Box 495
		bodyModel[221] = new ModelRendererTurbo(this, 27, 15, textureX, textureY); // Box 495
		bodyModel[222] = new ModelRendererTurbo(this, 181, 3, textureX, textureY); // Box 371
		bodyModel[223] = new ModelRendererTurbo(this, 128, 4, textureX, textureY); // Box 371
		bodyModel[224] = new ModelRendererTurbo(this, 73, 2, textureX, textureY); // Box 0
		bodyModel[225] = new ModelRendererTurbo(this, 99, 4, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 298, 67, textureX, textureY); // Box 293
		bodyModel[227] = new ModelRendererTurbo(this, 313, 35, textureX, textureY); // Box 0
		bodyModel[228] = new ModelRendererTurbo(this, 236, 6, textureX, textureY); // Box 0
		bodyModel[229] = new ModelRendererTurbo(this, 236, 10, textureX, textureY); // Box 0
		bodyModel[230] = new ModelRendererTurbo(this, 276, 3, textureX, textureY); // Box 0
		bodyModel[231] = new ModelRendererTurbo(this, 235, 40, textureX, textureY); // Box 0
		bodyModel[232] = new ModelRendererTurbo(this, 235, 44, textureX, textureY); // Box 0
		bodyModel[233] = new ModelRendererTurbo(this, 235, 3, textureX, textureY); // Box 294
		bodyModel[234] = new ModelRendererTurbo(this, 232, 36, textureX, textureY); // Box 294
		bodyModel[235] = new ModelRendererTurbo(this, 60, 207, textureX, textureY); // Box 154
		bodyModel[236] = new ModelRendererTurbo(this, 284, 207, textureX, textureY); // Box 154
		bodyModel[237] = new ModelRendererTurbo(this, 120, 29, textureX, textureY); // Box 498
		bodyModel[238] = new ModelRendererTurbo(this, 7, 53, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[239] = new ModelRendererTurbo(this, 121, 79, textureX, textureY); // Box 498
		bodyModel[240] = new ModelRendererTurbo(this, 144, 253, textureX, textureY,"cull"); // Box 300 cull
		bodyModel[241] = new ModelRendererTurbo(this, 144, 260, textureX, textureY,"cull"); // Box 300 cull
		bodyModel[242] = new ModelRendererTurbo(this, 6, 261, textureX, textureY,"cull"); // Box 300 cull
		bodyModel[243] = new ModelRendererTurbo(this, 6, 253, textureX, textureY,"cull"); // Box 300 cull
		bodyModel[244] = new ModelRendererTurbo(this, 207, 120, textureX, textureY); // Box 312
		bodyModel[245] = new ModelRendererTurbo(this, 30, 121, textureX, textureY); // Box 144
		bodyModel[246] = new ModelRendererTurbo(this, 64, 104, textureX, textureY); // Box 306
		bodyModel[247] = new ModelRendererTurbo(this, 64, 104, textureX, textureY); // Box 307
		bodyModel[248] = new ModelRendererTurbo(this, 62, 25, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[249] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[250] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[251] = new ModelRendererTurbo(this, 22, 20, textureX, textureY); // Box 221
		bodyModel[252] = new ModelRendererTurbo(this, 62, 25, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[253] = new ModelRendererTurbo(this, 62, 25, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[254] = new ModelRendererTurbo(this, 62, 25, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[255] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[256] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[257] = new ModelRendererTurbo(this, 22, 20, textureX, textureY); // Box 221
		bodyModel[258] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[259] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[260] = new ModelRendererTurbo(this, 22, 20, textureX, textureY); // Box 221
		bodyModel[261] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[262] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[263] = new ModelRendererTurbo(this, 22, 20, textureX, textureY); // Box 221
		bodyModel[264] = new ModelRendererTurbo(this, 63, 71, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[265] = new ModelRendererTurbo(this, 63, 71, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[266] = new ModelRendererTurbo(this, 63, 71, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[267] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[268] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[269] = new ModelRendererTurbo(this, 22, 20, textureX, textureY); // Box 221
		bodyModel[270] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[271] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[272] = new ModelRendererTurbo(this, 22, 20, textureX, textureY); // Box 221
		bodyModel[273] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[274] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[275] = new ModelRendererTurbo(this, 22, 20, textureX, textureY); // Box 221
		bodyModel[276] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[277] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 221
		bodyModel[278] = new ModelRendererTurbo(this, 22, 20, textureX, textureY); // Box 221
		bodyModel[279] = new ModelRendererTurbo(this, 7, 53, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[280] = new ModelRendererTurbo(this, 7, 53, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[281] = new ModelRendererTurbo(this, 7, 53, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[282] = new ModelRendererTurbo(this, 6, 4, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[283] = new ModelRendererTurbo(this, 6, 4, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[284] = new ModelRendererTurbo(this, 6, 4, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[285] = new ModelRendererTurbo(this, 6, 4, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[286] = new ModelRendererTurbo(this, 332, 3, textureX, textureY); // Box 287
		bodyModel[287] = new ModelRendererTurbo(this, 287, 48, textureX, textureY); // Box 372
		bodyModel[288] = new ModelRendererTurbo(this, 274, 51, textureX, textureY); // Box 373
		bodyModel[289] = new ModelRendererTurbo(this, 282, 54, textureX, textureY); // Box 375
		bodyModel[290] = new ModelRendererTurbo(this, 274, 58, textureX, textureY); // Box 372
		bodyModel[291] = new ModelRendererTurbo(this, 305, 48, textureX, textureY,"cull"); // Box 376 cull
		bodyModel[292] = new ModelRendererTurbo(this, 305, 53, textureX, textureY,"cull"); // Box 376 cull
		bodyModel[293] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 0
		bodyModel[294] = new ModelRendererTurbo(this, 75, 74, textureX, textureY); // Box 0
		bodyModel[295] = new ModelRendererTurbo(this, 407, 43, textureX, textureY); // Box 296
		bodyModel[296] = new ModelRendererTurbo(this, 407, 43, textureX, textureY); // Box 296
		bodyModel[297] = new ModelRendererTurbo(this, 407, 43, textureX, textureY); // Box 296
		bodyModel[298] = new ModelRendererTurbo(this, 407, 43, textureX, textureY); // Box 296
		bodyModel[299] = new ModelRendererTurbo(this, 407, 43, textureX, textureY); // Box 296
		bodyModel[300] = new ModelRendererTurbo(this, 407, 43, textureX, textureY); // Box 296
		bodyModel[301] = new ModelRendererTurbo(this, 407, 43, textureX, textureY); // Box 296
		bodyModel[302] = new ModelRendererTurbo(this, 407, 43, textureX, textureY); // Box 296
		bodyModel[303] = new ModelRendererTurbo(this, 376, 39, textureX, textureY); // Box 304
		bodyModel[304] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 304

		bodyModel[0].addShapeBox(0F, 0F, 0F, 77, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38.5F, 3F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 77, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 144
		bodyModel[1].setRotationPoint(-38.5F, 3F, 10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(37.51F, 3F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-3.5F, 5F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 154
		bodyModel[4].setRotationPoint(-3.5F, 5F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(32.5F, 2F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(32.5F, 3F, -12F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 264
		bodyModel[7].setRotationPoint(38.5F, 3F, -1.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[8].setRotationPoint(-38.5F, 2F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-38.51F, 3F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-27.5F, 2F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-26.5F, 2F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-20.5F, 2F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-21.5F, 2F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-27.5F, 3F, -12F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-21.5F, 3F, -12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-33.5F, 3F, -12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[17].setRotationPoint(-27.5F, 3F, 11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[18].setRotationPoint(-21.5F, 3F, 11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[19].setRotationPoint(-33.5F, 3F, 11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 264
		bodyModel[20].setRotationPoint(-42.5F, 3F, -1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(14.5F, 2F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(13.5F, 2F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(7.5F, 2F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(6.5F, 2F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[25].setRotationPoint(0.5F, 2F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(-0.5F, 2F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(-13.5F, 2F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-14.5F, 2F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(13.5F, 3F, -12F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[30].setRotationPoint(6.5F, 3F, -12F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[31].setRotationPoint(-0.5F, 3F, -12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[32].setRotationPoint(-14.5F, 3F, -12F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[33].setRotationPoint(13.5F, 3F, 11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[34].setRotationPoint(6.5F, 3F, 11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[35].setRotationPoint(-0.5F, 3F, 11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[36].setRotationPoint(-14.5F, 3F, 11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[37].setRotationPoint(26.5F, 2F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[38].setRotationPoint(21.5F, 2F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[39].setRotationPoint(20.5F, 2F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[40].setRotationPoint(26.5F, 3F, -12F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[41].setRotationPoint(20.5F, 3F, -12F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[42].setRotationPoint(26.5F, 3F, 11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[43].setRotationPoint(20.5F, 3F, 11F);

		bodyModel[44].addBox(0F, 0F, 0F, 11, 2, 0, 0F); // Box 80
		bodyModel[44].setRotationPoint(-41F, 4.9F, -0.5F);
		bodyModel[44].rotateAngleY = 1.34390352F;
		bodyModel[44].rotateAngleZ = 0.03490659F;

		bodyModel[45].addBox(-11F, 0F, 0F, 11, 2, 0, 0F); // Box 81
		bodyModel[45].setRotationPoint(41F, 4.9F, 0.5F);
		bodyModel[45].rotateAngleY = 1.34390352F;
		bodyModel[45].rotateAngleZ = -0.03490659F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[46].setRotationPoint(-39.5F, 4F, 2.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[47].setRotationPoint(-38.5F, 5F, 2.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[48].setRotationPoint(-39.5F, 3F, 2.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[49].setRotationPoint(-39.25F, -0.75F, 2.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 0, 5, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 0
		bodyModel[50].setRotationPoint(-40.75F, -0.76F, 1.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144  Cull
		bodyModel[51].setRotationPoint(-38.5F, 5F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144  Cull
		bodyModel[52].setRotationPoint(34.5F, 5F, 10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260 Cull
		bodyModel[53].setRotationPoint(-38.5F, 5F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261 Cull
		bodyModel[54].setRotationPoint(34.5F, 5F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[55].setRotationPoint(5F, 3F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
		bodyModel[56].setRotationPoint(-37.5F, 3F, -1.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 28
		bodyModel[57].setRotationPoint(-29F, 4.5F, -1.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[58].setRotationPoint(-34.5F, 3F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
		bodyModel[59].setRotationPoint(20.5F, 3F, -1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[60].setRotationPoint(33.5F, 3F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 28
		bodyModel[61].setRotationPoint(26F, 4.5F, -1.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[62].setRotationPoint(-3.5F, 3F, -2.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[63].setRotationPoint(-3.5F, 3F, 1.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 0
		bodyModel[64].setRotationPoint(-20.5F, 3F, 1.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 0
		bodyModel[65].setRotationPoint(3.5F, 3F, 1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 0
		bodyModel[66].setRotationPoint(-20.5F, 4.5F, 1.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[67].setRotationPoint(3.5F, 4.5F, 1.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F); // Box 275
		bodyModel[68].setRotationPoint(-20.5F, 3F, -2.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 276
		bodyModel[69].setRotationPoint(3.5F, 3F, -2.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 277
		bodyModel[70].setRotationPoint(-20.5F, 4.5F, -2.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 0F); // Box 278
		bodyModel[71].setRotationPoint(3.5F, 4.5F, -2.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[72].setRotationPoint(-6F, 3F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[73].setRotationPoint(-16F, 3F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[74].setRotationPoint(15F, 3F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[75].setRotationPoint(5F, 4F, -4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[76].setRotationPoint(-6F, 4F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[77].setRotationPoint(-16F, 4F, -4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[78].setRotationPoint(15F, 4F, -4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 154
		bodyModel[79].setRotationPoint(5F, 4F, 4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 154
		bodyModel[80].setRotationPoint(-6F, 4F, 4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 154
		bodyModel[81].setRotationPoint(-16F, 4F, 4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 154
		bodyModel[82].setRotationPoint(15F, 4F, 4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[83].setRotationPoint(5F, 4F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[84].setRotationPoint(-6F, 4F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[85].setRotationPoint(-16F, 4F, -8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[86].setRotationPoint(15F, 4F, -8F);

		bodyModel[87].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Box 286
		bodyModel[87].setRotationPoint(6.5F, 4.5F, -7.5F);
		bodyModel[87].rotateAngleX = -0.78539816F;

		bodyModel[88].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 287
		bodyModel[88].setRotationPoint(8.5F, 4.5F, -7.5F);
		bodyModel[88].rotateAngleX = -0.78539816F;

		bodyModel[89].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 302
		bodyModel[89].setRotationPoint(6.5F, 3F, -8F);

		bodyModel[90].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 118
		bodyModel[90].setRotationPoint(2.5F, 4F, 4F);
		bodyModel[90].rotateAngleX = -0.78539816F;

		bodyModel[91].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.75F); // Box 119
		bodyModel[91].setRotationPoint(1.5F, 4F, 4F);
		bodyModel[91].rotateAngleX = -0.78539816F;

		bodyModel[92].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 129
		bodyModel[92].setRotationPoint(2F, 3F, 3.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 130
		bodyModel[93].setRotationPoint(11.75F, 3.5F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[94].setRotationPoint(12.25F, 3F, -9F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 130
		bodyModel[95].setRotationPoint(9.25F, 3.5F, 3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[96].setRotationPoint(10.25F, 3F, 3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[97].setRotationPoint(-38.5F, 3F, -12F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[98].setRotationPoint(34.5F, 3F, 11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[99].setRotationPoint(38.5F, 3F, 5.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[100].setRotationPoint(38.5F, 3F, -9.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, -0.5F, -5F, -0.5F, -0.5F, -5F, 0F, 0F, -5F, 0F); // Box 371
		bodyModel[101].setRotationPoint(-39.25F, -2.5F, 3.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 372
		bodyModel[102].setRotationPoint(-40.26F, -12.01F, 1F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 373
		bodyModel[103].setRotationPoint(-39.75F, -12.01F, 3.25F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, -0.5F, -1F, -2.5F, -0.5F); // Box 374
		bodyModel[104].setRotationPoint(-39F, 2.5F, 4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 375
		bodyModel[105].setRotationPoint(-40.25F, -10.5F, 3.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376 cull
		bodyModel[106].setRotationPoint(-40F, -4F, 2.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[107].setRotationPoint(-39.25F, 3.5F, 2.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 372
		bodyModel[108].setRotationPoint(-38.51F, -12.01F, 2.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 376 cull
		bodyModel[109].setRotationPoint(-40F, -3.5F, 5.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, -0.5F, -5F, -0.5F, -0.5F, -5F, 0F, 0F, -5F, 0F); // Box 331
		bodyModel[110].setRotationPoint(-39.25F, -11F, 3.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 332
		bodyModel[111].setRotationPoint(-40.26F, -15F, 1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 333
		bodyModel[112].setRotationPoint(-39.75F, -14.25F, 3.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 335
		bodyModel[113].setRotationPoint(-40.25F, -13.5F, 3.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376 cull
		bodyModel[114].setRotationPoint(-40F, -9F, 2.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 376 cull
		bodyModel[115].setRotationPoint(-40F, -8.5F, 5.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[116].setRotationPoint(-35.51F, -15F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[117].setRotationPoint(-39.51F, -1.25F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[118].setRotationPoint(-38.51F, -14.5F, 10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 372
		bodyModel[119].setRotationPoint(-38.51F, -14.5F, 2.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[120].setRotationPoint(-26.5F, 2F, 11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[121].setRotationPoint(-20.5F, 2F, 11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[122].setRotationPoint(14.5F, 2F, 11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[123].setRotationPoint(7.5F, 2F, 11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[124].setRotationPoint(0.5F, 2F, 11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[125].setRotationPoint(-13.5F, 2F, 11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[126].setRotationPoint(-26.5F, 2F, -12F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[127].setRotationPoint(-20.5F, 2F, -12F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[128].setRotationPoint(14.5F, 2F, -12F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[129].setRotationPoint(7.5F, 2F, -12F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[130].setRotationPoint(0.5F, 2F, -12F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[131].setRotationPoint(-13.5F, 2F, -12F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[132].setRotationPoint(21.5F, 2F, -12F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 65, 0, 1, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[133].setRotationPoint(-32.5F, 3.01F, -12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 65, 0, 1, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[134].setRotationPoint(-32.48F, 3.01F, 11.01F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[135].setRotationPoint(27.5F, 2F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[136].setRotationPoint(27.5F, 2F, 11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[137].setRotationPoint(27.5F, 2F, -12F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[138].setRotationPoint(32.5F, 3F, 11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[139].setRotationPoint(-32.5F, 2F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[140].setRotationPoint(-32.5F, 2F, 11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[141].setRotationPoint(-32.5F, 2F, -12F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[142].setRotationPoint(-29.49F, 1.99F, -12.01F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[143].setRotationPoint(-29.47F, 1.99F, 11.02F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[144].setRotationPoint(27.49F, 1.99F, -12.01F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[145].setRotationPoint(27.49F, 1.99F, 11.01F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[146].setRotationPoint(-6.5F, 2F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[147].setRotationPoint(-7.5F, 2F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[148].setRotationPoint(-7.5F, 3F, -12F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[149].setRotationPoint(-7.5F, 3F, 11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[150].setRotationPoint(-6.5F, 2F, 11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[151].setRotationPoint(-6.5F, 2F, -12F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[152].setRotationPoint(3.5F, 5F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[153].setRotationPoint(19.5F, 5F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[154].setRotationPoint(3.5F, 6.5F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 158
		bodyModel[155].setRotationPoint(3.5F, 5F, 10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 159
		bodyModel[156].setRotationPoint(16.5F, 5.75F, 10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 160
		bodyModel[157].setRotationPoint(3.5F, 6.5F, 10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[158].setRotationPoint(19.5F, 5F, 10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 159
		bodyModel[159].setRotationPoint(16.5F, 5F, 10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 254
		bodyModel[160].setRotationPoint(16.5F, 5.75F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[161].setRotationPoint(16.5F, 5F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[162].setRotationPoint(-16.5F, 5F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[163].setRotationPoint(-24.5F, 5F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[164].setRotationPoint(-16.5F, 6.5F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 155
		bodyModel[165].setRotationPoint(-16.5F, 5F, 10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 156
		bodyModel[166].setRotationPoint(-24.5F, 5F, 10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 157
		bodyModel[167].setRotationPoint(-16.5F, 6.5F, 10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F); // Box 159
		bodyModel[168].setRotationPoint(-19.5F, 5.75F, 10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 159
		bodyModel[169].setRotationPoint(-19.5F, 5F, 10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F); // Box 256
		bodyModel[170].setRotationPoint(-19.5F, 5.75F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 257
		bodyModel[171].setRotationPoint(-19.5F, 5F, -11F);

		bodyModel[172].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 364
		bodyModel[172].setRotationPoint(-39F, 2.5F, -2F);

		bodyModel[173].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 364
		bodyModel[173].setRotationPoint(33F, 2.5F, -2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[174].setRotationPoint(-39.5F, 3F, 5.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[175].setRotationPoint(-39.5F, 3F, -9.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[176].setRotationPoint(-38.51F, -1.25F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[177].setRotationPoint(-38.51F, -4.75F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 498
		bodyModel[178].setRotationPoint(-39F, -15F, 5.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[179].setRotationPoint(-39.51F, -14.5F, 6F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[180].setRotationPoint(-38.5F, -11.49F, 10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[181].setRotationPoint(-39.5F, -11.49F, 6F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.5F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[182].setRotationPoint(-39.01F, -15F, -10.01F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[183].setRotationPoint(-38.5F, -12F, -10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 487
		bodyModel[184].setRotationPoint(-38.5F, -12F, 5.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 487
		bodyModel[185].setRotationPoint(-38.5F, -15F, 5.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[186].setRotationPoint(-39.51F, -0.25F, -10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[187].setRotationPoint(-39F, -12F, -10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[188].setRotationPoint(-38.51F, 0.75F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[189].setRotationPoint(-39.5F, 0.75F, 6F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[190].setRotationPoint(-38.51F, -2.31F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[191].setRotationPoint(-39.5F, -2.31F, 6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[192].setRotationPoint(-38.5F, -5.37F, 10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[193].setRotationPoint(-39.5F, -5.37F, 6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[194].setRotationPoint(-38.5F, -8.43F, 10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[195].setRotationPoint(-39.5F, -8.43F, 6F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[196].setRotationPoint(-38.5F, 0.75F, 10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[197].setRotationPoint(-38.5F, -2.31F, 10F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 14, 23, 0F); // Box 371
		bodyModel[198].setRotationPoint(-34.49F, -12F, -11.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 17, 23, 0F); // Box 371
		bodyModel[199].setRotationPoint(-34.49F, -15F, -11.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[200].setRotationPoint(38.5F, -1.25F, 3F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[201].setRotationPoint(34.5F, -14.5F, -11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[202].setRotationPoint(34.5F, -1.25F, 10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[203].setRotationPoint(34.5F, -4.75F, 10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[204].setRotationPoint(38F, -15F, -6.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 360
		bodyModel[205].setRotationPoint(38.5F, -14.5F, -10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[206].setRotationPoint(34.5F, -11.49F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 360
		bodyModel[207].setRotationPoint(38.5F, -11.49F, -10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 487
		bodyModel[208].setRotationPoint(34.5F, -12F, -6.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 487
		bodyModel[209].setRotationPoint(34.5F, -15F, -6.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[210].setRotationPoint(38.5F, -0.25F, 3F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, 0F, -0.02F); // Box 0
		bodyModel[211].setRotationPoint(38F, -12F, -10F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[212].setRotationPoint(34.5F, 0.75F, 10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 360
		bodyModel[213].setRotationPoint(38.5F, 0.75F, -10F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[214].setRotationPoint(34.5F, -2.31F, 10F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 360
		bodyModel[215].setRotationPoint(38.5F, -2.31F, -10F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[216].setRotationPoint(34.5F, -5.37F, -11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 360
		bodyModel[217].setRotationPoint(38.5F, -5.37F, -10F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[218].setRotationPoint(34.5F, -8.43F, -11F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 360
		bodyModel[219].setRotationPoint(38.5F, -8.43F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[220].setRotationPoint(34.5F, 0.75F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[221].setRotationPoint(34.5F, -2.31F, -11F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 14, 23, 0F); // Box 371
		bodyModel[222].setRotationPoint(33.49F, -12F, -11.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 17, 23, 0F); // Box 371
		bodyModel[223].setRotationPoint(33.49F, -15F, -11.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, 0F, -0.02F); // Box 0
		bodyModel[224].setRotationPoint(34.5F, -15F, -10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, 0F, -0.02F); // Box 0
		bodyModel[225].setRotationPoint(38.01F, -15F, 3.01F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 293
		bodyModel[226].setRotationPoint(-39.5F, 5F, 4F);
		bodyModel[226].rotateAngleY = 0.01745329F;
		bodyModel[226].rotateAngleZ = 0.45378561F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[227].setRotationPoint(32.5F, 2F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[228].setRotationPoint(34.5F, 2F, 10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[229].setRotationPoint(34.5F, 2F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[230].setRotationPoint(-34.5F, 2F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[231].setRotationPoint(-38.5F, 2F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[232].setRotationPoint(-38.5F, 2F, 10F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 294
		bodyModel[233].setRotationPoint(37.51F, 2F, -9F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 294
		bodyModel[234].setRotationPoint(-38.51F, 2F, -9F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[235].setRotationPoint(26.5F, 3F, -10F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[236].setRotationPoint(-28.5F, 3F, -10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[237].setRotationPoint(38F, -12F, -6.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 6, 19, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[238].setRotationPoint(-38.5F, -15F, 3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 498
		bodyModel[239].setRotationPoint(-39F, -12F, 5.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 68, 5, 0, 0F); // Box 300 cull
		bodyModel[240].setRotationPoint(-33.5F, 3F, 12.01F);

		bodyModel[241].addBox(0F, 0F, 0F, 68, 5, 0, 0F); // Box 300 cull
		bodyModel[241].setRotationPoint(-33.5F, 3F, -12.01F);

		bodyModel[242].addBox(0F, 0F, 0F, 68, 6, 0, 0F); // Box 300 cull
		bodyModel[242].setRotationPoint(-33.5F, 3F, 11.01F);

		bodyModel[243].addBox(0F, 0F, 0F, 68, 6, 0, 0F); // Box 300 cull
		bodyModel[243].setRotationPoint(-33.5F, 3F, -11.01F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[244].setRotationPoint(34.5F, 3F, -12F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[245].setRotationPoint(-38.5F, 3F, 11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[246].setRotationPoint(21.5F, 2F, 11F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[247].setRotationPoint(21.5F, 2F, 11F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[248].setRotationPoint(34.5F, -12F, 9F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F); // Box 221
		bodyModel[249].setRotationPoint(-36F, -6.25F, -10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F); // Box 221
		bodyModel[250].setRotationPoint(-35.75F, -2.25F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F); // Box 221
		bodyModel[251].setRotationPoint(-35.75F, -10.25F, -10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[252].setRotationPoint(34.5F, -12F, 3F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[253].setRotationPoint(34.5F, -12F, -10F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[254].setRotationPoint(34.5F, -12F, -4F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F); // Box 221
		bodyModel[255].setRotationPoint(35F, -6.25F, 9F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F); // Box 221
		bodyModel[256].setRotationPoint(34.75F, -2.25F, 9F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F); // Box 221
		bodyModel[257].setRotationPoint(34.75F, -10.25F, 9F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F); // Box 221
		bodyModel[258].setRotationPoint(35F, -6.25F, 3F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F); // Box 221
		bodyModel[259].setRotationPoint(34.75F, -2.25F, 3F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F); // Box 221
		bodyModel[260].setRotationPoint(34.75F, -10.25F, 3F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F); // Box 221
		bodyModel[261].setRotationPoint(35F, -6.25F, -4F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F); // Box 221
		bodyModel[262].setRotationPoint(34.75F, -2.25F, -4F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F); // Box 221
		bodyModel[263].setRotationPoint(34.75F, -10.25F, -4F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[264].setRotationPoint(-38.5F, -12F, 9F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[265].setRotationPoint(-38.5F, -12F, 3F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[266].setRotationPoint(-38.5F, -12F, -4F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F); // Box 221
		bodyModel[267].setRotationPoint(35F, -6.25F, -10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F); // Box 221
		bodyModel[268].setRotationPoint(34.75F, -2.25F, -10F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F); // Box 221
		bodyModel[269].setRotationPoint(34.75F, -10.25F, -10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F); // Box 221
		bodyModel[270].setRotationPoint(-36F, -6.25F, -4F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F); // Box 221
		bodyModel[271].setRotationPoint(-35.75F, -2.25F, -4F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F); // Box 221
		bodyModel[272].setRotationPoint(-35.75F, -10.25F, -4F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F); // Box 221
		bodyModel[273].setRotationPoint(-36F, -6.25F, 3F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F); // Box 221
		bodyModel[274].setRotationPoint(-35.75F, -2.25F, 3F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F); // Box 221
		bodyModel[275].setRotationPoint(-35.75F, -10.25F, 3F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F); // Box 221
		bodyModel[276].setRotationPoint(-36F, -6.25F, 9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F); // Box 221
		bodyModel[277].setRotationPoint(-35.75F, -2.25F, 9F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, -0.25F, -0.01F, -0.125F, 0.25F, -0.01F, 2.375F, 0.05F, -0.01F, -2.625F, 0.55F, -0.01F, -2.625F, 0.55F, -0.01F, 2.375F, 0.05F, -0.01F); // Box 221
		bodyModel[278].setRotationPoint(-35.75F, -10.25F, 9F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 6, 19, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[279].setRotationPoint(-38.5F, -15F, 9F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 6, 19, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[280].setRotationPoint(-38.5F, -15F, -4F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 6, 19, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[281].setRotationPoint(-38.5F, -15F, -10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 6, 19, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[282].setRotationPoint(34.5F, -15F, 9F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 6, 19, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[283].setRotationPoint(34.5F, -15F, -4F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 6, 19, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[284].setRotationPoint(34.5F, -15F, 3F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 6, 19, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[285].setRotationPoint(34.5F, -15F, -10F);

		bodyModel[286].addBox(0F, 0F, 0F, 4, 17, 12, 0F); // Box 287
		bodyModel[286].setRotationPoint(34.52F, -15.01F, -3.01F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 372
		bodyModel[287].setRotationPoint(-40.26F, -6.5F, 1F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 373
		bodyModel[288].setRotationPoint(-39.75F, -5.75F, 3.25F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 375
		bodyModel[289].setRotationPoint(-40.25F, -5F, 3.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 372
		bodyModel[290].setRotationPoint(-38.51F, -6.5F, 2.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376 cull
		bodyModel[291].setRotationPoint(-40F, 1F, 2.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 376 cull
		bodyModel[292].setRotationPoint(-40F, 1.5F, 5.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, 0F, -0.02F); // Box 0
		bodyModel[293].setRotationPoint(34.5F, -12F, -10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[294].setRotationPoint(-35.5F, -12F, -10F);

		bodyModel[295].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 296
		bodyModel[295].setRotationPoint(34.5F, -18F, -4F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 296
		bodyModel[296].setRotationPoint(-37.5F, -18F, -4F);

		bodyModel[297].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 296
		bodyModel[297].setRotationPoint(34.5F, -18F, -10F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 296
		bodyModel[298].setRotationPoint(-37.5F, -18F, -10F);

		bodyModel[299].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 296
		bodyModel[299].setRotationPoint(34.5F, -18F, 3F);

		bodyModel[300].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 296
		bodyModel[300].setRotationPoint(-37.5F, -18F, 3F);

		bodyModel[301].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 296
		bodyModel[301].setRotationPoint(34.5F, -18F, 9F);

		bodyModel[302].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 296
		bodyModel[302].setRotationPoint(-37.5F, -18F, 9F);

		bodyModel[303].addBox(0F, 0F, 0F, 1, 3, 23, 0F); // Box 304
		bodyModel[303].setRotationPoint(-34.5F, -18F, -11.5F);

		bodyModel[304].addBox(0F, 0F, 0F, 1, 3, 23, 0F); // Box 304
		bodyModel[304].setRotationPoint(33.5F, -18F, -11.5F);
	}
	Model70TonTruckEarly bogie = new Model70TonTruckEarly();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 305; i++)
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
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.72,-0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.44,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f, f1, f2, f3, f4, f5);
	}
}