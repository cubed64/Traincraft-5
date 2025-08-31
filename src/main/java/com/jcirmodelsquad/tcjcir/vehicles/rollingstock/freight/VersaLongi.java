package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class VersaLongi extends AbstractStandardFreightCar
{
    public VersaLongi(World world) {
        super(world);
    }

    public VersaLongi(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "Generic Light Grey");
        textureDescriptionMap.put(1, "Generic Black");
        textureDescriptionMap.put(2, "OWO (Ballast Service)");
        textureDescriptionMap.put(3, "WP");
        textureDescriptionMap.put(4, "CD&P (Crushed Marble Service)");
        textureDescriptionMap.put(5, "FNCC (MOW Ballast Service)");
        textureDescriptionMap.put(6, "AA");
    }

    @Override
    public String getInventoryName() {
        return "Versaflood Longitudinal Hopper";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2F;
    }
}