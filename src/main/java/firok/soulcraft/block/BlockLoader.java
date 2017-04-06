package firok.soulcraft.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader
{
    public static Block testBlock = new BlockTestBlock();
    public static Block silverBlock =new BlockBlockSilver();
    public static Block silverOre = new BlockOreSilver();
    public static Block fluidBaseSoul=new BlockFluidBaseSoul();
    public static Block fluidEnderSoul =new BlockFluidEnderSoul();

    public BlockLoader(FMLPreInitializationEvent event)
    {
        register(testBlock, "test_block");
        register(silverBlock,"silver_block");
        register(silverOre,"silver_ore");
        register(fluidBaseSoul,"fluid_basesoul");
        register(fluidEnderSoul,"fluid_endersoul");
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(testBlock);
        registerRender(silverBlock);
        registerRender(silverOre);
        registerRender(fluidBaseSoul);
        registerRender(fluidEnderSoul);
    }

    private static void register(Block block, String name)
    {
        GameRegistry.registerBlock(block, name);
    }
    
    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        String name = GameData.getBlockRegistry().getNameForObject(block).toString();
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(name, "inventory"));
    }
}