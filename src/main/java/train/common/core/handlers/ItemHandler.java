/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 *
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.*;
import train.common.entity.rollingStock.freight.*;
import train.common.enums.CargoItemFilter;
import train.common.items.ItemBlockOreTC;
import train.common.items.ItemTCRail;

import java.util.LinkedList;

public class ItemHandler {
	
	public static boolean handleItems(Entity entity, ItemStack itemstack) {
		if (itemstack != null) {
			if (entity instanceof Freight) {
				return handleFreight(entity, itemstack);
			} else if (entity instanceof DieselTrain) {
				return false;
			} else if (entity instanceof ElectricTrain) {
				return false;
			} else if (entity instanceof SteamTrain) {
				return false;
			} else if (entity instanceof Tender) {
				return false;
			} else {
				return false;
			}
		}
		return false;
	}

	public static boolean handleFreight(Entity entity, ItemStack itemstack)
	{
		int logWood = OreDictionary.getOreID("logWood");
		int plankWood = OreDictionary.getOreID("plankWood");
		int slabWood =  OreDictionary.getOreID("slabWood");
		int stairWood = OreDictionary.getOreID("stairWood");
		int rubberWood = OreDictionary.getOreID("woodRubber");
		int pulpWood = OreDictionary.getOreID("pulpWood");
		int dustWood = OreDictionary.getOreID("dustWood");
		int dw1 = OreDictionary.getOreID("drywallUnfinished");
		int dw2 = OreDictionary.getOreID("drywallFinished");

		if(itemstack == null) {
			return false;
		}
		Block block = Block.getBlockFromItem(itemstack.getItem());
		if (block == null) {
			return false;
		}

		if (entity instanceof AbstractStandardFreightCar)
		{
			AbstractStandardFreightCar car = (AbstractStandardFreightCar) entity;
			if (CargoItemFilter.DEFAULT.equals(car.GetCargoFilterCategory()) == false)
			{
				int oreDicID;
				switch (car.GetCargoFilterCategory())
				{
					case WOOD_PRODUCTS:
						oreDicID = OreDictionary.getOreID(itemstack);
						return oreDicID == plankWood
								|| oreDicID == logWood
								|| oreDicID == slabWood
								|| oreDicID == stairWood
								|| oreDicID == dw1
								|| oreDicID == dw2
								|| itemstack.getItem() == Item.getItemFromBlock(Blocks.ladder)
								|| itemstack.getItem() == Item.getItemFromBlock(Blocks.fence)
								|| itemstack.getItem() == Item.getItemFromBlock(Blocks.fence_gate)
								|| oreDicID == rubberWood;
					case LOG_WOOD:
						oreDicID = OreDictionary.getOreID(itemstack);
						return oreDicID == logWood;
					case ASSEMBLED_TRAIN_TRACK:
						return block instanceof BlockRailBase || itemstack.getItem() instanceof ItemTCRail;
					case GRAIN:
						Item item = itemstack.getItem();
						if (item == Items.wheat
								|| item == Items.wheat_seeds
								|| item == Items.melon_seeds
								|| item == Items.pumpkin_seeds
								|| item instanceof ItemSeeds)
						{
							return true;
						}
						return cropStuff(itemstack);
					case OPAQUE_BLOCKS:
						return block.isOpaqueCube();
					case WOOD_CHIPS:
						return powderWood(itemstack);
					case ROCK_MATERIAL:
						return block.getMaterial() == Material.rock;
					case ICE_MATERIAL:
						return block.getMaterial() == Material.ice || block.getMaterial() == Material.packedIce;
					case ORE:
						return oreBlocks(itemstack);
					case INGOT:
						return ingotItems(itemstack);
					default:
						return true;
				}
			}
		}
		return true;
	}

	private static boolean oreCoal(ItemStack itemstack){
	    String[] names = new String[] { "cropPotato"};
	    for (String name: names){
	        if (OreDictionary.getOreID(name) == OreDictionary.getOreID(itemstack)) {
	            return true;
            }
        }
	    return false;
    }

	private static boolean powderWood(ItemStack itemstack){
		String[] names = new String[] { "dustWood", "pulpWood"};
		for (String name: names){
			if (OreDictionary.getOreID(name) == OreDictionary.getOreID(itemstack)) {
				return true;
			}
		}
		return false;
	}


	private static boolean cropStuff(ItemStack itemstack) {
		String[] names = new String[] { "cropCorn", "cropRice", "seedRice", "seedCorn", "listAllseed" };
		for (String name: names) {
			if (OreDictionary.getOreID(name) == OreDictionary.getOreID(itemstack)) {
				return true;
			}
		}
		return false;
	}

	private static LinkedList<String> OREDICT_ORES = null;

	public static boolean oreBlocks(ItemStack i){
		if (OREDICT_ORES==null){
			OREDICT_ORES = new LinkedList<>();
		}
		if (!OREDICT_ORES.contains(i.getUnlocalizedName())){
			for(Integer ore : OreDictionary.getOreIDs(i)) {
				if (OreDictionary.getOreName(ore).toLowerCase().startsWith("ore")){
					OREDICT_ORES.add(i.getUnlocalizedName());
					return true;
				}
			}
		}
		return OREDICT_ORES.contains(i.getUnlocalizedName());
	}

	private static LinkedList<String> OREDICT_INGOTS = null;

	public static boolean ingotItems(ItemStack i){
		if (OREDICT_INGOTS==null){
			OREDICT_INGOTS = new LinkedList<>();
		}
		if (!OREDICT_INGOTS.contains(i.getUnlocalizedName())){
			for(Integer ore : OreDictionary.getOreIDs(i)) {
				if (OreDictionary.getOreName(ore).toLowerCase().startsWith("ingot")){
					OREDICT_INGOTS.add(i.getUnlocalizedName());
					return true;
				}
			}
		}
		return OREDICT_INGOTS.contains(i.getUnlocalizedName());
	}
}
