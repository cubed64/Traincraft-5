package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PRRGLaHopper extends AbstractStandardFreightCar
{
    public PRRGLaHopper(World world) {
        super(world);
    }



    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "PRR");
        InsertTexture(1, "NYC");
        InsertTexture(2, "PRR MOW");
        InsertTexture(3, "PRR MOW");
        InsertTexture(4, "NEP");
        InsertTexture(5, "NEP NOW");
    }

    @Override
    public String getInventoryName() {
        return "PRR GLa hopper/clone hopper";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.7F;
    }
}
