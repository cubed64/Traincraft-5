package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumHeritageTrainsLegacy;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamBerk1225 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return null;
	}

	public EntityLocoSteamBerk1225(World world) {
		super(world, EnumHeritageTrainsLegacy.locosteamBerk1225.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	



	@Override
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, -1.125, 0.375);
	}



	

	
@Override
	public String getInventoryName() {
		return "Berkshire 1225";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.375F;
	}


	
}