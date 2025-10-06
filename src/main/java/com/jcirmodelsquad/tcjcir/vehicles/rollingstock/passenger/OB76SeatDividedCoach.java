package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OB76SeatDividedCoach extends AbstractPassengerCar
{

	public OB76SeatDividedCoach(World world) {
		super(world);
		InsertTexture(0, "SAL");
		InsertTexture(1, "SAL (After Renovation)");
		InsertTexture(2, "SAL (After Renovation, Late)");
		InsertTexture(3, "KCS");
		InsertTexture(4, "KCS (Late)");
		InsertTexture(5, "SSW");
		InsertTexture(6, "SSW (Daylight Scheme)");
		InsertTexture(7, "SP (Two-Tone Grey");
		InsertTexture(8, "SP (Sunset Scheme, Removed Skirting)");
		InsertTexture(9, "SP (Sunset Scheme)");
		InsertTexture(10, "OCG");
	}

	public OB76SeatDividedCoach(World world, double posX, double posY, double posZ)
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