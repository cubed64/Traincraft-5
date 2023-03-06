//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.12.2022 - 15:46:32
// Last changed on: 29.12.2022 - 15:46:32

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruckEarly;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelOreJennyTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelGN40box extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelGN40box() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[150];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 23, 13, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 32, 36, textureX, textureY); // Box 72
		bodyModel[2] = new ModelRendererTurbo(this, 33, 43, textureX, textureY); // Box 87
		bodyModel[3] = new ModelRendererTurbo(this, 127, 4, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 101, 13, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 28, 52, textureX, textureY); // Box 87
		bodyModel[8] = new ModelRendererTurbo(this, 6, 1, textureX, textureY); // Box 80
		bodyModel[9] = new ModelRendererTurbo(this, 114, 1, textureX, textureY); // Box 81
		bodyModel[10] = new ModelRendererTurbo(this, 32, 46, textureX, textureY); // Box 87
		bodyModel[11] = new ModelRendererTurbo(this, 2, 29, textureX, textureY); // Box 286
		bodyModel[12] = new ModelRendererTurbo(this, 2, 26, textureX, textureY); // Box 287
		bodyModel[13] = new ModelRendererTurbo(this, 13, 34, textureX, textureY); // Box 118
		bodyModel[14] = new ModelRendererTurbo(this, 14, 31, textureX, textureY); // Box 119
		bodyModel[15] = new ModelRendererTurbo(this, -6, 15, textureX, textureY); // Box 196
		bodyModel[16] = new ModelRendererTurbo(this, 5, 21, textureX, textureY); // Box 199
		bodyModel[17] = new ModelRendererTurbo(this, -1, 44, textureX, textureY); // Box 122
		bodyModel[18] = new ModelRendererTurbo(this, -12, 39, textureX, textureY); // Box 124
		bodyModel[19] = new ModelRendererTurbo(this, 4, 41, textureX, textureY); // Box 126
		bodyModel[20] = new ModelRendererTurbo(this, 1, 24, textureX, textureY); // Box 202
		bodyModel[21] = new ModelRendererTurbo(this, 3, 39, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 22, 32, textureX, textureY); // Box 129
		bodyModel[23] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 302
		bodyModel[24] = new ModelRendererTurbo(this, 31, 26, textureX, textureY); // Box 42
		bodyModel[25] = new ModelRendererTurbo(this, 31, 15, textureX, textureY); // Box 215
		bodyModel[26] = new ModelRendererTurbo(this, 85, 26, textureX, textureY); // Box 216
		bodyModel[27] = new ModelRendererTurbo(this, 85, 15, textureX, textureY); // Box 217
		bodyModel[28] = new ModelRendererTurbo(this, 47, 24, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Box 215
		bodyModel[30] = new ModelRendererTurbo(this, 71, 24, textureX, textureY); // Box 42
		bodyModel[31] = new ModelRendererTurbo(this, 71, 13, textureX, textureY); // Box 215
		bodyModel[32] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 39, 39, textureX, textureY); // Box 40
		bodyModel[34] = new ModelRendererTurbo(this, 50, 130, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 20, 39, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 57, 178, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 58, 152, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 58, 165, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 44, 165, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 44, 173, textureX, textureY); // Box 39
		bodyModel[41] = new ModelRendererTurbo(this, 168, 152, textureX, textureY); // Box 39
		bodyModel[42] = new ModelRendererTurbo(this, 192, 160, textureX, textureY); // Box 39
		bodyModel[43] = new ModelRendererTurbo(this, 53, 181, textureX, textureY); // Box 39
		bodyModel[44] = new ModelRendererTurbo(this, 177, 181, textureX, textureY); // Box 39
		bodyModel[45] = new ModelRendererTurbo(this, 187, 53, textureX, textureY); // Box 40 number shit
		bodyModel[46] = new ModelRendererTurbo(this, 25, 53, textureX, textureY); // Box 40 number shit
		bodyModel[47] = new ModelRendererTurbo(this, 180, 39, textureX, textureY); // Box 36 end wall
		bodyModel[48] = new ModelRendererTurbo(this, 67, 60, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 112, 55, textureX, textureY); // Box 106
		bodyModel[50] = new ModelRendererTurbo(this, 112, 85, textureX, textureY); // Box 106
		bodyModel[51] = new ModelRendererTurbo(this, 66, 121, textureX, textureY); // Box 40
		bodyModel[52] = new ModelRendererTurbo(this, 67, 83, textureX, textureY); // Box 40
		bodyModel[53] = new ModelRendererTurbo(this, 170, 121, textureX, textureY); // Box 40
		bodyModel[54] = new ModelRendererTurbo(this, 171, 83, textureX, textureY); // Box 40
		bodyModel[55] = new ModelRendererTurbo(this, 220, 52, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[56] = new ModelRendererTurbo(this, 167, 91, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[57] = new ModelRendererTurbo(this, 227, 58, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[58] = new ModelRendererTurbo(this, 7, 58, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[59] = new ModelRendererTurbo(this, 14, 52, textureX, textureY, "cull"); // Box 40 cull
		bodyModel[60] = new ModelRendererTurbo(this, 55, 98, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[61] = new ModelRendererTurbo(this, 168, 37, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[62] = new ModelRendererTurbo(this, 101, 52, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[63] = new ModelRendererTurbo(this, 69, 90, textureX, textureY); // Box 49
		bodyModel[64] = new ModelRendererTurbo(this, 68, 126, textureX, textureY); // Box 49
		bodyModel[65] = new ModelRendererTurbo(this, 135, 60, textureX, textureY); // Box 49
		bodyModel[66] = new ModelRendererTurbo(this, 112, 82, textureX, textureY); // Box 49
		bodyModel[67] = new ModelRendererTurbo(this, 112, 58, textureX, textureY); // Box 49
		bodyModel[68] = new ModelRendererTurbo(this, 112, 61, textureX, textureY); // Box 49
		bodyModel[69] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 49
		bodyModel[70] = new ModelRendererTurbo(this, 111, 93, textureX, textureY); // Box 106
		bodyModel[71] = new ModelRendererTurbo(this, 111, 123, textureX, textureY); // Box 106
		bodyModel[72] = new ModelRendererTurbo(this, 134, 98, textureX, textureY); // Box 49
		bodyModel[73] = new ModelRendererTurbo(this, 111, 120, textureX, textureY); // Box 49
		bodyModel[74] = new ModelRendererTurbo(this, 111, 96, textureX, textureY); // Box 49
		bodyModel[75] = new ModelRendererTurbo(this, 111, 99, textureX, textureY); // Box 49
		bodyModel[76] = new ModelRendererTurbo(this, 203, 13, textureX, textureY); // Box 189
		bodyModel[77] = new ModelRendererTurbo(this, 224, 28, textureX, textureY); // Box 190
		bodyModel[78] = new ModelRendererTurbo(this, 216, 28, textureX, textureY); // Box 191
		bodyModel[79] = new ModelRendererTurbo(this, 205, 33, textureX, textureY); // Box 186
		bodyModel[80] = new ModelRendererTurbo(this, 212, 43, textureX, textureY); // Box 187
		bodyModel[81] = new ModelRendererTurbo(this, 224, 43, textureX, textureY); // Box 188
		bodyModel[82] = new ModelRendererTurbo(this, 25, 36, textureX, textureY); // Box 72
		bodyModel[83] = new ModelRendererTurbo(this, 26, 43, textureX, textureY); // Box 87
		bodyModel[84] = new ModelRendererTurbo(this, 21, 52, textureX, textureY); // Box 87
		bodyModel[85] = new ModelRendererTurbo(this, 25, 46, textureX, textureY); // Box 87
		bodyModel[86] = new ModelRendererTurbo(this, 205, 33, textureX, textureY); // Box 186
		bodyModel[87] = new ModelRendererTurbo(this, 212, 43, textureX, textureY); // Box 187
		bodyModel[88] = new ModelRendererTurbo(this, 224, 43, textureX, textureY); // Box 188
		bodyModel[89] = new ModelRendererTurbo(this, 205, 33, textureX, textureY); // Box 186
		bodyModel[90] = new ModelRendererTurbo(this, 212, 43, textureX, textureY); // Box 187
		bodyModel[91] = new ModelRendererTurbo(this, 224, 43, textureX, textureY); // Box 188
		bodyModel[92] = new ModelRendererTurbo(this, 205, 33, textureX, textureY); // Box 186
		bodyModel[93] = new ModelRendererTurbo(this, 212, 43, textureX, textureY); // Box 187
		bodyModel[94] = new ModelRendererTurbo(this, 224, 43, textureX, textureY); // Box 188
		bodyModel[95] = new ModelRendererTurbo(this, 205, 33, textureX, textureY); // Box 186
		bodyModel[96] = new ModelRendererTurbo(this, 212, 43, textureX, textureY); // Box 187
		bodyModel[97] = new ModelRendererTurbo(this, 224, 43, textureX, textureY); // Box 188
		bodyModel[98] = new ModelRendererTurbo(this, 205, 33, textureX, textureY); // Box 186
		bodyModel[99] = new ModelRendererTurbo(this, 212, 43, textureX, textureY); // Box 187
		bodyModel[100] = new ModelRendererTurbo(this, 224, 43, textureX, textureY); // Box 188
		bodyModel[101] = new ModelRendererTurbo(this, 62, 36, textureX, textureY); // Box 189
		bodyModel[102] = new ModelRendererTurbo(this, 83, 48, textureX, textureY); // Box 190
		bodyModel[103] = new ModelRendererTurbo(this, 75, 48, textureX, textureY); // Box 191
		bodyModel[104] = new ModelRendererTurbo(this, 45, 35, textureX, textureY); // Box 186
		bodyModel[105] = new ModelRendererTurbo(this, 52, 45, textureX, textureY); // Box 187
		bodyModel[106] = new ModelRendererTurbo(this, 64, 45, textureX, textureY); // Box 188
		bodyModel[107] = new ModelRendererTurbo(this, 45, 35, textureX, textureY); // Box 186
		bodyModel[108] = new ModelRendererTurbo(this, 52, 45, textureX, textureY); // Box 187
		bodyModel[109] = new ModelRendererTurbo(this, 64, 45, textureX, textureY); // Box 188
		bodyModel[110] = new ModelRendererTurbo(this, 45, 35, textureX, textureY); // Box 186
		bodyModel[111] = new ModelRendererTurbo(this, 52, 45, textureX, textureY); // Box 187
		bodyModel[112] = new ModelRendererTurbo(this, 64, 45, textureX, textureY); // Box 188
		bodyModel[113] = new ModelRendererTurbo(this, 45, 35, textureX, textureY); // Box 186
		bodyModel[114] = new ModelRendererTurbo(this, 52, 45, textureX, textureY); // Box 187
		bodyModel[115] = new ModelRendererTurbo(this, 64, 45, textureX, textureY); // Box 188
		bodyModel[116] = new ModelRendererTurbo(this, 45, 35, textureX, textureY); // Box 186
		bodyModel[117] = new ModelRendererTurbo(this, 52, 45, textureX, textureY); // Box 187
		bodyModel[118] = new ModelRendererTurbo(this, 64, 45, textureX, textureY); // Box 188
		bodyModel[119] = new ModelRendererTurbo(this, 45, 35, textureX, textureY); // Box 186
		bodyModel[120] = new ModelRendererTurbo(this, 52, 45, textureX, textureY); // Box 187
		bodyModel[121] = new ModelRendererTurbo(this, 64, 45, textureX, textureY); // Box 188
		bodyModel[122] = new ModelRendererTurbo(this, 238, 53, textureX, textureY, "cull"); // Box 186 wood door cull
		bodyModel[123] = new ModelRendererTurbo(this, 238, 68, textureX, textureY, "cull"); // Box 186 wood door cull
		bodyModel[124] = new ModelRendererTurbo(this, 86, 92, textureX, textureY); // Box 49
		bodyModel[125] = new ModelRendererTurbo(this, 89, 92, textureX, textureY); // Box 49
		bodyModel[126] = new ModelRendererTurbo(this, 161, 96, textureX, textureY); // Box 49
		bodyModel[127] = new ModelRendererTurbo(this, 164, 96, textureX, textureY); // Box 49
		bodyModel[128] = new ModelRendererTurbo(this, 100, 92, textureX, textureY); // Box 49
		bodyModel[129] = new ModelRendererTurbo(this, 161, 92, textureX, textureY); // Box 49
		bodyModel[130] = new ModelRendererTurbo(this, 93, 92, textureX, textureY); // Box 49
		bodyModel[131] = new ModelRendererTurbo(this, 96, 92, textureX, textureY); // Box 49
		bodyModel[132] = new ModelRendererTurbo(this, 161, 94, textureX, textureY); // Box 49
		bodyModel[133] = new ModelRendererTurbo(this, 164, 94, textureX, textureY); // Box 49
		bodyModel[134] = new ModelRendererTurbo(this, 86, 124, textureX, textureY); // Box 49
		bodyModel[135] = new ModelRendererTurbo(this, 89, 124, textureX, textureY); // Box 49
		bodyModel[136] = new ModelRendererTurbo(this, 154, 121, textureX, textureY); // Box 49
		bodyModel[137] = new ModelRendererTurbo(this, 157, 121, textureX, textureY); // Box 49
		bodyModel[138] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 49
		bodyModel[139] = new ModelRendererTurbo(this, 143, 121, textureX, textureY); // Box 49
		bodyModel[140] = new ModelRendererTurbo(this, 93, 124, textureX, textureY); // Box 49
		bodyModel[141] = new ModelRendererTurbo(this, 96, 124, textureX, textureY); // Box 49
		bodyModel[142] = new ModelRendererTurbo(this, 147, 121, textureX, textureY); // Box 49
		bodyModel[143] = new ModelRendererTurbo(this, 150, 121, textureX, textureY); // Box 49
		bodyModel[144] = new ModelRendererTurbo(this, 77, 83, textureX, textureY); // Box 40
		bodyModel[145] = new ModelRendererTurbo(this, 161, 83, textureX, textureY); // Box 40
		bodyModel[146] = new ModelRendererTurbo(this, 69, 88, textureX, textureY); // Box 49
		bodyModel[147] = new ModelRendererTurbo(this, 76, 121, textureX, textureY); // Box 40
		bodyModel[148] = new ModelRendererTurbo(this, 160, 121, textureX, textureY); // Box 40
		bodyModel[149] = new ModelRendererTurbo(this, 68, 128, textureX, textureY); // Box 49

		bodyModel[0].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-20F, 5F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 72
		bodyModel[1].setRotationPoint(-28.51F, -19.5F, 2F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[2].setRotationPoint(-28.5F, -18.5F, 3F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[3].setRotationPoint(28F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 56, 2, 5, 0F); // Box 0
		bodyModel[4].setRotationPoint(-28F, 3F, -2.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[5].setRotationPoint(-31F, 3F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[6].setRotationPoint(16F, 5F, -2F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 87
		bodyModel[7].setRotationPoint(-29.5F, -12.5F, 2F);

		bodyModel[8].addBox(0F, -1F, 0F, 10, 2, 0, 0F); // Box 80
		bodyModel[8].setRotationPoint(-29F, 5F, 1.5F);
		bodyModel[8].rotateAngleY = 1.37881011F;
		bodyModel[8].rotateAngleZ = 0.10471976F;

		bodyModel[9].addBox(-10F, -1F, 0F, 10, 2, 0, 0F); // Box 81
		bodyModel[9].setRotationPoint(29F, 5F, -1.5F);
		bodyModel[9].rotateAngleY = 1.37881011F;
		bodyModel[9].rotateAngleZ = -0.10471976F;

		bodyModel[10].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 87
		bodyModel[10].setRotationPoint(-28F, -19F, 2.5F);

		bodyModel[11].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[11].setRotationPoint(6.5F, 5F, -4.5F);
		bodyModel[11].rotateAngleX = -0.78539816F;

		bodyModel[12].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[12].setRotationPoint(8.5F, 5F, -4.5F);
		bodyModel[12].rotateAngleX = -0.78539816F;

		bodyModel[13].addShapeBox(0F, -1F, -1F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[13].setRotationPoint(1F, 5.75F, 4.5F);
		bodyModel[13].rotateAngleX = -0.78539816F;

		bodyModel[14].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 119
		bodyModel[14].setRotationPoint(-1F, 5.75F, 4.5F);
		bodyModel[14].rotateAngleX = -0.78539816F;

		bodyModel[15].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[15].setRotationPoint(-3.75F, 5.26F, 1F);
		bodyModel[15].rotateAngleY = -0.31415927F;

		bodyModel[16].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[16].setRotationPoint(-4F, 5.25F, 0F);
		bodyModel[16].rotateAngleY = -0.31415927F;

		bodyModel[17].addBox(-0.5F, 0F, -2F, 1, 0, 5, 0F); // Box 122
		bodyModel[17].setRotationPoint(9F, 5.26F, 0F);
		bodyModel[17].rotateAngleY = -0.10471976F;

		bodyModel[18].addBox(-0.5F, 0F, 0F, 1, 0, 13, 0F); // Box 124
		bodyModel[18].setRotationPoint(-4F, 5.26F, 0F);
		bodyModel[18].rotateAngleY = -1.57079633F;

		bodyModel[19].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 126
		bodyModel[19].setRotationPoint(7F, 4.5F, -2.25F);

		bodyModel[20].addBox(-14.5F, -0.75F, -0.5F, 14, 0, 1, 0F); // Box 202
		bodyModel[20].setRotationPoint(-3.75F, 6.01F, -2.5F);
		bodyModel[20].rotateAngleY = -0.08726646F;
		bodyModel[20].rotateAngleZ = 0.06981317F;

		bodyModel[21].addBox(-9.5F, -0.75F, -0.5F, 9, 0, 1, 0F); // Box 128
		bodyModel[21].setRotationPoint(8.5F, 6.01F, 2.5F);
		bodyModel[21].rotateAngleY = -3.2637657F;
		bodyModel[21].rotateAngleZ = 0.08726646F;

		bodyModel[22].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 129
		bodyModel[22].setRotationPoint(1.5F, 3F, 3.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 302
		bodyModel[23].setRotationPoint(7.5F, 2.5F, -5.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 42
		bodyModel[24].setRotationPoint(-19.5F, 2.8F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 215
		bodyModel[25].setRotationPoint(-19.5F, 2.8F, 2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 216
		bodyModel[26].setRotationPoint(16.5F, 2.8F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 217
		bodyModel[27].setRotationPoint(16.5F, 2.8F, 2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 42
		bodyModel[28].setRotationPoint(-6.5F, 2.8F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 215
		bodyModel[29].setRotationPoint(-6.5F, 2.8F, 2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 42
		bodyModel[30].setRotationPoint(4.5F, 2.8F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 215
		bodyModel[31].setRotationPoint(4.5F, 2.8F, 2F);

		bodyModel[32].addBox(0F, 0F, 0F, 28, 1, 0, 0F); // Box 40
		bodyModel[32].setRotationPoint(-28F, 4.5F, 3.51F);
		bodyModel[32].rotateAngleY = 0.03708825F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 21, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[33].setRotationPoint(-28F, -16F, 3.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 52, 1, 20, 0F); // Box 34
		bodyModel[34].setRotationPoint(-26F, 2F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 21, 22, 0F); // Box 36
		bodyModel[35].setRotationPoint(-27F, -18F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 58, 0, 7, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 39
		bodyModel[36].setRotationPoint(-29F, -20F, -3.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 54, 2, 10, 0F,0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[37].setRotationPoint(-27F, -20F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 54, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 39
		bodyModel[38].setRotationPoint(-27F, -20F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 0, 9, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Box 39
		bodyModel[39].setRotationPoint(-28.5F, -20F, 2F);
		bodyModel[39].rotateAngleX = -0.12217305F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[40].setRotationPoint(-27F, -18.97F, 10.44F);

		bodyModel[41].addShapeBox(0F, 0F, -8.5F, 7, 0, 9, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Box 39
		bodyModel[41].setRotationPoint(21.5F, -20F, -2F);
		bodyModel[41].rotateAngleX = 0.12217305F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[42].setRotationPoint(23F, -18.97F, -10.44F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 39
		bodyModel[43].setRotationPoint(-29F, -20F, -2F);
		bodyModel[43].rotateAngleZ = -0.78539816F;

		bodyModel[44].addBox(-3F, 0F, 0F, 3, 0, 4, 0F); // Box 39
		bodyModel[44].setRotationPoint(29F, -20F, -2F);
		bodyModel[44].rotateAngleZ = 0.78539816F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 number shit
		bodyModel[45].setRotationPoint(27.01F, -19F, 2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 number shit
		bodyModel[46].setRotationPoint(-27.01F, -19F, -8F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 21, 22, 0F); // Box 36 end wall
		bodyModel[47].setRotationPoint(26F, -18F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 21, 21, 1, 0F); // Box 49
		bodyModel[48].setRotationPoint(-26F, -18F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 106
		bodyModel[49].setRotationPoint(-6F, -18F, -11.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 106
		bodyModel[50].setRotationPoint(-6F, 2F, -11.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[51].setRotationPoint(-27F, 4F, 11.01F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[52].setRotationPoint(-27F, 4F, -11.01F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[53].setRotationPoint(23F, 4F, 11.01F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[54].setRotationPoint(23F, 4F, -11.01F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[55].setRotationPoint(26.75F, -0.5F, 6.25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[56].setRotationPoint(22.99F, -4.5F, 10.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[57].setRotationPoint(26.75F, -17F, -10.25F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[58].setRotationPoint(-27.75F, -17F, 6.25F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cull
		bodyModel[59].setRotationPoint(-27.75F, -0.5F, -10.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[60].setRotationPoint(-26.99F, -18F, 10.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[61].setRotationPoint(22.99F, -18F, -11.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[62].setRotationPoint(-26.99F, -4.5F, -11.75F);

		bodyModel[63].addBox(0F, 0F, 0F, 54, 1, 0, 0F); // Box 49
		bodyModel[63].setRotationPoint(-27F, 3F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 54, 1, 0, 0F); // Box 49
		bodyModel[64].setRotationPoint(-27F, 3F, 11F);

		bodyModel[65].addBox(0F, 0F, 0F, 21, 21, 1, 0F); // Box 49
		bodyModel[65].setRotationPoint(5F, -18F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 49
		bodyModel[66].setRotationPoint(-5F, 2F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 49
		bodyModel[67].setRotationPoint(-5F, -18F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[68].setRotationPoint(-5F, -17F, -11.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 21, 21, 1, 0F); // Box 49
		bodyModel[69].setRotationPoint(-26F, -18F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[70].setRotationPoint(-15F, -18F, 10.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[71].setRotationPoint(-15F, 2F, 10.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 21, 21, 1, 0F); // Box 49
		bodyModel[72].setRotationPoint(5F, -18F, 10F);

		bodyModel[73].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 49
		bodyModel[73].setRotationPoint(-5F, 2F, 10F);

		bodyModel[74].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 49
		bodyModel[74].setRotationPoint(-5F, -18F, 10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 19, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[75].setRotationPoint(-5F, -17F, 10.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[76].setRotationPoint(27F, -16.75F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[77].setRotationPoint(27F, -16.75F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[78].setRotationPoint(27F, -16.75F, 9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[79].setRotationPoint(27F, 0F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[80].setRotationPoint(27F, 0F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 188
		bodyModel[81].setRotationPoint(27F, 0F, 8F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 72
		bodyModel[82].setRotationPoint(-28.51F, -7.5F, 2F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[83].setRotationPoint(-28.5F, -6.5F, 3F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 87
		bodyModel[84].setRotationPoint(-29.5F, 0.5F, 2F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 87
		bodyModel[85].setRotationPoint(-28F, -7F, 2.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[86].setRotationPoint(27F, -3F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[87].setRotationPoint(27F, -3F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 188
		bodyModel[88].setRotationPoint(27F, -3F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[89].setRotationPoint(27F, -6F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[90].setRotationPoint(27F, -6F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 188
		bodyModel[91].setRotationPoint(27F, -6F, 8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[92].setRotationPoint(27F, -9F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[93].setRotationPoint(27F, -9F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 188
		bodyModel[94].setRotationPoint(27F, -9F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[95].setRotationPoint(27F, -12F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[96].setRotationPoint(27F, -12F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 188
		bodyModel[97].setRotationPoint(27F, -12F, 8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[98].setRotationPoint(27F, -15F, -8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[99].setRotationPoint(27F, -15F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 188
		bodyModel[100].setRotationPoint(27F, -15F, 8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
		bodyModel[101].setRotationPoint(-28F, -16.75F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 190
		bodyModel[102].setRotationPoint(-28F, -16.75F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 191
		bodyModel[103].setRotationPoint(-28F, -16.75F, 9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 186
		bodyModel[104].setRotationPoint(-28F, 0F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 187
		bodyModel[105].setRotationPoint(-28F, 0F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 188
		bodyModel[106].setRotationPoint(-28F, 0F, 8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 186
		bodyModel[107].setRotationPoint(-28F, -3F, -8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 187
		bodyModel[108].setRotationPoint(-28F, -3F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 188
		bodyModel[109].setRotationPoint(-28F, -3F, 8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 186
		bodyModel[110].setRotationPoint(-28F, -6F, -8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 187
		bodyModel[111].setRotationPoint(-28F, -6F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 188
		bodyModel[112].setRotationPoint(-28F, -6F, 8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 186
		bodyModel[113].setRotationPoint(-28F, -9F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 187
		bodyModel[114].setRotationPoint(-28F, -9F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 188
		bodyModel[115].setRotationPoint(-28F, -9F, 8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 186
		bodyModel[116].setRotationPoint(-28F, -12F, -8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 187
		bodyModel[117].setRotationPoint(-28F, -12F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 188
		bodyModel[118].setRotationPoint(-28F, -12F, 8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 186
		bodyModel[119].setRotationPoint(-28F, -15F, -8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 187
		bodyModel[120].setRotationPoint(-28F, -15F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 188
		bodyModel[121].setRotationPoint(-28F, -15F, 8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, 0F, 0F); // Box 186 wood door cull
		bodyModel[122].setRotationPoint(27F, -17F, -3.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186 wood door cull
		bodyModel[123].setRotationPoint(26F, -17F, -3.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[124].setRotationPoint(-21F, 3F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[125].setRotationPoint(-16F, 3F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[126].setRotationPoint(15F, 3F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[127].setRotationPoint(20F, 3F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[128].setRotationPoint(-8F, 3F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[129].setRotationPoint(7F, 3F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[130].setRotationPoint(-13F, 3F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[131].setRotationPoint(-11F, 3F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[132].setRotationPoint(10F, 3F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[133].setRotationPoint(12F, 3F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[134].setRotationPoint(-21F, 3F, 11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[135].setRotationPoint(-16F, 3F, 11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[136].setRotationPoint(15F, 3F, 11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[137].setRotationPoint(20F, 3F, 11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[138].setRotationPoint(-8F, 3F, 11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[139].setRotationPoint(7F, 3F, 11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[140].setRotationPoint(-13F, 3F, 11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[141].setRotationPoint(-11F, 3F, 11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[142].setRotationPoint(10F, 3F, 11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[143].setRotationPoint(12F, 3F, 11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[144].setRotationPoint(-27F, 4F, -10.52F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[145].setRotationPoint(23F, 4F, -10.52F);

		bodyModel[146].addBox(0F, 0F, 0F, 54, 1, 0, 0F); // Box 49
		bodyModel[146].setRotationPoint(-27F, 3F, -10.51F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[147].setRotationPoint(-27F, 4F, 10.52F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[148].setRotationPoint(23F, 4F, 10.52F);

		bodyModel[149].addBox(0F, 0F, 0F, 54, 1, 0, 0F); // Box 49
		bodyModel[149].setRotationPoint(-27F, 3F, 10.51F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();
	Model70TonTruckEarly bogie2 = new Model70TonTruckEarly();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 150; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}


		//Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Ore_jenny_Truck2.png"));
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
			GL11.glTranslated(-1.125,-0.0,-0.0);
			bogie2.render(entity,f,f1,f2,f3,f4,f5);

			GL11.glTranslated(2.25,-0.0,0.00);
			bogie2.render(entity,f,f1,f2,f3,f4,f5);
			GL11.glPopMatrix();
		}
	}
	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }
}