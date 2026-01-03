package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;

public class DieselU23C extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU23C;
    }
    public DieselU23C(World world) {
        super(world, LiquidManager.dieselFilter());//its like magic guys trust me

        InsertTexture(0, "Consolidate DeeZ NUTS");
        InsertTexture(1, "Nautilus", LockoutGroup.CUBED);
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "ATSF Pinstripe");
        InsertTexture(4, "ATSF Freightbonnet");
        InsertTexture(5, "");
        InsertTexture(6, "");
        InsertTexture(7, "");
    }


    @Override
    public String transportCountry()
    {
        return "US";
    }
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.6, 0.3, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.65F;
    }

    @Override
    public String transportYear() {
        return "1968-1976";
    }

    @Override
    public String getInventoryName() {
        return "GE U23C";
    }

}
