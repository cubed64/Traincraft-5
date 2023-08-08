//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.02.2022 - 20:31:14
// Last changed on: 04.02.2022 - 20:31:14

package com.jcirmodelsquad.tcjcir.models.trains;

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPCHBogie;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;

public class ModelPCH130Coach2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPCH130Coach2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[112];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox11
		bodyModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportBox29
		bodyModel[2] = new ModelRendererTurbo(this, 267, 9, textureX, textureY); // Import ImportBox31
		bodyModel[3] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import ImportBox32
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportBox34
		bodyModel[5] = new ModelRendererTurbo(this, 33, 26, textureX, textureY); // Import ImportBox59
		bodyModel[6] = new ModelRendererTurbo(this, 289, 32, textureX, textureY); // Import ImportBox60
		bodyModel[7] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import ImportBox86
		bodyModel[8] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Import ImportBox87
		bodyModel[9] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Import ImportBox94
		bodyModel[10] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import ImportBox96doorslideleftleftside
		bodyModel[11] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Import ImportBox97doorsliderightleftside
		bodyModel[12] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import ImportBox104doorsliderightrightside
		bodyModel[13] = new ModelRendererTurbo(this, 49, 134, textureX, textureY); // Import ImportBox105
		bodyModel[14] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Import ImportBox106doorslideleftrightside
		bodyModel[15] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import ImportBox107
		bodyModel[16] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox108
		bodyModel[17] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import ImportBox111
		bodyModel[18] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Import ImportBox113
		bodyModel[19] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Import ImportBox114
		bodyModel[20] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Import ImportBox115
		bodyModel[21] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import ImportBox116
		bodyModel[22] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Import ImportBox117
		bodyModel[23] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Import ImportBox118
		bodyModel[24] = new ModelRendererTurbo(this, 248, 41, textureX, textureY); // Import ImportBox119
		bodyModel[25] = new ModelRendererTurbo(this, 192, 48, textureX, textureY); // Import ImportBox120
		bodyModel[26] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import ImportBox126
		bodyModel[27] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import ImportBox127
		bodyModel[28] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import ImportBox139
		bodyModel[29] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import ImportBox140
		bodyModel[30] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Import ImportBox141
		bodyModel[31] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox142
		bodyModel[32] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import ImportBox143
		bodyModel[33] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox150
		bodyModel[34] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox151
		bodyModel[35] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox106
		bodyModel[36] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox107
		bodyModel[37] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox108
		bodyModel[38] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox109
		bodyModel[39] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox110
		bodyModel[40] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox111
		bodyModel[41] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox118
		bodyModel[42] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox119
		bodyModel[43] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox120
		bodyModel[44] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox121
		bodyModel[45] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox122
		bodyModel[46] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox123
		bodyModel[47] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox124
		bodyModel[48] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox125
		bodyModel[49] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox126
		bodyModel[50] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox127
		bodyModel[51] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox128
		bodyModel[52] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox129
		bodyModel[53] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox130
		bodyModel[54] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox131
		bodyModel[55] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox132
		bodyModel[56] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox133
		bodyModel[57] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Import ImportBox138
		bodyModel[58] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Import ImportBox139doorslideleftrightside
		bodyModel[59] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import ImportBox140doorsliderightrightside
		bodyModel[60] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import ImportBox141
		bodyModel[61] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Import ImportBox142doorsliderightleftside
		bodyModel[62] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import ImportBox143doorslideleftleftside
		bodyModel[63] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Import ImportBox144
		bodyModel[64] = new ModelRendererTurbo(this, 49, 110, textureX, textureY); // Import ImportBox149
		bodyModel[65] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import ImportBox263
		bodyModel[66] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import ImportBox135
		bodyModel[67] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Import ImportBox137
		bodyModel[68] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import ImportBox124
		bodyModel[69] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Import ImportBox124
		bodyModel[70] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Import ImportBox270
		bodyModel[71] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import ImportBox271
		bodyModel[72] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import ImportBox272
		bodyModel[73] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import ImportBox275
		bodyModel[74] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import ImportBox130
		bodyModel[75] = new ModelRendererTurbo(this, 2, 108, textureX, textureY); // Import ImportBox130
		bodyModel[76] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import ImportBox131
		bodyModel[77] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import ImportBox132
		bodyModel[78] = new ModelRendererTurbo(this, 352, 37, textureX, textureY); // Import ImportBox136
		bodyModel[79] = new ModelRendererTurbo(this, 441, 93, textureX, textureY); // Import ImportBox143
		bodyModel[80] = new ModelRendererTurbo(this, 2, 108, textureX, textureY); // Import ImportBox148
		bodyModel[81] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Import ImportBox104
		bodyModel[82] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox105
		bodyModel[83] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import ImportBox107
		bodyModel[84] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Import ImportBox108
		bodyModel[85] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Import ImportBox114
		bodyModel[86] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import ImportBox115
		bodyModel[87] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Import ImportBox117
		bodyModel[88] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import ImportBox118
		bodyModel[89] = new ModelRendererTurbo(this, 192, 48, textureX, textureY); // Import ImportBox119
		bodyModel[90] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import ImportBox120
		bodyModel[91] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Import ImportBox121
		bodyModel[92] = new ModelRendererTurbo(this, 248, 41, textureX, textureY); // Import ImportBox122
		bodyModel[93] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import ImportBox123
		bodyModel[94] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import ImportBox127
		bodyModel[95] = new ModelRendererTurbo(this, 266, 9, textureX, textureY); // Import ImportBox128
		bodyModel[96] = new ModelRendererTurbo(this, 352, 37, textureX, textureY); // Import ImportBox102
		bodyModel[97] = new ModelRendererTurbo(this, 352, 37, textureX, textureY); // Import ImportBox103
		bodyModel[98] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import ImportBox104
		bodyModel[99] = new ModelRendererTurbo(this, 352, 37, textureX, textureY); // Import ImportBox105
		bodyModel[100] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox106
		bodyModel[101] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox107
		bodyModel[102] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox108
		bodyModel[103] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox109
		bodyModel[104] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox110
		bodyModel[105] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox111
		bodyModel[106] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox112
		bodyModel[107] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox113
		bodyModel[108] = new ModelRendererTurbo(this, 449, 93, textureX, textureY); // Import ImportBox122
		bodyModel[109] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import Box0
		bodyModel[110] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import Box1
		bodyModel[111] = new ModelRendererTurbo(this, 348, 76, textureX, textureY); // Box 112

		bodyModel[0].addBox(0F, 0F, 0F, 83, 1, 22, 0F); // Import ImportBox11
		bodyModel[0].setRotationPoint(-40F, 3F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 87, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox29
		bodyModel[1].setRotationPoint(-44F, -17F, 10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 52, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		bodyModel[2].setRotationPoint(-44F, -20F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 52, 1, 9, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox32
		bodyModel[3].setRotationPoint(-44F, -20F, 0F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Import ImportBox34
		bodyModel[4].setRotationPoint(-44F, 3F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 87, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox59
		bodyModel[5].setRotationPoint(-44F, -19F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 87, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox60
		bodyModel[6].setRotationPoint(-44F, -17F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox86
		bodyModel[7].setRotationPoint(36F, -20F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox87
		bodyModel[8].setRotationPoint(36F, -20F, 0F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 17, 5, 0F); // Import ImportBox94
		bodyModel[9].setRotationPoint(42F, -14F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox96doorslideleftleftside
		bodyModel[10].setRotationPoint(-42F, -14F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox97doorsliderightleftside
		bodyModel[11].setRotationPoint(-34F, -14F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox104doorsliderightrightside
		bodyModel[12].setRotationPoint(-42F, -14F, 10F);

		bodyModel[13].addBox(0F, 0F, 0F, 51, 17, 1, 0F); // Import ImportBox105
		bodyModel[13].setRotationPoint(-26F, -14F, 10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox106doorslideleftrightside
		bodyModel[14].setRotationPoint(-34F, -14F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox107
		bodyModel[15].setRotationPoint(42F, -17F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Import ImportBox108
		bodyModel[16].setRotationPoint(42F, -17F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import ImportBox111
		bodyModel[17].setRotationPoint(42F, -17F, 8F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 17, 5, 0F); // Import ImportBox113
		bodyModel[18].setRotationPoint(42F, -14F, 5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 17, 10, 0F); // Import ImportBox114
		bodyModel[19].setRotationPoint(42F, -14F, -5F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Import ImportBox115
		bodyModel[20].setRotationPoint(43F, 3F, -1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import ImportBox116
		bodyModel[21].setRotationPoint(43F, 3F, -3F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Import ImportBox117
		bodyModel[22].setRotationPoint(43F, -15F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Import ImportBox118
		bodyModel[23].setRotationPoint(43F, -15F, 5F);

		bodyModel[24].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Import ImportBox119
		bodyModel[24].setRotationPoint(43F, 2F, -5F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Import ImportBox120
		bodyModel[25].setRotationPoint(43F, -16F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 34, 1, 9, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox126
		bodyModel[26].setRotationPoint(-27F, -21F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 34, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox127
		bodyModel[27].setRotationPoint(-27F, -21F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Import ImportBox139
		bodyModel[28].setRotationPoint(9F, 0F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import ImportBox140
		bodyModel[29].setRotationPoint(9F, -6F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Import ImportBox141
		bodyModel[30].setRotationPoint(15F, 0F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import ImportBox142
		bodyModel[31].setRotationPoint(15F, -6F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox143
		bodyModel[32].setRotationPoint(21F, -4F, -10F);

		bodyModel[33].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox150
		bodyModel[33].setRotationPoint(-1F, 0F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox151
		bodyModel[34].setRotationPoint(3F, -6F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox106
		bodyModel[35].setRotationPoint(3F, -6F, -6F);

		bodyModel[36].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox107
		bodyModel[36].setRotationPoint(-1F, 0F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox108
		bodyModel[37].setRotationPoint(-6F, -6F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox109
		bodyModel[38].setRotationPoint(-6F, -6F, -6F);

		bodyModel[39].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox110
		bodyModel[39].setRotationPoint(-10F, 0F, -6F);

		bodyModel[40].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox111
		bodyModel[40].setRotationPoint(-10F, 0F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox118
		bodyModel[41].setRotationPoint(-6F, -6F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox119
		bodyModel[42].setRotationPoint(-6F, -6F, 2F);

		bodyModel[43].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox120
		bodyModel[43].setRotationPoint(-10F, 0F, 2F);

		bodyModel[44].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox121
		bodyModel[44].setRotationPoint(-10F, 0F, 6F);

		bodyModel[45].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox122
		bodyModel[45].setRotationPoint(-1F, 0F, 2F);

		bodyModel[46].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox123
		bodyModel[46].setRotationPoint(-1F, 0F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox124
		bodyModel[47].setRotationPoint(3F, -6F, 2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox125
		bodyModel[48].setRotationPoint(3F, -6F, 6F);

		bodyModel[49].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox126
		bodyModel[49].setRotationPoint(9F, 0F, 2F);

		bodyModel[50].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox127
		bodyModel[50].setRotationPoint(9F, 0F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox128
		bodyModel[51].setRotationPoint(10F, -6F, 2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox129
		bodyModel[52].setRotationPoint(10F, -6F, 6F);

		bodyModel[53].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox130
		bodyModel[53].setRotationPoint(17F, 0F, 2F);

		bodyModel[54].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox131
		bodyModel[54].setRotationPoint(17F, 0F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox132
		bodyModel[55].setRotationPoint(22F, -6F, 2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox133
		bodyModel[56].setRotationPoint(22F, -6F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox138
		bodyModel[57].setRotationPoint(23F, -19F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox139doorslideleftrightside
		bodyModel[58].setRotationPoint(33F, -14F, 10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox140doorsliderightrightside
		bodyModel[59].setRotationPoint(25F, -14F, 10F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 17, 1, 0F); // Import ImportBox141
		bodyModel[60].setRotationPoint(41F, -14F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox142doorsliderightleftside
		bodyModel[61].setRotationPoint(33F, -14F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 8, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox143doorslideleftleftside
		bodyModel[62].setRotationPoint(25F, -14F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 17, 1, 0F); // Import ImportBox144
		bodyModel[63].setRotationPoint(41F, -14F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 51, 17, 1, 0F); // Import ImportBox149
		bodyModel[64].setRotationPoint(-26F, -14F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 25, 3, 17, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox263
		bodyModel[65].setRotationPoint(-13F, 4F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox135
		bodyModel[66].setRotationPoint(-10F, -19F, -8F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 11, 3, 0F); // Import ImportBox137
		bodyModel[67].setRotationPoint(41F, -13F, -9F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Import ImportBox124
		bodyModel[68].setRotationPoint(-28F, 4F, -2F);

		bodyModel[69].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Import ImportBox124
		bodyModel[69].setRotationPoint(28F, 4F, -2F);

		bodyModel[70].addBox(0F, 0F, 0F, 87, 1, 1, 0F); // Import ImportBox270
		bodyModel[70].setRotationPoint(-44F, 4F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 87, 1, 1, 0F); // Import ImportBox271
		bodyModel[71].setRotationPoint(-44F, 4F, 10F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Import ImportBox272
		bodyModel[72].setRotationPoint(42F, 4F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox275
		bodyModel[73].setRotationPoint(8F, -4F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 87, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox130
		bodyModel[74].setRotationPoint(-44F, -19F, 9F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Import ImportBox130
		bodyModel[75].setRotationPoint(42F, -19F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox131
		bodyModel[76].setRotationPoint(43F, -16F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox132
		bodyModel[77].setRotationPoint(43F, -16F, 5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import ImportBox136
		bodyModel[78].setRotationPoint(42F, 5F, 10F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 17, 1, 0F); // Import ImportBox143
		bodyModel[79].setRotationPoint(-44F, -14F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Import ImportBox148
		bodyModel[80].setRotationPoint(-43F, -17F, -9F);
		bodyModel[80].rotateAngleZ = 3.14159265F;

		bodyModel[81].addBox(0F, 0F, 0F, 1, 17, 5, 0F); // Import ImportBox104
		bodyModel[81].setRotationPoint(-43F, -14F, -5F);
		bodyModel[81].rotateAngleY = -3.14159265F;

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Import ImportBox105
		bodyModel[82].setRotationPoint(-43F, -17F, 8F);
		bodyModel[82].rotateAngleY = -3.14159265F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import ImportBox107
		bodyModel[83].setRotationPoint(-43F, -17F, -8F);
		bodyModel[83].rotateAngleY = -3.14159265F;

		bodyModel[84].addBox(0F, 0F, 0F, 1, 17, 5, 0F); // Import ImportBox108
		bodyModel[84].setRotationPoint(-43F, -14F, 10F);
		bodyModel[84].rotateAngleY = -3.14159265F;

		bodyModel[85].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Import ImportBox114
		bodyModel[85].setRotationPoint(-47F, 3F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import ImportBox115
		bodyModel[86].setRotationPoint(-47F, 3F, -3F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Import ImportBox117
		bodyModel[87].setRotationPoint(-46F, -15F, -6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox118
		bodyModel[88].setRotationPoint(-46F, -16F, -6F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Import ImportBox119
		bodyModel[89].setRotationPoint(-46F, -16F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox120
		bodyModel[90].setRotationPoint(-46F, -16F, 5F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Import ImportBox121
		bodyModel[91].setRotationPoint(-46F, -15F, 5F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Import ImportBox122
		bodyModel[92].setRotationPoint(-46F, 2F, -5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox123
		bodyModel[93].setRotationPoint(-43F, -17F, 9F);
		bodyModel[93].rotateAngleY = -3.14159265F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 28, 1, 9, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox127
		bodyModel[94].setRotationPoint(8F, -20F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 28, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox128
		bodyModel[95].setRotationPoint(8F, -20F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox102
		bodyModel[96].setRotationPoint(42F, 5F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox103
		bodyModel[97].setRotationPoint(-44F, 5F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Import ImportBox104
		bodyModel[98].setRotationPoint(-44F, 4F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import ImportBox105
		bodyModel[99].setRotationPoint(-44F, 5F, 10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox106
		bodyModel[100].setRotationPoint(-15F, -6F, -10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox107
		bodyModel[101].setRotationPoint(-15F, -6F, -6F);

		bodyModel[102].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox108
		bodyModel[102].setRotationPoint(-19F, 0F, -10F);

		bodyModel[103].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox109
		bodyModel[103].setRotationPoint(-19F, 0F, -6F);

		bodyModel[104].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox110
		bodyModel[104].setRotationPoint(-19F, 0F, 2F);

		bodyModel[105].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import ImportBox111
		bodyModel[105].setRotationPoint(-19F, 0F, 6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox112
		bodyModel[106].setRotationPoint(-15F, -6F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox113
		bodyModel[107].setRotationPoint(-15F, -6F, 2F);

		bodyModel[108].addBox(0F, 0F, 0F, 2, 17, 1, 0F); // Import ImportBox122
		bodyModel[108].setRotationPoint(-44F, -14F, 10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[109].setRotationPoint(7F, -21F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[110].setRotationPoint(7F, -21F, 0F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 11, 3, 0F); // Box 112
		bodyModel[111].setRotationPoint(-43F, -13F, 6F);
	}
	ModelPCHBogie theBogie = new ModelPCHBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 111; i++)
		{
			bodyModel[i].render(f5);
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
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public float[] getTrans() {
		return new float[]{0.05F, 0.1F, 0F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

}