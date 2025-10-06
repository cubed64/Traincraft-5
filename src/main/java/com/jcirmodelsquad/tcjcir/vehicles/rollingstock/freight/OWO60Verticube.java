package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class OWO60Verticube extends AbstractStandardFreightCar
{
    public OWO60Verticube(World world) {
        super(world);
    }

    public OWO60Verticube(World world, double x, double y, double z){
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
        InsertTexture(0, "FNCC (Verti-Cube)");
        InsertTexture(1, "FNCC");
        InsertTexture(2, "WRX (Tree Logo)");
        InsertTexture(3, "LRR");
        InsertTexture(4, "LRR (Large Wording)");
        InsertTexture(5, "ANE");
        InsertTexture(6, "ANE (Mega Cushion)");
        InsertTexture(7, "ANE Mega Cushion (Graffiti)");
        InsertTexture(8, "WRX Tree Logo (Graffiti)");
        InsertTexture(9, "SNCT");
        InsertTexture(10, "UNCLX");
        InsertTexture(11, "WP (Early)");
        InsertTexture(12, "WP (Late)");
        InsertTexture(13, "FNCC (Foxtail Logo)");
        InsertTexture(14, "FNCC (Dual Logos)");
        InsertTexture(15, "FNCC (Olympic Range Logo)");
        InsertTexture(16, "FBOX");
        InsertTexture(17, "CNRC");
    }

    @Override
    public String getInventoryName() {
        return "KSFI 60' Verticube Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.95F;
    }
}
