package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PCF6033 extends AbstractStandardFreightCar
{
    public PCF6033(World world) {
        super(world);
    }

    public PCF6033(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "SP");
        textureDescriptionMap.put(1, "SSW");
        textureDescriptionMap.put(2, "Generic Brown");
        textureDescriptionMap.put(3, "ARR");
        textureDescriptionMap.put(4, "ATSF (Early)");
        textureDescriptionMap.put(5, "ATSF");
        textureDescriptionMap.put(6, "UP");
        textureDescriptionMap.put(7, "WC");
        textureDescriptionMap.put(8, "WRX");
        textureDescriptionMap.put(9, "WRX (Tree Logo)");
        textureDescriptionMap.put(10, "WRX (Washaska Text)");
        textureDescriptionMap.put(11, "BNBX");
        textureDescriptionMap.put(12, "GCM");
        textureDescriptionMap.put(13, "SP (Paper Service)");
        textureDescriptionMap.put(14, "WP");
        textureDescriptionMap.put(15, "");
        textureDescriptionMap.put(16, "");
    }

    @Override
    public String getInventoryName() {
        return "PC&F 6033 Cu Ft High Rectangular Prism";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.85F;
    }
}
