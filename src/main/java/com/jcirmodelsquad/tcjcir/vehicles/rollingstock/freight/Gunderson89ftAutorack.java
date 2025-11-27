package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class Gunderson89ftAutorack extends AbstractStandardFixedFreightCar
{
    public Gunderson89ftAutorack(World world)
    {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "TrailerTrain Cooperation");
        InsertTexture(1, "BNSF");
        InsertTexture(2, "KCS");
        InsertTexture(3, "CSXT");
        InsertTexture(4, "NS");
        InsertTexture(5, "NS");
        InsertTexture(6, "UP");
    }

    @Override
    public String getInventoryName() {
        return "Gunderson 89' Enclosed Autorack";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 4.4F;
    }

    @Override
    public int getInventoryStackLimit() {
        return 1;
    }

}
