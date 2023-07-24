//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.07.2019 - 15:14:15
// Last changed on: 20.07.2019 - 15:14:15

package train.client.render.models.blocks.Crossings; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelPedestrianCrossing extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelPedestrianCrossing() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[42];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 39
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 40
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 41
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 42
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 44
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 45
		bodyModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 46
		bodyModel[7] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 47
		bodyModel[8] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 48
		bodyModel[9] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 52
		bodyModel[10] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 32, 17, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 50, 27, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 55, 27, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 55, 24, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 50, 24, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 55, 21, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 55, 18, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 50, 18, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 50, 21, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 6, 30, textureX, textureY); // Box 92
		bodyModel[21] = new ModelRendererTurbo(this, 6, 26, textureX, textureY); // Box 93
		bodyModel[22] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 94
		bodyModel[23] = new ModelRendererTurbo(this, 1, 30, textureX, textureY); // Box 95
		bodyModel[24] = new ModelRendererTurbo(this, 1, 22, textureX, textureY); // Box 100
		bodyModel[25] = new ModelRendererTurbo(this, 9, 22, textureX, textureY); // Box 101
		bodyModel[26] = new ModelRendererTurbo(this, 1, 22, textureX, textureY); // Box 102
		bodyModel[27] = new ModelRendererTurbo(this, 9, 22, textureX, textureY); // Box 103
		bodyModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 104
		bodyModel[29] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 105
		bodyModel[30] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 106
		bodyModel[31] = new ModelRendererTurbo(this, 9, 14, textureX, textureY); // Box 107
		bodyModel[32] = new ModelRendererTurbo(this, 16, 26, textureX, textureY); // Box 108
		bodyModel[33] = new ModelRendererTurbo(this, 16, 29, textureX, textureY); // Box 109
		bodyModel[34] = new ModelRendererTurbo(this, 11, 29, textureX, textureY); // Box 110
		bodyModel[35] = new ModelRendererTurbo(this, 11, 26, textureX, textureY); // Box 111
		bodyModel[36] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 98
		bodyModel[37] = new ModelRendererTurbo(this, 9, 14, textureX, textureY); // Box 99
		bodyModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 100
		bodyModel[39] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 101
		bodyModel[40] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 13
		bodyModel[41] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 14

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[0].setRotationPoint(0F, -6F, -1F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 40
		bodyModel[1].setRotationPoint(0F, -6F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[2].setRotationPoint(-1F, -6F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[3].setRotationPoint(-1F, -6F, -1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 44
		bodyModel[4].setRotationPoint(-1F, 4F, -1F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 45
		bodyModel[5].setRotationPoint(-1F, 5F, -1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46
		bodyModel[6].setRotationPoint(-1.5F, 8F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
		bodyModel[7].setRotationPoint(-0.100000000000001F, 5F, 1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[8].setRotationPoint(-0.100000000000001F, 5F, -2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F); // Box 52
		bodyModel[9].setRotationPoint(-1.5F, 8.5F, -2F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 16
		bodyModel[10].setRotationPoint(-0.5F, -4.5F, 1F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 17
		bodyModel[11].setRotationPoint(-0.5F, -4.5F, -4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 19
		bodyModel[12].setRotationPoint(-0.300000000000001F, -4F, -3.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0.4F, -0.3F, -0.3F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 20
		bodyModel[13].setRotationPoint(-0.300000000000001F, -4F, -2.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0.4F, -0.3F, -0.3F); // Box 21
		bodyModel[14].setRotationPoint(-0.300000000000001F, -3F, -2.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 22
		bodyModel[15].setRotationPoint(-0.300000000000001F, -3F, -3.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 23
		bodyModel[16].setRotationPoint(-0.300000000000001F, -3F, 1.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0.4F, -0.3F, -0.3F); // Box 24
		bodyModel[17].setRotationPoint(-0.300000000000001F, -3F, 2.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0.4F, -0.3F, -0.3F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 25
		bodyModel[18].setRotationPoint(-0.300000000000001F, -4F, 2.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 26
		bodyModel[19].setRotationPoint(-0.300000000000001F, -4F, 1.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 92
		bodyModel[20].setRotationPoint(-1F, -10F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[21].setRotationPoint(-1F, -10F, -1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[22].setRotationPoint(0F, -10F, -1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 95
		bodyModel[23].setRotationPoint(0F, -10F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, 0F, -0.15F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0.1F, 0F, 0F, -0.15F, -0.5F, -0.15F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0F, 0.1F, -0.5F, 0F); // Box 100
		bodyModel[24].setRotationPoint(-1F, -10.5F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.15F, 0F, -0.15F, 0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.1F, -0.15F, -0.5F, -0.15F); // Box 101
		bodyModel[25].setRotationPoint(-1F, -10.5F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, -0.15F, 0F, -0.15F, 0F, 0F, 0.1F, 0F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.15F, -0.5F, -0.15F, 0F, -0.5F, 0.1F); // Box 102
		bodyModel[26].setRotationPoint(0F, -10.5F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.1F, -0.15F, 0F, -0.15F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, -0.15F, -0.5F, -0.15F, 0.1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 103
		bodyModel[27].setRotationPoint(0F, -10.5F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, 0F, -0.15F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0.1F, 0F, 0F, -0.15F, -0.5F, -0.15F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0F, 0.1F, -0.5F, 0F); // Box 104
		bodyModel[28].setRotationPoint(-1F, -7.5F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.1F, -0.15F, 0F, -0.15F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, -0.15F, -0.5F, -0.15F, 0.1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 105
		bodyModel[29].setRotationPoint(0F, -7.5F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, -0.15F, 0F, -0.15F, 0F, 0F, 0.1F, 0F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.15F, -0.5F, -0.15F, 0F, -0.5F, 0.1F); // Box 106
		bodyModel[30].setRotationPoint(0F, -7.5F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.15F, 0F, -0.15F, 0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.1F, -0.15F, -0.5F, -0.15F); // Box 107
		bodyModel[31].setRotationPoint(-1F, -7.5F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 108
		bodyModel[32].setRotationPoint(-1F, -7F, -1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.25F); // Box 109
		bodyModel[33].setRotationPoint(-1F, -7F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, 0F); // Box 110
		bodyModel[34].setRotationPoint(0F, -7F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 111
		bodyModel[35].setRotationPoint(0F, -7F, -1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.05F, 0F, -0.05F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, -0.05F, -0.5F, -0.05F); // Box 98
		bodyModel[36].setRotationPoint(-1F, -6.5F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, -0.05F, 0F, -0.05F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.05F, -0.5F, -0.05F, 0F, -0.5F, 0.2F); // Box 99
		bodyModel[37].setRotationPoint(0F, -6.5F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.2F, -0.05F, 0F, -0.05F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.2F, -0.05F, -0.5F, -0.05F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 100
		bodyModel[38].setRotationPoint(0F, -6.5F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.05F, -0.5F, -0.05F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 101
		bodyModel[39].setRotationPoint(-1F, -6.5F, -1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[40].setRotationPoint(-2F, 5F, -0.9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[41].setRotationPoint(1F, 5F, -0.9F);
	}
}