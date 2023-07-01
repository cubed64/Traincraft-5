//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:16.07.2020 - 19:16:29
// Last changed on: 16.07.2020 - 19:16:29

package com.jcirmodelsquad.tcjcir.models.containers;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelISO_40FT_Item extends ModelConverter //Same as Filename
{
    int textureX = 256;
    int textureY = 64;

    public ModelISO_40FT_Item() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[1];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 42, 12, textureX, textureY); // 40ft Container

        bodyModel[0].addBox(0F, 0F, 0F, 62, 21, 18, 0F); // 40ft Container
        bodyModel[0].setRotationPoint(-31F, -10.5F, -9F);
    }
}