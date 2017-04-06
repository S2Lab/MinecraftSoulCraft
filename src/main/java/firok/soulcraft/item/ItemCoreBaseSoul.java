package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemCoreBaseSoul extends Item
{
    public ItemCoreBaseSoul()
    {
        super();
        this.setUnlocalizedName("coreBaseSoul");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}