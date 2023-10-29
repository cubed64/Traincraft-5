package train.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.ResourceLocation;

public class MovingTrainSound extends MovingSound {

    public MovingTrainSound(ResourceLocation sound) {
        super(sound);
        this.field_147666_i = ISound.AttenuationType.NONE;
        //this.repeat = true;
    }

    @SideOnly(Side.CLIENT)
    public static void playSound(ResourceLocation sound) {
        Minecraft.getMinecraft().getSoundHandler().playSound(new MovingTrainSound(sound));
    }
    @Override
    public void update() {
        //this.field_147664_a
    }
}
