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

public class Model35FootTies extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public Model35FootTies() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[114];

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
		bodyModel[6] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 91
		bodyModel[9] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 92
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		bodyModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		bodyModel[16] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 104
		bodyModel[17] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 105
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 119
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 120
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 121
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 122
		bodyModel[30] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 123
		bodyModel[31] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 124
		bodyModel[32] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 130
		bodyModel[33] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 132
		bodyModel[34] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 134
		bodyModel[35] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 59
		bodyModel[36] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 60
		bodyModel[37] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 61
		bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		bodyModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		bodyModel[44] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 9
		bodyModel[45] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 12
		bodyModel[46] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 91
		bodyModel[47] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 92
		bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		bodyModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		bodyModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		bodyModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		bodyModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		bodyModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		bodyModel[54] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 104
		bodyModel[55] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 105
		bodyModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		bodyModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		bodyModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		bodyModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		bodyModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115
		bodyModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		bodyModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		bodyModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		bodyModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 119
		bodyModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 120
		bodyModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 121
		bodyModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 122
		bodyModel[68] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 123
		bodyModel[69] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 124
		bodyModel[70] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 130
		bodyModel[71] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 132
		bodyModel[72] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 134
		bodyModel[73] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 59
		bodyModel[74] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 60
		bodyModel[75] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 61
		bodyModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		bodyModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		bodyModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		bodyModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		bodyModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		bodyModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		bodyModel[82] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 9
		bodyModel[83] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 12
		bodyModel[84] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 91
		bodyModel[85] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 92
		bodyModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		bodyModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		bodyModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		bodyModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		bodyModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		bodyModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		bodyModel[92] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 104
		bodyModel[93] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 105
		bodyModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		bodyModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		bodyModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		bodyModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		bodyModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115
		bodyModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		bodyModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		bodyModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		bodyModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 119
		bodyModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 120
		bodyModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 121
		bodyModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 122
		bodyModel[106] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 123
		bodyModel[107] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Box 124
		bodyModel[108] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 130
		bodyModel[109] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 132
		bodyModel[110] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 134
		bodyModel[111] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 59
		bodyModel[112] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 60
		bodyModel[113] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 61

		bodyModel[0].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 1
		bodyModel[0].setRotationPoint(-23F, -1.5F, -7.25F);

		bodyModel[1].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 2
		bodyModel[1].setRotationPoint(-23F, -1.5F, -4.75F);

		bodyModel[2].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 3
		bodyModel[2].setRotationPoint(-23F, -1.5F, -2.25F);

		bodyModel[3].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 4
		bodyModel[3].setRotationPoint(-23F, -1.5F, 2.75F);

		bodyModel[4].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 5
		bodyModel[4].setRotationPoint(-23F, -1.5F, 0.25F);

		bodyModel[5].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 7
		bodyModel[5].setRotationPoint(-23F, -1.5F, 5.25F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(-21F, 0F, -8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[7].setRotationPoint(-11F, 0F, -8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[8].setRotationPoint(-21F, -2.5F, -8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[9].setRotationPoint(-11F, -2.5F, -8.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 98
		bodyModel[10].setRotationPoint(-23F, -4F, 5.25F);

		bodyModel[11].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 99
		bodyModel[11].setRotationPoint(-23F, -4F, 2.75F);

		bodyModel[12].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 100
		bodyModel[12].setRotationPoint(-23F, -4F, 0.25F);

		bodyModel[13].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 101
		bodyModel[13].setRotationPoint(-23F, -4F, -2.25F);

		bodyModel[14].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 102
		bodyModel[14].setRotationPoint(-23F, -4F, -4.75F);

		bodyModel[15].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 103
		bodyModel[15].setRotationPoint(-23F, -4F, -7.25F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[16].setRotationPoint(-21F, -7.5F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[17].setRotationPoint(-11F, -7.5F, -8.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 111
		bodyModel[18].setRotationPoint(-23F, -9F, 5.25F);

		bodyModel[19].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 112
		bodyModel[19].setRotationPoint(-23F, -9F, 2.75F);

		bodyModel[20].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 113
		bodyModel[20].setRotationPoint(-23F, -9F, 0.25F);

		bodyModel[21].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 114
		bodyModel[21].setRotationPoint(-23F, -9F, -2.25F);

		bodyModel[22].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 115
		bodyModel[22].setRotationPoint(-23F, -9F, -4.75F);

		bodyModel[23].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 116
		bodyModel[23].setRotationPoint(-23F, -9F, -7.25F);

		bodyModel[24].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 117
		bodyModel[24].setRotationPoint(-23F, -6.5F, 5.25F);

		bodyModel[25].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 118
		bodyModel[25].setRotationPoint(-23F, -6.5F, 2.75F);

		bodyModel[26].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 119
		bodyModel[26].setRotationPoint(-23F, -6.5F, 0.25F);

		bodyModel[27].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 120
		bodyModel[27].setRotationPoint(-23F, -6.5F, -2.25F);

		bodyModel[28].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 121
		bodyModel[28].setRotationPoint(-23F, -6.5F, -4.75F);

		bodyModel[29].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 122
		bodyModel[29].setRotationPoint(-23F, -6.5F, -7.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[30].setRotationPoint(-21F, -5F, -8.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[31].setRotationPoint(-11F, -5F, -8.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 130
		bodyModel[32].setRotationPoint(-13F, -9F, -7.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 132
		bodyModel[33].setRotationPoint(-13F, -9F, 7.25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 0, 14, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 134
		bodyModel[34].setRotationPoint(-13F, -9.04F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 59
		bodyModel[35].setRotationPoint(-19F, -9F, 7.25F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 0, 14, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 60
		bodyModel[36].setRotationPoint(-19F, -9.04F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 61
		bodyModel[37].setRotationPoint(-19F, -9F, -7.25F);

		bodyModel[38].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 1
		bodyModel[38].setRotationPoint(8F, -1.5F, -7.25F);

		bodyModel[39].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 2
		bodyModel[39].setRotationPoint(8F, -1.5F, -4.75F);

		bodyModel[40].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 3
		bodyModel[40].setRotationPoint(8F, -1.5F, -2.25F);

		bodyModel[41].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 4
		bodyModel[41].setRotationPoint(8F, -1.5F, 2.75F);

		bodyModel[42].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 5
		bodyModel[42].setRotationPoint(8F, -1.5F, 0.25F);

		bodyModel[43].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 7
		bodyModel[43].setRotationPoint(8F, -1.5F, 5.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[44].setRotationPoint(10F, 0F, -8.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[45].setRotationPoint(20F, 0F, -8.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[46].setRotationPoint(10F, -2.5F, -8.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[47].setRotationPoint(20F, -2.5F, -8.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 98
		bodyModel[48].setRotationPoint(8F, -4F, 5.25F);

		bodyModel[49].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 99
		bodyModel[49].setRotationPoint(8F, -4F, 2.75F);

		bodyModel[50].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 100
		bodyModel[50].setRotationPoint(8F, -4F, 0.25F);

		bodyModel[51].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 101
		bodyModel[51].setRotationPoint(8F, -4F, -2.25F);

		bodyModel[52].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 102
		bodyModel[52].setRotationPoint(8F, -4F, -4.75F);

		bodyModel[53].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 103
		bodyModel[53].setRotationPoint(8F, -4F, -7.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[54].setRotationPoint(10F, -7.5F, -8.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[55].setRotationPoint(20F, -7.5F, -8.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 111
		bodyModel[56].setRotationPoint(8F, -9F, 5.25F);

		bodyModel[57].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 112
		bodyModel[57].setRotationPoint(8F, -9F, 2.75F);

		bodyModel[58].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 113
		bodyModel[58].setRotationPoint(8F, -9F, 0.25F);

		bodyModel[59].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 114
		bodyModel[59].setRotationPoint(8F, -9F, -2.25F);

		bodyModel[60].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 115
		bodyModel[60].setRotationPoint(8F, -9F, -4.75F);

		bodyModel[61].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 116
		bodyModel[61].setRotationPoint(8F, -9F, -7.25F);

		bodyModel[62].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 117
		bodyModel[62].setRotationPoint(8F, -6.5F, 5.25F);

		bodyModel[63].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 118
		bodyModel[63].setRotationPoint(8F, -6.5F, 2.75F);

		bodyModel[64].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 119
		bodyModel[64].setRotationPoint(8F, -6.5F, 0.25F);

		bodyModel[65].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 120
		bodyModel[65].setRotationPoint(8F, -6.5F, -2.25F);

		bodyModel[66].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 121
		bodyModel[66].setRotationPoint(8F, -6.5F, -4.75F);

		bodyModel[67].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 122
		bodyModel[67].setRotationPoint(8F, -6.5F, -7.25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[68].setRotationPoint(10F, -5F, -8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[69].setRotationPoint(20F, -5F, -8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 130
		bodyModel[70].setRotationPoint(18F, -9F, -7.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 132
		bodyModel[71].setRotationPoint(18F, -9F, 7.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 0, 14, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 134
		bodyModel[72].setRotationPoint(18F, -9.04F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 59
		bodyModel[73].setRotationPoint(12F, -9F, 7.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 0, 14, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 60
		bodyModel[74].setRotationPoint(12F, -9.04F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 61
		bodyModel[75].setRotationPoint(12F, -9F, -7.25F);

		bodyModel[76].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 1
		bodyModel[76].setRotationPoint(-7.5F, -1.5F, -7.25F);

		bodyModel[77].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 2
		bodyModel[77].setRotationPoint(-7.5F, -1.5F, -4.75F);

		bodyModel[78].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 3
		bodyModel[78].setRotationPoint(-7.5F, -1.5F, -2.25F);

		bodyModel[79].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 4
		bodyModel[79].setRotationPoint(-7.5F, -1.5F, 2.75F);

		bodyModel[80].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 5
		bodyModel[80].setRotationPoint(-7.5F, -1.5F, 0.25F);

		bodyModel[81].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 7
		bodyModel[81].setRotationPoint(-7.5F, -1.5F, 5.25F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[82].setRotationPoint(-5.5F, 0F, -8.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[83].setRotationPoint(4.5F, 0F, -8.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[84].setRotationPoint(-5.5F, -2.5F, -8.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[85].setRotationPoint(4.5F, -2.5F, -8.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 98
		bodyModel[86].setRotationPoint(-7.5F, -4F, 5.25F);

		bodyModel[87].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 99
		bodyModel[87].setRotationPoint(-7.5F, -4F, 2.75F);

		bodyModel[88].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 100
		bodyModel[88].setRotationPoint(-7.5F, -4F, 0.25F);

		bodyModel[89].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 101
		bodyModel[89].setRotationPoint(-7.5F, -4F, -2.25F);

		bodyModel[90].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 102
		bodyModel[90].setRotationPoint(-7.5F, -4F, -4.75F);

		bodyModel[91].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 103
		bodyModel[91].setRotationPoint(-7.5F, -4F, -7.25F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[92].setRotationPoint(-5.5F, -7.5F, -8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[93].setRotationPoint(4.5F, -7.5F, -8.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 111
		bodyModel[94].setRotationPoint(-7.5F, -9F, 5.25F);

		bodyModel[95].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 112
		bodyModel[95].setRotationPoint(-7.5F, -9F, 2.75F);

		bodyModel[96].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 113
		bodyModel[96].setRotationPoint(-7.5F, -9F, 0.25F);

		bodyModel[97].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 114
		bodyModel[97].setRotationPoint(-7.5F, -9F, -2.25F);

		bodyModel[98].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 115
		bodyModel[98].setRotationPoint(-7.5F, -9F, -4.75F);

		bodyModel[99].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 116
		bodyModel[99].setRotationPoint(-7.5F, -9F, -7.25F);

		bodyModel[100].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 117
		bodyModel[100].setRotationPoint(-7.5F, -6.5F, 5.25F);

		bodyModel[101].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 118
		bodyModel[101].setRotationPoint(-7.5F, -6.5F, 2.75F);

		bodyModel[102].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 119
		bodyModel[102].setRotationPoint(-7.5F, -6.5F, 0.25F);

		bodyModel[103].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 120
		bodyModel[103].setRotationPoint(-7.5F, -6.5F, -2.25F);

		bodyModel[104].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 121
		bodyModel[104].setRotationPoint(-7.5F, -6.5F, -4.75F);

		bodyModel[105].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 122
		bodyModel[105].setRotationPoint(-7.5F, -6.5F, -7.25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[106].setRotationPoint(-5.5F, -5F, -8.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[107].setRotationPoint(4.5F, -5F, -8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 130
		bodyModel[108].setRotationPoint(2.5F, -9F, -7.25F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 132
		bodyModel[109].setRotationPoint(2.5F, -9F, 7.25F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 0, 14, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 134
		bodyModel[110].setRotationPoint(2.5F, -9.04F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 59
		bodyModel[111].setRotationPoint(-3.5F, -9F, 7.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 0, 14, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 60
		bodyModel[112].setRotationPoint(-3.5F, -9.04F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 61
		bodyModel[113].setRotationPoint(-3.5F, -9F, -7.25F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 114; i++) {
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