package firok.soulcraft.common;

import creativetab.CreativeTabsLoader;
import firok.soulcraft.block.BlockLoader;
import firok.soulcraft.fluid.FluidLoader;
import firok.soulcraft.item.ItemLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
    	// new ConfigLoader(event);
        new CreativeTabsLoader(event);
        new FluidLoader(event);
        new ItemLoader(event);
        new BlockLoader(event);
        // new PotionLoader(event);
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
