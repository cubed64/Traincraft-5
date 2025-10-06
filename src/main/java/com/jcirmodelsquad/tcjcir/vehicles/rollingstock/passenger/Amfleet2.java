package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class Amfleet2 extends AbstractPassengerCar
{
    public Amfleet2(World world) {
        super(world);
        InsertTexture(0, "AMTK (Phase 2)");
        InsertTexture(1, "AMTK (Phase 3)");
        InsertTexture(2, "AMTK (Phase 4)");
        InsertTexture(3, "AMTK (Phase 4b Coach)");
        InsertTexture(4, "AMTK (Phase 4b Business)");
        InsertTexture(5, "Generic");
        InsertTexture(6, "JCTransit");
        InsertTexture(7, "CCRL (Chatham and Crator River Lines)");
        InsertTexture(8, "CRL (Crator River Lines)");
    }

    public Amfleet2(World world, double posX, double posY, double posZ)
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
        return 2.4F;
    }
}