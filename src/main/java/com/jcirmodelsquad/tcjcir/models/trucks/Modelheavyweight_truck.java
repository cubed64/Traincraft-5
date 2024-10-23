//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.03.2020 - 10:15:59
// Last changed on: 29.03.2020 - 10:15:59

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelheavyweight_truck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelheavyweight_truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[59];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 90
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 91
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 94
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 97
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 56
		bodyModel[52] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 57
		bodyModel[53] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 58
		bodyModel[54] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 59
		bodyModel[55] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 62
		bodyModel[58] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 63

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 90
		bodyModel[0].setRotationPoint(-9F, 6.5F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 91
		bodyModel[1].setRotationPoint(-10F, 5.5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 94
		bodyModel[2].setRotationPoint(-1F, 5.5F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 97
		bodyModel[3].setRotationPoint(8F, 5.5F, -8F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 9
		bodyModel[4].setRotationPoint(0F, 6.5F, -6F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10
		bodyModel[5].setRotationPoint(9F, 6.5F, -6F);

		bodyModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11
		bodyModel[6].setRotationPoint(9F, 6.5F, 6F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 12
		bodyModel[7].setRotationPoint(0F, 6.5F, 6F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 13
		bodyModel[8].setRotationPoint(-9F, 6.5F, 6F);

		bodyModel[9].addBox(0F, 0F, 0F, 25, 2, 1, 0F); // Box 14
		bodyModel[9].setRotationPoint(-12.5F, 4F, -7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[10].setRotationPoint(-11F, 4F, -8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 16
		bodyModel[11].setRotationPoint(-11F, 5F, -8.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[12].setRotationPoint(-8F, 5F, -8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 18
		bodyModel[13].setRotationPoint(-2F, 5F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(1F, 5F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[15].setRotationPoint(-5F, 4F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 21
		bodyModel[16].setRotationPoint(7F, 5F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[17].setRotationPoint(10F, 5F, -8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[18].setRotationPoint(7F, 4F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[19].setRotationPoint(-10F, 5.5F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(-1F, 5.5F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[21].setRotationPoint(8F, 5.5F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 27
		bodyModel[22].setRotationPoint(-6.5F, 7F, -8F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 28
		bodyModel[23].setRotationPoint(2.5F, 7F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 29
		bodyModel[24].setRotationPoint(-8.5F, 6F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[25].setRotationPoint(-2.5F, 6F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[26].setRotationPoint(6.5F, 6F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 32
		bodyModel[27].setRotationPoint(0.5F, 6F, -8F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 33
		bodyModel[28].setRotationPoint(-1F, 4F, -8.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[29].setRotationPoint(1F, 4F, -8.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 35
		bodyModel[30].setRotationPoint(-5F, 5F, -8.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 36
		bodyModel[31].setRotationPoint(3.5F, 5F, -8.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 25, 2, 1, 0F); // Box 37
		bodyModel[32].setRotationPoint(-12.5F, 4F, 6.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(7F, 4F, 7.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(10F, 5F, 7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(7F, 5F, 7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[36].setRotationPoint(8F, 5.5F, 8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[37].setRotationPoint(-1F, 5.5F, 8F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 43
		bodyModel[38].setRotationPoint(-1F, 4F, 7.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[39].setRotationPoint(-5F, 4F, 7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[40].setRotationPoint(1F, 4F, 7.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[41].setRotationPoint(1F, 5F, 7.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 47
		bodyModel[42].setRotationPoint(-2F, 5F, 7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[43].setRotationPoint(-8F, 5F, 7.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[44].setRotationPoint(-11F, 4F, 7.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 50
		bodyModel[45].setRotationPoint(-11F, 5F, 7.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[46].setRotationPoint(-10F, 5.5F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 52
		bodyModel[47].setRotationPoint(-8.5F, 6F, 7F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 53
		bodyModel[48].setRotationPoint(-6.5F, 7F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[49].setRotationPoint(-2.5F, 6F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 55
		bodyModel[50].setRotationPoint(-5F, 5F, 7.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 56
		bodyModel[51].setRotationPoint(0.5F, 6F, 7F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 57
		bodyModel[52].setRotationPoint(2.5F, 7F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[53].setRotationPoint(6.5F, 6F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 59
		bodyModel[54].setRotationPoint(3.5F, 5F, 7.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 1, 13, 0F); // Box 60
		bodyModel[55].setRotationPoint(-5.5F, 4F, -6.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 1, 13, 0F); // Box 61
		bodyModel[56].setRotationPoint(3.5F, 4F, -6.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 62
		bodyModel[57].setRotationPoint(-5.5F, 5F, -1F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 63
		bodyModel[58].setRotationPoint(-1F, 3F, -1F);
	}
}