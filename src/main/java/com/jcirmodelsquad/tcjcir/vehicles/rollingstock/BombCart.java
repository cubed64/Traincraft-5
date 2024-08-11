package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BombCart extends AbstractPassengerCar
{
    public int freightInventorySize;
    public int numFreightSlots;
    private int bombTimer;
    public BombCart(World world)
    {
        super(world);
    }

    public BombCart(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

    @Override
    public boolean shouldRiderSit(){return true;}

    public void pressKey(int i)
    {
        if (i == 9)
        {
            if (this.riddenByEntity != null && (this.riddenByEntity instanceof EntityLivingBase) && bombTimer <= 0)
            {

                EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(this.worldObj, (double) ((float) posX), (double) ((float) posY + 1F), (double) ((float) posZ), (EntityLivingBase) this.riddenByEntity);
                this.worldObj.spawnEntityInWorld(entitytntprimed);
                this.worldObj.playSoundAtEntity(entitytntprimed, "random.fuse", 1.0F, 1.0F);
                bombTimer = 500;

                return;
            }
        }

    }

    @Override
    public double getAdditionalYOffset()
    {
        return 1.1F;
    }

    @Override
    public float getOptimalLinkingDistance()
    {
        return 1F;
    }
}





