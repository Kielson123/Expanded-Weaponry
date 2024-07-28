package com.kielson.datagen;

import com.kielson.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static com.kielson.KielsonsEnhancedCombat.MOD_ID;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        generateDaggers(exporter);
    }

    private void generateDaggers(RecipeExporter exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_DAGGER).pattern("b").pattern("s")
                .input('b', ItemTags.PLANKS)
                .input('s', Items.STICK)
                .criterion("planks", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(MOD_ID, getRecipeName(ModItems.WOODEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STONE_DAGGER).pattern("b").pattern("s")
                .input('b', ItemTags.STONE_TOOL_MATERIALS)
                .input('s', Items.STICK)
                .criterion("stone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(MOD_ID, getRecipeName(ModItems.STONE_DAGGER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_DAGGER).pattern("b").pattern("s")
                .input('b', Items.IRON_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(MOD_ID, getRecipeName(ModItems.IRON_DAGGER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLDEN_DAGGER).pattern("b").pattern("s")
                .input('b', Items.GOLD_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(MOD_ID, getRecipeName(ModItems.GOLDEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_DAGGER).pattern("b").pattern("s")
                .input('b', Items.DIAMOND)
                .input('s', Items.STICK)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(MOD_ID, getRecipeName(ModItems.DIAMOND_DAGGER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NETHERITE_DAGGER).pattern("b").pattern("s")
                .input('b', Items.NETHERITE_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(MOD_ID, getRecipeName(ModItems.NETHERITE_DAGGER)));
    }
}
