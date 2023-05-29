package com.glyceryl6.aaa.data.provider;

import com.glyceryl6.aaa.data.tags.AAAItemTags;
import com.glyceryl6.aaa.registry.AAABlocks;
import com.glyceryl6.aaa.registry.AAAItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

@ParametersAreNonnullByDefault
public class AAARecipeProvider extends RecipeProvider {

    public AAARecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> finishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(AAABlocks.CENSER.get()).define('X', Items.COPPER_INGOT)
                .define('Y', AAAItems.ENCHANTED_GEM.get()).define('Z', Items.COAL_BLOCK)
                .pattern(" X ").pattern("XYX").pattern("XZX")
                .unlockedBy("has_enchanted_gem", has(AAAItems.ENCHANTED_GEM.get())).save(finishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(AAAItems.DATURA_SEEDS.get()).requires(AAAItems.DATURA.get())
                .unlockedBy("has_datura", has(AAAItems.DATURA.get())).save(finishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(AAAItems.BELLADONNA_SEEDS.get()).requires(AAAItems.BELLADONNA.get())
                .unlockedBy("has_belladonna", has(AAAItems.BELLADONNA.get())).save(finishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(AAAItems.CHILI_PEPPER_SEEDS.get()).requires(AAAItems.CHILI_PEPPER.get())
                .unlockedBy("has_chili_pepper", has(AAAItems.CHILI_PEPPER.get())).save(finishedRecipeConsumer);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.ANDESITE), AAAItems.LIME.get(), 0.15F, 200)
                .unlockedBy("has_andesite", has(Items.ANDESITE)).save(finishedRecipeConsumer);
        planksFromLogs(finishedRecipeConsumer, AAABlocks.IRON_BIRCH_PLANKS.get(), AAAItemTags.IRON_BIRCH_LOGS);
        planksFromLogs(finishedRecipeConsumer, AAABlocks.BEECH_PLANKS.get(), AAAItemTags.BEECH_LOGS);
        woodFromLogs(finishedRecipeConsumer, AAABlocks.IRON_BIRCH_WOOD.get(), AAABlocks.IRON_BIRCH_LOG.get());
        woodFromLogs(finishedRecipeConsumer, AAABlocks.BEECH_WOOD.get(), AAABlocks.BEECH_LOG.get());
    }

}