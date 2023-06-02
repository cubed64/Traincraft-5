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
		bodyModel = new ModelRendererTurbo[137];

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
		bodyModel[47] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 95
		bodyModel[48] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 96 door slide left left side
		bodyModel[49] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 97 door slide right left side
		bodyModel[50] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 167
		bodyModel[51] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 168
		bodyModel[52] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 172
		bodyModel[53] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 103
		bodyModel[54] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 104 door slide right right side
		bodyModel[55] = new ModelRendererTurbo(this, 49, 134, textureX, textureY); // Box 105
		bodyModel[56] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 106 door slide left right side
		bodyModel[57] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 107
		bodyModel[58] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 108
		bodyModel[59] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 111
		bodyModel[60] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 113
		bodyModel[61] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 114
		bodyModel[62] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 115
		bodyModel[63] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 116
		bodyModel[64] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 117
		bodyModel[65] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 118
		bodyModel[66] = new ModelRendererTurbo(this, 248, 41, textureX, textureY); // Box 119
		bodyModel[67] = new ModelRendererTurbo(this, 192, 48, textureX, textureY); // Box 120
		bodyModel[68] = new ModelRendererTurbo(this, 305, 48, textureX, textureY); // Box 121
		bodyModel[69] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 122
		bodyModel[70] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 123
		bodyModel[71] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 124
		bodyModel[72] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 125
		bodyModel[73] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 126
		bodyModel[74] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 127
		bodyModel[75] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 139
		bodyModel[76] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 140
		bodyModel[77] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 141
		bodyModel[78] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 142
		bodyModel[79] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 143
		bodyModel[80] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 150
		bodyModel[81] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 151
		bodyModel[82] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 106
		bodyModel[83] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 107
		bodyModel[84] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 108
		bodyModel[85] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 109
		bodyModel[86] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 110
		bodyModel[87] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 111
		bodyModel[88] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 118
		bodyModel[89] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 119
		bodyModel[90] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 120
		bodyModel[91] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 121
		bodyModel[92] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 122
		bodyModel[93] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 123
		bodyModel[94] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 124
		bodyModel[95] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 125
		bodyModel[96] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 126
		bodyModel[97] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 127
		bodyModel[98] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 129
		bodyModel[100] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 130
		bodyModel[101] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 131
		bodyModel[102] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 132
		bodyModel[103] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 133
		bodyModel[104] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 134
		bodyModel[105] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 135
		bodyModel[106] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 138
		bodyModel[107] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 139 door slide left right side
		bodyModel[108] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 140 door slide right right side
		bodyModel[109] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 141
		bodyModel[110] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 142 door slide right left side
		bodyModel[111] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 143 door slide left left side
		bodyModel[112] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 144
		bodyModel[113] = new ModelRendererTurbo(this, 49, 110, textureX, textureY); // Box 149
		bodyModel[114] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 263
		bodyModel[115] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 134
		bodyModel[116] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 135
		bodyModel[117] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 136
		bodyModel[118] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 137
		bodyModel[119] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 124
		bodyModel[120] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 124
		bodyModel[121] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 270
		bodyModel[122] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 271
		bodyModel[123] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 272
		bodyModel[124] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 275
		bodyModel[125] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 130
		bodyModel[126] = new ModelRendererTurbo(this, 297, 37, textureX, textureY); // Box 130
		bodyModel[127] = new ModelRendererTurbo(this, 290, 37, textureX, textureY); // Box 131
		bodyModel[128] = new ModelRendererTurbo(this, 2, 108, textureX, textureY); // Box 130
		bodyModel[129] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 131
		bodyModel[130] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 132
		bodyModel[131] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 133
		bodyModel[132] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 134
		bodyModel[133] = new ModelRendererTurbo(this, 351, 37, textureX, textureY); // Box 135
		bodyModel[134] = new ModelRendererTurbo(this, 352, 37, textureX, textureY); // Box 136
		bodyModel[135] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 139
		bodyModel[136] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 140

		bodyModel[0].addBox(0F, 0F, 0F, 83, 1, 22, 0F); // Box 11
		bodyModel[0].setRotationPoint(-43F, 0F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[1].setRotationPoint(-48F, 0F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 19, 9, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 39
		bodyModel[2].setRotationPoint(-45F, -19F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 19, 9, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 43
		bodyModel[3].setRotationPoint(-45F, -19F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 46
		bodyModel[4].setRotationPoint(-49F, 0F, -3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[5].setRotationPoint(-52F, 0F, -1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-2F, 1F, 1F, 1F, -3F, 0F, 1F, -3F, 0F, -2F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 24
		bodyModel[6].setRotationPoint(-40F, -22F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 78, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[7].setRotationPoint(-38F, -20F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 53, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[8].setRotationPoint(-38F, -23F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 53, 1, 9, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[9].setRotationPoint(-38F, -23F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 34
		bodyModel[10].setRotationPoint(-47F, 0F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-1F, 0F, 1F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 1F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F); // Box 36
		bodyModel[11].setRotationPoint(-44F, -19F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F); // Box 40
		bodyModel[12].setRotationPoint(-44F, -19F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,2F, -3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, 2F, -3F, 0F, 2F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 47
		bodyModel[13].setRotationPoint(-41F, -22F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[14].setRotationPoint(-47F, 0F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 56
		bodyModel[15].setRotationPoint(-40F, -17F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-2F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2F, 1F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 1F); // Box 58
		bodyModel[16].setRotationPoint(-40F, -22F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[17].setRotationPoint(-38F, -22F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 78, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[18].setRotationPoint(-38F, -20F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 20, 1, 14, 0F); // Box 61
		bodyModel[19].setRotationPoint(14F, -23F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 12, 1, 8, 0F); // Box 186
		bodyModel[20].setRotationPoint(18F, -25F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[21].setRotationPoint(32.3F, -28.5F, 1F);
		bodyModel[21].rotateAngleY = -3.14159265F;
		bodyModel[21].rotateAngleZ = -0.27925268F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 110
		bodyModel[22].setRotationPoint(33F, -28.5F, 3F);
		bodyModel[22].rotateAngleY = -3.14159265F;
		bodyModel[22].rotateAngleZ = 0.78539816F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 118
		bodyModel[23].setRotationPoint(24F, -35F, 2.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 119
		bodyModel[24].setRotationPoint(24F, -34.5F, -5.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[25].setRotationPoint(24F, -35F, -5.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[26].setRotationPoint(24F, -35.5F, -2.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 227
		bodyModel[27].setRotationPoint(17F, -25.5F, -5F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 228
		bodyModel[28].setRotationPoint(29F, -25.5F, -5F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 229
		bodyModel[29].setRotationPoint(29F, -25.5F, 4F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 230
		bodyModel[30].setRotationPoint(17F, -25.5F, 4F);

		bodyModel[31].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 231
		bodyModel[31].setRotationPoint(19F, -25.5F, 4F);

		bodyModel[32].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 232
		bodyModel[32].setRotationPoint(19F, -25.5F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 383
		bodyModel[33].setRotationPoint(26F, -35F, -6.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 384
		bodyModel[34].setRotationPoint(26F, -34.5F, -6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[35].setRotationPoint(26F, -35.5F, -3.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 387
		bodyModel[36].setRotationPoint(26F, -35F, 3.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 388
		bodyModel[37].setRotationPoint(24F, -34.5F, 4.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 389
		bodyModel[38].setRotationPoint(26F, -34.5F, 5.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 390
		bodyModel[39].setRotationPoint(33F, -28.5F, -2F);
		bodyModel[39].rotateAngleY = -3.14159265F;
		bodyModel[39].rotateAngleZ = 0.78539816F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[40].setRotationPoint(25F, -35.5F, -2.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[41].setRotationPoint(15F, -23F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[42].setRotationPoint(15F, -23F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[43].setRotationPoint(33F, -23F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[44].setRotationPoint(33F, -23F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 92
		bodyModel[45].setRotationPoint(-52F, 0F, -3F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 17, 5, 0F); // Box 94
		bodyModel[46].setRotationPoint(39F, -17F, -10F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 95
		bodyModel[47].setRotationPoint(-34F, -17F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 96 door slide left left side
		bodyModel[48].setRotationPoint(-30F, -17F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 97 door slide right left side
		bodyModel[49].setRotationPoint(-22F, -17F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 5, 1, 16, 0F); // Box 167
		bodyModel[50].setRotationPoint(-44F, -7F, -8F);

		bodyModel[51].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 168
		bodyModel[51].setRotationPoint(-44F, -7F, -9F);

		bodyModel[52].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 172
		bodyModel[52].setRotationPoint(-43F, -7F, 8F);

		bodyModel[53].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 103
		bodyModel[53].setRotationPoint(-40F, -17F, 10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 104 door slide right right side
		bodyModel[54].setRotationPoint(-30F, -17F, 10F);

		bodyModel[55].addBox(0F, 0F, 0F, 36, 17, 1, 0F); // Box 105
		bodyModel[55].setRotationPoint(-14F, -17F, 10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 106 door slide left right side
		bodyModel[56].setRotationPoint(-22F, -17F, 10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[57].setRotationPoint(39F, -20F, -9F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 108
		bodyModel[58].setRotationPoint(39F, -20F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 111
		bodyModel[59].setRotationPoint(39F, -20F, 8F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 17, 5, 0F); // Box 113
		bodyModel[60].setRotationPoint(39F, -17F, 5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 17, 10, 0F); // Box 114
		bodyModel[61].setRotationPoint(39F, -17F, -5F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 115
		bodyModel[62].setRotationPoint(40F, 0F, -1.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 116
		bodyModel[63].setRotationPoint(40F, 0F, -3F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 117
		bodyModel[64].setRotationPoint(40F, -18F, -6F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 118
		bodyModel[65].setRotationPoint(40F, -18F, 5F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 119
		bodyModel[66].setRotationPoint(40F, -1F, -5F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 120
		bodyModel[67].setRotationPoint(40F, -19F, -5F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 5, 16, 0F); // Box 121
		bodyModel[68].setRotationPoint(-34F, -22F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[69].setRotationPoint(-34F, -19F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 123
		bodyModel[70].setRotationPoint(-34F, -22F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 124
		bodyModel[71].setRotationPoint(-34F, -19F, 8F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 125
		bodyModel[72].setRotationPoint(-34F, -22F, 8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 27, 1, 9, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[73].setRotationPoint(-25F, -24F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 27, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[74].setRotationPoint(-25F, -24F, -9F);

		bodyModel[75].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 139
		bodyModel[75].setRotationPoint(6F, -3F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 140
		bodyModel[76].setRotationPoint(6F, -9F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 141
		bodyModel[77].setRotationPoint(12F, -3F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 142
		bodyModel[78].setRotationPoint(12F, -9F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[79].setRotationPoint(18F, -7F, -10F);

		bodyModel[80].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 150
		bodyModel[80].setRotationPoint(-4F, -3F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[81].setRotationPoint(0F, -9F, -10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[82].setRotationPoint(0F, -9F, -6F);

		bodyModel[83].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 107
		bodyModel[83].setRotationPoint(-4F, -3F, -6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[84].setRotationPoint(-9F, -9F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[85].setRotationPoint(-9F, -9F, -6F);

		bodyModel[86].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 110
		bodyModel[86].setRotationPoint(-13F, -3F, -6F);

		bodyModel[87].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 111
		bodyModel[87].setRotationPoint(-13F, -3F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[88].setRotationPoint(-9F, -9F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[89].setRotationPoint(-9F, -9F, 2F);

		bodyModel[90].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 120
		bodyModel[90].setRotationPoint(-13F, -3F, 2F);

		bodyModel[91].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 121
		bodyModel[91].setRotationPoint(-13F, -3F, 6F);

		bodyModel[92].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 122
		bodyModel[92].setRotationPoint(-4F, -3F, 2F);

		bodyModel[93].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 123
		bodyModel[93].setRotationPoint(-4F, -3F, 6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[94].setRotationPoint(0F, -9F, 2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[95].setRotationPoint(0F, -9F, 6F);

		bodyModel[96].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 126
		bodyModel[96].setRotationPoint(6F, -3F, 2F);

		bodyModel[97].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 127
		bodyModel[97].setRotationPoint(6F, -3F, 6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 128
		bodyModel[98].setRotationPoint(7F, -9F, 2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 129
		bodyModel[99].setRotationPoint(7F, -9F, 6F);

		bodyModel[100].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 130
		bodyModel[100].setRotationPoint(14F, -3F, 2F);

		bodyModel[101].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 131
		bodyModel[101].setRotationPoint(14F, -3F, 6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 132
		bodyModel[102].setRotationPoint(19F, -9F, 2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 133
		bodyModel[103].setRotationPoint(19F, -9F, 6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 134
		bodyModel[104].setRotationPoint(-46.5F, -6F, -8F);
		bodyModel[104].rotateAngleY = 0.10471976F;
		bodyModel[104].rotateAngleZ = -0.2268928F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 135
		bodyModel[105].setRotationPoint(-46.5F, -6F, 6F);
		bodyModel[105].rotateAngleY = -0.03490659F;
		bodyModel[105].rotateAngleZ = -0.2443461F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 138
		bodyModel[106].setRotationPoint(20F, -22F, -8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 139 door slide left right side
		bodyModel[107].setRotationPoint(30F, -17F, 10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 140 door slide right right side
		bodyModel[108].setRotationPoint(22F, -17F, 10F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 17, 1, 0F); // Box 141
		bodyModel[109].setRotationPoint(38F, -17F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 142 door slide right left side
		bodyModel[110].setRotationPoint(30F, -17F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 143 door slide left left side
		bodyModel[111].setRotationPoint(22F, -17F, -11F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 17, 1, 0F); // Box 144
		bodyModel[112].setRotationPoint(38F, -17F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 36, 17, 1, 0F); // Box 149
		bodyModel[113].setRotationPoint(-14F, -17F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 25, 3, 17, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 263
		bodyModel[114].setRotationPoint(-13F, 1F, -8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,2F, -3F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 2F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 2F, 0F); // Box 134
		bodyModel[115].setRotationPoint(-41F, -22F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 135
		bodyModel[116].setRotationPoint(-13F, -22F, -8F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 2, 10, 0F); // Box 136
		bodyModel[117].setRotationPoint(-43F, -17F, -5F);
		bodyModel[117].rotateAngleZ = -0.29670597F;

		bodyModel[118].addBox(0F, 0F, 0F, 1, 11, 3, 0F); // Box 137
		bodyModel[118].setRotationPoint(38F, -16F, -9F);

		bodyModel[119].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[119].setRotationPoint(-31F, 1F, -2F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[120].setRotationPoint(25F, 1F, -2F);

		bodyModel[121].addBox(0F, 0F, 0F, 82, 1, 1, 0F); // Box 270
		bodyModel[121].setRotationPoint(-42F, 1F, -11F);

		bodyModel[122].addBox(0F, 0F, 0F, 82, 1, 1, 0F); // Box 271
		bodyModel[122].setRotationPoint(-42F, 1F, 10F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 272
		bodyModel[123].setRotationPoint(39F, 1F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[124].setRotationPoint(5F, -7F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 130
		bodyModel[125].setRotationPoint(-38F, -22F, 9F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 130
		bodyModel[126].setRotationPoint(-40F, -19F, -11F);

		bodyModel[127].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 131
		bodyModel[127].setRotationPoint(-40F, -19F, 10F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 130
		bodyModel[128].setRotationPoint(39F, -22F, -9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[129].setRotationPoint(40F, -19F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[130].setRotationPoint(40F, -19F, 5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 133
		bodyModel[131].setRotationPoint(-43F, 1F, 10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 134
		bodyModel[132].setRotationPoint(-43F, 1F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[133].setRotationPoint(39F, 2F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 136
		bodyModel[134].setRotationPoint(39F, 2F, 10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 139
		bodyModel[135].setRotationPoint(-48F, 0F, 3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -1F); // Box 140
		bodyModel[136].setRotationPoint(-47F, 0F, 9F);
	}
	ModelPCHBogie theBogie = new ModelPCHBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		EntityRollingStock stock = (EntityRollingStock)entity;

		for(int i = 0; i < 137; i++)
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
		GL11.glTranslatef(1.75F ,0.125F,0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theBogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(-1.75F,0.125F,0);
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
		return new float[]{-2.1F, 0F, 0F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	public ModelRendererTurbo[] pch130commute2Model;
}