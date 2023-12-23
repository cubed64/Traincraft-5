//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.11.2023 - 19:57:49
// Last changed on: 11.11.2023 - 19:57:49

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelAndrews_Truck;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class Model67millgon extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public Model67millgon() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[131];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 9, 76, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 35, 107, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 9, 76, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 40, 78, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 40, 80, textureX, textureY); // Box 34
		bodyModel[5] = new ModelRendererTurbo(this, 34, 47, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 29, 47, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 23, 88, textureX, textureY); // Box 34
		bodyModel[8] = new ModelRendererTurbo(this, 39, 28, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 39, 43, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 5, 45, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 23, 16, textureX, textureY); // Box 189
		bodyModel[12] = new ModelRendererTurbo(this, 13, 17, textureX, textureY); // Box 189
		bodyModel[13] = new ModelRendererTurbo(this, 7, 16, textureX, textureY); // Box 189
		bodyModel[14] = new ModelRendererTurbo(this, 13, 17, textureX, textureY); // Box 189
		bodyModel[15] = new ModelRendererTurbo(this, 23, 27, textureX, textureY); // Box 189
		bodyModel[16] = new ModelRendererTurbo(this, 23, 27, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 23, 27, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 7, 16, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 7, 16, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 5, 27, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 5, 27, textureX, textureY); // Box 36
		bodyModel[22] = new ModelRendererTurbo(this, 5, 27, textureX, textureY); // Box 37
		bodyModel[23] = new ModelRendererTurbo(this, 13, 29, textureX, textureY); // Box 39
		bodyModel[24] = new ModelRendererTurbo(this, 23, 9, textureX, textureY); // Box 40
		bodyModel[25] = new ModelRendererTurbo(this, 7, 9, textureX, textureY); // Box 41
		bodyModel[26] = new ModelRendererTurbo(this, 56, 6, textureX, textureY); // Box 42
		bodyModel[27] = new ModelRendererTurbo(this, 36, 8, textureX, textureY); // Box 43
		bodyModel[28] = new ModelRendererTurbo(this, 23, 16, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 23, 27, textureX, textureY); // Box 45
		bodyModel[30] = new ModelRendererTurbo(this, 13, 17, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 5, 27, textureX, textureY); // Box 47
		bodyModel[32] = new ModelRendererTurbo(this, 7, 16, textureX, textureY); // Box 48
		bodyModel[33] = new ModelRendererTurbo(this, 23, 27, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 23, 16, textureX, textureY); // Box 50
		bodyModel[35] = new ModelRendererTurbo(this, 13, 17, textureX, textureY); // Box 51
		bodyModel[36] = new ModelRendererTurbo(this, 7, 16, textureX, textureY); // Box 52
		bodyModel[37] = new ModelRendererTurbo(this, 5, 27, textureX, textureY); // Box 53
		bodyModel[38] = new ModelRendererTurbo(this, 5, 27, textureX, textureY); // Box 54
		bodyModel[39] = new ModelRendererTurbo(this, 7, 9, textureX, textureY); // Box 55
		bodyModel[40] = new ModelRendererTurbo(this, 13, 29, textureX, textureY); // Box 56
		bodyModel[41] = new ModelRendererTurbo(this, 23, 9, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 23, 27, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 25, 53, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 24, 38, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 123, 38, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 59, 38, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 223, 53, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 124, 53, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 159, 53, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 39, 82, textureX, textureY); // Box 34
		bodyModel[51] = new ModelRendererTurbo(this, 39, 85, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 140, 4, textureX, textureY); // Box 34
		bodyModel[53] = new ModelRendererTurbo(this, 145, 4, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 150, 4, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 155, 4, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 185, 4, textureX, textureY); // Box 72
		bodyModel[57] = new ModelRendererTurbo(this, 190, 4, textureX, textureY); // Box 73
		bodyModel[58] = new ModelRendererTurbo(this, 195, 4, textureX, textureY); // Box 74
		bodyModel[59] = new ModelRendererTurbo(this, 200, 4, textureX, textureY); // Box 75
		bodyModel[60] = new ModelRendererTurbo(this, 160, 4, textureX, textureY); // Box 76
		bodyModel[61] = new ModelRendererTurbo(this, 165, 4, textureX, textureY); // Box 77
		bodyModel[62] = new ModelRendererTurbo(this, 175, 4, textureX, textureY); // Box 78
		bodyModel[63] = new ModelRendererTurbo(this, 180, 4, textureX, textureY); // Box 79
		bodyModel[64] = new ModelRendererTurbo(this, 170, 4, textureX, textureY); // Box 80
		bodyModel[65] = new ModelRendererTurbo(this, 200, 16, textureX, textureY); // Box 81
		bodyModel[66] = new ModelRendererTurbo(this, 195, 16, textureX, textureY); // Box 82
		bodyModel[67] = new ModelRendererTurbo(this, 190, 16, textureX, textureY); // Box 83
		bodyModel[68] = new ModelRendererTurbo(this, 150, 16, textureX, textureY); // Box 86
		bodyModel[69] = new ModelRendererTurbo(this, 145, 16, textureX, textureY); // Box 87
		bodyModel[70] = new ModelRendererTurbo(this, 140, 16, textureX, textureY); // Box 88
		bodyModel[71] = new ModelRendererTurbo(this, 104, 63, textureX, textureY); // Box 213
		bodyModel[72] = new ModelRendererTurbo(this, 99, 62, textureX, textureY); // Box 95
		bodyModel[73] = new ModelRendererTurbo(this, 81, 64, textureX, textureY); // Box 355 brakewheel
		bodyModel[74] = new ModelRendererTurbo(this, 76, 64, textureX, textureY); // Box 277
		bodyModel[75] = new ModelRendererTurbo(this, 81, 74, textureX, textureY); // Box 98
		bodyModel[76] = new ModelRendererTurbo(this, 65, 64, textureX, textureY); // Box 118
		bodyModel[77] = new ModelRendererTurbo(this, 56, 65, textureX, textureY); // Box 119
		bodyModel[78] = new ModelRendererTurbo(this, 45, 65, textureX, textureY); // Box 129
		bodyModel[79] = new ModelRendererTurbo(this, 81, 72, textureX, textureY); // Box 102
		bodyModel[80] = new ModelRendererTurbo(this, 8, 70, textureX, textureY); // Box 0
		bodyModel[81] = new ModelRendererTurbo(this, 8, 70, textureX, textureY); // Box 0
		bodyModel[82] = new ModelRendererTurbo(this, 29, 49, textureX, textureY); // Box 105
		bodyModel[83] = new ModelRendererTurbo(this, 34, 49, textureX, textureY); // Box 106
		bodyModel[84] = new ModelRendererTurbo(this, 205, 16, textureX, textureY); // Box 107
		bodyModel[85] = new ModelRendererTurbo(this, 78, 53, textureX, textureY, "cull"); // Box cull
		bodyModel[86] = new ModelRendererTurbo(this, 111, 66, textureX, textureY, "cull"); // Box cull
		bodyModel[87] = new ModelRendererTurbo(this, 111, 57, textureX, textureY, "cull"); // Box cull
		bodyModel[88] = new ModelRendererTurbo(this, 111, 61, textureX, textureY, "cull"); // Box cull
		bodyModel[89] = new ModelRendererTurbo(this, 111, 53, textureX, textureY, "cull"); // Box cull
		bodyModel[90] = new ModelRendererTurbo(this, 89, 58, textureX, textureY, "cull"); // Box cull
		bodyModel[91] = new ModelRendererTurbo(this, 100, 57, textureX, textureY, "cull"); // Box cull
		bodyModel[92] = new ModelRendererTurbo(this, 100, 53, textureX, textureY, "cull"); // Box cull
		bodyModel[93] = new ModelRendererTurbo(this, 89, 53, textureX, textureY, "cull"); // Box cull
		bodyModel[94] = new ModelRendererTurbo(this, 67, 53, textureX, textureY, "cull"); // Box cull
		bodyModel[95] = new ModelRendererTurbo(this, 45, 53, textureX, textureY, "cull"); // Box cull
		bodyModel[96] = new ModelRendererTurbo(this, 56, 53, textureX, textureY, "cull"); // Box cull
		bodyModel[97] = new ModelRendererTurbo(this, 135, 4, textureX, textureY); // Box 121
		bodyModel[98] = new ModelRendererTurbo(this, 205, 4, textureX, textureY); // Box 122
		bodyModel[99] = new ModelRendererTurbo(this, 135, 16, textureX, textureY); // Box 123
		bodyModel[100] = new ModelRendererTurbo(this, -7, 113, textureX, textureY); // Box 196
		bodyModel[101] = new ModelRendererTurbo(this, 74, 70, textureX, textureY); // Box 199
		bodyModel[102] = new ModelRendererTurbo(this, -46, 77, textureX, textureY); // Box 124
		bodyModel[103] = new ModelRendererTurbo(this, 101, 65, textureX, textureY); // Box 122
		bodyModel[104] = new ModelRendererTurbo(this, 74, 73, textureX, textureY); // Box 123
		bodyModel[105] = new ModelRendererTurbo(this, 92, 67, textureX, textureY); // Box 126
		bodyModel[106] = new ModelRendererTurbo(this, 81, 70, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 81, 76, textureX, textureY); // Box 202
		bodyModel[108] = new ModelRendererTurbo(this, 180, 16, textureX, textureY); // Box 135
		bodyModel[109] = new ModelRendererTurbo(this, 175, 16, textureX, textureY); // Box 136
		bodyModel[110] = new ModelRendererTurbo(this, 170, 16, textureX, textureY); // Box 137
		bodyModel[111] = new ModelRendererTurbo(this, 165, 16, textureX, textureY); // Box 138
		bodyModel[112] = new ModelRendererTurbo(this, 160, 16, textureX, textureY); // Box 139
		bodyModel[113] = new ModelRendererTurbo(this, 185, 16, textureX, textureY); // Box 140
		bodyModel[114] = new ModelRendererTurbo(this, 155, 16, textureX, textureY); // Box 141
		bodyModel[115] = new ModelRendererTurbo(this, 62, 69, textureX, textureY); // Box 148
		bodyModel[116] = new ModelRendererTurbo(this, 62, 69, textureX, textureY); // Box 119
		bodyModel[117] = new ModelRendererTurbo(this, 62, 69, textureX, textureY); // Box 122
		bodyModel[118] = new ModelRendererTurbo(this, 62, 69, textureX, textureY); // Box 123
		bodyModel[119] = new ModelRendererTurbo(this, 62, 69, textureX, textureY); // Box 126
		bodyModel[120] = new ModelRendererTurbo(this, 62, 69, textureX, textureY); // Box 127
		bodyModel[121] = new ModelRendererTurbo(this, 62, 69, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 62, 69, textureX, textureY); // Box 129
		bodyModel[123] = new ModelRendererTurbo(this, 62, 69, textureX, textureY); // Box 130
		bodyModel[124] = new ModelRendererTurbo(this, 62, 69, textureX, textureY); // Box 131
		bodyModel[125] = new ModelRendererTurbo(this, 62, 69, textureX, textureY); // Box 132
		bodyModel[126] = new ModelRendererTurbo(this, 62, 69, textureX, textureY); // Box 133
		bodyModel[127] = new ModelRendererTurbo(this, 29, 44, textureX, textureY); // Box 127
		bodyModel[128] = new ModelRendererTurbo(this, 29, 44, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 29, 44, textureX, textureY); // Box 129
		bodyModel[130] = new ModelRendererTurbo(this, 29, 44, textureX, textureY); // Box 130

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(49.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 99, 2, 5, 0F); // Box 0
		bodyModel[1].setRotationPoint(-49.5F, 3F, -2.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[2].setRotationPoint(-53.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 99, 1, 0, 0F); // Box 34
		bodyModel[3].setRotationPoint(-49.5F, 3F, -9.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 99, 1, 0, 0F); // Box 34
		bodyModel[4].setRotationPoint(-49.5F, 3F, 9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		bodyModel[5].setRotationPoint(-49.5F, 3F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(-49.5F, 3F, 7.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 99, 1, 17, 0F); // Box 34
		bodyModel[7].setRotationPoint(-49.5F, 2F, -8.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 99, 8, 1, 0F); // Box 13
		bodyModel[8].setRotationPoint(-49.5F, -5F, -9.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 99, 8, 1, 0F); // Box 14
		bodyModel[9].setRotationPoint(-49.5F, -5F, 8.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 7, 17, 0F); // Box 15
		bodyModel[10].setRotationPoint(-49F, -5F, -8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 189
		bodyModel[11].setRotationPoint(-49.98F, -1.5F, -8.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 189
		bodyModel[12].setRotationPoint(-49.98F, -1.5F, -3.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 189
		bodyModel[13].setRotationPoint(-49.98F, -4F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 189
		bodyModel[14].setRotationPoint(-49.98F, -4F, -3.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 189
		bodyModel[15].setRotationPoint(-49.98F, -2.25F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 29
		bodyModel[16].setRotationPoint(-49.98F, -4.75F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 30
		bodyModel[17].setRotationPoint(-49.98F, 0.25F, -8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, 0F); // Box 31
		bodyModel[18].setRotationPoint(-49.98F, -1.5F, 3.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, 0F); // Box 32
		bodyModel[19].setRotationPoint(-49.98F, -4F, 3.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 33
		bodyModel[20].setRotationPoint(-49.98F, -2.25F, 2.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 36
		bodyModel[21].setRotationPoint(-49.98F, -4.75F, 2.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 37
		bodyModel[22].setRotationPoint(-49.98F, 0.25F, 2.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 39
		bodyModel[23].setRotationPoint(-49.98F, 1F, -3.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 40
		bodyModel[24].setRotationPoint(-49.98F, 1F, -8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 41
		bodyModel[25].setRotationPoint(-49.98F, 1F, 3.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42
		bodyModel[26].setRotationPoint(-49.5F, -5F, -8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 43
		bodyModel[27].setRotationPoint(48.5F, -5F, -8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 44
		bodyModel[28].setRotationPoint(48.98F, -4F, 3.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[29].setRotationPoint(48.98F, -4.75F, 2.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[30].setRotationPoint(48.98F, -4F, -3.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 47
		bodyModel[31].setRotationPoint(48.98F, -4.75F, -8.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[32].setRotationPoint(48.98F, -4F, -8.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[33].setRotationPoint(48.98F, -2.25F, 2.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 50
		bodyModel[34].setRotationPoint(48.98F, -1.5F, 3.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[35].setRotationPoint(48.98F, -1.5F, -3.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[36].setRotationPoint(48.98F, -1.5F, -8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
		bodyModel[37].setRotationPoint(48.98F, -2.25F, -8.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 54
		bodyModel[38].setRotationPoint(48.98F, 0.25F, -8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[39].setRotationPoint(48.98F, 1F, -8.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[40].setRotationPoint(48.98F, 1F, -3.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[41].setRotationPoint(48.98F, 1F, 3.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[42].setRotationPoint(48.98F, 0.25F, 2.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 7, 17, 0F); // Box 59
		bodyModel[43].setRotationPoint(48F, -5F, -8.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 16, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 60
		bodyModel[44].setRotationPoint(-31.5F, 4F, -9.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 16, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[45].setRotationPoint(15.5F, 4F, -9.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 31, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[46].setRotationPoint(-15.5F, 4F, -9.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 16, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 63
		bodyModel[47].setRotationPoint(-31.5F, 4F, 9.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[48].setRotationPoint(15.5F, 4F, 9.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 31, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[49].setRotationPoint(-15.5F, 4F, 9.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 99, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[50].setRotationPoint(-49.5F, -5F, -10.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 99, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 67
		bodyModel[51].setRotationPoint(-49.5F, -5F, 9.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[52].setRotationPoint(-40F, -4F, -10.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[53].setRotationPoint(-33F, -4F, -10.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[54].setRotationPoint(-27F, -4F, -10.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 1.9F, 0F, 0F, 1.9F, 0F); // Box 71
		bodyModel[55].setRotationPoint(-20F, -4F, -10.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 1.9F, 0F, 0F, 1.9F, 0F); // Box 72
		bodyModel[56].setRotationPoint(19F, -4F, -10.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[57].setRotationPoint(26F, -4F, -10.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[58].setRotationPoint(32F, -4F, -10.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[59].setRotationPoint(39F, -4F, -10.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 76
		bodyModel[60].setRotationPoint(-14F, -4F, -10.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 77
		bodyModel[61].setRotationPoint(-7F, -4F, -10.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 78
		bodyModel[62].setRotationPoint(6F, -4F, -10.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 79
		bodyModel[63].setRotationPoint(13F, -4F, -10.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 80
		bodyModel[64].setRotationPoint(-0.5F, -4F, -10.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 81
		bodyModel[65].setRotationPoint(-40F, -4F, 9.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 82
		bodyModel[66].setRotationPoint(-33F, -4F, 9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 83
		bodyModel[67].setRotationPoint(-27F, -4F, 9.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 86
		bodyModel[68].setRotationPoint(26F, -4F, 9.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 87
		bodyModel[69].setRotationPoint(32F, -4F, 9.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 88
		bodyModel[70].setRotationPoint(39F, -4F, 9.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 213
		bodyModel[71].setRotationPoint(-50F, -1.5F, 8.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F); // Box 95
		bodyModel[72].setRotationPoint(-50.5F, -4F, 8.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[73].setRotationPoint(-52.5F, -5F, 10.25F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[74].setRotationPoint(-50.5F, -3F, 9.25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 22, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[75].setRotationPoint(-50F, 3.5F, 7.5F);

		bodyModel[76].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[76].setRotationPoint(-13.5F, 5F, 7.25F);
		bodyModel[76].rotateAngleX = -0.78539816F;

		bodyModel[77].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[77].setRotationPoint(-15.5F, 5F, 7.25F);
		bodyModel[77].rotateAngleX = -0.78539816F;

		bodyModel[78].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		bodyModel[78].setRotationPoint(-14F, 3F, 6.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 15, 0, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1F, 0F, 1.5F, -1F, 0F, 0F, 0F); // Box 102
		bodyModel[79].setRotationPoint(-28F, 3.5F, 7.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[80].setRotationPoint(-42F, 5F, -2F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[81].setRotationPoint(38F, 5F, -2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 105
		bodyModel[82].setRotationPoint(49.5F, 3F, -9.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[83].setRotationPoint(49.5F, 3F, 7.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 107
		bodyModel[84].setRotationPoint(-49.5F, 1F, 9.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[85].setRotationPoint(-48F, -5F, 9.25F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[86].setRotationPoint(-49F, 4F, 8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[87].setRotationPoint(-49F, 3F, 8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[88].setRotationPoint(-49F, 4F, -9.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[89].setRotationPoint(-49F, 3F, -9.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box cull
		bodyModel[90].setRotationPoint(45F, 4F, 8.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[91].setRotationPoint(45F, 3F, 8.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[92].setRotationPoint(45F, 3F, -9.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box cull
		bodyModel[93].setRotationPoint(45F, 4F, -9.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[94].setRotationPoint(-48F, -5F, -10.25F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[95].setRotationPoint(44F, -5F, -10.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[96].setRotationPoint(44F, -5F, 9.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[97].setRotationPoint(-49.5F, 1F, -10.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[98].setRotationPoint(48.5F, 1F, -10.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 123
		bodyModel[99].setRotationPoint(48.5F, 1F, 9.5F);

		bodyModel[100].addBox(-0.5F, 0F, -4F, 1, 0, 13, 0F); // Box 196
		bodyModel[100].setRotationPoint(-19.5F, 5.51F, 0F);
		bodyModel[100].rotateAngleY = -0.55850536F;

		bodyModel[101].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[101].setRotationPoint(-19.5F, 5.5F, 0F);
		bodyModel[101].rotateAngleY = -0.55850536F;

		bodyModel[102].addBox(-0.5F, 0F, 0F, 1, 0, 49, 0F); // Box 124
		bodyModel[102].setRotationPoint(-19.5F, 5.51F, 0F);
		bodyModel[102].rotateAngleY = -1.57079633F;

		bodyModel[103].addBox(-0.5F, 0F, -2F, 1, 0, 6, 0F); // Box 122
		bodyModel[103].setRotationPoint(29.5F, 5.51F, 0F);
		bodyModel[103].rotateAngleY = -0.10471976F;

		bodyModel[104].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 123
		bodyModel[104].setRotationPoint(29.5F, 5.5F, 0F);
		bodyModel[104].rotateAngleY = -0.10471976F;

		bodyModel[105].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 126
		bodyModel[105].setRotationPoint(27.5F, 4.75F, -2.25F);

		bodyModel[106].addBox(-11.5F, -0.75F, -0.5F, 12, 0, 1, 0F); // Box 128
		bodyModel[106].setRotationPoint(30F, 6.26F, 3.5F);
		bodyModel[106].rotateAngleY = -3.40339204F;
		bodyModel[106].rotateAngleZ = 0.08726646F;

		bodyModel[107].addBox(-18.5F, -0.75F, -0.5F, 18, 0, 1, 0F); // Box 202
		bodyModel[107].setRotationPoint(-20.5F, 6.26F, -3.5F);
		bodyModel[107].rotateAngleY = -0.17453293F;
		bodyModel[107].rotateAngleZ = 0.05235988F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 135
		bodyModel[108].setRotationPoint(-14F, -4F, 9.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 136
		bodyModel[109].setRotationPoint(-7F, -4F, 9.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 137
		bodyModel[110].setRotationPoint(6F, -4F, 9.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 138
		bodyModel[111].setRotationPoint(13F, -4F, 9.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 139
		bodyModel[112].setRotationPoint(-0.5F, -4F, 9.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 140
		bodyModel[113].setRotationPoint(-20F, -4F, 9.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 141
		bodyModel[114].setRotationPoint(19F, -4F, 9.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 148
		bodyModel[115].setRotationPoint(-41F, 3F, -9.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[116].setRotationPoint(-41F, 3F, 2.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 122
		bodyModel[117].setRotationPoint(39F, 3F, -9.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[118].setRotationPoint(39F, 3F, 2.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 126
		bodyModel[119].setRotationPoint(9F, 3F, -9.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 127
		bodyModel[120].setRotationPoint(9F, 3F, 2.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 128
		bodyModel[121].setRotationPoint(24F, 3F, -9.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[122].setRotationPoint(24F, 3F, 2.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 130
		bodyModel[123].setRotationPoint(-24F, 3F, -9.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[124].setRotationPoint(-24F, 3F, 2.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 132
		bodyModel[125].setRotationPoint(-9F, 3F, -9.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 133
		bodyModel[126].setRotationPoint(-9F, 3F, 2.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 127
		bodyModel[127].setRotationPoint(49.5F, 0F, -8.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[128].setRotationPoint(49.5F, 0F, 6.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[129].setRotationPoint(-49.5F, 0F, 6.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 130
		bodyModel[130].setRotationPoint(-49.5F, 0F, -8.5F);
	}
	ModelAndrews_Truck bogie2 = new ModelAndrews_Truck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 131; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9534){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Andrews_Truck_black.png"));
		}
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-2.5,-0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslated(2.5,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

	}
	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }
}