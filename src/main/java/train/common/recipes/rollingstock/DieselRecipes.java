package train.common.recipes.rollingstock;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.library.ItemIDs;

public class DieselRecipes extends AbstractRecipeHandler
{
    public DieselRecipes(ITierCraftingManager cm)
    {
        for (ItemStack k :ingotSteel)
        {
            Item itemSteel = k.getItem();
            int itemDamageSteel = k.getItemDamage();

            //doing bap recipes first
            //example of item order
            //cm.addRecipe(3, null, null, null, null, null, null, null, null, null, null, new ItemStack(ItemIDs.pennCentral.item, 1), 1);

            //=================== TIER II ==================//

            //bap teir 2 first for organization reasons and cus im a greedy fuck

            for (ItemStack dye : dyeLightGray) {//f3
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartF3A.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), null, dye, new ItemStack(ItemIDs.minecartF3B.item, 1), 1);
            }
            for (ItemStack dye : dyeBlack) {//f7
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartF7A.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), null, dye, new ItemStack(ItemIDs.minecartF7B.item, 1), 1);
            }
            for (ItemStack dye : dyeGreen) {//f9
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartF9A.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), null, dye, new ItemStack(ItemIDs.minecartF9B.item, 1), 1);
            }
            for (ItemStack dye : dyeGreen) {//fp7
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartFP7A.item, 1), 1);
            }
            for (ItemStack dye : dyeBlue) {//fp9
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartFP9A.item, 1), 1);
            }
            for (ItemStack dye : dyeYellow) {//cf7s
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), null, new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartF7A.item, 1), null, null, dye, new ItemStack(ItemIDs.minecartCF7angle.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartF7A.item, 1), null, null, dye, new ItemStack(ItemIDs.minecartCF7round.item, 1), 1);
            }
            for (ItemStack dye : dyeCyan) {//ce8
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), null, new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartE8A.item, 1), null, new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartCE8.item, 1), 1);
            }
            for (ItemStack dye : dyeYellow) {//gp7u
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartGP7.item, 1), null, null, dye, new ItemStack(ItemIDs.minecartGP7u.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartGP7.item, 1), null, null, dye, new ItemStack(ItemIDs.minecartGP7f.item, 1), 1);
            }
            for (ItemStack dye : dyeBlack) {//gp18
                cm.addRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartGP18.item, 1), 1);
            }
            for (ItemStack dye : dyeOrange) {//gp35
                cm.addRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartGP35.item, 1), 1);
            }

            for (ItemStack dye : dyeCyan) {//phase 2 babyface
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartDR441500Phase2.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), null, dye, new ItemStack(ItemIDs.minecartDR441500BPhase2.item, 1), 1);
            }
            for (ItemStack dye : dyeRed) {//phase 3 babyface (sharknose)
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartDR441500Shark.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), null, dye, new ItemStack(ItemIDs.minecartDR441500BShark.item, 1), 1);
            }
            for (ItemStack dye : dyeBlack) {//RF-16
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartRF16.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), null, dye, new ItemStack(ItemIDs.minecartRF16B.item, 1), 1);
            }

            for (ItemStack dye : dyeLightGray) {//u18bw/bwh
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU18BWH.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU18BW.item, 1), 1);
            }
            for (ItemStack dye : dyeRed) {//u18b
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU18B.item, 1), 1);
            }
            for (ItemStack dye : dyeYellow) {//u23b
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU23B.item, 1), 1);
            }
            for (ItemStack dye : dyeGray) {//u23bw
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 3), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU23BW.item, 1), 1);
            }
            for (ItemStack dye : dyeYellow) {//sf30b
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(itemSteel, 1, itemDamageSteel), new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentGE.item, 2), new ItemStack(ItemIDs.minecartU23B.item, 1), null, new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSF30B.item, 1), 1);
            }
            for (ItemStack dye : dyeRed) {//u25b
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU25B.item, 1), 1);
            }
            for (ItemStack dye : dyeBrown) {//u30bh
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU30BH.item, 1), 1);
            }
            for (ItemStack dye : dyePurple) {//u36b
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU36B.item, 1), 1);
            }
            for (ItemStack dye : dyeLightBlue) {//u23c
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU23C.item, 1), 1);
            }
            for (ItemStack dye : dyeLightBlue) {//u30c
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU30C.item, 1), 1);
            }
            for (ItemStack dye : dyeYellow) {//u50
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.partTypeB.item, 4), new ItemStack(ItemIDs.steelframe.item, 6), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 2), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU50.item, 1), 1);
            }
            for (ItemStack dye : dyeCyan) {//u56
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.partTypeB.item, 4), new ItemStack(ItemIDs.steelframe.item, 6), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 2), new ItemStack(ItemIDs.partComponentCEE.item, 8), new ItemStack(ItemIDs.partAlternator.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU56.item, 1), 1);
            }
            for (ItemStack dye : dyeLightGray) {//sb18s
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSB18R.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSB18E.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSB18B.item, 1), 1);
            }
            for (ItemStack dye : dyeRed) {//b23
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartB23.item, 1), 1);
            }
            for (ItemStack dye : dyeGray) {//super7 & bq23
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.minecartU23B.item, 3), new ItemStack(ItemIDs.partComponentGE.item, 3), null, dye, new ItemStack(ItemIDs.minecartB23S7.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 4), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartBQ23.item, 1), 1);
            }
            for (ItemStack dye : dyeGreen) {//b36
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartB36.item, 1), 1);
            }
            for (ItemStack dye : dyePink) {//sb36x
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSB36X.item, 1), 1);
            }


            //=================== TIER II ==================//



            for (ItemStack dye : dyeLightGray) {//f3
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartF3A.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), null, dye, new ItemStack(ItemIDs.minecartF3B.item, 1), 1);
            }
            for (ItemStack dye : dyeBlack) {//f7
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartF7A.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), null, dye, new ItemStack(ItemIDs.minecartF7B.item, 1), 1);
            }
            for (ItemStack dye : dyeGreen) {//f9
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartF9A.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), null, dye, new ItemStack(ItemIDs.minecartF9B.item, 1), 1);
            }
            for (ItemStack dye : dyeGreen) {//fp7
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartFP7A.item, 1), 1);
            }
            for (ItemStack dye : dyeBlue) {//fp9
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartFP9A.item, 1), 1);
            }
            for (ItemStack dye : dyeYellow) {//cf7s
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), null, new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartF7A.item, 1), null, null, dye, new ItemStack(ItemIDs.minecartCF7angle.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartF7A.item, 1), null, null, dye, new ItemStack(ItemIDs.minecartCF7round.item, 1), 1);
            }
            for (ItemStack dye : dyeCyan) {//ce8
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), null, new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartE8A.item, 1), null, new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartCE8.item, 1), 1);
            }
            for (ItemStack dye : dyeYellow) {//gp7u
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartGP7.item, 1), null, null, dye, new ItemStack(ItemIDs.minecartGP7u.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.minecartGP7.item, 1), null, null, dye, new ItemStack(ItemIDs.minecartGP7f.item, 1), 1);
            }
            for (ItemStack dye : dyeBlack) {//gp18
                cm.addRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartGP18.item, 1), 1);
            }
            for (ItemStack dye : dyeOrange) {//gp35
                cm.addRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartGP35.item, 1), 1);
            }

            for (ItemStack dye : dyeCyan) {//phase 2 babyface
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartDR441500Phase2.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), null, dye, new ItemStack(ItemIDs.minecartDR441500BPhase2.item, 1), 1);
            }
            for (ItemStack dye : dyeRed) {//phase 3 babyface (sharknose)
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartDR441500Shark.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), null, dye, new ItemStack(ItemIDs.minecartDR441500BShark.item, 1), 1);
            }
            for (ItemStack dye : dyeBlack) {//RF-16
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartRF16.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentBLW.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), null, dye, new ItemStack(ItemIDs.minecartRF16B.item, 1), 1);
            }

            for (ItemStack dye : dyeLightGray) {//u18bw/bwh
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU18BWH.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU18BW.item, 1), 1);
            }
            for (ItemStack dye : dyeRed) {//u18b
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU18B.item, 1), 1);
            }
            for (ItemStack dye : dyeYellow) {//u23b
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU23B.item, 1), 1);
            }
            for (ItemStack dye : dyeGray) {//u23bw
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 3), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU23BW.item, 1), 1);
            }
            for (ItemStack dye : dyeYellow) {//sf30b
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, new ItemStack(itemSteel, 1, itemDamageSteel), new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentGE.item, 2), new ItemStack(ItemIDs.minecartU23B.item, 1), null, new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSF30B.item, 1), 1);
            }
            for (ItemStack dye : dyeRed) {//u25b
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU25B.item, 1), 1);
            }
            for (ItemStack dye : dyeBrown) {//u30bh
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU30BH.item, 1), 1);
            }
            for (ItemStack dye : dyePurple) {//u36b
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU36B.item, 1), 1);
            }
            for (ItemStack dye : dyeLightBlue) {//u23c
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU23C.item, 1), 1);
            }
            for (ItemStack dye : dyeLightBlue) {//u30c
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU30C.item, 1), 1);
            }
            for (ItemStack dye : dyeYellow) {//u50
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.partTypeB.item, 4), new ItemStack(ItemIDs.steelframe.item, 6), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 2), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU50.item, 1), 1);
            }
            for (ItemStack dye : dyeCyan) {//u56
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.partTypeB.item, 4), new ItemStack(ItemIDs.steelframe.item, 6), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 2), new ItemStack(ItemIDs.partComponentCEE.item, 8), new ItemStack(ItemIDs.partAlternator.item, 6), new ItemStack(ItemIDs.dieselengine.item, 6), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartU56.item, 1), 1);
            }
            for (ItemStack dye : dyeLightGray) {//sb18s
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSB18R.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSB18E.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSB18B.item, 1), 1);
            }
            for (ItemStack dye : dyeRed) {//b23
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartB23.item, 1), 1);
            }
            for (ItemStack dye : dyeGray) {//super7 & bq23
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, null, new ItemStack(itemSteel, 3, itemDamageSteel), null, new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.minecartU23B.item, 3), new ItemStack(ItemIDs.partComponentGE.item, 3), null, dye, new ItemStack(ItemIDs.minecartB23S7.item, 1), 1);
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 4), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartBQ23.item, 1), 1);
            }
            for (ItemStack dye : dyeGreen) {//b36
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartB36.item, 1), 1);
            }
            for (ItemStack dye : dyePink) {//sb36x
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSB36X.item, 1), 1);
            }

            for (ItemStack dye : dyeOrange) {//sw9
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSW9.item, 1), 1);
            }
            for (ItemStack dye : dyeWhite) {//sw900
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSW900.item, 1), 1);
            }
            for (ItemStack dye : dyeGreen) {//sw1000
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSW1000.item, 1), 1);
            }
            for (ItemStack dye : dyeCyan) {//mp900
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartMP900.item, 1), 1);
            }
            for (ItemStack dye : dyeGray) {//tr4
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartTR4.item, 1), 1);
                cm.addRecipe(2, null, new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartTR4B.item, 1), 1);
            }

            for (ItemStack dye : dyeOrange) {//4ed-172t
                cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 2), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecart4ED172T.item, 1), 1);
            }



            //=================== TIER III =================//



            for (ItemStack dye : dyeGray) {//gp38
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartGP38.item, 1), 1);
            }
            for (ItemStack dye : dyeYellow) {//gp38-2
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartGP38dash2.item, 1), 1);
            }
            for (ItemStack dye : dyeGreen) {//gp39
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartGP39.item, 1), 1);
            }
            for (ItemStack dye : dyeLime) {//gp39-2
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartGP39Dash2.item, 1), 1);
            }
            for (ItemStack dye : dyeGray) {//gp40
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartGP40.item, 1), 1);
            }
            for (ItemStack dye : dyeBlue) {//gp40-2
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartGP40Dash2.item, 1), 1);
            }


            for (ItemStack dye : dyeCyan) {//b18-8e & c39-8e
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentCEE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartDash818BE.item, 1), 1);
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartDash839CE.item, 1), 1);
            }
            for (ItemStack dye : dyeWhite) {//b32-8wh & d9-40c
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartDash832BWH.item, 1), 1);
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartDash940C.item, 1), 1);
            }
            for (ItemStack dye : dyeLightBlue) {//c39-8
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartDash839C.item, 1), 1);
            }
            for (ItemStack dye : dyeGray) {//b39-8
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartDash839B.item, 1), 1);
            }
            for (ItemStack dye : dyeRed) {//c41-8
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartDash841C.item, 1), 1);
            }
            for (ItemStack dye : dyeBlue) {//ac4400cw
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 5), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartAC4400CW.item, 1), 1);
            }
            for (ItemStack dye : dyeGreen) {//ac4400c
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 5), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartAC4400C.item, 1), 1);
            }
            for (ItemStack dye : dyeBlue) {//p32 p40
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartP32.item, 1), 1);
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartGeGenesis.item, 1), 1);
            }
            for (ItemStack dye : dyeBlue) {//p42
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartP42.item, 1), 1);
            }

            for (ItemStack dye : dyeRed) {//sd38
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.steelchimney.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSD38.item, 1), 1);
            }
            for (ItemStack dye : dyeOrange) {//sd39
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSD39.item, 1), 1);
            }
            for (ItemStack dye : dyeBlue) {//sd40
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSD40.item, 1), 1);
            }
            for (ItemStack dye : dyeGray) {//sd40-2
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSD40dash2.item, 1), 1);
            }
            for (ItemStack dye : dyeBlack) {//sd40t-2 & sd40a
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSD40T2.item, 1), 1);
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSD40A.item, 1), 1);
            }
            for (ItemStack dye : dyeGray) {//sdp40
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.partAlternator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSDP40.item, 1), 1);
            }
            for (ItemStack dye : dyeBlack) {//sdp45
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSDP45.item, 1), 1);
            }
            for (ItemStack dye : dyeGray) {//sd50
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSD50.item, 1), 1);
            }
            for (ItemStack dye : dyeLightBlue) {//sd60
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSD60.item, 1), 1);
            }
            for (ItemStack dye : dyeYellow) {//sd70ace
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 5), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.partComponentEMD.item, 6), new ItemStack(ItemIDs.partAlternator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 5), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartSD70ACe.item, 1), 1);
            }

        }

    }
}
