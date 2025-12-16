package train.common;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import org.lwjgl.opengl.GL11;
import train.common.api.AbstractTrains;

@SideOnly(Side.CLIENT)
public class PlayerScaleHandler {

    @SubscribeEvent
    public void onRenderPlayerPre(RenderPlayerEvent.Pre event) {
        EntityPlayer player = event.entityPlayer;

        if (player.ridingEntity instanceof AbstractTrains) {
            float scale = 0.65f;
            GL11.glPushMatrix();
            GL11.glScalef(scale, scale, scale);
        }
    }

    @SubscribeEvent
    public void onRenderPlayerPost(RenderPlayerEvent.Post event) {
        EntityPlayer player = event.entityPlayer;

        if (player.ridingEntity instanceof AbstractTrains) {
            GL11.glPopMatrix();
        }
    }
}
