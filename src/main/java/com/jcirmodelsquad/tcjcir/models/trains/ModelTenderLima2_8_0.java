//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 4-6-0 tender
// Model Creator: J.Smith
// Created on: 04.10.2024 - 15:47:20
// Last changed on: 04.10.2024 - 15:47:20

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFrictionTruckTender;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelTenderLima2_8_0 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelTenderLima2_8_0() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[62];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 88, textureX, textureY); // Box 294
		bodyModel[1] = new ModelRendererTurbo(this, 45, 63, textureX, textureY); // Box 295
		bodyModel[2] = new ModelRendererTurbo(this, 45, 63, textureX, textureY); // Box 296
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 297
		bodyModel[4] = new ModelRendererTurbo(this, 90, 0, textureX, textureY); // Box 305
		bodyModel[5] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 311
		bodyModel[6] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 312
		bodyModel[7] = new ModelRendererTurbo(this, 79, 17, textureX, textureY); // Box 314
		bodyModel[8] = new ModelRendererTurbo(this, 46, 43, textureX, textureY); // Box 315
		bodyModel[9] = new ModelRendererTurbo(this, 46, 38, textureX, textureY); // Box 316
		bodyModel[10] = new ModelRendererTurbo(this, 59, 51, textureX, textureY); // Box 318
		bodyModel[11] = new ModelRendererTurbo(this, 75, 50, textureX, textureY); // Box 341
		bodyModel[12] = new ModelRendererTurbo(this, 68, 48, textureX, textureY); // Box 342
		bodyModel[13] = new ModelRendererTurbo(this, 68, 48, textureX, textureY); // Box 343
		bodyModel[14] = new ModelRendererTurbo(this, 86, 48, textureX, textureY); // Box 345
		bodyModel[15] = new ModelRendererTurbo(this, 0, 107, textureX, textureY); // Box 346
		bodyModel[16] = new ModelRendererTurbo(this, 77, 72, textureX, textureY); // Box 351
		bodyModel[17] = new ModelRendererTurbo(this, 0, 73, textureX, textureY); // Box 352
		bodyModel[18] = new ModelRendererTurbo(this, 27, 62, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 0, 61, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 0, 61, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 25, 123, textureX, textureY); // Box 321
		bodyModel[22] = new ModelRendererTurbo(this, 25, 118, textureX, textureY); // Box 322
		bodyModel[23] = new ModelRendererTurbo(this, 25, 118, textureX, textureY); // Box 323
		bodyModel[24] = new ModelRendererTurbo(this, 79, 0, textureX, textureY); // Box 50
		bodyModel[25] = new ModelRendererTurbo(this, 0, 73, textureX, textureY,"cull"); // Box 165 CULL
		bodyModel[26] = new ModelRendererTurbo(this, 7, 70, textureX, textureY); // Box 54
		bodyModel[27] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 64
		bodyModel[28] = new ModelRendererTurbo(this, 25, 68, textureX, textureY); // Box 65
		bodyModel[29] = new ModelRendererTurbo(this, 25, 68, textureX, textureY); // Box 66
		bodyModel[30] = new ModelRendererTurbo(this, 30, 70, textureX, textureY); // Box 68
		bodyModel[31] = new ModelRendererTurbo(this, 100, 33, textureX, textureY); // Box 50
		bodyModel[32] = new ModelRendererTurbo(this, 122, 76, textureX, textureY); // Box 54
		bodyModel[33] = new ModelRendererTurbo(this, 59, 51, textureX, textureY); // Box 54
		bodyModel[34] = new ModelRendererTurbo(this, 60, 51, textureX, textureY); // Box 55
		bodyModel[35] = new ModelRendererTurbo(this, 60, 51, textureX, textureY); // Box 56
		bodyModel[36] = new ModelRendererTurbo(this, 77, 35, textureX, textureY); // Box 59
		bodyModel[37] = new ModelRendererTurbo(this, 77, 35, textureX, textureY); // Box 60
		bodyModel[38] = new ModelRendererTurbo(this, 86, 48, textureX, textureY); // Box 62
		bodyModel[39] = new ModelRendererTurbo(this, 13, 107, textureX, textureY); // Box 348
		bodyModel[40] = new ModelRendererTurbo(this, 36, 113, textureX, textureY); // Box 349
		bodyModel[41] = new ModelRendererTurbo(this, 36, 107, textureX, textureY); // Box 350
		bodyModel[42] = new ModelRendererTurbo(this, 13, 107, textureX, textureY); // Box 34
		bodyModel[43] = new ModelRendererTurbo(this, 0, 67, textureX, textureY,"cull"); // Box 76 CULL
		bodyModel[44] = new ModelRendererTurbo(this, 0, 67, textureX, textureY,"cull"); // Box 77 CULL
		bodyModel[45] = new ModelRendererTurbo(this, 0, 73, textureX, textureY,"cull"); // Box 78 CULL
		bodyModel[46] = new ModelRendererTurbo(this, 7, 70, textureX, textureY); // Box 79
		bodyModel[47] = new ModelRendererTurbo(this, 7, 70, textureX, textureY); // Box 80
		bodyModel[48] = new ModelRendererTurbo(this, 7, 70, textureX, textureY); // Box 81
		bodyModel[49] = new ModelRendererTurbo(this, 30, 70, textureX, textureY); // Box 82
		bodyModel[50] = new ModelRendererTurbo(this, 85, 93, textureX, textureY); // Box 96
		bodyModel[51] = new ModelRendererTurbo(this, 94, 88, textureX, textureY,"lamp"); // bulb
		bodyModel[52] = new ModelRendererTurbo(this, 101, 87, textureX, textureY); // Box 189
		bodyModel[53] = new ModelRendererTurbo(this, 85, 88, textureX, textureY); // Box 191
		bodyModel[54] = new ModelRendererTurbo(this, 98, 93, textureX, textureY); // Box 192
		bodyModel[55] = new ModelRendererTurbo(this, 112, 87, textureX, textureY); // Box 213
		bodyModel[56] = new ModelRendererTurbo(this, 125, 87, textureX, textureY,"lamp"); // bulb2
		bodyModel[57] = new ModelRendererTurbo(this, 112, 94, textureX, textureY,"cull"); // numberboard
		bodyModel[58] = new ModelRendererTurbo(this, 139, 88, textureX, textureY); // Box 191
		bodyModel[59] = new ModelRendererTurbo(this, 127, 93, textureX, textureY); // Box 219
		bodyModel[60] = new ModelRendererTurbo(this, 132, 87, textureX, textureY,"lamp"); // bulb3
		bodyModel[61] = new ModelRendererTurbo(this, 137, 93, textureX, textureY); // Box 222

		bodyModel[0].addBox(0F, 0F, 0F, 34, 2, 16, 0F); // Box 294
		bodyModel[0].setRotationPoint(-1F, 2F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 295
		bodyModel[1].setRotationPoint(-3F, 2F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 296
		bodyModel[2].setRotationPoint(33F, 2F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 32, 11, 6, 0F); // Box 297
		bodyModel[3].setRotationPoint(0F, -9F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 12, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 305
		bodyModel[4].setRotationPoint(32F, -10F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 32, 11, 6, 0F); // Box 311
		bodyModel[5].setRotationPoint(0F, -9F, 5F);

		bodyModel[6].addBox(0F, 0F, 0F, 14, 11, 10, 0F); // Box 312
		bodyModel[6].setRotationPoint(18F, -9F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 314
		bodyModel[7].setRotationPoint(-1F, -9F, 6F);

		bodyModel[8].addBox(0F, 0F, 0F, 22, 3, 1, 0F); // Box 315
		bodyModel[8].setRotationPoint(5F, -12F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 22, 3, 1, 0F); // Box 316
		bodyModel[9].setRotationPoint(5F, -12F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[10].setRotationPoint(2F, -12F, 10F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 341
		bodyModel[11].setRotationPoint(26F, -13F, -4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[12].setRotationPoint(26F, -11F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[13].setRotationPoint(26F, -11F, 4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[14].setRotationPoint(26F, -13F, 4F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 11, 10, 0F); // Box 346
		bodyModel[15].setRotationPoint(2F, -9F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 2F); // Box 351
		bodyModel[16].setRotationPoint(3F, -10F, -3F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 352
		bodyModel[17].setRotationPoint(28F, -11F, -3F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 36
		bodyModel[18].setRotationPoint(-5F, 3F, -1.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 37
		bodyModel[19].setRotationPoint(5F, 4F, -2F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 38
		bodyModel[20].setRotationPoint(23F, 4F, -2F);

		bodyModel[21].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 321
		bodyModel[21].setRotationPoint(33F, 3F, -1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[22].setRotationPoint(35F, 3F, -1.5F);
		bodyModel[22].rotateAngleZ = -0.03490659F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 323
		bodyModel[23].setRotationPoint(35F, 5F, -1.5F);
		bodyModel[23].rotateAngleZ = -0.03490659F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 50
		bodyModel[24].setRotationPoint(-1F, -9F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F); // Box 165 CULL
		bodyModel[25].setRotationPoint(-3F, 4F, 10.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 54
		bodyModel[26].setRotationPoint(-3F, 6F, 10.75F);

		bodyModel[27].addBox(0F, 0F, 0F, 0, 2, 18, 0F); // Box 64
		bodyModel[27].setRotationPoint(36F, 1F, -9F);
		bodyModel[27].rotateAngleZ = -0.78539816F;

		bodyModel[28].addBox(0F, 0F, 0F, 0, 10, 2, 0F); // Box 65
		bodyModel[28].setRotationPoint(0F, -8F, -12F);

		bodyModel[29].addBox(0F, 0F, 0F, 0, 10, 2, 0F); // Box 66
		bodyModel[29].setRotationPoint(0F, -8F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 10, 0, 0F); // Box 68
		bodyModel[30].setRotationPoint(32F, -8F, -10F);

		bodyModel[31].addBox(0F, 0F, 0F, 18, 10, 10, 0F); // Box 50
		bodyModel[31].setRotationPoint(0F, -8F, -5F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 54
		bodyModel[32].setRotationPoint(12F, -9F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[33].setRotationPoint(2F, -12F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[34].setRotationPoint(27F, -12F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[35].setRotationPoint(27F, -12F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 59
		bodyModel[36].setRotationPoint(27F, -10F, 10F);

		bodyModel[37].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 60
		bodyModel[37].setRotationPoint(27F, -10F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[38].setRotationPoint(26F, -13F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[39].setRotationPoint(5F, -12F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[40].setRotationPoint(5F, -13F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[41].setRotationPoint(5F, -13F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[42].setRotationPoint(5F, -12F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 76 CULL
		bodyModel[43].setRotationPoint(-3F, 4F, -11.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 77 CULL
		bodyModel[44].setRotationPoint(33F, 4F, -11.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F); // Box 78 CULL
		bodyModel[45].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 79
		bodyModel[46].setRotationPoint(-3F, 6F, -11.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 80
		bodyModel[47].setRotationPoint(33F, 6F, -11.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 81
		bodyModel[48].setRotationPoint(33F, 6F, 10.75F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 10, 0, 0F); // Box 82
		bodyModel[49].setRotationPoint(32F, -8F, 10F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 96
		bodyModel[50].setRotationPoint(29.25F, -14.5F, -6F);
		bodyModel[50].rotateAngleX = -0.78539816F;

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // bulb
		bodyModel[51].setRotationPoint(31.26F, -13.75F, -6F);
		bodyModel[51].rotateAngleX = -0.78539816F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
		bodyModel[52].setRotationPoint(29F, -11.25F, -6F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 191
		bodyModel[53].setRotationPoint(29.5F, -15F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 192
		bodyModel[54].setRotationPoint(29F, -11.25F, -8F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 213
		bodyModel[55].setRotationPoint(29.25F, -13.5F, -7.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // bulb2
		bodyModel[56].setRotationPoint(31.26F, -13F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, 0.8F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, 0F, 0.8F); // numberboard
		bodyModel[57].setRotationPoint(29F, -13F, -7.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 191
		bodyModel[58].setRotationPoint(29.25F, -15F, -7.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 219
		bodyModel[59].setRotationPoint(29.25F, -14.5F, -7.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // bulb3
		bodyModel[60].setRotationPoint(31.26F, -14F, -7F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 222
		bodyModel[61].setRotationPoint(30.25F, -16F, -6.5F);
	}
	ModelFrictionTruckTender bogie = new ModelFrictionTruckTender();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				m.render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if(m.boxName.equals("cull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			}else{
				m.render(f5);
			}
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FrictionTruck_CDCS.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(0.44F, 0F, 0F);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.55F, 0F, 0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

	}
}