package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;

public class OB84SeatCoach extends EntityRollingStock implements IPassenger {

	public OB84SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "NH (As Delivered)");
		textureDescriptionMap.put(1, "NH");
		textureDescriptionMap.put(2, "NH (Black Knight Scheme)");
		textureDescriptionMap.put(3, "PC");
		textureDescriptionMap.put(4, "B&M B&M (As Delivered, 1935 Batch)");
		textureDescriptionMap.put(5, "B&M Interior Scheme 1 (As Delivered, 1937 Batch)");
		textureDescriptionMap.put(6, "B&M Interior Scheme 2 (As Delivered, 1937 Batch)");
		textureDescriptionMap.put(7, "B&M (1935 Batch)");
		textureDescriptionMap.put(8, "B&M Interior Scheme 1 (1937 Batch)");
		textureDescriptionMap.put(9, "B&M Interior Scheme 2 (1937 Batch)");
		textureDescriptionMap.put(10, "BAR (As Delivered)");
		textureDescriptionMap.put(11, "BAR");
	}

	public OB84SeatCoach(World world, double d, double d1, double d2) {
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
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset()-0.1F, posZ);
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
		return 3.97F;
	}
}