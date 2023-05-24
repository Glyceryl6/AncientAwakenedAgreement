package com.glyceryl6.aaa.utils;

import com.glyceryl6.aaa.registry.AAABlocks;
import com.glyceryl6.aaa.registry.AAAItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class AAACommonUtils {

    public static Iterable<Block> getKnownBlocks() {
        return AAABlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    public static Iterable<Item> getKnownItems() {
        return AAAItems.ITEMS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}