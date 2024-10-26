//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.05.2021 - 12:23:10
// Last changed on: 23.05.2021 - 12:23:10

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

public class ModelACFRailboxCushioned extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelACFRailboxCushioned() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[161];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, -2, 173, textureX, textureY); // Box 176
		bodyModel[1] = new ModelRendererTurbo(this, 204, 167, textureX, textureY); // Box 180
		bodyModel[2] = new ModelRendererTurbo(this, 205, 174, textureX, textureY); // Box 181
		bodyModel[3] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 29, 102, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 16, 24, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 16, 11, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 186, 22, textureX, textureY); // Roof slopes02
		bodyModel[9] = new ModelRendererTurbo(this, 2, 22, textureX, textureY); // Roof slopes03
		bodyModel[10] = new ModelRendererTurbo(this, 186, 9, textureX, textureY); // Roof slopes02
		bodyModel[11] = new ModelRendererTurbo(this, 2, 9, textureX, textureY); // Roof slopes03
		bodyModel[12] = new ModelRendererTurbo(this, 259, 16, textureX, textureY); // Box 6
		bodyModel[13] = new ModelRendererTurbo(this, 215, 16, textureX, textureY); // Box 6
		bodyModel[14] = new ModelRendererTurbo(this, 92, 102, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 115, 102, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 123, 67, textureX, textureY); // Box 8
		bodyModel[17] = new ModelRendererTurbo(this, 115, 68, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 90, 68, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 123, 102, textureX, textureY); // Box 8
		bodyModel[20] = new ModelRendererTurbo(this, 251, 67, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 27, 68, textureX, textureY); // Box 8
		bodyModel[22] = new ModelRendererTurbo(this, 191, 102, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 180, 167, textureX, textureY,"cull"); // Stirrup Cull
		bodyModel[24] = new ModelRendererTurbo(this, 191, 174, textureX, textureY,"cull"); // Stirrup Cull
		bodyModel[25] = new ModelRendererTurbo(this, 180, 174, textureX, textureY,"cull"); // Stirrup Cull
		bodyModel[26] = new ModelRendererTurbo(this, 191, 167, textureX, textureY,"cull"); // Stirrup Cull
		bodyModel[27] = new ModelRendererTurbo(this, 9, 37, textureX, textureY); // Box 16
		bodyModel[28] = new ModelRendererTurbo(this, 185, 102, textureX, textureY); // Box 23
		bodyModel[29] = new ModelRendererTurbo(this, 185, 67, textureX, textureY); // Box 23
		bodyModel[30] = new ModelRendererTurbo(this, 251, 102, textureX, textureY); // Box 23
		bodyModel[31] = new ModelRendererTurbo(this, 245, 102, textureX, textureY); // Box 23
		bodyModel[32] = new ModelRendererTurbo(this, 245, 67, textureX, textureY); // Box 23
		bodyModel[33] = new ModelRendererTurbo(this, 191, 67, textureX, textureY); // Box 23
		bodyModel[34] = new ModelRendererTurbo(this, 30, 164, textureX, textureY); // Box 75
		bodyModel[35] = new ModelRendererTurbo(this, 49, 168, textureX, textureY); // Box 76
		bodyModel[36] = new ModelRendererTurbo(this, 33, 168, textureX, textureY); // Box 77
		bodyModel[37] = new ModelRendererTurbo(this, 145, 167, textureX, textureY); // Box 77
		bodyModel[38] = new ModelRendererTurbo(this, 30, 157, textureX, textureY); // Box 75
		bodyModel[39] = new ModelRendererTurbo(this, 50, 160, textureX, textureY); // Box 76
		bodyModel[40] = new ModelRendererTurbo(this, 145, 160, textureX, textureY); // Box 77
		bodyModel[41] = new ModelRendererTurbo(this, 33, 160, textureX, textureY); // Box 77
		bodyModel[42] = new ModelRendererTurbo(this, 230, 166, textureX, textureY); // Box 6
		bodyModel[43] = new ModelRendererTurbo(this, 230, 170, textureX, textureY); // Box 6
		bodyModel[44] = new ModelRendererTurbo(this, 230, 158, textureX, textureY); // Box 6
		bodyModel[45] = new ModelRendererTurbo(this, 230, 162, textureX, textureY); // Box 6
		bodyModel[46] = new ModelRendererTurbo(this, 261, 96, textureX, textureY,"cull"); // Box 56 crossover cull
		bodyModel[47] = new ModelRendererTurbo(this, 267, 183, textureX, textureY,"cull"); // Box 57 cull
		bodyModel[48] = new ModelRendererTurbo(this, 5, 225, textureX, textureY,"cull"); // side shid cull
		bodyModel[49] = new ModelRendererTurbo(this, 5, 252, textureX, textureY,"cull"); // side shid cull
		bodyModel[50] = new ModelRendererTurbo(this, 9, 206, textureX, textureY); // Box 137
		bodyModel[51] = new ModelRendererTurbo(this, 9, 206, textureX, textureY); // Box 137
		bodyModel[52] = new ModelRendererTurbo(this, 9, 206, textureX, textureY); // Box 137
		bodyModel[53] = new ModelRendererTurbo(this, 9, 206, textureX, textureY); // Box 137
		bodyModel[54] = new ModelRendererTurbo(this, 191, 192, textureX, textureY); // Box 141
		bodyModel[55] = new ModelRendererTurbo(this, 191, 192, textureX, textureY); // Box 141
		bodyModel[56] = new ModelRendererTurbo(this, 191, 192, textureX, textureY); // Box 141
		bodyModel[57] = new ModelRendererTurbo(this, 191, 192, textureX, textureY); // Box 141
		bodyModel[58] = new ModelRendererTurbo(this, 191, 192, textureX, textureY); // Box 141
		bodyModel[59] = new ModelRendererTurbo(this, 191, 192, textureX, textureY); // Box 141
		bodyModel[60] = new ModelRendererTurbo(this, 272, 65, textureX, textureY); // Box 72
		bodyModel[61] = new ModelRendererTurbo(this, 270, 66, textureX, textureY); // Box 87
		bodyModel[62] = new ModelRendererTurbo(this, 262, 67, textureX, textureY); // Box 87
		bodyModel[63] = new ModelRendererTurbo(this, 263, 76, textureX, textureY); // Box 132
		bodyModel[64] = new ModelRendererTurbo(this, 236, 208, textureX, textureY,"cull"); // Box 209 cull cutbar holder
		bodyModel[65] = new ModelRendererTurbo(this, 236, 213, textureX, textureY); // Box 215
		bodyModel[66] = new ModelRendererTurbo(this, 282, 209, textureX, textureY,"cull"); // Box 209 cull cutbar holder
		bodyModel[67] = new ModelRendererTurbo(this, 283, 213, textureX, textureY); // Box 215
		bodyModel[68] = new ModelRendererTurbo(this, 28, 129, textureX, textureY); // Box 6
		bodyModel[69] = new ModelRendererTurbo(this, 66, 129, textureX, textureY); // Box 6
		bodyModel[70] = new ModelRendererTurbo(this, 203, 102, textureX, textureY); // Box 23
		bodyModel[71] = new ModelRendererTurbo(this, 209, 102, textureX, textureY); // Box 23
		bodyModel[72] = new ModelRendererTurbo(this, 215, 102, textureX, textureY); // Box 23
		bodyModel[73] = new ModelRendererTurbo(this, 197, 102, textureX, textureY); // Box 23
		bodyModel[74] = new ModelRendererTurbo(this, 233, 67, textureX, textureY); // Box 23
		bodyModel[75] = new ModelRendererTurbo(this, 227, 67, textureX, textureY); // Box 23
		bodyModel[76] = new ModelRendererTurbo(this, 221, 67, textureX, textureY); // Box 23
		bodyModel[77] = new ModelRendererTurbo(this, 239, 67, textureX, textureY); // Box 23
		bodyModel[78] = new ModelRendererTurbo(this, 233, 102, textureX, textureY); // Box 23
		bodyModel[79] = new ModelRendererTurbo(this, 227, 102, textureX, textureY); // Box 23
		bodyModel[80] = new ModelRendererTurbo(this, 221, 102, textureX, textureY); // Box 23
		bodyModel[81] = new ModelRendererTurbo(this, 239, 102, textureX, textureY); // Box 23
		bodyModel[82] = new ModelRendererTurbo(this, 203, 67, textureX, textureY); // Box 23
		bodyModel[83] = new ModelRendererTurbo(this, 209, 67, textureX, textureY); // Box 23
		bodyModel[84] = new ModelRendererTurbo(this, 197, 67, textureX, textureY); // Box 23
		bodyModel[85] = new ModelRendererTurbo(this, 215, 67, textureX, textureY); // Box 23
		bodyModel[86] = new ModelRendererTurbo(this, 358, 51, textureX, textureY); // Box 60
		bodyModel[87] = new ModelRendererTurbo(this, 358, 4, textureX, textureY); // Box 60
		bodyModel[88] = new ModelRendererTurbo(this, 358, 120, textureX, textureY); // Box 60
		bodyModel[89] = new ModelRendererTurbo(this, 358, 97, textureX, textureY); // Box 60
		bodyModel[90] = new ModelRendererTurbo(this, 358, 74, textureX, textureY); // Box 60
		bodyModel[91] = new ModelRendererTurbo(this, 358, 28, textureX, textureY); // Box 60
		bodyModel[92] = new ModelRendererTurbo(this, 313, 51, textureX, textureY); // Box 60
		bodyModel[93] = new ModelRendererTurbo(this, 313, 4, textureX, textureY); // Box 60
		bodyModel[94] = new ModelRendererTurbo(this, 313, 120, textureX, textureY); // Box 60
		bodyModel[95] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 60
		bodyModel[96] = new ModelRendererTurbo(this, 313, 74, textureX, textureY); // Box 60
		bodyModel[97] = new ModelRendererTurbo(this, 313, 28, textureX, textureY); // Box 60
		bodyModel[98] = new ModelRendererTurbo(this, 261, 80, textureX, textureY,"cull"); // Box 56 crossover cull
		bodyModel[99] = new ModelRendererTurbo(this, 28, 208, textureX, textureY); // Box 219
		bodyModel[100] = new ModelRendererTurbo(this, 281, 173, textureX, textureY,"cull"); // Box 57 cull
		bodyModel[101] = new ModelRendererTurbo(this, 236, 173, textureX, textureY); // Box 144
		bodyModel[102] = new ModelRendererTurbo(this, 290, 183, textureX, textureY); // Box 146
		bodyModel[103] = new ModelRendererTurbo(this, 308, 153, textureX, textureY); // Box 147
		bodyModel[104] = new ModelRendererTurbo(this, 308, 153, textureX, textureY); // Box 147
		bodyModel[105] = new ModelRendererTurbo(this, 2, 195, textureX, textureY); // Box 178
		bodyModel[106] = new ModelRendererTurbo(this, 193, 196, textureX, textureY); // Box 179
		bodyModel[107] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Box 177
		bodyModel[108] = new ModelRendererTurbo(this, 241, 213, textureX, textureY); // Box 216
		bodyModel[109] = new ModelRendererTurbo(this, 288, 213, textureX, textureY); // Box 216
		bodyModel[110] = new ModelRendererTurbo(this, 92, 213, textureX, textureY); // Box 125
		bodyModel[111] = new ModelRendererTurbo(this, 179, 233, textureX, textureY); // Box 286 BN/MP air resivor
		bodyModel[112] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Box 287 BN/MP air resivor
		bodyModel[113] = new ModelRendererTurbo(this, 189, 233, textureX, textureY); // Box 302 BN/MP air resivor
		bodyModel[114] = new ModelRendererTurbo(this, 48, 218, textureX, textureY); // Box 118
		bodyModel[115] = new ModelRendererTurbo(this, 60, 218, textureX, textureY); // Box 119
		bodyModel[116] = new ModelRendererTurbo(this, 48, 212, textureX, textureY); // Box 129
		bodyModel[117] = new ModelRendererTurbo(this, 73, 213, textureX, textureY); // Box 317
		bodyModel[118] = new ModelRendererTurbo(this, 84, 218, textureX, textureY); // Box 318
		bodyModel[119] = new ModelRendererTurbo(this, 73, 219, textureX, textureY); // Box 317
		bodyModel[120] = new ModelRendererTurbo(this, 278, 127, textureX, textureY); // Box 174 door right
		bodyModel[121] = new ModelRendererTurbo(this, 231, 128, textureX, textureY); // Box 175 door right
		bodyModel[122] = new ModelRendererTurbo(this, 250, 144, textureX, textureY); // Box 178 door right
		bodyModel[123] = new ModelRendererTurbo(this, 237, 134, textureX, textureY); // Box 179 door right
		bodyModel[124] = new ModelRendererTurbo(this, 236, 154, textureX, textureY); // Box 180 door right
		bodyModel[125] = new ModelRendererTurbo(this, 238, 147, textureX, textureY); // Box 181 door right
		bodyModel[126] = new ModelRendererTurbo(this, 243, 137, textureX, textureY); // Box 182 door right
		bodyModel[127] = new ModelRendererTurbo(this, 274, 128, textureX, textureY); // Box 183 door right
		bodyModel[128] = new ModelRendererTurbo(this, 270, 128, textureX, textureY); // Box 184 door right
		bodyModel[129] = new ModelRendererTurbo(this, 142, 129, textureX, textureY); // Box 85 door right
		bodyModel[130] = new ModelRendererTurbo(this, 283, 130, textureX, textureY); // Box 179 door right
		bodyModel[131] = new ModelRendererTurbo(this, 237, 128, textureX, textureY); // Box 179 door right
		bodyModel[132] = new ModelRendererTurbo(this, 225, 128, textureX, textureY); // Box 174 door right
		bodyModel[133] = new ModelRendererTurbo(this, 180, 128, textureX, textureY); // Box 175 door right
		bodyModel[134] = new ModelRendererTurbo(this, 199, 144, textureX, textureY); // Box 178 door right
		bodyModel[135] = new ModelRendererTurbo(this, 185, 135, textureX, textureY); // Box 179 door right
		bodyModel[136] = new ModelRendererTurbo(this, 186, 154, textureX, textureY); // Box 180 door right
		bodyModel[137] = new ModelRendererTurbo(this, 187, 147, textureX, textureY); // Box 181 door right
		bodyModel[138] = new ModelRendererTurbo(this, 191, 138, textureX, textureY); // Box 182 door right
		bodyModel[139] = new ModelRendererTurbo(this, 221, 129, textureX, textureY); // Box 183 door right
		bodyModel[140] = new ModelRendererTurbo(this, 218, 129, textureX, textureY); // Box 184 door right
		bodyModel[141] = new ModelRendererTurbo(this, 104, 129, textureX, textureY); // Box 85 door right
		bodyModel[142] = new ModelRendererTurbo(this, 239, 142, textureX, textureY); // Box 185 door right handle
		bodyModel[143] = new ModelRendererTurbo(this, 185, 132, textureX, textureY); // Box 179 door right
		bodyModel[144] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 179 door right
		bodyModel[145] = new ModelRendererTurbo(this, 188, 142, textureX, textureY); // Box 185 door right handle
		bodyModel[146] = new ModelRendererTurbo(this, 237, 131, textureX, textureY); // Box 179 door right
		bodyModel[147] = new ModelRendererTurbo(this, 283, 128, textureX, textureY); // Box 179 door right
		bodyModel[148] = new ModelRendererTurbo(this, 283, 130, textureX, textureY); // Box 179 door right
		bodyModel[149] = new ModelRendererTurbo(this, 283, 128, textureX, textureY); // Box 179 door right
		bodyModel[150] = new ModelRendererTurbo(this, 184, 226, textureX, textureY); // Box 76
		bodyModel[151] = new ModelRendererTurbo(this, 280, 225, textureX, textureY); // Box 77 thic bn sill
		bodyModel[152] = new ModelRendererTurbo(this, 168, 225, textureX, textureY); // Box 77 thic bn sill
		bodyModel[153] = new ModelRendererTurbo(this, 280, 221, textureX, textureY); // Box 77 thic bn sill
		bodyModel[154] = new ModelRendererTurbo(this, 184, 222, textureX, textureY); // Box 76 thic bn sill
		bodyModel[155] = new ModelRendererTurbo(this, 168, 221, textureX, textureY); // Box 77 thic bn sill
		bodyModel[156] = new ModelRendererTurbo(this, 296, 219, textureX, textureY,"cull"); // Box 164 cull sus BN/MP tackboard
		bodyModel[157] = new ModelRendererTurbo(this, 296, 224, textureX, textureY,"cull"); // Box 164 cull sus BN/MP tackboard
		bodyModel[158] = new ModelRendererTurbo(this, 36, 218, textureX, textureY); // Box 286
		bodyModel[159] = new ModelRendererTurbo(this, 26, 219, textureX, textureY); // Box 287
		bodyModel[160] = new ModelRendererTurbo(this, 36, 213, textureX, textureY); // Box 302

		bodyModel[0].addBox(0F, 0F, 0F, 77, 1, 19, 0F); // Box 176
		bodyModel[0].setRotationPoint(-38.5F, 2F, -9.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 180
		bodyModel[1].setRotationPoint(-31.5F, 5F, -2F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 181
		bodyModel[2].setRotationPoint(27.5F, 5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 81, 1, 1, 0F); // Box 7
		bodyModel[3].setRotationPoint(-40.5F, -20.51F, 10F);

		bodyModel[4].addBox(0F, 0F, 0F, 29, 23, 1, 0F); // Box 8
		bodyModel[4].setRotationPoint(-39.5F, -20F, -10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 79, 1, 11, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(-39.5F, -22F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 81, 1, 1, 0F); // Box 7
		bodyModel[6].setRotationPoint(-40.5F, -20.51F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 79, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-39.5F, -22F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 0, 11, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Roof slopes02
		bodyModel[8].setRotationPoint(-40F, -22F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 0, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Roof slopes03
		bodyModel[9].setRotationPoint(-40F, -22F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 0, 11, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Roof slopes02
		bodyModel[10].setRotationPoint(39.5F, -22F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 0, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Roof slopes03
		bodyModel[11].setRotationPoint(39.5F, -22F, 0F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 24, 20, 0F); // Box 6
		bodyModel[12].setRotationPoint(-39.5F, -21F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 24, 20, 0F); // Box 6
		bodyModel[13].setRotationPoint(38.5F, -21F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 21
		bodyModel[14].setRotationPoint(-10.5F, -20F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 23, 1, 0F); // Box 21
		bodyModel[15].setRotationPoint(8.5F, -20F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 29, 23, 1, 0F); // Box 8
		bodyModel[16].setRotationPoint(-39.5F, -20F, 9.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 23, 1, 0F); // Box 21
		bodyModel[17].setRotationPoint(-10.5F, -20F, 10F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 23, 1, 0F); // Box 21
		bodyModel[18].setRotationPoint(8.5F, -20F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 29, 23, 1, 0F); // Box 8
		bodyModel[19].setRotationPoint(10.5F, -20F, -10.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[20].setRotationPoint(-40.5F, -20F, 10F);

		bodyModel[21].addBox(0F, 0F, 0F, 29, 23, 1, 0F); // Box 8
		bodyModel[21].setRotationPoint(10.5F, -20F, 9.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[22].setRotationPoint(-35.5F, -20F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Stirrup Cull
		bodyModel[23].setRotationPoint(36F, 2.99F, 9.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Stirrup Cull
		bodyModel[24].setRotationPoint(36F, 2.99F, -10.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Stirrup Cull
		bodyModel[25].setRotationPoint(-39F, 2.99F, -10.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Stirrup Cull
		bodyModel[26].setRotationPoint(-39F, 2.99F, 9.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 77, 2, 20, 0F); // Box 16
		bodyModel[27].setRotationPoint(-38.5F, -21F, -10F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[28].setRotationPoint(-40.5F, -20F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[29].setRotationPoint(39.5F, -20F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[30].setRotationPoint(39.5F, -20F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[31].setRotationPoint(34.5F, -20F, -11F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[32].setRotationPoint(-35.5F, -20F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[33].setRotationPoint(34.5F, -20F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		bodyModel[34].setRotationPoint(-33F, 3F, 9.49F);

		bodyModel[35].addBox(0F, 0F, 0F, 46, 1, 1, 0F); // Box 76
		bodyModel[35].setRotationPoint(-23F, 4F, 9.49F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[36].setRotationPoint(23F, 4F, 9.49F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 77
		bodyModel[37].setRotationPoint(-29F, 4F, 9.49F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		bodyModel[38].setRotationPoint(-33F, 3F, -10.49F);

		bodyModel[39].addBox(0F, 0F, 0F, 46, 1, 1, 0F); // Box 76
		bodyModel[39].setRotationPoint(-23F, 4F, -10.49F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[40].setRotationPoint(23F, 4F, -10.49F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 77
		bodyModel[41].setRotationPoint(-29F, 4F, -10.49F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[42].setRotationPoint(-25.5F, -20.5F, 10.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[43].setRotationPoint(-25.5F, 2.51F, 10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[44].setRotationPoint(-9.5F, -20.5F, -11.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[45].setRotationPoint(-9.5F, 2.51F, -11.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 1, 13, 0F); // Box 56 crossover cull
		bodyModel[46].setRotationPoint(39.51F, 2F, -6.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 3, 4, 0F); // Box 57 cull
		bodyModel[47].setRotationPoint(-40.01F, -3F, -6F);

		bodyModel[48].addBox(0F, 0F, 0F, 80, 23, 0, 0F); // side shid cull
		bodyModel[48].setRotationPoint(-40F, -20F, 11.01F);

		bodyModel[49].addBox(0F, 0F, 0F, 80, 23, 0, 0F); // side shid cull
		bodyModel[49].setRotationPoint(-40F, -20F, -11.01F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[50].setRotationPoint(27F, 3F, -9.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[51].setRotationPoint(-32F, 3F, -9.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 137
		bodyModel[52].setRotationPoint(-32F, 3F, 2.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 137
		bodyModel[53].setRotationPoint(27F, 3F, 2.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 2, 19, 0F); // Box 141
		bodyModel[54].setRotationPoint(-4F, 2.99F, -9.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 19, 0F); // Box 141
		bodyModel[55].setRotationPoint(3F, 2.99F, -9.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 2, 19, 0F); // Box 141
		bodyModel[56].setRotationPoint(-19F, 2.99F, -9.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 19, 0F); // Box 141
		bodyModel[57].setRotationPoint(18F, 2.99F, -9.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 2, 19, 0F); // Box 141
		bodyModel[58].setRotationPoint(-11F, 2.99F, -9.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 2, 19, 0F); // Box 141
		bodyModel[59].setRotationPoint(11F, 2.99F, -9.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[60].setRotationPoint(-42.01F, -5F, 2F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[61].setRotationPoint(-42F, -3.5F, 3.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		bodyModel[62].setRotationPoint(-41.01F, -5F, 2.5F);

		bodyModel[63].addFlexTrapezoid(0F, 0F, 0F, 1, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 132
		bodyModel[63].setRotationPoint(-41.99F, -2.5F, 4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[64].setRotationPoint(-40.51F, 3F, 9F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 215
		bodyModel[65].setRotationPoint(-40.5F, 4.5F, 9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[66].setRotationPoint(39.51F, 3F, -10F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 215
		bodyModel[67].setRotationPoint(40.5F, 4.5F, -10F);

		bodyModel[68].addBox(0F, 0F, 0F, 17, 23, 1, 0F); // Box 6
		bodyModel[68].setRotationPoint(-8.5F, -19.5F, 10F);

		bodyModel[69].addBox(0F, 0F, 0F, 17, 23, 1, 0F); // Box 6
		bodyModel[69].setRotationPoint(-8.5F, -19.5F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[70].setRotationPoint(-25.5F, -20F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[71].setRotationPoint(-20.5F, -20F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[72].setRotationPoint(-15.5F, -20F, -11F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[73].setRotationPoint(-30.5F, -20F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[74].setRotationPoint(-25.5F, -20F, 10F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[75].setRotationPoint(-20.5F, -20F, 10F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[76].setRotationPoint(-15.5F, -20F, 10F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[77].setRotationPoint(-30.5F, -20F, 10F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[78].setRotationPoint(24.5F, -20F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[79].setRotationPoint(19.5F, -20F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[80].setRotationPoint(14.5F, -20F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[81].setRotationPoint(29.5F, -20F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[82].setRotationPoint(24.5F, -20F, 10F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[83].setRotationPoint(19.5F, -20F, 10F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[84].setRotationPoint(29.5F, -20F, 10F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 23
		bodyModel[85].setRotationPoint(14.5F, -20F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[86].setRotationPoint(39.5F, -10.9F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[87].setRotationPoint(39.5F, -18.5F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[88].setRotationPoint(39.5F, 0.5F, -10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[89].setRotationPoint(39.5F, -3.3F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[90].setRotationPoint(39.5F, -7.1F, -10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[91].setRotationPoint(39.5F, -14.7F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[92].setRotationPoint(-40.5F, -10.9F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[93].setRotationPoint(-40.5F, -18.5F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[94].setRotationPoint(-40.5F, 0.5F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[95].setRotationPoint(-40.5F, -3.3F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[96].setRotationPoint(-40.5F, -7.1F, -10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[97].setRotationPoint(-40.5F, -14.7F, -10F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 1, 13, 0F); // Box 56 crossover cull
		bodyModel[98].setRotationPoint(-42.51F, 2F, -6.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 219
		bodyModel[99].setRotationPoint(-28F, 5.5F, 0F);

		bodyModel[100].addBox(0F, 0F, 0F, 0, 11, 22, 0F); // Box 57 cull
		bodyModel[100].setRotationPoint(-40.51F, -8F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 0, 11, 22, 0F); // Box 144
		bodyModel[101].setRotationPoint(40.51F, -8F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 0, 3, 4, 0F); // Box 146
		bodyModel[102].setRotationPoint(40.01F, -3F, 2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 5, 21, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 147
		bodyModel[103].setRotationPoint(28F, 3F, -10.5F);

		bodyModel[104].addShapeBox(1F, 0F, 0F, 3, 5, 21, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 147
		bodyModel[104].setRotationPoint(-30F, 3F, -10.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 178
		bodyModel[105].setRotationPoint(-46.5F, 3F, -1.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 179
		bodyModel[106].setRotationPoint(43.5F, 3F, -1.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 87, 2, 5, 0F); // Box 177
		bodyModel[107].setRotationPoint(-43.5F, 3F, -2.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 11, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 216
		bodyModel[108].setRotationPoint(40.4F, 4.5F, -9.5F);
		bodyModel[108].rotateAngleY = 1.08210414F;

		bodyModel[109].addShapeBox(-11F, 0F, 0F, 11, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 216
		bodyModel[109].setRotationPoint(-40.4F, 4.5F, 9.5F);
		bodyModel[109].rotateAngleY = 1.08210414F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 40, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[110].setRotationPoint(-41F, 3.5F, 4F);
		bodyModel[110].rotateAngleZ = -0.01745329F;

		bodyModel[111].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286 BN/MP air resivor
		bodyModel[111].setRotationPoint(-2F, 5.5F, -5.5F);
		bodyModel[111].rotateAngleX = -0.78539816F;
		bodyModel[111].rotateAngleY = -0.01745329F;

		bodyModel[112].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287 BN/MP air resivor
		bodyModel[112].setRotationPoint(0F, 5.5F, -5.5F);
		bodyModel[112].rotateAngleX = -0.78539816F;
		bodyModel[112].rotateAngleY = -0.01745329F;

		bodyModel[113].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 302 BN/MP air resivor
		bodyModel[113].setRotationPoint(-1F, 3F, -4.5F);
		bodyModel[113].rotateAngleY = -1.57079633F;

		bodyModel[114].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[114].setRotationPoint(-1F, 5F, 4F);
		bodyModel[114].rotateAngleX = -0.78539816F;

		bodyModel[115].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[115].setRotationPoint(-3F, 5F, 4F);
		bodyModel[115].rotateAngleX = -0.78539816F;

		bodyModel[116].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		bodyModel[116].setRotationPoint(-1.5F, 3F, 3F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[117].setRotationPoint(13.5F, 3F, -9.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 318
		bodyModel[118].setRotationPoint(12.5F, 4F, -9.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[119].setRotationPoint(13.5F, 6F, -9.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 174 door right
		bodyModel[120].setRotationPoint(7.5F, -19.5F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 175 door right
		bodyModel[121].setRotationPoint(-8.5F, -19.5F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 178 door right
		bodyModel[122].setRotationPoint(-1F, -13F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 179 door right
		bodyModel[123].setRotationPoint(-7.5F, -6F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 180 door right
		bodyModel[124].setRotationPoint(-7.5F, 2.5F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 181 door right
		bodyModel[125].setRotationPoint(-2F, -5F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 182 door right
		bodyModel[126].setRotationPoint(-5F, -3.5F, -10.99F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 23, 0, 0F); // Box 183 door right
		bodyModel[127].setRotationPoint(5F, -19.5F, -11.02F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 23, 0, 0F); // Box 184 door right
		bodyModel[128].setRotationPoint(-6F, -19.5F, -11.02F);

		bodyModel[129].addBox(0F, 0F, 0F, 17, 23, 1, 0F); // Box 85 door right
		bodyModel[129].setRotationPoint(-8.5F, -19.5F, -10.75F);

		bodyModel[130].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Box 179 door right
		bodyModel[130].setRotationPoint(-7.5F, 0.5F, 11.01F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 179 door right
		bodyModel[131].setRotationPoint(-7.5F, -19.5F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174 door right
		bodyModel[132].setRotationPoint(-8.5F, -19.5F, 10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175 door right
		bodyModel[133].setRotationPoint(7.5F, -19.5F, 10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178 door right
		bodyModel[134].setRotationPoint(-1F, -13F, 10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[135].setRotationPoint(-7.5F, -6F, 10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180 door right
		bodyModel[136].setRotationPoint(-7.5F, 2.5F, 10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181 door right
		bodyModel[137].setRotationPoint(-2F, -5F, 10F);

		bodyModel[138].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 182 door right
		bodyModel[138].setRotationPoint(-5F, -3.5F, 10.99F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 23, 0, 0F); // Box 183 door right
		bodyModel[139].setRotationPoint(-6F, -19.5F, 11.02F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 23, 0, 0F); // Box 184 door right
		bodyModel[140].setRotationPoint(5F, -19.5F, 11.02F);

		bodyModel[141].addBox(0F, 0F, 0F, 17, 23, 1, 0F); // Box 85 door right
		bodyModel[141].setRotationPoint(-8.5F, -19.5F, 9.75F);

		bodyModel[142].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 185 door right handle
		bodyModel[142].setRotationPoint(0.5F, 0F, -11.01F);
		bodyModel[142].rotateAngleZ = 1.57079633F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[143].setRotationPoint(-7.5F, -14F, 10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[144].setRotationPoint(-7.5F, -19.5F, 10F);

		bodyModel[145].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 185 door right handle
		bodyModel[145].setRotationPoint(-1.5F, 0F, 11.01F);
		bodyModel[145].rotateAngleZ = 1.57079633F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 179 door right
		bodyModel[146].setRotationPoint(-7.5F, -14F, -11F);

		bodyModel[147].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Box 179 door right
		bodyModel[147].setRotationPoint(-7.5F, -8.5F, 11.01F);

		bodyModel[148].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Box 179 door right
		bodyModel[148].setRotationPoint(-7.5F, 0.5F, -11.01F);

		bodyModel[149].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Box 179 door right
		bodyModel[149].setRotationPoint(-7.5F, -8.5F, -11.01F);

		bodyModel[150].addBox(0F, 0F, 0F, 46, 1, 1, 0F); // Box 76
		bodyModel[150].setRotationPoint(-23F, 5F, 9.49F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 77 thic bn sill
		bodyModel[151].setRotationPoint(23F, 4F, 9.49F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 77 thic bn sill
		bodyModel[152].setRotationPoint(-29F, 4F, 9.49F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 77 thic bn sill
		bodyModel[153].setRotationPoint(23F, 4F, -10.49F);

		bodyModel[154].addBox(0F, 0F, 0F, 46, 1, 1, 0F); // Box 76 thic bn sill
		bodyModel[154].setRotationPoint(-23F, 5F, -10.49F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 77 thic bn sill
		bodyModel[155].setRotationPoint(-29F, 4F, -10.49F);

		bodyModel[156].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 164 cull sus BN/MP tackboard
		bodyModel[156].setRotationPoint(10F, -2F, 10.01F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 164 cull sus BN/MP tackboard
		bodyModel[157].setRotationPoint(-14F, -2F, -11.01F);

		bodyModel[158].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[158].setRotationPoint(21F, 5.5F, -3.5F);
		bodyModel[158].rotateAngleX = -0.78539816F;
		bodyModel[158].rotateAngleY = -1.57079633F;

		bodyModel[159].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[159].setRotationPoint(21F, 5.5F, -5.5F);
		bodyModel[159].rotateAngleX = -0.78539816F;
		bodyModel[159].rotateAngleY = -1.57079633F;

		bodyModel[160].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 302
		bodyModel[160].setRotationPoint(20F, 3F, -4.5F);
		bodyModel[160].rotateAngleY = -1.57079633F;
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 161; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.9,-0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.75,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
	}
}