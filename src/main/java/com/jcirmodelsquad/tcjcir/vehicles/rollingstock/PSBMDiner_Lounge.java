package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSBMDiner_Lounge extends AbstractPassengerCar {

	public PSBMDiner_Lounge(World world)
	{
		super(world);
		textureDescriptionMap.put(0, "B&M");
		textureDescriptionMap.put(1, "MEC");
		textureDescriptionMap.put(2, "MEC (pine tree)");
		textureDescriptionMap.put(3, "WAB");
		textureDescriptionMap.put(4, "C&EI");
		textureDescriptionMap.put(5, "C&EI (silver)");
	}

	public PSBMDiner_Lounge(World world, double posX, double posY, double posZ)
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