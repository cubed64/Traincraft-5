package train.common.library;

import com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash944CW;

import java.util.HashMap;

public enum BetterEnumSounds {

    DieselDash9C44W(
            DieselDash944CW.class,
            false,
            "nathan_p5",
            "ge_steelbell_1",
            new int[] {-1, 7, 35, 47, 59, 71, 73, 95, 100},
            new String[] {"GE_D9_7FDL_16_IDLE", "GE_D9_7FDL_16_N1", "GE_D9_7FDL_16_N2", "GE_D9_7FDL_16_N3", "GE_D9_7FDL_16_N4", "GE_D9_7FDL_16_N5", "GE_D9_7FDL_16_N6", "GE_D9_7FDL_16_N7", "GE_D9_7FDL_16_N8"},
            new double[] {36.52, 19.56, 49.96, 61.1d, 49.32d, 49.96d, 47.48d, 49.96d, 48.4d},
            null);


    private Class entityClass;
    private boolean advanced;

    private String[] horns;

    private String[] bells;

    private int[] percentages;
    private String[] engineSounds;

    private double[] lengths;

    public Class getEntityClass() {
        return entityClass;
    }

    public boolean isAdvanced() {
        return advanced;
    }

    public String[] getHorns() {
        return horns;
    }

    public String[] getBells() {
        return bells;
    }

    public int[] getPercentages() {
        return percentages;
    }

    public String[] getEngineSounds() {
        return engineSounds;
    }

    public double[] getLengths() {
        return lengths;
    }

    public HashMap<Integer, String[]> getLayeredSounds() {
        return layeredSounds;
    }

    //For advanced sounds that are multilayered. Can be null.
    private HashMap<Integer, String[]> layeredSounds;

    public static HashMap<String, BetterEnumSounds> trainSounds = new HashMap<String, BetterEnumSounds>();
    
    public static void init() {
        for (BetterEnumSounds sound: BetterEnumSounds.values()) {
            trainSounds.put(sound.entityClass.getName(), sound);
        }
    }
    
    
    BetterEnumSounds(Class entityClass, boolean advanced, String horn, String bell, int[] percentages, String[] engineSounds, double[] lengths, HashMap<Integer, String[]> layeredSounds) {
        this.entityClass = entityClass;
        this.advanced = advanced;
        this.engineSounds = new String[] {horn};
        this.bells = new String[] {bell};
        this.percentages = percentages;
        this.engineSounds = engineSounds;
        this.lengths = lengths;
        this.layeredSounds = layeredSounds;

    }


    BetterEnumSounds(Class entityClass, boolean advanced, String[] horns, String[] bells, int[] percentages, String[] engineSounds, double[] lengths, HashMap<Integer, String[]> layeredSounds) {
        this.entityClass = entityClass;
        this.advanced = advanced;
        this.percentages = percentages;
        this.engineSounds = engineSounds;
        this.lengths = lengths;
        this.layeredSounds = layeredSounds;

    }
}
