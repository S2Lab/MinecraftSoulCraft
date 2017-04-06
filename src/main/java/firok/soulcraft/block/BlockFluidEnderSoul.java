package firok.soulcraft.block;

import creativetab.CreativeTabsLoader;
import firok.soulcraft.fluid.FluidLoader;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockFluidEnderSoul extends BlockFluidClassic
{
    public BlockFluidEnderSoul()
    {
        super(FluidLoader.fluidEnderSoul, Material.WATER);
        this.setUnlocalizedName("fluidEnderSoul");
    }
}