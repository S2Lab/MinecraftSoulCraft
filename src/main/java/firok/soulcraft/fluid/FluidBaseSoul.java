package firok.soulcraft.fluid;

import firok.soulcraft.SoulCraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidBaseSoul extends Fluid
{
    public static final ResourceLocation still = new ResourceLocation(SoulCraft.MODID + ":" + "fluid/basesoul_still");
    public static final ResourceLocation flowing = new ResourceLocation(SoulCraft.MODID + ":" + "fluid/basesoul_flow");

    public FluidBaseSoul()
    {
        super("basesoul", FluidBaseSoul.still, FluidBaseSoul.flowing);
        this.setUnlocalizedName("fluidBaseSoul");
        this.setDensity(100);
        this.setViscosity(100);
        this.setLuminosity(0);
        this.setTemperature(300);
    }
}