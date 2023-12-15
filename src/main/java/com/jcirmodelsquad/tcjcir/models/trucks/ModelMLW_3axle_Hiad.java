//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 09.04.2020 - 17:21:58
// Last changed on: 09.04.2020 - 17:21:58

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located


import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelMLW_3axle_Hiad extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelMLW_3axle_Hiad() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[109];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1() {
		bodyModel[0] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 0 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 1 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 3 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 4 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 10 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 11 wheel
		bodyModel[9] = new ModelRendererTurbo(this, 84, 83, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 84, 83, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 84, 83, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 68, 82, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 8, 120, textureX, textureY); // Box 173
		bodyModel[14] = new ModelRendererTurbo(this, 61, 83, textureX, textureY); // Box 25
		bodyModel[15] = new ModelRendererTurbo(this, 56, 83, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 60, 87, textureX, textureY, "cull"); // Box 27 cull
		bodyModel[17] = new ModelRendererTurbo(this, 53, 89, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 67, 87, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 74, 94, textureX, textureY); // Box 69
		bodyModel[20] = new ModelRendererTurbo(this, 74, 96, textureX, textureY); // Box 77
		bodyModel[21] = new ModelRendererTurbo(this, 74, 98, textureX, textureY); // Box 78
		bodyModel[22] = new ModelRendererTurbo(this, 61, 54, textureX, textureY); // Box 154
		bodyModel[23] = new ModelRendererTurbo(this, 56, 54, textureX, textureY); // Box 156
		bodyModel[24] = new ModelRendererTurbo(this, 73, 101, textureX, textureY); // Box 138 mount point
		bodyModel[25] = new ModelRendererTurbo(this, 61, 112, textureX, textureY); // Box 134
		bodyModel[26] = new ModelRendererTurbo(this, 48, 108, textureX, textureY); // Box 135
		bodyModel[27] = new ModelRendererTurbo(this, 48, 108, textureX, textureY); // Box 131
		bodyModel[28] = new ModelRendererTurbo(this, 61, 112, textureX, textureY); // Box 132
		bodyModel[29] = new ModelRendererTurbo(this, 48, 108, textureX, textureY); // Box 133
		bodyModel[30] = new ModelRendererTurbo(this, 61, 112, textureX, textureY); // Box 134
		bodyModel[31] = new ModelRendererTurbo(this, 95, 49, textureX, textureY); // Box 184 late brake
		bodyModel[32] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 185 late brake
		bodyModel[33] = new ModelRendererTurbo(this, 76, 49, textureX, textureY); // Box 186
		bodyModel[34] = new ModelRendererTurbo(this, 90, 49, textureX, textureY); // Box 187
		bodyModel[35] = new ModelRendererTurbo(this, 91, 47, textureX, textureY); // Box 188
		bodyModel[36] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 189
		bodyModel[37] = new ModelRendererTurbo(this, 56, 59, textureX, textureY); // Box 106
		bodyModel[38] = new ModelRendererTurbo(this, 85, 87, textureX, textureY); // Box 168
		bodyModel[39] = new ModelRendererTurbo(this, 76, 87, textureX, textureY); // Box 169
		bodyModel[40] = new ModelRendererTurbo(this, 103, 87, textureX, textureY); // Box 170
		bodyModel[41] = new ModelRendererTurbo(this, 94, 87, textureX, textureY); // Box 171
		bodyModel[42] = new ModelRendererTurbo(this, 67, 54, textureX, textureY); // Box 173
		bodyModel[43] = new ModelRendererTurbo(this, 49, 111, textureX, textureY); // Box 75 traction motor cable ducts
		bodyModel[44] = new ModelRendererTurbo(this, 49, 111, textureX, textureY); // Box 75 traction motor cable ducts
		bodyModel[45] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 22
		bodyModel[46] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 563
		bodyModel[47] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 564
		bodyModel[48] = new ModelRendererTurbo(this, 1, 120, textureX, textureY); // Box 565
		bodyModel[49] = new ModelRendererTurbo(this, 8, 116, textureX, textureY); // Box 566
		bodyModel[50] = new ModelRendererTurbo(this, 84, 73, textureX, textureY); // Box 569
		bodyModel[51] = new ModelRendererTurbo(this, 103, 77, textureX, textureY); // Box 572
		bodyModel[52] = new ModelRendererTurbo(this, 94, 77, textureX, textureY); // Box 573
		bodyModel[53] = new ModelRendererTurbo(this, 87, 98, textureX, textureY); // Box 575
		bodyModel[54] = new ModelRendererTurbo(this, 63, 49, textureX, textureY); // Box 579
		bodyModel[55] = new ModelRendererTurbo(this, 65, 47, textureX, textureY); // Box 580
		bodyModel[56] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 581
		bodyModel[57] = new ModelRendererTurbo(this, 69, 49, textureX, textureY); // Box 587 late brake
		bodyModel[58] = new ModelRendererTurbo(this, 50, 49, textureX, textureY); // Box 588
		bodyModel[59] = new ModelRendererTurbo(this, 52, 47, textureX, textureY); // Box 589
		bodyModel[60] = new ModelRendererTurbo(this, 84, 73, textureX, textureY); // Box 590
		bodyModel[61] = new ModelRendererTurbo(this, 56, 73, textureX, textureY); // Box 592
		bodyModel[62] = new ModelRendererTurbo(this, 60, 77, textureX, textureY, "cull"); // Box 27 cull
		bodyModel[63] = new ModelRendererTurbo(this, 53, 79, textureX, textureY); // Box 594
		bodyModel[64] = new ModelRendererTurbo(this, 67, 77, textureX, textureY); // Box 595
		bodyModel[65] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 596
		bodyModel[66] = new ModelRendererTurbo(this, 87, 94, textureX, textureY); // Box 597
		bodyModel[67] = new ModelRendererTurbo(this, 84, 73, textureX, textureY); // Box 600
		bodyModel[68] = new ModelRendererTurbo(this, 87, 96, textureX, textureY); // Box 602
		bodyModel[69] = new ModelRendererTurbo(this, 85, 77, textureX, textureY); // Box 603
		bodyModel[70] = new ModelRendererTurbo(this, 76, 77, textureX, textureY); // Box 604
		bodyModel[71] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 606
		bodyModel[72] = new ModelRendererTurbo(this, 83, 54, textureX, textureY); // Box 607
		bodyModel[73] = new ModelRendererTurbo(this, 78, 54, textureX, textureY); // Box 608
		bodyModel[74] = new ModelRendererTurbo(this, 78, 59, textureX, textureY); // Box 609
		bodyModel[75] = new ModelRendererTurbo(this, 89, 54, textureX, textureY); // Box 610
		bodyModel[76] = new ModelRendererTurbo(this, 56, 49, textureX, textureY); // Box 145 late brake
		bodyModel[77] = new ModelRendererTurbo(this, 77, 83, textureX, textureY); // Box 148
		bodyModel[78] = new ModelRendererTurbo(this, 94, 111, textureX, textureY); // Box 571
		bodyModel[79] = new ModelRendererTurbo(this, 68, 72, textureX, textureY); // Box 15
		bodyModel[80] = new ModelRendererTurbo(this, 61, 73, textureX, textureY); // Box 25
		bodyModel[81] = new ModelRendererTurbo(this, 77, 73, textureX, textureY); // Box 148
		bodyModel[82] = new ModelRendererTurbo(this, 68, 82, textureX, textureY); // Box 15
		bodyModel[83] = new ModelRendererTurbo(this, 61, 83, textureX, textureY); // Box 25
		bodyModel[84] = new ModelRendererTurbo(this, 77, 83, textureX, textureY); // Box 148
		bodyModel[85] = new ModelRendererTurbo(this, 68, 72, textureX, textureY); // Box 15
		bodyModel[86] = new ModelRendererTurbo(this, 61, 73, textureX, textureY); // Box 25
		bodyModel[87] = new ModelRendererTurbo(this, 77, 73, textureX, textureY); // Box 148
		bodyModel[88] = new ModelRendererTurbo(this, 95, 73, textureX, textureY); // Box 148
		bodyModel[89] = new ModelRendererTurbo(this, 100, 73, textureX, textureY); // Box 148
		bodyModel[90] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 148
		bodyModel[91] = new ModelRendererTurbo(this, 95, 83, textureX, textureY); // Box 148
		bodyModel[92] = new ModelRendererTurbo(this, 100, 83, textureX, textureY); // Box 148
		bodyModel[93] = new ModelRendererTurbo(this, 105, 83, textureX, textureY); // Box 148
		bodyModel[94] = new ModelRendererTurbo(this, 67, 59, textureX, textureY); // Box 106
		bodyModel[95] = new ModelRendererTurbo(this, 89, 59, textureX, textureY); // Box 609
		bodyModel[96] = new ModelRendererTurbo(this, 114, 117, textureX, textureY); // Box 173
		bodyModel[97] = new ModelRendererTurbo(this, 123, 117, textureX, textureY); // Box 610
		bodyModel[98] = new ModelRendererTurbo(this, 49, 111, textureX, textureY); // Box 75 traction motor cable ducts
		bodyModel[99] = new ModelRendererTurbo(this, 38, 112, textureX, textureY); // Box 75 traction motor cable ducts
		bodyModel[100] = new ModelRendererTurbo(this, 38, 112, textureX, textureY); // Box 75 traction motor cable ducts
		bodyModel[101] = new ModelRendererTurbo(this, 38, 108, textureX, textureY); // Box 75 traction motor cable ducts
		bodyModel[102] = new ModelRendererTurbo(this, 38, 108, textureX, textureY); // Box 75 traction motor cable ducts
		bodyModel[103] = new ModelRendererTurbo(this, 112, 115, textureX, textureY); // Box 173
		bodyModel[104] = new ModelRendererTurbo(this, 112, 97, textureX, textureY); // Box 173
		bodyModel[105] = new ModelRendererTurbo(this, 24, 92, textureX, textureY); // Box 173
		bodyModel[106] = new ModelRendererTurbo(this, 4, 88, textureX, textureY); // Box 173
		bodyModel[107] = new ModelRendererTurbo(this, 94, 93, textureX, textureY); // Box 173
		bodyModel[108] = new ModelRendererTurbo(this, 71, 106, textureX, textureY); // Box 173

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 0 wheel
		bodyModel[0].setRotationPoint(-11F, 7F, -5.5F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 1 wheel
		bodyModel[1].setRotationPoint(-1F, 7F, -5.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[2].setRotationPoint(-12F, 6F, -9F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 3 wheel
		bodyModel[3].setRotationPoint(-11F, 7F, 5.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 4 wheel
		bodyModel[4].setRotationPoint(-1F, 7F, 5.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[5].setRotationPoint(-2F, 6F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 9
		bodyModel[6].setRotationPoint(8F, 6F, -9F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10 wheel
		bodyModel[7].setRotationPoint(9F, 7F, -5.5F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11 wheel
		bodyModel[8].setRotationPoint(9F, 7F, 5.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12
		bodyModel[9].setRotationPoint(-13F, 3.5F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 13
		bodyModel[10].setRotationPoint(7F, 3.5F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 14
		bodyModel[11].setRotationPoint(-3F, 3.5F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 15
		bodyModel[12].setRotationPoint(-7.5F, 4F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F); // Box 173
		bodyModel[13].setRotationPoint(-12F, 6F, -9.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -1F, 0.5F); // Box 25
		bodyModel[14].setRotationPoint(-9F, 4.5F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 26
		bodyModel[15].setRotationPoint(-14F, 3.5F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 27 cull
		bodyModel[16].setRotationPoint(-14F, 5.5F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F); // Box 28
		bodyModel[17].setRotationPoint(-14F, 5.5F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 29
		bodyModel[18].setRotationPoint(-10F, 5.5F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 69
		bodyModel[19].setRotationPoint(-13F, 8.5F, -8.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 77
		bodyModel[20].setRotationPoint(-3F, 8.5F, -8.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 78
		bodyModel[21].setRotationPoint(7F, 8.5F, -8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 154
		bodyModel[22].setRotationPoint(-5F, 5.5F, -7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 156
		bodyModel[23].setRotationPoint(-8F, 5.5F, -7.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 138 mount point
		bodyModel[24].setRotationPoint(-5.5F, 2F, -1.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 6, 5, 10, 0F); // Box 134
		bodyModel[25].setRotationPoint(-12F, 4F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[26].setRotationPoint(-13F, 5F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[27].setRotationPoint(-3F, 5F, -5F);

		bodyModel[28].addBox(0F, 0F, 0F, 6, 5, 10, 0F); // Box 132
		bodyModel[28].setRotationPoint(-2F, 4F, -5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[29].setRotationPoint(6F, 5F, -5F);

		bodyModel[30].addBox(0F, 0F, 0F, 6, 5, 10, 0F); // Box 134
		bodyModel[30].setRotationPoint(7F, 4F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 184 late brake
		bodyModel[31].setRotationPoint(-13F, 3.2F, -10F);
		bodyModel[31].rotateAngleX = -0.78539816F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 185 late brake
		bodyModel[32].setRotationPoint(7F, 3.2F, -10F);
		bodyModel[32].rotateAngleX = -0.78539816F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 186
		bodyModel[33].setRotationPoint(12F, 4.2F, -10.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 187
		bodyModel[34].setRotationPoint(-7F, 4.2F, -10.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[35].setRotationPoint(-11F, 4.2F, -10.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[36].setRotationPoint(9F, 4.2F, -10.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[37].setRotationPoint(-7.5F, 7.75F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 168
		bodyModel[38].setRotationPoint(0F, 5.5F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F); // Box 169
		bodyModel[39].setRotationPoint(-5F, 5.5F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 170
		bodyModel[40].setRotationPoint(10F, 5.5F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F); // Box 171
		bodyModel[41].setRotationPoint(5F, 5.5F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 173
		bodyModel[42].setRotationPoint(12F, 5.5F, -7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F); // Box 75 traction motor cable ducts
		bodyModel[43].setRotationPoint(-8.5F, 2F, 2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F); // Box 75 traction motor cable ducts
		bodyModel[44].setRotationPoint(10.5F, 2F, 2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -1F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0.75F, -4.25F, 0F, 0.75F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 22
		bodyModel[45].setRotationPoint(-11.9F, 4F, -8.75F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -1F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0.75F, -4.25F, 0F, 0.75F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 563
		bodyModel[46].setRotationPoint(-1.9F, 4F, -8.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -1F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0.75F, -4.25F, 0F, 0.75F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 564
		bodyModel[47].setRotationPoint(8.1F, 4F, -8.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F); // Box 565
		bodyModel[48].setRotationPoint(-2F, 6F, -9.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F); // Box 566
		bodyModel[49].setRotationPoint(8F, 6F, -9.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[50].setRotationPoint(7F, 3.5F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 572
		bodyModel[51].setRotationPoint(10F, 5.5F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 573
		bodyModel[52].setRotationPoint(5F, 5.5F, 8F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 575
		bodyModel[53].setRotationPoint(7F, 8.5F, 7.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 579
		bodyModel[54].setRotationPoint(12F, 4.2F, 7.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 580
		bodyModel[55].setRotationPoint(9F, 4.2F, 9.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -1F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0.75F, -4.25F, 0F, 0.75F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 581
		bodyModel[56].setRotationPoint(8.1F, 4F, 7.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 587 late brake
		bodyModel[57].setRotationPoint(7F, 3.2F, 10F);
		bodyModel[57].rotateAngleX = -0.78539816F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 588
		bodyModel[58].setRotationPoint(-7F, 4.2F, 7.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 589
		bodyModel[59].setRotationPoint(-11F, 4.2F, 9.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[60].setRotationPoint(-13F, 3.5F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[61].setRotationPoint(-14F, 3.5F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 27 cull
		bodyModel[62].setRotationPoint(-14F, 5.5F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F); // Box 594
		bodyModel[63].setRotationPoint(-14F, 5.5F, 8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 595
		bodyModel[64].setRotationPoint(-10F, 5.5F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -1F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0.75F, -4.25F, 0F, 0.75F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 596
		bodyModel[65].setRotationPoint(-11.9F, 4F, 7.75F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 597
		bodyModel[66].setRotationPoint(-13F, 8.5F, 7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		bodyModel[67].setRotationPoint(-3F, 3.5F, 8F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 602
		bodyModel[68].setRotationPoint(-3F, 8.5F, 7.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 603
		bodyModel[69].setRotationPoint(0F, 5.5F, 8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 604
		bodyModel[70].setRotationPoint(-5F, 5.5F, 8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, -1F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0.75F, -4.25F, 0F, 0.75F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 606
		bodyModel[71].setRotationPoint(-1.9F, 4F, 7.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[72].setRotationPoint(-5F, 5.5F, 6.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 608
		bodyModel[73].setRotationPoint(-8F, 5.5F, 6.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 609
		bodyModel[74].setRotationPoint(-7.5F, 7.75F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 610
		bodyModel[75].setRotationPoint(12F, 5.5F, 6.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 145 late brake
		bodyModel[76].setRotationPoint(-13F, 3.2F, 10F);
		bodyModel[76].rotateAngleX = -0.78539816F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, -0.5F, 0F, 0.5F); // Box 148
		bodyModel[77].setRotationPoint(-5F, 4.5F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 571
		bodyModel[78].setRotationPoint(13F, 4F, -7.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		bodyModel[79].setRotationPoint(-7.5F, 4F, 8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 1.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 25
		bodyModel[80].setRotationPoint(-9F, 4.5F, 8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Box 148
		bodyModel[81].setRotationPoint(-5F, 4.5F, 8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 15
		bodyModel[82].setRotationPoint(2.5F, 4F, -9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -1F, 0.5F); // Box 25
		bodyModel[83].setRotationPoint(1F, 4.5F, -9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, -0.5F, 0F, 0.5F); // Box 148
		bodyModel[84].setRotationPoint(5F, 4.5F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		bodyModel[85].setRotationPoint(2.5F, 4F, 8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 1.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 25
		bodyModel[86].setRotationPoint(1F, 4.5F, 8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Box 148
		bodyModel[87].setRotationPoint(5F, 4.5F, 8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 148
		bodyModel[88].setRotationPoint(11F, 4.5F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[89].setRotationPoint(12F, 4F, 8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[90].setRotationPoint(13F, 4F, 8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F); // Box 148
		bodyModel[91].setRotationPoint(11F, 4.5F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 148
		bodyModel[92].setRotationPoint(12F, 4F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F); // Box 148
		bodyModel[93].setRotationPoint(13F, 4F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 106
		bodyModel[94].setRotationPoint(13F, 7.75F, -8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F); // Box 609
		bodyModel[95].setRotationPoint(13F, 7.75F, 7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 173
		bodyModel[96].setRotationPoint(13F, 5.5F, -7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 610
		bodyModel[97].setRotationPoint(13F, 5.5F, 6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F); // Box 75 traction motor cable ducts
		bodyModel[98].setRotationPoint(1.5F, 2F, 2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -2F, -0.125F, -0.125F, -2F, -0.125F, -0.125F, -2F, -0.125F, -0.125F, -2F, -0.125F); // Box 75 traction motor cable ducts
		bodyModel[99].setRotationPoint(3.5F, 3F, -8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -2F, -0.125F, -0.125F, -2F, -0.125F, -0.125F, -2F, -0.125F, -0.125F, -2F, -0.125F); // Box 75 traction motor cable ducts
		bodyModel[100].setRotationPoint(-7.5F, 3F, 6F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 75 traction motor cable ducts
		bodyModel[101].setRotationPoint(3.5F, 2F, -8F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 75 traction motor cable ducts
		bodyModel[102].setRotationPoint(-7.5F, 2F, 6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[103].setRotationPoint(13F, 5.5F, -3.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[104].setRotationPoint(4F, 6F, -3.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[105].setRotationPoint(-6F, 6F, -3.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[106].setRotationPoint(-6F, 4F, -7.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[107].setRotationPoint(4F, 4F, -7.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 173
		bodyModel[108].setRotationPoint(-6F, 3F, -2F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 109; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
	}
}
