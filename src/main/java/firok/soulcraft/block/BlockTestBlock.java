package firok.soulcraft.block;

import creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

public class BlockTestBlock extends Block
{
	public BlockTestBlock()
    {
        super(Material.GROUND);
        this.setUnlocalizedName("testBlock");
        this.setHardness(0.5F);
        this.setHarvestLevel("testBlock", 0);
        this.setLightLevel(0.6F);
        this.setLightOpacity(1);
        this.setResistance(1);
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
    }
}