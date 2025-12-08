package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class DRGWCoach1000Series extends AbstractPassengerCar {

	public DRGWCoach1000Series(World world) {
		super(world);
		InsertTexture(0, "D&RGW (1000)");
		InsertTexture(1, "D&RGW (1001)");
		InsertTexture(2, "D&RGW (1002-1004)");
		InsertTexture(3, "D&RGW (Prospector Scheme)");
		InsertTexture(4, "D&RGW (4 Stripe)");
		InsertTexture(5, "D&RGW (4 Stripe, 1000-1001 Late)");
	}



	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance() { return 3.5F; }

	@Override
	public String transportYear() {
		return "(Rebuilt) 1939";
	}
}