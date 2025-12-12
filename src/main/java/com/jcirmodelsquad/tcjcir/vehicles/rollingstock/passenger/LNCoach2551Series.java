package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class LNCoach2551Series extends AbstractPassengerCar
{
	public LNCoach2551Series(World world) {
		super(world);
		InsertTexture(0, "L&N (As rebuilt)");
		InsertTexture(1, "L&N (As rebuilt, Truck mounted brake cylinders)");
		InsertTexture(2, "L&N");
		InsertTexture(3, "L&N (Truck mounted brake cylinders)");
		InsertTexture(4, "L&N (Late)");
		InsertTexture(5, "L&N (Late, Truck mounted brake cylinders)");
		InsertTexture(6, "L&N (Snack bar)");
		InsertTexture(7, "L&N (Snack bar, Truck mounted brake cylinders)");
	}

	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.5F;
	}

	@Override
	public String transportYear() {
		return "(Rebuilt) 1946-1948";
	}
}