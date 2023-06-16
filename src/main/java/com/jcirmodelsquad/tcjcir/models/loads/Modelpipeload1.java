//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: pipe falling sfx 1
// Model Creator: biba
// Created on: 10.06.2023 - 17:24:09
// Last changed on: 10.06.2023 - 17:24:09

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelpipeload1 extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public Modelpipeload1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[43];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[26] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 30 wood
		bodyModel[27] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 31 wood
		bodyModel[28] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 30 wood
		bodyModel[29] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 31 wood
		bodyModel[30] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 30 wood
		bodyModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 pipe sfx
		bodyModel[38] = new ModelRendererTurbo(this, 25, 8, textureX, textureY, "cull"); // Box 42 rope cull
		bodyModel[39] = new ModelRendererTurbo(this, 25, 8, textureX, textureY, "cull"); // Box 42 rope cull
		bodyModel[40] = new ModelRendererTurbo(this, 25, 8, textureX, textureY, "cull"); // Box 42 rope cull
		bodyModel[41] = new ModelRendererTurbo(this, 25, 8, textureX, textureY, "cull"); // Box 42 rope cull
		bodyModel[42] = new ModelRendererTurbo(this, 25, 8, textureX, textureY, "cull"); // Box 42 rope cull

		bodyModel[0].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[0].setRotationPoint(-30F, 8.5F, -9F);

		bodyModel[1].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[1].setRotationPoint(-29F, 8.5F, -6F);

		bodyModel[2].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[2].setRotationPoint(-28F, 8.5F, -3F);

		bodyModel[3].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[3].setRotationPoint(-29F, 8.5F, 9F);

		bodyModel[4].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[4].setRotationPoint(-31F, 8.5F, 6F);

		bodyModel[5].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[5].setRotationPoint(-26F, 8.5F, 3F);

		bodyModel[6].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[6].setRotationPoint(-29F, 8.5F, 0F);

		bodyModel[7].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[7].setRotationPoint(-28F, 6.5F, -7.5F);
		bodyModel[7].rotateAngleX = 0.78539816F;

		bodyModel[8].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[8].setRotationPoint(-29F, 6.5F, -4.5F);
		bodyModel[8].rotateAngleX = 0.78539816F;

		bodyModel[9].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[9].setRotationPoint(-28F, 6.5F, 7.5F);
		bodyModel[9].rotateAngleX = 0.78539816F;

		bodyModel[10].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[10].setRotationPoint(-29F, 6.5F, 4.5F);
		bodyModel[10].rotateAngleX = 0.78539816F;

		bodyModel[11].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[11].setRotationPoint(-31F, 6.5F, 1.5F);
		bodyModel[11].rotateAngleX = 0.78539816F;

		bodyModel[12].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[12].setRotationPoint(-30F, 6.5F, -1.5F);
		bodyModel[12].rotateAngleX = 0.78539816F;

		bodyModel[13].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[13].setRotationPoint(-29F, 4.5F, -9F);

		bodyModel[14].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[14].setRotationPoint(-29F, 4.5F, -6F);

		bodyModel[15].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[15].setRotationPoint(-28F, 4.5F, -3F);

		bodyModel[16].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[16].setRotationPoint(-29F, 4.5F, 9F);

		bodyModel[17].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[17].setRotationPoint(-31F, 4.5F, 6F);

		bodyModel[18].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[18].setRotationPoint(-28F, 4.5F, 3F);

		bodyModel[19].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[19].setRotationPoint(-29F, 4.5F, 0F);

		bodyModel[20].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[20].setRotationPoint(-29F, 2.5F, -7.5F);
		bodyModel[20].rotateAngleX = 0.78539816F;

		bodyModel[21].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[21].setRotationPoint(-32F, 2.5F, -4.5F);
		bodyModel[21].rotateAngleX = 0.78539816F;

		bodyModel[22].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[22].setRotationPoint(-29F, 2.5F, 7.5F);
		bodyModel[22].rotateAngleX = 0.78539816F;

		bodyModel[23].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[23].setRotationPoint(-30F, 2.5F, 4.5F);
		bodyModel[23].rotateAngleX = 0.78539816F;

		bodyModel[24].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[24].setRotationPoint(-29F, 2.5F, 1.5F);
		bodyModel[24].rotateAngleX = 0.78539816F;

		bodyModel[25].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[25].setRotationPoint(-27F, 2.5F, -1.5F);
		bodyModel[25].rotateAngleX = 0.78539816F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 wood
		bodyModel[26].setRotationPoint(-26F, 9F, -10.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31 wood
		bodyModel[27].setRotationPoint(25F, 9F, -10.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 wood
		bodyModel[28].setRotationPoint(-14F, 9F, -10.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31 wood
		bodyModel[29].setRotationPoint(13F, 9F, -10.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 wood
		bodyModel[30].setRotationPoint(-0.5F, 9F, -10.5F);

		bodyModel[31].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[31].setRotationPoint(-28F, 0.5F, -9F);

		bodyModel[32].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[32].setRotationPoint(-27F, 0.5F, -6F);

		bodyModel[33].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[33].setRotationPoint(-29F, 0.5F, -3F);

		bodyModel[34].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[34].setRotationPoint(-30F, 0.5F, 9F);

		bodyModel[35].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[35].setRotationPoint(-29F, 0.5F, 6F);

		bodyModel[36].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[36].setRotationPoint(-27F, 0.5F, 3F);

		bodyModel[37].addBox(0F, -1F, -1F, 58, 2, 2, 0F); // Box 2 pipe sfx
		bodyModel[37].setRotationPoint(-30F, 0.5F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 11, 21, 0F,-0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F); // Box 42 rope cull
		bodyModel[38].setRotationPoint(-26F, -0.5F, -10.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 11, 21, 0F,-0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F); // Box 42 rope cull
		bodyModel[39].setRotationPoint(-14F, -0.5F, -10.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 11, 21, 0F,-0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F); // Box 42 rope cull
		bodyModel[40].setRotationPoint(25F, -0.5F, -10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 11, 21, 0F,-0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F); // Box 42 rope cull
		bodyModel[41].setRotationPoint(13F, -0.5F, -10.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 11, 21, 0F,-0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F); // Box 42 rope cull
		bodyModel[42].setRotationPoint(-0.5F, -0.5F, -10.5F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 43; i++) {
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