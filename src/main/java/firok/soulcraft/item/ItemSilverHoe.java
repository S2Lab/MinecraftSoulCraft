package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSilverHoe extends ItemHoe
{
    public static final Item.ToolMaterial SILVER = EnumHelper.addToolMaterial("SILVER", 3, 16, 16.0F, 0.0F, 10);

    public ItemSilverHoe()
    {
        super(SILVER);
        this.setUnlocalizedName("silverHoe");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}