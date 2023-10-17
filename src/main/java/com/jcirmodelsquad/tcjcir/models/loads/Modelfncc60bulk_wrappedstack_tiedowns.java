//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.10.2023 - 00:03:13
// Last changed on: 17.10.2023 - 00:03:13

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelfncc60bulk_wrappedstack_tiedowns extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Modelfncc60bulk_wrappedstack_tiedowns() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[4];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 10, 12, textureX, textureY, "cull"); // Box 344 cull strap
		bodyModel[1] = new ModelRendererTurbo(this, 10, 12, textureX, textureY, "cull"); // Box 344 cull strap
		bodyModel[2] = new ModelRendererTurbo(this, 10, 12, textureX, textureY, "cull"); // Box 344 cull strap
		bodyModel[3] = new ModelRendererTurbo(this, 10, 12, textureX, textureY, "cull"); // Box 344 cull strap

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 21, 19, 0F,0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 344 cull strap
		bodyModel[0].setRotationPoint(-23F, -18F, -9.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 21, 19, 0F,0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 344 cull strap
		bodyModel[1].setRotationPoint(-8F, -18F, -9.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 21, 19, 0F,0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 344 cull strap
		bodyModel[2].setRotationPoint(7F, -18F, -9.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 21, 19, 0F,0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 344 cull strap
		bodyModel[3].setRotationPoint(22F, -18F, -9.5F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 4; i++) {
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