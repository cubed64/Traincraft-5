//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: coil_load
// Model Creator: bida
// Created on: 03.03.2024 - 09:59:16
// Last changed on: 03.03.2024 - 09:59:16

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelcoil_load extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Modelcoil_load() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[32];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 15, textureX, textureY); // Box 2 she coil on my gon till i...
		bodyModel[1] = new ModelRendererTurbo(this, 3, 50, textureX, textureY); // Box 3 she coil on my gon till i...
		bodyModel[2] = new ModelRendererTurbo(this, 3, 2, textureX, textureY); // Box 4 she coil on my gon till i...
		bodyModel[3] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 5 she coil on my gon till i...
		bodyModel[4] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 6 she coil on my gon till i...
		bodyModel[5] = new ModelRendererTurbo(this, 33, 29, textureX, textureY); // Box 7 she coil on my gon till i...
		bodyModel[6] = new ModelRendererTurbo(this, 33, 50, textureX, textureY); // Box 8 she coil on my gon till i...
		bodyModel[7] = new ModelRendererTurbo(this, 33, 34, textureX, textureY); // Box 9 she coil on my gon till i...
		bodyModel[8] = new ModelRendererTurbo(this, 1, 15, textureX, textureY); // Box 2 she coil on my gon till i...
		bodyModel[9] = new ModelRendererTurbo(this, 3, 50, textureX, textureY); // Box 3 she coil on my gon till i...
		bodyModel[10] = new ModelRendererTurbo(this, 3, 2, textureX, textureY); // Box 4 she coil on my gon till i...
		bodyModel[11] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 5 she coil on my gon till i...
		bodyModel[12] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 6 she coil on my gon till i...
		bodyModel[13] = new ModelRendererTurbo(this, 33, 29, textureX, textureY); // Box 7 she coil on my gon till i...
		bodyModel[14] = new ModelRendererTurbo(this, 33, 50, textureX, textureY); // Box 8 she coil on my gon till i...
		bodyModel[15] = new ModelRendererTurbo(this, 33, 34, textureX, textureY); // Box 9 she coil on my gon till i...
		bodyModel[16] = new ModelRendererTurbo(this, 1, 15, textureX, textureY); // Box 2 she coil on my gon till i...
		bodyModel[17] = new ModelRendererTurbo(this, 3, 50, textureX, textureY); // Box 3 she coil on my gon till i...
		bodyModel[18] = new ModelRendererTurbo(this, 3, 2, textureX, textureY); // Box 4 she coil on my gon till i...
		bodyModel[19] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 5 she coil on my gon till i...
		bodyModel[20] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 6 she coil on my gon till i...
		bodyModel[21] = new ModelRendererTurbo(this, 33, 29, textureX, textureY); // Box 7 she coil on my gon till i...
		bodyModel[22] = new ModelRendererTurbo(this, 33, 50, textureX, textureY); // Box 8 she coil on my gon till i...
		bodyModel[23] = new ModelRendererTurbo(this, 33, 34, textureX, textureY); // Box 9 she coil on my gon till i...
		bodyModel[24] = new ModelRendererTurbo(this, 1, 15, textureX, textureY); // Box 2 she coil on my gon till i...
		bodyModel[25] = new ModelRendererTurbo(this, 3, 50, textureX, textureY); // Box 3 she coil on my gon till i...
		bodyModel[26] = new ModelRendererTurbo(this, 3, 2, textureX, textureY); // Box 4 she coil on my gon till i...
		bodyModel[27] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 5 she coil on my gon till i...
		bodyModel[28] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 6 she coil on my gon till i...
		bodyModel[29] = new ModelRendererTurbo(this, 33, 29, textureX, textureY); // Box 7 she coil on my gon till i...
		bodyModel[30] = new ModelRendererTurbo(this, 33, 50, textureX, textureY); // Box 8 she coil on my gon till i...
		bodyModel[31] = new ModelRendererTurbo(this, 33, 34, textureX, textureY); // Box 9 she coil on my gon till i...

		bodyModel[0].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 2 she coil on my gon till i...
		bodyModel[0].setRotationPoint(-34F, -7F, -3.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 3 she coil on my gon till i...
		bodyModel[1].setRotationPoint(-34F, -2F, -8.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 she coil on my gon till i...
		bodyModel[2].setRotationPoint(-34F, -2F, 3.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 5 she coil on my gon till i...
		bodyModel[3].setRotationPoint(-34F, 5F, -3.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6 she coil on my gon till i...
		bodyModel[4].setRotationPoint(-34F, -2F, -3.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7 she coil on my gon till i...
		bodyModel[5].setRotationPoint(-34F, -2F, 1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8 she coil on my gon till i...
		bodyModel[6].setRotationPoint(-34F, 3F, 1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 she coil on my gon till i...
		bodyModel[7].setRotationPoint(-34F, 3F, -3.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 2 she coil on my gon till i...
		bodyModel[8].setRotationPoint(-22F, -7F, -3.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 3 she coil on my gon till i...
		bodyModel[9].setRotationPoint(-22F, -2F, -8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 she coil on my gon till i...
		bodyModel[10].setRotationPoint(-22F, -2F, 3.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 5 she coil on my gon till i...
		bodyModel[11].setRotationPoint(-22F, 5F, -3.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6 she coil on my gon till i...
		bodyModel[12].setRotationPoint(-22F, -2F, -3.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7 she coil on my gon till i...
		bodyModel[13].setRotationPoint(-22F, -2F, 1.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8 she coil on my gon till i...
		bodyModel[14].setRotationPoint(-22F, 3F, 1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 she coil on my gon till i...
		bodyModel[15].setRotationPoint(-22F, 3F, -3.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 2 she coil on my gon till i...
		bodyModel[16].setRotationPoint(12F, -7F, -3.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 3 she coil on my gon till i...
		bodyModel[17].setRotationPoint(12F, -2F, -8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 she coil on my gon till i...
		bodyModel[18].setRotationPoint(12F, -2F, 3.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 5 she coil on my gon till i...
		bodyModel[19].setRotationPoint(12F, 5F, -3.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6 she coil on my gon till i...
		bodyModel[20].setRotationPoint(12F, -2F, -3.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7 she coil on my gon till i...
		bodyModel[21].setRotationPoint(12F, -2F, 1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8 she coil on my gon till i...
		bodyModel[22].setRotationPoint(12F, 3F, 1.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 she coil on my gon till i...
		bodyModel[23].setRotationPoint(12F, 3F, -3.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 2 she coil on my gon till i...
		bodyModel[24].setRotationPoint(24F, -7F, -3.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 3 she coil on my gon till i...
		bodyModel[25].setRotationPoint(24F, -2F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 she coil on my gon till i...
		bodyModel[26].setRotationPoint(24F, -2F, 3.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 5 she coil on my gon till i...
		bodyModel[27].setRotationPoint(24F, 5F, -3.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6 she coil on my gon till i...
		bodyModel[28].setRotationPoint(24F, -2F, -3.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7 she coil on my gon till i...
		bodyModel[29].setRotationPoint(24F, -2F, 1.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8 she coil on my gon till i...
		bodyModel[30].setRotationPoint(24F, 3F, 1.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 she coil on my gon till i...
		bodyModel[31].setRotationPoint(24F, 3F, -3.5F);
	}
}