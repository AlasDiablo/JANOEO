package fr.alasdiablo.janoeo.foundation.data;

import fr.alasdiablo.janoeo.foundation.init.AllItems;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.util.Registries;
import net.minecraft.data.*;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

/**
 * Janoeo recipes data generator
 */
public class CraftRecipes extends RecipeProvider {

    /**
     * constructor
     * @param generatorIn data generator instance
     */
    public CraftRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    /**
     * load all recipes
     */
    @SuppressWarnings("NullableProblems")
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapelessRecipe(AllItems.Gems.RUBY, 9)
                .addIngredient(FoundationBlocks.RUBY_BLOCK)
                .addCriterion("has_ruby_block", hasItem(FoundationBlocks.RUBY_BLOCK))
                .build(consumer, new ResourceLocation(Registries.MODID, "ruby_from_block"));

        ShapelessRecipeBuilder.shapelessRecipe(AllItems.Gems.SAPPHIRE, 9)
                .addIngredient(FoundationBlocks.SAPPHIRE_BLOCK)
                .addCriterion("has_sapphire_block", hasItem(FoundationBlocks.SAPPHIRE_BLOCK))
                .build(consumer, new ResourceLocation(Registries.MODID, "sapphire_from_block"));

        ShapedRecipeBuilder.shapedRecipe(FoundationBlocks.RUBY_BLOCK)
                .key('R', AllItems.Gems.RUBY)
                .patternLine("RRR")
                .patternLine("RRR")
                .patternLine("RRR")
                .addCriterion("has_ruby", hasItem(FoundationBlocks.RUBY_BLOCK))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(FoundationBlocks.SAPPHIRE_BLOCK)
                .key('S', AllItems.Gems.SAPPHIRE)
                .patternLine("SSS")
                .patternLine("SSS")
                .patternLine("SSS")
                .addCriterion("has_sapphire", hasItem(FoundationBlocks.SAPPHIRE_BLOCK))
                .build(consumer);
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public String getName() {
        return "Janoeo - Recipes";
    }
}
