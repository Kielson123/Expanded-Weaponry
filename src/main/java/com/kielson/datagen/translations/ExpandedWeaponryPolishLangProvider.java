package com.kielson.datagen.translations;

import com.kielson.item.ExpandedWeaponryItemGroups;
import com.kielson.item.ExpandedWeaponryItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Item;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class ExpandedWeaponryPolishLangProvider extends FabricLanguageProvider {
    public ExpandedWeaponryPolishLangProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "pl_pl", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider holderLookup, @NonNull TranslationBuilder translationBuilder) {
        translationBuilder.add(ExpandedWeaponryItemGroups.EXPANDED_WEAPONRY_KEY, "Expanded Weaponry");
        translationBuilder.add(ExpandedWeaponryItems.LONGBOW, "Długi łuk");
        translationBuilder.add(ExpandedWeaponryItems.SLINGSHOT, "Proca");

        String[] materials = {"Drewnian", "Kamienn", "Miedzian", "Żelazn", "Złot", "Diamentow", "Netherytow"};
        for(int i = 0; i < materials.length; i++){
            translationBuilder.add(ExpandedWeaponryItems.Groups.DAGGERS[i], materials[i] + "y sztylet");
            translationBuilder.add(ExpandedWeaponryItems.Groups.HAMMERS[i], materials[i] + "y młot");
            translationBuilder.add(ExpandedWeaponryItems.Groups.TWIN_BLADE_SWORDS[i], materials[i] + "y miecz z podwójnym ostrzem");
            translationBuilder.add(ExpandedWeaponryItems.Groups.GREATSWORDS[i], materials[i] + "y wielki miecz");
            if(i >= 2){
                translationBuilder.add(ExpandedWeaponryItems.Groups.HEAVY_HELMETS[i - 2], "Ciężki " + materials[i].toLowerCase() + "y hełm");
                translationBuilder.add(ExpandedWeaponryItems.Groups.HEAVY_CHESTPLATES[i - 2], "Ciężki " + materials[i].toLowerCase() + "y napierśnik");
                translationBuilder.add(ExpandedWeaponryItems.Groups.HEAVY_LEGGINGS[i - 2], "Ciężkie " + materials[i].toLowerCase() + "e nogawice");
                translationBuilder.add(ExpandedWeaponryItems.Groups.HEAVY_BOOTS[i - 2], "Ciężkie " + materials[i].toLowerCase() + "e buty");
            }
            generateShieldTranslations(translationBuilder, ExpandedWeaponryItems.Groups.SHIELDS[i], materials[i]);
        }
    }

    private void generateShieldTranslations(TranslationBuilder translationBuilder, Item shieldItem, String material){
        translationBuilder.add(shieldItem, material + "a tarcza");
        String[] colorIds = {"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"};
        String[] colors = {"Biała ", "Pomarańczowa ", "Purpurowa ", "Jasnoniebieska ", "Żółta ", "Jasnozielona ", "Różowa ", "Szara ", "Jasnoszara ", "Błękitna ", "Fioletowa ", "Niebieska ", "Brązowa ", "Zielona ", "Czerwona ", "Czarna "};
        for(int i = 0; i < colors.length; i++){
            translationBuilder.add(shieldItem.getDescriptionId() + "." + colorIds[i], colors[i] + material.toLowerCase() + "a tarcza");
        }
    }
}