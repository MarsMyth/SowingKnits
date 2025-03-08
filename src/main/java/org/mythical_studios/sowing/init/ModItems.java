package org.mythical_studios.sowing.init;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.mythical_studios.sowing.SowingKnits;

public class ModItems {

    public static Item OUTFIT_REPAIR_KIT;

    public static void init() {

        OUTFIT_REPAIR_KIT = createItem("outfit_repair_kit", new Item(new Item.Settings()));

    }


    private static Item createItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SowingKnits.MOD_ID, name), item);
    }
}
