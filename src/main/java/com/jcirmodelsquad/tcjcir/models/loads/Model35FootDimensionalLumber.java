//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: pipe falling sfx 1
// Model Creator: biba
// Created on: 10.06.2023 - 17:24:09
// Last changed on: 10.06.2023 - 17:24:09

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Model35FootDimensionalLumber extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public Model35FootDimensionalLumber() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[58];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 91
		bodyModel[14] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 92
		bodyModel[15] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 93
		bodyModel[16] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 94
		bodyModel[17] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 95
		bodyModel[18] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 96
		bodyModel[19] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 97
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		bodyModel[26] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 104
		bodyModel[27] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 105
		bodyModel[28] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 106
		bodyModel[29] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 107
		bodyModel[30] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 108
		bodyModel[31] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 109
		bodyModel[32] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 110
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		bodyModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115
		bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		bodyModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 119
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 120
		bodyModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 121
		bodyModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 122
		bodyModel[45] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 123
		bodyModel[46] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 124
		bodyModel[47] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 125
		bodyModel[48] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 126
		bodyModel[49] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 127
		bodyModel[50] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 129
		bodyModel[52] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 130
		bodyModel[53] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 131
		bodyModel[54] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 132
		bodyModel[55] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 133
		bodyModel[56] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 134
		bodyModel[57] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 136

		bodyModel[0].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 1
		bodyModel[0].setRotationPoint(-20.5F, -1.5F, -7.25F);

		bodyModel[1].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 2
		bodyModel[1].setRotationPoint(-20.5F, -1.5F, -4.75F);

		bodyModel[2].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 3
		bodyModel[2].setRotationPoint(-20.5F, -1.5F, -2.25F);

		bodyModel[3].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 4
		bodyModel[3].setRotationPoint(-20.5F, -1.5F, 2.75F);

		bodyModel[4].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 5
		bodyModel[4].setRotationPoint(-20.5F, -1.5F, 0.25F);

		bodyModel[5].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 7
		bodyModel[5].setRotationPoint(-20.5F, -1.5F, 5.25F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(-18.5F, 0F, -8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(17.5F, 0F, -8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(11.5F, 0F, -8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(-11.5F, 0F, -8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(-5.5F, 0F, -8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[11].setRotationPoint(5.5F, 0F, -8.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[12].setRotationPoint(0F, 0F, -8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[13].setRotationPoint(-18.5F, -2.5F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[14].setRotationPoint(-11.5F, -2.5F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[15].setRotationPoint(-5.5F, -2.5F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[16].setRotationPoint(0F, -2.5F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[17].setRotationPoint(11.5F, -2.5F, -8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[18].setRotationPoint(5.5F, -2.5F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[19].setRotationPoint(17.5F, -2.5F, -8.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 98
		bodyModel[20].setRotationPoint(-20.5F, -4F, 5.25F);

		bodyModel[21].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 99
		bodyModel[21].setRotationPoint(-20.5F, -4F, 2.75F);

		bodyModel[22].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 100
		bodyModel[22].setRotationPoint(-20.5F, -4F, 0.25F);

		bodyModel[23].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 101
		bodyModel[23].setRotationPoint(-20.5F, -4F, -2.25F);

		bodyModel[24].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 102
		bodyModel[24].setRotationPoint(-20.5F, -4F, -4.75F);

		bodyModel[25].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 103
		bodyModel[25].setRotationPoint(-20.5F, -4F, -7.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[26].setRotationPoint(-18.5F, -7.5F, -8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[27].setRotationPoint(-11.5F, -7.5F, -8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[28].setRotationPoint(-5.5F, -7.5F, -8.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[29].setRotationPoint(0F, -7.5F, -8.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[30].setRotationPoint(11.5F, -7.5F, -8.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[31].setRotationPoint(5.5F, -7.5F, -8.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[32].setRotationPoint(17.5F, -7.5F, -8.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 111
		bodyModel[33].setRotationPoint(-20.5F, -9F, 5.25F);

		bodyModel[34].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 112
		bodyModel[34].setRotationPoint(-20.5F, -9F, 2.75F);

		bodyModel[35].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 113
		bodyModel[35].setRotationPoint(-20.5F, -9F, 0.25F);

		bodyModel[36].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 114
		bodyModel[36].setRotationPoint(-20.5F, -9F, -2.25F);

		bodyModel[37].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 115
		bodyModel[37].setRotationPoint(-20.5F, -9F, -4.75F);

		bodyModel[38].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 116
		bodyModel[38].setRotationPoint(-20.5F, -9F, -7.25F);

		bodyModel[39].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 117
		bodyModel[39].setRotationPoint(-20.5F, -6.5F, 5.25F);

		bodyModel[40].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 118
		bodyModel[40].setRotationPoint(-20.5F, -6.5F, 2.75F);

		bodyModel[41].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 119
		bodyModel[41].setRotationPoint(-20.5F, -6.5F, 0.25F);

		bodyModel[42].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 120
		bodyModel[42].setRotationPoint(-20.5F, -6.5F, -2.25F);

		bodyModel[43].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 121
		bodyModel[43].setRotationPoint(-20.5F, -6.5F, -4.75F);

		bodyModel[44].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 122
		bodyModel[44].setRotationPoint(-20.5F, -6.5F, -7.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[45].setRotationPoint(-18.5F, -5F, -8.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[46].setRotationPoint(-11.5F, -5F, -8.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[47].setRotationPoint(-5.5F, -5F, -8.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[48].setRotationPoint(0F, -5F, -8.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[49].setRotationPoint(5.5F, -5F, -8.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[50].setRotationPoint(11.5F, -5F, -8.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[51].setRotationPoint(17.5F, -5F, -8.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 130
		bodyModel[52].setRotationPoint(-8.5F, -9F, -7.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 131
		bodyModel[53].setRotationPoint(8.5F, -9F, -7.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 132
		bodyModel[54].setRotationPoint(-8.5F, -9F, 7.25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 133
		bodyModel[55].setRotationPoint(8.5F, -9F, 7.25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 0, 14, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 134
		bodyModel[56].setRotationPoint(-8.5F, -9.04F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 0, 14, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 136
		bodyModel[57].setRotationPoint(8.5F, -9.04F, -7F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 58; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
}