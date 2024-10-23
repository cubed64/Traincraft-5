package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class WPShops600Series extends AbstractWorkCart
{
    public WPShops600Series(World world) {
        super(world);
        textureDescriptionMap.put(0, "WP");
        textureDescriptionMap.put(1, "WP");
        textureDescriptionMap.put(2, "WP MOW");
        textureDescriptionMap.put(3, "SN");
    }

    public WPShops600Series(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

    @Override
    public double getAdditionalYOffset()
    {
        return -0.1F;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart)
    {
        return 2.125F;
    }
}