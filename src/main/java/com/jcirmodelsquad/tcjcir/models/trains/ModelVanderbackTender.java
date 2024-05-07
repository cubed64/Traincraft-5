//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Vanderback Tender
// Model Creator: Biba
// Created on: 24.03.2023 - 17:49:13
// Last changed on: 24.03.2023 - 17:49:13

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Late;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFrictionTruckTender;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFrictionTruck_Small;
import com.jcirmodelsquad.tcjcir.models.trucks.Modelvanderback_truck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelVanderbackTender extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelVanderbackTender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[68];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 284
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 285
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 286
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 287
		bodyModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 288
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 28
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 304
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 316
		bodyModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 521
		bodyModel[9] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 523
		bodyModel[10] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 524
		bodyModel[11] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 525
		bodyModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 526
		bodyModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 556
		bodyModel[14] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 324
		bodyModel[15] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 325
		bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 326
		bodyModel[17] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 327
		bodyModel[18] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 328
		bodyModel[19] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 329
		bodyModel[20] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 330
		bodyModel[21] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 331
		bodyModel[22] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 332
		bodyModel[23] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 41, 1, textureX, textureY, "lamp"); // Box Glow
		bodyModel[25] = new ModelRendererTurbo(this, 249, 1, textureX, textureY, "lamp"); // Box Glow
		bodyModel[26] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 2
		bodyModel[28] = new ModelRendererTurbo(this, 57, 1, textureX, textureY, "lamp"); // Box Glow
		bodyModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "lamp"); // Box Glow
		bodyModel[30] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 2
		bodyModel[31] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 341
		bodyModel[32] = new ModelRendererTurbo(this, 25, 9, textureX, textureY, "lamp"); // Box 342 headlight rear
		bodyModel[33] = new ModelRendererTurbo(this, 81, 17, textureX, textureY, "cull"); // Box 343 cull
		bodyModel[34] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 344
		bodyModel[35] = new ModelRendererTurbo(this, 1, 25, textureX, textureY, "lamp"); // Box 345 headlight glow
		bodyModel[36] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 346
		bodyModel[37] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 347
		bodyModel[38] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 348
		bodyModel[39] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 349
		bodyModel[40] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 350
		bodyModel[41] = new ModelRendererTurbo(this, 241, 25, textureX, textureY, "cull"); // Box 259 cull ladder
		bodyModel[42] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 352
		bodyModel[43] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 353
		bodyModel[44] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 354
		bodyModel[45] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 355
		bodyModel[46] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 356
		bodyModel[47] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 358
		bodyModel[48] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 361
		bodyModel[49] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 362
		bodyModel[50] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 363
		bodyModel[51] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 365
		bodyModel[52] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 366
		bodyModel[53] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 367
		bodyModel[54] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 368
		bodyModel[55] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 370
		bodyModel[56] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 371
		bodyModel[57] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 374
		bodyModel[58] = new ModelRendererTurbo(this, 177, 57, textureX, textureY, "cull"); // Box 375 cull
		bodyModel[59] = new ModelRendererTurbo(this, 81, 81, textureX, textureY, "cull"); // Box 376 cull handrails
		bodyModel[60] = new ModelRendererTurbo(this, 1, 73, textureX, textureY, "cull"); // Box 377 cull ladder
		bodyModel[61] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 41
		bodyModel[62] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 410
		bodyModel[63] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 411
		bodyModel[64] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 697
		bodyModel[65] = new ModelRendererTurbo(this, 2, 105, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 2, 108, textureX, textureY); // Box 66
		bodyModel[67] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 67

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 284
		bodyModel[0].setRotationPoint(20F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 285
		bodyModel[1].setRotationPoint(-23F, 3.5F, -2F);

		bodyModel[2].addBox(-4F, 0F, 0F, 4, 0, 6, 0F); // Box 286
		bodyModel[2].setRotationPoint(-20.5F, 2F, -3F);
		bodyModel[2].rotateAngleZ = 0.31415927F;

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 287
		bodyModel[3].setRotationPoint(-21.5F, 2F, -3F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 288
		bodyModel[4].setRotationPoint(19F, 2F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[5].setRotationPoint(8.5F, 4.25F, -1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[6].setRotationPoint(-14.5F, 4.25F, -1.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 39, 2, 14, 0F); // Box 316
		bodyModel[7].setRotationPoint(-20F, 3F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 29, 5, 5, 0F,0F, -5.25F, -1F, 0F, -5.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 521
		bodyModel[8].setRotationPoint(-11F, -9.25F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 22, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[9].setRotationPoint(-4F, -10.25F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 22, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[10].setRotationPoint(-4F, -10.25F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 36, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[11].setRotationPoint(-18F, -4F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 29, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.25F, -1F, 0F, -5.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 526
		bodyModel[12].setRotationPoint(-11F, -9.25F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 22, 5, 12, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[13].setRotationPoint(-4F, -9F, -6F);

		bodyModel[14].addBox(0F, 0F, 0F, 39, 1, 22, 0F); // Box 324
		bodyModel[14].setRotationPoint(-19F, 1F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 325
		bodyModel[15].setRotationPoint(-23F, 1F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 326
		bodyModel[16].setRotationPoint(-23F, 2F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 327
		bodyModel[17].setRotationPoint(-23F, 7F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 328
		bodyModel[18].setRotationPoint(-23F, 4F, -10F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 329
		bodyModel[19].setRotationPoint(16F, 2F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 330
		bodyModel[20].setRotationPoint(20F, 9F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 3, 20, 0F); // Box 331
		bodyModel[21].setRotationPoint(20F, 6F, -10F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 2, 20, 0F); // Box 332
		bodyModel[22].setRotationPoint(19.5F, -0.5F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[23].setRotationPoint(15.75F, -11F, 6.25F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[24].setRotationPoint(17.2F, -10.5F, 6.75F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box Glow
		bodyModel[25].setRotationPoint(16.25F, -10.5F, 6.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[26].setRotationPoint(16.25F, -9.25F, 5.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[27].setRotationPoint(15.75F, -11F, -8.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[28].setRotationPoint(17.2F, -10.5F, -7.75F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box Glow
		bodyModel[29].setRotationPoint(16.25F, -10.5F, -8.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[30].setRotationPoint(16.25F, -9.25F, -7.75F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 341
		bodyModel[31].setRotationPoint(15F, -13F, -5.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 342 headlight rear
		bodyModel[32].setRotationPoint(17.5F, -13F, -5.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 343 cull
		bodyModel[33].setRotationPoint(18F, -13F, -5.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 344
		bodyModel[34].setRotationPoint(19F, -13F, -5.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 345 headlight glow
		bodyModel[35].setRotationPoint(15.5F, -12.5F, -5.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 346
		bodyModel[36].setRotationPoint(15F, -10F, -5F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 347
		bodyModel[37].setRotationPoint(16F, 2F, 11F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 348
		bodyModel[38].setRotationPoint(-23F, 2F, 9F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 349
		bodyModel[39].setRotationPoint(-23F, 7F, 9F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 350
		bodyModel[40].setRotationPoint(-23F, 4F, 9F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 10, 4, 0F); // Box 259 cull ladder
		bodyModel[41].setRotationPoint(18F, -10.5F, 1F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 352
		bodyModel[42].setRotationPoint(17.5F, -4.5F, 9.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 353
		bodyModel[43].setRotationPoint(17.5F, -4.5F, -10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 354
		bodyModel[44].setRotationPoint(17.5F, -9.5F, 5.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 355
		bodyModel[45].setRotationPoint(17.5F, -9.5F, -6.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 356
		bodyModel[46].setRotationPoint(-17.5F, -3.5F, 9.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 358
		bodyModel[47].setRotationPoint(-17.5F, -3.5F, -10.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 14, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[48].setRotationPoint(-18F, -12F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 7, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[49].setRotationPoint(-18F, -8F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 7, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[50].setRotationPoint(-11F, -8F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 9, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[51].setRotationPoint(-4F, -8F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[52].setRotationPoint(-11F, -4F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[53].setRotationPoint(-17F, -12.5F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[54].setRotationPoint(-17F, -12.5F, 9F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 370
		bodyModel[55].setRotationPoint(-11.5F, -13F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[56].setRotationPoint(-19F, -12F, -3F);

		bodyModel[57].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 374
		bodyModel[57].setRotationPoint(-24F, 4.25F, -6.5F);
		bodyModel[57].rotateAngleY = 0.2443461F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 375 cull
		bodyModel[58].setRotationPoint(-4F, -10.5F, 1F);

		bodyModel[59].addBox(0F, 0F, 0F, 24, 5, 4, 0F); // Box 376 cull handrails
		bodyModel[59].setRotationPoint(-5F, -15.5F, 1F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 16, 4, 0F); // Box 377 cull ladder
		bodyModel[60].setRotationPoint(-19F, -16F, 3.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 41
		bodyModel[61].setRotationPoint(-15F, -13.25F, -7F);

		bodyModel[62].addBox(0F, -3F, 0F, 0, 3, 18, 0F); // Box 410
		bodyModel[62].setRotationPoint(20F, 4.5F, -9F);
		bodyModel[62].rotateAngleZ = -0.48869219F;

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 411
		bodyModel[63].setRotationPoint(20.75F, 2F, 0F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 697
		bodyModel[64].setRotationPoint(4.5F, -11.25F, -2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, -1F, 3.25F, 0F, -1F, 3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[65].setRotationPoint(-11F, -5F, -11.01F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, -1F, 3.25F, 0F, -1F, 3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[66].setRotationPoint(-11F, -5F, 11.01F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 10, 20, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[67].setRotationPoint(18.01F, -9F, -10F);
	}
	Modelvanderback_truck wheel = new Modelvanderback_truck();
	ModelFrictionTruck_Small wheel2 = new ModelFrictionTruck_Small();
	ModelFrictionTruckTender wheel3 = new ModelFrictionTruckTender();

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
		//vanderback_truck
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FrictionTruck_Greyish_small.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.8F, 0.0F, 0F);
		wheel3.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-1.425F, 0.0F, 0);
		wheel3.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

	public float[] getTrans() {
		return new float[]{-0F, 0.155F, 0F}; }

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}
}