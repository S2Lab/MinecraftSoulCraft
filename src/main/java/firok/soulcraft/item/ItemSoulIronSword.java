package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSoulIronSword extends ItemSword
{
    public static final Item.ToolMaterial SOULIRON = EnumHelper.addToolMaterial("SOULIRON", 3, 16, 16.0F, 0.0F, 10);

    public ItemSoulIronSword()
    {
        super(SOULIRON);
        this.setUnlocalizedName("soulironSword");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}