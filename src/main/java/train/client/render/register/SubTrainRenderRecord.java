package train.client.render.register;

import java.util.ArrayList;

public class SubTrainRenderRecord implements ISubTrainRenderRecord
{
    private final String SmokeType;
    private final ArrayList<double[]> SmokeFX;
    private final short ExplosionFXIterations;


    private final String ExplosionType;
    private final ArrayList<double[]> ExplosionFX;

    private final short SmokeIterations;
    public String getSmokeType()
    {
        return SmokeType;
    }
    public ArrayList<double[]> getSmokeFX()
    {
        return SmokeFX;
    }
    public String getExplosionType()
    {
        return ExplosionType;
    }
    public ArrayList<double[]> getExplosionFX()
    {
        return ExplosionFX;
    }

    public int getExplosionFXIterations()
    {
        return ExplosionFXIterations;
    }

    public int getSmokeIterations() { return SmokeIterations; }

    public SubTrainRenderRecord(String smokeType, ArrayList<double[]> smokeFX, String explosionType, ArrayList<double[]> explosionFX, short smokeIterations, short explosionFXIterations)
    {
        SmokeType = smokeType;
        SmokeFX = smokeFX;
        ExplosionType = explosionType;
        ExplosionFX = explosionFX;
        SmokeIterations = smokeIterations;
        ExplosionFXIterations = explosionFXIterations;
    }
}
