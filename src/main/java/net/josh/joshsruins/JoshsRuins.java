package net.josh.joshsruins;

import net.fabricmc.api.ModInitializer;

import net.josh.joshsruins.block.ModBlocks;

import net.josh.joshsruins.block.entity.ModBlockEntities;
import net.josh.joshsruins.item.ModItemGroups;
import net.josh.joshsruins.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.item.AxeItem;
import com.google.common.collect.Maps;



public class JoshsRuins implements ModInitializer {
	public static final String MOD_ID = "joshsruins";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModBlockEntities.registerBlockEntities();

	}
}