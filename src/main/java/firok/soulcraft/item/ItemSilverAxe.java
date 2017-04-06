package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSilverAxe extends ItemAxe
{
    public static final Item.ToolMaterial SILVER = EnumHelper.addToolMaterial("SILVER", 3, 16, 16.0F, 0.0F, 10);

    public ItemSilverAxe()
    {
        super(SILVER,8.0F,-3.1F);
        this.setUnlocalizedName("silverAxe");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}