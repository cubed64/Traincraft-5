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

public class MILWPrewarBaggage extends Freight implements IInventory {
	public int freightInventorySize;
	public int numFreightSlots;

	public MILWPrewarBaggage(World world) {
		super(world);
		initFreightCart();
		InsertTexture(0, "MILW (1935, As built)");
		InsertTexture(1, "MILW (1935, Hiawatha)");
		InsertTexture(2, "MILW (1935, 1938 Scheme)");
		InsertTexture(3, "MILW (1935, 1942 Scheme)");
		InsertTexture(4, "MILW (1935, Early postwar scheme, skirted)");
		InsertTexture(5, "MILW (1935, Early postwar scheme)");
		InsertTexture(6, "MILW (1935, Postwar scheme)");
		InsertTexture(7, "MILW (1935, Postwar scheme, ribbed)");
		InsertTexture(8, "MILW (1935, UP scheme, UP grey trucks)");
		InsertTexture(9, "MILW (1935, UP scheme, UP grey trucks, ribbed)");
		InsertTexture(10, "MILW (1935, UP scheme)");
		InsertTexture(11, "MILW (1935, UP scheme, flat doors, ribbed)");
		InsertTexture(12, "MILW (1935, UP scheme, new doors, skirted)");
		InsertTexture(13, "MILW (1935, UP scheme, new doors, ribbed)");
		InsertTexture(14, "MILW (Baggage 1123 (rebuild of tap-dinette 5251), postwar scheme)");
		InsertTexture(15, "MILW (Baggage 1123 (rebuild of tap-dinette 5251), UP scheme)");
		InsertTexture(16, "MILW (Mail Storage 2000 (rebuild of tap-dinette 5252), postwar scheme)");
		InsertTexture(17, "MILW (Mail Storage 2000 (rebuild of tap-dinette 5252), UP scheme)");
		InsertTexture(18, "MILW (1936, As built)");
		InsertTexture(19, "MILW (1936, Early postwar scheme)");
		InsertTexture(20, "MILW (1936, Postwar scheme)");
		InsertTexture(21, "MILW (1936, Postwar scheme, ribbed)");
		InsertTexture(22, "MILW (1936, UP scheme, UP grey trucks)");
		InsertTexture(23, "MILW (1936, UP scheme, UP grey trucks, ribbed)");
		InsertTexture(24, "MILW (1936, UP scheme)");
		InsertTexture(25, "MILW (1936, UP scheme, ribbed)");
		InsertTexture(26, "MILW (1938, As built)");
		InsertTexture(27, "MILW (1938, Early postwar scheme)");
		InsertTexture(28, "MILW (1938, Postwar scheme)");
		InsertTexture(29, "MILW (1938, UP scheme, UP grey trucks)");
		InsertTexture(30, "MILW (1935, UP scheme, new doors)");
	}

	public void initFreightCart() {
		numFreightSlots = 9;
		if(trainSpec!=null)freightInventorySize = trainSpec.getCargoCapacity();
		cargoItems = new ItemStack[freightInventorySize];
	}

	public MILWPrewarBaggage(World world, double d, double d1, double d2) {
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
		return "Milwaukee Road Prewar Baggage";
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
		return 3.38F;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
}