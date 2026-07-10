package com.kielson.datagen;

import com.kielson.item.ExpandedWeaponryItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class ExpandedWeaponryRecipeProvider extends FabricRecipeProvider {

    public ExpandedWeaponryRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected @NonNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider registryLookup, @NonNull RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.WOODEN_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .define('b', ItemTags.WOODEN_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("planks", has(ItemTags.WOODEN_TOOL_MATERIALS))
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
                        .define('b', ItemTags.COPPER_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("copper", has(ItemTags.COPPER_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.IRON_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .define('b', ItemTags.IRON_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("iron", has(ItemTags.IRON_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.GOLDEN_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .define('b', ItemTags.GOLD_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("gold", has(ItemTags.GOLD_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.DIAMOND_DAGGER)
                        .pattern("b")
                        .pattern("s")
                        .define('b', ItemTags.DIAMOND_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("diamond", has(ItemTags.DIAMOND_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                netheriteSmithing(ExpandedWeaponryItems.DIAMOND_DAGGER, RecipeCategory.COMBAT, ExpandedWeaponryItems.NETHERITE_DAGGER);


                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.WOODEN_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .define('h', ItemTags.WOODEN_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("planks", has(ItemTags.WOODEN_TOOL_MATERIALS))
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
                        .define('h', ItemTags.COPPER_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("copper", has(ItemTags.COPPER_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.IRON_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .define('h', ItemTags.IRON_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("iron", has(ItemTags.IRON_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.GOLDEN_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .define('h', ItemTags.GOLD_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("gold", has(ItemTags.GOLD_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.DIAMOND_HAMMER)
                        .pattern("hhh")
                        .pattern("hsh")
                        .pattern(" s ")
                        .define('h', ItemTags.DIAMOND_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("diamond", has(ItemTags.DIAMOND_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                netheriteSmithing(ExpandedWeaponryItems.DIAMOND_HAMMER, RecipeCategory.COMBAT, ExpandedWeaponryItems.NETHERITE_HAMMER);


                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.WOODEN_TWIN_BLADE_SWORD)
                        .pattern("  b")
                        .pattern(" s ")
                        .pattern("b  ")
                        .define('b', ItemTags.WOODEN_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("planks", has(ItemTags.WOODEN_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.STONE_TWIN_BLADE_SWORD)
                        .pattern("  b")
                        .pattern(" s ")
                        .pattern("b  ")
                        .define('b', ItemTags.STONE_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("stone", has(ItemTags.STONE_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.COPPER_TWIN_BLADE_SWORD)
                        .pattern("  b")
                        .pattern(" s ")
                        .pattern("b  ")
                        .define('b', ItemTags.COPPER_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("copper", has(ItemTags.COPPER_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.IRON_TWIN_BLADE_SWORD)
                        .pattern("  b")
                        .pattern(" s ")
                        .pattern("b  ")
                        .define('b', ItemTags.IRON_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("iron", has(ItemTags.IRON_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.GOLDEN_TWIN_BLADE_SWORD)
                        .pattern("  b")
                        .pattern(" s ")
                        .pattern("b  ")
                        .define('b', ItemTags.GOLD_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("gold", has(ItemTags.GOLD_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.DIAMOND_TWIN_BLADE_SWORD)
                        .pattern("  b")
                        .pattern(" s ")
                        .pattern("b  ")
                        .define('b', ItemTags.DIAMOND_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("diamond", has(ItemTags.DIAMOND_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                netheriteSmithing(ExpandedWeaponryItems.DIAMOND_TWIN_BLADE_SWORD, RecipeCategory.COMBAT, ExpandedWeaponryItems.NETHERITE_TWIN_BLADE_SWORD);


                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.WOODEN_GREATSWORD)
                        .pattern(" bb")
                        .pattern("bbb")
                        .pattern("sb ")
                        .define('b', ItemTags.WOODEN_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("planks", has(ItemTags.WOODEN_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.STONE_GREATSWORD)
                        .pattern(" bb")
                        .pattern("bbb")
                        .pattern("sb ")
                        .define('b', ItemTags.STONE_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("stone", has(ItemTags.STONE_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.COPPER_GREATSWORD)
                        .pattern(" bb")
                        .pattern("bbb")
                        .pattern("sb ")
                        .define('b', ItemTags.COPPER_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("copper", has(ItemTags.COPPER_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.IRON_GREATSWORD)
                        .pattern(" bb")
                        .pattern("bbb")
                        .pattern("sb ")
                        .define('b', ItemTags.IRON_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("iron", has(ItemTags.IRON_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.GOLDEN_GREATSWORD)
                        .pattern(" bb")
                        .pattern("bbb")
                        .pattern("sb ")
                        .define('b', ItemTags.GOLD_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("gold", has(ItemTags.GOLD_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.DIAMOND_GREATSWORD)
                        .pattern(" bb")
                        .pattern("bbb")
                        .pattern("sb ")
                        .define('b', ItemTags.DIAMOND_TOOL_MATERIALS)
                        .define('s', Items.STICK)
                        .unlockedBy("diamond", has(ItemTags.DIAMOND_TOOL_MATERIALS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                netheriteSmithing(ExpandedWeaponryItems.DIAMOND_GREATSWORD, RecipeCategory.COMBAT, ExpandedWeaponryItems.NETHERITE_GREATSWORD);


                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.WOODEN_SHIELD)
                        .pattern("pmp")
                        .pattern("ppp")
                        .pattern(" p ")
                        .define('p', ItemTags.PLANKS)
                        .define('m', ItemTags.WOODEN_TOOL_MATERIALS)
                        .unlockedBy("planks", has(ItemTags.PLANKS))
                        .unlockedBy("wood", has(ItemTags.WOODEN_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.STONE_SHIELD)
                        .pattern("pmp")
                        .pattern("ppp")
                        .pattern(" p ")
                        .define('p', ItemTags.PLANKS)
                        .define('m', ItemTags.STONE_TOOL_MATERIALS)
                        .unlockedBy("stone", has(ItemTags.STONE_TOOL_MATERIALS))
                        .unlockedBy("planks", has(ItemTags.PLANKS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.COPPER_SHIELD)
                        .pattern("pmp")
                        .pattern("ppp")
                        .pattern(" p ")
                        .define('p', ItemTags.PLANKS)
                        .define('m', ItemTags.COPPER_TOOL_MATERIALS)
                        .unlockedBy("copper", has(ItemTags.COPPER_TOOL_MATERIALS))
                        .unlockedBy("planks", has(ItemTags.PLANKS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.IRON_SHIELD)
                        .pattern("pmp")
                        .pattern("ppp")
                        .pattern(" p ")
                        .define('p', ItemTags.PLANKS)
                        .define('m', ItemTags.IRON_TOOL_MATERIALS)
                        .unlockedBy("iron", has(ItemTags.IRON_TOOL_MATERIALS))
                        .unlockedBy("planks", has(ItemTags.PLANKS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.GOLDEN_SHIELD)
                        .pattern("pmp")
                        .pattern("ppp")
                        .pattern(" p ")
                        .define('p', ItemTags.PLANKS)
                        .define('m', ItemTags.GOLD_TOOL_MATERIALS)
                        .unlockedBy("gold", has(ItemTags.GOLD_TOOL_MATERIALS))
                        .unlockedBy("planks", has(ItemTags.PLANKS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.DIAMOND_SHIELD)
                        .pattern("pmp")
                        .pattern("ppp")
                        .pattern(" p ")
                        .define('p', ItemTags.PLANKS)
                        .define('m', ItemTags.DIAMOND_TOOL_MATERIALS)
                        .unlockedBy("diamond", has(ItemTags.DIAMOND_TOOL_MATERIALS))
                        .unlockedBy("planks", has(ItemTags.PLANKS))
                        .save(output);
                netheriteSmithing(ExpandedWeaponryItems.DIAMOND_SHIELD, RecipeCategory.COMBAT, ExpandedWeaponryItems.NETHERITE_SHIELD);


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
                        .define('#', ItemTags.COPPER_TOOL_MATERIALS)
                        .define('b', Items.COPPER_BLOCK.weathering().unaffected())
                        .unlockedBy("copper", has(ItemTags.COPPER_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_COPPER_LEGGINGS)
                        .pattern("#b#")
                        .pattern("# #")
                        .pattern("# #")
                        .define('#', ItemTags.COPPER_TOOL_MATERIALS)
                        .define('b', Items.COPPER_BLOCK.weathering().unaffected())
                        .unlockedBy("copper", has(ItemTags.COPPER_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_COPPER_CHESTPLATE)
                        .pattern("# #")
                        .pattern("#b#")
                        .pattern("###")
                        .define('#', ItemTags.COPPER_TOOL_MATERIALS)
                        .define('b', Items.COPPER_BLOCK.weathering().unaffected())
                        .unlockedBy("copper", has(ItemTags.COPPER_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_COPPER_HELMET)
                        .pattern("#b#")
                        .pattern("# #")
                        .define('#', ItemTags.COPPER_TOOL_MATERIALS)
                        .define('b', Items.COPPER_BLOCK.weathering().unaffected())
                        .unlockedBy("copper", has(ItemTags.COPPER_TOOL_MATERIALS))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_IRON_BOOTS)
                        .pattern("# #")
                        .pattern("b #")
                        .define('#', ItemTags.IRON_TOOL_MATERIALS)
                        .define('b', Items.IRON_BLOCK)
                        .unlockedBy("iron", has(ItemTags.IRON_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_IRON_LEGGINGS)
                        .pattern("#b#")
                        .pattern("# #")
                        .pattern("# #")
                        .define('#', ItemTags.IRON_TOOL_MATERIALS)
                        .define('b', Items.IRON_BLOCK)
                        .unlockedBy("iron", has(ItemTags.IRON_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_IRON_CHESTPLATE)
                        .pattern("# #")
                        .pattern("#b#")
                        .pattern("###")
                        .define('#', ItemTags.IRON_TOOL_MATERIALS)
                        .define('b', Items.IRON_BLOCK)
                        .unlockedBy("iron", has(ItemTags.IRON_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_IRON_HELMET)
                        .pattern("#b#")
                        .pattern("# #")
                        .define('#', ItemTags.IRON_TOOL_MATERIALS)
                        .define('b', Items.IRON_BLOCK)
                        .unlockedBy("iron", has(ItemTags.IRON_TOOL_MATERIALS))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_GOLDEN_BOOTS)
                        .pattern("# #")
                        .pattern("b #")
                        .define('#', ItemTags.GOLD_TOOL_MATERIALS)
                        .define('b', Items.GOLD_BLOCK)
                        .unlockedBy("gold", has(ItemTags.GOLD_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_GOLDEN_LEGGINGS)
                        .pattern("#b#")
                        .pattern("# #")
                        .pattern("# #")
                        .define('#', ItemTags.GOLD_TOOL_MATERIALS)
                        .define('b', Items.GOLD_BLOCK)
                        .unlockedBy("gold", has(ItemTags.GOLD_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_GOLDEN_CHESTPLATE)
                        .pattern("# #")
                        .pattern("#b#")
                        .pattern("###")
                        .define('#', ItemTags.GOLD_TOOL_MATERIALS)
                        .define('b', Items.GOLD_BLOCK)
                        .unlockedBy("gold", has(ItemTags.GOLD_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_GOLDEN_HELMET)
                        .pattern("#b#")
                        .pattern("# #")
                        .define('#', ItemTags.GOLD_TOOL_MATERIALS)
                        .define('b', Items.GOLD_BLOCK)
                        .unlockedBy("gold", has(ItemTags.GOLD_TOOL_MATERIALS))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_DIAMOND_BOOTS)
                        .pattern("# #")
                        .pattern("b #")
                        .define('#', ItemTags.DIAMOND_TOOL_MATERIALS)
                        .define('b', Items.DIAMOND_BLOCK)
                        .unlockedBy("diamond", has(ItemTags.DIAMOND_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_DIAMOND_LEGGINGS)
                        .pattern("#b#")
                        .pattern("# #")
                        .pattern("# #")
                        .define('#', ItemTags.DIAMOND_TOOL_MATERIALS)
                        .define('b', Items.DIAMOND_BLOCK)
                        .unlockedBy("diamond", has(ItemTags.DIAMOND_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_DIAMOND_CHESTPLATE)
                        .pattern("# #")
                        .pattern("#b#")
                        .pattern("###")
                        .define('#', ItemTags.DIAMOND_TOOL_MATERIALS)
                        .define('b', Items.DIAMOND_BLOCK)
                        .unlockedBy("diamond", has(ItemTags.DIAMOND_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_DIAMOND_HELMET)
                        .pattern("#b#")
                        .pattern("# #")
                        .define('#', ItemTags.DIAMOND_TOOL_MATERIALS)
                        .define('b', Items.DIAMOND_BLOCK)
                        .unlockedBy("diamond", has(ItemTags.DIAMOND_TOOL_MATERIALS))
                        .save(output);

                netheriteSmithing(ExpandedWeaponryItems.HEAVY_DIAMOND_BOOTS, RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_NETHERITE_BOOTS);
                netheriteSmithing(ExpandedWeaponryItems.HEAVY_DIAMOND_LEGGINGS, RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_NETHERITE_LEGGINGS);
                netheriteSmithing(ExpandedWeaponryItems.HEAVY_DIAMOND_CHESTPLATE, RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_NETHERITE_CHESTPLATE);
                netheriteSmithing(ExpandedWeaponryItems.HEAVY_DIAMOND_HELMET, RecipeCategory.COMBAT, ExpandedWeaponryItems.HEAVY_NETHERITE_HELMET);
            }
        };
    }

    @Override
    public @NonNull String getName() {
        return "ExpandedWeaponryRecipeProvider";
    }
}
