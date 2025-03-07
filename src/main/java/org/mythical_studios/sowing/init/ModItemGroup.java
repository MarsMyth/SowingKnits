package org.mythical_studios.sowing.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.mythical_studios.sowing.SowingKnits;
import org.mythical_studios.sowing.init.itemGrouping.ModYarn;

public class ModItemGroup {

    public static ItemGroup SOWING_KNITS;
    public static ItemGroup SOWING_EXTRAS;

    public static void init() {

        SOWING_KNITS = Registry.register(Registries.ITEM_GROUP,
                Identifier.of(SowingKnits.MOD_ID, "sowing_knits"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sowing_knits"))
                        .icon(() -> new ItemStack(ModYarn.WHITE_YARN)).entries((displayContext, entries) -> {

                            entries.add(ModYarn.WHITE_YARN);

                        }).build());

        SOWING_EXTRAS = Registry.register(Registries.ITEM_GROUP,
                Identifier.of(SowingKnits.MOD_ID, "sowing_extras"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sowing_extras"))
                        .icon(() -> new ItemStack(ModYarn.LIGHT_BLUE_YARN)).entries((displayContext, entries) -> {

                            entries.add(ModYarn.BLACK_YARN);
                            entries.add(ModYarn.BLUE_YARN);
                            entries.add(ModYarn.BROWN_YARN);
                            entries.add(ModYarn.CYAN_YARN);
                            entries.add(ModYarn.GRAY_YARN);
                            entries.add(ModYarn.GREEN_YARN);
                            entries.add(ModYarn.LIGHT_BLUE_YARN);
                            entries.add(ModYarn.LIGHT_GRAY_YARN);
                            entries.add(ModYarn.LIME_YARN);
                            entries.add(ModYarn.MAGENTA_YARN);
                            entries.add(ModYarn.ORANGE_YARN);
                            entries.add(ModYarn.PINK_YARN);
                            entries.add(ModYarn.PURPLE_YARN);
                            entries.add(ModYarn.RED_YARN);
                            entries.add(ModYarn.YELLOW_YARN);

                        }).build());

    }
}
