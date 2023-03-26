//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Vanderback Tender Truck
// Model Creator: biba
// Created on: 24.03.2023 - 17:41:17
// Last changed on: 24.03.2023 - 17:41:17

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelvanderback_truck extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Modelvanderback_truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[38];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 14, 12, textureX, textureY); // Box 305
		bodyModel[1] = new ModelRendererTurbo(this, 10, 22, textureX, textureY); // Box 306
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 307 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 308 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 309 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 10, 22, textureX, textureY); // Box 310
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 311 wheel
		bodyModel[7] = new ModelRendererTurbo(this, 14, 12, textureX, textureY); // Box 312
		bodyModel[8] = new ModelRendererTurbo(this, 14, 12, textureX, textureY); // Box 313
		bodyModel[9] = new ModelRendererTurbo(this, 14, 12, textureX, textureY); // Box 314
		bodyModel[10] = new ModelRendererTurbo(this, 47, 1, textureX, textureY); // Box 4
		bodyModel[11] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Box 26
		bodyModel[12] = new ModelRendererTurbo(this, 48, 5, textureX, textureY); // Box 71
		bodyModel[13] = new ModelRendererTurbo(this, 21, 6, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 17, 12, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 21, 6, textureX, textureY); // Box 89
		bodyModel[16] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 144
		bodyModel[17] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 144
		bodyModel[18] = new ModelRendererTurbo(this, 45, 10, textureX, textureY); // Box 45
		bodyModel[19] = new ModelRendererTurbo(this, 55, 10, textureX, textureY); // Box 52
		bodyModel[20] = new ModelRendererTurbo(this, 47, 1, textureX, textureY); // Box 55
		bodyModel[21] = new ModelRendererTurbo(this, 55, 10, textureX, textureY); // Box 69
		bodyModel[22] = new ModelRendererTurbo(this, 45, 10, textureX, textureY); // Box 70
		bodyModel[23] = new ModelRendererTurbo(this, 48, 5, textureX, textureY); // Box 73
		bodyModel[24] = new ModelRendererTurbo(this, 50, 9, textureX, textureY); // Box 74
		bodyModel[25] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 75
		bodyModel[26] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 76
		bodyModel[27] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Box 77
		bodyModel[28] = new ModelRendererTurbo(this, 46, 26, textureX, textureY); // Box 48
		bodyModel[29] = new ModelRendererTurbo(this, 46, 22, textureX, textureY); // Box 50
		bodyModel[30] = new ModelRendererTurbo(this, 46, 26, textureX, textureY); // Box 60
		bodyModel[31] = new ModelRendererTurbo(this, 46, 22, textureX, textureY); // Box 62
		bodyModel[32] = new ModelRendererTurbo(this, 46, 22, textureX, textureY); // Box 402
		bodyModel[33] = new ModelRendererTurbo(this, 46, 26, textureX, textureY); // Box 403
		bodyModel[34] = new ModelRendererTurbo(this, 46, 26, textureX, textureY); // Box 404
		bodyModel[35] = new ModelRendererTurbo(this, 46, 22, textureX, textureY); // Box 405
		bodyModel[36] = new ModelRendererTurbo(this, 22, 1, textureX, textureY); // Box 406
		bodyModel[37] = new ModelRendererTurbo(this, 50, 9, textureX, textureY); // Box 37

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 305
		bodyModel[0].setRotationPoint(-6F, 6F, -8.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[1].setRotationPoint(-6F, 6F, -8F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 307 wheel
		bodyModel[2].setRotationPoint(-5F, 7F, -6F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 308 wheel
		bodyModel[3].setRotationPoint(-5F, 7F, 6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 309 wheel
		bodyModel[4].setRotationPoint(5F, 7F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[5].setRotationPoint(4F, 6F, -8F);

		bodyModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 311 wheel
		bodyModel[6].setRotationPoint(5F, 7F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 312
		bodyModel[7].setRotationPoint(4F, 6F, -8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 313
		bodyModel[8].setRotationPoint(4F, 6F, 7.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 314
		bodyModel[9].setRotationPoint(-6F, 6F, 7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[10].setRotationPoint(-2F, 5F, -8.25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[11].setRotationPoint(-2F, 8F, -8.25F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 71
		bodyModel[12].setRotationPoint(-1.5F, 5.75F, -8.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[13].setRotationPoint(-2F, 5.75F, -6.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 23
		bodyModel[14].setRotationPoint(-2F, 5.75F, -3.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F); // Box 89
		bodyModel[15].setRotationPoint(-2F, 5.75F, 3.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[16].setRotationPoint(-1.1F, 5F, -8.74F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 144
		bodyModel[17].setRotationPoint(0.100000000000001F, 5F, -8.74F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		bodyModel[18].setRotationPoint(-2F, 6F, -8.25F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 52
		bodyModel[19].setRotationPoint(1F, 6F, -8.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[20].setRotationPoint(-2F, 5F, 6.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 69
		bodyModel[21].setRotationPoint(1F, 6F, 6.25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 70
		bodyModel[22].setRotationPoint(-2F, 6F, 6.25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 73
		bodyModel[23].setRotationPoint(-1.5F, 5.75F, 6.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[24].setRotationPoint(-1F, 4.75F, 7.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 75
		bodyModel[25].setRotationPoint(-1.1F, 5F, 6.74F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F); // Box 76
		bodyModel[26].setRotationPoint(0.100000000000001F, 5F, 6.74F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 77
		bodyModel[27].setRotationPoint(-2F, 8F, 6.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[28].setRotationPoint(-7F, 7.5F, -8.25F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 50
		bodyModel[29].setRotationPoint(-7F, 5.5F, -8.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[30].setRotationPoint(-7F, 7.5F, 6.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 62
		bodyModel[31].setRotationPoint(-7F, 5.5F, 6.25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[32].setRotationPoint(2F, 5.5F, 6.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[33].setRotationPoint(2F, 7.5F, 6.25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[34].setRotationPoint(2F, 7.5F, -8.25F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 405
		bodyModel[35].setRotationPoint(2F, 5.5F, -8.25F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[36].setRotationPoint(-1.5F, 5.25F, -1.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 37
		bodyModel[37].setRotationPoint(-1F, 4.75F, -8.75F);
	}
}