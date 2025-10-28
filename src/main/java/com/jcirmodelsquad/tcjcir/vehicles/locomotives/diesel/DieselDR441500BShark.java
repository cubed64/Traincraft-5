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
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;


public class DieselDR441500BShark extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDR441500BShark;
    }
    public DieselDR441500BShark(World world) {
        super(world, EnumTrains.DR441500BShark.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Demonstrator");
        InsertTexture(1, "Elgin, Joliet & Eastern");
        InsertTexture(2, "Baltimore & Ohio");
        InsertTexture(3, "Baltimore & Ohio (Late)");
        InsertTexture(4, "Blandsville & Blankerston");

    }




    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.15, -0.08, -0.47); }
    



    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.08F;
    }



    @Override
    public String getInventoryName() {
        return "BLW DR-4-4-1500B (Phase 3)";
    }

    

    
    

}
