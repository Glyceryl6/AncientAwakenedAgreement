package com.glyceryl6.aaa.utils;

import com.glyceryl6.aaa.registry.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@SuppressWarnings("deprecation")
public class AAABlockUtils {

    public static RegistryObject<Block> register(String name, Supplier<Block> block) {
        RegistryObject<Block> register = AAABlocks.BLOCKS.register(name, block);
        Item.Properties properties = new Item.Properties().tab(AAATabs.CD_TAB_0);
        AAAItems.ITEMS.register(name, () -> new BlockItem(register.get(), properties));
        return register;
    }

    public static RegistryObject<Block> normal(String name, BlockBehaviour.Properties properties) {
        return register(name, () -> new Block(properties));
    }

    public static RegistryObject<Block> ore(String name, BlockBehaviour.Properties properties) {
        return register(name, () -> new DropExperienceBlock(properties));
    }

    public static RegistryObject<Block> wood(String name, MaterialColor materialColor) {
        return register(name, () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, materialColor)
                .strength(2.0F).sound(SoundType.WOOD)));
    }

    public static RegistryObject<Block> flowerPot(String name, RegistryObject<Block> block) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion();
        return AAABlocks.BLOCKS.register(name, () -> new FlowerPotBlock(block.get(), properties));
    }

    public static RegistryObject<Block> pressurePlate(String name, BlockBehaviour.Properties properties) {
        return register(name, () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, properties));
    }

    public static RegistryObject<Block> fenceGate(String name, BlockBehaviour.Properties properties) {
        return register(name, () -> new FenceGateBlock(properties));
    }

    public static RegistryObject<Block> trapdoor(String name, BlockBehaviour.Properties properties) {
        return register(name, () -> new TrapDoorBlock(properties));
    }

    public static RegistryObject<Block> button(String name, boolean sensitive, BlockBehaviour.Properties properties) {
        return register(name, () -> sensitive ? new WoodButtonBlock(properties) : new StoneButtonBlock(properties));
    }

    public static <T extends Block> RegistryObject<Block> stair(String name, Supplier<T> block, BlockBehaviour.Properties properties) {
        return register(name, () -> new StairBlock(() -> block.get().defaultBlockState(), properties));
    }

    public static RegistryObject<Block> fence(String name, BlockBehaviour.Properties properties) {
        return register(name, () -> new FenceBlock(properties));
    }

    public static RegistryObject<Block> door(String name, BlockBehaviour.Properties properties) {
        return register(name, () -> new DoorBlock(properties));
    }

    public static RegistryObject<Block> slab(String name, BlockBehaviour.Properties properties) {
        return register(name, () -> new SlabBlock(properties));
    }

    public static RegistryObject<Block> wall(String name, BlockBehaviour.Properties properties) {
        return register(name, () -> new WallBlock(properties));
    }
    
}