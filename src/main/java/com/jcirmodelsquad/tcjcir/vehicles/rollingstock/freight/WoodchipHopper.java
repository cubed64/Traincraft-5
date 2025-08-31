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
        textureDescriptionMap.put(0, "CHIP");
        textureDescriptionMap.put(1, "GN");
        textureDescriptionMap.put(2, "BN");
        textureDescriptionMap.put(3, "MILW");
        textureDescriptionMap.put(4, "ATSF");
        textureDescriptionMap.put(5, "OWO");
        textureDescriptionMap.put(6, "FNCC");
        textureDescriptionMap.put(7, "FNCC (Ex BTR)");
        textureDescriptionMap.put(8, "FNCC (Ex BTR)");
        textureDescriptionMap.put(9, "WP");
        textureDescriptionMap.put(10, "DN");
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
