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

	public PDH2800(World world, double x, double y, double z){
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
		textureDescriptionMap.put(0, "DPCX");
		textureDescriptionMap.put(1, "DPCX");
		textureDescriptionMap.put(2, "DPCX");
		textureDescriptionMap.put(3, "WP");
		textureDescriptionMap.put(4, "LEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
		textureDescriptionMap.put(5, "BN");
		textureDescriptionMap.put(6, "CB&Q");
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