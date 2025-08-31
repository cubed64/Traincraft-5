package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACF3960 extends AbstractStandardFreightCar
{
	public ACF3960(World world) {
		super(world);
	}

	public ACF3960(World world, double d, double d1, double d2) {
		super(world, d, d1, d2);
	}

	@Override
	public CargoManager setupCargoManager()
	{
		return null;
	}

	@Override
	public void setupTextureDescription()
	{
		textureDescriptionMap.put(0, "BN (Silver)");
		textureDescriptionMap.put(1, "BN (Green)");
		textureDescriptionMap.put(2, "GN (White)");
		textureDescriptionMap.put(3, "GN (Silver)");
		textureDescriptionMap.put(4, "the P in SP stands for PISS LETTERING");
		textureDescriptionMap.put(5, "WABussy");
		textureDescriptionMap.put(6, "BNB");
	}

	@Override
	public String getInventoryName() {
		return "AC&F 3960 Cu Ft Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.5F;
	}
}