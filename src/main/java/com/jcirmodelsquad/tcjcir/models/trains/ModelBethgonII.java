//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.05.2023 - 04:33:52
// Last changed on: 29.05.2023 - 04:33:52

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.api.Freight;
import train.common.library.Info;

public class ModelBethgonII extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBethgonII() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[146];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 42, 240, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 283, 204, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 40, 92, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 357, 88, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 166, 67, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 23, 93, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 357, 52, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 167, 92, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 24, 67, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 167, 82, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 382, 138, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 295, 175, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 25, 87, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 24, 114, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 224, 41, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 231, 41, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 167, 114, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 159, 40, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 366, 175, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 167, 87, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 165, 40, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 461, 100, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 198, 69, textureX, textureY); // Box 32
		bodyModel[24] = new ModelRendererTurbo(this, 188, 118, textureX, textureY); // Box 33
		bodyModel[25] = new ModelRendererTurbo(this, 198, 94, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 460, 63, textureX, textureY); // Box 35
		bodyModel[27] = new ModelRendererTurbo(this, 46, 47, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 98, 47, textureX, textureY); // Box 37
		bodyModel[29] = new ModelRendererTurbo(this, 52, 47, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 70, 47, textureX, textureY); // Box 39
		bodyModel[31] = new ModelRendererTurbo(this, 86, 47, textureX, textureY); // Box 46
		bodyModel[32] = new ModelRendererTurbo(this, 92, 47, textureX, textureY); // Box 47
		bodyModel[33] = new ModelRendererTurbo(this, 197, 85, textureX, textureY); // Box 48
		bodyModel[34] = new ModelRendererTurbo(this, 197, 110, textureX, textureY); // Box 49
		bodyModel[35] = new ModelRendererTurbo(this, 124, 117, textureX, textureY); // Box 63
		bodyModel[36] = new ModelRendererTurbo(this, 145, 28, textureX, textureY, "cull"); // Box 70 cull
		bodyModel[37] = new ModelRendererTurbo(this, 130, 24, textureX, textureY, "cull"); // Box 71 cull
		bodyModel[38] = new ModelRendererTurbo(this, 92, 114, textureX, textureY); // Box 72
		bodyModel[39] = new ModelRendererTurbo(this, 86, 114, textureX, textureY); // Box 73
		bodyModel[40] = new ModelRendererTurbo(this, 70, 115, textureX, textureY); // Box 80
		bodyModel[41] = new ModelRendererTurbo(this, 52, 114, textureX, textureY); // Box 81
		bodyModel[42] = new ModelRendererTurbo(this, 46, 114, textureX, textureY); // Box 82
		bodyModel[43] = new ModelRendererTurbo(this, 40, 114, textureX, textureY); // Box 83
		bodyModel[44] = new ModelRendererTurbo(this, 195, 25, textureX, textureY, "cull"); // Box 84 cull
		bodyModel[45] = new ModelRendererTurbo(this, 210, 29, textureX, textureY, "cull"); // Box 85 cull
		bodyModel[46] = new ModelRendererTurbo(this, 211, 20, textureX, textureY); // Box 86
		bodyModel[47] = new ModelRendererTurbo(this, 158, 19, textureX, textureY); // Box 87
		bodyModel[48] = new ModelRendererTurbo(this, 146, 19, textureX, textureY); // Box 88
		bodyModel[49] = new ModelRendererTurbo(this, 226, 20, textureX, textureY); // Box 89
		bodyModel[50] = new ModelRendererTurbo(this, 457, 171, textureX, textureY); // Box 72
		bodyModel[51] = new ModelRendererTurbo(this, 469, 176, textureX, textureY); // Box 87
		bodyModel[52] = new ModelRendererTurbo(this, 477, 173, textureX, textureY); // Box 92
		bodyModel[53] = new ModelRendererTurbo(this, 488, 171, textureX, textureY); // Box 93
		bodyModel[54] = new ModelRendererTurbo(this, 223, 35, textureX, textureY, "cull"); // Box 94 cull
		bodyModel[55] = new ModelRendererTurbo(this, 158, 35, textureX, textureY, "cull"); // Box 96 cull
		bodyModel[56] = new ModelRendererTurbo(this, 407, 55, textureX, textureY); // Box 98
		bodyModel[57] = new ModelRendererTurbo(this, 163, 186, textureX, textureY); // Box 114
		bodyModel[58] = new ModelRendererTurbo(this, 158, 174, textureX, textureY); // Box 115
		bodyModel[59] = new ModelRendererTurbo(this, 354, 204, textureX, textureY); // Box 122
		bodyModel[60] = new ModelRendererTurbo(this, 175, 164, textureX, textureY); // Box 129
		bodyModel[61] = new ModelRendererTurbo(this, 176, 187, textureX, textureY); // Box 130
		bodyModel[62] = new ModelRendererTurbo(this, 204, 100, textureX, textureY); // Box 136
		bodyModel[63] = new ModelRendererTurbo(this, 15, 242, textureX, textureY); // Box 137
		bodyModel[64] = new ModelRendererTurbo(this, 210, 240, textureX, textureY); // Box 138
		bodyModel[65] = new ModelRendererTurbo(this, 328, 184, textureX, textureY); // Box 139
		bodyModel[66] = new ModelRendererTurbo(this, 292, 183, textureX, textureY); // Box 140
		bodyModel[67] = new ModelRendererTurbo(this, 397, 183, textureX, textureY); // Box 141
		bodyModel[68] = new ModelRendererTurbo(this, 368, 183, textureX, textureY); // Box 142
		bodyModel[69] = new ModelRendererTurbo(this, 223, 31, textureX, textureY, "cull"); // Box 143 cull
		bodyModel[70] = new ModelRendererTurbo(this, 158, 29, textureX, textureY, "cull"); // Box 144 cull
		bodyModel[71] = new ModelRendererTurbo(this, 40, 47, textureX, textureY); // Box 146
		bodyModel[72] = new ModelRendererTurbo(this, 98, 114, textureX, textureY); // Box 147
		bodyModel[73] = new ModelRendererTurbo(this, 433, 171, textureX, textureY, "cull"); // Box 148 cull
		bodyModel[74] = new ModelRendererTurbo(this, 164, 163, textureX, textureY); // Box 114
		bodyModel[75] = new ModelRendererTurbo(this, 259, 163, textureX, textureY); // Box 121
		bodyModel[76] = new ModelRendererTurbo(this, 255, 174, textureX, textureY); // Box 122
		bodyModel[77] = new ModelRendererTurbo(this, 256, 186, textureX, textureY); // Box 123
		bodyModel[78] = new ModelRendererTurbo(this, 38, 175, textureX, textureY); // Box 305
		bodyModel[79] = new ModelRendererTurbo(this, 30, 164, textureX, textureY); // Box 308
		bodyModel[80] = new ModelRendererTurbo(this, 25, 174, textureX, textureY); // Box 309
		bodyModel[81] = new ModelRendererTurbo(this, 29, 186, textureX, textureY); // Box 310
		bodyModel[82] = new ModelRendererTurbo(this, 41, 187, textureX, textureY); // Box 311
		bodyModel[83] = new ModelRendererTurbo(this, 41, 165, textureX, textureY); // Box 312
		bodyModel[84] = new ModelRendererTurbo(this, 120, 164, textureX, textureY); // Box 313
		bodyModel[85] = new ModelRendererTurbo(this, 121, 174, textureX, textureY); // Box 314
		bodyModel[86] = new ModelRendererTurbo(this, 120, 186, textureX, textureY); // Box 315
		bodyModel[87] = new ModelRendererTurbo(this, 24, 110, textureX, textureY); // Box 316
		bodyModel[88] = new ModelRendererTurbo(this, 167, 109, textureX, textureY); // Box 317
		bodyModel[89] = new ModelRendererTurbo(this, 25, 82, textureX, textureY); // Box 318
		bodyModel[90] = new ModelRendererTurbo(this, 294, 138, textureX, textureY); // Box 319
		bodyModel[91] = new ModelRendererTurbo(this, 52, 252, textureX, textureY); // Box 28
		bodyModel[92] = new ModelRendererTurbo(this, 172, 253, textureX, textureY); // Box 585
		bodyModel[93] = new ModelRendererTurbo(this, 410, 93, textureX, textureY); // Box 606
		bodyModel[94] = new ModelRendererTurbo(this, 173, 173, textureX, textureY); // Box 136
		bodyModel[95] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 137
		bodyModel[96] = new ModelRendererTurbo(this, 154, 149, textureX, textureY); // Box 138
		bodyModel[97] = new ModelRendererTurbo(this, 176, 196, textureX, textureY); // Box 139
		bodyModel[98] = new ModelRendererTurbo(this, 175, 157, textureX, textureY); // Box 140
		bodyModel[99] = new ModelRendererTurbo(this, 17, 149, textureX, textureY); // Box 141
		bodyModel[100] = new ModelRendererTurbo(this, 41, 196, textureX, textureY); // Box 142
		bodyModel[101] = new ModelRendererTurbo(this, 40, 157, textureX, textureY); // Box 143
		bodyModel[102] = new ModelRendererTurbo(this, 122, 149, textureX, textureY); // Box 144
		bodyModel[103] = new ModelRendererTurbo(this, 252, 23, textureX, textureY); // Box 145
		bodyModel[104] = new ModelRendererTurbo(this, 449, 23, textureX, textureY); // Box 146
		bodyModel[105] = new ModelRendererTurbo(this, 350, 23, textureX, textureY); // Box 147
		bodyModel[106] = new ModelRendererTurbo(this, 398, 23, textureX, textureY); // Box 148
		bodyModel[107] = new ModelRendererTurbo(this, 302, 23, textureX, textureY); // Box 149
		bodyModel[108] = new ModelRendererTurbo(this, 205, 224, textureX, textureY); // Box 720
		bodyModel[109] = new ModelRendererTurbo(this, 198, 227, textureX, textureY); // Box 721
		bodyModel[110] = new ModelRendererTurbo(this, 19, 224, textureX, textureY); // Box 583
		bodyModel[111] = new ModelRendererTurbo(this, 12, 227, textureX, textureY); // Box 584
		bodyModel[112] = new ModelRendererTurbo(this, 2, 2, textureX, textureY, "load"); // load 3
		bodyModel[113] = new ModelRendererTurbo(this, 2, 20, textureX, textureY, "load"); // load 2
		bodyModel[114] = new ModelRendererTurbo(this, 3, 11, textureX, textureY, "load"); // load 1
		bodyModel[115] = new ModelRendererTurbo(this, 185, 9, textureX, textureY, "load"); // load 4
		bodyModel[116] = new ModelRendererTurbo(this, 284, 8, textureX, textureY, "load"); // load 5
		bodyModel[117] = new ModelRendererTurbo(this, 251, 3, textureX, textureY, "load"); // load 6
		bodyModel[118] = new ModelRendererTurbo(this, 318, 3, textureX, textureY, "load"); // load 9
		bodyModel[119] = new ModelRendererTurbo(this, 151, 4, textureX, textureY, "load"); // load 8
		bodyModel[120] = new ModelRendererTurbo(this, 217, 3, textureX, textureY, "load"); // load 7
		bodyModel[121] = new ModelRendererTurbo(this, 459, 186, textureX, textureY); // Box 132
		bodyModel[122] = new ModelRendererTurbo(this, 473, 203, textureX, textureY); // Box 118
		bodyModel[123] = new ModelRendererTurbo(this, 473, 211, textureX, textureY); // Box 119
		bodyModel[124] = new ModelRendererTurbo(this, 465, 189, textureX, textureY); // Box 125
		bodyModel[125] = new ModelRendererTurbo(this, 490, 204, textureX, textureY); // Box 317
		bodyModel[126] = new ModelRendererTurbo(this, 488, 210, textureX, textureY); // Box 318
		bodyModel[127] = new ModelRendererTurbo(this, 484, 228, textureX, textureY); // Box 286
		bodyModel[128] = new ModelRendererTurbo(this, 498, 228, textureX, textureY); // Box 287
		bodyModel[129] = new ModelRendererTurbo(this, 474, 231, textureX, textureY); // Box 321
		bodyModel[130] = new ModelRendererTurbo(this, 472, 218, textureX, textureY); // Box 586
		bodyModel[131] = new ModelRendererTurbo(this, 458, 210, textureX, textureY); // Box 587
		bodyModel[132] = new ModelRendererTurbo(this, 480, 185, textureX, textureY); // Box 588
		bodyModel[133] = new ModelRendererTurbo(this, 480, 194, textureX, textureY); // Box 589
		bodyModel[134] = new ModelRendererTurbo(this, 70, 47, textureX, textureY); // Box 178
		bodyModel[135] = new ModelRendererTurbo(this, 70, 47, textureX, textureY); // Box 179
		bodyModel[136] = new ModelRendererTurbo(this, 70, 47, textureX, textureY); // Box 180
		bodyModel[137] = new ModelRendererTurbo(this, 70, 47, textureX, textureY); // Box 181
		bodyModel[138] = new ModelRendererTurbo(this, 70, 47, textureX, textureY); // Box 182
		bodyModel[139] = new ModelRendererTurbo(this, 70, 47, textureX, textureY); // Box 183
		bodyModel[140] = new ModelRendererTurbo(this, 70, 115, textureX, textureY); // Box 184
		bodyModel[141] = new ModelRendererTurbo(this, 70, 115, textureX, textureY); // Box 185
		bodyModel[142] = new ModelRendererTurbo(this, 70, 115, textureX, textureY); // Box 186
		bodyModel[143] = new ModelRendererTurbo(this, 70, 115, textureX, textureY); // Box 187
		bodyModel[144] = new ModelRendererTurbo(this, 70, 115, textureX, textureY); // Box 188
		bodyModel[145] = new ModelRendererTurbo(this, 70, 114, textureX, textureY); // Box 189

		bodyModel[0].addBox(0F, 0F, 0F, 77, 2, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38.5F, 3F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 14, 1, 20, 0F); // Box 1
		bodyModel[1].setRotationPoint(-31.5F, 2F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 61, 19, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(-30.5F, -16F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 61, 19, 1, 0F); // Box 3
		bodyModel[3].setRotationPoint(-30.5F, -16F, 10F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 12, 20, 0F); // Box 5
		bodyModel[4].setRotationPoint(-36.5F, -16F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 12, 1, 0F); // Box 6
		bodyModel[5].setRotationPoint(30.5F, -16F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 12, 1, 0F); // Box 8
		bodyModel[6].setRotationPoint(30.5F, -16F, 10F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 12, 20, 0F); // Box 11
		bodyModel[7].setRotationPoint(35.5F, -16F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 6, 12, 1, 0F); // Box 12
		bodyModel[8].setRotationPoint(-36.5F, -16F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 6, 12, 1, 0F); // Box 13
		bodyModel[9].setRotationPoint(-36.5F, -16F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.625F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.675F, 0F); // Box 15
		bodyModel[10].setRotationPoint(30.5F, -4F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 18, 1, 20, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 16
		bodyModel[11].setRotationPoint(17.5F, -5F, -10F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 22, 0F); // Box 17
		bodyModel[12].setRotationPoint(-36.5F, 2F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 19
		bodyModel[13].setRotationPoint(-35.5F, 2F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 20
		bodyModel[14].setRotationPoint(-35.5F, 2F, 10F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 21
		bodyModel[15].setRotationPoint(-36.5F, -4F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 22
		bodyModel[16].setRotationPoint(-36.5F, -4F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 23
		bodyModel[17].setRotationPoint(30.5F, 2F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[18].setRotationPoint(35.5F, -4F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 22, 0F); // Box 26
		bodyModel[19].setRotationPoint(35.5F, 2F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 27
		bodyModel[20].setRotationPoint(30.5F, 2F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[21].setRotationPoint(35.5F, -4F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 30
		bodyModel[22].setRotationPoint(-37.5F, -16F, -0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 73, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[23].setRotationPoint(-36.5F, -16F, -12F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 23, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[24].setRotationPoint(35.5F, -17F, -11.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 73, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[25].setRotationPoint(-36.5F, -16F, 11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[26].setRotationPoint(36.5F, -16F, -0.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
		bodyModel[27].setRotationPoint(-25.5F, -15F, -11.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 37
		bodyModel[28].setRotationPoint(29.5F, -15F, -11.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[29].setRotationPoint(-20.5F, -15F, -11.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		bodyModel[30].setRotationPoint(-15.5F, -15F, -11.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 46
		bodyModel[31].setRotationPoint(19.5F, -15F, -11.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
		bodyModel[32].setRotationPoint(24.5F, -15F, -11.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 61, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[33].setRotationPoint(-30.5F, 2F, -12F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 61, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[34].setRotationPoint(-30.5F, 2F, 11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 23, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 63
		bodyModel[35].setRotationPoint(-37.5F, -17F, -11.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 18, 1, 0F); // Box 70 cull
		bodyModel[36].setRotationPoint(32.5F, -15F, -12F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 19, 4, 0F); // Box 71 cull
		bodyModel[37].setRotationPoint(36.5F, -16F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[38].setRotationPoint(-25.5F, -15F, 10.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[39].setRotationPoint(-20.5F, -15F, 10.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[40].setRotationPoint(14.5F, -15F, 10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[41].setRotationPoint(19.5F, -15F, 10.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[42].setRotationPoint(24.5F, -15F, 10.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[43].setRotationPoint(29.5F, -15F, 10.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 19, 4, 0F); // Box 84 cull
		bodyModel[44].setRotationPoint(-37.5F, -16F, 7F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 18, 1, 0F); // Box 85 cull
		bodyModel[45].setRotationPoint(-36.5F, -15F, 11F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 86
		bodyModel[46].setRotationPoint(-36.5F, 3F, 11F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 87
		bodyModel[47].setRotationPoint(32.5F, 3F, 11F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 88
		bodyModel[48].setRotationPoint(32.5F, 3F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 89
		bodyModel[49].setRotationPoint(-36.5F, 3F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 72
		bodyModel[50].setRotationPoint(-38.01F, -6.5F, 1.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[51].setRotationPoint(-38F, -5F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 92
		bodyModel[52].setRotationPoint(-37.5F, -6F, 2.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 93
		bodyModel[53].setRotationPoint(-37F, -4F, -0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 94 cull
		bodyModel[54].setRotationPoint(-36.5F, -1F, -11.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 96 cull
		bodyModel[55].setRotationPoint(30.5F, -1F, 11F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 98
		bodyModel[56].setRotationPoint(36.5F, -4F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[57].setRotationPoint(-18.5F, 4F, 2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[58].setRotationPoint(-18.5F, 4F, 4F);

		bodyModel[59].addBox(0F, 0F, 0F, 14, 1, 20, 0F); // Box 122
		bodyModel[59].setRotationPoint(17.5F, 2F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 129
		bodyModel[60].setRotationPoint(-17.5F, 4F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 130
		bodyModel[61].setRotationPoint(-17.5F, 4F, 2F);

		bodyModel[62].addBox(0F, 0F, 0F, 35, 1, 6, 0F); // Box 136
		bodyModel[62].setRotationPoint(-17.5F, 2F, -3F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 137
		bodyModel[63].setRotationPoint(-41.5F, 3F, -1.5F);

		bodyModel[64].addBox(1F, 0F, 0F, 3, 2, 3, 0F); // Box 138
		bodyModel[64].setRotationPoint(37.5F, 3F, -1.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, 0F); // Box 139
		bodyModel[65].setRotationPoint(-35.5F, 2F, -10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-4F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[66].setRotationPoint(-35.5F, 2F, 3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[67].setRotationPoint(34.5F, 2F, 3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, -1F); // Box 142
		bodyModel[68].setRotationPoint(34.5F, 2F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 143 cull
		bodyModel[69].setRotationPoint(-36.5F, -5F, -11.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 144 cull
		bodyModel[70].setRotationPoint(32.5F, -5F, 11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 146
		bodyModel[71].setRotationPoint(-30.5F, -15F, -11.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[72].setRotationPoint(-30.5F, -15F, 10.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 148 cull
		bodyModel[73].setRotationPoint(-39.5F, 2F, 0.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 114
		bodyModel[74].setRotationPoint(-18.5F, 4F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 121
		bodyModel[75].setRotationPoint(17.5F, 4F, 9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[76].setRotationPoint(17.5F, 4F, 4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[77].setRotationPoint(17.5F, 4F, 2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 37, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[78].setRotationPoint(-18.5F, 7F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[79].setRotationPoint(-18.5F, 4F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[80].setRotationPoint(-18.5F, 4F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 310
		bodyModel[81].setRotationPoint(-18.5F, 4F, -4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 311
		bodyModel[82].setRotationPoint(-17.5F, 4F, -3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 312
		bodyModel[83].setRotationPoint(-17.5F, 4F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[84].setRotationPoint(17.5F, 4F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[85].setRotationPoint(17.5F, 4F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 315
		bodyModel[86].setRotationPoint(17.5F, 4F, -4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.625F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.675F, 0F); // Box 316
		bodyModel[87].setRotationPoint(30.5F, -4F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.625F, 0F, 0F, 0.675F, 0F, 0F, -1F, 0F); // Box 317
		bodyModel[88].setRotationPoint(-35.5F, -4F, 10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.625F, 0F, 0F, 0.675F, 0F, 0F, -1F, 0F); // Box 318
		bodyModel[89].setRotationPoint(-35.5F, -4F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 18, 1, 20, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[90].setRotationPoint(-35.5F, -5F, -10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[91].setRotationPoint(-30F, 4.25F, -1.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[92].setRotationPoint(27F, 4.25F, -1.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 606
		bodyModel[93].setRotationPoint(-36.5F, -4F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 37, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[94].setRotationPoint(-18.5F, 7F, 5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[95].setRotationPoint(17.5F, 3F, 2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[96].setRotationPoint(-18.5F, 3F, 2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[97].setRotationPoint(-17.5F, 3F, 2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[98].setRotationPoint(-17.5F, 3F, 10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[99].setRotationPoint(-18.5F, 3F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[100].setRotationPoint(-17.5F, 3F, -3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[101].setRotationPoint(-17.5F, 3F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[102].setRotationPoint(17.5F, 3F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 145
		bodyModel[103].setRotationPoint(-20.5F, -12F, -10F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 146
		bodyModel[104].setRotationPoint(19.5F, -12F, -10F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 147
		bodyModel[105].setRotationPoint(-0.5F, -12F, -10F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 148
		bodyModel[106].setRotationPoint(9.5F, -12F, -10F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 149
		bodyModel[107].setRotationPoint(-10.5F, -12F, -10F);

		bodyModel[108].addShapeBox(-8.5F, -1F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 720
		bodyModel[108].setRotationPoint(40F, 4.5F, 0F);
		bodyModel[108].rotateAngleY = 1.25663706F;

		bodyModel[109].addBox(-11.5F, -1F, 0F, 12, 3, 0, 0F); // Box 721
		bodyModel[109].setRotationPoint(40F, 4.5F, 0F);
		bodyModel[109].rotateAngleY = 1.25663706F;

		bodyModel[110].addShapeBox(3.5F, -1F, 0F, 5, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 583
		bodyModel[110].setRotationPoint(-40F, 4.5F, 0F);
		bodyModel[110].rotateAngleY = 1.25663706F;

		bodyModel[111].addBox(-0.5F, -1F, 0F, 12, 3, 0, 0F); // Box 584
		bodyModel[111].setRotationPoint(-40F, 4.5F, 0F);
		bodyModel[111].rotateAngleY = 1.25663706F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 55, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // load 3
		bodyModel[112].setRotationPoint(-27.5F, -13F, -10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 55, 0, 7, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // load 2
		bodyModel[113].setRotationPoint(-27.5F, -13F, 3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 55, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // load 1
		bodyModel[114].setRotationPoint(-27.5F, -18F, -3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 8, 0, 6, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // load 4
		bodyModel[115].setRotationPoint(-35.5F, -13F, -3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 0, 6, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // load 5
		bodyModel[116].setRotationPoint(27.5F, -13F, -3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -7F, 0F, 0F, -7F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // load 6
		bodyModel[117].setRotationPoint(27.5F, -18F, 3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,0F, 0F, -7F, -8F, 0F, -7F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // load 9
		bodyModel[118].setRotationPoint(27.5F, -18F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,-8F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // load 8
		bodyModel[119].setRotationPoint(-35.5F, -18F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -8F, 0F, -7F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // load 7
		bodyModel[120].setRotationPoint(-35.5F, -18F, 3F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 132
		bodyModel[121].setRotationPoint(-36.75F, -4F, 4F);

		bodyModel[122].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[122].setRotationPoint(-29.5F, 0F, 4F);
		bodyModel[122].rotateAngleX = -0.78539816F;

		bodyModel[123].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[123].setRotationPoint(-31.5F, 0F, 4F);
		bodyModel[123].rotateAngleX = -0.78539816F;

		bodyModel[124].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 125
		bodyModel[124].setRotationPoint(-35.75F, 0F, 4F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[125].setRotationPoint(-30F, -1F, -2F);

		bodyModel[126].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 318
		bodyModel[126].setRotationPoint(-31F, 0F, -2F);

		bodyModel[127].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[127].setRotationPoint(-28.5F, 0.5F, -3.5F);
		bodyModel[127].rotateAngleX = -0.78539816F;
		bodyModel[127].rotateAngleY = -1.57079633F;

		bodyModel[128].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[128].setRotationPoint(-28.5F, 0.5F, -6.5F);
		bodyModel[128].rotateAngleX = -0.78539816F;
		bodyModel[128].rotateAngleY = -1.57079633F;

		bodyModel[129].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 321
		bodyModel[129].setRotationPoint(-30F, 0.5F, -3.49F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 586
		bodyModel[130].setRotationPoint(-30F, 1F, 3F);

		bodyModel[131].addBox(0F, -1F, -1F, 2, 2, 2, 0F); // Box 587
		bodyModel[131].setRotationPoint(-30F, 1F, 8F);
		bodyModel[131].rotateAngleX = 0.78539816F;

		bodyModel[132].addShapeBox(-0.5F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 588
		bodyModel[132].setRotationPoint(-34.75F, -4F, 4.01F);

		bodyModel[133].addShapeBox(-0.5F, 5F, 0F, 1, 4, 0, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 589
		bodyModel[133].setRotationPoint(-34.75F, -4F, 4.01F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 178
		bodyModel[134].setRotationPoint(-10.5F, -15F, -11.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 179
		bodyModel[135].setRotationPoint(-5.5F, -15F, -11.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 180
		bodyModel[136].setRotationPoint(-0.5F, -15F, -11.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 181
		bodyModel[137].setRotationPoint(4.5F, -15F, -11.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 182
		bodyModel[138].setRotationPoint(9.5F, -15F, -11.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 183
		bodyModel[139].setRotationPoint(14.5F, -15F, -11.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[140].setRotationPoint(9.5F, -15F, 10.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[141].setRotationPoint(4.5F, -15F, 10.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[142].setRotationPoint(-0.5F, -15F, 10.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[143].setRotationPoint(-5.5F, -15F, 10.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[144].setRotationPoint(-10.5F, -15F, 10.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[145].setRotationPoint(-15.5F, -15F, 10.5F);
	}
	Model70TonTruck2 bogie2 = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (int i = 0; i < 146; i++) {

			int cargo = ((Freight) entity).getAmmountOfCargo();
			if (i == 9999) {
				//hold J for 3 seconds
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);

			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("load")) {
				if (cargo > 0) {
					bodyModel[i].render(f5);
				}
				if (cargo == 0) {

				}
			} else
				bodyModel[i].render(f5);
		}

		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==3235446){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.78,-0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.56,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}