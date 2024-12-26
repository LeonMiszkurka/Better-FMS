package net.mcreator.betterfms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

import net.mcreator.betterfms.BetterfmsMod;

public class FFPProcedure {
	public static void execute(LevelAccessor world) {
		BetterfmsMod.LOGGER.warn("LOADING FOP");
		BetterfmsMod.LOGGER.info("ERROR");
		BetterfmsMod.LOGGER.info("EORROR");
		BetterfmsMod.LOGGER.info("EORROR");
		BetterfmsMod.LOGGER.info("EORROR");
		BetterfmsMod.LOGGER.info("EORROR");
		BetterfmsMod.LOGGER.info("EORROR");
		BetterfmsMod.LOGGER.info("System.fop = FIXER.run");
		BetterfmsMod.LOGGER.info("Fixing fop");
		BetterfmsMod.LOGGER.info("FIXED");
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Persion used FOP"), false);
	}
}
