package com.ujhhgtg.errormod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ErrorMod implements ModInitializer {
    public static final ArmorMaterial ERR_ARMOR = new ERRArmor();
    public static final ItemGroup ERR_GROUP = FabricItemGroupBuilder.build(new Identifier("errormod", "err_group"),() -> new ItemStack(ErrorMod.ERR_ITEM));
    public static final String MODID = "errormod";
    public static final Item ERR_ITEM = new Item(new Item.Settings().group(ERR_GROUP));
    public static final Block ERR_BLOCK = new Block(FabricBlockSettings.of(Material.DENSE_ICE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES, 2).hardness(10));
    public static final Item ERR_FOOD = new Item(new Item.Settings().group(ERR_GROUP).food((new FoodComponent.Builder()).hunger(20).meat().snack().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,2147483647,255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,2147483647,255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,2147483647,3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,2147483647,7), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,2147483647,5), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,2147483647,255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY,2147483647,255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,2147483647,255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,2147483647,255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,2147483647,255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,2147483647,255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,2147483647,255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,2147483647,255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,2147483647,255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,2147483647,255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,2147483647,255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,2147483647,255), 1.0F)
            .saturationModifier(1.0F).build()).maxCount(64));
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "err_item"), ERR_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "err_block"), ERR_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MODID, "err_block"), new BlockItem(ERR_BLOCK, new Item.Settings().group(ERR_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "err_food"), ERR_FOOD);
        Registry.register(Registry.ITEM, new Identifier(MODID, "err_helmet"), new BaseArmor(ERR_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MODID, "err_chestplate"), new BaseArmor(ERR_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MODID, "err_leggings"), new BaseArmor(ERR_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MODID, "err_boots"), new BaseArmor(ERR_ARMOR, EquipmentSlot.FEET));
        System.out.println("[ERROR Items Mod] > Mod Initialized Successful!");
    }
}