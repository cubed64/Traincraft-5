package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class GN40 extends AbstractStandardFreightCar
{
    public GN40(World world) {
        super(world);

    }

    public GN40(World world, double d, double d1, double d2) {
        super(world, d, d1, d2);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "GN (Aluminum Express Boxcar)");
        InsertTexture(1, "GN (Plywood Side Homebuilt Boxcar)");
    }

    @Override
    public String getInventoryName() {
        return "Great Northern Homebuilt 40' Boxcar(s)";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.93F;
    }
}