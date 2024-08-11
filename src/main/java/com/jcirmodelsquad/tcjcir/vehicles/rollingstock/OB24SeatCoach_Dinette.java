package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OB24SeatCoach_Dinette extends AbstractPassengerCar
{

	public OB24SeatCoach_Dinette(World world) {
		super(world);
		textureDescriptionMap.put(0, "BAR (150)");
		textureDescriptionMap.put(1, "BAR (151)");
		textureDescriptionMap.put(2, "BAR (152)");
		textureDescriptionMap.put(3, "BAR (Semi-Fictional)");
		textureDescriptionMap.put(4, "BAR (150-151, Grey and Sapphire)");
		textureDescriptionMap.put(5, "BAR (152, Grey and Sapphire, Aroostook Flyer)");
	}

	public OB24SeatCoach_Dinette(World world, double posX, double posY, double posZ)
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