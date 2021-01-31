package net.fabricmc.errormod;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ERRArmor implements ArmorMaterial {
    public static final int[] BASE_DURABILITY = new int[]{2147483647,2147483647,2147483647,2147483647};
    public static final int[] BASE_PROTECTION_AMOUNT = new int[]{2147483647,2147483647,2147483647,2147483647};

    @Override
    public int getDurability(EquipmentSlot arg0) {
        return BASE_DURABILITY[arg0.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot arg0) {
        return BASE_PROTECTION_AMOUNT[arg0.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 2147483647;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return "err_armor";
    }

    @Override
    public float getToughness() {
        return 2147483647;
    }

    @Override
    public float getKnockbackResistance() {
        return 2147483647;
    }
}