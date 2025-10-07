package net.josh.joshsruins.block.custom;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

// NEW imports:
import net.minecraft.item.Equipment;
import net.minecraft.entity.EquipmentSlot;

public class CrownBlock extends HorizontalFacingBlock implements Equipment {
    public static final MapCodec<CrownBlock> CODEC = createCodec(CrownBlock::new);
    private static final VoxelShape SHAPE = Block.createCuboidShape(3.0, 0.0, 3.0, 16.0, 1.0, 16.0);

    public CrownBlock(Settings settings) {
        super(settings);
    }
    public static final Block CROWN_BLOCK = new CrownBlock(FabricBlockSettings.create().strength(1.0f));
    public static final Item CROWN_BLOCK_ITEM = new BlockItem(CROWN_BLOCK,
            new Item.Settings()
                    .maxCount(1) // This makes it non-stackable
    );
    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    // ★ This is the key bit:
    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }
}
