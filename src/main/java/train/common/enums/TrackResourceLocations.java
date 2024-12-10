package train.common.enums;

import net.minecraft.util.ResourceLocation;
import train.common.items.RailVariants;
import train.common.library.Info;

public class TrackResourceLocations
{
    public static final ResourceLocation track_normal = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png");
    public static final ResourceLocation track_embedded = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_embedded.png");

    public static ResourceLocation GetResourceLocation(RailVariants variant)
    {
        switch (variant)
        {
            case NORMAL:
                return track_normal;
            case EMBEDDED:
                return track_embedded;

            default:
                return track_normal;
        }
    }
}
