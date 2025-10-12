package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PCF_B100 extends AbstractStandardFreightCar
{
    public PCF_B100(World world) {
        super(world);
    }

    public PCF_B100(World world, double x, double y, double z){
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
        InsertTexture(0, "VCY 'Golden West'");
        InsertTexture(1, "SP");
        InsertTexture(2, "SP (B-100-43)");
        InsertTexture(3, "AMTK (Silver)");
        InsertTexture(4, "AMTK (Green)");
        InsertTexture(5, "Blandsville & Blankerston");
        InsertTexture(6, "UP (Brown)");
        InsertTexture(7, "");
        InsertTexture(8, "");
        InsertTexture(9, "");
        InsertTexture(10, "");
    }

    @Override
    public String getInventoryName() {
        return "PC&F B-100-40 Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.85F;
    }
}
