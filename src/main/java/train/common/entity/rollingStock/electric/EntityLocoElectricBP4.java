package train.common.entity.rollingStock.electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoElectricBP4 extends ElectricTrain {
	public EntityLocoElectricBP4(World world) {
		super(world);
		InsertTexture(0, "NS 999");
		InsertTexture(1, "(Formerly) TLR");
		InsertTexture(2, "FURRX (Former OWO)");
		InsertTexture(3, "FURRX");
		InsertTexture(4, "eat at clydes upriver diner or i will personally murder you");
	}

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoElectricBP4;
	}



	@Override
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, 3.0, 0.15);
	}

	

	@Override
	public String getInventoryName() {
		return "BP4";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.2F);
	}
	

	
}
