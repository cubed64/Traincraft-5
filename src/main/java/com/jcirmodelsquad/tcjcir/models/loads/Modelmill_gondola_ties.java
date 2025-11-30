//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: gondola_load_flat_aggregates_large
// Model Creator: 
// Created on: 08.02.2024 - 20:50:36
// Last changed on: 08.02.2024 - 20:50:36

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelmill_gondola_ties extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public Modelmill_gondola_ties() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[34];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 32, textureX, textureY); // Box 56
		bodyModel[1] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 55
		bodyModel[2] = new ModelRendererTurbo(this, 5, 4, textureX, textureY); // Box 58
		bodyModel[3] = new ModelRendererTurbo(this, 84, 4, textureX, textureY); // Box 59
		bodyModel[4] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 60
		bodyModel[5] = new ModelRendererTurbo(this, 5, 4, textureX, textureY); // Box 61
		bodyModel[6] = new ModelRendererTurbo(this, 84, 4, textureX, textureY); // Box 62
		bodyModel[7] = new ModelRendererTurbo(this, 5, 4, textureX, textureY); // Box 63
		bodyModel[8] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 64
		bodyModel[9] = new ModelRendererTurbo(this, 5, 4, textureX, textureY); // Box 65
		bodyModel[10] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 66
		bodyModel[11] = new ModelRendererTurbo(this, 84, 4, textureX, textureY); // Box 67
		bodyModel[12] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 68
		bodyModel[13] = new ModelRendererTurbo(this, 5, 4, textureX, textureY); // Box 69
		bodyModel[14] = new ModelRendererTurbo(this, 84, 4, textureX, textureY); // Box 70
		bodyModel[15] = new ModelRendererTurbo(this, 5, 4, textureX, textureY); // Box 71
		bodyModel[16] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 72
		bodyModel[17] = new ModelRendererTurbo(this, 5, 4, textureX, textureY); // Box 73
		bodyModel[18] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 74
		bodyModel[19] = new ModelRendererTurbo(this, 84, 4, textureX, textureY); // Box 75
		bodyModel[20] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 76
		bodyModel[21] = new ModelRendererTurbo(this, 5, 4, textureX, textureY); // Box 77
		bodyModel[22] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 78
		bodyModel[23] = new ModelRendererTurbo(this, 84, 4, textureX, textureY); // Box 79
		bodyModel[24] = new ModelRendererTurbo(this, 84, 4, textureX, textureY); // Box 80
		bodyModel[25] = new ModelRendererTurbo(this, 5, 4, textureX, textureY); // Box 81
		bodyModel[26] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 82
		bodyModel[27] = new ModelRendererTurbo(this, 84, 4, textureX, textureY); // Box 83
		bodyModel[28] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 84
		bodyModel[29] = new ModelRendererTurbo(this, 5, 4, textureX, textureY); // Box 85
		bodyModel[30] = new ModelRendererTurbo(this, 5, 4, textureX, textureY); // Box 86
		bodyModel[31] = new ModelRendererTurbo(this, 84, 4, textureX, textureY); // Box 87
		bodyModel[32] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 103
		bodyModel[33] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 35

		bodyModel[0].addShapeBox(0F, 0F, 0F, 70, 9, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[0].setRotationPoint(-35F, -7F, -7.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[1].setRotationPoint(-33F, -8F, -7.25F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[2].setRotationPoint(-31F, -8F, -7.5F);
		bodyModel[2].rotateAngleY = -0.03490659F;

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[3].setRotationPoint(-28.5F, -8F, -7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[4].setRotationPoint(-21.5F, -8F, -7.75F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[5].setRotationPoint(-26F, -8F, -7.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[6].setRotationPoint(-23.5F, -8F, -7.5F);
		bodyModel[6].rotateAngleY = 0.03490659F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[7].setRotationPoint(17.5F, -8F, -7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[8].setRotationPoint(19.5F, -8F, -7.5F);
		bodyModel[8].rotateAngleY = -0.03490659F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[9].setRotationPoint(22F, -8F, -6.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[10].setRotationPoint(24.5F, -8F, -7.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[11].setRotationPoint(27F, -8F, -7.5F);
		bodyModel[11].rotateAngleY = 0.03490659F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[12].setRotationPoint(29F, -8F, -7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[13].setRotationPoint(-19.5F, -8F, -7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[14].setRotationPoint(-17.5F, -8F, -7.25F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[15].setRotationPoint(-15.5F, -8F, -6.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[16].setRotationPoint(-11.5F, -8F, -8.25F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[17].setRotationPoint(-13.5F, -8F, -8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[18].setRotationPoint(13.5F, -8F, -7.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[19].setRotationPoint(10F, -8F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[20].setRotationPoint(8F, -8F, -7.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[21].setRotationPoint(15.5F, -8F, -8.25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[22].setRotationPoint(4F, -8F, -7.5F);
		bodyModel[22].rotateAngleY = 0.03490659F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[23].setRotationPoint(1.5F, -8F, -7.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[24].setRotationPoint(6F, -8F, -7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[25].setRotationPoint(12F, -8F, -7.5F);
		bodyModel[25].rotateAngleZ = 0.61086524F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[26].setRotationPoint(-9F, -8.75F, -7.5F);
		bodyModel[26].rotateAngleZ = -0.54105207F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[27].setRotationPoint(-5.5F, -8F, -7.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[28].setRotationPoint(-7.5F, -8F, -8.25F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[29].setRotationPoint(-3.5F, -8F, -7.5F);
		bodyModel[29].rotateAngleY = -0.03490659F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[30].setRotationPoint(-1F, -8F, -7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[31].setRotationPoint(-35F, -8F, -7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[32].setRotationPoint(31F, -8F, -6.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[33].setRotationPoint(33F, -8F, -8.5F);
	}
}