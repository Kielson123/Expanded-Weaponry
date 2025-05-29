package com.kielson;

import com.kielson.item.ModItemGroups;
import com.kielson.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpandedWeaponry implements ModInitializer {
	public static final String MOD_ID = "expanded_weaponry";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(){
		ModItems.initialize();
		ModItemGroups.initialize();
		ModTags.initialize();

	}
}