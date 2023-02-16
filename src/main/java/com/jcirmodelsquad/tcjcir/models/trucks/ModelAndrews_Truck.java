//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FrictionTruck
// Model Creator: Bidahochi
// Created on: 06.08.2021 - 22:57:38
// Last changed on: 06.08.2021 - 22:57:38

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelAndrews_Truck extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelAndrews_Truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[68];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 77, 16, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 144
		bodyModel[8] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 144
		bodyModel[9] = new ModelRendererTurbo(this, 53, 15, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 47, 9, textureX, textureY); // Box 61
		bodyModel[11] = new ModelRendererTurbo(this, 77, 12, textureX, textureY); // Box 71
		bodyModel[12] = new ModelRendererTurbo(this, 79, 20, textureX, textureY); // Box 72
		bodyModel[13] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 62
		bodyModel[14] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 64
		bodyModel[15] = new ModelRendererTurbo(this, 54, 1, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 24, 5, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 72, 8, textureX, textureY); // Box 78
		bodyModel[19] = new ModelRendererTurbo(this, 68, 12, textureX, textureY); // Box 81
		bodyModel[20] = new ModelRendererTurbo(this, 104, 11, textureX, textureY); // Box 87
		bodyModel[21] = new ModelRendererTurbo(this, 111, 9, textureX, textureY); // Box 89
		bodyModel[22] = new ModelRendererTurbo(this, 64, 16, textureX, textureY); // Box 95
		bodyModel[23] = new ModelRendererTurbo(this, 96, 16, textureX, textureY); // Box 98
		bodyModel[24] = new ModelRendererTurbo(this, 101, 15, textureX, textureY); // Box 94
		bodyModel[25] = new ModelRendererTurbo(this, 90, 12, textureX, textureY); // Box 97
		bodyModel[26] = new ModelRendererTurbo(this, 54, 11, textureX, textureY); // Box 102
		bodyModel[27] = new ModelRendererTurbo(this, 90, 16, textureX, textureY); // Box 103
		bodyModel[28] = new ModelRendererTurbo(this, 68, 16, textureX, textureY); // Box 104
		bodyModel[29] = new ModelRendererTurbo(this, 54, 29, textureX, textureY); // Box 105
		bodyModel[30] = new ModelRendererTurbo(this, 47, 27, textureX, textureY); // Box 108
		bodyModel[31] = new ModelRendererTurbo(this, 72, 26, textureX, textureY); // Box 112
		bodyModel[32] = new ModelRendererTurbo(this, 104, 29, textureX, textureY); // Box 115
		bodyModel[33] = new ModelRendererTurbo(this, 111, 27, textureX, textureY); // Box 116
		bodyModel[34] = new ModelRendererTurbo(this, 68, 30, textureX, textureY); // Box 120
		bodyModel[35] = new ModelRendererTurbo(this, 68, 34, textureX, textureY); // Box 121
		bodyModel[36] = new ModelRendererTurbo(this, 90, 30, textureX, textureY); // Box 122
		bodyModel[37] = new ModelRendererTurbo(this, 90, 34, textureX, textureY); // Box 123
		bodyModel[38] = new ModelRendererTurbo(this, 101, 33, textureX, textureY); // Box 124
		bodyModel[39] = new ModelRendererTurbo(this, 77, 34, textureX, textureY); // Box 125
		bodyModel[40] = new ModelRendererTurbo(this, 53, 33, textureX, textureY); // Box 126
		bodyModel[41] = new ModelRendererTurbo(this, 64, 34, textureX, textureY); // Box 129
		bodyModel[42] = new ModelRendererTurbo(this, 96, 34, textureX, textureY); // Box 131
		bodyModel[43] = new ModelRendererTurbo(this, 79, 38, textureX, textureY); // Box 133
		bodyModel[44] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 136
		bodyModel[45] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 137
		bodyModel[46] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 138
		bodyModel[47] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 140
		bodyModel[48] = new ModelRendererTurbo(this, 2, 13, textureX, textureY); // Box 141
		bodyModel[49] = new ModelRendererTurbo(this, 2, 13, textureX, textureY); // Box 142
		bodyModel[50] = new ModelRendererTurbo(this, 77, 30, textureX, textureY); // Box 88
		bodyModel[51] = new ModelRendererTurbo(this, 39, 1, textureX, textureY); // Box 89
		bodyModel[52] = new ModelRendererTurbo(this, 8, 21, textureX, textureY); // Box 88
		bodyModel[53] = new ModelRendererTurbo(this, 8, 21, textureX, textureY); // Box 51
		bodyModel[54] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 67
		bodyModel[55] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 68
		bodyModel[56] = new ModelRendererTurbo(this, 110, 17, textureX, textureY); // Box 133
		bodyModel[57] = new ModelRendererTurbo(this, 46, 17, textureX, textureY); // Box 133
		bodyModel[58] = new ModelRendererTurbo(this, 46, 35, textureX, textureY); // Box 94
		bodyModel[59] = new ModelRendererTurbo(this, 110, 35, textureX, textureY); // Box 95
		bodyModel[60] = new ModelRendererTurbo(this, 62, 37, textureX, textureY); // Box 129
		bodyModel[61] = new ModelRendererTurbo(this, 61, 29, textureX, textureY); // Box 105
		bodyModel[62] = new ModelRendererTurbo(this, 97, 29, textureX, textureY); // Box 115
		bodyModel[63] = new ModelRendererTurbo(this, 96, 37, textureX, textureY); // Box 131
		bodyModel[64] = new ModelRendererTurbo(this, 97, 11, textureX, textureY); // Box 68
		bodyModel[65] = new ModelRendererTurbo(this, 61, 11, textureX, textureY); // Box 69
		bodyModel[66] = new ModelRendererTurbo(this, 96, 19, textureX, textureY); // Box 70
		bodyModel[67] = new ModelRendererTurbo(this, 62, 19, textureX, textureY); // Box 71

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 14
		bodyModel[0].setRotationPoint(-6F, 6F, -8F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 16 wheel
		bodyModel[1].setRotationPoint(-5F, 7F, -5.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 22
		bodyModel[2].setRotationPoint(4F, 6F, -8F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 44 wheel
		bodyModel[3].setRotationPoint(5F, 7F, -5.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 45 wheel
		bodyModel[4].setRotationPoint(5F, 7F, 5.5F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[5].setRotationPoint(-5F, 7F, 5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 6
		bodyModel[6].setRotationPoint(-1.5F, 8F, -7.75F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, -0.25F, 0F, -4.5F, -0.25F); // Box 144
		bodyModel[7].setRotationPoint(-1.1F, 5F, -8.24F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, -0.25F, 0F, -4.5F, -0.25F); // Box 144
		bodyModel[8].setRotationPoint(0.1F, 5F, -8.24F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -0.5F, -1F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, -0.5F, 0F, -1F, -0.5F); // Box 18
		bodyModel[9].setRotationPoint(-4F, 6F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 61
		bodyModel[10].setRotationPoint(-6F, 5F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 71
		bodyModel[11].setRotationPoint(-1.5F, 5.75F, -8.25F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F); // Box 72
		bodyModel[12].setRotationPoint(-1F, 8F, -8.85F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, -1.25F, -0.25F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.25F, 0F, -4.25F, -0.25F); // Box 62
		bodyModel[13].setRotationPoint(0.1F, 5F, -7.24F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, -1.25F, -0.25F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.25F, 0F, -4.25F, -0.25F); // Box 64
		bodyModel[14].setRotationPoint(-1.1F, 5F, -7.24F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[15].setRotationPoint(-1.5F, 5.75F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 23
		bodyModel[16].setRotationPoint(-1.5F, 5.75F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[17].setRotationPoint(-1.5F, 4.75F, -1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 78
		bodyModel[18].setRotationPoint(-4F, 4.75F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 81
		bodyModel[19].setRotationPoint(-2.5F, 5.5F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 87
		bodyModel[20].setRotationPoint(4F, 4.75F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 89
		bodyModel[21].setRotationPoint(5.25F, 5F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 95
		bodyModel[22].setRotationPoint(-2.4F, 7.9F, -7.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 98
		bodyModel[23].setRotationPoint(1.9F, 7.9F, -7.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 2F, -0.5F); // Box 94
		bodyModel[24].setRotationPoint(1.5F, 6F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 97
		bodyModel[25].setRotationPoint(1.5F, 5.5F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 102
		bodyModel[26].setRotationPoint(-5.25F, 4.75F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, -0.5F, -0.42F, 0F, -0.5F, -0.42F, -0.5F, 0F, 0.25F, -0.5F); // Box 103
		bodyModel[27].setRotationPoint(1.5F, 5.75F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.5F, -0.42F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, -0.42F, -0.5F); // Box 104
		bodyModel[28].setRotationPoint(-2.5F, 5.75F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 105
		bodyModel[29].setRotationPoint(4F, 4.75F, 6.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 108
		bodyModel[30].setRotationPoint(5F, 5F, 6.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 112
		bodyModel[31].setRotationPoint(-4F, 4.75F, 6.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 115
		bodyModel[32].setRotationPoint(-5.25F, 4.75F, 6.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 116
		bodyModel[33].setRotationPoint(-6F, 5F, 6.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 120
		bodyModel[34].setRotationPoint(1.5F, 5.5F, 6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, -0.5F, -0.42F, 0F, -0.5F, -0.42F, -0.5F, 0F, 0.25F, -0.5F); // Box 121
		bodyModel[35].setRotationPoint(1.5F, 5.75F, 6.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 122
		bodyModel[36].setRotationPoint(-2.5F, 5.5F, 6.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.5F, -0.42F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, -0.42F, -0.5F); // Box 123
		bodyModel[37].setRotationPoint(-2.5F, 5.75F, 6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -0.5F, -1F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, -0.5F, 0F, -1F, -0.5F); // Box 124
		bodyModel[38].setRotationPoint(-4F, 6F, 6.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 125
		bodyModel[39].setRotationPoint(-1.5F, 8F, 5.75000000000001F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 2F, -0.5F); // Box 126
		bodyModel[40].setRotationPoint(1.5F, 6F, 6.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 129
		bodyModel[41].setRotationPoint(1.9F, 7.9F, 6.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 131
		bodyModel[42].setRotationPoint(-2.4F, 7.9F, 6.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Box 133
		bodyModel[43].setRotationPoint(-1F, 8F, 7.85000000000001F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, -0.25F, 0F, -4.5F, -0.25F); // Box 136
		bodyModel[44].setRotationPoint(0.1F, 5F, 6.49F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, -0.25F, 0F, -4.5F, -0.25F); // Box 137
		bodyModel[45].setRotationPoint(-1.1F, 5F, 6.49F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, -1.25F, -0.25F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.25F, 0F, -4.25F, -0.25F); // Box 138
		bodyModel[46].setRotationPoint(-1.1F, 5F, 7.49F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, -1.25F, -0.25F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.25F, 0F, -4.25F, -0.25F); // Box 140
		bodyModel[47].setRotationPoint(0.1F, 5F, 7.49F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 141
		bodyModel[48].setRotationPoint(-1.5F, 4.75F, -5.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 142
		bodyModel[49].setRotationPoint(-1.5F, 4.75F, 3.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 88
		bodyModel[50].setRotationPoint(-1.5F, 5.75F, 6.25000000000001F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F); // Box 89
		bodyModel[51].setRotationPoint(-1.5F, 5.75F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[52].setRotationPoint(-6F, 6F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[53].setRotationPoint(4F, 6F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[54].setRotationPoint(-6F, 6F, 8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[55].setRotationPoint(4F, 6F, 8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 133
		bodyModel[56].setRotationPoint(4F, 8F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 133
		bodyModel[57].setRotationPoint(-6F, 8F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 94
		bodyModel[58].setRotationPoint(4F, 8F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 95
		bodyModel[59].setRotationPoint(-6F, 8F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[60].setRotationPoint(2.4F, 8.5F, 6.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 105
		bodyModel[61].setRotationPoint(3F, 5.5F, 6.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 115
		bodyModel[62].setRotationPoint(-4F, 5.5F, 6.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[63].setRotationPoint(-4.5F, 8.5F, 6.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 68
		bodyModel[64].setRotationPoint(3F, 5.5F, -8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 69
		bodyModel[65].setRotationPoint(-4F, 5.5F, -8.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[66].setRotationPoint(2.4F, 8.5F, -7.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[67].setRotationPoint(-4.5F, 8.5F, -7.75F);
	}
}