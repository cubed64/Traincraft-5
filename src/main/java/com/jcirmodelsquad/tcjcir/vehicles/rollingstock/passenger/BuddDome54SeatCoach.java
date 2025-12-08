package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddDome54SeatCoach extends AbstractPassengerCar
{
	public BuddDome54SeatCoach(World world) {
		super(world);
		InsertTexture(0, "WAB 200");
		InsertTexture(1, "WAB 201");
		InsertTexture(2, "WAB 202");
		InsertTexture(3, "CB&Q Silver Scene");
		InsertTexture(4, "CB&Q Silver Island");
		InsertTexture(5, "CB&Q Silver Vision");
		InsertTexture(6, "AMTK 9562");
	}

	

	@Override
	public double getAdditionalYOffset()
	{
		return 0.55F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.97F;
	}

	@Override
	public String transportYear() {
		return "1947, 1949-1950";
	}
}