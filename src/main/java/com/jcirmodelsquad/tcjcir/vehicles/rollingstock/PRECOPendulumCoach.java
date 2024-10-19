package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PRECOPendulumCoach extends AbstractPassengerCar
{
	public PRECOPendulumCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "ATSF");
		textureDescriptionMap.put(1, "ATSF (shadowline)");
		textureDescriptionMap.put(2, "ATSF (silver)");
		textureDescriptionMap.put(3, "ATSF (late)");
		textureDescriptionMap.put(4, "CB&Q");
		textureDescriptionMap.put(5, "CB&Q (removed center skirting");
		textureDescriptionMap.put(6, "GN (as delivered)");
		textureDescriptionMap.put(7, "GN (as put into service)");
		textureDescriptionMap.put(8, "GN (silver)");
		textureDescriptionMap.put(9, "GN (Empire Builder)");
		textureDescriptionMap.put(10, "GN");
		textureDescriptionMap.put(11, "AA (fictional)");
	}

	public PRECOPendulumCoach(World world, double posX, double posY, double posZ)
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