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
        InsertTexture(0, "Blandsville Fruit Express");
        InsertTexture(1, "NPM");
        InsertTexture(2, "SOO");
        InsertTexture(3, "PFE (R-70-15)");
        InsertTexture(4, "PFE (R-10-19)");
        InsertTexture(5, "BNFE");
        InsertTexture(6, "MKT (BKTY)");
        InsertTexture(7, "ARMN (MP/NW)");
        InsertTexture(8, "EL");
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
