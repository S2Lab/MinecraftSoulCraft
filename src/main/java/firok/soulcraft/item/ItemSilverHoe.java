package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import firok.soulcraft.common.ConfigLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSilverHoe extends ItemHoe
{
    
    public ItemSilverHoe()
    {
        super(ConfigLoader.SILVER);
        this.setUnlocalizedName("silverHoe");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}