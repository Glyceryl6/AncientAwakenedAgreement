package com.glyceryl6.aaa.blocks.entity.inventory;

import com.glyceryl6.aaa.blocks.entity.DistillerEntity;
import com.glyceryl6.aaa.registry.AAABlocks;
import com.glyceryl6.aaa.registry.AAAMenus;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

public class DistillerMenu extends AbstractContainerMenu {

    private final DistillerEntity distiller;
    private final Level level;

    public DistillerMenu(int containerId, Inventory inventory, FriendlyByteBuf extraData) {
        this(containerId, inventory, inventory.player.level.getBlockEntity(extraData.readBlockPos()));
    }

    public DistillerMenu(int containerId, Inventory inventory, BlockEntity blockEntity) {
        super(AAAMenus.DISTILLER_MENU.get(), containerId);
        checkContainerSize(inventory, 8);
        this.distiller = (DistillerEntity) blockEntity;
        this.level = inventory.player.level;
        this.distiller.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler -> {
            this.addSlot(new AAAResultSlot(handler, 0, 82, 31)); //副产物输出槽1
            this.addSlot(new AAAResultSlot(handler, 1, 82, 49)); //副产物输出槽2
            this.addSlot(new AAAResultSlot(handler, 2, 100, 49)); //副产物输出槽3
            this.addSlot(new AAAResultSlot(handler, 3, 100, 31)); //副产物输出槽4
            this.addSlot(new AAAResultSlot(handler, 4, 124, 35)); //主产物输出槽
            this.addSlot(new SlotItemHandler(handler, 5, 48, 35)); //配方输入槽1
            this.addSlot(new SlotItemHandler(handler, 6, 48, 71)); //配方输入槽2
            this.addSlot(new SlotItemHandler(handler, 7, 124, 71)); //瓶子输入槽
        });
        this.addPlayerInventory(inventory);
        this.addPlayerHotBar(inventory);
    }

    @Nonnull @Override
    public ItemStack quickMoveStack(@NotNull Player player, int index) {
        //Todo: need to fix the quick move stack of this menu.
        return ItemStack.EMPTY;
    }

    @Override
    public boolean stillValid(@NotNull Player player) {
        Block block = AAABlocks.DISTILLER.get();
        BlockPos pos = this.distiller.getBlockPos();
        return stillValid(ContainerLevelAccess.create(this.level, pos), player, block);
    }

    private void addPlayerInventory(Inventory inventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                int index = l + i * 9 + 9;
                int x = 8 + l * 18;
                int y = 100 + i * 18;
                this.addSlot(new Slot(inventory, index, x, y));
            }
        }
    }

    private void addPlayerHotBar(Inventory inventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(inventory, i, 8 + i * 18, 158));
        }
    }

}

class AAAResultSlot extends SlotItemHandler {

    public AAAResultSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return false;
    }

}