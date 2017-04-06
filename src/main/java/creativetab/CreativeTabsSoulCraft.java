package creativetab;

import firok.soulcraft.item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsSoulCraft extends CreativeTabs {
	
	public CreativeTabsSoulCraft()
    {
        super("soulcraft");
    }

	@Override
    public Item getTabIconItem()
    {
        return ItemLoader.testItem;
    }

}
