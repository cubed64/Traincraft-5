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


public class DieselDash940C extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash940C;
    }
    public DieselDash940C(World world) {
        super(world, EnumTrains.Dash940C.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Avanste Northeastern");
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.9, 0.3, -0.35); }

    
    
    
    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }
    
    @Override
    public String getInventoryName() {
        return "GE Dash 9-40C";
    }
    
    
    
}
