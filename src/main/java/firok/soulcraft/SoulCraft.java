package firok.soulcraft;

import firok.soulcraft.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SoulCraft.MODID, name = SoulCraft.NAME, version = SoulCraft.VERSION)
public class SoulCraft
{
    public static final String MODID = "soulcraft";
    public static final String NAME = "Soul Craft";
    public static final String VERSION = "0.1.0";

    @Instance(SoulCraft.MODID)
    public static SoulCraft instance;
    
    @SidedProxy(clientSide = "firok.soulcraft.client.ClientProxy", 
            serverSide = "firok.soulcraft.common.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}