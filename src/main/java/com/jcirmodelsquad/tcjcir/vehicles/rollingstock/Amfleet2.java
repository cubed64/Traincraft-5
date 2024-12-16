package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class Amfleet2 extends AbstractPassengerCar
{
    public Amfleet2(World world) {
        super(world);
        textureDescriptionMap.put(0, "AMTK (Phase 2)");
        textureDescriptionMap.put(1, "AMTK (Phase 3)");
        textureDescriptionMap.put(2, "AMTK (Phase 4)");
        textureDescriptionMap.put(3, "AMTK (Phase 4b Coach)");
        textureDescriptionMap.put(4, "AMTK (Phase 4b Business)");
        textureDescriptionMap.put(5, "Generic");
        textureDescriptionMap.put(6, "JCTransit");
        textureDescriptionMap.put(7, "CCRL (Chatham and Crator River Lines)");
        textureDescriptionMap.put(8, "CRL (Crator River Lines)");
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