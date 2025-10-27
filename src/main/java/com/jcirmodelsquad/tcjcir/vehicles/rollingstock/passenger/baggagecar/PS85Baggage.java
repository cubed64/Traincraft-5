package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class PS85Baggage extends AbstractStandardFixedFreightCar
{
	public PS85Baggage(World world) {
		super(world);
	}

	public PS85Baggage(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "D&RGW");
		InsertTexture(1, "C&O (Semi-Fictional)");
		InsertTexture(2, "DLMR");
	}


	@Override
	public String getInventoryName() {
		return "Pullman Standard 85' Baggage";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.97F;
	}

	
}