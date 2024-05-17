//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.05.2021 - 23:09:26
// Last changed on: 08.05.2021 - 23:09:26

package com.jcirmodelsquad.tcjcir.models.passengerparts; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBuddDomeUpperSeatsType4 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBuddDomeUpperSeatsType4() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[30];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 501, 79, textureX, textureY); // Seat part
		bodyModel[1] = new ModelRendererTurbo(this, 486, 83, textureX, textureY); // Seat part
		bodyModel[2] = new ModelRendererTurbo(this, 480, 74, textureX, textureY, "cull"); // Seat part cull
		bodyModel[3] = new ModelRendererTurbo(this, 493, 71, textureX, textureY, "cull"); // Seat part cull
		bodyModel[4] = new ModelRendererTurbo(this, 481, 84, textureX, textureY); // Seat part
		bodyModel[5] = new ModelRendererTurbo(this, 501, 60, textureX, textureY); // Seat part
		bodyModel[6] = new ModelRendererTurbo(this, 486, 64, textureX, textureY); // Seat part
		bodyModel[7] = new ModelRendererTurbo(this, 480, 55, textureX, textureY, "cull"); // Seat part cull
		bodyModel[8] = new ModelRendererTurbo(this, 493, 52, textureX, textureY, "cull"); // Seat part cull
		bodyModel[9] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Seat part
		bodyModel[10] = new ModelRendererTurbo(this, 469, 79, textureX, textureY); // Seat part
		bodyModel[11] = new ModelRendererTurbo(this, 454, 83, textureX, textureY); // Seat part
		bodyModel[12] = new ModelRendererTurbo(this, 448, 74, textureX, textureY, "cull"); // Seat part cull
		bodyModel[13] = new ModelRendererTurbo(this, 461, 71, textureX, textureY, "cull"); // Seat part cull
		bodyModel[14] = new ModelRendererTurbo(this, 449, 84, textureX, textureY); // Seat part
		bodyModel[15] = new ModelRendererTurbo(this, 469, 60, textureX, textureY); // Seat part
		bodyModel[16] = new ModelRendererTurbo(this, 454, 64, textureX, textureY); // Seat part
		bodyModel[17] = new ModelRendererTurbo(this, 448, 55, textureX, textureY, "cull"); // Seat part cull
		bodyModel[18] = new ModelRendererTurbo(this, 461, 52, textureX, textureY, "cull"); // Seat part cull
		bodyModel[19] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Seat part
		bodyModel[20] = new ModelRendererTurbo(this, 437, 79, textureX, textureY); // Seat part
		bodyModel[21] = new ModelRendererTurbo(this, 422, 83, textureX, textureY); // Seat part
		bodyModel[22] = new ModelRendererTurbo(this, 416, 74, textureX, textureY, "cull"); // Seat part cull
		bodyModel[23] = new ModelRendererTurbo(this, 429, 71, textureX, textureY, "cull"); // Seat part cull
		bodyModel[24] = new ModelRendererTurbo(this, 417, 84, textureX, textureY); // Seat part
		bodyModel[25] = new ModelRendererTurbo(this, 437, 60, textureX, textureY); // Seat part
		bodyModel[26] = new ModelRendererTurbo(this, 422, 64, textureX, textureY); // Seat part
		bodyModel[27] = new ModelRendererTurbo(this, 416, 55, textureX, textureY, "cull"); // Seat part cull
		bodyModel[28] = new ModelRendererTurbo(this, 429, 52, textureX, textureY, "cull"); // Seat part cull
		bodyModel[29] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Seat part

		bodyModel[0].addShapeBox(-2.5F, 0F, -2F, 1, 3, 4, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[0].setRotationPoint(-2F, -19F, -6F);
		bodyModel[0].rotateAngleY = -3.14159265F;

		bodyModel[1].addShapeBox(-2.5F, 0F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F); // Seat part
		bodyModel[1].setRotationPoint(-2F, -16F, -6F);
		bodyModel[1].rotateAngleY = -3.14159265F;

		bodyModel[2].addShapeBox(-1.5F, 0F, -3F, 3, 2, 6, 0F,0.125F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.125F, 0F, 0F, -0.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.04F, 0F, 0F); // Seat part cull
		bodyModel[2].setRotationPoint(-2F, -17.5F, -6F);
		bodyModel[2].rotateAngleY = -3.14159265F;

		bodyModel[3].addShapeBox(-1.49F, 0F, -3F, 3, 1, 6, 0F,0.125F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.125F, 0F, 0F, 0.04F, 0F, 0F, -0.18F, 0F, 0F, -0.18F, 0F, 0F, 0.04F, 0F, 0F); // Seat part cull
		bodyModel[3].setRotationPoint(-2F, -17.51F, -6F);
		bodyModel[3].rotateAngleY = -3.14159265F;

		bodyModel[4].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Seat part
		bodyModel[4].setRotationPoint(-2F, -15F, -6F);
		bodyModel[4].rotateAngleY = -0.78539816F;

		bodyModel[5].addShapeBox(-2.5F, 0F, -2F, 1, 3, 4, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[5].setRotationPoint(-2F, -19F, 6F);
		bodyModel[5].rotateAngleY = -3.14159265F;

		bodyModel[6].addShapeBox(-2.5F, 0F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F); // Seat part
		bodyModel[6].setRotationPoint(-2F, -16F, 6F);
		bodyModel[6].rotateAngleY = -3.14159265F;

		bodyModel[7].addShapeBox(-1.5F, 0F, -3F, 3, 2, 6, 0F,0.125F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.125F, 0F, 0F, -0.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.04F, 0F, 0F); // Seat part cull
		bodyModel[7].setRotationPoint(-2F, -17.5F, 6F);
		bodyModel[7].rotateAngleY = -3.14159265F;

		bodyModel[8].addShapeBox(-1.49F, 0F, -3F, 3, 1, 6, 0F,0.125F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.125F, 0F, 0F, 0.04F, 0F, 0F, -0.18F, 0F, 0F, -0.18F, 0F, 0F, 0.04F, 0F, 0F); // Seat part cull
		bodyModel[8].setRotationPoint(-2F, -17.51F, 6F);
		bodyModel[8].rotateAngleY = -3.14159265F;

		bodyModel[9].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Seat part
		bodyModel[9].setRotationPoint(-2F, -15F, 6F);
		bodyModel[9].rotateAngleY = -0.78539816F;

		bodyModel[10].addShapeBox(-2.5F, 0F, -2F, 1, 3, 4, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[10].setRotationPoint(-11F, -19F, -6F);
		bodyModel[10].rotateAngleY = -3.14159265F;

		bodyModel[11].addShapeBox(-2.5F, 0F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F); // Seat part
		bodyModel[11].setRotationPoint(-11F, -16F, -6F);
		bodyModel[11].rotateAngleY = -3.14159265F;

		bodyModel[12].addShapeBox(-1.5F, 0F, -3F, 3, 2, 6, 0F,0.125F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.125F, 0F, 0F, -0.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.04F, 0F, 0F); // Seat part cull
		bodyModel[12].setRotationPoint(-11F, -17.5F, -6F);
		bodyModel[12].rotateAngleY = -3.14159265F;

		bodyModel[13].addShapeBox(-1.49F, 0F, -3F, 3, 1, 6, 0F,0.125F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.125F, 0F, 0F, 0.04F, 0F, 0F, -0.18F, 0F, 0F, -0.18F, 0F, 0F, 0.04F, 0F, 0F); // Seat part cull
		bodyModel[13].setRotationPoint(-11F, -17.51F, -6F);
		bodyModel[13].rotateAngleY = -3.14159265F;

		bodyModel[14].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Seat part
		bodyModel[14].setRotationPoint(-11F, -15F, -6F);
		bodyModel[14].rotateAngleY = -0.78539816F;

		bodyModel[15].addShapeBox(-2.5F, 0F, -2F, 1, 3, 4, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[15].setRotationPoint(-11F, -19F, 6F);
		bodyModel[15].rotateAngleY = -3.14159265F;

		bodyModel[16].addShapeBox(-2.5F, 0F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F); // Seat part
		bodyModel[16].setRotationPoint(-11F, -16F, 6F);
		bodyModel[16].rotateAngleY = -3.14159265F;

		bodyModel[17].addShapeBox(-1.5F, 0F, -3F, 3, 2, 6, 0F,0.125F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.125F, 0F, 0F, -0.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.04F, 0F, 0F); // Seat part cull
		bodyModel[17].setRotationPoint(-11F, -17.5F, 6F);
		bodyModel[17].rotateAngleY = -3.14159265F;

		bodyModel[18].addShapeBox(-1.49F, 0F, -3F, 3, 1, 6, 0F,0.125F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.125F, 0F, 0F, 0.04F, 0F, 0F, -0.18F, 0F, 0F, -0.18F, 0F, 0F, 0.04F, 0F, 0F); // Seat part cull
		bodyModel[18].setRotationPoint(-11F, -17.51F, 6F);
		bodyModel[18].rotateAngleY = -3.14159265F;

		bodyModel[19].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Seat part
		bodyModel[19].setRotationPoint(-11F, -15F, 6F);
		bodyModel[19].rotateAngleY = -0.78539816F;

		bodyModel[20].addShapeBox(-2.5F, 0F, -2F, 1, 3, 4, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[20].setRotationPoint(-20F, -19F, -6F);
		bodyModel[20].rotateAngleY = -3.14159265F;

		bodyModel[21].addShapeBox(-2.5F, 0F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F); // Seat part
		bodyModel[21].setRotationPoint(-20F, -16F, -6F);
		bodyModel[21].rotateAngleY = -3.14159265F;

		bodyModel[22].addShapeBox(-1.5F, 0F, -3F, 3, 2, 6, 0F,0.125F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.125F, 0F, 0F, -0.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.04F, 0F, 0F); // Seat part cull
		bodyModel[22].setRotationPoint(-20F, -17.5F, -6F);
		bodyModel[22].rotateAngleY = -3.14159265F;

		bodyModel[23].addShapeBox(-1.49F, 0F, -3F, 3, 1, 6, 0F,0.125F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.125F, 0F, 0F, 0.04F, 0F, 0F, -0.18F, 0F, 0F, -0.18F, 0F, 0F, 0.04F, 0F, 0F); // Seat part cull
		bodyModel[23].setRotationPoint(-20F, -17.51F, -6F);
		bodyModel[23].rotateAngleY = -3.14159265F;

		bodyModel[24].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Seat part
		bodyModel[24].setRotationPoint(-20F, -15F, -6F);
		bodyModel[24].rotateAngleY = -0.78539816F;

		bodyModel[25].addShapeBox(-2.5F, 0F, -2F, 1, 3, 4, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[25].setRotationPoint(-20F, -19F, 6F);
		bodyModel[25].rotateAngleY = -3.14159265F;

		bodyModel[26].addShapeBox(-2.5F, 0F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F); // Seat part
		bodyModel[26].setRotationPoint(-20F, -16F, 6F);
		bodyModel[26].rotateAngleY = -3.14159265F;

		bodyModel[27].addShapeBox(-1.5F, 0F, -3F, 3, 2, 6, 0F,0.125F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.125F, 0F, 0F, -0.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.04F, 0F, 0F); // Seat part cull
		bodyModel[27].setRotationPoint(-20F, -17.5F, 6F);
		bodyModel[27].rotateAngleY = -3.14159265F;

		bodyModel[28].addShapeBox(-1.49F, 0F, -3F, 3, 1, 6, 0F,0.125F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.125F, 0F, 0F, 0.04F, 0F, 0F, -0.18F, 0F, 0F, -0.18F, 0F, 0F, 0.04F, 0F, 0F); // Seat part cull
		bodyModel[28].setRotationPoint(-20F, -17.51F, 6F);
		bodyModel[28].rotateAngleY = -3.14159265F;

		bodyModel[29].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Seat part
		bodyModel[29].setRotationPoint(-20F, -15F, 6F);
		bodyModel[29].rotateAngleY = -0.78539816F;
	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 30; i++) {
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