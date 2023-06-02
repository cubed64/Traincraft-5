package train.common.mtc.render;

import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelMTCBalise extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelMTCBalise() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[2];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(-8F, -8F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 1
		bodyModel[1].setRotationPoint(-1.4F, -9.5F, -2F);


		translateAll(0F, 0F, 0F);


	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for(int i = 0; i < 2; ++i) {
			this.bodyModel[i].render(f5);
		}

	}
}