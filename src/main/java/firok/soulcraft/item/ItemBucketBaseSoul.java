package firok.soulcraft.item;

import firok.soulcraft.block.BlockLoader;
import firok.soulcraft.fluid.FluidLoader;
import creativetab.CreativeTabsLoader;

import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;

public class ItemBucketBaseSoul extends ItemBucket
{
    public ItemBucketBaseSoul()
    {
        super(BlockLoader.fluidBaseSoul);
        this.setContainerItem(Items.BUCKET);
        this.setUnlocalizedName("bucketBaseSoul");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
        FluidContainerRegistry.registerFluidContainer(FluidLoader.fluidBaseSoul, new ItemStack(this),
                FluidContainerRegistry.EMPTY_BUCKET);
    }
}