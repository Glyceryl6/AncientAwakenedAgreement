package com.glyceryl6.aaa.registry;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import com.glyceryl6.aaa.blocks.entity.DistillerEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AAABlockEntity {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AncientAwakenedAgreement.MOD_ID);
    public static final RegistryObject<BlockEntityType<DistillerEntity>> DISTILLER_ENTITY = BLOCK_ENTITY.register("distiller_entity",
            () -> BlockEntityType.Builder.of(DistillerEntity::new, AAABlocks.DISTILLER.get()).build(null));

}
