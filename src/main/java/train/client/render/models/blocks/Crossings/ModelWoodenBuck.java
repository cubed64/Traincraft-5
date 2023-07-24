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

public class ModelWoodenBuck extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelWoodenBuck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[10];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 114
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 117
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 136
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 137
		bodyModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 19
		bodyModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 7, 17, textureX, textureY); // Box 149
		bodyModel[8] = new ModelRendererTurbo(this, 7, 17, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 7, 17, textureX, textureY); // Box 9

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[0].setRotationPoint(-2.25F, -26F, -4.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 117
		bodyModel[1].setRotationPoint(-1.75F, -25.5F, -0.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[2].setRotationPoint(-2.25F, -28F, -1F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 137
		bodyModel[3].setRotationPoint(-1.75F, -27.5F, -0.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 19
		bodyModel[4].setRotationPoint(-1.75F, -33.5F, -0.5F);

		bodyModel[5].addShapeBox(0F, -1F, -6F, 1, 2, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[5].setRotationPoint(-2.24F, -33F, 0F);
		bodyModel[5].rotateAngleX = 0.78539816F;

		bodyModel[6].addShapeBox(0F, -1F, -6F, 1, 2, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[6].setRotationPoint(-2.26F, -33F, 0F);
		bodyModel[6].rotateAngleX = 2.35619449F;

		bodyModel[7].addBox(0F, 0F, 0F, 2, 16, 2, 0F); // Box 149
		bodyModel[7].setRotationPoint(-1F, -38F, -1F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 16, 2, 0F); // Box 8
		bodyModel[8].setRotationPoint(-1F, -22F, -1F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 16, 2, 0F); // Box 9
		bodyModel[9].setRotationPoint(-1F, -6F, -1F);
	}
}