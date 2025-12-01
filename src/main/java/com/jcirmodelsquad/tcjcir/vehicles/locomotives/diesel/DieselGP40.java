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

public class DieselGP40 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP40;
    }
    public DieselGP40(World world) {
        super(world, EnumTrains.GP40.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Wisconsin Central (FrankenForty)");
        InsertTexture(1, "Wisconsin Central");
        InsertTexture(2, "Seaboard System");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "Western Pacific 1776");
        InsertTexture(5, "Western Pacific");
        InsertTexture(6, "are there any more Western Pacifics i should know about");
        InsertTexture(7, "Burlington Northern");
        InsertTexture(8, "Chicago, Burlington & Quincy");
        InsertTexture(9, "Suffern Hoboken Interstate Transfer");
        InsertTexture(10, "Deadwood & La Mesa");
        InsertTexture(11, "New York Central");
        InsertTexture(12, "New York Central");
        InsertTexture(13, "Great Lakes & Northern Territories");
        InsertTexture(14, "DRGW (small logo)");
        InsertTexture(15, "Western Maryland");
        InsertTexture(16, "Milwaukee Road");
        InsertTexture(17, "Milwaukee Road (Billboard)");
        InsertTexture(18, "North Fox (Kit-80)", LockoutGroup.FNCC);
        InsertTexture(19, "IC (Deathstar)");
        InsertTexture(20, "Falcon Commercial Railroad");
        InsertTexture(21, "SAMM");
        InsertTexture(22, "AA (Fog)");
        InsertTexture(23, "CSXT (Yn1)");
        InsertTexture(24, "CSXT (Stealth)");
        InsertTexture(25, "CSXT (Bluedown)");
        InsertTexture(26, "CSXT (MoW Pumpkin) ");
        InsertTexture(27, "Chessie System");
        InsertTexture(28, "");
        InsertTexture(29, "");
        InsertTexture(30, "");
        InsertTexture(31, "");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.9, 0.15, -0.325); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.25F; }

    @Override
    public String transportYear() {
        return "1965-1971";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP40";
    }
}