package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class PSSOURPO_30 extends AbstractStandardFixedFreightCar
{
	public PSSOURPO_30(World world) {
		super(world);
	}

	

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "SOU (early)");
		InsertTexture(1, "SOU");
		InsertTexture(2, "SOU 1725 \"Lenoir City\" (late)");
		InsertTexture(3, "SOU 1726 \"Athens\" (late)");
	}

	@Override
	public String getInventoryName() {
		return "Pullman Standard SOU RPO (30' mail section)";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.97F;
	}

	@Override
	public String transportYear() {
		return "1941";
	}
}