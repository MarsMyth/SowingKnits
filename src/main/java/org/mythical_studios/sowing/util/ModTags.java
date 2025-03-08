package org.mythical_studios.sowing.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.mythical_studios.sowing.SowingKnits;

public class ModTags {



    public static class Items {

        public static TagKey<Item> YARN = createTag("yarn");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(SowingKnits.MOD_ID, name));
        }
    }

}
