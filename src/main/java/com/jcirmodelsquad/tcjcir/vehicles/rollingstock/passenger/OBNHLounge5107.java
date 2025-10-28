package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OBNHLounge5107 extends AbstractPassengerCar
{

	public OBNHLounge5107(World world) {
		super(world);
		InsertTexture(0, "NH");
		InsertTexture(1, "NH (Black Knight Scheme)");
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