package train.client.render.register;

import net.minecraft.util.ResourceLocation;
import tmt.ModelBase;
import train.common.api.AbstractTrains;
import train.common.library.Info;

import java.util.ArrayList;

public class TrainRenderRecord implements ITrainRenderRecord
{
    String modID;

    public String GetModID()
    {
        return modID;
    }

    /**
     * Used for regular rollingstock
     * @param entityClass
     * @param model
     * @param trans
     * @param rotate
     * @param scale
     */
    public TrainRenderRecord(String modID,
                             Class<? extends AbstractTrains> entityClass, ModelBase model, float[] trans, float[] rotate, float[] scale)
    {
        this.modID = modID;
        this.entityClass = entityClass;
        this.model = model;
        this.trans = trans;
        this.rotate = rotate;
        this.scale = scale;
    }

    /**
     * Uses for diseal or steam locomotives
     * @param entityClass
     * @param model
     * @param trans
     * @param rotate
     * @param scale
     */
    public TrainRenderRecord(String modID,
                             Class<? extends AbstractTrains> entityClass, ModelBase model, float[] trans, float[] rotate, float[] scale,
                             String smokeType,
                             ArrayList<double[]> smokeFX,
                             String explosionType,
                             ArrayList<double[]> explosionFX,
                             int smokeIterations,
                             int explosionFXIterations)
    {
        this.modID = modID;
        this.entityClass = entityClass;
        this.model = model;
        this.trans = trans;
        this.rotate = rotate;
        this.scale = scale;
        this.smokeType = smokeType;
        this.smokeFX = smokeFX;
        this.explosionType = explosionType;
        this.explosionFX = explosionFX;
        this.smokeIterations = smokeIterations;
        this.explosionFXIterations = explosionFXIterations;
    }

    private final Class<? extends AbstractTrains> entityClass;
    private ModelBase model;
    private float[] trans;
    private float[] rotate;
    private float[] scale;
    private String smokeType;
    private ArrayList<double[]> smokeFX;
    private String explosionType;
    private ArrayList<double[]> explosionFX;
    private int smokeIterations;
    private int explosionFXIterations;

    @Override
    public Class<? extends AbstractTrains> getEntityClass()
    {
        return entityClass;
    }

    @Override
    public ModelBase getModel()
    {
        return model;
    }

    @Override
    public boolean hasSmoke()
    {
        return smokeType.length() > 0;
    }

    @Override
    public String getSmokeType()
    {
        return smokeType;
    }

    @Override
    public ArrayList<double[]> getSmokeFX()
    {
        return smokeFX;
    }

    @Override
    public String getExplosionType()
    {
        return explosionType;
    }

    @Override
    public boolean hasExplosion()
    {
        return explosionType.length() > 0;
    }

    @Override
    public ArrayList<double[]> getExplosionFX()
    {
        return explosionFX;
    }

    @Override
    public float[] getTrans()
    {
        return trans;
    }

    @Override
    public float[] getRotate()
    {
        return rotate;
    }

    @Override
    public float[] getScale()
    {
        return scale;
    }

    @Override
    public ResourceLocation getTextureFile(String colorAsString)
    {
        return new ResourceLocation(modID, Info.trainsPrefix + getEntityClass().getName() + "_" + "/" + getEntityClass().getName() + colorAsString + ".png");
    }

    @Override
    public int getSmokeIterations()
    {
        return smokeIterations;
    }

    @Override
    public int getExplosionFXIterations()
    {
        return explosionFXIterations;
    }
}
