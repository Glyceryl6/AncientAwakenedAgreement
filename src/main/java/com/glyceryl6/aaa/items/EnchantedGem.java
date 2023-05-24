package com.glyceryl6.aaa.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class EnchantedGem extends Item {

    public EnchantedGem() {
        super(new Properties());
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

}