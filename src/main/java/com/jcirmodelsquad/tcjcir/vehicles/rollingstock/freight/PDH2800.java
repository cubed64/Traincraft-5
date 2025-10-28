package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PDH2800 extends AbstractStandardFreightCar
{
	public PDH2800(World world) {
		super(world);
	}



	@Override
	public CargoManager setupCargoManager()
	{
		return null;
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "DPCX");
		InsertTexture(1, "DPCX");
		InsertTexture(2, "DPCX");
		InsertTexture(3, "WP");
		InsertTexture(4, "LEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
		InsertTexture(5, "BN");
		InsertTexture(6, "CB&Q");
	}

	@Override
	public String getInventoryName() {
		return "GATX 2800 Cu Ft Pressure Differential Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.8F;
	}
}