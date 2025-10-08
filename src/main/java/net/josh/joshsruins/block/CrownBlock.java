package net.josh.joshsruins.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CrownBlock extends HorizontalFacingBlock {
    public static final MapCodec<CrownBlock> CODEC = createCodec(CrownBlock::new);
    private static final VoxelShape SHAPE = Block.createCuboidShape(4.0, 0.0, 5.0, 12.0, 2.0, 12.0);

    public CrownBlock(Settings settings) {
        super(settings);
    }

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

    // Right-click: equip crown if hand + head empty, then remove block
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              net.minecraft.entity.player.PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient && player instanceof ServerPlayerEntity serverPlayer) {
            ItemStack headSlot = serverPlayer.getEquippedStack(EquipmentSlot.HEAD);

            // Only with empty hand and empty head slot
            if (serverPlayer.getMainHandStack().isEmpty() && headSlot.isEmpty()) {
                MinecraftServer server = ((ServerWorld) world).getServer();
                String cmd = "item replace entity @s armor.head with joshsruins:crown";
                ServerCommandSource source = server.getCommandSource()
                        .withEntity(serverPlayer)
                        .withSilent(); // Hide command feedback
                server.getCommandManager().executeWithPrefix(source, cmd);
                //  Play a "royal" sound (broadcast to nearby players)
                ((ServerWorld) world).playSound(
                        null,                           // null = audible to all nearby players
                        pos, SoundEvents.BLOCK_BEACON_POWER_SELECT,
                        SoundCategory.PLAYERS,
                        0.5f,                          // volume
                        1.0f                           // pitch
                );

                // Remove the block (no drop)
                world.breakBlock(pos, false);


                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }

    //  Constant electric spark particles when placed
    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        // Adjust number and spread to your liking
        double x = pos.getX() + 0.5;
        double y = pos.getY() + 0.25;
        double z = pos.getZ() + 0.5;

        if (random.nextFloat() < 0.04F) { // 50% chance each tick
            double offsetX = (random.nextDouble() - 0.5) * 0.3;
            double offsetZ = (random.nextDouble() - 0.5) * 0.3;

            // Smaller velocity -> appears to “float” and last longer
            double vx = (random.nextDouble() - 0.5) * 0.02;
            double vy = random.nextDouble() * 0.02;
            double vz = (random.nextDouble() - 0.5) * 0.02;

            world.addParticle(ParticleTypes.ELECTRIC_SPARK, x + offsetX, y, z + offsetZ, vx, vy, vz);
        }
    }
}
