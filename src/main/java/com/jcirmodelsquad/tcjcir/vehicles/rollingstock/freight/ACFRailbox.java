package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACFRailbox extends AbstractStandardFreightCar
{
    public ACFRailbox(World world) {
        super(world);
    }

    public ACFRailbox(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "Railbox (XAF-10)");
        textureDescriptionMap.put(1, "Railbox (XAF-11)");
        textureDescriptionMap.put(2, "Railbox (XAF-20)");
        textureDescriptionMap.put(3, "Railbox (XAF-20a)");
        textureDescriptionMap.put(4, "Railbox (XAF-20b)");
        textureDescriptionMap.put(5, "Railbox (XAF-20c)");
        textureDescriptionMap.put(6, "Railbox (XAF-20, modern)");
        textureDescriptionMap.put(7, "Railbox (XAF-20a, modern)");
        textureDescriptionMap.put(8, "Railbox (XAF-20b & XAF-20c, modern)");
        textureDescriptionMap.put(9, "MNS");
        textureDescriptionMap.put(10, "Blandsville & Blankerston");
    }

    @Override
    public String getInventoryName() {
        return "ACF Railbox Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.75F;
    }
}
