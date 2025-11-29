package train.common.entity.rollingStock.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.models.ModelDRGCombo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCombineCar;
import train.common.library.Info;

public class EntityPassengerDenverRioGrandeCombo extends AbstractPassengerCombineCar
{

	public EntityPassengerDenverRioGrandeCombo(World world) {
		super(world);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "DRGW");
		InsertTexture(1, "Noctua Poopy Brown");
		InsertTexture(2, "Green");
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	public void updateRiderPosition() {
		//if(this.bogie[0]!=null){
			/*double dX = this.posX - this.bogie[0].posX;
			double dZ = this.posZ - this.bogie[0].posZ;
			dX/=2;
			dZ/=2;*/
			//System.out.println(worldObj.isRemote+ " "+(posX - dX) +" " + (posZ - dZ));
			//riddenByEntity.setPosition(posX - dX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.2, posZ-dZ);	
		//}
		/*double rads = this.rotationYawClientReal-90 * 3.141592653589793D / 180.0D;
		double pitchRads = this.anglePitchClient * 3.141592653589793D / 180.0D;
		double distance = 1.3;
		riddenByEntity.setPosition(posX - Math.cos(rads)*distance, posY + (Math.tan(pitchRads)*-distance)+( getMountedYOffset() + riddenByEntity.getYOffset() + 0.2F), posZ - Math.sin(rads)*distance);
		*/
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.2, posZ);
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.15F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
				EntityPassengerDenverRioGrandeCombo.class, new ModelDRGCombo(),
				"drg_combo_",
				new float[] { 0.0F, 0.14F, 0F },
				new float[] { 0F, 180F, 180F },
				new float[] {0.9f,1f,0.9f}));
	}
}