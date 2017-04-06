package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemTestItem extends Item
{
    public ItemTestItem()
    {
        super();
        this.setUnlocalizedName("testItem");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}