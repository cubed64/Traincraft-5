package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class DRGWboose extends AbstractWorkCart
{
    public DRGWboose(World world) {
        super(world);
        textureDescriptionMap.put(0, "idk what this is, fix it dominik");
        textureDescriptionMap.put(1, "idk what this is, fix it dominik");
        textureDescriptionMap.put(2, "idk what this is, fix it dominik");
        textureDescriptionMap.put(3, "idk what this is, fix it dominik");
        textureDescriptionMap.put(4, "idk what this is, fix it dominik");
        textureDescriptionMap.put(5, "idk what this is, fix it dominik");
        textureDescriptionMap.put(6, "idk what this is, fix it dominik");
        textureDescriptionMap.put(7, "idk what this is, fix it dominik");
        textureDescriptionMap.put(8, "idk what this is, fix it dominik");
        textureDescriptionMap.put(9, "idk what this is, fix it dominik");
        textureDescriptionMap.put(10, "idk what this is, fix it dominik");
        textureDescriptionMap.put(11, "idk what this is, fix it dominik");
        textureDescriptionMap.put(12, "idk what this is, fix it dominik");
        textureDescriptionMap.put(13, "DLMR");
        textureDescriptionMap.put(14, "C&PV");
    }

    public DRGWboose(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

    @Override
    public float getOptimalDistance(EntityMinecart cart)
    {
        return 2.4F;
    }

    @Override
    public String getInventoryName() {
        return "Logging Caboose";
    }
}