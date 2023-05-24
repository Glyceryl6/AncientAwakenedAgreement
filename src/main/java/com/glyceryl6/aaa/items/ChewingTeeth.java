package com.glyceryl6.aaa.items;

import com.google.common.collect.ImmutableMultimap;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;

public class ChewingTeeth extends Item implements Vanishable {

    public ChewingTeeth() {
        super(new Properties().durability(300));
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID,
                "Weapon modifier", 2.0D, AttributeModifier.Operation.ADDITION));
    }

    @Override
    public int getDamage(ItemStack stack) {
        return 3;
    }

}