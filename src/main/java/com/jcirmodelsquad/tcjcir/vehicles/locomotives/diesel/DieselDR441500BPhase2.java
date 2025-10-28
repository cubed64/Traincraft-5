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


public class DieselDR441500BPhase2 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDR441500BPhase2;
    }
    public DieselDR441500BPhase2(World world) {
        super(world, EnumTrains.DR441500BPhase2.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Missouri Pacific (As delivered)");
        InsertTexture(1, "Missouri Pacific");
        InsertTexture(2, "New York Central (As delivered)");
        InsertTexture(3, "New York Central");
        InsertTexture(4, "New York Central (Dynamics removed)");
        InsertTexture(5, "New York Central (Cigarband)");
        InsertTexture(6, "Blandsville & Blankerston");
        InsertTexture(7, "Galesburg Clinton & Midland");
        InsertTexture(8, "Steampunk Rail", LockoutGroup.SPR);

    }
    



    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.35, -0.08, -0.47); }


    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.08F;
    }



    @Override
    public String getInventoryName() {
        return "BLW DR-4-4-1500B (Phase 2)";
    }



    


}
