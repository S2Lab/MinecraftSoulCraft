package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import firok.soulcraft.common.ConfigLoader;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSoulIronSword extends ItemSword
{
    
    public ItemSoulIronSword()
    {
        super(ConfigLoader.SOULIRON);
        this.setUnlocalizedName("soulironSword");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}