package org.mythical_studios.sowing.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import org.mythical_studios.sowing.SowingKnits;
import org.mythical_studios.sowing.init.ModItems;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> CLOTH_ARMOR_TYPE = createArmorType("cloth",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.HELMET, 1);
                map.put(ArmorItem.Type.BODY, 3);
            }), 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(ModItems.OUTFIT_REPAIR_KIT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(SowingKnits.MOD_ID, "cloth"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> COPPER_PLATED = createArmorType("copper_plated",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(ModItems.OUTFIT_REPAIR_KIT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(SowingKnits.MOD_ID, "copper_plated"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> IROnetherite_PLATED = createArmorType("ironetherite_plated",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 5);
            }), 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(ModItems.OUTFIT_REPAIR_KIT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(SowingKnits.MOD_ID, "ironetherite_plated"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> GOLD_PLATED = createArmorType("gold_plated",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 7);
            }), 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(ModItems.OUTFIT_REPAIR_KIT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(SowingKnits.MOD_ID, "gold_plated"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> DIAMOND_PLATED = createArmorType("diamond_plated",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 7);
            }), 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(ModItems.OUTFIT_REPAIR_KIT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(SowingKnits.MOD_ID, "diamond_plated"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> NETHERITE_PLATED = createArmorType("netherite_plated",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 7);
            }), 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(ModItems.OUTFIT_REPAIR_KIT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(SowingKnits.MOD_ID, "netherite_plated"))), 0, 0));
    
    
    
    public static RegistryEntry<ArmorMaterial> createArmorType(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(SowingKnits.MOD_ID, name), material.get());
    }
}    