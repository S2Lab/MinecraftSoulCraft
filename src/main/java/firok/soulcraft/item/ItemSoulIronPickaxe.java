package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import firok.soulcraft.common.ConfigLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSoulIronPickaxe extends ItemPickaxe
{
    
    public ItemSoulIronPickaxe()
    {
        super(ConfigLoader.SOULIRON);
        this.setUnlocalizedName("soulironPickaxe");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}