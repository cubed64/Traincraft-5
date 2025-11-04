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

public class DOT11111000 extends AbstractStandardTankerCar {

    public DOT11111000(World world) {
        super(world, EnumTrains.DOT11111000.getTankCapacity());
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "Generic");
        InsertTexture(1, "DOW");
        InsertTexture(2, "Generic Grey");
    }

    @Override
    public String getInventoryName() {
        return "11,000 Gallon Tank car";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.9375F;
    }
}