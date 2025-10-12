package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class WoodchipHopper extends AbstractStandardFreightCar
{
    public WoodchipHopper(World world) {
        super(world);
    }

    public WoodchipHopper(World world, double x, double y, double z){
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
        InsertTexture(0, "CHIP");
        InsertTexture(1, "GN");
        InsertTexture(2, "BN");
        InsertTexture(3, "MILW");
        InsertTexture(4, "ATSF");
        InsertTexture(5, "OWO");
        InsertTexture(6, "FNCC");
        InsertTexture(7, "FNCC (Ex BTR)");
        InsertTexture(8, "FNCC (Ex BTR)");
        InsertTexture(9, "WP");
        InsertTexture(10, "DN");
    }

    @Override
    public String getInventoryName() {
        return "55 Foot Woodchip Hopper";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.8F;
    }
}
