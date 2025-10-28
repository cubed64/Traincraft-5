package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Hopper6260 extends AbstractStandardFreightCar
{
	public Hopper6260(World world) {
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
		InsertTexture(0, "Generic Light Grey");
		InsertTexture(1, "GATX");
		InsertTexture(2, "CSWR");
		InsertTexture(3, "Generic Brown");
		InsertTexture(4, "GATX TWO");
		InsertTexture(5, "WP");
	}

	@Override
	public String getInventoryName() {
		return "6260 Cubic Foot Jumbo Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.75F;
	}
}