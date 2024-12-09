package net.psysquatch.rubymod;

import net.fabricmc.api.ModInitializer;

import net.psysquatch.rubymod.block.ModBlocks;
import net.psysquatch.rubymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubyMod implements ModInitializer {
	public static final String MOD_ID = "rubymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}