package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.containers.ModelISO_40FT_Item;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class HuskyStack2 extends AbstractStandardFreightCar
{
	public HuskyStack2(World world) {
		super(world);
		InsertTexture(0, "TTX Corp");
		InsertTexture(1, "Generic Blue");
		InsertTexture(2, "WP");
		InsertTexture(3, "CSLX");
		InsertTexture(4, "CSLX");
		InsertTexture(5, "MT&S");
	}

	public HuskyStack2(World world, double x, double y, double z){
		super(world, x , y, z);
	}

	@Override
	public CargoManager setupCargoManager()
	{
		return new CargoManager(new CargoSpecification[][] {
				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
						"Dual Containers (Generic)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
								"Dual Containers (Generic)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MAERSK",
						"Dual Containers (Maersk)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MAERSK",
								"Dual Containers (Maersk)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_CSX_Blue",
						"Dual Containers (CSX)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_CSX_White",
								"Dual Containers (CSX)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_CSX_White",
						"Dual Containers (CSX2)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_CSX_Blue",
								"Dual Containers (CSX2)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Cosco",
						"Dual Containers (Cosco)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Cosco",
								"Dual Containers (Cosco)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_K-Line",
						"Dual Containers (K-Line)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_K-Line",
								"Dual Containers (K-Line)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Boop",
						"Dual Containers (Boop Express)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Boop",
								"Dual Containers (Boop Express)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MSC",
						"Dual Containers (MSC)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MSC",
								"Dual Containers (MSC)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Blue",
						"Dual Containers (Generic Blue)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Blue",
								"Dual Containers (Generic Blue)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_White",
						"Dual Containers (Generic White)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_White",
								"Dual Containers (Generic White)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
						"Dual Containers (North Fox Container Lines)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
								"Dual Containers (North Fox Container Lines)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_safmarine",
						"Dual Containers (Safmarine)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_safmarine",
								"Dual Containers (Safmarine)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Blue",
						"Dual Containers (Mix 1)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_White",
								"Dual Containers (Mix 1)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
						"Dual Containers (Mix 2)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Blue",
								"Dual Containers (Mix 2)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_K-Line",
						"Dual Containers (Mix 3)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MSC",
								"Dual Containers (Mix 3)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_White",
						"Dual Containers (Mix 4)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
								"Dual Containers (Mix 4)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
						"Dual Containers (Mix 5)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Boop",
								"Dual Containers (Mix 5)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Cosco",
						"Dual Containers (Mix 6)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
								"Dual Containers (Mix 6)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Cosco",
						"Dual Containers (Mix 7)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Boop",
								"Dual Containers (Mix 7)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Boop",
						"Dual Containers (Mix 8)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
								"Dual Containers (Mix 8)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_White",
						"Dual Containers (Mix 9)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
								"Dual Containers (Mix 9)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
						"Dual Containers (Mix 10)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Blue",
								"Dual Containers (Mix 10)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
						"Dual Containers (Mix 11)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_K-Line",
								"Dual Containers (Mix 11)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_safmarine",
						"Dual Containers (Mix 12)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_K-Line",
								"Dual Containers (Mix 12)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_White",
						"Dual Containers (Mix 13)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_safmarine",
								"Dual Containers (Mix 13)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Cosco",
						"Dual Containers (Mix 14)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_safmarine",
								"Dual Containers (Mix 14)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
						"Single Container (NFCU)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_K-Line",
						"Single Container (K-Line)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Cosco",
						"Single Container (Cosco)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MSC",
						"Single Container (MSC)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Boop",
						"Single Container (Boop)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Blue",
						"Single Container (Generic Blue)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_White",
						"Single Container (Generic White)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
						"Single Container (Generic LightGrey)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MAERSK",
						"Single Container (Maersk)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_CSX_White",
						"Single Container (CSX1)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_CSX_Blue",
						"Single Container (CSX2)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_safmarine",
						"Single Container (Safmarine)", 0, 2.845, 0)},
		});
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "TTX Corp");
		InsertTexture(1, "Generic Blue");
		InsertTexture(2, "WP");
		InsertTexture(3, "CSLX");
		InsertTexture(4, "CSLX");
		InsertTexture(5, "MT&S");
	}

	@Override
	public String getInventoryName() {
		return "Gunderson 40' Husky Stack Wellcar";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.3F;
	}
}