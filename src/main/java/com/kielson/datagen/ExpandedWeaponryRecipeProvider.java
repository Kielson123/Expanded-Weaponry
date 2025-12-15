package com.kielson.datagen;

import com.kielson.item.ExpandedWeaponryItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import java.util.concurrent.CompletableFuture;

public class ExpandedWeaponryRecipeProvider extends FabricRecipeProvider {

    public ExpandedWeaponryRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.WOODEN_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .define('b', ItemTags.PLANKS)
                        .define('s', Items.STICK)
                        .unlockedBy("planks", has(ItemTags.PLANKS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.STONE_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .define('b', ItemTags.STONE_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("stone", has(ItemTags.STONE_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.COPPER_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .define('b', Items.COPPER_INGOT)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.IRON_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .define('b', Items.IRON_INGOT)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.GOLDEN_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .define('b', Items.GOLD_INGOT)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.DIAMOND_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .define('b', Items.DIAMOND)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                netheriteSmithing(ExpandedWeaponryItems.DIAMOND_DAGGER, RecipeCategory.COMBAT, ExpandedWeaponryItems.NETHERITE_DAGGER);


                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.WOODEN_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .define('h', ItemTags.PLANKS)
                        .define('s', Items.STICK)
                        .unlockedBy("planks", has(ItemTags.PLANKS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.STONE_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .define('h', ItemTags.STONE_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("stone", has(ItemTags.STONE_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.COPPER_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .define('h', Items.COPPER_INGOT)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.IRON_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .define('h', Items.IRON_INGOT)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.GOLDEN_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .define('h', Items.GOLD_INGOT)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.DIAMOND_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .define('h', Items.DIAMOND)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                netheriteSmithing(ExpandedWeaponryItems.DIAMOND_HAMMER, RecipeCategory.COMBAT, ExpandedWeaponryItems.NETHERITE_HAMMER);


                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.LONGBOW)
                        .pattern("hhs")
                        .pattern("h s")
                        .pattern("hhs")
                        .define('h', Items.STICK)
                        .define('s', Items.STRING)
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .unlockedBy(getHasName(Items.STRING), has(Items.STRING))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.SLINGSHOT)
                        .pattern("hsh")
                        .pattern(" h ")
                        .define('h', Items.STICK)
                        .define('s', Items.STRING)
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .unlockedBy(getHasName(Items.STRING), has(Items.STRING))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_COPPER_BOOTS)
                        .pattern("# #")
                        .pattern("b #")
                        .define('#', Items.COPPER_INGOT)
                        .define('b', Items.COPPER_BLOCK)
                        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_COPPER_LEGGINGS)
                        .pattern("#b#")
                        .pattern("# #")
                        .pattern("# #")
                        .define('#', Items.COPPER_INGOT)
                        .define('b', Items.COPPER_BLOCK)
                        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_COPPER_CHESTPLATE)
                        .pattern("# #")
                        .pattern("#b#")
                        .pattern("###")
                        .define('#', Items.COPPER_INGOT)
                        .define('b', Items.COPPER_BLOCK)
                        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_COPPER_HELMET)
                        .pattern("#b#")
                        .pattern("# #")
                        .define('#', Items.COPPER_INGOT)
                        .define('b', Items.COPPER_BLOCK)
                        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_IRON_BOOTS)
                        .pattern("# #")
                        .pattern("b #")
                        .define('#', Items.IRON_INGOT)
                        .define('b', Items.IRON_BLOCK)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_IRON_LEGGINGS)
                        .pattern("#b#")
                        .pattern("# #")
                        .pattern("# #")
                        .define('#', Items.IRON_INGOT)
                        .define('b', Items.IRON_BLOCK)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_IRON_CHESTPLATE)
                        .pattern("# #")
                        .pattern("#b#")
                        .pattern("###")
                        .define('#', Items.IRON_INGOT)
                        .define('b', Items.IRON_BLOCK)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_IRON_HELMET)
                        .pattern("#b#")
                        .pattern("# #")
                        .define('#', Items.IRON_INGOT)
                        .define('b', Items.IRON_BLOCK)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_GOLDEN_BOOTS)
                        .pattern("# #")
                        .pattern("b #")
                        .define('#', Items.GOLD_INGOT)
                        .define('b', Items.GOLD_BLOCK)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_GOLDEN_LEGGINGS)
                        .pattern("#b#")
                        .pattern("# #")
                        .pattern("# #")
                        .define('#', Items.GOLD_INGOT)
                        .define('b', Items.GOLD_BLOCK)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_GOLDEN_CHESTPLATE)
                        .pattern("# #")
                        .pattern("#b#")
                        .pattern("###")
                        .define('#', Items.GOLD_INGOT)
                        .define('b', Items.GOLD_BLOCK)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_GOLDEN_HELMET)
                        .pattern("#b#")
                        .pattern("# #")
                        .define('#', Items.GOLD_INGOT)
                        .define('b', Items.GOLD_BLOCK)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_DIAMOND_BOOTS)
                        .pattern("# #")
                        .pattern("b #")
                        .define('#', Items.DIAMOND)
                        .define('b', Items.DIAMOND_BLOCK)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_DIAMOND_LEGGINGS)
                        .pattern("#b#")
                        .pattern("# #")
                        .pattern("# #")
                        .define('#', Items.DIAMOND)
                        .define('b', Items.DIAMOND_BLOCK)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_DIAMOND_CHESTPLATE)
                        .pattern("# #")
                        .pattern("#b#")
                        .pattern("###")
                        .define('#', Items.DIAMOND)
                        .define('b', Items.DIAMOND_BLOCK)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_DIAMOND_HELMET)
                        .pattern("#b#")
                        .pattern("# #")
                        .define('#', Items.DIAMOND)
                        .define('b', Items.DIAMOND_BLOCK)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(output);

                netheriteSmithing(ExpandedWeaponryItems.HEAVY_DIAMOND_BOOTS, RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_NETHERITE_BOOTS);
                netheriteSmithing(ExpandedWeaponryItems.HEAVY_DIAMOND_LEGGINGS, RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_NETHERITE_LEGGINGS);
                netheriteSmithing(ExpandedWeaponryItems.HEAVY_DIAMOND_CHESTPLATE, RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_NETHERITE_CHESTPLATE);
                netheriteSmithing(ExpandedWeaponryItems.HEAVY_DIAMOND_HELMET, RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_NETHERITE_HELMET);
            }
        };
    }

    @Override
    public String getName() {
        return "KielsonsECRecipeProvider";
    }
}
