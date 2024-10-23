//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: propagander
// Model Creator: 
// Created on: 02.04.2023 - 19:07:09
// Last changed on: 02.04.2023 - 19:07:09

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruckEarly;
import com.jcirmodelsquad.tcjcir.models.trucks.Model70Truck;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPropaganda2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelPropaganda2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[44];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 4, 14, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 4, 14, textureX, textureY); // Box 65
		bodyModel[5] = new ModelRendererTurbo(this, 21, 8, textureX, textureY); // Box 76
		bodyModel[6] = new ModelRendererTurbo(this, 211, 39, textureX, textureY); // Box 286
		bodyModel[7] = new ModelRendererTurbo(this, 211, 39, textureX, textureY); // Box 287
		bodyModel[8] = new ModelRendererTurbo(this, 4, 20, textureX, textureY); // Box 73
		bodyModel[9] = new ModelRendererTurbo(this, 4, 20, textureX, textureY); // Box 73
		bodyModel[10] = new ModelRendererTurbo(this, 4, 20, textureX, textureY); // Box 194
		bodyModel[11] = new ModelRendererTurbo(this, 4, 20, textureX, textureY); // Box 195
		bodyModel[12] = new ModelRendererTurbo(this, 208, 53, textureX, textureY); // Box 196
		bodyModel[13] = new ModelRendererTurbo(this, 210, 44, textureX, textureY); // Box 197
		bodyModel[14] = new ModelRendererTurbo(this, 212, 50, textureX, textureY); // Box 199
		bodyModel[15] = new ModelRendererTurbo(this, 212, 50, textureX, textureY); // Box 200
		bodyModel[16] = new ModelRendererTurbo(this, 206, 54, textureX, textureY); // Box 201
		bodyModel[17] = new ModelRendererTurbo(this, 163, 58, textureX, textureY); // Box 202
		bodyModel[18] = new ModelRendererTurbo(this, 179, 60, textureX, textureY); // Box 203
		bodyModel[19] = new ModelRendererTurbo(this, 177, 56, textureX, textureY); // Box 204
		bodyModel[20] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 210
		bodyModel[21] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 211
		bodyModel[22] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 212
		bodyModel[23] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 213
		bodyModel[24] = new ModelRendererTurbo(this, 226, 41, textureX, textureY); // Box 222
		bodyModel[25] = new ModelRendererTurbo(this, 1, 66, textureX, textureY); // Box 89
		bodyModel[26] = new ModelRendererTurbo(this, 1, 157, textureX, textureY); // Box 74
		bodyModel[27] = new ModelRendererTurbo(this, 245, 30, textureX, textureY); // Box 87
		bodyModel[28] = new ModelRendererTurbo(this, 135, 62, textureX, textureY); // Box 125
		bodyModel[29] = new ModelRendererTurbo(this, 210, 59, textureX, textureY); // Box 118
		bodyModel[30] = new ModelRendererTurbo(this, 221, 59, textureX, textureY); // Box 119
		bodyModel[31] = new ModelRendererTurbo(this, 230, 59, textureX, textureY); // Box 129
		bodyModel[32] = new ModelRendererTurbo(this, 231, 37, textureX, textureY); // Box 72
		bodyModel[33] = new ModelRendererTurbo(this, 218, 52, textureX, textureY); // Box 491
		bodyModel[34] = new ModelRendererTurbo(this, 225, 51, textureX, textureY); // Box 93
		bodyModel[35] = new ModelRendererTurbo(this, 232, 52, textureX, textureY); // Box 94
		bodyModel[36] = new ModelRendererTurbo(this, 21, 30, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 21, 32, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 1, 39, textureX, textureY); // Box 80
		bodyModel[39] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 470
		bodyModel[40] = new ModelRendererTurbo(this, 22, 39, textureX, textureY); // Box 700
		bodyModel[41] = new ModelRendererTurbo(this, 22, 46, textureX, textureY); // Box 701
		bodyModel[42] = new ModelRendererTurbo(this, 47, 39, textureX, textureY); // Box 462 kartrak my beloved
		bodyModel[43] = new ModelRendererTurbo(this, 47, 46, textureX, textureY); // Box 481 kartrak my beloved

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-40F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(37F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 1
		bodyModel[2].setRotationPoint(-27F, 5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 74, 2, 4, 0F); // Box 10
		bodyModel[3].setRotationPoint(-37F, 3F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 65
		bodyModel[4].setRotationPoint(23F, 5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 73, 1, 20, 0F); // Box 76
		bodyModel[5].setRotationPoint(-36.5F, 2F, -10F);

		bodyModel[6].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 286
		bodyModel[6].setRotationPoint(2F, 5F, -4F);
		bodyModel[6].rotateAngleX = -0.78539816F;

		bodyModel[7].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 287
		bodyModel[7].setRotationPoint(5F, 5F, -4F);
		bodyModel[7].rotateAngleX = -0.78539816F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[8].setRotationPoint(-26.5F, 3F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[9].setRotationPoint(-26.5F, 3F, 2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[10].setRotationPoint(23.5F, 3F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 195
		bodyModel[11].setRotationPoint(23.5F, 3F, 2F);

		bodyModel[12].addBox(-0.5F, 0F, -0.5F, 1, 0, 5, 0F); // Box 196
		bodyModel[12].setRotationPoint(-3F, 6.01F, 0F);
		bodyModel[12].rotateAngleY = -0.52359878F;

		bodyModel[13].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 197
		bodyModel[13].setRotationPoint(3F, 2.5F, -5F);

		bodyModel[14].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[14].setRotationPoint(-3F, 6.01F, 0F);
		bodyModel[14].rotateAngleY = -0.52359878F;

		bodyModel[15].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 200
		bodyModel[15].setRotationPoint(11F, 6.01F, 0F);
		bodyModel[15].rotateAngleY = -0.26179939F;

		bodyModel[16].addBox(-0.5F, 0F, -2F, 1, 0, 4, 0F); // Box 201
		bodyModel[16].setRotationPoint(11F, 6.01F, 0F);
		bodyModel[16].rotateAngleY = -0.26179939F;

		bodyModel[17].addBox(-20.5F, 0F, 2F, 22, 0, 1, 0F); // Box 202
		bodyModel[17].setRotationPoint(-3F, 6.01F, -0.5F);
		bodyModel[17].rotateAngleY = 0.10471976F;
		bodyModel[17].rotateAngleZ = 0.05235988F;

		bodyModel[18].addBox(0F, 0F, 0F, 14, 0, 1, 0F); // Box 203
		bodyModel[18].setRotationPoint(-3F, 6F, 0F);

		bodyModel[19].addBox(-1F, 0F, -1.5F, 15, 0, 1, 0F); // Box 204
		bodyModel[19].setRotationPoint(11F, 6.01F, -0.5F);
		bodyModel[19].rotateAngleY = 0.17453293F;
		bodyModel[19].rotateAngleZ = -0.05235988F;

		bodyModel[20].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 210
		bodyModel[20].setRotationPoint(-36.5F, 3F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 211
		bodyModel[21].setRotationPoint(-36.5F, 3F, 10F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 212
		bodyModel[22].setRotationPoint(32.5F, 3F, 10F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 213
		bodyModel[23].setRotationPoint(32.5F, 3F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 222
		bodyModel[24].setRotationPoint(-37F, -3F, 3.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 216, 90, 0, 0F,0F, 0F, 0F, -144F, 0F, 0F, -144F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, -144F, -60F, 0F, -144F, -60F, 0F, 0F, -60F, 0F); // Box 89
		bodyModel[25].setRotationPoint(-36F, -29F, 0.05F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 216, 90, 0, 0F,0F, 0F, 0F, -144F, 0F, 0F, -144F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, -144F, -60F, 0F, -144F, -60F, 0F, 0F, -60F, 0F); // Box 74
		bodyModel[26].setRotationPoint(-36F, -29F, -2.05F);

		bodyModel[27].addBox(0F, 0F, 0F, 72, 31, 2, 0F); // Box 87
		bodyModel[27].setRotationPoint(-36F, -29F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 37, 1, 0, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[28].setRotationPoint(-36.25F, 4F, 4F);

		bodyModel[29].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[29].setRotationPoint(2F, 6F, 4F);
		bodyModel[29].rotateAngleX = -0.78539816F;

		bodyModel[30].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[30].setRotationPoint(0F, 6F, 4F);
		bodyModel[30].rotateAngleX = -0.78539816F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 129
		bodyModel[31].setRotationPoint(1.5F, 3F, 3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[32].setRotationPoint(-37.01F, -4.5F, 2F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 491
		bodyModel[33].setRotationPoint(-3F, 3F, -6.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 93
		bodyModel[34].setRotationPoint(-2F, 3F, -6.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 94
		bodyModel[35].setRotationPoint(-1F, 3F, -6.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 55, 1, 0, 0F); // Box 36
		bodyModel[36].setRotationPoint(-27.5F, 3F, -10F);

		bodyModel[37].addBox(0F, 0F, 0F, 55, 1, 0, 0F); // Box 37
		bodyModel[37].setRotationPoint(-27.5F, 3F, 10F);

		bodyModel[38].addBox(0F, 0F, 0F, 10, 2, 0, 0F); // Box 80
		bodyModel[38].setRotationPoint(-38.5F, 4.5F, 0F);
		bodyModel[38].rotateAngleY = 1.36135682F;
		bodyModel[38].rotateAngleZ = 0.05235988F;

		bodyModel[39].addBox(0F, 0F, 0F, 10, 2, 0, 0F); // Box 470
		bodyModel[39].setRotationPoint(38.5F, 4.5F, 0F);
		bodyModel[39].rotateAngleY = 4.50294947F;
		bodyModel[39].rotateAngleZ = 0.05235988F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 12, 6, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 700
		bodyModel[40].setRotationPoint(-17F, 2.5F, 10.01F);
		bodyModel[40].rotateAngleY = -3.14159265F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 12, 6, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 701
		bodyModel[41].setRotationPoint(17F, 2.5F, -10.01F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 462 kartrak my beloved
		bodyModel[42].setRotationPoint(-13F, 2F, 10.01F);
		bodyModel[42].rotateAngleY = -3.14159265F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 481 kartrak my beloved
		bodyModel[43].setRotationPoint(12F, 2F, -10.01F);
	}
	Model70TonTruckEarly bogie2 = new Model70TonTruckEarly();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 44; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==2 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==14){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.55,-0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.55,-0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}