package train.common.core.handlers;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;
import train.common.inventory.TrainCraftingManager;
import train.common.recipes.ITCRecipe.ShapedTrainRecipes;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

/**
 * Used as a base Table Recipe Handler that grabs all the items needed
 */
public abstract class AbstractRecipeHandler
{
    public ArrayList<ItemStack> ingotIron	= OreDictionary.getOres("ingotIron");
    public ArrayList<ItemStack> plankWood = OreDictionary.getOres("plankWood");
    public ArrayList<ItemStack> logWood = OreDictionary.getOres("logWood");
    public ArrayList<ItemStack> ingotSteel = OreDictionary.getOres("ingotSteel");
    public ArrayList<ItemStack> dyeRed = OreDictionary.getOres("dyeRed"); //1
    public ArrayList<ItemStack> dyeYellow = OreDictionary.getOres("dyeYellow"); //11
    public ArrayList<ItemStack> dyeOrange = OreDictionary.getOres("dyeOrange");//14
    public ArrayList<ItemStack> dyeGreen = OreDictionary.getOres("dyeGreen"); //2
    public ArrayList<ItemStack> dyeBlue = OreDictionary.getOres("dyeBlue"); //4
    public ArrayList<ItemStack> dyeBrown = OreDictionary.getOres("dyeBrown"); //3
    public ArrayList<ItemStack> dyeGray = OreDictionary.getOres("dyeGray"); //3
    public ArrayList<ItemStack> dyeLightGray = OreDictionary.getOres("dyeLightGray"); //7
    public ArrayList<ItemStack> dyeBlack = OreDictionary.getOres("dyeBlack");
    public ArrayList<ItemStack> dyeWhite = OreDictionary.getOres("dyeWhite");
    public ArrayList<ItemStack> dyeMagenta = OreDictionary.getOres("dyeMagenta");
    public ArrayList<ItemStack> dyeLime = OreDictionary.getOres("dyeLime");
    public ArrayList<ItemStack> dyeLightBlue = OreDictionary.getOres("dyeLightBlue");
    public ArrayList<ItemStack> dyePurple = OreDictionary.getOres("dyePurple");
    public ArrayList<ItemStack> dyePink = OreDictionary.getOres("dyePink");
    public ArrayList<ItemStack> dyeCyan = OreDictionary.getOres("dyeCyan");

    public List<ItemStack> coal = new ArrayList<ItemStack>()
    {
        {
            add(new ItemStack(Items.coal));
            addAll(OreDictionary.getOres("coal"));
        }
    };

    public ArrayList<ItemStack> ingotRainbontrium = OreDictionary.getOres("ingotRainbontrium");


    public ArrayList<ItemStack> redstone = OreDictionary.getOres("dustRedstone");
    public ArrayList<ItemStack> waterbucket = waterContainers();

    public static ArrayList<ItemStack> waterContainers(){
        ArrayList<ItemStack> containers = new ArrayList<ItemStack>();
        for (FluidContainerRegistry.FluidContainerData data : FluidContainerRegistry.getRegisteredFluidContainerData()){
            if(data.fluid.fluid == FluidRegistry.WATER){
                containers.add(data.filledContainer);
            }
        }
        return containers;
    }

    /**
     * Adds Recipe to TrainCraftingManager and will attempt to grab every input item from ore dictionary
     * @param output
     * @param args
     */
    public final void addRecipeWithOreDic(ItemStack output, Object... args) {

        String pattern = "";
        int argIndex = 0;
        int width = 0;
        int height = 0;

    /* =========================
       Read recipe pattern
       ========================= */

        if (args[argIndex] instanceof String[]) {
            String[] rows = (String[]) args[argIndex++];

            for (String row : rows) {
                height++;
                width = row.length();
                pattern += row;
            }
        }
        else {
            while (args[argIndex] instanceof String) {
                String row = (String) args[argIndex++];
                height++;
                width = row.length();
                pattern += row;
            }
        }

    /* =========================
       Build character → stacks map
       ========================= */

        HashMap<Character, List<ItemStack>> ingredientMap =
                new HashMap<Character, List<ItemStack>>();

        for (; argIndex < args.length; argIndex += 2) {

            Character key = (Character) args[argIndex];
            Object value = args[argIndex + 1];

            List<ItemStack> stacks = new ArrayList<ItemStack>();

            if (value instanceof ItemStack) {
                stacks.addAll(getOreVariants((ItemStack) value));
            }
            else if (value instanceof Item) {
                stacks.addAll(getOreVariants(new ItemStack((Item) value)));
            }
            else if (value instanceof Block) {
                stacks.addAll(getOreVariants(new ItemStack((Block) value, 1, -1)));
            }

            ingredientMap.put(key, stacks);
        }

    /* =========================
       Generate all combinations
       ========================= */

        List<ItemStack[]> combinations =
                generateIngredientCombinations(pattern, width, height, ingredientMap);

    /* =========================
       Register all recipes
       ========================= */

        for (ItemStack[] ingredients : combinations) {
            ShapedTrainRecipes recipe =
                    new ShapedTrainRecipes(width, height, ingredients, output);

            TrainCraftingManager.instance.AddRecipe(recipe);
            TrainCraftingManager.instance.AddShapedRecipe(recipe);
        }
    }

    private HashMap<ItemStack, List<ItemStack>> oreDictionaryCache = new HashMap<>();

    private List<ItemStack> getOreVariants(ItemStack stack)
    {
        if (oreDictionaryCache.containsKey(stack))
        {
            return oreDictionaryCache.get(stack);
        }

        List<ItemStack> result = new ArrayList<ItemStack>();

        int[] oreIDs = OreDictionary.getOreIDs(stack);

        if (oreIDs.length == 0) {
            result.add(stack);
            oreDictionaryCache.put(stack, result);
            return result;
        }

        for (int id : oreIDs) {
            for (ItemStack oreStack : OreDictionary.getOres(OreDictionary.getOreName(id))) {
                result.add(oreStack.copy());
            }
        }

        oreDictionaryCache.put(stack, result);

        return result;
    }


    private List<ItemStack[]> generateIngredientCombinations(
            String pattern,
            int width,
            int height,
            HashMap<Character, List<ItemStack>> ingredientMap) {

        List<ItemStack[]> results = new ArrayList<ItemStack[]>();
        results.add(new ItemStack[9]); // initial empty grid

        for (int i = 0; i < width * height; i++) {
            char symbol = pattern.charAt(i);
            List<ItemStack> options = ingredientMap.get(symbol);

            List<ItemStack[]> next = new ArrayList<ItemStack[]>();

            for (ItemStack[] base : results) {
                if (options == null) {
                    ItemStack[] copy = base.clone();
                    copy[i] = null;
                    next.add(copy);
                }
                else {
                    for (ItemStack stack : options) {
                        ItemStack[] copy = base.clone();
                        copy[i] = stack.copy();
                        next.add(copy);
                    }
                }
            }

            results = next;
        }

        return results;
    }
}
