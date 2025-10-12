package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Freight40highcube extends AbstractStandardFreightCar
{
    public Freight40highcube(World world) {
        super(world);
    }

    public Freight40highcube(World world, double x, double y, double z){
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
        InsertTexture(0, "BAWX");
        InsertTexture(1, "BN");
        InsertTexture(2, "NP");
        InsertTexture(3, "IC");
        InsertTexture(4, "BEEPX & BOOPX");
        InsertTexture(5, "ATSF");
        InsertTexture(6, "MT&S");
        InsertTexture(7, "MILW");
        InsertTexture(8, "CBQ");
        InsertTexture(9, "CBQ");
        InsertTexture(10, "CBQ");
        InsertTexture(11, "DRGW");
        InsertTexture(12, "DRGW");
        InsertTexture(13, "ICG");
        InsertTexture(14, "FNCC");
        InsertTexture(15, "FNCC (Foxtail logo)");
        InsertTexture(16, "OC&G");
    }

    @Override
    public String getInventoryName() {
        return "40 foot Highcube Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2F;
    }
}
