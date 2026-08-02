package com.kielson.datagen;

import com.kielson.item.ExpandedWeaponryItems;
import com.kielson.util.ItemHelper;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import org.jspecify.annotations.NonNull;

import static com.kielson.ExpandedWeaponry.MOD_ID;

@Environment(EnvType.CLIENT)
public class ExpandedWeaponryModelProvider extends FabricModelProvider {
    public ExpandedWeaponryModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NonNull BlockModelGenerators blockStateModelGenerator) {}

    @Override
    public void generateItemModels(@NonNull ItemModelGenerators itemModelGenerator) {
        for (Item item : ExpandedWeaponryItems.Groups.DAGGERS) {
            itemModelGenerator.generateFlatItem(item, ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (Item item : ExpandedWeaponryItems.Groups.HEAVY_HELMETS) {
            itemModelGenerator.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
        }
        for (Item item : ExpandedWeaponryItems.Groups.HEAVY_CHESTPLATES) {
            itemModelGenerator.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
        }
        for (Item item : ExpandedWeaponryItems.Groups.HEAVY_LEGGINGS) {
            itemModelGenerator.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
        }
        for (Item item : ExpandedWeaponryItems.Groups.HEAVY_BOOTS) {
            itemModelGenerator.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
        }
        for (Item item : ExpandedWeaponryItems.Groups.SHIELDS) {
            ItemHelper.generateShield(itemModelGenerator, MOD_ID, item.toString(), (ShieldItem) item);
        }
    }
}
