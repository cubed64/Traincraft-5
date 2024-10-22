package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class HBC1Cboose extends AbstractWorkCart
{
    public HBC1Cboose(World world) {
        super(world);
        textureDescriptionMap.put(0, "Fox, North Coast & Cascades");
        textureDescriptionMap.put(1, "Fox, North Coast & Cascades");
        textureDescriptionMap.put(2, "Fox, North Coast & Cascades");
        textureDescriptionMap.put(3, "Western Pacific");
        textureDescriptionMap.put(4, "Steampunk Rail");
        textureDescriptionMap.put(5, "Great Lakes & Nice Tiddies");
    }

    public HBC1Cboose(World world, double posX, double posY, double posZ)
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
        return 2.23F;
    }
}