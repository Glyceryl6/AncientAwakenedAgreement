package com.glyceryl6.aaa.data;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import com.glyceryl6.aaa.data.provider.*;
import com.glyceryl6.aaa.data.provider.lang.AAALanguageProviderENUS;
import com.glyceryl6.aaa.data.provider.lang.AAALanguageProviderZHCN;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AncientAwakenedAgreement.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AAADataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper exFileHelper = event.getExistingFileHelper();
        generator.addProvider(event.includeServer(), new AAABlockStateProvider(generator, exFileHelper));
        generator.addProvider(event.includeServer(), new AAAItemModelProvider(generator, exFileHelper));
        AAABlockTagsProvider blockTagsProvider = new AAABlockTagsProvider(generator, exFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new AAAItemTagsProvider(generator, blockTagsProvider, exFileHelper));
        generator.addProvider(event.includeServer(), new AAALanguageProviderENUS(generator));
        generator.addProvider(event.includeServer(), new AAALanguageProviderZHCN(generator));
        generator.addProvider(event.includeServer(), new AAALootTableProvider(generator));
        generator.addProvider(event.includeServer(), new AAARecipeProvider(generator));
    }

}