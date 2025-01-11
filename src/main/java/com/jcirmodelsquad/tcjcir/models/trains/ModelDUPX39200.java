//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DUPX39200galTank
// Model Creator: Bidahochi
// Created on: 05.06.2021 - 23:33:31
// Last changed on: 05.06.2021 - 23:33:31

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBuckeye3AxleLate;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelDUPX39200 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDUPX39200() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[141];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 121, 71, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 121, 71, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 146, 66, textureX, textureY); // Box 75
		bodyModel[3] = new ModelRendererTurbo(this, 61, 66, textureX, textureY); // Box 75
		bodyModel[4] = new ModelRendererTurbo(this, 128, 73, textureX, textureY, "cull"); // Box 75 cull platform
		bodyModel[5] = new ModelRendererTurbo(this, 43, 73, textureX, textureY, "cull"); // Box 75 cull platform
		bodyModel[6] = new ModelRendererTurbo(this, 256, 125, textureX, textureY); // Box 108
		bodyModel[7] = new ModelRendererTurbo(this, 106, 62, textureX, textureY); // Box 73
		bodyModel[8] = new ModelRendererTurbo(this, 46, 62, textureX, textureY); // Box 73
		bodyModel[9] = new ModelRendererTurbo(this, 191, 62, textureX, textureY); // Box 73
		bodyModel[10] = new ModelRendererTurbo(this, 131, 62, textureX, textureY); // Box 73
		bodyModel[11] = new ModelRendererTurbo(this, 63, 24, textureX, textureY); // Box 124
		bodyModel[12] = new ModelRendererTurbo(this, 148, 24, textureX, textureY); // Box 124
		bodyModel[13] = new ModelRendererTurbo(this, 106, 86, textureX, textureY); // Box 126
		bodyModel[14] = new ModelRendererTurbo(this, 106, 80, textureX, textureY); // Box 126
		bodyModel[15] = new ModelRendererTurbo(this, 191, 86, textureX, textureY); // Box 126
		bodyModel[16] = new ModelRendererTurbo(this, 191, 80, textureX, textureY); // Box 126
		bodyModel[17] = new ModelRendererTurbo(this, 74, 58, textureX, textureY); // Box 75
		bodyModel[18] = new ModelRendererTurbo(this, 159, 58, textureX, textureY); // Box 75
		bodyModel[19] = new ModelRendererTurbo(this, 14, 143, textureX, textureY); // Box 138
		bodyModel[20] = new ModelRendererTurbo(this, 297, 76, textureX, textureY); // Box 140
		bodyModel[21] = new ModelRendererTurbo(this, 249, 73, textureX, textureY, "cull"); // Box 141 cull cage top
		bodyModel[22] = new ModelRendererTurbo(this, 44, 81, textureX, textureY); // Box 146
		bodyModel[23] = new ModelRendererTurbo(this, 245, 150, textureX, textureY); // Box 108 hazmat plac
		bodyModel[24] = new ModelRendererTurbo(this, 267, 139, textureX, textureY); // Box 116
		bodyModel[25] = new ModelRendererTurbo(this, 257, 131, textureX, textureY); // Box 118
		bodyModel[26] = new ModelRendererTurbo(this, 310, 125, textureX, textureY); // Box 119
		bodyModel[27] = new ModelRendererTurbo(this, 105, 56, textureX, textureY); // Box 126
		bodyModel[28] = new ModelRendererTurbo(this, 63, 56, textureX, textureY); // Box 127
		bodyModel[29] = new ModelRendererTurbo(this, 148, 56, textureX, textureY); // Box 128
		bodyModel[30] = new ModelRendererTurbo(this, 190, 56, textureX, textureY); // Box 129
		bodyModel[31] = new ModelRendererTurbo(this, 245, 145, textureX, textureY); // Box 130 hazmat plac
		bodyModel[32] = new ModelRendererTurbo(this, 3, 195, textureX, textureY); // Box 3
		bodyModel[33] = new ModelRendererTurbo(this, 246, 177, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 250, 163, textureX, textureY); // Box 5
		bodyModel[35] = new ModelRendererTurbo(this, 17, 163, textureX, textureY); // Box 5
		bodyModel[36] = new ModelRendererTurbo(this, 13, 177, textureX, textureY); // Box 4
		bodyModel[37] = new ModelRendererTurbo(this, 246, 223, textureX, textureY); // Box 4
		bodyModel[38] = new ModelRendererTurbo(this, 250, 241, textureX, textureY); // Box 5
		bodyModel[39] = new ModelRendererTurbo(this, 17, 241, textureX, textureY); // Box 5
		bodyModel[40] = new ModelRendererTurbo(this, 13, 223, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 53, 117, textureX, textureY); // Box 4
		bodyModel[42] = new ModelRendererTurbo(this, 67, 111, textureX, textureY); // Box 5
		bodyModel[43] = new ModelRendererTurbo(this, 95, 111, textureX, textureY); // Box 5
		bodyModel[44] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 4
		bodyModel[45] = new ModelRendererTurbo(this, 56, 138, textureX, textureY); // Box 4
		bodyModel[46] = new ModelRendererTurbo(this, 71, 146, textureX, textureY); // Box 5
		bodyModel[47] = new ModelRendererTurbo(this, 91, 146, textureX, textureY); // Box 5
		bodyModel[48] = new ModelRendererTurbo(this, 104, 138, textureX, textureY); // Box 4
		bodyModel[49] = new ModelRendererTurbo(this, 94, 125, textureX, textureY); // Box 3
		bodyModel[50] = new ModelRendererTurbo(this, 68, 125, textureX, textureY); // Box 3
		bodyModel[51] = new ModelRendererTurbo(this, 81, 133, textureX, textureY); // Box 3
		bodyModel[52] = new ModelRendererTurbo(this, 188, 117, textureX, textureY); // Box 4
		bodyModel[53] = new ModelRendererTurbo(this, 176, 111, textureX, textureY); // Box 5
		bodyModel[54] = new ModelRendererTurbo(this, 148, 111, textureX, textureY); // Box 5
		bodyModel[55] = new ModelRendererTurbo(this, 134, 117, textureX, textureY); // Box 4
		bodyModel[56] = new ModelRendererTurbo(this, 185, 138, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 172, 146, textureX, textureY); // Box 5
		bodyModel[58] = new ModelRendererTurbo(this, 152, 146, textureX, textureY); // Box 5
		bodyModel[59] = new ModelRendererTurbo(this, 137, 138, textureX, textureY); // Box 4
		bodyModel[60] = new ModelRendererTurbo(this, 149, 125, textureX, textureY); // Box 3
		bodyModel[61] = new ModelRendererTurbo(this, 175, 125, textureX, textureY); // Box 3
		bodyModel[62] = new ModelRendererTurbo(this, 162, 133, textureX, textureY); // Box 3
		bodyModel[63] = new ModelRendererTurbo(this, 287, 131, textureX, textureY); // Box 241
		bodyModel[64] = new ModelRendererTurbo(this, 287, 139, textureX, textureY); // Box 242
		bodyModel[65] = new ModelRendererTurbo(this, 311, 131, textureX, textureY); // Box 243
		bodyModel[66] = new ModelRendererTurbo(this, 341, 131, textureX, textureY); // Box 244
		bodyModel[67] = new ModelRendererTurbo(this, 341, 139, textureX, textureY); // Box 245
		bodyModel[68] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 246
		bodyModel[69] = new ModelRendererTurbo(this, 18, 135, textureX, textureY); // Box 267
		bodyModel[70] = new ModelRendererTurbo(this, 30, 141, textureX, textureY); // Box 268
		bodyModel[71] = new ModelRendererTurbo(this, 28, 136, textureX, textureY); // Box 269
		bodyModel[72] = new ModelRendererTurbo(this, 4, 138, textureX, textureY); // Box 270
		bodyModel[73] = new ModelRendererTurbo(this, 252, 98, textureX, textureY); // Box 271
		bodyModel[74] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 273
		bodyModel[75] = new ModelRendererTurbo(this, 240, 75, textureX, textureY); // Box 275
		bodyModel[76] = new ModelRendererTurbo(this, 240, 86, textureX, textureY); // Box 276
		bodyModel[77] = new ModelRendererTurbo(this, 231, 75, textureX, textureY); // Box 277
		bodyModel[78] = new ModelRendererTurbo(this, 231, 86, textureX, textureY); // Box 278
		bodyModel[79] = new ModelRendererTurbo(this, 320, 71, textureX, textureY, "cull"); // Box 280 cull
		bodyModel[80] = new ModelRendererTurbo(this, 302, 83, textureX, textureY); // Box 284
		bodyModel[81] = new ModelRendererTurbo(this, 299, 83, textureX, textureY); // Box 285
		bodyModel[82] = new ModelRendererTurbo(this, 54, 76, textureX, textureY); // Box 286
		bodyModel[83] = new ModelRendererTurbo(this, 43, 76, textureX, textureY); // Box 287
		bodyModel[84] = new ModelRendererTurbo(this, 74, 92, textureX, textureY, "cull"); // Box 119 cull
		bodyModel[85] = new ModelRendererTurbo(this, 74, 89, textureX, textureY, "cull"); // Box 121 cull
		bodyModel[86] = new ModelRendererTurbo(this, 159, 92, textureX, textureY, "cull"); // Box 122 cull
		bodyModel[87] = new ModelRendererTurbo(this, 159, 89, textureX, textureY, "cull"); // Box 124 cull
		bodyModel[88] = new ModelRendererTurbo(this, 56, 70, textureX, textureY); // Box 125
		bodyModel[89] = new ModelRendererTurbo(this, 56, 70, textureX, textureY); // Box 126
		bodyModel[90] = new ModelRendererTurbo(this, 121, 62, textureX, textureY); // Box 28
		bodyModel[91] = new ModelRendererTurbo(this, 124, 77, textureX, textureY); // Box 59
		bodyModel[92] = new ModelRendererTurbo(this, 124, 77, textureX, textureY); // Box 60
		bodyModel[93] = new ModelRendererTurbo(this, 124, 77, textureX, textureY); // Box 61
		bodyModel[94] = new ModelRendererTurbo(this, 124, 77, textureX, textureY); // Box 62
		bodyModel[95] = new ModelRendererTurbo(this, 121, 62, textureX, textureY); // Box 132
		bodyModel[96] = new ModelRendererTurbo(this, 305, 71, textureX, textureY, "cull"); // Box 133 cull
		bodyModel[97] = new ModelRendererTurbo(this, 245, 135, textureX, textureY); // Box 108 hazmat plac
		bodyModel[98] = new ModelRendererTurbo(this, 242, 134, textureX, textureY); // Box 614
		bodyModel[99] = new ModelRendererTurbo(this, 245, 140, textureX, textureY); // Box 108 hazmat plac
		bodyModel[100] = new ModelRendererTurbo(this, 242, 139, textureX, textureY); // Box 614
		bodyModel[101] = new ModelRendererTurbo(this, 20, 67, textureX, textureY); // Box 72
		bodyModel[102] = new ModelRendererTurbo(this, 27, 78, textureX, textureY); // Box 87
		bodyModel[103] = new ModelRendererTurbo(this, 21, 78, textureX, textureY); // Box 87
		bodyModel[104] = new ModelRendererTurbo(this, 20, 62, textureX, textureY, "cull"); // Box 118 cull
		bodyModel[105] = new ModelRendererTurbo(this, 17, 72, textureX, textureY); // Box 132
		bodyModel[106] = new ModelRendererTurbo(this, 45, 69, textureX, textureY); // Box 144
		bodyModel[107] = new ModelRendererTurbo(this, 45, 69, textureX, textureY); // Box 145
		bodyModel[108] = new ModelRendererTurbo(this, 42, 89, textureX, textureY); // Box 491 abd
		bodyModel[109] = new ModelRendererTurbo(this, 49, 88, textureX, textureY); // Box 93 abd
		bodyModel[110] = new ModelRendererTurbo(this, 56, 89, textureX, textureY); // Box 94 abd
		bodyModel[111] = new ModelRendererTurbo(this, 99, 79, textureX, textureY); // Box 150
		bodyModel[112] = new ModelRendererTurbo(this, 99, 77, textureX, textureY); // Box 151
		bodyModel[113] = new ModelRendererTurbo(this, 184, 77, textureX, textureY); // Box 152
		bodyModel[114] = new ModelRendererTurbo(this, 184, 79, textureX, textureY); // Box 153
		bodyModel[115] = new ModelRendererTurbo(this, 235, 107, textureX, textureY, "cull"); // Box 154 cull
		bodyModel[116] = new ModelRendererTurbo(this, 239, 111, textureX, textureY); // Box 155
		bodyModel[117] = new ModelRendererTurbo(this, 236, 115, textureX, textureY); // Box 156
		bodyModel[118] = new ModelRendererTurbo(this, 235, 114, textureX, textureY); // Box 157
		bodyModel[119] = new ModelRendererTurbo(this, 217, 107, textureX, textureY, "cull"); // Box 158 cull
		bodyModel[120] = new ModelRendererTurbo(this, 218, 115, textureX, textureY); // Box 159
		bodyModel[121] = new ModelRendererTurbo(this, 221, 111, textureX, textureY); // Box 160
		bodyModel[122] = new ModelRendererTurbo(this, 217, 114, textureX, textureY); // Box 161
		bodyModel[123] = new ModelRendererTurbo(this, 302, 141, textureX, textureY); // Box 162
		bodyModel[124] = new ModelRendererTurbo(this, 310, 141, textureX, textureY); // Box 163
		bodyModel[125] = new ModelRendererTurbo(this, 35, 83, textureX, textureY); // Box 164 magical cube of does something that idk lol
		bodyModel[126] = new ModelRendererTurbo(this, 12, 100, textureX, textureY); // Box 165
		bodyModel[127] = new ModelRendererTurbo(this, 12, 100, textureX, textureY); // Box 166
		bodyModel[128] = new ModelRendererTurbo(this, 12, 100, textureX, textureY); // Box 167
		bodyModel[129] = new ModelRendererTurbo(this, 12, 100, textureX, textureY); // Box 168
		bodyModel[130] = new ModelRendererTurbo(this, 12, 100, textureX, textureY); // Box 169
		bodyModel[131] = new ModelRendererTurbo(this, 255, 142, textureX, textureY); // Box 170
		bodyModel[132] = new ModelRendererTurbo(this, 255, 142, textureX, textureY); // Box 171
		bodyModel[133] = new ModelRendererTurbo(this, 17, 70, textureX, textureY); // Box 125
		bodyModel[134] = new ModelRendererTurbo(this, 299, 79, textureX, textureY); // Box 173
		bodyModel[135] = new ModelRendererTurbo(this, 299, 79, textureX, textureY); // Box 174
		bodyModel[136] = new ModelRendererTurbo(this, 302, 80, textureX, textureY); // Box 175
		bodyModel[137] = new ModelRendererTurbo(this, 302, 80, textureX, textureY); // Box 176
		bodyModel[138] = new ModelRendererTurbo(this, 302, 80, textureX, textureY); // Box 177
		bodyModel[139] = new ModelRendererTurbo(this, 302, 80, textureX, textureY); // Box 178
		bodyModel[140] = new ModelRendererTurbo(this, 302, 80, textureX, textureY); // Box 179

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(53F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-56F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 75
		bodyModel[2].setRotationPoint(33F, 3F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 75
		bodyModel[3].setRotationPoint(-53F, 3F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 75 cull platform
		bodyModel[4].setRotationPoint(49F, 2F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 75 cull platform
		bodyModel[5].setRotationPoint(-53F, 2F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 14, 22, 0F); // Box 108
		bodyModel[6].setRotationPoint(-37F, -11F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 73
		bodyModel[7].setRotationPoint(-37F, 3F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[8].setRotationPoint(-37F, 3F, 2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 73
		bodyModel[9].setRotationPoint(33F, 3F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[10].setRotationPoint(33F, 3F, 2F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 124
		bodyModel[11].setRotationPoint(-50.01F, -8F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 124
		bodyModel[12].setRotationPoint(50.01F, -8F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 126
		bodyModel[13].setRotationPoint(-53F, 3F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 126
		bodyModel[14].setRotationPoint(-53F, 3F, 11F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 126
		bodyModel[15].setRotationPoint(49F, 3F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 126
		bodyModel[16].setRotationPoint(49F, 3F, 11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 75
		bodyModel[17].setRotationPoint(-33F, 2F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // Box 75
		bodyModel[18].setRotationPoint(26F, 2F, -2F);

		bodyModel[19].addBox(0F, 0F, 0F, 5, 4, 5, 0F); // Box 138
		bodyModel[19].setRotationPoint(-2.5F, -21F, -2.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 16, 0, 10, 0F); // Box 140
		bodyModel[20].setRotationPoint(-8F, -17.5F, -3F);

		bodyModel[21].addBox(0F, 0F, 0F, 16, 9, 14, 0F); // Box 141 cull cage top
		bodyModel[21].setRotationPoint(-8F, -23.5F, -7F);

		bodyModel[22].addBox(0F, -1.5F, -1.5F, 7, 3, 3, 0F); // Box 146
		bodyModel[22].setRotationPoint(-45F, 0.5F, 9F);
		bodyModel[22].rotateAngleX = -0.78539816F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[23].setRotationPoint(-35F, -4.5F, 11.03F);
		bodyModel[23].rotateAngleZ = -0.78539816F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[24].setRotationPoint(-37F, -17F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 118
		bodyModel[25].setRotationPoint(-37F, -18F, 0F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 14, 22, 0F); // Box 119
		bodyModel[26].setRotationPoint(33F, -11F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[27].setRotationPoint(-50F, -8F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[28].setRotationPoint(-50F, -8F, 10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[29].setRotationPoint(50F, -8F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[30].setRotationPoint(50F, -8F, 10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 130 hazmat plac
		bodyModel[31].setRotationPoint(35F, -4.5F, -11.03F);
		bodyModel[31].rotateAngleZ = -0.78539816F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 94, 6, 20, 0F,0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[32].setRotationPoint(-47F, -11F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 94, 6, 10, 0F,0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[33].setRotationPoint(-47F, -18F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 94, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -6F, 0F, 1.16F, -6F); // Box 5
		bodyModel[34].setRotationPoint(-47F, -18.5F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 94, 6, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.16F, -6F, 0F, 1.16F, -6F, 0F, 1.16F, 0F, 0F, 1.16F, 0F); // Box 5
		bodyModel[35].setRotationPoint(-47F, -18.5F, -6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 94, 6, 10, 0F,0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[36].setRotationPoint(-47F, -18F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 94, 6, 10, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, -1.5F, -4F, 0F, -1.5F, -4F); // Box 4
		bodyModel[37].setRotationPoint(-47F, -4F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 94, 6, 6, 0F,0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -6F, 0F, 1.16F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[38].setRotationPoint(-47F, -3.5F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 94, 6, 6, 0F,0F, 1.16F, -6F, 0F, 1.16F, -6F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[39].setRotationPoint(-47F, -3.5F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 94, 6, 10, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -6F, 0F, -1.5F, -6F); // Box 4
		bodyModel[40].setRotationPoint(-47F, -4F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,-3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F); // Box 4
		bodyModel[41].setRotationPoint(-50F, -18F, 3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F); // Box 5
		bodyModel[42].setRotationPoint(-50F, -18.5F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,-3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F); // Box 5
		bodyModel[43].setRotationPoint(-50F, -18.5F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,-3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[44].setRotationPoint(-50F, -18F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -4F, -3F, -1.5F, -4F); // Box 4
		bodyModel[45].setRotationPoint(-50F, -4F, 3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F); // Box 5
		bodyModel[46].setRotationPoint(-50F, -3.5F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 1.16F, -3F, 0F, 1.16F, -2F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 5
		bodyModel[47].setRotationPoint(-50F, -3.5F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,-3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -3F, -3F, -1.5F, -3F); // Box 4
		bodyModel[48].setRotationPoint(-50F, -4F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,-3F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, -3F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F); // Box 3
		bodyModel[49].setRotationPoint(-50F, -11F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 1F, 0F, 0.34F, 1F, 0F, 0.34F, 0F, -3F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, 0F, 0.34F, 0F, -3F, 0.34F, 0F); // Box 3
		bodyModel[50].setRotationPoint(-50F, -11F, 4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[51].setRotationPoint(-50F, -11F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[52].setRotationPoint(47F, -18F, 3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F); // Box 5
		bodyModel[53].setRotationPoint(47F, -18.5F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F); // Box 5
		bodyModel[54].setRotationPoint(47F, -18.5F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, -1.5F, -4F, -3F, -1.5F, -4F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[55].setRotationPoint(47F, -18F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, -1.5F, -4F, 0F, -1.5F, -4F); // Box 4
		bodyModel[56].setRotationPoint(47F, -4F, 3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[57].setRotationPoint(47F, -3.5F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 1.16F, -2F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[58].setRotationPoint(47F, -3.5F, -6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, -3F, -1.5F, -3F, 0F, -1.5F, -3F); // Box 4
		bodyModel[59].setRotationPoint(47F, -4F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 0F, -3F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, 0F, 0.34F, 0F, -3F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F); // Box 3
		bodyModel[60].setRotationPoint(47F, -11F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 1F, 0F, 0.34F, 1F, -3F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, -3F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[61].setRotationPoint(47F, -11F, 4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[62].setRotationPoint(47F, -11F, -3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 241
		bodyModel[63].setRotationPoint(-37F, -18F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[64].setRotationPoint(-37F, -17F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 243
		bodyModel[65].setRotationPoint(33F, -18F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 244
		bodyModel[66].setRotationPoint(33F, -18F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[67].setRotationPoint(33F, -17F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[68].setRotationPoint(33F, -17F, 10F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 267
		bodyModel[69].setRotationPoint(4.5F, -21F, -1F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 268
		bodyModel[70].setRotationPoint(-6.5F, -21F, -1F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 269
		bodyModel[71].setRotationPoint(-7F, -22F, -1.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 270
		bodyModel[72].setRotationPoint(4.75F, -22F, -2F);

		bodyModel[73].addBox(0F, 0F, 0F, 96, 0, 4, 0F); // Box 271
		bodyModel[73].setRotationPoint(-48F, -17.5F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 96, 9, 0, 0F); // Box 273
		bodyModel[74].setRotationPoint(-48F, -23.5F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 275
		bodyModel[75].setRotationPoint(-48F, -17.5F, -7F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 10, 4, 0F); // Box 276
		bodyModel[76].setRotationPoint(-51F, -7.5F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 277
		bodyModel[77].setRotationPoint(48F, -17.5F, -7F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 10, 4, 0F); // Box 278
		bodyModel[78].setRotationPoint(51F, -7.5F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 280 cull
		bodyModel[79].setRotationPoint(-2F, -17.5F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[80].setRotationPoint(47F, -23.5F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[81].setRotationPoint(-48F, -23.5F, -7F);

		bodyModel[82].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 286
		bodyModel[82].setRotationPoint(-45F, 1F, -9F);
		bodyModel[82].rotateAngleX = -0.78539816F;

		bodyModel[83].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 287
		bodyModel[83].setRotationPoint(-42F, 1F, -9F);
		bodyModel[83].rotateAngleX = -0.78539816F;

		bodyModel[84].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 119 cull
		bodyModel[84].setRotationPoint(-49F, 2F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 121 cull
		bodyModel[85].setRotationPoint(-49F, 2F, 10F);

		bodyModel[86].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 122 cull
		bodyModel[86].setRotationPoint(37F, 2F, -11F);

		bodyModel[87].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 124 cull
		bodyModel[87].setRotationPoint(37F, 2F, 10F);

		bodyModel[88].addShapeBox(0F, -1F, 0F, 0, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 125
		bodyModel[88].setRotationPoint(-45.01F, 1F, -9F);
		bodyModel[88].rotateAngleX = 0.78539816F;

		bodyModel[89].addShapeBox(0F, -1F, 0F, 0, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 126
		bodyModel[89].setRotationPoint(-38.99F, 1F, -9F);
		bodyModel[89].rotateAngleX = 0.78539816F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[90].setRotationPoint(-36.5F, 5.1F, -1.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 59
		bodyModel[91].setRotationPoint(-56F, 2F, 0F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 60
		bodyModel[92].setRotationPoint(-56F, 5F, -1F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 61
		bodyModel[93].setRotationPoint(54F, 5F, 0F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 62
		bodyModel[94].setRotationPoint(54F, 2F, -1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[95].setRotationPoint(33.5F, 5.1F, -1.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 133 cull
		bodyModel[96].setRotationPoint(-2F, -17.5F, 7F);

		bodyModel[97].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[97].setRotationPoint(50.03F, 0F, 2F);
		bodyModel[97].rotateAngleY = -1.57079633F;
		bodyModel[97].rotateAngleZ = -0.78539816F;

		bodyModel[98].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 614
		bodyModel[98].setRotationPoint(50.02F, -1F, 1.5F);

		bodyModel[99].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[99].setRotationPoint(-50.03F, 0F, -2F);
		bodyModel[99].rotateAngleY = -1.57079633F;
		bodyModel[99].rotateAngleZ = -0.78539816F;

		bodyModel[100].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 614
		bodyModel[100].setRotationPoint(-50.02F, -1F, -2.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[101].setRotationPoint(-51.51F, -7F, 1F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[102].setRotationPoint(-51.5F, -5.5F, 2.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 87
		bodyModel[103].setRotationPoint(-50.5F, -6F, 1.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 118 cull
		bodyModel[104].setRotationPoint(-49.5F, -6F, 1F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 132
		bodyModel[105].setRotationPoint(-50.25F, -3F, 3.01F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 144
		bodyModel[106].setRotationPoint(-44F, -3.5F, 7.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 145
		bodyModel[107].setRotationPoint(-39F, -3.5F, 7.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 491 abd
		bodyModel[108].setRotationPoint(-52F, 3F, -9.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 93 abd
		bodyModel[109].setRotationPoint(-51F, 3F, -9.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 94 abd
		bodyModel[110].setRotationPoint(-50F, 3F, -9.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.25F, 0F, 1F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 150
		bodyModel[111].setRotationPoint(-53F, 4F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 1F, -1.25F, 0F, 1F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[112].setRotationPoint(-53F, 4F, 8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 1F, -1.25F, 0F, 1F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[113].setRotationPoint(53F, 4F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.25F, 0F, 1F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 153
		bodyModel[114].setRotationPoint(53F, 4F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 154 cull
		bodyModel[115].setRotationPoint(-54.01F, 2.5F, 4F);

		bodyModel[116].addShapeBox(0F, 0F, -6F, 0, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 155
		bodyModel[116].setRotationPoint(-53.51F, 4.5F, 10F);

		bodyModel[117].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 156
		bodyModel[117].setRotationPoint(-53.51F, 4.5F, 10F);

		bodyModel[118].addBox(0F, 0F, -7F, 0, 1, 7, 0F); // Box 157
		bodyModel[118].setRotationPoint(-53.51F, 5.5F, 7F);
		bodyModel[118].rotateAngleX = -0.08726646F;
		bodyModel[118].rotateAngleY = -0.12217305F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 158 cull
		bodyModel[119].setRotationPoint(53.01F, 2.5F, -10F);

		bodyModel[120].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 159
		bodyModel[120].setRotationPoint(53.51F, 4.5F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 1F, 0, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 160
		bodyModel[121].setRotationPoint(53.51F, 4.5F, -10F);

		bodyModel[122].addBox(0F, 0F, 0F, 0, 1, 7, 0F); // Box 161
		bodyModel[122].setRotationPoint(53.51F, 5.5F, -7F);
		bodyModel[122].rotateAngleX = 0.08726646F;
		bodyModel[122].rotateAngleY = -0.12217305F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[123].setRotationPoint(-48.5F, 0.5F, -1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[124].setRotationPoint(47.5F, 0.5F, -1F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 164 magical cube of does something that idk lol
		bodyModel[125].setRotationPoint(-49F, 1F, 7F);

		bodyModel[126].addBox(0F, 0F, 0F, 23, 1, 0, 0F); // Box 165
		bodyModel[126].setRotationPoint(-48F, 3F, 8F);

		bodyModel[127].addBox(0F, 0F, 0F, 38, 1, 0, 0F); // Box 166
		bodyModel[127].setRotationPoint(-19F, 3F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0F, 0F, -2F, 0F, 8F, -2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 8F, -2F, 0F, -8F, 0F, 0F, 0F); // Box 167
		bodyModel[128].setRotationPoint(-25F, 3F, 8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F); // Box 168
		bodyModel[129].setRotationPoint(19F, 2F, 3F);

		bodyModel[130].addBox(0F, 0F, 0F, 9, 1, 0, 0F); // Box 169
		bodyModel[130].setRotationPoint(24F, 2F, 3F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 170
		bodyModel[131].setRotationPoint(-4F, 1.5F, 0.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 171
		bodyModel[132].setRotationPoint(3F, 1.5F, 0.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[133].setRotationPoint(-49.25F, 5F, 3F);
		bodyModel[133].rotateAngleY = -0.2443461F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[134].setRotationPoint(-8F, -23.5F, -3F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[135].setRotationPoint(8F, -23.5F, -3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[136].setRotationPoint(2F, -23.5F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[137].setRotationPoint(-3F, -23.5F, -7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[138].setRotationPoint(-3F, -23.5F, 7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[139].setRotationPoint(-3F, -23.5F, 7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[140].setRotationPoint(2F, -23.5F, 7F);
	}
	ModelBuckeye3AxleLate bogie = new ModelBuckeye3AxleLate();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/Buckeye_3_axle_late_black_roller.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-2.1875,0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(4.375,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f, f1, f2, f3, f4, f5);
	}
}