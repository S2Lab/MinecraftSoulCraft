package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSoulIronPickaxe extends ItemPickaxe
{
    public static final Item.ToolMaterial SOULIRON = EnumHelper.addToolMaterial("SOULIRON", 3, 16, 16.0F, 0.0F, 10);

    public ItemSoulIronPickaxe()
    {
        super(SOULIRON);
        this.setUnlocalizedName("soulironPickaxe");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}