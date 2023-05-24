package com.glyceryl6.aaa.registry;

import com.glyceryl6.aaa.AncientAwakenedAgreement;
import com.glyceryl6.aaa.blocks.entity.inventory.DistillerMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AAAMenus {

    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AncientAwakenedAgreement.MOD_ID);
    public static final RegistryObject<MenuType<DistillerMenu>> DISTILLER_MENU = registerMenu(DistillerMenu::new, "distiller_menu");

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenu(IContainerFactory<T> factory, String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

}