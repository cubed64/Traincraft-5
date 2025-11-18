package train.client.render.models.blocks.track.switchs;

import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.track.AbstractTrackModel;

public abstract class AbstractSwitchTCTrack extends AbstractTrackModel
{
    protected IModelCustom modelMediumSwitchActive;
    protected int listMediumSwitchActive = -1;
    protected IModelCustom modelMediumSwitchInactive;
    protected int listMediumSwitchInactive = -1;
    protected IModelCustom modelMediumParallelSwitchInactive;
    protected int listMediumParallelSwitchInactive = -1;
    protected IModelCustom modelMediumParallelSwitchActive;
    protected int listMediumParallelSwitchActive = -1;

    protected IModelCustom modelLargeParallelSwitchInactive;
    protected int listLargeParallelSwitchInactive = -1;
    protected IModelCustom modelLargeParallelSwitchActive;
    protected int listLargeParallelSwitchActive = -1;
    protected IModelCustom modelLargeSwitchActive;
    protected int listLargeSwitchActive = -1;
    protected IModelCustom modelLargeSwitchInactive;
    protected int listLargeSwitchInactive = -1;

    protected IModelCustom modelVeryLargeSwitchActive;
    protected int listVeryLargeSwitchActive = -1;
    protected IModelCustom modelVeryLargeSwitchInactive;
    protected int listVeryLargeSwitchInactive = -1;

    protected IModelCustom modelMedium45degreeSwitchActive;
    protected int listMedium45degreeSwitchActive = -1;
    protected IModelCustom modelMedium45degreeSwitchInActive;
    protected int listMedium45degreeSwitchInActive = -1;

    protected IModelCustom modelLarge45degreeSwitchActive;
    protected int listLarge45degreeSwitchActive = -1;
    protected IModelCustom modelLarge45degreeSwitchInActive;
    protected int listLarge45degreeSwitchInActive = -1;

    protected IModelCustom modelCrossover10x2SwitchActive;
    protected int listCrossover10x2SwitchActive = -1;
    protected IModelCustom modelCrossover10x2SwitchInactive;
    protected int listCrossover10x2SwitchInactive = -1;
    
   public final void renderMediumActive()
    {
        GL11.glCallList(listMediumSwitchActive);
    }
   public final void renderMediumInactive()
    {
        GL11.glCallList(listMediumSwitchInactive);
    }
   public final void renderMediumParallelInactive()
    {
        GL11.glCallList(listMediumParallelSwitchInactive);
    }
   public final void renderMediumParallelActive()
    {
        GL11.glCallList(listMediumParallelSwitchActive);
    }
   public final void renderLargeParallelInactive()
    {
        GL11.glCallList(listLargeParallelSwitchInactive);
    }
   public final void renderLargeParallelActive()
    {
        GL11.glCallList(listLargeParallelSwitchActive);
    }

   public final void renderLarge90Active()
    {
        GL11.glCallList(listLargeSwitchActive);
    }
   public final void renderLarge90Inactive()
    {
        GL11.glCallList(listLargeSwitchInactive);
    }

   public final void renderVeryLarge90Active()
    {
        GL11.glCallList(listVeryLargeSwitchActive);
    }
   public final void renderVeryLarge90Inactive()
    {
        GL11.glCallList(listVeryLargeSwitchInactive);
    }

   public final void renderMedium45degreeActive()
    {
        GL11.glCallList(listMedium45degreeSwitchActive);
    }
   public final void renderMedium45degreeInActive()
    {
        GL11.glCallList(listMedium45degreeSwitchInActive);
    }
   public final void renderLarge45degreeActive()
    {
        GL11.glCallList(listLarge45degreeSwitchActive);
    }
   public final void renderLarge45degreeInActive()
    {
        GL11.glCallList(listLarge45degreeSwitchInActive);
    }

   public final void renderCrossover10x2Active()
    {
        GL11.glCallList(listCrossover10x2SwitchActive);
    }
   public final void renderCrossover10x2Inactive()
    {
        GL11.glCallList(listCrossover10x2SwitchInactive);
    }
}
