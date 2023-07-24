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

public class ModelMediumBungalo extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelMediumBungalo() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[41];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 7
		bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 17
		bodyModel[4] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 18
		bodyModel[5] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 19
		bodyModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 20
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 21
		bodyModel[8] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 22
		bodyModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 23
		bodyModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 24
		bodyModel[11] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 25
		bodyModel[12] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 26
		bodyModel[13] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 28
		bodyModel[14] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 29
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 50
		bodyModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 51
		bodyModel[18] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 53
		bodyModel[19] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 54
		bodyModel[20] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 55
		bodyModel[21] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 56
		bodyModel[22] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 57
		bodyModel[23] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 58
		bodyModel[24] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 59
		bodyModel[25] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 60
		bodyModel[26] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 61
		bodyModel[27] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 62
		bodyModel[28] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 63
		bodyModel[29] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 64
		bodyModel[30] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 65
		bodyModel[31] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 80
		bodyModel[32] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 81
		bodyModel[33] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 82
		bodyModel[34] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 83
		bodyModel[35] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 89
		bodyModel[36] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 90
		bodyModel[37] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 91
		bodyModel[38] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 92
		bodyModel[39] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 93
		bodyModel[40] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 94

		bodyModel[0].addBox(0F, 0F, 0F, 33, 1, 17, 0F); // Box 4
		bodyModel[0].setRotationPoint(-24.5F, -23F, -8.5F);
		bodyModel[0].rotateAngleX = 0.17453293F;

		bodyModel[1].addShapeBox(0F, 0F, 0F, 32, 3, 16, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[1].setRotationPoint(-24F, -25F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 33, 2, 17, 0F); // Box 7
		bodyModel[2].setRotationPoint(-24.5F, 8F, -8.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 30, 14, 0F); // Box 17
		bodyModel[3].setRotationPoint(7F, -22F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 32, 30, 1, 0F); // Box 18
		bodyModel[4].setRotationPoint(-24F, -22F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 30, 14, 0F); // Box 19
		bodyModel[5].setRotationPoint(-24F, -22F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 30, 1, 0F); // Box 20
		bodyModel[6].setRotationPoint(-11F, -22F, 7F);

		bodyModel[7].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 21
		bodyModel[7].setRotationPoint(-5F, 6F, 7F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 30, 1, 0F); // Box 22
		bodyModel[8].setRotationPoint(5F, -22F, 7F);

		bodyModel[9].addBox(0F, 0F, 0F, 10, 26, 1, 0F); // Box 23
		bodyModel[9].setRotationPoint(-5F, -20F, 7.15F);

		bodyModel[10].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 24
		bodyModel[10].setRotationPoint(-5F, -22F, 7F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 30, 1, 0F); // Box 25
		bodyModel[11].setRotationPoint(-24F, -22F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 26
		bodyModel[12].setRotationPoint(-21F, 6F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 10, 26, 1, 0F); // Box 28
		bodyModel[13].setRotationPoint(-21F, -20F, 7.15F);

		bodyModel[14].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 29
		bodyModel[14].setRotationPoint(-21F, -22F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 49
		bodyModel[15].setRotationPoint(-1.75F, -17.5F, 7.25F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 50
		bodyModel[16].setRotationPoint(-1.75F, -18F, 7.25F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 51
		bodyModel[17].setRotationPoint(-1.75F, -17F, 7.25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 53
		bodyModel[18].setRotationPoint(-1.75F, -16.5F, 7.25F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 54
		bodyModel[19].setRotationPoint(-17.75F, -17F, 7.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 55
		bodyModel[20].setRotationPoint(-17.75F, -17.5F, 7.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 56
		bodyModel[21].setRotationPoint(-17.75F, -18F, 7.25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 57
		bodyModel[22].setRotationPoint(-17.75F, -16.5F, 7.25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 58
		bodyModel[23].setRotationPoint(-1.75F, 2.5F, 7.25F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 59
		bodyModel[24].setRotationPoint(-1.75F, 2F, 7.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 60
		bodyModel[25].setRotationPoint(-1.75F, 1.5F, 7.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 61
		bodyModel[26].setRotationPoint(-1.75F, 1F, 7.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 62
		bodyModel[27].setRotationPoint(-17.75F, 2.5F, 7.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 63
		bodyModel[28].setRotationPoint(-17.75F, 2F, 7.25F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 64
		bodyModel[29].setRotationPoint(-17.75F, 1.5F, 7.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 65
		bodyModel[30].setRotationPoint(-17.75F, 1F, 7.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[31].setRotationPoint(-4F, -9F, 8.2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[32].setRotationPoint(-4F, -9.5F, 7.7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[33].setRotationPoint(-12.5F, -9F, 8.2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[34].setRotationPoint(-12.5F, -9.5F, 7.7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[35].setRotationPoint(4.75F, -8.25F, 7.3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[36].setRotationPoint(4.75F, -16.5F, 7.3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[37].setRotationPoint(4.75F, 0F, 7.3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[38].setRotationPoint(-21.25F, -8.25F, 7.3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[39].setRotationPoint(-21.25F, -16.5F, 7.3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[40].setRotationPoint(-21.25F, 0F, 7.3F);
	}
}