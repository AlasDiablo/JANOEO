package fr.alasdiablo.janoeo.world;

import fr.alasdiablo.janoeo.config.EndConfig;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.holder.BlocksHolder;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class EndOreGenerator implements IWorldGenerator {
    @Override
    public void startWorldGeneration() {

        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        EndConfig.Config endConfig = EndConfig.CONFIG;
        if (globalConfig.END_ORE_GEN.get()) ForgeRegistries.BIOMES.forEach(biome -> {
            if (endConfig.COAL_END_ORE.get()) biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.COAL_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(68, 20, 0, 70)));
            if (endConfig.DIAMOND_END_ORE.get()) biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.DIAMOND_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(20, 20, 0, 70)));
            if (endConfig.EMERALD_END_ORE.get()) biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.EMERALD_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(8, 20, 0, 70)));
            if (endConfig.GOLD_END_ORE.get()) biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.GOLD_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(32, 20, 0, 70)));
            if (endConfig.IRON_END_ORE.get()) biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.IRON_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(40, 20, 0, 70)));
            if (endConfig.LAPIS_END_ORE.get()) biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.LAPIS_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(20, 20, 0, 70)));
            if (endConfig.REDSTONE_END_ORE.get()) biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.REDSTONE_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(32, 20, 0, 70)));
        });
    }
}