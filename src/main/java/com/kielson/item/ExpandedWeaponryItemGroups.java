package com.kielson.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class ExpandedWeaponryItemGroups {

    public static final ResourceKey<CreativeModeTab> EXPANDED_WEAPONRY_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(MOD_ID, "expanded_weaponry")
    );

    public static final CreativeModeTab EXPANDED_WEAPONRY_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ExpandedWeaponryItems.GOLDEN_HAMMER)).title(Component.translatable("itemGroup." + MOD_ID))
            .displayItems((_, output) -> {
                for(Item daggerItem : ExpandedWeaponryItems.Groups.DAGGERS){
                    output.accept(daggerItem);
                }
                for(Item hammerItem : ExpandedWeaponryItems.Groups.HAMMERS){
                    output.accept(hammerItem);
                }
                for(Item twinBladeSwordItem : ExpandedWeaponryItems.Groups.TWIN_BLADE_SWORDS){
                    output.accept(twinBladeSwordItem);
                }
                for(Item greatswordItem : ExpandedWeaponryItems.Groups.GREATSWORDS){
                    output.accept(greatswordItem);
                }
                for(Item shieldItem : ExpandedWeaponryItems.Groups.SHIELDS){
                    output.accept(shieldItem);
                }

                output.accept(ExpandedWeaponryItems.LONGBOW);
                output.accept(ExpandedWeaponryItems.SLINGSHOT);

                for(int i = 0; i < 5; i++){
                    output.accept(ExpandedWeaponryItems.Groups.HEAVY_HELMETS[i]);
                    output.accept(ExpandedWeaponryItems.Groups.HEAVY_CHESTPLATES[i]);
                    output.accept(ExpandedWeaponryItems.Groups.HEAVY_LEGGINGS[i]);
                    output.accept(ExpandedWeaponryItems.Groups.HEAVY_BOOTS[i]);
                }

            }).build();

    private static void addItemsToCombat(){
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(content -> {

            for(Item daggerItem : ExpandedWeaponryItems.Groups.DAGGERS){
                content.insertBefore(Items.TRIDENT, daggerItem);
            }
            for(Item hammerItem : ExpandedWeaponryItems.Groups.HAMMERS){
                content.insertBefore(Items.TRIDENT, hammerItem);
            }
            for(Item twinBladeSwordItem : ExpandedWeaponryItems.Groups.TWIN_BLADE_SWORDS){
                content.insertBefore(Items.TRIDENT, twinBladeSwordItem);
            }
            for(Item greatswordItem : ExpandedWeaponryItems.Groups.GREATSWORDS){
                content.insertBefore(Items.TRIDENT, greatswordItem);
            }
            for(Item shieldItem : ExpandedWeaponryItems.Groups.SHIELDS){
                content.insertBefore(Items.LEATHER_HELMET, shieldItem);
            }

            content.insertAfter(Items.BOW, ExpandedWeaponryItems.LONGBOW);
            content.insertAfter(Items.CROSSBOW, ExpandedWeaponryItems.SLINGSHOT);

            for(int i = 0; i < 5; i++){
                content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.Groups.HEAVY_HELMETS[i]);
                content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.Groups.HEAVY_CHESTPLATES[i]);
                content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.Groups.HEAVY_LEGGINGS[i]);
                content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.Groups.HEAVY_BOOTS[i]);
            }
        });
    }

    public static void initialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, EXPANDED_WEAPONRY_KEY, EXPANDED_WEAPONRY_TAB);
        addItemsToCombat();
    }
}

