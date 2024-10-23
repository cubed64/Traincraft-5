package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddDome54SeatCoach extends AbstractPassengerCar
{
	public BuddDome54SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "WAB 200");
		textureDescriptionMap.put(1, "WAB 201");
		textureDescriptionMap.put(2, "WAB 202");
		textureDescriptionMap.put(3, "CB&Q Silver Scene");
		textureDescriptionMap.put(4, "CB&Q Silver Island");
		textureDescriptionMap.put(5, "CB&Q Silver Vision");
		textureDescriptionMap.put(6, "AMTK 9562");
	}

	public BuddDome54SeatCoach(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
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
}