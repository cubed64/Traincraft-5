package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class BuddPrewarBaggage extends AbstractStandardFixedFreightCar
{
	public BuddPrewarBaggage(World world)
	{
		super(world);
	}

	

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "CB&Q 900 \"Silver Light\" (early)");
		InsertTexture(1, "CB&Q 900 \"Silver Light\"");
		InsertTexture(2, "CB&Q 900 \"Silver Light\" (late)");
		InsertTexture(3, "ATSF 3432-3445");
		InsertTexture(4, "ATSF 3446-3452");
		InsertTexture(5, "ATSF 3440 (late)");
	}

	@Override
	public String getInventoryName() {
		return "Budd Prewar Baggage";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.23F;
	}
}