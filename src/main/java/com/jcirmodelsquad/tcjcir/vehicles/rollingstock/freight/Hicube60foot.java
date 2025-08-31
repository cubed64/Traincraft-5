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

    public Hicube60foot(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "TBOX");
        textureDescriptionMap.put(1, "Generic Red");
        textureDescriptionMap.put(2, "Generic Red (Graffiti)");
        textureDescriptionMap.put(3, "CSXT");
        textureDescriptionMap.put(4, "PRD");
        textureDescriptionMap.put(5, "PRD");
        textureDescriptionMap.put(6, "UP");
        textureDescriptionMap.put(7, "Generic White");
        textureDescriptionMap.put(8, "Generic Blue");
        textureDescriptionMap.put(9, "MT&S");
        textureDescriptionMap.put(10, "Generic Yellow");
        textureDescriptionMap.put(11, "Generic Green");
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
