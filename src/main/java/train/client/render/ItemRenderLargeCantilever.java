package train.client.render;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.client.render.models.blocks.Crossings.ModelLargeCantilever;
import train.common.library.Info;

public class ItemRenderLargeCantilever implements IItemRenderer {
    private static final ModelLargeCantilever modeSwitch = new ModelLargeCantilever();
    private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/LargeCantileverOff.png");

    public ItemRenderLargeCantilever() {
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {
            case ENTITY: {
                renderSwitch(0f, 0f, 0f, 1f);
                return;
            }
            case EQUIPPED: {
                renderSwitch(0.6f, 0.25f, 1f, 1f);
                return;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderSwitch(0.2f, 0.25f, 1f, 0.7f);
                return;
            }
            case INVENTORY: {
                renderSwitch(0f, -0.7f, 0f, 0.5f);
                return;
            }
            default:
                break;
        }
    }

    private void renderSwitch(float x, float y, float z, float scale) {
        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);

        GL11.glTranslatef(x-0.75f, y-.125f, z-1.5f);
        GL11.glScalef(scale*0.4f, scale*0.4f, scale*0.4f);
        GL11.glRotated(180,0,0,1);

        Tessellator.bindTexture(texture);

        modeSwitch.render(null,0,0,0,0,0,0.0625f);

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }
}
