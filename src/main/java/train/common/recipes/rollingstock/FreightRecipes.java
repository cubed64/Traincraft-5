package train.common.recipes.rollingstock;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;

public class FreightRecipes extends AbstractRecipeHandler
{
    public FreightRecipes(ITierCraftingManager cm)
    {
        for (ItemStack k :ingotSteel)
        {
            Item itemSteel = k.getItem();
            int itemDamageSteel = k.getItemDamage();

            //doing bap recipes first
            //example of item order
            //cm.addRecipe(3, null, null, null, null, null, null, null, null, null, null, new ItemStack(ItemIDs.pennCentral.item, 1), 1);




        }

    }
}
