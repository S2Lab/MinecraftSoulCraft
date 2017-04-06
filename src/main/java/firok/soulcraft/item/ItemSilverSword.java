package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSilverSword extends ItemSword
{
    public static final Item.ToolMaterial SILVER = EnumHelper.addToolMaterial("SILVER", 3, 16, 16.0F, 0.0F, 10);

    public ItemSilverSword()
    {
        super(SILVER);
        this.setUnlocalizedName("silverSword");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}