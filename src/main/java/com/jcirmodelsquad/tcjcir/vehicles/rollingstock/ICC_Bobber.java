package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class ICC_Bobber extends AbstractWorkCart
{
    public ICC_Bobber(World world) {
        super(world);
        textureDescriptionMap.put(0, "McCloud, As Modified");
        textureDescriptionMap.put(1, "McCloud, As Delivered");
        textureDescriptionMap.put(2, "Blank");
        textureDescriptionMap.put(3, "Magnolia Acres; Coffeeville");
        initCabooseWorkCart();
    }

    public ICC_Bobber(World world, double posX, double posY, double posZ)
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
        return 1.625F;
    }


    /**
     * Returns the name of the inventory
     */
    @Override
    public String getInventoryName()
    {
        return "ICC Bobber Wide Vision";
    }
}