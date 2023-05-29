package com.glyceryl6.aaa.data.provider;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import com.glyceryl6.aaa.items.AAASimpleItem;
import com.glyceryl6.aaa.registry.AAAItems;
import com.glyceryl6.aaa.utils.AAACommonUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class AAAItemModelProvider extends ItemModelProvider {

    public AAAItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, AncientAwakenedAgreement.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (Item item : AAACommonUtils.getKnownItems()) {
            if (item instanceof AAASimpleItem || item instanceof ForgeSpawnEggItem || item instanceof ItemNameBlockItem) {
                this.basicItem(item);
            }
        }
    }

}