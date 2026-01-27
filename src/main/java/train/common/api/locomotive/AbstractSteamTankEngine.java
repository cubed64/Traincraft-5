package train.common.api.locomotive;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.SteamTrain;
import train.common.library.GuiIDs;

public abstract class AbstractSteamTankEngine extends SteamTrain
{
    public AbstractSteamTankEngine(World world)
    {
        super(world);
        this.inventorySize = 17;
        locoInvent = new ItemStack[inventorySize];
    }

    @Override
    public void pressKey(int i)
    {
        if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer)
        {
            ((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.LOCO_TANKENGINE, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (worldObj.isRemote) {
            return;
        }
        checkInvent(locoInvent[0], locoInvent[1], this);
        for (int h = 0; h < this.locoInvent.length; h++) {
            if (this.locoInvent[h] != null && steamFuelLast(this.locoInvent[h]) != 0) {
                if (fuelTrain <= 0 && !worldObj.isRemote) {
                    fuelTrain = steamFuelLast(this.locoInvent[h]);
                    if (!worldObj.isRemote) {
                        this.decrStackSize(h, 1);
                    }
                }
            }
            else if (this.locoInvent[h] != null && steamFuelLast(this.locoInvent[h]) != 0) {
                if (fuelTrain <= 0 && !worldObj.isRemote) {
                    fuelTrain = steamFuelLast(this.locoInvent[h]);
                    if (!worldObj.isRemote) {
                        this.decrStackSize(h, 1);
                    }
                }
            }
        }
    }
}
