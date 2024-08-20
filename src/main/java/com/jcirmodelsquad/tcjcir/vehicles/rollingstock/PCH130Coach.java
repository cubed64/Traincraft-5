package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PCH130Coach extends AbstractPassengerCar {
    public PCH130Coach(World world)
    {
        super(world);
    }

    public PCH130Coach(World world, double d, double d1, double d2)
    {
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
        return 2.8F;
    }
}
