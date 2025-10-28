package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class SP_B50 extends AbstractStandardFreightCar
{
    public SP_B50(World world) {
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
        InsertTexture(0, "B-50-15 SP As-Delivered");
        InsertTexture(1, "B-50-15 MT&L As-Delivered");
        InsertTexture(2, "B-50-15 SP Steelsides");
        InsertTexture(3, "B-50-15 SP OVERNIGHT Scheme");
        InsertTexture(4, "B-50-15 SP Head-End Car");
        InsertTexture(5, "B-50-16 SP As-Delivered");
        InsertTexture(6, "B-50-16 SD&AE");
        InsertTexture(7, "B-50-15 Steelsides Blank");
        InsertTexture(8, "B-50-16 Blank");
        InsertTexture(9, "B-50-15 Blank");
    }

    @Override
    public String getInventoryName() {
        return "Pullman Mfg 40 Ton Single-Sheath Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.2F;
    }
}