package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OB76SeatDividedCoach extends AbstractPassengerCar
{

	public OB76SeatDividedCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "SAL");
		textureDescriptionMap.put(1, "SAL (After Renovation)");
		textureDescriptionMap.put(2, "SAL (After Renovation, Late)");
		textureDescriptionMap.put(3, "KCS");
		textureDescriptionMap.put(4, "KCS (Late)");
		textureDescriptionMap.put(5, "SSW");
		textureDescriptionMap.put(6, "SSW (Daylight Scheme)");
		textureDescriptionMap.put(7, "SP (Two-Tone Grey");
		textureDescriptionMap.put(8, "SP (Sunset Scheme, Removed Skirting)");
		textureDescriptionMap.put(9, "SP (Sunset Scheme)");
		textureDescriptionMap.put(10, "OCG");
	}

	public OB76SeatDividedCoach(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
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
}