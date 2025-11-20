package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class Diesel4ED172T_C extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.Diesel4ED172_C; }

    public Diesel4ED172T_C(World world) {
        super(world, EnumTrains.CEE4ED172T_C.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "PAMC (Late)");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "SPR", LockoutGroup.SPR);
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.8, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String getInventoryName() { return "CEE 4ED-172T (CAT Repower)"; }

    @Override
    public boolean isFictional() {
        return true;
    }
}
