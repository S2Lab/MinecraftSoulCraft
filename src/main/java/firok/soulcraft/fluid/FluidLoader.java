package firok.soulcraft.fluid;

import firok.soulcraft.SoulCraft;
import firok.soulcraft.block.BlockLoader;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class FluidLoader
{
    public static Fluid fluidBaseSoul = new FluidBaseSoul();
    public static Fluid fluidEnderSoul =new FluidEnderSoul();

    public FluidLoader(FMLPreInitializationEvent event)
    {
        if (FluidRegistry.isFluidRegistered(fluidBaseSoul))
        {
            event.getModLog().info("Found fluid {}, the registration is canceled. ", fluidBaseSoul.getName());
            fluidBaseSoul = FluidRegistry.getFluid(fluidBaseSoul.getName());
        }
        else
        {
            FluidRegistry.registerFluid(fluidBaseSoul);
        }
        
        if (FluidRegistry.isFluidRegistered(fluidEnderSoul))
        {
            event.getModLog().info("Found fluid {}, the registration is canceled. ", fluidEnderSoul.getName());
            fluidEnderSoul = FluidRegistry.getFluid(fluidEnderSoul.getName());
        }
        else
        {
            FluidRegistry.registerFluid(fluidEnderSoul);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerFluidRender((BlockFluidBase) BlockLoader.fluidBaseSoul, "fluid_basesoul");
        registerFluidRender((BlockFluidBase) BlockLoader.fluidEnderSoul, "fluid_endersoul");
    }

    @SideOnly(Side.CLIENT)
    public static void registerFluidRender(BlockFluidBase blockFluid, String blockStateName)
    {
        final String location = SoulCraft.MODID + ":" + blockStateName;
        final Item itemFluid = Item.getItemFromBlock(blockFluid);
        ModelLoader.setCustomMeshDefinition(itemFluid, new ItemMeshDefinition()
        {
            public ModelResourceLocation getModelLocation1(ItemStack stack)
            {
                return new ModelResourceLocation(location, "fluid");
            }

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				// TODO 自动生成的方法存根
				return null;
			}
        });
        ModelLoader.setCustomStateMapper(blockFluid, new StateMapperBase()
        {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state)
            {
                return new ModelResourceLocation(location, "fluid");
            }
        });
    }
}