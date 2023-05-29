package com.glyceryl6.aaa.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class AAATabs {

    public static CreativeModeTab CD_TAB_0 = new CreativeModeTab("aaa_tab_0") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AAAItems.BEECH_NUT.get());
        }

    };

}