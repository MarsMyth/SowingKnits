package org.mythical_studios.sowing.item;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;
import java.util.Objects;

public class UpgradePlatingItem extends Item {
    private final String UpgradeTeir;

    public UpgradePlatingItem(Settings settings, String upgradeTeir) {
        super(settings);
        UpgradeTeir = upgradeTeir;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {

        if (!Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.spacer"));
            tooltip.add(Text.translatable("tooltip.shift"));
        } else {
            if (Objects.equals(UpgradeTeir, "Copper")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.copper"));
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.plating.desc"));

            } else if (Objects.equals(UpgradeTeir, "Gold")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.gold"));
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.plating.desc"));

            } else if (Objects.equals(UpgradeTeir, "Iron")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.iron"));
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.plating.desc"));

            } else if (Objects.equals(UpgradeTeir, "Diamond")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.diamond"));
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.plating.desc"));

            } else if (Objects.equals(UpgradeTeir, "Netherite")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.netherite"));
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.plating.desc"));

            }
        }


        super.appendTooltip(stack, context, tooltip, type);
    }
}
