package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class PSCNWRPO15 extends AbstractStandardFixedFreightCar
{
	public PSCNWRPO15(World world) {
		super(world);
	}

	public PSCNWRPO15(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{

	}


	@Override
	public String getInventoryName() {
		return "Pullman Standard CNW RPO(15')";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.85F;
	}

	
}