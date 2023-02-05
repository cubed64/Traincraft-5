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

public class ModelPS54SeatCoach_Lounge extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPS54SeatCoach_Lounge() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[570];

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
		bodyModel[3] = new ModelRendererTurbo(this, 275, 148, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 275, 151, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 266, 148, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 266, 151, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 256, 148, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 259, 151, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 74, 151, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 122, 151, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 281, 138, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 281, 141, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 272, 141, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 262, 138, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 265, 141, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 74, 141, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 251, 141, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 122, 141, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 30, 122, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 202, 173, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 239, 173, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 151, 163, textureX, textureY); // Box 52
		bodyModel[45] = new ModelRendererTurbo(this, 266, 174, textureX, textureY); // Box 2
		bodyModel[46] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[47] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 55
		bodyModel[48] = new ModelRendererTurbo(this, 141, 174, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 2
		bodyModel[50] = new ModelRendererTurbo(this, 96, 172, textureX, textureY); // Box 2
		bodyModel[51] = new ModelRendererTurbo(this, 74, 158, textureX, textureY); // Box 59
		bodyModel[52] = new ModelRendererTurbo(this, 156, 177, textureX, textureY); // Box 41
		bodyModel[53] = new ModelRendererTurbo(this, 156, 175, textureX, textureY); // Box 41
		bodyModel[54] = new ModelRendererTurbo(this, 176, 175, textureX, textureY); // Box 41
		bodyModel[55] = new ModelRendererTurbo(this, 179, 177, textureX, textureY); // Box 41
		bodyModel[56] = new ModelRendererTurbo(this, 179, 175, textureX, textureY); // Box 41
		bodyModel[57] = new ModelRendererTurbo(this, 199, 175, textureX, textureY); // Box 41
		bodyModel[58] = new ModelRendererTurbo(this, 89, 157, textureX, textureY); // Box 41
		bodyModel[59] = new ModelRendererTurbo(this, 91, 158, textureX, textureY); // Box 41
		bodyModel[60] = new ModelRendererTurbo(this, 101, 158, textureX, textureY); // Box 41
		bodyModel[61] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 41
		bodyModel[62] = new ModelRendererTurbo(this, 219, 160, textureX, textureY); // Box 41
		bodyModel[63] = new ModelRendererTurbo(this, 239, 160, textureX, textureY); // Box 41
		bodyModel[64] = new ModelRendererTurbo(this, 200, 162, textureX, textureY); // Box 41
		bodyModel[65] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Box 41
		bodyModel[66] = new ModelRendererTurbo(this, 216, 160, textureX, textureY); // Box 41
		bodyModel[67] = new ModelRendererTurbo(this, 226, 141, textureX, textureY); // Box 39
		bodyModel[68] = new ModelRendererTurbo(this, 205, 141, textureX, textureY); // Box 39
		bodyModel[69] = new ModelRendererTurbo(this, 150, 156, textureX, textureY); // Box 41
		bodyModel[70] = new ModelRendererTurbo(this, 150, 154, textureX, textureY); // Box 41
		bodyModel[71] = new ModelRendererTurbo(this, 162, 154, textureX, textureY); // Box 41
		bodyModel[72] = new ModelRendererTurbo(this, 141, 162, textureX, textureY); // Box 41
		bodyModel[73] = new ModelRendererTurbo(this, 256, 154, textureX, textureY); // Box 24
		bodyModel[74] = new ModelRendererTurbo(this, 249, 154, textureX, textureY); // Box 24
		bodyModel[75] = new ModelRendererTurbo(this, 331, 62, textureX, textureY); // Left step part
		bodyModel[76] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Left step part
		bodyModel[77] = new ModelRendererTurbo(this, 331, 68, textureX, textureY); // Left step part
		bodyModel[78] = new ModelRendererTurbo(this, 329, 71, textureX, textureY); // Left step part
		bodyModel[79] = new ModelRendererTurbo(this, 331, 77, textureX, textureY); // Left step part
		bodyModel[80] = new ModelRendererTurbo(this, 322, 79, textureX, textureY); // Left step part
		bodyModel[81] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Left step part
		bodyModel[82] = new ModelRendererTurbo(this, 323, 74, textureX, textureY); // Left step part
		bodyModel[83] = new ModelRendererTurbo(this, 340, 79, textureX, textureY); // Left step part
		bodyModel[84] = new ModelRendererTurbo(this, 340, 77, textureX, textureY); // Left step part
		bodyModel[85] = new ModelRendererTurbo(this, 341, 74, textureX, textureY); // Left step part
		bodyModel[86] = new ModelRendererTurbo(this, 331, 74, textureX, textureY); // Left step part
		bodyModel[87] = new ModelRendererTurbo(this, 327, 81, textureX, textureY); // Left step part
		bodyModel[88] = new ModelRendererTurbo(this, 256, 163, textureX, textureY); // Box 144
		bodyModel[89] = new ModelRendererTurbo(this, 249, 163, textureX, textureY); // Box 145
		bodyModel[90] = new ModelRendererTurbo(this, 331, 87, textureX, textureY); // Right step part
		bodyModel[91] = new ModelRendererTurbo(this, 329, 90, textureX, textureY); // Right step part
		bodyModel[92] = new ModelRendererTurbo(this, 331, 93, textureX, textureY); // Right step part
		bodyModel[93] = new ModelRendererTurbo(this, 329, 96, textureX, textureY); // Right step part
		bodyModel[94] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Right step part
		bodyModel[95] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Right step part
		bodyModel[96] = new ModelRendererTurbo(this, 322, 98, textureX, textureY); // Right step part
		bodyModel[97] = new ModelRendererTurbo(this, 323, 95, textureX, textureY); // Right step part
		bodyModel[98] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[99] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[100] = new ModelRendererTurbo(this, 341, 95, textureX, textureY); // Right step part
		bodyModel[101] = new ModelRendererTurbo(this, 331, 99, textureX, textureY); // Right step part
		bodyModel[102] = new ModelRendererTurbo(this, 327, 106, textureX, textureY); // Right step part
		bodyModel[103] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[104] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[105] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[106] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[107] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[113] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[121] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[122] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[124] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[125] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[126] = new ModelRendererTurbo(this, 188, 156, textureX, textureY); // Box 38
		bodyModel[127] = new ModelRendererTurbo(this, 195, 160, textureX, textureY); // Box 38
		bodyModel[128] = new ModelRendererTurbo(this, 197, 155, textureX, textureY); // Box 38
		bodyModel[129] = new ModelRendererTurbo(this, 183, 155, textureX, textureY); // Box 38
		bodyModel[130] = new ModelRendererTurbo(this, 203, 155, textureX, textureY); // Box 41
		bodyModel[131] = new ModelRendererTurbo(this, 222, 155, textureX, textureY); // Box 41
		bodyModel[132] = new ModelRendererTurbo(this, 212, 155, textureX, textureY); // Box 41
		bodyModel[133] = new ModelRendererTurbo(this, 231, 155, textureX, textureY); // Box 41
		bodyModel[134] = new ModelRendererTurbo(this, 223, 155, textureX, textureY); // Box 41
		bodyModel[135] = new ModelRendererTurbo(this, 204, 155, textureX, textureY); // Box 41
		bodyModel[136] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[139] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[140] = new ModelRendererTurbo(this, 51, 78, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 60, 97, textureX, textureY); // Box 202
		bodyModel[142] = new ModelRendererTurbo(this, 63, 145, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[144] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 38
		bodyModel[145] = new ModelRendererTurbo(this, 374, 103, textureX, textureY); // Box 128
		bodyModel[146] = new ModelRendererTurbo(this, 373, 97, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 372, 91, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 370, 83, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 366, 67, textureX, textureY); // Box 248
		bodyModel[150] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 250
		bodyModel[151] = new ModelRendererTurbo(this, 373, 72, textureX, textureY); // Box 252
		bodyModel[152] = new ModelRendererTurbo(this, 372, 77, textureX, textureY); // Box 254
		bodyModel[153] = new ModelRendererTurbo(this, 371, 86, textureX, textureY); // Box 38
		bodyModel[154] = new ModelRendererTurbo(this, 385, 102, textureX, textureY); // Box 128
		bodyModel[155] = new ModelRendererTurbo(this, 414, 67, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 384, 96, textureX, textureY); // Box 128
		bodyModel[157] = new ModelRendererTurbo(this, 383, 90, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 381, 82, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 419, 45, textureX, textureY); // Box 128
		bodyModel[160] = new ModelRendererTurbo(this, 427, 46, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 247
		bodyModel[162] = new ModelRendererTurbo(this, 385, 67, textureX, textureY); // Box 249
		bodyModel[163] = new ModelRendererTurbo(this, 384, 71, textureX, textureY); // Box 251
		bodyModel[164] = new ModelRendererTurbo(this, 383, 76, textureX, textureY); // Box 253
		bodyModel[165] = new ModelRendererTurbo(this, 413, 46, textureX, textureY); // Box 255
		bodyModel[166] = new ModelRendererTurbo(this, 411, 53, textureX, textureY); // Box 128
		bodyModel[167] = new ModelRendererTurbo(this, 423, 52, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 413, 52, textureX, textureY); // Box 153
		bodyModel[169] = new ModelRendererTurbo(this, 427, 69, textureX, textureY); // Box 128
		bodyModel[170] = new ModelRendererTurbo(this, 412, 69, textureX, textureY); // Box 128
		bodyModel[171] = new ModelRendererTurbo(this, 403, 69, textureX, textureY); // Box 128
		bodyModel[172] = new ModelRendererTurbo(this, 403, 89, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 390, 59, textureX, textureY); // Box 128
		bodyModel[174] = new ModelRendererTurbo(this, 390, 98, textureX, textureY); // Box 128
		bodyModel[175] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[176] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[177] = new ModelRendererTurbo(this, 19, 102, textureX, textureY); // Box 128
		bodyModel[178] = new ModelRendererTurbo(this, 28, 103, textureX, textureY); // Box 128
		bodyModel[179] = new ModelRendererTurbo(this, 5, 130, textureX, textureY); // Box 128
		bodyModel[180] = new ModelRendererTurbo(this, 18, 96, textureX, textureY); // Box 128
		bodyModel[181] = new ModelRendererTurbo(this, 27, 97, textureX, textureY); // Box 128
		bodyModel[182] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[183] = new ModelRendererTurbo(this, 26, 91, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 24, 83, textureX, textureY); // Box 128
		bodyModel[186] = new ModelRendererTurbo(this, 10, 108, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 18, 109, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[189] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[190] = new ModelRendererTurbo(this, 19, 67, textureX, textureY); // Box 249
		bodyModel[191] = new ModelRendererTurbo(this, 28, 67, textureX, textureY); // Box 250
		bodyModel[192] = new ModelRendererTurbo(this, 18, 71, textureX, textureY); // Box 251
		bodyModel[193] = new ModelRendererTurbo(this, 27, 72, textureX, textureY); // Box 252
		bodyModel[194] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 253
		bodyModel[195] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 254
		bodyModel[196] = new ModelRendererTurbo(this, 4, 109, textureX, textureY); // Box 255
		bodyModel[197] = new ModelRendererTurbo(this, 2, 120, textureX, textureY); // Box 128
		bodyModel[198] = new ModelRendererTurbo(this, 14, 115, textureX, textureY); // Box 128
		bodyModel[199] = new ModelRendererTurbo(this, 4, 115, textureX, textureY); // Box 153
		bodyModel[200] = new ModelRendererTurbo(this, 18, 132, textureX, textureY); // Box 128
		bodyModel[201] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 128
		bodyModel[202] = new ModelRendererTurbo(this, 1, 59, textureX, textureY); // Box 128
		bodyModel[203] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 128
		bodyModel[204] = new ModelRendererTurbo(this, 1, 69, textureX, textureY); // Box 128
		bodyModel[205] = new ModelRendererTurbo(this, 1, 98, textureX, textureY); // Box 128
		bodyModel[206] = new ModelRendererTurbo(this, 327, 52, textureX, textureY); // Box 204
		bodyModel[207] = new ModelRendererTurbo(this, 327, 57, textureX, textureY); // Box 205
		bodyModel[208] = new ModelRendererTurbo(this, 62, 59, textureX, textureY); // Box 190
		bodyModel[209] = new ModelRendererTurbo(this, 61, 55, textureX, textureY); // Box 191
		bodyModel[210] = new ModelRendererTurbo(this, 300, 21, textureX, textureY); // Box 128
		bodyModel[211] = new ModelRendererTurbo(this, 299, 16, textureX, textureY); // Box 128
		bodyModel[212] = new ModelRendererTurbo(this, 311, 17, textureX, textureY); // Box 275
		bodyModel[213] = new ModelRendererTurbo(this, 310, 22, textureX, textureY); // Box 276
		bodyModel[214] = new ModelRendererTurbo(this, 79, 297, textureX, textureY); // Box 209
		bodyModel[215] = new ModelRendererTurbo(this, 79, 267, textureX, textureY); // Box 209
		bodyModel[216] = new ModelRendererTurbo(this, 310, 290, textureX, textureY); // Box 128
		bodyModel[217] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 209
		bodyModel[218] = new ModelRendererTurbo(this, 20, 178, textureX, textureY); // Box 209
		bodyModel[219] = new ModelRendererTurbo(this, 348, 304, textureX, textureY); // Box 128
		bodyModel[220] = new ModelRendererTurbo(this, 328, 271, textureX, textureY); // Box 128
		bodyModel[221] = new ModelRendererTurbo(this, 366, 299, textureX, textureY); // Box 128
		bodyModel[222] = new ModelRendererTurbo(this, 383, 306, textureX, textureY); // Box 38
		bodyModel[223] = new ModelRendererTurbo(this, 383, 314, textureX, textureY); // Box 38
		bodyModel[224] = new ModelRendererTurbo(this, 363, 281, textureX, textureY); // Box 128
		bodyModel[225] = new ModelRendererTurbo(this, 397, 281, textureX, textureY); // Box 128
		bodyModel[226] = new ModelRendererTurbo(this, 382, 276, textureX, textureY); // Box 128
		bodyModel[227] = new ModelRendererTurbo(this, 100, 228, textureX, textureY); // Box 38
		bodyModel[228] = new ModelRendererTurbo(this, 343, 304, textureX, textureY); // Box 128
		bodyModel[229] = new ModelRendererTurbo(this, 104, 191, textureX, textureY); // Box 38
		bodyModel[230] = new ModelRendererTurbo(this, 106, 196, textureX, textureY); // Box 38
		bodyModel[231] = new ModelRendererTurbo(this, 104, 258, textureX, textureY); // Box 275
		bodyModel[232] = new ModelRendererTurbo(this, 106, 263, textureX, textureY); // Box 276
		bodyModel[233] = new ModelRendererTurbo(this, 88, 259, textureX, textureY); // Box 275
		bodyModel[234] = new ModelRendererTurbo(this, 95, 259, textureX, textureY); // Box 275
		bodyModel[235] = new ModelRendererTurbo(this, 88, 263, textureX, textureY); // Box 275
		bodyModel[236] = new ModelRendererTurbo(this, 101, 263, textureX, textureY); // Box 276
		bodyModel[237] = new ModelRendererTurbo(this, 153, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[238] = new ModelRendererTurbo(this, 160, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[239] = new ModelRendererTurbo(this, 167, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[240] = new ModelRendererTurbo(this, 174, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[241] = new ModelRendererTurbo(this, 181, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[242] = new ModelRendererTurbo(this, 188, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[243] = new ModelRendererTurbo(this, 195, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[244] = new ModelRendererTurbo(this, 110, 267, textureX, textureY); // Right seat part
		bodyModel[245] = new ModelRendererTurbo(this, 99, 267, textureX, textureY); // Right seat part
		bodyModel[246] = new ModelRendererTurbo(this, 110, 295, textureX, textureY); // Left seat part
		bodyModel[247] = new ModelRendererTurbo(this, 99, 295, textureX, textureY); // Left seat part
		bodyModel[248] = new ModelRendererTurbo(this, 141, 267, textureX, textureY); // Right seat part
		bodyModel[249] = new ModelRendererTurbo(this, 130, 267, textureX, textureY); // Right seat part
		bodyModel[250] = new ModelRendererTurbo(this, 141, 295, textureX, textureY); // Left seat part
		bodyModel[251] = new ModelRendererTurbo(this, 130, 295, textureX, textureY); // Left seat part
		bodyModel[252] = new ModelRendererTurbo(this, 172, 267, textureX, textureY); // Right seat part
		bodyModel[253] = new ModelRendererTurbo(this, 161, 267, textureX, textureY); // Right seat part
		bodyModel[254] = new ModelRendererTurbo(this, 172, 295, textureX, textureY); // Left seat part
		bodyModel[255] = new ModelRendererTurbo(this, 161, 295, textureX, textureY); // Left seat part
		bodyModel[256] = new ModelRendererTurbo(this, 203, 267, textureX, textureY); // Right seat part
		bodyModel[257] = new ModelRendererTurbo(this, 192, 267, textureX, textureY); // Right seat part
		bodyModel[258] = new ModelRendererTurbo(this, 203, 295, textureX, textureY); // Left seat part
		bodyModel[259] = new ModelRendererTurbo(this, 192, 295, textureX, textureY); // Left seat part
		bodyModel[260] = new ModelRendererTurbo(this, 234, 267, textureX, textureY); // Right seat part
		bodyModel[261] = new ModelRendererTurbo(this, 223, 267, textureX, textureY); // Right seat part
		bodyModel[262] = new ModelRendererTurbo(this, 234, 295, textureX, textureY); // Left seat part
		bodyModel[263] = new ModelRendererTurbo(this, 223, 295, textureX, textureY); // Left seat part
		bodyModel[264] = new ModelRendererTurbo(this, 265, 267, textureX, textureY); // Right seat part
		bodyModel[265] = new ModelRendererTurbo(this, 254, 267, textureX, textureY); // Right seat part
		bodyModel[266] = new ModelRendererTurbo(this, 265, 295, textureX, textureY); // Left seat part
		bodyModel[267] = new ModelRendererTurbo(this, 254, 295, textureX, textureY); // Left seat part
		bodyModel[268] = new ModelRendererTurbo(this, 296, 274, textureX, textureY); // Right seat part
		bodyModel[269] = new ModelRendererTurbo(this, 295, 267, textureX, textureY); // Right seat part
		bodyModel[270] = new ModelRendererTurbo(this, 285, 267, textureX, textureY); // Right seat part
		bodyModel[271] = new ModelRendererTurbo(this, 301, 277, textureX, textureY); // Right seat part
		bodyModel[272] = new ModelRendererTurbo(this, 303, 274, textureX, textureY); // Right seat part
		bodyModel[273] = new ModelRendererTurbo(this, 285, 308, textureX, textureY); // Box 128
		bodyModel[274] = new ModelRendererTurbo(this, 289, 300, textureX, textureY); // Box 128
		bodyModel[275] = new ModelRendererTurbo(this, 291, 299, textureX, textureY); // Box 128
		bodyModel[276] = new ModelRendererTurbo(this, 288, 300, textureX, textureY); // Box 128
		bodyModel[277] = new ModelRendererTurbo(this, 10, 230, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[278] = new ModelRendererTurbo(this, 11, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[279] = new ModelRendererTurbo(this, 11, 238, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[280] = new ModelRendererTurbo(this, 18, 240, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[281] = new ModelRendererTurbo(this, 25, 238, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[282] = new ModelRendererTurbo(this, 24, 226, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[283] = new ModelRendererTurbo(this, 25, 234, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[284] = new ModelRendererTurbo(this, 10, 226, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[285] = new ModelRendererTurbo(this, 17, 224, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[286] = new ModelRendererTurbo(this, 24, 230, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[287] = new ModelRendererTurbo(this, 64, 286, textureX, textureY); // Box 209 inner door
		bodyModel[288] = new ModelRendererTurbo(this, 300, 310, textureX, textureY); // Box 128
		bodyModel[289] = new ModelRendererTurbo(this, 47, 312, textureX, textureY); // Box 209
		bodyModel[290] = new ModelRendererTurbo(this, 51, 305, textureX, textureY); // Box 209
		bodyModel[291] = new ModelRendererTurbo(this, 58, 308, textureX, textureY); // Box 209
		bodyModel[292] = new ModelRendererTurbo(this, 50, 299, textureX, textureY); // Box 209
		bodyModel[293] = new ModelRendererTurbo(this, 40, 306, textureX, textureY); // Box 209
		bodyModel[294] = new ModelRendererTurbo(this, 42, 313, textureX, textureY); // Box 209
		bodyModel[295] = new ModelRendererTurbo(this, 47, 280, textureX, textureY); // Box 470
		bodyModel[296] = new ModelRendererTurbo(this, 49, 274, textureX, textureY); // Box 471
		bodyModel[297] = new ModelRendererTurbo(this, 58, 276, textureX, textureY); // Box 472
		bodyModel[298] = new ModelRendererTurbo(this, 48, 268, textureX, textureY); // Box 473
		bodyModel[299] = new ModelRendererTurbo(this, 38, 275, textureX, textureY); // Box 474
		bodyModel[300] = new ModelRendererTurbo(this, 42, 281, textureX, textureY); // Box 475
		bodyModel[301] = new ModelRendererTurbo(this, 15, 275, textureX, textureY); // Box 209
		bodyModel[302] = new ModelRendererTurbo(this, 1, 282, textureX, textureY); // Box 209
		bodyModel[303] = new ModelRendererTurbo(this, 8, 274, textureX, textureY); // Box 209
		bodyModel[304] = new ModelRendererTurbo(this, 1, 274, textureX, textureY); // Box 209
		bodyModel[305] = new ModelRendererTurbo(this, 6, 280, textureX, textureY); // Box 209
		bodyModel[306] = new ModelRendererTurbo(this, 15, 283, textureX, textureY); // Box 209
		bodyModel[307] = new ModelRendererTurbo(this, 1, 264, textureX, textureY); // Box 209
		bodyModel[308] = new ModelRendererTurbo(this, 10, 264, textureX, textureY); // Box 209
		bodyModel[309] = new ModelRendererTurbo(this, 25, 299, textureX, textureY); // Box 492
		bodyModel[310] = new ModelRendererTurbo(this, 28, 289, textureX, textureY); // Box 493
		bodyModel[311] = new ModelRendererTurbo(this, 55, 321, textureX, textureY); // Box 498
		bodyModel[312] = new ModelRendererTurbo(this, 28, 296, textureX, textureY); // Box 492
		bodyModel[313] = new ModelRendererTurbo(this, 31, 316, textureX, textureY); // Box 498
		bodyModel[314] = new ModelRendererTurbo(this, 26, 316, textureX, textureY); // Box 499
		bodyModel[315] = new ModelRendererTurbo(this, 26, 312, textureX, textureY); // Box 493
		bodyModel[316] = new ModelRendererTurbo(this, 31, 312, textureX, textureY); // Box 493
		bodyModel[317] = new ModelRendererTurbo(this, 2, 299, textureX, textureY); // Box 492
		bodyModel[318] = new ModelRendererTurbo(this, 5, 289, textureX, textureY); // Box 493
		bodyModel[319] = new ModelRendererTurbo(this, 5, 296, textureX, textureY); // Box 492
		bodyModel[320] = new ModelRendererTurbo(this, 11, 316, textureX, textureY); // Box 498
		bodyModel[321] = new ModelRendererTurbo(this, 6, 316, textureX, textureY); // Box 499
		bodyModel[322] = new ModelRendererTurbo(this, 6, 312, textureX, textureY); // Box 493
		bodyModel[323] = new ModelRendererTurbo(this, 11, 312, textureX, textureY); // Box 493
		bodyModel[324] = new ModelRendererTurbo(this, 24, 271, textureX, textureY); // Box 526
		bodyModel[325] = new ModelRendererTurbo(this, 28, 281, textureX, textureY); // Box 527
		bodyModel[326] = new ModelRendererTurbo(this, 27, 278, textureX, textureY); // Box 532
		bodyModel[327] = new ModelRendererTurbo(this, 27, 263, textureX, textureY); // Box 533
		bodyModel[328] = new ModelRendererTurbo(this, 22, 265, textureX, textureY); // Box 534
		bodyModel[329] = new ModelRendererTurbo(this, 27, 259, textureX, textureY); // Box 535
		bodyModel[330] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Box 526
		bodyModel[331] = new ModelRendererTurbo(this, 25, 242, textureX, textureY); // Box 527
		bodyModel[332] = new ModelRendererTurbo(this, 16, 246, textureX, textureY); // Box 532
		bodyModel[333] = new ModelRendererTurbo(this, 1, 240, textureX, textureY); // Box 533
		bodyModel[334] = new ModelRendererTurbo(this, 1, 259, textureX, textureY); // Box 534
		bodyModel[335] = new ModelRendererTurbo(this, 1, 236, textureX, textureY); // Box 535
		bodyModel[336] = new ModelRendererTurbo(this, 22, 261, textureX, textureY); // Box 546
		bodyModel[337] = new ModelRendererTurbo(this, 1, 255, textureX, textureY); // Box 546
		bodyModel[338] = new ModelRendererTurbo(this, 405, 265, textureX, textureY); // Box 38
		bodyModel[339] = new ModelRendererTurbo(this, 402, 269, textureX, textureY); // Box 38
		bodyModel[340] = new ModelRendererTurbo(this, 407, 269, textureX, textureY); // Box 38
		bodyModel[341] = new ModelRendererTurbo(this, 389, 267, textureX, textureY); // Box 38
		bodyModel[342] = new ModelRendererTurbo(this, 392, 272, textureX, textureY); // Box 38
		bodyModel[343] = new ModelRendererTurbo(this, 407, 273, textureX, textureY); // Box 38
		bodyModel[344] = new ModelRendererTurbo(this, 391, 276, textureX, textureY); // Box 38
		bodyModel[345] = new ModelRendererTurbo(this, 400, 276, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[346] = new ModelRendererTurbo(this, 371, 268, textureX, textureY); // Box 38
		bodyModel[347] = new ModelRendererTurbo(this, 374, 273, textureX, textureY); // Box 38
		bodyModel[348] = new ModelRendererTurbo(this, 373, 277, textureX, textureY); // Box 38
		bodyModel[349] = new ModelRendererTurbo(this, 410, 270, textureX, textureY); // Box 38
		bodyModel[350] = new ModelRendererTurbo(this, 337, 258, textureX, textureY); // Box 38
		bodyModel[351] = new ModelRendererTurbo(this, 336, 262, textureX, textureY); // Box 38
		bodyModel[352] = new ModelRendererTurbo(this, 341, 262, textureX, textureY); // Box 38
		bodyModel[353] = new ModelRendererTurbo(this, 337, 266, textureX, textureY); // Box 38
		bodyModel[354] = new ModelRendererTurbo(this, 328, 248, textureX, textureY); // Box 38
		bodyModel[355] = new ModelRendererTurbo(this, 326, 252, textureX, textureY); // Box 38
		bodyModel[356] = new ModelRendererTurbo(this, 332, 252, textureX, textureY); // Box 38
		bodyModel[357] = new ModelRendererTurbo(this, 329, 256, textureX, textureY); // Box 38
		bodyModel[358] = new ModelRendererTurbo(this, 335, 274, textureX, textureY); // Box 38
		bodyModel[359] = new ModelRendererTurbo(this, 329, 264, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[360] = new ModelRendererTurbo(this, 337, 279, textureX, textureY); // Box 38
		bodyModel[361] = new ModelRendererTurbo(this, 324, 240, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[362] = new ModelRendererTurbo(this, 398, 263, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[363] = new ModelRendererTurbo(this, 331, 241, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[364] = new ModelRendererTurbo(this, 317, 241, textureX, textureY, "glow"); // Box 38 glow
		bodyModel[365] = new ModelRendererTurbo(this, 319, 258, textureX, textureY); // Box 349
		bodyModel[366] = new ModelRendererTurbo(this, 319, 244, textureX, textureY); // Box 349
		bodyModel[367] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 349
		bodyModel[368] = new ModelRendererTurbo(this, 315, 267, textureX, textureY); // Box 38
		bodyModel[369] = new ModelRendererTurbo(this, 315, 278, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[370] = new ModelRendererTurbo(this, 315, 273, textureX, textureY); // Box 38
		bodyModel[371] = new ModelRendererTurbo(this, 318, 262, textureX, textureY); // Box 38
		bodyModel[372] = new ModelRendererTurbo(this, 353, 243, textureX, textureY); // Box 128
		bodyModel[373] = new ModelRendererTurbo(this, 84, 252, textureX, textureY); // Box 128
		bodyModel[374] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[375] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[376] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[377] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[378] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[379] = new ModelRendererTurbo(this, 72, 356, textureX, textureY); // Box 128
		bodyModel[380] = new ModelRendererTurbo(this, 72, 334, textureX, textureY); // Box 177
		bodyModel[381] = new ModelRendererTurbo(this, 72, 340, textureX, textureY); // Box 128
		bodyModel[382] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[383] = new ModelRendererTurbo(this, 453, 36, textureX, textureY); // Box 128
		bodyModel[384] = new ModelRendererTurbo(this, 453, 26, textureX, textureY); // Box 176
		bodyModel[385] = new ModelRendererTurbo(this, 419, 45, textureX, textureY); // Box 128
		bodyModel[386] = new ModelRendererTurbo(this, 121, 7, textureX, textureY); // Box 128
		bodyModel[387] = new ModelRendererTurbo(this, 184, 15, textureX, textureY); // Box 128
		bodyModel[388] = new ModelRendererTurbo(this, 132, 1, textureX, textureY); // Box 176
		bodyModel[389] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[390] = new ModelRendererTurbo(this, 72, 326, textureX, textureY); // Box 194
		bodyModel[391] = new ModelRendererTurbo(this, 72, 367, textureX, textureY); // Box 128
		bodyModel[392] = new ModelRendererTurbo(this, 72, 322, textureX, textureY); // Box 193
		bodyModel[393] = new ModelRendererTurbo(this, 72, 329, textureX, textureY); // Box 192
		bodyModel[394] = new ModelRendererTurbo(this, 72, 370, textureX, textureY); // Box 128
		bodyModel[395] = new ModelRendererTurbo(this, 72, 362, textureX, textureY); // Box 128
		bodyModel[396] = new ModelRendererTurbo(this, 296, 277, textureX, textureY); // Right seat part
		bodyModel[397] = new ModelRendererTurbo(this, 310, 274, textureX, textureY); // Right seat part
		bodyModel[398] = new ModelRendererTurbo(this, 283, 285, textureX, textureY); // Boc 42
		bodyModel[399] = new ModelRendererTurbo(this, 296, 282, textureX, textureY); // Right seat part
		bodyModel[400] = new ModelRendererTurbo(this, 301, 285, textureX, textureY); // Right seat part
		bodyModel[401] = new ModelRendererTurbo(this, 303, 282, textureX, textureY); // Right seat part
		bodyModel[402] = new ModelRendererTurbo(this, 296, 285, textureX, textureY); // Right seat part
		bodyModel[403] = new ModelRendererTurbo(this, 310, 282, textureX, textureY); // Right seat part
		bodyModel[404] = new ModelRendererTurbo(this, 265, 274, textureX, textureY); // Right seat part
		bodyModel[405] = new ModelRendererTurbo(this, 270, 277, textureX, textureY); // Right seat part
		bodyModel[406] = new ModelRendererTurbo(this, 272, 274, textureX, textureY); // Right seat part
		bodyModel[407] = new ModelRendererTurbo(this, 265, 277, textureX, textureY); // Right seat part
		bodyModel[408] = new ModelRendererTurbo(this, 279, 274, textureX, textureY); // Right seat part
		bodyModel[409] = new ModelRendererTurbo(this, 252, 285, textureX, textureY); // Boc 42
		bodyModel[410] = new ModelRendererTurbo(this, 265, 282, textureX, textureY); // Right seat part
		bodyModel[411] = new ModelRendererTurbo(this, 270, 285, textureX, textureY); // Right seat part
		bodyModel[412] = new ModelRendererTurbo(this, 272, 282, textureX, textureY); // Right seat part
		bodyModel[413] = new ModelRendererTurbo(this, 265, 285, textureX, textureY); // Right seat part
		bodyModel[414] = new ModelRendererTurbo(this, 279, 282, textureX, textureY); // Right seat part
		bodyModel[415] = new ModelRendererTurbo(this, 234, 274, textureX, textureY); // Right seat part
		bodyModel[416] = new ModelRendererTurbo(this, 239, 277, textureX, textureY); // Right seat part
		bodyModel[417] = new ModelRendererTurbo(this, 241, 274, textureX, textureY); // Right seat part
		bodyModel[418] = new ModelRendererTurbo(this, 234, 277, textureX, textureY); // Right seat part
		bodyModel[419] = new ModelRendererTurbo(this, 248, 274, textureX, textureY); // Right seat part
		bodyModel[420] = new ModelRendererTurbo(this, 221, 285, textureX, textureY); // Boc 42
		bodyModel[421] = new ModelRendererTurbo(this, 234, 282, textureX, textureY); // Right seat part
		bodyModel[422] = new ModelRendererTurbo(this, 239, 285, textureX, textureY); // Right seat part
		bodyModel[423] = new ModelRendererTurbo(this, 241, 282, textureX, textureY); // Right seat part
		bodyModel[424] = new ModelRendererTurbo(this, 234, 285, textureX, textureY); // Right seat part
		bodyModel[425] = new ModelRendererTurbo(this, 248, 282, textureX, textureY); // Right seat part
		bodyModel[426] = new ModelRendererTurbo(this, 203, 274, textureX, textureY); // Right seat part
		bodyModel[427] = new ModelRendererTurbo(this, 208, 277, textureX, textureY); // Right seat part
		bodyModel[428] = new ModelRendererTurbo(this, 210, 274, textureX, textureY); // Right seat part
		bodyModel[429] = new ModelRendererTurbo(this, 203, 277, textureX, textureY); // Right seat part
		bodyModel[430] = new ModelRendererTurbo(this, 217, 274, textureX, textureY); // Right seat part
		bodyModel[431] = new ModelRendererTurbo(this, 190, 285, textureX, textureY); // Boc 42
		bodyModel[432] = new ModelRendererTurbo(this, 203, 282, textureX, textureY); // Right seat part
		bodyModel[433] = new ModelRendererTurbo(this, 208, 285, textureX, textureY); // Right seat part
		bodyModel[434] = new ModelRendererTurbo(this, 210, 282, textureX, textureY); // Right seat part
		bodyModel[435] = new ModelRendererTurbo(this, 203, 285, textureX, textureY); // Right seat part
		bodyModel[436] = new ModelRendererTurbo(this, 217, 282, textureX, textureY); // Right seat part
		bodyModel[437] = new ModelRendererTurbo(this, 172, 274, textureX, textureY); // Right seat part
		bodyModel[438] = new ModelRendererTurbo(this, 177, 277, textureX, textureY); // Right seat part
		bodyModel[439] = new ModelRendererTurbo(this, 179, 274, textureX, textureY); // Right seat part
		bodyModel[440] = new ModelRendererTurbo(this, 172, 277, textureX, textureY); // Right seat part
		bodyModel[441] = new ModelRendererTurbo(this, 186, 274, textureX, textureY); // Right seat part
		bodyModel[442] = new ModelRendererTurbo(this, 159, 285, textureX, textureY); // Boc 42
		bodyModel[443] = new ModelRendererTurbo(this, 172, 282, textureX, textureY); // Right seat part
		bodyModel[444] = new ModelRendererTurbo(this, 177, 285, textureX, textureY); // Right seat part
		bodyModel[445] = new ModelRendererTurbo(this, 179, 282, textureX, textureY); // Right seat part
		bodyModel[446] = new ModelRendererTurbo(this, 172, 285, textureX, textureY); // Right seat part
		bodyModel[447] = new ModelRendererTurbo(this, 186, 282, textureX, textureY); // Right seat part
		bodyModel[448] = new ModelRendererTurbo(this, 141, 274, textureX, textureY); // Right seat part
		bodyModel[449] = new ModelRendererTurbo(this, 146, 277, textureX, textureY); // Right seat part
		bodyModel[450] = new ModelRendererTurbo(this, 148, 274, textureX, textureY); // Right seat part
		bodyModel[451] = new ModelRendererTurbo(this, 141, 277, textureX, textureY); // Right seat part
		bodyModel[452] = new ModelRendererTurbo(this, 155, 274, textureX, textureY); // Right seat part
		bodyModel[453] = new ModelRendererTurbo(this, 128, 285, textureX, textureY); // Boc 42
		bodyModel[454] = new ModelRendererTurbo(this, 141, 282, textureX, textureY); // Right seat part
		bodyModel[455] = new ModelRendererTurbo(this, 146, 285, textureX, textureY); // Right seat part
		bodyModel[456] = new ModelRendererTurbo(this, 148, 282, textureX, textureY); // Right seat part
		bodyModel[457] = new ModelRendererTurbo(this, 141, 285, textureX, textureY); // Right seat part
		bodyModel[458] = new ModelRendererTurbo(this, 155, 282, textureX, textureY); // Right seat part
		bodyModel[459] = new ModelRendererTurbo(this, 110, 274, textureX, textureY); // Right seat part
		bodyModel[460] = new ModelRendererTurbo(this, 115, 277, textureX, textureY); // Right seat part
		bodyModel[461] = new ModelRendererTurbo(this, 117, 274, textureX, textureY); // Right seat part
		bodyModel[462] = new ModelRendererTurbo(this, 110, 277, textureX, textureY); // Right seat part
		bodyModel[463] = new ModelRendererTurbo(this, 124, 274, textureX, textureY); // Right seat part
		bodyModel[464] = new ModelRendererTurbo(this, 97, 285, textureX, textureY); // Boc 42
		bodyModel[465] = new ModelRendererTurbo(this, 110, 282, textureX, textureY); // Right seat part
		bodyModel[466] = new ModelRendererTurbo(this, 115, 285, textureX, textureY); // Right seat part
		bodyModel[467] = new ModelRendererTurbo(this, 117, 282, textureX, textureY); // Right seat part
		bodyModel[468] = new ModelRendererTurbo(this, 110, 285, textureX, textureY); // Right seat part
		bodyModel[469] = new ModelRendererTurbo(this, 124, 282, textureX, textureY); // Right seat part
		bodyModel[470] = new ModelRendererTurbo(this, 265, 302, textureX, textureY); // Left seat part
		bodyModel[471] = new ModelRendererTurbo(this, 270, 305, textureX, textureY); // Left seat part
		bodyModel[472] = new ModelRendererTurbo(this, 272, 302, textureX, textureY); // Left seat part
		bodyModel[473] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Left seat part
		bodyModel[474] = new ModelRendererTurbo(this, 279, 302, textureX, textureY); // Left seat part
		bodyModel[475] = new ModelRendererTurbo(this, 265, 310, textureX, textureY); // Left seat part
		bodyModel[476] = new ModelRendererTurbo(this, 270, 313, textureX, textureY); // Left seat part
		bodyModel[477] = new ModelRendererTurbo(this, 272, 310, textureX, textureY); // Left seat part
		bodyModel[478] = new ModelRendererTurbo(this, 265, 313, textureX, textureY); // Left seat part
		bodyModel[479] = new ModelRendererTurbo(this, 279, 310, textureX, textureY); // Left seat part
		bodyModel[480] = new ModelRendererTurbo(this, 252, 313, textureX, textureY); // Boc 42
		bodyModel[481] = new ModelRendererTurbo(this, 234, 302, textureX, textureY); // Left seat part
		bodyModel[482] = new ModelRendererTurbo(this, 239, 305, textureX, textureY); // Left seat part
		bodyModel[483] = new ModelRendererTurbo(this, 241, 302, textureX, textureY); // Left seat part
		bodyModel[484] = new ModelRendererTurbo(this, 234, 305, textureX, textureY); // Left seat part
		bodyModel[485] = new ModelRendererTurbo(this, 248, 302, textureX, textureY); // Left seat part
		bodyModel[486] = new ModelRendererTurbo(this, 234, 310, textureX, textureY); // Left seat part
		bodyModel[487] = new ModelRendererTurbo(this, 239, 313, textureX, textureY); // Left seat part
		bodyModel[488] = new ModelRendererTurbo(this, 241, 310, textureX, textureY); // Left seat part
		bodyModel[489] = new ModelRendererTurbo(this, 234, 313, textureX, textureY); // Left seat part
		bodyModel[490] = new ModelRendererTurbo(this, 248, 310, textureX, textureY); // Left seat part
		bodyModel[491] = new ModelRendererTurbo(this, 221, 313, textureX, textureY); // Boc 42
		bodyModel[492] = new ModelRendererTurbo(this, 203, 302, textureX, textureY); // Left seat part
		bodyModel[493] = new ModelRendererTurbo(this, 208, 305, textureX, textureY); // Left seat part
		bodyModel[494] = new ModelRendererTurbo(this, 210, 302, textureX, textureY); // Left seat part
		bodyModel[495] = new ModelRendererTurbo(this, 203, 305, textureX, textureY); // Left seat part
		bodyModel[496] = new ModelRendererTurbo(this, 217, 302, textureX, textureY); // Left seat part
		bodyModel[497] = new ModelRendererTurbo(this, 203, 310, textureX, textureY); // Left seat part
		bodyModel[498] = new ModelRendererTurbo(this, 208, 313, textureX, textureY); // Left seat part
		bodyModel[499] = new ModelRendererTurbo(this, 210, 310, textureX, textureY); // Left seat part

		bodyModel[0].addBox(0F, 0F, 0F, 118, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(60.5F, 3F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[4].setRotationPoint(60.5F, 4F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[5].setRotationPoint(53.5F, 3F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[6].setRotationPoint(54.5F, 4F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 2
		bodyModel[7].setRotationPoint(52.25F, 3F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 2
		bodyModel[8].setRotationPoint(53F, 4F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[9].setRotationPoint(-61.5F, 4F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[10].setRotationPoint(-61.5F, 3F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 2
		bodyModel[11].setRotationPoint(-53.25F, 3F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 2
		bodyModel[12].setRotationPoint(-55F, 4F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 2
		bodyModel[13].setRotationPoint(34.75F, 3F, 10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 2
		bodyModel[14].setRotationPoint(33F, 4F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 2
		bodyModel[15].setRotationPoint(-35.75F, 3F, 10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 2
		bodyModel[16].setRotationPoint(-35F, 4F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[17].setRotationPoint(-34.5F, 3F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 60, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[18].setRotationPoint(-26.5F, 4F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[19].setRotationPoint(60.5F, 3F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(60.5F, 4F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[21].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[23].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(53F, 4F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[25].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[26].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[27].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(-55F, 4F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[29].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(33F, 4F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[31].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-35F, 4F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[33].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 40, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-26.5F, 4F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[35].setRotationPoint(59.5F, 3F, -1.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[36].setRotationPoint(56.5F, 3F, -5F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[37].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[38].setRotationPoint(-61.5F, 3F, -5F);

		bodyModel[39].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[39].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[40].setRotationPoint(43F, 4F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[41].setRotationPoint(-45F, 4F, -1F);

		bodyModel[42].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 2
		bodyModel[42].setRotationPoint(0.5F, 3F, 4F);

		bodyModel[43].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 2
		bodyModel[43].setRotationPoint(14.5F, 3F, 4F);

		bodyModel[44].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 52
		bodyModel[44].setRotationPoint(0.5F, 3F, -9F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 2
		bodyModel[45].setRotationPoint(23.5F, 3F, 4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[46].setRotationPoint(-33.5F, 4F, 10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[47].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 2
		bodyModel[48].setRotationPoint(-28.5F, 3F, 5F);

		bodyModel[49].addBox(0F, 0F, 0F, 17, 4, 10, 0F); // Box 2
		bodyModel[49].setRotationPoint(-28.5F, 4F, -5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[50].setRotationPoint(-28.5F, 8F, -5F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 59
		bodyModel[51].setRotationPoint(-28.5F, 3F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[52].setRotationPoint(-24.5F, 3F, 7.25F);
		bodyModel[52].rotateAngleX = -0.78539816F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[53].setRotationPoint(-24.51F, 3F, 6.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[54].setRotationPoint(-16.49F, 3F, 6.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[55].setRotationPoint(-15.5F, 3F, 7.25F);
		bodyModel[55].rotateAngleX = -0.78539816F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[56].setRotationPoint(-15.51F, 3F, 6.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[57].setRotationPoint(-7.49F, 3F, 6.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[58].setRotationPoint(-31F, 3F, 4F);
		bodyModel[58].rotateAngleZ = -0.78539816F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[59].setRotationPoint(-31.5F, 3F, 3.99F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[60].setRotationPoint(-31.5F, 3F, 9.01F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[61].setRotationPoint(23.5F, 4F, 0F);
		bodyModel[61].rotateAngleX = -0.78539816F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[62].setRotationPoint(23.49F, 4F, -0.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[63].setRotationPoint(31.51F, 4F, -0.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[64].setRotationPoint(23.5F, 3F, -7F);
		bodyModel[64].rotateAngleX = -0.78539816F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[65].setRotationPoint(23.49F, 3F, -7.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[66].setRotationPoint(29.51F, 3F, -7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[67].setRotationPoint(22.5F, 4F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		bodyModel[68].setRotationPoint(13.5F, 4F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[69].setRotationPoint(-16.5F, 3F, -7.25F);
		bodyModel[69].rotateAngleX = -0.78539816F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[70].setRotationPoint(-16.51F, 3F, -7.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[71].setRotationPoint(-12.49F, 3F, -7.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[72].setRotationPoint(-21F, 3F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[73].setRotationPoint(60.51F, 3F, -9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[74].setRotationPoint(56.49F, 3F, -9F);

		bodyModel[75].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[75].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[76].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[76].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[77].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[77].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[78].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[78].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[79].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[79].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[80].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[80].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[81].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[81].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[82].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[82].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[83].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[83].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[84].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[85].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[85].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[86].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[86].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[87].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[87].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[88].setRotationPoint(60.51F, 3F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[89].setRotationPoint(56.49F, 3F, 8F);

		bodyModel[90].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[90].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[91].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[91].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[92].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[92].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[93].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[93].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[94].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[94].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[95].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[95].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[96].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[96].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[97].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[97].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[98].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[98].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[99].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[99].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[100].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[100].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[101].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[101].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[102].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[102].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[103].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[104].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[105].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[105].setRotationPoint(56.51F, -14F, -10.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[106].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[107].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 128
		bodyModel[107].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[108].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[109].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[110].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[111].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[112].setRotationPoint(56.51F, -14F, 10.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[113].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[114].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[115].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[116].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[117].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[118].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[118].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[119].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[119].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[120].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[120].setRotationPoint(55.51F, -14F, 3F);

		bodyModel[121].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[121].setRotationPoint(-60.49F, -14F, -3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[122].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[123].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[124].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[125].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[126].setRotationPoint(15.25F, 3F, -10.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[127].setRotationPoint(19.25F, 3F, -10.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[128].setRotationPoint(18.25F, 3F, -10.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, -1.375F, -0.5F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, -0.375F, -0.5F); // Box 38
		bodyModel[129].setRotationPoint(14.25F, 2.75F, -10.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[130].setRotationPoint(15.55F, 3.2F, -10F);
		bodyModel[130].rotateAngleZ = -0.78539816F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[131].setRotationPoint(18.75F, 3.2F, -10F);
		bodyModel[131].rotateAngleZ = -0.78539816F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[132].setRotationPoint(15.05F, 3F, -5.99F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[133].setRotationPoint(18.25F, 3F, -5.99F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[134].setRotationPoint(18.25F, 3F, -9.99F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[135].setRotationPoint(15.05F, 3F, -9.99F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[136].setRotationPoint(56F, -6F, -12F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[137].setRotationPoint(61F, -6F, -12F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[138].setRotationPoint(56F, -6F, 11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[139].setRotationPoint(61F, -6F, 11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[140].setRotationPoint(-61F, -6F, -12F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[141].setRotationPoint(-61F, -6F, 11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[142].setRotationPoint(-61.5F, 6F, -10.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[143].setRotationPoint(-61.5F, 6F, 10.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[144].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[145].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[146].setRotationPoint(61.5F, -19F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[147].setRotationPoint(61.5F, -20F, -7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[148].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[149].setRotationPoint(61.5F, -15F, 11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[150].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[151].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[152].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[153].setRotationPoint(63F, -15F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[154].setRotationPoint(63F, -16F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[155].setRotationPoint(63F, 1F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[156].setRotationPoint(63F, -19F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[157].setRotationPoint(63F, -20F, -7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[158].setRotationPoint(63F, -20F, -3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[159].setRotationPoint(63F, -19F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[160].setRotationPoint(63F, -18.75F, -5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[161].setRotationPoint(63F, -15F, 10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[162].setRotationPoint(63F, -16F, 9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[163].setRotationPoint(63F, -19F, 7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[164].setRotationPoint(63F, -20F, 3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[165].setRotationPoint(63F, -18.75F, 4F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[166].setRotationPoint(63F, -15F, -5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[167].setRotationPoint(63F, -16F, -4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[168].setRotationPoint(63F, -16F, 1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[169].setRotationPoint(63F, -14F, -5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[170].setRotationPoint(63F, -14F, 3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[171].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[172].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[173].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[174].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[175].setRotationPoint(-63.5F, -15F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[176].setRotationPoint(-63F, -15F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[177].setRotationPoint(-63.5F, -16F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[178].setRotationPoint(-63F, -15F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[179].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[180].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[181].setRotationPoint(-63F, -19F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[182].setRotationPoint(-63.5F, -20F, -7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[183].setRotationPoint(-63F, -20F, -7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[184].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[185].setRotationPoint(-63F, -20F, -3F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[186].setRotationPoint(-63.5F, -19F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[187].setRotationPoint(-63.5F, -18.75F, -5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[188].setRotationPoint(-63.5F, -15F, 10F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[189].setRotationPoint(-63F, -15F, 11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[190].setRotationPoint(-63.5F, -16F, 9F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[191].setRotationPoint(-63F, -15F, 9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[192].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[193].setRotationPoint(-63F, -19F, 7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[194].setRotationPoint(-63.5F, -20F, 3F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[195].setRotationPoint(-63F, -20F, 3F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[196].setRotationPoint(-63.5F, -18.75F, 4F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[197].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[198].setRotationPoint(-63.5F, -16F, -4F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[199].setRotationPoint(-63.5F, -16F, 1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[200].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[201].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[202].setRotationPoint(-63F, -15F, -4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[203].setRotationPoint(-63F, -14F, -4F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[204].setRotationPoint(-63F, -14F, 3F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[205].setRotationPoint(-63F, 1F, -4F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[206].setRotationPoint(45F, -19.36F, -8.36F);
		bodyModel[206].rotateAngleX = -1.04283423F;

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[207].setRotationPoint(45F, -17.65F, -10.92F);
		bodyModel[207].rotateAngleX = -0.41887902F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[208].setRotationPoint(-49.5F, -18F, -11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[209].setRotationPoint(-49.5F, -18.5F, -10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F); // Box 128
		bodyModel[210].setRotationPoint(45F, -18.5F, 7.85F);
		bodyModel[210].rotateAngleX = 1.04283423F;

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F); // Box 128
		bodyModel[211].setRotationPoint(45F, -17.25F, 10F);
		bodyModel[211].rotateAngleX = 0.41887902F;

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -1.1F, -0.75F, 0F, -0.5F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 275
		bodyModel[212].setRotationPoint(51.5F, -18F, 10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -1F, -0.85F, 0F, -0.5F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 276
		bodyModel[213].setRotationPoint(51.5F, -18.5F, 8F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 209
		bodyModel[214].setRotationPoint(-38.5F, -15F, -10F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 209
		bodyModel[215].setRotationPoint(-38.5F, -15F, 3F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 128
		bodyModel[216].setRotationPoint(35.5F, -15F, -5F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 209
		bodyModel[217].setRotationPoint(-57.5F, -15F, -10F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 16, 6, 0F); // Box 209
		bodyModel[218].setRotationPoint(-60.5F, -15F, -10F);

		bodyModel[219].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 128
		bodyModel[219].setRotationPoint(36.5F, -15F, -6F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[220].setRotationPoint(43.5F, -15F, -6F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // Box 128
		bodyModel[221].setRotationPoint(47.5F, -15F, -10F);

		bodyModel[222].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 38
		bodyModel[222].setRotationPoint(49.5F, -10F, -10F);

		bodyModel[223].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 38
		bodyModel[223].setRotationPoint(49.5F, -4F, -10F);

		bodyModel[224].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 128
		bodyModel[224].setRotationPoint(44.5F, -15F, 3F);

		bodyModel[225].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 128
		bodyModel[225].setRotationPoint(52.5F, -15F, 4F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[226].setRotationPoint(48.5F, -15F, 4F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 73, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[227].setRotationPoint(-37.5F, -17F, -2F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[228].setRotationPoint(35.5F, -15F, -6F);

		bodyModel[229].addBox(0F, 0F, 0F, 73, 1, 3, 0F); // Box 38
		bodyModel[229].setRotationPoint(-37.5F, -14F, 7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 73, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[230].setRotationPoint(-37.5F, -13F, 9F);

		bodyModel[231].addBox(0F, 0F, 0F, 64, 1, 3, 0F); // Box 275
		bodyModel[231].setRotationPoint(-37.5F, -14F, -10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[232].setRotationPoint(-37.5F, -13F, -10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[233].setRotationPoint(28.5F, -14F, -10F);

		bodyModel[234].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 275
		bodyModel[234].setRotationPoint(26.5F, -14F, -10F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 275
		bodyModel[235].setRotationPoint(26.5F, -14F, -8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F); // Box 276
		bodyModel[236].setRotationPoint(26.5F, -13F, -10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[237].setRotationPoint(-32.5F, -16.5F, -0.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[238].setRotationPoint(-22.5F, -16.5F, -0.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[239].setRotationPoint(-12.5F, -16.5F, -0.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[240].setRotationPoint(-2.5F, -16.5F, -0.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[241].setRotationPoint(7.5F, -16.5F, -0.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[242].setRotationPoint(17.5F, -16.5F, -0.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[243].setRotationPoint(27.5F, -16.5F, -0.5F);

		bodyModel[244].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[244].setRotationPoint(-31.5F, -3F, 7F);
		bodyModel[244].rotateAngleY = -3.14159265F;

		bodyModel[245].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[245].setRotationPoint(-31.5F, -8F, 7F);
		bodyModel[245].rotateAngleY = -3.14159265F;

		bodyModel[246].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[246].setRotationPoint(-31.5F, -3F, -7F);
		bodyModel[246].rotateAngleY = -3.14159265F;

		bodyModel[247].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[247].setRotationPoint(-31.5F, -8F, -7F);
		bodyModel[247].rotateAngleY = -3.14159265F;

		bodyModel[248].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[248].setRotationPoint(-21.5F, -3F, 7F);
		bodyModel[248].rotateAngleY = -3.14159265F;

		bodyModel[249].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[249].setRotationPoint(-21.5F, -8F, 7F);
		bodyModel[249].rotateAngleY = -3.14159265F;

		bodyModel[250].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[250].setRotationPoint(-21.5F, -3F, -7F);
		bodyModel[250].rotateAngleY = -3.14159265F;

		bodyModel[251].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[251].setRotationPoint(-21.5F, -8F, -7F);
		bodyModel[251].rotateAngleY = -3.14159265F;

		bodyModel[252].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[252].setRotationPoint(-11.5F, -3F, 7F);
		bodyModel[252].rotateAngleY = -3.14159265F;

		bodyModel[253].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[253].setRotationPoint(-11.5F, -8F, 7F);
		bodyModel[253].rotateAngleY = -3.14159265F;

		bodyModel[254].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[254].setRotationPoint(-11.5F, -3F, -7F);
		bodyModel[254].rotateAngleY = -3.14159265F;

		bodyModel[255].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[255].setRotationPoint(-11.5F, -8F, -7F);
		bodyModel[255].rotateAngleY = -3.14159265F;

		bodyModel[256].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[256].setRotationPoint(-1.5F, -3F, 7F);
		bodyModel[256].rotateAngleY = -3.14159265F;

		bodyModel[257].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[257].setRotationPoint(-1.5F, -8F, 7F);
		bodyModel[257].rotateAngleY = -3.14159265F;

		bodyModel[258].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[258].setRotationPoint(-1.5F, -3F, -7F);
		bodyModel[258].rotateAngleY = -3.14159265F;

		bodyModel[259].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[259].setRotationPoint(-1.5F, -8F, -7F);
		bodyModel[259].rotateAngleY = -3.14159265F;

		bodyModel[260].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[260].setRotationPoint(8.5F, -3F, 7F);
		bodyModel[260].rotateAngleY = -3.14159265F;

		bodyModel[261].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[261].setRotationPoint(8.5F, -8F, 7F);
		bodyModel[261].rotateAngleY = -3.14159265F;

		bodyModel[262].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[262].setRotationPoint(8.5F, -3F, -7F);
		bodyModel[262].rotateAngleY = -3.14159265F;

		bodyModel[263].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[263].setRotationPoint(8.5F, -8F, -7F);
		bodyModel[263].rotateAngleY = -3.14159265F;

		bodyModel[264].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[264].setRotationPoint(18.5F, -3F, 7F);
		bodyModel[264].rotateAngleY = -3.14159265F;

		bodyModel[265].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[265].setRotationPoint(18.5F, -8F, 7F);
		bodyModel[265].rotateAngleY = -3.14159265F;

		bodyModel[266].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[266].setRotationPoint(18.5F, -3F, -7F);
		bodyModel[266].rotateAngleY = -3.14159265F;

		bodyModel[267].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[267].setRotationPoint(18.5F, -8F, -7F);
		bodyModel[267].rotateAngleY = -3.14159265F;

		bodyModel[268].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[268].setRotationPoint(28.5F, -5F, 7F);
		bodyModel[268].rotateAngleY = -3.14159265F;

		bodyModel[269].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[269].setRotationPoint(28.5F, -3F, 7F);
		bodyModel[269].rotateAngleY = -3.14159265F;

		bodyModel[270].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[270].setRotationPoint(28.5F, -8F, 7F);
		bodyModel[270].rotateAngleY = -3.14159265F;

		bodyModel[271].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[271].setRotationPoint(28.5F, -3F, 7F);
		bodyModel[271].rotateAngleY = -3.14159265F;

		bodyModel[272].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[272].setRotationPoint(28.5F, -5F, 7F);
		bodyModel[272].rotateAngleY = -3.14159265F;

		bodyModel[273].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 128
		bodyModel[273].setRotationPoint(29.5F, -5F, -10F);

		bodyModel[274].addBox(0F, 0F, 0F, 0, 4, 3, 0F); // Box 128
		bodyModel[274].setRotationPoint(30F, -9F, -10F);

		bodyModel[275].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 128
		bodyModel[275].setRotationPoint(30F, -10F, -10F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[276].setRotationPoint(30F, -10F, -8F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[277].setRotationPoint(-55.5F, -15F, 2.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[278].setRotationPoint(-55.5F, -15F, -4.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[279].setRotationPoint(-52.5F, -15F, -8F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[280].setRotationPoint(-48.5F, -15F, -8F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[281].setRotationPoint(-44.5F, -15F, -8F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[282].setRotationPoint(-41.5F, -15F, 2.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[283].setRotationPoint(-41.5F, -15F, -4.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[284].setRotationPoint(-52.5F, -15F, 6F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[285].setRotationPoint(-48.5F, -15F, 6F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[286].setRotationPoint(-44.5F, -15F, 6F);

		bodyModel[287].addShapeBox(-0.5F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209 inner door
		bodyModel[287].setRotationPoint(-38F, -15F, -3F);
		bodyModel[287].rotateAngleY = 1.41371669F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[288].setRotationPoint(30.5F, -7F, -9F);

		bodyModel[289].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 209
		bodyModel[289].setRotationPoint(-40.5F, -1F, -10F);

		bodyModel[290].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 209
		bodyModel[290].setRotationPoint(-43.5F, -1F, -10F);

		bodyModel[291].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 209
		bodyModel[291].setRotationPoint(-41.5F, -3F, -10F);

		bodyModel[292].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 209
		bodyModel[292].setRotationPoint(-44.5F, -3F, -10F);

		bodyModel[293].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 209
		bodyModel[293].setRotationPoint(-44.5F, -6F, -7F);

		bodyModel[294].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 209
		bodyModel[294].setRotationPoint(-44.5F, -5F, -3.71F);
		bodyModel[294].rotateAngleY = -0.78539816F;

		bodyModel[295].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 470
		bodyModel[295].setRotationPoint(-40.5F, -1F, 4F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 471
		bodyModel[296].setRotationPoint(-43.5F, -1F, 8F);

		bodyModel[297].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 472
		bodyModel[297].setRotationPoint(-41.5F, -3F, 3F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 473
		bodyModel[298].setRotationPoint(-44.5F, -3F, 7F);

		bodyModel[299].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 474
		bodyModel[299].setRotationPoint(-44.5F, -6F, 3F);

		bodyModel[300].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 475
		bodyModel[300].setRotationPoint(-44.5F, -5F, 3.71F);
		bodyModel[300].rotateAngleY = -0.78539816F;

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F); // Box 209
		bodyModel[301].setRotationPoint(-56.5F, -6F, -6.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 209
		bodyModel[302].setRotationPoint(-54.49F, -5F, -9F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 209
		bodyModel[303].setRotationPoint(-55.5F, -6F, -8F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[304].setRotationPoint(-54.5F, -6F, -10F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -2.5F, 0.75F, 0F, -2.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -2.5F, 0.75F, 0F, -2.5F); // Box 209
		bodyModel[305].setRotationPoint(-54.74F, -5F, -8F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 209
		bodyModel[306].setRotationPoint(-55.49F, -5F, -6.5F);
		bodyModel[306].rotateAngleY = 0.9250245F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[307].setRotationPoint(-56.5F, -6F, -10F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 209
		bodyModel[308].setRotationPoint(-56.5F, -6F, -8F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[309].setRotationPoint(-48.5F, -3F, -8F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[310].setRotationPoint(-48.5F, -7F, -9F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[311].setRotationPoint(-45.5F, -4.5F, -9F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[312].setRotationPoint(-48.5F, -2.5F, -9F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 498
		bodyModel[313].setRotationPoint(-45.99F, -2.5F, -9.51F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 499
		bodyModel[314].setRotationPoint(-48.51F, -2.5F, -9.51F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[315].setRotationPoint(-48.51F, -4.5F, -9.01F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[316].setRotationPoint(-45.99F, -4.5F, -9.01F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[317].setRotationPoint(-53F, -3F, -8F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[318].setRotationPoint(-53F, -7F, -9F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[319].setRotationPoint(-53F, -2.5F, -9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 498
		bodyModel[320].setRotationPoint(-50.49F, -2.5F, -9.51F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 499
		bodyModel[321].setRotationPoint(-53.01F, -2.5F, -9.51F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[322].setRotationPoint(-53.01F, -4.5F, -9.01F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[323].setRotationPoint(-50.49F, -4.5F, -9.01F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[324].setRotationPoint(-48.5F, -3F, 4F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[325].setRotationPoint(-48.5F, -7F, 8F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[326].setRotationPoint(-48.5F, -2.5F, 8F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 533
		bodyModel[327].setRotationPoint(-45.99F, -2.5F, 8.51F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 534
		bodyModel[328].setRotationPoint(-48.51F, -2.5F, 8.51F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[329].setRotationPoint(-45.99F, -4.5F, 8.01F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[330].setRotationPoint(-55F, -3F, -1.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[331].setRotationPoint(-56F, -7F, -1.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[332].setRotationPoint(-56F, -2.5F, -1.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 533
		bodyModel[333].setRotationPoint(-56.51F, -2.5F, 1.01F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 534
		bodyModel[334].setRotationPoint(-56.51F, -2.5F, -1.51F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.22F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.22F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 535
		bodyModel[335].setRotationPoint(-56.01F, -4.5F, 1.01F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[336].setRotationPoint(-48.51F, -4.5F, 8.01F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.22F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.22F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 546
		bodyModel[337].setRotationPoint(-56.01F, -4.5F, -1.51F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[338].setRotationPoint(53.5F, -6F, 9F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[339].setRotationPoint(53.5F, -6F, 8F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[340].setRotationPoint(54.5F, -6F, 8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[341].setRotationPoint(49.55F, -2F, 8.55F);
		bodyModel[341].rotateAngleY = -0.78539816F;

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[342].setRotationPoint(49.9F, -1F, 8.9F);
		bodyModel[342].rotateAngleY = -0.78539816F;

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[343].setRotationPoint(54.87F, -4.5F, 8.63F);
		bodyModel[343].rotateAngleY = 0.78539816F;

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[344].setRotationPoint(49.55F, 0.5F, 8.55F);
		bodyModel[344].rotateAngleY = -0.78539816F;

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[345].setRotationPoint(51.5F, -4F, 9.49F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[346].setRotationPoint(47.05F, -2F, 9.95F);
		bodyModel[346].rotateAngleY = -2.35619449F;

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[347].setRotationPoint(47.4F, -1F, 9.6F);
		bodyModel[347].rotateAngleY = -2.35619449F;

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[348].setRotationPoint(47.05F, 0.5F, 9.95F);
		bodyModel[348].rotateAngleY = -2.35619449F;

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[349].setRotationPoint(54.5F, -5F, 5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[350].setRotationPoint(41.5F, -6F, 9F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[351].setRotationPoint(41.5F, -6F, 8F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[352].setRotationPoint(42.5F, -6F, 8F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[353].setRotationPoint(42.87F, -4.5F, 8.63F);
		bodyModel[353].rotateAngleY = 0.78539816F;

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[354].setRotationPoint(36.5F, -6F, 9F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[355].setRotationPoint(37.5F, -6F, 8F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[356].setRotationPoint(36.5F, -6F, 8F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[357].setRotationPoint(37.47F, -4.5F, 8.63F);
		bodyModel[357].rotateAngleY = 0.78539816F;

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[358].setRotationPoint(42F, -6F, 1F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[359].setRotationPoint(39.25F, -4F, 9.49F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[360].setRotationPoint(42.92F, -4.5F, 1.63F);
		bodyModel[360].rotateAngleY = 0.78539816F;

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[361].setRotationPoint(39F, -15F, 9.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[362].setRotationPoint(51F, -15F, 9.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[363].setRotationPoint(41.5F, -13.5F, 9.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[364].setRotationPoint(36.5F, -13.5F, 9.5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[365].setRotationPoint(36.5F, -6F, -5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[366].setRotationPoint(36.5F, -15F, -5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[367].setRotationPoint(36.5F, -13F, -5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[368].setRotationPoint(37F, -3.5F, -3.5F);
		bodyModel[368].rotateAngleY = -0.78539816F;

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38 cull
		bodyModel[369].setRotationPoint(37F, -2.5F, -3.5F);
		bodyModel[369].rotateAngleY = -0.78539816F;

		bodyModel[370].addShapeBox(0F, 0F, 0F, 4, 0, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[370].setRotationPoint(37F, -1.25F, -3.5F);
		bodyModel[370].rotateAngleY = -0.78539816F;

		bodyModel[371].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		bodyModel[371].setRotationPoint(38.06F, -6F, -2.44F);
		bodyModel[371].rotateAngleY = -0.78539816F;

		bodyModel[372].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 128
		bodyModel[372].setRotationPoint(35.49F, -17F, -6F);

		bodyModel[373].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 128
		bodyModel[373].setRotationPoint(-37.49F, -17F, 4F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[374].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[375].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[376].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[377].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[378].addBox(0F, 0F, 0F, 123, 2, 6, 0F); // Box 128
		bodyModel[378].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[379].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[380].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[381].addBox(0F, 0F, 0F, 123, 1, 14, 0F); // Box 128
		bodyModel[381].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 26, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[382].setRotationPoint(35.5F, -17F, -7F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 26, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[383].setRotationPoint(35.5F, -18F, -10F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 26, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[384].setRotationPoint(35.5F, -18F, 7F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 26, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[385].setRotationPoint(35.5F, -16.25F, -10F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 24, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[386].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[387].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[388].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 24, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[389].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 73, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[390].setRotationPoint(-37.5F, -18F, 7.25F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 73, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[391].setRotationPoint(-37.5F, -18F, -8.25F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 73, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[392].setRotationPoint(-37.5F, -16F, 8F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 73, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[393].setRotationPoint(-37.5F, -17F, 5.25F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 73, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[394].setRotationPoint(-37.5F, -16F, -10F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 73, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[395].setRotationPoint(-37.5F, -17F, -8.25F);

		bodyModel[396].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[396].setRotationPoint(28.5F, -4.5F, 7F);
		bodyModel[396].rotateAngleY = -3.14159265F;

		bodyModel[397].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[397].setRotationPoint(28.5F, -4F, 7F);
		bodyModel[397].rotateAngleY = -3.14159265F;

		bodyModel[398].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[398].setRotationPoint(27F, 0F, 4F);

		bodyModel[399].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[399].setRotationPoint(28.5F, -5F, 7F);
		bodyModel[399].rotateAngleY = -3.14159265F;

		bodyModel[400].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[400].setRotationPoint(28.5F, -3F, 7F);
		bodyModel[400].rotateAngleY = -3.14159265F;

		bodyModel[401].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[401].setRotationPoint(28.5F, -5F, 7F);
		bodyModel[401].rotateAngleY = -3.14159265F;

		bodyModel[402].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[402].setRotationPoint(28.5F, -4.5F, 7F);
		bodyModel[402].rotateAngleY = -3.14159265F;

		bodyModel[403].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[403].setRotationPoint(28.5F, -4F, 7F);
		bodyModel[403].rotateAngleY = -3.14159265F;

		bodyModel[404].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[404].setRotationPoint(18.5F, -5F, 7F);
		bodyModel[404].rotateAngleY = -3.14159265F;

		bodyModel[405].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[405].setRotationPoint(18.5F, -3F, 7F);
		bodyModel[405].rotateAngleY = -3.14159265F;

		bodyModel[406].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[406].setRotationPoint(18.5F, -5F, 7F);
		bodyModel[406].rotateAngleY = -3.14159265F;

		bodyModel[407].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[407].setRotationPoint(18.5F, -4.5F, 7F);
		bodyModel[407].rotateAngleY = -3.14159265F;

		bodyModel[408].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[408].setRotationPoint(18.5F, -4F, 7F);
		bodyModel[408].rotateAngleY = -3.14159265F;

		bodyModel[409].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[409].setRotationPoint(17F, 0F, 4F);

		bodyModel[410].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[410].setRotationPoint(18.5F, -5F, 7F);
		bodyModel[410].rotateAngleY = -3.14159265F;

		bodyModel[411].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[411].setRotationPoint(18.5F, -3F, 7F);
		bodyModel[411].rotateAngleY = -3.14159265F;

		bodyModel[412].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[412].setRotationPoint(18.5F, -5F, 7F);
		bodyModel[412].rotateAngleY = -3.14159265F;

		bodyModel[413].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[413].setRotationPoint(18.5F, -4.5F, 7F);
		bodyModel[413].rotateAngleY = -3.14159265F;

		bodyModel[414].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[414].setRotationPoint(18.5F, -4F, 7F);
		bodyModel[414].rotateAngleY = -3.14159265F;

		bodyModel[415].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[415].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[415].rotateAngleY = -3.14159265F;

		bodyModel[416].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[416].setRotationPoint(8.5F, -3F, 7F);
		bodyModel[416].rotateAngleY = -3.14159265F;

		bodyModel[417].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[417].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[417].rotateAngleY = -3.14159265F;

		bodyModel[418].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[418].setRotationPoint(8.5F, -4.5F, 7F);
		bodyModel[418].rotateAngleY = -3.14159265F;

		bodyModel[419].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[419].setRotationPoint(8.5F, -4F, 7F);
		bodyModel[419].rotateAngleY = -3.14159265F;

		bodyModel[420].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[420].setRotationPoint(7F, 0F, 4F);

		bodyModel[421].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[421].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[421].rotateAngleY = -3.14159265F;

		bodyModel[422].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[422].setRotationPoint(8.5F, -3F, 7F);
		bodyModel[422].rotateAngleY = -3.14159265F;

		bodyModel[423].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[423].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[423].rotateAngleY = -3.14159265F;

		bodyModel[424].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[424].setRotationPoint(8.5F, -4.5F, 7F);
		bodyModel[424].rotateAngleY = -3.14159265F;

		bodyModel[425].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[425].setRotationPoint(8.5F, -4F, 7F);
		bodyModel[425].rotateAngleY = -3.14159265F;

		bodyModel[426].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[426].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[426].rotateAngleY = -3.14159265F;

		bodyModel[427].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[427].setRotationPoint(-1.5F, -3F, 7F);
		bodyModel[427].rotateAngleY = -3.14159265F;

		bodyModel[428].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[428].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[428].rotateAngleY = -3.14159265F;

		bodyModel[429].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[429].setRotationPoint(-1.5F, -4.5F, 7F);
		bodyModel[429].rotateAngleY = -3.14159265F;

		bodyModel[430].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[430].setRotationPoint(-1.5F, -4F, 7F);
		bodyModel[430].rotateAngleY = -3.14159265F;

		bodyModel[431].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[431].setRotationPoint(-3F, 0F, 4F);

		bodyModel[432].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[432].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[432].rotateAngleY = -3.14159265F;

		bodyModel[433].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[433].setRotationPoint(-1.5F, -3F, 7F);
		bodyModel[433].rotateAngleY = -3.14159265F;

		bodyModel[434].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[434].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[434].rotateAngleY = -3.14159265F;

		bodyModel[435].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[435].setRotationPoint(-1.5F, -4.5F, 7F);
		bodyModel[435].rotateAngleY = -3.14159265F;

		bodyModel[436].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[436].setRotationPoint(-1.5F, -4F, 7F);
		bodyModel[436].rotateAngleY = -3.14159265F;

		bodyModel[437].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[437].setRotationPoint(-11.5F, -5F, 7F);
		bodyModel[437].rotateAngleY = -3.14159265F;

		bodyModel[438].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[438].setRotationPoint(-11.5F, -3F, 7F);
		bodyModel[438].rotateAngleY = -3.14159265F;

		bodyModel[439].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[439].setRotationPoint(-11.5F, -5F, 7F);
		bodyModel[439].rotateAngleY = -3.14159265F;

		bodyModel[440].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[440].setRotationPoint(-11.5F, -4.5F, 7F);
		bodyModel[440].rotateAngleY = -3.14159265F;

		bodyModel[441].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[441].setRotationPoint(-11.5F, -4F, 7F);
		bodyModel[441].rotateAngleY = -3.14159265F;

		bodyModel[442].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[442].setRotationPoint(-12.5F, 0F, 4F);

		bodyModel[443].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[443].setRotationPoint(-11.5F, -5F, 7F);
		bodyModel[443].rotateAngleY = -3.14159265F;

		bodyModel[444].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[444].setRotationPoint(-11.5F, -3F, 7F);
		bodyModel[444].rotateAngleY = -3.14159265F;

		bodyModel[445].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[445].setRotationPoint(-11.5F, -5F, 7F);
		bodyModel[445].rotateAngleY = -3.14159265F;

		bodyModel[446].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[446].setRotationPoint(-11.5F, -4.5F, 7F);
		bodyModel[446].rotateAngleY = -3.14159265F;

		bodyModel[447].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[447].setRotationPoint(-11.5F, -4F, 7F);
		bodyModel[447].rotateAngleY = -3.14159265F;

		bodyModel[448].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[448].setRotationPoint(-21.5F, -5F, 7F);
		bodyModel[448].rotateAngleY = -3.14159265F;

		bodyModel[449].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[449].setRotationPoint(-21.5F, -3F, 7F);
		bodyModel[449].rotateAngleY = -3.14159265F;

		bodyModel[450].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[450].setRotationPoint(-21.5F, -5F, 7F);
		bodyModel[450].rotateAngleY = -3.14159265F;

		bodyModel[451].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[451].setRotationPoint(-21.5F, -4.5F, 7F);
		bodyModel[451].rotateAngleY = -3.14159265F;

		bodyModel[452].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[452].setRotationPoint(-21.5F, -4F, 7F);
		bodyModel[452].rotateAngleY = -3.14159265F;

		bodyModel[453].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[453].setRotationPoint(-23F, 0F, 4F);

		bodyModel[454].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[454].setRotationPoint(-21.5F, -5F, 7F);
		bodyModel[454].rotateAngleY = -3.14159265F;

		bodyModel[455].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[455].setRotationPoint(-21.5F, -3F, 7F);
		bodyModel[455].rotateAngleY = -3.14159265F;

		bodyModel[456].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[456].setRotationPoint(-21.5F, -5F, 7F);
		bodyModel[456].rotateAngleY = -3.14159265F;

		bodyModel[457].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[457].setRotationPoint(-21.5F, -4.5F, 7F);
		bodyModel[457].rotateAngleY = -3.14159265F;

		bodyModel[458].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[458].setRotationPoint(-21.5F, -4F, 7F);
		bodyModel[458].rotateAngleY = -3.14159265F;

		bodyModel[459].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[459].setRotationPoint(-31.5F, -5F, 7F);
		bodyModel[459].rotateAngleY = -3.14159265F;

		bodyModel[460].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[460].setRotationPoint(-31.5F, -3F, 7F);
		bodyModel[460].rotateAngleY = -3.14159265F;

		bodyModel[461].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[461].setRotationPoint(-31.5F, -5F, 7F);
		bodyModel[461].rotateAngleY = -3.14159265F;

		bodyModel[462].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[462].setRotationPoint(-31.5F, -4.5F, 7F);
		bodyModel[462].rotateAngleY = -3.14159265F;

		bodyModel[463].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[463].setRotationPoint(-31.5F, -4F, 7F);
		bodyModel[463].rotateAngleY = -3.14159265F;

		bodyModel[464].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[464].setRotationPoint(-33F, 0F, 4F);

		bodyModel[465].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[465].setRotationPoint(-31.5F, -5F, 7F);
		bodyModel[465].rotateAngleY = -3.14159265F;

		bodyModel[466].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[466].setRotationPoint(-31.5F, -3F, 7F);
		bodyModel[466].rotateAngleY = -3.14159265F;

		bodyModel[467].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[467].setRotationPoint(-31.5F, -5F, 7F);
		bodyModel[467].rotateAngleY = -3.14159265F;

		bodyModel[468].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[468].setRotationPoint(-31.5F, -4.5F, 7F);
		bodyModel[468].rotateAngleY = -3.14159265F;

		bodyModel[469].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[469].setRotationPoint(-31.5F, -4F, 7F);
		bodyModel[469].rotateAngleY = -3.14159265F;

		bodyModel[470].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[470].setRotationPoint(18.5F, -5F, -7F);
		bodyModel[470].rotateAngleY = -3.14159265F;

		bodyModel[471].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[471].setRotationPoint(18.5F, -3F, -7F);
		bodyModel[471].rotateAngleY = -3.14159265F;

		bodyModel[472].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[472].setRotationPoint(18.5F, -5F, -7F);
		bodyModel[472].rotateAngleY = -3.14159265F;

		bodyModel[473].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[473].setRotationPoint(18.5F, -4.5F, -7F);
		bodyModel[473].rotateAngleY = -3.14159265F;

		bodyModel[474].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[474].setRotationPoint(18.5F, -4F, -7F);
		bodyModel[474].rotateAngleY = -3.14159265F;

		bodyModel[475].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[475].setRotationPoint(18.5F, -5F, -7F);
		bodyModel[475].rotateAngleY = -3.14159265F;

		bodyModel[476].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[476].setRotationPoint(18.5F, -3F, -7F);
		bodyModel[476].rotateAngleY = -3.14159265F;

		bodyModel[477].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[477].setRotationPoint(18.5F, -5F, -7F);
		bodyModel[477].rotateAngleY = -3.14159265F;

		bodyModel[478].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[478].setRotationPoint(18.5F, -4.5F, -7F);
		bodyModel[478].rotateAngleY = -3.14159265F;

		bodyModel[479].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[479].setRotationPoint(18.5F, -4F, -7F);
		bodyModel[479].rotateAngleY = -3.14159265F;

		bodyModel[480].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[480].setRotationPoint(17F, 0F, -10F);

		bodyModel[481].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[481].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[481].rotateAngleY = -3.14159265F;

		bodyModel[482].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[482].setRotationPoint(8.5F, -3F, -7F);
		bodyModel[482].rotateAngleY = -3.14159265F;

		bodyModel[483].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[483].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[483].rotateAngleY = -3.14159265F;

		bodyModel[484].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[484].setRotationPoint(8.5F, -4.5F, -7F);
		bodyModel[484].rotateAngleY = -3.14159265F;

		bodyModel[485].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[485].setRotationPoint(8.5F, -4F, -7F);
		bodyModel[485].rotateAngleY = -3.14159265F;

		bodyModel[486].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[486].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[486].rotateAngleY = -3.14159265F;

		bodyModel[487].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[487].setRotationPoint(8.5F, -3F, -7F);
		bodyModel[487].rotateAngleY = -3.14159265F;

		bodyModel[488].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[488].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[488].rotateAngleY = -3.14159265F;

		bodyModel[489].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[489].setRotationPoint(8.5F, -4.5F, -7F);
		bodyModel[489].rotateAngleY = -3.14159265F;

		bodyModel[490].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[490].setRotationPoint(8.5F, -4F, -7F);
		bodyModel[490].rotateAngleY = -3.14159265F;

		bodyModel[491].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[491].setRotationPoint(7F, 0F, -10F);

		bodyModel[492].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[492].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[492].rotateAngleY = -3.14159265F;

		bodyModel[493].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[493].setRotationPoint(-1.5F, -3F, -7F);
		bodyModel[493].rotateAngleY = -3.14159265F;

		bodyModel[494].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[494].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[494].rotateAngleY = -3.14159265F;

		bodyModel[495].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[495].setRotationPoint(-1.5F, -4.5F, -7F);
		bodyModel[495].rotateAngleY = -3.14159265F;

		bodyModel[496].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[496].setRotationPoint(-1.5F, -4F, -7F);
		bodyModel[496].rotateAngleY = -3.14159265F;

		bodyModel[497].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[497].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[497].rotateAngleY = -3.14159265F;

		bodyModel[498].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[498].setRotationPoint(-1.5F, -3F, -7F);
		bodyModel[498].rotateAngleY = -3.14159265F;

		bodyModel[499].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[499].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[499].rotateAngleY = -3.14159265F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 203, 313, textureX, textureY); // Left seat part
		bodyModel[501] = new ModelRendererTurbo(this, 217, 310, textureX, textureY); // Left seat part
		bodyModel[502] = new ModelRendererTurbo(this, 190, 313, textureX, textureY); // Boc 42
		bodyModel[503] = new ModelRendererTurbo(this, 172, 302, textureX, textureY); // Left seat part
		bodyModel[504] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Left seat part
		bodyModel[505] = new ModelRendererTurbo(this, 179, 302, textureX, textureY); // Left seat part
		bodyModel[506] = new ModelRendererTurbo(this, 172, 305, textureX, textureY); // Left seat part
		bodyModel[507] = new ModelRendererTurbo(this, 186, 302, textureX, textureY); // Left seat part
		bodyModel[508] = new ModelRendererTurbo(this, 172, 310, textureX, textureY); // Left seat part
		bodyModel[509] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Left seat part
		bodyModel[510] = new ModelRendererTurbo(this, 179, 310, textureX, textureY); // Left seat part
		bodyModel[511] = new ModelRendererTurbo(this, 172, 313, textureX, textureY); // Left seat part
		bodyModel[512] = new ModelRendererTurbo(this, 186, 310, textureX, textureY); // Left seat part
		bodyModel[513] = new ModelRendererTurbo(this, 159, 313, textureX, textureY); // Boc 42
		bodyModel[514] = new ModelRendererTurbo(this, 141, 302, textureX, textureY); // Left seat part
		bodyModel[515] = new ModelRendererTurbo(this, 146, 305, textureX, textureY); // Left seat part
		bodyModel[516] = new ModelRendererTurbo(this, 148, 302, textureX, textureY); // Left seat part
		bodyModel[517] = new ModelRendererTurbo(this, 141, 305, textureX, textureY); // Left seat part
		bodyModel[518] = new ModelRendererTurbo(this, 155, 302, textureX, textureY); // Left seat part
		bodyModel[519] = new ModelRendererTurbo(this, 141, 310, textureX, textureY); // Left seat part
		bodyModel[520] = new ModelRendererTurbo(this, 146, 313, textureX, textureY); // Left seat part
		bodyModel[521] = new ModelRendererTurbo(this, 148, 310, textureX, textureY); // Left seat part
		bodyModel[522] = new ModelRendererTurbo(this, 141, 313, textureX, textureY); // Left seat part
		bodyModel[523] = new ModelRendererTurbo(this, 155, 310, textureX, textureY); // Left seat part
		bodyModel[524] = new ModelRendererTurbo(this, 128, 313, textureX, textureY); // Boc 42
		bodyModel[525] = new ModelRendererTurbo(this, 110, 302, textureX, textureY); // Left seat part
		bodyModel[526] = new ModelRendererTurbo(this, 115, 305, textureX, textureY); // Left seat part
		bodyModel[527] = new ModelRendererTurbo(this, 117, 302, textureX, textureY); // Left seat part
		bodyModel[528] = new ModelRendererTurbo(this, 110, 305, textureX, textureY); // Left seat part
		bodyModel[529] = new ModelRendererTurbo(this, 124, 302, textureX, textureY); // Left seat part
		bodyModel[530] = new ModelRendererTurbo(this, 110, 310, textureX, textureY); // Left seat part
		bodyModel[531] = new ModelRendererTurbo(this, 115, 313, textureX, textureY); // Left seat part
		bodyModel[532] = new ModelRendererTurbo(this, 117, 310, textureX, textureY); // Left seat part
		bodyModel[533] = new ModelRendererTurbo(this, 110, 313, textureX, textureY); // Left seat part
		bodyModel[534] = new ModelRendererTurbo(this, 124, 310, textureX, textureY); // Left seat part
		bodyModel[535] = new ModelRendererTurbo(this, 97, 313, textureX, textureY); // Boc 42
		bodyModel[536] = new ModelRendererTurbo(this, 17, 287, textureX, textureY); // Right seat part
		bodyModel[537] = new ModelRendererTurbo(this, 19, 291, textureX, textureY); // Right seat part
		bodyModel[538] = new ModelRendererTurbo(this, 17, 299, textureX, textureY); // Right seat part
		bodyModel[539] = new ModelRendererTurbo(this, 38, 321, textureX, textureY); // Box 498
		bodyModel[540] = new ModelRendererTurbo(this, 21, 321, textureX, textureY); // Box 498
		bodyModel[541] = new ModelRendererTurbo(this, 4, 321, textureX, textureY); // Box 498
		bodyModel[542] = new ModelRendererTurbo(this, 55, 249, textureX, textureY); // Box 735
		bodyModel[543] = new ModelRendererTurbo(this, 38, 249, textureX, textureY); // Box 736
		bodyModel[544] = new ModelRendererTurbo(this, 3, 353, textureX, textureY); // Box 498
		bodyModel[545] = new ModelRendererTurbo(this, 3, 340, textureX, textureY); // Box 498
		bodyModel[546] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[547] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[548] = new ModelRendererTurbo(this, 28, 138, textureX, textureY); // Box 128
		bodyModel[549] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[550] = new ModelRendererTurbo(this, 444, 19, textureX, textureY); // Box 153
		bodyModel[551] = new ModelRendererTurbo(this, 410, 89, textureX, textureY); // Box 128
		bodyModel[552] = new ModelRendererTurbo(this, 247, 164, textureX, textureY); // Box 140
		bodyModel[553] = new ModelRendererTurbo(this, 248, 167, textureX, textureY); // Box 141
		bodyModel[554] = new ModelRendererTurbo(this, 256, 164, textureX, textureY); // Box 142
		bodyModel[555] = new ModelRendererTurbo(this, 257, 167, textureX, textureY); // Box 143
		bodyModel[556] = new ModelRendererTurbo(this, 247, 155, textureX, textureY); // Box 26
		bodyModel[557] = new ModelRendererTurbo(this, 248, 158, textureX, textureY); // Box 26
		bodyModel[558] = new ModelRendererTurbo(this, 256, 155, textureX, textureY); // Box 26
		bodyModel[559] = new ModelRendererTurbo(this, 257, 158, textureX, textureY); // Box 26
		bodyModel[560] = new ModelRendererTurbo(this, 52, 85, textureX, textureY); // Box 128
		bodyModel[561] = new ModelRendererTurbo(this, 62, 105, textureX, textureY); // Box 204
		bodyModel[562] = new ModelRendererTurbo(this, 80, 379, textureX, textureY); // Box 38
		bodyModel[563] = new ModelRendererTurbo(this, 72, 374, textureX, textureY); // Box 462
		bodyModel[564] = new ModelRendererTurbo(this, 106, 256, textureX, textureY, "glow"); // Box 275 glow
		bodyModel[565] = new ModelRendererTurbo(this, 106, 199, textureX, textureY, "glow"); // Box 285 glow
		bodyModel[566] = new ModelRendererTurbo(this, 89, 386, textureX, textureY); // Box 38
		bodyModel[567] = new ModelRendererTurbo(this, 89, 384, textureX, textureY); // Box 452
		bodyModel[568] = new ModelRendererTurbo(this, 91, 169, textureX, textureY); // Box 2
		bodyModel[569] = new ModelRendererTurbo(this, 91, 166, textureX, textureY); // Box 521

		bodyModel[500].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[500].setRotationPoint(-1.5F, -4.5F, -7F);
		bodyModel[500].rotateAngleY = -3.14159265F;

		bodyModel[501].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[501].setRotationPoint(-1.5F, -4F, -7F);
		bodyModel[501].rotateAngleY = -3.14159265F;

		bodyModel[502].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[502].setRotationPoint(-2.5F, 0F, -10F);

		bodyModel[503].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[503].setRotationPoint(-11.5F, -5F, -7F);
		bodyModel[503].rotateAngleY = -3.14159265F;

		bodyModel[504].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[504].setRotationPoint(-11.5F, -3F, -7F);
		bodyModel[504].rotateAngleY = -3.14159265F;

		bodyModel[505].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[505].setRotationPoint(-11.5F, -5F, -7F);
		bodyModel[505].rotateAngleY = -3.14159265F;

		bodyModel[506].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[506].setRotationPoint(-11.5F, -4.5F, -7F);
		bodyModel[506].rotateAngleY = -3.14159265F;

		bodyModel[507].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[507].setRotationPoint(-11.5F, -4F, -7F);
		bodyModel[507].rotateAngleY = -3.14159265F;

		bodyModel[508].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[508].setRotationPoint(-11.5F, -5F, -7F);
		bodyModel[508].rotateAngleY = -3.14159265F;

		bodyModel[509].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[509].setRotationPoint(-11.5F, -3F, -7F);
		bodyModel[509].rotateAngleY = -3.14159265F;

		bodyModel[510].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[510].setRotationPoint(-11.5F, -5F, -7F);
		bodyModel[510].rotateAngleY = -3.14159265F;

		bodyModel[511].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[511].setRotationPoint(-11.5F, -4.5F, -7F);
		bodyModel[511].rotateAngleY = -3.14159265F;

		bodyModel[512].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[512].setRotationPoint(-11.5F, -4F, -7F);
		bodyModel[512].rotateAngleY = -3.14159265F;

		bodyModel[513].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[513].setRotationPoint(-13F, 0F, -10F);

		bodyModel[514].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[514].setRotationPoint(-21.5F, -5F, -7F);
		bodyModel[514].rotateAngleY = -3.14159265F;

		bodyModel[515].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[515].setRotationPoint(-21.5F, -3F, -7F);
		bodyModel[515].rotateAngleY = -3.14159265F;

		bodyModel[516].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[516].setRotationPoint(-21.5F, -5F, -7F);
		bodyModel[516].rotateAngleY = -3.14159265F;

		bodyModel[517].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[517].setRotationPoint(-21.5F, -4.5F, -7F);
		bodyModel[517].rotateAngleY = -3.14159265F;

		bodyModel[518].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[518].setRotationPoint(-21.5F, -4F, -7F);
		bodyModel[518].rotateAngleY = -3.14159265F;

		bodyModel[519].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[519].setRotationPoint(-21.5F, -5F, -7F);
		bodyModel[519].rotateAngleY = -3.14159265F;

		bodyModel[520].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[520].setRotationPoint(-21.5F, -3F, -7F);
		bodyModel[520].rotateAngleY = -3.14159265F;

		bodyModel[521].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[521].setRotationPoint(-21.5F, -5F, -7F);
		bodyModel[521].rotateAngleY = -3.14159265F;

		bodyModel[522].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[522].setRotationPoint(-21.5F, -4.5F, -7F);
		bodyModel[522].rotateAngleY = -3.14159265F;

		bodyModel[523].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[523].setRotationPoint(-21.5F, -4F, -7F);
		bodyModel[523].rotateAngleY = -3.14159265F;

		bodyModel[524].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[524].setRotationPoint(-23F, 0F, -10F);

		bodyModel[525].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[525].setRotationPoint(-31.5F, -5F, -7F);
		bodyModel[525].rotateAngleY = -3.14159265F;

		bodyModel[526].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[526].setRotationPoint(-31.5F, -3F, -7F);
		bodyModel[526].rotateAngleY = -3.14159265F;

		bodyModel[527].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[527].setRotationPoint(-31.5F, -5F, -7F);
		bodyModel[527].rotateAngleY = -3.14159265F;

		bodyModel[528].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[528].setRotationPoint(-31.5F, -4.5F, -7F);
		bodyModel[528].rotateAngleY = -3.14159265F;

		bodyModel[529].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[529].setRotationPoint(-31.5F, -4F, -7F);
		bodyModel[529].rotateAngleY = -3.14159265F;

		bodyModel[530].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[530].setRotationPoint(-31.5F, -5F, -7F);
		bodyModel[530].rotateAngleY = -3.14159265F;

		bodyModel[531].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[531].setRotationPoint(-31.5F, -3F, -7F);
		bodyModel[531].rotateAngleY = -3.14159265F;

		bodyModel[532].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[532].setRotationPoint(-31.5F, -5F, -7F);
		bodyModel[532].rotateAngleY = -3.14159265F;

		bodyModel[533].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[533].setRotationPoint(-31.5F, -4.5F, -7F);
		bodyModel[533].rotateAngleY = -3.14159265F;

		bodyModel[534].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[534].setRotationPoint(-31.5F, -4F, -7F);
		bodyModel[534].rotateAngleY = -3.14159265F;

		bodyModel[535].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[535].setRotationPoint(-33F, 0F, -10F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[536].setRotationPoint(-50.25F, -5F, -4.5F);

		bodyModel[537].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[537].setRotationPoint(-49.25F, -5.5F, -3.5F);
		bodyModel[537].rotateAngleY = -0.78539816F;

		bodyModel[538].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[538].setRotationPoint(-50.25F, 0.5F, -4.5F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[539].setRotationPoint(-49F, -4.5F, -9F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[540].setRotationPoint(-50F, -4.5F, -9F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[541].setRotationPoint(-53.5F, -4.5F, -9F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 735
		bodyModel[542].setRotationPoint(-45.5F, -4.5F, 2F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 736
		bodyModel[543].setRotationPoint(-49F, -4.5F, 2F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F,0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -0.5F, -3F, -5.5F, -0.5F, -3F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 498
		bodyModel[544].setRotationPoint(-56F, -4.5F, -2.5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F,0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -0.5F, -3F, -5.5F, -0.5F, -3F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 498
		bodyModel[545].setRotationPoint(-56F, -4.5F, 1F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[546].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[547].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[548].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[549].setRotationPoint(63F, -16F, -5F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[550].setRotationPoint(63F, -16F, 0F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[551].setRotationPoint(63F, 1F, -5F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		bodyModel[552].setRotationPoint(56.5F, 3F, 7F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		bodyModel[553].setRotationPoint(56.5F, 4F, 8F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[554].setRotationPoint(60.5F, 3F, 7F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[555].setRotationPoint(60.5F, 4F, 8F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[556].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[557].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[558].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[559].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[560].setRotationPoint(-61.5F, -1.5F, -12F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[561].setRotationPoint(-61.5F, -1.5F, 11F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 104, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[562].setRotationPoint(-56.5F, -10F, -9.9F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 112, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[563].setRotationPoint(-56.5F, -10F, 9.9F);

		bodyModel[564].addBox(0F, 0F, 0F, 64, 0, 1, 0F); // Box 275 glow
		bodyModel[564].setRotationPoint(-37.5F, -12.99F, -8.5F);

		bodyModel[565].addBox(0F, 0F, 0F, 73, 0, 1, 0F); // Box 285 glow
		bodyModel[565].setRotationPoint(-37.5F, -12.99F, 7.5F);

		bodyModel[566].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 38
		bodyModel[566].setRotationPoint(-47.5F, -1.5F, -11.01F);

		bodyModel[567].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 452
		bodyModel[567].setRotationPoint(-47.5F, -1.5F, 11.01F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[568].setRotationPoint(-27.5F, 5F, 9.75F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 521
		bodyModel[569].setRotationPoint(-27.5F, 5F, -10.75F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 570; i++)
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
				bodyModel[i].render(f5);
			}
		}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==124562){
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