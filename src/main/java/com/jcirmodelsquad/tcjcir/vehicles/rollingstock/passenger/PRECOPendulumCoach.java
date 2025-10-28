package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PRECOPendulumCoach extends AbstractPassengerCar
{
	public PRECOPendulumCoach(World world) {
		super(world);
		InsertTexture(0, "ATSF");
		InsertTexture(1, "ATSF (shadowline)");
		InsertTexture(2, "ATSF (silver)");
		InsertTexture(3, "ATSF (late)");
		InsertTexture(4, "CB&Q");
		InsertTexture(5, "CB&Q (removed center skirting");
		InsertTexture(6, "GN (as delivered)");
		InsertTexture(7, "GN (as put into service)");
		InsertTexture(8, "GN (silver)");
		InsertTexture(9, "GN (Empire Builder)");
		InsertTexture(10, "GN");
		InsertTexture(11, "AA (fictional)");
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