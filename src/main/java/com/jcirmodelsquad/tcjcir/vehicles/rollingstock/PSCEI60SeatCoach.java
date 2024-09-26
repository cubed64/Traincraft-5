package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSCEI60SeatCoach extends AbstractPassengerCar {

	public PSCEI60SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "C&EI 460 (Vigo Trail)");
		textureDescriptionMap.put(1, "C&EI 461 (Vincennes Trail)");
		textureDescriptionMap.put(2, "C&EI 462 (Vanderburgh Trail)");
		textureDescriptionMap.put(3, "C&EI 463 (Vermilion Trail)");
		textureDescriptionMap.put(4, "C&EI 464 (Hubbard Trail)");
		textureDescriptionMap.put(5, "C&EI 465 (Egyptian Trail)");
		textureDescriptionMap.put(6, "C&EI 466 (Horseshoe Trail)");
		textureDescriptionMap.put(7, "C&EI 460 (L&N paint)");
		textureDescriptionMap.put(8, "C&EI 461 (L&N paint)");
		textureDescriptionMap.put(9, "C&EI 462, 465 (L&N paint)");
		textureDescriptionMap.put(10, "C&EI 463, 466 (L&N paint)");
		textureDescriptionMap.put(11, "C&EI 464 (L&N paint)");
		textureDescriptionMap.put(12, "IC (Interior Scheme 1)");
		textureDescriptionMap.put(13, "IC (Interior Scheme 2)");
	}

	public PSCEI60SeatCoach(World world, double posX, double posY, double posZ)
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