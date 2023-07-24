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

public class ModelLargeBungalo extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelLargeBungalo() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[26];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 27
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 28
		bodyModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 30
		bodyModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 31
		bodyModel[5] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 32
		bodyModel[6] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 33
		bodyModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 34
		bodyModel[8] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 35
		bodyModel[9] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 44
		bodyModel[10] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 48
		bodyModel[11] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 49
		bodyModel[12] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 50
		bodyModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 70
		bodyModel[14] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 71
		bodyModel[15] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 72
		bodyModel[16] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 73
		bodyModel[17] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 74
		bodyModel[18] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 75
		bodyModel[19] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 76
		bodyModel[20] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 77
		bodyModel[21] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 84
		bodyModel[22] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 85
		bodyModel[23] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 95
		bodyModel[24] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 96
		bodyModel[25] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 97

		bodyModel[0].addBox(0F, 0F, 0F, 32, 30, 1, 0F); // Box 25
		bodyModel[0].setRotationPoint(-24F, -22F, -24F);

		bodyModel[1].addBox(0F, 0F, 0F, 33, 2, 33, 0F); // Box 27
		bodyModel[1].setRotationPoint(-24.5F, 8F, -24.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 16, 26, 1, 0F); // Box 28
		bodyModel[2].setRotationPoint(-16F, -20F, 7.15F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 30, 30, 0F); // Box 30
		bodyModel[3].setRotationPoint(7F, -22F, -23F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 30, 30, 0F); // Box 31
		bodyModel[4].setRotationPoint(-24F, -22F, -23F);

		bodyModel[5].addBox(0F, 0F, 0F, 8, 30, 1, 0F); // Box 32
		bodyModel[5].setRotationPoint(-24F, -22F, 7F);

		bodyModel[6].addBox(0F, 0F, 0F, 8, 30, 1, 0F); // Box 33
		bodyModel[6].setRotationPoint(0F, -22F, 7F);

		bodyModel[7].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 34
		bodyModel[7].setRotationPoint(-16F, -22F, 7F);

		bodyModel[8].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 35
		bodyModel[8].setRotationPoint(-16F, 6F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 33, 1, 17, 0F,-16.5F, 4F, -0.5F, -16.5F, 4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -16.5F, 0F, -0.5F, -16.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[9].setRotationPoint(-24.5F, -23F, -8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 33, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, -16.5F, 4F, -0.5F, -16.5F, 4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -16.5F, 0F, -0.5F, -16.5F, 0F, -0.5F); // Box 48
		bodyModel[10].setRotationPoint(-24.5F, -23F, -24.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 1, 33, 0F,0F, 0F, 0F, -0.5F, 4F, -16.5F, -0.5F, 4F, -16.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -16.5F, -0.5F, 0F, -16.5F, 0F, 0F, 0F); // Box 49
		bodyModel[11].setRotationPoint(-24.5F, -23F, -24.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 17, 1, 33, 0F,-0.5F, 4F, -16.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 4F, -16.5F, -0.5F, 0F, -16.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -16.5F); // Box 50
		bodyModel[12].setRotationPoint(-8.5F, -23F, -24.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 70
		bodyModel[13].setRotationPoint(-10.75F, -17F, 7.25F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 71
		bodyModel[14].setRotationPoint(-10.75F, -17.5F, 7.25F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 72
		bodyModel[15].setRotationPoint(-10.75F, -18F, 7.25F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 73
		bodyModel[16].setRotationPoint(-10.75F, -18.5F, 7.25F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 74
		bodyModel[17].setRotationPoint(-10.75F, 3F, 7.25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 75
		bodyModel[18].setRotationPoint(-10.75F, 2.5F, 7.25F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 76
		bodyModel[19].setRotationPoint(-10.75F, 2F, 7.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 77
		bodyModel[20].setRotationPoint(-10.75F, 1.5F, 7.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[21].setRotationPoint(-2.5F, -9.5F, 7.7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[22].setRotationPoint(-2.5F, -9F, 8.2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[23].setRotationPoint(-16.25F, -8.25F, 7.3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[24].setRotationPoint(-16.25F, -16.5F, 7.3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[25].setRotationPoint(-16.25F, 0F, 7.3F);
	}
}