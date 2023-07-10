//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FB2
// Model Creator: Bida
// Created on: 16.03.2023 - 17:37:16
// Last changed on: 16.03.2023 - 17:37:16

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelFB2_new extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelFB2_new() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[91];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4 axle
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5 axel
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 48, 44, textureX, textureY); // Box 111
		bodyModel[7] = new ModelRendererTurbo(this, 53, 44, textureX, textureY); // Box 123
		bodyModel[8] = new ModelRendererTurbo(this, 56, 42, textureX, textureY); // Box 124
		bodyModel[9] = new ModelRendererTurbo(this, 56, 42, textureX, textureY); // Box 155
		bodyModel[10] = new ModelRendererTurbo(this, 53, 44, textureX, textureY); // Box 156
		bodyModel[11] = new ModelRendererTurbo(this, 48, 44, textureX, textureY); // Box 158
		bodyModel[12] = new ModelRendererTurbo(this, 40, 28, textureX, textureY); // Box 131
		bodyModel[13] = new ModelRendererTurbo(this, 54, 28, textureX, textureY); // Box 132
		bodyModel[14] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 138
		bodyModel[15] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 47, 20, textureX, textureY); // Box 104 bearing aha
		bodyModel[17] = new ModelRendererTurbo(this, 88, 28, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 102, 28, textureX, textureY); // Box 35
		bodyModel[19] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 73, 18, textureX, textureY); // Box 40
		bodyModel[22] = new ModelRendererTurbo(this, 73, 18, textureX, textureY); // Box 41
		bodyModel[23] = new ModelRendererTurbo(this, 23, 26, textureX, textureY); // Box 43
		bodyModel[24] = new ModelRendererTurbo(this, 7, 21, textureX, textureY); // Box 47
		bodyModel[25] = new ModelRendererTurbo(this, 7, 21, textureX, textureY); // Box 48
		bodyModel[26] = new ModelRendererTurbo(this, 3, 38, textureX, textureY); // Box 346
		bodyModel[27] = new ModelRendererTurbo(this, 3, 38, textureX, textureY); // Box 369
		bodyModel[28] = new ModelRendererTurbo(this, 46, 24, textureX, textureY); // Box 101
		bodyModel[29] = new ModelRendererTurbo(this, 67, 27, textureX, textureY); // Box 102
		bodyModel[30] = new ModelRendererTurbo(this, 83, 23, textureX, textureY); // Box 104
		bodyModel[31] = new ModelRendererTurbo(this, 57, 23, textureX, textureY); // Box 113
		bodyModel[32] = new ModelRendererTurbo(this, 103, 20, textureX, textureY); // Box 61
		bodyModel[33] = new ModelRendererTurbo(this, 41, 24, textureX, textureY); // Box 62
		bodyModel[34] = new ModelRendererTurbo(this, 94, 24, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 109, 22, textureX, textureY); // Box 104
		bodyModel[36] = new ModelRendererTurbo(this, 108, 19, textureX, textureY); // Box 139
		bodyModel[37] = new ModelRendererTurbo(this, 109, 30, textureX, textureY); // Box 66
		bodyModel[38] = new ModelRendererTurbo(this, 44, 33, textureX, textureY); // Box 142
		bodyModel[39] = new ModelRendererTurbo(this, 92, 33, textureX, textureY); // Box 68
		bodyModel[40] = new ModelRendererTurbo(this, 92, 17, textureX, textureY); // Box 69
		bodyModel[41] = new ModelRendererTurbo(this, 44, 17, textureX, textureY); // Box 70
		bodyModel[42] = new ModelRendererTurbo(this, 60, 19, textureX, textureY); // Box 71
		bodyModel[43] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 72
		bodyModel[44] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 73
		bodyModel[45] = new ModelRendererTurbo(this, 76, 3, textureX, textureY); // Box 74
		bodyModel[46] = new ModelRendererTurbo(this, 2, 40, textureX, textureY); // Box 75
		bodyModel[47] = new ModelRendererTurbo(this, 2, 40, textureX, textureY); // Box 76
		bodyModel[48] = new ModelRendererTurbo(this, 47, 29, textureX, textureY); // Box 77
		bodyModel[49] = new ModelRendererTurbo(this, 95, 29, textureX, textureY); // Box 78
		bodyModel[50] = new ModelRendererTurbo(this, 67, 11, textureX, textureY); // Box 79
		bodyModel[51] = new ModelRendererTurbo(this, 55, 7, textureX, textureY); // Box 80
		bodyModel[52] = new ModelRendererTurbo(this, 46, 5, textureX, textureY); // Box 81
		bodyModel[53] = new ModelRendererTurbo(this, 41, 8, textureX, textureY); // Box 82
		bodyModel[54] = new ModelRendererTurbo(this, 83, 7, textureX, textureY); // Box 83
		bodyModel[55] = new ModelRendererTurbo(this, 94, 8, textureX, textureY); // Box 84
		bodyModel[56] = new ModelRendererTurbo(this, 103, 4, textureX, textureY); // Box 85
		bodyModel[57] = new ModelRendererTurbo(this, 102, 12, textureX, textureY); // Box 86
		bodyModel[58] = new ModelRendererTurbo(this, 88, 12, textureX, textureY); // Box 87
		bodyModel[59] = new ModelRendererTurbo(this, 54, 12, textureX, textureY); // Box 88
		bodyModel[60] = new ModelRendererTurbo(this, 40, 12, textureX, textureY); // Box 89
		bodyModel[61] = new ModelRendererTurbo(this, 61, 14, textureX, textureY); // Box 90
		bodyModel[62] = new ModelRendererTurbo(this, 69, 2, textureX, textureY); // Box 92
		bodyModel[63] = new ModelRendererTurbo(this, 69, 2, textureX, textureY); // Box 93
		bodyModel[64] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 94
		bodyModel[65] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 95
		bodyModel[66] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 96
		bodyModel[67] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 97
		bodyModel[68] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Box 98
		bodyModel[69] = new ModelRendererTurbo(this, 95, 13, textureX, textureY); // Box 99
		bodyModel[70] = new ModelRendererTurbo(this, 95, 4, textureX, textureY); // Box 100 overbearing ehehaw
		bodyModel[71] = new ModelRendererTurbo(this, 35, 14, textureX, textureY); // Box 101
		bodyModel[72] = new ModelRendererTurbo(this, 35, 6, textureX, textureY); // Box 102
		bodyModel[73] = new ModelRendererTurbo(this, 34, 3, textureX, textureY); // Box 103
		bodyModel[74] = new ModelRendererTurbo(this, 60, 45, textureX, textureY); // Box 141
		bodyModel[75] = new ModelRendererTurbo(this, 60, 45, textureX, textureY); // Box 142
		bodyModel[76] = new ModelRendererTurbo(this, 60, 45, textureX, textureY); // Box 147
		bodyModel[77] = new ModelRendererTurbo(this, 60, 45, textureX, textureY); // Box 148
		bodyModel[78] = new ModelRendererTurbo(this, 60, 45, textureX, textureY); // Box 108
		bodyModel[79] = new ModelRendererTurbo(this, 60, 45, textureX, textureY); // Box 109
		bodyModel[80] = new ModelRendererTurbo(this, 60, 45, textureX, textureY); // Box 110
		bodyModel[81] = new ModelRendererTurbo(this, 60, 45, textureX, textureY); // Box 111
		bodyModel[82] = new ModelRendererTurbo(this, 80, 23, textureX, textureY); // Box 112
		bodyModel[83] = new ModelRendererTurbo(this, 66, 7, textureX, textureY); // Box 113
		bodyModel[84] = new ModelRendererTurbo(this, 65, 46, textureX, textureY); // Box 106
		bodyModel[85] = new ModelRendererTurbo(this, 65, 46, textureX, textureY); // Box 115
		bodyModel[86] = new ModelRendererTurbo(this, 109, 27, textureX, textureY, "cull"); // Box 116 cull
		bodyModel[87] = new ModelRendererTurbo(this, 35, 11, textureX, textureY, "cull"); // Box 117 cull
		bodyModel[88] = new ModelRendererTurbo(this, 83, 14, textureX, textureY); // Box 92
		bodyModel[89] = new ModelRendererTurbo(this, 83, 30, textureX, textureY); // Box 93
		bodyModel[90] = new ModelRendererTurbo(this, 61, 30, textureX, textureY); // Box 94

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 4 axle
		bodyModel[0].setRotationPoint(-8.5F, 6F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 5 axel
		bodyModel[1].setRotationPoint(6.5F, 6F, -8F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[2].setRotationPoint(7.5F, 7F, 5.5F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[3].setRotationPoint(-7.5F, 7F, 5.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[4].setRotationPoint(-7.5F, 7F, -5.5F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[5].setRotationPoint(7.5F, 7F, -5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 111
		bodyModel[6].setRotationPoint(6.25F, 3F, 9.75F);
		bodyModel[6].rotateAngleX = -0.78539816F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F); // Box 123
		bodyModel[7].setRotationPoint(4.75F, 4.2F, 6.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 124
		bodyModel[8].setRotationPoint(5.75F, 4.2F, 9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[9].setRotationPoint(-6.75F, 4.2F, -10.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 156
		bodyModel[10].setRotationPoint(-5.75F, 4.2F, -10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 158
		bodyModel[11].setRotationPoint(-8.25F, 3F, -9.75F);
		bodyModel[11].rotateAngleX = -0.78539816F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 131
		bodyModel[12].setRotationPoint(-10.75F, 5.5F, -8.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[13].setRotationPoint(-6.25F, 5.5F, -8.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 138
		bodyModel[14].setRotationPoint(-8.6F, 3F, -8.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 22
		bodyModel[15].setRotationPoint(-7.4F, 3F, -8.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104 bearing aha
		bodyModel[16].setRotationPoint(-8.5F, 6F, -9.3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 34
		bodyModel[17].setRotationPoint(4.25F, 5.5F, -8.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[18].setRotationPoint(8.75F, 5.5F, -8.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 37
		bodyModel[19].setRotationPoint(7.6F, 3F, -8.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 38
		bodyModel[20].setRotationPoint(6.4F, 3F, -8.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0.25F, -1F, 0.1F, 0.25F, -1F, 0.1F, 0.25F, -1F, 0.1F, 0.25F, -1F, 0.1F, 0.25F, -2.5F, 0.1F, 0.25F, -2.5F, 0.1F, 0.25F, -2.5F, 0.1F, 0.25F, -2.5F, 0.1F); // Box 40
		bodyModel[21].setRotationPoint(-1.4F, 3F, -8.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0.25F, -1F, 0.1F, 0.25F, -1F, 0.1F, 0.25F, -1F, 0.1F, 0.25F, -1F, 0.1F, 0.25F, -2.5F, 0.1F, 0.25F, -2.5F, 0.1F, 0.25F, -2.5F, 0.1F, 0.25F, -2.5F, 0.1F); // Box 41
		bodyModel[22].setRotationPoint(0.4F, 3F, -8.75F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 43
		bodyModel[23].setRotationPoint(-2F, 3.5F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 47
		bodyModel[24].setRotationPoint(-2.25F, 5.5F, -6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[25].setRotationPoint(1.25F, 5.5F, -6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[26].setRotationPoint(-9.5F, 5F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 369
		bodyModel[27].setRotationPoint(2.5F, 5F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.75F); // Box 101
		bodyModel[28].setRotationPoint(-9F, 3F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, -1F, -1F, 0.5F); // Box 102
		bodyModel[29].setRotationPoint(-3F, 6.5F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -2.5F, 0.5F, 0F, 3F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, 3F, 0.5F); // Box 104
		bodyModel[30].setRotationPoint(2F, 3.5F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0.5F, 0F, 0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0.5F, 0.5F, -0.5F, -0.5F); // Box 113
		bodyModel[31].setRotationPoint(-5F, 3.5F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 61
		bodyModel[32].setRotationPoint(9.25F, 3F, -8.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 62
		bodyModel[33].setRotationPoint(-10.25F, 3F, -8.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, -0.5F, 0F, 0.5F); // Box 63
		bodyModel[34].setRotationPoint(5F, 3F, -9F);

		bodyModel[35].addShapeBox(0F, 0.4F, -0.5F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 104
		bodyModel[35].setRotationPoint(7F, 3.5F, -9F);
		bodyModel[35].rotateAngleX = -0.06981317F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 139
		bodyModel[36].setRotationPoint(6.5F, 3.2F, -9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 66
		bodyModel[37].setRotationPoint(7F, 6.5F, -9.75F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 142
		bodyModel[38].setRotationPoint(-9.5F, 8.51F, -8.75F);

		bodyModel[39].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 68
		bodyModel[39].setRotationPoint(5F, 8.51F, -8.75F);

		bodyModel[40].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 69
		bodyModel[40].setRotationPoint(5F, 8.51F, 7.75F);

		bodyModel[41].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 70
		bodyModel[41].setRotationPoint(-10F, 8.51F, 7.75F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 71
		bodyModel[42].setRotationPoint(-2F, 3.5F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 72
		bodyModel[43].setRotationPoint(-2F, 3.5F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[44].setRotationPoint(-2F, 3.5F, 2F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 74
		bodyModel[45].setRotationPoint(-2F, 3.5F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F); // Box 75
		bodyModel[46].setRotationPoint(-6F, 3F, 2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F); // Box 76
		bodyModel[47].setRotationPoint(3F, 3F, -4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F); // Box 77
		bodyModel[48].setRotationPoint(-8.5F, 6F, -8.85F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F); // Box 78
		bodyModel[49].setRotationPoint(6.5F, 6F, -8.85F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[50].setRotationPoint(-2F, 6.5F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.5F, -0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, 3F, 0.5F, 0F, 3F, 0F, 0.5F, -0.5F, 0F); // Box 80
		bodyModel[51].setRotationPoint(-5F, 3.5F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.25F); // Box 81
		bodyModel[52].setRotationPoint(-9F, 3F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[53].setRotationPoint(-10.25F, 3F, 7.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -2.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 3F, 0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, 3F, 0F); // Box 83
		bodyModel[54].setRotationPoint(2F, 3.5F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, -0.5F, 0F, 0F); // Box 84
		bodyModel[55].setRotationPoint(5F, 3F, 8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 85
		bodyModel[56].setRotationPoint(9.25F, 3F, 7.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[57].setRotationPoint(8.75F, 5.5F, 7.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 87
		bodyModel[58].setRotationPoint(4.25F, 5.5F, 7.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[59].setRotationPoint(-6.25F, 5.5F, 7.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 89
		bodyModel[60].setRotationPoint(-10.75F, 5.5F, 7.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.13F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0.45F, 0F, 0.18F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, 0F, 0.18F, 0F, 0F); // Box 90
		bodyModel[61].setRotationPoint(-5F, 6F, 7.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0.25F, -1F, 0.1F, 0.25F, -1F, 0.1F, 0.25F, -1F, 0.1F, 0.25F, -1F, 0.1F, 0.25F, -2.5F, 0.1F, 0.25F, -2.5F, 0.1F, 0.25F, -2.5F, 0.1F, 0.25F, -2.5F, 0.1F); // Box 92
		bodyModel[62].setRotationPoint(0.4F, 3F, 6.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0.25F, -1F, 0.1F, 0.25F, -1F, 0.1F, 0.25F, -1F, 0.1F, 0.25F, -1F, 0.1F, 0.25F, -2.5F, 0.1F, 0.25F, -2.5F, 0.1F, 0.25F, -2.5F, 0.1F, 0.25F, -2.5F, 0.1F); // Box 93
		bodyModel[63].setRotationPoint(-1.4F, 3F, 6.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 94
		bodyModel[64].setRotationPoint(-7.4F, 3F, 7.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 95
		bodyModel[65].setRotationPoint(-8.6F, 3F, 7.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 96
		bodyModel[66].setRotationPoint(6.4F, 3F, 7.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 97
		bodyModel[67].setRotationPoint(7.6F, 3F, 7.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F); // Box 98
		bodyModel[68].setRotationPoint(-8.5F, 6F, 7.85F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F); // Box 99
		bodyModel[69].setRotationPoint(6.5F, 6F, 7.85F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 100 overbearing ehehaw
		bodyModel[70].setRotationPoint(6.5F, 6F, 8.3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 101
		bodyModel[71].setRotationPoint(-8F, 6.5F, 8.75F);

		bodyModel[72].addShapeBox(0F, 0.4F, -0.5F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 102
		bodyModel[72].setRotationPoint(-8F, 3.5F, 9F);
		bodyModel[72].rotateAngleX = 0.06981317F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 103
		bodyModel[73].setRotationPoint(-8.5F, 3.2F, 8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 141
		bodyModel[74].setRotationPoint(3.5F, 7.5F, -6.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[75].setRotationPoint(3.5F, 5.5F, -6.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[76].setRotationPoint(-4.5F, 5.5F, -6.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 148
		bodyModel[77].setRotationPoint(-4.5F, 7.5F, -6.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 108
		bodyModel[78].setRotationPoint(-4.5F, 5.5F, 5.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 109
		bodyModel[79].setRotationPoint(3.5F, 5.5F, 5.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 110
		bodyModel[80].setRotationPoint(-4.5F, 7.5F, 5.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 111
		bodyModel[81].setRotationPoint(3.5F, 7.5F, 5.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 112
		bodyModel[82].setRotationPoint(2F, 3F, -8.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 113
		bodyModel[83].setRotationPoint(-3F, 3F, 8.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[84].setRotationPoint(-3.5F, 8.25F, -6.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 115
		bodyModel[85].setRotationPoint(-3.5F, 8.25F, 5.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F); // Box 116 cull
		bodyModel[86].setRotationPoint(7F, 6F, -9.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Box 117 cull
		bodyModel[87].setRotationPoint(-8F, 6F, 8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.13F, 0.45F, 0F, -0.13F, 0.45F, 0F, 0F, 0F, 0F, 0.55F, 0F, 0F, 0.18F, 0F, 0F, 0.18F, 0F, 0F, 0.55F, 0F, 0F); // Box 92
		bodyModel[88].setRotationPoint(4F, 6F, 7.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.13F, 0.45F, 0F, -0.13F, 0.45F, 0F, 0F, 0F, 0F, 0.55F, 0F, 0F, 0.18F, 0F, 0F, 0.18F, 0F, 0F, 0.55F, 0F, 0F); // Box 93
		bodyModel[89].setRotationPoint(4F, 6F, -8.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.13F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0.45F, 0F, 0.18F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, 0F, 0.18F, 0F, 0F); // Box 94
		bodyModel[90].setRotationPoint(-5F, 6F, -8.75F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 91; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
	}
}