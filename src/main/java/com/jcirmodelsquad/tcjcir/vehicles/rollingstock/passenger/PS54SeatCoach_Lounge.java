package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PS54SeatCoach_Lounge extends AbstractPassengerCar {

	public PS54SeatCoach_Lounge(World world)
	{
		super(world);
		InsertTexture(0, "PM");
		InsertTexture(1, "C&EI");
		InsertTexture(2, "C&EI (L&N paint)");
		InsertTexture(3, "C&EI (renovated)");
		InsertTexture(4, "C&EI (renovated, black roof)");
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