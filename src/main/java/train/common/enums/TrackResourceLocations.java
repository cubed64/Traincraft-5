package train.common.enums;

import net.minecraft.util.ResourceLocation;
import train.common.items.BallastTypes;
import train.common.items.RailVariants;
import train.common.library.Info;

public class TrackResourceLocations
{
    public static final ResourceLocation track_normal = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png");
    public static final ResourceLocation track_embedded = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_embedded.png");

    public static final ResourceLocation track_concrete_1 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_concrete_1.png");
    public static final ResourceLocation track_concrete_2 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_concrete_2.png");
    public static final ResourceLocation track_concrete_3 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_concrete_3.png");

    public static final ResourceLocation track_wood_type1 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_wood_type1.png");

    public static ResourceLocation GetResourceLocation(RailVariants variant)
    {
        switch (variant)
        {
            case NORMAL:
                return track_normal;
            case EMBEDDED:
                return track_embedded;
            case CONCRETE_TYPE1:
                return track_concrete_1;
            case CONCRETE_TYPE2:
                return track_concrete_2;
            case CONCRETE_TYPE3:
                return track_concrete_3;
            case TREATED_WOOD_TYPE1:
                return track_wood_type1;

            default:
                return track_normal;
        }
    }
    public static final ResourceLocation gravel = new ResourceLocation(Info.resourceLocation, "textures/blocks/gravel.png");
    public static final ResourceLocation ballast = new ResourceLocation(Info.resourceLocation, "textures/blocks/ballast_test.png");
    public static final ResourceLocation snowGravel = new ResourceLocation(Info.resourceLocation, "textures/blocks/snowgravel.png");
    public static final ResourceLocation peaGravel = new ResourceLocation(Info.resourceLocation, "textures/blocks/peagravel.png");
    public static final ResourceLocation woodSupport = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_slope.png");

    public static ResourceLocation GetBallasetResourceLocation(BallastTypes ballastType)
    {
        switch (ballastType)
        {
            case GRAVEL:
                return gravel;
            case SNOWGRAVEL:
                return snowGravel;
            case PEAGRAVEL:
                return peaGravel;
            case BALLAST:
                return ballast;
            case WOODSUPPORT:
                return woodSupport;
            default:
                return null;
        }
    }
}
