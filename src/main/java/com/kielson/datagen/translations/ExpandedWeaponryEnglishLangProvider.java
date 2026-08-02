package com.kielson.datagen.translations;

import com.kielson.item.ExpandedWeaponryItemGroups;
import com.kielson.item.ExpandedWeaponryItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Item;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ExpandedWeaponryEnglishLangProvider extends FabricLanguageProvider {
    public ExpandedWeaponryEnglishLangProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider holderLookup, @NonNull TranslationBuilder translationBuilder) {
        translationBuilder.add(ExpandedWeaponryItemGroups.EXPANDED_WEAPONRY_KEY, "Expanded Weaponry");
        translationBuilder.add(ExpandedWeaponryItems.LONGBOW, "Longbow");
        translationBuilder.add(ExpandedWeaponryItems.SLINGSHOT, "Slingshot");

        String[] materials = {"Wooden", "Stone", "Copper", "Iron", "Golden", "Diamond", "Netherite"};
        for(int i = 0; i < materials.length; i++){
            translationBuilder.add(ExpandedWeaponryItems.Groups.DAGGERS[i], materials[i] + " Dagger");
            translationBuilder.add(ExpandedWeaponryItems.Groups.HAMMERS[i], materials[i] + " Hammer");
            translationBuilder.add(ExpandedWeaponryItems.Groups.TWIN_BLADE_SWORDS[i], materials[i] + " Twin Blade Sword");
            translationBuilder.add(ExpandedWeaponryItems.Groups.GREATSWORDS[i], materials[i] + " Greatsword");
            if(i >= 2){
                translationBuilder.add(ExpandedWeaponryItems.Groups.HEAVY_HELMETS[i - 2], "Heavy " + materials[i] + " Helmet");
                translationBuilder.add(ExpandedWeaponryItems.Groups.HEAVY_CHESTPLATES[i - 2], "Heavy " + materials[i] + " Chestplate");
                translationBuilder.add(ExpandedWeaponryItems.Groups.HEAVY_LEGGINGS[i - 2], "Heavy " + materials[i] + " Leggings");
                translationBuilder.add(ExpandedWeaponryItems.Groups.HEAVY_BOOTS[i - 2], "Heavy " + materials[i] + " Boots");
            }
            generateShieldTranslations(translationBuilder, ExpandedWeaponryItems.Groups.SHIELDS[i], materials[i]);
        }
    }

    private void generateShieldTranslations(TranslationBuilder translationBuilder, Item shieldItem, String material){
        translationBuilder.add(shieldItem, material + " Shield");
        String[] colorIds = {"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"};
        String[] colors = {"White ", "Orange ", "Magenta ", "Light Blue ", "Yellow ", "Lime ", "Pink ", "Gray ", "Light Gray ", "Cyan ", "Purple ", "Blue ", "Brown ", "Green ", "Red ", "Black "};
        for(int i = 0; i < colors.length; i++){
            translationBuilder.add(shieldItem.getDescriptionId() + "." + colorIds[i], colors[i] + material + " Shield");
        }
    }
}