package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;

public class TenderShay3Truck extends Tender  {

	
	

	public TenderShay3Truck(World world) {
		super(world, FluidRegistry.WATER, 0, EnumTrains.Shay3TruckTender.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	@Override
	public String getInventoryName() {
		return "Class 3-PC-13 3-Truck Shay Tender";
	}

	

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.7F;
	}

	
}