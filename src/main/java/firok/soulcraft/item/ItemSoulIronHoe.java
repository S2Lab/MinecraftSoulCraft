package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSoulIronHoe extends ItemHoe
{
    public static final Item.ToolMaterial SOULIRON = EnumHelper.addToolMaterial("SOULIRON", 3, 16, 16.0F, 0.0F, 10);

    public ItemSoulIronHoe()
    {
        super(SOULIRON);
        this.setUnlocalizedName("soulironHoe");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}