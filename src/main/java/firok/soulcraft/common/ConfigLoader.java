package firok.soulcraft.common;

import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

public class ConfigLoader
{
    private static Configuration config;

    private static Logger logger;

    public static int diamondBurnTime;
    
    // 银盔甲属性
    public static int[] silverArmor_reductionAmounts={2, 6, 4, 2};
    public static int silverArmor_durability=200;
	public static int silverArmor_enchantability=10;
	public static SoundEvent silverArmor_soundOnEquip=null;
	public static float silverArmor_toughness=0;
	
	// 魂铁盔甲属性
	public static int[] soulironArmor_reductionAmounts={2, 6, 4, 2};
    public static int soulironArmor_durability=200;
	public static int soulironArmor_enchantability=10;
	public static SoundEvent soulironArmor_soundOnEquip=null;
	public static float soulironArmor_toughness=0;
	
	// 魂金盔甲属性
	public static int[] soulgoldArmor_reductionAmounts={2, 6, 4, 2};
    public static int soulgoldArmor_durability=200;
	public static int soulgoldArmor_enchantability=10;
	public static SoundEvent soulgoldArmor_soundOnEquip=null;
	public static float soulgoldArmor_toughness=0;
	
	// 魂银盔甲属性
	public static int[] soulsilverArmor_reductionAmounts={2, 6, 4, 2};
    public static int soulsilverArmor_durability=200;
	public static int soulsilverArmor_enchantability=10;
	public static SoundEvent soulsilverArmor_soundOnEquip=null;
	public static float soulsilverArmor_toughness=0;


	// 银工具属性
	
	// 魂铁工具属性
	
	// 魂金工具属性
	
	// 魂银工具属性
	
	// 液态灵魂属性
	
	// 物品掉落率

    public ConfigLoader(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();
        load();
    }

    public static void load()
    {
        logger.info("Started loading config. ");
        String comment;

        comment = "How many seconds can a diamond burn in a furnace. ";
        diamondBurnTime = config.get(Configuration.CATEGORY_GENERAL, "diamondBurnTime", 640, comment).getInt();

        config.save();
        logger.info("Finished loading config. ");
    }

    public static Logger logger()
    {
        return logger;
    }
}