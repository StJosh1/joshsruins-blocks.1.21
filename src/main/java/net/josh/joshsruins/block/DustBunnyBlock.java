package net.josh.joshsruins.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.BlockStateParticleEffect;
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

public class DustBunnyBlock extends HorizontalFacingBlock {
    public static final MapCodec<DustBunnyBlock> CODEC = createCodec(DustBunnyBlock::new);
    private static final VoxelShape SHAPE = Block.createCuboidShape(3.0, 0.0, 3.0, 13.0, 10.0, 13.0);

    public DustBunnyBlock(Settings settings) {
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
                String cmd = "item replace entity @s armor.head with joshsruins:dustbunny";
                ServerCommandSource source = server.getCommandSource()
                        .withEntity(serverPlayer)
                        .withSilent(); // Hide command feedback
                server.getCommandManager().executeWithPrefix(source, cmd);


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
        // 50% chance each client tick; tweak as you like
        if (random.nextFloat() < 0.5F) {
            // uniform position anywhere within the block (full 16x16x16 voxel space)
            double px = pos.getX() + random.nextDouble(); // [x, x+1)
            double py = pos.getY() + random.nextDouble() * (10.0 / 16.0);

            double pz = pos.getZ() + random.nextDouble(); // [z, z+1)

            // gentle, floating velocity
            double vx = (random.nextDouble() - 0.5) * 0.02;
            double vy = (random.nextDouble() - 0.5) * 0.02;
            double vz = (random.nextDouble() - 0.5) * 0.02;

            world.addParticle(
                    new BlockStateParticleEffect(ParticleTypes.FALLING_DUST, Blocks.GRAVEL.getDefaultState()),
                    px, py, pz, vx, vy, vz
            );
        }
    }
}
