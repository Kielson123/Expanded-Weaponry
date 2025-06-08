package com.kielson.datagen;

import com.kielson.item.ExpandedWeaponryItems;
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
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.WOODEN_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .input('b', ItemTags.PLANKS)
                        .input('s', Items.STICK)
                        .criterion("planks", conditionsFromTag(ItemTags.PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.STONE_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .input('b', ItemTags.STONE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion("stone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.IRON_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .input('b', Items.IRON_INGOT)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.GOLDEN_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .input('b', Items.GOLD_INGOT)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.DIAMOND_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .input('b', Items.DIAMOND)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                offerNetheriteUpgradeRecipe(ExpandedWeaponryItems.DIAMOND_DAGGER, RecipeCategory.COMBAT, ExpandedWeaponryItems.NETHERITE_DAGGER);


                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.WOODEN_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .input('h', ItemTags.PLANKS)
                        .input('s', Items.STICK)
                        .criterion("planks", conditionsFromTag(ItemTags.PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.STONE_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .input('h', ItemTags.STONE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion("stone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.IRON_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .input('h', Items.IRON_INGOT)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.GOLDEN_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .input('h', Items.GOLD_INGOT)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.DIAMOND_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .input('h', Items.DIAMOND)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                offerNetheriteUpgradeRecipe(ExpandedWeaponryItems.DIAMOND_HAMMER, RecipeCategory.COMBAT, ExpandedWeaponryItems.NETHERITE_HAMMER);


                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.WOODEN_SPEAR)
                        .pattern("b  ")
                        .pattern(" s ")
                        .pattern("  s")
                        .input('b', ItemTags.PLANKS)
                        .input('s', Items.STICK)
                        .criterion("planks", conditionsFromTag(ItemTags.PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.STONE_SPEAR)
                        .pattern("b  ")
                        .pattern(" s ")
                        .pattern("  s")
                        .input('b', ItemTags.STONE_TOOL_MATERIALS)
                        .input('s', Items.STICK)
                        .criterion("stone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.IRON_SPEAR)
                        .pattern("b  ")
                        .pattern(" s ")
                        .pattern("  s")
                        .input('b', Items.IRON_INGOT)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.GOLDEN_SPEAR)
                        .pattern("b  ")
                        .pattern(" s ")
                        .pattern("  s")
                        .input('b', Items.GOLD_INGOT)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.DIAMOND_SPEAR)
                        .pattern("b  ")
                        .pattern(" s ")
                        .pattern("  s")
                        .input('b', Items.DIAMOND)
                        .input('s', Items.STICK)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                offerNetheriteUpgradeRecipe(ExpandedWeaponryItems.DIAMOND_SPEAR, RecipeCategory.COMBAT, ExpandedWeaponryItems.NETHERITE_SPEAR);


                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.LONGBOW)
                        .pattern("hhs")
                        .pattern("h s")
                        .pattern("hhs")
                        .input('h', Items.STICK)
                        .input('s', Items.STRING)
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.SLINGSHOT)
                        .pattern("hsh")
                        .pattern(" h ")
                        .input('h', Items.STICK)
                        .input('s', Items.STRING)
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_IRON_BOOTS)
                        .pattern("# #")
                        .pattern("b #")
                        .input('#', Items.IRON_INGOT)
                        .input('b', Items.IRON_BLOCK)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_IRON_LEGGINGS)
                        .pattern("#b#")
                        .pattern("# #")
                        .pattern("# #")
                        .input('#', Items.IRON_INGOT)
                        .input('b', Items.IRON_BLOCK)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_IRON_CHESTPLATE)
                        .pattern("# #")
                        .pattern("#b#")
                        .pattern("###")
                        .input('#', Items.IRON_INGOT)
                        .input('b', Items.IRON_BLOCK)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_IRON_HELMET)
                        .pattern("#b#")
                        .pattern("# #")
                        .input('#', Items.IRON_INGOT)
                        .input('b', Items.IRON_BLOCK)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_GOLDEN_BOOTS)
                        .pattern("# #")
                        .pattern("b #")
                        .input('#', Items.GOLD_INGOT)
                        .input('b', Items.GOLD_BLOCK)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_GOLDEN_LEGGINGS)
                        .pattern("#b#")
                        .pattern("# #")
                        .pattern("# #")
                        .input('#', Items.GOLD_INGOT)
                        .input('b', Items.GOLD_BLOCK)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_GOLDEN_CHESTPLATE)
                        .pattern("# #")
                        .pattern("#b#")
                        .pattern("###")
                        .input('#', Items.GOLD_INGOT)
                        .input('b', Items.GOLD_BLOCK)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_GOLDEN_HELMET)
                        .pattern("#b#")
                        .pattern("# #")
                        .input('#', Items.GOLD_INGOT)
                        .input('b', Items.GOLD_BLOCK)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_DIAMOND_BOOTS)
                        .pattern("# #")
                        .pattern("b #")
                        .input('#', Items.DIAMOND)
                        .input('b', Items.DIAMOND_BLOCK)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_DIAMOND_LEGGINGS)
                        .pattern("#b#")
                        .pattern("# #")
                        .pattern("# #")
                        .input('#', Items.DIAMOND)
                        .input('b', Items.DIAMOND_BLOCK)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_DIAMOND_CHESTPLATE)
                        .pattern("# #")
                        .pattern("#b#")
                        .pattern("###")
                        .input('#', Items.DIAMOND)
                        .input('b', Items.DIAMOND_BLOCK)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_DIAMOND_HELMET)
                        .pattern("#b#")
                        .pattern("# #")
                        .input('#', Items.DIAMOND)
                        .input('b', Items.DIAMOND_BLOCK)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);

                offerNetheriteUpgradeRecipe(ExpandedWeaponryItems.HEAVY_DIAMOND_BOOTS, RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_NETHERITE_BOOTS);
                offerNetheriteUpgradeRecipe(ExpandedWeaponryItems.HEAVY_DIAMOND_LEGGINGS, RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_NETHERITE_LEGGINGS);
                offerNetheriteUpgradeRecipe(ExpandedWeaponryItems.HEAVY_DIAMOND_CHESTPLATE, RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_NETHERITE_CHESTPLATE);
                offerNetheriteUpgradeRecipe(ExpandedWeaponryItems.HEAVY_DIAMOND_HELMET, RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_NETHERITE_HELMET);
            }
        };
    }

    @Override
    public String getName() {
        return "KielsonsECRecipeProvider";
    }
}
