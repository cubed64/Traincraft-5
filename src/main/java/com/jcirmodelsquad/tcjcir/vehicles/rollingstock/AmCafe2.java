package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class AmCafe2 extends AbstractPassengerCar
{
    public AmCafe2(World world) {
        super(world);
        textureDescriptionMap.put(0, "AMTK (Phase 2)");
        textureDescriptionMap.put(1, "AMTK (Phase 3)");
        textureDescriptionMap.put(2, "AMTK (Phase 4)");
        textureDescriptionMap.put(3, "AMTK (Phase 4b)");
        textureDescriptionMap.put(4, "Generic");
        textureDescriptionMap.put(5, "JCTransit");
        textureDescriptionMap.put(6, "CCRL (Chatham and Crator River Lines)");
        textureDescriptionMap.put(7, "CCL (Crator River Lines)");
    }

    public AmCafe2(World world, double posX, double posY, double posZ)
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