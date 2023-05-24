package com.glyceryl6.aaa.registry;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import com.glyceryl6.aaa.blocks.AncientAltar;
import com.glyceryl6.aaa.blocks.Censer;
import com.glyceryl6.aaa.blocks.Distiller;
import com.glyceryl6.aaa.blocks.crops.BelladonnaBlock;
import com.glyceryl6.aaa.blocks.crops.ChiliPepperBlock;
import com.glyceryl6.aaa.blocks.crops.DaturaBlock;
import com.glyceryl6.aaa.blocks.grower.BeechGrower;
import com.glyceryl6.aaa.blocks.grower.IronBirchGrower;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.glyceryl6.aaa.utils.AAABlockUtils.*;

public class AAABlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AncientAwakenedAgreement.MOD_ID);
    public static final RegistryObject<Block> ANCIENT_ALTAR = register("ancient_altar", AncientAltar::new);
    public static final RegistryObject<Block> DISTILLER = register("distiller", Distiller::new);
    public static final RegistryObject<Block> CENSER = register("censer", Censer::new);

    public static final RegistryObject<Block> IRON_BIRCH_LOG = register("iron_birch_log", () -> Blocks.log(MaterialColor.WOOD, MaterialColor.PODZOL));
    public static final RegistryObject<Block> IRON_BIRCH_LEAVES = register("iron_birch_leaves", () -> Blocks.leaves(SoundType.GRASS));
    public static final RegistryObject<Block> IRON_BIRCH_PLANKS = normal("iron_birch_planks", copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> IRON_BIRCH_WOOD = wood("iron_birch_wood", MaterialColor.COLOR_PINK);

    public static final RegistryObject<Block> BEECH_LOG = register("beech_log", () -> Blocks.log(MaterialColor.WOOD, MaterialColor.PODZOL));
    public static final RegistryObject<Block> BEECH_LEAVES = register("beech_leaves", () -> Blocks.leaves(SoundType.GRASS));
    public static final RegistryObject<Block> BEECH_PLANKS = normal("beech_planks", copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> BEECH_WOOD = wood("beech_wood", MaterialColor.COLOR_PURPLE);

    public static final RegistryObject<Block> IRON_BIRCH_PRESSURE_PLATE = pressurePlate("iron_birch_pressure_plate", copy(Blocks.BIRCH_PRESSURE_PLATE));
    public static final RegistryObject<Block> IRON_BIRCH_FENCE_GATE = fenceGate("iron_birch_fence_gate", copy(Blocks.BIRCH_FENCE_GATE));
    public static final RegistryObject<Block> IRON_BIRCH_TRAPDOOR = trapdoor("iron_birch_trapdoor", copy(Blocks.BIRCH_TRAPDOOR));
    public static final RegistryObject<Block> IRON_BIRCH_BUTTON = button("iron_birch_button", true, copy(Blocks.BIRCH_BUTTON));
    public static final RegistryObject<Block> IRON_BIRCH_STAIR = stair("iron_birch_stairs", IRON_BIRCH_PLANKS, copy(Blocks.BIRCH_STAIRS));
    public static final RegistryObject<Block> IRON_BIRCH_FENCE = fence("iron_birch_fence", copy(Blocks.BIRCH_FENCE));
    public static final RegistryObject<Block> IRON_BIRCH_DOOR = door("iron_birch_door", copy(Blocks.BIRCH_DOOR));
    public static final RegistryObject<Block> IRON_BIRCH_SLAB = slab("iron_birch_slab", copy(Blocks.BIRCH_SLAB));
    public static final RegistryObject<Block> IRON_BIRCH_WALL = wall("iron_birch_wall", copy(Blocks.BIRCH_PLANKS));

    public static final RegistryObject<Block> BEECH_PRESSURE_PLATE = pressurePlate("beech_pressure_plate", copy(Blocks.OAK_PRESSURE_PLATE));
    public static final RegistryObject<Block> BEECH_FENCE_GATE = fenceGate("beech_fence_gate", defaultWood(MaterialColor.PODZOL));
    public static final RegistryObject<Block> BEECH_TRAPDOOR = trapdoor("beech_trapdoor", defaultWood(MaterialColor.PODZOL));
    public static final RegistryObject<Block> BEECH_BUTTON = button("beech_button", true, defaultWood(MaterialColor.PODZOL));
    public static final RegistryObject<Block> BEECH_STAIR = stair("beech_stairs", BEECH_PLANKS, defaultWood(MaterialColor.PODZOL));
    public static final RegistryObject<Block> BEECH_FENCE = fence("beech_fence", defaultWood(MaterialColor.PODZOL));
    public static final RegistryObject<Block> BEECH_DOOR = door("beech_door", defaultWood(MaterialColor.PODZOL));
    public static final RegistryObject<Block> BEECH_SLAB = slab("beech_slab", defaultWood(MaterialColor.PODZOL));
    public static final RegistryObject<Block> BEECH_WALL = wall("beech_wall", defaultWood(MaterialColor.PODZOL));

    public static final RegistryObject<Block> DATURA = BLOCKS.register("datura", () -> new DaturaBlock(defaultPlants(SoundType.CROP)));
    public static final RegistryObject<Block> BELLADONNA = BLOCKS.register("belladonna", () -> new BelladonnaBlock(defaultPlants(SoundType.CROP)));
    public static final RegistryObject<Block> CHILI_PEPPER = BLOCKS.register("chili_pepper", () -> new ChiliPepperBlock(defaultPlants(SoundType.CROP)));

    public static final RegistryObject<Block> IRON_BIRCH_SAPLING = register("iron_birch_sapling",
            () -> new SaplingBlock(new IronBirchGrower(), defaultPlants(SoundType.GRASS)));
    public static final RegistryObject<Block> BEECH_SAPLING = register("beech_sapling",
            () -> new SaplingBlock(new BeechGrower(), defaultPlants(SoundType.GRASS)));

    public static final RegistryObject<Block> POTTED_IRON_BIRCH_SAPLING = flowerPot("potted_iron_birch_sapling", IRON_BIRCH_SAPLING);
    public static final RegistryObject<Block> POTTED_BEECH_SAPLING = flowerPot("potted_beech_sapling", BEECH_SAPLING);

    private static BlockBehaviour.Properties defaultPlants(SoundType soundType) {
        return BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(soundType);
    }

    private static BlockBehaviour.Properties defaultWood(MaterialColor materialColor) {
        return BlockBehaviour.Properties.of(Material.WOOD, materialColor).strength(2.0F, 3.0F).sound(SoundType.WOOD);
    }

    private static BlockBehaviour.Properties copy(BlockBehaviour blockBehaviour) {
        return BlockBehaviour.Properties.copy(blockBehaviour);
    }

}