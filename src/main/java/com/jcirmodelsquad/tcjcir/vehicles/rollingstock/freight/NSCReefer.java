package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class NSCReefer extends AbstractStandardFixedFreightCar {

    public NSCReefer(World world) {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "CP Script");
        InsertTexture(1, "PIX Generic Express Baggage (NOT A REEFER)");
        InsertTexture(2, "DLMR");
    }

    @Override
    public String getInventoryName() {
        return "NSC 3294 Mech Reefer";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.4F;
    }


}