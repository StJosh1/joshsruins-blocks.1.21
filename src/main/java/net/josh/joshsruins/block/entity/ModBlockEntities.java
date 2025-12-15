package net.josh.joshsruins.block.entity;

import net.josh.joshsruins.JoshsRuins;
import net.josh.joshsruins.block.ModBlocks;
import net.josh.joshsruins.block.entity.custom.ClumpingTableBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<ClumpingTableBlockEntity> CLUMPING_TABLE_BLOCK_ENTITY_TYPE =
            Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    Identifier.of(JoshsRuins.MOD_ID, "clumpingtable"),
                    BlockEntityType.Builder.create(ClumpingTableBlockEntity::new, ModBlocks.ClumpingTableBlock).build(null)
            );

    public static void registerBlockEntities() {
        JoshsRuins.LOGGER.info("Registering Block Entities for " + JoshsRuins.MOD_ID);
    }
}
