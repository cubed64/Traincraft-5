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
        InsertTexture(0, "Generic Light Grey");
        InsertTexture(1, "Generic Black");
        InsertTexture(2, "OWO (Ballast Service)");
        InsertTexture(3, "WP");
        InsertTexture(4, "CD&P (Crushed Marble Service)");
        InsertTexture(5, "FNCC (MOW Ballast Service)");
        InsertTexture(6, "AA");
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