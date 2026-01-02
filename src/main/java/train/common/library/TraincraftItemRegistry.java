package train.common.library;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.oredict.OreDictionary;
import train.client.core.ClientProxy;
import train.common.Traincraft;
import train.common.utils.devutils.DebugUtil;

import javax.annotation.Nullable;

public class TraincraftItemRegistry
{
    public static Item RegisterItem(Item itm, String MODID, String unlocalizedName, CreativeTabs tab) {
        return RegisterItem(itm, MODID, unlocalizedName, null, tab, null, null);
    }

    public static Item RegisterItem(Item itm, String MODID, String unlocalizedName, CreativeTabs tab, String textureName) {
        return RegisterItem(itm, MODID, unlocalizedName, null, tab, null, null, textureName);
    }

    public static Item RegisterItem(Item itm, String MODID, String unlocalizedName, @Nullable String oreDictionaryName, @Nullable CreativeTabs tab, @Nullable Item container, @Nullable Object itemRender) {
        return RegisterItem(itm, MODID, unlocalizedName, oreDictionaryName, tab, container, itemRender, unlocalizedName.replace("item.", ""));
    }

    public static Item RegisterItem(Item itm, String MODID, String unlocalizedName, @Nullable String oreDictionaryName, @Nullable CreativeTabs tab, @Nullable Item container, @Nullable Object itemRender, String textureName) {
        if (tab != null) {
            itm.setCreativeTab(tab);
        }
        if (container != null) {
            itm.setContainerItem(container);
        }

        GameRegistry.registerItem(itm, unlocalizedName);
        if (oreDictionaryName != null) {
            OreDictionary.registerOre(oreDictionaryName, itm);
        }
        if (DebugUtil.dev && Traincraft.proxy != null && Traincraft.proxy.isClient() && itm.getUnlocalizedName().equals(StatCollector.translateToLocal(itm.getUnlocalizedName()+".name"))) {
            DebugUtil.println("Item missing lang entry: " + itm.getUnlocalizedName());
        }
        if (Traincraft.proxy.isClient() && itemRender != null) {
            MinecraftForgeClient.registerItemRenderer(itm, (IItemRenderer) itemRender);

        } else if(Traincraft.proxy.isClient()){
            itm.setTextureName(MODID+ ":" + textureName);
        }
        return itm;
    }
}
