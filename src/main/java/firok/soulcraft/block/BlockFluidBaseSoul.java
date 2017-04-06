package firok.soulcraft.block;

import creativetab.CreativeTabsLoader;
import firok.soulcraft.fluid.FluidLoader;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockFluidBaseSoul extends BlockFluidClassic
{
    public BlockFluidBaseSoul()
    {
        super(FluidLoader.fluidBaseSoul, Material.WATER);
        this.setUnlocalizedName("fluidBaseSoul");
    }
}