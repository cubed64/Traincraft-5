//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: pipe falling sfx 1
// Model Creator: biba
// Created on: 10.06.2023 - 17:24:09
// Last changed on: 10.06.2023 - 17:24:09

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Model35FootCrate extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public Model35FootCrate() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[32];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 7
		bodyModel[1] = new ModelRendererTurbo(this, 72, 12, textureX, textureY); // Box 9
		bodyModel[2] = new ModelRendererTurbo(this, 72, 12, textureX, textureY); // Box 10
		bodyModel[3] = new ModelRendererTurbo(this, 72, 12, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 72, 12, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 130
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 131
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 132
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 133
		bodyModel[9] = new ModelRendererTurbo(this, 87, 12, textureX, textureY); // Box 134
		bodyModel[10] = new ModelRendererTurbo(this, 87, 12, textureX, textureY); // Box 136
		bodyModel[11] = new ModelRendererTurbo(this, 0, 24, textureX, textureY); // Box 58
		bodyModel[12] = new ModelRendererTurbo(this, 0, 24, textureX, textureY); // Box 59
		bodyModel[13] = new ModelRendererTurbo(this, 0, 24, textureX, textureY); // Box 60
		bodyModel[14] = new ModelRendererTurbo(this, 0, 24, textureX, textureY); // Box 61
		bodyModel[15] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Box 62
		bodyModel[16] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Box 63
		bodyModel[17] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Box 64
		bodyModel[18] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Box 65
		bodyModel[19] = new ModelRendererTurbo(this, 89, 0, textureX, textureY); // Box 66
		bodyModel[20] = new ModelRendererTurbo(this, 89, 0, textureX, textureY); // Box 67
		bodyModel[21] = new ModelRendererTurbo(this, 89, 0, textureX, textureY); // Box 68
		bodyModel[22] = new ModelRendererTurbo(this, 89, 0, textureX, textureY); // Box 69
		bodyModel[23] = new ModelRendererTurbo(this, 0, 24, textureX, textureY); // Box 70
		bodyModel[24] = new ModelRendererTurbo(this, 0, 24, textureX, textureY); // Box 71
		bodyModel[25] = new ModelRendererTurbo(this, 89, 0, textureX, textureY); // Box 72
		bodyModel[26] = new ModelRendererTurbo(this, 89, 0, textureX, textureY); // Box 73
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		bodyModel[28] = new ModelRendererTurbo(this, 87, 12, textureX, textureY); // Box 75
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		bodyModel[30] = new ModelRendererTurbo(this, 0, 24, textureX, textureY); // Box 77
		bodyModel[31] = new ModelRendererTurbo(this, 0, 24, textureX, textureY); // Box 78

		bodyModel[0].addBox(0F, 0F, 0F, 33, 9, 11, 0F); // Box 7
		bodyModel[0].setRotationPoint(-16.5F, -9F, -5.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[1].setRotationPoint(-15.5F, 0F, -8.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[2].setRotationPoint(14.5F, 0F, -8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[3].setRotationPoint(-6.5F, 0F, -8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[4].setRotationPoint(5.5F, 0F, -8.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 130
		bodyModel[5].setRotationPoint(-8.5F, -9.54F, -6.25F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 131
		bodyModel[6].setRotationPoint(8.5F, -9.54F, -6.25F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 132
		bodyModel[7].setRotationPoint(-8.5F, -9.54F, 6.25F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 133
		bodyModel[8].setRotationPoint(8.5F, -9.54F, 6.25F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 134
		bodyModel[9].setRotationPoint(-8.5F, -9.54F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 136
		bodyModel[10].setRotationPoint(8.5F, -9.54F, -6F);

		bodyModel[11].addBox(0F, 0F, 0F, 34, 1, 1, 0F); // Box 58
		bodyModel[11].setRotationPoint(-17F, -9.5F, -6F);

		bodyModel[12].addBox(0F, 0F, 0F, 34, 1, 1, 0F); // Box 59
		bodyModel[12].setRotationPoint(-17F, -9.5F, 5F);

		bodyModel[13].addBox(0F, 0F, 0F, 34, 1, 1, 0F); // Box 60
		bodyModel[13].setRotationPoint(-17F, -0.5F, 5F);

		bodyModel[14].addBox(0F, 0F, 0F, 34, 1, 1, 0F); // Box 61
		bodyModel[14].setRotationPoint(-17F, -0.5F, -6F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 62
		bodyModel[15].setRotationPoint(-17F, -8.5F, 5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 63
		bodyModel[16].setRotationPoint(-17F, -8.5F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 64
		bodyModel[17].setRotationPoint(16F, -8.5F, -6F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 65
		bodyModel[18].setRotationPoint(16F, -8.5F, 5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 66
		bodyModel[19].setRotationPoint(-17F, -9.5F, -5F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 67
		bodyModel[20].setRotationPoint(-17F, -0.5F, -5F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 68
		bodyModel[21].setRotationPoint(16F, -0.5F, -5F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 69
		bodyModel[22].setRotationPoint(16F, -9.5F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[23].setRotationPoint(-16F, -8.5F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 71
		bodyModel[24].setRotationPoint(-16F, -8.5F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F); // Box 72
		bodyModel[25].setRotationPoint(16F, -8.5F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[26].setRotationPoint(-17F, -8.5F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 74
		bodyModel[27].setRotationPoint(-0.5F, -9.54F, -6.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 75
		bodyModel[28].setRotationPoint(-0.5F, -9.54F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 76
		bodyModel[29].setRotationPoint(-0.5F, -9.54F, 6.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 77
		bodyModel[30].setRotationPoint(-16F, -9.5F, 4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F); // Box 78
		bodyModel[31].setRotationPoint(-16F, -0.5F, -5F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 32; i++) {
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