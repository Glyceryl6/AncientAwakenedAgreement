package com.glyceryl6.aaa.data.loot;

import com.glyceryl6.aaa.registry.AAABlocks;
import com.glyceryl6.aaa.registry.AAAItems;
import com.google.common.collect.Sets;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Set;
import java.util.function.BiConsumer;

@ParametersAreNonnullByDefault
public class AAABlockLoot extends BlockLoot {

    @Override
    protected void addTables() {
        this.dropSelf(AAABlocks.ANCIENT_ALTAR.get());
        this.dropSelf(AAABlocks.DISTILLER.get());
        this.dropSelf(AAABlocks.CENSER.get());
        this.add(AAABlocks.BEECH_LEAVES.get(), block -> createLeavesDrops(block, AAABlocks.BEECH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES)
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).when(HAS_NO_SHEARS_OR_SILK_TOUCH)
                        .add(applyExplosionCondition(block, LootItem.lootTableItem(AAAItems.BEECH_NUT.get())).when(BonusLevelTableCondition
                                .bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))));
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

    @Nonnull @Override
    protected Iterable<Block> getKnownBlocks() {
        return AAABlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}