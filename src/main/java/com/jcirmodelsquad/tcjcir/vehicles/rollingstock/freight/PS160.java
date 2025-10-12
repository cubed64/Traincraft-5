package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PS160 extends AbstractStandardFreightCar
{
    public PS160(World world)
    {
        super(world);
    }

    public PS160(World world, double x, double y, double z){
        super(world, x , y, z);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "GT");
        InsertTexture(1, "IC");
        InsertTexture(2, "WRX (Tree Logo)");
        InsertTexture(3, "WRX (Slant Scheme)");
    }

    @Override
    public String getInventoryName() {
        return "Pullman Standard 60' Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.8125F;
    }
}
