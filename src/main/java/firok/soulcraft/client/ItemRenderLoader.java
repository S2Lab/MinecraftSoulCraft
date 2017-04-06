package firok.soulcraft.client;

import firok.soulcraft.block.BlockLoader;
import firok.soulcraft.fluid.FluidLoader;
import firok.soulcraft.item.ItemLoader;

public class ItemRenderLoader
{
    public ItemRenderLoader()
    {
        ItemLoader.registerRenders();
        BlockLoader.registerRenders();
        FluidLoader.registerRenders();
    }
}