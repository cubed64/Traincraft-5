package train.common.entity.rollingStock.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.models.ModelPassengerHighSpeedCarZeroED;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.library.Info;

public class EntityPassengerHighSpeedCarZeroED extends AbstractPassengerCar
{
	public EntityPassengerHighSpeedCarZeroED(World world) {
		super(world);
	}

	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset(), posZ);
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.17F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
				EntityPassengerHighSpeedCarZeroED.class, new ModelPassengerHighSpeedCarZeroED(),
				"passengerHighSpeedCarZeroED_",
				new float[] { 0.0F, -0.47F, 0.0F },
				null,
				null));
	}
}