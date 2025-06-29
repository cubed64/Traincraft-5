package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class DRGWCoach1005Series extends AbstractPassengerCar {

	public DRGWCoach1005Series(World world) {
		super(world);
		textureDescriptionMap.put(0, "D&RGW (1005, 1007)");
		textureDescriptionMap.put(1, "D&RGW (1006)");
		textureDescriptionMap.put(2, "D&RGW (1008, 1010)");
		textureDescriptionMap.put(3, "D&RGW (1009)");
		textureDescriptionMap.put(4, "D&RGW (1006, Late)");
		textureDescriptionMap.put(5, "D&RGW (1007, Late)");
		textureDescriptionMap.put(6, "D&RGW (1008, 1010, Late)");
		textureDescriptionMap.put(7, "D&RGW (1009, Late)");
	}

	public DRGWCoach1005Series(World world, double posX, double posY, double posZ)
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