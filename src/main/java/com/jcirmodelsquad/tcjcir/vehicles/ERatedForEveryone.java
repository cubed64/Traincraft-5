package com.jcirmodelsquad.tcjcir.vehicles;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;

import java.util.List;

public class ERatedForEveryone extends EntityRollingStock
{
    public ERatedForEveryone(World world)
    {
        super(world);
    }



    @Override
    public GameProfile getOwner()
    {
        return null;
    }

    @Override
    public boolean isLocomotive()
    {
        return false;
    }

    @Override
    public boolean isPassenger()
    {
        return false;
    }

    @Override
    public boolean isFreightCart()
    {
        return false;
    }

    @Override
    public boolean isFreightOrPassenger()
    {
        return false;
    }

    @Override
    public boolean isBuilder()
    {
        return false;
    }

    @Override
    public boolean isTender()
    {
        return false;
    }

    @Override
    public boolean isWorkCart()
    {
        return false;
    }

    @Override
    public boolean isElectricTrain()
    {
        return false;
    }

    @Override
    public boolean isLinked()
    {
        return false;
    }

    @Override
    public float getLinkageDistance(EntityMinecart cart)
    {
        return 0;
    }

    @Override
    public boolean canBeAdjusted(EntityMinecart cart2)
    {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart2)
    {
        return 0;
    }

    @Override
    public List<ItemStack> getItemsDropped()
    {
        return null;
    }

    @Override
    public int getMinecartType()
    {
        return 0;
    }
}
