package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACF3500 extends AbstractStandardFreightCar
{
	public ACF3500(World world)
	{
		super(world);
	}

	public ACF3500(World world, double x, double y, double z)
	{
		super(world, x , y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		textureDescriptionMap.put(0, "CB&Q");
		textureDescriptionMap.put(1, "Chessie System");
		textureDescriptionMap.put(2, "CNJ");
		textureDescriptionMap.put(3, "CSX");
		textureDescriptionMap.put(4, "CSX (with placard holder)");
		textureDescriptionMap.put(5, "EL");
		textureDescriptionMap.put(6, "SP (BLCX)");
		textureDescriptionMap.put(7, "TPW");
		textureDescriptionMap.put(8, "UP");
		textureDescriptionMap.put(9, "Blandsville & Blankerston");
		textureDescriptionMap.put(10, "ARR (ph4)");
		textureDescriptionMap.put(11, "MP (ph4)");
		textureDescriptionMap.put(12, "MP/KOG (ph4)");
		textureDescriptionMap.put(13, "Blandsville & Blankerston (ph4)");
	}

	@Override
	public CargoManager setupCargoManager()
	{
		return null;
	}

	@Override
	public String getInventoryName() {
		return "AC&F 3500 Cu Ft Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.5F;
	}
}