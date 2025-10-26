//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.05.2021 - 23:09:26
// Last changed on: 08.05.2021 - 23:09:26

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelW_A11_Truck extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelW_A11_Truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[55];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 90
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 91
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 37
		bodyModel[6] = new ModelRendererTurbo(this, 26, 2, textureX, textureY); // Box 39
		bodyModel[7] = new ModelRendererTurbo(this, 33, 11, textureX, textureY); // Box 53
		bodyModel[8] = new ModelRendererTurbo(this, 33, 15, textureX, textureY); // Box 58
		bodyModel[9] = new ModelRendererTurbo(this, 1, 30, textureX, textureY); // Box 60
		bodyModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 62
		bodyModel[11] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 63
		bodyModel[12] = new ModelRendererTurbo(this, 51, 15, textureX, textureY); // Box 66
		bodyModel[13] = new ModelRendererTurbo(this, 50, 15, textureX, textureY); // Box 67
		bodyModel[14] = new ModelRendererTurbo(this, 49, 20, textureX, textureY); // Box 37
		bodyModel[15] = new ModelRendererTurbo(this, 49, 20, textureX, textureY); // Box 37
		bodyModel[16] = new ModelRendererTurbo(this, 50, 15, textureX, textureY); // Box 37
		bodyModel[17] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 49
		bodyModel[18] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 50
		bodyModel[19] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 51
		bodyModel[20] = new ModelRendererTurbo(this, 1, 24, textureX, textureY); // Box 52
		bodyModel[21] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 53
		bodyModel[22] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 54
		bodyModel[23] = new ModelRendererTurbo(this, 33, 15, textureX, textureY); // Box 55
		bodyModel[24] = new ModelRendererTurbo(this, 26, 2, textureX, textureY); // Box 56
		bodyModel[25] = new ModelRendererTurbo(this, 26, 2, textureX, textureY); // Box 57
		bodyModel[26] = new ModelRendererTurbo(this, 26, 2, textureX, textureY); // Box 58
		bodyModel[27] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 59
		bodyModel[28] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 60
		bodyModel[29] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 62
		bodyModel[30] = new ModelRendererTurbo(this, 26, 2, textureX, textureY); // Box 63
		bodyModel[31] = new ModelRendererTurbo(this, 33, 11, textureX, textureY); // Box 66
		bodyModel[32] = new ModelRendererTurbo(this, 33, 15, textureX, textureY); // Box 67
		bodyModel[33] = new ModelRendererTurbo(this, 26, 8, textureX, textureY); // Box 68
		bodyModel[34] = new ModelRendererTurbo(this, 51, 15, textureX, textureY); // Box 69
		bodyModel[35] = new ModelRendererTurbo(this, 50, 15, textureX, textureY); // Box 70
		bodyModel[36] = new ModelRendererTurbo(this, 49, 20, textureX, textureY); // Box 71
		bodyModel[37] = new ModelRendererTurbo(this, 49, 20, textureX, textureY); // Box 72
		bodyModel[38] = new ModelRendererTurbo(this, 50, 15, textureX, textureY); // Box 73
		bodyModel[39] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 74
		bodyModel[40] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 75
		bodyModel[41] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 76
		bodyModel[42] = new ModelRendererTurbo(this, 1, 24, textureX, textureY); // Box 77
		bodyModel[43] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 78
		bodyModel[44] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 79
		bodyModel[45] = new ModelRendererTurbo(this, 33, 15, textureX, textureY); // Box 80
		bodyModel[46] = new ModelRendererTurbo(this, 26, 2, textureX, textureY); // Box 81
		bodyModel[47] = new ModelRendererTurbo(this, 26, 2, textureX, textureY); // Box 82
		bodyModel[48] = new ModelRendererTurbo(this, 26, 2, textureX, textureY); // Box 83
		bodyModel[49] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 84
		bodyModel[50] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 85
		bodyModel[51] = new ModelRendererTurbo(this, 26, 8, textureX, textureY); // Box 86
		bodyModel[52] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 87
		bodyModel[53] = new ModelRendererTurbo(this, 26, 8, textureX, textureY); // Box 88
		bodyModel[54] = new ModelRendererTurbo(this, 26, 8, textureX, textureY); // Box 89

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 90
		bodyModel[0].setRotationPoint(-7F, 7F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 91
		bodyModel[1].setRotationPoint(-8F, 6F, -10F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10
		bodyModel[2].setRotationPoint(7F, 7F, -6F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11
		bodyModel[3].setRotationPoint(7F, 7F, 6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 13
		bodyModel[4].setRotationPoint(-7F, 7F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 37
		bodyModel[5].setRotationPoint(-10.5F, 4.5F, 7.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		bodyModel[6].setRotationPoint(8F, 6F, 7.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 53
		bodyModel[7].setRotationPoint(-4F, 7.5F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F); // Box 58
		bodyModel[8].setRotationPoint(4.5F, 6.5F, 7F);

		bodyModel[9].addBox(0F, 0F, 0F, 5, 3, 15, 0F); // Box 60
		bodyModel[9].setRotationPoint(-2.5F, 4.5F, -7.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 20, 3, 10, 0F); // Box 62
		bodyModel[10].setRotationPoint(-10F, 5.5F, -5F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 63
		bodyModel[11].setRotationPoint(-2F, 3.5F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 66
		bodyModel[12].setRotationPoint(-1.5F, 5.5F, 6.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 67
		bodyModel[13].setRotationPoint(-1.5F, 7F, 6.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[14].setRotationPoint(-1.5F, 6.6F, 6.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[15].setRotationPoint(-1.5F, 5.9F, 6.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[16].setRotationPoint(-1.5F, 6.25F, 7.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 49
		bodyModel[17].setRotationPoint(-5F, 7.5F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[18].setRotationPoint(4F, 7.5F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 51
		bodyModel[19].setRotationPoint(2.5F, 4.5F, 7.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 52
		bodyModel[20].setRotationPoint(-2.5F, 4.5F, 7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 53
		bodyModel[21].setRotationPoint(-2.5F, 4.5F, 7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0.25F, 0F); // Box 54
		bodyModel[22].setRotationPoint(1.5F, 4.5F, 7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F); // Box 55
		bodyModel[23].setRotationPoint(-6.5F, 6.5F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 56
		bodyModel[24].setRotationPoint(5F, 6F, 7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 57
		bodyModel[25].setRotationPoint(-9F, 6F, 7.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[26].setRotationPoint(-6F, 6F, 7.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 59
		bodyModel[27].setRotationPoint(2.5F, 7.5F, 9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 60
		bodyModel[28].setRotationPoint(-4F, 7.5F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 62
		bodyModel[29].setRotationPoint(-10.5F, 4.5F, -9.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 63
		bodyModel[30].setRotationPoint(8F, 6F, -9.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 66
		bodyModel[31].setRotationPoint(-4F, 7.5F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F); // Box 67
		bodyModel[32].setRotationPoint(4.5F, 6.5F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.25F, 0F); // Box 68
		bodyModel[33].setRotationPoint(2.75F, 6F, -9.25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 69
		bodyModel[34].setRotationPoint(-1.5F, 5.5F, -8.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 70
		bodyModel[35].setRotationPoint(-1.5F, 7F, -8.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 71
		bodyModel[36].setRotationPoint(-1.5F, 6.6F, -9.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 72
		bodyModel[37].setRotationPoint(-1.5F, 5.9F, -9.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 73
		bodyModel[38].setRotationPoint(-1.5F, 6.25F, -10.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[39].setRotationPoint(-5F, 7.5F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[40].setRotationPoint(4F, 7.5F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 76
		bodyModel[41].setRotationPoint(2.5F, 4.5F, -9.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 77
		bodyModel[42].setRotationPoint(-2.5F, 4.5F, -9.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 78
		bodyModel[43].setRotationPoint(-2.5F, 4.5F, -9.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0.25F, 0F); // Box 79
		bodyModel[44].setRotationPoint(1.5F, 4.5F, -9.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F); // Box 80
		bodyModel[45].setRotationPoint(-6.5F, 6.5F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 81
		bodyModel[46].setRotationPoint(5F, 6F, -9.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 82
		bodyModel[47].setRotationPoint(-9F, 6F, -9.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 83
		bodyModel[48].setRotationPoint(-6F, 6F, -9.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 84
		bodyModel[49].setRotationPoint(2.5F, 7.5F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 85
		bodyModel[50].setRotationPoint(-4F, 7.5F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.25F, 0F); // Box 86
		bodyModel[51].setRotationPoint(-3.75F, 6F, -9.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 87
		bodyModel[52].setRotationPoint(6F, 6F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.25F, 0F); // Box 88
		bodyModel[53].setRotationPoint(2.75F, 6F, 8.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.25F, 0F); // Box 89
		bodyModel[54].setRotationPoint(-3.75F, 6F, 8.25F);
	}
}