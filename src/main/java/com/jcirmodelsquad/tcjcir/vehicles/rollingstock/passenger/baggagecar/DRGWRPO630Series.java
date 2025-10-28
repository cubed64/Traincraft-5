package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class DRGWRPO630Series extends AbstractStandardFixedFreightCar
{
	public DRGWRPO630Series(World world) {
		super(world);
	}



	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "D&RGW");
		InsertTexture(1, "D&RGW (4 stripe)");
	}

	@Override
	public String getInventoryName() {
		return "DRGW 630 Series RPO(30')";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.23F;
	}
}