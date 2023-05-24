package com.glyceryl6.aaa;

import com.glyceryl6.aaa.registry.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.Locale;

@Mod(AncientAwakenedAgreement.MOD_ID)
public class AncientAwakenedAgreement {

    public static final String MOD_ID = "aaa";
    public IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public AncientAwakenedAgreement() {
        AAAItems.ITEMS.register(this.eventBus);
        AAABlocks.BLOCKS.register(this.eventBus);
        AAAEntities.ENTITY_TYPES.register(this.eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
    }

}