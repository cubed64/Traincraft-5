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

public class DOT11120600 extends AbstractStandardTankerCar {
    public int freightInventorySize;

    public DOT11120600(World world) {
        super(world, EnumTrains.DOT11120600.getTankCapacity());
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "Generic");
        InsertTexture(1, "PROX");
        InsertTexture(2, "CCOX/ECYX");
        InsertTexture(3, "CCOX/ECYX");
        InsertTexture(4, "AMPX");
    }

    @Override
    public String getInventoryName() {
        return "20,600 Gallon Tank car";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.125F;
    }

}