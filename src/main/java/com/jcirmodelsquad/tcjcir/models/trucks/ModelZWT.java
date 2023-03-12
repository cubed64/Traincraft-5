//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ZWT truck
// Model Creator: Bida
// Created on: 12.02.2023 - 14:58:22
// Last changed on: 12.02.2023 - 14:58:22

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelZWT extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelZWT() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[79];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 32, 43, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 whee
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 30, 20, textureX, textureY); // Box 104 smol bering
		bodyModel[6] = new ModelRendererTurbo(this, 76, 43, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 45, 27, textureX, textureY); // Box 87
		bodyModel[8] = new ModelRendererTurbo(this, 34, 28, textureX, textureY); // Box 88
		bodyModel[9] = new ModelRendererTurbo(this, 62, 28, textureX, textureY); // Box 89
		bodyModel[10] = new ModelRendererTurbo(this, 23, 27, textureX, textureY); // Box 91
		bodyModel[11] = new ModelRendererTurbo(this, 73, 27, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 16, 27, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 84, 27, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 41, 23, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 59, 23, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 16, 22, textureX, textureY, "cull"); // Box 92 cull
		bodyModel[17] = new ModelRendererTurbo(this, 23, 22, textureX, textureY, "cull"); // Box 96 cull
		bodyModel[18] = new ModelRendererTurbo(this, 42, 18, textureX, textureY); // Box 137
		bodyModel[19] = new ModelRendererTurbo(this, 58, 18, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 84, 22, textureX, textureY, "cull"); // Box 23 cull
		bodyModel[21] = new ModelRendererTurbo(this, 77, 22, textureX, textureY, "cull"); // Box 24 cull
		bodyModel[22] = new ModelRendererTurbo(this, 14, 33, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 80, 33, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 70, 20, textureX, textureY); // Box 104 smol bering
		bodyModel[25] = new ModelRendererTurbo(this, 30, 4, textureX, textureY); // Box 104 smol bering
		bodyModel[26] = new ModelRendererTurbo(this, 70, 4, textureX, textureY); // Box 104 smol bering
		bodyModel[27] = new ModelRendererTurbo(this, 45, 11, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 84, 11, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 73, 11, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 62, 12, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 59, 7, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 34, 12, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 41, 7, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 23, 11, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 16, 11, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 23, 6, textureX, textureY, "cull"); // Box 39 cull
		bodyModel[37] = new ModelRendererTurbo(this, 14, 17, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 16, 6, textureX, textureY, "cull"); // Box 41 cull
		bodyModel[39] = new ModelRendererTurbo(this, 77, 6, textureX, textureY, "cull"); // Box 42 cull
		bodyModel[40] = new ModelRendererTurbo(this, 80, 17, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 84, 6, textureX, textureY, "cull"); // Box 44 cull
		bodyModel[42] = new ModelRendererTurbo(this, 21, 46, textureX, textureY); // Box 134
		bodyModel[43] = new ModelRendererTurbo(this, 4, 43, textureX, textureY); // Box 135
		bodyModel[44] = new ModelRendererTurbo(this, 4, 43, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 21, 46, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 55, 44, textureX, textureY); // Box 49
		bodyModel[47] = new ModelRendererTurbo(this, 120, 4, textureX, textureY); // Box 111
		bodyModel[48] = new ModelRendererTurbo(this, 113, 4, textureX, textureY); // Box 123
		bodyModel[49] = new ModelRendererTurbo(this, 116, 2, textureX, textureY); // Box 124
		bodyModel[50] = new ModelRendererTurbo(this, 120, 14, textureX, textureY); // Box 185
		bodyModel[51] = new ModelRendererTurbo(this, 113, 14, textureX, textureY); // Box 186
		bodyModel[52] = new ModelRendererTurbo(this, 116, 12, textureX, textureY); // Box 189
		bodyModel[53] = new ModelRendererTurbo(this, 112, 5, textureX, textureY); // Box 121
		bodyModel[54] = new ModelRendererTurbo(this, 107, 5, textureX, textureY); // Box 173
		bodyModel[55] = new ModelRendererTurbo(this, 112, 5, textureX, textureY); // Box 58
		bodyModel[56] = new ModelRendererTurbo(this, 107, 5, textureX, textureY); // Box 59
		bodyModel[57] = new ModelRendererTurbo(this, 113, 4, textureX, textureY); // Box 60
		bodyModel[58] = new ModelRendererTurbo(this, 113, 14, textureX, textureY); // Box 61
		bodyModel[59] = new ModelRendererTurbo(this, 100, 4, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 101, 9, textureX, textureY); // Box 148
		bodyModel[61] = new ModelRendererTurbo(this, 101, 19, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 100, 14, textureX, textureY); // Box 66
		bodyModel[63] = new ModelRendererTurbo(this, 107, 15, textureX, textureY); // Box 67
		bodyModel[64] = new ModelRendererTurbo(this, 107, 15, textureX, textureY); // Box 68
		bodyModel[65] = new ModelRendererTurbo(this, 112, 15, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 112, 15, textureX, textureY); // Box 71
		bodyModel[67] = new ModelRendererTurbo(this, 103, 22, textureX, textureY); // Box 73
		bodyModel[68] = new ModelRendererTurbo(this, 113, 30, textureX, textureY); // Box 138 sprongle
		bodyModel[69] = new ModelRendererTurbo(this, 105, 30, textureX, textureY); // Box 75 sprongle
		bodyModel[70] = new ModelRendererTurbo(this, 99, 29, textureX, textureY); // Box 76
		bodyModel[71] = new ModelRendererTurbo(this, 30, 24, textureX, textureY); // Box 77
		bodyModel[72] = new ModelRendererTurbo(this, 66, 24, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 66, 8, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 37, 18, textureX, textureY); // Box 104
		bodyModel[76] = new ModelRendererTurbo(this, 37, 2, textureX, textureY); // Box 82
		bodyModel[77] = new ModelRendererTurbo(this, 42, 2, textureX, textureY); // Box 137
		bodyModel[78] = new ModelRendererTurbo(this, 58, 2, textureX, textureY); // Box 22

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-9F, 6F, -9F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[1].setRotationPoint(8F, 7F, 5.5F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 whee
		bodyModel[2].setRotationPoint(-8F, 7F, 5.5F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[3].setRotationPoint(-8F, 7F, -5.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[4].setRotationPoint(8F, 7F, -5.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104 smol bering
		bodyModel[5].setRotationPoint(-9F, 6F, -9.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[6].setRotationPoint(7F, 6F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[7].setRotationPoint(-3F, 4.75F, -8.75F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0.5F, 2.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 2.75F, 0F, 0.5F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.25F, 0F); // Box 88
		bodyModel[8].setRotationPoint(-6F, 5.75F, -8.75F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.5F, 0F, 0.5F, 2.75F, 0F, 0.5F, 2.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, -2.25F, 0F, 0.5F, -2.25F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[9].setRotationPoint(3F, 5.75F, -8.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 91
		bodyModel[10].setRotationPoint(-9.5F, 3F, -8.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[11].setRotationPoint(6.5F, 3F, -8.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[12].setRotationPoint(-10.5F, 3F, -8.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 16
		bodyModel[13].setRotationPoint(9.5F, 3F, -8.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 17
		bodyModel[14].setRotationPoint(-4F, 4.5F, -8.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 18
		bodyModel[15].setRotationPoint(3F, 4.5F, -8.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -0.5F, -0.5F, 0.5F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F); // Box 92 cull
		bodyModel[16].setRotationPoint(-11F, 5.5F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 96 cull
		bodyModel[17].setRotationPoint(-7F, 5.5F, -8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F); // Box 137
		bodyModel[18].setRotationPoint(-9F, 5F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F); // Box 22
		bodyModel[19].setRotationPoint(7F, 5F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 23 cull
		bodyModel[20].setRotationPoint(9F, 5.5F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -0.5F, -0.5F, 0.5F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F); // Box 24 cull
		bodyModel[21].setRotationPoint(5F, 5.5F, -8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25
		bodyModel[22].setRotationPoint(-9.75F, 8.26F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[23].setRotationPoint(6.25F, 8.26F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104 smol bering
		bodyModel[24].setRotationPoint(7F, 6F, -9.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104 smol bering
		bodyModel[25].setRotationPoint(-9F, 6F, 8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104 smol bering
		bodyModel[26].setRotationPoint(7F, 6F, 8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[27].setRotationPoint(-3F, 4.75F, 6.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 31
		bodyModel[28].setRotationPoint(9.5F, 3F, 6.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 32
		bodyModel[29].setRotationPoint(6.5F, 3F, 6.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.5F, 0F, 0.5F, 2.75F, 0F, 0.5F, 2.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, -2.25F, 0F, 0.5F, -2.25F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(3F, 5.75F, 6.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 34
		bodyModel[31].setRotationPoint(3F, 4.5F, 6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0.5F, 2.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 2.75F, 0F, 0.5F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.25F, 0F); // Box 35
		bodyModel[32].setRotationPoint(-6F, 5.75F, 6.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 36
		bodyModel[33].setRotationPoint(-4F, 4.5F, 6.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 37
		bodyModel[34].setRotationPoint(-9.5F, 3F, 6.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[35].setRotationPoint(-10.5F, 3F, 6.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 39 cull
		bodyModel[36].setRotationPoint(-7F, 5.5F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 40
		bodyModel[37].setRotationPoint(-9.75F, 8.26F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -0.5F, -0.5F, 0.5F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F); // Box 41 cull
		bodyModel[38].setRotationPoint(-11F, 5.5F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -0.5F, -0.75F, 0.5F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F); // Box 42 cull
		bodyModel[39].setRotationPoint(5F, 5.5F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 43
		bodyModel[40].setRotationPoint(6.25F, 8.26F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 44 cull
		bodyModel[41].setRotationPoint(9F, 5.5F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[42].setRotationPoint(-7F, 5F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[43].setRotationPoint(-10F, 6F, -5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 47
		bodyModel[44].setRotationPoint(7F, 6F, -5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 48
		bodyModel[45].setRotationPoint(3F, 5F, -5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 3, 13, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 49
		bodyModel[46].setRotationPoint(-3F, 4.75F, -6.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 111
		bodyModel[47].setRotationPoint(5F, 3.75F, 9.5F);
		bodyModel[47].rotateAngleX = -0.78539816F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 123
		bodyModel[48].setRotationPoint(3F, 4.55F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 124
		bodyModel[49].setRotationPoint(4F, 4.55F, 9.25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 185
		bodyModel[50].setRotationPoint(5F, 3.75F, -9.5F);
		bodyModel[50].rotateAngleX = -0.78539816F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 186
		bodyModel[51].setRotationPoint(3F, 4.55F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[52].setRotationPoint(4F, 4.55F, -10.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 121
		bodyModel[53].setRotationPoint(3.5F, 7F, 5.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 173
		bodyModel[54].setRotationPoint(-4.5F, 7F, 5.25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 58
		bodyModel[55].setRotationPoint(3.5F, 5F, 5.25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 59
		bodyModel[56].setRotationPoint(-4.5F, 5F, 5.25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 60
		bodyModel[57].setRotationPoint(3F, 4.55F, 5.5F);
		bodyModel[57].rotateAngleX = -1.57079633F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 61
		bodyModel[58].setRotationPoint(3F, 4.55F, -5.5F);
		bodyModel[58].rotateAngleX = -1.57079633F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[59].setRotationPoint(-4F, 4.55F, 5.5F);
		bodyModel[59].rotateAngleX = -1.57079633F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 148
		bodyModel[60].setRotationPoint(-4.25F, 8.5F, 4.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		bodyModel[61].setRotationPoint(-4.25F, 8.5F, -6.25F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[62].setRotationPoint(-4F, 4.55F, -5.5F);
		bodyModel[62].rotateAngleX = -1.57079633F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 67
		bodyModel[63].setRotationPoint(-4.5F, 7F, -5.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
		bodyModel[64].setRotationPoint(-4.5F, 5F, -5.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 70
		bodyModel[65].setRotationPoint(3.5F, 7F, -5.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 71
		bodyModel[66].setRotationPoint(3.5F, 5F, -5.75F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 73
		bodyModel[67].setRotationPoint(-2F, 4F, -2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F); // Box 138 sprongle
		bodyModel[68].setRotationPoint(-0.5F, 3.25F, -5.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F); // Box 75 sprongle
		bodyModel[69].setRotationPoint(-0.5F, 3.25F, 4.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 76
		bodyModel[70].setRotationPoint(-0.5F, 4.1F, -5.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 77
		bodyModel[71].setRotationPoint(-9.5F, 5.01F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 78
		bodyModel[72].setRotationPoint(5.5F, 5.01F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
		bodyModel[73].setRotationPoint(5.5F, 5.01F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 80
		bodyModel[74].setRotationPoint(-9.5F, 5.01F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 104
		bodyModel[75].setRotationPoint(-8.5F, 2.5F, -9.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 82
		bodyModel[76].setRotationPoint(-8.5F, 2.5F, 8.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F); // Box 137
		bodyModel[77].setRotationPoint(-9F, 5F, 7.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F); // Box 22
		bodyModel[78].setRotationPoint(7F, 5F, 7.5F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 79; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
		}
	}
}