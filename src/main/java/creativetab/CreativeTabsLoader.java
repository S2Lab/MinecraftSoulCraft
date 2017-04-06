package creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader
{
    public static CreativeTabs tabSoulCraft;

    public CreativeTabsLoader(FMLPreInitializationEvent event)
    {
    	tabSoulCraft = new CreativeTabsSoulCraft();
    }
}