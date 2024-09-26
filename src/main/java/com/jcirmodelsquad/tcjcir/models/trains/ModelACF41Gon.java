//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.02.2023 - 18:28:28
// Last changed on: 06.02.2023 - 18:28:28

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

public class ModelACF41Gon extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelACF41Gon() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[149];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 24, 15, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 147, 2, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 124, 15, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 2, 14, textureX, textureY); // Box 80
		bodyModel[6] = new ModelRendererTurbo(this, 139, 12, textureX, textureY); // Box 81
		bodyModel[7] = new ModelRendererTurbo(this, 78, 17, textureX, textureY); // Box 286
		bodyModel[8] = new ModelRendererTurbo(this, 85, 17, textureX, textureY); // Box 287
		bodyModel[9] = new ModelRendererTurbo(this, 72, 12, textureX, textureY); // Box 118
		bodyModel[10] = new ModelRendererTurbo(this, 65, 12, textureX, textureY); // Box 119
		bodyModel[11] = new ModelRendererTurbo(this, 81, 27, textureX, textureY); // Box 196
		bodyModel[12] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 199
		bodyModel[13] = new ModelRendererTurbo(this, 84, 30, textureX, textureY); // Box 122
		bodyModel[14] = new ModelRendererTurbo(this, 77, 23, textureX, textureY); // Box 124
		bodyModel[15] = new ModelRendererTurbo(this, 82, 9, textureX, textureY); // Box 126
		bodyModel[16] = new ModelRendererTurbo(this, 55, 36, textureX, textureY); // Box 202
		bodyModel[17] = new ModelRendererTurbo(this, 61, 36, textureX, textureY); // Box 128
		bodyModel[18] = new ModelRendererTurbo(this, 72, 8, textureX, textureY); // Box 129
		bodyModel[19] = new ModelRendererTurbo(this, 84, 12, textureX, textureY); // Box 302
		bodyModel[20] = new ModelRendererTurbo(this, 37, 18, textureX, textureY); // Box 42
		bodyModel[21] = new ModelRendererTurbo(this, 37, 8, textureX, textureY); // Box 215
		bodyModel[22] = new ModelRendererTurbo(this, 105, 18, textureX, textureY); // Box 216
		bodyModel[23] = new ModelRendererTurbo(this, 105, 8, textureX, textureY); // Box 217
		bodyModel[24] = new ModelRendererTurbo(this, 52, 20, textureX, textureY); // Box 42
		bodyModel[25] = new ModelRendererTurbo(this, 52, 10, textureX, textureY); // Box 215
		bodyModel[26] = new ModelRendererTurbo(this, 92, 20, textureX, textureY); // Box 42
		bodyModel[27] = new ModelRendererTurbo(this, 92, 10, textureX, textureY); // Box 215
		bodyModel[28] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 9, 36, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 25, 109, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 11, 29, textureX, textureY); // Box 72
		bodyModel[32] = new ModelRendererTurbo(this, 13, 36, textureX, textureY); // Box 87
		bodyModel[33] = new ModelRendererTurbo(this, 8, 45, textureX, textureY); // Box 87
		bodyModel[34] = new ModelRendererTurbo(this, 12, 39, textureX, textureY); // Box 87
		bodyModel[35] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 159, 52, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 40, 69, textureX, textureY); // Box 34
		bodyModel[38] = new ModelRendererTurbo(this, 40, 56, textureX, textureY); // Box 34
		bodyModel[39] = new ModelRendererTurbo(this, 159, 32, textureX, textureY); // Box 186
		bodyModel[40] = new ModelRendererTurbo(this, 172, 47, textureX, textureY); // Box 187
		bodyModel[41] = new ModelRendererTurbo(this, 180, 47, textureX, textureY); // Box 188
		bodyModel[42] = new ModelRendererTurbo(this, 159, 32, textureX, textureY); // Box 186
		bodyModel[43] = new ModelRendererTurbo(this, 159, 32, textureX, textureY); // Box 186
		bodyModel[44] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 36
		bodyModel[45] = new ModelRendererTurbo(this, 137, 82, textureX, textureY); // Box 36
		bodyModel[46] = new ModelRendererTurbo(this, 40, 95, textureX, textureY); // Box 34
		bodyModel[47] = new ModelRendererTurbo(this, 40, 40, textureX, textureY); // Box 34
		bodyModel[48] = new ModelRendererTurbo(this, 22, 111, textureX, textureY); // Box 34
		bodyModel[49] = new ModelRendererTurbo(this, 14, 111, textureX, textureY); // Box 34
		bodyModel[50] = new ModelRendererTurbo(this, 41, 98, textureX, textureY); // Box 34
		bodyModel[51] = new ModelRendererTurbo(this, 41, 38, textureX, textureY); // Box 34
		bodyModel[52] = new ModelRendererTurbo(this, 172, 111, textureX, textureY); // Box 34
		bodyModel[53] = new ModelRendererTurbo(this, 180, 111, textureX, textureY); // Box 34
		bodyModel[54] = new ModelRendererTurbo(this, 172, 47, textureX, textureY); // Box 187
		bodyModel[55] = new ModelRendererTurbo(this, 180, 47, textureX, textureY); // Box 188
		bodyModel[56] = new ModelRendererTurbo(this, 172, 47, textureX, textureY); // Box 187
		bodyModel[57] = new ModelRendererTurbo(this, 180, 47, textureX, textureY); // Box 188
		bodyModel[58] = new ModelRendererTurbo(this, 159, 32, textureX, textureY); // Box 186
		bodyModel[59] = new ModelRendererTurbo(this, 172, 47, textureX, textureY); // Box 187
		bodyModel[60] = new ModelRendererTurbo(this, 180, 47, textureX, textureY); // Box 188
		bodyModel[61] = new ModelRendererTurbo(this, 159, 106, textureX, textureY); // Box 36
		bodyModel[62] = new ModelRendererTurbo(this, 159, 106, textureX, textureY); // Box 36
		bodyModel[63] = new ModelRendererTurbo(this, 159, 106, textureX, textureY); // Box 36
		bodyModel[64] = new ModelRendererTurbo(this, 159, 106, textureX, textureY); // Box 36
		bodyModel[65] = new ModelRendererTurbo(this, 159, 106, textureX, textureY); // Box 36
		bodyModel[66] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 186
		bodyModel[67] = new ModelRendererTurbo(this, 32, 47, textureX, textureY); // Box 187
		bodyModel[68] = new ModelRendererTurbo(this, 4, 47, textureX, textureY); // Box 188
		bodyModel[69] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 186
		bodyModel[70] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 186
		bodyModel[71] = new ModelRendererTurbo(this, 32, 47, textureX, textureY); // Box 187
		bodyModel[72] = new ModelRendererTurbo(this, 4, 47, textureX, textureY); // Box 188
		bodyModel[73] = new ModelRendererTurbo(this, 32, 47, textureX, textureY); // Box 187
		bodyModel[74] = new ModelRendererTurbo(this, 4, 47, textureX, textureY); // Box 188
		bodyModel[75] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 186
		bodyModel[76] = new ModelRendererTurbo(this, 32, 47, textureX, textureY); // Box 187
		bodyModel[77] = new ModelRendererTurbo(this, 4, 47, textureX, textureY); // Box 188
		bodyModel[78] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 36
		bodyModel[79] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 36
		bodyModel[80] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 36
		bodyModel[81] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 36
		bodyModel[82] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 36
		bodyModel[83] = new ModelRendererTurbo(this, 122, 82, textureX, textureY); // Box 34
		bodyModel[84] = new ModelRendererTurbo(this, 117, 82, textureX, textureY); // Box 34
		bodyModel[85] = new ModelRendererTurbo(this, 112, 82, textureX, textureY); // Box 34
		bodyModel[86] = new ModelRendererTurbo(this, 102, 82, textureX, textureY); // Box 34
		bodyModel[87] = new ModelRendererTurbo(this, 92, 82, textureX, textureY); // Box 34
		bodyModel[88] = new ModelRendererTurbo(this, 87, 82, textureX, textureY); // Box 34
		bodyModel[89] = new ModelRendererTurbo(this, 82, 82, textureX, textureY); // Box 34
		bodyModel[90] = new ModelRendererTurbo(this, 77, 82, textureX, textureY); // Box 34
		bodyModel[91] = new ModelRendererTurbo(this, 72, 82, textureX, textureY); // Box 34
		bodyModel[92] = new ModelRendererTurbo(this, 107, 82, textureX, textureY); // Box 34
		bodyModel[93] = new ModelRendererTurbo(this, 97, 82, textureX, textureY); // Box 34
		bodyModel[94] = new ModelRendererTurbo(this, 9, 3, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 51, 82, textureX, textureY); // Box 34
		bodyModel[97] = new ModelRendererTurbo(this, 139, 82, textureX, textureY); // Box 34
		bodyModel[98] = new ModelRendererTurbo(this, 122, 43, textureX, textureY); // Box 34
		bodyModel[99] = new ModelRendererTurbo(this, 117, 43, textureX, textureY); // Box 34
		bodyModel[100] = new ModelRendererTurbo(this, 112, 43, textureX, textureY); // Box 34
		bodyModel[101] = new ModelRendererTurbo(this, 102, 43, textureX, textureY); // Box 34
		bodyModel[102] = new ModelRendererTurbo(this, 92, 43, textureX, textureY); // Box 34
		bodyModel[103] = new ModelRendererTurbo(this, 87, 43, textureX, textureY); // Box 34
		bodyModel[104] = new ModelRendererTurbo(this, 82, 43, textureX, textureY); // Box 34
		bodyModel[105] = new ModelRendererTurbo(this, 77, 43, textureX, textureY); // Box 34
		bodyModel[106] = new ModelRendererTurbo(this, 72, 43, textureX, textureY); // Box 34
		bodyModel[107] = new ModelRendererTurbo(this, 107, 43, textureX, textureY); // Box 34
		bodyModel[108] = new ModelRendererTurbo(this, 97, 43, textureX, textureY); // Box 34
		bodyModel[109] = new ModelRendererTurbo(this, 51, 52, textureX, textureY); // Box 34
		bodyModel[110] = new ModelRendererTurbo(this, 139, 52, textureX, textureY); // Box 34
		bodyModel[111] = new ModelRendererTurbo(this, 40, 44, textureX, textureY, "cull"); // Box 34 Ladder cull
		bodyModel[112] = new ModelRendererTurbo(this, 148, 82, textureX, textureY, "cull"); // Box 34 Ladder cull
		bodyModel[113] = new ModelRendererTurbo(this, 40, 82, textureX, textureY, "cull"); // Box 34 Ladder cull
		bodyModel[114] = new ModelRendererTurbo(this, 148, 50, textureX, textureY, "cull"); // Box 34 Ladder cull
		bodyModel[115] = new ModelRendererTurbo(this, 1, 135, textureX, textureY); // Box 45 Woodchip walls
		bodyModel[116] = new ModelRendererTurbo(this, 157, 135, textureX, textureY); // Box 45 Woodchip walls
		bodyModel[117] = new ModelRendererTurbo(this, 42, 153, textureX, textureY); // Box 45 Woodchip walls
		bodyModel[118] = new ModelRendererTurbo(this, 42, 137, textureX, textureY); // Box 45 Woodchip walls
		bodyModel[119] = new ModelRendererTurbo(this, 85, 173, textureX, textureY); // Box 46 wall suports
		bodyModel[120] = new ModelRendererTurbo(this, 114, 173, textureX, textureY); // Box 46 wall suports
		bodyModel[121] = new ModelRendererTurbo(this, 90, 173, textureX, textureY); // Box 46 wall suports
		bodyModel[122] = new ModelRendererTurbo(this, 109, 173, textureX, textureY); // Box 46 wall suports
		bodyModel[123] = new ModelRendererTurbo(this, 80, 173, textureX, textureY); // Box 46 wall suports
		bodyModel[124] = new ModelRendererTurbo(this, 104, 173, textureX, textureY); // Box 46 wall suports
		bodyModel[125] = new ModelRendererTurbo(this, 95, 129, textureX, textureY); // Box 45 Woodchip bracing
		bodyModel[126] = new ModelRendererTurbo(this, 95, 173, textureX, textureY); // Box 45 Woodchip bracing
		bodyModel[127] = new ModelRendererTurbo(this, 100, 169, textureX, textureY); // Box 45 Woodchip bracing
		bodyModel[128] = new ModelRendererTurbo(this, 100, 133, textureX, textureY); // Box 45 Woodchip bracing
		bodyModel[129] = new ModelRendererTurbo(this, 40, 169, textureX, textureY); // Box 45 Woodchip bracing
		bodyModel[130] = new ModelRendererTurbo(this, 40, 133, textureX, textureY); // Box 45 Woodchip bracing
		bodyModel[131] = new ModelRendererTurbo(this, 180, 55, textureX, textureY, "cull"); // Box 36 end ladder cull
		bodyModel[132] = new ModelRendererTurbo(this, 164, 59, textureX, textureY, "cull"); // Box 36 end ladder cull
		bodyModel[133] = new ModelRendererTurbo(this, 6, 55, textureX, textureY, "cull"); // Box 36 end ladder cull
		bodyModel[134] = new ModelRendererTurbo(this, 22, 59, textureX, textureY, "cull"); // Box 36 end ladder cull
		bodyModel[135] = new ModelRendererTurbo(this, 165, 135, textureX, textureY, "cull"); // Box 36 woodchip end ladder cull
		bodyModel[136] = new ModelRendererTurbo(this, 179, 138, textureX, textureY, "cull"); // Box 34 Woodchip Ladder cull
		bodyModel[137] = new ModelRendererTurbo(this, 9, 138, textureX, textureY, "cull"); // Box 34 woodchip Ladder cull
		bodyModel[138] = new ModelRendererTurbo(this, 23, 135, textureX, textureY, "cull"); // Box 36 woodchip end ladder cull
		bodyModel[139] = new ModelRendererTurbo(this, 22, 31, textureX, textureY); // Box 40 woodchip brake stuff
		bodyModel[140] = new ModelRendererTurbo(this, 27, 38, textureX, textureY); // Box 40 woodchip brake stuff
		bodyModel[141] = new ModelRendererTurbo(this, 22, 39, textureX, textureY); // Box 40 woodchip brake stuff
		bodyModel[142] = new ModelRendererTurbo(this, 18, 45, textureX, textureY); // Box 40 woodchip brake stuff
		bodyModel[143] = new ModelRendererTurbo(this, 29, 41, textureX, textureY); // Box 40 woodchip brake stuff
		bodyModel[144] = new ModelRendererTurbo(this, 77, 177, textureX, textureY); // Box 46 wire ties
		bodyModel[145] = new ModelRendererTurbo(this, 83, 177, textureX, textureY); // Box 46 wire ties
		bodyModel[146] = new ModelRendererTurbo(this, 80, 177, textureX, textureY); // Box 46 wire ties
		bodyModel[147] = new ModelRendererTurbo(this, 125, 8, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 23, 8, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-21F, 3.75F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[1].setRotationPoint(30F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 52, 1, 5, 0F); // Box 0
		bodyModel[2].setRotationPoint(-26F, 3F, -2.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[3].setRotationPoint(-33F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[4].setRotationPoint(17F, 3.75F, -2F);

		bodyModel[5].addBox(0F, -1F, 0F, 10, 2, 0, 0F); // Box 80
		bodyModel[5].setRotationPoint(-31F, 5F, 1.5F);
		bodyModel[5].rotateAngleY = 1.34390352F;
		bodyModel[5].rotateAngleZ = 0.10471976F;

		bodyModel[6].addBox(-10F, -1F, 0F, 10, 2, 0, 0F); // Box 81
		bodyModel[6].setRotationPoint(31F, 5F, -1.5F);
		bodyModel[6].rotateAngleY = 1.34390352F;
		bodyModel[6].rotateAngleZ = -0.10471976F;

		bodyModel[7].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[7].setRotationPoint(6.5F, 5.5F, -4.5F);
		bodyModel[7].rotateAngleX = -0.78539816F;

		bodyModel[8].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[8].setRotationPoint(8.5F, 5.5F, -4.5F);
		bodyModel[8].rotateAngleX = -0.78539816F;

		bodyModel[9].addShapeBox(0F, -1F, -1F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[9].setRotationPoint(1F, 5F, 4.5F);
		bodyModel[9].rotateAngleX = -0.78539816F;

		bodyModel[10].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 119
		bodyModel[10].setRotationPoint(-1F, 5F, 4.5F);
		bodyModel[10].rotateAngleX = -0.78539816F;

		bodyModel[11].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[11].setRotationPoint(-2.75F, 4.26F, 1F);
		bodyModel[11].rotateAngleY = -0.31415927F;

		bodyModel[12].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[12].setRotationPoint(-3F, 4.25F, 0F);
		bodyModel[12].rotateAngleY = -0.31415927F;

		bodyModel[13].addBox(-0.5F, 0F, -2F, 1, 0, 5, 0F); // Box 122
		bodyModel[13].setRotationPoint(9F, 4.26F, 0F);
		bodyModel[13].rotateAngleY = -0.10471976F;

		bodyModel[14].addBox(-0.5F, 0F, 0F, 1, 0, 12, 0F); // Box 124
		bodyModel[14].setRotationPoint(-3F, 4.26F, 0F);
		bodyModel[14].rotateAngleY = -1.57079633F;

		bodyModel[15].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 126
		bodyModel[15].setRotationPoint(7F, 3.5F, -2.25F);

		bodyModel[16].addBox(-14.5F, -0.75F, -0.5F, 15, 0, 1, 0F); // Box 202
		bodyModel[16].setRotationPoint(-3.75F, 5.01F, -2.5F);
		bodyModel[16].rotateAngleY = -0.08726646F;
		bodyModel[16].rotateAngleZ = 0.03926991F;

		bodyModel[17].addBox(-9.5F, -0.75F, -0.5F, 9, 0, 1, 0F); // Box 128
		bodyModel[17].setRotationPoint(8.5F, 5.01F, 2.5F);
		bodyModel[17].rotateAngleY = -3.2637657F;
		bodyModel[17].rotateAngleZ = 0.06108652F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 129
		bodyModel[18].setRotationPoint(1.5F, 2.75F, 3.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 302
		bodyModel[19].setRotationPoint(7.5F, 3F, -5.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[20].setRotationPoint(-20.5F, 2.8F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 215
		bodyModel[21].setRotationPoint(-20.5F, 2.8F, 2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[22].setRotationPoint(17.5F, 2.8F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 217
		bodyModel[23].setRotationPoint(17.5F, 2.8F, 2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[24].setRotationPoint(-6.5F, 2.8F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 215
		bodyModel[25].setRotationPoint(-6.5F, 2.8F, 2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[26].setRotationPoint(4.5F, 2.8F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 215
		bodyModel[27].setRotationPoint(4.5F, 2.8F, 2F);

		bodyModel[28].addBox(0F, 0F, 0F, 30, 1, 0, 0F); // Box 40
		bodyModel[28].setRotationPoint(-30.5F, 3.5F, 3.51F);
		bodyModel[28].rotateAngleY = 0.03490659F;
		bodyModel[28].rotateAngleZ = -0.00959931F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[29].setRotationPoint(-30.5F, -8.5F, 3.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 56, 1, 18, 0F); // Box 34
		bodyModel[30].setRotationPoint(-28F, 2F, -9F);

		bodyModel[31].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 72
		bodyModel[31].setRotationPoint(-31.01F, -7F, 2F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[32].setRotationPoint(-31F, -6F, 3F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 87
		bodyModel[33].setRotationPoint(-31.5F, 0.5F, 1F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 87
		bodyModel[34].setRotationPoint(-30.5F, -6.5F, 2.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 11, 18, 0F); // Box 36
		bodyModel[35].setRotationPoint(-29F, -8F, -9F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 11, 18, 0F); // Box 36
		bodyModel[36].setRotationPoint(28F, -8F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 58, 11, 1, 0F); // Box 34
		bodyModel[37].setRotationPoint(-29F, -8F, -10F);

		bodyModel[38].addBox(0F, 0F, 0F, 58, 11, 1, 0F); // Box 34
		bodyModel[38].setRotationPoint(-29F, -8F, 9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[39].setRotationPoint(29F, 1F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[40].setRotationPoint(29F, 1F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[41].setRotationPoint(29F, 1F, 9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[42].setRotationPoint(29F, -1.25F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[43].setRotationPoint(29F, -3.5F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 36
		bodyModel[44].setRotationPoint(-30F, -8F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 36
		bodyModel[45].setRotationPoint(29F, -8F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[46].setRotationPoint(-29F, -8F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 34
		bodyModel[47].setRotationPoint(-29F, -8F, 10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 34
		bodyModel[48].setRotationPoint(-30F, -7F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 34
		bodyModel[49].setRotationPoint(-30F, -7F, 9F);

		bodyModel[50].addBox(0F, 0F, 0F, 58, 1, 0, 0F); // Box 34
		bodyModel[50].setRotationPoint(-29F, 3F, -10F);

		bodyModel[51].addBox(0F, 0F, 0F, 58, 1, 0, 0F); // Box 34
		bodyModel[51].setRotationPoint(-29F, 3F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[52].setRotationPoint(29F, -7F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[53].setRotationPoint(29F, -7F, 9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[54].setRotationPoint(29F, -1.25F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[55].setRotationPoint(29F, -1.25F, 9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[56].setRotationPoint(29F, -3.5F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[57].setRotationPoint(29F, -3.5F, 9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[58].setRotationPoint(29F, -5.75F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[59].setRotationPoint(29F, -5.75F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[60].setRotationPoint(29F, -5.75F, 9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[61].setRotationPoint(29F, -6F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[62].setRotationPoint(29F, -4F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[63].setRotationPoint(29F, -2F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[64].setRotationPoint(29F, 0F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[65].setRotationPoint(29F, 2F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 186
		bodyModel[66].setRotationPoint(-30F, 1F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 187
		bodyModel[67].setRotationPoint(-30F, 1F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 188
		bodyModel[68].setRotationPoint(-30F, 1F, 9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 186
		bodyModel[69].setRotationPoint(-30F, -1.25F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 186
		bodyModel[70].setRotationPoint(-30F, -3.5F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 187
		bodyModel[71].setRotationPoint(-30F, -1.25F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 188
		bodyModel[72].setRotationPoint(-30F, -1.25F, 9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 187
		bodyModel[73].setRotationPoint(-30F, -3.5F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 188
		bodyModel[74].setRotationPoint(-30F, -3.5F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 186
		bodyModel[75].setRotationPoint(-30F, -5.75F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 187
		bodyModel[76].setRotationPoint(-30F, -5.75F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 188
		bodyModel[77].setRotationPoint(-30F, -5.75F, 9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 36
		bodyModel[78].setRotationPoint(-30F, -6F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 36
		bodyModel[79].setRotationPoint(-30F, -4F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 36
		bodyModel[80].setRotationPoint(-30F, -2F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 36
		bodyModel[81].setRotationPoint(-30F, 0F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 36
		bodyModel[82].setRotationPoint(-30F, 2F, -9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[83].setRotationPoint(24F, -7F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[84].setRotationPoint(19F, -7F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[85].setRotationPoint(14F, -7F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[86].setRotationPoint(4F, -7F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[87].setRotationPoint(-5F, -7F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[88].setRotationPoint(-10F, -7F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[89].setRotationPoint(-15F, -7F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[90].setRotationPoint(-20F, -7F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[91].setRotationPoint(-25F, -7F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[92].setRotationPoint(9F, -7F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[93].setRotationPoint(-0.5F, -7F, -11F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 0
		bodyModel[94].setRotationPoint(-30F, 3F, -2.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 0
		bodyModel[95].setRotationPoint(26F, 3F, -2.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 34
		bodyModel[96].setRotationPoint(-29F, 4F, -10F);

		bodyModel[97].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 34
		bodyModel[97].setRotationPoint(25F, 4F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[98].setRotationPoint(24F, -7F, 10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[99].setRotationPoint(19F, -7F, 10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[100].setRotationPoint(14F, -7F, 10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[101].setRotationPoint(4F, -7F, 10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[102].setRotationPoint(-5F, -7F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[103].setRotationPoint(-10F, -7F, 10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[104].setRotationPoint(-15F, -7F, 10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[105].setRotationPoint(-20F, -7F, 10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[106].setRotationPoint(-25F, -7F, 10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[107].setRotationPoint(9F, -7F, 10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[108].setRotationPoint(-0.5F, -7F, 10F);

		bodyModel[109].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 34
		bodyModel[109].setRotationPoint(-29F, 4F, 10F);

		bodyModel[110].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 34
		bodyModel[110].setRotationPoint(25F, 4F, 10F);

		bodyModel[111].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 34 Ladder cull
		bodyModel[111].setRotationPoint(-28.99F, -7F, 9.75F);

		bodyModel[112].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 34 Ladder cull
		bodyModel[112].setRotationPoint(24.99F, -7F, -10.75F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 34 Ladder cull
		bodyModel[113].setRotationPoint(-28.99F, -6F, -10.75F);

		bodyModel[114].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 34 Ladder cull
		bodyModel[114].setRotationPoint(24.99F, -6F, 9.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 14, 19, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 45 Woodchip walls
		bodyModel[115].setRotationPoint(-29F, -22F, -9.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 14, 19, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45 Woodchip walls
		bodyModel[116].setRotationPoint(28F, -22F, -9.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 56, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45 Woodchip walls
		bodyModel[117].setRotationPoint(-28F, -22F, -10.01F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 56, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 45 Woodchip walls
		bodyModel[118].setRotationPoint(-28F, -22F, 9.01F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 46 wall suports
		bodyModel[119].setRotationPoint(-0.5F, -22F, -9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46 wall suports
		bodyModel[120].setRotationPoint(-0.5F, -22F, 8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 46 wall suports
		bodyModel[121].setRotationPoint(-15F, -22F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46 wall suports
		bodyModel[122].setRotationPoint(-15F, -22F, 8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 46 wall suports
		bodyModel[123].setRotationPoint(14F, -22F, -9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46 wall suports
		bodyModel[124].setRotationPoint(14F, -22F, 8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45 Woodchip bracing
		bodyModel[125].setRotationPoint(-1.5F, -22F, -10.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F); // Box 45 Woodchip bracing
		bodyModel[126].setRotationPoint(-1.5F, -22F, 9.5F);

		bodyModel[127].addShapeBox(0F, -2F, 0F, 28, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 45 Woodchip bracing
		bodyModel[127].setRotationPoint(-24F, -6F, 9.49F);
		bodyModel[127].rotateAngleZ = 0.53232542F;

		bodyModel[128].addShapeBox(0F, -2F, 0F, 28, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45 Woodchip bracing
		bodyModel[128].setRotationPoint(-24F, -6F, -10.49F);
		bodyModel[128].rotateAngleZ = 0.53232542F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 45 Woodchip bracing
		bodyModel[129].setRotationPoint(24F, -6F, 9.49F);
		bodyModel[129].rotateAngleZ = 2.60926723F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45 Woodchip bracing
		bodyModel[130].setRotationPoint(24F, -6F, -10.49F);
		bodyModel[130].rotateAngleZ = 2.60926723F;

		bodyModel[131].addBox(0F, 0F, 0F, 2, 10, 4, 0F); // Box 36 end ladder cull
		bodyModel[131].setRotationPoint(28.5F, -7F, -9F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 36 end ladder cull
		bodyModel[132].setRotationPoint(28.5F, -3F, 5F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 10, 4, 0F); // Box 36 end ladder cull
		bodyModel[133].setRotationPoint(-30.5F, -7F, 5F);

		bodyModel[134].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 36 end ladder cull
		bodyModel[134].setRotationPoint(-30.5F, -3F, -9F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 36 woodchip end ladder cull
		bodyModel[135].setRotationPoint(28.5F, -22F, -9F);

		bodyModel[136].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 34 Woodchip Ladder cull
		bodyModel[136].setRotationPoint(24.5F, -22F, -10.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 34 woodchip Ladder cull
		bodyModel[137].setRotationPoint(-28.5F, -22F, 9.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 36 woodchip end ladder cull
		bodyModel[138].setRotationPoint(-29.51F, -22F, 5F);

		bodyModel[139].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 40 woodchip brake stuff
		bodyModel[139].setRotationPoint(-30F, -20F, 2F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 40 woodchip brake stuff
		bodyModel[140].setRotationPoint(-29.99F, -19F, 3F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 40 woodchip brake stuff
		bodyModel[141].setRotationPoint(-29.49F, -19.5F, 2.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 40 woodchip brake stuff
		bodyModel[142].setRotationPoint(-31F, -13.5F, 1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 40 woodchip brake stuff
		bodyModel[143].setRotationPoint(-29.5F, -16.5F, 3.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 0, 18, 0F); // Box 46 wire ties
		bodyModel[144].setRotationPoint(-0.5F, -19.01F, -9F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 0, 18, 0F); // Box 46 wire ties
		bodyModel[145].setRotationPoint(-15F, -19.01F, -9F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 0, 18, 0F); // Box 46 wire ties
		bodyModel[146].setRotationPoint(14F, -19.01F, -9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[147].setRotationPoint(25F, 4F, -2.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[148].setRotationPoint(-26F, 4F, -2.5F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();
	Model70TonTruckEarly bogie2 = new Model70TonTruckEarly();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 149; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13543) {
			GL11.glPushMatrix();
			GL11.glScalef(1,1,1f);
			GL11.glTranslated(-0.57,-0.05,-0.0);
			bogie.render(entity,f,f1,f2,f3,f4,f5);

			GL11.glTranslated(1.17,-0.0,0.00);
			bogie.render(entity,f,f1,f2,f3,f4,f5);
			GL11.glPopMatrix();
		} else {
			GL11.glPushMatrix();
			GL11.glScalef(1,1,1f);
			GL11.glTranslated(-1.2,-0.0,-0.0);
			bogie2.render(entity,f,f1,f2,f3,f4,f5);

			GL11.glTranslated(2.4,-0.0,0.00);
			bogie2.render(entity,f,f1,f2,f3,f4,f5);
			GL11.glPopMatrix();
		}
		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f, f1, f2, f3, f4, f5);
	}
}