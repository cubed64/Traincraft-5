package com.jcirmodelsquad.tcjcir.models.trains;//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: YourClassName
// Model Creator:
// Created on:11.06.2018 - 16:48:22
// Last changed on: 11.06.2018 - 16:48:22

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelAdvancedHST extends ModelConverter
{
	int textureX = 256;
	int textureY = 256;

	public ModelAdvancedHST()
	{
		advancedhstModel = new ModelRendererTurbo[65];
		advancedhstModel[0] = new ModelRendererTurbo(this, 63, 158, textureX, textureY); // Import
		advancedhstModel[1] = new ModelRendererTurbo(this, 98, 122, textureX, textureY); // Import
		advancedhstModel[2] = new ModelRendererTurbo(this, 38, 158, textureX, textureY); // Import
		advancedhstModel[3] = new ModelRendererTurbo(this, 7, 160, textureX, textureY); // Import
		advancedhstModel[4] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import
		advancedhstModel[5] = new ModelRendererTurbo(this, 1, 61, textureX, textureY); // Import
		advancedhstModel[6] = new ModelRendererTurbo(this, 62, 93, textureX, textureY); // Import
		advancedhstModel[7] = new ModelRendererTurbo(this, 2, 96, textureX, textureY); // Import
		advancedhstModel[8] = new ModelRendererTurbo(this, 199, 144, textureX, textureY); // Import
		advancedhstModel[9] = new ModelRendererTurbo(this, 103, 86, textureX, textureY); // Import
		advancedhstModel[10] = new ModelRendererTurbo(this, 36, 93, textureX, textureY); // Import
		advancedhstModel[11] = new ModelRendererTurbo(this, 234, 2, textureX, textureY); // Import
		advancedhstModel[12] = new ModelRendererTurbo(this, 117, 66, textureX, textureY); // Import
		advancedhstModel[13] = new ModelRendererTurbo(this, 213, 33, textureX, textureY); // Import
		advancedhstModel[14] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Import
		advancedhstModel[15] = new ModelRendererTurbo(this, 0, 43, textureX, textureY); // Import
		advancedhstModel[16] = new ModelRendererTurbo(this, 162, 22, textureX, textureY); // Import
		advancedhstModel[17] = new ModelRendererTurbo(this, 228, 152, textureX, textureY); // Import
		advancedhstModel[18] = new ModelRendererTurbo(this, 217, 5, textureX, textureY); // Import
		advancedhstModel[19] = new ModelRendererTurbo(this, 219, 16, textureX, textureY); // Import
		advancedhstModel[20] = new ModelRendererTurbo(this, 209, 131, textureX, textureY); // Import
		advancedhstModel[21] = new ModelRendererTurbo(this, 233, 131, textureX, textureY); // Import
		advancedhstModel[22] = new ModelRendererTurbo(this, 200, 152, textureX, textureY); // Import
		advancedhstModel[23] = new ModelRendererTurbo(this, 149, 122, textureX, textureY); // Import
		advancedhstModel[24] = new ModelRendererTurbo(this, 16, 96, textureX, textureY); // Import
		advancedhstModel[25] = new ModelRendererTurbo(this, 110, 67, textureX, textureY); // Import
		advancedhstModel[26] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Import
		advancedhstModel[27] = new ModelRendererTurbo(this, 158, 82, textureX, textureY); // Import
		advancedhstModel[28] = new ModelRendererTurbo(this, 187, 84, textureX, textureY); // Import
		advancedhstModel[29] = new ModelRendererTurbo(this, 181, 141, textureX, textureY); // Import
		advancedhstModel[30] = new ModelRendererTurbo(this, 181, 133, textureX, textureY); // Import
		advancedhstModel[31] = new ModelRendererTurbo(this, 173, 104, textureX, textureY); // Import
		advancedhstModel[32] = new ModelRendererTurbo(this, 142, 62, textureX, textureY); // Import
		advancedhstModel[33] = new ModelRendererTurbo(this, 123, 3, textureX, textureY); // Import
		advancedhstModel[34] = new ModelRendererTurbo(this, 158, 109, textureX, textureY); // Import
		advancedhstModel[35] = new ModelRendererTurbo(this, 200, 103, textureX, textureY); // Import
		advancedhstModel[36] = new ModelRendererTurbo(this, 201, 122, textureX, textureY); // Import
		advancedhstModel[37] = new ModelRendererTurbo(this, 201, 122, textureX, textureY); // Import
		advancedhstModel[38] = new ModelRendererTurbo(this, 34, 38, textureX, textureY); // Import
		advancedhstModel[39] = new ModelRendererTurbo(this, 0, 48, textureX, textureY); // Import
		advancedhstModel[40] = new ModelRendererTurbo(this, 0, 52, textureX, textureY); // Import
		advancedhstModel[41] = new ModelRendererTurbo(this, 118, 29, textureX, textureY); // Import
		advancedhstModel[42] = new ModelRendererTurbo(this, 104, 2, textureX, textureY); // Import
		advancedhstModel[43] = new ModelRendererTurbo(this, 107, 6, textureX, textureY); // Import
		advancedhstModel[44] = new ModelRendererTurbo(this, 107, 6, textureX, textureY); // Import
		advancedhstModel[45] = new ModelRendererTurbo(this, 88, 2, textureX, textureY); // Import
		advancedhstModel[46] = new ModelRendererTurbo(this, 199, 137, textureX, textureY); // Import
		advancedhstModel[47] = new ModelRendererTurbo(this, 242, 78, textureX, textureY); // Import
		advancedhstModel[48] = new ModelRendererTurbo(this, 219, 70, textureX, textureY); // Import
		advancedhstModel[49] = new ModelRendererTurbo(this, 219, 70, textureX, textureY); // Import
		advancedhstModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import
		advancedhstModel[51] = new ModelRendererTurbo(this, 201, 37, textureX, textureY); // Import
		advancedhstModel[52] = new ModelRendererTurbo(this, 248, 86, textureX, textureY); // Import
		advancedhstModel[53] = new ModelRendererTurbo(this, 248, 86, textureX, textureY); // Import
		advancedhstModel[54] = new ModelRendererTurbo(this, 216, 85, textureX, textureY); // Import
		advancedhstModel[55] = new ModelRendererTurbo(this, 63, 38, textureX, textureY); // Import
		advancedhstModel[56] = new ModelRendererTurbo(this, 212, 96, textureX, textureY); // Import
		advancedhstModel[57] = new ModelRendererTurbo(this, 242, 78, textureX, textureY); // Import
		advancedhstModel[58] = new ModelRendererTurbo(this, 85, 42, textureX, textureY); // Import
		advancedhstModel[59] = new ModelRendererTurbo(this, 0, 126, textureX, textureY); // Import
		advancedhstModel[60] = new ModelRendererTurbo(this, 21, 160, textureX, textureY); // Import
		advancedhstModel[61] = new ModelRendererTurbo(this, 0, 147, textureX, textureY); // Box 63
		advancedhstModel[62] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Box 62
		advancedhstModel[63] = new ModelRendererTurbo(this, 16, 96, textureX, textureY); // Box 63
		advancedhstModel[64] = new ModelRendererTurbo(this, 1, 61, textureX, textureY); // Box 64

		advancedhstModel[0].addBox(0F, 0F, 0F, 15, 18, 2, 0F); // Import
		advancedhstModel[0].setRotationPoint(-12F, -30F, 11F);
		advancedhstModel[0].rotateAngleY = 3.28121899F;

		advancedhstModel[1].addBox(0F, -5F, -1F, 24, 5, 1, 0F); // Import
		advancedhstModel[1].setRotationPoint(-12F, -30F, 11F);
		advancedhstModel[1].rotateAngleX = -5.95157275F;

		advancedhstModel[2].addBox(0F, 0F, -2F, 10, 18, 2, 0F); // Import
		advancedhstModel[2].setRotationPoint(-36F, -30F, 5F);
		advancedhstModel[2].rotateAngleY = 0.40142573F;

		advancedhstModel[3].addBox(0F, -5F, -1F, 5, 5, 1, 0F); // Import
		advancedhstModel[3].setRotationPoint(-36F, -30F, 5F);
		advancedhstModel[3].rotateAngleX = -5.95157275F;
		advancedhstModel[3].rotateAngleY = 0.40142573F;

		advancedhstModel[4].addBox(0F, 0F, 0F, 46, 18, 2, 0F); // Import
		advancedhstModel[4].setRotationPoint(-12F, -30F, -11F);

		advancedhstModel[5].addBox(0F, 0F, -2F, 37, 8, 2, 0F); // Import
		advancedhstModel[5].setRotationPoint(34F, -12F, -11F);
		advancedhstModel[5].rotateAngleX = -0.2268928F;
		advancedhstModel[5].rotateAngleY = -3.14159265F;

		advancedhstModel[6].addBox(0F, 0F, -2F, 15, 18, 2, 0F); // Import
		advancedhstModel[6].setRotationPoint(-12F, -30F, -11F);
		advancedhstModel[6].rotateAngleY = 3.00196631F;

		advancedhstModel[7].addBox(0F, -5F, 0F, 5, 5, 1, 0F); // Import
		advancedhstModel[7].setRotationPoint(-36F, -30F, -5F);
		advancedhstModel[7].rotateAngleX = -0.33161256F;
		advancedhstModel[7].rotateAngleY = 5.88175958F;

		advancedhstModel[8].addBox(0F, 0F, -1F, 3, 5, 1, 0F); // Import
		advancedhstModel[8].setRotationPoint(-2F, -10F, -9F);
		advancedhstModel[8].rotateAngleX = -0.19198622F;
		advancedhstModel[8].rotateAngleY = -3.14159265F;

		advancedhstModel[9].addBox(0F, 0F, 0F, 17, 5, 16, 0F); // Import
		advancedhstModel[9].setRotationPoint(-9F, -35F, -8F);

		advancedhstModel[10].addBox(0F, 0F, 0F, 10, 18, 2, 0F); // Import
		advancedhstModel[10].setRotationPoint(-36F, -30F, -5F);
		advancedhstModel[10].rotateAngleY = 5.88175958F;

		advancedhstModel[11].addBox(0F, 1F, 0F, 2, 19, 8, 0F); // Import
		advancedhstModel[11].setRotationPoint(-35F, -33F, -4F);

		advancedhstModel[12].addBox(0F, -2F, 0F, 3, 2, 16, 0F); // Import
		advancedhstModel[12].setRotationPoint(-1F, -4F, 8F);
		advancedhstModel[12].rotateAngleY = -3.14159265F;

		advancedhstModel[13].addBox(0F, 0F, 0F, 5, 2, 16, 0F); // Import
		advancedhstModel[13].setRotationPoint(-33F, -27F, -8F);

		advancedhstModel[14].addBox(0F, -2F, -3F, 19, 2, 2, 0F); // Import
		advancedhstModel[14].setRotationPoint(-28F, -12F, -4F);
		advancedhstModel[14].rotateAngleY = 6.23082543F;
		advancedhstModel[14].rotateAngleZ = 5.88175958F;

		advancedhstModel[15].addBox(0F, -2F, 1F, 19, 2, 2, 0F); // Import
		advancedhstModel[15].setRotationPoint(-28F, -12F, 4F);
		advancedhstModel[15].rotateAngleY = 0.05235988F;
		advancedhstModel[15].rotateAngleZ = 5.88175958F;

		advancedhstModel[16].addBox(-12F, -2F, 0F, 12, 2, 12, 0F); // Import
		advancedhstModel[16].setRotationPoint(-34F, -13F, 6F);
		advancedhstModel[16].rotateAngleY = 3.14159265F;
		advancedhstModel[16].rotateAngleZ = 0.29670597F;

		advancedhstModel[17].addBox(0F, 0F, -2F, 12, 18, 1, 0F); // Import
		advancedhstModel[17].setRotationPoint(-12F, -28F, -10F);
		advancedhstModel[17].rotateAngleY = 3.00196631F;

		advancedhstModel[18].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Import
		advancedhstModel[18].setRotationPoint(-36F, -18F, -2F);

		advancedhstModel[19].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import
		advancedhstModel[19].setRotationPoint(-36F, -21F, -1F);

		advancedhstModel[20].addBox(0F, 0F, 0F, 10, 18, 1, 0F); // Import
		advancedhstModel[20].setRotationPoint(-12F, -28F, -9F);

		advancedhstModel[21].addBox(0F, 0F, 0F, 10, 18, 1, 0F); // Import
		advancedhstModel[21].setRotationPoint(-12F, -28F, 8F);

		advancedhstModel[22].addBox(0F, 0F, 0F, 12, 18, 1, 0F); // Import
		advancedhstModel[22].setRotationPoint(-12F, -28F, 9F);
		advancedhstModel[22].rotateAngleY = 3.28121899F;

		advancedhstModel[23].addBox(0F, -5F, 0F, 24, 5, 1, 0F); // Import
		advancedhstModel[23].setRotationPoint(-12F, -30F, -11F);
		advancedhstModel[23].rotateAngleX = -0.33161256F;

		advancedhstModel[24].addBox(0F, -5F, 0F, 4, 5, 1, 0F); // Import
		advancedhstModel[24].setRotationPoint(30F, -30F, -11F);
		advancedhstModel[24].rotateAngleX = -0.33161256F;

		advancedhstModel[25].addBox(0F, -3F, 0F, 1, 3, 8, 0F); // Import
		advancedhstModel[25].setRotationPoint(-35F, -32F, -4F);
		advancedhstModel[25].rotateAngleX = -6.28318531F;
		advancedhstModel[25].rotateAngleZ = 5.63741348F;

		advancedhstModel[26].addBox(0F, 0F, 0F, 1, 20, 18, 0F); // Import
		advancedhstModel[26].setRotationPoint(-2F, -26F, -9F);

		advancedhstModel[27].addBox(0F, -2F, 0F, 6, 1, 14, 0F); // Import
		advancedhstModel[27].setRotationPoint(-17F, -9F, 7F);
		advancedhstModel[27].rotateAngleY = 3.14159265F;
		advancedhstModel[27].rotateAngleZ = 0.06981317F;

		advancedhstModel[28].addBox(0F, -4F, 0F, 1, 4, 14, 0F); // Import
		advancedhstModel[28].setRotationPoint(-17F, -11F, 7F);
		advancedhstModel[28].rotateAngleY = 3.14159265F;
		advancedhstModel[28].rotateAngleZ = 0.2268928F;

		advancedhstModel[29].addBox(2F, 0F, -1F, 5, 6, 1, 0F); // Import
		advancedhstModel[29].setRotationPoint(-12F, -14F, -8F);
		advancedhstModel[29].rotateAngleY = 3.00196631F;

		advancedhstModel[30].addBox(2F, 0F, 0F, 5, 6, 1, 0F); // Import
		advancedhstModel[30].setRotationPoint(-12F, -14F, 8F);
		advancedhstModel[30].rotateAngleY = 3.28121899F;

		advancedhstModel[31].addBox(0F, 0F, 0F, 5, 1, 16, 0F); // Import
		advancedhstModel[31].setRotationPoint(-14F, -15F, 8F);
		advancedhstModel[31].rotateAngleY = 3.14159265F;
		advancedhstModel[31].rotateAngleZ = 6.12610567F;

		advancedhstModel[32].addBox(0F, -2F, 0F, 21, 2, 16, 0F); // Import
		advancedhstModel[32].setRotationPoint(-2F, -22F, 8F);
		advancedhstModel[32].rotateAngleY = -3.14159265F;

		advancedhstModel[33].addBox(0F, 0F, 0F, 1, 9, 16, 0F); // Import
		advancedhstModel[33].setRotationPoint(-17F, -22F, 8F);
		advancedhstModel[33].rotateAngleY = -3.14159265F;

		advancedhstModel[34].addBox(0F, -2F, 0F, 7, 2, 8, 0F); // Import
		advancedhstModel[34].setRotationPoint(-3F, -18F, 4F);
		advancedhstModel[34].rotateAngleY = -3.14159265F;

		advancedhstModel[35].addBox(-2F, 0F, 0F, 2, 10, 6, 0F); // Import
		advancedhstModel[35].setRotationPoint(-5F, -19F, 3F);
		advancedhstModel[35].rotateAngleY = 3.14159265F;
		advancedhstModel[35].rotateAngleZ = 6.16101226F;

		advancedhstModel[36].addBox(0F, -2F, 0F, 6, 2, 1, 0F); // Import
		advancedhstModel[36].setRotationPoint(-3F, -14F, 4F);
		advancedhstModel[36].rotateAngleY = -3.14159265F;

		advancedhstModel[37].addBox(0F, -2F, 0F, 6, 2, 1, 0F); // Import
		advancedhstModel[37].setRotationPoint(-3F, -14F, -3F);
		advancedhstModel[37].rotateAngleY = -3.14159265F;

		advancedhstModel[38].addBox(0F, -1F, 0F, 7, 1, 16, 0F); // Import
		advancedhstModel[38].setRotationPoint(-4F, -4F, 8F);
		advancedhstModel[38].rotateAngleY = 3.14159265F;
		advancedhstModel[38].rotateAngleZ = 0.08726646F;

		advancedhstModel[39].addBox(0F, -2F, 0F, 7, 1, 2, 0F); // Import
		advancedhstModel[39].setRotationPoint(-4F, -4F, 8F);
		advancedhstModel[39].rotateAngleY = -3.14159265F;
		advancedhstModel[39].rotateAngleZ = 0.08726646F;

		advancedhstModel[40].addBox(0F, -2F, 0F, 7, 1, 2, 0F); // Import
		advancedhstModel[40].setRotationPoint(-4F, -4F, -6F);
		advancedhstModel[40].rotateAngleY = -3.14159265F;
		advancedhstModel[40].rotateAngleZ = 0.08726646F;

		advancedhstModel[41].addBox(0F, 0F, 0F, 10, 2, 6, 0F); // Import
		advancedhstModel[41].setRotationPoint(14F, -8F, -3F);

		advancedhstModel[42].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Import
		advancedhstModel[42].setRotationPoint(25F, 2F, 1F);
		advancedhstModel[42].rotateAngleY = -3.14159265F;
		advancedhstModel[42].rotateAngleZ = 0.34906585F;

		advancedhstModel[43].addBox(0F, 0F, -1F, 10, 1, 1, 0F); // Import
		advancedhstModel[43].setRotationPoint(22F, -7F, 1F);
		advancedhstModel[43].rotateAngleY = -3.14159265F;
		advancedhstModel[43].rotateAngleZ = -0.52359878F;

		advancedhstModel[44].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Import
		advancedhstModel[44].setRotationPoint(22F, -7F, -1F);
		advancedhstModel[44].rotateAngleY = -3.14159265F;
		advancedhstModel[44].rotateAngleZ = -0.52359878F;

		advancedhstModel[45].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Import
		advancedhstModel[45].setRotationPoint(24F, 2F, -6F);

		advancedhstModel[46].addBox(0F, 0F, -1F, 3, 5, 1, 0F); // Import
		advancedhstModel[46].setRotationPoint(-5F, -10F, 9F);
		advancedhstModel[46].rotateAngleX = -0.19198622F;

		advancedhstModel[47].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Import
		advancedhstModel[47].setRotationPoint(-37F, -30F, -2F);

		advancedhstModel[48].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Import
		advancedhstModel[48].setRotationPoint(1F, -7F, -6F);

		advancedhstModel[49].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Import
		advancedhstModel[49].setRotationPoint(6F, -7F, -6F);

		advancedhstModel[50].addBox(0F, 0F, 0F, 35, 19, 18, 0F); // Import
		advancedhstModel[50].setRotationPoint(9F, -26F, -9F);

		advancedhstModel[51].addBox(0F, 0F, 0F, 7, 2, 6, 0F); // Import
		advancedhstModel[51].setRotationPoint(25F, -7F, -1F);

		advancedhstModel[52].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Import
		advancedhstModel[52].setRotationPoint(44F, -26F, -5F);

		advancedhstModel[53].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Import
		advancedhstModel[53].setRotationPoint(44F, -26F, 3F);

		advancedhstModel[54].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Import
		advancedhstModel[54].setRotationPoint(44F, -10F, -4F);

		advancedhstModel[55].addBox(0F, 0F, 0F, 55, 4, 18, 0F); // Import
		advancedhstModel[55].setRotationPoint(-11F, -30F, -9F);

		advancedhstModel[56].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Import
		advancedhstModel[56].setRotationPoint(44F, -27F, -4F);

		advancedhstModel[57].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Import
		advancedhstModel[57].setRotationPoint(44F, -30F, -2F);

		advancedhstModel[58].addBox(0F, 0F, 0F, 9, 3, 14, 0F); // Import
		advancedhstModel[58].setRotationPoint(-30F, -30F, -7F);

		advancedhstModel[59].addBox(0F, 0F, 0F, 46, 18, 2, 0F); // Import
		advancedhstModel[59].setRotationPoint(-12F, -30F, 9F);

		advancedhstModel[60].addBox(0F, -5F, -1F, 4, 5, 1, 0F); // Import
		advancedhstModel[60].setRotationPoint(30F, -30F, 11F);
		advancedhstModel[60].rotateAngleX = 0.33161256F;

		advancedhstModel[61].addBox(0F, 0F, -2F, 37, 8, 2, 0F); // Box 63
		advancedhstModel[61].setRotationPoint(-3F, -12F, 11F);
		advancedhstModel[61].rotateAngleX = -0.2268928F;

		advancedhstModel[62].addBox(0F, 0F, 0F, 10, 18, 2, 0F); // Box 62
		advancedhstModel[62].setRotationPoint(34F, -30F, -11F);

		advancedhstModel[63].addBox(0F, -5F, 0F, 10, 5, 1, 0F); // Box 63
		advancedhstModel[63].setRotationPoint(34F, -30F, -11F);
		advancedhstModel[63].rotateAngleX = -0.33161256F;

		advancedhstModel[64].addBox(0F, 0F, -2F, 10, 8, 2, 0F); // Box 64
		advancedhstModel[64].setRotationPoint(44F, -12F, -11F);
		advancedhstModel[64].rotateAngleX = -0.2268928F;
		advancedhstModel[64].rotateAngleY = -3.14159265F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 65; i++)
		{
			advancedhstModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo advancedhstModel[];
}