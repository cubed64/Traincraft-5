package train.client.render.models.blocks.BaseClass;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public abstract class AbstractTrackModel
{
    public final int getRailDirection(TileTCRail tcRail)
    {
        return tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
    }
}
