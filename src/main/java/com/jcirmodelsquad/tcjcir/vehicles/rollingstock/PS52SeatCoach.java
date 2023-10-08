package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;

public class PS52SeatCoach extends EntityRollingStock implements IPassenger {

	public PS52SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "C&O Interior Scheme 1");
		textureDescriptionMap.put(1, "C&O Interior Scheme 2");
		textureDescriptionMap.put(2, "D&RGW Interior Scheme 1");
		textureDescriptionMap.put(3, "D&RGW Interior Scheme 2");
		textureDescriptionMap.put(4, "NKP");
		textureDescriptionMap.put(5, "NKP (Semi-Fictional)");
		textureDescriptionMap.put(6, "PM Interior Scheme 1 (Semi-Fictional)");
		textureDescriptionMap.put(7, "PM Interior Scheme 2 (Semi-Fictional)");
		textureDescriptionMap.put(8, "CNW Interior Scheme 1");
		textureDescriptionMap.put(9, "CNW Interior Scheme 2");
		textureDescriptionMap.put(10, "AMTK Phase 1 (ex-NKP)");
	}

	public PS52SeatCoach(World world, double d, double d1, double d2) {
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