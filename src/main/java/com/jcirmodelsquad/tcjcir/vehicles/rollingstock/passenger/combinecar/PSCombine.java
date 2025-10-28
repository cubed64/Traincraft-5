package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.api.AbstractPassengerCombineCar;

public class PSCombine extends AbstractPassengerCombineCar
{
	public PSCombine(World world)
	{
		super(world);
	}



	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "C&O");
		InsertTexture(1, "D&RGW");
		InsertTexture(2, "D&RGW (As Delivered)");
		InsertTexture(3, "D&RGW 1231 Rio Grande Zephyr Scheme 1");
		InsertTexture(4, "D&RGW 1231 Rio Grande Zephyr Scheme 2");
		InsertTexture(5, "D&RGW 1230 Rio Grande Zephyr");
		InsertTexture(6, "DLMR");
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