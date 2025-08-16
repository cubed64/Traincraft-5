//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator:
// Created on: 24.04.2025 - 22:24:09
// Last changed on: 24.04.2025 - 22:24:09

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelAndrews_Truck;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPS_40t_ss_box extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelPS_40t_ss_box() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[109];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 15, 2, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 244, 61, textureX, textureY); // Box 10 frame of the boose
		bodyModel[3] = new ModelRendererTurbo(this, 197, 47, textureX, textureY); // Box 194
		bodyModel[4] = new ModelRendererTurbo(this, 211, 50, textureX, textureY); // Box 195
		bodyModel[5] = new ModelRendererTurbo(this, 161, 91, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 2, 90, textureX, textureY); // Box 42
		bodyModel[7] = new ModelRendererTurbo(this, 102, 73, textureX, textureY); // Box 104
		bodyModel[8] = new ModelRendererTurbo(this, 102, 60, textureX, textureY); // Box 105
		bodyModel[9] = new ModelRendererTurbo(this, 231, 68, textureX, textureY, "cull"); // Box cull steel skirt
		bodyModel[10] = new ModelRendererTurbo(this, 72, 31, textureX, textureY); // Box 88
		bodyModel[11] = new ModelRendererTurbo(this, 51, 33, textureX, textureY); // Box 89
		bodyModel[12] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 91
		bodyModel[13] = new ModelRendererTurbo(this, 178, 50, textureX, textureY); // Box 92
		bodyModel[14] = new ModelRendererTurbo(this, 108, 95, textureX, textureY); // Box 108
		bodyModel[15] = new ModelRendererTurbo(this, 2, 109, textureX, textureY); // Box 143
		bodyModel[16] = new ModelRendererTurbo(this, 55, 90, textureX, textureY); // Box 142
		bodyModel[17] = new ModelRendererTurbo(this, 55, 109, textureX, textureY); // Box 143
		bodyModel[18] = new ModelRendererTurbo(this, 67, 53, textureX, textureY); // Box 239
		bodyModel[19] = new ModelRendererTurbo(this, 369, 15, textureX, textureY); // Box 240
		bodyModel[20] = new ModelRendererTurbo(this, 284, 9, textureX, textureY); // Box 49
		bodyModel[21] = new ModelRendererTurbo(this, 283, 3, textureX, textureY); // Box 51
		bodyModel[22] = new ModelRendererTurbo(this, 242, 55, textureX, textureY, "cull"); // Box 118 cull walkway
		bodyModel[23] = new ModelRendererTurbo(this, 272, 49, textureX, textureY, "cull"); // Box 215 cull support
		bodyModel[24] = new ModelRendererTurbo(this, 272, 43, textureX, textureY, "cull"); // Box cull
		bodyModel[25] = new ModelRendererTurbo(this, 310, 36, textureX, textureY); // Box 55
		bodyModel[26] = new ModelRendererTurbo(this, 284, 12, textureX, textureY); // Box 70
		bodyModel[27] = new ModelRendererTurbo(this, 284, 6, textureX, textureY); // Box 71
		bodyModel[28] = new ModelRendererTurbo(this, 283, 36, textureX, textureY); // Box 72
		bodyModel[29] = new ModelRendererTurbo(this, 178, 50, textureX, textureY); // Box 85
		bodyModel[30] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 86
		bodyModel[31] = new ModelRendererTurbo(this, 197, 47, textureX, textureY); // Box 87
		bodyModel[32] = new ModelRendererTurbo(this, 211, 50, textureX, textureY); // Box 88
		bodyModel[33] = new ModelRendererTurbo(this, 352, 36, textureX, textureY); // Box 63
		bodyModel[34] = new ModelRendererTurbo(this, 257, 28, textureX, textureY); // Box 64
		bodyModel[35] = new ModelRendererTurbo(this, 242, 28, textureX, textureY); // Box 65
		bodyModel[36] = new ModelRendererTurbo(this, 257, 37, textureX, textureY); // Box 66
		bodyModel[37] = new ModelRendererTurbo(this, 347, 36, textureX, textureY); // Box 67
		bodyModel[38] = new ModelRendererTurbo(this, 242, 37, textureX, textureY); // Box 68
		bodyModel[39] = new ModelRendererTurbo(this, 257, 46, textureX, textureY); // Box 69
		bodyModel[40] = new ModelRendererTurbo(this, 242, 46, textureX, textureY); // Box 70
		bodyModel[41] = new ModelRendererTurbo(this, 160, 99, textureX, textureY); // Box 70
		bodyModel[42] = new ModelRendererTurbo(this, 149, 97, textureX, textureY); // Box 71
		bodyModel[43] = new ModelRendererTurbo(this, 138, 99, textureX, textureY); // Box 72
		bodyModel[44] = new ModelRendererTurbo(this, 127, 101, textureX, textureY); // Box 73
		bodyModel[45] = new ModelRendererTurbo(this, 14, 63, textureX, textureY, "cull"); // Box cull
		bodyModel[46] = new ModelRendererTurbo(this, 374, 15, textureX, textureY); // Box 75
		bodyModel[47] = new ModelRendererTurbo(this, 17, 58, textureX, textureY); // Box 76
		bodyModel[48] = new ModelRendererTurbo(this, 359, 15, textureX, textureY); // Box 77
		bodyModel[49] = new ModelRendererTurbo(this, 342, 36, textureX, textureY); // Box 78
		bodyModel[50] = new ModelRendererTurbo(this, 337, 36, textureX, textureY); // Box 79
		bodyModel[51] = new ModelRendererTurbo(this, 364, 15, textureX, textureY); // Box 80
		bodyModel[52] = new ModelRendererTurbo(this, 9, 61, textureX, textureY); // Box 222
		bodyModel[53] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 223
		bodyModel[54] = new ModelRendererTurbo(this, 72, 43, textureX, textureY, "cull"); // Box cull
		bodyModel[55] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 287
		bodyModel[56] = new ModelRendererTurbo(this, 9, 48, textureX, textureY); // Box 196
		bodyModel[57] = new ModelRendererTurbo(this, 0, 36, textureX, textureY); // Box 198
		bodyModel[58] = new ModelRendererTurbo(this, 7, 38, textureX, textureY); // Box 199
		bodyModel[59] = new ModelRendererTurbo(this, 8, 50, textureX, textureY); // Box 201
		bodyModel[60] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 202
		bodyModel[61] = new ModelRendererTurbo(this, 0, 30, textureX, textureY); // Box 203
		bodyModel[62] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Box 204
		bodyModel[63] = new ModelRendererTurbo(this, 7, 38, textureX, textureY); // Box 200
		bodyModel[64] = new ModelRendererTurbo(this, 349, 15, textureX, textureY); // Box 90
		bodyModel[65] = new ModelRendererTurbo(this, 344, 15, textureX, textureY); // Box 91
		bodyModel[66] = new ModelRendererTurbo(this, 424, 10, textureX, textureY); // Box 92
		bodyModel[67] = new ModelRendererTurbo(this, 339, 15, textureX, textureY); // Box 93
		bodyModel[68] = new ModelRendererTurbo(this, 419, 10, textureX, textureY); // Box 94
		bodyModel[69] = new ModelRendererTurbo(this, 419, 10, textureX, textureY); // Box 100
		bodyModel[70] = new ModelRendererTurbo(this, 339, 15, textureX, textureY); // Box 101
		bodyModel[71] = new ModelRendererTurbo(this, 329, 15, textureX, textureY); // Box 102
		bodyModel[72] = new ModelRendererTurbo(this, 344, 15, textureX, textureY); // Box 103
		bodyModel[73] = new ModelRendererTurbo(this, 339, 15, textureX, textureY); // Box 104
		bodyModel[74] = new ModelRendererTurbo(this, 339, 15, textureX, textureY); // Box 105
		bodyModel[75] = new ModelRendererTurbo(this, 394, 10, textureX, textureY); // Box 106
		bodyModel[76] = new ModelRendererTurbo(this, 444, 10, textureX, textureY); // Box 107
		bodyModel[77] = new ModelRendererTurbo(this, 439, 10, textureX, textureY); // Box 108
		bodyModel[78] = new ModelRendererTurbo(this, 334, 15, textureX, textureY); // Box 109
		bodyModel[79] = new ModelRendererTurbo(this, 344, 15, textureX, textureY); // Box 110
		bodyModel[80] = new ModelRendererTurbo(this, 339, 15, textureX, textureY); // Box 111
		bodyModel[81] = new ModelRendererTurbo(this, 339, 15, textureX, textureY); // Box 112
		bodyModel[82] = new ModelRendererTurbo(this, 399, 10, textureX, textureY); // Box 113
		bodyModel[83] = new ModelRendererTurbo(this, 404, 10, textureX, textureY); // Box 114
		bodyModel[84] = new ModelRendererTurbo(this, 434, 10, textureX, textureY); // Box 115
		bodyModel[85] = new ModelRendererTurbo(this, 354, 15, textureX, textureY); // Box 116
		bodyModel[86] = new ModelRendererTurbo(this, 344, 15, textureX, textureY); // Box 117
		bodyModel[87] = new ModelRendererTurbo(this, 429, 10, textureX, textureY); // Box 118
		bodyModel[88] = new ModelRendererTurbo(this, 339, 15, textureX, textureY); // Box 119
		bodyModel[89] = new ModelRendererTurbo(this, 409, 10, textureX, textureY); // Box 120
		bodyModel[90] = new ModelRendererTurbo(this, 414, 10, textureX, textureY); // Box 121
		bodyModel[91] = new ModelRendererTurbo(this, 339, 15, textureX, textureY); // Box 122
		bodyModel[92] = new ModelRendererTurbo(this, 405, 46, textureX, textureY, "cull"); // Box cull
		bodyModel[93] = new ModelRendererTurbo(this, 396, 46, textureX, textureY, "cull"); // Box cull
		bodyModel[94] = new ModelRendererTurbo(this, 405, 66, textureX, textureY, "cull"); // Box cull
		bodyModel[95] = new ModelRendererTurbo(this, 396, 66, textureX, textureY, "cull"); // Box cull
		bodyModel[96] = new ModelRendererTurbo(this, 422, 66, textureX, textureY, "cull"); // Box cull
		bodyModel[97] = new ModelRendererTurbo(this, 413, 66, textureX, textureY, "cull"); // Box cull
		bodyModel[98] = new ModelRendererTurbo(this, 414, 54, textureX, textureY, "cull"); // Box cull
		bodyModel[99] = new ModelRendererTurbo(this, 423, 54, textureX, textureY, "cull"); // Box cull
		bodyModel[100] = new ModelRendererTurbo(this, 414, 46, textureX, textureY); // Box 135
		bodyModel[101] = new ModelRendererTurbo(this, 387, 42, textureX, textureY,"cull"); // Box cull
		bodyModel[102] = new ModelRendererTurbo(this, 387, 48, textureX, textureY,"cull"); // Box cull
		bodyModel[103] = new ModelRendererTurbo(this, 387, 54, textureX, textureY,"cull"); // Box cull
		bodyModel[104] = new ModelRendererTurbo(this, 387, 60, textureX, textureY, "cull"); // Box cull
		bodyModel[105] = new ModelRendererTurbo(this, 273, 27, textureX, textureY, "cull"); // Box cull supp
		bodyModel[106] = new ModelRendererTurbo(this, 289, 25, textureX, textureY, "cull"); // Box cull supp
		bodyModel[107] = new ModelRendererTurbo(this, 1, 15, textureX, textureY, "cull"); // Box cull
		bodyModel[108] = new ModelRendererTurbo(this, 15, 18, textureX, textureY, "cull"); // Box cull

		bodyModel[0].addBox(-3F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-32.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(32.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 65, 2, 4, 0F); // Box 10 frame of the boose
		bodyModel[2].setRotationPoint(-32.5F, 3F, -2F);

		bodyModel[3].addShapeBox(-3F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.05F, 0F, -1F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[3].setRotationPoint(24F, 3F, -9F);

		bodyModel[4].addShapeBox(-3F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.05F, 0F, -1F, -0.05F); // Box 195
		bodyModel[4].setRotationPoint(24F, 3F, 2F);

		bodyModel[5].addBox(0F, 0F, 0F, 62, 1, 18, 0F); // Box 11
		bodyModel[5].setRotationPoint(-31F, 2F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 25, 17, 1, 0F); // Box 42
		bodyModel[6].setRotationPoint(-31F, -15F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 63, 2, 10, 0F,0F, -1.5F, -0.45F, 0F, -1.5F, -0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 104
		bodyModel[7].setRotationPoint(-31.5F, -17F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 63, 2, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.45F, 0F, -1.5F, -0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F); // Box 105
		bodyModel[8].setRotationPoint(-31.5F, -17F, 0F);

		bodyModel[9].addBox(0F, 0F, 0F, 62, 1, 18, 0F); // Box cull steel skirt
		bodyModel[9].setRotationPoint(-31F, 3F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 88
		bodyModel[10].setRotationPoint(6F, 3F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 89
		bodyModel[11].setRotationPoint(-7F, 3F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 1F, 0F, -0.5F, 1F, 0F); // Box 91
		bodyModel[12].setRotationPoint(13.5F, 3F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 92
		bodyModel[13].setRotationPoint(13.5F, 3F, 2F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 108
		bodyModel[14].setRotationPoint(30F, -14F, -8F);

		bodyModel[15].addBox(0F, 0F, 0F, 25, 17, 1, 0F); // Box 143
		bodyModel[15].setRotationPoint(6F, -15F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 25, 17, 1, 0F); // Box 142
		bodyModel[16].setRotationPoint(-31F, -15F, 8F);

		bodyModel[17].addBox(0F, 0F, 0F, 25, 17, 1, 0F); // Box 143
		bodyModel[17].setRotationPoint(6F, -15F, 8F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 239
		bodyModel[18].setRotationPoint(-31F, -14F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[19].setRotationPoint(-31.45F, -16F, -3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[20].setRotationPoint(-6F, -15.5F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 51
		bodyModel[21].setRotationPoint(-6F, 1.5F, -9.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 65, 1, 4, 0F); // Box 118 cull walkway
		bodyModel[22].setRotationPoint(-32.5F, -17F, -2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F); // Box 215 cull support
		bodyModel[23].setRotationPoint(-32.5F, -16F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F); // Box cull
		bodyModel[24].setRotationPoint(31.5F, -16F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 12, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[25].setRotationPoint(-6F, -14.5F, -10.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 70
		bodyModel[26].setRotationPoint(-17F, -15.5F, 9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[27].setRotationPoint(-6F, 1.5F, 8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 72
		bodyModel[28].setRotationPoint(-6F, -14.5F, 9.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 1F, 0F, -0.5F, 1F, 0F); // Box 85
		bodyModel[29].setRotationPoint(-15.5F, 3F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 86
		bodyModel[30].setRotationPoint(-15.5F, 3F, 2F);

		bodyModel[31].addShapeBox(-3F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.05F, 0F, -1F, -0.05F); // Box 87
		bodyModel[31].setRotationPoint(-21F, 3F, 2F);

		bodyModel[32].addShapeBox(-3F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.05F, 0F, -1F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[32].setRotationPoint(-21F, 3F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[33].setRotationPoint(-31.45F, -15F, -5.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 64
		bodyModel[34].setRotationPoint(-32F, 2F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 65
		bodyModel[35].setRotationPoint(-32F, 2F, 3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 66
		bodyModel[36].setRotationPoint(-32F, 2F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 67
		bodyModel[37].setRotationPoint(-31.45F, -15F, 4.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[38].setRotationPoint(31F, 2F, 3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[39].setRotationPoint(31F, 2F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[40].setRotationPoint(31F, 2F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[41].setRotationPoint(-31F, -15F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[42].setRotationPoint(-31F, -15F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[43].setRotationPoint(30F, -15F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[44].setRotationPoint(30F, -15F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box cull
		bodyModel[45].setRotationPoint(-32.5F, 5F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 75
		bodyModel[46].setRotationPoint(-31.75F, -15F, 2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[47].setRotationPoint(-32.75F, -16F, 2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F); // Box 77
		bodyModel[48].setRotationPoint(30.45F, -16F, 2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 78
		bodyModel[49].setRotationPoint(30.45F, -15F, 4.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 79
		bodyModel[50].setRotationPoint(30.45F, -15F, -5.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 80
		bodyModel[51].setRotationPoint(30.45F, -16F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 222
		bodyModel[52].setRotationPoint(-32.75F, -20.5F, 2F);

		bodyModel[53].addShapeBox(-3.5F, -0.5F, -3F, 5, 0, 5, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 223
		bodyModel[53].setRotationPoint(-32.25F, -20F, 2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[54].setRotationPoint(30.5F, 5F, 2F);

		bodyModel[55].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[55].setRotationPoint(-2F, 6F, -2F);
		bodyModel[55].rotateAngleX = -0.78539816F;

		bodyModel[56].addBox(-0.5F, 0F, -3F, 1, 0, 6, 0F); // Box 196
		bodyModel[56].setRotationPoint(-8F, 6.01F, 0F);
		bodyModel[56].rotateAngleY = -0.52359878F;

		bodyModel[57].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 198
		bodyModel[57].setRotationPoint(-9.5F, 6F, -2.5F);

		bodyModel[58].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[58].setRotationPoint(-8F, 6.01F, 0F);
		bodyModel[58].rotateAngleY = -0.52359878F;

		bodyModel[59].addBox(-0.5F, 0F, -2F, 1, 0, 4, 0F); // Box 201
		bodyModel[59].setRotationPoint(6F, 6.01F, 0F);
		bodyModel[59].rotateAngleY = -0.26179939F;

		bodyModel[60].addBox(-0.5F, 0F, 0F, 13, 0, 1, 0F); // Box 202
		bodyModel[60].setRotationPoint(-19F, 7.01F, -0.5F);
		bodyModel[60].rotateAngleY = 0.17453293F;
		bodyModel[60].rotateAngleZ = 0.08726646F;

		bodyModel[61].addBox(0F, 0F, 0F, 14, 0, 1, 0F); // Box 203
		bodyModel[61].setRotationPoint(-8F, 6F, 0F);

		bodyModel[62].addBox(-1F, 0F, -1.5F, 13, 0, 1, 0F); // Box 204
		bodyModel[62].setRotationPoint(6F, 6.01F, -0.5F);
		bodyModel[62].rotateAngleY = 0.17453293F;
		bodyModel[62].rotateAngleZ = -0.05235988F;

		bodyModel[63].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 200
		bodyModel[63].setRotationPoint(6F, 6.01F, 0F);
		bodyModel[63].rotateAngleY = -0.26179939F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 90
		bodyModel[64].setRotationPoint(5.5F, -15F, 8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[65].setRotationPoint(11.5F, -15F, 8.5F);

		bodyModel[66].addShapeBox(0F, 0.5F, 0F, 1, 19, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[66].setRotationPoint(6.25F, -15F, 8.5F);
		bodyModel[66].rotateAngleZ = 0.2443461F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[67].setRotationPoint(17.5F, -15F, 8.5F);

		bodyModel[68].addShapeBox(0F, 0.5F, 0F, 1, 19, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[68].setRotationPoint(12.25F, -15F, 8.5F);
		bodyModel[68].rotateAngleZ = 0.2443461F;

		bodyModel[69].addShapeBox(0F, 0.5F, 0F, 1, 19, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[69].setRotationPoint(18.25F, -15F, 8.5F);
		bodyModel[69].rotateAngleZ = 0.2443461F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[70].setRotationPoint(23.5F, -15F, 8.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 102
		bodyModel[71].setRotationPoint(-6.5F, -15F, -9.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 103
		bodyModel[72].setRotationPoint(-12.5F, -15F, -9.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 104
		bodyModel[73].setRotationPoint(-18.5F, -15F, -9.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 105
		bodyModel[74].setRotationPoint(-24.5F, -15F, -9.5F);

		bodyModel[75].addShapeBox(-1F, 0.5F, 0F, 1, 19, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 106
		bodyModel[75].setRotationPoint(-18.25F, -15F, -9.5F);
		bodyModel[75].rotateAngleZ = -0.2443461F;

		bodyModel[76].addShapeBox(-1F, 0.5F, 0F, 1, 19, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 107
		bodyModel[76].setRotationPoint(-12.25F, -15F, -9.5F);
		bodyModel[76].rotateAngleZ = -0.2443461F;

		bodyModel[77].addShapeBox(-1F, 0.5F, 0F, 1, 19, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 108
		bodyModel[77].setRotationPoint(-6.25F, -15F, -9.5F);
		bodyModel[77].rotateAngleZ = -0.2443461F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[78].setRotationPoint(-6.5F, -15F, 8.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 110
		bodyModel[79].setRotationPoint(-12.5F, -15F, 8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 111
		bodyModel[80].setRotationPoint(-18.5F, -15F, 8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 112
		bodyModel[81].setRotationPoint(-24.5F, -15F, 8.5F);

		bodyModel[82].addShapeBox(-1F, 0.5F, 0F, 1, 19, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 113
		bodyModel[82].setRotationPoint(-18.25F, -15F, 8.5F);
		bodyModel[82].rotateAngleZ = -0.2443461F;

		bodyModel[83].addShapeBox(-1F, 0.5F, 0F, 1, 19, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 114
		bodyModel[83].setRotationPoint(-12.25F, -15F, 8.5F);
		bodyModel[83].rotateAngleZ = -0.2443461F;

		bodyModel[84].addShapeBox(-1F, 0.5F, 0F, 1, 19, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 115
		bodyModel[84].setRotationPoint(-6.25F, -15F, 8.5F);
		bodyModel[84].rotateAngleZ = -0.2443461F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 116
		bodyModel[85].setRotationPoint(5.5F, -15F, -9.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 117
		bodyModel[86].setRotationPoint(11.5F, -15F, -9.5F);

		bodyModel[87].addShapeBox(0F, 0.5F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 118
		bodyModel[87].setRotationPoint(6.25F, -15F, -9.5F);
		bodyModel[87].rotateAngleZ = 0.2443461F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 119
		bodyModel[88].setRotationPoint(17.5F, -15F, -9.5F);

		bodyModel[89].addShapeBox(0F, 0.5F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 120
		bodyModel[89].setRotationPoint(12.25F, -15F, -9.5F);
		bodyModel[89].rotateAngleZ = 0.2443461F;

		bodyModel[90].addShapeBox(0F, 0.5F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121
		bodyModel[90].setRotationPoint(18.25F, -15F, -9.5F);
		bodyModel[90].rotateAngleZ = 0.2443461F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		bodyModel[91].setRotationPoint(23.5F, -15F, -9.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 18, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box cull
		bodyModel[92].setRotationPoint(27.5F, -14F, -9.75F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 18, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box cull
		bodyModel[93].setRotationPoint(27.5F, -14F, 8.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 18, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[94].setRotationPoint(-30.5F, -14F, -9.75F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 18, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[95].setRotationPoint(-30.5F, -14F, 8.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box cull
		bodyModel[96].setRotationPoint(-31.5F, -14F, 5.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 16, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[97].setRotationPoint(30.5F, -14F, -8.25F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box cull
		bodyModel[98].setRotationPoint(30.5F, -6F, 5.25F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[99].setRotationPoint(-31.5F, -6F, -8.25F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[100].setRotationPoint(-31.45F, -13F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[101].setRotationPoint(-30.25F, 3F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[102].setRotationPoint(-30.25F, 3F, 8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[103].setRotationPoint(27.25F, 3F, -9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[104].setRotationPoint(27.25F, 3F, 8F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box cull supp
		bodyModel[105].setRotationPoint(-30.5F, -17F, 2F);
		bodyModel[105].rotateAngleX = -0.10471976F;

		bodyModel[106].addBox(0F, 0F, -7F, 4, 1, 7, 0F); // Box cull supp
		bodyModel[106].setRotationPoint(26.5F, -17F, -2F);
		bodyModel[106].rotateAngleX = 0.10471976F;

		bodyModel[107].addShapeBox(-3F, 0F, 0F, 2, 2, 9, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box cull
		bodyModel[107].setRotationPoint(-31.1F, 2F, 0F);

		bodyModel[108].addShapeBox(-3F, 0F, 0F, 2, 2, 9, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[108].setRotationPoint(35.1F, 2F, -9F);
	}
	ModelAndrews_Truck bogie2 = new ModelAndrews_Truck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 109; i++)
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
		GL11.glTranslated(-1.4,-0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.82,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}