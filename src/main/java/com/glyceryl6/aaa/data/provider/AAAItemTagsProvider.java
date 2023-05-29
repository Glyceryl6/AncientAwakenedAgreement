package com.glyceryl6.aaa.data.provider;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import com.glyceryl6.aaa.data.tags.AAABlockTags;
import com.glyceryl6.aaa.data.tags.AAAItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class AAAItemTagsProvider extends ItemTagsProvider {

    public AAAItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, AncientAwakenedAgreement.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.copy(AAABlockTags.IRON_BIRCH_LOGS, AAAItemTags.IRON_BIRCH_LOGS);
        this.copy(AAABlockTags.BEECH_LOGS, AAAItemTags.BEECH_LOGS);
    }

}