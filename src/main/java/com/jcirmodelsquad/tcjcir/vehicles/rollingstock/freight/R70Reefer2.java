package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class R70Reefer2 extends AbstractStandardFreightCar
{
    public R70Reefer2(World world) {
        super(world);
    }

    public R70Reefer2(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "Blandsville Fruit Express");
        textureDescriptionMap.put(1, "NPM");
        textureDescriptionMap.put(2, "SOO");
        textureDescriptionMap.put(3, "PFE (R-70-15)");
        textureDescriptionMap.put(4, "PFE (R-10-19)");
        textureDescriptionMap.put(5, "BNFE");
        textureDescriptionMap.put(6, "MKT (BKTY)");
        textureDescriptionMap.put(7, "ARMN (MP/NW)");
        textureDescriptionMap.put(8, "EL");
    }

    @Override
    public String getInventoryName() {
        return "PFE R-70-15 Reefer";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.1F;
    }
}
