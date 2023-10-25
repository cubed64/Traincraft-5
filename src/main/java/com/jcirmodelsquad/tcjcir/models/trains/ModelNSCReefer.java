//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NSC CP Reefer
// Model Creator: Prof_Binky
// Created on: 29.12.2022 - 15:46:32
// Last changed on: 29.12.2022 - 15:46:32

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

public class ModelNSCReefer extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelNSCReefer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[144];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 23, 13, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 157, 4, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 101, 13, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 6, 1, textureX, textureY); // Box 80
		bodyModel[6] = new ModelRendererTurbo(this, 136, 1, textureX, textureY); // Box 81
		bodyModel[7] = new ModelRendererTurbo(this, 1, 27, textureX, textureY); // Box 286
		bodyModel[8] = new ModelRendererTurbo(this, 1, 27, textureX, textureY); // Box 287
		bodyModel[9] = new ModelRendererTurbo(this, 13, 34, textureX, textureY); // Box 118
		bodyModel[10] = new ModelRendererTurbo(this, 14, 31, textureX, textureY); // Box 119
		bodyModel[11] = new ModelRendererTurbo(this, -7, 15, textureX, textureY); // Box 196
		bodyModel[12] = new ModelRendererTurbo(this, 4, 21, textureX, textureY); // Box 199
		bodyModel[13] = new ModelRendererTurbo(this, -1, 41, textureX, textureY); // Box 122
		bodyModel[14] = new ModelRendererTurbo(this, -28, 41, textureX, textureY); // Box 124
		bodyModel[15] = new ModelRendererTurbo(this, 0, 24, textureX, textureY); // Box 202
		bodyModel[16] = new ModelRendererTurbo(this, 0, 39, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 22, 32, textureX, textureY); // Box 129
		bodyModel[18] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 302
		bodyModel[19] = new ModelRendererTurbo(this, 31, 26, textureX, textureY); // Box 42
		bodyModel[20] = new ModelRendererTurbo(this, 31, 15, textureX, textureY); // Box 215
		bodyModel[21] = new ModelRendererTurbo(this, 85, 26, textureX, textureY); // Box 216
		bodyModel[22] = new ModelRendererTurbo(this, 85, 15, textureX, textureY); // Box 217
		bodyModel[23] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 40
		bodyModel[24] = new ModelRendererTurbo(this, 39, 39, textureX, textureY); // Box 40
		bodyModel[25] = new ModelRendererTurbo(this, 50, 130, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 20, 39, textureX, textureY); // Box 36
		bodyModel[27] = new ModelRendererTurbo(this, 58, 153, textureX, textureY); // Box 39
		bodyModel[28] = new ModelRendererTurbo(this, 58, 166, textureX, textureY); // Box 39
		bodyModel[29] = new ModelRendererTurbo(this, 219, 54, textureX, textureY); // Box 40 number shit
		bodyModel[30] = new ModelRendererTurbo(this, 20, 54, textureX, textureY); // Box 40 number shit
		bodyModel[31] = new ModelRendererTurbo(this, 183, 39, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 69, 61, textureX, textureY); // Box 49
		bodyModel[33] = new ModelRendererTurbo(this, 112, 55, textureX, textureY); // Box 106
		bodyModel[34] = new ModelRendererTurbo(this, 112, 85, textureX, textureY); // Box 106
		bodyModel[35] = new ModelRendererTurbo(this, 66, 122, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 69, 85, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 171, 122, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 178, 85, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 232, 70, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[40] = new ModelRendererTurbo(this, 180, 109, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[41] = new ModelRendererTurbo(this, 232, 55, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[42] = new ModelRendererTurbo(this, 9, 70, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[43] = new ModelRendererTurbo(this, 9, 55, textureX, textureY, "cull"); // Box 40 cull
		bodyModel[44] = new ModelRendererTurbo(this, 55, 110, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[45] = new ModelRendererTurbo(this, 172, 48, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[46] = new ModelRendererTurbo(this, 101, 49, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[47] = new ModelRendererTurbo(this, 69, 90, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 68, 126, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 126, 61, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 78, 85, textureX, textureY); // Box 49
		bodyModel[51] = new ModelRendererTurbo(this, 112, 58, textureX, textureY); // Box 49
		bodyModel[52] = new ModelRendererTurbo(this, 227, 103, textureX, textureY); // Box 49
		bodyModel[53] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 49
		bodyModel[54] = new ModelRendererTurbo(this, 111, 92, textureX, textureY); // Box 106
		bodyModel[55] = new ModelRendererTurbo(this, 111, 123, textureX, textureY); // Box 106
		bodyModel[56] = new ModelRendererTurbo(this, 123, 98, textureX, textureY); // Box 49
		bodyModel[57] = new ModelRendererTurbo(this, 82, 122, textureX, textureY); // Box 49
		bodyModel[58] = new ModelRendererTurbo(this, 111, 95, textureX, textureY); // Box 49
		bodyModel[59] = new ModelRendererTurbo(this, 227, 124, textureX, textureY); // Box 49
		bodyModel[60] = new ModelRendererTurbo(this, 28, 37, textureX, textureY); // Box 72
		bodyModel[61] = new ModelRendererTurbo(this, 27, 48, textureX, textureY); // Box 87
		bodyModel[62] = new ModelRendererTurbo(this, 21, 49, textureX, textureY); // Box 87
		bodyModel[63] = new ModelRendererTurbo(this, 26, 51, textureX, textureY); // Box 87
		bodyModel[64] = new ModelRendererTurbo(this, 107, 88, textureX, textureY); // Box 49
		bodyModel[65] = new ModelRendererTurbo(this, 169, 88, textureX, textureY); // Box 49
		bodyModel[66] = new ModelRendererTurbo(this, 91, 128, textureX, textureY); // Box 49
		bodyModel[67] = new ModelRendererTurbo(this, 153, 128, textureX, textureY); // Box 49
		bodyModel[68] = new ModelRendererTurbo(this, 116, 88, textureX, textureY); // Box 49
		bodyModel[69] = new ModelRendererTurbo(this, 100, 128, textureX, textureY); // Box 49
		bodyModel[70] = new ModelRendererTurbo(this, 26, 49, textureX, textureY); // Box 87
		bodyModel[71] = new ModelRendererTurbo(this, 184, 49, textureX, textureY); // Box 87
		bodyModel[72] = new ModelRendererTurbo(this, 189, 49, textureX, textureY); // Box 87
		bodyModel[73] = new ModelRendererTurbo(this, 71, 24, textureX, textureY); // Box 42
		bodyModel[74] = new ModelRendererTurbo(this, 71, 13, textureX, textureY); // Box 215
		bodyModel[75] = new ModelRendererTurbo(this, 47, 24, textureX, textureY); // Box 42
		bodyModel[76] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Box 215
		bodyModel[77] = new ModelRendererTurbo(this, 137, 179, textureX, textureY); // Box 302
		bodyModel[78] = new ModelRendererTurbo(this, 97, 179, textureX, textureY); // Box 302
		bodyModel[79] = new ModelRendererTurbo(this, 4, 21, textureX, textureY); // Box 199
		bodyModel[80] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 36
		bodyModel[81] = new ModelRendererTurbo(this, 1, 202, textureX, textureY); // Box 49
		bodyModel[82] = new ModelRendererTurbo(this, 1, 229, textureX, textureY); // Box 49
		bodyModel[83] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 49
		bodyModel[84] = new ModelRendererTurbo(this, 27, 205, textureX, textureY); // Box 49
		bodyModel[85] = new ModelRendererTurbo(this, 47, 205, textureX, textureY); // Box 49
		bodyModel[86] = new ModelRendererTurbo(this, 32, 205, textureX, textureY); // Box 49
		bodyModel[87] = new ModelRendererTurbo(this, 37, 205, textureX, textureY); // Box 49
		bodyModel[88] = new ModelRendererTurbo(this, 42, 205, textureX, textureY); // Box 49
		bodyModel[89] = new ModelRendererTurbo(this, 16, 205, textureX, textureY); // Box 49
		bodyModel[90] = new ModelRendererTurbo(this, 11, 205, textureX, textureY); // Box 49
		bodyModel[91] = new ModelRendererTurbo(this, 6, 205, textureX, textureY); // Box 49
		bodyModel[92] = new ModelRendererTurbo(this, 1, 205, textureX, textureY); // Box 49
		bodyModel[93] = new ModelRendererTurbo(this, 21, 232, textureX, textureY); // Box 49
		bodyModel[94] = new ModelRendererTurbo(this, 27, 232, textureX, textureY); // Box 49
		bodyModel[95] = new ModelRendererTurbo(this, 47, 232, textureX, textureY); // Box 49
		bodyModel[96] = new ModelRendererTurbo(this, 32, 232, textureX, textureY); // Box 49
		bodyModel[97] = new ModelRendererTurbo(this, 37, 232, textureX, textureY); // Box 49
		bodyModel[98] = new ModelRendererTurbo(this, 42, 232, textureX, textureY); // Box 49
		bodyModel[99] = new ModelRendererTurbo(this, 16, 232, textureX, textureY); // Box 49
		bodyModel[100] = new ModelRendererTurbo(this, 11, 232, textureX, textureY); // Box 49
		bodyModel[101] = new ModelRendererTurbo(this, 6, 232, textureX, textureY); // Box 49
		bodyModel[102] = new ModelRendererTurbo(this, 1, 232, textureX, textureY); // Box 49
		bodyModel[103] = new ModelRendererTurbo(this, 59, 239, textureX, textureY); // Box 49
		bodyModel[104] = new ModelRendererTurbo(this, 52, 237, textureX, textureY); // Box 49
		bodyModel[105] = new ModelRendererTurbo(this, 52, 216, textureX, textureY); // Box 49
		bodyModel[106] = new ModelRendererTurbo(this, 216, 121, textureX, textureY); // Box 49
		bodyModel[107] = new ModelRendererTurbo(this, 216, 121, textureX, textureY); // Box 49
		bodyModel[108] = new ModelRendererTurbo(this, 217, 109, textureX, textureY); // Box 49
		bodyModel[109] = new ModelRendererTurbo(this, 222, 103, textureX, textureY); // Box 49
		bodyModel[110] = new ModelRendererTurbo(this, 222, 103, textureX, textureY); // Box 49
		bodyModel[111] = new ModelRendererTurbo(this, 217, 103, textureX, textureY); // Box 49
		bodyModel[112] = new ModelRendererTurbo(this, 217, 103, textureX, textureY); // Box 49
		bodyModel[113] = new ModelRendererTurbo(this, 217, 116, textureX, textureY); // Box 49
		bodyModel[114] = new ModelRendererTurbo(this, 217, 116, textureX, textureY); // Box 49
		bodyModel[115] = new ModelRendererTurbo(this, 216, 142, textureX, textureY); // Box 49
		bodyModel[116] = new ModelRendererTurbo(this, 216, 142, textureX, textureY); // Box 49
		bodyModel[117] = new ModelRendererTurbo(this, 217, 130, textureX, textureY); // Box 49
		bodyModel[118] = new ModelRendererTurbo(this, 222, 124, textureX, textureY); // Box 49
		bodyModel[119] = new ModelRendererTurbo(this, 222, 124, textureX, textureY); // Box 49
		bodyModel[120] = new ModelRendererTurbo(this, 217, 124, textureX, textureY); // Box 49
		bodyModel[121] = new ModelRendererTurbo(this, 217, 124, textureX, textureY); // Box 49
		bodyModel[122] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 49
		bodyModel[123] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 49
		bodyModel[124] = new ModelRendererTurbo(this, 186, 17, textureX, textureY); // Box 189
		bodyModel[125] = new ModelRendererTurbo(this, 186, 17, textureX, textureY); // Box 189
		bodyModel[126] = new ModelRendererTurbo(this, 186, 17, textureX, textureY); // Box 189
		bodyModel[127] = new ModelRendererTurbo(this, 186, 17, textureX, textureY); // Box 189
		bodyModel[128] = new ModelRendererTurbo(this, 186, 17, textureX, textureY); // Box 189
		bodyModel[129] = new ModelRendererTurbo(this, 186, 17, textureX, textureY); // Box 189
		bodyModel[130] = new ModelRendererTurbo(this, 186, 17, textureX, textureY); // Box 189
		bodyModel[131] = new ModelRendererTurbo(this, 186, 17, textureX, textureY); // Box 189
		bodyModel[132] = new ModelRendererTurbo(this, 186, 17, textureX, textureY); // Box 189
		bodyModel[133] = new ModelRendererTurbo(this, 49, 39, textureX, textureY); // Box 189
		bodyModel[134] = new ModelRendererTurbo(this, 49, 39, textureX, textureY); // Box 189
		bodyModel[135] = new ModelRendererTurbo(this, 49, 39, textureX, textureY); // Box 189
		bodyModel[136] = new ModelRendererTurbo(this, 49, 39, textureX, textureY); // Box 189
		bodyModel[137] = new ModelRendererTurbo(this, 49, 39, textureX, textureY); // Box 189
		bodyModel[138] = new ModelRendererTurbo(this, 49, 39, textureX, textureY); // Box 189
		bodyModel[139] = new ModelRendererTurbo(this, 49, 39, textureX, textureY); // Box 189
		bodyModel[140] = new ModelRendererTurbo(this, 49, 39, textureX, textureY); // Box 189
		bodyModel[141] = new ModelRendererTurbo(this, 49, 39, textureX, textureY); // Box 189
		bodyModel[142] = new ModelRendererTurbo(this, 61, 160, textureX, textureY); // Box 39
		bodyModel[143] = new ModelRendererTurbo(this, 59, 157, textureX, textureY); // Box 39

		bodyModel[0].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-26F, 5F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[1].setRotationPoint(35.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 71, 2, 5, 0F); // Box 0
		bodyModel[2].setRotationPoint(-35.5F, 3F, -2.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[3].setRotationPoint(-38.5F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[4].setRotationPoint(22F, 5F, -2F);

		bodyModel[5].addBox(0F, -1F, 0F, 10, 2, 0, 0F); // Box 80
		bodyModel[5].setRotationPoint(-36.5F, 5F, 1.5F);
		bodyModel[5].rotateAngleY = 1.37881011F;
		bodyModel[5].rotateAngleZ = 0.10471976F;

		bodyModel[6].addBox(-10F, -1F, 0F, 10, 2, 0, 0F); // Box 81
		bodyModel[6].setRotationPoint(36.5F, 5F, -1.5F);
		bodyModel[6].rotateAngleY = 1.37881011F;
		bodyModel[6].rotateAngleZ = -0.10471976F;

		bodyModel[7].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[7].setRotationPoint(9F, 5F, -7.5F);
		bodyModel[7].rotateAngleX = -0.78539816F;

		bodyModel[8].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[8].setRotationPoint(11F, 5F, -7.5F);
		bodyModel[8].rotateAngleX = -0.78539816F;

		bodyModel[9].addShapeBox(0F, -1F, -1F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[9].setRotationPoint(-12F, 5.75F, 4.5F);
		bodyModel[9].rotateAngleX = -0.78539816F;

		bodyModel[10].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 119
		bodyModel[10].setRotationPoint(-14F, 5.75F, 4.5F);
		bodyModel[10].rotateAngleX = -0.78539816F;

		bodyModel[11].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[11].setRotationPoint(-16.75F, 5.26F, 1F);
		bodyModel[11].rotateAngleY = -0.31415927F;

		bodyModel[12].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[12].setRotationPoint(-17F, 5.25F, 0F);
		bodyModel[12].rotateAngleY = -0.31415927F;

		bodyModel[13].addBox(-0.5F, 0F, -2F, 1, 0, 5, 0F); // Box 122
		bodyModel[13].setRotationPoint(12F, 5.26F, 0F);
		bodyModel[13].rotateAngleY = -0.10471976F;

		bodyModel[14].addBox(-0.5F, 0F, 0F, 1, 0, 29, 0F); // Box 124
		bodyModel[14].setRotationPoint(-17F, 5.26F, 0F);
		bodyModel[14].rotateAngleY = -1.57079633F;

		bodyModel[15].addBox(-5.5F, -0.75F, -0.5F, 5, 0, 1, 0F); // Box 202
		bodyModel[15].setRotationPoint(-16.75F, 6.01F, -2.5F);
		bodyModel[15].rotateAngleY = -0.19198622F;
		bodyModel[15].rotateAngleZ = 0.13962634F;

		bodyModel[16].addBox(-11.5F, -0.75F, -0.5F, 11, 0, 1, 0F); // Box 128
		bodyModel[16].setRotationPoint(11.5F, 6.01F, 2.5F);
		bodyModel[16].rotateAngleY = -3.21140582F;
		bodyModel[16].rotateAngleZ = 0.06981317F;

		bodyModel[17].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 129
		bodyModel[17].setRotationPoint(-11.5F, 3F, 3.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 302
		bodyModel[18].setRotationPoint(10F, 2.5F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 42
		bodyModel[19].setRotationPoint(-25.5F, 2.8F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 215
		bodyModel[20].setRotationPoint(-25.5F, 2.8F, 2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 216
		bodyModel[21].setRotationPoint(22.5F, 2.8F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 217
		bodyModel[22].setRotationPoint(22.5F, 2.8F, 2F);

		bodyModel[23].addBox(0F, 0F, 0F, 22, 1, 0, 0F); // Box 40
		bodyModel[23].setRotationPoint(-35.5F, 4.5F, 3.51F);
		bodyModel[23].rotateAngleY = 0.04363323F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[24].setRotationPoint(-35.5F, -3F, 3.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 67, 2, 20, 0F); // Box 34
		bodyModel[25].setRotationPoint(-33.5F, 1F, -10F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 22, 23, 0F); // Box 36
		bodyModel[26].setRotationPoint(-34.5F, -19F, -11.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 69, 2, 10, 0F,0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[27].setRotationPoint(-34.5F, -21F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 69, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 39
		bodyModel[28].setRotationPoint(-34.5F, -21F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 number shit
		bodyModel[29].setRotationPoint(34.51F, -18F, 4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 number shit
		bodyModel[30].setRotationPoint(-34.51F, -18F, -10F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 22, 23, 0F); // Box 36
		bodyModel[31].setRotationPoint(33.5F, -19F, -11.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 27, 22, 1, 0F); // Box 49
		bodyModel[32].setRotationPoint(-33.5F, -19F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 106
		bodyModel[33].setRotationPoint(-8.5F, -19F, -12F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[34].setRotationPoint(-6.5F, 3F, -12F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(-34.5F, 4F, 11.01F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[36].setRotationPoint(-34.5F, 4F, -11.01F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[37].setRotationPoint(30.5F, 4F, 11.01F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[38].setRotationPoint(30.5F, 4F, -11.01F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[39].setRotationPoint(34.25F, -7F, 6.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[40].setRotationPoint(30.49F, -8.01F, 10.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[41].setRotationPoint(34.25F, -7F, -10.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[42].setRotationPoint(-35.25F, -7F, 6.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cull
		bodyModel[43].setRotationPoint(-35.25F, -7F, -10.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[44].setRotationPoint(-34.49F, -7.01F, 10.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[45].setRotationPoint(30.49F, -8.01F, -11.75F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[46].setRotationPoint(-34.49F, -7.01F, -11.75F);

		bodyModel[47].addBox(0F, 0F, 0F, 69, 1, 0, 0F); // Box 49
		bodyModel[47].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 69, 1, 0, 0F); // Box 49
		bodyModel[48].setRotationPoint(-34.5F, 3F, 11F);

		bodyModel[49].addBox(0F, 0F, 0F, 27, 22, 1, 0F); // Box 49
		bodyModel[49].setRotationPoint(6.5F, -19F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 13, 2, 1, 0F); // Box 49
		bodyModel[50].setRotationPoint(-6.5F, 1F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 49
		bodyModel[51].setRotationPoint(-6.5F, -19F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 13, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[52].setRotationPoint(-6.5F, -18F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 27, 22, 1, 0F); // Box 49
		bodyModel[53].setRotationPoint(-33.5F, -19F, 10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[54].setRotationPoint(-19.5F, -19F, 11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[55].setRotationPoint(-19.5F, 3F, 11F);

		bodyModel[56].addBox(0F, 0F, 0F, 27, 22, 1, 0F); // Box 49
		bodyModel[56].setRotationPoint(6.5F, -19F, 10F);

		bodyModel[57].addBox(0F, 0F, 0F, 13, 2, 1, 0F); // Box 49
		bodyModel[57].setRotationPoint(-6.5F, 1F, 10F);

		bodyModel[58].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 49
		bodyModel[58].setRotationPoint(-6.5F, -19F, 10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 13, 19, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[59].setRotationPoint(-6.5F, -18F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 72
		bodyModel[60].setRotationPoint(-36.01F, -6.5F, 2F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[61].setRotationPoint(-36F, -5.5F, 3F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 0, 12, 0F); // Box 87
		bodyModel[62].setRotationPoint(-36F, 0.5F, -6F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 87
		bodyModel[63].setRotationPoint(-35.5F, -6F, 2.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[64].setRotationPoint(-17F, 4F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[65].setRotationPoint(13F, 4F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[66].setRotationPoint(-17F, 4F, 11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[67].setRotationPoint(13F, 4F, 11F);

		bodyModel[68].addBox(0F, 0F, 0F, 26, 1, 0, 0F); // Box 49
		bodyModel[68].setRotationPoint(-13F, 4F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 26, 1, 0, 0F); // Box 49
		bodyModel[69].setRotationPoint(-13F, 4F, 11F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 0, 12, 0F); // Box 87
		bodyModel[70].setRotationPoint(-36F, -7F, -6F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 0, 12, 0F); // Box 87
		bodyModel[71].setRotationPoint(34F, 0.5F, -6F);

		bodyModel[72].addBox(0F, 0F, 0F, 2, 0, 12, 0F); // Box 87
		bodyModel[72].setRotationPoint(34F, -7F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 42
		bodyModel[73].setRotationPoint(6.5F, 2.8F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 215
		bodyModel[74].setRotationPoint(6.5F, 2.8F, 2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 42
		bodyModel[75].setRotationPoint(-8.5F, 2.8F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 215
		bodyModel[76].setRotationPoint(-8.5F, 2.8F, 2F);

		bodyModel[77].addBox(0F, 0F, 0F, 13, 4, 6, 0F); // Box 302
		bodyModel[77].setRotationPoint(-6.5F, 3F, -10F);

		bodyModel[78].addBox(0F, 0F, 0F, 13, 4, 6, 0F); // Box 302
		bodyModel[78].setRotationPoint(-6.5F, 3F, 4F);

		bodyModel[79].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[79].setRotationPoint(12F, 5.25F, 0F);
		bodyModel[79].rotateAngleY = -0.12217305F;

		bodyModel[80].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Box 36
		bodyModel[80].setRotationPoint(26.5F, -19F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 67, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[81].setRotationPoint(-33.5F, -19F, -11.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 67, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[82].setRotationPoint(-33.5F, -19F, 10.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[83].setRotationPoint(-7.5F, -18F, -11.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[84].setRotationPoint(6.5F, -18F, -11.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[85].setRotationPoint(24.5F, -18F, -11.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[86].setRotationPoint(11.5F, -18F, -11.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[87].setRotationPoint(16.5F, -18F, -11.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[88].setRotationPoint(21.5F, -18F, -11.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[89].setRotationPoint(-12.5F, -18F, -11.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[90].setRotationPoint(-17.5F, -18F, -11.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[91].setRotationPoint(-22.5F, -18F, -11.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[92].setRotationPoint(-27.5F, -18F, -11.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[93].setRotationPoint(-7.5F, -18F, 10.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[94].setRotationPoint(6.5F, -18F, 10.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[95].setRotationPoint(24.5F, -18F, 10.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[96].setRotationPoint(11.5F, -18F, 10.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[97].setRotationPoint(16.5F, -18F, 10.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[98].setRotationPoint(21.5F, -18F, 10.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[99].setRotationPoint(-12.5F, -18F, 10.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[100].setRotationPoint(-17.5F, -18F, 10.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[101].setRotationPoint(-22.5F, -18F, 10.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[102].setRotationPoint(-27.5F, -18F, 10.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 49
		bodyModel[103].setRotationPoint(27.5F, -7F, 11.01F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F); // Box 49
		bodyModel[104].setRotationPoint(29.5F, -18F, 11.01F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 12, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 49
		bodyModel[105].setRotationPoint(27.5F, -6F, -11.01F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[106].setRotationPoint(-4.5F, -6F, -11.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 1F, -0.5F); // Box 49
		bodyModel[107].setRotationPoint(0.5F, -6F, -11.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[108].setRotationPoint(-0.5F, -6.75F, -11.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[109].setRotationPoint(-5.5F, -16F, -11.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[110].setRotationPoint(4.5F, -16F, -11.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[111].setRotationPoint(-5.5F, -18F, -11.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[112].setRotationPoint(4.5F, -18F, -11.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		bodyModel[113].setRotationPoint(-5.5F, 0F, -11.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		bodyModel[114].setRotationPoint(4.5F, 0F, -11.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[115].setRotationPoint(-4.5F, -6F, 10.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 1F, 0F); // Box 49
		bodyModel[116].setRotationPoint(0.5F, -6F, 10.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[117].setRotationPoint(-0.5F, -6.75F, 11.25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[118].setRotationPoint(-5.5F, -16F, 10.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[119].setRotationPoint(4.5F, -16F, 10.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[120].setRotationPoint(-5.5F, -18F, 10.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[121].setRotationPoint(4.5F, -18F, 10.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 49
		bodyModel[122].setRotationPoint(-5.5F, 0F, 10.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 49
		bodyModel[123].setRotationPoint(4.5F, 0F, 10.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 189
		bodyModel[124].setRotationPoint(34.5F, -15.5F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 189
		bodyModel[125].setRotationPoint(34.5F, -13.5F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 189
		bodyModel[126].setRotationPoint(34.5F, -11.5F, -10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 189
		bodyModel[127].setRotationPoint(34.5F, -9.5F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 189
		bodyModel[128].setRotationPoint(34.5F, -7.5F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 189
		bodyModel[129].setRotationPoint(34.5F, -5.5F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 189
		bodyModel[130].setRotationPoint(34.5F, -3.5F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 189
		bodyModel[131].setRotationPoint(34.5F, -1.5F, -10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 189
		bodyModel[132].setRotationPoint(34.5F, 0.5F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 189
		bodyModel[133].setRotationPoint(-35.5F, -15.5F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 189
		bodyModel[134].setRotationPoint(-35.5F, -13.5F, -10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 189
		bodyModel[135].setRotationPoint(-35.5F, -11.5F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 189
		bodyModel[136].setRotationPoint(-35.5F, -9.5F, -10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 189
		bodyModel[137].setRotationPoint(-35.5F, -7.5F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 189
		bodyModel[138].setRotationPoint(-35.5F, -5.5F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 189
		bodyModel[139].setRotationPoint(-35.5F, -3.5F, -10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 189
		bodyModel[140].setRotationPoint(-35.5F, -1.5F, -10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 189
		bodyModel[141].setRotationPoint(-35.5F, 0.5F, -10F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 39
		bodyModel[142].setRotationPoint(31.5F, -21F, 5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 39
		bodyModel[143].setRotationPoint(30.5F, -22F, 5F);
	}
	Model70TonTruck2 truck = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 144; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==18900){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.5,0.0,-0.0);
		truck.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.0,-0.0,0.00);
		truck.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }
}