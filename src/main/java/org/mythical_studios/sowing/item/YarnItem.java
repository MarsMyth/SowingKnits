package org.mythical_studios.sowing.item;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;
import java.util.Objects;

public class YarnItem extends Item {
    private final String WOOL_COLOR;

    public YarnItem(Settings settings, String woolColor) {
        super(settings);
        WOOL_COLOR = woolColor;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        
        if (!Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.spacer"));
            tooltip.add(Text.translatable("tooltip.shift"));
        } else {
            if (Objects.equals(WOOL_COLOR, "Black")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.black"));

            } else if (Objects.equals(WOOL_COLOR, "Blue")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.blue"));

            } else if (Objects.equals(WOOL_COLOR, "Brown")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.brown"));

            } else if (Objects.equals(WOOL_COLOR, "Cyan")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.cyan"));

            } else if (Objects.equals(WOOL_COLOR, "Gray")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.gray"));

            } else if (Objects.equals(WOOL_COLOR, "Green")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.green"));

            } else if (Objects.equals(WOOL_COLOR, "Light Blue")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.light_blue"));

            } else if (Objects.equals(WOOL_COLOR, "Light Gray")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.light_gray"));

            } else if (Objects.equals(WOOL_COLOR, "Lime")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.lime"));

            } else if (Objects.equals(WOOL_COLOR, "Magenta")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.magenta"));

            } else if (Objects.equals(WOOL_COLOR, "Orange")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.orange"));

            } else if (Objects.equals(WOOL_COLOR, "Pink")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.pink"));

            } else if (Objects.equals(WOOL_COLOR, "Purple")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.purple"));

            } else if (Objects.equals(WOOL_COLOR, "Red")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.red"));

            } else if (Objects.equals(WOOL_COLOR, "White")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.white"));

            } else if (Objects.equals(WOOL_COLOR, "Yellow")) {
                tooltip.add(Text.translatable("tooltip.spacer"));
                tooltip.add(Text.translatable("tooltip.yellow"));

            }
        }


        super.appendTooltip(stack, context, tooltip, type);
    }
}
