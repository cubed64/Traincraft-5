package train.client.render.models.blocks.track.turn.degree90;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.track.AbstractTrackModel;
import train.common.library.Info;

public abstract class AbstractBase90DegreeTurnTCTrack extends AbstractTrackModel
{
    private static boolean baked = false;

    public AbstractBase90DegreeTurnTCTrack()
    {
        if (!baked)
        {
            model1XTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/1x1.obj"));
            list1XTurn = GL11.glGenLists(1);
            GL11.glNewList(list1XTurn, GL11.GL_COMPILE);
            model1XTurn.renderAll();
            GL11.glEndList();

            model3x3Turn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/3x3.obj"));
            list3x3Turn = GL11.glGenLists(1);
            GL11.glNewList(list3x3Turn, GL11.GL_COMPILE);
            model3x3Turn.renderAll();
            GL11.glEndList();

            model5x5Turn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/5x5.obj"));
            list5x5Turn = GL11.glGenLists(1);
            GL11.glNewList(list5x5Turn, GL11.GL_COMPILE);
            model5x5Turn.renderAll();
            GL11.glEndList();

            model10x10Turn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/10x10.obj"));
            list10x10Turn = GL11.glGenLists(1);
            GL11.glNewList(list10x10Turn, GL11.GL_COMPILE);
            model10x10Turn.renderAll();
            GL11.glEndList();

            model16x16Turn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/16x16.obj"));
            list16x16Turn = GL11.glGenLists(1);
            GL11.glNewList(list16x16Turn, GL11.GL_COMPILE);
            model16x16Turn.renderAll();
            GL11.glEndList();

            model29x29Turn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/29x29.obj"));
            list29x29Turn = GL11.glGenLists(1);
            GL11.glNewList(list29x29Turn, GL11.GL_COMPILE);
            model29x29Turn.renderAll();
            GL11.glEndList();

            model32x32Turn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/90-deg/32x32.obj"));
            list32x32Turn = GL11.glGenLists(1);
            GL11.glNewList(list32x32Turn, GL11.GL_COMPILE);
            model32x32Turn.renderAll();
            GL11.glEndList();

            baked = true;
        }
    }

    protected static IModelCustom model1XTurn;
    protected static int list1XTurn = -1;
    protected static IModelCustom model3x3Turn;
    protected static int list3x3Turn = -1;
    protected static IModelCustom model5x5Turn;
    protected static int list5x5Turn = -1;
    protected static IModelCustom model10x10Turn;
    protected static int list10x10Turn = -1;
    protected static IModelCustom model16x16Turn;
    protected static int list16x16Turn = -1;
    protected static IModelCustom model29x29Turn;
    protected static int list29x29Turn = -1;
    protected static IModelCustom model32x32Turn;
    protected  static int list32x32Turn = -1;

    public final void render1X()
    {
        GL11.glCallList(list1XTurn);
    }
    public final void renderMedium()
    {
        GL11.glCallList(list3x3Turn);
    }
    public final void renderLarge()
    {
        GL11.glCallList(list5x5Turn);
    }
    public final void renderVeryLarge()
    {
        GL11.glCallList(list10x10Turn);
    }
    public final void renderSuperLarge()
    {
        GL11.glCallList(list16x16Turn);
    }
    public final void render29X()
    {
        GL11.glCallList(list29x29Turn);
    }
    public final void render32X()
    {
        GL11.glCallList(list32x32Turn);
    }
}
