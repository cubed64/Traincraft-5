package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OBBAR52SeatCoach_Dinette extends AbstractPassengerCar
{

	public OBBAR52SeatCoach_Dinette(World world) {
		super(world);
		textureDescriptionMap.put(0, "BAR (230)");
		textureDescriptionMap.put(1, "BAR (231)");
	}

	public OBBAR52SeatCoach_Dinette(World world, double posX, double posY, double posZ)
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