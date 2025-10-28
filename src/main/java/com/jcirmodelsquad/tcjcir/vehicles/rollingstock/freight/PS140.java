package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PS140 extends AbstractStandardFreightCar
{
    public PS140(World world)
    {
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
        InsertTexture(0, "ATSF");
        InsertTexture(1, "NYC (Pacemaker)");
        InsertTexture(2, "RI");
        InsertTexture(3, "CPR (Multimark)");
        InsertTexture(4, "FNCC");
        InsertTexture(5, "FNCC (Quick Scheme)");
        InsertTexture(6, "BLUX");
        InsertTexture(7, "REDX");
        InsertTexture(8, "REDX (Smudge)");
        InsertTexture(9, "TFIndustries Generic");
        InsertTexture(10, "BNNA");
        InsertTexture(11, "DLMR");
        InsertTexture(12, "DLMR");
        InsertTexture(13, "DLMR");
        InsertTexture(14, "TIRY");
        InsertTexture(15, "TIRY");
        InsertTexture(16, "GLNT");
        InsertTexture(17, "AGW");
        InsertTexture(18, "AGW");
        InsertTexture(19, "CDCS");
        InsertTexture(20, "SOU");
    }

    @Override
    public String getInventoryName() {
        return "Pullman Standard 40' Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.875F;
    }
}