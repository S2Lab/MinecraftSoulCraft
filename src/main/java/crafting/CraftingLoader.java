package crafting;

import firok.soulcraft.block.BlockLoader;
import firok.soulcraft.item.ItemLoader;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLoader
{
    public CraftingLoader()
    {
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe()
    {
    	GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.testItem), new Object[]
    	        {
    	                "###", "#*#", "###", '#', Items.GOLD_INGOT, '*', Items.EGG
    	        });
    	        GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.testBlock), new Object[]
    	        {
    	                "##", "##", '#', Blocks.VINE
    	        });
    	        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.VINE, 4), BlockLoader.testBlock);
    	        GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.silverPickaxe), new Object[]
    	                {
    	                        "###", " * ", " * ", '#', ItemLoader.ingotSilver, '*', Items.STICK
    	                });
    	    
    }

    private static void registerSmelting()
    {

    }

    private static void registerFuel()
    {

    }
}