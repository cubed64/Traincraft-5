package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricW_A55 extends ElectricTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricPCCCar;
    }
    public ElectricW_A55(World world) {
        super(world);
        InsertTexture(0, "Generic");
    }

    public ElectricW_A55(World world, double d, double d1, double d2) {
        this(world);
        setPosition(d, d1 + (double) yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d ;
        prevPosY = d1;
        prevPosZ = d2;
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.27, -0.3, 0.4); }

    

    





    @Override
    public String getInventoryName() {
        return "SEC W-A55";
    }

    
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.52F;
    }

    
    
}
