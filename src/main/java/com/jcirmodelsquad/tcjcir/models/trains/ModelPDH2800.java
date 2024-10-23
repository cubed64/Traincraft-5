//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GATX  2800 PDH
// Model Creator: Bida
// Created on: 18.01.2023 - 22:17:53
// Last changed on: 18.01.2023 - 22:17:53

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelOreJennyTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPDH2800 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelPDH2800() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[123];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 122, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 1, 122, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 32, 95, textureX, textureY, "cull"); // Box 75 cull platform
		bodyModel[3] = new ModelRendererTurbo(this, 1, 97, textureX, textureY, "cull"); // Box 206 cull platform
		bodyModel[4] = new ModelRendererTurbo(this, 131, 115, textureX, textureY); // Box 80
		bodyModel[5] = new ModelRendererTurbo(this, 131, 111, textureX, textureY); // Box 721
		bodyModel[6] = new ModelRendererTurbo(this, 42, 68, textureX, textureY, "cull"); // Box 236 frame cull
		bodyModel[7] = new ModelRendererTurbo(this, 66, 95, textureX, textureY); // Box 342
		bodyModel[8] = new ModelRendererTurbo(this, 66, 95, textureX, textureY); // Box 351
		bodyModel[9] = new ModelRendererTurbo(this, 66, 95, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 66, 95, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 10, 114, textureX, textureY); // Box 28
		bodyModel[12] = new ModelRendererTurbo(this, 12, 110, textureX, textureY); // Box 367
		bodyModel[13] = new ModelRendererTurbo(this, 12, 110, textureX, textureY); // Box 368
		bodyModel[14] = new ModelRendererTurbo(this, 14, 121, textureX, textureY); // Box 13
		bodyModel[15] = new ModelRendererTurbo(this, 127, 6, textureX, textureY); // Box 4
		bodyModel[16] = new ModelRendererTurbo(this, 177, 6, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 127, 37, textureX, textureY); // Box 4
		bodyModel[18] = new ModelRendererTurbo(this, 177, 37, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 229, 16, textureX, textureY); // Box 3
		bodyModel[20] = new ModelRendererTurbo(this, 218, 73, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 302, 72, textureX, textureY); // Box 62
		bodyModel[22] = new ModelRendererTurbo(this, 259, 51, textureX, textureY); // Box 73
		bodyModel[23] = new ModelRendererTurbo(this, 291, 46, textureX, textureY); // Box 74
		bodyModel[24] = new ModelRendererTurbo(this, 207, 46, textureX, textureY); // Box 75
		bodyModel[25] = new ModelRendererTurbo(this, 218, 73, textureX, textureY); // Box 83
		bodyModel[26] = new ModelRendererTurbo(this, 302, 72, textureX, textureY); // Box 85
		bodyModel[27] = new ModelRendererTurbo(this, 133, 89, textureX, textureY); // Box 94
		bodyModel[28] = new ModelRendererTurbo(this, 113, 93, textureX, textureY); // Box 95
		bodyModel[29] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 96
		bodyModel[30] = new ModelRendererTurbo(this, 57, 32, textureX, textureY); // Box 124
		bodyModel[31] = new ModelRendererTurbo(this, 94, 50, textureX, textureY); // Box 126
		bodyModel[32] = new ModelRendererTurbo(this, 62, 50, textureX, textureY); // Box 127
		bodyModel[33] = new ModelRendererTurbo(this, 105, 60, textureX, textureY); // Box 103
		bodyModel[34] = new ModelRendererTurbo(this, 115, 78, textureX, textureY); // Box 104
		bodyModel[35] = new ModelRendererTurbo(this, 135, 95, textureX, textureY, "cull"); // Box 107 cull
		bodyModel[36] = new ModelRendererTurbo(this, 107, 95, textureX, textureY, "cull"); // Box 109 cull
		bodyModel[37] = new ModelRendererTurbo(this, 10, 114, textureX, textureY); // Box 28
		bodyModel[38] = new ModelRendererTurbo(this, 12, 110, textureX, textureY); // Box 367
		bodyModel[39] = new ModelRendererTurbo(this, 12, 110, textureX, textureY); // Box 368
		bodyModel[40] = new ModelRendererTurbo(this, 133, 89, textureX, textureY); // Box 94
		bodyModel[41] = new ModelRendererTurbo(this, 113, 93, textureX, textureY); // Box 95
		bodyModel[42] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 96
		bodyModel[43] = new ModelRendererTurbo(this, 105, 60, textureX, textureY); // Box 103
		bodyModel[44] = new ModelRendererTurbo(this, 115, 78, textureX, textureY); // Box 104
		bodyModel[45] = new ModelRendererTurbo(this, 135, 95, textureX, textureY, "cull"); // Box 107 cull
		bodyModel[46] = new ModelRendererTurbo(this, 107, 95, textureX, textureY, "cull"); // Box 109 cull
		bodyModel[47] = new ModelRendererTurbo(this, 1, 70, textureX, textureY, "cull"); // Box 236 frame cull
		bodyModel[48] = new ModelRendererTurbo(this, 65, 29, textureX, textureY); // Box 93
		bodyModel[49] = new ModelRendererTurbo(this, 372, 59, textureX, textureY, "cull"); // Box 94 cull roof walk
		bodyModel[50] = new ModelRendererTurbo(this, 65, 29, textureX, textureY); // Box 95
		bodyModel[51] = new ModelRendererTurbo(this, 57, 32, textureX, textureY); // Box 96
		bodyModel[52] = new ModelRendererTurbo(this, 94, 50, textureX, textureY); // Box 97
		bodyModel[53] = new ModelRendererTurbo(this, 62, 50, textureX, textureY); // Box 98
		bodyModel[54] = new ModelRendererTurbo(this, 386, 75, textureX, textureY); // Box 99
		bodyModel[55] = new ModelRendererTurbo(this, 386, 75, textureX, textureY); // Box 100
		bodyModel[56] = new ModelRendererTurbo(this, 216, 26, textureX, textureY); // Box 101
		bodyModel[57] = new ModelRendererTurbo(this, 199, 26, textureX, textureY); // Box 102
		bodyModel[58] = new ModelRendererTurbo(this, 199, 26, textureX, textureY); // Box 103
		bodyModel[59] = new ModelRendererTurbo(this, 203, 33, textureX, textureY); // Box 104
		bodyModel[60] = new ModelRendererTurbo(this, 203, 33, textureX, textureY); // Box 105
		bodyModel[61] = new ModelRendererTurbo(this, 176, 61, textureX, textureY); // Box 106
		bodyModel[62] = new ModelRendererTurbo(this, 159, 59, textureX, textureY); // Box 107
		bodyModel[63] = new ModelRendererTurbo(this, 159, 63, textureX, textureY); // Box 108
		bodyModel[64] = new ModelRendererTurbo(this, 159, 67, textureX, textureY); // Box 109
		bodyModel[65] = new ModelRendererTurbo(this, 174, 57, textureX, textureY); // Box 110
		bodyModel[66] = new ModelRendererTurbo(this, 176, 73, textureX, textureY); // Box 108
		bodyModel[67] = new ModelRendererTurbo(this, 176, 82, textureX, textureY); // Box 109
		bodyModel[68] = new ModelRendererTurbo(this, 189, 81, textureX, textureY); // Box 110
		bodyModel[69] = new ModelRendererTurbo(this, 172, 67, textureX, textureY); // Box 111
		bodyModel[70] = new ModelRendererTurbo(this, 152, 59, textureX, textureY); // Box 112
		bodyModel[71] = new ModelRendererTurbo(this, 176, 79, textureX, textureY); // Box 113
		bodyModel[72] = new ModelRendererTurbo(this, 176, 76, textureX, textureY); // Box 114
		bodyModel[73] = new ModelRendererTurbo(this, 168, 86, textureX, textureY); // Box 72
		bodyModel[74] = new ModelRendererTurbo(this, 163, 90, textureX, textureY); // Box 87
		bodyModel[75] = new ModelRendererTurbo(this, 157, 90, textureX, textureY); // Box 87
		bodyModel[76] = new ModelRendererTurbo(this, 154, 98, textureX, textureY, "cull"); // Box 118 cull
		bodyModel[77] = new ModelRendererTurbo(this, 193, 93, textureX, textureY); // Box 286
		bodyModel[78] = new ModelRendererTurbo(this, 182, 93, textureX, textureY); // Box 287
		bodyModel[79] = new ModelRendererTurbo(this, 181, 99, textureX, textureY); // Box 491
		bodyModel[80] = new ModelRendererTurbo(this, 188, 98, textureX, textureY); // Box 93
		bodyModel[81] = new ModelRendererTurbo(this, 195, 99, textureX, textureY); // Box 94
		bodyModel[82] = new ModelRendererTurbo(this, 204, 94, textureX, textureY); // Box 125
		bodyModel[83] = new ModelRendererTurbo(this, 204, 94, textureX, textureY); // Box 126
		bodyModel[84] = new ModelRendererTurbo(this, 165, 77, textureX, textureY); // Box 127
		bodyModel[85] = new ModelRendererTurbo(this, 165, 77, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 152, 69, textureX, textureY); // Box 129
		bodyModel[87] = new ModelRendererTurbo(this, 169, 98, textureX, textureY); // Box 132
		bodyModel[88] = new ModelRendererTurbo(this, 159, 105, textureX, textureY); // Box 125
		bodyModel[89] = new ModelRendererTurbo(this, 59, 26, textureX, textureY); // Box 132
		bodyModel[90] = new ModelRendererTurbo(this, 59, 26, textureX, textureY); // Box 133
		bodyModel[91] = new ModelRendererTurbo(this, 59, 26, textureX, textureY); // Box 134
		bodyModel[92] = new ModelRendererTurbo(this, 59, 26, textureX, textureY); // Box 135
		bodyModel[93] = new ModelRendererTurbo(this, 268, 107, textureX, textureY); // Box 136
		bodyModel[94] = new ModelRendererTurbo(this, 259, 77, textureX, textureY); // Box 137
		bodyModel[95] = new ModelRendererTurbo(this, 216, 95, textureX, textureY); // Box 138
		bodyModel[96] = new ModelRendererTurbo(this, 300, 95, textureX, textureY); // Box 139
		bodyModel[97] = new ModelRendererTurbo(this, 286, 1, textureX, textureY); // Box 140
		bodyModel[98] = new ModelRendererTurbo(this, 202, 1, textureX, textureY); // Box 141
		bodyModel[99] = new ModelRendererTurbo(this, 148, 22, textureX, textureY); // Box 142
		bodyModel[100] = new ModelRendererTurbo(this, 148, 6, textureX, textureY); // Box 145
		bodyModel[101] = new ModelRendererTurbo(this, 148, 37, textureX, textureY); // Box 146
		bodyModel[102] = new ModelRendererTurbo(this, 393, 22, textureX, textureY); // Box 149
		bodyModel[103] = new ModelRendererTurbo(this, 372, 6, textureX, textureY); // Box 150
		bodyModel[104] = new ModelRendererTurbo(this, 393, 6, textureX, textureY); // Box 151
		bodyModel[105] = new ModelRendererTurbo(this, 422, 6, textureX, textureY); // Box 152
		bodyModel[106] = new ModelRendererTurbo(this, 422, 37, textureX, textureY); // Box 153
		bodyModel[107] = new ModelRendererTurbo(this, 393, 37, textureX, textureY); // Box 154
		bodyModel[108] = new ModelRendererTurbo(this, 372, 37, textureX, textureY); // Box 155
		bodyModel[109] = new ModelRendererTurbo(this, 161, 71, textureX, textureY); // Box 156
		bodyModel[110] = new ModelRendererTurbo(this, 148, 74, textureX, textureY); // Box 157
		bodyModel[111] = new ModelRendererTurbo(this, 132, 54, textureX, textureY); // Box 158
		bodyModel[112] = new ModelRendererTurbo(this, 132, 61, textureX, textureY); // Box 159
		bodyModel[113] = new ModelRendererTurbo(this, 3, 113, textureX, textureY); // Box 160
		bodyModel[114] = new ModelRendererTurbo(this, 3, 113, textureX, textureY); // Box 161
		bodyModel[115] = new ModelRendererTurbo(this, 378, 80, textureX, textureY, "cull"); // Box 162 cull
		bodyModel[116] = new ModelRendererTurbo(this, 182, 88, textureX, textureY); // Box 116
		bodyModel[117] = new ModelRendererTurbo(this, 193, 88, textureX, textureY); // Box 117
		bodyModel[118] = new ModelRendererTurbo(this, 162, 98, textureX, textureY); // Box 118 seaboARD pEENBOArd RounD THiNGg
		bodyModel[119] = new ModelRendererTurbo(this, 64, 96, textureX, textureY); // Box 119
		bodyModel[120] = new ModelRendererTurbo(this, 65, 96, textureX, textureY); // Box 120
		bodyModel[121] = new ModelRendererTurbo(this, 65, 96, textureX, textureY); // Box 121
		bodyModel[122] = new ModelRendererTurbo(this, 64, 96, textureX, textureY); // Box 122

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-29.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(26.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 75 cull platform
		bodyModel[2].setRotationPoint(-26.5F, 2F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 206 cull platform
		bodyModel[3].setRotationPoint(22.5F, 2F, -11F);

		bodyModel[4].addBox(0F, -1F, 0F, 11, 3, 0, 0F); // Box 80
		bodyModel[4].setRotationPoint(-28F, 4.5F, -0.5F);
		bodyModel[4].rotateAngleY = 1.44862328F;

		bodyModel[5].addBox(-11F, -1F, 0F, 11, 3, 0, 0F); // Box 721
		bodyModel[5].setRotationPoint(28F, 4.5F, 0.5F);
		bodyModel[5].rotateAngleY = 1.44862328F;

		bodyModel[6].addBox(0F, 0F, 0F, 9, 1, 22, 0F); // Box 236 frame cull
		bodyModel[6].setRotationPoint(-22.5F, 2F, -11.01F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 342
		bodyModel[7].setRotationPoint(-26.5F, 3F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 351
		bodyModel[8].setRotationPoint(-26.5F, 3F, 11F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 19
		bodyModel[9].setRotationPoint(22.5F, 3F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 20
		bodyModel[10].setRotationPoint(22.5F, 3F, 11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[11].setRotationPoint(-16.5F, 4.1F, -1.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 367
		bodyModel[12].setRotationPoint(-16F, 3.75F, 3.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 368
		bodyModel[13].setRotationPoint(-16F, 3.75F, -5.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 53, 2, 4, 0F); // Box 13
		bodyModel[14].setRotationPoint(-26.5F, 3F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,-3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 4
		bodyModel[15].setRotationPoint(-20.5F, -19F, 3.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,-3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[16].setRotationPoint(-20.5F, -19F, -10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -4F, -3F, -1.5F, -4F); // Box 4
		bodyModel[17].setRotationPoint(-20.5F, -5F, 3.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -3F, -3F, -1.5F, -3F); // Box 4
		bodyModel[18].setRotationPoint(-20.5F, -5F, -10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 35, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[19].setRotationPoint(-17.5F, -12F, -10.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 15, 7, 10, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F, 0F, 3F, -4F, 0F, 3F, -6F, 0F, -1.5F, -6F); // Box 4
		bodyModel[20].setRotationPoint(-17.5F, -5F, -10.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 15, 7, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -6F, 0F, 3F, -6F); // Box 62
		bodyModel[21].setRotationPoint(2.5F, -5F, -10.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 5, 3, 21, 0F); // Box 73
		bodyModel[22].setRotationPoint(-2.5F, -5F, -10.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[23].setRotationPoint(2.5F, -5F, -10.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 75
		bodyModel[24].setRotationPoint(-17.5F, -5F, -10.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 15, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F, 0F, 3F, -6F, 0F, 3F, -4F, 0F, -1.5F, -4F); // Box 83
		bodyModel[25].setRotationPoint(-17.5F, -5F, 0.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 15, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -6F, 0F, -1.5F, -6F, 0F, -1.5F, -4F, 0F, 3F, -4F); // Box 85
		bodyModel[26].setRotationPoint(2.5F, -5F, 0.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 94
		bodyModel[27].setRotationPoint(-16F, 1F, -10.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 0, 11, 0F); // Box 95
		bodyModel[28].setRotationPoint(-16F, 4F, -5.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 0, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[29].setRotationPoint(-16F, 1F, 5.5F);

		bodyModel[30].addBox(0F, -12F, 0F, 0, 12, 22, 0F); // Box 124
		bodyModel[30].setRotationPoint(-22.5F, 2F, -11F);
		bodyModel[30].rotateAngleZ = -0.06981317F;

		bodyModel[31].addShapeBox(0F, -8F, 0F, 0, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[31].setRotationPoint(-22.51F, 2F, -11F);
		bodyModel[31].rotateAngleZ = -0.06981317F;

		bodyModel[32].addShapeBox(0F, -8F, 0F, 0, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[32].setRotationPoint(-22.51F, 2F, 10F);
		bodyModel[32].rotateAngleZ = -0.06981317F;

		bodyModel[33].addBox(0F, 0F, 0F, 0, 6, 21, 0F); // Box 103
		bodyModel[33].setRotationPoint(-15F, -5F, -10.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 3, 11, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[34].setRotationPoint(-15F, 1F, -5.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.325F, 0F, 0F, 0.325F); // Box 107 cull
		bodyModel[35].setRotationPoint(-16F, 1F, -10.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.325F, 0F, 0F, 0.325F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 109 cull
		bodyModel[36].setRotationPoint(-16F, 1F, 7.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[37].setRotationPoint(13.5F, 4.1F, -1.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 367
		bodyModel[38].setRotationPoint(14F, 3.75F, 3.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 368
		bodyModel[39].setRotationPoint(14F, 3.75F, -5.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 94
		bodyModel[40].setRotationPoint(14F, 1F, -10.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 0, 11, 0F); // Box 95
		bodyModel[41].setRotationPoint(14F, 4F, -5.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 0, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[42].setRotationPoint(14F, 1F, 5.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 6, 21, 0F); // Box 103
		bodyModel[43].setRotationPoint(15F, -5F, -10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 3, 11, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[44].setRotationPoint(15F, 1F, -5.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.325F, 0F, 0F, 0.325F); // Box 107 cull
		bodyModel[45].setRotationPoint(14F, 1F, -10.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.325F, 0F, 0F, 0.325F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 109 cull
		bodyModel[46].setRotationPoint(14F, 1F, 7.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 9, 1, 22, 0F); // Box 236 frame cull
		bodyModel[47].setRotationPoint(13.5F, 2F, -11.01F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 93
		bodyModel[48].setRotationPoint(-18.49F, -19.5F, -7F);
		bodyModel[48].rotateAngleZ = -0.32114058F;

		bodyModel[49].addBox(0F, 0F, 0F, 37, 1, 14, 0F); // Box 94 cull roof walk
		bodyModel[49].setRotationPoint(-18.5F, -20.5F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 95
		bodyModel[50].setRotationPoint(18.5F, -19.5F, -7F);
		bodyModel[50].rotateAngleZ = 0.32114058F;

		bodyModel[51].addBox(0F, -12F, 0F, 0, 12, 22, 0F); // Box 96
		bodyModel[51].setRotationPoint(22.5F, 2F, -11F);
		bodyModel[51].rotateAngleZ = 0.06981317F;

		bodyModel[52].addShapeBox(0F, -8F, 0F, 0, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[52].setRotationPoint(22.51F, 2F, -11F);
		bodyModel[52].rotateAngleZ = 0.06981317F;

		bodyModel[53].addShapeBox(0F, -8F, 0F, 0, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[53].setRotationPoint(22.51F, 2F, 10F);
		bodyModel[53].rotateAngleZ = 0.06981317F;

		bodyModel[54].addBox(0F, 0F, 0F, 33, 3, 0, 0F); // Box 99
		bodyModel[54].setRotationPoint(-16.5F, -19.5F, -7F);

		bodyModel[55].addBox(0F, 0F, 0F, 33, 3, 0, 0F); // Box 100
		bodyModel[55].setRotationPoint(-16.5F, -19.5F, 7F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 101
		bodyModel[56].setRotationPoint(-2F, -20.5F, -2F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 102
		bodyModel[57].setRotationPoint(-14F, -20.5F, -2F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 103
		bodyModel[58].setRotationPoint(10F, -20.5F, -2F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 104
		bodyModel[59].setRotationPoint(4F, -20.5F, -1F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 105
		bodyModel[60].setRotationPoint(-6F, -20.5F, -1F);

		bodyModel[61].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 106
		bodyModel[61].setRotationPoint(0F, 7.5F, -4.5F);
		bodyModel[61].rotateAngleZ = 0.78539816F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 107
		bodyModel[62].setRotationPoint(-3F, -1F, 9F);
		bodyModel[62].rotateAngleX = -0.52359878F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 2.75F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 2.75F, -1F, 0F, -3.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F, -1F); // Box 108
		bodyModel[63].setRotationPoint(-13F, -1F, 9F);
		bodyModel[63].rotateAngleX = -0.52359878F;

		bodyModel[64].addShapeBox(1F, 3.5F, 0F, 5, 2, 1, 0F,0F, 2.75F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 2.75F, -1F, 0F, -3.25F, 1F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -3.25F, -1F); // Box 109
		bodyModel[64].setRotationPoint(-13F, -1F, 9F);
		bodyModel[64].rotateAngleX = -0.52359878F;

		bodyModel[65].addShapeBox(0F, -1.5F, -1F, 1, 4, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.55F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.55F, -0.25F); // Box 110
		bodyModel[65].setRotationPoint(-13F, -1F, 9F);
		bodyModel[65].rotateAngleX = -0.52359878F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 108
		bodyModel[66].setRotationPoint(-3.5F, 7F, 3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 1.75F, -4.25F, 0F, -3.25F, -0.25F, 0F, -3.25F, -0.25F, 0F, 1.75F, 3.75F, 0F, -2.25F, -4.25F, 0F, 2.75F, -0.25F, 0F, 2.75F, -0.25F, 0F, -2.25F, 3.75F); // Box 109
		bodyModel[67].setRotationPoint(-8.5F, 4F, 3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 110
		bodyModel[68].setRotationPoint(-9.25F, 0.75F, 7F);

		bodyModel[69].addShapeBox(1F, -0.5F, -0.25F, 5, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[69].setRotationPoint(-8F, 1.25F, 8F);
		bodyModel[69].rotateAngleX = -0.36651914F;
		bodyModel[69].rotateAngleY = -0.10471976F;
		bodyModel[69].rotateAngleZ = -0.33161256F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 112
		bodyModel[70].setRotationPoint(3F, -1F, 9F);
		bodyModel[70].rotateAngleX = -0.52359878F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 113
		bodyModel[71].setRotationPoint(-3.5F, 7F, -4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 114
		bodyModel[72].setRotationPoint(-2.75F, 7F, -3.25F);
		bodyModel[72].rotateAngleY = 1.57079633F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[73].setRotationPoint(-23.51F, -4F, 0F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[74].setRotationPoint(-23.5F, -2.5F, 1.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 87
		bodyModel[75].setRotationPoint(-22.5F, -4F, 0.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 118 cull
		bodyModel[76].setRotationPoint(-21.5F, -3F, 0.5F);

		bodyModel[77].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[77].setRotationPoint(-20F, 0F, -1.5F);
		bodyModel[77].rotateAngleX = -0.78539816F;
		bodyModel[77].rotateAngleY = -1.57079633F;

		bodyModel[78].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[78].setRotationPoint(-20F, 0F, -4.5F);
		bodyModel[78].rotateAngleX = -0.78539816F;
		bodyModel[78].rotateAngleY = -1.57079633F;

		bodyModel[79].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 491
		bodyModel[79].setRotationPoint(-20.5F, 0F, -10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 93
		bodyModel[80].setRotationPoint(-19.5F, -1F, -10.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 94
		bodyModel[81].setRotationPoint(-18.5F, 0F, -10.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 125
		bodyModel[82].setRotationPoint(-20.5F, 0F, -7.51F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 126
		bodyModel[83].setRotationPoint(-20.5F, 0F, -1.49F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 127
		bodyModel[84].setRotationPoint(0F, 6F, -4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 128
		bodyModel[85].setRotationPoint(-1F, 6F, -4F);

		bodyModel[86].addShapeBox(0F, 4F, 0F, 2, 2, 2, 0F,-0.225F, -0.475F, 0F, -0.725F, -0.475F, 0F, -0.725F, -0.475F, -0.25F, -0.225F, -0.475F, -0.25F, -0.225F, -0.475F, 0F, -0.725F, -0.475F, 0F, -0.725F, -0.475F, -0.25F, -0.225F, -0.475F, -0.25F); // Box 129
		bodyModel[86].setRotationPoint(3F, -1F, 9F);
		bodyModel[86].rotateAngleX = -0.52359878F;

		bodyModel[87].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 132
		bodyModel[87].setRotationPoint(-22.25F, 0F, 2.01F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[88].setRotationPoint(-21.25F, 5F, 2F);
		bodyModel[88].rotateAngleY = -0.2443461F;

		bodyModel[89].addBox(0F, 0F, 0F, 4, 0, 16, 0F); // Box 132
		bodyModel[89].setRotationPoint(-21.88F, -6F, -8F);
		bodyModel[89].rotateAngleZ = 0.57595865F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 0, 16, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[90].setRotationPoint(-21.88F, -6F, -8F);
		bodyModel[90].rotateAngleZ = -0.48869219F;

		bodyModel[91].addBox(-4F, 0F, 0F, 4, 0, 16, 0F); // Box 134
		bodyModel[91].setRotationPoint(21.88F, -6F, -8F);
		bodyModel[91].rotateAngleZ = -0.57595865F;

		bodyModel[92].addShapeBox(-4F, 0F, 0F, 4, 0, 16, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 135
		bodyModel[92].setRotationPoint(21.88F, -6F, -8F);
		bodyModel[92].rotateAngleZ = 0.48869219F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 8, 12, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -5F, -6F, 0F, -5F, -6F, 0F, -5F, -6F, 0F, -5F, -6F); // Box 136
		bodyModel[93].setRotationPoint(-2.5F, 5F, -6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 137
		bodyModel[94].setRotationPoint(-2.5F, -2F, -10.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 15, 8, 12, 0F,0F, -0.5F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5F, -6F); // Box 138
		bodyModel[95].setRotationPoint(-17.5F, 0F, -6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 15, 8, 12, 0F,0F, -5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, -6F, 0F, -5F, -6F, 0F, -5F, -6F, 0F, 0F, -6F); // Box 139
		bodyModel[96].setRotationPoint(2.5F, 0F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 35, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 4.5F, 0F, 1F, 4.5F); // Box 140
		bodyModel[97].setRotationPoint(-17.5F, -20F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 35, 7, 6, 0F,0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4.5F, 0F, 1F, 4.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 141
		bodyModel[98].setRotationPoint(-17.5F, -20F, -6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 7, 7, 7, 0F,0F, 0F, 0F, -4F, 0F, 7F, -4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 7F, -4F, 0F, 7F, 0F, 0F, 0F); // Box 142
		bodyModel[99].setRotationPoint(-20.5F, -12F, -3.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 7, 8, 7, 0F,-3F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F, -3.5F, -3F, 0F, -3.5F, 0F, 0F, 0F, -4F, -5.5F, 3F, -4F, -5.5F, 3F, 0F, 0F, 0F); // Box 145
		bodyModel[100].setRotationPoint(-20.5F, -20F, -3.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 8, 7, 0F,0F, 0F, 0F, -4F, -5.5F, 3F, -4F, -5.5F, 3F, 0F, 0F, 0F, -3F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F, -3.5F, -3F, 0F, -3.5F); // Box 146
		bodyModel[101].setRotationPoint(-20.5F, -5F, -3.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 7, 7, 7, 0F,-4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 7F, -4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 7F); // Box 149
		bodyModel[102].setRotationPoint(13.5F, -12F, -3.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[103].setRotationPoint(17.5F, -19F, 3.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 7, 8, 7, 0F,-4F, 0F, -3.5F, -3F, 0F, -3.5F, -3F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, -5.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5.5F, 3F); // Box 151
		bodyModel[104].setRotationPoint(13.5F, -20F, -3.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, -1.5F, -4F, -3F, -1.5F, -4F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[105].setRotationPoint(17.5F, -19F, -10.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, -3F, -1.5F, -3F, 0F, -1.5F, -3F); // Box 153
		bodyModel[106].setRotationPoint(17.5F, -5F, -10.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 7, 8, 7, 0F,-4F, -5.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5.5F, 3F, -4F, 0F, -3.5F, -3F, 0F, -3.5F, -3F, 0F, -3.5F, -4F, 0F, -3.5F); // Box 154
		bodyModel[107].setRotationPoint(13.5F, -5F, -3.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, -1.5F, -4F, 0F, -1.5F, -4F); // Box 155
		bodyModel[108].setRotationPoint(17.5F, -5F, 3.5F);

		bodyModel[109].addShapeBox(0F, 0F, -0.15F, 4, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 156
		bodyModel[109].setRotationPoint(-1.5F, 1F, 8F);
		bodyModel[109].rotateAngleX = -0.52359878F;

		bodyModel[110].addShapeBox(-1F, -1F, 0F, 2, 2, 8, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 157
		bodyModel[110].setRotationPoint(0F, 6.5F, -4F);

		bodyModel[111].addShapeBox(0F, 0.25F, 1.01F, 9, 6, 0, 0F,-0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 158
		bodyModel[111].setRotationPoint(-3F, -1F, 9F);
		bodyModel[111].rotateAngleX = -0.52359878F;

		bodyModel[112].addShapeBox(1F, 0F, 1F, 9, 6, 0, 0F,-0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 159
		bodyModel[112].setRotationPoint(-4F, 8.25F, 2F);
		bodyModel[112].rotateAngleX = 2.00712864F;

		bodyModel[113].addBox(0F, 0F, 0F, 0, 2, 3, 0F); // Box 160
		bodyModel[113].setRotationPoint(-26.5F, 3F, 8F);

		bodyModel[114].addBox(0F, 0F, 0F, 0, 2, 3, 0F); // Box 161
		bodyModel[114].setRotationPoint(26.5F, 3F, -11F);

		bodyModel[115].addBox(0F, 0F, 0F, 31, 1, 8, 0F); // Box 162 cull
		bodyModel[115].setRotationPoint(-15.5F, -20.5F, -4F);

		bodyModel[116].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 116
		bodyModel[116].setRotationPoint(-19.5F, 2F, 8.5F);
		bodyModel[116].rotateAngleX = -0.78539816F;

		bodyModel[117].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 117
		bodyModel[117].setRotationPoint(-22.5F, 2F, 8.5F);
		bodyModel[117].rotateAngleX = -0.78539816F;

		bodyModel[118].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 12, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 118 seaboARD pEENBOArd RounD THiNGg
		bodyModel[118].setRotationPoint(20F, 1F, -6F);
		bodyModel[118].rotateAngleZ = 0.78539816F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 0, 23, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 119
		bodyModel[119].setRotationPoint(-26.5F, 2.5F, -11.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 0, 18, 0F); // Box 120
		bodyModel[120].setRotationPoint(-27.25F, 2.5F, -9F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 0, 18, 0F); // Box 121
		bodyModel[121].setRotationPoint(26.25F, 2.5F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 0, 23, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 122
		bodyModel[122].setRotationPoint(22.5F, 2.5F, -11.5F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();
	ModelOreJennyTruck2 trucc2 = new ModelOreJennyTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 123; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}


		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Ore_jenny_Truck2.png"));
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13) {
			GL11.glPushMatrix();
			GL11.glScalef(1,1,1f);
			GL11.glTranslated(-0.57,-0.05,-0.0);
			trucc2.render(entity,f,f1,f2,f3,f4,f5);

			GL11.glTranslated(1.17,-0.0,0.00);
			trucc2.render(entity,f,f1,f2,f3,f4,f5);
			GL11.glPopMatrix();
		} else {
			GL11.glPushMatrix();
			GL11.glScalef(1,1,1f);
			GL11.glTranslated(-0.94,-0.0,-0.0);
			trucc2.render(entity,f,f1,f2,f3,f4,f5);

			GL11.glTranslated(1.88,-0.0,0.00);
			trucc2.render(entity,f,f1,f2,f3,f4,f5);
			GL11.glPopMatrix();
		}
	}
}