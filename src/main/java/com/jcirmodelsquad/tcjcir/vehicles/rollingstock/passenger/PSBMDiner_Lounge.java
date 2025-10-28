package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSBMDiner_Lounge extends AbstractPassengerCar {

	public PSBMDiner_Lounge(World world)
	{
		super(world);
		InsertTexture(0, "B&M");
		InsertTexture(1, "MEC");
		InsertTexture(2, "MEC (pine tree)");
		InsertTexture(3, "WAB");
		InsertTexture(4, "C&EI");
		InsertTexture(5, "C&EI (silver)");
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