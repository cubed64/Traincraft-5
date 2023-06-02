package train.common.mtc.render;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class Balise extends ModelBase {
   public ModelRendererTurbo justABox = new ModelRendererTurbo(this, 0, 0, 0, 0);

   public Balise() {
      this.justABox.addBox(0.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F);
      this.justABox.setRotationPoint(0.0F, 0.0F, 0.0F);
   }

   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      this.justABox.render(f5);
   }
}
