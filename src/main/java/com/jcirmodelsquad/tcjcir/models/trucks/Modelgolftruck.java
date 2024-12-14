//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: golf truck
// Model Creator: bida
// Created on: 08.12.2024 - 11:23:14
// Last changed on: 08.12.2024 - 11:23:14

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelgolftruck extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Modelgolftruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[50];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 whee
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 12, 53, textureX, textureY); // Box 104 smol bering cab
		bodyModel[7] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 110 smol bering cab
		bodyModel[8] = new ModelRendererTurbo(this, 5, 57, textureX, textureY); // Box 339 smol bering cab
		bodyModel[9] = new ModelRendererTurbo(this, 12, 57, textureX, textureY); // Box 340 smol bering cab
		bodyModel[10] = new ModelRendererTurbo(this, 24, 46, textureX, textureY); // Box 346
		bodyModel[11] = new ModelRendererTurbo(this, 24, 46, textureX, textureY); // Box 369
		bodyModel[12] = new ModelRendererTurbo(this, 48, 20, textureX, textureY); // Box 372
		bodyModel[13] = new ModelRendererTurbo(this, 52, 27, textureX, textureY); // Box 121
		bodyModel[14] = new ModelRendererTurbo(this, 52, 27, textureX, textureY); // Box 122
		bodyModel[15] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 149
		bodyModel[16] = new ModelRendererTurbo(this, 34, 7, textureX, textureY); // Box 51
		bodyModel[17] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 52
		bodyModel[18] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 101
		bodyModel[19] = new ModelRendererTurbo(this, 34, 7, textureX, textureY); // Box 102
		bodyModel[20] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 103
		bodyModel[21] = new ModelRendererTurbo(this, 39, 10, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 39, 10, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 46, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 31, 1, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 1, 48, textureX, textureY); // Box 157
		bodyModel[27] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 158
		bodyModel[28] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Box 155
		bodyModel[29] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Box 156
		bodyModel[30] = new ModelRendererTurbo(this, 7, 48, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 7, 48, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 16, 7, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 46, 7, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 46, 1, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 31, 1, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 16, 7, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 46, 7, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 22, 20, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Box 47
		bodyModel[41] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Box 48
		bodyModel[42] = new ModelRendererTurbo(this, 7, 48, textureX, textureY); // Box 49
		bodyModel[43] = new ModelRendererTurbo(this, 7, 48, textureX, textureY); // Box 50
		bodyModel[44] = new ModelRendererTurbo(this, 1, 48, textureX, textureY); // Box 51
		bodyModel[45] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 57, 15, textureX, textureY); // Box 53
		bodyModel[47] = new ModelRendererTurbo(this, 57, 15, textureX, textureY); // Box 54
		bodyModel[48] = new ModelRendererTurbo(this, 57, 15, textureX, textureY); // Box 55
		bodyModel[49] = new ModelRendererTurbo(this, 57, 15, textureX, textureY); // Box 56

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-8F, 6F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(6F, 6F, -9F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[2].setRotationPoint(7F, 7F, 5.5F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 whee
		bodyModel[3].setRotationPoint(-7F, 7F, 5.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[4].setRotationPoint(-7F, 7F, -5.5F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[5].setRotationPoint(7F, 7F, -5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104 smol bering cab
		bodyModel[6].setRotationPoint(-8F, 6F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110 smol bering cab
		bodyModel[7].setRotationPoint(6F, 6F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 339 smol bering cab
		bodyModel[8].setRotationPoint(6F, 6F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 340 smol bering cab
		bodyModel[9].setRotationPoint(-8F, 6F, 8.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Box 346
		bodyModel[10].setRotationPoint(-8.5F, 5F, -5F);

		bodyModel[11].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Box 369
		bodyModel[11].setRotationPoint(2.5F, 5F, -5F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 372
		bodyModel[12].setRotationPoint(-2F, 3.5F, -2F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 121
		bodyModel[13].setRotationPoint(-1.5F, 3.5F, -6F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 122
		bodyModel[14].setRotationPoint(-1.5F, 3.5F, 5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 149
		bodyModel[15].setRotationPoint(-1.25F, 3.25F, 8.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 51
		bodyModel[16].setRotationPoint(-1.5F, 7F, 8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 52
		bodyModel[17].setRotationPoint(0.25F, 3.25F, 8.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 101
		bodyModel[18].setRotationPoint(-1.25F, 3.25F, -9.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[19].setRotationPoint(-1.5F, 7F, -9.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 103
		bodyModel[20].setRotationPoint(0.25F, 3.25F, -9.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-2F, 4F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-2F, 4F, 2F);

		bodyModel[23].addBox(0F, 0F, 0F, 7, 4, 1, 0F); // Box 24
		bodyModel[23].setRotationPoint(-10F, 4.5F, -8.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 7, 4, 1, 0F); // Box 25
		bodyModel[24].setRotationPoint(3F, 4.5F, -8.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 26
		bodyModel[25].setRotationPoint(-3F, 5.5F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 157
		bodyModel[26].setRotationPoint(-4.5F, 5F, -9.5F);
		bodyModel[26].rotateAngleX = -0.78539816F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 158
		bodyModel[27].setRotationPoint(2.5F, 5F, -9.5F);
		bodyModel[27].rotateAngleX = -0.78539816F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[28].setRotationPoint(4.5F, 5.9F, -10.25F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 156
		bodyModel[29].setRotationPoint(5.5F, 5.9F, -10.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(-5.5F, 5.9F, -10.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 36
		bodyModel[31].setRotationPoint(-6.5F, 5.9F, -10.25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-9F, 8.5F, -8.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(3F, 8.5F, -8.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 7, 4, 1, 0F); // Box 39
		bodyModel[34].setRotationPoint(-10F, 4.5F, 7.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 7, 4, 1, 0F); // Box 40
		bodyModel[35].setRotationPoint(3F, 4.5F, 7.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 41
		bodyModel[36].setRotationPoint(-3F, 5.5F, 7.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 42
		bodyModel[37].setRotationPoint(-9F, 8.5F, 7.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[38].setRotationPoint(3F, 8.5F, 7.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 5, 3, 15, 0F); // Box 44
		bodyModel[39].setRotationPoint(-2.5F, 6F, -7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 47
		bodyModel[40].setRotationPoint(4.5F, 5.9F, 9.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 48
		bodyModel[41].setRotationPoint(5.5F, 5.9F, 6.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 49
		bodyModel[42].setRotationPoint(-5.5F, 5.9F, 9.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F); // Box 50
		bodyModel[43].setRotationPoint(-6.5F, 5.9F, 6.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 51
		bodyModel[44].setRotationPoint(-4.5F, 5F, 9.5F);
		bodyModel[44].rotateAngleX = -0.78539816F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 52
		bodyModel[45].setRotationPoint(2.5F, 5F, 9.5F);
		bodyModel[45].rotateAngleX = -0.78539816F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 53
		bodyModel[46].setRotationPoint(-8F, 5F, -8.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 54
		bodyModel[47].setRotationPoint(6F, 5F, -8.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 55
		bodyModel[48].setRotationPoint(-8F, 5F, 7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 56
		bodyModel[49].setRotationPoint(6F, 5F, 7.5F);
	}
}