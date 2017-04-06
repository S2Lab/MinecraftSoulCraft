package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemIngotSilver extends Item
{
    public ItemIngotSilver()
    {
        super();
        this.setUnlocalizedName("ingotSilver");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}