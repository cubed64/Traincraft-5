package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Wood1912Boxcar extends AbstractStandardFreightCar
{
    public Wood1912Boxcar(World world) {
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
        InsertTexture(0, "CDCS");
        InsertTexture(1, "Generic");
        InsertTexture(2, "Generic (Red)");
        InsertTexture(3, "Generic (Yellow)");
        InsertTexture(4, "Generic (Green)");
    }

    @Override
    public String getInventoryName() {
        return "1912 Wood Sheathed Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.12F;
    }
}