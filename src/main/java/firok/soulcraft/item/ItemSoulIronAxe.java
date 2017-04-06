package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSoulIronAxe extends ItemAxe
{
    public static final Item.ToolMaterial SOULIRON = EnumHelper.addToolMaterial("SOULIRON", 3, 16, 16.0F, 0.0F, 10);

    public ItemSoulIronAxe()
    {
        super(SOULIRON,8.0F,-3.1F);
        this.setUnlocalizedName("soulironAxe");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}