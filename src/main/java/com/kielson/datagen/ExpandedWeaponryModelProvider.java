package com.kielson.datagen;

import com.kielson.item.ExpandedWeaponryItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.item.Item;

@Environment(EnvType.CLIENT)
public class ExpandedWeaponryModelProvider extends FabricModelProvider {
    public ExpandedWeaponryModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (Item item : ExpandedWeaponryItems.ITEMS_HANDHELD) {
            itemModelGenerator.register(item, Models.HANDHELD);
        }
        for (Item item : ExpandedWeaponryItems.ITEMS_DEFAULT) {
            itemModelGenerator.register(item, Models.GENERATED);
        }
        for (Item item : ExpandedWeaponryItems.ITEMS_CUSTOM) {
            itemModelGenerator.register(item);
        }
    }
}
