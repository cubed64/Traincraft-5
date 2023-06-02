package train.client;

import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.ResourceLocation;

public class MovingTrainSound extends MovingSound {

    public MovingTrainSound(ResourceLocation sound) {
        super(sound);
        this.field_147666_i = ISound.AttenuationType.NONE;
        //this.repeat = true;
    }

    @Override
    public void update() {
        //this.field_147664_a
    }
}
