package train.common.entity.rollingStock.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.client.render.models.ModelBambooTrainPassenger;
import train.client.render.models.ModelRheingoldPassenger_Dining1;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.library.Info;

public class EntityPassengerBamboo extends AbstractPassengerCar
{

	public EntityPassengerBamboo(World world) {
		super(world);
	}

	@Override
	public void updateRiderPosition()
	{
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset(), posZ);
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.55F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
				EntityPassengerBamboo.class, new ModelBambooTrainPassenger(),
				"passenger_bamboo_",
				new float[] { 1.7F, 0.15F, -0.6F },
				new float[] { 0F, 180F, 180F },
				new float[] {0.9f,1f,0.9f}));
	}
}