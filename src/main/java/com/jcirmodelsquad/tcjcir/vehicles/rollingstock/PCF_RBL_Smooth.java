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

public class PCF_RBL_Smooth extends Freight implements IInventory {
    public int freightInventorySize;
    public int numFreightSlots;
    public PCF_RBL_Smooth(World world) {
        super(world);
        initFreightCart();
        textureDescriptionMap.put(0, "MKT");
        textureDescriptionMap.put(1, "SP");
        textureDescriptionMap.put(2, "SP (Ex EFCX)");
        textureDescriptionMap.put(3, "SP (Ex EFCX)");
        textureDescriptionMap.put(4, "WP");
        textureDescriptionMap.put(5, "EFCX");
        textureDescriptionMap.put(6, "GN");
        textureDescriptionMap.put(7, "GN");
        textureDescriptionMap.put(8, "BN");
        textureDescriptionMap.put(9, "BN");
        textureDescriptionMap.put(10, "BN");
        textureDescriptionMap.put(11, "BN");
        textureDescriptionMap.put(12, "RBBN");
        textureDescriptionMap.put(13, "WFE");
        textureDescriptionMap.put(14, "SLSF");
        textureDescriptionMap.put(15, "SLSF");
        textureDescriptionMap.put(16, "BB (Plug Door Early)");
        textureDescriptionMap.put(17, "BB (Plug Door)");
        textureDescriptionMap.put(18, "BB (Youngstown Door)");
    }

    public PCF_RBL_Smooth(World world, double d, double d1, double d2){
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
        numFreightSlots = 5;
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
        return "PC&F RBL Smoothside Boxcar";
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
        return 2.85F;
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
