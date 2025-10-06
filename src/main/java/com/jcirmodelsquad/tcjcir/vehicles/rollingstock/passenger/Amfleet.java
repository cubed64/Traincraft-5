package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class Amfleet extends AbstractPassengerCar
{
    public Amfleet(World world) {
        super(world);
        InsertTexture(0, "AMTK (Phase 1)");
        InsertTexture(1, "AMTK (Phase 2)");
        InsertTexture(2, "AMTK (Phase 3)");
        InsertTexture(3, "AMTK (Phase 4)");
        InsertTexture(4, "AMTK (Phase 4b)");
        InsertTexture(5, "AMTK (Acela Regional Coach)");
        InsertTexture(6, "AMTK (Acela Regional Business)");
        InsertTexture(7, "Generic");
        InsertTexture(8, "JCTransit");
        InsertTexture(9, "CCRL (Chatham and Crator River Lines)");
        InsertTexture(10, "CRL (Crator River Lines)");
    }

    public Amfleet(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
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