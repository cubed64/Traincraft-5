package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PassengerTwoBilTail extends AbstractPassengerCar {
    //public TiltingHandler tiltingHandler = new TiltingHandler(7);

    public PassengerTwoBilTail(World world)
    {
        super(world);
    }

    

    @Override
    public float getOptimalLinkingDistance()
    {
        return 2.77F;
    }
}