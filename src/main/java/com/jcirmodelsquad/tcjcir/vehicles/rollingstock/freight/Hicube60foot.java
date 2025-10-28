package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Hicube60foot extends AbstractStandardFreightCar
{
    public Hicube60foot(World world) {
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
        InsertTexture(0, "TBOX");
        InsertTexture(1, "Generic Red");
        InsertTexture(2, "Generic Red (Graffiti)");
        InsertTexture(3, "CSXT");
        InsertTexture(4, "PRD");
        InsertTexture(5, "PRD");
        InsertTexture(6, "UP");
        InsertTexture(7, "Generic White");
        InsertTexture(8, "Generic Blue");
        InsertTexture(9, "MT&S");
        InsertTexture(10, "Generic Yellow");
        InsertTexture(11, "Generic Green");
    }

    @Override
    public String getInventoryName() {
        return "Gunderson 60' Hi-Cube Double Door Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.9F;
    }
}
