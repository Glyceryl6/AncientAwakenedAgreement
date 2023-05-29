package com.glyceryl6.aaa.items;

import net.minecraft.world.item.ItemStack;

public class EnchantedGem extends AAASimpleItem {

    public EnchantedGem() {
        super(new Properties());
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

}