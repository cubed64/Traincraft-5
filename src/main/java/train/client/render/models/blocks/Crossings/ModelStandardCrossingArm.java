//FMT-Marker FVTM-1.5
package train.client.render.models.blocks.Crossings;

import net.minecraft.entity.Entity;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.6 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelStandardCrossingArm extends FVTMFormatBase {


	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale){

		for(ModelRendererTurbo turbo : groups.get(0)){
			turbo.render();
		}
		for(ModelRendererTurbo turbo : groups.get(1)){
			turbo.rotateAngleX=(f0*0.0174533f) + 1.48353f;
			turbo.render();
		}
	}
	public ModelStandardCrossingArm(){
		super(); textureX = 256; textureY = 64;
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 43, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0.2f)
			.setRotationPoint(-1, 4, -1).setRotationAngle(0, 0, 0).setName("Box 44")
		);
		group0.add(new ModelRendererTurbo(group0, 8, 40, textureX, textureY).addBox(0, 0, 0, 2, 3, 2)
			.setRotationPoint(-1, 5, -1).setRotationAngle(0, 0, 0).setName("Box 45")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1.5f, 8, -2).setRotationAngle(0, 0, 0).setName("Box 46")
		);
		group0.add(new ModelRendererTurbo(group0, 34, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-0.09999847f, 5, 1).setRotationAngle(0, 0, 0).setName("Box 47")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.09999847f, 5, -2).setRotationAngle(0, 0, 0).setName("Box 48")
		);
		group0.add(new ModelRendererTurbo(group0, 34, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 5, 0.10000038f).setRotationAngle(0, 90, 0).setName("Box 49")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(1, 5, 0.10000038f).setRotationAngle(0, 90, 0).setName("Box 51")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f)
			.setRotationPoint(-1.5f, 8.5f, -2).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -21, -6).setRotationAngle(0, 0, 0).setName("Box 72")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -17, -7).setRotationAngle(90, 0, 0).setName("Box 73")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -22, -6).setRotationAngle(0, 0, 0).setName("Box 74")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f)
			.setRotationPoint(-3, -17, -2).setRotationAngle(90, 0, 0).setName("Box 75")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f)
			.setRotationPoint(-3, -17, -6).setRotationAngle(0, 0, 0).setName("Box 76")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -21, 2).setRotationAngle(0, 0, 0).setName("Box 77")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f)
			.setRotationPoint(-3, -17, 6).setRotationAngle(90, 0, 0).setName("Box 78")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -22, 2).setRotationAngle(0, 0, 0).setName("Box 79")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -17, 1).setRotationAngle(90, 0, 0).setName("Box 80")
		);
		group0.add(new ModelRendererTurbo(group0, 46, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f)
			.setRotationPoint(-3, -17, 2).setRotationAngle(0, 0, 0).setName("Box 81")
		);
		group0.add(new ModelRendererTurbo(group0, 13, 48, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(-2.9000015f, -20.5f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.9000015f, -21.5f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 83")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f)
			.setRotationPoint(-2.9000015f, -17.5f, 5.5f).setRotationAngle(90, 0, 0).setName("Box 85")
		);
		group0.add(new ModelRendererTurbo(group0, 13, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f)
			.setRotationPoint(-2.9000015f, -17.5f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.9000015f, -17.5f, 1.5f).setRotationAngle(90, 0, 0).setName("Box 87")
		);
		group0.add(new ModelRendererTurbo(group0, 7, 28, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(-3.25f, -20, 3).setRotationAngle(0, 0, 0).setName("Box 89")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.25f, -21, 3).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f)
			.setRotationPoint(-3.25f, -18, 3).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f)
			.setRotationPoint(-3.25f, -18, 5).setRotationAngle(90, 0, 0).setName("Box 94")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.25f, -18, 2).setRotationAngle(90, 0, 0).setName("Box 95")
		);
		group0.add(new ModelRendererTurbo(group0, 7, 35, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(-3.25f, -20, -5).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.25f, -21, -5).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f)
			.setRotationPoint(-3.25f, -18, -5).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 50, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f)
			.setRotationPoint(-6, -20.31f, 3.6000004f).setRotationAngle(206.5f, 0, 0).setName("Box 111")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(-6, -20.31f, 3.6000004f).setRotationAngle(0, 0, 0).setName("Box 112")
		);
		group0.add(new ModelRendererTurbo(group0, 34, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f)
			.setRotationPoint(-6, -20.31f, 4.3999996f).setRotationAngle(-26.5f, 0, 0).setName("Box 113")
		);
		group0.add(new ModelRendererTurbo(group0, 39, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0.0012f, 0, 0, 0.0012f, 0, 0, -0.33f, -0.5f, 0, -0.33f, 0, 0, 0.0012f, 0, 0, 0.0012f, 0, 0, -0.33f, -0.5f, 0, -0.33f)
			.setRotationPoint(-6, -20.01f, 5).setRotationAngle(-63, 0, 0).setName("Box 114")
		);
		group0.add(new ModelRendererTurbo(group0, 43, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0.0012f, 0, 0, 0.0012f, -0.5f, 0, -0.33f, 0, 0, -0.33f, 0, 0, 0.0012f, 0, 0, 0.0012f, -0.5f, 0, -0.33f, 0, 0, -0.33f)
			.setRotationPoint(-3, -20.01f, 3).setRotationAngle(-63, 180, 0).setName("Box 115")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.25f, -18, -6).setRotationAngle(90, 0, 0).setName("Box 116")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f)
			.setRotationPoint(-3.25f, -18, -3).setRotationAngle(90, 0, 0).setName("Box 117")
		);
		group0.add(new ModelRendererTurbo(group0, 34, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f)
			.setRotationPoint(-6, -20.31f, -4.4f).setRotationAngle(206.5f, 0, 0).setName("Box 118")
		);
		group0.add(new ModelRendererTurbo(group0, 35, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(-6, -20.31f, -4.4f).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		group0.add(new ModelRendererTurbo(group0, 34, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f)
			.setRotationPoint(-6, -20.31f, -3.6f).setRotationAngle(-26.5f, 0, 0).setName("Box 120")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0.0012f, 0, 0, 0.0012f, 0, 0, -0.33f, -0.5f, 0, -0.33f, 0, 0, 0.0012f, 0, 0, 0.0012f, 0, 0, -0.33f, -0.5f, 0, -0.33f)
			.setRotationPoint(-6, -20.01f, -3).setRotationAngle(-63, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 39, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0.0012f, 0, 0, 0.0012f, -0.5f, 0, -0.33f, 0, 0, -0.33f, 0, 0, 0.0012f, 0, 0, 0.0012f, -0.5f, 0, -0.33f, 0, 0, -0.33f)
			.setRotationPoint(-3, -20.01f, -5).setRotationAngle(-63, 180, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 18, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f)
			.setRotationPoint(-2.5f, -18, 5).setRotationAngle(90, 0, 0).setName("Box 123")
		);
		group0.add(new ModelRendererTurbo(group0, 16, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, -21, 3).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 49, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(-2.5f, -20, 3).setRotationAngle(0, 0, 0).setName("Box 125")
		);
		group0.add(new ModelRendererTurbo(group0, 16, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, -18, 2).setRotationAngle(90, 0, 0).setName("Box 126")
		);
		group0.add(new ModelRendererTurbo(group0, 16, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f)
			.setRotationPoint(-2.5f, -18, 3).setRotationAngle(0, 0, 0).setName("Box 127")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f)
			.setRotationPoint(-2.5f, -18, -3).setRotationAngle(90, 0, 0).setName("Box 133")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, -21, -5).setRotationAngle(0, 0, 0).setName("Box 134")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 46, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(-2.5f, -20, -5).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f)
			.setRotationPoint(-2.5f, -18, -5).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, -18, -6).setRotationAngle(90, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.9000015f, -21.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 138")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f)
			.setRotationPoint(-2.9000015f, -17.5f, -2.5f).setRotationAngle(90, 0, 0).setName("Box 139")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f)
			.setRotationPoint(-2.9000015f, -17.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 140")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.9000015f, -17.5f, -6.5f).setRotationAngle(90, 0, 0).setName("Box 141")
		);
		group0.add(new ModelRendererTurbo(group0, 21, 56, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(-2.9000015f, -20.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, -22, -1).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		group0.add(new ModelRendererTurbo(group0, 46, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(-2.25f, -21.5f, -4.25f).setRotationAngle(0, 0, -45).setName("Box 105")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0)
			.setRotationPoint(0, -22, 0).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f)
			.setRotationPoint(-1, -22, 0).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -22, -1).setRotationAngle(0, 0, 0).setName("Box 146")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, -22, -1).setRotationAngle(0, 0, 0).setName("Box 147")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.05f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.05f, 0, 0, 0.3f, -0.65f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0.3f, -0.65f, 0)
			.setRotationPoint(1.5099983f, -21.5f, 3.25f).setRotationAngle(0, 0, 0).setName("Box 66")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(2.0099983f, -21.5f, 3.25f).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -0.2f, -0.6f, -0.6f, -0.2f, -0.6f, -0.6f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(2.0099983f, -22, 3.25f).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 46, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(0.15000153f, -21.5f, -4.25f).setRotationAngle(0, 0, -45).setName("Box 69")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 48, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(1.5f, -20, 3).setRotationAngle(0, 0, 0).setName("Box 73")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.5f, -18, 2).setRotationAngle(90, 0, 0).setName("Box 74")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f)
			.setRotationPoint(1.5f, -18, 5).setRotationAngle(90, 0, 0).setName("Box 75")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f)
			.setRotationPoint(1.5f, -18, 3).setRotationAngle(0, 0, 0).setName("Box 76")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.5f, -21, 3).setRotationAngle(0, 0, 0).setName("Box 77")
		);
		group0.add(new ModelRendererTurbo(group0, 16, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.9000015f, -21.5f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 78")
		);
		group0.add(new ModelRendererTurbo(group0, 13, 48, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(1.9000015f, -20.5f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 79")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.9000015f, -17.5f, 1.5f).setRotationAngle(90, 0, 0).setName("Box 80")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f)
			.setRotationPoint(1.9000015f, -17.5f, 5.5f).setRotationAngle(90, 0, 0).setName("Box 81")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f)
			.setRotationPoint(1.9000015f, -17.5f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		group0.add(new ModelRendererTurbo(group0, 43, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0)
			.setRotationPoint(2, -21, 2).setRotationAngle(0, 0, 0).setName("Box 83")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f)
			.setRotationPoint(2, -17, 2).setRotationAngle(0, 0, 0).setName("Box 84")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0)
			.setRotationPoint(2, -17, 1).setRotationAngle(90, 0, 0).setName("Box 85")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0)
			.setRotationPoint(2, -22, 2).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f)
			.setRotationPoint(2, -17, 6).setRotationAngle(90, 0, 0).setName("Box 87")
		);
		group0.add(new ModelRendererTurbo(group0, 34, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0.0012f, 0, 0, 0.0012f, 0, 0, -0.33f, -0.5f, 0, -0.33f, 0, 0, 0.0012f, 0, 0, 0.0012f, 0, 0, -0.33f, -0.5f, 0, -0.33f)
			.setRotationPoint(6, -20.01f, 3).setRotationAngle(-63, 180, 0).setName("Box 88")
		);
		group0.add(new ModelRendererTurbo(group0, 35, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f)
			.setRotationPoint(3, -20.31f, 3.6000004f).setRotationAngle(206.5f, 0, 0).setName("Box 89")
		);
		group0.add(new ModelRendererTurbo(group0, 38, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(3, -20.31f, 3.6000004f).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		group0.add(new ModelRendererTurbo(group0, 37, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f)
			.setRotationPoint(3, -20.31f, 4.3999996f).setRotationAngle(-26.5f, 0, 0).setName("Box 91")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0.0012f, 0, 0, 0.0012f, -0.5f, 0, -0.33f, 0, 0, -0.33f, 0, 0, 0.0012f, 0, 0, 0.0012f, -0.5f, 0, -0.33f, 0, 0, -0.33f)
			.setRotationPoint(3, -20.01f, 5).setRotationAngle(-63, 0, 0).setName("Box 92")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2.25f, -21, 3).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f)
			.setRotationPoint(2.25f, -18, 5).setRotationAngle(90, 0, 0).setName("Box 94")
		);
		group0.add(new ModelRendererTurbo(group0, 7, 28, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(2.25f, -20, 3).setRotationAngle(0, 0, 0).setName("Box 95")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2.25f, -18, 2).setRotationAngle(90, 0, 0).setName("Box 96")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f)
			.setRotationPoint(2.25f, -18, 3).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.9000015f, -21.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		group0.add(new ModelRendererTurbo(group0, 16, 45, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(1.9000015f, -20.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f)
			.setRotationPoint(1.9000015f, -17.5f, -2.5f).setRotationAngle(90, 0, 0).setName("Box 101")
		);
		group0.add(new ModelRendererTurbo(group0, 16, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.9000015f, -17.5f, -6.5f).setRotationAngle(90, 0, 0).setName("Box 102")
		);
		group0.add(new ModelRendererTurbo(group0, 13, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f, 0, -0.5f, -0.9f)
			.setRotationPoint(1.9000015f, -17.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 13, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f)
			.setRotationPoint(1.5f, -18, -5).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.5f, -18, -6).setRotationAngle(90, 0, 0).setName("Box 105")
		);
		group0.add(new ModelRendererTurbo(group0, 11, 47, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(1.5f, -20, -5).setRotationAngle(0, 0, 0).setName("Box 106")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.5f, -21, -5).setRotationAngle(0, 0, 0).setName("Box 107")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f)
			.setRotationPoint(1.5f, -18, -3).setRotationAngle(90, 0, 0).setName("Box 108")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f)
			.setRotationPoint(2, -17, -2).setRotationAngle(90, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0)
			.setRotationPoint(2, -21, -6).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0)
			.setRotationPoint(2, -22, -6).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		group0.add(new ModelRendererTurbo(group0, 50, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0)
			.setRotationPoint(2, -17, -7).setRotationAngle(90, 0, 0).setName("Box 112")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f)
			.setRotationPoint(2, -17, -6).setRotationAngle(0, 0, 0).setName("Box 113")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0.0012f, 0, 0, 0.0012f, -0.5f, 0, -0.33f, 0, 0, -0.33f, 0, 0, 0.0012f, 0, 0, 0.0012f, -0.5f, 0, -0.33f, 0, 0, -0.33f)
			.setRotationPoint(3, -20.01f, -3).setRotationAngle(-63, 0, 0).setName("Box 114")
		);
		group0.add(new ModelRendererTurbo(group0, 50, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f)
			.setRotationPoint(3, -20.31f, -3.6f).setRotationAngle(-26.5f, 0, 0).setName("Box 115")
		);
		group0.add(new ModelRendererTurbo(group0, 51, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(3, -20.31f, -4.4f).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f, 0, 0, 0, 0, 0, 0, 0, 0, -0.33f, 0, 0, -0.33f)
			.setRotationPoint(3, -20.31f, -4.4f).setRotationAngle(206.5f, 0, 0).setName("Box 117")
		);
		group0.add(new ModelRendererTurbo(group0, 46, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0.0012f, 0, 0, 0.0012f, 0, 0, -0.33f, -0.5f, 0, -0.33f, 0, 0, 0.0012f, 0, 0, 0.0012f, 0, 0, -0.33f, -0.5f, 0, -0.33f)
			.setRotationPoint(6, -20.01f, -5).setRotationAngle(-63, 180, 0).setName("Box 118")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2.25f, -21, -5).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2.25f, -18, -6).setRotationAngle(90, 0, 0).setName("Box 120")
		);
		group0.add(new ModelRendererTurbo(group0, 7, 35, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(2.25f, -20, -5).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, -0.2f, -0.7f, -0.6f, 0, -0.7f, -0.6f)
			.setRotationPoint(2.25f, -18, -3).setRotationAngle(90, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f, 0, -0.7f, -0.6f)
			.setRotationPoint(2.25f, -18, -5).setRotationAngle(0, 0, 0).setName("Box 123")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.505f, 0.005f, 0.003f, 0, 0.005f, 0.003f, 0, 0.005f, -0.003f, 0.505f, 0.005f, -0.003f, -1, -0.33f, 0.003f, 0, -0.33f, 0.003f, 0, -0.33f, -0.003f, -1, -0.33f, -0.003f)
			.setRotationPoint(-5, -19.41f, -5.3f).setRotationAngle(0, 0, 0).setName("Box 158")
		);
		group0.add(new ModelRendererTurbo(group0, 46, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.505f, 0.005f, -0.003f, 0, 0.005f, -0.003f, 0, 0.005f, 0.003f, 0.505f, 0.005f, 0.003f, -1, -0.33f, -0.003f, 0, -0.33f, -0.003f, 0, -0.33f, 0.003f, -1, -0.33f, 0.003f)
			.setRotationPoint(-5, -19.41f, -2.6999998f).setRotationAngle(0, 0, 0).setName("Box 127")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.505f, 0.005f, 0.003f, 0, 0.005f, 0.003f, 0, 0.005f, -0.003f, 0.505f, 0.005f, -0.003f, -1, -0.33f, 0.003f, 0, -0.33f, 0.003f, 0, -0.33f, -0.003f, -1, -0.33f, -0.003f)
			.setRotationPoint(-5, -19.41f, 2.6999998f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0.505f, 0.005f, -0.003f, 0, 0.005f, -0.003f, 0, 0.005f, 0.003f, 0.505f, 0.005f, 0.003f, -1, -0.33f, -0.003f, 0, -0.33f, -0.003f, 0, -0.33f, 0.003f, -1, -0.33f, 0.003f)
			.setRotationPoint(-5, -19.41f, 5.3f).setRotationAngle(0, 0, 0).setName("Box 129")
		);
		group0.add(new ModelRendererTurbo(group0, 46, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0.005f, 0.003f, 0.505f, 0.005f, 0.003f, 0.505f, 0.005f, -0.003f, 0, 0.005f, -0.003f, 0, -0.33f, 0.003f, -1, -0.33f, 0.003f, -1, -0.33f, -0.003f, 0, -0.33f, -0.003f)
			.setRotationPoint(3, -19.41f, 2.6999998f).setRotationAngle(0, 0, 0).setName("Box 130")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0.005f, -0.003f, 0.505f, 0.005f, -0.003f, 0.505f, 0.005f, 0.003f, 0, 0.005f, 0.003f, 0, -0.33f, -0.003f, -1, -0.33f, -0.003f, -1, -0.33f, 0.003f, 0, -0.33f, 0.003f)
			.setRotationPoint(3, -19.41f, 5.3f).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 46, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0.005f, -0.003f, 0.505f, 0.005f, -0.003f, 0.505f, 0.005f, 0.003f, 0, 0.005f, 0.003f, 0, -0.33f, -0.003f, -1, -0.33f, -0.003f, -1, -0.33f, 0.003f, 0, -0.33f, 0.003f)
			.setRotationPoint(3, -19.41f, -2.6999998f).setRotationAngle(0, 0, 0).setName("Box 132")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 0, 0, 0, 0.005f, 0.003f, 0.505f, 0.005f, 0.003f, 0.505f, 0.005f, -0.003f, 0, 0.005f, -0.003f, 0, -0.33f, 0.003f, -1, -0.33f, 0.003f, -1, -0.33f, -0.003f, 0, -0.33f, -0.003f)
			.setRotationPoint(3, -19.41f, -5.3f).setRotationAngle(0, 0, 0).setName("Box 133")
		);
		group0.add(new ModelRendererTurbo(group0, 4, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -6, -1).setRotationAngle(0, 0, 0).setName("Box 12")
		);
		group0.add(new ModelRendererTurbo(group0, 4, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0)
			.setRotationPoint(0, -6, 0).setRotationAngle(0, 0, 0).setName("Box 13")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(2.0099983f, -21.5f, -4.75f).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.05f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.05f, 0, 0, 0.3f, -0.65f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0.3f, -0.65f, 0)
			.setRotationPoint(1.5099983f, -21.5f, -4.75f).setRotationAngle(0, 0, 0).setName("Box 15")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -0.2f, -0.6f, -0.6f, -0.2f, -0.6f, -0.6f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(2.0099983f, -22, -4.75f).setRotationAngle(0, 0, 0).setName("Box 16")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-2.9899979f, -21.5f, 3.25f).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.5f, -0.05f, 0, -0.5f, -0.05f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0.3f, -0.65f, -0.5f, 0.3f, -0.65f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-2.4899979f, -21.5f, 3.25f).setRotationAngle(0, 0, 0).setName("Box 18")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, -0.2f, -0.6f, -0.1f, -0.2f, -0.6f, -0.1f, -0.2f, -0.1f, -0.6f, -0.2f, -0.1f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-2.9899979f, -22, 3.25f).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-2.9899979f, -21.5f, -4.75f).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.5f, -0.05f, 0, -0.5f, -0.05f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0.3f, -0.65f, -0.5f, 0.3f, -0.65f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-2.4899979f, -21.5f, -4.75f).setRotationAngle(0, 0, 0).setName("Box 21")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, -0.2f, -0.6f, -0.1f, -0.2f, -0.6f, -0.1f, -0.2f, -0.1f, -0.6f, -0.2f, -0.1f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-2.9899979f, -22, -4.75f).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		group0.add(new ModelRendererTurbo(group0, 4, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f)
			.setRotationPoint(-1, -6, 0).setRotationAngle(0, 0, 0).setName("Box 23")
		);
		group0.add(new ModelRendererTurbo(group0, 4, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, -6, -1).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 9, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.25f, -26, -4.5f).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		group0.add(new ModelRendererTurbo(group0, 39, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-1.75f, -25.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.25f, -28, -1).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		group0.add(new ModelRendererTurbo(group0, 39, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-1.75f, -27.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0)
			.setRotationPoint(0, -38, 0).setRotationAngle(0, 0, 0).setName("Box 148")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f)
			.setRotationPoint(-1, -38, 0).setRotationAngle(0, 0, 0).setName("Box 149")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -38, -1).setRotationAngle(0, 0, 0).setName("Box 150")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, -38, -1).setRotationAngle(0, 0, 0).setName("Box 151")
		);
		group0.add(new ModelRendererTurbo(group0, 39, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-1.75f, -33.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 2, 13, textureX, textureY)
			.addShapeBox(0, -1, -6, 1, 2, 12, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.2399979f, -33, 0).setRotationAngle(45, 0, 0).setName("Box 11")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 1, textureX, textureY)
			.addShapeBox(0, -1, -6, 1, 2, 12, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.2600021f, -33, 0).setRotationAngle(135, 0, 0).setName("Box 13")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, 0, -0.65f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.65f, -0.1f, -0.65f, 0, -0.1f, -0.5f, 0, -0.1f, 0, -0.5f, -0.1f, 0)
			.setRotationPoint(-1, -39, -1).setRotationAngle(0, 0, 0).setName("Box 112")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.65f, 0, -0.65f, -0.5f, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.5f, -0.65f, -0.2f, -0.65f)
			.setRotationPoint(-1, -39, 0).setRotationAngle(0, 0, 0).setName("Box 113")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.65f, 0, -0.65f, 0, 0, -0.5f, 0, -0.1f, 0, -0.5f, -0.1f, 0, -0.65f, -0.1f, -0.65f, 0, -0.1f, -0.5f)
			.setRotationPoint(0, -39, 0).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		group0.add(new ModelRendererTurbo(group0, 42, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.65f, 0, -0.65f, -0.5f, 0, 0, 0, 0, 0, 0, -0.1f, -0.5f, -0.65f, -0.1f, -0.65f, -0.5f, -0.1f, 0, 0, -0.1f, 0)
			.setRotationPoint(0, -39, -1).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.2f, 0, 0.4f, 0, 0, 0.05f, 0, 0.15f, 0, 0, 0.5f, 0, -0.3f, 0, 0.4f, -0.5f, 0, 0.05f, -0.5f, 0.15f, 0, -0.5f, 0.5f)
			.setRotationPoint(0, -40.25f, -0.75f).setRotationAngle(90, 0, 90).setName("Box 116")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0.5f, 0.05f, 0, 0.15f, 0.4f, 0, 0, 0, 0.2f, 0, 0, -0.5f, 0.5f, 0.05f, -0.5f, 0.15f, 0.4f, -0.5f, 0, 0, -0.3f, 0)
			.setRotationPoint(1, -40.25f, -0.75f).setRotationAngle(90, 0, 90).setName("Box 117")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.05f, 0, 0.15f, 0, 0, 0.5f, 0, 0.2f, 0, 0.4f, 0, 0, 0.05f, -0.5f, 0.15f, 0, -0.5f, 0.5f, 0, -0.3f, 0, 0.4f, -0.5f, 0)
			.setRotationPoint(1, -39.25f, -0.75f).setRotationAngle(90, 0, 90).setName("Box 118")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.4f, 0, 0, 0, 0.2f, 0, 0, 0, 0.5f, 0.05f, 0, 0.15f, 0.4f, -0.5f, 0, 0, -0.3f, 0, 0, -0.5f, 0.5f, 0.05f, -0.5f, 0.15f)
			.setRotationPoint(0, -39.25f, -0.75f).setRotationAngle(90, 0, 90).setName("Box 119")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, 0, 0.4f, 0.05f, 0, 0.15f, 0.4f, 0, 0, -0.5f, 0, 0, -0.3f, -0.9f, 0.4f, 0.05f, -0.8f, 0.15f, 0.4f, -0.8f, 0, -0.5f, -0.8f, 0)
			.setRotationPoint(1, -40.25f, 0.75f).setRotationAngle(90, 0, 90).setName("Box 120")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.4f, 0, 0, 0.05f, 0, 0.15f, -0.3f, 0, 0.4f, -0.5f, -0.8f, 0, 0.4f, -0.8f, 0, 0.05f, -0.8f, 0.15f, -0.3f, -0.9f, 0.4f)
			.setRotationPoint(0, -40.25f, 0.75f).setRotationAngle(90, 0, 90).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-0.25f, -40.5f, 0.9499998f).setRotationAngle(0, -90, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.2f, 0, 0, -0.05f, 0, -0.05f, 0, 0, 0.2f, 0, -0.5f, 0, 0.2f, -0.5f, 0, -0.05f, -0.5f, -0.05f, 0, -0.5f, 0.2f)
			.setRotationPoint(0, -38.5f, 0).setRotationAngle(0, 0, 0).setName("Box 123")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, -0.05f, 0, -0.05f, 0.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.2f, -0.05f, -0.5f, -0.05f)
			.setRotationPoint(-1, -38.5f, 0).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.05f, 0, -0.05f, 0, 0, 0.2f, 0, 0, 0, 0.2f, 0, 0, -0.05f, -0.5f, -0.05f, 0, -0.5f, 0.2f, 0, -0.5f, 0, 0.2f, -0.5f, 0)
			.setRotationPoint(-1, -38.5f, -1).setRotationAngle(0, 0, 0).setName("Box 125")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.2f, -0.05f, 0, -0.05f, 0.2f, 0, 0, 0, 0, 0, 0, -0.5f, 0.2f, -0.05f, -0.5f, -0.05f, 0.2f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0, -38.5f, -1).setRotationAngle(0, 0, 0).setName("Box 126")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-1, -38.7f, 0).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.25f, 0, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-1, -38.7f, -1).setRotationAngle(0, 0, 0).setName("Box 21")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0, -38.7f, -1).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.25f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.25f)
			.setRotationPoint(0, -38.7f, 0).setRotationAngle(0, 0, 0).setName("Box 23")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-3, -11.5f, -1.75f).setRotationAngle(0, 0, 0).setName("Box 18")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -11.5f, -2.75f).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 39, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -10.5f, -3.75f).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		this.groups.add(group0);
		//
		TurboList Arm = new TurboList("Arm");
		Arm.add(new ModelRendererTurbo(Arm, 6, 48, textureX, textureY).addBox(0.75f, -1.5f, -7, 1, 1, 8)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 7")
		);
		Arm.add(new ModelRendererTurbo(Arm, 4, 46, textureX, textureY).addBox(0.75f, 0, -7, 1, 1, 8)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 8")
		);
		Arm.add(new ModelRendererTurbo(Arm, 1, 59, textureX, textureY)
			.addShapeBox(0.75f, -1, -7, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 9")
		);
		Arm.add(new ModelRendererTurbo(Arm, 0, 50, textureX, textureY)
			.addShapeBox(0.75f, -1, -3, 1, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 10")
		);
		Arm.add(new ModelRendererTurbo(Arm, 18, 42, textureX, textureY)
			.addShapeBox(8.25f, -1, -7, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 18")
		);
		Arm.add(new ModelRendererTurbo(Arm, 6, 48, textureX, textureY).addBox(8.25f, 0, -7, 1, 1, 8)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 19")
		);
		Arm.add(new ModelRendererTurbo(Arm, 5, 47, textureX, textureY).addBox(8.25f, -1.5f, -7, 1, 1, 8)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 20")
		);
		Arm.add(new ModelRendererTurbo(Arm, 14, 52, textureX, textureY)
			.addShapeBox(8.25f, -1, -3, 1, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 21")
		);
		Arm.add(new ModelRendererTurbo(Arm, 33, 55, textureX, textureY)
			.addShapeBox(0.45f, -2.25f, -7.25f, 1, 4, 3, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 123")
		);
		Arm.add(new ModelRendererTurbo(Arm, 4, 18, textureX, textureY)
			.addShapeBox(-0.15f, -0.5f, -6, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 122")
		);
		Arm.add(new ModelRendererTurbo(Arm, 33, 55, textureX, textureY)
			.addShapeBox(0.2f, -2.25f, -7.25f, 1, 4, 3, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 137")
		);
		Arm.add(new ModelRendererTurbo(Arm, 34, 54, textureX, textureY)
			.addShapeBox(-0.05f, -2.25f, -7.25f, 1, 4, 3, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 138")
		);
		Arm.add(new ModelRendererTurbo(Arm, 33, 57, textureX, textureY)
			.addShapeBox(9.85f, -2.25f, -7.25f, 1, 4, 3, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 139")
		);
		Arm.add(new ModelRendererTurbo(Arm, 33, 56, textureX, textureY)
			.addShapeBox(9.6f, -2.25f, -7.25f, 1, 4, 3, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 140")
		);
		Arm.add(new ModelRendererTurbo(Arm, 34, 54, textureX, textureY)
			.addShapeBox(9.35f, -2.25f, -7.25f, 1, 4, 3, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 141")
		);
		Arm.add(new ModelRendererTurbo(Arm, 6, 21, textureX, textureY)
			.addShapeBox(8.15f, -0.5f, -6, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 71")
		);
		Arm.add(new ModelRendererTurbo(Arm, 11, 57, textureX, textureY).addBox(0.75f, 3, 5, 1, 2, 2)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 6")
		);
		Arm.add(new ModelRendererTurbo(Arm, 11, 59, textureX, textureY)
			.addShapeBox(0.75f, 3, 3, 1, 2, 1, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 11")
		);
		Arm.add(new ModelRendererTurbo(Arm, 12, 57, textureX, textureY)
			.addShapeBox(0.75f, 3, 4, 1, 2, 1, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 13")
		);
		Arm.add(new ModelRendererTurbo(Arm, 2, 52, textureX, textureY)
			.addShapeBox(0.75f, 1, 2, 1, 4, 1, 0, 0, 1.7f, 0, 0, 1.7f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 14")
		);
		Arm.add(new ModelRendererTurbo(Arm, 14, 48, textureX, textureY)
			.addShapeBox(0.75f, -1.5f, 1, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 1.3f, 0, 0, 1.3f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 15")
		);
		Arm.add(new ModelRendererTurbo(Arm, 15, 50, textureX, textureY)
			.addShapeBox(0.75f, 1, -1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 16")
		);
		Arm.add(new ModelRendererTurbo(Arm, 12, 50, textureX, textureY)
			.addShapeBox(8.25f, 1, -3, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.7f, 0, 0, -0.7f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 22")
		);
		Arm.add(new ModelRendererTurbo(Arm, 11, 53, textureX, textureY)
			.addShapeBox(8.25f, 1, -1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 23")
		);
		Arm.add(new ModelRendererTurbo(Arm, 14, 47, textureX, textureY)
			.addShapeBox(8.25f, -1.5f, 1, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 1.3f, 0, 0, 1.3f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 24")
		);
		Arm.add(new ModelRendererTurbo(Arm, 16, 48, textureX, textureY)
			.addShapeBox(8.25f, 1, 2, 1, 4, 1, 0, 0, 1.7f, 0, 0, 1.7f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 25")
		);
		Arm.add(new ModelRendererTurbo(Arm, 17, 48, textureX, textureY)
			.addShapeBox(8.25f, 3, 3, 1, 2, 1, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 26")
		);
		Arm.add(new ModelRendererTurbo(Arm, 23, 46, textureX, textureY)
			.addShapeBox(8.25f, 3, 4, 1, 2, 1, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 27")
		);
		Arm.add(new ModelRendererTurbo(Arm, 11, 51, textureX, textureY).addBox(8.25f, 3, 5, 1, 2, 2)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 28")
		);
		Arm.add(new ModelRendererTurbo(Arm, 10, 52, textureX, textureY)
			.addShapeBox(1.75f, 3, 6, 7, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 43")
		);
		Arm.add(new ModelRendererTurbo(Arm, 18, 21, textureX, textureY)
			.addShapeBox(1, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 66")
		);
		Arm.add(new ModelRendererTurbo(Arm, 12, 49, textureX, textureY)
			.addShapeBox(0.75f, 1, -3, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.7f, 0, 0, -0.7f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 17")
		);
		Arm.add(new ModelRendererTurbo(Arm, 19, 49, textureX, textureY)
			.addShapeBox(4.5f, 3, 7, 1, 2, 2, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 69")
		);
		Arm.add(new ModelRendererTurbo(Arm, 64, 25, textureX, textureY)
			.addShapeBox(4.5f, 3.25f, 9, 1, 2, 37, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 67")
		);
		Arm.add(new ModelRendererTurbo(Arm, 51, 51, textureX, textureY)
			.addShapeBox(4.75f, 3, 43, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 132")
		);
		Arm.add(new ModelRendererTurbo(Arm, 39, 55, textureX, textureY)
			.addShapeBox(4.75f, 3, 29.5f, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 138")
		);
		Arm.add(new ModelRendererTurbo(Arm, 45, 52, textureX, textureY)
			.addShapeBox(4.75f, 3, 16, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 143")
		);
		Arm.add(new ModelRendererTurbo(Arm, 16, 37, textureX, textureY)
			.addShapeBox(4.75f, 2, 16, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, -0.5f, -0.5f, 0.1f, -0.5f, -0.5f, 0, -0.15f, -0.1f, -0.5f, -0.15f, -0.1f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 144")
		);
		Arm.add(new ModelRendererTurbo(Arm, 16, 37, textureX, textureY)
			.addShapeBox(4.75f, 2, 16, 1, 1, 1, 0, 0.1f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.15f, -0.1f, 0, -0.15f, -0.1f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 145")
		);
		Arm.add(new ModelRendererTurbo(Arm, 16, 37, textureX, textureY)
			.addShapeBox(4.75f, 2, 16, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.15f, -0.1f, 0, -0.15f, -0.1f, 0.1f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 146")
		);
		Arm.add(new ModelRendererTurbo(Arm, 16, 37, textureX, textureY)
			.addShapeBox(4.75f, 2, 16, 1, 1, 1, 0, 0, -0.15f, -0.1f, -0.5f, -0.15f, -0.1f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, -0.5f, -0.5f, 0.1f, -0.5f, -0.5f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 147")
		);
		Arm.add(new ModelRendererTurbo(Arm, 40, 51, textureX, textureY)
			.addShapeBox(4.75f, 2.75f, 16, 1, 1, 1, 0, -0.05f, 0, -0.1f, -0.55f, 0, -0.1f, -0.55f, 0, -0.1f, -0.05f, 0, -0.1f, -0.05f, -0.5f, -0.1f, -0.55f, -0.5f, -0.1f, -0.55f, -0.5f, -0.1f, -0.05f, -0.5f, -0.1f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 63")
		);
		Arm.add(new ModelRendererTurbo(Arm, 44, 52, textureX, textureY)
			.addShapeBox(4.75f, 2.75f, 29.5f, 1, 1, 1, 0, -0.05f, 0, -0.1f, -0.55f, 0, -0.1f, -0.55f, 0, -0.1f, -0.05f, 0, -0.1f, -0.05f, -0.5f, -0.1f, -0.55f, -0.5f, -0.1f, -0.55f, -0.5f, -0.1f, -0.05f, -0.5f, -0.1f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 66")
		);
		Arm.add(new ModelRendererTurbo(Arm, 16, 30, textureX, textureY)
			.addShapeBox(4.75f, 2, 29.5f, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, -0.5f, -0.5f, 0.1f, -0.5f, -0.5f, 0, -0.15f, -0.1f, -0.5f, -0.15f, -0.1f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 67")
		);
		Arm.add(new ModelRendererTurbo(Arm, 16, 30, textureX, textureY)
			.addShapeBox(4.75f, 2, 29.5f, 1, 1, 1, 0, 0.1f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.15f, -0.1f, 0, -0.15f, -0.1f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 68")
		);
		Arm.add(new ModelRendererTurbo(Arm, 16, 30, textureX, textureY)
			.addShapeBox(4.75f, 2, 29.5f, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.15f, -0.1f, 0, -0.15f, -0.1f, 0.1f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 69")
		);
		Arm.add(new ModelRendererTurbo(Arm, 16, 30, textureX, textureY)
			.addShapeBox(4.75f, 2, 29.5f, 1, 1, 1, 0, 0, -0.15f, -0.1f, -0.5f, -0.15f, -0.1f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, -0.5f, -0.5f, 0.1f, -0.5f, -0.5f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 70")
		);
		Arm.add(new ModelRendererTurbo(Arm, 55, 51, textureX, textureY)
			.addShapeBox(4.75f, 2.75f, 43, 1, 1, 1, 0, -0.05f, 0, -0.1f, -0.55f, 0, -0.1f, -0.55f, 0, -0.1f, -0.05f, 0, -0.1f, -0.05f, -0.5f, -0.1f, -0.55f, -0.5f, -0.1f, -0.55f, -0.5f, -0.1f, -0.05f, -0.5f, -0.1f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 71")
		);
		Arm.add(new ModelRendererTurbo(Arm, 25, 30, textureX, textureY)
			.addShapeBox(4.75f, 2, 43, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, -0.5f, -0.5f, 0.1f, -0.5f, -0.5f, 0, -0.15f, -0.1f, -0.5f, -0.15f, -0.1f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 72")
		);
		Arm.add(new ModelRendererTurbo(Arm, 25, 30, textureX, textureY)
			.addShapeBox(4.75f, 2, 43, 1, 1, 1, 0, 0.1f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.15f, -0.1f, 0, -0.15f, -0.1f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 73")
		);
		Arm.add(new ModelRendererTurbo(Arm, 25, 30, textureX, textureY)
			.addShapeBox(4.75f, 2, 43, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.15f, -0.1f, 0, -0.15f, -0.1f, 0.1f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 74")
		);
		Arm.add(new ModelRendererTurbo(Arm, 25, 30, textureX, textureY)
			.addShapeBox(4.75f, 2, 43, 1, 1, 1, 0, 0, -0.15f, -0.1f, -0.5f, -0.15f, -0.1f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.4f, -0.5f, -0.5f, 0.1f, -0.5f, -0.5f)
			.setRotationPoint(-5, -9.25f, -1).setRotationAngle(85, 0, 0).setName("Box 75")
		);
		this.groups.add(Arm);
		//
	}

}
