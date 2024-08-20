package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.library.GuiIDs;

public class WPShops600Series extends AbstractPassengerCar
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
    public void pressKey(int i)
    {
        if(locked && riddenByEntity != null && riddenByEntity instanceof EntityPlayer&& !((EntityPlayer)riddenByEntity).getDisplayName().toLowerCase().equals(this.trainOwner.toLowerCase()))
        {
            return;
        }

        if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer)
        {
            ((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.CRAFTING_CART, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }
    }

    @Override
    public double getAdditionalYOffset()
    {
        return -0.1F;
    }

    @Override
    public float getOptimalLinkingDistance()
    {
        return 2.125F;
    }
}