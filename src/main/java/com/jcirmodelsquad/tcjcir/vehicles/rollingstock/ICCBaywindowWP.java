package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.api.AbstractWorkCart;
import train.common.library.GuiIDs;

public class ICCBaywindowWP extends AbstractWorkCart
{
    public ICCBaywindowWP(World world) {
        super(world);
        textureDescriptionMap.put(0, "WP");
        textureDescriptionMap.put(1, "WP (Later)");
        textureDescriptionMap.put(2, "WP (Yard)");
        textureDescriptionMap.put(3, "Generic");
        textureDescriptionMap.put(4, "Fox, North Coast & Cascades (Regal)");
        textureDescriptionMap.put(5, "Fox, North Coast & Cascades (Regal Late)");
        textureDescriptionMap.put(6, "Fox, North Coast & Cascades (KIT-L)");
        textureDescriptionMap.put(7, "North Fox (KIT-L)");
        textureDescriptionMap.put(8, "DLMR");
        textureDescriptionMap.put(9, "DLMR (but somebody spilled the ketchup)");
        initCabooseWorkCart();
    }

    public ICCBaywindowWP(World world, double posX, double posY, double posZ)
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
        return 2.1F;
    }


    /**
     * Returns the name of the inventory
     */
    @Override
    public String getInventoryName()
    {
        return "ICC Baywindow Caboose (WP Config)";
    }
}