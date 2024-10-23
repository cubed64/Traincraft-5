package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OBNHLounge5107 extends AbstractPassengerCar
{

	public OBNHLounge5107(World world) {
		super(world);
		textureDescriptionMap.put(0, "NH");
		textureDescriptionMap.put(1, "NH (Black Knight Scheme)");
	}

	public OBNHLounge5107(World world, double posX, double posY, double posZ)
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