package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

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

public class ACF4650 extends Freight implements IInventory {
	public int freightInventorySize;
	public int numFreightSlots;
	EntityPlayer playerEntity;

	public ACF4650(World world) {
		super(world);
		initFreightGrain();
		textureDescriptionMap.put(0, "BN");
		textureDescriptionMap.put(1, "BN (ex FWD)");
		textureDescriptionMap.put(2, "BN (ex GN/NP)");
		textureDescriptionMap.put(3, "ACFX (Blue Swaws)");
		textureDescriptionMap.put(4, "BB (1964-1965)");
		textureDescriptionMap.put(5, "BB (1966-1970)");
		textureDescriptionMap.put(6, "BB (1970+)");
		textureDescriptionMap.put(7, "LRR");
		textureDescriptionMap.put(8, "WP (Early)");
		textureDescriptionMap.put(9, "GN (Early)");
		textureDescriptionMap.put(10, "GN (BSB)");
		textureDescriptionMap.put(11, "Far-Mar CO-OP");
		textureDescriptionMap.put(12, "SP (H-100-12)");
		textureDescriptionMap.put(13, "SP (H-100-18)");
		textureDescriptionMap.put(14, "SP (H-100-39)");
		textureDescriptionMap.put(15, "MRL");
		textureDescriptionMap.put(16, "NS");
		textureDescriptionMap.put(17, "SNEEDY");
		textureDescriptionMap.put(18, "SOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOup");
		textureDescriptionMap.put(19, "Washington Grain Train");
		textureDescriptionMap.put(20, "Washington Grain Train (Stale)");
		textureDescriptionMap.put(21, "AD&N");
		textureDescriptionMap.put(22, "Cornhub");
		textureDescriptionMap.put(23, "NP");
		textureDescriptionMap.put(24, "NYC");
	}

	public void initFreightGrain() {
		numFreightSlots = 4;
		if(trainSpec!=null)freightInventorySize = trainSpec.getCargoCapacity();
		cargoItems = new ItemStack[freightInventorySize];
	}

	public ACF4650(World world, double d, double d1, double d2) {
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
		return "AC&F 650 Cu Ft 3-Bay Hopper";
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
		if (!this.worldObj.isRemote) {
			entityplayer.openGui(Traincraft.instance, GuiIDs.FREIGHT, worldObj, this.getEntityId(), -1, (int) this.posZ);
		}
		return true;
	}
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.6F;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
}