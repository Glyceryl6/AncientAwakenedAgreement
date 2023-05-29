package com.glyceryl6.aaa.data.tags;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class AAAItemTags {

    public static final TagKey<Item> IRON_BIRCH_LOGS = create("iron_birch_logs");
    public static final TagKey<Item> BEECH_LOGS = create("beech_logs");

    private static TagKey<Item> create(String name) {
        return ItemTags.create(AncientAwakenedAgreement.prefix(name));
    }

}