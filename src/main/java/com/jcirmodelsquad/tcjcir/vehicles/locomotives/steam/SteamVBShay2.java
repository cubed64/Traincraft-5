package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class SteamVBShay2 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamVBShay2;
	}

	public SteamVBShay2(World world) {
		super(world, EnumTrains.VBShay.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	@Override
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset()+0.4F, posZ);// default
	}

@Override
	public String getInventoryName() {
		return "2 Truck Vertical Boiler Shay";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.5F;
	}

	
}