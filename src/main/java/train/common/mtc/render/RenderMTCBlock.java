package train.common.mtc.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.client.render.models.blocks.ModelBridgePillar;
import train.common.tile.TileBridgePillar;

public class RenderMTCBlock  extends TileEntitySpecialRenderer {
    private static final ModelMTCBalise model = new ModelMTCBalise();

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        GL11.glPushMatrix();
        Tessellator.bindTexture(new ResourceLocation("tc:textures/blocks/speed_transmitter.png"));
        GL11.glTranslated(x + 0.5d, y + 0.5d, z + 0.5d);
        GL11.glRotatef(180F, 0.0F, 0F, 1F);
        model.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }
}
