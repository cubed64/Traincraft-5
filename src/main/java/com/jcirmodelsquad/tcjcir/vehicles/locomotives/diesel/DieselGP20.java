package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class DieselGP20 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP20;
    }
    public DieselGP20(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "EMD Demonstrator");
        InsertTexture(0, "Western Pacific");
        InsertTexture(0, "Union Pacific \"Omaha GP20\" ");
        InsertTexture(0, "Southern Pacific");
        InsertTexture(0, "New York Central");
        InsertTexture(0, "AT&SF");
        InsertTexture(0, "D&LMR");
        InsertTexture(0, "Oil Clusters and Garden");
        InsertTexture(0, "Lowhood Blank");
        InsertTexture(0, "Highhood Blank");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.55, 0.15, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    @Override
    public String transportYear() {
        return "1959-1963";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP20";
    }

}