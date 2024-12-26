
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterfms.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterfmsModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> MAX_MINECART_SPEED = GameRules.register("maxMinecartSpeed", GameRules.Category.MISC, GameRules.IntegerValue.create(10));
}
