
package org.mythical_studios.sowing.init.yarn;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.mythical_studios.sowing.SowingKnits;
import org.mythical_studios.sowing.item.YarnItem;

public class ModYarn {

    public static Item BLACK_YARN;
    public static Item BLUE_YARN;
    public static Item BROWN_YARN;
    public static Item CYAN_YARN;
    public static Item GRAY_YARN;
    public static Item GREEN_YARN;
    public static Item LIGHT_BLUE_YARN;
    public static Item LIGHT_GRAY_YARN;
    public static Item LIME_YARN;
    public static Item MAGENTA_YARN;
    public static Item ORANGE_YARN;
    public static Item PINK_YARN;
    public static Item PURPLE_YARN;
    public static Item RED_YARN;
    public static Item WHITE_YARN;
    public static Item YELLOW_YARN;

    public static void init() {

        BLACK_YARN = createItem("black_yarn", new YarnItem(new Item.Settings(), "Black"));
        BLUE_YARN = createItem("blue_yarn", new YarnItem(new Item.Settings(), "Blue"));
        BROWN_YARN = createItem("brown_yarn", new YarnItem(new Item.Settings(), "Brown"));
        CYAN_YARN = createItem("cyan_yarn", new YarnItem(new Item.Settings(), "Cyan"));
        GRAY_YARN = createItem("gray_yarn", new YarnItem(new Item.Settings(), "Gray"));
        GREEN_YARN = createItem("green_yarn", new YarnItem(new Item.Settings(), "Green"));
        LIGHT_BLUE_YARN = createItem("light_blue_yarn", new YarnItem(new Item.Settings(), "Light Blue"));
        LIGHT_GRAY_YARN = createItem("light_gray_yarn", new YarnItem(new Item.Settings(), "Light Gray"));
        LIME_YARN = createItem("lime_yarn", new YarnItem(new Item.Settings(), "Lime"));
        MAGENTA_YARN = createItem("magenta_yarn", new YarnItem(new Item.Settings(), "Magenta"));
        ORANGE_YARN = createItem("orange_yarn", new YarnItem(new Item.Settings(), "Orange"));
        PINK_YARN = createItem("pink_yarn", new YarnItem(new Item.Settings(), "Pink"));
        PURPLE_YARN = createItem("purple_yarn", new YarnItem(new Item.Settings(), "Purple"));
        RED_YARN = createItem("red_yarn", new YarnItem(new Item.Settings(), "Red"));
        WHITE_YARN = createItem("white_yarn", new YarnItem(new Item.Settings(), "White"));
        YELLOW_YARN = createItem("yellow_yarn", new YarnItem(new Item.Settings(), "Yellow"));

    }


    private static Item createItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SowingKnits.MOD_ID, name), item);
    }
}
