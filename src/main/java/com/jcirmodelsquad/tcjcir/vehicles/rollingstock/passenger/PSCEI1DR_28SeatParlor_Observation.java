package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSCEI1DR_28SeatParlor_Observation extends AbstractPassengerCar {

	public PSCEI1DR_28SeatParlor_Observation(World world)
	{
		super(world);
		InsertTexture(0, "C&EI (As Delivered)");
		InsertTexture(1, "C&EI");
		InsertTexture(2, "GC&M");
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

	@Override
	public String transportYear() {
		return "1946";
	}
}