package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;

public class PSCEI60SeatCoach extends EntityRollingStock implements IPassenger {

	public PSCEI60SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "C&EI 460 (Vigo Trail)");
		textureDescriptionMap.put(1, "C&EI 461 (Vincennes Trail)");
		textureDescriptionMap.put(2, "C&EI 462 (Vanderburgh Trail)");
		textureDescriptionMap.put(3, "C&EI 463 (Vermilion Trail)");
		textureDescriptionMap.put(4, "C&EI 464 (Hubbard Trail)");
		textureDescriptionMap.put(5, "C&EI 465 (Egyptian Trail)");
		textureDescriptionMap.put(6, "C&EI 466 (Horseshoe Trail)");
		textureDescriptionMap.put(7, "C&EI 460 (L&N paint)");
		textureDescriptionMap.put(8, "C&EI 461 (L&N paint)");
		textureDescriptionMap.put(9, "C&EI 462, 465 (L&N paint)");
		textureDescriptionMap.put(10, "C&EI 463, 466 (L&N paint)");
		textureDescriptionMap.put(11, "C&EI 464 (L&N paint)");
		textureDescriptionMap.put(12, "IC (Interior Scheme 1)");
		textureDescriptionMap.put(13, "IC (Interior Scheme 2)");
	}

	public PSCEI60SeatCoach(World world, double d, double d1, double d2) {
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