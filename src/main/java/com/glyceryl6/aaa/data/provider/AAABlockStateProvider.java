package com.glyceryl6.aaa.data.provider;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import com.glyceryl6.aaa.registry.AAABlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AAABlockStateProvider extends BlockStateProvider {

    public AAABlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, AncientAwakenedAgreement.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.simpleBlock(AAABlocks.ANCIENT_ALTAR.get(), this.models()
                .cubeBottomTop(AAABlocks.ANCIENT_ALTAR.getId().getPath(),
                        this.modLoc("block/ancient_altar_side"),
                        this.modLoc("block/ancient_altar_bottom"),
                        this.modLoc("block/ancient_altar_top")));
    }

}