package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSBM56SeatCoach extends AbstractPassengerCar {

	public PSBM56SeatCoach(World world)
	{
		super(world);
		textureDescriptionMap.put(0, "B&M (interior scheme 1)");
		textureDescriptionMap.put(1, "B&M (interior scheme 2)");
		textureDescriptionMap.put(2, "B&M (interior scheme 3)");
		textureDescriptionMap.put(3, "MEC (interior scheme 1)");
		textureDescriptionMap.put(4, "MEC (interior scheme 2)");
		textureDescriptionMap.put(5, "MEC (interior scheme 3)");
		textureDescriptionMap.put(6, "MEC (pine tree, interior scheme 1)");
		textureDescriptionMap.put(7, "MEC (pine tree, interior scheme 2)");
		textureDescriptionMap.put(8, "MEC (pine tree, interior scheme 3)");
		textureDescriptionMap.put(9, "MP (interior scheme 1)");
		textureDescriptionMap.put(10, "MP (interior scheme 2)");
		textureDescriptionMap.put(11, "MP (interior scheme 3)");
		textureDescriptionMap.put(12, "MP (buzz saw)");
		textureDescriptionMap.put(13, "WAB (interior scheme 1)");
		textureDescriptionMap.put(14, "WAB (interior scheme 2)");
		textureDescriptionMap.put(15, "WAB (interior scheme 3)");
	}

	public PSBM56SeatCoach(World world, double posX, double posY, double posZ)
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