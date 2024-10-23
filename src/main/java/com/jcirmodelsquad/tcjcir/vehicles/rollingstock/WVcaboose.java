package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class WVcaboose extends AbstractWorkCart
{
    public WVcaboose(World world) {
        super(world);
        textureDescriptionMap.put(0, "ATSF");
        textureDescriptionMap.put(1, "BN");
        textureDescriptionMap.put(2, "MT&S");
        textureDescriptionMap.put(3, "OWO");
        textureDescriptionMap.put(4, "SOO");
        textureDescriptionMap.put(5, "Generic Green");
        textureDescriptionMap.put(6, "Magnolia");
    }

    public WVcaboose(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

    @Override
    public double getAdditionalYOffset()
    {
        return 0.3125F;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart)
    {
        return 1.9375F;
    }
}