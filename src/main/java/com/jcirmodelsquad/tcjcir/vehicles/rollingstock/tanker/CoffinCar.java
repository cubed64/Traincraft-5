package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tanker;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.AbstractStandardTankerCar;
import train.common.api.LiquidTank;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;

public class CoffinCar extends AbstractStandardTankerCar {


    public CoffinCar(World world) {
        super(world, EnumTrains.CoffinCar.getTankCapacity());
    }

    @Override
    public void setupTextureDescription()
    {

    }

    @Override
    public String getInventoryName() {
        return "Early Coffin Car";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.4F;
    }
}