package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;

public class SteamShay3Truck extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.Steam3Truck;
	}
	public SteamShay3Truck(World world) {
		super(world, EnumTrains.Shay3Truck.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	@Override
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset()+0.0F, posZ);// default
	}

@Override
	public String getInventoryName() {
		return "Class 3-PC-13 3-Truck Shay";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.7F;
	}

	
}