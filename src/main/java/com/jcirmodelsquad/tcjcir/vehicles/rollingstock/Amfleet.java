package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class Amfleet extends AbstractPassengerCar
{
    public Amfleet(World world) {
        super(world);
        textureDescriptionMap.put(0, "AMTK (Phase 1)");
        textureDescriptionMap.put(1, "AMTK (Phase 2)");
        textureDescriptionMap.put(2, "AMTK (Phase 3)");
        textureDescriptionMap.put(3, "AMTK (Phase 4)");
        textureDescriptionMap.put(4, "AMTK (Phase 4b)");
        textureDescriptionMap.put(5, "AMTK (Acela Regional Coach)");
        textureDescriptionMap.put(6, "AMTK (Acela Regional Business)");
        textureDescriptionMap.put(7, "Generic");
        textureDescriptionMap.put(8, "JCTransit");
        textureDescriptionMap.put(9, "CCRL (Chatham and Crator River Lines)");
        textureDescriptionMap.put(10, "CCL (Crator River Lines)");
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