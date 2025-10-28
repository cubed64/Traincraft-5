package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSBM56SeatCoach extends AbstractPassengerCar {

	public PSBM56SeatCoach(World world)
	{
		super(world);
		InsertTexture(0, "B&M (interior scheme 1)");
		InsertTexture(1, "B&M (interior scheme 2)");
		InsertTexture(2, "B&M (interior scheme 3)");
		InsertTexture(3, "MEC (interior scheme 1)");
		InsertTexture(4, "MEC (interior scheme 2)");
		InsertTexture(5, "MEC (interior scheme 3)");
		InsertTexture(6, "MEC (pine tree, interior scheme 1)");
		InsertTexture(7, "MEC (pine tree, interior scheme 2)");
		InsertTexture(8, "MEC (pine tree, interior scheme 3)");
		InsertTexture(9, "MP (interior scheme 1)");
		InsertTexture(10, "MP (interior scheme 2)");
		InsertTexture(11, "MP (interior scheme 3)");
		InsertTexture(12, "MP (buzz saw, interior scheme 1)");
		InsertTexture(13, "MP (buzz saw, interior scheme 2)");
		InsertTexture(14, "WAB");
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