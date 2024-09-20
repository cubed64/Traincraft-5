//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PS2_4750
// Model Creator: Bida & Binky
// Created on: 10.02.2022 - 17:41:44
// Last changed on: 10.02.2022 - 17:41:44

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelPS2_4750 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelPS2_4750() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[189];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 186, 95, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 448, 96, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 203, 104, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 427, 105, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 195, 97, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 419, 98, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 260, 81, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 178, 47, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 258, 105, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 228, 101, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 254, 101, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 259, 119, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 259, 101, textureX, textureY); // Box 22
		bodyModel[13] = new ModelRendererTurbo(this, 254, 119, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 257, 107, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 257, 114, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 258, 112, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 263, 1, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 201, 37, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 251, 21, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 247, 1, textureX, textureY); // Box 30 cull
		bodyModel[21] = new ModelRendererTurbo(this, 242, 17, textureX, textureY); // Box 32
		bodyModel[22] = new ModelRendererTurbo(this, 200, 2, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 247, 58, textureX, textureY); // Box 35 cull
		bodyModel[24] = new ModelRendererTurbo(this, 258, 58, textureX, textureY); // Box 37 cull
		bodyModel[25] = new ModelRendererTurbo(this, 264, 27, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 242, 74, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 251, 78, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 264, 25, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 258, 1, textureX, textureY); // Box 43 cull
		bodyModel[30] = new ModelRendererTurbo(this, 426, 3, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 384, 2, textureX, textureY); // Box 46
		bodyModel[32] = new ModelRendererTurbo(this, 263, 58, textureX, textureY); // Box 47
		bodyModel[33] = new ModelRendererTurbo(this, 486, 3, textureX, textureY); // Box 48
		bodyModel[34] = new ModelRendererTurbo(this, 431, 3, textureX, textureY); // Box 49
		bodyModel[35] = new ModelRendererTurbo(this, 436, 3, textureX, textureY); // Box 50
		bodyModel[36] = new ModelRendererTurbo(this, 441, 3, textureX, textureY); // Box 51
		bodyModel[37] = new ModelRendererTurbo(this, 446, 3, textureX, textureY); // Box 52
		bodyModel[38] = new ModelRendererTurbo(this, 451, 3, textureX, textureY); // Box 53
		bodyModel[39] = new ModelRendererTurbo(this, 481, 3, textureX, textureY); // Box 54
		bodyModel[40] = new ModelRendererTurbo(this, 476, 3, textureX, textureY); // Box 55
		bodyModel[41] = new ModelRendererTurbo(this, 471, 3, textureX, textureY); // Box 56
		bodyModel[42] = new ModelRendererTurbo(this, 466, 3, textureX, textureY); // Box 57
		bodyModel[43] = new ModelRendererTurbo(this, 461, 3, textureX, textureY); // Box 58
		bodyModel[44] = new ModelRendererTurbo(this, 120, 128, textureX, textureY); // Box 51
		bodyModel[45] = new ModelRendererTurbo(this, 143, 128, textureX, textureY); // Box 83
		bodyModel[46] = new ModelRendererTurbo(this, 170, 128, textureX, textureY); // Box 84
		bodyModel[47] = new ModelRendererTurbo(this, 170, 96, textureX, textureY); // Box 85
		bodyModel[48] = new ModelRendererTurbo(this, 120, 96, textureX, textureY); // Box 86
		bodyModel[49] = new ModelRendererTurbo(this, 143, 96, textureX, textureY); // Box 87
		bodyModel[50] = new ModelRendererTurbo(this, 224, 80, textureX, textureY); // Box 73
		bodyModel[51] = new ModelRendererTurbo(this, 260, 97, textureX, textureY); // Box 74
		bodyModel[52] = new ModelRendererTurbo(this, 389, 1, textureX, textureY); // Box 30 cull
		bodyModel[53] = new ModelRendererTurbo(this, 389, 58, textureX, textureY); // Box 35 cull
		bodyModel[54] = new ModelRendererTurbo(this, 384, 58, textureX, textureY); // Box 37 cull
		bodyModel[55] = new ModelRendererTurbo(this, 384, 1, textureX, textureY); // Box 43 cull
		bodyModel[56] = new ModelRendererTurbo(this, 404, 37, textureX, textureY); // Box 82
		bodyModel[57] = new ModelRendererTurbo(this, 368, 80, textureX, textureY); // Box 83
		bodyModel[58] = new ModelRendererTurbo(this, 388, 101, textureX, textureY); // Box 84
		bodyModel[59] = new ModelRendererTurbo(this, 372, 101, textureX, textureY); // Box 85
		bodyModel[60] = new ModelRendererTurbo(this, 385, 101, textureX, textureY); // Box 86
		bodyModel[61] = new ModelRendererTurbo(this, 385, 119, textureX, textureY); // Box 87
		bodyModel[62] = new ModelRendererTurbo(this, 388, 119, textureX, textureY); // Box 88
		bodyModel[63] = new ModelRendererTurbo(this, 384, 74, textureX, textureY); // Box 89
		bodyModel[64] = new ModelRendererTurbo(this, 368, 112, textureX, textureY); // Box 90
		bodyModel[65] = new ModelRendererTurbo(this, 367, 114, textureX, textureY); // Box 91
		bodyModel[66] = new ModelRendererTurbo(this, 384, 17, textureX, textureY); // Box 92
		bodyModel[67] = new ModelRendererTurbo(this, 367, 107, textureX, textureY); // Box 93
		bodyModel[68] = new ModelRendererTurbo(this, 368, 105, textureX, textureY); // Box 94
		bodyModel[69] = new ModelRendererTurbo(this, 427, 47, textureX, textureY); // Box 95
		bodyModel[70] = new ModelRendererTurbo(this, 182, 79, textureX, textureY); // Box 96 crossover cull
		bodyModel[71] = new ModelRendererTurbo(this, 433, 79, textureX, textureY); // Box 97 crossover cull
		bodyModel[72] = new ModelRendererTurbo(this, 362, 25, textureX, textureY); // Box 98
		bodyModel[73] = new ModelRendererTurbo(this, 362, 27, textureX, textureY); // Box 99
		bodyModel[74] = new ModelRendererTurbo(this, 143, 96, textureX, textureY); // Box 100
		bodyModel[75] = new ModelRendererTurbo(this, 170, 96, textureX, textureY); // Box 101
		bodyModel[76] = new ModelRendererTurbo(this, 120, 96, textureX, textureY); // Box 102
		bodyModel[77] = new ModelRendererTurbo(this, 120, 128, textureX, textureY); // Box 103
		bodyModel[78] = new ModelRendererTurbo(this, 143, 128, textureX, textureY); // Box 104
		bodyModel[79] = new ModelRendererTurbo(this, 170, 128, textureX, textureY); // Box 105
		bodyModel[80] = new ModelRendererTurbo(this, 143, 96, textureX, textureY); // Box 106
		bodyModel[81] = new ModelRendererTurbo(this, 170, 96, textureX, textureY); // Box 107
		bodyModel[82] = new ModelRendererTurbo(this, 120, 96, textureX, textureY); // Box 108
		bodyModel[83] = new ModelRendererTurbo(this, 120, 128, textureX, textureY); // Box 109
		bodyModel[84] = new ModelRendererTurbo(this, 143, 128, textureX, textureY); // Box 110
		bodyModel[85] = new ModelRendererTurbo(this, 170, 128, textureX, textureY); // Box 111
		bodyModel[86] = new ModelRendererTurbo(this, 112, 119, textureX, textureY); // Box 112 cull
		bodyModel[87] = new ModelRendererTurbo(this, 112, 119, textureX, textureY); // Box 113 cull
		bodyModel[88] = new ModelRendererTurbo(this, 112, 119, textureX, textureY); // Box 114 cull
		bodyModel[89] = new ModelRendererTurbo(this, 101, 120, textureX, textureY); // Box 159
		bodyModel[90] = new ModelRendererTurbo(this, 101, 120, textureX, textureY); // Box 116
		bodyModel[91] = new ModelRendererTurbo(this, 101, 120, textureX, textureY); // Box 117
		bodyModel[92] = new ModelRendererTurbo(this, 258, 13, textureX, textureY); // Box 118 cull
		bodyModel[93] = new ModelRendererTurbo(this, 384, 13, textureX, textureY); // Box 119 cull
		bodyModel[94] = new ModelRendererTurbo(this, 384, 70, textureX, textureY); // Box 120 cull
		bodyModel[95] = new ModelRendererTurbo(this, 258, 70, textureX, textureY); // Box 121 cull
		bodyModel[96] = new ModelRendererTurbo(this, 16, 63, textureX, textureY); // Box 106
		bodyModel[97] = new ModelRendererTurbo(this, 16, 45, textureX, textureY); // Box 107
		bodyModel[98] = new ModelRendererTurbo(this, 14, 53, textureX, textureY); // Box 108
		bodyModel[99] = new ModelRendererTurbo(this, 31, 20, textureX, textureY); // Box 110
		bodyModel[100] = new ModelRendererTurbo(this, 21, 4, textureX, textureY); // Box 118
		bodyModel[101] = new ModelRendererTurbo(this, 15, 35, textureX, textureY); // Box 119
		bodyModel[102] = new ModelRendererTurbo(this, 21, 10, textureX, textureY); // Box 120
		bodyModel[103] = new ModelRendererTurbo(this, 10, 4, textureX, textureY); // Box 121
		bodyModel[104] = new ModelRendererTurbo(this, 170, 8, textureX, textureY); // Box 122
		bodyModel[105] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 123
		bodyModel[106] = new ModelRendererTurbo(this, -1, 7, textureX, textureY); // Box 124
		bodyModel[107] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 125
		bodyModel[108] = new ModelRendererTurbo(this, 179, 9, textureX, textureY); // Box 126
		bodyModel[109] = new ModelRendererTurbo(this, 447, 23, textureX, textureY); // Box 127
		bodyModel[110] = new ModelRendererTurbo(this, 452, 23, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 457, 23, textureX, textureY); // Box 129
		bodyModel[112] = new ModelRendererTurbo(this, 462, 23, textureX, textureY); // Box 130
		bodyModel[113] = new ModelRendererTurbo(this, 467, 23, textureX, textureY); // Box 131
		bodyModel[114] = new ModelRendererTurbo(this, 472, 23, textureX, textureY); // Box 132
		bodyModel[115] = new ModelRendererTurbo(this, 482, 23, textureX, textureY); // Box 133
		bodyModel[116] = new ModelRendererTurbo(this, 487, 23, textureX, textureY); // Box 134
		bodyModel[117] = new ModelRendererTurbo(this, 492, 23, textureX, textureY); // Box 135
		bodyModel[118] = new ModelRendererTurbo(this, 497, 23, textureX, textureY); // Box 136
		bodyModel[119] = new ModelRendererTurbo(this, 502, 23, textureX, textureY); // Box 137
		bodyModel[120] = new ModelRendererTurbo(this, 507, 23, textureX, textureY); // Box 138
		bodyModel[121] = new ModelRendererTurbo(this, 456, 3, textureX, textureY); // Box 58
		bodyModel[122] = new ModelRendererTurbo(this, 477, 23, textureX, textureY); // Box 132
		bodyModel[123] = new ModelRendererTurbo(this, 26, 1, textureX, textureY); // Box 118
		bodyModel[124] = new ModelRendererTurbo(this, 26, 16, textureX, textureY); // Box 118
		bodyModel[125] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 118
		bodyModel[126] = new ModelRendererTurbo(this, 177, 16, textureX, textureY); // Box 122
		bodyModel[127] = new ModelRendererTurbo(this, 232, 74, textureX, textureY); // Box 72
		bodyModel[128] = new ModelRendererTurbo(this, 232, 85, textureX, textureY); // Box 87
		bodyModel[129] = new ModelRendererTurbo(this, 234, 85, textureX, textureY); // Box 87
		bodyModel[130] = new ModelRendererTurbo(this, 240, 93, textureX, textureY); // Box 132
		bodyModel[131] = new ModelRendererTurbo(this, 238, 108, textureX, textureY); // Box 118
		bodyModel[132] = new ModelRendererTurbo(this, 229, 108, textureX, textureY); // Box 119
		bodyModel[133] = new ModelRendererTurbo(this, 233, 103, textureX, textureY); // Box 286
		bodyModel[134] = new ModelRendererTurbo(this, 233, 103, textureX, textureY); // Box 287
		bodyModel[135] = new ModelRendererTurbo(this, 224, 115, textureX, textureY); // Box 317
		bodyModel[136] = new ModelRendererTurbo(this, 227, 113, textureX, textureY); // Box 318
		bodyModel[137] = new ModelRendererTurbo(this, 238, 113, textureX, textureY); // Box 320 cull
		bodyModel[138] = new ModelRendererTurbo(this, 242, 101, textureX, textureY); // Box 321
		bodyModel[139] = new ModelRendererTurbo(this, 242, 101, textureX, textureY); // Box 322
		bodyModel[140] = new ModelRendererTurbo(this, 242, 122, textureX, textureY); // Box 323
		bodyModel[141] = new ModelRendererTurbo(this, 218, 122, textureX, textureY); // Box 196
		bodyModel[142] = new ModelRendererTurbo(this, 237, 124, textureX, textureY); // Box 199
		bodyModel[143] = new ModelRendererTurbo(this, 229, 122, textureX, textureY); // Box 326
		bodyModel[144] = new ModelRendererTurbo(this, 234, 124, textureX, textureY); // Box 327
		bodyModel[145] = new ModelRendererTurbo(this, 398, 104, textureX, textureY); // Box 328
		bodyModel[146] = new ModelRendererTurbo(this, 408, 106, textureX, textureY); // Box 329
		bodyModel[147] = new ModelRendererTurbo(this, 400, 109, textureX, textureY); // Box 330
		bodyModel[148] = new ModelRendererTurbo(this, 403, 104, textureX, textureY); // Box 331
		bodyModel[149] = new ModelRendererTurbo(this, 417, 106, textureX, textureY); // Box 332
		bodyModel[150] = new ModelRendererTurbo(this, 405, 106, textureX, textureY); // Box 333 cull
		bodyModel[151] = new ModelRendererTurbo(this, 222, 113, textureX, textureY); // Box 125
		bodyModel[152] = new ModelRendererTurbo(this, 208, 111, textureX, textureY); // Box 125
		bodyModel[153] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 125
		bodyModel[154] = new ModelRendererTurbo(this, 264, 23, textureX, textureY); // Box 27
		bodyModel[155] = new ModelRendererTurbo(this, 17, 28, textureX, textureY); // Box 119
		bodyModel[156] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Box 27
		bodyModel[157] = new ModelRendererTurbo(this, 1, 71, textureX, textureY); // Box 27
		bodyModel[158] = new ModelRendererTurbo(this, 186, 0, textureX, textureY); // Box 125
		bodyModel[159] = new ModelRendererTurbo(this, 8, 8, textureX, textureY); // Box 125
		bodyModel[160] = new ModelRendererTurbo(this, 143, 112, textureX, textureY); // Box 299
		bodyModel[161] = new ModelRendererTurbo(this, 143, 112, textureX, textureY); // Box 300
		bodyModel[162] = new ModelRendererTurbo(this, 222, 29, textureX, textureY); // Box 301
		bodyModel[163] = new ModelRendererTurbo(this, 362, 29, textureX, textureY); // Box 302
		bodyModel[164] = new ModelRendererTurbo(this, 143, 112, textureX, textureY); // Box 300
		bodyModel[165] = new ModelRendererTurbo(this, 358, 41, textureX, textureY); // Box 81
		bodyModel[166] = new ModelRendererTurbo(this, 376, 35, textureX, textureY); // Box 15 cut bar support cull
		bodyModel[167] = new ModelRendererTurbo(this, 264, 41, textureX, textureY); // Box 81
		bodyModel[168] = new ModelRendererTurbo(this, 264, 35, textureX, textureY); // Box 15 cut bar support cull
		bodyModel[169] = new ModelRendererTurbo(this, 14, 22, textureX, textureY); // Box 110
		bodyModel[170] = new ModelRendererTurbo(this, 14, 22, textureX, textureY); // Box 110
		bodyModel[171] = new ModelRendererTurbo(this, 14, 22, textureX, textureY); // Box 110
		bodyModel[172] = new ModelRendererTurbo(this, 14, 22, textureX, textureY); // Box 110
		bodyModel[173] = new ModelRendererTurbo(this, 14, 22, textureX, textureY); // Box 110
		bodyModel[174] = new ModelRendererTurbo(this, 14, 22, textureX, textureY); // Box 110
		bodyModel[175] = new ModelRendererTurbo(this, 286, 25, textureX, textureY); // Box 148 cull
		bodyModel[176] = new ModelRendererTurbo(this, 286, 29, textureX, textureY); // Box 149 cull
		bodyModel[177] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 152 cull
		bodyModel[178] = new ModelRendererTurbo(this, 297, 29, textureX, textureY); // Box 153 cull
		bodyModel[179] = new ModelRendererTurbo(this, 283, 29, textureX, textureY); // Box 158
		bodyModel[180] = new ModelRendererTurbo(this, 286, 25, textureX, textureY); // Box 148 cull
		bodyModel[181] = new ModelRendererTurbo(this, 286, 29, textureX, textureY); // Box 149 cull
		bodyModel[182] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 152 cull
		bodyModel[183] = new ModelRendererTurbo(this, 297, 29, textureX, textureY); // Box 153 cull
		bodyModel[184] = new ModelRendererTurbo(this, 283, 29, textureX, textureY); // Box 159
		bodyModel[185] = new ModelRendererTurbo(this, 460, 24, textureX, textureY); // Box 156
		bodyModel[186] = new ModelRendererTurbo(this, 460, 47, textureX, textureY); // Box 198
		bodyModel[187] = new ModelRendererTurbo(this, 122, 75, textureX, textureY); // Box 187 roof asian boner blast bar
		bodyModel[188] = new ModelRendererTurbo(this, 122, 71, textureX, textureY); // Box 188 roof asian boner blast bar 2

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-44.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(41.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(-31.5F, 5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(27.5F, 5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 12, 2, 4, 0F); // Box 13
		bodyModel[4].setRotationPoint(-41.5F, 3F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 12, 2, 4, 0F); // Box 12
		bodyModel[5].setRotationPoint(29.5F, 3F, -2F);

		bodyModel[6].addBox(0F, 0F, 0F, 59, 11, 4, 0F); // Box 13
		bodyModel[6].setRotationPoint(-29.5F, -6F, -2F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 0, 20, 0F); // Box 14
		bodyModel[7].setRotationPoint(-39.5F, 3.01F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 18
		bodyModel[8].setRotationPoint(-39.5F, 2F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 0, 21, 0F); // Box 19
		bodyModel[9].setRotationPoint(-30.5F, 3.01F, -10.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 20
		bodyModel[10].setRotationPoint(-30.5F, 0F, -10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[11].setRotationPoint(-28.5F, 0F, -10.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[12].setRotationPoint(-28.5F, 0F, 10.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 23
		bodyModel[13].setRotationPoint(-30.5F, 0F, 10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 24
		bodyModel[14].setRotationPoint(-39.5F, 3F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 25
		bodyModel[15].setRotationPoint(-39.5F, 3F, 10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 26
		bodyModel[16].setRotationPoint(-39.5F, 2F, 11F);

		bodyModel[17].addBox(0F, 0F, 0F, 59, 18, 1, 0F); // Box 27
		bodyModel[17].setRotationPoint(-29.5F, -18F, -10.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 9, 21, 0F); // Box 28
		bodyModel[18].setRotationPoint(-29.51F, -6F, -10.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 71, 0, 1, 0F); // Box 29
		bodyModel[19].setRotationPoint(-35.5F, 0.01F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 30 cull
		bodyModel[20].setRotationPoint(-39.5F, -11F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 32
		bodyModel[21].setRotationPoint(-39.5F, -1F, -10.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 10, 5, 21, 0F); // Box 33
		bodyModel[22].setRotationPoint(-39.5F, -18F, -10.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 35 cull
		bodyModel[23].setRotationPoint(-39.5F, -11F, 10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37 cull
		bodyModel[24].setRotationPoint(-39.5F, -18F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[25].setRotationPoint(-39.5F, -13F, -10.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 40
		bodyModel[26].setRotationPoint(-39.5F, -1F, 10.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 71, 0, 1, 0F); // Box 41
		bodyModel[27].setRotationPoint(-35.5F, 0.01F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[28].setRotationPoint(-39.5F, -13F, 10.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 43 cull
		bodyModel[29].setRotationPoint(-39.5F, -18F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 44
		bodyModel[30].setRotationPoint(-29.5F, -18F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 10, 5, 21, 0F); // Box 46
		bodyModel[31].setRotationPoint(29.5F, -18F, -10.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 59, 18, 1, 0F); // Box 47
		bodyModel[32].setRotationPoint(-29.5F, -18F, 9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
		bodyModel[33].setRotationPoint(28.5F, -18F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[34].setRotationPoint(-24.5F, -18F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[35].setRotationPoint(-19.5F, -18F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 51
		bodyModel[36].setRotationPoint(-14.5F, -18F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[37].setRotationPoint(-9.5F, -18F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 53
		bodyModel[38].setRotationPoint(-4.5F, -18F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 54
		bodyModel[39].setRotationPoint(23.5F, -18F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 55
		bodyModel[40].setRotationPoint(18.5F, -18F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 56
		bodyModel[41].setRotationPoint(13.5F, -18F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
		bodyModel[42].setRotationPoint(8.5F, -18F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 58
		bodyModel[43].setRotationPoint(3.5F, -18F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 51
		bodyModel[44].setRotationPoint(8F, 0F, -10.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[45].setRotationPoint(12F, 0F, -10.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[46].setRotationPoint(18F, 0F, -10.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -7F); // Box 85
		bodyModel[47].setRotationPoint(18F, 0F, 3.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F); // Box 86
		bodyModel[48].setRotationPoint(8F, 0F, 3.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 87
		bodyModel[49].setRotationPoint(12F, 0F, 3.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 1, 19, 0F,0F, 1F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.5F, 5F, 0F, -0.5F, 5F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[50].setRotationPoint(-29.5F, -6F, -9.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 44, 1, 19, 0F); // Box 74
		bodyModel[51].setRotationPoint(-22F, -1F, -9.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 30 cull
		bodyModel[52].setRotationPoint(35.5F, -11F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 35 cull
		bodyModel[53].setRotationPoint(35.5F, -11F, 10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37 cull
		bodyModel[54].setRotationPoint(38.5F, -18F, 10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 43 cull
		bodyModel[55].setRotationPoint(38.5F, -18F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 9, 21, 0F); // Box 82
		bodyModel[56].setRotationPoint(29.51F, -6F, -10.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 1, 19, 0F,-0.5F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -5F, 0F, -0.5F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 5F, 0F); // Box 83
		bodyModel[57].setRotationPoint(21.5F, -6F, -9.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 84
		bodyModel[58].setRotationPoint(28.5F, 0F, -10.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 0, 21, 0F); // Box 85
		bodyModel[59].setRotationPoint(28.5F, 3.01F, -10.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 86
		bodyModel[60].setRotationPoint(27.5F, 0F, -10.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 87
		bodyModel[61].setRotationPoint(27.5F, 0F, 10.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 88
		bodyModel[62].setRotationPoint(28.5F, 0F, 10.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 89
		bodyModel[63].setRotationPoint(29.5F, -1F, 10.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 90
		bodyModel[64].setRotationPoint(29.5F, 2F, 11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 91
		bodyModel[65].setRotationPoint(29.5F, 3F, 10F);

		bodyModel[66].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 92
		bodyModel[66].setRotationPoint(29.5F, -1F, -10.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 93
		bodyModel[67].setRotationPoint(29.5F, 3F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 94
		bodyModel[68].setRotationPoint(29.5F, 2F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 0, 20, 0F); // Box 95
		bodyModel[69].setRotationPoint(38.5F, 3.01F, -10F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 96 crossover cull
		bodyModel[70].setRotationPoint(-41.5F, 2.01F, -7F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 97 crossover cull
		bodyModel[71].setRotationPoint(39.5F, 2.01F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 98
		bodyModel[72].setRotationPoint(29.5F, -13F, 10.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 99
		bodyModel[73].setRotationPoint(29.5F, -13F, -10.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 100
		bodyModel[74].setRotationPoint(-3F, 0F, 3.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -7F); // Box 101
		bodyModel[75].setRotationPoint(3F, 0F, 3.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F); // Box 102
		bodyModel[76].setRotationPoint(-7F, 0F, 3.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 103
		bodyModel[77].setRotationPoint(-7F, 0F, -10.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[78].setRotationPoint(-3F, 0F, -10.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[79].setRotationPoint(3F, 0F, -10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 106
		bodyModel[80].setRotationPoint(-18F, 0F, 3.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -7F); // Box 107
		bodyModel[81].setRotationPoint(-12F, 0F, 3.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F); // Box 108
		bodyModel[82].setRotationPoint(-22F, 0F, 3.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 109
		bodyModel[83].setRotationPoint(-22F, 0F, -10.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[84].setRotationPoint(-18F, 0F, -10.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[85].setRotationPoint(-12F, 0F, -10.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 112 cull
		bodyModel[86].setRotationPoint(-18F, 7.5F, -3.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 113 cull
		bodyModel[87].setRotationPoint(-3F, 7.5F, -3.5F);

		bodyModel[88].addBox(-6F, 0F, -7F, 8, 1, 7, 0F); // Box 114 cull
		bodyModel[88].setRotationPoint(12F, 7.5F, -3.5F);
		bodyModel[88].rotateAngleY = -3.14159265F;

		bodyModel[89].addBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F); // Box 159
		bodyModel[89].setRotationPoint(-11.5F, 8F, -4F);
		bodyModel[89].rotateAngleZ = 0.78539816F;

		bodyModel[90].addBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F); // Box 116
		bodyModel[90].setRotationPoint(3.5F, 8F, -4F);
		bodyModel[90].rotateAngleZ = 0.78539816F;

		bodyModel[91].addBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F); // Box 117
		bodyModel[91].setRotationPoint(11.5F, 8F, -4F);
		bodyModel[91].rotateAngleZ = 0.78539816F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118 cull
		bodyModel[92].setRotationPoint(-39.5F, -13F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119 cull
		bodyModel[93].setRotationPoint(38.5F, -13F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 120 cull
		bodyModel[94].setRotationPoint(38.5F, -13F, 10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121 cull
		bodyModel[95].setRotationPoint(-39.5F, -13F, 10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 79, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[96].setRotationPoint(-39.5F, -19F, -10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 79, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[97].setRotationPoint(-39.5F, -19F, 4F);

		bodyModel[98].addBox(0F, 0F, 0F, 79, 1, 8, 0F); // Box 108
		bodyModel[98].setRotationPoint(-39.5F, -19F, -4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 64, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 110
		bodyModel[99].setRotationPoint(-32F, -20.75F, -3F);

		bodyModel[100].addBox(0F, 0F, 0F, 75, 0, 5, 0F); // Box 118
		bodyModel[100].setRotationPoint(-39.5F, -19.5F, -8F);

		bodyModel[101].addBox(0F, 0F, 0F, 79, 1, 7, 0F); // Box 119
		bodyModel[101].setRotationPoint(-39.5F, -20F, -3.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 75, 0, 5, 0F); // Box 120
		bodyModel[102].setRotationPoint(-35.5F, -19.5F, 3F);

		bodyModel[103].addBox(0F, 0F, 0F, 4, 0, 7, 0F); // Box 121
		bodyModel[103].setRotationPoint(-39.5F, -19.5F, 3F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 0, 7, 0F); // Box 122
		bodyModel[104].setRotationPoint(35.5F, -19.5F, -10F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 0, 7, 0F); // Box 123
		bodyModel[105].setRotationPoint(-39.5F, -20.51F, -3.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 124
		bodyModel[106].setRotationPoint(-41.5F, -20.51F, -2F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 125
		bodyModel[107].setRotationPoint(39.5F, -20.51F, -2F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 0, 7, 0F); // Box 126
		bodyModel[108].setRotationPoint(35.5F, -20.51F, -3.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 127
		bodyModel[109].setRotationPoint(-29.5F, -18F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 128
		bodyModel[110].setRotationPoint(-24.5F, -18F, 10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 129
		bodyModel[111].setRotationPoint(-19.5F, -18F, 10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 130
		bodyModel[112].setRotationPoint(-14.5F, -18F, 10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 131
		bodyModel[113].setRotationPoint(-9.5F, -18F, 10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 132
		bodyModel[114].setRotationPoint(-4.5F, -18F, 10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 133
		bodyModel[115].setRotationPoint(3.5F, -18F, 10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 134
		bodyModel[116].setRotationPoint(8.5F, -18F, 10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 135
		bodyModel[117].setRotationPoint(13.5F, -18F, 10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 136
		bodyModel[118].setRotationPoint(18.5F, -18F, 10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 137
		bodyModel[119].setRotationPoint(23.5F, -18F, 10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 138
		bodyModel[120].setRotationPoint(28.5F, -18F, 10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 58
		bodyModel[121].setRotationPoint(-0.5F, -18F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 132
		bodyModel[122].setRotationPoint(-0.5F, -18F, 10F);

		bodyModel[123].addBox(0F, 0F, 0F, 75, 2, 0, 0F); // Box 118
		bodyModel[123].setRotationPoint(-39.5F, -19.5F, -8F);

		bodyModel[124].addBox(0F, 0F, 0F, 75, 2, 0, 0F); // Box 118
		bodyModel[124].setRotationPoint(-35.5F, -19.5F, 8F);

		bodyModel[125].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 118
		bodyModel[125].setRotationPoint(-39.5F, -19.5F, 10F);

		bodyModel[126].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 122
		bodyModel[126].setRotationPoint(35.5F, -19.5F, -10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[127].setRotationPoint(-41.25F, -5.5F, 2F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[128].setRotationPoint(-41.24F, -4F, 3.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 87
		bodyModel[129].setRotationPoint(-40.5F, -5.5F, 2.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 132
		bodyModel[130].setRotationPoint(-40.25F, -3F, 4F);

		bodyModel[131].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[131].setRotationPoint(-33F, 1F, 4F);
		bodyModel[131].rotateAngleX = -0.78539816F;

		bodyModel[132].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[132].setRotationPoint(-35F, 1F, 4F);
		bodyModel[132].rotateAngleX = -0.78539816F;

		bodyModel[133].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[133].setRotationPoint(-31F, -4.5F, 7.5F);
		bodyModel[133].rotateAngleX = -0.78539816F;
		bodyModel[133].rotateAngleY = -1.57079633F;

		bodyModel[134].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[134].setRotationPoint(-31F, -4.5F, 4.5F);
		bodyModel[134].rotateAngleX = -0.78539816F;
		bodyModel[134].rotateAngleY = -1.57079633F;

		bodyModel[135].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[135].setRotationPoint(-32.5F, -2.51F, -5.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 318
		bodyModel[136].setRotationPoint(-32.5F, -1.51F, -7.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 320 cull
		bodyModel[137].setRotationPoint(-32.5F, 0.5F, -5.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 321
		bodyModel[138].setRotationPoint(-32.5F, -4.5F, 7.51F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 322
		bodyModel[139].setRotationPoint(-32.5F, -4.5F, 1.49F);

		bodyModel[140].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 323
		bodyModel[140].setRotationPoint(-30.5F, 1.5F, 0F);
		bodyModel[140].rotateAngleX = 0.78539816F;

		bodyModel[141].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[141].setRotationPoint(-36F, 1.26F, 0F);
		bodyModel[141].rotateAngleY = 0.19198622F;

		bodyModel[142].addBox(-0.5F, -1F, -0.5F, 1, 2, 1, 0F); // Box 199
		bodyModel[142].setRotationPoint(-36F, 2.25F, 0F);
		bodyModel[142].rotateAngleY = 0.19198622F;

		bodyModel[143].addBox(-0.5F, 0F, 0F, 7, 1, 0, 0F); // Box 326
		bodyModel[143].setRotationPoint(-36F, 1.26F, 0F);

		bodyModel[144].addBox(-0.5F, 0F, -4F, 1, 4, 0, 0F); // Box 327
		bodyModel[144].setRotationPoint(-36F, 1.26F, 0F);
		bodyModel[144].rotateAngleY = 0.19198622F;
		bodyModel[144].rotateAngleZ = -0.45378561F;

		bodyModel[145].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 328
		bodyModel[145].setRotationPoint(29.5F, 1.5F, 0F);
		bodyModel[145].rotateAngleX = 0.78539816F;

		bodyModel[146].addBox(-0.5F, 0F, -2F, 1, 0, 6, 0F); // Box 329
		bodyModel[146].setRotationPoint(36F, 1.26F, 0F);
		bodyModel[146].rotateAngleY = 0.19198622F;

		bodyModel[147].addBox(-0.5F, -1F, -0.5F, 1, 2, 1, 0F); // Box 330
		bodyModel[147].setRotationPoint(36F, 2.25F, 0F);
		bodyModel[147].rotateAngleY = 0.19198622F;

		bodyModel[148].addBox(-6.5F, 0F, 0F, 7, 1, 0, 0F); // Box 331
		bodyModel[148].setRotationPoint(36F, 1.26F, 0F);

		bodyModel[149].addBox(-0.5F, 0F, 4F, 1, 4, 0, 0F); // Box 332
		bodyModel[149].setRotationPoint(36F, 1.26F, 0F);
		bodyModel[149].rotateAngleY = 0.19198622F;
		bodyModel[149].rotateAngleZ = 0.45378561F;

		bodyModel[150].addBox(-0.5F, -1F, -0.5F, 3, 3, 1, 0F); // Box 333 cull
		bodyModel[150].setRotationPoint(35F, 2.25F, -2F);

		bodyModel[151].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 125
		bodyModel[151].setRotationPoint(-39.25F, 1F, 4F);

		bodyModel[152].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 125
		bodyModel[152].setRotationPoint(-39.25F, -3F, 4F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 125
		bodyModel[153].setRotationPoint(-37.25F, -3F, 4.01F);
		bodyModel[153].rotateAngleZ = -0.06981317F;

		bodyModel[154].addBox(0F, 0F, 0F, 59, 1, 0, 0F); // Box 27
		bodyModel[154].setRotationPoint(-29.5F, 0F, -10.25F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 79, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 119
		bodyModel[155].setRotationPoint(-39.5F, -20.5F, -2.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 59, 18, 0, 0F); // Box 27
		bodyModel[156].setRotationPoint(-29.5F, -18F, -11.01F);

		bodyModel[157].addBox(0F, 0F, 0F, 59, 18, 0, 0F); // Box 27
		bodyModel[157].setRotationPoint(-29.5F, -18F, 11.01F);

		bodyModel[158].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 125
		bodyModel[158].setRotationPoint(41.5F, -20.51F, -2F);
		bodyModel[158].rotateAngleZ = -0.61086524F;

		bodyModel[159].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 125
		bodyModel[159].setRotationPoint(-41.5F, -20.51F, -2F);
		bodyModel[159].rotateAngleZ = 0.61086524F;

		bodyModel[160].addFlexTrapezoid(0F, 0F, 0F, 6, 8, 7, 0F, 4.00F, 4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 299
		bodyModel[160].setRotationPoint(12F, 0F, -3.5F);

		bodyModel[161].addFlexTrapezoid(0F, 0F, 0F, 6, 8, 7, 0F, 4.00F, 4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 300
		bodyModel[161].setRotationPoint(-3F, 0F, -3.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 10, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 301
		bodyModel[162].setRotationPoint(-39.5F, -13F, -10.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 10, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[163].setRotationPoint(29.5F, -13F, -10.5F);

		bodyModel[164].addFlexTrapezoid(0F, 0F, 0F, 6, 8, 7, 0F, 4.00F, 4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 300
		bodyModel[164].setRotationPoint(-18F, 0F, -3.5F);

		bodyModel[165].addBox(-9F, 0F, 0F, 12, 2, 0, 0F); // Box 81
		bodyModel[165].setRotationPoint(42F, 4F, -2.5F);
		bodyModel[165].rotateAngleY = 1.29154365F;

		bodyModel[166].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 15 cut bar support cull
		bodyModel[166].setRotationPoint(39.53F, 2F, -10.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 12, 2, 0, 0F); // Box 81
		bodyModel[167].setRotationPoint(-39.5F, 4F, 11F);
		bodyModel[167].rotateAngleY = -1.8675023F;

		bodyModel[168].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 15 cut bar support cull
		bodyModel[168].setRotationPoint(-40.51F, 2F, 8.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 110
		bodyModel[169].setRotationPoint(-31F, -21F, -2.83F);
		bodyModel[169].rotateAngleY = 0.78539816F;

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 110
		bodyModel[170].setRotationPoint(31F, -21F, -2.83F);
		bodyModel[170].rotateAngleY = 0.78539816F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 110
		bodyModel[171].setRotationPoint(19F, -21F, -2.83F);
		bodyModel[171].rotateAngleY = 0.78539816F;

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 110
		bodyModel[172].setRotationPoint(6F, -21F, -2.83F);
		bodyModel[172].rotateAngleY = 0.78539816F;

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 110
		bodyModel[173].setRotationPoint(-7F, -21F, -2.83F);
		bodyModel[173].rotateAngleY = 0.78539816F;

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 110
		bodyModel[174].setRotationPoint(-20F, -21F, -2.83F);
		bodyModel[174].rotateAngleY = 0.78539816F;

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 148 cull
		bodyModel[175].setRotationPoint(-39.5F, 3F, -11F);

		bodyModel[176].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 149 cull
		bodyModel[176].setRotationPoint(-39.5F, 5F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 152 cull
		bodyModel[177].setRotationPoint(-39.5F, 3F, 10F);

		bodyModel[178].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 153 cull
		bodyModel[178].setRotationPoint(-39.5F, 5F, 9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 158
		bodyModel[179].setRotationPoint(-39.5F, 3F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 148 cull
		bodyModel[180].setRotationPoint(35.5F, 3F, -11F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 149 cull
		bodyModel[181].setRotationPoint(35.5F, 5F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 152 cull
		bodyModel[182].setRotationPoint(35.5F, 3F, 10F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 153 cull
		bodyModel[183].setRotationPoint(35.5F, 5F, 9F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 159
		bodyModel[184].setRotationPoint(39.5F, 3F, 8F);

		bodyModel[185].addBox(0F, 0F, 0F, 0, 21, 22, 0F); // Box 156
		bodyModel[185].setRotationPoint(39.51F, -18F, -11F);

		bodyModel[186].addBox(0F, 0F, 0F, 0, 21, 22, 0F); // Box 198
		bodyModel[186].setRotationPoint(-39.51F, -18F, -11F);

		bodyModel[187].addBox(0F, 0F, 0F, 29, 1, 1, 0F); // Box 187 roof asian boner blast bar
		bodyModel[187].setRotationPoint(-14.5F, -18.01F, -11.02F);

		bodyModel[188].addBox(0F, 0F, 0F, 29, 1, 1, 0F); // Box 188 roof asian boner blast bar 2
		bodyModel[188].setRotationPoint(-14.5F, -18.01F, 10.02F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 189; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(-1.845,0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.845,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}