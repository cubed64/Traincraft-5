package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class DRGWCoach1005Series extends AbstractPassengerCar {

	public DRGWCoach1005Series(World world) {
		super(world);
		InsertTexture(0, "D&RGW (1005, 1007)");
		InsertTexture(1, "D&RGW (1006)");
		InsertTexture(2, "D&RGW (1008, 1010)");
		InsertTexture(3, "D&RGW (1009)");
		InsertTexture(4, "D&RGW (1006, Late)");
		InsertTexture(5, "D&RGW (1007, Late)");
		InsertTexture(6, "D&RGW (1008, 1010, Late)");
		InsertTexture(7, "D&RGW (1009, Late)");
	}



	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance() { return 3.5F; }
}