package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACF4650 extends AbstractStandardFreightCar
{
	public ACF4650(World world) {
		super(world);
	}

	public ACF4650(World world, double x, double y, double z) {
		super(world, x, y, z);
	}

	@Override
	public CargoManager setupCargoManager()
	{
		return null;
	}

	@Override
	public void setupTextureDescription()
	{
		textureDescriptionMap.put(0, "BN");
		textureDescriptionMap.put(1, "BN (ex FWD)");
		textureDescriptionMap.put(2, "BN (ex GN/NP)");
		textureDescriptionMap.put(3, "ACFX (Blue Swaws)");
		textureDescriptionMap.put(4, "BB (1964-1965)");
		textureDescriptionMap.put(5, "BB (1966-1970)");
		textureDescriptionMap.put(6, "BB (1970+)");
		textureDescriptionMap.put(7, "LRR");
		textureDescriptionMap.put(8, "WP (Early)");
		textureDescriptionMap.put(9, "GN (Early)");
		textureDescriptionMap.put(10, "GN (BSB)");
		textureDescriptionMap.put(11, "Far-Mar CO-OP");
		textureDescriptionMap.put(12, "SP (H-100-12)");
		textureDescriptionMap.put(13, "SP (H-100-18)");
		textureDescriptionMap.put(14, "SP (H-100-39)");
		textureDescriptionMap.put(15, "MRL");
		textureDescriptionMap.put(16, "NS");
		textureDescriptionMap.put(17, "SNEEDY");
		textureDescriptionMap.put(18, "SOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOup");
		textureDescriptionMap.put(19, "Washington Grain Train");
		textureDescriptionMap.put(20, "Washington Grain Train (Stale)");
		textureDescriptionMap.put(21, "AD&N");
		textureDescriptionMap.put(22, "Cornhub");
		textureDescriptionMap.put(23, "NP");
		textureDescriptionMap.put(24, "NYC");
		textureDescriptionMap.put(25, "GLNT");
	}

	@Override
	public String getInventoryName() {
		return "AC&F 4650 Cu Ft 3-Bay Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.6F;
	}
}