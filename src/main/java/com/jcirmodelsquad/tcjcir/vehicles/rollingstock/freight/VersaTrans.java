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
        textureDescriptionMap.put(0, "Generic Blue");
        textureDescriptionMap.put(1, "Generic Dark Grey");
        textureDescriptionMap.put(2, "Generic Light Grey");
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