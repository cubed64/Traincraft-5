/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import train.common.inventory.TrainCraftingManager;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;
import train.common.library.TrackItemIDs;
import train.common.recipes.ITCRecipe.RecipesArmorDyes;

import java.util.ArrayList;
import java.util.List;

import static train.common.recipes.AssemblyTableRecipes.waterContainers;

public class RecipeHandler {

	private static ArrayList<ItemStack> multiNameOreDict(String ... names){
		ArrayList<ItemStack> entries = new ArrayList<ItemStack>();
		for (String name : names){
			entries.addAll(OreDictionary.getOres(name));
		}
		return entries;
	}

	public static void initBlockRecipes() {//crafting table recipes
		ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");
		ArrayList<ItemStack> gold = OreDictionary.getOres("ingotGold");

		TrainCraftingManager.instance.getRecipeList().add(new RecipesArmorDyes());
		/* Assembly tables */
		for (ItemStack ironingot : iron) {
			GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableI.block, 1), "IPI", "S S", "SPS", Character.valueOf('I'), ironingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('S'), Blocks.stone);
		}
		for (ItemStack goldingot : gold) {
			GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableII.block, 1), "GPG", "O O", "OPO", 'G', goldingot, 'P', Blocks.piston, 'O', Blocks.obsidian);
			GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableIII.block, 1), "GPG", "DLD", "OPO", 'G', goldingot, 'P', Blocks.piston, 'D', Items.diamond, 'L', Blocks.glowstone, 'O', Blocks.obsidian);
		}
		if (!ConfigHandler.DISABLE_TRAIN_WORKBENCH) {
			for (ItemStack ironingot : iron) {
				addDictRecipe(new ItemStack(BlockIDs.trainWorkbench.block, 1), "###", "IFI", "###", Character.valueOf('#'), "plankWood", Character.valueOf('F'), Blocks.furnace, Character.valueOf('I'), ironingot);
			}
		}
		addDictRecipe(new ItemStack(BlockIDs.distilIdle.block, 1),  "###", "#F#", "###", Character.valueOf('#'), "ingotSteel", Character.valueOf('F'), ItemIDs.firebox.item );
		addDictRecipe(new ItemStack(ItemIDs.padlock.item, 1), "L#L", "#L#", "#G#", Character.valueOf('#'), Items.iron_ingot, Character.valueOf('G'), Items.gold_nugget);
		/* Open Hearth Furnace */
		if (!ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN) {
			GameRegistry.addRecipe(new ItemStack(BlockIDs.openFurnaceIdle.block, 1), "#L#", "#B#", "#I#",
					Character.valueOf('#'), Blocks.nether_brick, Character.valueOf('L'), Items.lava_bucket,
					Character.valueOf('B'), Items.bucket, Character.valueOf('I'), Blocks.iron_block);
		}

		/* Lantern */
		for (ItemStack ironingot : iron) {
			GameRegistry.addRecipe(new ItemStack(BlockIDs.lantern.block, 4), "III", "PTP", "III", Character.valueOf('I'), ironingot, Character.valueOf('P'), Blocks.glass_pane, Character.valueOf('T'), Blocks.torch);
		}
		
		/* Clothes */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.overalls.item, 1),  " # ", "X$X", "X$X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_leggings, Character.valueOf('#'), new ItemStack(Items.dye, 1, 1) );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket.item, 1),  "X X", "X$X", "X#X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 14), Character.valueOf('$'), Items.leather_chestplate, Character.valueOf('#'), Items.string );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat.item, 1),  " X ", "X$X", "#X#", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_helmet, Character.valueOf('#'), Items.string );

		/* Driver Clothes*/
		GameRegistry.addRecipe(new ItemStack(ItemIDs.pants_driver_paintable.item, 1),  "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1),  "X X", "XRX", "XPX", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('P'), Items.leather_chestplate,Character.valueOf('R'),  new ItemStack(Items.dye, 1, 1) );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat_driver_paintable.item, 1), "#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('#'), Items.string );
		
		/* Ticket Man Clothes */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.pants_ticketMan_paintable.item, 1),  "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 8), Character.valueOf('X'), Items.string);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket_ticketMan_paintable.item, 1),  "X X", "XPX", "X#X", Character.valueOf('P'), Items.leather_chestplate, Character.valueOf('#'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat_ticketMan_paintable.item, 1), "#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 0), Character.valueOf('#'), Items.string );

		//vanilla track to tc track Recipe but not train workbench
		GameRegistry.addShapelessRecipe(new ItemStack(TrackItemIDs.tcRailSmallStraight.item, 1), new ItemStack (Blocks.rail, 1));

		/* New Track Recipes */
		//trying to make recipes space economic
		//(it costs how many tiles of track it is, eg a 10x10 turn costs 10 rails because it takes up ~10 blocks of space if you think about it)

		//straights regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallStraight.item, 16),  "G G", "GPG", "G G", 'G', Items.iron_ingot, 'P', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumStraight.item, 1),  "G  ", "G  ", "G  ", 'G', TrackItemIDs.tcRailSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLongStraight.item, 1),  "G  ", "G  ", "   ", 'G', TrackItemIDs.tcRailMediumStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLongStraight.item, 1),  "G  ", "G  ", "   ", 'G', TrackItemIDs.tcRailLongStraight.item);
		GameRegistry.addShapelessRecipe(new ItemStack(TrackItemIDs.tcRailSmallStraight.item, 1), TrackItemIDs.tcRail1X1Turn.item);//convert 1x1 turn back to straight

		//90 turns regular
		GameRegistry.addShapelessRecipe(new ItemStack(TrackItemIDs.tcRail1X1Turn.item, 1), TrackItemIDs.tcRailSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumTurn.item, 1),  "GG ", "G  ", "   ", 'G', TrackItemIDs.tcRailSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeTurn.item, 1),  " GG", "GG ", "G  ", 'G', TrackItemIDs.tcRailSmallStraight.item);
		//GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeTurn.item, 1), "SS ","S  ","   ", 'S', TrackItemIDs.tcRailMediumTurn.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeTurn.item, 1), " S ","S  ","   ", 'S', TrackItemIDs.tcRailLargeTurn.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSuperLargeTurn.item, 1), " TS","T  ","S  ",'T', TrackItemIDs.tcRailLargeTurn.item, 'S', TrackItemIDs.tcRailMediumTurn.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail29X29Turn.item,1 ), "AT ","TB ","   ",'T', TrackItemIDs.tcRailVeryLargeTurn.item, 'A', TrackItemIDs.tcRailLargeTurn.item, 'B', TrackItemIDs.tcRailSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail32X32Turn.item,1), " S ","S  ","   ", 'S', TrackItemIDs.tcRailSuperLargeTurn.item);

		//45 turns regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailMedium45DegreeTurn.item,1), "S  "," S "," S ", 'S', TrackItemIDs.tcRailSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLarge45DegreeTurn.item,1), "SS "," S "," M ", 'S', TrackItemIDs.tcRailSmallStraight.item, 'M', TrackItemIDs.tcRailMediumStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLarge45DegreeTurn.item,1), "MS "," S "," M ", 'S', TrackItemIDs.tcRailSmallStraight.item, 'M', TrackItemIDs.tcRailMediumStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSuperLarge45DegreeTurn.item,1), "SS "," M ","  L", 'S', TrackItemIDs.tcRailSmallStraight.item, 'M', TrackItemIDs.tcRailMediumStraight.item, 'L', TrackItemIDs.tcRailLongStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail45DegreeTurn9x20.item,1), "SS "," L ","  V", 'S', TrackItemIDs.tcRailSmallStraight.item, 'V', TrackItemIDs.tcRailVeryLongStraight.item, 'L', TrackItemIDs.tcRailLongStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail45DegreeTurn10x22.item,1), "SM "," L ","  V", 'S', TrackItemIDs.tcRailSmallStraight.item, 'V', TrackItemIDs.tcRailVeryLongStraight.item, 'L', TrackItemIDs.tcRailLongStraight.item, 'M', TrackItemIDs.tcRailMediumStraight.item);

		//s curves (parallel curves) regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallParallelCurve.item,1), "MS ", " SM", "   ", 'S', TrackItemIDs.tcRailSmallStraight.item, 'M', TrackItemIDs.tcRailMediumStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumParallelCurve.item,1), "MM ", " MM", "   ", 'M', TrackItemIDs.tcRailMediumStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeParallelCurve.item,1), "LM ", " SL", "   ", 'S', TrackItemIDs.tcRailSmallStraight.item, 'M', TrackItemIDs.tcRailMediumStraight.item, 'L', TrackItemIDs.tcRailLongStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail20x2SCurve.item,1), "LS ", " L ", " SL", 'S', TrackItemIDs.tcRailSmallStraight.item, 'L', TrackItemIDs.tcRailLongStraight.item);

		//90 switches regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumSwitch.item, 1),  "G  ", "GHG", "G  ", 'G', TrackItemIDs.tcRailSmallStraight.item, 'H', TrackItemIDs.tcRailMediumTurn.item );
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSwitch.item, 1),  "G  ", "HIG", "G  ", 'G', TrackItemIDs.tcRailSmallStraight.item, 'H', TrackItemIDs.tcRailMediumStraight.item, 'I', TrackItemIDs.tcRailLargeTurn.item );
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSwitch.item, 1),  "G  ", "HI ", "G  ", 'G', TrackItemIDs.tcRailSmallStraight.item, 'H', TrackItemIDs.tcRailLongStraight.item, 'I', TrackItemIDs.tcRailVeryLargeTurn.item );

		//parallel switches regulah
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumParallelSwitch.item, 1),  "I G", "IHH", "IH ", 'G', TrackItemIDs.tcRailSmallStraight.item, 'H', TrackItemIDs.tcRailMediumTurn.item, 'I', TrackItemIDs.tcRailMediumStraight.item );
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeParallelSwitch.item, 1),  "L M", "MSC", "LC ", 'L', TrackItemIDs.tcRailLongStraight.item, 'C', TrackItemIDs.tcRailMediumTurn.item, 'M', TrackItemIDs.tcRailMediumStraight.item, 'S', TrackItemIDs.tcRailLargeTurn.item);

		//45 switches regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailMedium45DegreeSwitch.item,1), "SS ","SS ","S  ", 'S', TrackItemIDs.tcRailSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLarge45DegreeSwitch.item,1), "MM ","SS ","M  ", 'S', TrackItemIDs.tcRailSmallStraight.item, 'M', TrackItemIDs.tcRailMediumStraight.item);

		//crossover switch regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailCrossoverSwitch10x2.item,1), "MM ","MM ","M  ",'M', TrackItemIDs.tcRailMediumStraight.item);

		//diamond crossings
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailTwoWaysCrossing.item,1), " S ","SSS"," S ",'S', TrackItemIDs.tcRailSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailDiamondCrossing.item,1), "SS "," S "," SS",'S', TrackItemIDs.tcRailSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailDoubleDiamondCrossing.item,1), "S S"," M ","S S",'S', TrackItemIDs.tcRailSmallStraight.item, 'M', TrackItemIDs.tcRailMediumStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailFourWaysCrossing.item,1), "   ","SDS","   ",'S', TrackItemIDs.tcRailSmallStraight.item, 'D', TrackItemIDs.tcRailDoubleDiamondCrossing.item);

		//gravel slopes regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeGravel.item, 1), " TG","TGG","GGG", 'T', TrackItemIDs.tcRailMediumStraight.item, 'G', Blocks.gravel);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeGravel.item,1), "   ","  S"," S ", 'S', TrackItemIDs.tcRailSlopeGravel.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeGravel.item,1), "   ","  M"," S ", 'S', TrackItemIDs.tcRailLargeSlopeGravel.item, 'M', TrackItemIDs.tcRailSlopeGravel.item);

		//peagravel slopes regular
		//todo can we get foxblocks peagravel "traditional" recipes for these as well? if foxblocks mounted use fb peagravel else use these
		GameRegistry.addShapelessRecipe(new ItemStack(TrackItemIDs.tcRailSlopePeaGravel.item, 2), TrackItemIDs.tcRailSlopeGravel.item, TrackItemIDs.tcRailSlopeGravel.item);
		GameRegistry.addShapelessRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopePeaGravel.item, 2), TrackItemIDs.tcRailLargeSlopeGravel.item, TrackItemIDs.tcRailLargeSlopeGravel.item);
		GameRegistry.addShapelessRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopePeaGravel.item, 2), TrackItemIDs.tcRailVeryLargeSlopeGravel.item, TrackItemIDs.tcRailVeryLargeSlopeGravel.item);

		//snow gravel slopes regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeSnowGravel.item, 1), " TS","TSS","SSS", 'T', TrackItemIDs.tcRailMediumStraight.item, 'S', new ItemStack(BlockIDs.oreTC.block, 1,4));
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeSnowGravel.item, 1), "   ","  T"," T ", 'T', TrackItemIDs.tcRailSlopeSnowGravel.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeSnowGravel.item, 1), "   ","  M"," T ", 'T', TrackItemIDs.tcRailLargeSlopeSnowGravel.item, 'M', TrackItemIDs.tcRailSlopeSnowGravel.item);

		//ballast slopes regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeBallast.item, 1), " TS","TSS","SSS", 'T', TrackItemIDs.tcRailMediumStraight.item, 'S', new ItemStack(BlockIDs.oreTC.block, 1,3));
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeBallast.item, 1), "   ","  T"," T ", 'T', TrackItemIDs.tcRailSlopeBallast.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeBallast.item, 1), "   ","  M"," T ", 'T', TrackItemIDs.tcRailLargeSlopeBallast.item, 'M', TrackItemIDs.tcRailSlopeBallast.item);

		//wood slopes regular
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeWood.item, 1), " TG","TGG","GGG", 'T', TrackItemIDs.tcRailMediumStraight.item, 'G', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeWood.item,1), "   ","  S"," S ", 'S', TrackItemIDs.tcRailSlopeWood.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeWood.item,1), "   ","  M"," S ", 'S', TrackItemIDs.tcRailLargeSlopeWood.item, 'M', TrackItemIDs.tcRailSlopeWood.item);

		//dynamic slopes regulah
		//todo have clay be the fallback recipe if foxblocks isnt present, switch to rainbonite in foxblocks if present
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRail1X3SlopeDynamic.item,1), "  T"," TD","TDD", 'T', TrackItemIDs.tcRailSmallStraight.item, 'D', Items.clay_ball);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeDynamic.item, 1), "   ", "  T", " T ", 'T', TrackItemIDs.tcRail1X3SlopeDynamic.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeDynamic.item, 1), "   ", "  T", " T ", 'T', TrackItemIDs.tcRailSlopeDynamic.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeDynamic.item, 1), "   ", "  S", " T ", 'T', TrackItemIDs.tcRailLargeSlopeDynamic.item, 'S', TrackItemIDs.tcRailSlopeDynamic.item);

		//railroad crossings
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing.item, 8), "TTT", "TBT", "TTT", 'T', TrackItemIDs.tcRailSmallStraight.item, 'B', new ItemStack(Blocks.stained_hardened_clay, 1, 15));
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing1.item, 8), "TTT", "TBT", "TTT", 'T', TrackItemIDs.tcRailSmallStraight.item, 'B', new ItemStack(Blocks.stained_hardened_clay, 1, 7));
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing2.item, 8), "TTT", "TBT", "TTT", 'T', TrackItemIDs.tcRailSmallStraight.item, 'B', new ItemStack(Blocks.stained_hardened_clay, 1, 8));

		//buffers
		GameRegistry.addRecipe(new ItemStack(BlockIDs.stopper.block, 1), "PPP", "I I", " T ", 'P', Blocks.planks, 'I', Items.iron_ingot, 'T', TrackItemIDs.tcRailSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.americanstopper.block, 1), "III", "I I", " T ", 'I', Items.iron_ingot, 'T', TrackItemIDs.tcRailSmallStraight.item);



		//straights sleeperless
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedSmallStraight.item, 16),  "G G", "GPG", "G G", 'G', Items.iron_ingot, 'P', Items.clay_ball);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedMediumStraight.item, 1),  "G  ", "G  ", "G  ", 'G', TrackItemIDs.tcRailEmbeddedSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedLongStraight.item, 1),  "G  ", "G  ", "   ", 'G', TrackItemIDs.tcRailEmbeddedMediumStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedVeryLongStraight.item, 1),  "G  ", "G  ", "   ", 'G', TrackItemIDs.tcRailEmbeddedLongStraight.item);
		GameRegistry.addShapelessRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedSmallStraight.item, 1), TrackItemIDs.tcRailEmbedded1X1Turn.item);//convert 1x1 turn back to straight

		//90 turns sleeperless
		GameRegistry.addShapelessRecipe(new ItemStack(TrackItemIDs.tcRailEmbedded1X1Turn.item, 1), TrackItemIDs.tcRailEmbeddedSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedMediumTurn.item, 1),  "GG ", "G  ", "   ", 'G', TrackItemIDs.tcRailEmbeddedSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedLargeTurn.item, 1),  " GG", "GG ", "G  ", 'G', TrackItemIDs.tcRailEmbeddedSmallStraight.item);
		//GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedVeryLargeTurn.item, 1), "SS ","S  ","   ", 'S', TrackItemIDs.tcRailEmbeddedMediumTurn.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedVeryLargeTurn.item, 1), " S ","S  ","   ", 'S', TrackItemIDs.tcRailEmbeddedLargeTurn.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedSuperLargeTurn.item, 1), " TS","T  ","S  ",'T', TrackItemIDs.tcRailEmbeddedLargeTurn.item, 'S', TrackItemIDs.tcRailEmbeddedMediumTurn.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbedded29X29Turn.item,1 ), "AT ","TB ","   ",'T', TrackItemIDs.tcRailEmbeddedVeryLargeTurn.item, 'A', TrackItemIDs.tcRailEmbeddedLargeTurn.item, 'B', TrackItemIDs.tcRailEmbeddedSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbedded32X32Turn.item,1), " S ","S  ","   ", 'S', TrackItemIDs.tcRailEmbeddedSuperLargeTurn.item);

		//45 turns sleeperless
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedMedium45DegreeTurn.item,1), "S  "," S "," S ", 'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedLarge45DegreeTurn.item,1), "SS "," S "," M ", 'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'M', TrackItemIDs.tcRailEmbeddedMediumStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedVeryLarge45DegreeTurn.item,1), "MS "," S "," M ", 'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'M', TrackItemIDs.tcRailEmbeddedMediumStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedSuperLarge45DegreeTurn.item,1), "SS "," M ","  L", 'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'M', TrackItemIDs.tcRailEmbeddedMediumStraight.item, 'L', TrackItemIDs.tcRailEmbeddedLongStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbedded45DegreeTurn9x20.item,1), "SS "," L ","  V", 'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'V', TrackItemIDs.tcRailEmbeddedVeryLongStraight.item, 'L', TrackItemIDs.tcRailEmbeddedLongStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbedded45DegreeTurn10x22.item,1), "SM "," L ","  V", 'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'V', TrackItemIDs.tcRailEmbeddedVeryLongStraight.item, 'L', TrackItemIDs.tcRailEmbeddedLongStraight.item, 'M', TrackItemIDs.tcRailEmbeddedMediumStraight.item);

		//s curves (parallel curves) sleeperless
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedSmallParallelCurve.item,1), "MS ", " SM", "   ", 'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'M', TrackItemIDs.tcRailEmbeddedMediumStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedMediumParallelCurve.item,1), "MM ", " MM", "   ", 'M', TrackItemIDs.tcRailEmbeddedMediumStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedLargeParallelCurve.item,1), "LM ", " SL", "   ", 'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'M', TrackItemIDs.tcRailEmbeddedMediumStraight.item, 'L', TrackItemIDs.tcRailEmbeddedLongStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbedded20x2SCurve.item,1), "LS ", " L ", " SL", 'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'L', TrackItemIDs.tcRailEmbeddedLongStraight.item);

		//90 switches sleeperless
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedMediumSwitch.item, 1),  "G  ", "GHG", "G  ", 'G', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'H', TrackItemIDs.tcRailEmbeddedMediumTurn.item );
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedLargeSwitch.item, 1),  "G  ", "HIG", "G  ", 'G', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'H', TrackItemIDs.tcRailEmbeddedMediumStraight.item, 'I', TrackItemIDs.tcRailEmbeddedLargeTurn.item );
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedVeryLargeSwitch.item, 1),  "G  ", "HI ", "G  ", 'G', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'H', TrackItemIDs.tcRailEmbeddedLongStraight.item, 'I', TrackItemIDs.tcRailEmbeddedVeryLargeTurn.item );

		//parallel switches regulah
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedMediumParallelSwitch.item, 1),  "I G", "IHH", "IH ", 'G', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'H', TrackItemIDs.tcRailEmbeddedMediumTurn.item, 'I', TrackItemIDs.tcRailEmbeddedMediumStraight.item );
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedLargeParallelSwitch.item, 1),  "L M", "MSC", "LC ", 'L', TrackItemIDs.tcRailEmbeddedLongStraight.item, 'C', TrackItemIDs.tcRailEmbeddedMediumTurn.item, 'M', TrackItemIDs.tcRailEmbeddedMediumStraight.item, 'S', TrackItemIDs.tcRailEmbeddedLargeTurn.item);

		//45 switches sleeperless
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedMedium45DegreeSwitch.item,1), "SS ","SS ","S  ", 'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedLarge45DegreeSwitch.item,1), "MM ","SS ","M  ", 'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'M', TrackItemIDs.tcRailEmbeddedMediumStraight.item);

		//crossover switch sleeperless
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedCrossoverSwitch10x2.item,1), "MM ","MM ","M  ",'M', TrackItemIDs.tcRailEmbeddedMediumStraight.item);

		//diamond crossings sleeperless
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedTwoWaysCrossing.item,1), " S ","SSS"," S ",'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedDiamondCrossing.item,1), "SS "," S "," SS",'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedDoubleDiamondCrossing.item,1), "S S"," M ","S S",'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'M', TrackItemIDs.tcRailEmbeddedMediumStraight.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedFourWaysCrossing.item,1), "   ","SDS","   ",'S', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'D', TrackItemIDs.tcRailEmbeddedDoubleDiamondCrossing.item);

		//dynamic slopes sleeperless
		//todo have clay be the fallback recipe if foxblocks isnt present, switch to rainbonite in foxblocks if present
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbedded1x3SlopeDynamic.item,1), "  T"," TD","TDD", 'T', TrackItemIDs.tcRailEmbeddedSmallStraight.item, 'D', Items.clay_ball);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedSlopeDynamic.item, 1), "   ", "  T", " T ", 'T', TrackItemIDs.tcRailEmbedded1x3SlopeDynamic.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedLargeSlopeDynamic.item, 1), "   ", "  T", " T ", 'T', TrackItemIDs.tcRailEmbeddedSlopeDynamic.item);
		GameRegistry.addRecipe(new ItemStack(TrackItemIDs.tcRailEmbeddedVeryLargeSlopeDynamic.item, 1), "   ", "  S", " T ", 'T', TrackItemIDs.tcRailEmbeddedLargeSlopeDynamic.item, 'S', TrackItemIDs.tcRailEmbeddedSlopeDynamic.item);



		//paintbrush
		GameRegistry.addRecipe(new ItemStack(ItemIDs.paintbrushThing.item,1),"GB ","RIS"," ST", Character.valueOf('G'), new ItemStack(Items.dye,1,2), Character.valueOf('B'), new ItemStack(Items.dye,1,4), Character.valueOf('R'), new ItemStack(Items.dye,1,1), Character.valueOf('I'), new ItemStack(Items.iron_ingot), Character.valueOf('S'), new ItemStack(Items.string), Character.valueOf('T'), new ItemStack(Items.stick));

		//GameRegistry.addRecipe(new ItemStack(ItemIDs.creditsBook.item,1),"   "," B ","   ", Character.valueOf('B'), ItemIDs.recipeBook.item );

		//switch stands
		GameRegistry.addRecipe(new ItemStack(BlockIDs.owoYardSwitchStand.block,1), "   ","OS ","IW ", Character.valueOf('O'), new ItemStack(Items.dye, 1, 14), Character.valueOf('S'), Items.stick, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.owoSwitchStand.block, 1), " O "," S ", " IW", Character.valueOf('O'), new ItemStack(Items.dye, 1, 14), Character.valueOf('S'), Items.stick, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.circleSwitchStand.block, 1), " R ", " S ", " IW", Character.valueOf('R'), new ItemStack(Items.dye, 1, 1), Character.valueOf('S'), Items.stick, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.autoSwtichStand.block, 1), "   ","C  ","IIW", Character.valueOf('C'), new ItemStack(ItemIDs.electronicCircuit.item,1), Character.valueOf('S'), Items.stick, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.Racor36D_1.block,1), "   ","OS ","IW ", 'O', new ItemStack(Items.dye, 1, 2), 'S', Items.stick, 'I', Items.iron_ingot, 'W', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.Racor36D_2.block,1), "   ","OS ","IW ", 'O', new ItemStack(Items.dye, 1, 15), 'S', Items.stick, 'I', Items.iron_ingot, 'W', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.Racor36H.block,1), " O "," S ","IW ", 'O', new ItemStack(Items.dye, 1, 1), 'S', Items.stick, 'I', Items.iron_ingot, 'W', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.Racor36H_2.block,1), " O "," S ","IW ", 'O', new ItemStack(Items.dye, 1, 2), 'S', Items.stick, 'I', Items.iron_ingot, 'W', Blocks.planks);

		/* Recipe book */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.recipeBook.item, 1),  "TTT", "TBT", "TTT", Character.valueOf('T'), Blocks.rail, Character.valueOf('B'), Items.book );

		for (ItemStack ironingot : iron) {
			addDictRecipe(new ItemStack(BlockIDs.switchStand.block, 1), " W ", " I ", " R ", Character.valueOf('W'), Blocks.lever, Character.valueOf('R'), Items.stick, Character.valueOf('I'), ironingot);
			addDictRecipe(new ItemStack(BlockIDs.MILWSwitchStand.block, 1)," RW","BWR","AAA", Character.valueOf('A'), new ItemStack(Items.stick), Character.valueOf('B'), Blocks.iron_bars, Character.valueOf('R'), new ItemStack(Items.dye, 1, 1), Character.valueOf('W'), new ItemStack(Items.dye, 1, 15));
			/*Buffer*/
			//addDictRecipe(new ItemStack(BlockIDs.stopper.block, 1), "WWW", "I I", "RRR", Character.valueOf('W'), "plankWood", Character.valueOf('R'), Blocks.rail, Character.valueOf('I'), ironingot);
		}
		
		GameRegistry.addRecipe(new ItemStack(BlockIDs.oreTC.block, 2,3),  "GXG", Character.valueOf('G'), Blocks.gravel, Character.valueOf('X'), Items.clay_ball);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.oreTC.block, 2, 4), "GXG", Character.valueOf('G'), Blocks.gravel, Character.valueOf('X'), Items.snowball);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.oreTC.block, 8, 4), "XGG","GGG","GGG", Character.valueOf('G'), Blocks.gravel, Character.valueOf('X'), Blocks.snow);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.oreTC.block, 8, 3), "XGG","GGG","GGG", Character.valueOf('G'), Blocks.gravel, Character.valueOf('X'), Blocks.clay);

	}

	public static void initItemRecipes() {//train wb recipes

		ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");//doesnt work with mekanism steel
		ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");
		ArrayList<ItemStack> planks = OreDictionary.getOres("plankWood");
		ArrayList<ItemStack> logs = OreDictionary.getOres("logWood");
		ArrayList<ItemStack> plastics	= multiNameOreDict("itemPlastic", "dustPlastic");//dustPlastic for MFR support
		ArrayList<ItemStack> copper = OreDictionary.getOres("ingotCopper");
		ArrayList<ItemStack> dustCoal = OreDictionary.getOres("dustCoal");
		List<ItemStack> coal = new ArrayList<ItemStack>();
		coal.add(new ItemStack(Items.coal));
		coal.addAll(OreDictionary.getOres("coal"));
		ArrayList<ItemStack> redstone = OreDictionary.getOres("dustRedstone");
		ArrayList<ItemStack> waterbucket = waterContainers();

		ArrayList<ItemStack> dyeRed = OreDictionary.getOres("dyeRed");
		ArrayList<ItemStack> dyeYellow = OreDictionary.getOres("dyeYellow");
		ArrayList<ItemStack> dyeOrange = OreDictionary.getOres("dyeOrange");
		ArrayList<ItemStack> dyeGreen = OreDictionary.getOres("dyeGreen");
		ArrayList<ItemStack> dyeBlue = OreDictionary.getOres("dyeBlue");
		ArrayList<ItemStack> dyeBrown = OreDictionary.getOres("dyeBrown");
		ArrayList<ItemStack> dyeGray = OreDictionary.getOres("dyeGray");
		ArrayList<ItemStack> dyeLightGray = OreDictionary.getOres("dyeLightGray");
		ArrayList<ItemStack> dyeBlack = OreDictionary.getOres("dyeBlack");
		ArrayList<ItemStack> dyeWhite = OreDictionary.getOres("dyeWhite");
		ArrayList<ItemStack> dyeMagenta = OreDictionary.getOres("dyeMagenta");
		ArrayList<ItemStack> dyeLime = OreDictionary.getOres("dyeLime");
		ArrayList<ItemStack> dyeLightBlue = OreDictionary.getOres("dyeLightBlue");
		ArrayList<ItemStack> dyePurple = OreDictionary.getOres("dyePurple");
		ArrayList<ItemStack> dyePink = OreDictionary.getOres("dyePink");
		ArrayList<ItemStack> dyeCyan = OreDictionary.getOres("dyeCyan");

		// Always do this " X " instead of this "X", and do not put "" empty brackets

		/* I placed it here because workbench should be one of the first recipe shown in the recipe book */
		for (ItemStack plank : planks) {
			for (ItemStack ironingot : iron) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.trainWorkbench.block, 1), "###", "IFI", "###", Character.valueOf('#'), plank, Character.valueOf('F'), Blocks.furnace, Character.valueOf('I'), ironingot);
			}
		}
		
		/* Recipe book */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.recipeBook.item, 1),  "TTT", "TBT", "TTT", Character.valueOf('T'), Blocks.rail, Character.valueOf('B'), Items.book );

		/* Chunk Loader Activator */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.chunkLoaderActivator.item, 1),  "  P", " S ", "S  ", Character.valueOf('S'), Items.blaze_rod, Character.valueOf('P'), Items.ender_pearl );

		/* Assembly tables */

		for (ItemStack ironingot : iron) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableI.block, 1), "IPI", "S S", "SPS", Character.valueOf('I'), ironingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('S'), Blocks.stone);
		}
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableII.block, 1),  "GPG", "O O", "OPO", Character.valueOf('G'), Items.gold_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('O'), Blocks.obsidian );
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableIII.block, 1),  "GPG", "DLD", "OPO", Character.valueOf('G'), Items.gold_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('D'), Items.diamond, Character.valueOf('L'), Blocks.glowstone, Character.valueOf('O'), Blocks.obsidian );

		/* Open Hearth Furnace */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.openFurnaceIdle.block, 1),  "#L#", "#B#", "#I#", Character.valueOf('#'), Blocks.nether_brick, Character.valueOf('L'), Items.lava_bucket, Character.valueOf('B'), Items.bucket, Character.valueOf('I'), Blocks.iron_block );

		/* Lantern */
		for (ItemStack ironingot : iron) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.lantern.block, 4), "III", "PTP", "III", Character.valueOf('I'), ironingot, Character.valueOf('P'), Blocks.glass_pane, Character.valueOf('T'), Blocks.torch);
		}
		/* Clothes */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.overalls.item, 1),  " # ", "X$X", "X X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_leggings, Character.valueOf('#'), new ItemStack(Items.dye, 1, 1) );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket.item, 1),  "X X", "X$X", "X#X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 14), Character.valueOf('$'), Items.leather_chestplate, Character.valueOf('#'), Items.string );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat.item, 1),  " X ", "X$X", "#X#", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_helmet, Character.valueOf('#'), Items.string );
		
		/* Driver Clothes*/
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_driver_paintable.item, 1),  "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1),  "X X", "XRX", "XPX", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('P'), Items.leather_chestplate,Character.valueOf('R'),  new ItemStack(Items.dye, 1, 1) );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat_driver_paintable.item, 1), "#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('#'), Items.string );
		
		/* Ticket Man Clothes */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_ticketMan_paintable.item, 1),  "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 8), Character.valueOf('X'), Items.string);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_ticketMan_paintable.item, 1),  "X X", "XPX", "X#X", Character.valueOf('P'), Items.leather_chestplate, Character.valueOf('#'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat_ticketMan_paintable.item, 1), "#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 0), Character.valueOf('#'), Items.string );
		
		

		if (plastics != null && plastics.size() >= 0) {
			for (ItemStack plastic : plastics) {
				/* Empty canister */
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.emptyCanister.item, 8),  "PPP", "P P", "PPP", Character.valueOf('P'), plastic);
				for (ItemStack rs :redstone) {
					/* Electronic circuit */
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.electronicCircuit.item, 1), "XXX", "RPR", "XXX", Character.valueOf('X'), ItemIDs.copperWireFine.item, Character.valueOf('P'), plastic, Character.valueOf('R'), rs.getItem());
				}
				/* Composite Material*/
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.reinforcedPlastic.item, 16),  "LPL", "PLP", "GPG", Character.valueOf('G'), Blocks.glass_pane, Character.valueOf('P'), ItemIDs.graphite.item, Character.valueOf('L'), plastic);
				
				if (copper != null && copper.size() >= 0) {
					for (ItemStack copp : copper) {
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.copperWireFine.item, 6),  "XXX", "XPX", "XXX", Character.valueOf('X'), copp, Character.valueOf('P'), plastic );
					}
				}	
			}
		}
		
		/* Composite Suit */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boots_suit_paintable.item, 1), " D ","X X", "XFX", Character.valueOf('F'), Items.feather, Character.valueOf('D'), Items.diamond, Character.valueOf('X'), ItemIDs.reinforcedPlates.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_suit_paintable.item, 1),  "XDX", "X$X", "X X", Character.valueOf('$'), Items.fire_charge, Character.valueOf('X'), ItemIDs.reinforcedPlates.item,Character.valueOf('D'), Items.diamond);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_suit_paintable.item, 1),  "X X", "XDX", "XAX", Character.valueOf('A'), Items.golden_apple, Character.valueOf('X'), ItemIDs.reinforcedPlates.item,Character.valueOf('D'), Blocks.diamond_block);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.helmet_suit_paintable.item, 1), "#D#", "# #", Character.valueOf('D'), Blocks.diamond_block, Character.valueOf('#'), ItemIDs.reinforcedPlates.item );

		/* Trains parts */

		for (ItemStack ironingot : iron) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.generator.item, 2), " ##", "E$$", " ##", Character.valueOf('#'), ItemIDs.copperWireFine.item, Character.valueOf('E'), ItemIDs.electronicCircuit.item, Character.valueOf('$'), ironingot);// generator
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.controls.item, 1), "#X#", "#E#", "$$$", Character.valueOf('#'), Blocks.lever, Character.valueOf('X'), Blocks.stone_button, Character.valueOf('$'), ironingot, Character.valueOf('E'), ItemIDs.electronicCircuit.item);// train controls
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.electmotor.item, 2), "I#I", "#E#", "I#I", Character.valueOf('#'), ItemIDs.copperWireFine.item, Character.valueOf('I'), ironingot, Character.valueOf('E'), ItemIDs.electronicCircuit.item);// Electric motor
			for (ItemStack bucketWater : waterbucket) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironBoiler.item, 2), "###", "XXX", "###", Character.valueOf('#'), ironingot, Character.valueOf('X'), bucketWater.getItem());// iron Boiler
			}
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFirebox.item, 2),  "###", "#X#", "###", Character.valueOf('#'), ironingot, Character.valueOf('X'), Items.flint_and_steel );// iron Firebox
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironChimney.item, 2),  "# #", "# #", "# #", Character.valueOf('#'), ironingot );
		}
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.dieselengine.item, 2), "###", "XXX", "CCC", Character.valueOf('#'), ItemIDs.piston.item, Character.valueOf('X'), ItemIDs.cylinder.item, Character.valueOf('C'), ItemIDs.camshaft.item);// diesel engine
		for (ItemStack dustStack : dustCoal) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.graphite.item, 2),  "###", "#X#", "###", Character.valueOf('#'), dustStack, Character.valueOf('X'), Items.clay_ball );// Graphite
		}
		
		if (!ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN) {
			for (ItemStack c : coal) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4),
						"###", "   ", "   ", Character.valueOf('#'), c.getItem());
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4),
						"   ", "###", "   ", Character.valueOf('#'), c.getItem());
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4),
						"   ", "   ", "###", Character.valueOf('#'), c.getItem());
			}
		}
		
		//TrainCraftingManager.instance.addShapelessRecipe(new ItemStack(ItemIDs.coaldust.item, 4),  c.getItem(), c.getItem(), c.getItem(), c.getItem() );// coal dust
		
		//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.signal.item, 2),  "#", "X", "X", Character.valueOf('X'), ItemIDs.steel.item, Character.valueOf('#'), rs );
		/* diesel generator */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.generatorDiesel.block, 1),  "C  ", "DE ", Character.valueOf('C'), ItemIDs.steelchimney.item, Character.valueOf('D'), ItemIDs.dieselengine.item, Character.valueOf('E'), ItemIDs.electronicCircuit.item );
		
		/* Zepplin parts and zeppelin item */
		if (ConfigHandler.ENABLE_ZEPPELIN) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.balloon.item, 1),  "###", "# #", "###", Character.valueOf('#'), Blocks.wool );// Balloon
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steamengine.item, 1),  "C  ", "BF ", Character.valueOf('C'), ItemIDs.steelchimney.item, Character.valueOf('B'), ItemIDs.boiler.item, Character.valueOf('F'), ItemIDs.firebox.item );// Small steam engine
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.airship.item, 1),  "B B", "SES", "POP", Character.valueOf('B'), ItemIDs.balloon.item, Character.valueOf('S'), Items.stick, Character.valueOf('E'), ItemIDs.steamengine.item, Character.valueOf('P'), ItemIDs.propeller.item, Character.valueOf('O'), Items.boat );
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.zeppelin.item, 1),  "BBB", "SES", "POP", Character.valueOf('B'), ItemIDs.balloon.item, Character.valueOf('S'), ItemIDs.propeller.item, Character.valueOf('E'), ItemIDs.controls.item, Character.valueOf('P'), ItemIDs.electmotor.item, Character.valueOf('O'), ItemIDs.seats.item );
		}

		for (ItemStack plankItem : planks) {
			for (ItemStack steelItem: steel) {

				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.reinforcedPlates.item, 1),  "RRR", "SSS", "CCC", Character.valueOf('R'), ItemIDs.reinforcedPlastic.item, Character.valueOf('S'), steelItem, Character.valueOf('C'), Items.clay_ball);

				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.composite_wrench.item, 1), "S S", " R "," R ", Character.valueOf('R'), ItemIDs.reinforcedPlastic.item, Character.valueOf('S'),steelItem );
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelcab.item, 2),  "###", "X X", "XXX", Character.valueOf('X'), steelItem, Character.valueOf('#'), plankItem );// Steel cab
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.distilIdle.block, 1),  "###", "#F#", "###", Character.valueOf('#'), steelItem, Character.valueOf('F'), ItemIDs.firebox.item );
				for (ItemStack rs :redstone) {
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.transformer.item, 1), "# #", "XEX", "###", Character.valueOf('#'), steelItem, Character.valueOf('E'), ItemIDs.electronicCircuit.item, Character.valueOf('X'), rs.getItem());// transformer
				}

				for (ItemStack bucketWater :waterbucket) {
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boiler.item, 2), "###", "XXX", "###", Character.valueOf('#'), steelItem, Character.valueOf('X'), bucketWater.getItem());// Boiler
				}
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.firebox.item, 2),  "###", "#X#", "###", Character.valueOf('#'), steelItem, Character.valueOf('X'), Items.flint_and_steel );// Firebox
				//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.firebox.item, 2),  "###", "#X#", "###", '#', new ItemStack(steelItem.getItem(), 1, OreDictionary.WILDCARD_VALUE), 'X', Items.flint_and_steel );// Firebox
				for (ItemStack ironingot : iron) {
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.bogie.item, 4), " # ", "#X#", " # ", Character.valueOf('#'), steelItem, Character.valueOf('X'), ironingot);// Bogie
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelframe.item, 2), "# #", "AAA", Character.valueOf('A'), steelItem, Character.valueOf('#'), ironingot);// Steel Frame
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelframe.item, 2), "   ", "# #", "AAA", Character.valueOf('A'), steelItem, Character.valueOf('#'), ironingot);// Steel Frame

					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1),  "   ", "IFI", "   ", Character.valueOf('I'), steelItem, Character.valueOf('F'), ironingot );
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1),  "IFI", "   ", "   ", Character.valueOf('I'), steelItem, Character.valueOf('F'), ironingot );
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1),  "   ", "   ", "IFI", Character.valueOf('I'), steelItem, Character.valueOf('F'), ironingot );

					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.propeller.item, 2),  " # ", "#X#", " # ", Character.valueOf('#'), plankItem, Character.valueOf('X'), ironingot );// Propeller
				}
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelchimney.item, 2),  "# #", "# #", "# #", Character.valueOf('#'), steelItem );// Bogie
				TrainCraftingManager.instance.addRecipe(new ItemStack(Items.flint_and_steel, 2),  "* ", " #", Character.valueOf('*'), steelItem, Character.valueOf('#'), Items.flint );


				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.transmition.item, 1),  " # ", "#X#", " # ", Character.valueOf('#'), steelItem, Character.valueOf('X'), ItemIDs.diesel.item );// transmition
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.piston.item, 3),  " # ", " X ", Character.valueOf('#'), steelItem, Character.valueOf('X'), Items.stick );// piston
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3),  "###", "   ", "   ", Character.valueOf('#'), steelItem );// camshaft
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3),  "   ", "###", "   ", Character.valueOf('#'), steelItem );// camshaft
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3),  "   ", "   ", "###", Character.valueOf('#'), steelItem );// camshaft
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.cylinder.item, 3),  "# #", "# #", "###", Character.valueOf('#'), steelItem );// cylinder

			}
			for (ItemStack ironItem : iron) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallStraight.item, 16), "I I", "IPI", "I I", Character.valueOf('P'), plankItem, Character.valueOf('I'), ironItem);// small straight track

				TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing.item, 16), "I I", "IPI", "I I", Character.valueOf('P'), new ItemStack(Blocks.stained_hardened_clay, 1, 15), Character.valueOf('I'), ironItem);
				TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing1.item, 16), "I I", "IPI", "I I", Character.valueOf('P'), new ItemStack(Blocks.stained_hardened_clay, 1, 7), Character.valueOf('I'), ironItem);
				TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing2.item, 16), "I I", "IPI", "I I", Character.valueOf('P'), new ItemStack(Blocks.stained_hardened_clay, 1, 8), Character.valueOf('I'), ironItem);
			}
			for (ItemStack logStack :logs) {
				/* Water Wheel */
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.waterWheel.block, 1),  " P ", "PGP", " P ", Character.valueOf('P'), logStack,Character.valueOf('G'), ItemIDs.generator.item);

				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenBogie.item, 4),  " # ", "#X#", " # ", Character.valueOf('#'), plankItem, Character.valueOf('X'), logStack );// wooden Bogie
			}
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenFrame.item, 2),  "# #", "AAA", Character.valueOf('A'), plankItem, Character.valueOf('#'), plankItem );// wooden Frame
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenFrame.item, 2),  "   ", "# #", "AAA", Character.valueOf('A'), plankItem, Character.valueOf('#'), plankItem );// wooden Frame
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenCab.item, 2),  "###", "X X", "XXX", Character.valueOf('X'), plankItem, Character.valueOf('#'), plankItem );// wooden cab

			for (ItemStack ironingot : iron) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.seats.item, 1), "#  ", "## ", "XXX", Character.valueOf('#'), plankItem, Character.valueOf('X'), ironingot);// transformer
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironBogie.item, 4), " # ", "#X#", " # ", Character.valueOf('#'), ironingot, Character.valueOf('X'), plankItem);// iron Bogie
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFrame.item, 2), "# #", "AAA", Character.valueOf('A'), ironingot, Character.valueOf('#'), plankItem);// iron Frame
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFrame.item, 2), "   ", "# #", "AAA", Character.valueOf('A'), ironingot, Character.valueOf('#'), plankItem);// iron Frame
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironCab.item, 2), "###", "X X", "XXX", Character.valueOf('X'), ironingot, Character.valueOf('#'), plankItem);// iron cab
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.stopper.block, 1), "WWW", "I I", "RRR", Character.valueOf('W'), plankItem, Character.valueOf('R'), Blocks.rail, Character.valueOf('I'), ironingot);// stopper
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.switchStand.block, 1), " W ", " I ", " R ", Character.valueOf('W'), Blocks.lever, Character.valueOf('R'), Items.stick, Character.valueOf('I'), ironingot);//switchstand
			}
			// Short Wood Slope
			TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeWood.item, 1),
					 " MW", "MWW", "WWW", Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item,
							Character.valueOf('W'), plankItem );
		}
				/* Wind mill */
		for (ItemStack ironingot : iron) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.windMill.block, 1), " R ", " G ", "B B", Character.valueOf('G'), ItemIDs.generator.item, Character.valueOf('B'), ironingot, Character.valueOf('R'), ItemIDs.propeller.item);

			if (Loader.isModLoaded("ComputerCraft") || Loader.isModLoaded("OpenComputers")) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcTransmitterSpeed.block, 1), "SRS", "RTR", "SRS", 'S', ironingot, 'R', Items.redstone, 'T', Blocks.stone_pressure_plate);
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcReceiverMTC.block, 1), "STS", " R ", "SPS", 'S', ironingot, 'R', Items.redstone, 'P', Items.repeater, 'T', new ItemStack(Blocks.torch, 1));
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcTransmitterMTC.block, 1), "SPS", " R ", "STS", 'S', ironingot, 'R', Items.redstone, 'P', Items.repeater, 'T', new ItemStack(Blocks.torch, 1));
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcReceiverDestination.block, 1), "SRS", "RTR", "SRS", 'S', ironingot, 'R', Items.redstone, 'T', Items.sign);
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcATOStopTransmitter.block, 1), " S ", "RTS", " R ", 'S', ironingot, 'R', Items.redstone, 'T', ItemIDs.electronicCircuit.item);
			}
		}

		/* passenger car parts */
		for (ItemStack steelItem: steel) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.fourWheelLightweightTruck.item, 2), "   ", "SFS", "W W", 'S', steelItem, 'F', new ItemStack(ItemIDs.steelframe.item), 'W', new ItemStack(ItemIDs.bogie.item)); // 4 wheel lightweight truck
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.fourWheelLightweightTruck.item, 2), "SFS", "W W", "   ", 'S', steelItem, 'F', new ItemStack(ItemIDs.steelframe.item), 'W', new ItemStack(ItemIDs.bogie.item)); // 4 wheel lightweight truck
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.fourWheelHeavyweightTruck.item, 2), "   ", "SSS", "W W", 'S', steelItem, 'W', new ItemStack(ItemIDs.bogie.item)); // 4 wheel heavyweight truck
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.fourWheelHeavyweightTruck.item, 2), "SSS", "W W", "   ", 'S', steelItem, 'W', new ItemStack(ItemIDs.bogie.item)); // 4 wheel heavyweight truck
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.sixWheelHeavyweightTruck.item, 2), "   ", "SSS", "WWW", 'S', steelItem, 'W', new ItemStack(ItemIDs.bogie.item)); // 6 wheel heavyweight truck
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.sixWheelHeavyweightTruck.item, 2), "SSS", "WWW", "   ", 'S', steelItem, 'W', new ItemStack(ItemIDs.bogie.item)); // 6 wheel heavyweight truck
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.passengerFluting.item, 4), "   ", " S ", "   ", 'S', steelItem); // passenger car fluting
		}
		/* interurban/streetcar parts */
		for (ItemStack steelItem: steel) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.trolleyPole.item, 2), "S  ", " SS", "   ", 'S', steelItem); //trolley pole
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.trolleyPole.item, 2), "   ", "S  ", " SS", 'S', steelItem); //trolley pole
			for (ItemStack plankItem : planks) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.thirdRailShoe.item, 4), "   ", "WWW", " S ", 'S', steelItem, 'W', plankItem); //third rail shoe
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.thirdRailShoe.item, 4), "WWW", " S ", "   ", 'S', steelItem, 'W', plankItem); //third rail shoe
			}
			for (ItemStack copperItem : copper){
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.interurbanTruck.item,1), "MCM", "SSS", "W W", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', copperItem); //interurban truck
			}
		}
		/* locomotive crafting parts NEW */
		for (ItemStack steelItem: steel) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partBlombergB.item,1), "MCM", "SSS", "W W", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentEMD.item));
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTypeB.item,1), "M M", "S S", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item));
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partFB2.item,1), "M M", "SCS", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentGE.item));



			//commented out till someone fixes not being able to use more than one recipe for an item
			//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTypeB.item,1), "MCM", "S S", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentGE.item));
			//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTypeB.item,1), "MCM", "S S", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentCEE.item));
			//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTypeB.item,1), "MCM", "S S", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentALCO.item));
			//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTypeB.item,1), "MCM", "S S", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentBLW.item));
			//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTypeB.item,1), "MCM", "S S", "WSW", 'W', new ItemStack(ItemIDs.bogie.item), 'S', steelItem, 'M', new ItemStack(ItemIDs.electmotor.item), 'C', new ItemStack(ItemIDs.partComponentFM.item));

			for (ItemStack ironingot : iron) {
				for (ItemStack copperingot : copper) {
					for (ItemStack dye : dyeBlue) {
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partComponentEMD.item, 6), "RDR", " C ", "PIP", 'P', new ItemStack(ItemIDs.rawPlastic.item), 'I', ironingot, 'C', copperingot, 'R', new ItemStack(ItemIDs.reinforcedPlastic.item), 'D', dye);
					}
					for (ItemStack dye : dyeLightBlue) {
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partComponentGE.item, 6), "RDR", " C ", "PIP", 'P', new ItemStack(ItemIDs.rawPlastic.item), 'I', ironingot, 'C', copperingot, 'R', new ItemStack(ItemIDs.reinforcedPlastic.item), 'D', dye);
					}
					for (ItemStack dye : dyeYellow) {
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partComponentALCO.item, 6), "RDR", " C ", "PIP", 'P', new ItemStack(ItemIDs.rawPlastic.item), 'I', ironingot, 'C', copperingot, 'R', new ItemStack(ItemIDs.reinforcedPlastic.item), 'D', dye);
					}
					for (ItemStack dye : dyeGray) {
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partComponentBLW.item, 6), "RDR", " C ", "PIP", 'P', new ItemStack(ItemIDs.rawPlastic.item), 'I', ironingot, 'C', copperingot, 'R', new ItemStack(ItemIDs.reinforcedPlastic.item), 'D', dye);
					}
					for (ItemStack dye : dyeBlack) {
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partComponentFM.item, 6), "RDR", " C ", "PIP", 'P', new ItemStack(ItemIDs.rawPlastic.item), 'I', ironingot, 'C', copperingot, 'R', new ItemStack(ItemIDs.reinforcedPlastic.item), 'D', dye);
					}
					for (ItemStack dye : dyeBrown) {
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partComponentCEE.item, 6), "RDR", " C ", "PIP", 'P', new ItemStack(ItemIDs.rawPlastic.item), 'I', ironingot, 'C', copperingot, 'R', new ItemStack(ItemIDs.reinforcedPlastic.item), 'D', dye);
					}
				}
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partAlternator.item, 2), "## ", "$$E", "## ", '$', ItemIDs.copperWireFine.item, 'E', ItemIDs.electronicCircuit.item, '#', ironingot);
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partTurboExhaust.item, 2), "S S", "S S", "SPS", 'S', steelItem, 'P', ItemIDs.piston.item);
            }
		}


		/* freightcar crafting parts NEW */




/*
		for (ItemStack s: iron) {

		}*/

		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallStraight.item, 1),  "   ", " R ", "   ", Character.valueOf('R'), Item.getItemFromBlock(Blocks.rail));// small straight track
		/*TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing.item, 1),  "   ", "SRS", "   ", Character.valueOf('S'), new ItemStack(Blocks.stained_hardened_clay, 1, 15), Character.valueOf('R'), Item.getItemFromBlock(Blocks.rail) );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing1.item, 1),  "   ", "SRS", "   ", Character.valueOf('S'), new ItemStack(Blocks.stained_hardened_clay, 1, 7), Character.valueOf('R'), Item.getItemFromBlock(Blocks.rail) );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSmallRoadCrossing2.item, 1),  "   ", "SRS", "   ", Character.valueOf('S'), new ItemStack(Blocks.stained_hardened_clay, 1, 3), Character.valueOf('R'), Item.getItemFromBlock(Blocks.rail) );*/
		TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1),  "   ", " R ", "   ", Character.valueOf('R'), TrackItemIDs.tcRailSmallStraight.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1),  "   ", " R ", "   ", Character.valueOf('R'), TrackItemIDs.tcRailSmallRoadCrossing.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1),  "   ", " R ", "   ", Character.valueOf('R'), TrackItemIDs.tcRailSmallRoadCrossing1.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1),  "   ", " R ", "   ", Character.valueOf('R'), TrackItemIDs.tcRailSmallRoadCrossing2.item);
		// Short Slope Gravel
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeGravel.item, 1),
				 " MG", "MGG", "GGG", Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item,
						Character.valueOf('G'), Blocks.gravel );
		// Short Slope Ballast
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeBallast.item, 1),
				 " MB", "MBB", "BBB", Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item,
						Character.valueOf('B'), new ItemStack(BlockIDs.oreTC.block, 1, 3) );

		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeGravel.item, 1),
				"   ", " S ", " B ", 'S', TrackItemIDs.tcRailSlopeWood.item, 'B', Blocks.gravel );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeGravel.item, 1),
				"   ", " S ", " B ", 'S', TrackItemIDs.tcRailLargeSlopeWood.item, 'B', Blocks.gravel );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeGravel.item, 1),
				"   ", " S ", " B ", 'S', TrackItemIDs.tcRailVeryLargeSlopeWood.item, 'B', Blocks.gravel );

		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailSlopeBallast.item, 1),
				"   ", " S ", " B ", 'S', TrackItemIDs.tcRailSlopeWood.item, 'B', Blocks.gravel );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeBallast.item, 1),
				"   ", " S ", " B ", 'S', TrackItemIDs.tcRailLargeSlopeWood.item, 'B', Blocks.gravel );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeBallast.item, 1),
				"   ", " S ", " B ", 'S', TrackItemIDs.tcRailVeryLargeSlopeWood.item, 'B', Blocks.gravel );


		// Large Slope Wood
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeWood.item, 1),
				 "   ", "  S", " S ", 'S', TrackItemIDs.tcRailSlopeWood.item );
		// Large Slope Gravel
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeGravel.item, 1),
				 "   ", "  S", " S ", 'S', TrackItemIDs.tcRailSlopeGravel.item );
		// Large Slope Ballast
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSlopeBallast.item, 1),
				 "   ", "  S", " S ", 'S', TrackItemIDs.tcRailSlopeBallast.item );
		// VeryLarge Slope Wood
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeWood.item, 1),
				 "  S", " S ", "S  ", 'S', TrackItemIDs.tcRailSlopeWood.item );
		// VeryLarge Slope Gravel
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeGravel.item, 1),
				 "  S", " S ", "S  ", 'S', TrackItemIDs.tcRailSlopeGravel.item );
		// VeryLarge Slope Ballast
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeSlopeBallast.item, 1),
				 "  S", " S ", "S  ", 'S', TrackItemIDs.tcRailSlopeBallast.item );
		
		// Medium Straight (3 Recipes? Really?)
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumStraight.item, 1),
				 "S  ", "S  ", "S  ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumStraight.item, 1),
				 " S ", " S ", " S ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumStraight.item, 1),
				 "  S", "  S", "  S", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item );
		// Long Straight (3 Recipes? Really?)
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLongStraight.item, 1),
				 "   ", " M ", " M ", Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLongStraight.item, 1),
				 "   ", "M  ", "M  ", Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item );
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLongStraight.item, 1),
				 "   ", "  M", "  M", Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item );
		
		// Medium Turn
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumTurn.item, 1),
				 "SS ", "S  ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item );
		// Large turn
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeTurn.item, 1),
				 " SS", "SS ", "S  ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item );
		// Very Large Turn
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailVeryLargeTurn.item, 1),
				 "MM ", "M  ", "   ", Character.valueOf('M'), TrackItemIDs.tcRailMediumTurn.item );
		
		// Medium Switch
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumSwitch.item, 1),
				 "S  ", "SRS", "S  ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item,
						Character.valueOf('R'), TrackItemIDs.tcRailMediumTurn.item );
		// Large Switch
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailLargeSwitch.item, 1),
				 "S  ", "MRS", "S  ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item,
						Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item, Character.valueOf('R'),
						TrackItemIDs.tcRailLargeTurn.item );
		// Parallel Switch
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailMediumParallelSwitch.item, 1),
				 "M S", "MRR", "MR ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item,
						Character.valueOf('M'), TrackItemIDs.tcRailMediumStraight.item, Character.valueOf('R'),
						TrackItemIDs.tcRailMediumTurn.item );
		// Two Way Crossing
		TrainCraftingManager.instance.addRecipe(new ItemStack(TrackItemIDs.tcRailTwoWaysCrossing.item, 1),
				 " S ", "SSS", " S ", Character.valueOf('S'), TrackItemIDs.tcRailSmallStraight.item );
		// Bridge Pillar
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.bridgePillar.block, 2),
				 "SSS", "S S", "SSS", Character.valueOf('S'), Items.stick );


		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartCF7angle3.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartCF7angle.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartCF7angle.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartCF7angle3.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartCF7round3.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartCF7round.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartCF7round.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartCF7round3.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartCF7hh.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecartCF7angle.item), 'C', new ItemStack(ItemIDs.partComponentCEE.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartU23BU.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecartU23B.item), 'C', new ItemStack(ItemIDs.partComponentCEE.item));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartES44h.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartES44.item));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartES44.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartES44h.item));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartSD70ACe.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartSD70ACe_H.item));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartSD70ACe_H.item, 1),  "   ", " R ", "   ", 'R', new ItemStack(ItemIDs.minecartSD70ACe.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartSD40R.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecartSD40.item), 'C', new ItemStack(ItemIDs.partComponentEMD.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartSD40dash3.item, 1),  "   ", "ARC", "   ", 'R', new ItemStack(ItemIDs.minecartSD40dash2.item), 'C', new ItemStack(ItemIDs.partComponentEMD.item), 'A', ItemIDs.steelcab.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartSW10.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecartSW9.item), 'C', new ItemStack(ItemIDs.partComponentEMD.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartSW1600.item, 1),  "   ", "ARC", "   ", 'R', new ItemStack(ItemIDs.minecartSW1500.item), 'A', new ItemStack(ItemIDs.partComponentEMD.item), 'C', new ItemStack(ItemIDs.partComponentCEE.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecart4ED172T_E.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecart4ED172T.item), 'C', new ItemStack(ItemIDs.partComponentEMD.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecart4ED172T_G.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecart4ED172T.item), 'C', new ItemStack(ItemIDs.partComponentGE.item));
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecart4ED172T_C.item, 1),  "   ", "CRC", "   ", 'R', new ItemStack(ItemIDs.minecart4ED172T.item), 'C', new ItemStack(ItemIDs.partComponentCEE.item));

	}
	
	public static void initSmeltingRecipes(){

		/* OpenHearthFurnace recipes */
		if (!ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN) {
			ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");
			ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");
			for (ItemStack s : steel) {
				for (ItemStack ironitm : iron){
				TrainCraftingManager.instance.addHearthFurnaceRecipe(ironitm,
						new ItemStack(ItemIDs.graphite.item), s, 2F, 1000);

				TrainCraftingManager.instance.addHearthFurnaceRecipe(new ItemStack(ItemIDs.graphite.item),
						ironitm, s, 2F, 1000);//reversed input recipe
				}
			}
		}
		
		/* Vanilla Furnace recipes */
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(BlockIDs.oreTC.block), 0), OreDictionary.getOres("ingotCopper").get(0), 0.7f);
	}

	public static void addDictRecipe(ItemStack stack, Object... obj) {
		ShapedOreRecipe recipe = new ShapedOreRecipe(stack, obj);
		GameRegistry.addRecipe(recipe);
	}
}
