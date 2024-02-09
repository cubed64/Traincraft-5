package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
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

public class SkeletonLogCar extends Freight implements IInventory {

	public int freightInventorySize;
	public int numFreightSlots;

	public SkeletonLogCar(World world) {
		super(world);
		initFreightWood();
		textureDescriptionMap.put(0, "Generic");
		textureDescriptionMap.put(1, "FPRRR");
		textureDescriptionMap.put(2, "Generic");
	}

	public void initFreightWood() {
		numFreightSlots = 9;
		if(trainSpec!=null)freightInventorySize = trainSpec.getCargoCapacity();
		cargoItems = new ItemStack[freightInventorySize];
	}

	public SkeletonLogCar(World world, double d, double d1, double d2) {
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
	public void onUpdate() {
		super.onUpdate();
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
		return "45' Skeleton Log Car";
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
	public boolean canBeRidden() {
		return false;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.05F;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	/**
	 * <p>This method is called on the client side when an entity is being loaded in. The additionalData buffer is sent from the server
	 * and is populated by the server using the writeSpawnData method.</p>
	 * <br></br><p>"this is basically NBT for entity spawn, to keep data between client and server in sync because some data is not automatically shared."</p>
	 * @param additionalData The packet data stream
	 */
	@Override
	public void readSpawnData(ByteBuf additionalData) {
		/*
		Because this cart uses a dynamic load texture depending on the inventory, we have to read the inventory from
		spawn data, so it is immediately accessible to the client upon load. Otherwise, the texture will not render
		correctly as, under normal circumstances, the contents of the inventory are only synced from server
		to client when a player opens the inventory.

		Fun fact, this happens in the sendContainerAndContentsToPlayer() method of the ICrafting interface.
		*/
		super.readSpawnData(additionalData);
		if (additionalData.readBoolean()) {
			NBTTagCompound nbtTagCompound = ByteBufUtils.readTag(additionalData);
			NBTTagList nbttaglist = nbtTagCompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
			cargoItems = new ItemStack[getSizeInventory()];
			for (int i = 0; i < nbttaglist.tagCount(); i++) {
				NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
				int j = nbttagcompound1.getByte("Slot") & 0xff;
				if (j < cargoItems.length) {
					cargoItems[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
				}
			}
		}
	}

	/**
	 * <p>This method is called on the server side when a connected client is loading the entity. Data written
	 * to the ByteBuffer will be synced with the client and available to the client through the readSpawnData method.</p>
	 * <br></br><p>"this is basically NBT for entity spawn, to keep data between client and server in sync because some data is not automatically shared."</p>
	 * @param buffer The packet data stream
	 */
	@Override
	public void writeSpawnData(ByteBuf buffer) {
		/*
		Because this cart uses a dynamic load texture depending on the inventory, we have to save the inventory to
		spawn data, so it is immediately accessible to the client upon load. Otherwise, the texture will not render
		correctly as, under normal circumstances, the contents of the inventory are only synced from server
		to client when a player opens the inventory.

		Fun fact, this happens in the sendContainerAndContentsToPlayer() method of the ICrafting interface.
		*/
		super.writeSpawnData(buffer);
		buffer.writeBoolean(getAmmountOfCargo() > 0);
		if (getAmmountOfCargo() > 0) {
			NBTTagCompound tagCompound = new NBTTagCompound();
			NBTTagList nbttaglist = new NBTTagList();
			for (int i = 0; i < cargoItems.length; i++) {
				if (cargoItems[i] != null) {
					NBTTagCompound nbttagcompound1 = new NBTTagCompound();
					nbttagcompound1.setByte("Slot", (byte) i);
					cargoItems[i].writeToNBT(nbttagcompound1);
					nbttaglist.appendTag(nbttagcompound1);
				}
			}
			tagCompound.setTag("Items", nbttaglist);
			ByteBufUtils.writeTag(buffer, tagCompound);
		}
	}
}