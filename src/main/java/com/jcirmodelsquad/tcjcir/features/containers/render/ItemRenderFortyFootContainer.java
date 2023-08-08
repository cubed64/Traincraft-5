package com.jcirmodelsquad.tcjcir.features.containers.render;


import com.jcirmodelsquad.tcjcir.models.containers.ModelISO_40FT_Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemRenderFortyFootContainer implements IItemRenderer {
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
                renderContainer(0.0F, 0F, 0.0F, item );
                break;
            }
            case EQUIPPED: {
                renderContainer(0.1F, 0.1F, 0.7F, item );
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderContainer(0F, 0.1F, 0F, item );
                return;
            }
            case INVENTORY: {
                renderContainer(0.5F, -0.1F, 0.5F, item );
                break;
            }
            default:
                break;
        }

    }
    private void renderContainer(float f, float g, float h, ItemStack theItem) {
        ModelISO_40FT_Item theContainer = new ModelISO_40FT_Item();
        if (theItem.getTagCompound() != null) {
            if (theItem.getTagCompound().getString("color").equals("")) {
                tmt.Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/ISO_40FT_LightGrey.png"));
            } else {
                tmt.Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/ISO_40FT_" + theItem.getTagCompound().getString("color") + ".png"));
            }


        } else {
            tmt.Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/ISO_40FT_LightGrey.png"));
        }

        GL11.glPushMatrix();
        GL11.glTranslatef(f, g + 0.5F, h);
        GL11.glScalef(0.4F, 0.4F, 0.4F);
        theContainer.render(null, 0.7F, 0.7F, 0.7F, 0.7F, 0, 0.0625F);
        GL11.glPopMatrix();
    }

}
