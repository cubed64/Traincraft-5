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
        textureDescriptionMap.put(0, "themilwaukeeroad");
        textureDescriptionMap.put(1, "themilwaukeeroad");
        textureDescriptionMap.put(2, "themilwaukeeroad");
        textureDescriptionMap.put(3, "themilwaukeeroad");
        textureDescriptionMap.put(4, "themilwaukeeroad");
        textureDescriptionMap.put(5, "themilwaukeeroad");
        textureDescriptionMap.put(6, "FAWX");
        textureDescriptionMap.put(7, "MRSX");
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