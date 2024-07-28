package com.kielson.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.kielson.KielsonsEnhancedCombat.MOD_ID;

public class ModItemGroups {

    public static final ItemGroup KIELSONS_ENHANCED_COMBAT = Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, MOD_ID),
        FabricItemGroup.builder().displayName(Text.translatable("itemGroup." + MOD_ID)).icon(() -> new ItemStack(ModItems.DIAMOND_DAGGER)).entries((displayContext, entries) -> {
            entries.add(ModItems.WOODEN_DAGGER);
            entries.add(ModItems.STONE_DAGGER);
            entries.add(ModItems.IRON_DAGGER);
            entries.add(ModItems.GOLDEN_DAGGER);
            entries.add(ModItems.DIAMOND_DAGGER);
            entries.add(ModItems.NETHERITE_DAGGER);
            entries.add(ModItems.LONGBOW);

        }).build());
    public static void registerItemGroups() {
        addItemsToCombat();
    }
    private static void addItemsToCombat(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.addAfter(Items.NETHERITE_AXE, ModItems.NETHERITE_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ModItems.DIAMOND_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ModItems.GOLDEN_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ModItems.IRON_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ModItems.STONE_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ModItems.WOODEN_DAGGER);
            content.addAfter(Items.BOW, ModItems.LONGBOW);
        });
    }
}

