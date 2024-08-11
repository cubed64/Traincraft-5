package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.library.GuiIDs;

public class HBC1Cboose extends AbstractPassengerCar
{
    public HBC1Cboose(World world) {
        super(world);
        textureDescriptionMap.put(0, "Fox, North Coast & Cascades");
        textureDescriptionMap.put(1, "Fox, North Coast & Cascades");
        textureDescriptionMap.put(2, "Fox, North Coast & Cascades");
        textureDescriptionMap.put(3, "Western Pacific");
        textureDescriptionMap.put(4, "Steampunk Rail");
        textureDescriptionMap.put(5, "Great Lakes & Nice Tiddies");
    }

    public HBC1Cboose(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

    /*public void updateRiderPosition() {
        if (riddenByEntity == null) {return;}
        double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
        double distance = -0.8;
        double yOffset = 0.4;
        float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw));
        float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw)));
        if(side.isServer()){
            rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation));
            rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation)));
            anglePitchClient = serverRealPitch*60;
        }
        float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
                + riddenByEntity.getYOffset() + yOffset);
        float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
        double bogieX1 = (this.posX + (rotationCos1 * distance));
        double bogieZ1 = (this.posZ + (rotationSin1* distance));
        //System.out.println(rotationCos1+" "+rotationSin1);
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
    }*/

    @Override
    public void pressKey(int i) {
        if(locked && riddenByEntity != null && riddenByEntity instanceof EntityPlayer&& !((EntityPlayer)riddenByEntity).getDisplayName().toLowerCase().equals(this.trainOwner.toLowerCase())){
            return;
        }
        if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
            ((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.CRAFTING_CART, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }
        /*if (i == 9 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
            ((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.FURNACE_CART, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }*/
    }

    @Override
    public double getAdditionalYOffset()
    {
        return -0.1F;
    }

    @Override
    public float getOptimalLinkingDistance()
    {
        return 2.23F;
    }
}