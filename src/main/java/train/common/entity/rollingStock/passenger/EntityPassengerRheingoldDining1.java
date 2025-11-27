package train.common.entity.rollingStock.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import train.client.render.models.ModelRheingoldPassenger_Dining1;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractWorkCart;
import train.common.core.util.TraincraftUtil;
import train.common.library.Info;

public class EntityPassengerRheingoldDining1 extends AbstractWorkCart {
	public EntityPassengerRheingoldDining1(World world) {
		super(world);
	}

	@Override
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this,  -0.1, 0);
	}

	@Override
	public String getInventoryName() {
		return "Rheingold Dining";
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return !isDead && entityplayer.getDistanceSqToEntity(this) <= 64D;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.90F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
				EntityPassengerRheingoldDining1.class, new ModelRheingoldPassenger_Dining1(),
				"Rheingold_passenger_dining1_",
				new float[] { 1.7F, 0.15F, -0.6F },
				new float[] { 0F, 180F, 180F },
				new float[] {0.9f,1f,0.9f}));
	}
}