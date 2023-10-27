
package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import com.jcirmodelsquad.tcjcir.features.containers.BasicallyContainer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.library.BlockIDs;

public class HuskyStackWellcar extends EntityRollingStock implements IPassenger {
    public BasicallyContainer container1;
    public BasicallyContainer container2;

    public HuskyStackWellcar(World world) {
        super(world);
        dataWatcher.addObject(25, "");
        dataWatcher.addObject(26, "");
    }

    public HuskyStackWellcar(World world, double d, double d1, double d2) {
        super(world, d, d1, d2);
        dataWatcher.addObject(25, "");
        dataWatcher.addObject(26, "");
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.3F;
    }
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (worldObj == null) return;

        if (!worldObj.isRemote && ticksExisted % 5 == 0) {
            if (container1 != null) {
                dataWatcher.updateObject(25, container1.getAsTagCompound().toString());
                System.out.println(container1.getAsTagCompound().toString());
            }
            if (container2 != null) {
                dataWatcher.updateObject(26, container2.getAsTagCompound().toString());
            }
        }
        if (worldObj.isRemote) {
            try {
                if (dataWatcher.getWatchableObjectString(25).equals("")) {
                    container1 = null;
                } else {
                    NBTTagCompound nbt1 = (NBTTagCompound) JsonToNBT.func_150315_a(dataWatcher.getWatchableObjectString(25));
                    container1 = new BasicallyContainer();
                    container1.color = nbt1.getString("Color");
                    container1.type = nbt1.getString("theType");
                    if (nbt1.hasKey("Items")) {
                        NBTTagCompound newCompound = new NBTTagCompound();
                        newCompound.setTag("Items", nbt1.getTagList("Items", Constants.NBT.TAG_COMPOUND));
                        container1.savedData = newCompound;
                    }
                }

                if (dataWatcher.getWatchableObjectString(26).equals("")) {
                    container2 = null;
                } else {
                    NBTTagCompound nbt2 = (NBTTagCompound) JsonToNBT.func_150315_a(dataWatcher.getWatchableObjectString(26));
                    container2 = new BasicallyContainer();
                    container2.color = nbt2.getString("Color");
                    container2.type = nbt2.getString("theType");
                    if (nbt2.hasKey("Items")) {
                        NBTTagCompound newCompound = new NBTTagCompound();
                        newCompound.setTag("Items", nbt2.getTagList("Items", Constants.NBT.TAG_COMPOUND));
                        container2.savedData = newCompound;
                    }
                }



            } catch (NBTException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public void setDead() {
        super.setDead();
        /*ItemStack stackToPlace = new ItemStack(BlockIDs.FortyFootContainer.block, 1);

        if (container1 != null) {
            if (container1.savedData != null) {
                container1.savedData.removeTag("x");
                container1.savedData.removeTag("y");
                container1.savedData.removeTag("z");
                stackToPlace.setTagCompound(container1.savedData);
            }
            if (!worldObj.isRemote) {
                EntityItem dropItem = new EntityItem(this.worldObj, this.posX, this.posY, this.posZ, stackToPlace.copy());
                dropItem.delayBeforeCanPickup = 1;
                worldObj.spawnEntityInWorld(dropItem);
            }
        }

        if (container2 != null) {
            if (container2.savedData != null) {
                container2.savedData.removeTag("x");
                container2.savedData.removeTag("y");
                container2.savedData.removeTag("z");
                stackToPlace.setTagCompound(container2.savedData);
                dataWatcher.updateObject(26, container2.getAsTagCompound().toString());
            }
            if (!worldObj.isRemote) {
                EntityItem dropItem = new EntityItem(this.worldObj, this.posX, this.posY, this.posZ, stackToPlace.copy());
                dropItem.delayBeforeCanPickup = 1;
                worldObj.spawnEntityInWorld(dropItem);
            }

        }

        isDead = true;
    }
    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        if (worldObj.isRemote) return false;

        super.interactFirst(entityplayer);
        playerEntity = entityplayer;
        if (entityplayer.getHeldItem() != null && entityplayer.getHeldItem().getUnlocalizedName().equals("tile.tc:FortyFootContainer")) {
            ItemStack theItem = entityplayer.getHeldItem();
            if (container1 == null) {
                if (theItem.getTagCompound() != null) {
                    this.container1 = new BasicallyContainer("FortyFootContainer", theItem.getTagCompound().getString("Color"), theItem.getTagCompound());
                } else {
                    this.container1 = new BasicallyContainer("FortyFootContainer", "LightGrey", null);
                }
            } else {
                if (theItem.getTagCompound() != null) {
                    this.container2 = new BasicallyContainer("FortyFootContainer", theItem.getTagCompound().getString("Color"), theItem.getTagCompound());
                } else {
                    this.container2 = new BasicallyContainer("FortyFootContainer", "LightGrey", null);
                }
            }
            if (!worldObj.isRemote) {
                entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, (ItemStack)null);
            }

            /*NBTTagList list = theItem.getTagCompound().getTagList("Items", Constants.NBT.TAG_COMPOUND);

            if (container1 == null) {
                this.container1 = new BasicallyContainer("FortyFootContainer", "grey", list);
            } else {
                this.container2 = new BasicallyContainer("FortyFootContainer", "grey", list);
            }*/

        /*} else if (entityplayer.getHeldItem() == null && entityplayer.isSneaking()) {
            ItemStack theItemStack = new ItemStack(BlockIDs.FortyFootContainer.block, 1);
            if (container2 != null) {
                if (container2.savedData != null) {
                    container2.savedData.removeTag("x");
                    container2.savedData.removeTag("y");
                    container2.savedData.removeTag("z");
                    theItemStack.setTagCompound(container2.savedData);
                }
                if (!worldObj.isRemote) {
                    EntityItem dropItem = new EntityItem(entityplayer.getEntityWorld(), entityplayer.posX, entityplayer.posY, entityplayer.posZ, theItemStack.copy());
                    dropItem.delayBeforeCanPickup = 1;
                    playerEntity.worldObj.spawnEntityInWorld(dropItem);
                }
                container2 = null;
                dataWatcher.updateObject(26, "");
            } else {
                if (container1 != null && container1.savedData != null) {
                    container1.savedData.removeTag("x");
                    container1.savedData.removeTag("y");
                    container1.savedData.removeTag("z");
                    theItemStack.setTagCompound(container1.savedData);
                }
                if (!worldObj.isRemote) {
                    EntityItem dropItem = new EntityItem(entityplayer.getEntityWorld(), entityplayer.posX, entityplayer.posY, entityplayer.posZ, theItemStack.copy());
                    dropItem.delayBeforeCanPickup = 1;
                    playerEntity.worldObj.spawnEntityInWorld(dropItem);
                }
                container1 = null;
                dataWatcher.updateObject(25, "");
            }
        }
        return true;
    }
   @Override
    protected void writeEntityToNBT(NBTTagCompound ntc) {
        super.writeEntityToNBT(ntc);

        if (container1 != null && container1.savedData != null) {
            NBTTagCompound container1Tag = new NBTTagCompound();
            container1Tag.setString("Color", container1.color);
            container1Tag.setString("theType", container1.type);
            container1Tag.setTag("Items", container1.savedData.getTagList("Items", Constants.NBT.TAG_COMPOUND));
            ntc.setTag("container1", container1Tag);
        }

       if (container2 != null && container2.savedData != null) {
           NBTTagCompound container2Tag = new NBTTagCompound();
           container2Tag.setString("Color", container2.color);
           container2Tag.setString("theType", container2.type);
           container2Tag.setTag("Items", container2.savedData.getTagList("Items", Constants.NBT.TAG_COMPOUND));
           ntc.setTag("container2", container2Tag);
       }

    }
    @Override
    protected void readEntityFromNBT(NBTTagCompound ntc) {
        super.readEntityFromNBT(ntc);
        if (ntc.hasKey("container1")) {
            if (ntc.getCompoundTag("container1").getString("Color").equals("")) {
                ntc.getCompoundTag("container1").setString("Color", "LightGrey");
            }
            container1 = new BasicallyContainer("FortyFootContainer", ntc.getCompoundTag("container1").getString("Color"), ntc.getCompoundTag("container1"));
        }
        if (ntc.hasKey("container2")) {
            if (ntc.getCompoundTag("container2").getString("Color").equals("")) {
                ntc.getCompoundTag("container2").setString("Color", "LightGrey");
            }
            container2 = new BasicallyContainer("FortyFootContainer", ntc.getCompoundTag("container2").getString("Color"), ntc.getCompoundTag("container2"));
        }*/
    }
}

