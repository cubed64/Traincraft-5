
//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:07.05.2019 - 11:39:08
// Last changed on: 07.05.2019 - 11:39:08

package com.jcirmodelsquad.tcjcir.models.trains;

import com.jcirmodelsquad.tcjcir.models.containers.ModelISO_40FT_Item;
import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.HuskyStackWellcar;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelHuskyStackWellcar extends ModelConverter
{
    int textureX = 512;
    int textureY = 128;

    public ModelHuskyStackWellcar() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[66];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 182, 20, textureX, textureY); // Box 62
        bodyModel[1] = new ModelRendererTurbo(this, 182, 41, textureX, textureY); // Box 89
        bodyModel[2] = new ModelRendererTurbo(this, 342, 46, textureX, textureY); // Box 90
        bodyModel[3] = new ModelRendererTurbo(this, 176, 25, textureX, textureY); // Box 91
        bodyModel[4] = new ModelRendererTurbo(this, 348, 33, textureX, textureY, "cull"); // Box 95 cull walkway
        bodyModel[5] = new ModelRendererTurbo(this, 176, 46, textureX, textureY); // Box 99
        bodyModel[6] = new ModelRendererTurbo(this, 342, 25, textureX, textureY); // Box 100
        bodyModel[7] = new ModelRendererTurbo(this, 202, 46, textureX, textureY); // Box 102
        bodyModel[8] = new ModelRendererTurbo(this, 202, 25, textureX, textureY); // Box 103
        bodyModel[9] = new ModelRendererTurbo(this, 329, 46, textureX, textureY); // Box 104
        bodyModel[10] = new ModelRendererTurbo(this, 189, 25, textureX, textureY); // Box 106
        bodyModel[11] = new ModelRendererTurbo(this, 189, 46, textureX, textureY); // Box 110
        bodyModel[12] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 112
        bodyModel[13] = new ModelRendererTurbo(this, 183, 62, textureX, textureY); // Box 101
        bodyModel[14] = new ModelRendererTurbo(this, 113, 94, textureX, textureY); // Box 69
        bodyModel[15] = new ModelRendererTurbo(this, 113, 94, textureX, textureY); // Box 70
        bodyModel[16] = new ModelRendererTurbo(this, 100, 95, textureX, textureY); // Box 71
        bodyModel[17] = new ModelRendererTurbo(this, 100, 95, textureX, textureY); // Box 72
        bodyModel[18] = new ModelRendererTurbo(this, 82, 69, textureX, textureY); // Box 51
        bodyModel[19] = new ModelRendererTurbo(this, 82, 69, textureX, textureY); // Box 52
        bodyModel[20] = new ModelRendererTurbo(this, 91, 69, textureX, textureY); // Box 54
        bodyModel[21] = new ModelRendererTurbo(this, 91, 69, textureX, textureY); // Box 55
        bodyModel[22] = new ModelRendererTurbo(this, 121, 101, textureX, textureY); // Box 46
        bodyModel[23] = new ModelRendererTurbo(this, 121, 101, textureX, textureY); // Box 77
        bodyModel[24] = new ModelRendererTurbo(this, 150, 90, textureX, textureY); // Box 319
        bodyModel[25] = new ModelRendererTurbo(this, 287, 37, textureX, textureY); // Box 322
        bodyModel[26] = new ModelRendererTurbo(this, 175, 105, textureX, textureY); // Box 411
        bodyModel[27] = new ModelRendererTurbo(this, 175, 100, textureX, textureY); // Box 412
        bodyModel[28] = new ModelRendererTurbo(this, 393, 37, textureX, textureY, "cull"); // Box 413 cull walkway
        bodyModel[29] = new ModelRendererTurbo(this, 394, 31, textureX, textureY, "cull"); // Box 414 cull walkway
        bodyModel[30] = new ModelRendererTurbo(this, 394, 47, textureX, textureY, "cull"); // Box 415 cull walkway
        bodyModel[31] = new ModelRendererTurbo(this, 328, 57, textureX, textureY); // Box 416
        bodyModel[32] = new ModelRendererTurbo(this, 379, 33, textureX, textureY, "cull"); // Box 417 cull walkway
        bodyModel[33] = new ModelRendererTurbo(this, 379, 49, textureX, textureY, "cull"); // Box 418 cull walkway
        bodyModel[34] = new ModelRendererTurbo(this, 380, 10, textureX, textureY, "cull"); // Box 419 cull
        bodyModel[35] = new ModelRendererTurbo(this, 130, 33, textureX, textureY, "cull"); // Box 95 cull walkway
        bodyModel[36] = new ModelRendererTurbo(this, 176, 92, textureX, textureY); // Box 319
        bodyModel[37] = new ModelRendererTurbo(this, 201, 107, textureX, textureY); // Box 411
        bodyModel[38] = new ModelRendererTurbo(this, 201, 102, textureX, textureY); // Box 412
        bodyModel[39] = new ModelRendererTurbo(this, 89, 37, textureX, textureY, "cull"); // Box 413 cull walkway
        bodyModel[40] = new ModelRendererTurbo(this, 118, 32, textureX, textureY, "cull"); // Box 414 cull walkway
        bodyModel[41] = new ModelRendererTurbo(this, 118, 47, textureX, textureY, "cull"); // Box 415 cull walkway
        bodyModel[42] = new ModelRendererTurbo(this, 142, 57, textureX, textureY); // Box 416
        bodyModel[43] = new ModelRendererTurbo(this, 133, 34, textureX, textureY, "cull"); // Box 417 cull walkway
        bodyModel[44] = new ModelRendererTurbo(this, 133, 49, textureX, textureY, "cull"); // Box 418 cull walkway
        bodyModel[45] = new ModelRendererTurbo(this, 112, 11, textureX, textureY, "cull"); // Box 419 cull
        bodyModel[46] = new ModelRendererTurbo(this, 203, 37, textureX, textureY); // Box 431
        bodyModel[47] = new ModelRendererTurbo(this, 130, 80, textureX, textureY); // Box 286
        bodyModel[48] = new ModelRendererTurbo(this, 119, 80, textureX, textureY); // Box 287
        bodyModel[49] = new ModelRendererTurbo(this, 114, 86, textureX, textureY); // Box 434
        bodyModel[50] = new ModelRendererTurbo(this, 114, 86, textureX, textureY); // Box 435
        bodyModel[51] = new ModelRendererTurbo(this, 124, 74, textureX, textureY); // Box 491
        bodyModel[52] = new ModelRendererTurbo(this, 117, 73, textureX, textureY); // Box 93
        bodyModel[53] = new ModelRendererTurbo(this, 110, 74, textureX, textureY); // Box 94
        bodyModel[54] = new ModelRendererTurbo(this, 103, 80, textureX, textureY); // Box 95
        bodyModel[55] = new ModelRendererTurbo(this, 113, 85, textureX, textureY); // Box 440
        bodyModel[56] = new ModelRendererTurbo(this, 102, 84, textureX, textureY); // Box 441
        bodyModel[57] = new ModelRendererTurbo(this, 104, 62, textureX, textureY); // Box 72
        bodyModel[58] = new ModelRendererTurbo(this, 107, 64, textureX, textureY); // Box 87
        bodyModel[59] = new ModelRendererTurbo(this, 112, 60, textureX, textureY); // Box 87
        bodyModel[60] = new ModelRendererTurbo(this, 101, 67, textureX, textureY); // Box 132
        bodyModel[61] = new ModelRendererTurbo(this, 98, 60, textureX, textureY); // Box 446
        bodyModel[62] = new ModelRendererTurbo(this, 149, 95, textureX, textureY); // Box 720
        bodyModel[63] = new ModelRendererTurbo(this, 149, 91, textureX, textureY); // Box 721
        bodyModel[64] = new ModelRendererTurbo(this, 149, 99, textureX, textureY); // Box 80
        bodyModel[65] = new ModelRendererTurbo(this, 149, 97, textureX, textureY); // Box 718

        bodyModel[0].addBox(0F, 0F, 0F, 82, 3, 1, 0F); // Box 62
        bodyModel[0].setRotationPoint(-41F, 0F, -11F);

        bodyModel[1].addBox(0F, 0F, 0F, 82, 3, 1, 0F); // Box 89
        bodyModel[1].setRotationPoint(-41F, 0F, 10F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 90
        bodyModel[2].setRotationPoint(-41F, 3F, 10F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        bodyModel[3].setRotationPoint(-41F, 3F, -11F);

        bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 95 cull walkway
        bodyModel[4].setRotationPoint(-36F, -1F, -11F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 99
        bodyModel[5].setRotationPoint(36F, 3F, 10F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        bodyModel[6].setRotationPoint(36F, 3F, -11F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 62, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 102
        bodyModel[7].setRotationPoint(-31F, 3F, 10F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 62, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
        bodyModel[8].setRotationPoint(-31F, 3F, -11F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F); // Box 104
        bodyModel[9].setRotationPoint(-36F, 3F, 10F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 106
        bodyModel[10].setRotationPoint(-36F, 3F, -11F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, -1F); // Box 110
        bodyModel[11].setRotationPoint(31F, 3F, 10F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 112
        bodyModel[12].setRotationPoint(31F, 3F, -11F);

        bodyModel[13].addBox(0F, 0F, 0F, 62, 1, 20, 0F); // Box 101
        bodyModel[13].setRotationPoint(-31F, 8F, -10F);

        bodyModel[14].addBox(0F, 0F, 0F, 12, 2, 4, 0F); // Box 69
        bodyModel[14].setRotationPoint(-50.5F, 3F, -2F);

        bodyModel[15].addBox(0F, 0F, 0F, 12, 2, 4, 0F); // Box 70
        bodyModel[15].setRotationPoint(38.5F, 3F, -2F);

        bodyModel[16].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 71
        bodyModel[16].setRotationPoint(-53.5F, 3F, -1.5F);

        bodyModel[17].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 72
        bodyModel[17].setRotationPoint(50.5F, 3F, -1.5F);

        bodyModel[18].addBox(0F, 0F, 0F, 4, 13, 0, 0F); // Box 51
        bodyModel[18].setRotationPoint(-50F, -6F, -10.01F);

        bodyModel[19].addBox(0F, 0F, 0F, 4, 13, 0, 0F); // Box 52
        bodyModel[19].setRotationPoint(46F, -6F, -10.01F);

        bodyModel[20].addBox(0F, 0F, 0F, 4, 13, 0, 0F); // Box 54
        bodyModel[20].setRotationPoint(-50F, -6F, 10.01F);

        bodyModel[21].addBox(0F, 0F, 0F, 4, 13, 0, 0F); // Box 55
        bodyModel[21].setRotationPoint(46F, -6F, 10.01F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 46
        bodyModel[22].setRotationPoint(-43F, 4.1F, -2F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 77
        bodyModel[23].setRotationPoint(39F, 4.1F, -2F);

        bodyModel[24].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 319
        bodyModel[24].setRotationPoint(-50F, 2.5F, -10F);

        bodyModel[25].addBox(0F, 0F, 0F, 0, 4, 20, 0F); // Box 322
        bodyModel[25].setRotationPoint(-31.01F, 4F, -10F);

        bodyModel[26].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 411
        bodyModel[26].setRotationPoint(-48F, 2.5F, -10F);

        bodyModel[27].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 412
        bodyModel[27].setRotationPoint(-48F, 2.5F, 7F);

        bodyModel[28].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 413 cull walkway
        bodyModel[28].setRotationPoint(-50F, 1.5F, -10F);

        bodyModel[29].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 414 cull walkway
        bodyModel[29].setRotationPoint(-46F, 0F, -10F);

        bodyModel[30].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 415 cull walkway
        bodyModel[30].setRotationPoint(-46F, 0F, 6F);

        bodyModel[31].addBox(0F, 0F, 0F, 10, 4, 20, 0F); // Box 416
        bodyModel[31].setRotationPoint(-41F, 0F, -10F);

        bodyModel[32].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 417 cull walkway
        bodyModel[32].setRotationPoint(-41F, -1F, -10F);

        bodyModel[33].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 418 cull walkway
        bodyModel[33].setRotationPoint(-41F, -1F, 6F);

        bodyModel[34].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 419 cull
        bodyModel[34].setRotationPoint(-46F, 1F, -9F);

        bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 95 cull walkway
        bodyModel[35].setRotationPoint(32F, -1F, -11F);

        bodyModel[36].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 319
        bodyModel[36].setRotationPoint(48F, 2.5F, -10F);

        bodyModel[37].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 411
        bodyModel[37].setRotationPoint(41F, 2.5F, -10F);

        bodyModel[38].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 412
        bodyModel[38].setRotationPoint(41F, 2.5F, 7F);

        bodyModel[39].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 413 cull walkway
        bodyModel[39].setRotationPoint(46F, 1.5F, -10F);

        bodyModel[40].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 414 cull walkway
        bodyModel[40].setRotationPoint(41F, 0F, -10F);

        bodyModel[41].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 415 cull walkway
        bodyModel[41].setRotationPoint(41F, 0F, 6F);

        bodyModel[42].addBox(0F, 0F, 0F, 10, 4, 20, 0F); // Box 416
        bodyModel[42].setRotationPoint(31F, 0F, -10F);

        bodyModel[43].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 417 cull walkway
        bodyModel[43].setRotationPoint(36F, -1F, -10F);

        bodyModel[44].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 418 cull walkway
        bodyModel[44].setRotationPoint(36F, -1F, 6F);

        bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 419 cull
        bodyModel[45].setRotationPoint(45F, 1F, -9F);

        bodyModel[46].addBox(0F, 0F, 0F, 0, 4, 20, 0F); // Box 431
        bodyModel[46].setRotationPoint(31.01F, 4F, -10F);

        bodyModel[47].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
        bodyModel[47].setRotationPoint(38.5F, -2F, 3F);
        bodyModel[47].rotateAngleX = -0.78539816F;
        bodyModel[47].rotateAngleY = -1.57079633F;

        bodyModel[48].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
        bodyModel[48].setRotationPoint(38.5F, -2F, 0F);
        bodyModel[48].rotateAngleX = -0.78539816F;
        bodyModel[48].rotateAngleY = -1.57079633F;

        bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
        bodyModel[49].setRotationPoint(37.5F, -2F, -4F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 435
        bodyModel[50].setRotationPoint(37.5F, -2F, 3F);

        bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 491
        bodyModel[51].setRotationPoint(41.5F, -2F, -5F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 93
        bodyModel[52].setRotationPoint(42.5F, -3F, -5F);

        bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 94
        bodyModel[53].setRotationPoint(43.5F, -2F, -5F);

        bodyModel[54].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 95
        bodyModel[54].setRotationPoint(41.5F, 0F, -6F);

        bodyModel[55].addShapeBox(-4F, 0F, 0F, 8, 0, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 440
        bodyModel[55].setRotationPoint(43.5F, -1.5F, -3F);
        bodyModel[55].rotateAngleZ = -0.19198622F;

        bodyModel[56].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 441
        bodyModel[56].setRotationPoint(41.5F, 0F, -3F);
        bodyModel[56].rotateAngleX = 5.23598776F;

        bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
        bodyModel[57].setRotationPoint(-51.01F, -5F, 2F);

        bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
        bodyModel[58].setRotationPoint(-51F, -3.5F, 3.5F);

        bodyModel[59].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 87
        bodyModel[59].setRotationPoint(-50.5F, -4F, 2.5F);

        bodyModel[60].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 132
        bodyModel[60].setRotationPoint(-49.5F, -1.5F, 4F);
        bodyModel[60].rotateAngleZ = -0.03490659F;

        bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 446
        bodyModel[61].setRotationPoint(-50.5F, -1F, 2.5F);

        bodyModel[62].addShapeBox(-8F, -1F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 720
        bodyModel[62].setRotationPoint(52F, 4.5F, 0F);
        bodyModel[62].rotateAngleY = 1.36135682F;

        bodyModel[63].addBox(-10F, -1F, 0F, 10, 3, 0, 0F); // Box 721
        bodyModel[63].setRotationPoint(52F, 4.5F, 0F);
        bodyModel[63].rotateAngleY = 1.36135682F;

        bodyModel[64].addBox(0F, -1F, 0F, 10, 3, 0, 0F); // Box 80
        bodyModel[64].setRotationPoint(-52F, 4.5F, 0F);
        bodyModel[64].rotateAngleY = 1.36135682F;

        bodyModel[65].addShapeBox(3F, -1F, 0F, 5, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 718
        bodyModel[65].setRotationPoint(-52F, 4.5F, 0F);
        bodyModel[65].rotateAngleY = 1.36135682F;
    }

    //Model70Truck bogie = new Model70Truck();
    Model70TonTruck2 bogie = new Model70TonTruck2();
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 66; i++)
            if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
                GL11.glDisable(GL11.GL_CULL_FACE);
                bodyModel[i].render(f5);
                GL11.glEnable(GL11.GL_CULL_FACE);
            } else {
                bodyModel[i].render(f5);
            }
        Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));

        GL11.glPushMatrix();
        GL11.glScalef(1F,1F,1f);
        GL11.glTranslated(-2.55,-0.0,0);//front
        bogie.render(entity,f,f1,f2,f3,f4,f5);

        GL11.glTranslated(5.1,0,0.00);//rear
        bogie.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();

        if (entity instanceof HuskyStackWellcar) {
            HuskyStackWellcar wellcar = (HuskyStackWellcar)entity;
            if (wellcar.container1 != null && wellcar.container1.theType.equals("FortyFootContainer")) {
                ModelISO_40FT_Item theContainer = new ModelISO_40FT_Item();
                Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/ISO_40FT_" + wellcar.container1.color + ".png"));

                GL11.glPushMatrix();
                GL11.glScalef(1,1,1f);
                GL11.glTranslated(0,0,0);
                theContainer.render(entity, f, f1, f2, f3, f4, f5);
                GL11.glPopMatrix();
            }
            if (wellcar.container2 != null && wellcar.container2.theType.equals("FortyFootContainer")) {
                ModelISO_40FT_Item theContainer = new ModelISO_40FT_Item();
                Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/ISO_40FT_" + wellcar.container2.color + ".png"));

                GL11.glPushMatrix();
                GL11.glScalef(1,1,1f);
                GL11.glTranslated(0,-1.313,0);
                theContainer.render(entity, f, f1, f2, f3, f4, f5);
                GL11.glPopMatrix();
            }
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo huskystackwellcarModel[];
}
