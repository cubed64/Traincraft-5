package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSCEIDiner extends AbstractPassengerCar {

	public PSCEIDiner(World world) {
		super(world);
		InsertTexture(0, "C&EI");
		InsertTexture(1, "C&EI (L&N paint)");
		InsertTexture(2, "GC&M");
	}

	public PSCEIDiner(World world, double posX, double posY, double posZ)
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