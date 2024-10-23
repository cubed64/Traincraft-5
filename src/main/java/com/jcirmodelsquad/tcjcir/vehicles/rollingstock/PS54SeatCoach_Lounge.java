package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PS54SeatCoach_Lounge extends AbstractPassengerCar {

	public PS54SeatCoach_Lounge(World world)
	{
		super(world);
		textureDescriptionMap.put(0, "PM");
		textureDescriptionMap.put(1, "C&EI");
		textureDescriptionMap.put(2, "C&EI (L&N paint)");
		textureDescriptionMap.put(3, "C&EI (renovated)");
		textureDescriptionMap.put(4, "C&EI (renovated, black roof)");
	}

	public PS54SeatCoach_Lounge(World world, double posX, double posY, double posZ)
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