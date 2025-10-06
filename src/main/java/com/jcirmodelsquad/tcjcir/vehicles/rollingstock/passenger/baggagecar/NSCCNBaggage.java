package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.Freight;
import train.common.library.GuiIDs;

public class NSCCNBaggage extends Freight implements IInventory
{
	public int freightInventorySize;
	public int numFreightSlots;

	public NSCCNBaggage(World world)
	{
		super(world);
		initFreightCart();
		InsertTexture(0, "CN 9031-9080 (early)");
		InsertTexture(1, "CN 9031-9080");
		InsertTexture(2, "CN 9059 (1960 experimental scheme)");
		InsertTexture(3, "CN 9031-9080 (noodle)");
		InsertTexture(4, "CN 9085-9202 (early)");
		InsertTexture(5, "CN 9085-9202");
		InsertTexture(6, "CN 9085-9202 (noodle)");
		InsertTexture(7, "CN 9203-9227, 9233-9302");
		InsertTexture(8, "CN 9203-9227, 9233-9302 (noodle)");
		InsertTexture(9, "CN 9646 (Champlain)");
		InsertTexture(10, "CN 9228-9232 (end door)");
		InsertTexture(11, "CN 9228-9232 (end door, noodle)");
		InsertTexture(12, "VIA CN (6 wheel trucks)");
		InsertTexture(13, "VIA (6 wheel trucks");
		InsertTexture(14, "VIA CN");
		InsertTexture(15, "VIA");
		InsertTexture(16, "VIA CN (end door)");
		InsertTexture(17, "VIA (end door)");
		InsertTexture(18, "ONT 410-412");
		InsertTexture(19, "ONT 410, 412 (late)");
		InsertTexture(20, "AC 308-309 (end door)");
	}

	public void initFreightCart() {
		numFreightSlots = 9;
		if(trainSpec!=null)freightInventorySize = trainSpec.getCargoCapacity();
		cargoItems = new ItemStack[freightInventorySize];
	}

	public NSCCNBaggage(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + (double) yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	@Override
	public void setDead() {
		super.setDead();
		isDead = true;
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);

		NBTTagList nbttaglist = new NBTTagList();
		for (int i = 0; i < cargoItems.length; i++) {
			if (cargoItems[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				cargoItems[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}
		nbttagcompound.setTag("Items", nbttaglist);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);

		NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		cargoItems = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound1.getByte("Slot") & 0xff;
			if (j >= 0 && j < cargoItems.length) {
				cargoItems[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
	}

	@Override
	public String getInventoryName() {
		return "National Car Company 76' Baggage";
	}

	@Override
	public int getSizeInventory() {
		return freightInventorySize;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		playerEntity = entityplayer;
		if ((super.interactFirst(entityplayer))) {
			return false;
		}
		entityplayer.openGui(Traincraft.instance, GuiIDs.FREIGHT, worldObj, this.getEntityId(), -1, (int) this.posZ);
		return true;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.49F;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
}