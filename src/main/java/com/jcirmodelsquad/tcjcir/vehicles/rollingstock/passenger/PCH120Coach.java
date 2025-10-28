package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PCH120Coach extends AbstractPassengerCar
{
    public PCH120Coach(World world)
    {
        super(world);
    }

    

    @Override
    public double getAdditionalYOffset()
    {
        return 0.2F;
    }

    @Override
    public float getOptimalLinkingDistance()
    {
        return 2F;
    }
}
