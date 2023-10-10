package train.common.tile.tileSwitch;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import tmt.Tessellator;
import train.common.library.Info;

public class TileMediumCantileverRight extends TileMFPBWigWag {

    private long updateTicks = 0;
    public float rotation =0;
    public boolean powered =false;
    public boolean flip = true;
    private static final ResourceLocation textureOn = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/MediumCantileverLeft.png");
    private static final ResourceLocation textureOn1 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/MediumCantileverRight.png");
    private static final ResourceLocation textureOff = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/MediumCantileverOff.png");


    // private net.minecraft.client.audio.ISound bell = new PositionedSound(new ResourceLocation(Info.modID,"bell"))
    /*
    @SideOnly(Side.CLIENT)//be sure sound is only created on client
    private net.minecraft.client.audio.PositionedSound bell = new PositionedSound(new ResourceLocation(Info.modID,"bell")){

        @Override
        public float getXPosF() {return xCoord;}
        @Override
        public float getYPosF() {return yCoord+1;}
        @Override
        public float getZPosF() {return zCoord;}


    };

     */
    @Override
    public void updateEntity() {
        updateTicks++;
        if (worldObj.isRemote) {
            if (powered = getWorldObj().isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord)) {
                if (updateTicks % 8 == 0) {
                    flip = !flip;
                    worldObj.playSound(xCoord, yCoord, zCoord, Info.resourceLocation + ":" + "wch_ebell", 1f, 1f, true);
                    if(flip) {
                        Tessellator.bindTexture(textureOn);
                    } else {
                        Tessellator.bindTexture(textureOn1);
                    }
                }
            } else {
                Tessellator.bindTexture(textureOff);
            }
        }
        /**
         * Remove any block on top of this wind mill
         */
/*        else {
            if (updateTicks % 20 == 0) {
                if (!this.worldObj.isAirBlock(this.xCoord, this.yCoord + 1, this.zCoord)) {
                    Block block = this.worldObj.getBlock(this.xCoord, this.yCoord + 1, this.zCoord);
                    if (block != null) {
                        EntityItem entityitem = new EntityItem(worldObj, this.xCoord, this.yCoord + 1, this.zCoord, new ItemStack(Item.getItemFromBlock(BlockIDs.CrossingBase.block), 1));
                        float f3 = 0.05F;
                        entityitem.motionX = (float) rand.nextGaussian() * f3;
                        entityitem.motionY = (float) rand.nextGaussian() * f3 + 0.2F;
                        entityitem.motionZ = (float) rand.nextGaussian() * f3;
                        worldObj.spawnEntityInWorld(entityitem);
                    }
                    this.worldObj.setBlockToAir(this.xCoord, this.yCoord, this.zCoord);
                }
            }
        }*/
    }


/*    public void setFacing(ForgeDirection face) {

        if (facing != face)
            this.facing = face;
    }*/

    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-5, yCoord-1, zCoord-5, xCoord + 5, yCoord + 4, zCoord + 5);    }

}