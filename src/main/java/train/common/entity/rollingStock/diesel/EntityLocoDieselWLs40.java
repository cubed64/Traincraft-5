package train.common.entity.rollingStock.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumHeritageTrainsLegacy;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class EntityLocoDieselWLs40 extends DieselTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDieselWLs40;
	}

	public EntityLocoDieselWLs40(World world) {
		super(world, EnumHeritageTrainsLegacy.locoDieselWLs40.getTankCapacity(), LiquidManager.dieselFilter());
		initLoco();
	}

	public void initLoco() {
		fuelTrain = 0;
		locoInvent = new ItemStack[inventorySize];
	}



	@Override
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, 0, 0.5f);
	}

	@Override
	public void onUpdate() {
		checkInvent(locoInvent[0]);
		super.onUpdate();
	}

	

	@Override
	public String getInventoryName() {
		return "WLs40";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1F);
	}
	

	
}