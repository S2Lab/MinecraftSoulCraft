package firok.soulcraft.block;

import creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOreSilver extends Block
{
    public BlockOreSilver()
    {
        super(Material.GROUND);
        this.setUnlocalizedName("silverOre");
        this.setHardness(0.5F);
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}