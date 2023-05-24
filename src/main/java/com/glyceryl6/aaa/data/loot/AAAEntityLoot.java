package com.glyceryl6.aaa.data.loot;

import com.google.common.collect.Sets;
import net.minecraft.data.loot.EntityLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.function.BiConsumer;

public class AAAEntityLoot extends EntityLoot {

    @Override
    protected void addTables() {

    }

    @Override
    public void accept(BiConsumer<ResourceLocation, LootTable.Builder> biConsumer) {
        this.addTables();
        Set<ResourceLocation> set = Sets.newHashSet();
        for (EntityType<?> entityType : ForgeRegistries.ENTITY_TYPES) {
            ResourceLocation resource = entityType.getDefaultLootTable();
            if (!isNonLiving(entityType) && resource != BuiltInLootTables.EMPTY && set.add(resource)) {
                LootTable.Builder lootTable$Builder = this.map.remove(resource);
                if (lootTable$Builder != null) {
                    biConsumer.accept(resource, lootTable$Builder);
                }
            }
        }

        this.map.forEach(biConsumer);
    }

}