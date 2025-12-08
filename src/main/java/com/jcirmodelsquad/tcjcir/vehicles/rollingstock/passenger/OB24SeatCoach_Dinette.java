package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OB24SeatCoach_Dinette extends AbstractPassengerCar
{

	public OB24SeatCoach_Dinette(World world) {
		super(world);
		InsertTexture(0, "BAR (150)");
		InsertTexture(1, "BAR (151)");
		InsertTexture(2, "BAR (152)");
		InsertTexture(3, "BAR (Semi-Fictional)");
		InsertTexture(4, "BAR (150-151, Grey and Sapphire)");
		InsertTexture(5, "BAR (152, Grey and Sapphire, Aroostook Flyer)");
	}



	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.97F;
	}

	@Override
	public String transportYear() {
		return "1937";
	}
}