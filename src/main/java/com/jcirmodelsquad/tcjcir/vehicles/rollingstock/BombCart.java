package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.library.GuiIDs;

public class BombCart extends EntityRollingStock implements IPassenger {
    public int freightInventorySize;
    public int numFreightSlots;
    private int bombTimer;
    public BombCart(World world) {
        super(world);

    }

    public BombCart(World world, double d, double d1, double d2){
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
    public void setDead() {
        super.setDead();
        isDead = true;
    }
    @Override
    public void updateRiderPosition() {
        if(riddenByEntity!=null) {
            riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 1.1, posZ);
        }
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
    public float getOptimalDistance(EntityMinecart cart) {
        return 1F;
    }

    @Override
    public boolean shouldRiderSit(){return true;}

    @Override
    public boolean isPoweredCart() {
        return false;
    }

    public void pressKey(int i) {
        if (i == 9) {
            if (this.riddenByEntity != null && (this.riddenByEntity instanceof EntityLivingBase) && bombTimer <= 0) {

                EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(this.worldObj, (double) ((float) posX), (double) ((float) posY + 1F), (double) ((float) posZ), (EntityLivingBase) this.riddenByEntity);
                this.worldObj.spawnEntityInWorld(entitytntprimed);
                this.worldObj.playSoundAtEntity(entitytntprimed, "random.fuse", 1.0F, 1.0F);
                bombTimer = 500;

                return;
            }
        }

        }
    }





