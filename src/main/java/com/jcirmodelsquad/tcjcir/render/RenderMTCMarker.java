package com.jcirmodelsquad.tcjcir.render;

import com.jcirmodelsquad.tcjcir.features.eti.TileTrainMonitor;
import com.jcirmodelsquad.tcjcir.models.ModelMTCMarker;
import com.jcirmodelsquad.tcjcir.models.ModelTrainMonitorSatelite;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;

public class RenderMTCMarker extends TileEntitySpecialRenderer {


    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float p_147500_8_) {

        Tessellator.bindTexture(new ResourceLocation("tc:textures/blocks/mtc_marker.png"));
        GL11.glColor4f(1,1,1,1);
        GL11.glColor4f(1,1,1,1);
        //Tessellator.setBrightness(theBlock.getMixedBrightnessForBlock(tileEntity.getWorldObj(), (int)x, (int)y, (int)z));

        GL11.glPushMatrix();
        ModelMTCMarker theSat = new ModelMTCMarker();
        GL11.glTranslated(x + 0.3, y,z + 0.45);

        int dir = tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord);

        switch(dir) {
            case 0: {
                GL11.glRotatef(180F, 1F, 0F, 1F);
                break;
            }
            case 1: {
                GL11.glRotatef(180F, 0, 0F, 1F);
                break;
            }
            case 2: {
                GL11.glRotatef(180F, 1F, 0F, -1F);
                break;
            }
            case 3: {
                GL11.glRotatef(180F, 1F, 0F, 0F);
                break;
            }
        }


        // GL11.glRotatef(180F, 0F, 0F, 1F);
        theSat.render(null,0, 0, 0,0, 0, .0625f);
        GL11.glPopMatrix();
    }

    @Override
    protected void bindTexture(ResourceLocation p_147499_1_){
    }
}
