package train.client.renderhelper;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelRendererTurbo;
import train.common.api.EntityRollingStock;
import train.common.api.IRollingStockLightControls;
import train.common.api.Locomotive;


public class ModelRenderHelper
{
    /** Renders a model Coverts Entity -> IRollingStockLightControls
     * Can Render the following Special items
     * lamp,
     * commander,
     * prime1,
     * prime2,
     * prime3,
     * prime4
     * cull
     * @param bodyModel
     * @param entity Entity Compatible with IRollingStockLightControls
     * @param f5
     */
    public static void renderModelWithRollingStockLightControls(ModelRendererTurbo[] bodyModel, Entity entity, float f5)
    {
        renderModelWithRollingStockLightControls(bodyModel, (IRollingStockLightControls) entity, f5);
    }

    private static void renderModelWithRollingStockLightControls(ModelRendererTurbo[] bodyModel, IRollingStockLightControls rollingStock, float f5)
    {
        for (ModelRendererTurbo bm : bodyModel)
        {
            if (bm.boxName.contains("lamp") && rollingStock.isLightsEnabled())
            {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bm.render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
            else if (rollingStock.isDitchLightsEnabled() && bm.boxName.contains("ditch"))
            {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bm.render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
            else if (rollingStock.isBeaconEnabled() && (bm.boxName.contains("commander") || bm.boxName.contains("prime")))
            {
                if (bm.boxName.contains("commander"))
                {
                    if (((EntityRollingStock)rollingStock).ticksExisted % 30 == 0)
                    {
                        Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                        bm.render(f5);
                        Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                    }
                    else
                    {
                        bm.render(f5);
                    }
                }
                else if (bm.boxName.contains("prime"))
                {
                    renderPrimeLight(bm, rollingStock.getBeaconCycleIndex(), f5);
                }
                else
                {
                    bm.render(f5);
                }
            }
            else if (bm.boxName.contains("cull"))
            {
                GL11.glDisable(GL11.GL_CULL_FACE);
                bm.render(f5);
                GL11.glEnable(GL11.GL_CULL_FACE);
            }
            else
            {
                bm.render(f5);
            }
        }
    }

    public static void renderSlugModel(ModelRendererTurbo[] bodyModel, Entity entity, float f5)
    {
        for (ModelRendererTurbo bm : bodyModel)
        {
            if (bm.boxName.contains("lamp") || bm.boxName.contains("ditch") || bm.boxName.contains("commander") || bm.boxName.contains("prime"))
            {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bm.render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
            else if (bm.boxName.contains("cull"))
            {
                GL11.glDisable(GL11.GL_CULL_FACE);
                bm.render(f5);
                GL11.glEnable(GL11.GL_CULL_FACE);
            }
            else
            {
                bm.render(f5);
            }
        }
    }

    /** Renders a locomotive model Coverts Entity -> Locomotive
     * Can Render the following Special items
     * lamp,
     * commander,
     * prime1,
     * prime2,
     * prime3,
     * prime4
     * cull
     * @param bodyModel
     * @param locomotive
     * @param f5
     */
    public static void renderLocomotiveModel(ModelRendererTurbo[] bodyModel, Entity locomotive, float f5)
    {
        renderLocomotiveModel(bodyModel, (Locomotive) locomotive, f5);
    }

    /** Renders a locomotive model
     * Can Render the following Special items
     * lamp,
     * commander,
     * prime1,
     * prime2,
     * prime3,
     * prime4
     * cull
     * @param bodyModel
     * @param locomotive
     * @param f5
     */
    public static void renderLocomotiveModel(ModelRendererTurbo[] bodyModel, Locomotive locomotive, float f5)
    {
        for (ModelRendererTurbo bm : bodyModel)
        {
            if (bm.boxName.contains("lamp") && locomotive.isLocomotiveLightsEnabled())
            {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bm.render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
            else if (locomotive.isLocomotiveDitchLightsEnabled() && bm.boxName.contains("ditch"))
            {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bm.render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
            else if (locomotive.isLocomotiveBeaconEnabled() && (bm.boxName.contains("commander") || bm.boxName.contains("prime")))
            {
                if (bm.boxName.contains("commander"))
                {
                    if (locomotive.ticksExisted % 30 == 0)
                    {
                        Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                        bm.render(f5);
                        Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                    }
                    else
                    {
                        bm.render(f5);
                    }
                }
                else if (bm.boxName.contains("prime"))
                {
                    renderPrimeLight(bm, locomotive.getBeaconCycleIndex(), f5);
                }
                else
                {
                    bm.render(f5);
                }
            }
            else if (bm.boxName.contains("cull"))
            {
                GL11.glDisable(GL11.GL_CULL_FACE);
                bm.render(f5);
                GL11.glEnable(GL11.GL_CULL_FACE);
            }
            else
            {
                bm.render(f5);
            }
        }
    }

    public static void renderLocomotiveModelWithoutBeacon(ModelRendererTurbo[] bodyModel, Entity entity, float f5)
    {
        renderLocomotiveModelWithoutBeacon(bodyModel, (Locomotive)entity, f5);
    }

    /** Renders a locomotive model
     * Can Render the following Special items
     * lamp,
     * cull
     * @param bodyModel
     * @param locomotive
     * @param f5
     */
    private static void renderLocomotiveModelWithoutBeacon(ModelRendererTurbo[] bodyModel, Locomotive locomotive, float f5)
    {
        for (ModelRendererTurbo bm : bodyModel)
        {
            if (bm.boxName.contains("lamp") && locomotive.isLocomotiveLightsEnabled())
            {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bm.render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
            else if (bm.boxName.contains("cull"))
            {
                GL11.glDisable(GL11.GL_CULL_FACE);
                bm.render(f5);
                GL11.glEnable(GL11.GL_CULL_FACE);
            }
            else
            {
                bm.render(f5);
            }
        }
    }

    /** Renders a locomotive model
     * Can Render the following Special items
     * lamp,
     * @param bodyModel
     * @param locomotive
     * @param f5
     */
    public static void renderLocomotiveModelWithLamp(ModelRendererTurbo[] bodyModel, Locomotive locomotive, float f5)
    {
        for (ModelRendererTurbo bm : bodyModel)
        {
            if (bm.boxName.contains("lamp") && locomotive.isLocomotiveLightsEnabled())
            {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bm.render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
            else
            {
                bm.render(f5);
            }
        }
    }

    private static void renderPrimeLight(ModelRendererTurbo bodyModel, byte cycleIndex, float f5)
    {
        // prime1 -- Front Facing #1
        // prime2 -- Right Facing #2
        // prime3 -- Rear Facing #3
        // Prime4 -- Left Facing #4
        switch (cycleIndex)
        {
            case 0:
                if (bodyModel.boxName.contains("prime1"))
                {
                    Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                    bodyModel.render(f5);
                    Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                }
                else
                {
                    bodyModel.render(f5);
                }
            break;
            case 1:
                if (bodyModel.boxName.contains("prime2"))
                {
                    Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                    bodyModel.render(f5);
                    Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                }
                else
                {
                    bodyModel.render(f5);
                }
            break;
            case 2:
                if (bodyModel.boxName.contains("prime3"))
                {
                    Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                    bodyModel.render(f5);
                    Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                }
                else
                {
                    bodyModel.render(f5);
                }
            break;
            case 3:
                if (bodyModel.boxName.contains("prime4"))
                {
                    Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                    bodyModel.render(f5);
                    Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                }
                else
                {
                    bodyModel.render(f5);
                }
            break;
        }
    }
}

