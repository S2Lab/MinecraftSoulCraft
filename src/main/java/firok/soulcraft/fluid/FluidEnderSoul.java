package firok.soulcraft.fluid;

import firok.soulcraft.SoulCraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidEnderSoul extends Fluid
{
    public static final ResourceLocation still = new ResourceLocation(SoulCraft.MODID + ":" + "fluid/endersoul_still");
    public static final ResourceLocation flowing = new ResourceLocation(SoulCraft.MODID + ":" + "fluid/endersoul_flow");

    public FluidEnderSoul()
    {
        super("endersoul", FluidEnderSoul.still, FluidEnderSoul.flowing);
        this.setUnlocalizedName("fluidEnderSoul");
        this.setDensity(100);
        this.setViscosity(100);
        this.setLuminosity(0);
        this.setTemperature(300);
    }
}