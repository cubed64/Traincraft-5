package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class ACFGN28SeatCoach_Dinette extends AbstractPassengerCar
{

	public ACFGN28SeatCoach_Dinette(World world) {
		super(world);
		textureDescriptionMap.put(0, "GN Internationals");
		textureDescriptionMap.put(1, "GN Internationals (Late)");
		textureDescriptionMap.put(2, "GN Internationals (BSB Scheme)");
		textureDescriptionMap.put(3, "AMTK (ex-GN)");
	}

	public ACFGN28SeatCoach_Dinette(World world, double posX, double posY, double posZ)
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