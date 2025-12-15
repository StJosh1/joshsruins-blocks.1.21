package net.josh.joshsruins.block.entity.custom;

import net.josh.joshsruins.block.entity.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class ClumpingTableBlockEntity extends BlockEntity {

    public ClumpingTableBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CLUMPING_TABLE_BLOCK_ENTITY_TYPE, pos, state);
    }
}
