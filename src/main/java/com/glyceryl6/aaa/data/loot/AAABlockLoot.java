package com.glyceryl6.aaa.data.loot;

import com.glyceryl6.aaa.registry.AAABlocks;
import com.google.common.collect.Sets;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.Set;
import java.util.function.BiConsumer;

public class AAABlockLoot extends BlockLoot {

    @Override
    protected void addTables() {
        this.dropSelf(AAABlocks.ANCIENT_ALTAR.get());
        this.dropSelf(AAABlocks.DISTILLER.get());
        this.dropSelf(AAABlocks.CENSER.get());
    }

    @Override
    public void accept(BiConsumer<ResourceLocation, LootTable.Builder> biConsumer) {
        this.addTables();
        Set<ResourceLocation> set = Sets.newHashSet();
        for (Block block : this.getKnownBlocks()) {
            ResourceLocation resource = block.getLootTable();
            if (resource != BuiltInLootTables.EMPTY && set.add(resource)) {
                LootTable.Builder lootTable$builder = this.map.remove(resource);
                if (lootTable$builder != null) {
                    biConsumer.accept(resource, lootTable$builder);
                }
            }
        }

        if (!this.map.isEmpty()) {
            throw new IllegalStateException("Created block loot tables for non-blocks: " + this.map.keySet());
        }
    }

    @Nonnull
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return AAABlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}