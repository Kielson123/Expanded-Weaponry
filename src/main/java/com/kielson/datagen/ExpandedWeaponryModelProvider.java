package com.kielson.datagen;

import com.kielson.item.ExpandedWeaponryItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;

@Environment(EnvType.CLIENT)
public class ExpandedWeaponryModelProvider extends FabricModelProvider {
    public ExpandedWeaponryModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        for (Item item : ExpandedWeaponryItems.ITEMS_HANDHELD) {
            itemModelGenerator.generateFlatItem(item, ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (Item item : ExpandedWeaponryItems.ITEMS_DEFAULT) {
            itemModelGenerator.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
        }
        for (Item item : ExpandedWeaponryItems.ITEMS_CUSTOM) {
            itemModelGenerator.declareCustomModelItem(item);
        }
    }
}
