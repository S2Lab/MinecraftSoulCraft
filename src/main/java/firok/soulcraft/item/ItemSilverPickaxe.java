package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSilverPickaxe extends ItemPickaxe
{
    public static final Item.ToolMaterial SILVER = EnumHelper.addToolMaterial("SILVER", 3, 16, 16.0F, 0.0F, 10);

    public ItemSilverPickaxe()
    {
        super(SILVER);
        this.setUnlocalizedName("silverPickaxe");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}