package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OBNHGrillCar extends AbstractPassengerCar {

	public OBNHGrillCar(World world) {
		super(world);
		textureDescriptionMap.put(0, "NH");
		textureDescriptionMap.put(1, "NH (East Wind)");
		textureDescriptionMap.put(2, "NH (Late)");
	}

	public OBNHGrillCar(World world, double posX, double posY, double posZ)
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