package org.mythical_studios.sowing.init.itemGrouping;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.mythical_studios.sowing.SowingKnits;
import org.mythical_studios.sowing.item.UpgradePlatingItem;

public class ModUpgradeTemplates {

    public static Item COPPER_PLATING;
    public static Item GOLD_PLATING;
    public static Item IRON_PLATING;
    public static Item DIAMOND_PLATING;
    public static Item NETHERITE_PLATING;



    public static void init() {

        COPPER_PLATING = createItem("copper_plating", new UpgradePlatingItem(new Item.Settings(), "Copper"));
        GOLD_PLATING = createItem("gold_plating", new UpgradePlatingItem(new Item.Settings(), "Gold"));
        IRON_PLATING = createItem("iron_plating", new UpgradePlatingItem(new Item.Settings(), "Iron"));
        DIAMOND_PLATING = createItem("diamond_plating", new UpgradePlatingItem(new Item.Settings(), "Diamond"));
        NETHERITE_PLATING = createItem("netherite_plating", new UpgradePlatingItem(new Item.Settings(), "Netherite"));

    }


    private static Item createItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SowingKnits.MOD_ID, name), item);
    }
}
