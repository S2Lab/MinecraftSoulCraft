package firok.soulcraft.item;

import firok.soulcraft.block.BlockLoader;
import firok.soulcraft.fluid.FluidLoader;
import creativetab.CreativeTabsLoader;

import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;

public class ItemBucketEnderSoul extends ItemBucket
{
    public ItemBucketEnderSoul()
    {
        super(BlockLoader.fluidEnderSoul);
        this.setContainerItem(Items.BUCKET);
        this.setUnlocalizedName("bucketEnderSoul");
        this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
        FluidContainerRegistry.registerFluidContainer(FluidLoader.fluidEnderSoul, new ItemStack(this),
                FluidContainerRegistry.EMPTY_BUCKET);
    }
}