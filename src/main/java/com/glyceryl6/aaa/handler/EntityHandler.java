package com.glyceryl6.aaa.handler;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import com.glyceryl6.aaa.registry.AAAItems;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AncientAwakenedAgreement.MOD_ID)
public class EntityHandler {

    @SubscribeEvent
    public static void onLivingDeath(LivingDeathEvent event) {
        DamageSource source = event.getSource();
        if (source.getEntity() instanceof Player player) {
            ItemStack handItem = player.getItemInHand(player.getUsedItemHand());
            boolean flag1 = player.getAbilities().instabuild;
            boolean flag2 = player.getFoodData().needsFood();
            if (handItem.is(AAAItems.CHEWING_TEETH.get()) && flag1 && flag2) {
                int foodLevel = player.getFoodData().getFoodLevel();
                player.getFoodData().setFoodLevel(foodLevel + 1);
            }
        }
    }

}