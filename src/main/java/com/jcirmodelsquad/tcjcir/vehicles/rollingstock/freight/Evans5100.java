package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

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

public class Evans5100 extends Freight implements IInventory {
    public int freightInventorySize;
    public int numFreightSlots;
    public Evans5100(World world) {
        super(world);
        initFreightCart();
        textureDescriptionMap.put(0, "Evans Demo (USLX)");
        textureDescriptionMap.put(1, "PMA (USLX)");
        textureDescriptionMap.put(2, "PMA (USLX) 2");
        textureDescriptionMap.put(3, "Ogden (USLX)");
        textureDescriptionMap.put(4, "Purina (USLX)");
        textureDescriptionMap.put(5, "PIMP");
        textureDescriptionMap.put(6, "BCOL");
        textureDescriptionMap.put(7, "Georgia Pacific");
        textureDescriptionMap.put(8, "Sargento (WSOR)");
        textureDescriptionMap.put(9, "WSOR");
        textureDescriptionMap.put(10, "UP");
        textureDescriptionMap.put(11, "SFLC");
        textureDescriptionMap.put(12, "IC");
        textureDescriptionMap.put(13, "MP");
        textureDescriptionMap.put(14, "FWD");
        textureDescriptionMap.put(15, "MNS");
        textureDescriptionMap.put(16, "ITC");
        textureDescriptionMap.put(17, "GT");
        textureDescriptionMap.put(18, "CNW (Red)");
        textureDescriptionMap.put(19, "TPW");
        textureDescriptionMap.put(20, "Blandsville & Blankerston (USRE Ends)");
        textureDescriptionMap.put(21, "Aloha Shake (USLX)");
        textureDescriptionMap.put(22, "PMA (USLX) 3");
        textureDescriptionMap.put(23, "Louisiana Pacific");
        textureDescriptionMap.put(24, "CNW (Yellow)");
        textureDescriptionMap.put(25, "BM");
        textureDescriptionMap.put(26, "Blandsville & Blankerston (PS Ends)");
        textureDescriptionMap.put(27, "");
    }

    public Evans5100(World world, double d, double d1, double d2){
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
        return "Evans-USRE 5100 Cu Ft Boxcar";
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
        return 2.875F;
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
