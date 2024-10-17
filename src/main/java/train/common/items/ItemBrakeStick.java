package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.library.ItemIDs;

import java.util.List;

public class ItemBrakeStick extends ItemPart
{

    public ItemBrakeStick() {
        super(ItemIDs.brakeStick.iconName);
        maxStackSize = 1;
        setCreativeTab(Traincraft.tcTab);
    }

    @Override
    public boolean shouldRotateAroundWhenRendering() {

        return true;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("\u00a77" + EnumChatFormatting.GREEN + "Shift-right-click" + EnumChatFormatting.GRAY + " on rolling stock to engage the parking brake.");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":" + ItemIDs.brakeStick.iconName);
    }
}