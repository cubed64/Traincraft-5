//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.02.2025 - 11:43:25
// Last changed on: 02.02.2025 - 11:43:25

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.library.Info;

public class ModelEvans5100 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelEvans5100() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[184];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 3, 169, textureX, textureY); // Box 52
		bodyModel[1] = new ModelRendererTurbo(this, 201, 31, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[2] = new ModelRendererTurbo(this, 239, 36, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[3] = new ModelRendererTurbo(this, 163, 181, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 163, 181, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 239, 31, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[6] = new ModelRendererTurbo(this, 201, 35, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[7] = new ModelRendererTurbo(this, 4, 132, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 4, 141, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 59, 89, textureX, textureY); // Box 49
		bodyModel[10] = new ModelRendererTurbo(this, 94, 89, textureX, textureY); // Box 49
		bodyModel[11] = new ModelRendererTurbo(this, 94, 62, textureX, textureY); // Box 49
		bodyModel[12] = new ModelRendererTurbo(this, 59, 62, textureX, textureY); // Box 49
		bodyModel[13] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Roof slopes02
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Roof slopes03
		bodyModel[15] = new ModelRendererTurbo(this, 18, 27, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 26, 14, textureX, textureY); // Roof slopes02
		bodyModel[17] = new ModelRendererTurbo(this, 26, 1, textureX, textureY); // Roof slopes03
		bodyModel[18] = new ModelRendererTurbo(this, 211, 15, textureX, textureY); // Roof slopes02
		bodyModel[19] = new ModelRendererTurbo(this, 211, 1, textureX, textureY); // Roof slopes03
		bodyModel[20] = new ModelRendererTurbo(this, 4, 89, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 1, 118, textureX, textureY); // Box 168
		bodyModel[22] = new ModelRendererTurbo(this, 1, 122, textureX, textureY); // Box 168
		bodyModel[23] = new ModelRendererTurbo(this, 3, 146, textureX, textureY); // Box 16
		bodyModel[24] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 22
		bodyModel[25] = new ModelRendererTurbo(this, 129, 62, textureX, textureY); // Box 22
		bodyModel[26] = new ModelRendererTurbo(this, 4, 62, textureX, textureY); // Box 22
		bodyModel[27] = new ModelRendererTurbo(this, 37, 49, textureX, textureY); // Box 6
		bodyModel[28] = new ModelRendererTurbo(this, 38, 55, textureX, textureY); // Box 6
		bodyModel[29] = new ModelRendererTurbo(this, 184, 68, textureX, textureY); // Box 50
		bodyModel[30] = new ModelRendererTurbo(this, 220, 111, textureX, textureY); // Box 50
		bodyModel[31] = new ModelRendererTurbo(this, 215, 28, textureX, textureY); // Box 72
		bodyModel[32] = new ModelRendererTurbo(this, 229, 30, textureX, textureY); // Box 87
		bodyModel[33] = new ModelRendererTurbo(this, 226, 31, textureX, textureY); // Box 132
		bodyModel[34] = new ModelRendererTurbo(this, 93, 192, textureX, textureY); // Box 125
		bodyModel[35] = new ModelRendererTurbo(this, 225, 28, textureX, textureY); // Box 87
		bodyModel[36] = new ModelRendererTurbo(this, 410, 111, textureX, textureY); // Box 59
		bodyModel[37] = new ModelRendererTurbo(this, 382, 104, textureX, textureY); // Box 60
		bodyModel[38] = new ModelRendererTurbo(this, 369, 111, textureX, textureY); // Box 61
		bodyModel[39] = new ModelRendererTurbo(this, 410, 96, textureX, textureY); // Box 59
		bodyModel[40] = new ModelRendererTurbo(this, 382, 89, textureX, textureY); // Box 60
		bodyModel[41] = new ModelRendererTurbo(this, 369, 96, textureX, textureY); // Box 61
		bodyModel[42] = new ModelRendererTurbo(this, 410, 81, textureX, textureY); // Box 59
		bodyModel[43] = new ModelRendererTurbo(this, 382, 74, textureX, textureY); // Box 60
		bodyModel[44] = new ModelRendererTurbo(this, 368, 81, textureX, textureY); // Box 61
		bodyModel[45] = new ModelRendererTurbo(this, 410, 66, textureX, textureY); // Box 59
		bodyModel[46] = new ModelRendererTurbo(this, 382, 59, textureX, textureY); // Box 60
		bodyModel[47] = new ModelRendererTurbo(this, 368, 66, textureX, textureY); // Box 61
		bodyModel[48] = new ModelRendererTurbo(this, 409, 51, textureX, textureY); // Box 59
		bodyModel[49] = new ModelRendererTurbo(this, 382, 44, textureX, textureY); // Box 60
		bodyModel[50] = new ModelRendererTurbo(this, 368, 51, textureX, textureY); // Box 61
		bodyModel[51] = new ModelRendererTurbo(this, 409, 36, textureX, textureY); // Box 59
		bodyModel[52] = new ModelRendererTurbo(this, 382, 29, textureX, textureY); // Box 60
		bodyModel[53] = new ModelRendererTurbo(this, 368, 36, textureX, textureY); // Box 61
		bodyModel[54] = new ModelRendererTurbo(this, 409, 22, textureX, textureY); // Box 59
		bodyModel[55] = new ModelRendererTurbo(this, 382, 15, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 367, 22, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 409, 8, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 382, 1, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 369, 8, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 317, 2, textureX, textureY); // Box 90
		bodyModel[61] = new ModelRendererTurbo(this, 464, 111, textureX, textureY); // Box 59
		bodyModel[62] = new ModelRendererTurbo(this, 437, 104, textureX, textureY); // Box 60
		bodyModel[63] = new ModelRendererTurbo(this, 424, 111, textureX, textureY); // Box 61
		bodyModel[64] = new ModelRendererTurbo(this, 464, 96, textureX, textureY); // Box 59
		bodyModel[65] = new ModelRendererTurbo(this, 437, 89, textureX, textureY); // Box 60
		bodyModel[66] = new ModelRendererTurbo(this, 424, 96, textureX, textureY); // Box 61
		bodyModel[67] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 59
		bodyModel[68] = new ModelRendererTurbo(this, 437, 74, textureX, textureY); // Box 60
		bodyModel[69] = new ModelRendererTurbo(this, 424, 81, textureX, textureY); // Box 61
		bodyModel[70] = new ModelRendererTurbo(this, 464, 66, textureX, textureY); // Box 59
		bodyModel[71] = new ModelRendererTurbo(this, 437, 59, textureX, textureY); // Box 60
		bodyModel[72] = new ModelRendererTurbo(this, 424, 66, textureX, textureY); // Box 61
		bodyModel[73] = new ModelRendererTurbo(this, 465, 51, textureX, textureY); // Box 59
		bodyModel[74] = new ModelRendererTurbo(this, 437, 44, textureX, textureY); // Box 60
		bodyModel[75] = new ModelRendererTurbo(this, 424, 51, textureX, textureY); // Box 61
		bodyModel[76] = new ModelRendererTurbo(this, 465, 36, textureX, textureY); // Box 59
		bodyModel[77] = new ModelRendererTurbo(this, 437, 29, textureX, textureY); // Box 60
		bodyModel[78] = new ModelRendererTurbo(this, 423, 36, textureX, textureY); // Box 61
		bodyModel[79] = new ModelRendererTurbo(this, 465, 22, textureX, textureY); // Box 59
		bodyModel[80] = new ModelRendererTurbo(this, 437, 15, textureX, textureY); // Box 60
		bodyModel[81] = new ModelRendererTurbo(this, 423, 22, textureX, textureY); // Box 61
		bodyModel[82] = new ModelRendererTurbo(this, 465, 8, textureX, textureY); // Box 59
		bodyModel[83] = new ModelRendererTurbo(this, 436, 1, textureX, textureY); // Box 60
		bodyModel[84] = new ModelRendererTurbo(this, 423, 8, textureX, textureY); // Box 61
		bodyModel[85] = new ModelRendererTurbo(this, 430, 122, textureX, textureY); // Box 90
		bodyModel[86] = new ModelRendererTurbo(this, 263, 24, textureX, textureY); // Box 189
		bodyModel[87] = new ModelRendererTurbo(this, 264, 49, textureX, textureY); // Box 189
		bodyModel[88] = new ModelRendererTurbo(this, 264, 75, textureX, textureY); // Box 189
		bodyModel[89] = new ModelRendererTurbo(this, 264, 102, textureX, textureY); // Box 189
		bodyModel[90] = new ModelRendererTurbo(this, 264, 128, textureX, textureY); // Box 189
		bodyModel[91] = new ModelRendererTurbo(this, 264, 155, textureX, textureY); // Box 189
		bodyModel[92] = new ModelRendererTurbo(this, 264, 181, textureX, textureY); // Box 189
		bodyModel[93] = new ModelRendererTurbo(this, 264, 207, textureX, textureY); // Box 189
		bodyModel[94] = new ModelRendererTurbo(this, 363, 207, textureX, textureY); // Box 189
		bodyModel[95] = new ModelRendererTurbo(this, 363, 181, textureX, textureY); // Box 189
		bodyModel[96] = new ModelRendererTurbo(this, 268, 2, textureX, textureY); // Box 90
		bodyModel[97] = new ModelRendererTurbo(this, 376, 122, textureX, textureY); // Box 90
		bodyModel[98] = new ModelRendererTurbo(this, 313, 24, textureX, textureY); // Box 189
		bodyModel[99] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 189
		bodyModel[100] = new ModelRendererTurbo(this, 313, 76, textureX, textureY); // Box 189
		bodyModel[101] = new ModelRendererTurbo(this, 313, 102, textureX, textureY); // Box 189
		bodyModel[102] = new ModelRendererTurbo(this, 313, 128, textureX, textureY); // Box 189
		bodyModel[103] = new ModelRendererTurbo(this, 312, 155, textureX, textureY); // Box 189
		bodyModel[104] = new ModelRendererTurbo(this, 312, 181, textureX, textureY); // Box 189
		bodyModel[105] = new ModelRendererTurbo(this, 312, 207, textureX, textureY); // Box 189
		bodyModel[106] = new ModelRendererTurbo(this, 412, 207, textureX, textureY); // Box 189
		bodyModel[107] = new ModelRendererTurbo(this, 411, 181, textureX, textureY); // Box 189
		bodyModel[108] = new ModelRendererTurbo(this, 208, 44, textureX, textureY); // Box 57
		bodyModel[109] = new ModelRendererTurbo(this, 223, 44, textureX, textureY); // Box 57
		bodyModel[110] = new ModelRendererTurbo(this, 218, 44, textureX, textureY); // Box 57
		bodyModel[111] = new ModelRendererTurbo(this, 213, 44, textureX, textureY); // Box 57
		bodyModel[112] = new ModelRendererTurbo(this, 125, 183, textureX, textureY); // Box 286
		bodyModel[113] = new ModelRendererTurbo(this, 115, 183, textureX, textureY); // Box 287
		bodyModel[114] = new ModelRendererTurbo(this, 100, 184, textureX, textureY); // Box 317
		bodyModel[115] = new ModelRendererTurbo(this, 112, 178, textureX, textureY); // Box 318
		bodyModel[116] = new ModelRendererTurbo(this, 58, 184, textureX, textureY); // Box 118
		bodyModel[117] = new ModelRendererTurbo(this, 71, 184, textureX, textureY); // Box 119
		bodyModel[118] = new ModelRendererTurbo(this, 71, 191, textureX, textureY); // Box 122
		bodyModel[119] = new ModelRendererTurbo(this, 168, 157, textureX, textureY); // Box 124
		bodyModel[120] = new ModelRendererTurbo(this, 82, 184, textureX, textureY); // Box 126
		bodyModel[121] = new ModelRendererTurbo(this, 48, 195, textureX, textureY); // Box 124
		bodyModel[122] = new ModelRendererTurbo(this, 3, 185, textureX, textureY); // Box 124
		bodyModel[123] = new ModelRendererTurbo(this, 204, 199, textureX, textureY); // Box 140
		bodyModel[124] = new ModelRendererTurbo(this, 160, 199, textureX, textureY); // Box 140
		bodyModel[125] = new ModelRendererTurbo(this, 116, 199, textureX, textureY); // Box 140
		bodyModel[126] = new ModelRendererTurbo(this, 71, 199, textureX, textureY); // Box 140
		bodyModel[127] = new ModelRendererTurbo(this, 212, 169, textureX, textureY); // Box 415
		bodyModel[128] = new ModelRendererTurbo(this, 52, 185, textureX, textureY, "cull"); // Box 108 cull
		bodyModel[129] = new ModelRendererTurbo(this, 98, 178, textureX, textureY); // Box 318
		bodyModel[130] = new ModelRendererTurbo(this, 120, 227, textureX, textureY); // Box 183 door right
		bodyModel[131] = new ModelRendererTurbo(this, 144, 227, textureX, textureY); // Box 184 door right
		bodyModel[132] = new ModelRendererTurbo(this, 126, 248, textureX, textureY); // Box 179 door right
		bodyModel[133] = new ModelRendererTurbo(this, 126, 250, textureX, textureY); // Box 179 door right
		bodyModel[134] = new ModelRendererTurbo(this, 123, 227, textureX, textureY); // Box 183 door right
		bodyModel[135] = new ModelRendererTurbo(this, 141, 227, textureX, textureY); // Box 184 door right
		bodyModel[136] = new ModelRendererTurbo(this, 89, 227, textureX, textureY); // Box 183 door right
		bodyModel[137] = new ModelRendererTurbo(this, 114, 227, textureX, textureY); // Box 184 door right
		bodyModel[138] = new ModelRendererTurbo(this, 96, 248, textureX, textureY); // Box 179 door right
		bodyModel[139] = new ModelRendererTurbo(this, 96, 250, textureX, textureY); // Box 179 door right
		bodyModel[140] = new ModelRendererTurbo(this, 93, 227, textureX, textureY); // Box 183 door right
		bodyModel[141] = new ModelRendererTurbo(this, 111, 227, textureX, textureY); // Box 184 door right
		bodyModel[142] = new ModelRendererTurbo(this, 56, 127, textureX, textureY); // Box 6
		bodyModel[143] = new ModelRendererTurbo(this, 56, 139, textureX, textureY); // Box 6
		bodyModel[144] = new ModelRendererTurbo(this, 50, 227, textureX, textureY); // Box 183 door right
		bodyModel[145] = new ModelRendererTurbo(this, 26, 227, textureX, textureY); // Box 184 door right
		bodyModel[146] = new ModelRendererTurbo(this, 32, 248, textureX, textureY); // Box 179 door right
		bodyModel[147] = new ModelRendererTurbo(this, 32, 250, textureX, textureY); // Box 179 door right
		bodyModel[148] = new ModelRendererTurbo(this, 47, 227, textureX, textureY); // Box 183 door right
		bodyModel[149] = new ModelRendererTurbo(this, 29, 227, textureX, textureY); // Box 184 door right
		bodyModel[150] = new ModelRendererTurbo(this, 80, 227, textureX, textureY); // Box 183 door right
		bodyModel[151] = new ModelRendererTurbo(this, 56, 227, textureX, textureY); // Box 184 door right
		bodyModel[152] = new ModelRendererTurbo(this, 62, 248, textureX, textureY); // Box 179 door right
		bodyModel[153] = new ModelRendererTurbo(this, 62, 250, textureX, textureY); // Box 179 door right
		bodyModel[154] = new ModelRendererTurbo(this, 77, 227, textureX, textureY); // Box 183 door right
		bodyModel[155] = new ModelRendererTurbo(this, 59, 227, textureX, textureY); // Box 184 door right
		bodyModel[156] = new ModelRendererTurbo(this, 56, 135, textureX, textureY); // Box 6
		bodyModel[157] = new ModelRendererTurbo(this, 56, 131, textureX, textureY); // Box 6
		bodyModel[158] = new ModelRendererTurbo(this, 231, 51, textureX, textureY); // Box 70
		bodyModel[159] = new ModelRendererTurbo(this, 2, 31, textureX, textureY); // Box 75
		bodyModel[160] = new ModelRendererTurbo(this, 14, 31, textureX, textureY); // Box 77
		bodyModel[161] = new ModelRendererTurbo(this, 201, 51, textureX, textureY); // Box 81
		bodyModel[162] = new ModelRendererTurbo(this, 193, 132, textureX, textureY, "cull"); // Box 105 ladder cull
		bodyModel[163] = new ModelRendererTurbo(this, 247, 68, textureX, textureY, "cull"); // Box 78 ladder cull
		bodyModel[164] = new ModelRendererTurbo(this, 206, 132, textureX, textureY, "cull"); // Box 105 ladder cull
		bodyModel[165] = new ModelRendererTurbo(this, 235, 68, textureX, textureY, "cull"); // Box 78 ladder cull
		bodyModel[166] = new ModelRendererTurbo(this, 235, 87, textureX, textureY, "cull"); // Box 78 ladder cull
		bodyModel[167] = new ModelRendererTurbo(this, 248, 87, textureX, textureY, "cull"); // Box 78 ladder cull
		bodyModel[168] = new ModelRendererTurbo(this, 193, 116, textureX, textureY, "cull"); // Box 105 ladder cull
		bodyModel[169] = new ModelRendererTurbo(this, 206, 116, textureX, textureY, "cull"); // Box 105 ladder cull
		bodyModel[170] = new ModelRendererTurbo(this, 118, 139, textureX, textureY); // Box 6
		bodyModel[171] = new ModelRendererTurbo(this, 118, 131, textureX, textureY); // Box 6
		bodyModel[172] = new ModelRendererTurbo(this, 236, 208, textureX, textureY, "cull"); // Box 209 cull cutbar holder
		bodyModel[173] = new ModelRendererTurbo(this, 236, 213, textureX, textureY); // Box 215
		bodyModel[174] = new ModelRendererTurbo(this, 235, 231, textureX, textureY, "cull"); // Box 209 cull cutbar holder
		bodyModel[175] = new ModelRendererTurbo(this, 236, 238, textureX, textureY); // Box 215
		bodyModel[176] = new ModelRendererTurbo(this, 241, 213, textureX, textureY); // Box 216
		bodyModel[177] = new ModelRendererTurbo(this, 241, 239, textureX, textureY); // Box 216
		bodyModel[178] = new ModelRendererTurbo(this, 238, 3, textureX, textureY, "cull"); // Box 56 crossover cull
		bodyModel[179] = new ModelRendererTurbo(this, 236, 17, textureX, textureY, "cull"); // Box 56 crossover cull
		bodyModel[180] = new ModelRendererTurbo(this, 156, 228, textureX, textureY); // vents
		bodyModel[181] = new ModelRendererTurbo(this, 161, 228, textureX, textureY); // vents
		bodyModel[182] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // vents
		bodyModel[183] = new ModelRendererTurbo(this, 156, 233, textureX, textureY); // vents

		bodyModel[0].addBox(0F, 0F, 0F, 88, 2, 5, 0F); // Box 52
		bodyModel[0].setRotationPoint(-44F, 3F, -2.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Stirrup cull
		bodyModel[1].setRotationPoint(-39F, 4F, 10F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Stirrup cull
		bodyModel[2].setRotationPoint(36F, 4F, 10F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[3].setRotationPoint(-47F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[4].setRotationPoint(44F, 3F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Stirrup cull
		bodyModel[5].setRotationPoint(-39F, 4F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Stirrup cull
		bodyModel[6].setRotationPoint(36F, 4F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[7].setRotationPoint(-32.5F, 5F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[8].setRotationPoint(28.5F, 5F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 15, 24, 1, 0F); // Box 49
		bodyModel[9].setRotationPoint(-15F, -22F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 15, 24, 1, 0F); // Box 49
		bodyModel[10].setRotationPoint(0F, -22F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 15, 24, 1, 0F); // Box 49
		bodyModel[11].setRotationPoint(-15F, -22F, 10F);

		bodyModel[12].addBox(0F, 0F, 0F, 15, 24, 1, 0F); // Box 49
		bodyModel[12].setRotationPoint(0F, -22F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Roof slopes02
		bodyModel[13].setRotationPoint(-40.5F, -25F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Roof slopes03
		bodyModel[14].setRotationPoint(-40.5F, -25F, 0F);

		bodyModel[15].addBox(0F, 0F, 0F, 80, 1, 20, 0F); // Box 16
		bodyModel[15].setRotationPoint(-40F, -24F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 80, 1, 11, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Roof slopes02
		bodyModel[16].setRotationPoint(-40F, -25F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 80, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Roof slopes03
		bodyModel[17].setRotationPoint(-40F, -25F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Roof slopes02
		bodyModel[18].setRotationPoint(40F, -25F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Roof slopes03
		bodyModel[19].setRotationPoint(40F, -25F, 0F);

		bodyModel[20].addBox(0F, 0F, 0F, 25, 24, 1, 0F); // Box 22
		bodyModel[20].setRotationPoint(-40F, -22F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 80, 2, 1, 0F); // Box 168
		bodyModel[21].setRotationPoint(-40F, 2F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 80, 2, 1, 0F); // Box 168
		bodyModel[22].setRotationPoint(-40F, 2F, 10F);

		bodyModel[23].addBox(0F, 0F, 0F, 80, 1, 20, 0F); // Box 16
		bodyModel[23].setRotationPoint(-40F, 2F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 25, 24, 1, 0F); // Box 22
		bodyModel[24].setRotationPoint(15F, -22F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 25, 24, 1, 0F); // Box 22
		bodyModel[25].setRotationPoint(-40F, -22F, 10F);

		bodyModel[26].addBox(0F, 0F, 0F, 25, 24, 1, 0F); // Box 22
		bodyModel[26].setRotationPoint(15F, -22F, 10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 80, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[27].setRotationPoint(-40F, -24F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 80, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[28].setRotationPoint(-40F, -24F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 25, 20, 0F); // Box 50
		bodyModel[29].setRotationPoint(-40F, -23F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 25, 20, 0F); // Box 50
		bodyModel[30].setRotationPoint(39F, -23F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[31].setRotationPoint(-41.77F, -5F, 2F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		bodyModel[32].setRotationPoint(-41.01F, -5F, 2.5F);

		bodyModel[33].addFlexTrapezoid(0F, 0F, 0F, 1, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 132
		bodyModel[33].setRotationPoint(-41.51F, -2.51F, 4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 26, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[34].setRotationPoint(-41.52F, 3.5F, 4F);
		bodyModel[34].rotateAngleZ = -0.01745329F;

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[35].setRotationPoint(-41.77F, -3.5F, 3.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 59
		bodyModel[36].setRotationPoint(40F, 1.5F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[37].setRotationPoint(40F, 1.5F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[38].setRotationPoint(40F, 1.5F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 59
		bodyModel[39].setRotationPoint(40F, -1.5F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[40].setRotationPoint(40F, -1.5F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[41].setRotationPoint(40F, -1.5F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 59
		bodyModel[42].setRotationPoint(40F, -4.5F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[43].setRotationPoint(40F, -4.5F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[44].setRotationPoint(40F, -4.5F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 59
		bodyModel[45].setRotationPoint(40F, -7.5F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[46].setRotationPoint(40F, -7.5F, -6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[47].setRotationPoint(40F, -7.5F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 59
		bodyModel[48].setRotationPoint(40F, -11.5F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[49].setRotationPoint(40F, -11.5F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[50].setRotationPoint(40F, -11.5F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 59
		bodyModel[51].setRotationPoint(40F, -14.5F, 6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[52].setRotationPoint(40F, -14.5F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[53].setRotationPoint(40F, -14.5F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 59
		bodyModel[54].setRotationPoint(40F, -17.5F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[55].setRotationPoint(40F, -17.5F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[56].setRotationPoint(40F, -17.5F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 59
		bodyModel[57].setRotationPoint(40F, -20.5F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[58].setRotationPoint(40F, -20.5F, -6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[59].setRotationPoint(40F, -20.5F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 90
		bodyModel[60].setRotationPoint(39.25F, -23F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[61].setRotationPoint(-41F, 1.5F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[62].setRotationPoint(-41F, 1.5F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[63].setRotationPoint(-41F, 1.5F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[64].setRotationPoint(-41F, -1.5F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[65].setRotationPoint(-41F, -1.5F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[66].setRotationPoint(-41F, -1.5F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[67].setRotationPoint(-41F, -4.5F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[68].setRotationPoint(-41F, -4.5F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[69].setRotationPoint(-41F, -4.5F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[70].setRotationPoint(-41F, -7.5F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[71].setRotationPoint(-41F, -7.5F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[72].setRotationPoint(-41F, -7.5F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[73].setRotationPoint(-41F, -11.5F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[74].setRotationPoint(-41F, -11.5F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[75].setRotationPoint(-41F, -11.5F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[76].setRotationPoint(-41F, -14.5F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[77].setRotationPoint(-41F, -14.5F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[78].setRotationPoint(-41F, -14.5F, 6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[79].setRotationPoint(-41F, -17.5F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[80].setRotationPoint(-41F, -17.5F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[81].setRotationPoint(-41F, -17.5F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[82].setRotationPoint(-41F, -20.5F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[83].setRotationPoint(-41F, -20.5F, -6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[84].setRotationPoint(-41F, -20.5F, 6F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 90
		bodyModel[85].setRotationPoint(39.25F, -21.5F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[86].setRotationPoint(40F, -19.5F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[87].setRotationPoint(40F, -17.5F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[88].setRotationPoint(40F, -15.5F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[89].setRotationPoint(40F, -13.5F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[90].setRotationPoint(40F, -11.5F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[91].setRotationPoint(40F, -8.5F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[92].setRotationPoint(40F, -6.5F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[93].setRotationPoint(40F, -4.5F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[94].setRotationPoint(40F, -0.5F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[95].setRotationPoint(40F, -2.5F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 90
		bodyModel[96].setRotationPoint(-40.25F, -23F, -9F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 90
		bodyModel[97].setRotationPoint(-40.25F, -21.5F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[98].setRotationPoint(-41F, -19.5F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[99].setRotationPoint(-41F, -17.5F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[100].setRotationPoint(-41F, -15.5F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[101].setRotationPoint(-41F, -13.5F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[102].setRotationPoint(-41F, -11.5F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[103].setRotationPoint(-41F, -8.5F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[104].setRotationPoint(-41F, -6.5F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[105].setRotationPoint(-41F, -4.5F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[106].setRotationPoint(-41F, -0.5F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[107].setRotationPoint(-41F, -2.5F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
		bodyModel[108].setRotationPoint(-40F, 3F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[109].setRotationPoint(-40F, 3F, 9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
		bodyModel[110].setRotationPoint(39F, 3F, -10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[111].setRotationPoint(39F, 3F, 9F);

		bodyModel[112].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[112].setRotationPoint(-20F, 4.2F, 7.5F);
		bodyModel[112].rotateAngleX = -0.78539816F;

		bodyModel[113].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[113].setRotationPoint(-18F, 4.2F, 7.5F);
		bodyModel[113].rotateAngleX = -0.78539816F;

		bodyModel[114].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[114].setRotationPoint(-14.5F, 5F, -9.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 318
		bodyModel[115].setRotationPoint(-15.5F, 3F, -9.5F);

		bodyModel[116].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[116].setRotationPoint(13F, 5F, -5F);
		bodyModel[116].rotateAngleX = -0.78539816F;

		bodyModel[117].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[117].setRotationPoint(11F, 5F, -5F);
		bodyModel[117].rotateAngleX = -0.78539816F;

		bodyModel[118].addBox(-0.5F, 0F, -2F, 1, 0, 8, 0F); // Box 122
		bodyModel[118].setRotationPoint(9F, 5.51F, -3.5F);
		bodyModel[118].rotateAngleY = -0.10471976F;

		bodyModel[119].addBox(-0.5F, 0F, 0F, 1, 0, 39, 0F); // Box 124
		bodyModel[119].setRotationPoint(-29F, 5.51F, 0F);
		bodyModel[119].rotateAngleY = -1.57079633F;

		bodyModel[120].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 126
		bodyModel[120].setRotationPoint(8F, 4.75F, 1.75F);

		bodyModel[121].addBox(-0.5F, 0F, 0F, 1, 0, 20, 0F); // Box 124
		bodyModel[121].setRotationPoint(9F, 5.51F, -1.5F);
		bodyModel[121].rotateAngleY = -1.57079633F;

		bodyModel[122].addBox(-0.5F, 0F, 0F, 3, 0, 31, 0F); // Box 124
		bodyModel[122].setRotationPoint(-13.5F, 5.51F, -5F);
		bodyModel[122].rotateAngleY = -1.57079633F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F); // Box 140
		bodyModel[123].setRotationPoint(20F, 3.1F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F); // Box 140
		bodyModel[124].setRotationPoint(8F, 3.1F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F); // Box 140
		bodyModel[125].setRotationPoint(-9F, 3.1F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F); // Box 140
		bodyModel[126].setRotationPoint(-21F, 3.1F, -10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 415
		bodyModel[127].setRotationPoint(-4.5F, 5F, -3F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 108 cull
		bodyModel[128].setRotationPoint(-8F, 4.01F, -11.01F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 318
		bodyModel[129].setRotationPoint(3.5F, 3F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 25, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 door right
		bodyModel[130].setRotationPoint(-2F, -22.49F, 11.02F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 25, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 door right
		bodyModel[131].setRotationPoint(-14F, -22.49F, 11.02F);

		bodyModel[132].addBox(0F, -1F, 0F, 7, 1, 0, 0F); // Box 179 door right
		bodyModel[132].setRotationPoint(-8F, 1F, 11.01F);
		bodyModel[132].rotateAngleZ = 0.73303829F;

		bodyModel[133].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 179 door right
		bodyModel[133].setRotationPoint(-7F, 1F, 11.02F);
		bodyModel[133].rotateAngleZ = 2.40855437F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 door right
		bodyModel[134].setRotationPoint(-3.5F, -22F, 11.03F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 door right
		bodyModel[135].setRotationPoint(-12.5F, -22F, 11.03F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 25, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 door right
		bodyModel[136].setRotationPoint(13F, -22.49F, 11.02F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 25, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 door right
		bodyModel[137].setRotationPoint(1F, -22.49F, 11.02F);

		bodyModel[138].addBox(0F, -1F, 0F, 7, 1, 0, 0F); // Box 179 door right
		bodyModel[138].setRotationPoint(7F, 1F, 11.01F);
		bodyModel[138].rotateAngleZ = 0.73303829F;

		bodyModel[139].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 179 door right
		bodyModel[139].setRotationPoint(8F, 1F, 11.02F);
		bodyModel[139].rotateAngleZ = 2.40855437F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 door right
		bodyModel[140].setRotationPoint(11.5F, -22F, 11.03F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 door right
		bodyModel[141].setRotationPoint(2.5F, -22F, 11.03F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 60, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[142].setRotationPoint(-30F, -23.5F, 10.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[143].setRotationPoint(-30F, 2.01F, 10.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 25, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 door right
		bodyModel[144].setRotationPoint(-2F, -22.49F, -11.02F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 25, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 door right
		bodyModel[145].setRotationPoint(-14F, -22.49F, -11.02F);

		bodyModel[146].addBox(0F, -1F, 0F, 7, 1, 0, 0F); // Box 179 door right
		bodyModel[146].setRotationPoint(-8F, 1F, -11.02F);
		bodyModel[146].rotateAngleZ = 0.73303829F;

		bodyModel[147].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 179 door right
		bodyModel[147].setRotationPoint(-7F, 1F, -11.01F);
		bodyModel[147].rotateAngleZ = 2.40855437F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 door right
		bodyModel[148].setRotationPoint(-3.5F, -22F, -11.03F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 door right
		bodyModel[149].setRotationPoint(-12.5F, -22F, -11.03F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 25, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 door right
		bodyModel[150].setRotationPoint(13F, -22.49F, -11.02F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 25, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 door right
		bodyModel[151].setRotationPoint(1F, -22.49F, -11.02F);

		bodyModel[152].addBox(0F, -1F, 0F, 7, 1, 0, 0F); // Box 179 door right
		bodyModel[152].setRotationPoint(7F, 1F, -11.02F);
		bodyModel[152].rotateAngleZ = 0.73303829F;

		bodyModel[153].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 179 door right
		bodyModel[153].setRotationPoint(8F, 1F, -11.01F);
		bodyModel[153].rotateAngleZ = 2.40855437F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 door right
		bodyModel[154].setRotationPoint(11.5F, -22F, -11.03F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 door right
		bodyModel[155].setRotationPoint(2.5F, -22F, -11.03F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 60, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[156].setRotationPoint(-30F, -23.5F, -11.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[157].setRotationPoint(-30F, 2.01F, -11.5F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 0, 13, 0F); // Box 70
		bodyModel[158].setRotationPoint(-41F, -8.02F, -6.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 0, 4, 5, 0F); // Box 75
		bodyModel[159].setRotationPoint(-40.51F, -5F, -5F);

		bodyModel[160].addBox(0F, 0F, 0F, 0, 4, 5, 0F); // Box 77
		bodyModel[160].setRotationPoint(40.51F, -5F, 0F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 0, 13, 0F); // Box 81
		bodyModel[161].setRotationPoint(40F, -8.02F, -6.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105 ladder cull
		bodyModel[162].setRotationPoint(35.5F, -10F, 10.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,-0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 78 ladder cull
		bodyModel[163].setRotationPoint(40F, -10F, 6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105 ladder cull
		bodyModel[164].setRotationPoint(-39.5F, -10F, 10.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78 ladder cull
		bodyModel[165].setRotationPoint(-41F, -10F, 6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,-0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 78 ladder cull
		bodyModel[166].setRotationPoint(40F, -10F, -10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78 ladder cull
		bodyModel[167].setRotationPoint(-41F, -10F, -10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105 ladder cull
		bodyModel[168].setRotationPoint(35.5F, -10F, -11.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105 ladder cull
		bodyModel[169].setRotationPoint(-39.5F, -10F, -11.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[170].setRotationPoint(1F, 2.01F, 10.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[171].setRotationPoint(1F, 2.01F, -11.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[172].setRotationPoint(-41.01F, 3F, 9F);

		bodyModel[173].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 215
		bodyModel[173].setRotationPoint(-41F, 4.5F, 9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[174].setRotationPoint(40.01F, 3F, -10F);

		bodyModel[175].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 215
		bodyModel[175].setRotationPoint(41F, 4.5F, -10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 11, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 216
		bodyModel[176].setRotationPoint(40.9F, 4.5F, -9.5F);
		bodyModel[176].rotateAngleY = 1.08210414F;
		bodyModel[176].rotateAngleZ = -0.03490659F;

		bodyModel[177].addShapeBox(-11F, 0F, 0F, 11, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 216
		bodyModel[177].setRotationPoint(-40.9F, 4.5F, 9.5F);
		bodyModel[177].rotateAngleY = 1.08210414F;
		bodyModel[177].rotateAngleZ = 0.03490659F;

		bodyModel[178].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 56 crossover cull
		bodyModel[178].setRotationPoint(39.51F, 2F, -5F);

		bodyModel[179].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 56 crossover cull
		bodyModel[179].setRotationPoint(-42.51F, 2F, -5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // vents
		bodyModel[180].setRotationPoint(-37F, -20.5F, -11.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // vents
		bodyModel[181].setRotationPoint(-37F, -20.5F, 10.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // vents
		bodyModel[182].setRotationPoint(36F, -20.5F, -11.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // vents
		bodyModel[183].setRotationPoint(36F, -20.5F, 10.5F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(-1.9,-0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.75,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

	}
}