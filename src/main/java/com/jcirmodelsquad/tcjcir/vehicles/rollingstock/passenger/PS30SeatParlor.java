package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.enums.LockoutGroup;

public class PS30SeatParlor extends AbstractPassengerCar
{

	public PS30SeatParlor(World world)
	{
		super(world);
		InsertTexture(3, "FMSR (Cream Fluting)", LockoutGroup.FMSR);
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