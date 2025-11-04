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

public class GATC10000 extends AbstractStandardTankerCar {

    public GATC10000(World world) {
        super(world, EnumTrains.gatc10000.getTankCapacity());
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "GATC");
        InsertTexture(1, "GATC (Early)");
        InsertTexture(2, "GATC");
        InsertTexture(3, "ARR");
        InsertTexture(4, "HPCX");
        InsertTexture(5, "GATC (Union Oil)");
        InsertTexture(6, "GATC (Allied Chemical)");
    }

    @Override
    public String getInventoryName() {
        return "GATC 10,000 Gallon Tank car";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.1F;
    }
}