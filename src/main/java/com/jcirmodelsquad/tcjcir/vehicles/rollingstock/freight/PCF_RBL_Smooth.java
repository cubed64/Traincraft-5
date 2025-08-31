package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PCF_RBL_Smooth extends AbstractStandardFreightCar
{
    public PCF_RBL_Smooth(World world) {
        super(world);
    }

    public PCF_RBL_Smooth(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "MKT");
        textureDescriptionMap.put(1, "SP");
        textureDescriptionMap.put(2, "SP (Ex EFCX)");
        textureDescriptionMap.put(3, "SP (Ex EFCX)");
        textureDescriptionMap.put(4, "WP");
        textureDescriptionMap.put(5, "EFCX");
        textureDescriptionMap.put(6, "GN");
        textureDescriptionMap.put(7, "GN");
        textureDescriptionMap.put(8, "BN");
        textureDescriptionMap.put(9, "BN");
        textureDescriptionMap.put(10, "BN");
        textureDescriptionMap.put(11, "BN");
        textureDescriptionMap.put(12, "RBBN");
        textureDescriptionMap.put(13, "WFE");
        textureDescriptionMap.put(14, "SLSF");
        textureDescriptionMap.put(15, "SLSF");
        textureDescriptionMap.put(16, "BB (Plug Door Early)");
        textureDescriptionMap.put(17, "BB (Plug Door)");
        textureDescriptionMap.put(18, "BB (Youngstown Door)");
    }

    @Override
    public String getInventoryName() {
        return "PC&F RBL Smoothside Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.85F;
    }
}
