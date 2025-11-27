package train.common.recipes.rollingstock;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.library.ItemIDs;

public class ElectricRecipes extends AbstractRecipeHandler
{
    public ElectricRecipes(ITierCraftingManager cm)
    {
        for (ItemStack k :ingotSteel)
        {
            Item itemSteel = k.getItem();
            int itemDamageSteel = k.getItemDamage();

            //doing bap recipes first
            //example of item order
            //cm.addRecipe(3, null, null, null, null, null, null, null, null, null, null, new ItemStack(ItemIDs.pennCentral.item, 1), 1);

            for (ItemStack rs : redstone){
                for (ItemStack dye : dyeWhite) {//gm6c
                    cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.pantograph.item, 2), new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.transformer.item, 4), new ItemStack(ItemIDs.copperWireFine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartGM6C.item, 1), 1);
                }
                for (ItemStack dye : dyeWhite) {//b-bel
                    cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.partFB2.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(rs.getItem(), 12), new ItemStack(ItemIDs.partComponentCEE.item, 5), new ItemStack(ItemIDs.transformer.item, 1), new ItemStack(ItemIDs.copperWireFine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartB_BEL.item, 1), 1);
                }
                for (ItemStack dye : dyeLime) {//jt7
                    cm.addRecipe(3, new ItemStack(ItemIDs.ironCab.item, 1), new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 6), new ItemStack(itemSteel, 3, itemDamageSteel), new ItemStack(ItemIDs.pantograph.item, 2), new ItemStack(ItemIDs.partComponentCEE.item, 3), new ItemStack(ItemIDs.transformer.item, 8), new ItemStack(ItemIDs.copperWireFine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(ItemIDs.minecartJT7.item, 1), 1);
                }
            }




        }

    }
}
