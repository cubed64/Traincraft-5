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


public class DieselDR441500Phase2 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDR441500APhase2;
    }
    public DieselDR441500Phase2(World world) {
        super(world, EnumTrains.DR441500Phase2.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Missouri Pacific (As delivered)");
        InsertTexture(1, "Missouri Pacific");
        InsertTexture(2, "New York Central (As delivered)");
        InsertTexture(3, "New York Central");
        InsertTexture(4, "New York Central (3800, footboards)");
        InsertTexture(5, "New York Central (Dynamics removed)");
        InsertTexture(6, "New York Central (Cigarband)");
        InsertTexture(7, "Blandsville & Blankerston");
        InsertTexture(8, "Galesburg Clinton & Midland", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(9, "Steampunk Rail", LockoutGroup.SPR);
    }


    

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.9, 0.1, -0.37); }




    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.12F;
    }



    @Override
    public String getInventoryName() {
        return "BLW DR-4-4-1500 (Phase 2)";
    }

    

    
    

}
