//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ACF 2980 CF 2 Bay
// Model Creator: Bidah
// Created on: 13.09.2023 - 21:19:28
// Last changed on: 13.09.2023 - 21:19:28

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruckEarly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelACF2Bay extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelACF2Bay() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[115];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 54, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 1, 54, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 2, 48, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 13, 49, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 13, 56, textureX, textureY); // Box 12
		bodyModel[5] = new ModelRendererTurbo(this, 15, 138, textureX, textureY); // Box 80
		bodyModel[6] = new ModelRendererTurbo(this, 15, 134, textureX, textureY); // Box 81
		bodyModel[7] = new ModelRendererTurbo(this, 12, 224, textureX, textureY); // Box 109
		bodyModel[8] = new ModelRendererTurbo(this, 33, 224, textureX, textureY); // Box 110
		bodyModel[9] = new ModelRendererTurbo(this, 58, 224, textureX, textureY); // Box 111
		bodyModel[10] = new ModelRendererTurbo(this, 7, 212, textureX, textureY, "cull"); // Box 112 cull
		bodyModel[11] = new ModelRendererTurbo(this, 7, 212, textureX, textureY, "cull"); // Box 114 cull
		bodyModel[12] = new ModelRendererTurbo(this, 4, 198, textureX, textureY); // Box 159
		bodyModel[13] = new ModelRendererTurbo(this, 4, 198, textureX, textureY); // Box 117
		bodyModel[14] = new ModelRendererTurbo(this, 80, 239, textureX, textureY); // Box 299
		bodyModel[15] = new ModelRendererTurbo(this, 80, 223, textureX, textureY); // Box 300
		bodyModel[16] = new ModelRendererTurbo(this, 31, 10, textureX, textureY); // Box 188
		bodyModel[17] = new ModelRendererTurbo(this, 5, 169, textureX, textureY); // Box 192
		bodyModel[18] = new ModelRendererTurbo(this, 60, 138, textureX, textureY); // Box 193
		bodyModel[19] = new ModelRendererTurbo(this, 62, 149, textureX, textureY); // Box 194
		bodyModel[20] = new ModelRendererTurbo(this, 62, 158, textureX, textureY); // Box 195
		bodyModel[21] = new ModelRendererTurbo(this, 94, 61, textureX, textureY); // Box 352
		bodyModel[22] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 353
		bodyModel[23] = new ModelRendererTurbo(this, 114, 24, textureX, textureY); // Box 196
		bodyModel[24] = new ModelRendererTurbo(this, 114, 29, textureX, textureY); // Box 198
		bodyModel[25] = new ModelRendererTurbo(this, 60, 176, textureX, textureY); // Box 190
		bodyModel[26] = new ModelRendererTurbo(this, 129, 207, textureX, textureY); // Box 191
		bodyModel[27] = new ModelRendererTurbo(this, 33, 207, textureX, textureY); // Box 205
		bodyModel[28] = new ModelRendererTurbo(this, 2, 70, textureX, textureY); // Box 45
		bodyModel[29] = new ModelRendererTurbo(this, 1, 100, textureX, textureY); // Box 46
		bodyModel[30] = new ModelRendererTurbo(this, 1, 95, textureX, textureY); // Box 47
		bodyModel[31] = new ModelRendererTurbo(this, 25, 72, textureX, textureY); // Box 48
		bodyModel[32] = new ModelRendererTurbo(this, 70, 87, textureX, textureY); // Box 58
		bodyModel[33] = new ModelRendererTurbo(this, 70, 91, textureX, textureY); // Box 59
		bodyModel[34] = new ModelRendererTurbo(this, 117, 29, textureX, textureY); // Box 60
		bodyModel[35] = new ModelRendererTurbo(this, 126, 29, textureX, textureY); // Box 62
		bodyModel[36] = new ModelRendererTurbo(this, 123, 24, textureX, textureY); // Box 64
		bodyModel[37] = new ModelRendererTurbo(this, 46, 10, textureX, textureY); // Box 65
		bodyModel[38] = new ModelRendererTurbo(this, 123, 29, textureX, textureY); // Box 66
		bodyModel[39] = new ModelRendererTurbo(this, 113, 38, textureX, textureY); // Box 67
		bodyModel[40] = new ModelRendererTurbo(this, 113, 34, textureX, textureY); // Box 68
		bodyModel[41] = new ModelRendererTurbo(this, 15, 137, textureX, textureY); // Box 69
		bodyModel[42] = new ModelRendererTurbo(this, 64, 112, textureX, textureY); // Box 70
		bodyModel[43] = new ModelRendererTurbo(this, 195, 137, textureX, textureY); // Box 71
		bodyModel[44] = new ModelRendererTurbo(this, 135, 29, textureX, textureY); // Box 72
		bodyModel[45] = new ModelRendererTurbo(this, 138, 29, textureX, textureY); // Box 73
		bodyModel[46] = new ModelRendererTurbo(this, 132, 24, textureX, textureY); // Box 74
		bodyModel[47] = new ModelRendererTurbo(this, 147, 29, textureX, textureY); // Box 75
		bodyModel[48] = new ModelRendererTurbo(this, 141, 24, textureX, textureY); // Box 76
		bodyModel[49] = new ModelRendererTurbo(this, 144, 29, textureX, textureY); // Box 77
		bodyModel[50] = new ModelRendererTurbo(this, 61, 10, textureX, textureY); // Box 78
		bodyModel[51] = new ModelRendererTurbo(this, 76, 10, textureX, textureY); // Box 79
		bodyModel[52] = new ModelRendererTurbo(this, -19, 105, textureX, textureY); // Box 80
		bodyModel[53] = new ModelRendererTurbo(this, 2, 48, textureX, textureY); // Box 333
		bodyModel[54] = new ModelRendererTurbo(this, 20, 19, textureX, textureY, "cull"); // Box 149 cull
		bodyModel[55] = new ModelRendererTurbo(this, 20, 14, textureX, textureY, "cull"); // Box 149 cull
		bodyModel[56] = new ModelRendererTurbo(this, 20, 9, textureX, textureY, "cull"); // Box 149 cull
		bodyModel[57] = new ModelRendererTurbo(this, 20, 4, textureX, textureY, "cull"); // Box 149 cull
		bodyModel[58] = new ModelRendererTurbo(this, 46, 3, textureX, textureY); // Box 338
		bodyModel[59] = new ModelRendererTurbo(this, 1, 3, textureX, textureY); // Box 339
		bodyModel[60] = new ModelRendererTurbo(this, -6, 105, textureX, textureY); // Box 340
		bodyModel[61] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 425
		bodyModel[62] = new ModelRendererTurbo(this, 1, 110, textureX, textureY); // Box 426
		bodyModel[63] = new ModelRendererTurbo(this, 68, 111, textureX, textureY); // Box 427
		bodyModel[64] = new ModelRendererTurbo(this, 58, 111, textureX, textureY); // Box 428
		bodyModel[65] = new ModelRendererTurbo(this, 177, 112, textureX, textureY); // Box 429
		bodyModel[66] = new ModelRendererTurbo(this, 187, 112, textureX, textureY); // Box 430
		bodyModel[67] = new ModelRendererTurbo(this, 1, 63, textureX, textureY); // Box 431
		bodyModel[68] = new ModelRendererTurbo(this, 98, 42, textureX, textureY, "cull"); // Box 118 cull top walkway
		bodyModel[69] = new ModelRendererTurbo(this, 235, 50, textureX, textureY, "cull"); // Box 433 cull top walkway
		bodyModel[70] = new ModelRendererTurbo(this, 235, 42, textureX, textureY, "cull"); // Box 434 cull top walkway
		bodyModel[71] = new ModelRendererTurbo(this, 235, 61, textureX, textureY, "cull"); // Box 124 cull roof walkway
		bodyModel[72] = new ModelRendererTurbo(this, 235, 67, textureX, textureY, "cull"); // Box 436 cull roof walkway
		bodyModel[73] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 437 hatch a
		bodyModel[74] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 438 hatch a
		bodyModel[75] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 439 hatch a
		bodyModel[76] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 440 hatch a
		bodyModel[77] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 441 hatch a
		bodyModel[78] = new ModelRendererTurbo(this, 34, 101, textureX, textureY); // Box 72
		bodyModel[79] = new ModelRendererTurbo(this, 37, 112, textureX, textureY); // Box 87
		bodyModel[80] = new ModelRendererTurbo(this, 35, 115, textureX, textureY); // Box 87
		bodyModel[81] = new ModelRendererTurbo(this, 31, 112, textureX, textureY); // Box 132
		bodyModel[82] = new ModelRendererTurbo(this, 27, 124, textureX, textureY); // Box 125
		bodyModel[83] = new ModelRendererTurbo(this, 45, 119, textureX, textureY); // Box 286
		bodyModel[84] = new ModelRendererTurbo(this, 45, 119, textureX, textureY); // Box 287
		bodyModel[85] = new ModelRendererTurbo(this, 46, 125, textureX, textureY); // Box 317
		bodyModel[86] = new ModelRendererTurbo(this, 44, 129, textureX, textureY); // Box 318
		bodyModel[87] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 322
		bodyModel[88] = new ModelRendererTurbo(this, 34, 112, textureX, textureY); // Box 454
		bodyModel[89] = new ModelRendererTurbo(this, 34, 112, textureX, textureY); // Box 455
		bodyModel[90] = new ModelRendererTurbo(this, 58, 239, textureX, textureY); // Box 462
		bodyModel[91] = new ModelRendererTurbo(this, 33, 239, textureX, textureY); // Box 463
		bodyModel[92] = new ModelRendererTurbo(this, 12, 239, textureX, textureY); // Box 464
		bodyModel[93] = new ModelRendererTurbo(this, 48, 70, textureX, textureY, "cull"); // Box 465 cull walkway
		bodyModel[94] = new ModelRendererTurbo(this, 65, 72, textureX, textureY, "cull"); // Box 466 cull walkway
		bodyModel[95] = new ModelRendererTurbo(this, 17, 19, textureX, textureY); // Box 467
		bodyModel[96] = new ModelRendererTurbo(this, 17, 19, textureX, textureY); // Box 468
		bodyModel[97] = new ModelRendererTurbo(this, 12, 18, textureX, textureY); // Box 469
		bodyModel[98] = new ModelRendererTurbo(this, 12, 18, textureX, textureY); // Box 470
		bodyModel[99] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 471 hatch b
		bodyModel[100] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 472 hatch b
		bodyModel[101] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 473 hatch b
		bodyModel[102] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 474 hatch b
		bodyModel[103] = new ModelRendererTurbo(this, 107, 62, textureX, textureY, "cull"); // Box 477 cull bracket
		bodyModel[104] = new ModelRendererTurbo(this, 107, 62, textureX, textureY, "cull"); // Box 478 cull bracket
		bodyModel[105] = new ModelRendererTurbo(this, 107, 69, textureX, textureY, "cull"); // Box 477 cull bracket
		bodyModel[106] = new ModelRendererTurbo(this, 107, 69, textureX, textureY, "cull"); // Box 478 cull bracket
		bodyModel[107] = new ModelRendererTurbo(this, 58, 239, textureX, textureY); // Box 481
		bodyModel[108] = new ModelRendererTurbo(this, 58, 224, textureX, textureY); // Box 482
		bodyModel[109] = new ModelRendererTurbo(this, 33, 224, textureX, textureY); // Box 483
		bodyModel[110] = new ModelRendererTurbo(this, 12, 224, textureX, textureY); // Box 484
		bodyModel[111] = new ModelRendererTurbo(this, 12, 239, textureX, textureY); // Box 485
		bodyModel[112] = new ModelRendererTurbo(this, 33, 239, textureX, textureY); // Box 486
		bodyModel[113] = new ModelRendererTurbo(this, 91, 71, textureX, textureY, "cull"); // Box 477 cull bracket
		bodyModel[114] = new ModelRendererTurbo(this, 98, 71, textureX, textureY, "cull"); // Box 478 cull bracket

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-34.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(30.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 1
		bodyModel[2].setRotationPoint(-22.5F, 4.1F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 18, 2, 4, 0F); // Box 13
		bodyModel[3].setRotationPoint(-30.5F, 3F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 18, 2, 4, 0F); // Box 12
		bodyModel[4].setRotationPoint(12.5F, 3F, -2F);

		bodyModel[5].addBox(0F, -1F, 0F, 10, 3, 0, 0F); // Box 80
		bodyModel[5].setRotationPoint(-33.5F, 4.5F, 0.5F);
		bodyModel[5].rotateAngleY = 1.1693706F;

		bodyModel[6].addBox(-10F, -1F, 0F, 10, 3, 0, 0F); // Box 81
		bodyModel[6].setRotationPoint(33.5F, 4.5F, -0.5F);
		bodyModel[6].rotateAngleY = 1.1693706F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 109
		bodyModel[7].setRotationPoint(-15F, 0F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[8].setRotationPoint(-11F, 0F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[9].setRotationPoint(-5F, 0F, -9.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 112 cull
		bodyModel[10].setRotationPoint(-11F, 7.5F, -3.5F);

		bodyModel[11].addBox(-6F, 0F, -7F, 8, 1, 7, 0F); // Box 114 cull
		bodyModel[11].setRotationPoint(5F, 7.5F, -3.5F);
		bodyModel[11].rotateAngleY = -3.14159265F;

		bodyModel[12].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 159
		bodyModel[12].setRotationPoint(-4.5F, 8F, -6F);
		bodyModel[12].rotateAngleZ = 0.78539816F;

		bodyModel[13].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 117
		bodyModel[13].setRotationPoint(4.5F, 8F, -6F);
		bodyModel[13].rotateAngleZ = 0.78539816F;

		bodyModel[14].addFlexTrapezoid(0F, 0F, 0F, 6, 8, 7, 0F, 4.00F, 4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 299
		bodyModel[14].setRotationPoint(5F, 0F, -3.5F);

		bodyModel[15].addFlexTrapezoid(0F, 0F, 0F, 6, 8, 7, 0F, 4.00F, 4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 300
		bodyModel[15].setRotationPoint(-11F, 0F, -3.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 7, 13, 0, 0F); // Box 188
		bodyModel[16].setRotationPoint(-30F, -12F, -11.01F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 60, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[17].setRotationPoint(-30F, -17F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 60, 2, 8, 0F); // Box 193
		bodyModel[18].setRotationPoint(-30F, -19F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 60, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[19].setRotationPoint(-30F, -19F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 60, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[20].setRotationPoint(-30F, -19F, 4F);

		bodyModel[21].addBox(0F, 0F, 0F, 60, 5, 20, 0F); // Box 352
		bodyModel[21].setRotationPoint(-30F, -17F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 60, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[22].setRotationPoint(-30F, -17F, 10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 196
		bodyModel[23].setRotationPoint(-30F, -11F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 198
		bodyModel[24].setRotationPoint(-26F, -7F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 46, 7, 22, 0F); // Box 190
		bodyModel[25].setRotationPoint(-23F, -12F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 46, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[26].setRotationPoint(-23F, -5F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 46, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 205
		bodyModel[27].setRotationPoint(-23F, -5F, 9F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 45
		bodyModel[28].setRotationPoint(-30F, 2F, -10F);

		bodyModel[29].addBox(0F, 0F, 0F, 60, 3, 1, 0F); // Box 46
		bodyModel[29].setRotationPoint(-30F, 1F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 60, 3, 1, 0F); // Box 47
		bodyModel[30].setRotationPoint(-30F, 1F, 10F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 48
		bodyModel[31].setRotationPoint(29F, 2F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[32].setRotationPoint(-29F, 0F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[33].setRotationPoint(-29F, 0F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F); // Box 60
		bodyModel[34].setRotationPoint(-24F, -5F, -11.01F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 62
		bodyModel[35].setRotationPoint(-24F, -5F, 11.01F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 64
		bodyModel[36].setRotationPoint(-30F, -11F, 11F);

		bodyModel[37].addBox(0F, 0F, 0F, 7, 13, 0, 0F); // Box 65
		bodyModel[37].setRotationPoint(-30F, -12F, 11.01F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 66
		bodyModel[38].setRotationPoint(-26F, -7F, 11F);

		bodyModel[39].addBox(0F, 0F, 0F, 60, 2, 1, 0F); // Box 67
		bodyModel[39].setRotationPoint(-30F, -14F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 60, 2, 1, 0F); // Box 68
		bodyModel[40].setRotationPoint(-30F, -14F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, -7F, 0F, 0F); // Box 69
		bodyModel[41].setRotationPoint(-30F, -12F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 46, 6, 18, 0F); // Box 70
		bodyModel[42].setRotationPoint(-23F, -5F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 6F, -1F, 0F); // Box 71
		bodyModel[43].setRotationPoint(29F, -12F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 72
		bodyModel[44].setRotationPoint(23F, -5F, 11.01F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 73
		bodyModel[45].setRotationPoint(25F, -7F, 11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[46].setRotationPoint(26F, -11F, 11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 75
		bodyModel[47].setRotationPoint(25F, -7F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[48].setRotationPoint(26F, -11F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F); // Box 77
		bodyModel[49].setRotationPoint(23F, -5F, -11.01F);

		bodyModel[50].addBox(0F, 0F, 0F, 7, 13, 0, 0F); // Box 78
		bodyModel[50].setRotationPoint(23F, -12F, -11.01F);

		bodyModel[51].addBox(0F, 0F, 0F, 7, 13, 0, 0F); // Box 79
		bodyModel[51].setRotationPoint(23F, -12F, 11.01F);

		bodyModel[52].addBox(0F, 0F, 0F, 6, 0, 20, 0F); // Box 80
		bodyModel[52].setRotationPoint(-29F, 3F, -10F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 333
		bodyModel[53].setRotationPoint(19.5F, 4.1F, -1.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 149 cull
		bodyModel[54].setRotationPoint(-30F, 4F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 149 cull
		bodyModel[55].setRotationPoint(-30F, 4F, 10F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 149 cull
		bodyModel[56].setRotationPoint(26F, 4F, -11F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 149 cull
		bodyModel[57].setRotationPoint(26F, 4F, 10F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 21, 22, 0F); // Box 338
		bodyModel[58].setRotationPoint(-30.01F, -19F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 21, 22, 0F); // Box 339
		bodyModel[59].setRotationPoint(30.01F, -19F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 6, 0, 20, 0F); // Box 340
		bodyModel[60].setRotationPoint(23F, 3F, -10F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 3, 20, 0F); // Box 425
		bodyModel[61].setRotationPoint(-23.01F, 0F, -10F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 3, 20, 0F); // Box 426
		bodyModel[62].setRotationPoint(23.01F, 0F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -8F, 4F, 0F, -8F, 4F, 0F, 8F, -4F, 0F, 8F); // Box 427
		bodyModel[63].setRotationPoint(-30F, -12F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 8F, 4F, 0F, 8F, 4F, 0F, -8F, -4F, 0F, -8F); // Box 428
		bodyModel[64].setRotationPoint(-30F, -12F, 10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 8F, 4F, 0F, 8F); // Box 429
		bodyModel[65].setRotationPoint(27F, -12F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 8F, -4F, 0F, 8F, -4F, 0F, -8F, 4F, 0F, -8F); // Box 430
		bodyModel[66].setRotationPoint(27F, -12F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 46, 2, 4, 0F); // Box 431
		bodyModel[67].setRotationPoint(-23F, 1F, -2F);

		bodyModel[68].addBox(0F, 0F, 0F, 60, 2, 16, 0F); // Box 118 cull top walkway
		bodyModel[68].setRotationPoint(-30F, -19F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 433 cull top walkway
		bodyModel[69].setRotationPoint(-30F, -20F, -3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 434 cull top walkway
		bodyModel[70].setRotationPoint(26F, -20F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 124 cull roof walkway
		bodyModel[71].setRotationPoint(-32F, -20F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 436 cull roof walkway
		bodyModel[72].setRotationPoint(30F, -20F, -2F);

		bodyModel[73].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 437 hatch a
		bodyModel[73].setRotationPoint(-23F, -20F, -3F);

		bodyModel[74].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 438 hatch a
		bodyModel[74].setRotationPoint(-14F, -20F, -3F);

		bodyModel[75].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 439 hatch a
		bodyModel[75].setRotationPoint(23F, -20F, 3F);
		bodyModel[75].rotateAngleY = -3.14159265F;

		bodyModel[76].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 440 hatch a
		bodyModel[76].setRotationPoint(14F, -20F, 3F);
		bodyModel[76].rotateAngleY = -3.14159265F;

		bodyModel[77].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 441 hatch a
		bodyModel[77].setRotationPoint(-3F, -20F, -3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[78].setRotationPoint(-32.01F, -5.5F, 2F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[79].setRotationPoint(-32F, -4F, 3.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		bodyModel[80].setRotationPoint(-31F, -5.5F, 2.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 132
		bodyModel[81].setRotationPoint(-31.25F, -3F, 4F);

		bodyModel[82].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 125
		bodyModel[82].setRotationPoint(-30.25F, 5F, 4F);
		bodyModel[82].rotateAngleY = -0.40142573F;
		bodyModel[82].rotateAngleZ = -0.10471976F;

		bodyModel[83].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[83].setRotationPoint(-24F, -3.5F, 3F);
		bodyModel[83].rotateAngleX = -0.78539816F;
		bodyModel[83].rotateAngleY = -1.57079633F;

		bodyModel[84].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[84].setRotationPoint(-24F, -3.5F, 0F);
		bodyModel[84].rotateAngleX = -0.78539816F;
		bodyModel[84].rotateAngleY = -1.57079633F;

		bodyModel[85].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[85].setRotationPoint(-27.5F, 0F, -8.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 318
		bodyModel[86].setRotationPoint(-28.5F, 1F, -8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -3F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -3F, 0F, 0.05F); // Box 322
		bodyModel[87].setRotationPoint(-25.5F, -3.5F, -3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[88].setRotationPoint(-30F, -2F, 2.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[89].setRotationPoint(-30F, -2F, 5.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, 0F, 0F, -6F); // Box 462
		bodyModel[90].setRotationPoint(-5F, 0F, 3.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 463
		bodyModel[91].setRotationPoint(-11F, 0F, 3.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F); // Box 464
		bodyModel[92].setRotationPoint(-15F, 0F, 3.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 465 cull walkway
		bodyModel[93].setRotationPoint(-32F, 2F, -6F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 466 cull walkway
		bodyModel[94].setRotationPoint(30F, 2F, -6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[95].setRotationPoint(-30F, 3F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[96].setRotationPoint(30F, 3F, 10F);

		bodyModel[97].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 469
		bodyModel[97].setRotationPoint(29.5F, 3F, -10F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 470
		bodyModel[98].setRotationPoint(-29.5F, 3F, 8F);

		bodyModel[99].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 471 hatch b
		bodyModel[99].setRotationPoint(-9F, -20F, -3F);

		bodyModel[100].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 472 hatch b
		bodyModel[100].setRotationPoint(-20F, -20F, -3F);

		bodyModel[101].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 473 hatch b
		bodyModel[101].setRotationPoint(9F, -20F, 3F);
		bodyModel[101].rotateAngleY = -3.14159265F;

		bodyModel[102].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 474 hatch b
		bodyModel[102].setRotationPoint(20F, -20F, 3F);
		bodyModel[102].rotateAngleY = -3.14159265F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 477 cull bracket
		bodyModel[103].setRotationPoint(-30F, -18F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 478 cull bracket
		bodyModel[104].setRotationPoint(29F, -18F, -10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 477 cull bracket
		bodyModel[105].setRotationPoint(-30F, -18F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 478 cull bracket
		bodyModel[106].setRotationPoint(29F, -18F, 8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, 0F, 0F, -6F); // Box 481
		bodyModel[107].setRotationPoint(11F, 0F, 3.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[108].setRotationPoint(11F, 0F, -9.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[109].setRotationPoint(5F, 0F, -9.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 484
		bodyModel[110].setRotationPoint(1F, 0F, -9.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F); // Box 485
		bodyModel[111].setRotationPoint(1F, 0F, 3.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 486
		bodyModel[112].setRotationPoint(5F, 0F, 3.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 477 cull bracket
		bodyModel[113].setRotationPoint(-27F, -18F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 478 cull bracket
		bodyModel[114].setRotationPoint(26F, -18F, -10F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();
	Model70TonTruckEarly bogie2 = new Model70TonTruckEarly();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 115; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.3,0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.6,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }
}