package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PEcoach extends AbstractPassengerCar {
    public PEcoach(World world)
    {
        super(world);
        InsertTexture(2, "Pullman Green (Generic)");
        InsertTexture(3, "CDC&S");
        InsertTexture(4, "CDC&S Baggage");
        InsertTexture(5, "Thanosman");
    }



    @Override
    public float getOptimalLinkingDistance()
    {
        return 3.8F;
    }
}