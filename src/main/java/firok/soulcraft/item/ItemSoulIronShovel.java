package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import firok.soulcraft.common.ConfigLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSoulIronShovel extends ItemSpade
{
    
    public ItemSoulIronShovel()
    {
        super(ConfigLoader.SOULIRON);
        this.setUnlocalizedName("soulironShovel");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}