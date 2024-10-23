package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSCEI1DR_28SeatParlor_Observation extends AbstractPassengerCar {

	public PSCEI1DR_28SeatParlor_Observation(World world)
	{
		super(world);
		textureDescriptionMap.put(0, "C&EI (As Delivered)");
		textureDescriptionMap.put(1, "C&EI");
		textureDescriptionMap.put(2, "GC&M");
	}

	public PSCEI1DR_28SeatParlor_Observation(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.97F;
	}
}