//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.09.2022 - 11:32:19
// Last changed on: 21.09.2022 - 11:32:19

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelFrictionTruck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class Modelwcp_baler_tender extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelwcp_baler_tender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[73];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 222
		bodyModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 223
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 224
		bodyModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 225
		bodyModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 226
		bodyModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 227
		bodyModel[7] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 228
		bodyModel[8] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 98
		bodyModel[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 24
		bodyModel[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 25
		bodyModel[12] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 26
		bodyModel[13] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 27
		bodyModel[14] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 34
		bodyModel[15] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 38
		bodyModel[16] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 39
		bodyModel[17] = new ModelRendererTurbo(this, 361, 1, textureX, textureY, "lamp"); // Box 40 lamp
		bodyModel[18] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 41
		bodyModel[19] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 43
		bodyModel[20] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 44
		bodyModel[21] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 45
		bodyModel[22] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 46
		bodyModel[23] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 47
		bodyModel[24] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 48
		bodyModel[25] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 50
		bodyModel[26] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 76
		bodyModel[27] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 77
		bodyModel[28] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 86
		bodyModel[29] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 87
		bodyModel[30] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 88
		bodyModel[31] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 82
		bodyModel[32] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 83
		bodyModel[33] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 84
		bodyModel[34] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 85
		bodyModel[35] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 88
		bodyModel[36] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 90
		bodyModel[37] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 92
		bodyModel[38] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 93
		bodyModel[39] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 99
		bodyModel[40] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 100
		bodyModel[41] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 101
		bodyModel[42] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 102
		bodyModel[43] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 103
		bodyModel[44] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 104
		bodyModel[45] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 105
		bodyModel[46] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 106
		bodyModel[47] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 107
		bodyModel[48] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 108
		bodyModel[49] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 109
		bodyModel[50] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 110
		bodyModel[51] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 111
		bodyModel[52] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 112
		bodyModel[53] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 113
		bodyModel[54] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 114
		bodyModel[55] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 451
		bodyModel[56] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 452
		bodyModel[57] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 453
		bodyModel[58] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 530
		bodyModel[59] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 80
		bodyModel[60] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 81
		bodyModel[61] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 82
		bodyModel[62] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 83
		bodyModel[63] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 84
		bodyModel[64] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 85
		bodyModel[65] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 86
		bodyModel[66] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 87
		bodyModel[67] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 88
		bodyModel[68] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 80 coal
		bodyModel[69] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 81 coal
		bodyModel[70] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 82 coal
		bodyModel[71] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 267
		bodyModel[72] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 468

		bodyModel[0].addBox(0F, 0F, 0F, 53, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27F, 0.5F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 26, 12, 22, 0F); // Box 222
		bodyModel[1].setRotationPoint(-4F, -11.5F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 223
		bodyModel[2].setRotationPoint(-4F, -13.5F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[3].setRotationPoint(-20F, -18.5F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[4].setRotationPoint(11F, -13.5F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[5].setRotationPoint(11F, -13.5F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 227
		bodyModel[6].setRotationPoint(-4F, -13.5F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[7].setRotationPoint(-20F, -18.5F, 10F);

		bodyModel[8].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 98
		bodyModel[8].setRotationPoint(24F, 1F, -1.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // Box 25
		bodyModel[9].setRotationPoint(26F, 7.5F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 24
		bodyModel[10].setRotationPoint(23F, -13F, -1.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 12, 20, 0F); // Box 25
		bodyModel[11].setRotationPoint(22F, -11.5F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[12].setRotationPoint(22F, -11.5F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 27
		bodyModel[13].setRotationPoint(22F, -11.5F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 0, 2, 18, 0F); // Box 34
		bodyModel[14].setRotationPoint(5F, -13.5F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[15].setRotationPoint(5F, -13.5F, 3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[16].setRotationPoint(5F, -13.5F, -3F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 40 lamp
		bodyModel[17].setRotationPoint(25.5F, -12.5F, -1F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 41
		bodyModel[18].setRotationPoint(8F, -13F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[19].setRotationPoint(23F, -10F, -1F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[20].setRotationPoint(23F, -10F, 1F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 2, 18, 0F); // Box 45
		bodyModel[21].setRotationPoint(25.75F, -1F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 46
		bodyModel[22].setRotationPoint(22.5F, 2F, -11.01F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 47
		bodyModel[23].setRotationPoint(22.5F, 2F, 11.01F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 6, 18, 0F); // Box 48
		bodyModel[24].setRotationPoint(26F, 1.5F, -9F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 11, 4, 0F); // Box 50
		bodyModel[25].setRotationPoint(22.5F, -11F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 76
		bodyModel[26].setRotationPoint(-17F, 3F, -2F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 77
		bodyModel[27].setRotationPoint(14F, 3F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[28].setRotationPoint(-3.5F, 2.5F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 87
		bodyModel[29].setRotationPoint(-3.5F, 3.5F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 88
		bodyModel[30].setRotationPoint(-3.5F, 4.5F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[31].setRotationPoint(-3.5F, 2.5F, 8F);

		bodyModel[32].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 83
		bodyModel[32].setRotationPoint(-3.5F, 3.5F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 84
		bodyModel[33].setRotationPoint(-3.5F, 4.5F, 8F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 85
		bodyModel[34].setRotationPoint(-3F, 2.5F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 88
		bodyModel[35].setRotationPoint(-3F, 2.5F, -8F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 90
		bodyModel[36].setRotationPoint(-3F, 2.5F, 11F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 92
		bodyModel[37].setRotationPoint(-3F, 2.5F, 8F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 93
		bodyModel[38].setRotationPoint(-30F, 2F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 99
		bodyModel[39].setRotationPoint(-23F, -11F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[40].setRotationPoint(-23F, -11F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[41].setRotationPoint(23F, -11F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 102
		bodyModel[42].setRotationPoint(23F, -11F, 10F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 103
		bodyModel[43].setRotationPoint(-27.01F, 1F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 104
		bodyModel[44].setRotationPoint(-27F, 3F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 105
		bodyModel[45].setRotationPoint(-24F, 3F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 106
		bodyModel[46].setRotationPoint(-24.01F, 1F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 107
		bodyModel[47].setRotationPoint(-27.5F, 6F, -12F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 108
		bodyModel[48].setRotationPoint(-27F, 3F, -12F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 109
		bodyModel[49].setRotationPoint(-27F, 3F, 10F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 110
		bodyModel[50].setRotationPoint(-27.5F, 6F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 111
		bodyModel[51].setRotationPoint(-27F, 3F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 112
		bodyModel[52].setRotationPoint(-24F, 3F, 10F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 113
		bodyModel[53].setRotationPoint(-24.01F, 1F, 10F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 114
		bodyModel[54].setRotationPoint(-27.01F, 1F, 10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[55].setRotationPoint(-23F, -12F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[56].setRotationPoint(-23F, -12F, 4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[57].setRotationPoint(-22F, -9F, -4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[58].setRotationPoint(-23F, -6F, -4F);

		bodyModel[59].addBox(0F, 0F, 0F, 53, 1, 12, 0F); // Box 80
		bodyModel[59].setRotationPoint(-27F, 2.5F, -6F);

		bodyModel[60].addBox(0F, 0F, 0F, 18, 12, 1, 0F); // Box 81
		bodyModel[60].setRotationPoint(-22F, -11.5F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 18, 12, 1, 0F); // Box 82
		bodyModel[61].setRotationPoint(-22F, -11.5F, 10F);

		bodyModel[62].addBox(0F, 0F, 0F, 14, 7, 1, 0F); // Box 83
		bodyModel[62].setRotationPoint(-18F, -18.5F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 14, 7, 1, 0F); // Box 84
		bodyModel[63].setRotationPoint(-18F, -18.5F, 10F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 85
		bodyModel[64].setRotationPoint(-20F, -16.5F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 86
		bodyModel[65].setRotationPoint(-20F, -16.5F, 10F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 12, 20, 0F); // Box 87
		bodyModel[66].setRotationPoint(-20F, -16.5F, -10F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 19, 20, 0F); // Box 88
		bodyModel[67].setRotationPoint(-5F, -18.5F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 80 coal
		bodyModel[68].setRotationPoint(-21F, -5F, -4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81 coal
		bodyModel[69].setRotationPoint(-19.5F, -15.5F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82 coal
		bodyModel[70].setRotationPoint(-19.5F, -15.5F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[71].setRotationPoint(10.5F, 2.75F, -1.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[72].setRotationPoint(-15.5F, 2.75F, -1.5F);
	}
	ModelFrictionTruck bogie = new ModelFrictionTruck();

	public float[] getTrans() {
		return new float[]{0F, 0.05F, 0.0F};
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			}
			if(m.boxName.equals("cull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
			}
			if(m.boxName.equals("cull")){
				GL11.glEnable(GL11.GL_CULL_FACE);
			}
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FrictionTruck_Greyish.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-0.9,-0.1,-0.0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(1.65,-0.0,0.00);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}