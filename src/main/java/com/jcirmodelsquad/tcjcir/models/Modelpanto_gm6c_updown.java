//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.02.2024 - 07:40:02
// Last changed on: 26.02.2024 - 07:40:02

package com.jcirmodelsquad.tcjcir.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelpanto_gm6c_updown extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelpanto_gm6c_updown() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[44];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 13, 28, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 12, 26, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 55, 26, textureX, textureY, "cull"); // Cull arm rotaty
		bodyModel[3] = new ModelRendererTurbo(this, 35, 6, textureX, textureY); // Head collector
		bodyModel[4] = new ModelRendererTurbo(this, 13, 6, textureX, textureY); // Head collector
		bodyModel[5] = new ModelRendererTurbo(this, 1, 14, textureX, textureY, "cull"); // Cull top arm
		bodyModel[6] = new ModelRendererTurbo(this, 42, 4, textureX, textureY, "cull"); // Head collector cull
		bodyModel[7] = new ModelRendererTurbo(this, 14, 33, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 14, 33, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 8, 33, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 8, 33, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 37, 36, textureX, textureY); // Lift motors
		bodyModel[16] = new ModelRendererTurbo(this, 38, 33, textureX, textureY); // Lift motors
		bodyModel[17] = new ModelRendererTurbo(this, 1, 3, textureX, textureY, "cull"); // Head collector cull
		bodyModel[18] = new ModelRendererTurbo(this, 2, 11, textureX, textureY, "cull"); // Cull top arm
		bodyModel[19] = new ModelRendererTurbo(this, 2, 11, textureX, textureY, "cull"); // Cull top arm
		bodyModel[20] = new ModelRendererTurbo(this, 1, 11, textureX, textureY, "cull"); // Cull top arm
		bodyModel[21] = new ModelRendererTurbo(this, 1, 11, textureX, textureY, "cull"); // Cull top arm
		bodyModel[22] = new ModelRendererTurbo(this, 13, 28, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 12, 26, textureX, textureY); // Box 3
		bodyModel[24] = new ModelRendererTurbo(this, 38, 26, textureX, textureY, "cull"); // Cull arm rotaty
		bodyModel[25] = new ModelRendererTurbo(this, 35, 6, textureX, textureY); // Head collector
		bodyModel[26] = new ModelRendererTurbo(this, 13, 6, textureX, textureY); // Head collector
		bodyModel[27] = new ModelRendererTurbo(this, 1, 14, textureX, textureY, "cull"); // Cull top arm
		bodyModel[28] = new ModelRendererTurbo(this, 42, 4, textureX, textureY, "cull"); // Head collector cull
		bodyModel[29] = new ModelRendererTurbo(this, 1, 3, textureX, textureY, "cull"); // Head collector cull
		bodyModel[30] = new ModelRendererTurbo(this, 2, 11, textureX, textureY, "cull"); // Cull top arm
		bodyModel[31] = new ModelRendererTurbo(this, 2, 11, textureX, textureY, "cull"); // Cull top arm
		bodyModel[32] = new ModelRendererTurbo(this, 1, 11, textureX, textureY, "cull"); // Cull top arm
		bodyModel[33] = new ModelRendererTurbo(this, 1, 11, textureX, textureY, "cull"); // Cull top arm
		bodyModel[34] = new ModelRendererTurbo(this, 14, 33, textureX, textureY); // Box 18
		bodyModel[35] = new ModelRendererTurbo(this, 14, 33, textureX, textureY); // Box 18
		bodyModel[36] = new ModelRendererTurbo(this, 8, 33, textureX, textureY); // Box 20
		bodyModel[37] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 21
		bodyModel[38] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 21
		bodyModel[39] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 21
		bodyModel[40] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 21
		bodyModel[41] = new ModelRendererTurbo(this, 8, 33, textureX, textureY); // Box 20
		bodyModel[42] = new ModelRendererTurbo(this, 37, 36, textureX, textureY); // Lift motors
		bodyModel[43] = new ModelRendererTurbo(this, 38, 33, textureX, textureY); // Lift motors

		bodyModel[0].addShapeBox(-10F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 2
		bodyModel[0].setRotationPoint(-19.6F, -19F, 0F);
		bodyModel[0].rotateAngleZ = -3.14159265F;

		bodyModel[1].addShapeBox(-13F, 0F, -0.5F, 13, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(-22.4F, -20F, 0F);
		bodyModel[1].rotateAngleZ = -3.12413936F;

		bodyModel[2].addShapeBox(-0.5F, -3F, -1.5F, 1, 3, 3, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Cull arm rotaty
		bodyModel[2].setRotationPoint(-10F, -19F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Head collector
		bodyModel[3].setRotationPoint(-24.5F, -21.99F, 4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Head collector
		bodyModel[4].setRotationPoint(-24.5F, -21.99F, -5F);

		bodyModel[5].addShapeBox(0F, -0.5F, -5F, 15, 1, 10, 0F,0F, 0F, -3.775F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.775F, 0F, 0F, -3.775F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.775F); // Cull top arm
		bodyModel[5].setRotationPoint(-9.5F, -21.5F, 0F);
		bodyModel[5].rotateAngleZ = 3.14159265F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F); // Head collector cull
		bodyModel[6].setRotationPoint(-24.5F, -23F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F); // Box 18
		bodyModel[7].setRotationPoint(-24.75F, -20F, -2.75F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F); // Box 18
		bodyModel[8].setRotationPoint(-24.75F, -20F, 1.75F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 20
		bodyModel[9].setRotationPoint(-19.5F, -20F, -1.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[10].setRotationPoint(-16F, -19F, -2.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[11].setRotationPoint(-16F, -19F, 1.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[12].setRotationPoint(-24F, -19F, -2.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[13].setRotationPoint(-24F, -19F, 1.75F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 20
		bodyModel[14].setRotationPoint(-23F, -20F, -1.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Lift motors
		bodyModel[15].setRotationPoint(-24.5F, -19.25F, -1F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Lift motors
		bodyModel[16].setRotationPoint(-22.5F, -18.75F, -0.5F);

		bodyModel[17].addShapeBox(-6F, -1.5F, 0F, 1, 1, 6, 0F,0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F); // Head collector cull
		bodyModel[17].setRotationPoint(-9.5F, -21.5F, -3F);

		bodyModel[18].addShapeBox(0F, -0.5F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, 0.5F, 0.5F, 0.75F, -0.5F, 0F, 0F, 0F); // Cull top arm
		bodyModel[18].setRotationPoint(-9.5F, -21.5F, 1.2F);
		bodyModel[18].rotateAngleZ = 3.14159265F;

		bodyModel[19].addShapeBox(0F, -0.5F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, 0.5F, 0F, 0F, 0F); // Cull top arm
		bodyModel[19].setRotationPoint(-9.5F, -21.5F, -1.2F);
		bodyModel[19].rotateAngleZ = 3.14159265F;

		bodyModel[20].addShapeBox(5.5F, -0.5F, 0F, 6, 1, 0, 0F,0F, -0.75F, 0F, 0F, 0F, -3.375F, 0F, 0F, 3.375F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, -3.375F, 0F, 0F, 3.375F, 0F, 0.75F, 0F); // Cull top arm
		bodyModel[20].setRotationPoint(-9.5F, -21.5F, 0.699999999999999F);
		bodyModel[20].rotateAngleZ = 3.14159265F;

		bodyModel[21].addShapeBox(5.5F, -0.5F, 0F, 6, 1, 0, 0F,0F, -0.75F, 0F, 0F, 0F, 3.375F, 0F, 0F, -3.375F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 3.375F, 0F, 0F, -3.375F, 0F, 0.75F, 0F); // Cull top arm
		bodyModel[21].setRotationPoint(-9.5F, -21.5F, -0.699999999999999F);
		bodyModel[21].rotateAngleZ = 3.14159265F;

		bodyModel[22].addShapeBox(-10F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 2
		bodyModel[22].setRotationPoint(-30.4F, -19F, 0F);
		bodyModel[22].rotateAngleZ = -0.75049158F;

		bodyModel[23].addShapeBox(-13F, 0F, -0.5F, 13, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 3
		bodyModel[23].setRotationPoint(-27.6F, -20F, 0F);
		bodyModel[23].rotateAngleZ = -0.66322512F;

		bodyModel[24].addShapeBox(-0.5F, -3F, -1.5F, 1, 3, 3, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Cull arm rotaty
		bodyModel[24].setRotationPoint(-37.5F, -25F, 0F);
		bodyModel[24].rotateAngleZ = -0.26179939F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Head collector
		bodyModel[25].setRotationPoint(-27.5F, -38.5F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Head collector
		bodyModel[26].setRotationPoint(-27.5F, -38.5F, 4F);

		bodyModel[27].addShapeBox(0F, -0.5F, -5F, 15, 1, 10, 0F,0F, 0F, -3.775F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.775F, 0F, 0F, -3.775F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.775F); // Cull top arm
		bodyModel[27].setRotationPoint(-37F, -27F, 0F);
		bodyModel[27].rotateAngleZ = 0.83775804F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F); // Head collector cull
		bodyModel[28].setRotationPoint(-27.5F, -39.51F, -5F);

		bodyModel[29].addShapeBox(5F, -1.5F, 0F, 1, 1, 6, 0F,0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F); // Head collector cull
		bodyModel[29].setRotationPoint(-37F, -27F, -3F);
		bodyModel[29].rotateAngleZ = 0.83775804F;

		bodyModel[30].addShapeBox(0F, -0.5F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0.75F, 0.5F, 0.5F, 0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, -0.5F, 0F, 0F, 0F); // Cull top arm
		bodyModel[30].setRotationPoint(-37F, -27F, 1.2F);
		bodyModel[30].rotateAngleZ = 0.83775804F;

		bodyModel[31].addShapeBox(0F, -0.5F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0.5F, 0F, 0F, 0F); // Cull top arm
		bodyModel[31].setRotationPoint(-37F, -27F, -1.2F);
		bodyModel[31].rotateAngleZ = 0.83775804F;

		bodyModel[32].addShapeBox(5.5F, -0.5F, 0F, 6, 1, 0, 0F,0F, 0.75F, 0F, 0F, 0F, -3.375F, 0F, 0F, 3.375F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -3.375F, 0F, 0F, 3.375F, 0F, -0.75F, 0F); // Cull top arm
		bodyModel[32].setRotationPoint(-37F, -27F, 0.7F);
		bodyModel[32].rotateAngleZ = 0.83775804F;

		bodyModel[33].addShapeBox(5.5F, -0.5F, 0F, 6, 1, 0, 0F,0F, 0.75F, 0F, 0F, 0F, 3.375F, 0F, 0F, -3.375F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 3.375F, 0F, 0F, -3.375F, 0F, -0.75F, 0F); // Cull top arm
		bodyModel[33].setRotationPoint(-37F, -27F, -0.7F);
		bodyModel[33].rotateAngleZ = 0.83775804F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F); // Box 18
		bodyModel[34].setRotationPoint(-35.25F, -20F, 1.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F); // Box 18
		bodyModel[35].setRotationPoint(-35.25F, -20F, -2.75F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 20
		bodyModel[36].setRotationPoint(-31.5F, -20F, -1.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[37].setRotationPoint(-35F, -19F, 1.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[38].setRotationPoint(-35F, -19F, -2.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[39].setRotationPoint(-27F, -19F, 1.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[40].setRotationPoint(-27F, -19F, -2.75F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 20
		bodyModel[41].setRotationPoint(-28F, -20F, -1.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Lift motors
		bodyModel[42].setRotationPoint(-28.5F, -19.25F, -1F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Lift motors
		bodyModel[43].setRotationPoint(-30.5F, -18.75F, -0.5F);
	}
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
	}
}