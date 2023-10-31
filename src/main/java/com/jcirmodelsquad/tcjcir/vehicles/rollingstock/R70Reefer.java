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

public class R70Reefer extends Freight implements IInventory {
    public int freightInventorySize;
    public int numFreightSlots;
    public R70Reefer(World world) {
        super(world);
        initFreightCart();
        textureDescriptionMap.put(0, "PFE (White W/ Orange Logo)");
        textureDescriptionMap.put(1, "Blandsville Fruit Exprees");
        textureDescriptionMap.put(2, "FNCC");
        textureDescriptionMap.put(3, "BNFE (White)");
        textureDescriptionMap.put(4, "BNFE (Yellow)");
        textureDescriptionMap.put(5, "BNFE (Yellow but with a white roof for some reason)");
        textureDescriptionMap.put(6, "PFE (Orange)");
        textureDescriptionMap.put(7, "MILW");
        textureDescriptionMap.put(8, "SOO");
        textureDescriptionMap.put(9, "Railway Express Agency");
        textureDescriptionMap.put(10, "UPFE");
        textureDescriptionMap.put(11, "UPFE (post 1970 roof)");
        textureDescriptionMap.put(12, "PFE (post 1970 roof)");
        textureDescriptionMap.put(13, "NPM (foobie)");
        textureDescriptionMap.put(14, "Golden West");
        textureDescriptionMap.put(15, "Golden West (post 1970 roof)");
        textureDescriptionMap.put(16, "BAR early");
        textureDescriptionMap.put(17, "BAR Late");
        textureDescriptionMap.put(18, "ATSF As-delivered");
        textureDescriptionMap.put(19, "ATSF Late");
        textureDescriptionMap.put(20, "WP Ice Service");
        textureDescriptionMap.put(21, "FGE (Real Cold)");
    }

    public R70Reefer(World world, double d, double d1, double d2){
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
        initFreightCart();
    }

    public void initFreightCart() {
        numFreightSlots = 6;
        freightInventorySize = trainSpec.getCargoCapacity();
        cargoItems = new ItemStack[freightInventorySize];
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
        return "PFE R-70-20 Reefer";
    }

    @Override
    public int getSizeInventory() {
        return freightInventorySize;
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        if ((super.interactFirst(entityplayer))) {
            return true;
        }
        entityplayer.openGui(Traincraft.instance, GuiIDs.FREIGHT, worldObj, this.getEntityId(), -1, (int) this.posZ);
        return true;
    }

    @Override
    public boolean isStorageCart() {
        return true;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.1F;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return true;
    }
}
