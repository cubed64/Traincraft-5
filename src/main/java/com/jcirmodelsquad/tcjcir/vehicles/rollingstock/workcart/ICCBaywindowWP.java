package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class ICCBaywindowWP extends AbstractWorkCart
{
    public ICCBaywindowWP(World world) {
        super(world);
        InsertTexture(0, "WP");
        InsertTexture(1, "WP (Later)");
        InsertTexture(2, "WP (Yard)");
        InsertTexture(3, "Generic");
        InsertTexture(4, "Fox, North Coast & Cascades (Regal)");
        InsertTexture(5, "Fox, North Coast & Cascades (Regal Late)");
        InsertTexture(6, "Fox, North Coast & Cascades (KIT-L)");
        InsertTexture(7, "North Fox (KIT-L)");
        InsertTexture(8, "DLMR");
        InsertTexture(9, "DLMR (but somebody spilled the ketchup)");
        InsertTexture(10, "AGW");
    }

    @Override
    public String transportCountry()
    {
        return "US";
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