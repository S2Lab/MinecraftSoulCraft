package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import firok.soulcraft.common.ConfigLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSilverShovel extends ItemSpade
{
    
    public ItemSilverShovel()
    {
        super(ConfigLoader.SILVER);
        this.setUnlocalizedName("silverShovel");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}