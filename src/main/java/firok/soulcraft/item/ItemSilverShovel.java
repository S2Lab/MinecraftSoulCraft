package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSilverShovel extends ItemSpade
{
    public static final Item.ToolMaterial SILVER = EnumHelper.addToolMaterial("SILVER", 3, 16, 16.0F, 0.0F, 10);

    public ItemSilverShovel()
    {
        super(SILVER);
        this.setUnlocalizedName("silverShovel");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}