//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: WrappedWoodOptimized_bulkhead_slice
// Model Creator: bibibibibibibiba
// Created on: 16.10.2023 - 23:31:51
// Last changed on: 16.10.2023 - 23:31:51

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelWrappedWoodOptimized_slice1 extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelWrappedWoodOptimized_slice1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[70];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 98, 47, textureX, textureY); // Box 4 support
		bodyModel[1] = new ModelRendererTurbo(this, 63, 47, textureX, textureY); // Box 3 support
		bodyModel[2] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 1 wood hyper
		bodyModel[3] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[4] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[5] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[6] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[7] = new ModelRendererTurbo(this, 98, 47, textureX, textureY); // Box 4 support
		bodyModel[8] = new ModelRendererTurbo(this, 63, 47, textureX, textureY); // Box 3 support
		bodyModel[9] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 1 wood hyper
		bodyModel[10] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[11] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[12] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[13] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[14] = new ModelRendererTurbo(this, 98, 47, textureX, textureY); // Box 4 support
		bodyModel[15] = new ModelRendererTurbo(this, 63, 47, textureX, textureY); // Box 3 support
		bodyModel[16] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 1 wood hyper
		bodyModel[17] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[18] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[19] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[20] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[21] = new ModelRendererTurbo(this, 98, 47, textureX, textureY); // Box 4 support
		bodyModel[22] = new ModelRendererTurbo(this, 63, 47, textureX, textureY); // Box 3 support
		bodyModel[23] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 1 wood hyper
		bodyModel[24] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[25] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[26] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[27] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[28] = new ModelRendererTurbo(this, 98, 47, textureX, textureY); // Box 4 support
		bodyModel[29] = new ModelRendererTurbo(this, 63, 47, textureX, textureY); // Box 3 support
		bodyModel[30] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 1 wood hyper
		bodyModel[31] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[32] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[33] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[34] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[35] = new ModelRendererTurbo(this, 98, 47, textureX, textureY); // Box 4 support
		bodyModel[36] = new ModelRendererTurbo(this, 63, 47, textureX, textureY); // Box 3 support
		bodyModel[37] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 1 wood hyper
		bodyModel[38] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[39] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[40] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[41] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[42] = new ModelRendererTurbo(this, 98, 47, textureX, textureY); // Box 4 support
		bodyModel[43] = new ModelRendererTurbo(this, 63, 47, textureX, textureY); // Box 3 support
		bodyModel[44] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 1 wood hyper
		bodyModel[45] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[46] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[47] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[48] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[49] = new ModelRendererTurbo(this, 98, 47, textureX, textureY); // Box 4 support
		bodyModel[50] = new ModelRendererTurbo(this, 63, 47, textureX, textureY); // Box 3 support
		bodyModel[51] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 1 wood hyper
		bodyModel[52] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[53] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[54] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[55] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[56] = new ModelRendererTurbo(this, 98, 47, textureX, textureY); // Box 4 support
		bodyModel[57] = new ModelRendererTurbo(this, 63, 47, textureX, textureY); // Box 3 support
		bodyModel[58] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 1 wood hyper
		bodyModel[59] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[60] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[61] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[62] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[63] = new ModelRendererTurbo(this, 98, 47, textureX, textureY); // Box 4 support
		bodyModel[64] = new ModelRendererTurbo(this, 63, 47, textureX, textureY); // Box 3 support
		bodyModel[65] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 1 wood hyper
		bodyModel[66] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull
		bodyModel[67] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[68] = new ModelRendererTurbo(this, 51, 73, textureX, textureY, "cull"); // Box 7 strap cull
		bodyModel[69] = new ModelRendererTurbo(this, 56, 58, textureX, textureY, "cull"); // Box 6 strap cull

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 support
		bodyModel[0].setRotationPoint(-30F, 9F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 support
		bodyModel[1].setRotationPoint(-39F, 9F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 32, 15, 16, 0F,-7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F); // Box 1 wood hyper
		bodyModel[2].setRotationPoint(-49.5F, -5F, -14F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[3].setRotationPoint(-38.5F, 5F, -14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[4].setRotationPoint(-38.5F, 10F, -10F);
		bodyModel[4].rotateAngleX = 1.57079633F;

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[5].setRotationPoint(-29.5F, 10F, -10F);
		bodyModel[5].rotateAngleX = 1.57079633F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[6].setRotationPoint(-29.5F, 5F, -14F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 support
		bodyModel[7].setRotationPoint(-30F, 9F, 2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 support
		bodyModel[8].setRotationPoint(-39F, 9F, 2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 32, 15, 16, 0F,-7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F); // Box 1 wood hyper
		bodyModel[9].setRotationPoint(-49.5F, -5F, -2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[10].setRotationPoint(-38.5F, 5F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[11].setRotationPoint(-38.5F, 10F, 2F);
		bodyModel[11].rotateAngleX = 1.57079633F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[12].setRotationPoint(-29.5F, 10F, 2F);
		bodyModel[12].rotateAngleX = 1.57079633F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[13].setRotationPoint(-29.5F, 5F, -2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 support
		bodyModel[14].setRotationPoint(-13F, 9F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 support
		bodyModel[15].setRotationPoint(-22F, 9F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 32, 15, 16, 0F,-7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F); // Box 1 wood hyper
		bodyModel[16].setRotationPoint(-32.5F, -5F, -14F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[17].setRotationPoint(-21.5F, 5F, -14F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[18].setRotationPoint(-21.5F, 10F, -10F);
		bodyModel[18].rotateAngleX = 1.57079633F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[19].setRotationPoint(-12.5F, 10F, -10F);
		bodyModel[19].rotateAngleX = 1.57079633F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[20].setRotationPoint(-12.5F, 5F, -14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 support
		bodyModel[21].setRotationPoint(-13F, 9F, 2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 support
		bodyModel[22].setRotationPoint(-22F, 9F, 2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 32, 15, 16, 0F,-7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F); // Box 1 wood hyper
		bodyModel[23].setRotationPoint(-32.5F, -5F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[24].setRotationPoint(-21.5F, 5F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[25].setRotationPoint(-21.5F, 10F, 2F);
		bodyModel[25].rotateAngleX = 1.57079633F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[26].setRotationPoint(-12.5F, 10F, 2F);
		bodyModel[26].rotateAngleX = 1.57079633F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[27].setRotationPoint(-12.5F, 5F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 support
		bodyModel[28].setRotationPoint(4F, 9F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 support
		bodyModel[29].setRotationPoint(-5F, 9F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 32, 15, 16, 0F,-7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F); // Box 1 wood hyper
		bodyModel[30].setRotationPoint(-15.5F, -5F, -14F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[31].setRotationPoint(-4.5F, 5F, -14F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[32].setRotationPoint(-4.5F, 10F, -10F);
		bodyModel[32].rotateAngleX = 1.57079633F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[33].setRotationPoint(4.5F, 10F, -10F);
		bodyModel[33].rotateAngleX = 1.57079633F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[34].setRotationPoint(4.5F, 5F, -14F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 support
		bodyModel[35].setRotationPoint(4F, 9F, 2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 support
		bodyModel[36].setRotationPoint(-5F, 9F, 2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 32, 15, 16, 0F,-7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F); // Box 1 wood hyper
		bodyModel[37].setRotationPoint(-15.5F, -5F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[38].setRotationPoint(-4.5F, 5F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[39].setRotationPoint(-4.5F, 10F, 2F);
		bodyModel[39].rotateAngleX = 1.57079633F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[40].setRotationPoint(4.5F, 10F, 2F);
		bodyModel[40].rotateAngleX = 1.57079633F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[41].setRotationPoint(4.5F, 5F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 support
		bodyModel[42].setRotationPoint(21F, 9F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 support
		bodyModel[43].setRotationPoint(12F, 9F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 32, 15, 16, 0F,-7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F); // Box 1 wood hyper
		bodyModel[44].setRotationPoint(1.5F, -5F, -14F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[45].setRotationPoint(12.5F, 5F, -14F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[46].setRotationPoint(12.5F, 10F, -10F);
		bodyModel[46].rotateAngleX = 1.57079633F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[47].setRotationPoint(21.5F, 10F, -10F);
		bodyModel[47].rotateAngleX = 1.57079633F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[48].setRotationPoint(21.5F, 5F, -14F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 support
		bodyModel[49].setRotationPoint(21F, 9F, 2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 support
		bodyModel[50].setRotationPoint(12F, 9F, 2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 32, 15, 16, 0F,-7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F); // Box 1 wood hyper
		bodyModel[51].setRotationPoint(1.5F, -5F, -2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[52].setRotationPoint(12.5F, 5F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[53].setRotationPoint(12.5F, 10F, 2F);
		bodyModel[53].rotateAngleX = 1.57079633F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[54].setRotationPoint(21.5F, 10F, 2F);
		bodyModel[54].rotateAngleX = 1.57079633F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[55].setRotationPoint(21.5F, 5F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 support
		bodyModel[56].setRotationPoint(38F, 9F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 support
		bodyModel[57].setRotationPoint(29F, 9F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 32, 15, 16, 0F,-7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F); // Box 1 wood hyper
		bodyModel[58].setRotationPoint(18.5F, -5F, -14F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[59].setRotationPoint(29.5F, 5F, -14F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[60].setRotationPoint(29.5F, 10F, -10F);
		bodyModel[60].rotateAngleX = 1.57079633F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[61].setRotationPoint(38.5F, 10F, -10F);
		bodyModel[61].rotateAngleX = 1.57079633F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[62].setRotationPoint(38.5F, 5F, -14F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 support
		bodyModel[63].setRotationPoint(38F, 9F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 support
		bodyModel[64].setRotationPoint(29F, 9F, 2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 32, 15, 16, 0F,-7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F); // Box 1 wood hyper
		bodyModel[65].setRotationPoint(18.5F, -5F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[66].setRotationPoint(29.5F, 5F, -2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[67].setRotationPoint(29.5F, 10F, 2F);
		bodyModel[67].rotateAngleX = 1.57079633F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.125F, 0F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.49F, -0.5F, -0.125F, 0.49F, -0.5F, -0.125F, -7F, 0.01F, -0.125F, -7F, 0.01F, -0.125F, -6.49F, -0.5F, -0.125F, -6.49F, -0.5F); // Box 7 strap cull
		bodyModel[68].setRotationPoint(38.5F, 10F, 2F);
		bodyModel[68].rotateAngleX = 1.57079633F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,-0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, 0.01F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F, -0.125F, -10.5F, -3.49F); // Box 6 strap cull
		bodyModel[69].setRotationPoint(38.5F, 5F, -2F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 70; i++) {
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