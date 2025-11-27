package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import train.common.api.AbstractStandardFreightCar;
import train.common.api.Freight;
import train.common.entity.CargoManager;
import train.common.library.GuiIDs;

public class OBRPO15 extends AbstractStandardFixedFreightCar
{
	public OBRPO15(World world) {
		super(world);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "BAR (566-568)");
		InsertTexture(1, "BAR (569)");
		InsertTexture(2, "BAR (566-568, Grey and Sapphire)");
		InsertTexture(3, "BAR (568, Grey and Sapphire, Aroostook Flyer)");
		InsertTexture(4, "BAR (569, Grey and Sapphire)");
		InsertTexture(5, "NEP");
	}

	@Override
	public String getInventoryName() {
		return "Osgood Bradley RPO(15')";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.37F;
	}
}