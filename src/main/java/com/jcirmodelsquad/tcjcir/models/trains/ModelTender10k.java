//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.11.2023 - 23:30:36
// Last changed on: 19.11.2023 - 23:30:36

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelBettendorf_Truck;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTenderTruck3;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelTender10k extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelTender10k() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[84];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 254
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 63
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 125
		bodyModel[3] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 542
		bodyModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 543
		bodyModel[5] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 544
		bodyModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 211
		bodyModel[7] = new ModelRendererTurbo(this, 366, 1, textureX, textureY); // Box 546
		bodyModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 547
		bodyModel[9] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 548
		bodyModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 549
		bodyModel[11] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 550
		bodyModel[12] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 551
		bodyModel[13] = new ModelRendererTurbo(this, 372, 1, textureX, textureY); // Box 552
		bodyModel[14] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 553
		bodyModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 554
		bodyModel[16] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 555
		bodyModel[17] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 556
		bodyModel[18] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 557
		bodyModel[19] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 558
		bodyModel[20] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 559
		bodyModel[21] = new ModelRendererTurbo(this, 177, 17, textureX, textureY, "cull"); // Box 562 cull doghouse
		bodyModel[22] = new ModelRendererTurbo(this, 201, 9, textureX, textureY, "cull"); // Box 563 cull doghouse roof
		bodyModel[23] = new ModelRendererTurbo(this, 337, 9, textureX, textureY, "cull"); // Box 564 cull doghouse roof
		bodyModel[24] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 568
		bodyModel[25] = new ModelRendererTurbo(this, 372, 9, textureX, textureY); // Box 570
		bodyModel[26] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 659
		bodyModel[27] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "cull"); // Box 660
		bodyModel[28] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 661
		bodyModel[29] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 662
		bodyModel[30] = new ModelRendererTurbo(this, 217, 28, textureX, textureY); // Box 663
		bodyModel[31] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 579
		bodyModel[32] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 580
		bodyModel[33] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 581
		bodyModel[34] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 583
		bodyModel[35] = new ModelRendererTurbo(this, 239, 22, textureX, textureY); // Box 584
		bodyModel[36] = new ModelRendererTurbo(this, 388, 38, textureX, textureY); // Box 675
		bodyModel[37] = new ModelRendererTurbo(this, 308, 23, textureX, textureY); // Box 670
		bodyModel[38] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 362
		bodyModel[39] = new ModelRendererTurbo(this, 379, 1, textureX, textureY); // Box 361
		bodyModel[40] = new ModelRendererTurbo(this, 41, 17, textureX, textureY, "cull"); // stepping cull
		bodyModel[41] = new ModelRendererTurbo(this, 145, 17, textureX, textureY, "cull"); // stepping cull
		bodyModel[42] = new ModelRendererTurbo(this, 177, 17, textureX, textureY, "cull"); // stepping cull
		bodyModel[43] = new ModelRendererTurbo(this, 145, 25, textureX, textureY, "cull"); // stepping cull
		bodyModel[44] = new ModelRendererTurbo(this, 337, 25, textureX, textureY, "cull"); // stepping cull
		bodyModel[45] = new ModelRendererTurbo(this, 345, 25, textureX, textureY, "cull"); // stepping cull
		bodyModel[46] = new ModelRendererTurbo(this, 345, 35, textureX, textureY, "cull"); // stepping cull
		bodyModel[47] = new ModelRendererTurbo(this, 345, 30, textureX, textureY, "cull"); // stepping cull
		bodyModel[48] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 481, 1, textureX, textureY, "lamp"); // Box 410 glow marker
		bodyModel[50] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 594
		bodyModel[51] = new ModelRendererTurbo(this, 497, 1, textureX, textureY, "lamp"); // Box 595 glow marker
		bodyModel[52] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 613
		bodyModel[53] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 65
		bodyModel[54] = new ModelRendererTurbo(this, 499, 20, textureX, textureY, "cull"); // Box 175 cull
		bodyModel[55] = new ModelRendererTurbo(this, 49, 33, textureX, textureY, "cull"); // Box 73
		bodyModel[56] = new ModelRendererTurbo(this, 261, 26, textureX, textureY, "cull"); // Box cull coupler cut bar
		bodyModel[57] = new ModelRendererTurbo(this, 325, 29, textureX, textureY, "cull"); // Box cull coupler cut bar
		bodyModel[58] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 62
		bodyModel[59] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 217, 6, textureX, textureY); // Box 560
		bodyModel[61] = new ModelRendererTurbo(this, 195, 6, textureX, textureY); // Box 561
		bodyModel[62] = new ModelRendererTurbo(this, 200, 6, textureX, textureY); // Box 55
		bodyModel[63] = new ModelRendererTurbo(this, 208, 6, textureX, textureY); // Box 56
		bodyModel[64] = new ModelRendererTurbo(this, 263, 40, textureX, textureY); // Box 2
		bodyModel[65] = new ModelRendererTurbo(this, 279, 47, textureX, textureY); // Box 2
		bodyModel[66] = new ModelRendererTurbo(this, 355, 31, textureX, textureY); // Box 45
		bodyModel[67] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 69
		bodyModel[68] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 70
		bodyModel[69] = new ModelRendererTurbo(this, 84, 43, textureX, textureY); // Box 341 fmsr backing light housing
		bodyModel[70] = new ModelRendererTurbo(this, 117, 43, textureX, textureY, "lamp"); // Box 342 headlight rear fmsr
		bodyModel[71] = new ModelRendererTurbo(this, 108, 43, textureX, textureY, "cull"); // Box 343 cull fmsr backing light housing
		bodyModel[72] = new ModelRendererTurbo(this, 97, 43, textureX, textureY, "lamp"); // Box 345 numberboard glow fmsr
		bodyModel[73] = new ModelRendererTurbo(this, 75, 44, textureX, textureY); // Box 346 fmsr backinglight support
		bodyModel[74] = new ModelRendererTurbo(this, 127, 43, textureX, textureY); // Box 130 air res
		bodyModel[75] = new ModelRendererTurbo(this, 128, 44, textureX, textureY); // Box 131 air res
		bodyModel[76] = new ModelRendererTurbo(this, 128, 44, textureX, textureY); // Box 132 air res
		bodyModel[77] = new ModelRendererTurbo(this, 144, 43, textureX, textureY); // Box 78 air res support
		bodyModel[78] = new ModelRendererTurbo(this, 161, 45, textureX, textureY, "cull"); // Box 79 cull fmsr step
		bodyModel[79] = new ModelRendererTurbo(this, 176, 52, textureX, textureY); // Box 582 i am KING PIN
		bodyModel[80] = new ModelRendererTurbo(this, 178, 46, textureX, textureY); // Box 138 fmsr pilot beam
		bodyModel[81] = new ModelRendererTurbo(this, 181, 32, textureX, textureY); // Box 214 fmsr pin puller
		bodyModel[82] = new ModelRendererTurbo(this, 226, 24, textureX, textureY); // Box 186 fmsr step support
		bodyModel[83] = new ModelRendererTurbo(this, 224, 50, textureX, textureY); // Box 187 fmsr pilot step

		bodyModel[0].addShapeBox(0F, 0F, 0F, 52, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[0].setRotationPoint(-26F, 2.5F, -8.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 52, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[1].setRotationPoint(-26F, 4.5F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 52, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 125
		bodyModel[2].setRotationPoint(-26F, 1.75F, -9F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 542
		bodyModel[3].setRotationPoint(-28F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 543
		bodyModel[4].setRotationPoint(26.5F, 3F, -1.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 544
		bodyModel[5].setRotationPoint(26F, 1.75F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[6].setRotationPoint(27F, 2.75F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 44, 13, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[7].setRotationPoint(-21F, -11.25F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 13, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 547
		bodyModel[8].setRotationPoint(23F, -11.25F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 548
		bodyModel[9].setRotationPoint(-24F, -11.25F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		bodyModel[10].setRotationPoint(-23F, -11.25F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 550
		bodyModel[11].setRotationPoint(-24F, -11.25F, 5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[12].setRotationPoint(-23F, -11.25F, 4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 552
		bodyModel[13].setRotationPoint(-22F, -15.25F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 24, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 553
		bodyModel[14].setRotationPoint(-20F, -15.25F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 554
		bodyModel[15].setRotationPoint(4F, -15.25F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		bodyModel[16].setRotationPoint(-22F, -15.25F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 24, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[17].setRotationPoint(-20F, -15.25F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[18].setRotationPoint(4F, -15.25F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 25, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[19].setRotationPoint(-21F, -16.25F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 6, 0, 14, 0F); // Box 559
		bodyModel[20].setRotationPoint(-26.5F, -1.5F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562 cull doghouse
		bodyModel[21].setRotationPoint(5F, -21.25F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563 cull doghouse roof
		bodyModel[22].setRotationPoint(5F, -22.25F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564 cull doghouse roof
		bodyModel[23].setRotationPoint(5F, -22.25F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, -1F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[24].setRotationPoint(5F, -21.75F, -4F);
		bodyModel[24].rotateAngleX = 0.78539816F;

		bodyModel[25].addShapeBox(0F, 0F, 0.5F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		bodyModel[25].setRotationPoint(5F, -21.75F, 4F);
		bodyModel[25].rotateAngleX = -0.78539816F;

		bodyModel[26].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 659
		bodyModel[26].setRotationPoint(23.5F, -11F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 660
		bodyModel[27].setRotationPoint(23.75F, -11F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		bodyModel[28].setRotationPoint(23F, -12.75F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 18, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		bodyModel[29].setRotationPoint(5F, -12.75F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 18, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 663
		bodyModel[30].setRotationPoint(5F, -12.75F, 10F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 579
		bodyModel[31].setRotationPoint(16.5F, -12F, -6F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 580
		bodyModel[32].setRotationPoint(-18.5F, -17F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 52, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 581
		bodyModel[33].setRotationPoint(-26F, 4.5F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 52, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[34].setRotationPoint(-26F, 2.5F, 7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[35].setRotationPoint(-26F, 2.5F, -7.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 53, 2, 4, 0F); // Box 675
		bodyModel[36].setRotationPoint(-26F, 3F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		bodyModel[37].setRotationPoint(-28F, 0F, -2F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[38].setRotationPoint(6F, -24F, -2.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 361
		bodyModel[39].setRotationPoint(6F, -23F, -2.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // stepping cull
		bodyModel[40].setRotationPoint(-26F, 1.75F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // stepping cull
		bodyModel[41].setRotationPoint(-26F, 4.75F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // stepping cull
		bodyModel[42].setRotationPoint(-26F, 1.75F, 9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // stepping cull
		bodyModel[43].setRotationPoint(-26F, 4.75F, 9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // stepping cull
		bodyModel[44].setRotationPoint(24F, 1.75F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // stepping cull
		bodyModel[45].setRotationPoint(24F, 4.75F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // stepping cull
		bodyModel[46].setRotationPoint(24F, 1.75F, 9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // stepping cull
		bodyModel[47].setRotationPoint(24F, 4.75F, 9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[48].setRotationPoint(23.95F, -12.25F, 8.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[49].setRotationPoint(24F, -12.5F, 8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[50].setRotationPoint(24F, -12.25F, -8.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 595 glow marker
		bodyModel[51].setRotationPoint(24.05F, -12.5F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 613
		bodyModel[52].setRotationPoint(-24F, -10F, -10.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[53].setRotationPoint(-24F, -10F, 10.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175 cull
		bodyModel[54].setRotationPoint(23.5F, -15F, 3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[55].setRotationPoint(22.5F, -15F, 3F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box cull coupler cut bar
		bodyModel[56].setRotationPoint(26F, 0F, -7F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box cull coupler cut bar
		bodyModel[57].setRotationPoint(26F, 0F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 62
		bodyModel[58].setRotationPoint(23F, -10F, 10.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 63
		bodyModel[59].setRotationPoint(23F, -10F, -10.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 560
		bodyModel[60].setRotationPoint(-26.5F, -1.5F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 561
		bodyModel[61].setRotationPoint(-26.5F, -1.5F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[62].setRotationPoint(-26.5F, 0F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 56
		bodyModel[63].setRotationPoint(-26.5F, 0F, 7F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 7, 15, 0F); // Box 2
		bodyModel[64].setRotationPoint(27.1F, 2F, -7.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 0, 15, 0F); // Box 2
		bodyModel[65].setRotationPoint(27.1F, 9F, -7.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 45
		bodyModel[66].setRotationPoint(-23F, -13F, -3F);

		bodyModel[67].addBox(-3F, -3F, 0F, 3, 1, 3, 0F); // Box 69
		bodyModel[67].setRotationPoint(-14F, 7.5F, -1.5F);

		bodyModel[68].addBox(-3F, -3F, 0F, 3, 1, 3, 0F); // Box 70
		bodyModel[68].setRotationPoint(18F, 7.5F, -1.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 341 fmsr backing light housing
		bodyModel[69].setRotationPoint(20F, -15F, -1.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 342 headlight rear fmsr
		bodyModel[70].setRotationPoint(22.5F, -15F, -1.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 343 cull fmsr backing light housing
		bodyModel[71].setRotationPoint(23F, -15F, -1.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 345 numberboard glow fmsr
		bodyModel[72].setRotationPoint(20.5F, -14.5F, -1.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 346 fmsr backinglight support
		bodyModel[73].setRotationPoint(20F, -12F, -1F);

		bodyModel[74].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 130 air res
		bodyModel[74].setRotationPoint(-3.5F, 3F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131 air res
		bodyModel[75].setRotationPoint(-3.5F, 4F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132 air res
		bodyModel[76].setRotationPoint(-3.5F, 4F, -4F);

		bodyModel[77].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 78 air res support
		bodyModel[77].setRotationPoint(-5F, 1.5F, -5.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 79 cull fmsr step
		bodyModel[78].setRotationPoint(4F, -14F, 3F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 582 i am KING PIN
		bodyModel[79].setRotationPoint(27.5F, 0.28F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, -2F, 22, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138 fmsr pilot beam
		bodyModel[80].setRotationPoint(25F, 1.75F, -11F);
		bodyModel[80].rotateAngleY = 1.57079633F;

		bodyModel[81].addBox(0F, -3F, 0F, 0, 3, 20, 0F); // Box 214 fmsr pin puller
		bodyModel[81].setRotationPoint(27F, 3.28F, -10F);
		bodyModel[81].rotateAngleZ = -0.48869219F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186 fmsr step support
		bodyModel[82].setRotationPoint(27.01F, 4.5F, -10.5F);

		bodyModel[83].addShapeBox(0F, 0F, -2F, 21, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187 fmsr pilot step
		bodyModel[83].setRotationPoint(27.01F, 8.5F, -10.5F);
		bodyModel[83].rotateAngleY = 1.57079633F;
	}
	ModelBettendorf_Truck truck2 = new ModelBettendorf_Truck();
	Model70TonTruck2 bogie = new Model70TonTruck2();

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
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==19 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==20
		|| entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==21 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==22){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));//70Ton_Greyish
			GL11.glPushMatrix();
			GL11.glTranslatef(-0.95F, 0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.05F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Bettendorf_Truck_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-0.95F, 0.0F, 0F);
			truck2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.05F, 0.0F, 0);
			truck2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}