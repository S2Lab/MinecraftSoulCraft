package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSoulIronShovel extends ItemSpade
{
    public static final Item.ToolMaterial SOULIRON = EnumHelper.addToolMaterial("SOULIRON", 3, 16, 16.0F, 0.0F, 10);

    public ItemSoulIronShovel()
    {
        super(SOULIRON);
        this.setUnlocalizedName("soulironShovel");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}