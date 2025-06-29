package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class DRGWCoach1000Series extends AbstractPassengerCar {

	public DRGWCoach1000Series(World world) {
		super(world);
		textureDescriptionMap.put(0, "D&RGW (1000)");
		textureDescriptionMap.put(1, "D&RGW (1001)");
		textureDescriptionMap.put(2, "D&RGW (1002-1004)");
		textureDescriptionMap.put(3, "D&RGW (Prospector Scheme)");
		textureDescriptionMap.put(4, "D&RGW (4 Stripe)");
		textureDescriptionMap.put(5, "D&RGW (4 Stripe, 1000-1001 Late)");
	}

	public DRGWCoach1000Series(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance() { return 3.5F; }
}