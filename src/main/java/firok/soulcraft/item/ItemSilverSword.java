package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import firok.soulcraft.common.ConfigLoader;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSilverSword extends ItemSword
{
    
    public ItemSilverSword()
    {
        super(ConfigLoader.SILVER);
        this.setUnlocalizedName("silverSword");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}