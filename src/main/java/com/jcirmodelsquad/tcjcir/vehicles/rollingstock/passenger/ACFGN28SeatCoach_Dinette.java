package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class ACFGN28SeatCoach_Dinette extends AbstractPassengerCar
{

	public ACFGN28SeatCoach_Dinette(World world) {
		super(world);
		InsertTexture(0, "GN Internationals");
		InsertTexture(1, "GN Internationals (Late)");
		InsertTexture(2, "GN Internationals (BSB Scheme)");
		InsertTexture(3, "AMTK (ex-GN)");
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
		return "1950";
	}
}