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

public class ModelTender460 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelTender460() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[54];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 84, textureX, textureY); // Box 294
		bodyModel[1] = new ModelRendererTurbo(this, 45, 61, textureX, textureY); // Box 295
		bodyModel[2] = new ModelRendererTurbo(this, 0, 61, textureX, textureY); // Box 296
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 297
		bodyModel[4] = new ModelRendererTurbo(this, 90, 0, textureX, textureY); // Box 305
		bodyModel[5] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 311
		bodyModel[6] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 312
		bodyModel[7] = new ModelRendererTurbo(this, 79, 17, textureX, textureY); // Box 314
		bodyModel[8] = new ModelRendererTurbo(this, 46, 43, textureX, textureY); // Box 315
		bodyModel[9] = new ModelRendererTurbo(this, 46, 38, textureX, textureY); // Box 316
		bodyModel[10] = new ModelRendererTurbo(this, 59, 51, textureX, textureY); // Box 318
		bodyModel[11] = new ModelRendererTurbo(this, 73, 48, textureX, textureY); // Box 341
		bodyModel[12] = new ModelRendererTurbo(this, 70, 48, textureX, textureY); // Box 342
		bodyModel[13] = new ModelRendererTurbo(this, 70, 48, textureX, textureY); // Box 343
		bodyModel[14] = new ModelRendererTurbo(this, 86, 48, textureX, textureY); // Box 344
		bodyModel[15] = new ModelRendererTurbo(this, 86, 48, textureX, textureY); // Box 345
		bodyModel[16] = new ModelRendererTurbo(this, 0, 103, textureX, textureY); // Box 346
		bodyModel[17] = new ModelRendererTurbo(this, 13, 103, textureX, textureY); // Box 348
		bodyModel[18] = new ModelRendererTurbo(this, 26, 103, textureX, textureY); // Box 349
		bodyModel[19] = new ModelRendererTurbo(this, 26, 103, textureX, textureY); // Box 350
		bodyModel[20] = new ModelRendererTurbo(this, 77, 64, textureX, textureY); // Box 351
		bodyModel[21] = new ModelRendererTurbo(this, 0, 73, textureX, textureY); // Box 352
		bodyModel[22] = new ModelRendererTurbo(this, 13, 103, textureX, textureY); // Box 34
		bodyModel[23] = new ModelRendererTurbo(this, 26, 62, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 0, 61, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 0, 61, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 321
		bodyModel[27] = new ModelRendererTurbo(this, 25, 119, textureX, textureY); // Box 322
		bodyModel[28] = new ModelRendererTurbo(this, 25, 119, textureX, textureY); // Box 323
		bodyModel[29] = new ModelRendererTurbo(this, 79, 0, textureX, textureY); // Box 50
		bodyModel[30] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 165
		bodyModel[31] = new ModelRendererTurbo(this, 4, 70, textureX, textureY); // Box 53
		bodyModel[32] = new ModelRendererTurbo(this, 4, 70, textureX, textureY); // Box 54
		bodyModel[33] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 55
		bodyModel[34] = new ModelRendererTurbo(this, 4, 70, textureX, textureY); // Box 56
		bodyModel[35] = new ModelRendererTurbo(this, 4, 70, textureX, textureY); // Box 57
		bodyModel[36] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 58
		bodyModel[37] = new ModelRendererTurbo(this, 4, 70, textureX, textureY); // Box 59
		bodyModel[38] = new ModelRendererTurbo(this, 4, 70, textureX, textureY); // Box 60
		bodyModel[39] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 61
		bodyModel[40] = new ModelRendererTurbo(this, 4, 70, textureX, textureY); // Box 62
		bodyModel[41] = new ModelRendererTurbo(this, 4, 70, textureX, textureY); // Box 63
		bodyModel[42] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 64
		bodyModel[43] = new ModelRendererTurbo(this, 30, 68, textureX, textureY); // Box 65
		bodyModel[44] = new ModelRendererTurbo(this, 25, 68, textureX, textureY); // Box 66
		bodyModel[45] = new ModelRendererTurbo(this, 25, 68, textureX, textureY); // Box 67
		bodyModel[46] = new ModelRendererTurbo(this, 30, 68, textureX, textureY); // Box 68
		bodyModel[47] = new ModelRendererTurbo(this, 99, 34, textureX, textureY); // Box 50
		bodyModel[48] = new ModelRendererTurbo(this, 122, 63, textureX, textureY); // Box 51
		bodyModel[49] = new ModelRendererTurbo(this, 122, 63, textureX, textureY); // Box 52
		bodyModel[50] = new ModelRendererTurbo(this, 122, 76, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 59, 51, textureX, textureY); // Box 54
		bodyModel[52] = new ModelRendererTurbo(this, 59, 51, textureX, textureY); // Box 55
		bodyModel[53] = new ModelRendererTurbo(this, 59, 51, textureX, textureY); // Box 56

		bodyModel[0].addBox(0F, 0F, 0F, 34, 2, 16, 0F); // Box 294
		bodyModel[0].setRotationPoint(-17F, 2F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 295
		bodyModel[1].setRotationPoint(-19F, 2F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 296
		bodyModel[2].setRotationPoint(17F, 2F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 33, 12, 6, 0F); // Box 297
		bodyModel[3].setRotationPoint(-16F, -10F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 12, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 305
		bodyModel[4].setRotationPoint(17F, -10F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 33, 12, 6, 0F); // Box 311
		bodyModel[5].setRotationPoint(-16F, -10F, 5F);

		bodyModel[6].addBox(0F, 0F, 0F, 17, 12, 10, 0F); // Box 312
		bodyModel[6].setRotationPoint(0F, -10F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 314
		bodyModel[7].setRotationPoint(-17F, -10F, 6F);

		bodyModel[8].addBox(0F, 0F, 0F, 19, 3, 1, 0F); // Box 315
		bodyModel[8].setRotationPoint(-13F, -13F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 19, 3, 1, 0F); // Box 316
		bodyModel[9].setRotationPoint(-13F, -13F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[10].setRotationPoint(-16F, -13F, 10F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Box 341
		bodyModel[11].setRotationPoint(5F, -14F, -5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[12].setRotationPoint(5F, -13F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[13].setRotationPoint(5F, -13F, 5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[14].setRotationPoint(5F, -14F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[15].setRotationPoint(5F, -14F, 5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 16, 10, 0F); // Box 346
		bodyModel[16].setRotationPoint(-13F, -14F, -5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[17].setRotationPoint(-13F, -13F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[18].setRotationPoint(-13F, -14F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[19].setRotationPoint(-13F, -14F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 11, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 5F, 3F, 0F, 5F, 3F, 0F, 5F, 3F, 0F, 5F); // Box 351
		bodyModel[20].setRotationPoint(-9F, -16F, -5F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 352
		bodyModel[21].setRotationPoint(10F, -12F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[22].setRotationPoint(-13F, -13F, 5F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 36
		bodyModel[23].setRotationPoint(-21F, 3F, -1.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 37
		bodyModel[24].setRotationPoint(-11F, 4F, -2F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 38
		bodyModel[25].setRotationPoint(7F, 4F, -2F);

		bodyModel[26].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 321
		bodyModel[26].setRotationPoint(17F, 3F, -1.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[27].setRotationPoint(19F, 2F, -1.5F);
		bodyModel[27].rotateAngleZ = -0.03490659F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 323
		bodyModel[28].setRotationPoint(19F, 5F, -1.5F);
		bodyModel[28].rotateAngleZ = -0.03490659F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 50
		bodyModel[29].setRotationPoint(-17F, -10F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[30].setRotationPoint(-19F, 4F, 9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[31].setRotationPoint(-19F, 8F, 9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[32].setRotationPoint(-19F, 6F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[33].setRotationPoint(-19F, 4F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[34].setRotationPoint(-19F, 8F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[35].setRotationPoint(-19F, 6F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[36].setRotationPoint(17F, 4F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[37].setRotationPoint(17F, 8F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[38].setRotationPoint(17F, 6F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[39].setRotationPoint(17F, 4F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[40].setRotationPoint(17F, 8F, 9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[41].setRotationPoint(17F, 6F, 9F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 2, 18, 0F); // Box 64
		bodyModel[42].setRotationPoint(20F, 1F, -9F);
		bodyModel[42].rotateAngleZ = -0.78539816F;

		bodyModel[43].addBox(0F, 0F, 0F, 0, 10, 2, 0F); // Box 65
		bodyModel[43].setRotationPoint(-16F, -9F, -12F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 10, 2, 0F); // Box 66
		bodyModel[44].setRotationPoint(-16F, -9F, 10F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 10, 2, 0F); // Box 67
		bodyModel[45].setRotationPoint(17F, -9F, 10F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 10, 2, 0F); // Box 68
		bodyModel[46].setRotationPoint(17F, -9F, -12F);

		bodyModel[47].addBox(0F, 0F, 0F, 20, 18, 10, 0F); // Box 50
		bodyModel[47].setRotationPoint(-15F, -16F, -5F);

		bodyModel[48].addBox(0F, 0F, 0F, 17, 6, 5, 0F); // Box 51
		bodyModel[48].setRotationPoint(-12F, -16F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 17, 6, 5, 0F); // Box 52
		bodyModel[49].setRotationPoint(-12F, -16F, 5F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 54
		bodyModel[50].setRotationPoint(-6F, -18F, -2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[51].setRotationPoint(-16F, -13F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[52].setRotationPoint(6F, -13F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[53].setRotationPoint(6F, -13F, 10F);
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
		GL11.glTranslatef(-0.575F, 0.0F, 0F);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(0.575F, 0.0F, 0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

	}
}