package firok.soulcraft.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader
{
    public static Item testItem = new ItemTestItem();
    public static Item ingotSilver =new ItemIngotSilver();
    
    public static Item silverSword=new ItemSilverSword();
    public static Item silverPickaxe =new ItemSilverPickaxe();
    public static Item silverAxe = new ItemSilverAxe();
    public static Item silverHoe =new ItemSilverHoe();
    public static Item silverShovel=new ItemSilverShovel();
    public static Item soulironSword=new ItemSoulIronSword();
    public static Item soulironPickaxe =new ItemSoulIronPickaxe();
    public static Item soulironAxe = new ItemSoulIronAxe();
    public static Item soulironHoe =new ItemSoulIronHoe();
    public static Item soulironShovel=new ItemSoulIronShovel();
    
    
    public static Item silverHelmet=new ItemSilverArmor.Helmet();
    public static Item silverChestplate=new ItemSilverArmor.Chestplate();
    public static Item silverLeggings=new ItemSilverArmor.Leggings();
    public static Item silverBoots=new ItemSilverArmor.Boots();
    public static Item bucketBaseSoul=new ItemBucketBaseSoul();
    public static Item bucketEnderSoul =new ItemBucketEnderSoul();
    public static Item coreSoul =new ItemCoreBaseSoul();
    

    public ItemLoader(FMLPreInitializationEvent event)
    {
        register(testItem, "test_item");
        register(ingotSilver,"ingot_silver");
        
        register(silverSword,"silver_sword");
        register(silverPickaxe,"silver_pickaxe");
        register(silverAxe,"silver_axe");
        register(silverHoe,"silver_hoe");
        register(silverShovel,"silver_shovel");
        register(soulironSword,"souliron_sword");
        register(soulironPickaxe,"souliron_pickaxe");
        register(soulironAxe,"souliron_axe");
        register(soulironHoe,"souliron_hoe");
        register(soulironShovel,"souliron_shovel");
        
        register(silverHelmet,"silver_helmet");
        register(silverChestplate,"silver_chestplate");
        register(silverLeggings,"silver_leggings");
        register(silverBoots,"silver_boots");
        register(bucketBaseSoul,"bucket_basesoul");
        register(bucketEnderSoul,"bucket_endersoul");
        register(coreSoul,"core_basesoul");
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(testItem);
        registerRender(ingotSilver);
        
        registerRender(silverSword);
        registerRender(silverPickaxe);
        registerRender(silverAxe);
        registerRender(silverHoe);
        registerRender(silverShovel);
        registerRender(soulironSword);
        registerRender(soulironPickaxe);
        registerRender(soulironAxe);
        registerRender(soulironHoe);
        registerRender(soulironShovel);
        
        registerRender(silverHelmet);
        registerRender(silverChestplate);
        registerRender(silverLeggings);
        registerRender(silverBoots);
        registerRender(bucketBaseSoul);
        registerRender(bucketEnderSoul);
        registerRender(coreSoul);
        
    }

    
    // ����ֻ��дһ�ξͺ�
    private static void register(Item item, String name)
    {
        GameRegistry.registerItem(item, name);
    }
    
    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        String name = GameData.getItemRegistry().getNameForObject(item).toString();
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(name, "inventory"));
    }
}