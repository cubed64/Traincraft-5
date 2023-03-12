//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPS58SeatCoach_Observation extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPS58SeatCoach_Observation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[615];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 340, 104, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 310, 116, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 74, 141, textureX, textureY); // Box 30
		bodyModel[4] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 31
		bodyModel[5] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[6] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[7] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 30, 122, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 202, 173, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 239, 173, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 151, 163, textureX, textureY); // Box 52
		bodyModel[17] = new ModelRendererTurbo(this, 266, 174, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 141, 174, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 96, 172, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 74, 158, textureX, textureY); // Box 59
		bodyModel[22] = new ModelRendererTurbo(this, 156, 177, textureX, textureY); // Box 41
		bodyModel[23] = new ModelRendererTurbo(this, 156, 175, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 176, 175, textureX, textureY); // Box 41
		bodyModel[25] = new ModelRendererTurbo(this, 179, 177, textureX, textureY); // Box 41
		bodyModel[26] = new ModelRendererTurbo(this, 179, 175, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 199, 175, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 89, 157, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 91, 158, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 101, 158, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 219, 160, textureX, textureY); // Box 41
		bodyModel[33] = new ModelRendererTurbo(this, 239, 160, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 200, 162, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 216, 160, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 150, 156, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 150, 154, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 162, 154, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 141, 162, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 256, 154, textureX, textureY); // Box 24
		bodyModel[42] = new ModelRendererTurbo(this, 249, 154, textureX, textureY); // Box 24
		bodyModel[43] = new ModelRendererTurbo(this, 331, 62, textureX, textureY); // Left step part
		bodyModel[44] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Left step part
		bodyModel[45] = new ModelRendererTurbo(this, 331, 68, textureX, textureY); // Left step part
		bodyModel[46] = new ModelRendererTurbo(this, 329, 71, textureX, textureY); // Left step part
		bodyModel[47] = new ModelRendererTurbo(this, 331, 77, textureX, textureY); // Left step part
		bodyModel[48] = new ModelRendererTurbo(this, 322, 79, textureX, textureY); // Left step part
		bodyModel[49] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Left step part
		bodyModel[50] = new ModelRendererTurbo(this, 323, 74, textureX, textureY); // Left step part
		bodyModel[51] = new ModelRendererTurbo(this, 340, 79, textureX, textureY); // Left step part
		bodyModel[52] = new ModelRendererTurbo(this, 340, 77, textureX, textureY); // Left step part
		bodyModel[53] = new ModelRendererTurbo(this, 341, 74, textureX, textureY); // Left step part
		bodyModel[54] = new ModelRendererTurbo(this, 331, 74, textureX, textureY); // Left step part
		bodyModel[55] = new ModelRendererTurbo(this, 327, 81, textureX, textureY); // Left step part
		bodyModel[56] = new ModelRendererTurbo(this, 256, 163, textureX, textureY); // Box 144
		bodyModel[57] = new ModelRendererTurbo(this, 249, 163, textureX, textureY); // Box 145
		bodyModel[58] = new ModelRendererTurbo(this, 331, 87, textureX, textureY); // Right step part
		bodyModel[59] = new ModelRendererTurbo(this, 329, 90, textureX, textureY); // Right step part
		bodyModel[60] = new ModelRendererTurbo(this, 331, 93, textureX, textureY); // Right step part
		bodyModel[61] = new ModelRendererTurbo(this, 329, 96, textureX, textureY); // Right step part
		bodyModel[62] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Right step part
		bodyModel[63] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Right step part
		bodyModel[64] = new ModelRendererTurbo(this, 322, 98, textureX, textureY); // Right step part
		bodyModel[65] = new ModelRendererTurbo(this, 323, 95, textureX, textureY); // Right step part
		bodyModel[66] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[67] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[68] = new ModelRendererTurbo(this, 341, 95, textureX, textureY); // Right step part
		bodyModel[69] = new ModelRendererTurbo(this, 331, 99, textureX, textureY); // Right step part
		bodyModel[70] = new ModelRendererTurbo(this, 327, 106, textureX, textureY); // Right step part
		bodyModel[71] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[72] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[73] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[74] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[75] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[81] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[89] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[90] = new ModelRendererTurbo(this, 21, 43, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 43, 35, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 62, 2, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 56, 1, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 50, 1, textureX, textureY); // Box 128
		bodyModel[96] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[100] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[101] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[102] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[104] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[105] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[106] = new ModelRendererTurbo(this, 188, 156, textureX, textureY); // Box 38
		bodyModel[107] = new ModelRendererTurbo(this, 195, 160, textureX, textureY); // Box 38
		bodyModel[108] = new ModelRendererTurbo(this, 197, 155, textureX, textureY); // Box 38
		bodyModel[109] = new ModelRendererTurbo(this, 183, 155, textureX, textureY); // Box 38
		bodyModel[110] = new ModelRendererTurbo(this, 203, 155, textureX, textureY); // Box 41
		bodyModel[111] = new ModelRendererTurbo(this, 222, 155, textureX, textureY); // Box 41
		bodyModel[112] = new ModelRendererTurbo(this, 212, 155, textureX, textureY); // Box 41
		bodyModel[113] = new ModelRendererTurbo(this, 231, 155, textureX, textureY); // Box 41
		bodyModel[114] = new ModelRendererTurbo(this, 223, 155, textureX, textureY); // Box 41
		bodyModel[115] = new ModelRendererTurbo(this, 204, 155, textureX, textureY); // Box 41
		bodyModel[116] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[119] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[120] = new ModelRendererTurbo(this, 51, 78, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 60, 97, textureX, textureY); // Box 202
		bodyModel[122] = new ModelRendererTurbo(this, 63, 145, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[124] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 38
		bodyModel[125] = new ModelRendererTurbo(this, 374, 103, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 373, 97, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 372, 91, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 370, 83, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 366, 67, textureX, textureY); // Box 248
		bodyModel[130] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 250
		bodyModel[131] = new ModelRendererTurbo(this, 373, 72, textureX, textureY); // Box 252
		bodyModel[132] = new ModelRendererTurbo(this, 372, 77, textureX, textureY); // Box 254
		bodyModel[133] = new ModelRendererTurbo(this, 371, 86, textureX, textureY); // Box 38
		bodyModel[134] = new ModelRendererTurbo(this, 385, 102, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 414, 67, textureX, textureY); // Box 128
		bodyModel[136] = new ModelRendererTurbo(this, 384, 96, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 383, 90, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 381, 82, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 419, 45, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 427, 46, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 247
		bodyModel[142] = new ModelRendererTurbo(this, 385, 67, textureX, textureY); // Box 249
		bodyModel[143] = new ModelRendererTurbo(this, 384, 71, textureX, textureY); // Box 251
		bodyModel[144] = new ModelRendererTurbo(this, 383, 76, textureX, textureY); // Box 253
		bodyModel[145] = new ModelRendererTurbo(this, 413, 46, textureX, textureY); // Box 255
		bodyModel[146] = new ModelRendererTurbo(this, 411, 53, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 423, 52, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 413, 52, textureX, textureY); // Box 153
		bodyModel[149] = new ModelRendererTurbo(this, 427, 69, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 412, 69, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 403, 69, textureX, textureY); // Box 128
		bodyModel[152] = new ModelRendererTurbo(this, 403, 89, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 390, 59, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 390, 98, textureX, textureY); // Box 128
		bodyModel[155] = new ModelRendererTurbo(this, 327, 52, textureX, textureY); // Box 204
		bodyModel[156] = new ModelRendererTurbo(this, 327, 57, textureX, textureY); // Box 205
		bodyModel[157] = new ModelRendererTurbo(this, 62, 59, textureX, textureY); // Box 190
		bodyModel[158] = new ModelRendererTurbo(this, 61, 55, textureX, textureY); // Box 191
		bodyModel[159] = new ModelRendererTurbo(this, 300, 21, textureX, textureY); // Box 128
		bodyModel[160] = new ModelRendererTurbo(this, 299, 16, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 311, 17, textureX, textureY); // Box 275
		bodyModel[162] = new ModelRendererTurbo(this, 310, 22, textureX, textureY); // Box 276
		bodyModel[163] = new ModelRendererTurbo(this, 79, 297, textureX, textureY); // Box 209
		bodyModel[164] = new ModelRendererTurbo(this, 79, 267, textureX, textureY); // Box 209
		bodyModel[165] = new ModelRendererTurbo(this, 310, 290, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 348, 304, textureX, textureY); // Box 128
		bodyModel[167] = new ModelRendererTurbo(this, 328, 271, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 366, 299, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 383, 306, textureX, textureY); // Box 38
		bodyModel[170] = new ModelRendererTurbo(this, 383, 314, textureX, textureY); // Box 38
		bodyModel[171] = new ModelRendererTurbo(this, 363, 281, textureX, textureY); // Box 128
		bodyModel[172] = new ModelRendererTurbo(this, 397, 281, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 382, 276, textureX, textureY); // Box 128
		bodyModel[174] = new ModelRendererTurbo(this, 100, 228, textureX, textureY); // Box 38
		bodyModel[175] = new ModelRendererTurbo(this, 343, 304, textureX, textureY); // Box 128
		bodyModel[176] = new ModelRendererTurbo(this, 104, 191, textureX, textureY); // Box 38
		bodyModel[177] = new ModelRendererTurbo(this, 106, 196, textureX, textureY); // Box 38
		bodyModel[178] = new ModelRendererTurbo(this, 104, 258, textureX, textureY); // Box 275
		bodyModel[179] = new ModelRendererTurbo(this, 106, 263, textureX, textureY); // Box 276
		bodyModel[180] = new ModelRendererTurbo(this, 88, 259, textureX, textureY); // Box 275
		bodyModel[181] = new ModelRendererTurbo(this, 95, 259, textureX, textureY); // Box 275
		bodyModel[182] = new ModelRendererTurbo(this, 88, 263, textureX, textureY); // Box 275
		bodyModel[183] = new ModelRendererTurbo(this, 101, 263, textureX, textureY); // Box 276
		bodyModel[184] = new ModelRendererTurbo(this, 153, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[185] = new ModelRendererTurbo(this, 160, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[186] = new ModelRendererTurbo(this, 167, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[187] = new ModelRendererTurbo(this, 174, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[188] = new ModelRendererTurbo(this, 181, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[189] = new ModelRendererTurbo(this, 188, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[190] = new ModelRendererTurbo(this, 195, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[191] = new ModelRendererTurbo(this, 99, 267, textureX, textureY); // Right seat part
		bodyModel[192] = new ModelRendererTurbo(this, 99, 295, textureX, textureY); // Left seat part
		bodyModel[193] = new ModelRendererTurbo(this, 130, 267, textureX, textureY); // Right seat part
		bodyModel[194] = new ModelRendererTurbo(this, 130, 295, textureX, textureY); // Left seat part
		bodyModel[195] = new ModelRendererTurbo(this, 161, 267, textureX, textureY); // Right seat part
		bodyModel[196] = new ModelRendererTurbo(this, 161, 295, textureX, textureY); // Left seat part
		bodyModel[197] = new ModelRendererTurbo(this, 192, 267, textureX, textureY); // Right seat part
		bodyModel[198] = new ModelRendererTurbo(this, 192, 295, textureX, textureY); // Left seat part
		bodyModel[199] = new ModelRendererTurbo(this, 223, 267, textureX, textureY); // Right seat part
		bodyModel[200] = new ModelRendererTurbo(this, 223, 295, textureX, textureY); // Left seat part
		bodyModel[201] = new ModelRendererTurbo(this, 254, 267, textureX, textureY); // Right seat part
		bodyModel[202] = new ModelRendererTurbo(this, 254, 295, textureX, textureY); // Left seat part
		bodyModel[203] = new ModelRendererTurbo(this, 285, 267, textureX, textureY); // Right seat part
		bodyModel[204] = new ModelRendererTurbo(this, 285, 308, textureX, textureY); // Box 128
		bodyModel[205] = new ModelRendererTurbo(this, 289, 300, textureX, textureY); // Box 128
		bodyModel[206] = new ModelRendererTurbo(this, 291, 299, textureX, textureY); // Box 128
		bodyModel[207] = new ModelRendererTurbo(this, 288, 300, textureX, textureY); // Box 128
		bodyModel[208] = new ModelRendererTurbo(this, 10, 230, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[209] = new ModelRendererTurbo(this, 11, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[210] = new ModelRendererTurbo(this, 11, 238, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[211] = new ModelRendererTurbo(this, 18, 240, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[212] = new ModelRendererTurbo(this, 25, 238, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[213] = new ModelRendererTurbo(this, 24, 226, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[214] = new ModelRendererTurbo(this, 25, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[215] = new ModelRendererTurbo(this, 10, 226, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[216] = new ModelRendererTurbo(this, 17, 224, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[217] = new ModelRendererTurbo(this, 24, 230, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[218] = new ModelRendererTurbo(this, 300, 310, textureX, textureY); // Box 128
		bodyModel[219] = new ModelRendererTurbo(this, 47, 312, textureX, textureY); // Box 209
		bodyModel[220] = new ModelRendererTurbo(this, 51, 305, textureX, textureY); // Box 209
		bodyModel[221] = new ModelRendererTurbo(this, 58, 308, textureX, textureY); // Box 209
		bodyModel[222] = new ModelRendererTurbo(this, 50, 299, textureX, textureY); // Box 209
		bodyModel[223] = new ModelRendererTurbo(this, 40, 306, textureX, textureY); // Box 209
		bodyModel[224] = new ModelRendererTurbo(this, 42, 313, textureX, textureY); // Box 209
		bodyModel[225] = new ModelRendererTurbo(this, 47, 280, textureX, textureY); // Box 470
		bodyModel[226] = new ModelRendererTurbo(this, 49, 274, textureX, textureY); // Box 471
		bodyModel[227] = new ModelRendererTurbo(this, 58, 276, textureX, textureY); // Box 472
		bodyModel[228] = new ModelRendererTurbo(this, 48, 268, textureX, textureY); // Box 473
		bodyModel[229] = new ModelRendererTurbo(this, 38, 275, textureX, textureY); // Box 474
		bodyModel[230] = new ModelRendererTurbo(this, 42, 281, textureX, textureY); // Box 475
		bodyModel[231] = new ModelRendererTurbo(this, 25, 299, textureX, textureY); // Box 492
		bodyModel[232] = new ModelRendererTurbo(this, 28, 289, textureX, textureY); // Box 493
		bodyModel[233] = new ModelRendererTurbo(this, 28, 296, textureX, textureY); // Box 492
		bodyModel[234] = new ModelRendererTurbo(this, 31, 316, textureX, textureY); // Box 498
		bodyModel[235] = new ModelRendererTurbo(this, 26, 316, textureX, textureY); // Box 499
		bodyModel[236] = new ModelRendererTurbo(this, 26, 312, textureX, textureY); // Box 493
		bodyModel[237] = new ModelRendererTurbo(this, 31, 312, textureX, textureY); // Box 493
		bodyModel[238] = new ModelRendererTurbo(this, 2, 299, textureX, textureY); // Box 492
		bodyModel[239] = new ModelRendererTurbo(this, 5, 289, textureX, textureY); // Box 493
		bodyModel[240] = new ModelRendererTurbo(this, 5, 296, textureX, textureY); // Box 492
		bodyModel[241] = new ModelRendererTurbo(this, 11, 316, textureX, textureY); // Box 498
		bodyModel[242] = new ModelRendererTurbo(this, 6, 316, textureX, textureY); // Box 499
		bodyModel[243] = new ModelRendererTurbo(this, 6, 312, textureX, textureY); // Box 493
		bodyModel[244] = new ModelRendererTurbo(this, 11, 312, textureX, textureY); // Box 493
		bodyModel[245] = new ModelRendererTurbo(this, 24, 271, textureX, textureY); // Box 526
		bodyModel[246] = new ModelRendererTurbo(this, 28, 281, textureX, textureY); // Box 527
		bodyModel[247] = new ModelRendererTurbo(this, 27, 278, textureX, textureY); // Box 532
		bodyModel[248] = new ModelRendererTurbo(this, 27, 263, textureX, textureY); // Box 533
		bodyModel[249] = new ModelRendererTurbo(this, 22, 265, textureX, textureY); // Box 534
		bodyModel[250] = new ModelRendererTurbo(this, 27, 259, textureX, textureY); // Box 535
		bodyModel[251] = new ModelRendererTurbo(this, 22, 261, textureX, textureY); // Box 546
		bodyModel[252] = new ModelRendererTurbo(this, 405, 265, textureX, textureY); // Box 38
		bodyModel[253] = new ModelRendererTurbo(this, 402, 269, textureX, textureY); // Box 38
		bodyModel[254] = new ModelRendererTurbo(this, 407, 269, textureX, textureY); // Box 38
		bodyModel[255] = new ModelRendererTurbo(this, 389, 267, textureX, textureY); // Box 38
		bodyModel[256] = new ModelRendererTurbo(this, 392, 272, textureX, textureY); // Box 38
		bodyModel[257] = new ModelRendererTurbo(this, 407, 273, textureX, textureY); // Box 38
		bodyModel[258] = new ModelRendererTurbo(this, 391, 276, textureX, textureY); // Box 38
		bodyModel[259] = new ModelRendererTurbo(this, 400, 276, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[260] = new ModelRendererTurbo(this, 371, 268, textureX, textureY); // Box 38
		bodyModel[261] = new ModelRendererTurbo(this, 374, 273, textureX, textureY); // Box 38
		bodyModel[262] = new ModelRendererTurbo(this, 373, 277, textureX, textureY); // Box 38
		bodyModel[263] = new ModelRendererTurbo(this, 410, 270, textureX, textureY); // Box 38
		bodyModel[264] = new ModelRendererTurbo(this, 337, 258, textureX, textureY); // Box 38
		bodyModel[265] = new ModelRendererTurbo(this, 336, 262, textureX, textureY); // Box 38
		bodyModel[266] = new ModelRendererTurbo(this, 341, 262, textureX, textureY); // Box 38
		bodyModel[267] = new ModelRendererTurbo(this, 337, 266, textureX, textureY); // Box 38
		bodyModel[268] = new ModelRendererTurbo(this, 328, 248, textureX, textureY); // Box 38
		bodyModel[269] = new ModelRendererTurbo(this, 326, 252, textureX, textureY); // Box 38
		bodyModel[270] = new ModelRendererTurbo(this, 332, 252, textureX, textureY); // Box 38
		bodyModel[271] = new ModelRendererTurbo(this, 329, 256, textureX, textureY); // Box 38
		bodyModel[272] = new ModelRendererTurbo(this, 335, 274, textureX, textureY); // Box 38
		bodyModel[273] = new ModelRendererTurbo(this, 329, 264, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[274] = new ModelRendererTurbo(this, 337, 279, textureX, textureY); // Box 38
		bodyModel[275] = new ModelRendererTurbo(this, 324, 240, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[276] = new ModelRendererTurbo(this, 398, 263, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[277] = new ModelRendererTurbo(this, 331, 241, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[278] = new ModelRendererTurbo(this, 317, 241, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[279] = new ModelRendererTurbo(this, 319, 258, textureX, textureY); // Box 349
		bodyModel[280] = new ModelRendererTurbo(this, 319, 244, textureX, textureY); // Box 349
		bodyModel[281] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 349
		bodyModel[282] = new ModelRendererTurbo(this, 315, 267, textureX, textureY); // Box 38
		bodyModel[283] = new ModelRendererTurbo(this, 315, 278, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[284] = new ModelRendererTurbo(this, 315, 273, textureX, textureY); // Box 38
		bodyModel[285] = new ModelRendererTurbo(this, 318, 262, textureX, textureY); // Box 38
		bodyModel[286] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 128
		bodyModel[287] = new ModelRendererTurbo(this, 55, 23, textureX, textureY); // Box 548
		bodyModel[288] = new ModelRendererTurbo(this, 30, 96, textureX, textureY); // Box 2
		bodyModel[289] = new ModelRendererTurbo(this, 69, 138, textureX, textureY); // Box 553
		bodyModel[290] = new ModelRendererTurbo(this, 69, 141, textureX, textureY); // Box 30
		bodyModel[291] = new ModelRendererTurbo(this, 68, 1, textureX, textureY); // Box 170
		bodyModel[292] = new ModelRendererTurbo(this, 70, 22, textureX, textureY); // Box 524
		bodyModel[293] = new ModelRendererTurbo(this, 68, 0, textureX, textureY); // Box 170
		bodyModel[294] = new ModelRendererTurbo(this, 1, 191, textureX, textureY); // Box 128
		bodyModel[295] = new ModelRendererTurbo(this, 85, 1, textureX, textureY); // Box 169
		bodyModel[296] = new ModelRendererTurbo(this, 102, 13, textureX, textureY); // Box 530
		bodyModel[297] = new ModelRendererTurbo(this, 102, 8, textureX, textureY); // Box 531
		bodyModel[298] = new ModelRendererTurbo(this, 94, 18, textureX, textureY); // Box 169
		bodyModel[299] = new ModelRendererTurbo(this, 85, 6, textureX, textureY); // Box 169
		bodyModel[300] = new ModelRendererTurbo(this, 69, 10, textureX, textureY); // Box 170
		bodyModel[301] = new ModelRendererTurbo(this, 11, 11, textureX, textureY); // Box 128
		bodyModel[302] = new ModelRendererTurbo(this, 27, 9, textureX, textureY); // Box 538
		bodyModel[303] = new ModelRendererTurbo(this, 19, 3, textureX, textureY); // Box 128
		bodyModel[304] = new ModelRendererTurbo(this, 77, 16, textureX, textureY); // Box 540
		bodyModel[305] = new ModelRendererTurbo(this, 2, 203, textureX, textureY); // Box 169
		bodyModel[306] = new ModelRendererTurbo(this, 87, 11, textureX, textureY); // Box 169
		bodyModel[307] = new ModelRendererTurbo(this, 98, 1, textureX, textureY); // Box 543
		bodyModel[308] = new ModelRendererTurbo(this, 60, 34, textureX, textureY); // Box 169
		bodyModel[309] = new ModelRendererTurbo(this, 62, 87, textureX, textureY); // Box 169
		bodyModel[310] = new ModelRendererTurbo(this, 67, 87, textureX, textureY, "glow"); // Box 169 marker lense LF
		bodyModel[311] = new ModelRendererTurbo(this, 57, 87, textureX, textureY, "glow"); // Box 169 marker lense LR
		bodyModel[312] = new ModelRendererTurbo(this, 62, 68, textureX, textureY); // Box 548
		bodyModel[313] = new ModelRendererTurbo(this, 67, 68, textureX, textureY, "glow"); // Box 549 marker lense RF
		bodyModel[314] = new ModelRendererTurbo(this, 57, 68, textureX, textureY, "glow"); // Box 547 marker lense LR
		bodyModel[315] = new ModelRendererTurbo(this, 61, 46, textureX, textureY); // Box 169
		bodyModel[316] = new ModelRendererTurbo(this, 63, 43, textureX, textureY); // Box 169
		bodyModel[317] = new ModelRendererTurbo(this, 60, 39, textureX, textureY); // Box 169
		bodyModel[318] = new ModelRendererTurbo(this, 54, 51, textureX, textureY); // Box 169
		bodyModel[319] = new ModelRendererTurbo(this, 61, 49, textureX, textureY); // Box 555
		bodyModel[320] = new ModelRendererTurbo(this, 56, 56, textureX, textureY); // Box 169
		bodyModel[321] = new ModelRendererTurbo(this, 56, 62, textureX, textureY); // Box 557
		bodyModel[322] = new ModelRendererTurbo(this, 56, 59, textureX, textureY); // Box 169
		bodyModel[323] = new ModelRendererTurbo(this, 61, 25, textureX, textureY); // Box 169
		bodyModel[324] = new ModelRendererTurbo(this, 61, 19, textureX, textureY); // Box 169
		bodyModel[325] = new ModelRendererTurbo(this, 61, 22, textureX, textureY); // Box 169
		bodyModel[326] = new ModelRendererTurbo(this, 61, 31, textureX, textureY); // Box 564
		bodyModel[327] = new ModelRendererTurbo(this, 61, 28, textureX, textureY); // Box 565
		bodyModel[328] = new ModelRendererTurbo(this, 50, 55, textureX, textureY); // Box 555 rear light
		bodyModel[329] = new ModelRendererTurbo(this, 47, 55, textureX, textureY); // Box 555 rear light
		bodyModel[330] = new ModelRendererTurbo(this, 48, 55, textureX, textureY); // Box 555 rear light
		bodyModel[331] = new ModelRendererTurbo(this, 53, 55, textureX, textureY); // Box 555 rear light
		bodyModel[332] = new ModelRendererTurbo(this, 47, 59, textureX, textureY); // Box 555 rear light
		bodyModel[333] = new ModelRendererTurbo(this, 53, 59, textureX, textureY); // Box 555 rear light
		bodyModel[334] = new ModelRendererTurbo(this, 50, 59, textureX, textureY); // Box 555 rear light
		bodyModel[335] = new ModelRendererTurbo(this, 1, 242, textureX, textureY); // Box 576
		bodyModel[336] = new ModelRendererTurbo(this, 1, 232, textureX, textureY); // Box 577
		bodyModel[337] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 584
		bodyModel[338] = new ModelRendererTurbo(this, 11, 258, textureX, textureY); // Box 585
		bodyModel[339] = new ModelRendererTurbo(this, 6, 258, textureX, textureY); // Box 586
		bodyModel[340] = new ModelRendererTurbo(this, 6, 254, textureX, textureY); // Box 587
		bodyModel[341] = new ModelRendererTurbo(this, 11, 254, textureX, textureY); // Box 588
		bodyModel[342] = new ModelRendererTurbo(this, 202, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[343] = new ModelRendererTurbo(this, 285, 323, textureX, textureY); // Left seat part
		bodyModel[344] = new ModelRendererTurbo(this, 285, 253, textureX, textureY); // Box 128
		bodyModel[345] = new ModelRendererTurbo(this, 285, 246, textureX, textureY); // Box 128
		bodyModel[346] = new ModelRendererTurbo(this, 294, 253, textureX, textureY); // Box 128
		bodyModel[347] = new ModelRendererTurbo(this, 300, 257, textureX, textureY); // Box 128
		bodyModel[348] = new ModelRendererTurbo(this, 306, 245, textureX, textureY); // Box 128
		bodyModel[349] = new ModelRendererTurbo(this, 304, 250, textureX, textureY); // Box 128
		bodyModel[350] = new ModelRendererTurbo(this, 302, 261, textureX, textureY); // Box 128
		bodyModel[351] = new ModelRendererTurbo(this, 1, 43, textureX, textureY, "glow"); // Tail Sign glow
		bodyModel[352] = new ModelRendererTurbo(this, 44, 37, textureX, textureY, "glow"); // Tail Sign glow
		bodyModel[353] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[354] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[355] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[356] = new ModelRendererTurbo(this, 353, 243, textureX, textureY); // Box 128
		bodyModel[357] = new ModelRendererTurbo(this, 72, 356, textureX, textureY); // Box 128
		bodyModel[358] = new ModelRendererTurbo(this, 72, 334, textureX, textureY); // Box 177
		bodyModel[359] = new ModelRendererTurbo(this, 72, 340, textureX, textureY); // Box 128
		bodyModel[360] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[361] = new ModelRendererTurbo(this, 453, 36, textureX, textureY); // Box 128
		bodyModel[362] = new ModelRendererTurbo(this, 453, 26, textureX, textureY); // Box 176
		bodyModel[363] = new ModelRendererTurbo(this, 419, 45, textureX, textureY); // Box 128
		bodyModel[364] = new ModelRendererTurbo(this, 84, 252, textureX, textureY); // Box 128
		bodyModel[365] = new ModelRendererTurbo(this, 164, 8, textureX, textureY); // Box 128
		bodyModel[366] = new ModelRendererTurbo(this, 209, 16, textureX, textureY); // Box 128
		bodyModel[367] = new ModelRendererTurbo(this, 175, 2, textureX, textureY); // Box 176
		bodyModel[368] = new ModelRendererTurbo(this, 113, 4, textureX, textureY); // Box 128
		bodyModel[369] = new ModelRendererTurbo(this, 72, 326, textureX, textureY); // Box 194
		bodyModel[370] = new ModelRendererTurbo(this, 72, 367, textureX, textureY); // Box 128
		bodyModel[371] = new ModelRendererTurbo(this, 72, 322, textureX, textureY); // Box 193
		bodyModel[372] = new ModelRendererTurbo(this, 72, 329, textureX, textureY); // Box 192
		bodyModel[373] = new ModelRendererTurbo(this, 72, 370, textureX, textureY); // Box 128
		bodyModel[374] = new ModelRendererTurbo(this, 72, 362, textureX, textureY); // Box 128
		bodyModel[375] = new ModelRendererTurbo(this, 60, 145, textureX, textureY); // Box 128
		bodyModel[376] = new ModelRendererTurbo(this, 74, 151, textureX, textureY); // Box 2
		bodyModel[377] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[378] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[379] = new ModelRendererTurbo(this, 69, 148, textureX, textureY); // Box 128
		bodyModel[380] = new ModelRendererTurbo(this, 69, 151, textureX, textureY); // Box 2
		bodyModel[381] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 2
		bodyModel[382] = new ModelRendererTurbo(this, 71, 155, textureX, textureY); // Box 128
		bodyModel[383] = new ModelRendererTurbo(this, 275, 148, textureX, textureY); // Box 2
		bodyModel[384] = new ModelRendererTurbo(this, 275, 151, textureX, textureY); // Box 2
		bodyModel[385] = new ModelRendererTurbo(this, 266, 148, textureX, textureY); // Box 2
		bodyModel[386] = new ModelRendererTurbo(this, 266, 151, textureX, textureY); // Box 2
		bodyModel[387] = new ModelRendererTurbo(this, 256, 148, textureX, textureY); // Box 2
		bodyModel[388] = new ModelRendererTurbo(this, 259, 151, textureX, textureY); // Box 2
		bodyModel[389] = new ModelRendererTurbo(this, 281, 138, textureX, textureY); // Box 24
		bodyModel[390] = new ModelRendererTurbo(this, 281, 141, textureX, textureY); // Box 25
		bodyModel[391] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 26
		bodyModel[392] = new ModelRendererTurbo(this, 272, 141, textureX, textureY); // Box 27
		bodyModel[393] = new ModelRendererTurbo(this, 262, 138, textureX, textureY); // Box 28
		bodyModel[394] = new ModelRendererTurbo(this, 265, 141, textureX, textureY); // Box 29
		bodyModel[395] = new ModelRendererTurbo(this, 247, 164, textureX, textureY); // Box 140
		bodyModel[396] = new ModelRendererTurbo(this, 248, 167, textureX, textureY); // Box 141
		bodyModel[397] = new ModelRendererTurbo(this, 256, 164, textureX, textureY); // Box 142
		bodyModel[398] = new ModelRendererTurbo(this, 257, 167, textureX, textureY); // Box 143
		bodyModel[399] = new ModelRendererTurbo(this, 247, 155, textureX, textureY); // Box 26
		bodyModel[400] = new ModelRendererTurbo(this, 248, 158, textureX, textureY); // Box 26
		bodyModel[401] = new ModelRendererTurbo(this, 256, 155, textureX, textureY); // Box 26
		bodyModel[402] = new ModelRendererTurbo(this, 257, 158, textureX, textureY); // Box 26
		bodyModel[403] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[404] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 2
		bodyModel[405] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[406] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[407] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[408] = new ModelRendererTurbo(this, 122, 151, textureX, textureY); // Box 2
		bodyModel[409] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[410] = new ModelRendererTurbo(this, 251, 141, textureX, textureY); // Box 35
		bodyModel[411] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[412] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[413] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[414] = new ModelRendererTurbo(this, 122, 141, textureX, textureY); // Box 39
		bodyModel[415] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[416] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 55
		bodyModel[417] = new ModelRendererTurbo(this, 226, 141, textureX, textureY); // Box 39
		bodyModel[418] = new ModelRendererTurbo(this, 205, 141, textureX, textureY); // Box 39
		bodyModel[419] = new ModelRendererTurbo(this, 91, 169, textureX, textureY); // Box 2
		bodyModel[420] = new ModelRendererTurbo(this, 91, 166, textureX, textureY); // Box 521
		bodyModel[421] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[422] = new ModelRendererTurbo(this, 444, 19, textureX, textureY); // Box 153
		bodyModel[423] = new ModelRendererTurbo(this, 410, 89, textureX, textureY); // Box 128
		bodyModel[424] = new ModelRendererTurbo(this, 106, 256, textureX, textureY, "glow"); // Box 275 glow
		bodyModel[425] = new ModelRendererTurbo(this, 106, 199, textureX, textureY, "glow"); // Box 285 glow
		bodyModel[426] = new ModelRendererTurbo(this, 283, 285, textureX, textureY); // Boc 42
		bodyModel[427] = new ModelRendererTurbo(this, 252, 285, textureX, textureY); // Boc 42
		bodyModel[428] = new ModelRendererTurbo(this, 221, 285, textureX, textureY); // Boc 42
		bodyModel[429] = new ModelRendererTurbo(this, 190, 285, textureX, textureY); // Boc 42
		bodyModel[430] = new ModelRendererTurbo(this, 159, 285, textureX, textureY); // Boc 42
		bodyModel[431] = new ModelRendererTurbo(this, 128, 285, textureX, textureY); // Boc 42
		bodyModel[432] = new ModelRendererTurbo(this, 97, 285, textureX, textureY); // Boc 42
		bodyModel[433] = new ModelRendererTurbo(this, 252, 313, textureX, textureY); // Boc 42
		bodyModel[434] = new ModelRendererTurbo(this, 221, 313, textureX, textureY); // Boc 42
		bodyModel[435] = new ModelRendererTurbo(this, 190, 313, textureX, textureY); // Boc 42
		bodyModel[436] = new ModelRendererTurbo(this, 159, 313, textureX, textureY); // Boc 42
		bodyModel[437] = new ModelRendererTurbo(this, 128, 313, textureX, textureY); // Boc 42
		bodyModel[438] = new ModelRendererTurbo(this, 97, 313, textureX, textureY); // Boc 42
		bodyModel[439] = new ModelRendererTurbo(this, 266, 325, textureX, textureY); // Box 638
		bodyModel[440] = new ModelRendererTurbo(this, 110, 267, textureX, textureY); // Right seat part
		bodyModel[441] = new ModelRendererTurbo(this, 110, 295, textureX, textureY); // Left seat part
		bodyModel[442] = new ModelRendererTurbo(this, 141, 267, textureX, textureY); // Right seat part
		bodyModel[443] = new ModelRendererTurbo(this, 141, 295, textureX, textureY); // Left seat part
		bodyModel[444] = new ModelRendererTurbo(this, 172, 267, textureX, textureY); // Right seat part
		bodyModel[445] = new ModelRendererTurbo(this, 172, 295, textureX, textureY); // Left seat part
		bodyModel[446] = new ModelRendererTurbo(this, 203, 295, textureX, textureY); // Left seat part
		bodyModel[447] = new ModelRendererTurbo(this, 234, 267, textureX, textureY); // Right seat part
		bodyModel[448] = new ModelRendererTurbo(this, 234, 295, textureX, textureY); // Left seat part
		bodyModel[449] = new ModelRendererTurbo(this, 265, 267, textureX, textureY); // Right seat part
		bodyModel[450] = new ModelRendererTurbo(this, 265, 295, textureX, textureY); // Left seat part
		bodyModel[451] = new ModelRendererTurbo(this, 296, 274, textureX, textureY); // Right seat part
		bodyModel[452] = new ModelRendererTurbo(this, 295, 267, textureX, textureY); // Right seat part
		bodyModel[453] = new ModelRendererTurbo(this, 301, 277, textureX, textureY); // Right seat part
		bodyModel[454] = new ModelRendererTurbo(this, 303, 274, textureX, textureY); // Right seat part
		bodyModel[455] = new ModelRendererTurbo(this, 296, 277, textureX, textureY); // Right seat part
		bodyModel[456] = new ModelRendererTurbo(this, 310, 274, textureX, textureY); // Right seat part
		bodyModel[457] = new ModelRendererTurbo(this, 296, 282, textureX, textureY); // Right seat part
		bodyModel[458] = new ModelRendererTurbo(this, 301, 285, textureX, textureY); // Right seat part
		bodyModel[459] = new ModelRendererTurbo(this, 303, 282, textureX, textureY); // Right seat part
		bodyModel[460] = new ModelRendererTurbo(this, 296, 285, textureX, textureY); // Right seat part
		bodyModel[461] = new ModelRendererTurbo(this, 310, 282, textureX, textureY); // Right seat part
		bodyModel[462] = new ModelRendererTurbo(this, 265, 274, textureX, textureY); // Right seat part
		bodyModel[463] = new ModelRendererTurbo(this, 270, 277, textureX, textureY); // Right seat part
		bodyModel[464] = new ModelRendererTurbo(this, 272, 274, textureX, textureY); // Right seat part
		bodyModel[465] = new ModelRendererTurbo(this, 265, 277, textureX, textureY); // Right seat part
		bodyModel[466] = new ModelRendererTurbo(this, 279, 274, textureX, textureY); // Right seat part
		bodyModel[467] = new ModelRendererTurbo(this, 265, 282, textureX, textureY); // Right seat part
		bodyModel[468] = new ModelRendererTurbo(this, 270, 285, textureX, textureY); // Right seat part
		bodyModel[469] = new ModelRendererTurbo(this, 272, 282, textureX, textureY); // Right seat part
		bodyModel[470] = new ModelRendererTurbo(this, 265, 285, textureX, textureY); // Right seat part
		bodyModel[471] = new ModelRendererTurbo(this, 279, 282, textureX, textureY); // Right seat part
		bodyModel[472] = new ModelRendererTurbo(this, 234, 274, textureX, textureY); // Right seat part
		bodyModel[473] = new ModelRendererTurbo(this, 239, 277, textureX, textureY); // Right seat part
		bodyModel[474] = new ModelRendererTurbo(this, 241, 274, textureX, textureY); // Right seat part
		bodyModel[475] = new ModelRendererTurbo(this, 234, 277, textureX, textureY); // Right seat part
		bodyModel[476] = new ModelRendererTurbo(this, 248, 274, textureX, textureY); // Right seat part
		bodyModel[477] = new ModelRendererTurbo(this, 234, 282, textureX, textureY); // Right seat part
		bodyModel[478] = new ModelRendererTurbo(this, 239, 285, textureX, textureY); // Right seat part
		bodyModel[479] = new ModelRendererTurbo(this, 241, 282, textureX, textureY); // Right seat part
		bodyModel[480] = new ModelRendererTurbo(this, 234, 285, textureX, textureY); // Right seat part
		bodyModel[481] = new ModelRendererTurbo(this, 248, 282, textureX, textureY); // Right seat part
		bodyModel[482] = new ModelRendererTurbo(this, 203, 274, textureX, textureY); // Right seat part
		bodyModel[483] = new ModelRendererTurbo(this, 208, 277, textureX, textureY); // Right seat part
		bodyModel[484] = new ModelRendererTurbo(this, 210, 274, textureX, textureY); // Right seat part
		bodyModel[485] = new ModelRendererTurbo(this, 203, 277, textureX, textureY); // Right seat part
		bodyModel[486] = new ModelRendererTurbo(this, 217, 274, textureX, textureY); // Right seat part
		bodyModel[487] = new ModelRendererTurbo(this, 203, 282, textureX, textureY); // Right seat part
		bodyModel[488] = new ModelRendererTurbo(this, 208, 285, textureX, textureY); // Right seat part
		bodyModel[489] = new ModelRendererTurbo(this, 210, 282, textureX, textureY); // Right seat part
		bodyModel[490] = new ModelRendererTurbo(this, 203, 285, textureX, textureY); // Right seat part
		bodyModel[491] = new ModelRendererTurbo(this, 217, 282, textureX, textureY); // Right seat part
		bodyModel[492] = new ModelRendererTurbo(this, 172, 274, textureX, textureY); // Right seat part
		bodyModel[493] = new ModelRendererTurbo(this, 177, 277, textureX, textureY); // Right seat part
		bodyModel[494] = new ModelRendererTurbo(this, 179, 274, textureX, textureY); // Right seat part
		bodyModel[495] = new ModelRendererTurbo(this, 172, 277, textureX, textureY); // Right seat part
		bodyModel[496] = new ModelRendererTurbo(this, 186, 274, textureX, textureY); // Right seat part
		bodyModel[497] = new ModelRendererTurbo(this, 172, 282, textureX, textureY); // Right seat part
		bodyModel[498] = new ModelRendererTurbo(this, 177, 285, textureX, textureY); // Right seat part
		bodyModel[499] = new ModelRendererTurbo(this, 179, 282, textureX, textureY); // Right seat part

		bodyModel[0].addBox(0F, 0F, 0F, 117, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-60.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[3].setRotationPoint(-60.5F, 4F, -11F);

		bodyModel[4].addShapeBox(1F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[4].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[5].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[6].setRotationPoint(-55F, 4F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[7].setRotationPoint(59.5F, 3F, -1.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[8].setRotationPoint(56.5F, 3F, -5F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[9].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[10].setRotationPoint(-61.5F, 3F, -5F);

		bodyModel[11].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[11].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[12].setRotationPoint(43F, 4F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[13].setRotationPoint(-45F, 4F, -1F);

		bodyModel[14].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 2
		bodyModel[14].setRotationPoint(0.5F, 3F, 4F);

		bodyModel[15].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 2
		bodyModel[15].setRotationPoint(14.5F, 3F, 4F);

		bodyModel[16].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 52
		bodyModel[16].setRotationPoint(0.5F, 3F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 2
		bodyModel[17].setRotationPoint(23.5F, 3F, 4F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 2
		bodyModel[18].setRotationPoint(-28.5F, 3F, 5F);

		bodyModel[19].addBox(0F, 0F, 0F, 17, 4, 10, 0F); // Box 2
		bodyModel[19].setRotationPoint(-28.5F, 4F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[20].setRotationPoint(-28.5F, 8F, -5F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 59
		bodyModel[21].setRotationPoint(-28.5F, 3F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[22].setRotationPoint(-24.5F, 3F, 7.25F);
		bodyModel[22].rotateAngleX = -0.78539816F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[23].setRotationPoint(-24.51F, 3F, 6.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[24].setRotationPoint(-16.49F, 3F, 6.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[25].setRotationPoint(-15.5F, 3F, 7.25F);
		bodyModel[25].rotateAngleX = -0.78539816F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[26].setRotationPoint(-15.51F, 3F, 6.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[27].setRotationPoint(-7.49F, 3F, 6.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[28].setRotationPoint(-31F, 3F, 4F);
		bodyModel[28].rotateAngleZ = -0.78539816F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[29].setRotationPoint(-31.5F, 3F, 3.99F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[30].setRotationPoint(-31.5F, 3F, 9.01F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[31].setRotationPoint(23.5F, 4F, 0F);
		bodyModel[31].rotateAngleX = -0.78539816F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[32].setRotationPoint(23.49F, 4F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[33].setRotationPoint(31.51F, 4F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[34].setRotationPoint(23.5F, 3F, -7F);
		bodyModel[34].rotateAngleX = -0.78539816F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[35].setRotationPoint(23.49F, 3F, -7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[36].setRotationPoint(29.51F, 3F, -7.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[37].setRotationPoint(-16.5F, 3F, -7.25F);
		bodyModel[37].rotateAngleX = -0.78539816F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[38].setRotationPoint(-16.51F, 3F, -7.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[39].setRotationPoint(-12.49F, 3F, -7.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[40].setRotationPoint(-21F, 3F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[41].setRotationPoint(60.51F, 3F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[42].setRotationPoint(56.49F, 3F, -9F);

		bodyModel[43].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[43].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[44].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[44].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[45].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[45].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[46].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[46].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[47].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[47].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[48].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[48].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[49].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[50].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[50].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[51].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[51].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[52].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[53].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[53].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[54].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[55].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[55].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[56].setRotationPoint(60.51F, 3F, 8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[57].setRotationPoint(56.49F, 3F, 8F);

		bodyModel[58].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[58].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[59].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[59].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[60].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[60].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[61].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[61].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[62].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[62].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[63].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[63].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[64].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[64].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[65].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[65].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[66].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[66].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[67].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[68].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[68].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[69].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[70].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[70].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[71].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[72].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[73].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[73].setRotationPoint(56.51F, -14F, -10.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 117, 16, 1, 0F); // Box 38
		bodyModel[74].setRotationPoint(-60.5F, -15F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 117, 16, 1, 0F); // Box 128
		bodyModel[75].setRotationPoint(-60.5F, -15F, 10F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[76].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[77].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[78].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[79].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[80].setRotationPoint(56.51F, -14F, 10.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[81].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[82].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[83].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[84].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[85].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[86].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[87].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[88].setRotationPoint(55.51F, -14F, 3F);

		bodyModel[89].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[89].setRotationPoint(-60.49F, -14F, -3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[90].setRotationPoint(-63F, -15F, -4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[91].setRotationPoint(-63F, 1F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[92].setRotationPoint(-63F, -14F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[93].setRotationPoint(-63F, -14F, 3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[94].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[95].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[96].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[97].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[98].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[99].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[100].setRotationPoint(-57.5F, -20F, -7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[101].setRotationPoint(-57.5F, -20F, 3F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 122, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[102].setRotationPoint(-60.5F, -16F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 122, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[103].setRotationPoint(-60.5F, -16F, 10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[104].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[105].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[106].setRotationPoint(15.25F, 3F, -10.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[107].setRotationPoint(19.25F, 3F, -10.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[108].setRotationPoint(18.25F, 3F, -10.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, -1.375F, -0.5F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, -0.375F, -0.5F); // Box 38
		bodyModel[109].setRotationPoint(14.25F, 2.75F, -10.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[110].setRotationPoint(15.55F, 3.2F, -10F);
		bodyModel[110].rotateAngleZ = -0.78539816F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[111].setRotationPoint(18.75F, 3.2F, -10F);
		bodyModel[111].rotateAngleZ = -0.78539816F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[112].setRotationPoint(15.05F, 3F, -5.99F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[113].setRotationPoint(18.25F, 3F, -5.99F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[114].setRotationPoint(18.25F, 3F, -9.99F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[115].setRotationPoint(15.05F, 3F, -9.99F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[116].setRotationPoint(56F, -6F, -12F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[117].setRotationPoint(61F, -6F, -12F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[118].setRotationPoint(56F, -6F, 11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[119].setRotationPoint(61F, -6F, 11F);

		bodyModel[120].addShapeBox(0F, 0F, -1F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[120].setRotationPoint(-61F, -6F, -10.5F);
		bodyModel[120].rotateAngleY = -0.78539816F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[121].setRotationPoint(-61F, -6F, 10.5F);
		bodyModel[121].rotateAngleY = 0.78539816F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[122].setRotationPoint(-61.5F, 6F, -10.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[123].setRotationPoint(-61.5F, 6F, 10.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[124].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[125].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[126].setRotationPoint(61.5F, -19F, -10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[127].setRotationPoint(61.5F, -20F, -7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[128].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[129].setRotationPoint(61.5F, -15F, 11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[130].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[131].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[132].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[133].setRotationPoint(63F, -15F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[134].setRotationPoint(63F, -16F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[135].setRotationPoint(63F, 1F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[136].setRotationPoint(63F, -19F, -10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[137].setRotationPoint(63F, -20F, -7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[138].setRotationPoint(63F, -20F, -3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[139].setRotationPoint(63F, -19F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[140].setRotationPoint(63F, -18.75F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[141].setRotationPoint(63F, -15F, 10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[142].setRotationPoint(63F, -16F, 9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[143].setRotationPoint(63F, -19F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[144].setRotationPoint(63F, -20F, 3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[145].setRotationPoint(63F, -18.75F, 4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[146].setRotationPoint(63F, -15F, -5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[147].setRotationPoint(63F, -16F, -4F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[148].setRotationPoint(63F, -16F, 1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[149].setRotationPoint(63F, -14F, -5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[150].setRotationPoint(63F, -14F, 3F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[151].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[152].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[153].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[154].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[155].setRotationPoint(45F, -19.36F, -8.36F);
		bodyModel[155].rotateAngleX = -1.04283423F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[156].setRotationPoint(45F, -17.65F, -10.92F);
		bodyModel[156].rotateAngleX = -0.41887902F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[157].setRotationPoint(-53.5F, -18F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[158].setRotationPoint(-53.5F, -18.5F, -10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F); // Box 128
		bodyModel[159].setRotationPoint(45F, -18.5F, 7.85F);
		bodyModel[159].rotateAngleX = 1.04283423F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F); // Box 128
		bodyModel[160].setRotationPoint(45F, -17.25F, 10F);
		bodyModel[160].rotateAngleX = 0.41887902F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -1.1F, -0.75F, 0F, -0.5F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 275
		bodyModel[161].setRotationPoint(51.5F, -18F, 10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -1F, -0.85F, 0F, -0.5F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 276
		bodyModel[162].setRotationPoint(51.5F, -18.5F, 8F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 209
		bodyModel[163].setRotationPoint(-43.5F, -15F, -10F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 209
		bodyModel[164].setRotationPoint(-43.5F, -15F, 3F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 128
		bodyModel[165].setRotationPoint(35.5F, -15F, -5F);

		bodyModel[166].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 128
		bodyModel[166].setRotationPoint(36.5F, -15F, -6F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[167].setRotationPoint(43.5F, -15F, -6F);

		bodyModel[168].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // Box 128
		bodyModel[168].setRotationPoint(47.5F, -15F, -10F);

		bodyModel[169].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 38
		bodyModel[169].setRotationPoint(49.5F, -10F, -10F);

		bodyModel[170].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 38
		bodyModel[170].setRotationPoint(49.5F, -4F, -10F);

		bodyModel[171].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 128
		bodyModel[171].setRotationPoint(44.5F, -15F, 3F);

		bodyModel[172].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 128
		bodyModel[172].setRotationPoint(52.5F, -15F, 4F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[173].setRotationPoint(48.5F, -15F, 4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 78, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[174].setRotationPoint(-42.5F, -17F, -2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[175].setRotationPoint(35.5F, -15F, -6F);

		bodyModel[176].addBox(0F, 0F, 0F, 78, 1, 3, 0F); // Box 38
		bodyModel[176].setRotationPoint(-42.5F, -14F, 7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[177].setRotationPoint(-42.5F, -13F, 9F);

		bodyModel[178].addBox(0F, 0F, 0F, 69, 1, 3, 0F); // Box 275
		bodyModel[178].setRotationPoint(-42.5F, -14F, -10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[179].setRotationPoint(-42.5F, -13F, -10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[180].setRotationPoint(28.5F, -14F, -10F);

		bodyModel[181].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 275
		bodyModel[181].setRotationPoint(26.5F, -14F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 275
		bodyModel[182].setRotationPoint(26.5F, -14F, -8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F); // Box 276
		bodyModel[183].setRotationPoint(26.5F, -13F, -10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[184].setRotationPoint(-38.5F, -16.5F, -0.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[185].setRotationPoint(-28.5F, -16.5F, -0.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[186].setRotationPoint(-18.5F, -16.5F, -0.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[187].setRotationPoint(-8.5F, -16.5F, -0.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[188].setRotationPoint(1.5F, -16.5F, -0.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[189].setRotationPoint(11.5F, -16.5F, -0.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[190].setRotationPoint(21.5F, -16.5F, -0.5F);

		bodyModel[191].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[191].setRotationPoint(-36.5F, -8F, 7F);

		bodyModel[192].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[192].setRotationPoint(-36.5F, -8F, -7F);

		bodyModel[193].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[193].setRotationPoint(-26.5F, -8F, 7F);

		bodyModel[194].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[194].setRotationPoint(-26.5F, -8F, -7F);

		bodyModel[195].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[195].setRotationPoint(-16.5F, -8F, 7F);

		bodyModel[196].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[196].setRotationPoint(-16.5F, -8F, -7F);

		bodyModel[197].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[197].setRotationPoint(-6.5F, -8F, 7F);

		bodyModel[198].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[198].setRotationPoint(-6.5F, -8F, -7F);

		bodyModel[199].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[199].setRotationPoint(3.5F, -8F, 7F);

		bodyModel[200].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[200].setRotationPoint(3.5F, -8F, -7F);

		bodyModel[201].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[201].setRotationPoint(13.5F, -8F, 7F);

		bodyModel[202].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[202].setRotationPoint(13.5F, -8F, -7F);

		bodyModel[203].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[203].setRotationPoint(23.5F, -8F, 7F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 128
		bodyModel[204].setRotationPoint(29.5F, -5F, -10F);

		bodyModel[205].addBox(0F, 0F, 0F, 0, 4, 3, 0F); // Box 128
		bodyModel[205].setRotationPoint(30F, -9F, -10F);

		bodyModel[206].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 128
		bodyModel[206].setRotationPoint(30F, -10F, -10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[207].setRotationPoint(30F, -10F, -8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[208].setRotationPoint(-59.5F, -15F, 2.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[209].setRotationPoint(-59.5F, -15F, -4.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[210].setRotationPoint(-56.5F, -15F, -8F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[211].setRotationPoint(-53F, -15F, -8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[212].setRotationPoint(-49.5F, -15F, -8F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[213].setRotationPoint(-46.5F, -15F, 2.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[214].setRotationPoint(-46.5F, -15F, -4.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[215].setRotationPoint(-56.5F, -15F, 6F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[216].setRotationPoint(-53F, -15F, 6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[217].setRotationPoint(-49.5F, -15F, 6F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[218].setRotationPoint(30.5F, -7F, -9F);

		bodyModel[219].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 209
		bodyModel[219].setRotationPoint(-45.5F, -1F, -10F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 209
		bodyModel[220].setRotationPoint(-48.5F, -1F, -10F);

		bodyModel[221].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 209
		bodyModel[221].setRotationPoint(-46.5F, -3F, -10F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 209
		bodyModel[222].setRotationPoint(-49.5F, -3F, -10F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 209
		bodyModel[223].setRotationPoint(-49.5F, -6F, -7F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 209
		bodyModel[224].setRotationPoint(-49.5F, -5F, -3.71F);
		bodyModel[224].rotateAngleY = -0.78539816F;

		bodyModel[225].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 470
		bodyModel[225].setRotationPoint(-45.5F, -1F, 4F);

		bodyModel[226].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 471
		bodyModel[226].setRotationPoint(-48.5F, -1F, 8F);

		bodyModel[227].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 472
		bodyModel[227].setRotationPoint(-46.5F, -3F, 3F);

		bodyModel[228].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 473
		bodyModel[228].setRotationPoint(-49.5F, -3F, 7F);

		bodyModel[229].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 474
		bodyModel[229].setRotationPoint(-49.5F, -6F, 3F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 475
		bodyModel[230].setRotationPoint(-49.5F, -5F, 3.71F);
		bodyModel[230].rotateAngleY = -0.78539816F;

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[231].setRotationPoint(-54.25F, -3F, -8F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[232].setRotationPoint(-54.25F, -7F, -9F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[233].setRotationPoint(-54.25F, -2.5F, -9F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 498
		bodyModel[234].setRotationPoint(-51.74F, -2.5F, -9.51F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 499
		bodyModel[235].setRotationPoint(-54.26F, -2.5F, -9.51F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[236].setRotationPoint(-54.26F, -4.5F, -9.01F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[237].setRotationPoint(-51.74F, -4.5F, -9.01F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[238].setRotationPoint(-58.75F, -3F, -8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[239].setRotationPoint(-58.75F, -7F, -9F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[240].setRotationPoint(-58.75F, -2.5F, -9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 498
		bodyModel[241].setRotationPoint(-56.24F, -2.5F, -9.51F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 499
		bodyModel[242].setRotationPoint(-58.76F, -2.5F, -9.51F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[243].setRotationPoint(-58.76F, -4.5F, -9.01F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[244].setRotationPoint(-56.24F, -4.5F, -9.01F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[245].setRotationPoint(-54.25F, -3F, 4F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[246].setRotationPoint(-54.25F, -7F, 8F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[247].setRotationPoint(-54.25F, -2.5F, 8F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 533
		bodyModel[248].setRotationPoint(-51.74F, -2.5F, 8.51F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 534
		bodyModel[249].setRotationPoint(-54.26F, -2.5F, 8.51F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[250].setRotationPoint(-51.74F, -4.5F, 8.01F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[251].setRotationPoint(-54.26F, -4.5F, 8.01F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[252].setRotationPoint(53.5F, -6F, 9F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[253].setRotationPoint(53.5F, -6F, 8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[254].setRotationPoint(54.5F, -6F, 8F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[255].setRotationPoint(49.55F, -2F, 8.55F);
		bodyModel[255].rotateAngleY = -0.78539816F;

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[256].setRotationPoint(49.9F, -1F, 8.9F);
		bodyModel[256].rotateAngleY = -0.78539816F;

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[257].setRotationPoint(54.87F, -4.5F, 8.63F);
		bodyModel[257].rotateAngleY = 0.78539816F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[258].setRotationPoint(49.55F, 0.5F, 8.55F);
		bodyModel[258].rotateAngleY = -0.78539816F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[259].setRotationPoint(51.5F, -4F, 9.49F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[260].setRotationPoint(47.05F, -2F, 9.95F);
		bodyModel[260].rotateAngleY = -2.35619449F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[261].setRotationPoint(47.4F, -1F, 9.6F);
		bodyModel[261].rotateAngleY = -2.35619449F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[262].setRotationPoint(47.05F, 0.5F, 9.95F);
		bodyModel[262].rotateAngleY = -2.35619449F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[263].setRotationPoint(54.5F, -5F, 5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[264].setRotationPoint(41.5F, -6F, 9F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[265].setRotationPoint(41.5F, -6F, 8F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[266].setRotationPoint(42.5F, -6F, 8F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[267].setRotationPoint(42.87F, -4.5F, 8.63F);
		bodyModel[267].rotateAngleY = 0.78539816F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[268].setRotationPoint(36.5F, -6F, 9F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[269].setRotationPoint(37.5F, -6F, 8F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[270].setRotationPoint(36.5F, -6F, 8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[271].setRotationPoint(37.47F, -4.5F, 8.63F);
		bodyModel[271].rotateAngleY = 0.78539816F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[272].setRotationPoint(42F, -6F, 1F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[273].setRotationPoint(39.25F, -4F, 9.49F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[274].setRotationPoint(42.92F, -4.5F, 1.63F);
		bodyModel[274].rotateAngleY = 0.78539816F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[275].setRotationPoint(39F, -15F, 9.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[276].setRotationPoint(51F, -15F, 9.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[277].setRotationPoint(41.5F, -13.5F, 9.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[278].setRotationPoint(36.5F, -13.5F, 9.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[279].setRotationPoint(36.5F, -6F, -5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[280].setRotationPoint(36.5F, -15F, -5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[281].setRotationPoint(36.5F, -13F, -5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[282].setRotationPoint(37F, -3.5F, -3.5F);
		bodyModel[282].rotateAngleY = -0.78539816F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38 cull
		bodyModel[283].setRotationPoint(37F, -2.5F, -3.5F);
		bodyModel[283].rotateAngleY = -0.78539816F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 0, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[284].setRotationPoint(37F, -1.25F, -3.5F);
		bodyModel[284].rotateAngleY = -0.78539816F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		bodyModel[285].setRotationPoint(38.06F, -6F, -2.44F);
		bodyModel[285].rotateAngleY = -0.78539816F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 128
		bodyModel[286].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[287].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[288].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 2
		bodyModel[288].setRotationPoint(-61.5F, 1F, -10F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F); // Box 553
		bodyModel[289].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[290].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 170
		bodyModel[291].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, -2F, 0F, -1F, -1F, 0F, 1.25F, 0F, -1F, 1.25F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[292].setRotationPoint(-61.5F, -16F, -12F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[293].setRotationPoint(-61.5F, -17F, 3F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[294].setRotationPoint(-60.5F, -17.25F, -10F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -3F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 169
		bodyModel[295].setRotationPoint(-60.5F, -19F, 7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -3F, 0.75F, 0F); // Box 530
		bodyModel[296].setRotationPoint(-60.5F, -19F, -10F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1.75F, 0F, -3F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.32F, 0F, 0F, 0.75F, 0F, -3F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 531
		bodyModel[297].setRotationPoint(-60.5F, -19F, -10F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 169
		bodyModel[298].setRotationPoint(-60.5F, -20F, -3F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1.32F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -3F, 0F, 0.75F, 0F); // Box 169
		bodyModel[299].setRotationPoint(-60.5F, -19F, 7F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -1F, 1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 170
		bodyModel[300].setRotationPoint(-61.5F, -17F, -3F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[301].setRotationPoint(-61.5F, -16F, 3F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[302].setRotationPoint(-61.5F, -16F, -10F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[303].setRotationPoint(-61.5F, -16F, -3F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, -1F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 540
		bodyModel[304].setRotationPoint(-61.5F, -17F, -10F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[305].setRotationPoint(-60.5F, -18.25F, -3F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.32F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 169
		bodyModel[306].setRotationPoint(-60.5F, -20F, 3F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -2.32F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 543
		bodyModel[307].setRotationPoint(-60.5F, -20F, -7F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F); // Box 169
		bodyModel[308].setRotationPoint(-60.5F, -20F, -1F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 169
		bodyModel[309].setRotationPoint(-56.5F, -14F, 11F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, 0F, -1F); // Box 169 marker lense LF
		bodyModel[310].setRotationPoint(-55.5F, -14F, 11F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, -0.5F, -1F); // Box 169 marker lense LR
		bodyModel[311].setRotationPoint(-56.75F, -14F, 11F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 548
		bodyModel[312].setRotationPoint(-56.5F, -14F, -12F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 549 marker lense RF
		bodyModel[313].setRotationPoint(-55.5F, -14F, -12F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 547 marker lense LR
		bodyModel[314].setRotationPoint(-56.75F, -14F, -12F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 169
		bodyModel[315].setRotationPoint(-61.5F, -20.95F, -0.35F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 169
		bodyModel[316].setRotationPoint(-61.5F, -20.95F, 0.35F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 169
		bodyModel[317].setRotationPoint(-60.5F, -20.3F, -1F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F); // Box 169
		bodyModel[318].setRotationPoint(-61.5F, -20.3F, -1F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 555
		bodyModel[319].setRotationPoint(-61.5F, -20.95F, -1.35F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 169
		bodyModel[320].setRotationPoint(-61.5F, -20.05F, 0.35F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[321].setRotationPoint(-61.5F, -20.05F, -1.35F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 169
		bodyModel[322].setRotationPoint(-61.5F, -19.7F, -0.35F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.05F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.3F, 0F, -0.05F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 169
		bodyModel[323].setRotationPoint(-57.5F, -21F, -0.35F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.95F, 0F, 0F, -0.3F, 0F, -0.7F, -0.05F, -0.5F, -0.7F, -0.05F, -0.5F, -0.7F, -0.95F, 0F, -0.7F, -0.3F); // Box 169
		bodyModel[324].setRotationPoint(-57.5F, -20.3F, 0.3F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.05F, -0.05F, -0.5F, -1F, -0.05F, -0.5F, -1F, -0.95F, 0F, -0.7F, -0.3F, 0F, -0.3F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.95F, 0F, -0.3F, -0.3F); // Box 169
		bodyModel[325].setRotationPoint(-57.5F, -21F, 0.3F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.3F, -0.5F, -0.3F, -0.95F, -0.5F, -0.3F, -0.05F, 0F, 0F, -0.05F, 0F, -0.7F, -0.3F, -0.5F, -0.7F, -0.95F, -0.5F, -0.7F, -0.05F, 0F, -0.7F, -0.05F); // Box 564
		bodyModel[326].setRotationPoint(-57.5F, -20.3F, -1.3F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.7F, -0.3F, -0.5F, -1F, -0.95F, -0.5F, -1F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.3F, -0.3F, -0.5F, 0F, -0.95F, -0.5F, 0F, -0.05F, 0F, -0.3F, -0.05F); // Box 565
		bodyModel[327].setRotationPoint(-57.5F, -21F, -1.3F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 555 rear light
		bodyModel[328].setRotationPoint(-61.51F, -20.95F, -0.35F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 555 rear light
		bodyModel[329].setRotationPoint(-61.51F, -20.95F, 0.35F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F); // Box 555 rear light
		bodyModel[330].setRotationPoint(-61.51F, -20.3F, -1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 555 rear light
		bodyModel[331].setRotationPoint(-61.51F, -20.95F, -1.35F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 555 rear light
		bodyModel[332].setRotationPoint(-61.51F, -20.05F, 0.35F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555 rear light
		bodyModel[333].setRotationPoint(-61.51F, -20.05F, -1.35F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 555 rear light
		bodyModel[334].setRotationPoint(-61.51F, -19.7F, -0.35F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 576
		bodyModel[335].setRotationPoint(-58.75F, -3F, 4F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 577
		bodyModel[336].setRotationPoint(-58.75F, -7F, 8F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[337].setRotationPoint(-58.75F, -2.5F, 8F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 585
		bodyModel[338].setRotationPoint(-56.24F, -2.5F, 8.51F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 586
		bodyModel[339].setRotationPoint(-58.76F, -2.5F, 8.51F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[340].setRotationPoint(-58.76F, -4.5F, 8.01F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[341].setRotationPoint(-56.24F, -4.5F, 8.01F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[342].setRotationPoint(31.5F, -16.5F, -0.5F);

		bodyModel[343].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[343].setRotationPoint(23.5F, -8F, -7F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[344].setRotationPoint(29.5F, -5F, 4F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[345].setRotationPoint(30.5F, -5F, 6F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[346].setRotationPoint(30.5F, -4F, 6F);

		bodyModel[347].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[347].setRotationPoint(32.5F, -3F, 7F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[348].setRotationPoint(34.5F, -6F, 7F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 128
		bodyModel[349].setRotationPoint(34.5F, -4F, 7F);

		bodyModel[350].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 128
		bodyModel[350].setRotationPoint(33.62F, -2F, 8F);
		bodyModel[350].rotateAngleY = -0.78539816F;

		bodyModel[351].addShapeBox(0F, 0F, 0F, 0, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Tail Sign glow
		bodyModel[351].setRotationPoint(-61.51F, -5F, 5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 0, 5, 8, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F); // Tail Sign glow
		bodyModel[352].setRotationPoint(-61.51F, -5F, -13F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 119, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[353].setRotationPoint(-57.5F, -19F, -10F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 119, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[354].setRotationPoint(-57.5F, -19F, 7F);

		bodyModel[355].addBox(0F, 0F, 0F, 119, 2, 6, 0F); // Box 128
		bodyModel[355].setRotationPoint(-57.5F, -20F, -3F);

		bodyModel[356].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 128
		bodyModel[356].setRotationPoint(35.49F, -17F, -6F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[357].setRotationPoint(-57.5F, -19F, -7F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[358].setRotationPoint(-57.5F, -19F, 3F);

		bodyModel[359].addBox(0F, 0F, 0F, 119, 1, 14, 0F); // Box 128
		bodyModel[359].setRotationPoint(-57.5F, -18F, -7F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 26, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[360].setRotationPoint(35.5F, -17F, -7F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 26, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[361].setRotationPoint(35.5F, -18F, -10F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 26, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[362].setRotationPoint(35.5F, -18F, 7F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 26, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[363].setRotationPoint(35.5F, -16.25F, -10F);

		bodyModel[364].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 128
		bodyModel[364].setRotationPoint(-42.49F, -17F, 4F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 15, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[365].setRotationPoint(-57.5F, -17F, -7F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[366].setRotationPoint(-57.5F, -18F, -10F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[367].setRotationPoint(-57.5F, -18F, 7F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 15, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[368].setRotationPoint(-57.5F, -16.25F, -10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[369].setRotationPoint(-42.5F, -18F, 7.25F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[370].setRotationPoint(-42.5F, -18F, -8.25F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[371].setRotationPoint(-42.5F, -16F, 8F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 78, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[372].setRotationPoint(-42.5F, -17F, 5.25F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[373].setRotationPoint(-42.5F, -16F, -10F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 78, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[374].setRotationPoint(-42.5F, -17F, -8.25F);

		bodyModel[375].addShapeBox(0F, -1F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[375].setRotationPoint(-61.5F, 6F, -10.5F);
		bodyModel[375].rotateAngleX = 0.2443461F;

		bodyModel[376].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[376].setRotationPoint(-60.5F, 4F, 10F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 2
		bodyModel[377].setRotationPoint(-53.25F, 3F, 10F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 2
		bodyModel[378].setRotationPoint(-55F, 4F, 10F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 128
		bodyModel[379].setRotationPoint(-61.5F, 3F, 10F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F); // Box 2
		bodyModel[380].setRotationPoint(-61.5F, 4F, 10F);

		bodyModel[381].addShapeBox(1F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[381].setRotationPoint(-61.5F, 3F, 10F);

		bodyModel[382].addShapeBox(0F, -1F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[382].setRotationPoint(-61.5F, 6F, 10.5F);
		bodyModel[382].rotateAngleX = -0.2443461F;

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[383].setRotationPoint(60.5F, 3F, 10F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[384].setRotationPoint(60.5F, 4F, 10F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[385].setRotationPoint(53.5F, 3F, 10F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[386].setRotationPoint(54.5F, 4F, 10F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 2
		bodyModel[387].setRotationPoint(52.25F, 3F, 10F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 2
		bodyModel[388].setRotationPoint(53F, 4F, 10F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[389].setRotationPoint(60.5F, 3F, -11F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[390].setRotationPoint(60.5F, 4F, -11F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[391].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[392].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[393].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[394].setRotationPoint(53F, 4F, -11F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		bodyModel[395].setRotationPoint(56.5F, 3F, 7F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		bodyModel[396].setRotationPoint(56.5F, 4F, 8F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[397].setRotationPoint(60.5F, 3F, 7F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[398].setRotationPoint(60.5F, 4F, 8F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[399].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[400].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[401].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[402].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 2
		bodyModel[403].setRotationPoint(34.75F, 3F, 10F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 2
		bodyModel[404].setRotationPoint(33F, 4F, 10F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 2
		bodyModel[405].setRotationPoint(-35.75F, 3F, 10F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 2
		bodyModel[406].setRotationPoint(-35F, 4F, 10F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[407].setRotationPoint(-34.5F, 3F, 10F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 60, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[408].setRotationPoint(-26.5F, 4F, 10F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[409].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[410].setRotationPoint(33F, 4F, -11F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[411].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[412].setRotationPoint(-35F, 4F, -11F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[413].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 40, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[414].setRotationPoint(-26.5F, 4F, -11F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[415].setRotationPoint(-33.5F, 4F, 10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[416].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[417].setRotationPoint(22.5F, 4F, -11F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		bodyModel[418].setRotationPoint(13.5F, 4F, -11F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[419].setRotationPoint(-27.5F, 5F, 9.75F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 521
		bodyModel[420].setRotationPoint(-27.5F, 5F, -10.75F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[421].setRotationPoint(63F, -16F, -5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[422].setRotationPoint(63F, -16F, 0F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[423].setRotationPoint(63F, 1F, -5F);

		bodyModel[424].addBox(0F, 0F, 0F, 69, 0, 1, 0F); // Box 275 glow
		bodyModel[424].setRotationPoint(-42.5F, -12.99F, -8.5F);

		bodyModel[425].addBox(0F, 0F, 0F, 78, 0, 1, 0F); // Box 285 glow
		bodyModel[425].setRotationPoint(-42.5F, -12.99F, 7.5F);

		bodyModel[426].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[426].setRotationPoint(22F, 0F, 4F);

		bodyModel[427].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[427].setRotationPoint(12F, 0F, 4F);

		bodyModel[428].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[428].setRotationPoint(2F, 0F, 4F);

		bodyModel[429].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[429].setRotationPoint(-8F, 0F, 4F);

		bodyModel[430].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[430].setRotationPoint(-18F, 0F, 4F);

		bodyModel[431].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[431].setRotationPoint(-28F, 0F, 4F);

		bodyModel[432].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[432].setRotationPoint(-38F, 0F, 4F);

		bodyModel[433].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[433].setRotationPoint(12F, 0F, -10F);

		bodyModel[434].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[434].setRotationPoint(2F, 0F, -10F);

		bodyModel[435].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[435].setRotationPoint(-8F, 0F, -10F);

		bodyModel[436].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[436].setRotationPoint(-18F, 0F, -10F);

		bodyModel[437].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[437].setRotationPoint(-28F, 0F, -10F);

		bodyModel[438].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[438].setRotationPoint(-38F, 0F, -10F);

		bodyModel[439].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 638
		bodyModel[439].setRotationPoint(22F, 0F, -10F);

		bodyModel[440].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[440].setRotationPoint(-36.5F, -3F, 7F);

		bodyModel[441].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[441].setRotationPoint(-36.5F, -3F, -7F);

		bodyModel[442].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[442].setRotationPoint(-26.5F, -3F, 7F);

		bodyModel[443].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[443].setRotationPoint(-26.5F, -3F, -7F);

		bodyModel[444].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[444].setRotationPoint(-16.5F, -3F, 7F);

		bodyModel[445].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[445].setRotationPoint(-16.5F, -3F, -7F);

		bodyModel[446].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[446].setRotationPoint(-6.5F, -3F, -7F);

		bodyModel[447].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[447].setRotationPoint(3.5F, -3F, 7F);

		bodyModel[448].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[448].setRotationPoint(3.5F, -3F, -7F);

		bodyModel[449].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[449].setRotationPoint(13.5F, -3F, 7F);

		bodyModel[450].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[450].setRotationPoint(13.5F, -3F, -7F);

		bodyModel[451].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[451].setRotationPoint(23.5F, -5F, 7F);

		bodyModel[452].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[452].setRotationPoint(23.5F, -3F, 7F);

		bodyModel[453].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[453].setRotationPoint(23.5F, -3F, 7F);

		bodyModel[454].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[454].setRotationPoint(23.5F, -5F, 7F);

		bodyModel[455].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[455].setRotationPoint(23.5F, -4.5F, 7F);

		bodyModel[456].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[456].setRotationPoint(23.5F, -4F, 7F);

		bodyModel[457].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[457].setRotationPoint(23.5F, -5F, 7F);

		bodyModel[458].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[458].setRotationPoint(23.5F, -3F, 7F);

		bodyModel[459].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[459].setRotationPoint(23.5F, -5F, 7F);

		bodyModel[460].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[460].setRotationPoint(23.5F, -4.5F, 7F);

		bodyModel[461].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[461].setRotationPoint(23.5F, -4F, 7F);

		bodyModel[462].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[462].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[463].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[463].setRotationPoint(13.5F, -3F, 7F);

		bodyModel[464].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[464].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[465].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[465].setRotationPoint(13.5F, -4.5F, 7F);

		bodyModel[466].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[466].setRotationPoint(13.5F, -4F, 7F);

		bodyModel[467].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[467].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[468].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[468].setRotationPoint(13.5F, -3F, 7F);

		bodyModel[469].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[469].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[470].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[470].setRotationPoint(13.5F, -4.5F, 7F);

		bodyModel[471].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[471].setRotationPoint(13.5F, -4F, 7F);

		bodyModel[472].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[472].setRotationPoint(3.5F, -5F, 7F);

		bodyModel[473].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[473].setRotationPoint(3.5F, -3F, 7F);

		bodyModel[474].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[474].setRotationPoint(3.5F, -5F, 7F);

		bodyModel[475].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[475].setRotationPoint(3.5F, -4.5F, 7F);

		bodyModel[476].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[476].setRotationPoint(3.5F, -4F, 7F);

		bodyModel[477].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[477].setRotationPoint(3.5F, -5F, 7F);

		bodyModel[478].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[478].setRotationPoint(3.5F, -3F, 7F);

		bodyModel[479].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[479].setRotationPoint(3.5F, -5F, 7F);

		bodyModel[480].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[480].setRotationPoint(3.5F, -4.5F, 7F);

		bodyModel[481].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[481].setRotationPoint(3.5F, -4F, 7F);

		bodyModel[482].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[482].setRotationPoint(-6.5F, -5F, 7F);

		bodyModel[483].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[483].setRotationPoint(-6.5F, -3F, 7F);

		bodyModel[484].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[484].setRotationPoint(-6.5F, -5F, 7F);

		bodyModel[485].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[485].setRotationPoint(-6.5F, -4.5F, 7F);

		bodyModel[486].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[486].setRotationPoint(-6.5F, -4F, 7F);

		bodyModel[487].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[487].setRotationPoint(-6.5F, -5F, 7F);

		bodyModel[488].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[488].setRotationPoint(-6.5F, -3F, 7F);

		bodyModel[489].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[489].setRotationPoint(-6.5F, -5F, 7F);

		bodyModel[490].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[490].setRotationPoint(-6.5F, -4.5F, 7F);

		bodyModel[491].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[491].setRotationPoint(-6.5F, -4F, 7F);

		bodyModel[492].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[492].setRotationPoint(-16.5F, -5F, 7F);

		bodyModel[493].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[493].setRotationPoint(-16.5F, -3F, 7F);

		bodyModel[494].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[494].setRotationPoint(-16.5F, -5F, 7F);

		bodyModel[495].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[495].setRotationPoint(-16.5F, -4.5F, 7F);

		bodyModel[496].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[496].setRotationPoint(-16.5F, -4F, 7F);

		bodyModel[497].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[497].setRotationPoint(-16.5F, -5F, 7F);

		bodyModel[498].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[498].setRotationPoint(-16.5F, -3F, 7F);

		bodyModel[499].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[499].setRotationPoint(-16.5F, -5F, 7F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 172, 285, textureX, textureY); // Right seat part
		bodyModel[501] = new ModelRendererTurbo(this, 186, 282, textureX, textureY); // Right seat part
		bodyModel[502] = new ModelRendererTurbo(this, 141, 274, textureX, textureY); // Right seat part
		bodyModel[503] = new ModelRendererTurbo(this, 146, 277, textureX, textureY); // Right seat part
		bodyModel[504] = new ModelRendererTurbo(this, 148, 274, textureX, textureY); // Right seat part
		bodyModel[505] = new ModelRendererTurbo(this, 141, 277, textureX, textureY); // Right seat part
		bodyModel[506] = new ModelRendererTurbo(this, 155, 274, textureX, textureY); // Right seat part
		bodyModel[507] = new ModelRendererTurbo(this, 141, 282, textureX, textureY); // Right seat part
		bodyModel[508] = new ModelRendererTurbo(this, 146, 285, textureX, textureY); // Right seat part
		bodyModel[509] = new ModelRendererTurbo(this, 148, 282, textureX, textureY); // Right seat part
		bodyModel[510] = new ModelRendererTurbo(this, 141, 285, textureX, textureY); // Right seat part
		bodyModel[511] = new ModelRendererTurbo(this, 155, 282, textureX, textureY); // Right seat part
		bodyModel[512] = new ModelRendererTurbo(this, 110, 274, textureX, textureY); // Right seat part
		bodyModel[513] = new ModelRendererTurbo(this, 115, 277, textureX, textureY); // Right seat part
		bodyModel[514] = new ModelRendererTurbo(this, 117, 274, textureX, textureY); // Right seat part
		bodyModel[515] = new ModelRendererTurbo(this, 110, 277, textureX, textureY); // Right seat part
		bodyModel[516] = new ModelRendererTurbo(this, 124, 274, textureX, textureY); // Right seat part
		bodyModel[517] = new ModelRendererTurbo(this, 110, 282, textureX, textureY); // Right seat part
		bodyModel[518] = new ModelRendererTurbo(this, 115, 285, textureX, textureY); // Right seat part
		bodyModel[519] = new ModelRendererTurbo(this, 117, 282, textureX, textureY); // Right seat part
		bodyModel[520] = new ModelRendererTurbo(this, 110, 285, textureX, textureY); // Right seat part
		bodyModel[521] = new ModelRendererTurbo(this, 124, 282, textureX, textureY); // Right seat part
		bodyModel[522] = new ModelRendererTurbo(this, 265, 302, textureX, textureY); // Left seat part
		bodyModel[523] = new ModelRendererTurbo(this, 270, 305, textureX, textureY); // Left seat part
		bodyModel[524] = new ModelRendererTurbo(this, 272, 302, textureX, textureY); // Left seat part
		bodyModel[525] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Left seat part
		bodyModel[526] = new ModelRendererTurbo(this, 279, 302, textureX, textureY); // Left seat part
		bodyModel[527] = new ModelRendererTurbo(this, 265, 310, textureX, textureY); // Left seat part
		bodyModel[528] = new ModelRendererTurbo(this, 270, 313, textureX, textureY); // Left seat part
		bodyModel[529] = new ModelRendererTurbo(this, 272, 310, textureX, textureY); // Left seat part
		bodyModel[530] = new ModelRendererTurbo(this, 265, 313, textureX, textureY); // Left seat part
		bodyModel[531] = new ModelRendererTurbo(this, 279, 310, textureX, textureY); // Left seat part
		bodyModel[532] = new ModelRendererTurbo(this, 234, 302, textureX, textureY); // Left seat part
		bodyModel[533] = new ModelRendererTurbo(this, 239, 305, textureX, textureY); // Left seat part
		bodyModel[534] = new ModelRendererTurbo(this, 241, 302, textureX, textureY); // Left seat part
		bodyModel[535] = new ModelRendererTurbo(this, 234, 305, textureX, textureY); // Left seat part
		bodyModel[536] = new ModelRendererTurbo(this, 248, 302, textureX, textureY); // Left seat part
		bodyModel[537] = new ModelRendererTurbo(this, 234, 310, textureX, textureY); // Left seat part
		bodyModel[538] = new ModelRendererTurbo(this, 239, 313, textureX, textureY); // Left seat part
		bodyModel[539] = new ModelRendererTurbo(this, 241, 310, textureX, textureY); // Left seat part
		bodyModel[540] = new ModelRendererTurbo(this, 234, 313, textureX, textureY); // Left seat part
		bodyModel[541] = new ModelRendererTurbo(this, 248, 310, textureX, textureY); // Left seat part
		bodyModel[542] = new ModelRendererTurbo(this, 203, 302, textureX, textureY); // Left seat part
		bodyModel[543] = new ModelRendererTurbo(this, 208, 305, textureX, textureY); // Left seat part
		bodyModel[544] = new ModelRendererTurbo(this, 210, 302, textureX, textureY); // Left seat part
		bodyModel[545] = new ModelRendererTurbo(this, 203, 305, textureX, textureY); // Left seat part
		bodyModel[546] = new ModelRendererTurbo(this, 217, 302, textureX, textureY); // Left seat part
		bodyModel[547] = new ModelRendererTurbo(this, 203, 310, textureX, textureY); // Left seat part
		bodyModel[548] = new ModelRendererTurbo(this, 208, 313, textureX, textureY); // Left seat part
		bodyModel[549] = new ModelRendererTurbo(this, 210, 310, textureX, textureY); // Left seat part
		bodyModel[550] = new ModelRendererTurbo(this, 203, 313, textureX, textureY); // Left seat part
		bodyModel[551] = new ModelRendererTurbo(this, 217, 310, textureX, textureY); // Left seat part
		bodyModel[552] = new ModelRendererTurbo(this, 172, 302, textureX, textureY); // Left seat part
		bodyModel[553] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Left seat part
		bodyModel[554] = new ModelRendererTurbo(this, 179, 302, textureX, textureY); // Left seat part
		bodyModel[555] = new ModelRendererTurbo(this, 172, 305, textureX, textureY); // Left seat part
		bodyModel[556] = new ModelRendererTurbo(this, 186, 302, textureX, textureY); // Left seat part
		bodyModel[557] = new ModelRendererTurbo(this, 172, 310, textureX, textureY); // Left seat part
		bodyModel[558] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Left seat part
		bodyModel[559] = new ModelRendererTurbo(this, 179, 310, textureX, textureY); // Left seat part
		bodyModel[560] = new ModelRendererTurbo(this, 172, 313, textureX, textureY); // Left seat part
		bodyModel[561] = new ModelRendererTurbo(this, 186, 310, textureX, textureY); // Left seat part
		bodyModel[562] = new ModelRendererTurbo(this, 141, 302, textureX, textureY); // Left seat part
		bodyModel[563] = new ModelRendererTurbo(this, 146, 305, textureX, textureY); // Left seat part
		bodyModel[564] = new ModelRendererTurbo(this, 148, 302, textureX, textureY); // Left seat part
		bodyModel[565] = new ModelRendererTurbo(this, 141, 305, textureX, textureY); // Left seat part
		bodyModel[566] = new ModelRendererTurbo(this, 155, 302, textureX, textureY); // Left seat part
		bodyModel[567] = new ModelRendererTurbo(this, 141, 310, textureX, textureY); // Left seat part
		bodyModel[568] = new ModelRendererTurbo(this, 146, 313, textureX, textureY); // Left seat part
		bodyModel[569] = new ModelRendererTurbo(this, 148, 310, textureX, textureY); // Left seat part
		bodyModel[570] = new ModelRendererTurbo(this, 141, 313, textureX, textureY); // Left seat part
		bodyModel[571] = new ModelRendererTurbo(this, 155, 310, textureX, textureY); // Left seat part
		bodyModel[572] = new ModelRendererTurbo(this, 110, 302, textureX, textureY); // Left seat part
		bodyModel[573] = new ModelRendererTurbo(this, 115, 305, textureX, textureY); // Left seat part
		bodyModel[574] = new ModelRendererTurbo(this, 117, 302, textureX, textureY); // Left seat part
		bodyModel[575] = new ModelRendererTurbo(this, 110, 305, textureX, textureY); // Left seat part
		bodyModel[576] = new ModelRendererTurbo(this, 124, 302, textureX, textureY); // Left seat part
		bodyModel[577] = new ModelRendererTurbo(this, 110, 310, textureX, textureY); // Left seat part
		bodyModel[578] = new ModelRendererTurbo(this, 115, 313, textureX, textureY); // Left seat part
		bodyModel[579] = new ModelRendererTurbo(this, 117, 310, textureX, textureY); // Left seat part
		bodyModel[580] = new ModelRendererTurbo(this, 110, 313, textureX, textureY); // Left seat part
		bodyModel[581] = new ModelRendererTurbo(this, 124, 310, textureX, textureY); // Left seat part
		bodyModel[582] = new ModelRendererTurbo(this, 203, 267, textureX, textureY); // Right seat part
		bodyModel[583] = new ModelRendererTurbo(this, 296, 323, textureX, textureY); // Left seat part
		bodyModel[584] = new ModelRendererTurbo(this, 317, 323, textureX, textureY); // Left seat part
		bodyModel[585] = new ModelRendererTurbo(this, 322, 326, textureX, textureY); // Left seat part
		bodyModel[586] = new ModelRendererTurbo(this, 324, 323, textureX, textureY); // Left seat part
		bodyModel[587] = new ModelRendererTurbo(this, 317, 326, textureX, textureY); // Left seat part
		bodyModel[588] = new ModelRendererTurbo(this, 331, 323, textureX, textureY); // Left seat part
		bodyModel[589] = new ModelRendererTurbo(this, 317, 331, textureX, textureY); // Left seat part
		bodyModel[590] = new ModelRendererTurbo(this, 322, 334, textureX, textureY); // Left seat part
		bodyModel[591] = new ModelRendererTurbo(this, 324, 331, textureX, textureY); // Left seat part
		bodyModel[592] = new ModelRendererTurbo(this, 317, 334, textureX, textureY); // Left seat part
		bodyModel[593] = new ModelRendererTurbo(this, 331, 331, textureX, textureY); // Left seat part
		bodyModel[594] = new ModelRendererTurbo(this, 17, 287, textureX, textureY); // Right seat part
		bodyModel[595] = new ModelRendererTurbo(this, 19, 291, textureX, textureY); // Right seat part
		bodyModel[596] = new ModelRendererTurbo(this, 17, 299, textureX, textureY); // Right seat part
		bodyModel[597] = new ModelRendererTurbo(this, 7, 273, textureX, textureY); // Right seat part
		bodyModel[598] = new ModelRendererTurbo(this, 9, 277, textureX, textureY); // Right seat part
		bodyModel[599] = new ModelRendererTurbo(this, 7, 285, textureX, textureY); // Right seat part
		bodyModel[600] = new ModelRendererTurbo(this, 80, 379, textureX, textureY); // Box 38
		bodyModel[601] = new ModelRendererTurbo(this, 72, 374, textureX, textureY); // Box 462
		bodyModel[602] = new ModelRendererTurbo(this, 89, 386, textureX, textureY); // Box 38
		bodyModel[603] = new ModelRendererTurbo(this, 89, 384, textureX, textureY); // Box 452
		bodyModel[604] = new ModelRendererTurbo(this, 38, 361, textureX, textureY); // Box 38
		bodyModel[605] = new ModelRendererTurbo(this, 75, 379, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[606] = new ModelRendererTurbo(this, 67, 373, textureX, textureY, "cull"); // Box 808 cull
		bodyModel[607] = new ModelRendererTurbo(this, 55, 321, textureX, textureY); // Box 498
		bodyModel[608] = new ModelRendererTurbo(this, 38, 321, textureX, textureY); // Box 498
		bodyModel[609] = new ModelRendererTurbo(this, 21, 321, textureX, textureY); // Box 498
		bodyModel[610] = new ModelRendererTurbo(this, 4, 321, textureX, textureY); // Box 498
		bodyModel[611] = new ModelRendererTurbo(this, 55, 249, textureX, textureY); // Box 735
		bodyModel[612] = new ModelRendererTurbo(this, 38, 249, textureX, textureY); // Box 736
		bodyModel[613] = new ModelRendererTurbo(this, 51, 230, textureX, textureY); // Box 735
		bodyModel[614] = new ModelRendererTurbo(this, 34, 230, textureX, textureY); // Box 736

		bodyModel[500].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[500].setRotationPoint(-16.5F, -4.5F, 7F);

		bodyModel[501].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[501].setRotationPoint(-16.5F, -4F, 7F);

		bodyModel[502].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[502].setRotationPoint(-26.5F, -5F, 7F);

		bodyModel[503].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[503].setRotationPoint(-26.5F, -3F, 7F);

		bodyModel[504].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[504].setRotationPoint(-26.5F, -5F, 7F);

		bodyModel[505].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[505].setRotationPoint(-26.5F, -4.5F, 7F);

		bodyModel[506].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[506].setRotationPoint(-26.5F, -4F, 7F);

		bodyModel[507].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[507].setRotationPoint(-26.5F, -5F, 7F);

		bodyModel[508].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[508].setRotationPoint(-26.5F, -3F, 7F);

		bodyModel[509].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[509].setRotationPoint(-26.5F, -5F, 7F);

		bodyModel[510].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[510].setRotationPoint(-26.5F, -4.5F, 7F);

		bodyModel[511].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[511].setRotationPoint(-26.5F, -4F, 7F);

		bodyModel[512].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[512].setRotationPoint(-36.5F, -5F, 7F);

		bodyModel[513].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[513].setRotationPoint(-36.5F, -3F, 7F);

		bodyModel[514].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[514].setRotationPoint(-36.5F, -5F, 7F);

		bodyModel[515].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[515].setRotationPoint(-36.5F, -4.5F, 7F);

		bodyModel[516].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[516].setRotationPoint(-36.5F, -4F, 7F);

		bodyModel[517].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[517].setRotationPoint(-36.5F, -5F, 7F);

		bodyModel[518].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[518].setRotationPoint(-36.5F, -3F, 7F);

		bodyModel[519].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[519].setRotationPoint(-36.5F, -5F, 7F);

		bodyModel[520].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[520].setRotationPoint(-36.5F, -4.5F, 7F);

		bodyModel[521].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[521].setRotationPoint(-36.5F, -4F, 7F);

		bodyModel[522].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[522].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[523].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[523].setRotationPoint(13.5F, -3F, -7F);

		bodyModel[524].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[524].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[525].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[525].setRotationPoint(13.5F, -4.5F, -7F);

		bodyModel[526].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[526].setRotationPoint(13.5F, -4F, -7F);

		bodyModel[527].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[527].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[528].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[528].setRotationPoint(13.5F, -3F, -7F);

		bodyModel[529].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[529].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[530].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[530].setRotationPoint(13.5F, -4.5F, -7F);

		bodyModel[531].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[531].setRotationPoint(13.5F, -4F, -7F);

		bodyModel[532].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[532].setRotationPoint(3.5F, -5F, -7F);

		bodyModel[533].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[533].setRotationPoint(3.5F, -3F, -7F);

		bodyModel[534].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[534].setRotationPoint(3.5F, -5F, -7F);

		bodyModel[535].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[535].setRotationPoint(3.5F, -4.5F, -7F);

		bodyModel[536].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[536].setRotationPoint(3.5F, -4F, -7F);

		bodyModel[537].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[537].setRotationPoint(3.5F, -5F, -7F);

		bodyModel[538].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[538].setRotationPoint(3.5F, -3F, -7F);

		bodyModel[539].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[539].setRotationPoint(3.5F, -5F, -7F);

		bodyModel[540].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[540].setRotationPoint(3.5F, -4.5F, -7F);

		bodyModel[541].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[541].setRotationPoint(3.5F, -4F, -7F);

		bodyModel[542].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[542].setRotationPoint(-6.5F, -5F, -7F);

		bodyModel[543].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[543].setRotationPoint(-6.5F, -3F, -7F);

		bodyModel[544].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[544].setRotationPoint(-6.5F, -5F, -7F);

		bodyModel[545].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[545].setRotationPoint(-6.5F, -4.5F, -7F);

		bodyModel[546].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[546].setRotationPoint(-6.5F, -4F, -7F);

		bodyModel[547].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[547].setRotationPoint(-6.5F, -5F, -7F);

		bodyModel[548].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[548].setRotationPoint(-6.5F, -3F, -7F);

		bodyModel[549].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[549].setRotationPoint(-6.5F, -5F, -7F);

		bodyModel[550].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[550].setRotationPoint(-6.5F, -4.5F, -7F);

		bodyModel[551].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[551].setRotationPoint(-6.5F, -4F, -7F);

		bodyModel[552].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[552].setRotationPoint(-16.5F, -5F, -7F);

		bodyModel[553].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[553].setRotationPoint(-16.5F, -3F, -7F);

		bodyModel[554].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[554].setRotationPoint(-16.5F, -5F, -7F);

		bodyModel[555].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[555].setRotationPoint(-16.5F, -4.5F, -7F);

		bodyModel[556].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[556].setRotationPoint(-16.5F, -4F, -7F);

		bodyModel[557].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[557].setRotationPoint(-16.5F, -5F, -7F);

		bodyModel[558].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[558].setRotationPoint(-16.5F, -3F, -7F);

		bodyModel[559].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[559].setRotationPoint(-16.5F, -5F, -7F);

		bodyModel[560].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[560].setRotationPoint(-16.5F, -4.5F, -7F);

		bodyModel[561].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[561].setRotationPoint(-16.5F, -4F, -7F);

		bodyModel[562].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[562].setRotationPoint(-26.5F, -5F, -7F);

		bodyModel[563].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[563].setRotationPoint(-26.5F, -3F, -7F);

		bodyModel[564].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[564].setRotationPoint(-26.5F, -5F, -7F);

		bodyModel[565].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[565].setRotationPoint(-26.5F, -4.5F, -7F);

		bodyModel[566].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[566].setRotationPoint(-26.5F, -4F, -7F);

		bodyModel[567].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[567].setRotationPoint(-26.5F, -5F, -7F);

		bodyModel[568].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[568].setRotationPoint(-26.5F, -3F, -7F);

		bodyModel[569].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[569].setRotationPoint(-26.5F, -5F, -7F);

		bodyModel[570].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[570].setRotationPoint(-26.5F, -4.5F, -7F);

		bodyModel[571].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[571].setRotationPoint(-26.5F, -4F, -7F);

		bodyModel[572].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[572].setRotationPoint(-36.5F, -5F, -7F);

		bodyModel[573].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[573].setRotationPoint(-36.5F, -3F, -7F);

		bodyModel[574].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[574].setRotationPoint(-36.5F, -5F, -7F);

		bodyModel[575].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[575].setRotationPoint(-36.5F, -4.5F, -7F);

		bodyModel[576].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[576].setRotationPoint(-36.5F, -4F, -7F);

		bodyModel[577].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[577].setRotationPoint(-36.5F, -5F, -7F);

		bodyModel[578].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[578].setRotationPoint(-36.5F, -3F, -7F);

		bodyModel[579].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[579].setRotationPoint(-36.5F, -5F, -7F);

		bodyModel[580].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[580].setRotationPoint(-36.5F, -4.5F, -7F);

		bodyModel[581].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[581].setRotationPoint(-36.5F, -4F, -7F);

		bodyModel[582].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[582].setRotationPoint(-6.5F, -3F, 7F);

		bodyModel[583].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[583].setRotationPoint(23.5F, -3F, -7F);

		bodyModel[584].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[584].setRotationPoint(23.5F, -5F, -7F);

		bodyModel[585].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[585].setRotationPoint(23.5F, -3F, -7F);

		bodyModel[586].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[586].setRotationPoint(23.5F, -5F, -7F);

		bodyModel[587].addShapeBox(1F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[587].setRotationPoint(23.5F, -4.5F, -7F);

		bodyModel[588].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[588].setRotationPoint(23.5F, -4F, -7F);

		bodyModel[589].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[589].setRotationPoint(23.5F, -5F, -7F);

		bodyModel[590].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[590].setRotationPoint(23.5F, -3F, -7F);

		bodyModel[591].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[591].setRotationPoint(23.5F, -5F, -7F);

		bodyModel[592].addShapeBox(1F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[592].setRotationPoint(23.5F, -4.5F, -7F);

		bodyModel[593].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[593].setRotationPoint(23.5F, -4F, -7F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[594].setRotationPoint(-56F, -5F, -4F);

		bodyModel[595].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[595].setRotationPoint(-55F, -5.5F, -3F);
		bodyModel[595].rotateAngleY = -0.78539816F;

		bodyModel[596].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[596].setRotationPoint(-56F, 0.5F, -4F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[597].setRotationPoint(-56F, -5F, 2F);

		bodyModel[598].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[598].setRotationPoint(-55F, -5.5F, 3F);
		bodyModel[598].rotateAngleY = -0.78539816F;

		bodyModel[599].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[599].setRotationPoint(-56F, 0.5F, 2F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 107, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[600].setRotationPoint(-59.5F, -10F, -9.9F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 115, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[601].setRotationPoint(-59.5F, -10F, 9.9F);

		bodyModel[602].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 38
		bodyModel[602].setRotationPoint(-47.5F, -1.5F, -11.01F);

		bodyModel[603].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 452
		bodyModel[603].setRotationPoint(-47.5F, -1.5F, 11.01F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 0, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[604].setRotationPoint(-60.4F, -10F, -9F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 38 cull
		bodyModel[605].setRotationPoint(-60.4F, -10F, -9.9F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 808 cull
		bodyModel[606].setRotationPoint(-60.4F, -10F, 8.9F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[607].setRotationPoint(-51.25F, -4.5F, -9F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[608].setRotationPoint(-54.75F, -4.5F, -9F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[609].setRotationPoint(-55.75F, -4.5F, -9F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[610].setRotationPoint(-59.25F, -4.5F, -9F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 735
		bodyModel[611].setRotationPoint(-51.25F, -4.5F, 2F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 736
		bodyModel[612].setRotationPoint(-54.75F, -4.5F, 2F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 735
		bodyModel[613].setRotationPoint(-55.75F, -4.5F, 2F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 736
		bodyModel[614].setRotationPoint(-59.25F, -4.5F, 2F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 615; i++)
		{
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("glow")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("glow")) {
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
		}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==123465){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}