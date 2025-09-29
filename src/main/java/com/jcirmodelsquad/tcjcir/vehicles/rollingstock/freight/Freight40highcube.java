package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Freight40highcube extends AbstractStandardFreightCar
{
    public Freight40highcube(World world) {
        super(world);
    }

    public Freight40highcube(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "BAWX");
        textureDescriptionMap.put(1, "BN");
        textureDescriptionMap.put(2, "NP");
        textureDescriptionMap.put(3, "IC");
        textureDescriptionMap.put(4, "BEEPX & BOOPX");
        textureDescriptionMap.put(5, "ATSF");
        textureDescriptionMap.put(6, "MT&S");
        textureDescriptionMap.put(7, "MILW");
        textureDescriptionMap.put(8, "CBQ");
        textureDescriptionMap.put(9, "CBQ");
        textureDescriptionMap.put(10, "CBQ");
        textureDescriptionMap.put(11, "DRGW");
        textureDescriptionMap.put(12, "DRGW");
        textureDescriptionMap.put(13, "ICG");
        textureDescriptionMap.put(14, "FNCC");
        textureDescriptionMap.put(15, "FNCC (Foxtail logo)");
        textureDescriptionMap.put(16, "OC&G");
    }

    @Override
    public String getInventoryName() {
        return "40 foot Highcube Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2F;
    }
}
