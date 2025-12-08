package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OB92SeatCoach extends AbstractPassengerCar
{

	public OB92SeatCoach(World world) {
		super(world);
		InsertTexture(0, "NH (As Delivered)");
		InsertTexture(1, "NH");
		InsertTexture(2, "NH (RDC Scheme 1)");
		InsertTexture(3, "NH (RDC Scheme 2");
		InsertTexture(4, "NH (Late)");
		InsertTexture(5, "NH (McGinnis Scheme)");
		InsertTexture(6, "NH (Black Knight Scheme)");
		InsertTexture(7, "PC");
		InsertTexture(8, "Spunch Bop Rayroad");
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
		return "1937-1938";
	}
}