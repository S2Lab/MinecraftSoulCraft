package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import firok.soulcraft.common.ConfigLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSoulIronAxe extends ItemAxe
{
    
    public ItemSoulIronAxe()
    {
        super(ConfigLoader.SOULIRON,8.0F,-3.1F);
        this.setUnlocalizedName("soulironAxe");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}