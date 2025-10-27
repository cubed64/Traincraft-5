package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class PSSOUBaggage extends AbstractStandardFixedFreightCar
{
	public PSSOUBaggage(World world) {
		super(world);
	}

	public PSSOUBaggage(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "SOU (early)");
		InsertTexture(1, "SOU (early, without mail poles");
		InsertTexture(2, "SOU");
		InsertTexture(3, "SOU (without mail poles");
		InsertTexture(4, "SOU (late)");
		InsertTexture(5, "SOU (late, without mail poles)");
	}


	@Override
	public String getInventoryName() {
		return "Pullman Standard SOU Baggage";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.97F;
	}

	
}