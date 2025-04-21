//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.04.2025 - 18:04:49
// Last changed on: 20.04.2025 - 18:04:49

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelMixedLogs_gsi_53_short extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelMixedLogs_gsi_53_short() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[27];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 W1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 36, textureX, textureY); // Box 199 W2
		bodyModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 47 W3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 84, textureX, textureY); // Box 48 W10
		bodyModel[4] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Box 49 W4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 50 W7
		bodyModel[6] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 51 W9
		bodyModel[7] = new ModelRendererTurbo(this, 1, 91, textureX, textureY); // Box 52 W6
		bodyModel[8] = new ModelRendererTurbo(this, 1, 79, textureX, textureY); // Box 53 W8
		bodyModel[9] = new ModelRendererTurbo(this, 1, 27, textureX, textureY); // Box 54 W11
		bodyModel[10] = new ModelRendererTurbo(this, 1, 74, textureX, textureY); // Box 55 W5
		bodyModel[11] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 56 W12
		bodyModel[12] = new ModelRendererTurbo(this, 1, 59, textureX, textureY); // Box 57 W13
		bodyModel[13] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 39, 84, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1, 59, textureX, textureY); // Box 16 w14
		bodyModel[16] = new ModelRendererTurbo(this, 1, 79, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 1, 74, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 1, 59, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 42, 43, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 1, 84, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 36, 27, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 52, 65, textureX, textureY); // Box 40

		bodyModel[0].addBox(0F, 0F, 0F, 57, 6, 6, 0F); // Box 46 W1
		bodyModel[0].setRotationPoint(-33F, 4F, 1F);

		bodyModel[1].addBox(0F, 0F, 0F, 55, 3, 3, 0F); // Box 199 W2
		bodyModel[1].setRotationPoint(-22F, 7F, -6F);

		bodyModel[2].addBox(0F, -2F, -2F, 47, 4, 4, 0F); // Box 47 W3
		bodyModel[2].setRotationPoint(-29F, 7F, -1F);
		bodyModel[2].rotateAngleX = 0.45378561F;

		bodyModel[3].addBox(0F, -1.5F, -1.5F, 50, 3, 3, 0F); // Box 48 W10
		bodyModel[3].setRotationPoint(-30F, 2.5F, 7F);
		bodyModel[3].rotateAngleX = 0.99483767F;

		bodyModel[4].addBox(0F, -1F, -1F, 47, 2, 2, 0F); // Box 49 W4
		bodyModel[4].setRotationPoint(-17F, 9F, 8F);

		bodyModel[5].addBox(0F, -2F, -2F, 51, 4, 4, 0F); // Box 50 W7
		bodyModel[5].setRotationPoint(-31F, 5F, -6.25F);
		bodyModel[5].rotateAngleX = -1.09955743F;

		bodyModel[6].addBox(0F, -3F, -3F, 49, 6, 6, 0F); // Box 51 W9
		bodyModel[6].setRotationPoint(-17F, 1F, -1.25F);
		bodyModel[6].rotateAngleX = -0.2268928F;
		bodyModel[6].rotateAngleY = -0.03490659F;

		bodyModel[7].addBox(0F, -1F, -1F, 52, 2, 2, 0F); // Box 52 W6
		bodyModel[7].setRotationPoint(-31F, 7F, 8F);

		bodyModel[8].addBox(0F, -1F, -1F, 52, 2, 2, 0F); // Box 53 W8
		bodyModel[8].setRotationPoint(-31F, 3F, 2.5F);
		bodyModel[8].rotateAngleY = 0.03490659F;

		bodyModel[9].addBox(0F, -2F, -2F, 53, 4, 4, 0F); // Box 54 W11
		bodyModel[9].setRotationPoint(-20F, 0F, 4F);

		bodyModel[10].addBox(0F, -1F, -1F, 50, 2, 2, 0F); // Box 55 W5
		bodyModel[10].setRotationPoint(-18F, 7.5F, -8F);
		bodyModel[10].rotateAngleX = -0.80285146F;

		bodyModel[11].addBox(0F, -1.5F, -1.5F, 53, 3, 3, 0F); // Box 56 W12
		bodyModel[11].setRotationPoint(-28F, 1.5F, -7F);
		bodyModel[11].rotateAngleX = 2.00712864F;

		bodyModel[12].addBox(0F, -1F, -1F, 54, 2, 2, 0F); // Box 57 W13
		bodyModel[12].setRotationPoint(-33F, -1F, -5.5F);
		bodyModel[12].rotateAngleX = 0.64577182F;
		bodyModel[12].rotateAngleY = -0.01745329F;
		bodyModel[12].rotateAngleZ = 0.01308997F;

		bodyModel[13].addBox(0F, 0F, 0F, 9, 6, 6, 0F); // Box 14
		bodyModel[13].setRotationPoint(24F, 4F, 1F);

		bodyModel[14].addBox(0F, -1.5F, -1.5F, 12, 3, 3, 0F); // Box 15
		bodyModel[14].setRotationPoint(20F, 2.5F, 7F);
		bodyModel[14].rotateAngleX = 0.99483767F;

		bodyModel[15].addBox(0F, -1F, -1F, 54, 2, 2, 0F); // Box 16 w14
		bodyModel[15].setRotationPoint(-33F, 9F, -9.25F);
		bodyModel[15].rotateAngleY = -0.01745329F;

		bodyModel[16].addBox(0F, -1F, -1F, 52, 2, 2, 0F); // Box 19
		bodyModel[16].setRotationPoint(-22F, 1F, 9.5F);
		bodyModel[16].rotateAngleX = 0.64577182F;

		bodyModel[17].addBox(0F, -1F, -1F, 7, 2, 2, 0F); // Box 20
		bodyModel[17].setRotationPoint(-29F, 1F, 9.5F);
		bodyModel[17].rotateAngleX = 0.64577182F;

		bodyModel[18].addBox(0F, -1F, -1F, 54, 2, 2, 0F); // Box 21
		bodyModel[18].setRotationPoint(-27F, -1.4F, 9.75F);
		bodyModel[18].rotateAngleX = -0.17453293F;

		bodyModel[19].addBox(0F, -2F, -2F, 47, 4, 4, 0F); // Box 22
		bodyModel[19].setRotationPoint(-29F, -4F, 0F);
		bodyModel[19].rotateAngleX = -0.06981317F;

		bodyModel[20].addBox(0F, -2F, -2F, 10, 4, 4, 0F); // Box 23
		bodyModel[20].setRotationPoint(18F, -4F, 0F);
		bodyModel[20].rotateAngleX = -0.06981317F;

		bodyModel[21].addBox(0F, -1.5F, -1.5F, 50, 3, 3, 0F); // Box 24
		bodyModel[21].setRotationPoint(-20F, -3.5F, -4.25F);
		bodyModel[21].rotateAngleX = 0.4712389F;
		bodyModel[21].rotateAngleY = -0.01745329F;
		bodyModel[21].rotateAngleZ = 0.01745329F;

		bodyModel[22].addBox(0F, -3F, -3F, 7, 6, 6, 0F); // Box 26
		bodyModel[22].setRotationPoint(-24F, 1F, -1.25F);
		bodyModel[22].rotateAngleX = -0.2268928F;
		bodyModel[22].rotateAngleY = -0.03490659F;

		bodyModel[23].addBox(0F, -2F, -2F, 47, 4, 4, 0F); // Box 27
		bodyModel[23].setRotationPoint(-32F, -3F, -8.5F);
		bodyModel[23].rotateAngleX = 2.05948852F;

		bodyModel[24].addBox(0F, -2F, -2F, 18, 4, 4, 0F); // Box 28
		bodyModel[24].setRotationPoint(15F, -3F, -8.5F);
		bodyModel[24].rotateAngleX = 2.05948852F;

		bodyModel[25].addBox(0F, -2F, -2F, 47, 4, 4, 0F); // Box 39
		bodyModel[25].setRotationPoint(-16F, -3.75F, 7.25F);
		bodyModel[25].rotateAngleX = 0.89011792F;

		bodyModel[26].addBox(0F, -2F, -2F, 15, 4, 4, 0F); // Box 40
		bodyModel[26].setRotationPoint(-31F, -3.75F, 7.25F);
		bodyModel[26].rotateAngleX = 0.89011792F;
	}
}