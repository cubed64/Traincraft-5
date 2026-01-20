package train.common.core.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;
import train.common.api.AbstractTrains;

public class RenderScaledPlayer extends RenderPlayer
{
    public RenderScaledPlayer()
    {
        super();
        renderManager = RenderManager.instance;
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entity, float partialTick) {
        EntityPlayer player = (EntityPlayer) entity;
        // Skip scaling if the player or world isn't ready
        if (player.worldObj == null || player.isDead) return;

        // Also skip scaling for the first tick when renderManager.livingPlayer might be null
        if (Minecraft.getMinecraft() == null || RenderManager.instance.livingPlayer == null) return;

        if(player.ridingEntity instanceof AbstractTrains)
        {
            float scale = 0.65f;
            GL11.glTranslatef(0, -1.5f * (1f - scale), 0);
            GL11.glScalef(scale, scale, scale);
        }
        else
        {
            super.preRenderCallback(entity, partialTick);
        }
    }
}
