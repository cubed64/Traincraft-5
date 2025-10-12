package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class VersaTrans extends AbstractStandardFreightCar
{
    public VersaTrans(World world) {
        super(world);
    }

    public VersaTrans(World world, double x, double y, double z){
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
        InsertTexture(0, "Generic Blue");
        InsertTexture(1, "Generic Dark Grey");
        InsertTexture(2, "Generic Light Grey");
        InsertTexture(3, "CSXT");
    }

    @Override
    public String getInventoryName() {
        return "Versaflood Transverse Hopper";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2F;
    }
}