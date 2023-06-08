//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:04.02.2022 - 20:31:14
// Last changed on: 04.02.2022 - 20:31:14

package com.jcirmodelsquad.tcjcir.models.trains;

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPCHBogie;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.EntityRollingStock;


public class ModelPCH130Commute2 extends ModelConverter {

	int textureX = 512;
	int textureY = 512;
	public ModelPCH130Commute2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[147];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 35
		bodyModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 39
		bodyModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 43
		bodyModel[4] = new ModelRendererTurbo(this, 171, 104, textureX, textureY); // Box 46
		bodyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 47
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		bodyModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 29
		bodyModel[8] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 31
		bodyModel[9] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 32
		bodyModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 34
		bodyModel[11] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 36
		bodyModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 40
		bodyModel[13] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 47
		bodyModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 51
		bodyModel[15] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 56
		bodyModel[16] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 58
		bodyModel[17] = new ModelRendererTurbo(this, 33, 26, textureX, textureY); // Box 59
		bodyModel[18] = new ModelRendererTurbo(this, 289, 32, textureX, textureY); // Box 60
		bodyModel[19] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 61
		bodyModel[20] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 186
		bodyModel[21] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 109
		bodyModel[22] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 110
		bodyModel[23] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 118
		bodyModel[24] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 119
		bodyModel[25] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 149
		bodyModel[26] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 150
		bodyModel[27] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 227
		bodyModel[28] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 228
		bodyModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 229
		bodyModel[30] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 230
		bodyModel[31] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 231
		bodyModel[32] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 232
		bodyModel[33] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 383
		bodyModel[34] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 384
		bodyModel[35] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 385
		bodyModel[36] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 387
		bodyModel[37] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 388
		bodyModel[38] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 389
		bodyModel[39] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 390
		bodyModel[40] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 391
		bodyModel[41] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 83
		bodyModel[42] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 84
		bodyModel[43] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 86
		bodyModel[44] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 87
		bodyModel[45] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 92
		bodyModel[46] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 94
		bodyModel[47] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 96 door slide left left side
		bodyModel[48] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 97 door slide right left side
		bodyModel[49] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 103
		bodyModel[50] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 104 door slide right right side
		bodyModel[51] = new ModelRendererTurbo(this, 49, 134, textureX, textureY); // Box 105
		bodyModel[52] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 106 door slide left right side
		bodyModel[53] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 107
		bodyModel[54] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 108
		bodyModel[55] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 111
		bodyModel[56] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 113
		bodyModel[57] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 114
		bodyModel[58] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 115
		bodyModel[59] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 117
		bodyModel[60] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 118
		bodyModel[61] = new ModelRendererTurbo(this, 248, 41, textureX, textureY); // Box 119
		bodyModel[62] = new ModelRendererTurbo(this, 192, 48, textureX, textureY); // Box 120
		bodyModel[63] = new ModelRendererTurbo(this, 305, 48, textureX, textureY); // Box 121
		bodyModel[64] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 122
		bodyModel[65] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 123
		bodyModel[66] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 124
		bodyModel[67] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 125
		bodyModel[68] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 126
		bodyModel[69] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 127
		bodyModel[70] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 139
		bodyModel[71] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 140
		bodyModel[72] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 141
		bodyModel[73] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 142
		bodyModel[74] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 143
		bodyModel[75] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 150
		bodyModel[76] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 151
		bodyModel[77] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 106
		bodyModel[78] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 107
		bodyModel[79] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 108
		bodyModel[80] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 109
		bodyModel[81] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 110
		bodyModel[82] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 111
		bodyModel[83] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 118
		bodyModel[84] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 119
		bodyModel[85] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 120
		bodyModel[86] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 121
		bodyModel[87] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 122
		bodyModel[88] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 123
		bodyModel[89] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 124
		bodyModel[90] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 125
		bodyModel[91] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 126
		bodyModel[92] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 127
		bodyModel[93] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 129
		bodyModel[95] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 130
		bodyModel[96] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 131
		bodyModel[97] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 132
		bodyModel[98] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 133
		bodyModel[99] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 134
		bodyModel[100] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 135
		bodyModel[101] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 138
		bodyModel[102] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 139 door slide left right side
		bodyModel[103] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 140 door slide right right side
		bodyModel[104] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 141
		bodyModel[105] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 142 door slide right left side
		bodyModel[106] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 143 door slide left left side
		bodyModel[107] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 144
		bodyModel[108] = new ModelRendererTurbo(this, 49, 110, textureX, textureY); // Box 149
		bodyModel[109] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 263
		bodyModel[110] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 134
		bodyModel[111] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 135
		bodyModel[112] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 137
		bodyModel[113] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 124
		bodyModel[114] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 124
		bodyModel[115] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 270
		bodyModel[116] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 271
		bodyModel[117] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 272
		bodyModel[118] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 275
		bodyModel[119] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 130
		bodyModel[120] = new ModelRendererTurbo(this, 297, 37, textureX, textureY); // Box 130
		bodyModel[121] = new ModelRendererTurbo(this, 290, 37, textureX, textureY); // Box 131
		bodyModel[122] = new ModelRendererTurbo(this, 2, 108, textureX, textureY); // Box 130
		bodyModel[123] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 131
		bodyModel[124] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 132
		bodyModel[125] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 133
		bodyModel[126] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 134
		bodyModel[127] = new ModelRendererTurbo(this, 351, 37, textureX, textureY); // Box 135
		bodyModel[128] = new ModelRendererTurbo(this, 352, 37, textureX, textureY); // Box 136
		bodyModel[129] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 139
		bodyModel[130] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 140
		bodyModel[131] = new ModelRendererTurbo(this, 2, 158, textureX, textureY); // Box 137
		bodyModel[132] = new ModelRendererTurbo(this, 43, 168, textureX, textureY); // Box 142
		bodyModel[133] = new ModelRendererTurbo(this, 32, 168, textureX, textureY); // Box 143
		bodyModel[134] = new ModelRendererTurbo(this, 56, 160, textureX, textureY); // Box 144
		bodyModel[135] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 146
		bodyModel[136] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 147
		bodyModel[137] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 148
		bodyModel[138] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 149
		bodyModel[139] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 150
		bodyModel[140] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 152
		bodyModel[141] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 145
		bodyModel[142] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 146
		bodyModel[143] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 147
		bodyModel[144] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 228
		bodyModel[145] = new ModelRendererTurbo(this, 31, 173, textureX, textureY); // Box 147
		bodyModel[146] = new ModelRendererTurbo(this, 54, 173, textureX, textureY); // Box 148

		bodyModel[0].addBox(0F, 0F, 0F, 83, 1, 22, 0F); // Box 11
		bodyModel[0].setRotationPoint(-41F, 3F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[1].setRotationPoint(-46F, 3F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 19, 9, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 39
		bodyModel[2].setRotationPoint(-43F, -16F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 19, 9, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 43
		bodyModel[3].setRotationPoint(-43F, -16F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 46
		bodyModel[4].setRotationPoint(-47F, 3F, -3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[5].setRotationPoint(-50F, 3F, -1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-2F, 1F, 1F, 1F, -3F, 0F, 1F, -3F, 0F, -2F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 24
		bodyModel[6].setRotationPoint(-38F, -19F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 78, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[7].setRotationPoint(-36F, -17F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 53, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[8].setRotationPoint(-36F, -20F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 53, 1, 9, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[9].setRotationPoint(-36F, -20F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 34
		bodyModel[10].setRotationPoint(-45F, 3F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-1F, 0F, 1F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 1F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F); // Box 36
		bodyModel[11].setRotationPoint(-42F, -16F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F); // Box 40
		bodyModel[12].setRotationPoint(-42F, -16F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,2F, -3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, 2F, -3F, 0F, 2F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 47
		bodyModel[13].setRotationPoint(-39F, -19F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[14].setRotationPoint(-45F, 3F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 56
		bodyModel[15].setRotationPoint(-38F, -14F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-2F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2F, 1F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 1F); // Box 58
		bodyModel[16].setRotationPoint(-38F, -19F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[17].setRotationPoint(-36F, -19F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 78, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[18].setRotationPoint(-36F, -17F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 20, 1, 14, 0F); // Box 61
		bodyModel[19].setRotationPoint(16F, -20F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 12, 1, 8, 0F); // Box 186
		bodyModel[20].setRotationPoint(20F, -22F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[21].setRotationPoint(34.3F, -25.5F, 1F);
		bodyModel[21].rotateAngleY = -3.14159265F;
		bodyModel[21].rotateAngleZ = -0.27925268F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 110
		bodyModel[22].setRotationPoint(35F, -25.5F, 3F);
		bodyModel[22].rotateAngleY = -3.14159265F;
		bodyModel[22].rotateAngleZ = 0.78539816F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 118
		bodyModel[23].setRotationPoint(26F, -32F, 2.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 119
		bodyModel[24].setRotationPoint(26F, -31.5F, -5.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[25].setRotationPoint(26F, -32F, -5.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[26].setRotationPoint(26F, -32.5F, -2.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 227
		bodyModel[27].setRotationPoint(19F, -22.5F, -5F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 228
		bodyModel[28].setRotationPoint(31F, -22.5F, -5F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 229
		bodyModel[29].setRotationPoint(31F, -22.5F, 4F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 230
		bodyModel[30].setRotationPoint(19F, -22.5F, 4F);

		bodyModel[31].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 231
		bodyModel[31].setRotationPoint(21F, -22.5F, 4F);

		bodyModel[32].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 232
		bodyModel[32].setRotationPoint(21F, -22.5F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 383
		bodyModel[33].setRotationPoint(28F, -32F, -6.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 384
		bodyModel[34].setRotationPoint(28F, -31.5F, -6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[35].setRotationPoint(28F, -32.5F, -3.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 387
		bodyModel[36].setRotationPoint(28F, -32F, 3.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 388
		bodyModel[37].setRotationPoint(26F, -31.5F, 4.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 389
		bodyModel[38].setRotationPoint(28F, -31.5F, 5.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 390
		bodyModel[39].setRotationPoint(35F, -25.5F, -2F);
		bodyModel[39].rotateAngleY = -3.14159265F;
		bodyModel[39].rotateAngleZ = 0.78539816F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[40].setRotationPoint(27F, -32.5F, -2.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[41].setRotationPoint(17F, -20F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[42].setRotationPoint(17F, -20F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[43].setRotationPoint(35F, -20F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[44].setRotationPoint(35F, -20F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 92
		bodyModel[45].setRotationPoint(-50F, 3F, -3F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 17, 5, 0F); // Box 94
		bodyModel[46].setRotationPoint(41F, -14F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 96 door slide left left side
		bodyModel[47].setRotationPoint(-28F, -14F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 97 door slide right left side
		bodyModel[48].setRotationPoint(-20F, -14F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 103
		bodyModel[49].setRotationPoint(-38F, -14F, 10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 104 door slide right right side
		bodyModel[50].setRotationPoint(-28F, -14F, 10F);

		bodyModel[51].addBox(0F, 0F, 0F, 36, 17, 1, 0F); // Box 105
		bodyModel[51].setRotationPoint(-12F, -14F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 106 door slide left right side
		bodyModel[52].setRotationPoint(-20F, -14F, 10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[53].setRotationPoint(41F, -17F, -9F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 108
		bodyModel[54].setRotationPoint(41F, -17F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 111
		bodyModel[55].setRotationPoint(41F, -17F, 8F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 17, 5, 0F); // Box 113
		bodyModel[56].setRotationPoint(41F, -14F, 5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 17, 10, 0F); // Box 114
		bodyModel[57].setRotationPoint(41F, -14F, -5F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 115
		bodyModel[58].setRotationPoint(42F, 3F, -1F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 117
		bodyModel[59].setRotationPoint(42F, -15F, -6F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 118
		bodyModel[60].setRotationPoint(42F, -15F, 5F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 119
		bodyModel[61].setRotationPoint(42F, 2F, -5F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 120
		bodyModel[62].setRotationPoint(42F, -16F, -5F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 5, 16, 0F); // Box 121
		bodyModel[63].setRotationPoint(-32F, -19F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[64].setRotationPoint(-32F, -16F, -9F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 123
		bodyModel[65].setRotationPoint(-32F, -19F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 124
		bodyModel[66].setRotationPoint(-32F, -16F, 8F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 125
		bodyModel[67].setRotationPoint(-32F, -19F, 8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 27, 1, 9, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[68].setRotationPoint(-23F, -21F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 27, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[69].setRotationPoint(-23F, -21F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 139
		bodyModel[70].setRotationPoint(8F, 0F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 140
		bodyModel[71].setRotationPoint(8F, -6F, -10F);

		bodyModel[72].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 141
		bodyModel[72].setRotationPoint(14F, 0F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 142
		bodyModel[73].setRotationPoint(14F, -6F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[74].setRotationPoint(20F, -4F, -10F);

		bodyModel[75].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 150
		bodyModel[75].setRotationPoint(-2F, 0F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[76].setRotationPoint(2F, -6F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[77].setRotationPoint(2F, -6F, -6F);

		bodyModel[78].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 107
		bodyModel[78].setRotationPoint(-2F, 0F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[79].setRotationPoint(-7F, -6F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[80].setRotationPoint(-7F, -6F, -6F);

		bodyModel[81].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 110
		bodyModel[81].setRotationPoint(-11F, 0F, -6F);

		bodyModel[82].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 111
		bodyModel[82].setRotationPoint(-11F, 0F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[83].setRotationPoint(-7F, -6F, 6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[84].setRotationPoint(-7F, -6F, 2F);

		bodyModel[85].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 120
		bodyModel[85].setRotationPoint(-11F, 0F, 2F);

		bodyModel[86].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 121
		bodyModel[86].setRotationPoint(-11F, 0F, 6F);

		bodyModel[87].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 122
		bodyModel[87].setRotationPoint(-2F, 0F, 2F);

		bodyModel[88].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 123
		bodyModel[88].setRotationPoint(-2F, 0F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[89].setRotationPoint(2F, -6F, 2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[90].setRotationPoint(2F, -6F, 6F);

		bodyModel[91].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 126
		bodyModel[91].setRotationPoint(8F, 0F, 2F);

		bodyModel[92].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 127
		bodyModel[92].setRotationPoint(8F, 0F, 6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 128
		bodyModel[93].setRotationPoint(9F, -6F, 2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 129
		bodyModel[94].setRotationPoint(9F, -6F, 6F);

		bodyModel[95].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 130
		bodyModel[95].setRotationPoint(16F, 0F, 2F);

		bodyModel[96].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 131
		bodyModel[96].setRotationPoint(16F, 0F, 6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 132
		bodyModel[97].setRotationPoint(21F, -6F, 2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 133
		bodyModel[98].setRotationPoint(21F, -6F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 134
		bodyModel[99].setRotationPoint(-44.5F, -3F, -8F);
		bodyModel[99].rotateAngleY = 0.10471976F;
		bodyModel[99].rotateAngleZ = -0.2268928F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 135
		bodyModel[100].setRotationPoint(-44.5F, -3F, 6F);
		bodyModel[100].rotateAngleY = -0.03490659F;
		bodyModel[100].rotateAngleZ = -0.2443461F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 138
		bodyModel[101].setRotationPoint(22F, -19F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 139 door slide left right side
		bodyModel[102].setRotationPoint(32F, -14F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 140 door slide right right side
		bodyModel[103].setRotationPoint(24F, -14F, 10F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 17, 1, 0F); // Box 141
		bodyModel[104].setRotationPoint(40F, -14F, 10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 142 door slide right left side
		bodyModel[105].setRotationPoint(32F, -14F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 143 door slide left left side
		bodyModel[106].setRotationPoint(24F, -14F, -11F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 17, 1, 0F); // Box 144
		bodyModel[107].setRotationPoint(40F, -14F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 36, 17, 1, 0F); // Box 149
		bodyModel[108].setRotationPoint(-12F, -14F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 25, 3, 17, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 263
		bodyModel[109].setRotationPoint(-13F, 4F, -8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,2F, -3F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 2F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 2F, 0F); // Box 134
		bodyModel[110].setRotationPoint(-39F, -19F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 135
		bodyModel[111].setRotationPoint(-11F, -19F, -8F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 11, 3, 0F); // Box 137
		bodyModel[112].setRotationPoint(40F, -13F, -9F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[113].setRotationPoint(-29F, 4F, -2F);

		bodyModel[114].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[114].setRotationPoint(27F, 4F, -2F);

		bodyModel[115].addBox(0F, 0F, 0F, 82, 1, 1, 0F); // Box 270
		bodyModel[115].setRotationPoint(-40F, 4F, -11F);

		bodyModel[116].addBox(0F, 0F, 0F, 82, 1, 1, 0F); // Box 271
		bodyModel[116].setRotationPoint(-40F, 4F, 10F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 272
		bodyModel[117].setRotationPoint(41F, 4F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[118].setRotationPoint(7F, -4F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 130
		bodyModel[119].setRotationPoint(-36F, -19F, 9F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 130
		bodyModel[120].setRotationPoint(-38F, -16F, -11F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 131
		bodyModel[121].setRotationPoint(-38F, -16F, 10F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 130
		bodyModel[122].setRotationPoint(41F, -19F, -9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[123].setRotationPoint(42F, -16F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[124].setRotationPoint(42F, -16F, 5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 133
		bodyModel[125].setRotationPoint(-41F, 4F, 10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 134
		bodyModel[126].setRotationPoint(-41F, 4F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[127].setRotationPoint(41F, 5F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 136
		bodyModel[128].setRotationPoint(41F, 5F, 10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 139
		bodyModel[129].setRotationPoint(-46F, 3F, 3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -1F); // Box 140
		bodyModel[130].setRotationPoint(-45F, 3F, 9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 137
		bodyModel[131].setRotationPoint(-43F, -1F, -9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[132].setRotationPoint(-43F, -2F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[133].setRotationPoint(-43F, -2F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[134].setRotationPoint(-43F, -2F, -8.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[135].setRotationPoint(-32F, -6F, -5F);

		bodyModel[136].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 147
		bodyModel[136].setRotationPoint(-36F, 0F, -9F);

		bodyModel[137].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 148
		bodyModel[137].setRotationPoint(-36F, 0F, -5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[138].setRotationPoint(-32F, -6F, -9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[139].setRotationPoint(-32F, -6F, 2F);

		bodyModel[140].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 152
		bodyModel[140].setRotationPoint(-36F, 0F, 2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 145
		bodyModel[141].setRotationPoint(-50F, 3F, 2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 146
		bodyModel[142].setRotationPoint(42F, 3F, 2F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 147
		bodyModel[143].setRotationPoint(42F, 3F, -3F);

		bodyModel[144].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 228
		bodyModel[144].setRotationPoint(27F, 4.5F, -2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.4F, -0.2F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.4F, 0F, 0.5F); // Box 147
		bodyModel[145].setRotationPoint(-43F, -2F, -9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.9F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[146].setRotationPoint(-43F, -2F, -10F);
	}
	ModelPCHBogie theBogie = new ModelPCHBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		EntityRollingStock stock = (EntityRollingStock)entity;

		for(int i = 0; i < 147; i++)
		{
			if (i == 110 || i == 111 || i == 107 || i == 108 || i == 54 || i == 56 || i == 48 || i == 49) {

				if (stock.getRenderRef("doors") != null && (stock.getRenderRef("doors").getAsBoolean())) {
					bodyModel[i].render(f5);
				}
			} else {
				bodyModel[i].render(f5);
			}




		}

		Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/pch120_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(1.75F ,0.22F,0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theBogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(-1.75F,0.22F,0);
		theBogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();


/*
		String s = "test";
		FontRenderer fontrenderer = Minecraft.getMinecraft().fontRenderer;
		GL11.glPushMatrix();
		GL11.glTranslatef((float)f + 0.0F, (float)f1 + entity.height + 0.5F, (float)f2);
		GL11.glNormal3f(0.0F, 1.0F, 0.0F);

		GL11.glScalef(-f1, -f1, f1);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glTranslatef(0.0F, 0.25F / f1, 0.0F);
		GL11.glDepthMask(false);
		GL11.glEnable(GL11.GL_BLEND);
		OpenGlHelper.glBlendFunc(770, 771, 1, 0);
		net.minecraft.client.renderer.Tessellator tessellator = net.minecraft.client.renderer.Tessellator.instance;
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		tessellator.startDrawingQuads();
		int i = fontrenderer.getStringWidth(s) / 2;
		tessellator.setColorRGBA_F(0.0F, 0.0F, 0.0F, 0.25F);
		tessellator.addVertex((double)(-i - 1), -1.0D, 0.0D);
		tessellator.addVertex((double)(-i - 1), 8.0D, 0.0D);
		tessellator.addVertex((double)(i + 1), 8.0D, 0.0D);
		tessellator.addVertex((double)(i + 1), -1.0D, 0.0D);
		tessellator.draw();
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glDepthMask(true);
		fontrenderer.drawString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", -fontrenderer.getStringWidth(s) / 2, 0, 553648127);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);*/
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public float[] getTrans() {
		return new float[]{-1.7F, 0.1F, 0F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	public ModelRendererTurbo[] pch130commute2Model;
}