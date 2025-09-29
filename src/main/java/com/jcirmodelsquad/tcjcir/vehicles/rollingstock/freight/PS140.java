package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PS140 extends AbstractStandardFreightCar
{
    public PS140(World world)
    {
        super(world);
    }

    public PS140(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "ATSF");
        textureDescriptionMap.put(1, "NYC (Pacemaker)");
        textureDescriptionMap.put(2, "RI");
        textureDescriptionMap.put(3, "CPR (Multimark)");
        textureDescriptionMap.put(4, "FNCC");
        textureDescriptionMap.put(5, "FNCC (Quick Scheme)");
        textureDescriptionMap.put(6, "BLUX");
        textureDescriptionMap.put(7, "REDX");
        textureDescriptionMap.put(8, "REDX (Smudge)");
        textureDescriptionMap.put(9, "TFIndustries Generic");
        textureDescriptionMap.put(10, "BNNA");
        textureDescriptionMap.put(11, "DLMR");
        textureDescriptionMap.put(12, "DLMR");
        textureDescriptionMap.put(13, "DLMR");
        textureDescriptionMap.put(14, "TIRY");
        textureDescriptionMap.put(15, "TIRY");
        textureDescriptionMap.put(16, "GLNT");
        textureDescriptionMap.put(17, "AGW");
        textureDescriptionMap.put(18, "AGW");
        textureDescriptionMap.put(19, "CDCS");
        textureDescriptionMap.put(20, "SOU");
    }

    @Override
    public String getInventoryName() {
        return "Pullman Standard 40' Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.875F;
    }
}