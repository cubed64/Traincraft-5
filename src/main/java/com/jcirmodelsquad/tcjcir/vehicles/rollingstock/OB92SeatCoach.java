package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OB92SeatCoach extends AbstractPassengerCar
{

	public OB92SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "NH (As Delivered)");
		textureDescriptionMap.put(1, "NH");
		textureDescriptionMap.put(2, "NH (RDC Scheme 1)");
		textureDescriptionMap.put(3, "NH (RDC Scheme 2");
		textureDescriptionMap.put(4, "NH (Late)");
		textureDescriptionMap.put(5, "NH (McGinnis Scheme)");
		textureDescriptionMap.put(6, "NH (Black Knight Scheme)");
		textureDescriptionMap.put(7, "PC");
		textureDescriptionMap.put(8, "Spunch Bop Rayroad");
	}

	public OB92SeatCoach(World world, double posX, double posY, double posZ)
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