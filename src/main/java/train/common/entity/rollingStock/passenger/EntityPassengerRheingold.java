package train.common.entity.rollingStock.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.client.render.models.ModelPassenger7;
import train.client.render.models.ModelRheingoldPassenger;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.core.util.TraincraftUtil;
import train.common.library.Info;

public class EntityPassengerRheingold extends AbstractPassengerCar {

	public EntityPassengerRheingold(World world) {
		super(world);
	}

	@Override
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, -0.3, 0);
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.94F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
				EntityPassengerRheingold.class, new ModelRheingoldPassenger(),
				"Rheingold_passenger_",
				new float[] { 1.55F, 0.15F, -0.6F },
				new float[] { 0F, 180F, 180F },
				new float[] {0.9f,1f,0.9f}));
	}
}