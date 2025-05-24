package com.kielson.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class KielsonsEnhancedCombatDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(KielsonsECModelProvider::new);
        pack.addProvider(KielsonsECTagProvider::new);
        pack.addProvider(KielsonsECRecipeProvider::new);
    }
}
