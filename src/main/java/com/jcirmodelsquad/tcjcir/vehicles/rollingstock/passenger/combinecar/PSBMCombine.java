package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCombineCar;

public class PSBMCombine extends AbstractPassengerCombineCar
{

	public PSBMCombine(World world)
	{
		super(world);

	}

	

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "B&M");
		InsertTexture(1, "MEC");
		InsertTexture(2, "MEC (pine tree)");
		InsertTexture(3, "WAB");
	}

	@Override
	public String transportCountry()
	{
		return "US";
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

	@Override
	public String transportYear() {
		return "1947";
	}
}