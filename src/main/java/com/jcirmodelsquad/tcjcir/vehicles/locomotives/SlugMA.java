package com.jcirmodelsquad.tcjcir.vehicles.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractTankSlug;
import train.common.library.EnumTrains;

public class SlugMA extends AbstractTankSlug
{
	public SlugMA(World world) {
		super(world, EnumTrains.SlugMA);
		InsertTexture(0, "ANE SMA-1");
		InsertTexture(1, "ANE SMA-2");
		InsertTexture(2, "Magnolia");
		InsertTexture(3, "CSXT");
		InsertTexture(4, "ATSF");
	}

	public SlugMA(World world, double d, double d1, double d2) {
		super(world, EnumTrains.SlugMA, d, d1, d2);
	}

	@Override
	public String getInventoryName() {
		return "Slug";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.5F;
	}
}