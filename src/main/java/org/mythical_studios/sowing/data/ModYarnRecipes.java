package org.mythical_studios.sowing.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import org.mythical_studios.sowing.init.itemGrouping.ModYarn;
import org.mythical_studios.sowing.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModYarnRecipes extends FabricRecipeProvider {
    public ModYarnRecipes(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.BLACK_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.BLACK_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.BLACK_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.BLUE_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.BLUE_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.BLUE_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.BROWN_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.BROWN_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.BROWN_DYE), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.BROWN_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.CYAN_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.CYAN_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.CYAN_DYE), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.CYAN_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.GRAY_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.GRAY_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.GRAY_DYE), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.GRAY_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.GREEN_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.GREEN_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.GREEN_DYE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.GREEN_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.LIGHT_BLUE_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.LIGHT_BLUE_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.LIGHT_BLUE_DYE), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.LIGHT_BLUE_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.LIGHT_GRAY_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.LIGHT_GRAY_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.LIGHT_GRAY_DYE), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.LIGHT_GRAY_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.LIME_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.LIME_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.LIME_DYE), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.LIME_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.MAGENTA_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.MAGENTA_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.MAGENTA_DYE), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.MAGENTA_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.ORANGE_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.ORANGE_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.ORANGE_DYE), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.ORANGE_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.PINK_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.PINK_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.PINK_DYE), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.PINK_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.PURPLE_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.PURPLE_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.PURPLE_DYE), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.PURPLE_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.RED_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.RED_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.RED_DYE), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.RED_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.WHITE_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.WHITE_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.WHITE_YARN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModYarn.YELLOW_YARN, 1)
                .input('y', ModTags.Items.YARN)
                .input('d', Items.YELLOW_DYE)
                .pattern("yd")
                .criterion(hasItem(Items.YELLOW_DYE), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModYarn.YELLOW_YARN)));

    }
}
