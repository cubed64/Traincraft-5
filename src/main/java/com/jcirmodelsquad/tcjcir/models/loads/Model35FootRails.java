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

public class Model35FootRails extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public Model35FootRails() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[99];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 10
		bodyModel[2] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 14
		bodyModel[6] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 130
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 137
		bodyModel[9] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 141
		bodyModel[13] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 142
		bodyModel[14] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 143
		bodyModel[15] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 144
		bodyModel[16] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 145
		bodyModel[17] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 146
		bodyModel[18] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 147
		bodyModel[19] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 148
		bodyModel[20] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 149
		bodyModel[21] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 150
		bodyModel[22] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 151
		bodyModel[23] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 152
		bodyModel[24] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 153
		bodyModel[25] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 154
		bodyModel[26] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 155
		bodyModel[27] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 156
		bodyModel[28] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 157
		bodyModel[29] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 158
		bodyModel[30] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 159
		bodyModel[31] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 160
		bodyModel[32] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 161
		bodyModel[33] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 162
		bodyModel[34] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 163
		bodyModel[35] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 164
		bodyModel[36] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 165
		bodyModel[37] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 166
		bodyModel[38] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 167
		bodyModel[39] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 168
		bodyModel[40] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 169
		bodyModel[41] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 170
		bodyModel[42] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 171
		bodyModel[43] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 172
		bodyModel[44] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 173
		bodyModel[45] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 174
		bodyModel[46] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 175
		bodyModel[47] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 176
		bodyModel[48] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 177
		bodyModel[49] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 178
		bodyModel[50] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 179
		bodyModel[51] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 180
		bodyModel[52] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 181
		bodyModel[53] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 182
		bodyModel[54] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 183
		bodyModel[55] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 184
		bodyModel[56] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 185
		bodyModel[57] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 186
		bodyModel[58] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 187
		bodyModel[59] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 188
		bodyModel[60] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 189
		bodyModel[61] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 190
		bodyModel[62] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 191
		bodyModel[63] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 192
		bodyModel[64] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 162
		bodyModel[65] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 163
		bodyModel[66] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 164
		bodyModel[67] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 165
		bodyModel[68] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 166
		bodyModel[69] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 167
		bodyModel[70] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 168
		bodyModel[71] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 169
		bodyModel[72] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 170
		bodyModel[73] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 171
		bodyModel[74] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 172
		bodyModel[75] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 173
		bodyModel[76] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 174
		bodyModel[77] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 175
		bodyModel[78] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 176
		bodyModel[79] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 177
		bodyModel[80] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 178
		bodyModel[81] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 179
		bodyModel[82] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 180
		bodyModel[83] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 181
		bodyModel[84] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 182
		bodyModel[85] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 183
		bodyModel[86] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 184
		bodyModel[87] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 185
		bodyModel[88] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 186
		bodyModel[89] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 187
		bodyModel[90] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 188
		bodyModel[91] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 189
		bodyModel[92] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 190
		bodyModel[93] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 191
		bodyModel[94] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 192
		bodyModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 317
		bodyModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 319
		bodyModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 320
		bodyModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 321

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[0].setRotationPoint(-18.5F, 0F, -8.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[1].setRotationPoint(17.5F, 0F, -8.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[2].setRotationPoint(11.5F, 0F, -8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[3].setRotationPoint(-11.5F, 0F, -8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[4].setRotationPoint(-5.5F, 0F, -8.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[5].setRotationPoint(5.5F, 0F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[6].setRotationPoint(0F, 0F, -8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 130
		bodyModel[7].setRotationPoint(-8.5F, -3.5F, -7.4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 0, 15, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 137
		bodyModel[8].setRotationPoint(-8.5F, -3.54F, -7.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 25
		bodyModel[9].setRotationPoint(-20.5F, -1.25F, 6.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 26
		bodyModel[10].setRotationPoint(-20.5F, -0.75F, 6.8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[11].setRotationPoint(-20.5F, -0.5F, 6.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[12].setRotationPoint(-20.5F, -0.5F, 4.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 142
		bodyModel[13].setRotationPoint(-20.5F, -0.75F, 4.8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 143
		bodyModel[14].setRotationPoint(-20.5F, -1.25F, 4.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[15].setRotationPoint(-20.5F, -0.5F, 2.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 145
		bodyModel[16].setRotationPoint(-20.5F, -0.75F, 2.8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 146
		bodyModel[17].setRotationPoint(-20.5F, -1.25F, 2.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[18].setRotationPoint(-20.5F, -0.5F, 0.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 148
		bodyModel[19].setRotationPoint(-20.5F, -0.75F, 0.8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 149
		bodyModel[20].setRotationPoint(-20.5F, -1.25F, 0.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[21].setRotationPoint(-20.5F, -0.5F, -1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 151
		bodyModel[22].setRotationPoint(-20.5F, -0.75F, -1.2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 152
		bodyModel[23].setRotationPoint(-20.5F, -1.25F, -1.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[24].setRotationPoint(-20.5F, -0.5F, -3.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 154
		bodyModel[25].setRotationPoint(-20.5F, -0.75F, -3.2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 155
		bodyModel[26].setRotationPoint(-20.5F, -1.25F, -3.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[27].setRotationPoint(-20.5F, -0.5F, -5.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 157
		bodyModel[28].setRotationPoint(-20.5F, -0.75F, -5.2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 158
		bodyModel[29].setRotationPoint(-20.5F, -1.25F, -5.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[30].setRotationPoint(-20.5F, -0.5F, -7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 160
		bodyModel[31].setRotationPoint(-20.5F, -0.75F, -7.2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 161
		bodyModel[32].setRotationPoint(-20.5F, -1.25F, -7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[33].setRotationPoint(-18.5F, -1.5F, -8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[34].setRotationPoint(17.5F, -1.5F, -8.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[35].setRotationPoint(11.5F, -1.5F, -8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[36].setRotationPoint(-11.5F, -1.5F, -8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[37].setRotationPoint(-5.5F, -1.5F, -8.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[38].setRotationPoint(5.5F, -1.5F, -8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[39].setRotationPoint(0F, -1.5F, -8.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 169
		bodyModel[40].setRotationPoint(-20.5F, -2.75F, 6.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 170
		bodyModel[41].setRotationPoint(-20.5F, -2.25F, 6.8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[42].setRotationPoint(-20.5F, -2F, 6.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[43].setRotationPoint(-20.5F, -2F, 4.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 173
		bodyModel[44].setRotationPoint(-20.5F, -2.25F, 4.8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 174
		bodyModel[45].setRotationPoint(-20.5F, -2.75F, 4.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[46].setRotationPoint(-20.5F, -2F, 2.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 176
		bodyModel[47].setRotationPoint(-20.5F, -2.25F, 2.8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 177
		bodyModel[48].setRotationPoint(-20.5F, -2.75F, 2.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[49].setRotationPoint(-20.5F, -2F, 0.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 179
		bodyModel[50].setRotationPoint(-20.5F, -2.25F, 0.8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 180
		bodyModel[51].setRotationPoint(-20.5F, -2.75F, 0.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[52].setRotationPoint(-20.5F, -2F, -1.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 182
		bodyModel[53].setRotationPoint(-20.5F, -2.25F, -1.2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 183
		bodyModel[54].setRotationPoint(-20.5F, -2.75F, -1.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[55].setRotationPoint(-20.5F, -2F, -3.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 185
		bodyModel[56].setRotationPoint(-20.5F, -2.25F, -3.2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 186
		bodyModel[57].setRotationPoint(-20.5F, -2.75F, -3.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[58].setRotationPoint(-20.5F, -2F, -5.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 188
		bodyModel[59].setRotationPoint(-20.5F, -2.25F, -5.2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 189
		bodyModel[60].setRotationPoint(-20.5F, -2.75F, -5.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[61].setRotationPoint(-20.5F, -2F, -7.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 191
		bodyModel[62].setRotationPoint(-20.5F, -2.25F, -7.2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 192
		bodyModel[63].setRotationPoint(-20.5F, -2.75F, -7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[64].setRotationPoint(-18.5F, -3F, -8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[65].setRotationPoint(17.5F, -3F, -8.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[66].setRotationPoint(11.5F, -3F, -8.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[67].setRotationPoint(-11.5F, -3F, -8.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[68].setRotationPoint(-5.5F, -3F, -8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[69].setRotationPoint(5.5F, -3F, -8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[70].setRotationPoint(0F, -3F, -8.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 169
		bodyModel[71].setRotationPoint(-20.5F, -4.25F, 6.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 170
		bodyModel[72].setRotationPoint(-20.5F, -3.75F, 6.8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[73].setRotationPoint(-20.5F, -3.5F, 6.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[74].setRotationPoint(-20.5F, -3.5F, 4.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 173
		bodyModel[75].setRotationPoint(-20.5F, -3.75F, 4.8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 174
		bodyModel[76].setRotationPoint(-20.5F, -4.25F, 4.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[77].setRotationPoint(-20.5F, -3.5F, 2.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 176
		bodyModel[78].setRotationPoint(-20.5F, -3.75F, 2.8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 177
		bodyModel[79].setRotationPoint(-20.5F, -4.25F, 2.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[80].setRotationPoint(-20.5F, -3.5F, 0.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 179
		bodyModel[81].setRotationPoint(-20.5F, -3.75F, 0.8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 180
		bodyModel[82].setRotationPoint(-20.5F, -4.25F, 0.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[83].setRotationPoint(-20.5F, -3.5F, -1.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 182
		bodyModel[84].setRotationPoint(-20.5F, -3.75F, -1.2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 183
		bodyModel[85].setRotationPoint(-20.5F, -4.25F, -1.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[86].setRotationPoint(-20.5F, -3.5F, -3.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 185
		bodyModel[87].setRotationPoint(-20.5F, -3.75F, -3.2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 186
		bodyModel[88].setRotationPoint(-20.5F, -4.25F, -3.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[89].setRotationPoint(-20.5F, -3.5F, -5.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 188
		bodyModel[90].setRotationPoint(-20.5F, -3.75F, -5.2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 189
		bodyModel[91].setRotationPoint(-20.5F, -4.25F, -5.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[92].setRotationPoint(-20.5F, -3.5F, -7.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 191
		bodyModel[93].setRotationPoint(-20.5F, -3.75F, -7.2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 192
		bodyModel[94].setRotationPoint(-20.5F, -4.25F, -7.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 317
		bodyModel[95].setRotationPoint(-8.5F, -3.5F, 7.4F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 319
		bodyModel[96].setRotationPoint(8.5F, -3.5F, 7.4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 0, 15, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 320
		bodyModel[97].setRotationPoint(8.5F, -3.54F, -7.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 321
		bodyModel[98].setRotationPoint(8.5F, -3.5F, -7.4F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 99; i++) {
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