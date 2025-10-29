package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PassengerTwoBilTail extends AbstractPassengerCar {
    //public TiltingHandler tiltingHandler = new TiltingHandler(7);

    public PassengerTwoBilTail(World world)
    {
        super(world);
        InsertTexture(0, "SR");
        InsertTexture(1, "SR (South Eastern Green)");
        InsertTexture(2, "BR (Green)");
        InsertTexture(3, "BR (Green, Small Warning Panel)");
        InsertTexture(4, "BR (Green, Full Yellow Front)");
        InsertTexture(5, "BR (Blue, Small Warning Panel)");
        InsertTexture(6, "BR (Blue, Full Yellow Front)");
        InsertTexture(7, "CCRL");
    }

    

    @Override
    public float getOptimalLinkingDistance()
    {
        return 2.77F;
    }
}