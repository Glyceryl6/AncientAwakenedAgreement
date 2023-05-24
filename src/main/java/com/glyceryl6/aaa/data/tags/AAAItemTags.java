package com.glyceryl6.aaa.data.tags;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class AAAItemTags {

    private static TagKey<Item> create(String name) {
        return ItemTags.create(AncientAwakenedAgreement.prefix(name));
    }

}