//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BKno2_front
// Model Creator: bida
// Created on: 05.10.2022 - 08:56:13
// Last changed on: 05.10.2022 - 08:56:13

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

import java.util.ArrayList;

public class ModelBKno2a extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelBKno2a() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[133];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 147, 201, textureX, textureY); // Box 93
		bodyModel[1] = new ModelRendererTurbo(this, 147, 215, textureX, textureY); // Box 98
		bodyModel[2] = new ModelRendererTurbo(this, 126, 217, textureX, textureY); // Box 99
		bodyModel[3] = new ModelRendererTurbo(this, 147, 209, textureX, textureY); // Box 100
		bodyModel[4] = new ModelRendererTurbo(this, 152, 235, textureX, textureY); // Box 92
		bodyModel[5] = new ModelRendererTurbo(this, 10, 248, textureX, textureY); // Box 89 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 1, 251, textureX, textureY); // Box 90 wheel
		bodyModel[7] = new ModelRendererTurbo(this, 1, 235, textureX, textureY); // Box 91
		bodyModel[8] = new ModelRendererTurbo(this, 2, 223, textureX, textureY); // Box 211
		bodyModel[9] = new ModelRendererTurbo(this, 1, 251, textureX, textureY); // Box 43 wheel
		bodyModel[10] = new ModelRendererTurbo(this, 24, 203, textureX, textureY); // Box 42
		bodyModel[11] = new ModelRendererTurbo(this, 27, 197, textureX, textureY); // Box 43
		bodyModel[12] = new ModelRendererTurbo(this, 27, 213, textureX, textureY); // Box 49
		bodyModel[13] = new ModelRendererTurbo(this, 10, 248, textureX, textureY); // Box 50 wheel
		bodyModel[14] = new ModelRendererTurbo(this, 10, 248, textureX, textureY); // Box 51 wheel
		bodyModel[15] = new ModelRendererTurbo(this, 10, 248, textureX, textureY); // Box 52 wheel
		bodyModel[16] = new ModelRendererTurbo(this, 10, 248, textureX, textureY); // Box 53 wheel
		bodyModel[17] = new ModelRendererTurbo(this, 10, 248, textureX, textureY); // Box 54 wheel
		bodyModel[18] = new ModelRendererTurbo(this, 1, 203, textureX, textureY); // Box 55
		bodyModel[19] = new ModelRendererTurbo(this, 4, 197, textureX, textureY); // Box 56
		bodyModel[20] = new ModelRendererTurbo(this, 4, 213, textureX, textureY); // Box 57
		bodyModel[21] = new ModelRendererTurbo(this, 25, 181, textureX, textureY); // Box 58
		bodyModel[22] = new ModelRendererTurbo(this, 27, 191, textureX, textureY); // Box 59
		bodyModel[23] = new ModelRendererTurbo(this, 2, 181, textureX, textureY); // Box 60
		bodyModel[24] = new ModelRendererTurbo(this, 4, 191, textureX, textureY); // Box 61
		bodyModel[25] = new ModelRendererTurbo(this, 15, 232, textureX, textureY); // Box 62
		bodyModel[26] = new ModelRendererTurbo(this, 93, 247, textureX, textureY); // Box 115
		bodyModel[27] = new ModelRendererTurbo(this, 93, 247, textureX, textureY); // Box 117
		bodyModel[28] = new ModelRendererTurbo(this, 15, 232, textureX, textureY); // Box 83
		bodyModel[29] = new ModelRendererTurbo(this, 15, 232, textureX, textureY); // Box 84
		bodyModel[30] = new ModelRendererTurbo(this, 102, 251, textureX, textureY); // Box 88
		bodyModel[31] = new ModelRendererTurbo(this, 82, 243, textureX, textureY); // Box 103
		bodyModel[32] = new ModelRendererTurbo(this, 54, 198, textureX, textureY); // Box 128 siderod bit that connects wheels to piston
		bodyModel[33] = new ModelRendererTurbo(this, 53, 191, textureX, textureY); // Box 130
		bodyModel[34] = new ModelRendererTurbo(this, 77, 190, textureX, textureY); // Box 131 piston back and forth bit
		bodyModel[35] = new ModelRendererTurbo(this, 54, 194, textureX, textureY); // Box 132 piston back and forth bit
		bodyModel[36] = new ModelRendererTurbo(this, 53, 191, textureX, textureY); // Box 133
		bodyModel[37] = new ModelRendererTurbo(this, 54, 201, textureX, textureY); // Box 128 siderod bit that connects the wheels
		bodyModel[38] = new ModelRendererTurbo(this, 82, 183, textureX, textureY); // Box 129 spinny bar part
		bodyModel[39] = new ModelRendererTurbo(this, 77, 183, textureX, textureY); // Box 130 reverser swaws
		bodyModel[40] = new ModelRendererTurbo(this, 82, 180, textureX, textureY); // Box 131 reverser other swaws
		bodyModel[41] = new ModelRendererTurbo(this, 54, 188, textureX, textureY); // Box 133
		bodyModel[42] = new ModelRendererTurbo(this, 67, 184, textureX, textureY); // Box 134 bit that does the cha cha slide
		bodyModel[43] = new ModelRendererTurbo(this, 53, 184, textureX, textureY); // Box 143
		bodyModel[44] = new ModelRendererTurbo(this, 53, 182, textureX, textureY); // Box 144
		bodyModel[45] = new ModelRendererTurbo(this, 65, 180, textureX, textureY); // Box 145
		bodyModel[46] = new ModelRendererTurbo(this, 77, 180, textureX, textureY); // Box 149 reverser swaws
		bodyModel[47] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Box 84
		bodyModel[48] = new ModelRendererTurbo(this, 116, 240, textureX, textureY); // Box 84
		bodyModel[49] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Box 84
		bodyModel[50] = new ModelRendererTurbo(this, 95, 240, textureX, textureY); // Box 84
		bodyModel[51] = new ModelRendererTurbo(this, 95, 240, textureX, textureY); // Box 175
		bodyModel[52] = new ModelRendererTurbo(this, 72, 190, textureX, textureY); // Box 208 WHAT AREE YOU
		bodyModel[53] = new ModelRendererTurbo(this, 72, 179, textureX, textureY); // Box 209 WHAT DO YOU DOO
		bodyModel[54] = new ModelRendererTurbo(this, 54, 198, textureX, textureY); // Box 128 siderod bit that connects wheels to piston
		bodyModel[55] = new ModelRendererTurbo(this, 53, 191, textureX, textureY); // Box 130
		bodyModel[56] = new ModelRendererTurbo(this, 77, 190, textureX, textureY); // Box 131 piston back and forth bit
		bodyModel[57] = new ModelRendererTurbo(this, 54, 194, textureX, textureY); // Box 132 piston back and forth bit
		bodyModel[58] = new ModelRendererTurbo(this, 53, 191, textureX, textureY); // Box 133
		bodyModel[59] = new ModelRendererTurbo(this, 54, 201, textureX, textureY); // Box 128 siderod bit that connects the wheels
		bodyModel[60] = new ModelRendererTurbo(this, 82, 183, textureX, textureY); // Box 129 spinny bar part
		bodyModel[61] = new ModelRendererTurbo(this, 77, 183, textureX, textureY); // Box 130 reverser swaws
		bodyModel[62] = new ModelRendererTurbo(this, 82, 180, textureX, textureY); // Box 131 reverser other swaws
		bodyModel[63] = new ModelRendererTurbo(this, 54, 188, textureX, textureY); // Box 133
		bodyModel[64] = new ModelRendererTurbo(this, 67, 184, textureX, textureY); // Box 134 bit that does the cha cha slide
		bodyModel[65] = new ModelRendererTurbo(this, 53, 184, textureX, textureY); // Box 143
		bodyModel[66] = new ModelRendererTurbo(this, 53, 182, textureX, textureY); // Box 144
		bodyModel[67] = new ModelRendererTurbo(this, 65, 180, textureX, textureY); // Box 145
		bodyModel[68] = new ModelRendererTurbo(this, 77, 180, textureX, textureY); // Box 149 reverser swaws
		bodyModel[69] = new ModelRendererTurbo(this, 72, 190, textureX, textureY); // Box 208 WHAT AREE YOU
		bodyModel[70] = new ModelRendererTurbo(this, 72, 179, textureX, textureY); // Box 209 WHAT DO YOU DOO
		bodyModel[71] = new ModelRendererTurbo(this, 452, 248, textureX, textureY); // Box 315
		bodyModel[72] = new ModelRendererTurbo(this, 461, 248, textureX, textureY); // Box 316
		bodyModel[73] = new ModelRendererTurbo(this, 474, 248, textureX, textureY); // Box 317
		bodyModel[74] = new ModelRendererTurbo(this, 483, 248, textureX, textureY); // Box 318
		bodyModel[75] = new ModelRendererTurbo(this, 208, 239, textureX, textureY); // Box 319
		bodyModel[76] = new ModelRendererTurbo(this, 16, 224, textureX, textureY); // Box 214
		bodyModel[77] = new ModelRendererTurbo(this, 22, 221, textureX, textureY); // Box 215
		bodyModel[78] = new ModelRendererTurbo(this, 187, 236, textureX, textureY); // Box 324
		bodyModel[79] = new ModelRendererTurbo(this, 482, 232, textureX, textureY); // Box 330
		bodyModel[80] = new ModelRendererTurbo(this, 506, 246, textureX, textureY); // Box 331
		bodyModel[81] = new ModelRendererTurbo(this, 506, 246, textureX, textureY); // Box 332
		bodyModel[82] = new ModelRendererTurbo(this, 486, 222, textureX, textureY); // Box 333
		bodyModel[83] = new ModelRendererTurbo(this, 488, 212, textureX, textureY); // Box 334
		bodyModel[84] = new ModelRendererTurbo(this, 147, 211, textureX, textureY); // Box 341
		bodyModel[85] = new ModelRendererTurbo(this, 157, 216, textureX, textureY); // Box 342
		bodyModel[86] = new ModelRendererTurbo(this, 421, 230, textureX, textureY); // Box 348
		bodyModel[87] = new ModelRendererTurbo(this, 421, 238, textureX, textureY); // Box 349
		bodyModel[88] = new ModelRendererTurbo(this, 421, 244, textureX, textureY); // Box 350
		bodyModel[89] = new ModelRendererTurbo(this, 188, 241, textureX, textureY); // Box 356
		bodyModel[90] = new ModelRendererTurbo(this, 188, 241, textureX, textureY); // Box 357
		bodyModel[91] = new ModelRendererTurbo(this, 469, 227, textureX, textureY); // Box 358
		bodyModel[92] = new ModelRendererTurbo(this, 483, 211, textureX, textureY); // Box 56
		bodyModel[93] = new ModelRendererTurbo(this, 474, 211, textureX, textureY, "lamp"); // Box 146 headlight front down
		bodyModel[94] = new ModelRendererTurbo(this, 473, 223, textureX, textureY); // Box 222
		bodyModel[95] = new ModelRendererTurbo(this, 476, 218, textureX, textureY); // Box 591
		bodyModel[96] = new ModelRendererTurbo(this, 481, 211, textureX, textureY, "lamp"); // Box 154 headlight glow
		bodyModel[97] = new ModelRendererTurbo(this, 481, 211, textureX, textureY, "lamp"); // Box 155 headlight glow
		bodyModel[98] = new ModelRendererTurbo(this, 18, 174, textureX, textureY); // Box 412
		bodyModel[99] = new ModelRendererTurbo(this, 18, 174, textureX, textureY); // Box 413
		bodyModel[100] = new ModelRendererTurbo(this, 16, 229, textureX, textureY); // Box 453
		bodyModel[101] = new ModelRendererTurbo(this, 16, 229, textureX, textureY); // Box 454
		bodyModel[102] = new ModelRendererTurbo(this, 109, 251, textureX, textureY); // Box 457
		bodyModel[103] = new ModelRendererTurbo(this, 109, 251, textureX, textureY); // Box 458
		bodyModel[104] = new ModelRendererTurbo(this, 102, 251, textureX, textureY); // Box 459
		bodyModel[105] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Box 464
		bodyModel[106] = new ModelRendererTurbo(this, 116, 240, textureX, textureY); // Box 466
		bodyModel[107] = new ModelRendererTurbo(this, 95, 240, textureX, textureY); // Box 467
		bodyModel[108] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Box 468
		bodyModel[109] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Box 469
		bodyModel[110] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Box 470
		bodyModel[111] = new ModelRendererTurbo(this, 116, 240, textureX, textureY); // Box 472
		bodyModel[112] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Box 473
		bodyModel[113] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Box 475
		bodyModel[114] = new ModelRendererTurbo(this, 95, 240, textureX, textureY); // Box 476
		bodyModel[115] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Box 477
		bodyModel[116] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Box 478
		bodyModel[117] = new ModelRendererTurbo(this, 116, 240, textureX, textureY); // Box 480
		bodyModel[118] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Box 481
		bodyModel[119] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Box 482
		bodyModel[120] = new ModelRendererTurbo(this, 458, 216, textureX, textureY); // Box 498
		bodyModel[121] = new ModelRendererTurbo(this, 460, 207, textureX, textureY); // Box 499
		bodyModel[122] = new ModelRendererTurbo(this, 460, 207, textureX, textureY); // Box 500
		bodyModel[123] = new ModelRendererTurbo(this, 82, 243, textureX, textureY); // Box 104
		bodyModel[124] = new ModelRendererTurbo(this, 111, 240, textureX, textureY); // Box 84
		bodyModel[125] = new ModelRendererTurbo(this, 478, 223, textureX, textureY); // Box 359
		bodyModel[126] = new ModelRendererTurbo(this, 475, 221, textureX, textureY); // Box 592
		bodyModel[127] = new ModelRendererTurbo(this, 475, 221, textureX, textureY); // Box 593
		bodyModel[128] = new ModelRendererTurbo(this, 111, 240, textureX, textureY); // Box 465
		bodyModel[129] = new ModelRendererTurbo(this, 111, 240, textureX, textureY); // Box 471
		bodyModel[130] = new ModelRendererTurbo(this, 111, 240, textureX, textureY); // Box 474
		bodyModel[131] = new ModelRendererTurbo(this, 111, 240, textureX, textureY); // Box 479
		bodyModel[132] = new ModelRendererTurbo(this, 111, 240, textureX, textureY); // Box 483

		bodyModel[0].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 93
		bodyModel[0].setRotationPoint(-38F, 2.5F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 98
		bodyModel[1].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 99
		bodyModel[2].setRotationPoint(-40F, 8F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 0, 3, 16, 0F); // Box 100
		bodyModel[3].setRotationPoint(-38F, 5.5F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 11, 1, 12, 0F); // Box 92
		bodyModel[4].setRotationPoint(-37F, 2.5F, -6F);

		bodyModel[5].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 89 wheel
		bodyModel[5].setRotationPoint(-22F, 6.5F, 5.5F);

		bodyModel[6].addBox(-2F, -2F, 0F, 4, 4, 0, 0F); // Box 90 wheel
		bodyModel[6].setRotationPoint(-34F, 8F, 5.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 91
		bodyModel[7].setRotationPoint(-34.5F, 7.5F, -5.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 9, 0F); // Box 211
		bodyModel[8].setRotationPoint(-35F, 6.75F, -4.5F);

		bodyModel[9].addBox(-2F, -2F, 0F, 4, 4, 0, 0F); // Box 43 wheel
		bodyModel[9].setRotationPoint(-34F, 8F, -5.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 42
		bodyModel[10].setRotationPoint(-31F, 4F, 5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F); // Box 43
		bodyModel[11].setRotationPoint(-31F, 2.5F, 6.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 49
		bodyModel[12].setRotationPoint(-31F, 6.5F, 6.5F);

		bodyModel[13].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 50 wheel
		bodyModel[13].setRotationPoint(-14.5F, 6.5F, 5.5F);

		bodyModel[14].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 51 wheel
		bodyModel[14].setRotationPoint(-7F, 6.5F, 5.5F);

		bodyModel[15].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 52 wheel
		bodyModel[15].setRotationPoint(-14.5F, 6.5F, -5.5F);

		bodyModel[16].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 53 wheel
		bodyModel[16].setRotationPoint(-22F, 6.5F, -5.5F);

		bodyModel[17].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 54 wheel
		bodyModel[17].setRotationPoint(-7F, 6.5F, -5.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 55
		bodyModel[18].setRotationPoint(-31F, 4F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F); // Box 56
		bodyModel[19].setRotationPoint(-31F, 2.5F, -9.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 57
		bodyModel[20].setRotationPoint(-31F, 6.5F, -9.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 3, 6, 0F); // Box 58
		bodyModel[21].setRotationPoint(-30.5F, 0F, 5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[22].setRotationPoint(-30.5F, 3F, 6F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 3, 6, 0F); // Box 60
		bodyModel[23].setRotationPoint(-30.5F, 0F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[24].setRotationPoint(-30.5F, 3F, -10F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 2, 11, 0F); // Box 62
		bodyModel[25].setRotationPoint(-23F, 5.5F, -5.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 27, 2, 1, 0F); // Box 115
		bodyModel[26].setRotationPoint(-31F, 4.25F, -5F);

		bodyModel[27].addBox(0F, 0F, 0F, 27, 2, 1, 0F); // Box 117
		bodyModel[27].setRotationPoint(-31F, 4.25F, 4F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 2, 11, 0F); // Box 83
		bodyModel[28].setRotationPoint(-8F, 5.5F, -5.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 2, 11, 0F); // Box 84
		bodyModel[29].setRotationPoint(-15.5F, 5.5F, -5.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 88
		bodyModel[30].setRotationPoint(-26F, 6.25F, -5F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 103
		bodyModel[31].setRotationPoint(-31F, 4.25F, -4F);

		bodyModel[32].addBox(0F, -0.5F, 0F, 16, 1, 1, 0F); // Box 128 siderod bit that connects wheels to piston
		bodyModel[32].setRotationPoint(-20F, 5.5F, -7.5F);
		bodyModel[32].rotateAngleZ = -0.19198622F;

		bodyModel[33].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 130
		bodyModel[33].setRotationPoint(-19F, 6.5F, -8.5F);

		bodyModel[34].addBox(0F, -2F, 0F, 2, 4, 2, 0F); // Box 131 piston back and forth bit
		bodyModel[34].setRotationPoint(-21F, 5.5F, -8.75F);

		bodyModel[35].addBox(-7F, -0.5F, 0F, 7, 1, 1, 0F); // Box 132 piston back and forth bit
		bodyModel[35].setRotationPoint(-19F, 5.5F, -8.5F);

		bodyModel[36].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 133
		bodyModel[36].setRotationPoint(-19F, 3.5F, -8.5F);

		bodyModel[37].addBox(-6F, 1.5F, 0F, 16, 1, 1, 0F); // Box 128 siderod bit that connects the wheels
		bodyModel[37].setRotationPoint(-14.5F, 6.5F, -6.5F);

		bodyModel[38].addShapeBox(1.5F, -0.5F, -3F, 1, 3, 1, 0F,-1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129 spinny bar part
		bodyModel[38].setRotationPoint(-7F, 6.5F, -5.5F);

		bodyModel[39].addShapeBox(-0.5F, -2F, -3F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 130 reverser swaws
		bodyModel[39].setRotationPoint(-15F, 3.5F, -5F);
		bodyModel[39].rotateAngleZ = -0.26179939F;

		bodyModel[40].addShapeBox(-1F, 0F, -4F, 12, 1, 1, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 131 reverser other swaws
		bodyModel[40].setRotationPoint(-15F, 4.5F, -5F);
		bodyModel[40].rotateAngleZ = -0.13962634F;

		bodyModel[41].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 133
		bodyModel[41].setRotationPoint(-26.5F, 0.5F, -8.5F);

		bodyModel[42].addShapeBox(-0.5F, -0.5F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 134 bit that does the cha cha slide
		bodyModel[42].setRotationPoint(-22F, 1F, -7.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 143
		bodyModel[43].setRotationPoint(-17F, 1.5F, -8.01F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 144
		bodyModel[44].setRotationPoint(-17F, 1.5F, -8F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 145
		bodyModel[45].setRotationPoint(-17.5F, 2.25F, -5F);

		bodyModel[46].addShapeBox(-1.5F, -2F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 reverser swaws
		bodyModel[46].setRotationPoint(-15F, 3.5F, -5F);
		bodyModel[46].rotateAngleZ = -0.26179939F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 84
		bodyModel[47].setRotationPoint(-26F, 2F, -4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 84
		bodyModel[48].setRotationPoint(-19F, 1.5F, -4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 84
		bodyModel[49].setRotationPoint(-22F, 2F, -4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 84
		bodyModel[50].setRotationPoint(-26F, 1.5F, -4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 1F, 0F, -0.05F, -1.05F, 0F, -0.05F, -1.05F, 0F, -0.05F, 1F, 0F, -0.05F); // Box 175
		bodyModel[51].setRotationPoint(-4F, 1.5F, 3F);

		bodyModel[52].addShapeBox(-0.5F, -0.5F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208 WHAT AREE YOU
		bodyModel[52].setRotationPoint(-23F, 3F, -9.5F);
		bodyModel[52].rotateAngleZ = -0.20943951F;

		bodyModel[53].addShapeBox(-0.5F, -0.5F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 209 WHAT DO YOU DOO
		bodyModel[53].setRotationPoint(-23F, 3F, -8.5F);
		bodyModel[53].rotateAngleZ = 1.57079633F;

		bodyModel[54].addBox(0F, -0.5F, 0F, 16, 1, 1, 0F); // Box 128 siderod bit that connects wheels to piston
		bodyModel[54].setRotationPoint(-20F, 5.5F, 6.5F);
		bodyModel[54].rotateAngleZ = -0.19198622F;

		bodyModel[55].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 130
		bodyModel[55].setRotationPoint(-19F, 6.5F, 7.5F);

		bodyModel[56].addBox(0F, -2F, 0F, 2, 4, 2, 0F); // Box 131 piston back and forth bit
		bodyModel[56].setRotationPoint(-21F, 5.5F, 6.75F);

		bodyModel[57].addBox(-7F, -0.5F, 0F, 7, 1, 1, 0F); // Box 132 piston back and forth bit
		bodyModel[57].setRotationPoint(-19F, 5.5F, 7.5F);

		bodyModel[58].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 133
		bodyModel[58].setRotationPoint(-19F, 3.5F, 7.5F);

		bodyModel[59].addBox(-6F, 1.5F, 0F, 16, 1, 1, 0F); // Box 128 siderod bit that connects the wheels
		bodyModel[59].setRotationPoint(-14.5F, 6.5F, 5.5F);

		bodyModel[60].addShapeBox(1.5F, -0.5F, 2F, 1, 3, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 129 spinny bar part
		bodyModel[60].setRotationPoint(-7F, 6.5F, 5.5F);

		bodyModel[61].addShapeBox(-0.5F, -2F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130 reverser swaws
		bodyModel[61].setRotationPoint(-15F, 3.5F, 7F);
		bodyModel[61].rotateAngleZ = -0.26179939F;

		bodyModel[62].addShapeBox(-1F, 0F, 2F, 12, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 131 reverser other swaws
		bodyModel[62].setRotationPoint(-15F, 4.5F, 6F);
		bodyModel[62].rotateAngleZ = -0.13962634F;

		bodyModel[63].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 133
		bodyModel[63].setRotationPoint(-26.5F, 0.5F, 7.5F);

		bodyModel[64].addShapeBox(-0.5F, -0.5F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134 bit that does the cha cha slide
		bodyModel[64].setRotationPoint(-22F, 1F, 6.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 143
		bodyModel[65].setRotationPoint(-17F, 1.5F, 8.01F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 144
		bodyModel[66].setRotationPoint(-17F, 1.5F, 4F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 145
		bodyModel[67].setRotationPoint(-17.5F, 2.25F, 4F);

		bodyModel[68].addShapeBox(-1.5F, -2F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149 reverser swaws
		bodyModel[68].setRotationPoint(-15F, 3.5F, 7F);
		bodyModel[68].rotateAngleZ = -0.26179939F;

		bodyModel[69].addShapeBox(-0.5F, -0.5F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 208 WHAT AREE YOU
		bodyModel[69].setRotationPoint(-23F, 3F, 8.5F);
		bodyModel[69].rotateAngleZ = -0.20943951F;

		bodyModel[70].addShapeBox(-0.5F, -0.5F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209 WHAT DO YOU DOO
		bodyModel[70].setRotationPoint(-23F, 3F, 7.5F);
		bodyModel[70].rotateAngleZ = 1.57079633F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[71].setRotationPoint(-23F, 0F, -1F);

		bodyModel[72].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 316
		bodyModel[72].setRotationPoint(-27F, 0F, -1F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[73].setRotationPoint(-29F, 0F, -1F);

		bodyModel[74].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 318
		bodyModel[74].setRotationPoint(-29F, 2F, -1F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 319
		bodyModel[75].setRotationPoint(-29F, 4F, -4F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 214
		bodyModel[76].setRotationPoint(-28.5F, 7.25F, -1.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 215
		bodyModel[77].setRotationPoint(-28.5F, 3.25F, -0.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 6, 2, 8, 0F); // Box 324
		bodyModel[78].setRotationPoint(-37F, 3.5F, -4F);

		bodyModel[79].addBox(0F, 0F, 0F, 6, 5, 8, 0F); // Box 330
		bodyModel[79].setRotationPoint(-34F, -4F, -4F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 331
		bodyModel[80].setRotationPoint(-34F, 1F, -4F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 332
		bodyModel[81].setRotationPoint(-34F, 1F, 3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[82].setRotationPoint(-34F, -5F, -4F);

		bodyModel[83].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 334
		bodyModel[83].setRotationPoint(-30F, -5F, -4F);

		bodyModel[84].addBox(0F, -3F, 0F, 0, 3, 18, 0F); // Box 341
		bodyModel[84].setRotationPoint(-38F, 4.5F, -9F);
		bodyModel[84].rotateAngleZ = 0.38397244F;

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 342
		bodyModel[85].setRotationPoint(-39.5F, 2F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[86].setRotationPoint(-13F, 1F, -2F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 349
		bodyModel[87].setRotationPoint(-13F, 4F, -2F);

		bodyModel[88].addBox(0F, 0F, 0F, 11, 3, 4, 0F); // Box 350
		bodyModel[88].setRotationPoint(-16F, 5F, -2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 356
		bodyModel[89].setRotationPoint(-35F, 5.5F, -3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 357
		bodyModel[90].setRotationPoint(-35F, 5.5F, 2F);

		bodyModel[91].addBox(0F, 0F, 0F, 4, 5, 6, 0F); // Box 358
		bodyModel[91].setRotationPoint(-32F, -2F, -3F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 56
		bodyModel[92].setRotationPoint(-35F, -6F, -1.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 146 headlight front down
		bodyModel[93].setRotationPoint(-35.5F, -6F, -1.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 222
		bodyModel[94].setRotationPoint(-34F, -3F, -1F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 591
		bodyModel[95].setRotationPoint(-35F, -3F, -2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 154 headlight glow
		bodyModel[96].setRotationPoint(-34.5F, -5.5F, -1.51F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 155 headlight glow
		bodyModel[97].setRotationPoint(-34.5F, -5.5F, 1.51F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 412
		bodyModel[98].setRotationPoint(-31.01F, 2.5F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 413
		bodyModel[99].setRotationPoint(-31.01F, 2.5F, 5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 453
		bodyModel[100].setRotationPoint(-34.5F, 7.25F, 0.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 454
		bodyModel[101].setRotationPoint(-34.5F, 7.25F, -1.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 19, 2, 1, 0F); // Box 457
		bodyModel[102].setRotationPoint(-24F, 6.25F, -5F);

		bodyModel[103].addBox(0F, 0F, 0F, 19, 2, 1, 0F); // Box 458
		bodyModel[103].setRotationPoint(-24F, 6.25F, 4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 459
		bodyModel[104].setRotationPoint(-26F, 6.25F, 4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 464
		bodyModel[105].setRotationPoint(-22F, 2F, 3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 466
		bodyModel[106].setRotationPoint(-19F, 1.5F, 3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 467
		bodyModel[107].setRotationPoint(-26F, 1.5F, 3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 468
		bodyModel[108].setRotationPoint(-26F, 2F, 3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 469
		bodyModel[109].setRotationPoint(-14.5F, 2F, 3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 470
		bodyModel[110].setRotationPoint(-18.5F, 2F, 3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 472
		bodyModel[111].setRotationPoint(-11.5F, 1.5F, 3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 473
		bodyModel[112].setRotationPoint(-7F, 2F, 3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 475
		bodyModel[113].setRotationPoint(-11F, 2F, 3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 1F, 0F, -0.05F, -1.05F, 0F, -0.05F, -1.05F, 0F, -0.05F, 1F, 0F, -0.05F); // Box 476
		bodyModel[114].setRotationPoint(-4F, 1.5F, -4F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 477
		bodyModel[115].setRotationPoint(-7F, 2F, -4F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 478
		bodyModel[116].setRotationPoint(-11F, 2F, -4F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 480
		bodyModel[117].setRotationPoint(-11.5F, 1.5F, -4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 481
		bodyModel[118].setRotationPoint(-14.5F, 2F, -4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 482
		bodyModel[119].setRotationPoint(-18.5F, 2F, -4F);

		bodyModel[120].addBox(-1F, -1F, 0F, 2, 2, 6, 0F); // Box 498
		bodyModel[120].setRotationPoint(-35F, 1F, -5F);
		bodyModel[120].rotateAngleZ = 0.78539816F;

		bodyModel[121].addBox(-1F, -1F, 0F, 0, 2, 6, 0F); // Box 499
		bodyModel[121].setRotationPoint(-35.4F, 2F, -5F);

		bodyModel[122].addBox(-1F, -1F, 0F, 0, 2, 6, 0F); // Box 500
		bodyModel[122].setRotationPoint(-32.6F, 2F, -5F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 104
		bodyModel[123].setRotationPoint(-5F, 4.25F, -4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 84
		bodyModel[124].setRotationPoint(-22.5F, 2.5F, -4F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 359
		bodyModel[125].setRotationPoint(-34F, -2F, -3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 592
		bodyModel[126].setRotationPoint(-34F, -3F, -2F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 593
		bodyModel[127].setRotationPoint(-34F, -3F, 2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 465
		bodyModel[128].setRotationPoint(-22.5F, 2.5F, 3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 471
		bodyModel[129].setRotationPoint(-15F, 2.5F, 3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 474
		bodyModel[130].setRotationPoint(-7.5F, 2.5F, 3F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 479
		bodyModel[131].setRotationPoint(-7.5F, 2.5F, -4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 483
		bodyModel[132].setRotationPoint(-15F, 2.5F, -4F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 133; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
	public float[] getTrans() { return new float[]{0.7F, 0.155F, 0F}; }

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}
}