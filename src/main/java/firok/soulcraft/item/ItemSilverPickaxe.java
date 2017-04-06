package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import firok.soulcraft.common.ConfigLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSilverPickaxe extends ItemPickaxe
{
   
    public ItemSilverPickaxe()
    {
        super(ConfigLoader.SILVER);
        this.setUnlocalizedName("silverPickaxe");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}