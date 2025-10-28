package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PS150 extends AbstractStandardFreightCar
{
    public PS150(World world) {
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
        InsertTexture(0, "BAR (State of Maine)");
        InsertTexture(1, "Penn Central (The Best Railroad)");
        InsertTexture(2, "ATSF");
        InsertTexture(3, "DRGW");
        InsertTexture(4, "BLUX");
        InsertTexture(5, "REDX");
        InsertTexture(6, "TIRY");
        InsertTexture(7, "DLMR");
        InsertTexture(8, "DLMR 2");
        InsertTexture(9, "ANN ARBOR");
        InsertTexture(10, "FNCC (Simple)");
        InsertTexture(11, "FNCC");
        InsertTexture(12, "AGW");
        InsertTexture(13, "AGW");
    }

    @Override
    public String getInventoryName() {
        return "Pullman Standard 50' Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.3125F;
    }
}