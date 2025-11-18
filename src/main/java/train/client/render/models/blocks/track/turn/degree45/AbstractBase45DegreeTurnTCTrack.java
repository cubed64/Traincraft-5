package train.client.render.models.blocks.track.turn.degree45;

import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.track.AbstractTrackModel;

public abstract class AbstractBase45DegreeTurnTCTrack extends AbstractTrackModel
{
    protected IModelCustom model3x4_45DegreeTurn;
    protected int list3x4_45DegreeTurn = -1;
    protected IModelCustom model3x6_45DegreeTurn;
    protected int list3x6_45DegreeTurn = -1;
    protected IModelCustom model4x8_45DegreeTurn;
    protected int list4x8_45DegreeTurn = -1;
    protected IModelCustom model5x11_45DegreeTurn;
    protected int list5x11_45DegreeTurn = -1;
    protected IModelCustom model9x20_45DegreeTurn;
    protected int list9x20_45DegreeTurn = -1;
    protected IModelCustom model10x22_45DegreeTurn;
    protected int list10x22_45DegreeTurn = -1;

    public final void render3x4() { GL11.glCallList(list3x4_45DegreeTurn);}
    public final void render3x6() {GL11.glCallList(list3x6_45DegreeTurn);}
    public final void render4x8() {GL11.glCallList(list4x8_45DegreeTurn);}
    public final void render5x11() {GL11.glCallList(list5x11_45DegreeTurn);}
    public final void render9x20() {GL11.glCallList(list9x20_45DegreeTurn);}
    public final void render10x22(){GL11.glCallList(list10x22_45DegreeTurn);}
}
