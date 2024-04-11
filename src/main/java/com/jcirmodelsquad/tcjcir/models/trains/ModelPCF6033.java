//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.03.2024 - 20:16:56
// Last changed on: 01.03.2024 - 20:16:56

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPCF6033 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelPCF6033() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[176];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Roof slopes02
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Roof slopes03
		bodyModel[2] = new ModelRendererTurbo(this, 66, 85, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 3, 146, textureX, textureY); // Box 16
		bodyModel[4] = new ModelRendererTurbo(this, 103, 85, textureX, textureY); // Sides01
		bodyModel[5] = new ModelRendererTurbo(this, 66, 55, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1, 85, textureX, textureY); // Sides01
		bodyModel[7] = new ModelRendererTurbo(this, 27, 129, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 6
		bodyModel[9] = new ModelRendererTurbo(this, 74, 115, textureX, textureY); // Box 6
		bodyModel[10] = new ModelRendererTurbo(this, 1, 27, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		bodyModel[12] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 198, 29, textureX, textureY, "cull"); // Box 45 ladder cull
		bodyModel[14] = new ModelRendererTurbo(this, 198, 29, textureX, textureY, "cull"); // Box 45 ladder cull
		bodyModel[15] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Sides01
		bodyModel[16] = new ModelRendererTurbo(this, 103, 55, textureX, textureY); // Sides01
		bodyModel[17] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		bodyModel[18] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 6
		bodyModel[19] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 6
		bodyModel[20] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 198, 29, textureX, textureY, "cull"); // Box 45 ladder cull
		bodyModel[22] = new ModelRendererTurbo(this, 198, 29, textureX, textureY, "cull"); // Box 45 ladder cull
		bodyModel[23] = new ModelRendererTurbo(this, 168, 65, textureX, textureY); // Box 50
		bodyModel[24] = new ModelRendererTurbo(this, 211, 65, textureX, textureY); // Box 50
		bodyModel[25] = new ModelRendererTurbo(this, 3, 169, textureX, textureY); // Box 52
		bodyModel[26] = new ModelRendererTurbo(this, 198, 42, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[27] = new ModelRendererTurbo(this, 198, 42, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[28] = new ModelRendererTurbo(this, 208, 44, textureX, textureY); // Box 57
		bodyModel[29] = new ModelRendererTurbo(this, 208, 44, textureX, textureY); // Box 57
		bodyModel[30] = new ModelRendererTurbo(this, 208, 44, textureX, textureY); // Box 57
		bodyModel[31] = new ModelRendererTurbo(this, 208, 44, textureX, textureY); // Box 57
		bodyModel[32] = new ModelRendererTurbo(this, 163, 181, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 163, 181, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 27, 138, textureX, textureY); // Box 6
		bodyModel[35] = new ModelRendererTurbo(this, 27, 132, textureX, textureY); // Box 6
		bodyModel[36] = new ModelRendererTurbo(this, 198, 42, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[37] = new ModelRendererTurbo(this, 198, 42, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[38] = new ModelRendererTurbo(this, 27, 135, textureX, textureY); // Box 6
		bodyModel[39] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[40] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[41] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[42] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[43] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[44] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[45] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[46] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[47] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[48] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[49] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[50] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[51] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[52] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[53] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[54] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[55] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[56] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[57] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[58] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[59] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[60] = new ModelRendererTurbo(this, 209, 29, textureX, textureY); // Box 27
		bodyModel[61] = new ModelRendererTurbo(this, 307, 123, textureX, textureY); // Box 59
		bodyModel[62] = new ModelRendererTurbo(this, 320, 116, textureX, textureY); // Box 60
		bodyModel[63] = new ModelRendererTurbo(this, 347, 123, textureX, textureY); // Box 61
		bodyModel[64] = new ModelRendererTurbo(this, 307, 109, textureX, textureY); // Box 59
		bodyModel[65] = new ModelRendererTurbo(this, 320, 102, textureX, textureY); // Box 60
		bodyModel[66] = new ModelRendererTurbo(this, 347, 109, textureX, textureY); // Box 61
		bodyModel[67] = new ModelRendererTurbo(this, 307, 95, textureX, textureY); // Box 59
		bodyModel[68] = new ModelRendererTurbo(this, 320, 88, textureX, textureY); // Box 60
		bodyModel[69] = new ModelRendererTurbo(this, 347, 95, textureX, textureY); // Box 61
		bodyModel[70] = new ModelRendererTurbo(this, 307, 81, textureX, textureY); // Box 59
		bodyModel[71] = new ModelRendererTurbo(this, 320, 74, textureX, textureY); // Box 60
		bodyModel[72] = new ModelRendererTurbo(this, 347, 81, textureX, textureY); // Box 61
		bodyModel[73] = new ModelRendererTurbo(this, 307, 67, textureX, textureY); // Box 59
		bodyModel[74] = new ModelRendererTurbo(this, 320, 60, textureX, textureY); // Box 60
		bodyModel[75] = new ModelRendererTurbo(this, 347, 67, textureX, textureY); // Box 61
		bodyModel[76] = new ModelRendererTurbo(this, 307, 53, textureX, textureY); // Box 59
		bodyModel[77] = new ModelRendererTurbo(this, 320, 46, textureX, textureY); // Box 60
		bodyModel[78] = new ModelRendererTurbo(this, 347, 53, textureX, textureY); // Box 61
		bodyModel[79] = new ModelRendererTurbo(this, 308, 39, textureX, textureY); // Box 59
		bodyModel[80] = new ModelRendererTurbo(this, 320, 32, textureX, textureY); // Box 60
		bodyModel[81] = new ModelRendererTurbo(this, 347, 39, textureX, textureY); // Box 61
		bodyModel[82] = new ModelRendererTurbo(this, 316, 22, textureX, textureY); // Box 59
		bodyModel[83] = new ModelRendererTurbo(this, 329, 15, textureX, textureY); // Box 60
		bodyModel[84] = new ModelRendererTurbo(this, 356, 22, textureX, textureY); // Box 61
		bodyModel[85] = new ModelRendererTurbo(this, 316, 8, textureX, textureY); // Box 59
		bodyModel[86] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 60
		bodyModel[87] = new ModelRendererTurbo(this, 356, 8, textureX, textureY); // Box 61
		bodyModel[88] = new ModelRendererTurbo(this, 232, 6, textureX, textureY); // Box 90
		bodyModel[89] = new ModelRendererTurbo(this, 294, 123, textureX, textureY); // Box 59
		bodyModel[90] = new ModelRendererTurbo(this, 267, 116, textureX, textureY); // Box 60
		bodyModel[91] = new ModelRendererTurbo(this, 254, 123, textureX, textureY); // Box 61
		bodyModel[92] = new ModelRendererTurbo(this, 294, 109, textureX, textureY); // Box 59
		bodyModel[93] = new ModelRendererTurbo(this, 267, 102, textureX, textureY); // Box 60
		bodyModel[94] = new ModelRendererTurbo(this, 254, 109, textureX, textureY); // Box 61
		bodyModel[95] = new ModelRendererTurbo(this, 294, 95, textureX, textureY); // Box 59
		bodyModel[96] = new ModelRendererTurbo(this, 267, 88, textureX, textureY); // Box 60
		bodyModel[97] = new ModelRendererTurbo(this, 254, 95, textureX, textureY); // Box 61
		bodyModel[98] = new ModelRendererTurbo(this, 294, 81, textureX, textureY); // Box 59
		bodyModel[99] = new ModelRendererTurbo(this, 267, 74, textureX, textureY); // Box 60
		bodyModel[100] = new ModelRendererTurbo(this, 254, 67, textureX, textureY); // Box 61
		bodyModel[101] = new ModelRendererTurbo(this, 294, 67, textureX, textureY); // Box 59
		bodyModel[102] = new ModelRendererTurbo(this, 267, 60, textureX, textureY); // Box 60
		bodyModel[103] = new ModelRendererTurbo(this, 254, 81, textureX, textureY); // Box 61
		bodyModel[104] = new ModelRendererTurbo(this, 294, 53, textureX, textureY); // Box 59
		bodyModel[105] = new ModelRendererTurbo(this, 267, 46, textureX, textureY); // Box 60
		bodyModel[106] = new ModelRendererTurbo(this, 254, 53, textureX, textureY); // Box 61
		bodyModel[107] = new ModelRendererTurbo(this, 294, 39, textureX, textureY); // Box 59
		bodyModel[108] = new ModelRendererTurbo(this, 267, 32, textureX, textureY); // Box 60
		bodyModel[109] = new ModelRendererTurbo(this, 254, 39, textureX, textureY); // Box 61
		bodyModel[110] = new ModelRendererTurbo(this, 409, 22, textureX, textureY); // Box 59
		bodyModel[111] = new ModelRendererTurbo(this, 382, 15, textureX, textureY); // Box 60
		bodyModel[112] = new ModelRendererTurbo(this, 369, 22, textureX, textureY); // Box 61
		bodyModel[113] = new ModelRendererTurbo(this, 409, 8, textureX, textureY); // Box 59
		bodyModel[114] = new ModelRendererTurbo(this, 382, 1, textureX, textureY); // Box 60
		bodyModel[115] = new ModelRendererTurbo(this, 369, 8, textureX, textureY); // Box 61
		bodyModel[116] = new ModelRendererTurbo(this, 273, 6, textureX, textureY); // Box 90
		bodyModel[117] = new ModelRendererTurbo(this, 26, 14, textureX, textureY); // Roof slopes02
		bodyModel[118] = new ModelRendererTurbo(this, 26, 1, textureX, textureY); // Roof slopes03
		bodyModel[119] = new ModelRendererTurbo(this, 207, 14, textureX, textureY); // Roof slopes02
		bodyModel[120] = new ModelRendererTurbo(this, 207, 1, textureX, textureY); // Roof slopes03
		bodyModel[121] = new ModelRendererTurbo(this, 403, 76, textureX, textureY, "cull"); // Box 56 crossover cull
		bodyModel[122] = new ModelRendererTurbo(this, 360, 68, textureX, textureY, "cull"); // Box 57 cull
		bodyModel[123] = new ModelRendererTurbo(this, 403, 107, textureX, textureY, "cull"); // Box 56 crossover cull
		bodyModel[124] = new ModelRendererTurbo(this, 360, 99, textureX, textureY, "cull"); // Box 57 cull
		bodyModel[125] = new ModelRendererTurbo(this, 214, 40, textureX, textureY, "cull"); // Box 209 cull cutbar holder
		bodyModel[126] = new ModelRendererTurbo(this, 207, 48, textureX, textureY); // Box 214
		bodyModel[127] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 215
		bodyModel[128] = new ModelRendererTurbo(this, 218, 50, textureX, textureY); // Box 216
		bodyModel[129] = new ModelRendererTurbo(this, 227, 40, textureX, textureY, "cull"); // Box 209 cull cutbar holder
		bodyModel[130] = new ModelRendererTurbo(this, 197, 48, textureX, textureY); // Box 210
		bodyModel[131] = new ModelRendererTurbo(this, 218, 50, textureX, textureY); // Box 80
		bodyModel[132] = new ModelRendererTurbo(this, 193, 54, textureX, textureY); // Box 212
		bodyModel[133] = new ModelRendererTurbo(this, 215, 28, textureX, textureY); // Box 72
		bodyModel[134] = new ModelRendererTurbo(this, 225, 27, textureX, textureY); // Box 87
		bodyModel[135] = new ModelRendererTurbo(this, 229, 30, textureX, textureY); // Box 87
		bodyModel[136] = new ModelRendererTurbo(this, 226, 30, textureX, textureY); // Box 132
		bodyModel[137] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 140
		bodyModel[138] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[139] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[140] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[141] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[142] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[143] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[144] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[145] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[146] = new ModelRendererTurbo(this, 125, 183, textureX, textureY); // Box 286
		bodyModel[147] = new ModelRendererTurbo(this, 115, 183, textureX, textureY); // Box 287
		bodyModel[148] = new ModelRendererTurbo(this, 119, 178, textureX, textureY); // Box 302
		bodyModel[149] = new ModelRendererTurbo(this, 100, 184, textureX, textureY); // Box 317
		bodyModel[150] = new ModelRendererTurbo(this, 98, 178, textureX, textureY); // Box 318
		bodyModel[151] = new ModelRendererTurbo(this, 58, 184, textureX, textureY); // Box 118
		bodyModel[152] = new ModelRendererTurbo(this, 71, 184, textureX, textureY); // Box 119
		bodyModel[153] = new ModelRendererTurbo(this, 57, 178, textureX, textureY); // Box 129
		bodyModel[154] = new ModelRendererTurbo(this, 85, 192, textureX, textureY); // Box 196
		bodyModel[155] = new ModelRendererTurbo(this, 71, 191, textureX, textureY); // Box 122
		bodyModel[156] = new ModelRendererTurbo(this, 166, 176, textureX, textureY); // Box 124
		bodyModel[157] = new ModelRendererTurbo(this, 74, 199, textureX, textureY); // Box 126
		bodyModel[158] = new ModelRendererTurbo(this, 105, 199, textureX, textureY); // Box 125
		bodyModel[159] = new ModelRendererTurbo(this, 54, 193, textureX, textureY); // Box 124
		bodyModel[160] = new ModelRendererTurbo(this, 132, 185, textureX, textureY); // Box 124
		bodyModel[161] = new ModelRendererTurbo(this, 170, 191, textureX, textureY); // Box 140
		bodyModel[162] = new ModelRendererTurbo(this, 36, 177, textureX, textureY); // Box 140
		bodyModel[163] = new ModelRendererTurbo(this, 1, 118, textureX, textureY); // Box 168
		bodyModel[164] = new ModelRendererTurbo(this, 1, 118, textureX, textureY); // Box 168
		bodyModel[165] = new ModelRendererTurbo(this, 16, 124, textureX, textureY); // Box 168
		bodyModel[166] = new ModelRendererTurbo(this, 1, 124, textureX, textureY); // Box 168
		bodyModel[167] = new ModelRendererTurbo(this, 109, 124, textureX, textureY); // Box 168
		bodyModel[168] = new ModelRendererTurbo(this, 4, 132, textureX, textureY); // Box 0
		bodyModel[169] = new ModelRendererTurbo(this, 4, 141, textureX, textureY); // Box 0
		bodyModel[170] = new ModelRendererTurbo(this, 16, 121, textureX, textureY); // Box 168
		bodyModel[171] = new ModelRendererTurbo(this, 109, 121, textureX, textureY); // Box 168
		bodyModel[172] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 168
		bodyModel[173] = new ModelRendererTurbo(this, 170, 191, textureX, textureY); // Box 140
		bodyModel[174] = new ModelRendererTurbo(this, 170, 191, textureX, textureY); // Box 140
		bodyModel[175] = new ModelRendererTurbo(this, 170, 191, textureX, textureY); // Box 140

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Roof slopes02
		bodyModel[0].setRotationPoint(-40F, -27F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Roof slopes03
		bodyModel[1].setRotationPoint(-40F, -27F, 0F);

		bodyModel[2].addBox(0F, 0F, 0F, 17, 28, 1, 0F); // Box 6
		bodyModel[2].setRotationPoint(-8.5F, -25F, 10.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 77, 1, 20, 0F); // Box 16
		bodyModel[3].setRotationPoint(-38.5F, 2F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 31, 28, 1, 0F); // Sides01
		bodyModel[4].setRotationPoint(-39.5F, -25F, 10F);

		bodyModel[5].addBox(0F, 0F, 0F, 17, 28, 1, 0F); // Box 6
		bodyModel[5].setRotationPoint(-8.5F, -25F, -11.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 31, 28, 1, 0F); // Sides01
		bodyModel[6].setRotationPoint(8.5F, -25F, 10F);

		bodyModel[7].addBox(0F, 0F, 0F, 79, 1, 1, 0F); // Box 6
		bodyModel[7].setRotationPoint(-39.5F, 3F, 9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[8].setRotationPoint(-25.5F, -26F, 10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[9].setRotationPoint(-25.5F, 2.5F, 10.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 77, 1, 20, 0F); // Box 16
		bodyModel[10].setRotationPoint(-38.5F, -26F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[11].setRotationPoint(-39.5F, -26F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[12].setRotationPoint(7.5F, 3.5F, 10.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 10, 1, 0F); // Box 45 ladder cull
		bodyModel[13].setRotationPoint(-38.5F, -7F, 10.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 10, 1, 0F); // Box 45 ladder cull
		bodyModel[14].setRotationPoint(35.5F, -7F, 10.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 31, 28, 1, 0F); // Sides01
		bodyModel[15].setRotationPoint(-39.5F, -25F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 31, 28, 1, 0F); // Sides01
		bodyModel[16].setRotationPoint(8.5F, -25F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[17].setRotationPoint(-39.5F, -26F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[18].setRotationPoint(-9.5F, -26F, -11.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[19].setRotationPoint(-9.5F, 2.5F, -11.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[20].setRotationPoint(-5.5F, 3.5F, -11.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 10, 1, 0F); // Box 45 ladder cull
		bodyModel[21].setRotationPoint(-38.5F, -7F, -11.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 10, 1, 0F); // Box 45 ladder cull
		bodyModel[22].setRotationPoint(35.5F, -7F, -11.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 29, 20, 0F); // Box 50
		bodyModel[23].setRotationPoint(38.5F, -26F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 29, 20, 0F); // Box 50
		bodyModel[24].setRotationPoint(-39.5F, -26F, -10F);

		bodyModel[25].addBox(0F, 0F, 0F, 87, 2, 5, 0F); // Box 52
		bodyModel[25].setRotationPoint(-43.5F, 3F, -2.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[26].setRotationPoint(-38.5F, 4F, 9.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[27].setRotationPoint(35.5F, 4F, 9.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
		bodyModel[28].setRotationPoint(-39.5F, 3F, -9.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[29].setRotationPoint(-39.5F, 3F, 8.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
		bodyModel[30].setRotationPoint(38.5F, 3F, -9.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[31].setRotationPoint(38.5F, 3F, 8.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[32].setRotationPoint(-46.5F, 3F, -1.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[33].setRotationPoint(43.5F, 3F, -1.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 69, 1, 1, 0F); // Box 6
		bodyModel[34].setRotationPoint(-34.5F, 4F, 9.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 79, 1, 1, 0F); // Box 6
		bodyModel[35].setRotationPoint(-39.5F, 3F, -10.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[36].setRotationPoint(-38.5F, 4F, -10.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[37].setRotationPoint(35.5F, 4F, -10.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 69, 1, 1, 0F); // Box 6
		bodyModel[38].setRotationPoint(-34.5F, 4F, -10.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[39].setRotationPoint(4.5F, 3.5F, 10.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[40].setRotationPoint(1F, 3.5F, 10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[41].setRotationPoint(-1.5F, 3.5F, 10.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[42].setRotationPoint(-5F, 3.5F, 10.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[43].setRotationPoint(-25F, 3.5F, 10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[44].setRotationPoint(-8F, 3.5F, 10.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[45].setRotationPoint(-9.5F, 3.5F, 10.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[46].setRotationPoint(-16F, 3.5F, 10.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[47].setRotationPoint(-12.5F, 3.5F, 10.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[48].setRotationPoint(-22F, 3.5F, 10.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[49].setRotationPoint(-18.5F, 3.5F, 10.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[50].setRotationPoint(24F, 3.5F, -11.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[51].setRotationPoint(21F, 3.5F, -11.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[52].setRotationPoint(17.5F, 3.5F, -11.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[53].setRotationPoint(15F, 3.5F, -11.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[54].setRotationPoint(11.5F, 3.5F, -11.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[55].setRotationPoint(8.5F, 3.5F, -11.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[56].setRotationPoint(7F, 3.5F, -11.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[57].setRotationPoint(4F, 3.5F, -11.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[58].setRotationPoint(0.5F, 3.5F, -11.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[59].setRotationPoint(-9F, 3.5F, -11.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[60].setRotationPoint(-2F, 3.5F, -11.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[61].setRotationPoint(39.5F, 0.5F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[62].setRotationPoint(39.5F, 0.5F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[63].setRotationPoint(39.5F, 0.5F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[64].setRotationPoint(39.5F, -2.5F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[65].setRotationPoint(39.5F, -2.5F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[66].setRotationPoint(39.5F, -2.5F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[67].setRotationPoint(39.5F, -5.5F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[68].setRotationPoint(39.5F, -5.5F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[69].setRotationPoint(39.5F, -5.5F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[70].setRotationPoint(39.5F, -8.5F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[71].setRotationPoint(39.5F, -8.5F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[72].setRotationPoint(39.5F, -8.5F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[73].setRotationPoint(39.5F, -11.5F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[74].setRotationPoint(39.5F, -11.5F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[75].setRotationPoint(39.5F, -11.5F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[76].setRotationPoint(39.5F, -14.5F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[77].setRotationPoint(39.5F, -14.5F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[78].setRotationPoint(39.5F, -14.5F, 6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[79].setRotationPoint(39.5F, -17.5F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[80].setRotationPoint(39.5F, -17.5F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[81].setRotationPoint(39.5F, -17.5F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[82].setRotationPoint(39.5F, -20.5F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[83].setRotationPoint(39.5F, -20.5F, -6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[84].setRotationPoint(39.5F, -20.5F, 6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[85].setRotationPoint(39.5F, -23.5F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[86].setRotationPoint(39.5F, -23.5F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[87].setRotationPoint(39.5F, -23.5F, 6F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 1, 19, 0F); // Box 90
		bodyModel[88].setRotationPoint(39F, -25.5F, -9.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[89].setRotationPoint(-40.5F, 1.5F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[90].setRotationPoint(-40.5F, 1.5F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[91].setRotationPoint(-40.5F, 1.5F, 6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[92].setRotationPoint(-40.5F, -1.5F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[93].setRotationPoint(-40.5F, -1.5F, -6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[94].setRotationPoint(-40.5F, -1.5F, 6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[95].setRotationPoint(-40.5F, -4.5F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[96].setRotationPoint(-40.5F, -4.5F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[97].setRotationPoint(-40.5F, -4.5F, 6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[98].setRotationPoint(-40.5F, -7.5F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[99].setRotationPoint(-40.5F, -7.5F, -6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[100].setRotationPoint(-40.5F, -7.5F, 6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[101].setRotationPoint(-40.5F, -10.5F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[102].setRotationPoint(-40.5F, -10.5F, -6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[103].setRotationPoint(-40.5F, -10.5F, 6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[104].setRotationPoint(-40.5F, -13.5F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[105].setRotationPoint(-40.5F, -13.5F, -6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[106].setRotationPoint(-40.5F, -13.5F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[107].setRotationPoint(-40.5F, -16.5F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[108].setRotationPoint(-40.5F, -16.5F, -6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[109].setRotationPoint(-40.5F, -16.5F, 6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[110].setRotationPoint(-40.5F, -19.5F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[111].setRotationPoint(-40.5F, -19.5F, -6F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[112].setRotationPoint(-40.5F, -19.5F, 6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[113].setRotationPoint(-40.5F, -22.5F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[114].setRotationPoint(-40.5F, -22.5F, -6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[115].setRotationPoint(-40.5F, -22.5F, 6F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 19, 0F); // Box 90
		bodyModel[116].setRotationPoint(-40F, -25.5F, -9.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 79, 1, 11, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Roof slopes02
		bodyModel[117].setRotationPoint(-39.5F, -27F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 79, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Roof slopes03
		bodyModel[118].setRotationPoint(-39.5F, -27F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Roof slopes02
		bodyModel[119].setRotationPoint(39.5F, -27F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Roof slopes03
		bodyModel[120].setRotationPoint(39.5F, -27F, 0F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 1, 21, 0F); // Box 56 crossover cull
		bodyModel[121].setRotationPoint(39.51F, 2F, -10.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 0, 9, 21, 0F); // Box 57 cull
		bodyModel[122].setRotationPoint(40.01F, -7F, -10.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 1, 21, 0F); // Box 56 crossover cull
		bodyModel[123].setRotationPoint(-41.51F, 2F, -10.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 0, 9, 21, 0F); // Box 57 cull
		bodyModel[124].setRotationPoint(-40.01F, -7F, -10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[125].setRotationPoint(39.5F, 3F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 214
		bodyModel[126].setRotationPoint(40.5F, 4.5F, -9F);

		bodyModel[127].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 215
		bodyModel[127].setRotationPoint(40.5F, 4.5F, -10F);

		bodyModel[128].addBox(-9F, 0F, 0F, 9, 1, 0, 0F); // Box 216
		bodyModel[128].setRotationPoint(45F, 4.5F, -0.5F);
		bodyModel[128].rotateAngleY = 1.04719755F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[129].setRotationPoint(-40.5F, 3.5F, 5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 210
		bodyModel[130].setRotationPoint(-40.5F, 5F, 5F);

		bodyModel[131].addBox(0F, 0F, 0F, 9, 1, 0, 0F); // Box 80
		bodyModel[131].setRotationPoint(-45F, 5F, 0.5F);
		bodyModel[131].rotateAngleY = 1.04719755F;

		bodyModel[132].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 212
		bodyModel[132].setRotationPoint(-40.5F, 5F, 9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[133].setRotationPoint(-41.25F, -5F, 2F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[134].setRotationPoint(-41.25F, -3.5F, 3.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		bodyModel[135].setRotationPoint(-40.49F, -5F, 2.5F);

		bodyModel[136].addFlexTrapezoid(0F, 0F, 0F, 1, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 132
		bodyModel[136].setRotationPoint(-40.99F, -2.5F, 4F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 140
		bodyModel[137].setRotationPoint(-1F, 6F, -1F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[138].setRotationPoint(-9F, 3F, -9.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[139].setRotationPoint(8F, 3F, -9.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[140].setRotationPoint(-9F, 3F, 2.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[141].setRotationPoint(8F, 3F, 2.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[142].setRotationPoint(19F, 3F, -9.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[143].setRotationPoint(19F, 3F, 2.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[144].setRotationPoint(-20F, 3F, -9.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[145].setRotationPoint(-20F, 3F, 2.5F);

		bodyModel[146].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[146].setRotationPoint(-19F, 4.5F, -7.5F);
		bodyModel[146].rotateAngleX = -0.78539816F;

		bodyModel[147].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[147].setRotationPoint(-17F, 4.5F, -7.5F);
		bodyModel[147].rotateAngleX = -0.78539816F;

		bodyModel[148].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 302
		bodyModel[148].setRotationPoint(-18F, 3F, -8.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[149].setRotationPoint(-11.5F, 6F, -9.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 318
		bodyModel[150].setRotationPoint(-12.5F, 4F, -9.5F);

		bodyModel[151].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[151].setRotationPoint(-15F, 5F, 4F);
		bodyModel[151].rotateAngleX = -0.78539816F;

		bodyModel[152].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[152].setRotationPoint(-17F, 5F, 4F);
		bodyModel[152].rotateAngleX = -0.78539816F;

		bodyModel[153].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		bodyModel[153].setRotationPoint(-15.5F, 3F, 3F);

		bodyModel[154].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[154].setRotationPoint(-17.5F, 5.51F, 0F);
		bodyModel[154].rotateAngleY = -0.05235988F;

		bodyModel[155].addBox(-0.5F, 0F, -2F, 1, 0, 6, 0F); // Box 122
		bodyModel[155].setRotationPoint(-11F, 5.51F, 0F);
		bodyModel[155].rotateAngleY = -0.10471976F;

		bodyModel[156].addBox(-0.5F, 0F, 0F, 1, 0, 39, 0F); // Box 124
		bodyModel[156].setRotationPoint(-11F, 5.51F, 3F);
		bodyModel[156].rotateAngleY = -1.57079633F;

		bodyModel[157].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 126
		bodyModel[157].setRotationPoint(-13F, 4.75F, -2.25F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 26, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[158].setRotationPoint(-41F, 3.5F, 4F);
		bodyModel[158].rotateAngleZ = -0.01745329F;

		bodyModel[159].addBox(-0.5F, 0F, 0F, 1, 0, 7, 0F); // Box 124
		bodyModel[159].setRotationPoint(-18F, 5.51F, 0.5F);
		bodyModel[159].rotateAngleY = -1.57079633F;

		bodyModel[160].addBox(-0.5F, 0F, 0F, 1, 0, 12, 0F); // Box 124
		bodyModel[160].setRotationPoint(-29.5F, 5.51F, -3.5F);
		bodyModel[160].rotateAngleY = -1.57079633F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[161].setRotationPoint(19F, 5F, -4.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[162].setRotationPoint(-2F, 5F, -2.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 79, 1, 1, 0F); // Box 168
		bodyModel[163].setRotationPoint(-39.5F, 3F, -11F);

		bodyModel[164].addBox(0F, 0F, 0F, 79, 1, 1, 0F); // Box 168
		bodyModel[164].setRotationPoint(-39.5F, 3F, 10F);

		bodyModel[165].addBox(0F, 0F, 0F, 45, 1, 1, 0F); // Box 168
		bodyModel[165].setRotationPoint(-22.5F, 4F, 10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[166].setRotationPoint(22.5F, 4F, 10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 168
		bodyModel[167].setRotationPoint(-28.5F, 4F, 10F);

		bodyModel[168].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[168].setRotationPoint(-31.5F, 5F, -2F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[169].setRotationPoint(27.5F, 5F, -2F);

		bodyModel[170].addBox(0F, 0F, 0F, 45, 1, 1, 0F); // Box 168
		bodyModel[170].setRotationPoint(-22.5F, 4F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[171].setRotationPoint(22.5F, 4F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 168
		bodyModel[172].setRotationPoint(-28.5F, 4F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[173].setRotationPoint(8F, 5F, -4.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[174].setRotationPoint(-9F, 5F, -4.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[175].setRotationPoint(-20F, 5F, -4.5F);
	}
	Model70TonTruck2 bogie2 = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 176; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==3456){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.825,-0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.825,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
	public float[] getTrans() { return new float[]{0F, 0.15F, 0F}; }
}