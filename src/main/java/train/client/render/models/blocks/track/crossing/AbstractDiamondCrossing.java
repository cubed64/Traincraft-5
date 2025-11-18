package train.client.render.models.blocks.track.crossing;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.track.AbstractTrackModel;

@SideOnly(Side.CLIENT)
public abstract class AbstractDiamondCrossing extends AbstractTrackModel
{
    protected IModelCustom modelDiamondCrossing;
    protected int listDiamondCrossing = -1;

    public final void render()
    {
        GL11.glCallList(listDiamondCrossing);
    }
}
