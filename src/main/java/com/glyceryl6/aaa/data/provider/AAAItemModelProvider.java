package com.glyceryl6.aaa.data.provider;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import com.glyceryl6.aaa.registry.AAAItems;
import com.glyceryl6.aaa.utils.AAACommonUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AAAItemModelProvider extends ItemModelProvider {

    public AAAItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, AncientAwakenedAgreement.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (Item item : AAACommonUtils.getKnownItems()) {
            this.basicItem(item);
        }
    }

}