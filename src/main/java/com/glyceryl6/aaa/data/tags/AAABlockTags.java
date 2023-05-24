package com.glyceryl6.aaa.data.tags;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class AAABlockTags {

    private static TagKey<Block> create(String name) {
        return BlockTags.create(AncientAwakenedAgreement.prefix(name));
    }

}