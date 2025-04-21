//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.11.2024 - 18:00:23
// Last changed on: 10.11.2024 - 18:00:23

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruckEarly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelACF3500 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelACF3500() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[178];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 437, 164, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 437, 164, textureX, textureY); // Box 333
		bodyModel[2] = new ModelRendererTurbo(this, 227, 116, textureX, textureY); // Box 9
		bodyModel[3] = new ModelRendererTurbo(this, 85, 116, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 61, 20, textureX, textureY, "cull"); // roofwalk cull
		bodyModel[5] = new ModelRendererTurbo(this, 133, 143, textureX, textureY, "cull"); // floor cull
		bodyModel[6] = new ModelRendererTurbo(this, 224, 46, textureX, textureY, "cull"); // roofwalk cull
		bodyModel[7] = new ModelRendererTurbo(this, 391, 105, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[8] = new ModelRendererTurbo(this, 400, 101, textureX, textureY, "cull"); // Stirrup Cull
		bodyModel[9] = new ModelRendererTurbo(this, 380, 101, textureX, textureY, "cull"); // Stirrup Cull
		bodyModel[10] = new ModelRendererTurbo(this, 370, 101, textureX, textureY, "cull"); // Stirrup Cull
		bodyModel[11] = new ModelRendererTurbo(this, 390, 101, textureX, textureY, "cull"); // Stirrup Cull
		bodyModel[12] = new ModelRendererTurbo(this, 380, 105, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[13] = new ModelRendererTurbo(this, 401, 105, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[14] = new ModelRendererTurbo(this, 355, 17, textureX, textureY, "cull"); // Ladder cull
		bodyModel[15] = new ModelRendererTurbo(this, 343, 17, textureX, textureY, "cull"); // Ladder cull
		bodyModel[16] = new ModelRendererTurbo(this, 324, 17, textureX, textureY, "cull"); // Ladder cull
		bodyModel[17] = new ModelRendererTurbo(this, 415, 17, textureX, textureY, "cull"); // Ladder cull
		bodyModel[18] = new ModelRendererTurbo(this, 68, 54, textureX, textureY); // NoName
		bodyModel[19] = new ModelRendererTurbo(this, 71, 54, textureX, textureY); // NoName
		bodyModel[20] = new ModelRendererTurbo(this, 77, 53, textureX, textureY); // NoName
		bodyModel[21] = new ModelRendererTurbo(this, 74, 53, textureX, textureY); // NoName
		bodyModel[22] = new ModelRendererTurbo(this, 49, 60, textureX, textureY); // NoName
		bodyModel[23] = new ModelRendererTurbo(this, 4, 60, textureX, textureY); // NoName
		bodyModel[24] = new ModelRendererTurbo(this, 352, 151, textureX, textureY); // Box 1 coupler
		bodyModel[25] = new ModelRendererTurbo(this, 352, 151, textureX, textureY); // Box 1 coupler
		bodyModel[26] = new ModelRendererTurbo(this, 368, 150, textureX, textureY); // Box 13
		bodyModel[27] = new ModelRendererTurbo(this, 413, 150, textureX, textureY); // Box 12
		bodyModel[28] = new ModelRendererTurbo(this, 383, 114, textureX, textureY); // Box 80
		bodyModel[29] = new ModelRendererTurbo(this, 396, 114, textureX, textureY); // Box 81
		bodyModel[30] = new ModelRendererTurbo(this, 147, 83, textureX, textureY); // Box 1
		bodyModel[31] = new ModelRendererTurbo(this, 87, 53, textureX, textureY); // Box 1
		bodyModel[32] = new ModelRendererTurbo(this, 87, 70, textureX, textureY); // Box 1
		bodyModel[33] = new ModelRendererTurbo(this, 235, 53, textureX, textureY); // Box 1
		bodyModel[34] = new ModelRendererTurbo(this, 235, 69, textureX, textureY); // Box 1
		bodyModel[35] = new ModelRendererTurbo(this, 171, 178, textureX, textureY); // Box 9
		bodyModel[36] = new ModelRendererTurbo(this, 19, 89, textureX, textureY); // Box 67
		bodyModel[37] = new ModelRendererTurbo(this, 48, 45, textureX, textureY); // NoName
		bodyModel[38] = new ModelRendererTurbo(this, 33, 45, textureX, textureY); // NoName
		bodyModel[39] = new ModelRendererTurbo(this, 68, 62, textureX, textureY); // NoName
		bodyModel[40] = new ModelRendererTurbo(this, 71, 62, textureX, textureY); // NoName
		bodyModel[41] = new ModelRendererTurbo(this, 74, 61, textureX, textureY); // NoName
		bodyModel[42] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // NoName
		bodyModel[43] = new ModelRendererTurbo(this, 34, 60, textureX, textureY); // NoName
		bodyModel[44] = new ModelRendererTurbo(this, 18, 60, textureX, textureY); // NoName
		bodyModel[45] = new ModelRendererTurbo(this, 3, 45, textureX, textureY); // NoName
		bodyModel[46] = new ModelRendererTurbo(this, 18, 45, textureX, textureY); // NoName
		bodyModel[47] = new ModelRendererTurbo(this, 225, 200, textureX, textureY, "cull"); // Box 112 cull
		bodyModel[48] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 159
		bodyModel[49] = new ModelRendererTurbo(this, 132, 164, textureX, textureY); // Box 9
		bodyModel[50] = new ModelRendererTurbo(this, 181, 200, textureX, textureY, "cull"); // Box 114 cull
		bodyModel[51] = new ModelRendererTurbo(this, 181, 209, textureX, textureY); // Box 117
		bodyModel[52] = new ModelRendererTurbo(this, 134, 200, textureX, textureY, "cull"); // Box 112 cull
		bodyModel[53] = new ModelRendererTurbo(this, 134, 209, textureX, textureY); // Box 159
		bodyModel[54] = new ModelRendererTurbo(this, 181, 200, textureX, textureY, "cull"); // Box 114 cull
		bodyModel[55] = new ModelRendererTurbo(this, 181, 209, textureX, textureY); // Box 117
		bodyModel[56] = new ModelRendererTurbo(this, 181, 200, textureX, textureY, "cull"); // Box 112 cull
		bodyModel[57] = new ModelRendererTurbo(this, 181, 209, textureX, textureY); // Box 159
		bodyModel[58] = new ModelRendererTurbo(this, 181, 200, textureX, textureY, "cull"); // Box 112 cull
		bodyModel[59] = new ModelRendererTurbo(this, 181, 209, textureX, textureY); // Box 159
		bodyModel[60] = new ModelRendererTurbo(this, 371, 105, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[61] = new ModelRendererTurbo(this, 381, 59, textureX, textureY); // Box 207
		bodyModel[62] = new ModelRendererTurbo(this, 371, 59, textureX, textureY); // Box 207
		bodyModel[63] = new ModelRendererTurbo(this, 400, 59, textureX, textureY); // Box 207
		bodyModel[64] = new ModelRendererTurbo(this, 391, 59, textureX, textureY); // Box 207
		bodyModel[65] = new ModelRendererTurbo(this, 410, 54, textureX, textureY); // MP Ladder
		bodyModel[66] = new ModelRendererTurbo(this, 410, 54, textureX, textureY); // MP Ladder
		bodyModel[67] = new ModelRendererTurbo(this, 373, 160, textureX, textureY); // Box 213
		bodyModel[68] = new ModelRendererTurbo(this, 394, 160, textureX, textureY); // Box 213
		bodyModel[69] = new ModelRendererTurbo(this, 353, 160, textureX, textureY); // Box 213
		bodyModel[70] = new ModelRendererTurbo(this, 415, 160, textureX, textureY); // Box 213
		bodyModel[71] = new ModelRendererTurbo(this, 388, 97, textureX, textureY); // Box 217
		bodyModel[72] = new ModelRendererTurbo(this, 390, 109, textureX, textureY, "cull"); // Bolster end cull
		bodyModel[73] = new ModelRendererTurbo(this, 370, 97, textureX, textureY); // Box 217
		bodyModel[74] = new ModelRendererTurbo(this, 370, 109, textureX, textureY, "cull"); // Bolster end cull
		bodyModel[75] = new ModelRendererTurbo(this, 379, 97, textureX, textureY); // Box 217
		bodyModel[76] = new ModelRendererTurbo(this, 380, 109, textureX, textureY, "cull"); // Bolster end cull
		bodyModel[77] = new ModelRendererTurbo(this, 398, 97, textureX, textureY); // Box 217
		bodyModel[78] = new ModelRendererTurbo(this, 400, 109, textureX, textureY, "cull"); // Bolster end cull
		bodyModel[79] = new ModelRendererTurbo(this, 365, 22, textureX, textureY, "cull"); // Box 124 cull roof walkway
		bodyModel[80] = new ModelRendererTurbo(this, 400, 7, textureX, textureY); // Box 72
		bodyModel[81] = new ModelRendererTurbo(this, 394, 15, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 384, 9, textureX, textureY); // Box 87
		bodyModel[83] = new ModelRendererTurbo(this, 378, 11, textureX, textureY); // Box 132
		bodyModel[84] = new ModelRendererTurbo(this, 395, 137, textureX, textureY); // Box 286
		bodyModel[85] = new ModelRendererTurbo(this, 388, 137, textureX, textureY); // Box 287
		bodyModel[86] = new ModelRendererTurbo(this, 424, 139, textureX, textureY); // Box 286
		bodyModel[87] = new ModelRendererTurbo(this, 417, 139, textureX, textureY); // Box 287
		bodyModel[88] = new ModelRendererTurbo(this, 374, 134, textureX, textureY, "cull"); // Box 234 CULL
		bodyModel[89] = new ModelRendererTurbo(this, 402, 134, textureX, textureY, "cull"); // Box 234 CULL
		bodyModel[90] = new ModelRendererTurbo(this, 32, 33, textureX, textureY, "cull"); // Box 236 CULL
		bodyModel[91] = new ModelRendererTurbo(this, 46, 33, textureX, textureY, "cull"); // Box 236 CULL
		bodyModel[92] = new ModelRendererTurbo(this, 375, 142, textureX, textureY); // Box 118
		bodyModel[93] = new ModelRendererTurbo(this, 386, 142, textureX, textureY); // Box 119
		bodyModel[94] = new ModelRendererTurbo(this, 445, 138, textureX, textureY); // Box 317
		bodyModel[95] = new ModelRendererTurbo(this, 432, 137, textureX, textureY); // Box 318
		bodyModel[96] = new ModelRendererTurbo(this, 397, 142, textureX, textureY); // Box 247
		bodyModel[97] = new ModelRendererTurbo(this, 403, 145, textureX, textureY); // Box 247
		bodyModel[98] = new ModelRendererTurbo(this, 400, 17, textureX, textureY); // Box 72
		bodyModel[99] = new ModelRendererTurbo(this, 394, 25, textureX, textureY); // Box 87
		bodyModel[100] = new ModelRendererTurbo(this, 384, 19, textureX, textureY); // Box 87
		bodyModel[101] = new ModelRendererTurbo(this, 247, 6, textureX, textureY); // Box 252
		bodyModel[102] = new ModelRendererTurbo(this, 284, 6, textureX, textureY); // Box 252
		bodyModel[103] = new ModelRendererTurbo(this, 371, 114, textureX, textureY, "cull"); // bracket cull
		bodyModel[104] = new ModelRendererTurbo(this, 378, 114, textureX, textureY, "cull"); // bracket cull
		bodyModel[105] = new ModelRendererTurbo(this, 92, 134, textureX, textureY); // bracing
		bodyModel[106] = new ModelRendererTurbo(this, 221, 139, textureX, textureY); // bracing
		bodyModel[107] = new ModelRendererTurbo(this, 72, 139, textureX, textureY); // bracing
		bodyModel[108] = new ModelRendererTurbo(this, 370, 124, textureX, textureY); // bracing
		bodyModel[109] = new ModelRendererTurbo(this, 369, 86, textureX, textureY); // bracing
		bodyModel[110] = new ModelRendererTurbo(this, 370, 127, textureX, textureY); // bracing
		bodyModel[111] = new ModelRendererTurbo(this, 369, 83, textureX, textureY); // bracing
		bodyModel[112] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // bracing
		bodyModel[113] = new ModelRendererTurbo(this, 413, 124, textureX, textureY); // bracing
		bodyModel[114] = new ModelRendererTurbo(this, 413, 127, textureX, textureY); // bracing
		bodyModel[115] = new ModelRendererTurbo(this, 369, 92, textureX, textureY); // bracing
		bodyModel[116] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 569
		bodyModel[117] = new ModelRendererTurbo(this, 124, 178, textureX, textureY); // Box 9
		bodyModel[118] = new ModelRendererTurbo(this, 171, 178, textureX, textureY); // Box 9
		bodyModel[119] = new ModelRendererTurbo(this, 171, 178, textureX, textureY); // Box 9
		bodyModel[120] = new ModelRendererTurbo(this, 171, 178, textureX, textureY); // Box 9
		bodyModel[121] = new ModelRendererTurbo(this, 215, 178, textureX, textureY); // Box 9
		bodyModel[122] = new ModelRendererTurbo(this, 134, 200, textureX, textureY, "cull"); // Box 114 cull
		bodyModel[123] = new ModelRendererTurbo(this, 134, 209, textureX, textureY); // Box 117
		bodyModel[124] = new ModelRendererTurbo(this, 124, 178, textureX, textureY); // Box 9
		bodyModel[125] = new ModelRendererTurbo(this, 370, 131, textureX, textureY); // Box 670
		bodyModel[126] = new ModelRendererTurbo(this, 224, 164, textureX, textureY); // Box 9
		bodyModel[127] = new ModelRendererTurbo(this, 234, 134, textureX, textureY); // bracing
		bodyModel[128] = new ModelRendererTurbo(this, 403, 147, textureX, textureY); // Box 762
		bodyModel[129] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 569
		bodyModel[130] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 569
		bodyModel[131] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 569
		bodyModel[132] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 569
		bodyModel[133] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 569
		bodyModel[134] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 569
		bodyModel[135] = new ModelRendererTurbo(this, 123, 9, textureX, textureY); // Box 569 hooker hatch
		bodyModel[136] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 569
		bodyModel[137] = new ModelRendererTurbo(this, 123, 9, textureX, textureY); // Box hooker hatch
		bodyModel[138] = new ModelRendererTurbo(this, 14, 133, textureX, textureY, "cull"); // ph 4 grabs cull
		bodyModel[139] = new ModelRendererTurbo(this, 14, 107, textureX, textureY, "cull"); // ph 4 grabs cull
		bodyModel[140] = new ModelRendererTurbo(this, 264, 180, textureX, textureY); // Box 144
		bodyModel[141] = new ModelRendererTurbo(this, 343, 14, textureX, textureY, "cull"); // Ladder cull
		bodyModel[142] = new ModelRendererTurbo(this, 324, 14, textureX, textureY, "cull"); // Ladder cull
		bodyModel[143] = new ModelRendererTurbo(this, 76, 46, textureX, textureY); // Box 147
		bodyModel[144] = new ModelRendererTurbo(this, 6, 165, textureX, textureY); // Box 147 EL/CNJ bracket
		bodyModel[145] = new ModelRendererTurbo(this, 6, 165, textureX, textureY); // Box 147 EL/CNJ bracket
		bodyModel[146] = new ModelRendererTurbo(this, 45, 119, textureX, textureY); // Box 286
		bodyModel[147] = new ModelRendererTurbo(this, 45, 119, textureX, textureY); // Box 287
		bodyModel[148] = new ModelRendererTurbo(this, 41, 134, textureX, textureY, "cull"); // Box 322 cull
		bodyModel[149] = new ModelRendererTurbo(this, 425, 17, textureX, textureY, "cull"); // Qussy Ladder cull
		bodyModel[150] = new ModelRendererTurbo(this, 334, 17, textureX, textureY, "cull"); // Ladder cull
		bodyModel[151] = new ModelRendererTurbo(this, 4, 211, textureX, textureY, "cull"); // weird end cage cull
		bodyModel[152] = new ModelRendererTurbo(this, 59, 210, textureX, textureY, "cull"); // weird end cage cull
		bodyModel[153] = new ModelRendererTurbo(this, 329, 10, textureX, textureY, "cull"); // Ladder cull
		bodyModel[154] = new ModelRendererTurbo(this, 343, 11, textureX, textureY, "cull"); // Ladder cull
		bodyModel[155] = new ModelRendererTurbo(this, 349, 11, textureX, textureY, "cull"); // Ladder cull
		bodyModel[156] = new ModelRendererTurbo(this, 324, 11, textureX, textureY, "cull"); // Ladder cull
		bodyModel[157] = new ModelRendererTurbo(this, 124, 234, textureX, textureY); // B&O through hatch
		bodyModel[158] = new ModelRendererTurbo(this, 124, 234, textureX, textureY); // B&O through hatch
		bodyModel[159] = new ModelRendererTurbo(this, 124, 234, textureX, textureY); // B&O through hatch
		bodyModel[160] = new ModelRendererTurbo(this, 124, 234, textureX, textureY); // B&O through hatch
		bodyModel[161] = new ModelRendererTurbo(this, 169, 242, textureX, textureY); // B&O through hatch end
		bodyModel[162] = new ModelRendererTurbo(this, 160, 242, textureX, textureY); // B&O through hatch end
		bodyModel[163] = new ModelRendererTurbo(this, 151, 242, textureX, textureY); // B&O through hatch end
		bodyModel[164] = new ModelRendererTurbo(this, 142, 242, textureX, textureY); // B&O through hatch end
		bodyModel[165] = new ModelRendererTurbo(this, 133, 242, textureX, textureY); // B&O through hatch end
		bodyModel[166] = new ModelRendererTurbo(this, 124, 242, textureX, textureY); // B&O through hatch end
		bodyModel[167] = new ModelRendererTurbo(this, 182, 228, textureX, textureY); // CSX placard (f u messi)
		bodyModel[168] = new ModelRendererTurbo(this, 182, 238, textureX, textureY); // CSX placard (f u messi)
		bodyModel[169] = new ModelRendererTurbo(this, 207, 233, textureX, textureY, "cull"); // placard bracket cull
		bodyModel[170] = new ModelRendererTurbo(this, 205, 241, textureX, textureY, "cull"); // placard bracket cull
		bodyModel[171] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // CNJ hatches
		bodyModel[172] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 569
		bodyModel[173] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // CNJ hatches
		bodyModel[174] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // CNJ hatches
		bodyModel[175] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // CNJ hatches
		bodyModel[176] = new ModelRendererTurbo(this, 401, 29, textureX, textureY); // Box 72 CNJ brakewheel
		bodyModel[177] = new ModelRendererTurbo(this, 394, 35, textureX, textureY); // Box 87 CNJ stuff

		bodyModel[0].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 1
		bodyModel[0].setRotationPoint(-30.5F, 4.1F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 333
		bodyModel[1].setRotationPoint(27.5F, 4.1F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 56, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 9
		bodyModel[2].setRotationPoint(-28F, -4F, 3F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 56, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[3].setRotationPoint(-28F, -4F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 72, 4, 16, 0F); // roofwalk cull
		bodyModel[4].setRotationPoint(-36F, -19F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 72, 1, 17, 0F); // floor cull
		bodyModel[5].setRotationPoint(-36F, 2F, -8.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 72, 1, 1, 0F); // roofwalk cull
		bodyModel[6].setRotationPoint(-36F, -15F, 7.49F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Stirrup cull
		bodyModel[7].setRotationPoint(34F, 5F, 9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -1F, 0F, 1.5F); // Stirrup Cull
		bodyModel[8].setRotationPoint(33F, 3F, 7.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Stirrup Cull
		bodyModel[9].setRotationPoint(33F, 3F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Stirrup Cull
		bodyModel[10].setRotationPoint(-36F, 3F, -9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Stirrup Cull
		bodyModel[11].setRotationPoint(-36F, 3F, 8.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Stirrup cull
		bodyModel[12].setRotationPoint(34F, 5F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Stirrup cull
		bodyModel[13].setRotationPoint(-36F, 5F, 9F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Ladder cull
		bodyModel[14].setRotationPoint(-36.01F, -18F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 21, 1, 0F); // Ladder cull
		bodyModel[15].setRotationPoint(-36.01F, -18F, 8F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 21, 1, 0F); // Ladder cull
		bodyModel[16].setRotationPoint(33.01F, -18F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Ladder cull
		bodyModel[17].setRotationPoint(33.01F, -18F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0.8F, 0F, 3F); // NoName
		bodyModel[18].setRotationPoint(-29F, -4F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0.8F, 0F, -3F); // NoName
		bodyModel[19].setRotationPoint(-29F, -4F, 11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // NoName
		bodyModel[20].setRotationPoint(-29F, -11F, 11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // NoName
		bodyModel[21].setRotationPoint(-29F, -11F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.8F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -0.8F, -6F, 0F); // NoName
		bodyModel[22].setRotationPoint(-29F, -17F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -0.8F, -6F, 0F, -0.8F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // NoName
		bodyModel[23].setRotationPoint(-29F, -17F, 6F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[24].setRotationPoint(-40.5F, 3F, -1.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[25].setRotationPoint(36.5F, 3F, -1.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 18, 2, 4, 0F); // Box 13
		bodyModel[26].setRotationPoint(-36.5F, 3F, -2F);

		bodyModel[27].addBox(0F, 0F, 0F, 18, 2, 4, 0F); // Box 12
		bodyModel[27].setRotationPoint(18.5F, 3F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, -6F, 0, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[28].setRotationPoint(-36F, 2.5F, 6F);
		bodyModel[28].rotateAngleY = -0.6981317F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 81
		bodyModel[29].setRotationPoint(36.03F, 2.5F, -6F);
		bodyModel[29].rotateAngleY = -0.6981317F;

		bodyModel[30].addBox(0F, 0F, 0F, 56, 7, 22, 0F); // Box 1
		bodyModel[30].setRotationPoint(-28F, -11F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 56, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[31].setRotationPoint(-28F, -19F, -6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 56, 6, 6, 0F,0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[32].setRotationPoint(-28F, -17F, -12F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 56, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[33].setRotationPoint(-28F, -19F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 56, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1
		bodyModel[34].setRotationPoint(-28F, -17F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F); // Box 9
		bodyModel[35].setRotationPoint(-13.75F, 3F, -7.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 56, 6, 6, 0F); // Box 67
		bodyModel[36].setRotationPoint(-28F, -4F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,-0.8F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -6F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, -0.8F, -8F, 0F); // NoName
		bodyModel[37].setRotationPoint(-29F, -19F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.8F, -2F, 0F, -0.8F, -8F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, -0.8F, -6F, 0F); // NoName
		bodyModel[38].setRotationPoint(-29F, -19F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0.8F, 0F, 3F, 0.8F, 0F, -3F, 0F, 0F, -3F); // NoName
		bodyModel[39].setRotationPoint(28F, -4F, 11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.8F, 0F, -3F, 0.8F, 0F, 3F, 0F, 0F, 3F); // NoName
		bodyModel[40].setRotationPoint(28F, -4F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // NoName
		bodyModel[41].setRotationPoint(28F, -11F, 11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // NoName
		bodyModel[42].setRotationPoint(28F, -11F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.8F, -6F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // NoName
		bodyModel[43].setRotationPoint(28F, -17F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, -6F, 0F, -0.8F, -6F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -6F, 0F, 0F, -6F, 0F); // NoName
		bodyModel[44].setRotationPoint(28F, -17F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -2F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, -0.8F, -8F, 0F, -0.8F, -6F, 0F, 0F, -6F, 0F); // NoName
		bodyModel[45].setRotationPoint(28F, -19F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, -2F, 0F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -0.8F, -6F, 0F, -0.8F, -8F, 0F, 0F, -8F, 0F); // NoName
		bodyModel[46].setRotationPoint(28F, -19F, -6F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 112 cull
		bodyModel[47].setRotationPoint(-3F, 8.5F, -3.5F);

		bodyModel[48].addBox(-0.5F, -0.5F, 0F, 1, 1, 10, 0F); // Box 159
		bodyModel[48].setRotationPoint(-1.5F, 9F, -5F);
		bodyModel[48].rotateAngleZ = 0.78539816F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 42, 3, 3, 0F,0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, 0F, -0.85F, -1.05F, 0F, -0.85F, -1.05F, 0F, -2.15F, -1.05F, 0F, -2.15F); // Box 9
		bodyModel[49].setRotationPoint(-21F, 3F, 4.52F);

		bodyModel[50].addBox(-6F, 0F, -7F, 4, 1, 7, 0F); // Box 114 cull
		bodyModel[50].setRotationPoint(-1.5F, 8.5F, -3.5F);
		bodyModel[50].rotateAngleY = -3.14159265F;

		bodyModel[51].addBox(-0.5F, -0.5F, 0F, 1, 1, 10, 0F); // Box 117
		bodyModel[51].setRotationPoint(2F, 9F, -5F);
		bodyModel[51].rotateAngleZ = 0.78539816F;

		bodyModel[52].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 112 cull
		bodyModel[52].setRotationPoint(-19F, 8.5F, -3.5F);

		bodyModel[53].addBox(-0.5F, -0.5F, 0F, 1, 1, 10, 0F); // Box 159
		bodyModel[53].setRotationPoint(-16.5F, 9F, -5F);
		bodyModel[53].rotateAngleZ = 0.78539816F;

		bodyModel[54].addBox(-6F, 0F, -7F, 4, 1, 7, 0F); // Box 114 cull
		bodyModel[54].setRotationPoint(5.75F, 8.5F, -3.5F);
		bodyModel[54].rotateAngleY = -3.14159265F;

		bodyModel[55].addBox(-0.5F, -0.5F, 0F, 1, 1, 10, 0F); // Box 117
		bodyModel[55].setRotationPoint(9.25F, 9F, -5F);
		bodyModel[55].rotateAngleZ = 0.78539816F;

		bodyModel[56].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 112 cull
		bodyModel[56].setRotationPoint(-11.75F, 8.5F, -3.5F);

		bodyModel[57].addBox(-0.5F, -0.5F, 0F, 1, 1, 10, 0F); // Box 159
		bodyModel[57].setRotationPoint(-9.25F, 9F, -5F);
		bodyModel[57].rotateAngleZ = 0.78539816F;

		bodyModel[58].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 112 cull
		bodyModel[58].setRotationPoint(-4.5F, 8.5F, -3.5F);

		bodyModel[59].addBox(-0.5F, -0.5F, 0F, 1, 1, 10, 0F); // Box 159
		bodyModel[59].setRotationPoint(-2F, 9F, -5F);
		bodyModel[59].rotateAngleZ = 0.78539816F;

		bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Stirrup cull
		bodyModel[60].setRotationPoint(-36F, 5F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 207
		bodyModel[61].setRotationPoint(28F, -14.99F, -8.49F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 207
		bodyModel[62].setRotationPoint(28F, -14.99F, 7.49F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 207
		bodyModel[63].setRotationPoint(-31F, -14.99F, 7.49F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 207
		bodyModel[64].setRotationPoint(-31F, -14.99F, -8.49F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 21, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // MP Ladder
		bodyModel[65].setRotationPoint(29F, -19F, -7.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 21, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // MP Ladder
		bodyModel[66].setRotationPoint(-29F, -19F, 3.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[67].setRotationPoint(-30F, 3F, 2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[68].setRotationPoint(28F, 3F, 2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 213
		bodyModel[69].setRotationPoint(-30F, 3F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 213
		bodyModel[70].setRotationPoint(28F, 3F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 217
		bodyModel[71].setRotationPoint(29F, 2F, 9.51F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F); // Bolster end cull
		bodyModel[72].setRotationPoint(26F, 3F, 9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 217
		bodyModel[73].setRotationPoint(29F, 2F, -9.51F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F); // Bolster end cull
		bodyModel[74].setRotationPoint(26F, 3F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 217
		bodyModel[75].setRotationPoint(-33F, 2F, 8.51F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Bolster end cull
		bodyModel[76].setRotationPoint(-29F, 3F, 9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 217
		bodyModel[77].setRotationPoint(-33F, 2F, -8.51F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Bolster end cull
		bodyModel[78].setRotationPoint(-29F, 3F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 124 cull roof walkway
		bodyModel[79].setRotationPoint(-38F, -11F, 1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[80].setRotationPoint(-38.01F, -16.5F, 1F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[81].setRotationPoint(-38F, -15F, 2.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		bodyModel[82].setRotationPoint(-37F, -16.5F, 1.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 16, 0, 0F); // Box 132
		bodyModel[83].setRotationPoint(-37.25F, -12F, 3F);

		bodyModel[84].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[84].setRotationPoint(-29F, -2.5F, 2F);
		bodyModel[84].rotateAngleX = -0.78539816F;
		bodyModel[84].rotateAngleY = -1.57079633F;

		bodyModel[85].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[85].setRotationPoint(-29F, -2.5F, 0F);
		bodyModel[85].rotateAngleX = -0.78539816F;
		bodyModel[85].rotateAngleY = -1.57079633F;

		bodyModel[86].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0.25F, 0.25F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[86].setRotationPoint(-35.99F, -2.5F, 0F);
		bodyModel[86].rotateAngleX = -0.78539816F;

		bodyModel[87].addShapeBox(0F, -1F, -1F, 2, 1, 1, 0F,0F, 0.5F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[87].setRotationPoint(-33.5F, -2.5F, 0F);
		bodyModel[87].rotateAngleX = -0.78539816F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 234 CULL
		bodyModel[88].setRotationPoint(-30F, -4F, -2.05F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 234 CULL
		bodyModel[89].setRotationPoint(-31F, -3F, -3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 236 CULL
		bodyModel[90].setRotationPoint(36F, -19F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 236 CULL
		bodyModel[91].setRotationPoint(-37F, -19F, -2F);

		bodyModel[92].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[92].setRotationPoint(-31F, 0F, 5F);
		bodyModel[92].rotateAngleX = -0.78539816F;

		bodyModel[93].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[93].setRotationPoint(-33F, 0F, 5F);
		bodyModel[93].rotateAngleX = -0.78539816F;

		bodyModel[94].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[94].setRotationPoint(-31.5F, -1F, -7.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 318
		bodyModel[95].setRotationPoint(-32.5F, 0F, -7.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 247
		bodyModel[96].setRotationPoint(-34F, 0F, 5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 247
		bodyModel[97].setRotationPoint(-37F, 0F, 3.01F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[98].setRotationPoint(-35.01F, -4.5F, 1F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[99].setRotationPoint(-36F, -3F, 2.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		bodyModel[100].setRotationPoint(-37F, -4.5F, 1.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 0, 18, 16, 0F); // Box 252
		bodyModel[101].setRotationPoint(-36.01F, -15F, -8F);

		bodyModel[102].addBox(0F, 0F, 0F, 0, 18, 16, 0F); // Box 252
		bodyModel[102].setRotationPoint(36.01F, -15F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // bracket cull
		bodyModel[103].setRotationPoint(36.02F, 2F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // bracket cull
		bodyModel[104].setRotationPoint(-37.02F, 2F, 6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // bracing
		bodyModel[105].setRotationPoint(-28F, -1F, 8.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 72, 1, 1, 0F); // bracing
		bodyModel[106].setRotationPoint(-36F, 1F, 7.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 72, 1, 1, 0F); // bracing
		bodyModel[107].setRotationPoint(-36F, 1F, -8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F); // bracing
		bodyModel[108].setRotationPoint(-28F, -5F, 10.25F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F); // bracing
		bodyModel[109].setRotationPoint(-28F, -5F, -11.25F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F); // bracing
		bodyModel[110].setRotationPoint(-28F, -11F, 10.25F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F); // bracing
		bodyModel[111].setRotationPoint(-28F, -11F, -11.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F); // bracing
		bodyModel[112].setRotationPoint(8F, -5F, 10.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F); // bracing
		bodyModel[113].setRotationPoint(8F, -5F, -11.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F); // bracing
		bodyModel[114].setRotationPoint(8F, -11F, 10.25F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F); // bracing
		bodyModel[115].setRotationPoint(8F, -11F, -11.25F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 569
		bodyModel[116].setRotationPoint(-14F, -19.5F, -2.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 6, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F); // Box 9
		bodyModel[117].setRotationPoint(-21F, 3F, -7.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 6, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F); // Box 9
		bodyModel[118].setRotationPoint(-6.5F, 3F, -7.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F); // Box 9
		bodyModel[119].setRotationPoint(0.5F, 3F, -7.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 6, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F); // Box 9
		bodyModel[120].setRotationPoint(7.75F, 3F, -7.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 6, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F); // Box 9
		bodyModel[121].setRotationPoint(-3F, 3F, -7.5F);

		bodyModel[122].addBox(-6F, 0F, -7F, 4, 1, 7, 0F); // Box 114 cull
		bodyModel[122].setRotationPoint(13F, 8.5F, -3.5F);
		bodyModel[122].rotateAngleY = -3.14159265F;

		bodyModel[123].addBox(-0.5F, -0.5F, 0F, 1, 1, 10, 0F); // Box 117
		bodyModel[123].setRotationPoint(16.5F, 9F, -5F);
		bodyModel[123].rotateAngleZ = 0.78539816F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 6, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, -4F); // Box 9
		bodyModel[124].setRotationPoint(15F, 3F, -7.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 44, 1, 0, 0F); // Box 670
		bodyModel[125].setRotationPoint(-21F, 3F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 42, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, -1.05F, 0F, -2.15F, -1.05F, 0F, -2.15F, -1.05F, 0F, -0.85F, -1.05F, 0F, -0.85F); // Box 9
		bodyModel[126].setRotationPoint(-21F, 3F, -7.52F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // bracing
		bodyModel[127].setRotationPoint(-28F, -1F, -9.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 762
		bodyModel[128].setRotationPoint(-37F, 3F, 3.01F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 569
		bodyModel[129].setRotationPoint(-24F, -19.5F, -2.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 569
		bodyModel[130].setRotationPoint(19F, -19.5F, -2.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 569
		bodyModel[131].setRotationPoint(9F, -19.5F, -2.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 569
		bodyModel[132].setRotationPoint(-16F, -19.5F, -2.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 569
		bodyModel[133].setRotationPoint(-25F, -19.5F, -2.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 569
		bodyModel[134].setRotationPoint(20F, -19.5F, -2.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 569 hooker hatch
		bodyModel[135].setRotationPoint(-7F, -19.5F, -2.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 569
		bodyModel[136].setRotationPoint(11F, -19.5F, -2.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box hooker hatch
		bodyModel[137].setRotationPoint(2F, -19.5F, -2.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 3, 5, 17, 0F); // ph 4 grabs cull
		bodyModel[138].setRotationPoint(33.01F, -4F, -8.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 3, 5, 17, 0F); // ph 4 grabs cull
		bodyModel[139].setRotationPoint(-36.01F, -4F, -8.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 56, 6, 12, 0F); // Box 144
		bodyModel[140].setRotationPoint(-28F, -17F, -6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ladder cull
		bodyModel[141].setRotationPoint(-36.01F, -19F, 8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ladder cull
		bodyModel[142].setRotationPoint(33.01F, -19F, -9F);

		bodyModel[143].addBox(0F, 0F, 0F, 72, 1, 1, 0F); // Box 147
		bodyModel[143].setRotationPoint(-36F, -15F, -8.49F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.35F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.35F, 0F, 0.1F, -0.15F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.15F, 0F, -0.3F); // Box 147 EL/CNJ bracket
		bodyModel[144].setRotationPoint(-29F, -11F, -6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0.1F, -0.35F, 0F, 0.1F, -0.35F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 147 EL/CNJ bracket
		bodyModel[145].setRotationPoint(28F, -11F, -6F);

		bodyModel[146].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[146].setRotationPoint(-30F, -7F, 4F);
		bodyModel[146].rotateAngleX = -0.78539816F;
		bodyModel[146].rotateAngleY = -1.57079633F;

		bodyModel[147].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[147].setRotationPoint(-30F, -7F, 0F);
		bodyModel[147].rotateAngleX = -0.78539816F;
		bodyModel[147].rotateAngleY = -1.57079633F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, -2F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -2F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 322 cull
		bodyModel[148].setRotationPoint(-31F, -9F, -4F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Qussy Ladder cull
		bodyModel[149].setRotationPoint(-35.01F, -18F, -9F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Ladder cull
		bodyModel[150].setRotationPoint(35.01F, -18F, 8F);

		bodyModel[151].addBox(0F, 0F, 0F, 8, 15, 17, 0F); // weird end cage cull
		bodyModel[151].setRotationPoint(-36F, -14F, -8.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 8, 15, 17, 0F); // weird end cage cull
		bodyModel[152].setRotationPoint(28F, -14F, -8.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ladder cull
		bodyModel[153].setRotationPoint(-34.99F, -19F, -9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ladder cull
		bodyModel[154].setRotationPoint(34.99F, -19F, 8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ladder cull
		bodyModel[155].setRotationPoint(32.99F, -19F, 8F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ladder cull
		bodyModel[156].setRotationPoint(-35.99F, -19F, -9F);

		bodyModel[157].addBox(0F, 0F, 0F, 16, 2, 5, 0F); // B&O through hatch
		bodyModel[157].setRotationPoint(-8F, -19.5F, -2.5F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // B&O through hatch
		bodyModel[158].setRotationPoint(8F, -19.5F, -2.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 16, 2, 5, 0F); // B&O through hatch
		bodyModel[159].setRotationPoint(-27F, -19.5F, -2.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 16, 2, 5, 0F); // B&O through hatch
		bodyModel[160].setRotationPoint(11F, -19.5F, -2.5F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // B&O through hatch end
		bodyModel[161].setRotationPoint(27F, -19.5F, -1.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // B&O through hatch end
		bodyModel[162].setRotationPoint(-28F, -19.5F, -1.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // B&O through hatch end
		bodyModel[163].setRotationPoint(-9F, -19.5F, -1.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // B&O through hatch end
		bodyModel[164].setRotationPoint(8F, -19.5F, -1.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // B&O through hatch end
		bodyModel[165].setRotationPoint(10F, -19.5F, -1.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // B&O through hatch end
		bodyModel[166].setRotationPoint(-11F, -19.5F, -1.5F);

		bodyModel[167].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // CSX placard (f u messi)
		bodyModel[167].setRotationPoint(8F, 1.25F, -9.52F);
		bodyModel[167].rotateAngleZ = 0.78539816F;

		bodyModel[168].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // CSX placard (f u messi)
		bodyModel[168].setRotationPoint(-8F, 1.25F, 9.52F);
		bodyModel[168].rotateAngleZ = 0.78539816F;

		bodyModel[169].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // placard bracket cull
		bodyModel[169].setRotationPoint(-8.5F, 0.5F, 8.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // placard bracket cull
		bodyModel[170].setRotationPoint(7.5F, 0.5F, -9.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // CNJ hatches
		bodyModel[171].setRotationPoint(-22.5F, -19.5F, -2.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 569
		bodyModel[172].setRotationPoint(-2.5F, -19.5F, -2.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // CNJ hatches
		bodyModel[173].setRotationPoint(17.5F, -19.5F, -2.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // CNJ hatches
		bodyModel[174].setRotationPoint(-10F, -19.5F, -2.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // CNJ hatches
		bodyModel[175].setRotationPoint(5F, -19.5F, -2.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72 CNJ brakewheel
		bodyModel[176].setRotationPoint(-38.01F, -4.5F, 1F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87 CNJ stuff
		bodyModel[177].setRotationPoint(-38F, -3F, 2.5F);
	}
	//Model70TonTruck2 bogie = new Model70TonTruck2();
	Model70TonTruckEarly bogie = new Model70TonTruckEarly();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.8,0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.575,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

	}
}