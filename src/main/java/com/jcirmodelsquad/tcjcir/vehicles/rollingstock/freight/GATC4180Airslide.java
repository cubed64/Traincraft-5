package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class GATC4180Airslide extends AbstractStandardFreightCar
{
	public GATC4180Airslide(World world)
	{
		super(world);
	}

	public GATC4180Airslide(World world, double x, double y, double z) {
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		textureDescriptionMap.put(0, "GN (BSB)");
		textureDescriptionMap.put(1, "NP");
		textureDescriptionMap.put(2, "UP");
		textureDescriptionMap.put(3, "BB (Phase 1B)");
		textureDescriptionMap.put(4, "CBQ");
		textureDescriptionMap.put(5, "MILW");
		textureDescriptionMap.put(6, "BB (Phase 1A)");
		textureDescriptionMap.put(7, "BN");
		textureDescriptionMap.put(8, "DRGW");
		textureDescriptionMap.put(9, "MILW");
		textureDescriptionMap.put(10, "BM");
		textureDescriptionMap.put(11, "CSX");
		textureDescriptionMap.put(12, "CNW");
		textureDescriptionMap.put(13, "BB (Phase 2)");
		textureDescriptionMap.put(14, "WP");
		textureDescriptionMap.put(15, "ATSF");
		textureDescriptionMap.put(16, "RI");
		textureDescriptionMap.put(17, "ROCK");
		textureDescriptionMap.put(18, "GN Grey");
	}

	@Override
	public CargoManager setupCargoManager()
	{
		return null;
	}

	@Override
	public String getInventoryName() {
		return "GATC 4180 Cu Ft Airslide Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.4F;
	}
}