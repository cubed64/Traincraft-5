package train.client.renderhelper;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import tmt.ModelRendererTurbo;
import train.common.api.Locomotive;


public class ModelRenderHelper
{
    /** Renders a locomotive model
     * Can Render the following spec Special items
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
        for (int i = 0; i < bodyModel.length; i++)
        {
            if (bodyModel[i].boxName.contains("lamp") && locomotive.isLocomotiveLightsEnabled())
            {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bodyModel[i].render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
            else if (locomotive.isLocomotiveBeaconEnabled())
            {
                if (bodyModel[i].boxName.contains("commander"))
                {
                    if (locomotive.ticksExisted % 30 == 0)
                    {
                        Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                        bodyModel[i].render(f5);
                        Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                    }
                    else
                    {
                        bodyModel[i].render(f5);
                    }
                }
                else if (bodyModel[i].boxName.contains("prime"))
                {
                    renderPrimeLight(bodyModel[i], locomotive.getBeaconCycleIndex(), f5);
                }
                else
                {
                    bodyModel[i].render(f5);
                }
            }
            else if (bodyModel[i].boxName.contains("cull"))
            {
                GL11.glDisable(GL11.GL_CULL_FACE);
                bodyModel[i].render(f5);
                GL11.glEnable(GL11.GL_CULL_FACE);
            }
            else
            {
                bodyModel[i].render(f5);
            }
        }
    }

    /** Renders a locomotive model
     * Can Render the following spec Special items
     * lamp,
     * cull
     * @param bodyModel
     * @param locomotive
     * @param f5
     */
    public static void renderLocomotiveModelWithoutBeacon(ModelRendererTurbo[] bodyModel, Locomotive locomotive, float f5)
    {
        for (int i = 0; i < bodyModel.length; i++)
        {
            if (bodyModel[i].boxName.contains("lamp") && locomotive.isLocomotiveLightsEnabled())
            {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bodyModel[i].render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
            else if (bodyModel[i].boxName.contains("cull"))
            {
                GL11.glDisable(GL11.GL_CULL_FACE);
                bodyModel[i].render(f5);
                GL11.glEnable(GL11.GL_CULL_FACE);
            }
            else
            {
                bodyModel[i].render(f5);
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

