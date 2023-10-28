package com.jcirmodelsquad.tcjcir.vehicles.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;

public class DieselGP7 extends DieselTrain {
    public DieselGP7(World world) {
        super(world, EnumTrains.GP7.getTankCapacity(), LiquidManager.dieselFilter());
        initLoco();
        textureDescriptionMap.put(0, "Avanste Northeastern (Late)");
        textureDescriptionMap.put(1, "Burlington Northern (Ex CBQ)");
        textureDescriptionMap.put(2, "Butte, Anaconda & Pacific (Early)");
        textureDescriptionMap.put(3, "Chicago Northwestern");
        textureDescriptionMap.put(4, "Avanste Northeastern (As Delivered)");
        textureDescriptionMap.put(5, "Fox Union Resources (FURRX)");
        textureDescriptionMap.put(6, "Bangor & Aroostook (Early)");
        textureDescriptionMap.put(7, "Bangor & Aroostook (Late)");
        textureDescriptionMap.put(8, "West Creek Pacific");
        textureDescriptionMap.put(9, "Carbondale & Pine Valley");
        textureDescriptionMap.put(10, "Carbondale & Pine Valley (CSWR Buyout)");
        textureDescriptionMap.put(11, "waltuh white gp7");
        textureDescriptionMap.put(12, "Deadwood & La Mesa (Early)");
        textureDescriptionMap.put(13, "Deadwood & La Mesa (Late)");
        textureDescriptionMap.put(14, "Blandsville & Blankerston");
        textureDescriptionMap.put(15, "Amtrak MOW");
        textureDescriptionMap.put(16, "Seaboard Coast Line");
        textureDescriptionMap.put(17, "Denver & Rio Grande Western (Early)");
        textureDescriptionMap.put(18, "Denver & Rio Grande Western (Early 2?)");
        textureDescriptionMap.put(19, "Denver & Rio Grande Western (Late Small Logo)");
        textureDescriptionMap.put(20, "Denver & Rio Grande Western (Late Big Logo)");
        textureDescriptionMap.put(21, "US Army");
        textureDescriptionMap.put(22, "Great Northern (Emp Builder)");
        textureDescriptionMap.put(23, "Great Northern (EB Simp)");
        textureDescriptionMap.put(24, "Great Northern (BSB)");
        textureDescriptionMap.put(25, "Washaska & Old Fox RR Co 21");
        textureDescriptionMap.put(26, "Washaska & Old Fox RR Co 26");
        textureDescriptionMap.put(27, "New York Central (Early)");
        textureDescriptionMap.put(28, "New York Central (Lightning Bolt)");
        textureDescriptionMap.put(29, "New York Central (Late)");
        textureDescriptionMap.put(30, "New York Central (Grey Lighting Bolt)");
        textureDescriptionMap.put(31, "Fox, North Coast & Cascades");
        textureDescriptionMap.put(32, "ATSF (Pinstripe)");
        textureDescriptionMap.put(33, "ATSF (Zebrastripe)");
        textureDescriptionMap.put(34, "MKT");
        textureDescriptionMap.put(35, "Penn Central");
        textureDescriptionMap.put(36, "Western Pacific");
    }
    public DieselGP7(World world, double d, double d1, double d2){
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }

    public void initLoco() {
        fuelTrain = 0;
        locoInvent = new ItemStack[inventorySize];
    }

    @Override
    public void updateRiderPosition() {
        if (riddenByEntity == null) {return;}
        double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
        double distance = 2.55;
        double yOffset = 0.15;
        float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
        float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
        if(side.isServer()){
            rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
            rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
            anglePitchClient = serverRealPitch*60;
        }
        float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
                + riddenByEntity.getYOffset() + yOffset);
        float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
        double bogieX1 = (this.posX + (rotationCos1 * distance));
        double bogieZ1 = (this.posZ + (rotationSin1* distance));
        if(anglePitchClient>20 && rotationCos1 == 1){
            bogieX1-=pitchRads*2;
            pitch-=pitchRads*1.2;
        }
        if(anglePitchClient>20 && rotationSin1 == 1){
            bogieZ1-=pitchRads*2 + 1;
            pitch-=pitchRads*1.2;
        }
        if (pitchRads == 0.0) {
            riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
        }
    }
    @Override
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    @Override
    public void pressKey(int i) {
        if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
            ((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.LOCO, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }
    }

    @Override
    public void onUpdate() {
        checkInvent(locoInvent[0]);
        super.onUpdate();
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
        super.writeEntityToNBT(nbttagcompound);

        nbttagcompound.setShort("fuelTrain", (short) fuelTrain);
        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < locoInvent.length; i++) {
            if (locoInvent[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte) i);
                locoInvent[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }
        nbttagcompound.setTag("Items", nbttaglist);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
        super.readEntityFromNBT(nbttagcompound);

        fuelTrain = nbttagcompound.getShort("fuelTrain");
        NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        locoInvent = new ItemStack[getSizeInventory()];
        for (int i = 0; i < nbttaglist.tagCount(); i++) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            int j = nbttagcompound1.getByte("Slot") & 0xff;
            if (j >= 0 && j < locoInvent.length) {
                locoInvent[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    @Override
    public int getSizeInventory() {
        return inventorySize;
    }

    @Override
    public String getInventoryName() {
        return "EMD GP7";
    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        playerEntity = entityplayer;
        if ((super.interactFirst(entityplayer))) {
            return false;
        }
        if (!worldObj.isRemote) {
            if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {
                return true;
            }
            entityplayer.mountEntity(this);
        }
        return true;
    }
    @Override
    public boolean canBeAdjusted(EntityMinecart cart) {
        return canBeAdjusted;
    }

}