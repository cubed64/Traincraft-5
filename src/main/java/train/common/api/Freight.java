package train.common.api;

import cpw.mods.fml.common.network.NetworkRegistry;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.adminbook.ServerLogger;
import train.common.core.handlers.ConfigHandler;
import train.common.core.network.PacketParkingBrake;

public abstract class Freight extends EntityRollingStock implements IInventory
{
	public boolean parkingBrake = false;

	public ItemStack cargoItems[];
	protected double itemInsideCount = 0;
	private int slotsFilled=0;
	public Freight(World world)
	{
		super(world);
		dataWatcher.addObject(22, 0);
		dataWatcher.addObject(25, (int) convertSpeed(Math.sqrt(Math.abs(motionX * motionX) + Math.abs(motionZ * motionZ))));
		dataWatcher.addObject(27, "" + parkingBrake);
	}

	@Override
	public void readSpawnData(ByteBuf additionalData)
	{
		super.readSpawnData(additionalData);
		parkingBrake = additionalData.readBoolean();
	}

	@Override
	public void writeSpawnData(ByteBuf buffer)
	{
		super.writeSpawnData(buffer);
		buffer.writeBoolean(parkingBrake);
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
	{
		super.writeEntityToNBT(nbttagcompound);
		nbttagcompound.setBoolean("parkingBrake", parkingBrake);
	}

	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i) {
		if (worldObj.isRemote) {
			return true;
		}
		if(canBeDestroyedByPlayer(damagesource))return true;
		super.attackEntityFrom(damagesource, i);
		setRollingDirection(-getRollingDirection());
		setRollingAmplitude(10);
		setBeenAttacked();
		setDamage(getDamage() + i * 10);
		if (getDamage() > 40) {
			if (riddenByEntity != null) {
				riddenByEntity.mountEntity(this);
			}
			this.setDead();
			ServerLogger.deleteWagon(this);
			if(damagesource.getEntity() instanceof EntityPlayer) {
				dropCartAsItem(((EntityPlayer)damagesource.getEntity()).capabilities.isCreativeMode);
			}
		}
		return true;
	}

	/* IInventory implements */
	@Override
	public ItemStack getStackInSlot(int i) {
		return cargoItems[i];
	}

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1) {
		if (this.cargoItems[par1] != null) {
			ItemStack var2 = this.cargoItems[par1];
			this.cargoItems[par1] = null;
			return var2;
		}
		else {
			return null;
		}
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		if (cargoItems[i] != null) {
			if (cargoItems[i].stackSize <= j) {
				ItemStack itemstack = cargoItems[i];
				cargoItems[i] = null;
				return itemstack;
			}
			ItemStack itemstack1 = cargoItems[i].splitStack(j);
			if (cargoItems[i].stackSize == 0) {
				cargoItems[i] = null;
			}
			return itemstack1;
		}
		else {
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		cargoItems[i] = itemstack;
		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public void markDirty() {
		if(!worldObj.isRemote){
			this.slotsFilled=0;
			for (int i = 0; i < getSizeInventory(); i++) {
				ItemStack itemstack = getStackInSlot(i);
				if(itemstack != null) {
					slotsFilled++;
				}
			}
			this.dataWatcher.updateObject(22, slotsFilled);
		}
	}

	@Override
	public String getInventoryName() {
		return "Freight cart";
	}

	@Override
	public abstract int getSizeInventory();

	/**
	 * Returns true if this cart is a storage cart Some carts may have inventories but not be storage carts and some carts without inventories may be storage carts.
	 * 
	 * @return True if this cart should be classified as a storage cart.
	 */
	@Override
	public boolean isStorageCart() {
		return true;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		handleMass();
		handleParkingBrake();

	}

	/**
	 * Handle mass depending on item count tenders are done differently
	 */
	protected void handleMass()
	{
		if (this.updateTicks % 10 != 0)
			return;
		if (worldObj.isRemote)
			return;
		this.mass = this.getDefaultMass();
		this.itemInsideCount = 0;
		for (int i = 0; i < getSizeInventory(); i++) {
			ItemStack itemstack = getStackInSlot(i);
			if (itemstack != null && itemstack.stackSize > 0) {
				this.itemInsideCount += itemstack.stackSize;
			}
		}
		mass += (this.itemInsideCount * 0.0005);// original modifier value was 0.0001
	}

	protected void handleParkingBrake()
	{
		if (parkingBrake)
		{
			motionX = 0.0;
			motionZ = 0.0;
		}
	}
	
	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
	public int getAmmountOfCargo() {
		return this.dataWatcher.getWatchableObjectInt(22);
	}
	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);

		parkingBrake = nbttagcompound.getBoolean("parkingBrake");
		dataWatcher.updateObject(27, "" + parkingBrake);
		ItemStack cargoItemsCount[];
		NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		cargoItemsCount = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound1.getByte("Slot") & 0xff;
			if (j >= 0 && j < cargoItemsCount.length) {
				cargoItemsCount[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
		slotsFilled = 0;
		for (int i = 0; i < getSizeInventory(); i++) {
			ItemStack itemstack = cargoItemsCount[i];
			if(itemstack != null) {
				slotsFilled++;
			}
		}
		this.dataWatcher.updateObject(22, slotsFilled);
	}

	@Override
	public void dropCartAsItem(boolean isCreative){
		if(!itemdropped) {
			super.dropCartAsItem(isCreative);
			if (!(this instanceof Tender) && cargoItems != null) {
				for (ItemStack stack : cargoItems) {
					if (stack != null) {
						entityDropItem(stack, 0);
					}
				}
			}
		}
	}

	@Override
	public ItemStack[] getInventory(){return cargoItems;}

	private double convertSpeed(double speed) {
		//System.out.println("X "+motionX +" Z "+motionZ);
		if (ConfigHandler.REAL_TRAIN_SPEED) {
			speed *= 2;// applying ratio
		} else {
			speed *= 6;
		}
		speed *= 36;
		//speed *= 10;// convert in ms
		//speed *= 6;// applying ratio
		//speed *= 3.6;// convert in km/h
		return speed;
	}

	public boolean getParkingBrakeFromPacket()
	{
		return parkingBrake;
	}


	public void setParkingBrakeFromPacket(boolean set) {
		parkingBrake = set;
	}


	@Override
	public boolean canBePushed()
	{
		return false;
	}

	@Override
	public boolean canBeAdjusted(EntityMinecart cart) {
		return getParkingBrakeFromPacket();
	}

	public double getSpeed() {
		return dataWatcher.getWatchableObjectInt(25);
	}
}