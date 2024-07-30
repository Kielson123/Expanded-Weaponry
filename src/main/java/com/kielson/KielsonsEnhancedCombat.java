package com.kielson;

import com.kielson.item.ModItemGroups;
import com.kielson.item.ModItems;
import com.kielson.util.ModComponents;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KielsonsEnhancedCombat implements ModInitializer {
	public static final String MOD_ID = "kielsons_enhanced_combat";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(){
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModComponents.registerModComponents();
	}
}