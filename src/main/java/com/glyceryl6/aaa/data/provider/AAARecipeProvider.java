package com.glyceryl6.aaa.data.provider;

import com.glyceryl6.aaa.registry.AAABlocks;
import com.glyceryl6.aaa.registry.AAAItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

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
    }

}