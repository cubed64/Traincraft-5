package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class MILW40boxcar extends AbstractStandardFreightCar
{
    public MILW40boxcar(World world) {
        super(world);
    }

    public MILW40boxcar(World world, double x, double y, double z) {
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
        InsertTexture(0, "themilwaukeeroad");
        InsertTexture(1, "themilwaukeeroad");
        InsertTexture(2, "themilwaukeeroad");
        InsertTexture(3, "themilwaukeeroad");
        InsertTexture(4, "themilwaukeeroad");
        InsertTexture(5, "themilwaukeeroad");
        InsertTexture(6, "FAWX");
        InsertTexture(7, "MRSX");
    }

    @Override
    public String getInventoryName() {
        return "MILW 40' Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2F;
    }
}