package com.glyceryl6.aaa.registry;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import com.glyceryl6.aaa.items.ChewingTeeth;
import com.glyceryl6.aaa.items.EnchantedGem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.glyceryl6.aaa.utils.AAAItemUtils.*;

public class AAAItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AncientAwakenedAgreement.MOD_ID);
    public static final RegistryObject<Item> ENCHANTED_GEM = ITEMS.register("enchanted_gem", EnchantedGem::new);
    public static final RegistryObject<Item> CHEWING_TEETH = ITEMS.register("chewing_teeth", ChewingTeeth::new);
    public static final RegistryObject<Item> ATLANTIS_JAR = normal("atlantis_jar");
    public static final RegistryObject<Item> DEATH_JAR = normal("death_jar");
    public static final RegistryObject<Item> CUP_JAR = normal("cup_jar");
    public static final RegistryObject<Item> EYE_JAR = normal("eye_jar");
    public static final RegistryObject<Item> GLASS_JAR = normal("glass_jar");
    public static final RegistryObject<Item> OLDONES_JAR = normal("oldones_jar");
    public static final RegistryObject<Item> PHOENIX_JAR = normal("phoenix_jar");
    public static final RegistryObject<Item> PENTACLE_JAR = normal("pentacle_jar");
    public static final RegistryObject<Item> SWORD_JAR = normal("sword_jar");
    public static final RegistryObject<Item> WAND_JAR = normal("wand_jar");
    public static final RegistryObject<Item> DATURA = normal("datura");
    public static final RegistryObject<Item> BELLADONNA = normal("belladonna");
    public static final RegistryObject<Item> CHILI_PEPPER = normal("chili_pepper");
    public static final RegistryObject<Item> DATURA_SEEDS = alias("datura_seeds", AAABlocks.DATURA);
    public static final RegistryObject<Item> BELLADONNA_SEEDS = alias("belladonna_seeds", AAABlocks.BELLADONNA);
    public static final RegistryObject<Item> CHILI_PEPPER_SEEDS = alias("chili_pepper_seeds", AAABlocks.CHILI_PEPPER);

}