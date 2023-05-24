package com.glyceryl6.aaa.blocks;

import com.glyceryl6.aaa.blocks.entity.DistillerEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class Distiller extends BaseEntityBlock {

    protected static final VoxelShape SHAPE = Shapes.or(
            Block.box(0.0D, 0.0D, 2.0D, 16.0D, 1.0D, 14.0D),
            Block.box(7.0D, 1.0D, 4.0D, 15.0D, 2.0D, 12.0D),
            Block.box(1.0D, 1.0D, 6.0D, 5.0D, 7.0D, 10.0D),
            Block.box(7.0D, 8.0D, 4.0D, 15.0D, 10.0D, 12.0D),
            Block.box(9.0D, 10.0D, 6.0D, 13.0D, 14.0D, 10.0D),
            Block.box(10.0D, 14.0D, 7.0D, 12.0D, 16.0D, 9.0D),
            Block.box(6.0D, 7.0D, 7.0D, 14.0D, 9.0D, 9.0D),
            Block.box(6.0D, 2.0D, 3.0D, 16.0D, 8.0D, 13.0D),
            Block.box(2.09913D, 6.61102D, 7.1D, 3.89913D, 10.61102D, 8.9D));

    public Distiller() {
        super(Properties.copy(Blocks.STONE).explosionResistance(50.0F));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide()) {
            BlockEntity blockEntity = level.getBlockEntity(pos);
            if (blockEntity instanceof DistillerEntity distillerEntity) {
                NetworkHooks.openScreen(((ServerPlayer)player), distillerEntity, pos);
            }
        }
        return InteractionResult.sidedSuccess(level.isClientSide());
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = level.getBlockEntity(pos);
            if (blockEntity instanceof DistillerEntity) {

            }
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new DistillerEntity(pos, state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

}