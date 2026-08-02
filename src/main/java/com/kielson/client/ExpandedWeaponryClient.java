package com.kielson.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.special.SpecialModelRenderers;
import net.minecraft.resources.Identifier;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class ExpandedWeaponryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SpecialModelRenderers.ID_MAPPER.put(Identifier.fromNamespaceAndPath(MOD_ID, "shields"), ShieldSpecialRenderer.Unbaked.MAP_CODEC);
    }
}
