package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PS58SeatCoach_Observation extends AbstractPassengerCar {

	public PS58SeatCoach_Observation(World world)
	{
		super(world);
		textureDescriptionMap.put(0, "PM (conductor's desk)");
		textureDescriptionMap.put(1, "PM (conductor's desk, rear light off)");
		textureDescriptionMap.put(2, "PM");
		textureDescriptionMap.put(3, "PM (rear light off)");
		textureDescriptionMap.put(4, "C&EI (conductor's desk)");
		textureDescriptionMap.put(5, "C&EI (conductor's desk, rear light off)");
		textureDescriptionMap.put(6, "C&EI");
		textureDescriptionMap.put(7, "C&EI (L&N paint, rear light off)");
		textureDescriptionMap.put(8, "C&EI (L&N paint, conductor's desk)");
		textureDescriptionMap.put(9, "C&EI (L&N paint, conductor's desk, rear light off)");
		textureDescriptionMap.put(10, "C&EI (L&N paint)");
		textureDescriptionMap.put(11, "C&EI (L&N paint, rear light off)");
		textureDescriptionMap.put(12, "C&EI (renovated, conductor's desk)");
		textureDescriptionMap.put(13, "C&EI (renovated)");
		textureDescriptionMap.put(14, "C&EI (renovated, back roof, conductor's desk)");
		textureDescriptionMap.put(15, "C&EI (renovated, black roof)");
		textureDescriptionMap.put(16, "DLMR (fictional)");
	}

	public PS58SeatCoach_Observation(World world, double posX, double posY, double posZ)
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