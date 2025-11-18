package train.client.render.models.blocks.track.s_curve;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.track.AbstractTrackModel;

@SideOnly(Side.CLIENT)
public abstract class AbstractSCurve extends AbstractTrackModel
{
    protected IModelCustom model2x8SCurve;
    protected int list2x8SCurve = -1;

    protected IModelCustom model3x12SCurve;
    protected int list3x12SCurve = -1;
    protected IModelCustom model4x16SCurve;
    protected int list4x16SCurve = -1;
    protected IModelCustom model2x20SCurve;
    protected int list2x20SCurve = -1;

    public void render2x8SCurve() {GL11.glCallList(list2x8SCurve);}
    public void render3x12SCurve() {GL11.glCallList(list3x12SCurve);}
    public void render4x16SCurve() {GL11.glCallList(list4x16SCurve);}
    public void render2x20SCurve() { GL11.glCallList(list2x20SCurve); }
}
