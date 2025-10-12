package train.common.library;

import net.minecraft.util.ResourceLocation;
import tmt.ModelBase;
import train.common.api.AbstractTrains;

import java.util.ArrayList;

public interface ITrainRenderRecord
{

    Class<? extends AbstractTrains> getEntityClass();

    ModelBase getModel();

    boolean hasSmoke();

    boolean hasSmokeOnSlopes();

    String getSmokeType();

    ArrayList<double[]> getSmokeFX();

    String getExplosionType();

    boolean hasExplosion();

    ArrayList<double[]> getExplosionFX();

    float[] getTrans();

    float[] getRotate();

    float[] getScale();

    ResourceLocation getTextureFile(String colorString);

    int getSmokeIterations();

    int getExplosionFXIterations();
}