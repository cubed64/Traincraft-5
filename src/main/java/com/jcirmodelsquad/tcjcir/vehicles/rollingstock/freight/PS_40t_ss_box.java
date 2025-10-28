package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PS_40t_ss_box extends AbstractStandardFreightCar
{
    public PS_40t_ss_box(World world) {
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
        InsertTexture(0, "Western Pacific (Later)");
        InsertTexture(1, "Western Pacific (As-Delivered)");
        InsertTexture(2, "UNCLX");
        InsertTexture(3, "Generic Brown");
        InsertTexture(4, "Blank Red");
        InsertTexture(5, "CDC&S");
        InsertTexture(6, "E&ARR");
        InsertTexture(7, "WPSR (Updated)");
        InsertTexture(8, "WPSR (As-Delivered)");
    }

    @Override
    public String getInventoryName() {
        return "Pullman Mfg 40 Ton Single-Sheath Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.15F;
    }
}