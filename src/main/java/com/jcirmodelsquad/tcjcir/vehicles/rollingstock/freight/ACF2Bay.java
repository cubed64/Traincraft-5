package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACF2Bay extends AbstractStandardFreightCar
{
	public ACF2Bay(World world)
	{
		super(world);
	}

	public ACF2Bay(World world, double x, double y, double z) {
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
		textureDescriptionMap.put(0, "B&B");
		textureDescriptionMap.put(1, "FNCC");
		textureDescriptionMap.put(2, "GLNT");
		textureDescriptionMap.put(3, "SPB");
		textureDescriptionMap.put(4, "BN");
		textureDescriptionMap.put(5, "WP");
		textureDescriptionMap.put(6, "AA");
		textureDescriptionMap.put(7, "DRGW");
		textureDescriptionMap.put(8, "GN (Early)");
		textureDescriptionMap.put(9, "GN (BSB)");
		textureDescriptionMap.put(10, "NP");
		textureDescriptionMap.put(11, "CB&Q");
		textureDescriptionMap.put(12, "LRR");
	}

	@Override
	public String getInventoryName() {
		return "AC&F 2980 Cu Ft 2-Bay Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.1F;
	}
}