package train.common.entity.rollingStock.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.models.ModelPassenger6;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.library.Info;

public class EntityPassengerBlue extends AbstractPassengerCar {

	public EntityPassengerBlue(World world) {
		super(world);
	}

	
	@Override
	public void updateRiderPosition() {
		/*double pitchRads = this.anglePitchClient * 3.141592653589793D / 180.0D;
		
		double distance = 2;
		double yOffset = 0.01;
		float rotationCos1 = (float) Math.cos(Math.toRadians(this.rotationYawClientReal + 90));
		float rotationSin1 = (float) Math.sin(Math.toRadians((this.rotationYawClientReal + 90)));
		float pitch = (float) (posY + ((Math.tan(pitchRads)*distance)+getMountedYOffset()) + riddenByEntity.getYOffset() + yOffset);
		double bogieX1 = (this.posX + (rotationCos1 * distance));
		double bogieZ1 = (this.posZ + (rotationSin1* distance));
		//System.out.println(rotationCos1+" "+ rotationSin1);
		if(anglePitchClient>20 && rotationCos1 == -1){
			bogieX1-=pitchRads*2;
			pitch-=pitchRads*1.2;
		}
		if(anglePitchClient>20 && rotationSin1 == -1){
			bogieZ1+=pitchRads*2;
			pitch-=pitchRads*1.2;
		}
		riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);*/
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset(), posZ);
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.2F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(
				new TrainRenderRecord(Info.modID,
				EntityPassengerBlue.class, new ModelPassenger6(),
				"passenger",
				new float[] { 0.0F, -0.47F, 0.0F },
				null,
				null));
	}
}