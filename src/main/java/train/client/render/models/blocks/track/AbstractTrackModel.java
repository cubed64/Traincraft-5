package train.client.render.models.blocks.track;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public abstract class AbstractTrackModel
{
    protected boolean baked = false;

    public final int getRailDirection(TileTCRail tcRail)
    {
        return tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
    }
}
