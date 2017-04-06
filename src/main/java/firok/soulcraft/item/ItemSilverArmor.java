package firok.soulcraft.item;

import creativetab.CreativeTabsLoader;
import firok.soulcraft.SoulCraft;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSilverArmor extends ItemArmor
{
    public static final ItemArmor.ArmorMaterial SILVER_ARMOR = EnumHelper.addArmorMaterial("SILVER",
            SoulCraft.MODID + ":" + "silver", 10, new int[]
            { 2, 6, 4, 2 }, 10, null, 3.0F);

    public ItemSilverArmor(EntityEquipmentSlot armorType)
    {
        super(SILVER_ARMOR, SILVER_ARMOR.ordinal(), armorType);
    }
    
    
    public static class Helmet extends ItemSilverArmor
    {
        public Helmet()
        {
            super(EntityEquipmentSlot.HEAD);
            this.setUnlocalizedName("silverHelmet");
            this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
        }
    }

    public static class Chestplate extends ItemSilverArmor
    {
        public Chestplate()
        {
            super(EntityEquipmentSlot.CHEST);
            this.setUnlocalizedName("silverChestplate");
            this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
        }
    }

    public static class Leggings extends ItemSilverArmor
    {
        public Leggings()
        {
            super(EntityEquipmentSlot.LEGS);
            this.setUnlocalizedName("silverLeggings");
            this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
        }
    }

    public static class Boots extends ItemSilverArmor
    {
        public Boots()
        {
            super(EntityEquipmentSlot.FEET);
            this.setUnlocalizedName("silverBoots");
            this.setCreativeTab(CreativeTabsLoader.tabSoulCraft);
        }
    }
    
}

