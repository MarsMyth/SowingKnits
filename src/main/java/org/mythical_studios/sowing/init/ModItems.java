package org.mythical_studios.sowing.init;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.mythical_studios.sowing.SowingKnits;

public class ModItems {


    public static void init() {


    }


    private static Item createItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SowingKnits.MOD_ID, name), item);
    }
}
