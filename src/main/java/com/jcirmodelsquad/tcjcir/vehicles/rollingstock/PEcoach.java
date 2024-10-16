package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PEcoach extends AbstractPassengerCar {
    public PEcoach(World world)
    {
        super(world);
        textureDescriptionMap.put(2, "Pullman Green (Generic)");
        textureDescriptionMap.put(3, "CDC&S");
        textureDescriptionMap.put(4, "CDC&S Baggage");
        textureDescriptionMap.put(5, "Thanosman");
        textureDescriptionMap.put(6, "GCM");
        textureDescriptionMap.put(7, "GCM");
    }

    public PEcoach(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

    @Override
    public float getOptimalLinkingDistance()
    {
        return 3.8F;
    }
}