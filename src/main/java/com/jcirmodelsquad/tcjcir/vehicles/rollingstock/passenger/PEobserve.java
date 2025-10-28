package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PEobserve extends AbstractPassengerCar
{
    public PEobserve(World world)
    {
        super(world);
    }



    @Override
    public float getOptimalLinkingDistance()
    {
        return 3.8F;
    }
}