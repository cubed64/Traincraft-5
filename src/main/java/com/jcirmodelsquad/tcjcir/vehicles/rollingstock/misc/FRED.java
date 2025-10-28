package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.misc;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class FRED extends AbstractPassengerCar
{
    public int freightInventorySize;
    public int numFreightSlots;
    public FRED(World world)
    {
        super(world);
    }

    

    @Override
    public boolean shouldRiderSit(){return false;}

    @Override
    public double getAdditionalYOffset()
    {
        return 0.7F;
    }

    @Override
    public float getOptimalLinkingDistance()
    {
        return 0.1F;
    }
}


