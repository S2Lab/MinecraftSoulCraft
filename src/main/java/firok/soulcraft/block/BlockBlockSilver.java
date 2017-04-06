package firok.soulcraft.block;

import creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBlockSilver extends Block
{
    public BlockBlockSilver()
    {
        super(Material.GROUND);
        this.setUnlocalizedName("silverBlock");
        this.setHardness(0.5F);
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
    
}