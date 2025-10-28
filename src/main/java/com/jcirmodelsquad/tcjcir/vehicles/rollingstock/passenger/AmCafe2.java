package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class AmCafe2 extends AbstractPassengerCar
{
    public AmCafe2(World world) {
        super(world);
        InsertTexture(0, "AMTK (Phase 2)");
        InsertTexture(1, "AMTK (Phase 3)");
        InsertTexture(2, "AMTK (Phase 4)");
        InsertTexture(3, "AMTK (Phase 4b)");
        InsertTexture(4, "Generic");
        InsertTexture(5, "JCTransit");
        InsertTexture(6, "CCRL (Chatham and Crator River Lines)");
        InsertTexture(7, "CRL (Crator River Lines)");
    }

    

    @Override
    public double getAdditionalYOffset()
    {
        return 0.2F;
    }

    @Override
    public float getOptimalLinkingDistance()
    {
        return 2.5F;
    }
}