package com.kielson.datagen;

import com.kielson.datagen.translations.ExpandedWeaponryEnglishLangProvider;
import com.kielson.datagen.translations.ExpandedWeaponryPolishLangProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ExpandedWeaponryDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ExpandedWeaponryModelProvider::new);
        pack.addProvider(ExpandedWeaponryTagProvider::new);
        pack.addProvider(ExpandedWeaponryRecipeProvider::new);

        pack.addProvider(ExpandedWeaponryEnglishLangProvider::new);
        pack.addProvider(ExpandedWeaponryPolishLangProvider::new);
    }
}
