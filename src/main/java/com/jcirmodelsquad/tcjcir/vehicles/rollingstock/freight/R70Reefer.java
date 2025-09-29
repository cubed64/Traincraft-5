package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class R70Reefer extends AbstractStandardFreightCar
{
    public R70Reefer(World world) {
        super(world);
    }

    public R70Reefer(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "PFE (White W/ Orange Logo)");
        textureDescriptionMap.put(1, "Blandsville Fruit Exprees");
        textureDescriptionMap.put(2, "FNCC");
        textureDescriptionMap.put(3, "BNFE (White)");
        textureDescriptionMap.put(4, "BNFE (Yellow)");
        textureDescriptionMap.put(5, "BNFE (Yellow but with a white roof for some reason)");
        textureDescriptionMap.put(6, "PFE (Orange)");
        textureDescriptionMap.put(7, "MILW");
        textureDescriptionMap.put(8, "SOO");
        textureDescriptionMap.put(9, "Railway Express Agency");
        textureDescriptionMap.put(10, "UPFE");
        textureDescriptionMap.put(11, "UPFE (post 1970 roof)");
        textureDescriptionMap.put(12, "PFE (post 1970 roof)");
        textureDescriptionMap.put(13, "NPM (foobie)");
        textureDescriptionMap.put(14, "Golden West");
        textureDescriptionMap.put(15, "Golden West (post 1970 roof)");
        textureDescriptionMap.put(16, "BAR early");
        textureDescriptionMap.put(17, "BAR Late");
        textureDescriptionMap.put(18, "ATSF As-delivered");
        textureDescriptionMap.put(19, "ATSF Late");
        textureDescriptionMap.put(20, "WP Ice Service");
        textureDescriptionMap.put(21, "FGE (Real Cold)");
        textureDescriptionMap.put(22, "GCM");
    }

    @Override
    public String getInventoryName() {
        return "PFE R-70-20 Reefer";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.1F;
    }
}
