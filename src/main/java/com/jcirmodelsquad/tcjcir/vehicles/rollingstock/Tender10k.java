package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

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

public class Tender10k extends Tender implements IInventory {
    public int freightInventorySize;
    public int numFreightSlots;

    public Tender10k(World world) {
        super(world, FluidRegistry.WATER, 0, EnumTrains.Tender10k.getTankCapacity(), LiquidManager.WATER_FILTER);
        initFreightTender();
        textureDescriptionMap.put(0, "Blank");
        textureDescriptionMap.put(1, "Spoof");
        textureDescriptionMap.put(2, "WP");
        textureDescriptionMap.put(3, "NEP-WP 334 aux tender");
        textureDescriptionMap.put(4, "WPMW");
        textureDescriptionMap.put(5, "DLMR Herald Logo");
        textureDescriptionMap.put(6, "DLMR Text Logo");
        textureDescriptionMap.put(7, "FMSR 561");
        textureDescriptionMap.put(8, "FMSR 570");
        textureDescriptionMap.put(9, "FMSR 574");
        textureDescriptionMap.put(10, "FMSR 577");

    }

    public void initFreightTender() {
        freightInventorySize = 16;
        tenderItems = new ItemStack[freightInventorySize];
    }

    public Tender10k(World world, double d, double d1, double d2) {
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
    public void onUpdate() {
        super.onUpdate();
        checkInvent(tenderItems[0], this);
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
        super.writeEntityToNBT(nbttagcompound);

        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < tenderItems.length; i++) {
            if (tenderItems[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte) i);
                tenderItems[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }
        nbttagcompound.setTag("Items", nbttaglist);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
        super.readEntityFromNBT(nbttagcompound);

        NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        tenderItems = new ItemStack[getSizeInventory()];
        for (int i = 0; i < nbttaglist.tagCount(); i++) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            int j = nbttagcompound1.getByte("Slot") & 0xff;
            if (j >= 0 && j < tenderItems.length) {
                tenderItems[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }
    @Override
    public String getInventoryName() {
        return "WP 10,000 Gal Tender";
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
            entityplayer.openGui(Traincraft.instance, GuiIDs.TENDER, worldObj, this.getEntityId(), -1, (int) this.posZ);
        }
        return true;
    }

    @Override
    public boolean canBeRidden() {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.8F;
    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return true;
    }
}