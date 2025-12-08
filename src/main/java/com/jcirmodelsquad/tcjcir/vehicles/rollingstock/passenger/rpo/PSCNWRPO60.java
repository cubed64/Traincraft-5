package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;
import train.common.enums.LockoutGroup;

public class PSCNWRPO60 extends AbstractStandardFixedFreightCar
{
	public PSCNWRPO60(World world) {
		super(world);
		InsertTexture(8, "FMSR",LockoutGroup.FMSR);
		InsertTexture(9, "FMSR",LockoutGroup.FMSR);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "CNW");
		InsertTexture(1, "CNW (late)");
		InsertTexture(2, "SP (UP paint)");
		InsertTexture(3, "SP (UP paint, late)");
		InsertTexture(4, "SOU");
		InsertTexture(5, "L&N");
		InsertTexture(6, "W&A");
		InsertTexture(7, "SOU (black roof)");
	}

	@Override
	public String getInventoryName() {
		return "Pullman Standard RPO(60')";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.85F;
	}

	@Override
	public String transportYear() {
		return "1949-1950";
	}
}