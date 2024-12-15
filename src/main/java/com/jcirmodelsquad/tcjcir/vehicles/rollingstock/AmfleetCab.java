package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.api.AbstractControlCar;
import train.common.library.EnumTrains;

public class AmfleetCab extends AbstractControlCar
{
    public AmfleetCab(World world) {
        super(world);
        textureDescriptionMap.put(0, "AMTK (Phase 3)");
        textureDescriptionMap.put(1, "AMTK (Phase 4)");
        textureDescriptionMap.put(2, "AMTK (Phase 4B Door 1)");
        textureDescriptionMap.put(3, "AMTK (Phase 4B Door 2)");
        textureDescriptionMap.put(4, "AMTK (Phase 4B Conference Car)");
        textureDescriptionMap.put(5, "Generic");
        textureDescriptionMap.put(6, "JCTransit");
        textureDescriptionMap.put(7, "CCRL (Chatham and Crator River Lines)");
        textureDescriptionMap.put(8, "CCL (Crator River Lines)");
    }

    public AmfleetCab(World world, double d, double d1, double d2) {
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }

    @Override
    public String getInventoryName()
    {
        return EnumTrains.amfleetcab.getInternalName();
    }

    @Override
    public void updateRiderPosition() {
        if(riddenByEntity!=null) {
            riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.2, posZ);
        }
    }

    @Override
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        playerEntity = entityplayer;
        if ((super.interactFirst(entityplayer))) {
            return false;
        }
        if (!worldObj.isRemote) {
            ItemStack itemstack = entityplayer.inventory.getCurrentItem();
            if(lockThisCart(itemstack, entityplayer))return true;
            if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {
                return true;
            }
            if (!worldObj.isRemote) {
                entityplayer.mountEntity(this);
            }
        }
        return true;
    }

    @Override
    public boolean canBeRidden() {
        return true;
    }

    @Override
    public boolean isStorageCart() {
        return false;
    }

    @Override
    public boolean isPoweredCart() {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.6F;
    }
}
