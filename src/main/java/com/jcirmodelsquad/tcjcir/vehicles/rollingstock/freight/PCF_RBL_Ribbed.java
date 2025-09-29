package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PCF_RBL_Ribbed extends AbstractStandardFreightCar
{
    public PCF_RBL_Ribbed(World world) {
        super(world);
    }

    public PCF_RBL_Ribbed(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "PC");
        textureDescriptionMap.put(1, "CR");
        textureDescriptionMap.put(2, "ATSF (As Delivered)");
        textureDescriptionMap.put(3, "ATSF");
        textureDescriptionMap.put(4, "SLSF");
        textureDescriptionMap.put(5, "SLSF");
        textureDescriptionMap.put(6, "BN (Ex SLSF)");
        textureDescriptionMap.put(7, "DRGW");
        textureDescriptionMap.put(8, "MP");
        textureDescriptionMap.put(9, "T&P");
        textureDescriptionMap.put(10, "UP");
        textureDescriptionMap.put(11, "Generic Brown");
        textureDescriptionMap.put(12, "BB (Youngstown Door)");
    }

    @Override
    public String getInventoryName() {
        return "PC&F RBL Ribbedside Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.85F;
    }
}
