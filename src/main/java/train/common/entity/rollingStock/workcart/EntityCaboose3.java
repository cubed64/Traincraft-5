package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.models.ModelCaboose3;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractWorkCart;
import train.common.library.Info;

public class EntityCaboose3 extends AbstractWorkCart
{

	public EntityCaboose3(World world) {
		super(world);
	}



	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.3F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
				EntityCaboose3.class, new ModelCaboose3(),
				"caboose3",
				new float[] { 0.0F, -0.44F, 0.0F },
				new float[] { 0F, 90F, 0F },
				null));
	}
}