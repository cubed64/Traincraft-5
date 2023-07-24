//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.01.2020 - 14:52:06
// Last changed on: 02.01.2020 - 14:52:06

package train.client.render.models.blocks.Crossings; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSmallBungalo extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public ModelSmallBungalo() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[23];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 16
		bodyModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 349
		bodyModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 42
		bodyModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 43
		bodyModel[13] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 44
		bodyModel[14] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 66
		bodyModel[15] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 67
		bodyModel[16] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 68
		bodyModel[17] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 69
		bodyModel[18] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 308
		bodyModel[19] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 309
		bodyModel[20] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 86
		bodyModel[21] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 87
		bodyModel[22] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 88

		bodyModel[0].addBox(0F, 0F, 0F, 16, 30, 1, 0F); // Box 1
		bodyModel[0].setRotationPoint(-8F, -22F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 17, 1, 17, 0F); // Box 2
		bodyModel[1].setRotationPoint(-8.5F, -23F, -8.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 17, 2, 17, 0F); // Box 6
		bodyModel[2].setRotationPoint(-8.5F, 8F, -8.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 30, 14, 0F); // Box 10
		bodyModel[3].setRotationPoint(-8F, -22F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 30, 14, 0F); // Box 11
		bodyModel[4].setRotationPoint(7F, -22F, -7F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 30, 1, 0F); // Box 12
		bodyModel[5].setRotationPoint(-8F, -22F, 7F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 30, 1, 0F); // Box 13
		bodyModel[6].setRotationPoint(5F, -22F, 7F);

		bodyModel[7].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 14
		bodyModel[7].setRotationPoint(-5F, -22F, 7F);

		bodyModel[8].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 15
		bodyModel[8].setRotationPoint(-5F, 6F, 7F);

		bodyModel[9].addBox(0F, 0F, 0F, 10, 26, 1, 0F); // Box 16
		bodyModel[9].setRotationPoint(-5F, -20F, 7.15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 349
		bodyModel[10].setRotationPoint(-1.75F, -18.5F, 7.25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 42
		bodyModel[11].setRotationPoint(-1.75F, -18F, 7.25F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 43
		bodyModel[12].setRotationPoint(-1.75F, -17.5F, 7.25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 44
		bodyModel[13].setRotationPoint(-1.75F, -17F, 7.25F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 66
		bodyModel[14].setRotationPoint(-1.75F, 1.5F, 7.25F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 67
		bodyModel[15].setRotationPoint(-1.75F, 2F, 7.25F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 68
		bodyModel[16].setRotationPoint(-1.75F, 2.5F, 7.25F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 69
		bodyModel[17].setRotationPoint(-1.75F, 3F, 7.25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[18].setRotationPoint(3.5F, -9F, 8.2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[19].setRotationPoint(3.5F, -9.5F, 7.7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[20].setRotationPoint(-5.25F, -16.5F, 7.3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[21].setRotationPoint(-5.25F, 0F, 7.3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[22].setRotationPoint(-5.25F, -8.25F, 7.3F);
	}
}