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

    public PRRGLaHopper(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "PRR");
        textureDescriptionMap.put(1, "NYC");
        textureDescriptionMap.put(2, "PRR MOW");
        textureDescriptionMap.put(3, "PRR MOW");
        textureDescriptionMap.put(4, "NEP");
        textureDescriptionMap.put(5, "NEP NOW");
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
