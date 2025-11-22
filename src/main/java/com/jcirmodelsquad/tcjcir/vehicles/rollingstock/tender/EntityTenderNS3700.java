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
import train.common.enums.LockoutGroup;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;

public class EntityTenderNS3700 extends Tender{

	public EntityTenderNS3700(World world) {
		super(world, FluidRegistry.WATER, 0, EnumTrains.tenderNS3700.getTankCapacity(), LiquidManager.WATER_FILTER);

		InsertTexture(0, "NS 3737");
	}

	@Override
	public String getInventoryName() {
		return "NS 3700 Tender";
	}

	@Override
	public boolean canBeRidden() {
		return false;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.1F;
	}

}