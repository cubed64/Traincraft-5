//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: gondola_load_flat_aggregates_large
// Model Creator: 
// Created on: 08.02.2024 - 20:50:36
// Last changed on: 08.02.2024 - 20:50:36

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.client.renderhelper.ModelRenderHelper;

public class Modelmill_gondola_CSXT_tie_crib extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public Modelmill_gondola_CSXT_tie_crib() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[101];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 175, 4, textureX, textureY); // Box 61
		bodyModel[1] = new ModelRendererTurbo(this, 176, 19, textureX, textureY,"cull"); // Box 62 Ladder Cull
		bodyModel[2] = new ModelRendererTurbo(this, 190, 4, textureX, textureY); // Box 63
		bodyModel[3] = new ModelRendererTurbo(this, 190, 19, textureX, textureY,"cull"); // Box 64 ladder Cull
		bodyModel[4] = new ModelRendererTurbo(this, 196, 35, textureX, textureY); // Box 66
		bodyModel[5] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 67
		bodyModel[6] = new ModelRendererTurbo(this, 182, 35, textureX, textureY); // Box 68
		bodyModel[7] = new ModelRendererTurbo(this, 196, 35, textureX, textureY); // Box 69
		bodyModel[8] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 70
		bodyModel[9] = new ModelRendererTurbo(this, 182, 35, textureX, textureY); // Box 71
		bodyModel[10] = new ModelRendererTurbo(this, 182, 35, textureX, textureY); // Box 72
		bodyModel[11] = new ModelRendererTurbo(this, 196, 35, textureX, textureY); // Box 73
		bodyModel[12] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 74
		bodyModel[13] = new ModelRendererTurbo(this, 182, 35, textureX, textureY); // Box 75
		bodyModel[14] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 76
		bodyModel[15] = new ModelRendererTurbo(this, 196, 35, textureX, textureY); // Box 77
		bodyModel[16] = new ModelRendererTurbo(this, 182, 35, textureX, textureY); // Box 78
		bodyModel[17] = new ModelRendererTurbo(this, 196, 35, textureX, textureY); // Box 79
		bodyModel[18] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 80
		bodyModel[19] = new ModelRendererTurbo(this, 182, 35, textureX, textureY); // Box 81
		bodyModel[20] = new ModelRendererTurbo(this, 196, 35, textureX, textureY); // Box 82
		bodyModel[21] = new ModelRendererTurbo(this, 182, 35, textureX, textureY); // Box 83
		bodyModel[22] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 84
		bodyModel[23] = new ModelRendererTurbo(this, 196, 35, textureX, textureY); // Box 85
		bodyModel[24] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 86
		bodyModel[25] = new ModelRendererTurbo(this, 194, 50, textureX, textureY); // Box 87
		bodyModel[26] = new ModelRendererTurbo(this, 184, 50, textureX, textureY); // Box 88
		bodyModel[27] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 89
		bodyModel[28] = new ModelRendererTurbo(this, 2, 9, textureX, textureY); // Box 90
		bodyModel[29] = new ModelRendererTurbo(this, 176, 52, textureX, textureY); // Box 91
		bodyModel[30] = new ModelRendererTurbo(this, 169, 52, textureX, textureY); // Box 92
		bodyModel[31] = new ModelRendererTurbo(this, 138, 54, textureX, textureY); // Box 93
		bodyModel[32] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 94
		bodyModel[33] = new ModelRendererTurbo(this, 187, 65, textureX, textureY); // Box 95
		bodyModel[34] = new ModelRendererTurbo(this, 110, 56, textureX, textureY); // Box 96
		bodyModel[35] = new ModelRendererTurbo(this, 180, 65, textureX, textureY); // Box 97
		bodyModel[36] = new ModelRendererTurbo(this, 174, 65, textureX, textureY); // Box 98
		bodyModel[37] = new ModelRendererTurbo(this, 96, 64, textureX, textureY); // Box 99
		bodyModel[38] = new ModelRendererTurbo(this, 151, 65, textureX, textureY); // Box 100
		bodyModel[39] = new ModelRendererTurbo(this, 143, 65, textureX, textureY); // Box 101
		bodyModel[40] = new ModelRendererTurbo(this, 167, 65, textureX, textureY); // Box 102
		bodyModel[41] = new ModelRendererTurbo(this, 98, 56, textureX, textureY); // Box 103
		bodyModel[42] = new ModelRendererTurbo(this, 135, 65, textureX, textureY); // Box 106
		bodyModel[43] = new ModelRendererTurbo(this, 162, 52, textureX, textureY); // Box 107
		bodyModel[44] = new ModelRendererTurbo(this, 123, 54, textureX, textureY); // Box 108
		bodyModel[45] = new ModelRendererTurbo(this, 155, 52, textureX, textureY); // Box 109
		bodyModel[46] = new ModelRendererTurbo(this, 127, 65, textureX, textureY); // Box 110
		bodyModel[47] = new ModelRendererTurbo(this, 111, 64, textureX, textureY); // Box 111
		bodyModel[48] = new ModelRendererTurbo(this, 167, 73, textureX, textureY); // Box 112
		bodyModel[49] = new ModelRendererTurbo(this, 160, 73, textureX, textureY); // Box 113
		bodyModel[50] = new ModelRendererTurbo(this, 4, 15, textureX, textureY); // Box 114
		bodyModel[51] = new ModelRendererTurbo(this, 4, 15, textureX, textureY); // Box 115
		bodyModel[52] = new ModelRendererTurbo(this, 182, 35, textureX, textureY); // Box 65
		bodyModel[53] = new ModelRendererTurbo(this, 160, 65, textureX, textureY); // Box 105
		bodyModel[54] = new ModelRendererTurbo(this, 141, 19, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 1, 79, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 141, 19, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 66
		bodyModel[67] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 67
		bodyModel[68] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 68
		bodyModel[69] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 70
		bodyModel[71] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 71
		bodyModel[72] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 72
		bodyModel[73] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 73
		bodyModel[74] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 74
		bodyModel[75] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 75
		bodyModel[76] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 76
		bodyModel[77] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 77
		bodyModel[78] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 78
		bodyModel[79] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 79
		bodyModel[80] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 80
		bodyModel[81] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 81
		bodyModel[82] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 82
		bodyModel[83] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 83
		bodyModel[84] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 84
		bodyModel[85] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 85
		bodyModel[86] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 86
		bodyModel[87] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 87
		bodyModel[88] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 88
		bodyModel[89] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 89
		bodyModel[90] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 90
		bodyModel[91] = new ModelRendererTurbo(this, 13, 52, textureX, textureY); // Box 91
		bodyModel[92] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 94
		bodyModel[93] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 95
		bodyModel[94] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 97
		bodyModel[95] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 98
		bodyModel[96] = new ModelRendererTurbo(this, 13, 32, textureX, textureY); // Box 99
		bodyModel[97] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 100
		bodyModel[98] = new ModelRendererTurbo(this, 51, 53, textureX, textureY); // Box 101
		bodyModel[99] = new ModelRendererTurbo(this, 88, 34, textureX, textureY); // Box 102
		bodyModel[100] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 103

		bodyModel[0].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 61
		bodyModel[0].setRotationPoint(-35F, -20F, 9F);

		bodyModel[1].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 62 Ladder Cull
		bodyModel[1].setRotationPoint(-35F, -20F, 10F);

		bodyModel[2].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 63
		bodyModel[2].setRotationPoint(30F, -20F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 64 ladder Cull
		bodyModel[3].setRotationPoint(30F, -20F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 66
		bodyModel[4].setRotationPoint(24F, -20F, 9.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 67
		bodyModel[5].setRotationPoint(18F, -20F, 9.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 68
		bodyModel[6].setRotationPoint(12F, -20F, 9.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 69
		bodyModel[7].setRotationPoint(6F, -20F, 9.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 70
		bodyModel[8].setRotationPoint(-0.5F, -20F, 9.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 71
		bodyModel[9].setRotationPoint(-7F, -20F, 9.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 72
		bodyModel[10].setRotationPoint(-13F, -20F, 9.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 73
		bodyModel[11].setRotationPoint(-19F, -20F, 9.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 74
		bodyModel[12].setRotationPoint(-25F, -20F, 9.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 75
		bodyModel[13].setRotationPoint(-25F, -20F, -10.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 76
		bodyModel[14].setRotationPoint(24F, -20F, -10.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 77
		bodyModel[15].setRotationPoint(18F, -20F, -10.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 78
		bodyModel[16].setRotationPoint(12F, -20F, -10.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 79
		bodyModel[17].setRotationPoint(6F, -20F, -10.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 80
		bodyModel[18].setRotationPoint(-0.5F, -20F, -10.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 81
		bodyModel[19].setRotationPoint(-7F, -20F, -10.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 82
		bodyModel[20].setRotationPoint(-13F, -20F, -10.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 83
		bodyModel[21].setRotationPoint(-19F, -20F, -10.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 84
		bodyModel[22].setRotationPoint(30F, -20F, 9.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 85
		bodyModel[23].setRotationPoint(-36F, -20F, -10.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 86
		bodyModel[24].setRotationPoint(-31F, -20F, -10.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 12, 2, 0F); // Box 87
		bodyModel[25].setRotationPoint(-36F, -21F, 9F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 12, 2, 0F); // Box 88
		bodyModel[26].setRotationPoint(35F, -21F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 71, 1, 2, 0F); // Box 89
		bodyModel[27].setRotationPoint(-35F, -21F, 9F);

		bodyModel[28].addBox(0F, 0F, 0F, 71, 1, 2, 0F); // Box 90
		bodyModel[28].setRotationPoint(-36F, -21F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 91
		bodyModel[29].setRotationPoint(35.25F, -21F, -4F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 92
		bodyModel[30].setRotationPoint(35.25F, -21F, 3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 93
		bodyModel[31].setRotationPoint(35.25F, -21F, -3F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 94
		bodyModel[32].setRotationPoint(35F, -13F, -8.75F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 95
		bodyModel[33].setRotationPoint(35F, -13F, -6.25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[34].setRotationPoint(35F, -14F, -9F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 97
		bodyModel[35].setRotationPoint(35F, -13F, 8.25F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 98
		bodyModel[36].setRotationPoint(35F, -13F, 4.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[37].setRotationPoint(35F, -14F, 4.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 100
		bodyModel[38].setRotationPoint(35.25F, -12F, -5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 101
		bodyModel[39].setRotationPoint(35.25F, -12F, 2F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 102
		bodyModel[40].setRotationPoint(-36F, -13F, 5.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 103
		bodyModel[41].setRotationPoint(-36F, -14F, 5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 106
		bodyModel[42].setRotationPoint(-35.75F, -12F, -4F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 107
		bodyModel[43].setRotationPoint(-35.75F, -21F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 108
		bodyModel[44].setRotationPoint(-35.75F, -21F, -3F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 109
		bodyModel[45].setRotationPoint(-35.75F, -21F, 3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 110
		bodyModel[46].setRotationPoint(-35.75F, -12F, 3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 111
		bodyModel[47].setRotationPoint(-36F, -14F, -9.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 112
		bodyModel[48].setRotationPoint(-36F, -13F, -9.25F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 113
		bodyModel[49].setRotationPoint(-36F, -13F, -5.75F);

		bodyModel[50].addBox(0F, 0F, 0F, 65, 11, 0, 0F); // Box 114
		bodyModel[50].setRotationPoint(-30F, -20F, 10F);

		bodyModel[51].addBox(0F, 0F, 0F, 65, 11, 0, 0F); // Box 115
		bodyModel[51].setRotationPoint(-35F, -20F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 65
		bodyModel[52].setRotationPoint(35F, -20F, 9.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 105
		bodyModel[53].setRotationPoint(-36F, -13F, 7.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 11, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[54].setRotationPoint(-34F, -10F, -7.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[55].setRotationPoint(-32F, -19F, -7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 64, 19, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[56].setRotationPoint(-32F, -18F, -7.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 11, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[57].setRotationPoint(32F, -10F, -7.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[58].setRotationPoint(-30F, -19F, -7.5F);
		bodyModel[58].rotateAngleY = -0.03490659F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[59].setRotationPoint(-27.5F, -19F, -7.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[60].setRotationPoint(-20.5F, -19F, -7.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[61].setRotationPoint(-25F, -19F, -7.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[62].setRotationPoint(-22.5F, -19F, -7.5F);
		bodyModel[62].rotateAngleY = 0.03490659F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[63].setRotationPoint(18.5F, -19F, -7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[64].setRotationPoint(20.5F, -19F, -7.5F);
		bodyModel[64].rotateAngleY = -0.03490659F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[65].setRotationPoint(23F, -19F, -6.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[66].setRotationPoint(25.5F, -19F, -7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[67].setRotationPoint(28F, -19F, -7.5F);
		bodyModel[67].rotateAngleY = 0.03490659F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[68].setRotationPoint(30F, -19F, -7.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[69].setRotationPoint(-18.5F, -19F, -8.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[70].setRotationPoint(-16.5F, -19F, -7.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[71].setRotationPoint(-14.5F, -19F, -6.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[72].setRotationPoint(-10.5F, -19F, -8.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[73].setRotationPoint(-12.5F, -19F, -8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[74].setRotationPoint(14.5F, -19F, -7.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[75].setRotationPoint(11F, -19F, -8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[76].setRotationPoint(9F, -19F, -7.25F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[77].setRotationPoint(16.5F, -19F, -8.25F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[78].setRotationPoint(5F, -19F, -7.5F);
		bodyModel[78].rotateAngleY = 0.03490659F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[79].setRotationPoint(2.5F, -19F, -7.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[80].setRotationPoint(7F, -19F, -7.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[81].setRotationPoint(13F, -19F, -7.5F);
		bodyModel[81].rotateAngleZ = 0.61086524F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[82].setRotationPoint(-8F, -19.75F, -7.5F);
		bodyModel[82].rotateAngleZ = -0.54105207F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[83].setRotationPoint(-4.5F, -19F, -7.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[84].setRotationPoint(-6.5F, -19F, -8.25F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[85].setRotationPoint(-2.5F, -19F, -7.5F);
		bodyModel[85].rotateAngleY = -0.03490659F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[86].setRotationPoint(0F, -19F, -7.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[87].setRotationPoint(-34.95F, -19F, -6.5F);
		bodyModel[87].rotateAngleY = -0.06981317F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[88].setRotationPoint(-34F, -18F, -7.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[89].setRotationPoint(-34F, -17F, -7.25F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[90].setRotationPoint(-34F, -16F, -8.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[91].setRotationPoint(-34F, -15F, -7.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[92].setRotationPoint(-34F, -12F, -7.5F);
		bodyModel[92].rotateAngleY = 0.05235988F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[93].setRotationPoint(-34F, -11F, -8.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[94].setRotationPoint(32F, -11F, -8.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[95].setRotationPoint(32F, -12F, -7.5F);
		bodyModel[95].rotateAngleY = -0.03490659F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[96].setRotationPoint(32F, -15F, -7.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[97].setRotationPoint(32F, -16F, -8.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[98].setRotationPoint(32F, -17F, -7.25F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[99].setRotationPoint(32F, -18F, -7.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[100].setRotationPoint(32F, -19F, -6.5F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);
	}
}