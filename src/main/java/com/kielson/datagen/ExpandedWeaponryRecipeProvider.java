package com.kielson.datagen;

import com.kielson.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ExpandedWeaponryRecipeProvider extends FabricRecipeProvider {

    public ExpandedWeaponryRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);
                createShaped(RecipeCategory.COMBAT, ModItems.WOODEN_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .input('b', ItemTags.PLANKS)
                        .input('s', Items.STICK)
                        .criterion("planks", conditionsFromTag(ItemTags.PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.STONE_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .input('b', ItemTags.STONE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion("stone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.IRON_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .input('b', Items.IRON_INGOT)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.GOLDEN_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .input('b', Items.GOLD_INGOT)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.DIAMOND_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .input('b', Items.DIAMOND)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                offerNetheriteUpgradeRecipe(ModItems.DIAMOND_DAGGER, RecipeCategory.COMBAT, ModItems.NETHERITE_DAGGER);


                createShaped(RecipeCategory.COMBAT, ModItems.WOODEN_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .input('h', ItemTags.PLANKS)
                        .input('s', Items.STICK)
                        .criterion("planks", conditionsFromTag(ItemTags.PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.STONE_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .input('h', ItemTags.STONE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion("stone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.IRON_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .input('h', Items.IRON_INGOT)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.GOLDEN_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .input('h', Items.GOLD_INGOT)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.DIAMOND_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .input('h', Items.DIAMOND)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                offerNetheriteUpgradeRecipe(ModItems.DIAMOND_HAMMER, RecipeCategory.COMBAT, ModItems.NETHERITE_HAMMER);


                createShaped(RecipeCategory.COMBAT, ModItems.WOODEN_SPEAR)
                        .pattern("b  ")
                        .pattern(" s ")
                        .pattern("  s")
                        .input('b', ItemTags.PLANKS)
                        .input('s', Items.STICK)
                        .criterion("planks", conditionsFromTag(ItemTags.PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.STONE_SPEAR)
                        .pattern("b  ")
                        .pattern(" s ")
                        .pattern("  s")
                        .input('b', ItemTags.STONE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion("stone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.IRON_SPEAR)
                        .pattern("b  ")
                        .pattern(" s ")
                        .pattern("  s")
                        .input('b', Items.IRON_INGOT)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.GOLDEN_SPEAR)
                        .pattern("b  ")
                        .pattern(" s ")
                        .pattern("  s")
                        .input('b', Items.GOLD_INGOT)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.DIAMOND_SPEAR)
                        .pattern("b  ")
                        .pattern(" s ")
                        .pattern("  s")
                        .input('b', Items.DIAMOND)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                offerNetheriteUpgradeRecipe(ModItems.DIAMOND_SPEAR, RecipeCategory.COMBAT, ModItems.NETHERITE_SPEAR);


                createShaped(RecipeCategory.COMBAT, ModItems.SLINGSHOT)
                        .pattern("hsh")
                        .pattern(" h ")
                        .input('h', Items.STICK)
                        .input('s', Items.STRING)
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);

            }
        };
    }

    @Override
    public String getName() {
        return "KielsonsECRecipeProvider";
    }
}
