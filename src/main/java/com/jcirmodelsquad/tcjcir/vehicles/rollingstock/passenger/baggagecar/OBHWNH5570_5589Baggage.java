package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class OBHWNH5570_5589Baggage extends AbstractStandardFixedFreightCar
{
	public OBHWNH5570_5589Baggage(World world) {
		super(world);
	}

	

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "NH");
		InsertTexture(1, "NH (Mail Poles Installed)");
		InsertTexture(2, "NH (East Wind)");
		InsertTexture(3, "NH (Steel Doors)");
		InsertTexture(4, "NH (Steel Doors, Mail Poles Installed)");
		InsertTexture(5, "NH (Black Knight Scheme)");
		InsertTexture(6, "NH (Black Knight Scheme, Red Doors)");
	}

	@Override
	public String getInventoryName() {
		return "Osgood Bradley NH 5570-5589 Series Baggage";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.37F;
	}

	@Override
	public String transportYear() {
		return "1927";
	}
}