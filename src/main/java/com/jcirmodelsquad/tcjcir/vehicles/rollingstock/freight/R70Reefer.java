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

    

    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "PFE (White W/ Orange Logo)");
        InsertTexture(1, "Blandsville Fruit Exprees");
        InsertTexture(2, "FNCC");
        InsertTexture(3, "BNFE (White)");
        InsertTexture(4, "BNFE (Yellow)");
        InsertTexture(5, "BNFE (Yellow but with a white roof for some reason)");
        InsertTexture(6, "PFE (Orange)");
        InsertTexture(7, "MILW");
        InsertTexture(8, "SOO");
        InsertTexture(9, "Railway Express Agency");
        InsertTexture(10, "UPFE");
        InsertTexture(11, "UPFE (post 1970 roof)");
        InsertTexture(12, "PFE (post 1970 roof)");
        InsertTexture(13, "NPM (foobie)");
        InsertTexture(14, "Golden West");
        InsertTexture(15, "Golden West (post 1970 roof)");
        InsertTexture(16, "BAR early");
        InsertTexture(17, "BAR Late");
        InsertTexture(18, "ATSF As-delivered");
        InsertTexture(19, "ATSF Late");
        InsertTexture(20, "WP Ice Service");
        InsertTexture(21, "FGE (Real Cold)");
        InsertTexture(22, "GCM", train.common.enums.LockoutGroup.GCM); 
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
