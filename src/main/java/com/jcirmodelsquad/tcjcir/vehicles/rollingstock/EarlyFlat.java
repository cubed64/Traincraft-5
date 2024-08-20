package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class EarlyFlat extends AbstractPassengerCar
{

	public EarlyFlat(World world)
	{
		super(world);
	}

	public EarlyFlat(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public void onUpdate(){
		super.onUpdate();
		boundingBox.maxY-=1;
	}

	@Override
	public double getAdditionalYOffset()
	{
		return 0.2F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 2.4F;
	}
}