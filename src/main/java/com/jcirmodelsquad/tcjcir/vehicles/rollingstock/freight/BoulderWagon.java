package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class BoulderWagon extends AbstractStandardFreightCar
{
    public BoulderWagon(World world) {
        super(world);
    }

    public BoulderWagon(World world, double x, double y, double z){
        super(world, x, y, z);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }

    @Override
    public void setupTextureDescription()
    {

    }

    @Override
    public String getInventoryName() {
        return "Boulder Wagon";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0.8F;
    }

    @Override
    public int getInventoryStackLimit() {
        return 1;
    }
}
