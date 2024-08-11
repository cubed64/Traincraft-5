package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PCH100HCoach extends AbstractPassengerCar {
    public PCH100HCoach(World world)
    {
        super(world);
    }

    public PCH100HCoach(World world, double d, double d1, double d2) {
        super(world, d, d1, d2);
    }

    @Override
    public double getAdditionalYOffset()
    {
        return 0.2F;
    }

    @Override
    public float getOptimalLinkingDistance()
    {
        return 2.1F;
    }
}
