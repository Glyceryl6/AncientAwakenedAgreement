package com.glyceryl6.aaa.blocks.grower;

import com.glyceryl6.aaa.data.level.feature.AAATreeFeatures;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class IronBirchGrower extends AbstractTreeGrower {

    @Nullable @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean largeHive) {
        return random.nextInt(10) == 0 ? AAATreeFeatures.SUPER_IRON_BIRCH : AAATreeFeatures.IRON_BIRCH;
    }

}