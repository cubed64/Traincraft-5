package train.common.entity.rollingStock.electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.sounds.SoundRecord;

public class EntityLocoElectricNewHighSpeed extends ElectricTrain {
	EntityPlayer playerEntity;

	@Override
	public SoundRecord getSoundRecord()
	{
		return null;
	}

	public EntityLocoElectricNewHighSpeed(World world) {
		super(world);
	}

	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.35F, posZ);
	}

	

	@Override
	public String getInventoryName() {
		return "High Speed";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.75F;
	}

	
	
}