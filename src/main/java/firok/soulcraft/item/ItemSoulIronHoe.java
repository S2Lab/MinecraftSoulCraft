package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import firok.soulcraft.common.ConfigLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSoulIronHoe extends ItemHoe
{
    
    public ItemSoulIronHoe()
    {
        super(ConfigLoader.SOULIRON);
        this.setUnlocalizedName("soulironHoe");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}