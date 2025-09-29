package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PS150 extends AbstractStandardFreightCar
{
    public PS150(World world) {
        super(world);
    }

    public PS150(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "BAR (State of Maine)");
        textureDescriptionMap.put(1, "Penn Central (The Best Railroad)");
        textureDescriptionMap.put(2, "ATSF");
        textureDescriptionMap.put(3, "DRGW");
        textureDescriptionMap.put(4, "BLUX");
        textureDescriptionMap.put(5, "REDX");
        textureDescriptionMap.put(6, "TIRY");
        textureDescriptionMap.put(7, "DLMR");
        textureDescriptionMap.put(8, "DLMR 2");
        textureDescriptionMap.put(9, "ANN ARBOR");
        textureDescriptionMap.put(10, "FNCC (Simple)");
        textureDescriptionMap.put(11, "FNCC");
        textureDescriptionMap.put(12, "AGW");
        textureDescriptionMap.put(13, "AGW");
    }

    @Override
    public String getInventoryName() {
        return "Pullman Standard 50' Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.3125F;
    }
}