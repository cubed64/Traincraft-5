package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.models.ModelCaboose;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractWorkCart;
import train.common.library.Info;

public class EntityCaboose extends AbstractWorkCart
{
	public EntityCaboose(World world) {
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
				EntityCaboose.class, new ModelCaboose(),
				"caboose",
				new float[] { 0.0F, -0.32F, 0.0F },
				null,
				null));
	}
}