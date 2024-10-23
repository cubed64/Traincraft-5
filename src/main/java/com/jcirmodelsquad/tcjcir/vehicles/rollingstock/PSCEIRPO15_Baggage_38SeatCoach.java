package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSCEIRPO15_Baggage_38SeatCoach extends AbstractPassengerCar {

	public PSCEIRPO15_Baggage_38SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "C&EI (As Delivered)");
		textureDescriptionMap.put(1, "C&EI");
		textureDescriptionMap.put(2, "C&EI (Semi-Fictional)");
		textureDescriptionMap.put(3, "GC&M");
	}

	public PSCEIRPO15_Baggage_38SeatCoach(World world, double posX, double posY, double posZ)
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