package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCombineCar;

public class PSBMCombine extends AbstractPassengerCombineCar
{

	public PSBMCombine(World world)
	{
		super(world);

	}

	public PSBMCombine(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public void setupTextureDescription()
	{
		textureDescriptionMap.put(0, "B&M");
		textureDescriptionMap.put(1, "MEC");
		textureDescriptionMap.put(2, "MEC (pine tree)");
		textureDescriptionMap.put(3, "WAB");
	}

	@Override
	public String getInventoryName()
	{
		return "Pullman Standard B&M Combine Passenger-Baggage";
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