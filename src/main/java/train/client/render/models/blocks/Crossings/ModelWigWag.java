//FMT-Marker FVTM-1.5
package train.client.render.models.blocks.Crossings;

import net.minecraft.entity.Entity;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2022 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelWigWag extends FVTMFormatBase {

	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale){
		for(ModelRendererTurbo turbo : groups.get(0)){
			turbo.render();
		}

		for(ModelRendererTurbo turbo : groups.get(1)){
			turbo.rotateAngleX=f0*0.0174533f;
			turbo.render();
		}
	}
	public ModelWigWag(){
		super(); textureX = 512; textureY = 32;
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 169, 1, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-1, -30.25f, -1).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.5f, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(-1.25f, -30.5f, 1.25f).setRotationAngle(0, 0, 0).setName("Box 105")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f)
			.setRotationPoint(0.5f, -31, 9).setRotationAngle(0, 180, 0).setName("Box 123")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.75f, -31, 7.75f).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.5f, 0, 0.1f, 0, 0, 0.1f, 0, 3.5f, -0.5f, -0.5f, 3.5f, -0.5f, -0.5f, -0.5f, 0.1f, 0, -0.5f, 0.1f, 0, -4.5f, 0.5f, -0.5f, -4.5f, 0.5f)
			.setRotationPoint(-1.25f, -26, 1).setRotationAngle(0, 0, 0).setName("Box 112")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-0.75f, -31.5f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 63")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0)
			.setRotationPoint(0, -38, 0).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f)
			.setRotationPoint(-1, -38, 0).setRotationAngle(0, 0, 0).setName("Box 70")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, -38, -1).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -38, -1).setRotationAngle(0, 0, 0).setName("Box 72")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 1, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-1, -26.25f, -1).setRotationAngle(0, 0, 0).setName("Box 40")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-1.75f, -34.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 1, textureX, textureY)
			.addShapeBox(0, -1, -6, 1, 2, 12, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.24f, -34, 0).setRotationAngle(45, 0, 0).setName("Box 11")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 1, textureX, textureY)
			.addShapeBox(0, -1, -6, 1, 2, 12, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.26f, -34, 0).setRotationAngle(135, 0, 0).setName("Box 13")
		);
		group0.add(new ModelRendererTurbo(group0, 3, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 9, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.25f, -18, -4.5f).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-1.75f, -17.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.25f, -20, -1).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-1.75f, -19.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 27, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 9, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.25f, -15, -4.5f).setRotationAngle(0, 0, 0).setName("Box 92")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-1.75f, -14.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-1.75f, -9.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f)
			.setRotationPoint(-1, -22, 0).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0)
			.setRotationPoint(0, -22, 0).setRotationAngle(0, 0, 0).setName("Box 66")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -22, -1).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, -22, -1).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -6, -1).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0)
			.setRotationPoint(0, -6, 0).setRotationAngle(0, 0, 0).setName("Box 40")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f)
			.setRotationPoint(-1, -6, 0).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, -6, -1).setRotationAngle(0, 0, 0).setName("Box 42")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0.2f)
			.setRotationPoint(-1, 4, -1).setRotationAngle(0, 0, 0).setName("Box 44")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 12, textureX, textureY).addBox(0, 0, 0, 2, 3, 2)
			.setRotationPoint(-1, 5, -1).setRotationAngle(0, 0, 0).setName("Box 45")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1.5f, 8, -2).setRotationAngle(0, 0, 0).setName("Box 46")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-0.1f, 5, 1).setRotationAngle(0, 0, 0).setName("Box 47")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.1f, 5, -2).setRotationAngle(0, 0, 0).setName("Box 48")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f)
			.setRotationPoint(-1.5f, 8.5f, -2).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.5f, 0, 0.1f, 0, 0, 0.1f, 0, 3.5f, -0.5f, -0.5f, 3.5f, -0.5f, -0.5f, -0.5f, 0.1f, 0, -0.5f, 0.1f, 0, -4.5f, 0.5f, -0.5f, -4.5f, 0.5f)
			.setRotationPoint(-0.25f, -26, 1).setRotationAngle(0, 0, 0).setName("Box 85")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.5f, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(-0.25f, -30.5f, 1.25f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.8f, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, -0.8f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-2, 5, -0.9f).setRotationAngle(0, 0, 0).setName("Box 13")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.8f, -0.8f, 0, -0.8f, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(1, 5, -0.9f).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0.2f, -0.05f, 0, -0.05f, 0.2f, 0, 0, 0, 0, 0, 0, -0.5f, 0.2f, -0.05f, -0.5f, -0.05f, 0.2f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0, -39.5f, -1).setRotationAngle(0, 0, 0).setName("Box 66")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.05f, 0, -0.05f, 0, 0, 0.2f, 0, 0, 0, 0.2f, 0, 0, -0.05f, -0.5f, -0.05f, 0, -0.5f, 0.2f, 0, -0.5f, 0, 0.2f, -0.5f, 0)
			.setRotationPoint(-1, -39.5f, -1).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, -0.05f, 0, -0.05f, 0.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.2f, -0.05f, -0.5f, -0.05f)
			.setRotationPoint(-1, -39.5f, 0).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.2f, 0, 0, -0.05f, 0, -0.05f, 0, 0, 0.2f, 0, -0.5f, 0, 0.2f, -0.5f, 0, -0.05f, -0.5f, -0.05f, 0, -0.5f, 0.2f)
			.setRotationPoint(0, -39.5f, 0).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.5f)
			.setRotationPoint(-1, -39.7f, 0).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.25f, 0, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-1, -39.7f, -1).setRotationAngle(0, 0, 0).setName("Box 21")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0, -39.7f, -1).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.25f, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.25f)
			.setRotationPoint(0, -39.7f, 0).setRotationAngle(0, 0, 0).setName("Box 23")
		);
		this.groups.add(group0);
		//
		TurboList group1 = new TurboList("group1");
		group1.add(new ModelRendererTurbo(group1, 1, 1, textureX, textureY)
			.addShapeBox(-0.1f, 5.75f, -2, 1, 4, 4, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -30, 8.75f).setRotationAngle(0, 0, 0).setName("Box 77")
		);
		group1.add(new ModelRendererTurbo(group1, 33, 1, textureX, textureY)
			.addShapeBox(-0.1f, 4.75f, -2, 1, 1, 4, 0, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -30, 8.75f).setRotationAngle(0, 0, 0).setName("Box 79")
		);
		group1.add(new ModelRendererTurbo(group1, 65, 1, textureX, textureY)
			.addShapeBox(-0.1f, 9.75f, -2, 1, 1, 4, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, -0.8f, -0.3f, -1.3f, 0, -0.3f, -1.3f)
			.setRotationPoint(0, -30, 8.75f).setRotationAngle(0, 0, 0).setName("Box 81")
		);
		group1.add(new ModelRendererTurbo(group1, 281, 0, textureX, textureY)
			.addShapeBox(-0.75f, -0.25f, -0.75f, 1, 7, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(0, -30, 8.75f).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		group1.add(new ModelRendererTurbo(group1, 162, 2, textureX, textureY)
			.addShapeBox(-0.38f, 7.25f, -0.5f, 1, 1, 1, 0, 0, 0.25f, 0.25f, -0.25f, 0.25f, 0.25f, -0.25f, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, -0.25f, 0.25f, 0.25f, -0.25f, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(0, -30, 8.75f).setRotationAngle(0, 0, 0).setName("Box 27")
		);
		group1.add(new ModelRendererTurbo(group1, 10, 2, textureX, textureY)
			.addShapeBox(-0.38f, 6, -0.5f, 1, 1, 1, 0, 0, -0.7f, -0.2f, -0.25f, -0.7f, -0.2f, -0.25f, -0.7f, -0.2f, 0, -0.7f, -0.2f, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(0, -30, 8.75f).setRotationAngle(0, 0, 0).setName("Box 33")
		);
		group1.add(new ModelRendererTurbo(group1, 42, 2, textureX, textureY)
			.addShapeBox(-0.38f, 8.5f, -0.5f, 1, 1, 1, 0, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0, -0.7f, -0.2f, -0.25f, -0.7f, -0.2f, -0.25f, -0.7f, -0.2f, 0, -0.7f, -0.2f)
			.setRotationPoint(0, -30, 8.75f).setRotationAngle(0, 0, 0).setName("Box 27")
		);
		group1.add(new ModelRendererTurbo(group1, 17, 1, textureX, textureY)
				.addShapeBox(-0.1f, 6, 2.2f, 1, 1, 4, 0, 0, 0.25f, 0.2f, -0.8f, 0.25f, 0.2f, -0.8f, -1.05f, -3.5f, 0, -1.05f, -3.5f, 0, 2.75f, 0.2f, -0.8f, 2.75f, 0.2f, -0.8f, 1.45f, -3.5f, 0, 1.45f, -3.5f)
				.setRotationPoint(0, -30, 8.75f).setRotationAngle(0, 0, 0).setName("Box 78")
		);
		group1.add(new ModelRendererTurbo(group1, 58, 2, textureX, textureY)
				.addShapeBox(-0.38f, 7, 1, 1, 1, 1, 0, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.45f, -0.95f, 0, -0.45f, -0.95f, 0, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0.05f, -0.95f, 0, 0.05f, -0.95f)
				.setRotationPoint(0, -30, 8.75f).setRotationAngle(0, 0, 0).setName("Box 27")
		);
		group1.add(new ModelRendererTurbo(group1, 17, 1, textureX, textureY)
				.addShapeBox(-0.1f, 6, -6.2f, 1, 1, 4, 0, 0, -1.05f, -3.5f, -0.8f, -1.05f, -3.5f, -0.8f, 0.25f, 0.2f, 0, 0.25f, 0.2f, 0, 1.45f, -3.5f, -0.8f, 1.45f, -3.5f, -0.8f, 2.75f, 0.2f, 0, 2.75f, 0.2f)
				.setRotationPoint(0, -30, 8.75f).setRotationAngle(0, 0, 0).setName("Box 78cp")
		);
		group1.add(new ModelRendererTurbo(group1, 58, 2, textureX, textureY)
				.addShapeBox(-0.38f, 7, -2, 1, 1, 1, 0, 0, -0.45f, -0.95f, -0.25f, -0.45f, -0.95f, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0.05f, -0.95f, -0.25f, 0.05f, -0.95f, -0.25f, 0.5f, 0.25f, 0, 0.5f, 0.25f)
				.setRotationPoint(0, -30, 8.75f).setRotationAngle(0, 0, 0).setName("Box 27cp")
		);
		this.groups.add(group1);
	}

}
