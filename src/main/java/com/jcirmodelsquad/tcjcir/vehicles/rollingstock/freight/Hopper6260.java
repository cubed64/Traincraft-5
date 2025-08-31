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

	public Hopper6260(World world, double x, double y, double z){
		super(world, x , y, z);
	}

	@Override
	public CargoManager setupCargoManager()
	{
		return null;
	}

	@Override
	public void setupTextureDescription()
	{
		textureDescriptionMap.put(0, "Generic Light Grey");
		textureDescriptionMap.put(1, "GATX");
		textureDescriptionMap.put(2, "CSWR");
		textureDescriptionMap.put(3, "Generic Brown");
		textureDescriptionMap.put(4, "GATX TWO");
		textureDescriptionMap.put(5, "WP");
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