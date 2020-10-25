package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.config.BasaltConfig;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.init.BasaltOresBlocks;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;

public class BasaltOreGenerator implements IWorldGenerator {
    @Override
    public void startWorldGeneration(Biome biome) {
        GlobalConfig.Config GLOBAL_CONFIG = GlobalConfig.CONFIG;
        BasaltConfig.Config BASALT_CONFIG = BasaltConfig.CONFIG;

        if (GLOBAL_CONFIG.GRAVEL_ORE_GEN.get()) {
            if (BASALT_CONFIG.COAL_BASALT_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BasaltOresBlocks.COAL_BASALT_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (BASALT_CONFIG.DIAMOND_BASALT_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BasaltOresBlocks.DIAMOND_BASALT_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (BASALT_CONFIG.EMERALD_BASALT_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BasaltOresBlocks.EMERALD_BASALT_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (BASALT_CONFIG.GOLD_BASALT_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BasaltOresBlocks.GOLD_BASALT_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (BASALT_CONFIG.IRON_BASALT_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BasaltOresBlocks.IRON_BASALT_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (BASALT_CONFIG.LAPIS_BASALT_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BasaltOresBlocks.LAPIS_BASALT_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (BASALT_CONFIG.REDSTONE_BASALT_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BasaltOresBlocks.REDSTONE_BASALT_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
        }
    }
}