package com.glyceryl6.aaa.data.provider;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import com.glyceryl6.aaa.data.tags.AAABlockTags;
import com.glyceryl6.aaa.registry.AAABlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class AAABlockTagsProvider extends BlockTagsProvider {

    public AAABlockTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, AncientAwakenedAgreement.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(AAABlockTags.IRON_BIRCH_LOGS).add(AAABlocks.IRON_BIRCH_LOG.get(), AAABlocks.IRON_BIRCH_WOOD.get());
        this.tag(AAABlockTags.BEECH_LOGS).add(AAABlocks.BEECH_LOG.get(), AAABlocks.BEECH_WOOD.get());
        this.tag(BlockTags.MINEABLE_WITH_HOE).add(AAABlocks.IRON_BIRCH_LEAVES.get(), AAABlocks.BEECH_LEAVES.get());
        this.tag(BlockTags.WOODEN_PRESSURE_PLATES).add(AAABlocks.IRON_BIRCH_PRESSURE_PLATE.get(), AAABlocks.BEECH_PRESSURE_PLATE.get());
        this.tag(BlockTags.WOODEN_TRAPDOORS).add(AAABlocks.IRON_BIRCH_TRAPDOOR.get(), AAABlocks.BEECH_TRAPDOOR.get());
        this.tag(BlockTags.WOODEN_BUTTONS).add(AAABlocks.IRON_BIRCH_BUTTON.get(), AAABlocks.BEECH_BUTTON.get());
        this.tag(BlockTags.WOODEN_STAIRS).add(AAABlocks.IRON_BIRCH_STAIR.get(), AAABlocks.BEECH_STAIR.get());
        this.tag(BlockTags.WOODEN_FENCES).add(AAABlocks.IRON_BIRCH_FENCE.get(), AAABlocks.BEECH_FENCE.get());
        this.tag(BlockTags.WOODEN_DOORS).add(AAABlocks.IRON_BIRCH_DOOR.get(), AAABlocks.BEECH_DOOR.get());
        this.tag(BlockTags.WOODEN_SLABS).add(AAABlocks.IRON_BIRCH_SLAB.get(), AAABlocks.BEECH_SLAB.get());
        this.tag(BlockTags.FLOWER_POTS).add(AAABlocks.POTTED_IRON_BIRCH_SAPLING.get(), AAABlocks.POTTED_BEECH_SAPLING.get());
        this.tag(BlockTags.FENCE_GATES).add(AAABlocks.IRON_BIRCH_FENCE_GATE.get(), AAABlocks.BEECH_FENCE_GATE.get());
        this.tag(BlockTags.SAPLINGS).add(AAABlocks.IRON_BIRCH_SAPLING.get(), AAABlocks.BEECH_SAPLING.get());
        this.tag(BlockTags.PLANKS).add(AAABlocks.IRON_BIRCH_PLANKS.get(), AAABlocks.BEECH_PLANKS.get());
        this.tag(BlockTags.LEAVES).add(AAABlocks.IRON_BIRCH_LEAVES.get(), AAABlocks.BEECH_LEAVES.get());
        this.tag(BlockTags.WALLS).add(AAABlocks.IRON_BIRCH_WALL.get(), AAABlocks.BEECH_WALL.get());
        this.tag(BlockTags.LOGS).addTag(AAABlockTags.IRON_BIRCH_LOGS).addTag(AAABlockTags.BEECH_LOGS);
    }

}