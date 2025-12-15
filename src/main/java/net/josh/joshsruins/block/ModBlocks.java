package net.josh.joshsruins.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.josh.joshsruins.JoshsRuins;
import net.josh.joshsruins.block.*;
import net.josh.joshsruins.block.custom.*;
import net.josh.joshsruins.block.custom.CrownBlock;
import net.josh.joshsruins.block.custom.DustBunnyBlock;
import net.josh.joshsruins.block.custom.FrozenSkullBlock;
import net.josh.joshsruins.block.custom.GoldCoinBlock;
import net.josh.joshsruins.block.custom.LayingSkeletonCorpseBlock;
import net.josh.joshsruins.block.custom.MossySkeletonCorpseBlock;
import net.josh.joshsruins.block.custom.RoyalFlagBlock;


import net.josh.joshsruins.block.custom.SkeletonCorpseBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.Block;


//LOG SHEIT

public class ModBlocks {

    public static final Block GoldCoin = registerBlock("goldcoin",new GoldCoinBlock(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block RoyalFlag = registerBlock("royalflag",new net.josh.joshsruins.block.custom.RoyalFlagBlock(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block BigBone = registerBlock("bigbone",new GoldCoinBlock(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block BrickCluster = registerBlock("brickcluster",new GoldCoinBlock(AbstractBlock.Settings.create().nonOpaque()));


    public static final Block BrokenSword = registerBlock("brokensword",new GoldCoinBlock(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block BrokenPickaxe = registerBlock("brokenpickaxe",new GoldCoinBlock(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block Crown = registerBlock("crown",new CrownBlock(AbstractBlock.Settings.create().nonOpaque().luminance(state -> 7).strength(1.0f)));

    public static final Block DustBunny = registerBlock("dustbunny",new DustBunnyBlock(AbstractBlock.Settings.create().nonOpaque()));




    public static final Block ClumpingTableBlock = registerBlock("clumpingtable",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));




    public static final Block Rotten_Log = registerBlock("rotten_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));


    public static final Block Stripped_Rotten_Log = registerBlock("stripped_rotten_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Burning_Rotten_Log = registerBlock("burning_rotten_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).luminance(state -> 7).sounds(BlockSoundGroup.WOOD)));




    //PLANKS AND SHIIEET

    public static final Block Rotten_Planks = registerBlock("rotten_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Burning_Rotten_Planks = registerBlock("burning_rotten_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).luminance(state -> 7).sounds(BlockSoundGroup.WOOD)));

    public static final Block Rotten_Slab = registerBlock("rotten_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Rotten_Stairs = registerBlock("rotten_stairs",
            new StairsBlock(ModBlocks.Rotten_Planks.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.Rotten_Planks)));


    public static final Block Burning_Rotten_Slab = registerBlock("burning_rotten_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).luminance(state -> 7).sounds(BlockSoundGroup.WOOD)));

    public static final Block Burning_Rotten_Stairs = registerBlock("burning_rotten_stairs",
            new StairsBlock(ModBlocks.Burning_Rotten_Planks.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.Burning_Rotten_Planks)));



    public static final Block Rotten_Fence = registerBlock("rotten_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.Rotten_Planks)));

    public static final Block Rotten_Fence_Gate = registerBlock("rotten_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(ModBlocks.Rotten_Planks) ));

    public static final Block Rotten_Trapdoor = registerBlock("rotten_trapdoor",
            new TrapdoorBlock(BlockSetType.ACACIA,AbstractBlock.Settings.create().strength(2f).nonOpaque()));

    public static final Block Rotten_Door = registerBlock("rotten_door",
            new DoorBlock(BlockSetType.ACACIA,AbstractBlock.Settings.create().strength(2f).nonOpaque()));



    //SANDY PLANKS

    public static final  Block Sandy_Rotten_Planks_Vert = registerBlock("sandy_rotten_planks_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final  Block Sandy_Sided_Rotten_Planks_Vert = registerBlock("sandy_sided_rotten_planks_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final  Block Sandy_Rotten_Planks = registerBlock("sandy_rotten_planks",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Half_Sandy_Rotten_Planks = registerBlock("half_sandy_rotten_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Lower_Half_Sandy_Rotten_Planks = registerBlock("lower_half_sandy_rotten_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));


//SANDY LOGS

    public static final  Block Sandy_Rotten_Log_Vert = registerBlock("sandy_rotten_log_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final  Block Sandy_Sided_Rotten_Log_Vert = registerBlock("sandy_sided_rotten_log_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final  Block Sandy_Rotten_Log = registerBlock("sandy_rotten_log",
            new PillarBlock(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Half_Sandy_Rotten_Log = registerBlock("half_sandy_rotten_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Lower_Half_Sandy_Rotten_Log = registerBlock("lower_half_sandy_rotten_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

//Snowy Logs

public static final  Block Snowy_Rotten_Log = registerBlock("snowy_rotten_log",
        new PillarBlock(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final  Block Snowy_Rotten_Log_Vert = registerBlock("snowy_rotten_log_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final  Block Snowy_Sided_Rotten_Log_Vert = registerBlock("snowy_sided_rotten_log_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Half_Snowy_Rotten_Log = registerBlock("half_snowy_rotten_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Lower_Half_Snowy_Rotten_Log = registerBlock("lower_half_snowy_rotten_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

//SNOWY BRICKS

public static final  Block Snowy_Bricks = registerBlock("snowy_bricks",
        new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.STONE)));

    public static final  Block Snowy_Bricks_Vert = registerBlock("snowy_bricks_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.STONE)));

    public static final  Block Snowy_Sided_Bricks_Vert = registerBlock("snowy_sided_bricks_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.STONE)));

    public static final Block Half_Snowy_Bricks = registerBlock("half_snowy_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.STONE)));

    public static final Block Lower_Half_Snowy_Bricks = registerBlock("lower_half_snowy_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.STONE)));

    //SNOWY PLANKS

    public static final  Block Snowy_Rotten_Planks = registerBlock("snowy_rotten_planks",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final  Block Snowy_Rotten_Planks_Vert = registerBlock("snowy_rotten_planks_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final  Block Snowy_Sided_Rotten_Planks_Vert = registerBlock("snowy_sided_rotten_planks_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Half_Snowy_Rotten_Planks = registerBlock("half_snowy_rotten_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Lower_Half_Snowy_Rotten_Planks = registerBlock("lower_half_snowy_rotten_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));


//Mossy planks n sheieitr


    public static final  Block Mossy_Rotten_Planks_Vert = registerBlock("mossy_rotten_planks_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final  Block Mossy_Sided_Rotten_Planks_Vert = registerBlock("mossy_sided_rotten_planks_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final  Block Mossy_Rotten_Planks = registerBlock("mossy_rotten_planks",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Half_Mossy_Rotten_Planks = registerBlock("half_mossy_rotten_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Lower_Half_Mossy_Rotten_Planks = registerBlock("lower_half_mossy_rotten_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));


    //MOSSY SHEEIT

    public static final Block Mossy_Sided_Rotten_Log = registerBlock("mossy_sided_rotten_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Half_Mossy_Sided_Rotten_Log = registerBlock("half_mossy_sided_rotten_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block Lower_Half_Mossy_Sided_Rotten_Log = registerBlock("lower_half_mossy_sided_rotten_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));



    public static final  Block Mossy_Rotten_Log_Vert = registerBlock("mossy_rotten_log_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final  Block Mossy_Sided_Rotten_Log_Vert = registerBlock("mossy_sided_rotten_log_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));







    //Mossy BRICKS SHHIIIIET

    public static final Block Mossy_Bricks = registerBlock("mossy_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block Half_Mossy_Bricks = registerBlock("half_mossy_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block Lower_Half_Mossy_Bricks = registerBlock("lower_half_mossy_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final  Block Mossy_Bricks_Vert = registerBlock("mossy_bricks_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.STONE)));

    public static final  Block Mossy_Sided_Bricks_Vert = registerBlock("mossy_sided_bricks_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.STONE)));



//cracked bricks

    public static final Block Cracked_Bricks = registerBlock("cracked_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.STONE)));


    public static final Block Cracked_Brick_Slab = registerBlock("cracked_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.STONE)));

    public static final Block Cracked_Brick_Stairs = registerBlock("cracked_brick_stairs",
            new StairsBlock(ModBlocks.Cracked_Bricks.getDefaultState(),
                    FabricBlockSettings.copyOf(ModBlocks.Cracked_Bricks)));




                    //sandy bricks

    public static final Block Lower_Half_Sandy_Bricks = registerBlock("lower_half_sandy_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block Half_Sandy_Bricks = registerBlock("half_sandy_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block Sandy_Bricks = registerBlock("sandy_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.STONE)));

    public static final  Block Sandy_Bricks_Vert = registerBlock("sandy_bricks_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.STONE)));

    public static final  Block Sandy_Sided_Bricks_Vert = registerBlock("sandy_sided_bricks_vert",
            new Block(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.STONE)));




//RANDOM SHEIT
public static final Block Dust_Block = registerBlock("dust_block",
        new Block(AbstractBlock.Settings.create().strength(.2f).sounds(BlockSoundGroup.GRAVEL)));

    public static final Block Molten_Dust_Block = registerBlock("molten_dust_block",
            new Block(AbstractBlock.Settings.create().luminance(state -> 7).strength(.2f).sounds(BlockSoundGroup.GRAVEL)));

    public static final Block Bone_Pile_Block = registerBlock("bone_pile_block",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.BONE)));

    public static final Block Cracked_Diamond_Block = registerBlock("cracked_diamond_block",
            new Block(AbstractBlock.Settings.create().strength(5f).sounds(BlockSoundGroup.METAL)));

    public static final Block Cracked_Gold_Block = registerBlock("cracked_gold_block",
            new Block(AbstractBlock.Settings.create().strength(5f).sounds(BlockSoundGroup.METAL)));

    public static final Block Cracked_Iron_Block = registerBlock("cracked_iron_block",
            new Block(AbstractBlock.Settings.create().strength(5f).sounds(BlockSoundGroup.METAL)));

    public static final Block Mossy_Vine = registerBlock("mossy_vine",
            new VineBlock(AbstractBlock.Settings.create().nonOpaque().noCollision().requiresTool().strength(0.2f).sounds(BlockSoundGroup.VINE)));

    public static final Block Sandy_Vine = registerBlock("sandy_vine",
            new VineBlock(AbstractBlock.Settings.create().nonOpaque().noCollision().requiresTool().strength(0.2f).sounds(BlockSoundGroup.VINE)));

    public static final Block Snowy_Vine = registerBlock("snowy_vine",
            new VineBlock(AbstractBlock.Settings.create().nonOpaque().noCollision().requiresTool().strength(0.2f).sounds(BlockSoundGroup.VINE)));

    public static final Block Skeleton_Corpse = registerBlock("skeleton_corpse",
            new SkeletonCorpseBlock(AbstractBlock.Settings.create().nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));

    public static final Block Burning_Skeleton_Corpse = registerBlock("burning_skeleton_corpse",
            new net.josh.joshsruins.block.custom.BurningSkeletonCorpseBlock(AbstractBlock.Settings.create().luminance(state -> 7).nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));

    public static final Block Burning_Laying_Skeleton_Corpse = registerBlock("burning_laying_skeleton_corpse",
            new net.josh.joshsruins.block.custom.BurningLayingSkeletonCorpseBlock(AbstractBlock.Settings.create().luminance(state -> 7).nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));

    public static final Block Headless_Burning_Laying_Skeleton_Corpse = registerBlock("headless_burning_laying_skeleton_corpse",
            new net.josh.joshsruins.block.custom.BurningLayingSkeletonCorpseBlock(AbstractBlock.Settings.create().luminance(state -> 7).nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));

    public static final Block Sandy_Skeleton_Corpse = registerBlock("sandy_skeleton_corpse",
            new net.josh.joshsruins.block.custom.SandySkeletonCorpseBlock(AbstractBlock.Settings.create().nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));

    public static final Block Frozen_Skull = registerBlock("frozen_skull",
            new net.josh.joshsruins.block.custom.FrozenSkullBlock(AbstractBlock.Settings.create().nonOpaque().strength(1f).sounds(BlockSoundGroup.GLASS)));

    public static final Block Snowy_Skeleton_Corpse = registerBlock("snowy_skeleton_corpse",
            new net.josh.joshsruins.block.custom.SnowySkeletonCorpseBlock(AbstractBlock.Settings.create().nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));

    public static final Block Mossy_Skeleton_Corpse = registerBlock("mossy_skeleton_corpse",
            new net.josh.joshsruins.block.custom.MossySkeletonCorpseBlock(AbstractBlock.Settings.create().nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));


    public static final Block Laying_Skeleton_Corpse = registerBlock("laying_skeleton_corpse",
            new net.josh.joshsruins.block.custom.LayingSkeletonCorpseBlock(AbstractBlock.Settings.create().nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));

    public static final Block Snowy_Laying_Skeleton_Corpse = registerBlock("snowy_laying_skeleton_corpse",
            new net.josh.joshsruins.block.custom.SnowyLayingSkeletonCorpseBlock(AbstractBlock.Settings.create().nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));

    public static final Block Headless_Snowy_Laying_Skeleton_Corpse = registerBlock("headless_snowy_laying_skeleton_corpse",
            new net.josh.joshsruins.block.custom.SnowyLayingSkeletonCorpseBlock(AbstractBlock.Settings.create().nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));

    public static final Block Sandy_Laying_Skeleton_Corpse = registerBlock("sandy_laying_skeleton_corpse",
            new net.josh.joshsruins.block.custom.LayingSkeletonCorpseBlock(AbstractBlock.Settings.create().nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));


    public static final Block Headless_Sandy_Laying_Skeleton_Corpse = registerBlock("headless_sandy_laying_skeleton_corpse",
            new net.josh.joshsruins.block.custom.LayingSkeletonCorpseBlock(AbstractBlock.Settings.create().nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));

    public static final Block Mossy_Laying_Skeleton_Corpse = registerBlock("mossy_laying_skeleton_corpse",
            new net.josh.joshsruins.block.custom.MossyLayingSkeletonCorpseBlock(AbstractBlock.Settings.create().nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));

    public static final Block Headless_Mossy_Laying_Skeleton_Corpse = registerBlock("headless_mossy_laying_skeleton_corpse",
            new net.josh.joshsruins.block.custom.MossyLayingSkeletonCorpseBlock(AbstractBlock.Settings.create().nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));

    public static final Block Headless_Laying_Skeleton_Corpse = registerBlock("headless_laying_skeleton_corpse",
            new net.josh.joshsruins.block.custom.LayingSkeletonCorpseBlock(AbstractBlock.Settings.create().nonOpaque().strength(5f).sounds(BlockSoundGroup.BONE)));

    public static final Block Boney_Sand = registerBlock("boney_sand",
            new Block(AbstractBlock.Settings.create().strength(.5f).sounds(BlockSoundGroup.SAND)));



//PILE OF SHEEEIT




    public static final  Block Charcoal_Pile = registerBlock("charcoal_pile",
            new SnowBlock(FabricBlockSettings.create().strength(.2f).sounds(BlockSoundGroup.BONE)));

    public static final  Block Moss_Pile = registerBlock("moss_pile",
            new SnowBlock(FabricBlockSettings.create().strength(.2f).sounds(BlockSoundGroup.MOSS_BLOCK)));

    public static final  Block Dust_Pile = registerBlock("dust_pile",
            new SnowBlock(FabricBlockSettings.create().strength(.2f).sounds(BlockSoundGroup.GRAVEL)));

    public static final  Block Brick_Pile = registerBlock("brick_pile",
            new SnowBlock(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.STONE)));


    public static final  Block Gold_Pile = registerBlock("gold_pile",
            new SnowBlock(FabricBlockSettings.create().strength(5f).sounds(BlockSoundGroup.METAL)));

    public static final  Block Iron_Pile = registerBlock("iron_pile",
            new SnowBlock(FabricBlockSettings.create().strength(5f).sounds(BlockSoundGroup.METAL)));

    public static final  Block Bone_Pile = registerBlock("bone_pile",
            new SnowBlock(FabricBlockSettings.create().strength(2f).sounds(BlockSoundGroup.BONE)));

    public static final  Block Sand_Pile = registerBlock("sand_pile",
            new SnowBlock(FabricBlockSettings.create().strength(.5f).sounds(BlockSoundGroup.SAND)));

    public static final  Block Molten_Dust_Pile = registerBlock("molten_dust_pile",
            new SnowBlock(FabricBlockSettings.create().luminance(state -> 7).strength(.5f).sounds(BlockSoundGroup.GRAVEL)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(JoshsRuins.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(JoshsRuins.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerStrippables() {
        StrippableBlockRegistry.register(Rotten_Log, Stripped_Rotten_Log);
    }


    public static void registerModBlocks() {
        JoshsRuins.LOGGER.info("Registering Mod Blocks for " + JoshsRuins.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.Rotten_Log);
            entries.add(ModBlocks.Rotten_Planks);
            entries.add(ModBlocks.Rotten_Slab);
            entries.add(ModBlocks.Mossy_Rotten_Planks_Vert);
            entries.add(ModBlocks.Mossy_Rotten_Log_Vert);
            entries.add(ModBlocks.Charcoal_Pile);
            entries.add(ModBlocks.Rotten_Stairs);
            entries.add(ModBlocks.Rotten_Fence);
            entries.add(ModBlocks.Rotten_Fence_Gate);
            entries.add(ModBlocks.Rotten_Trapdoor);
            entries.add(ModBlocks.Stripped_Rotten_Log);
            entries.add(ModBlocks.Mossy_Sided_Rotten_Log);
            entries.add(ModBlocks.Mossy_Sided_Rotten_Log_Vert);
            entries.add(ModBlocks.Moss_Pile);
            entries.add(ModBlocks.Half_Mossy_Sided_Rotten_Log);
            entries.add(ModBlocks.Lower_Half_Mossy_Sided_Rotten_Log);
            entries.add(ModBlocks.Dust_Block);
            entries.add(ModBlocks.Cracked_Diamond_Block);
            entries.add(ModBlocks.Brick_Pile);
            entries.add(ModBlocks.Cracked_Gold_Block);
            entries.add(ModBlocks.Bone_Pile);
            entries.add(ModBlocks.Bone_Pile_Block);
            entries.add(ModBlocks.Mossy_Bricks);
            entries.add(ModBlocks.Mossy_Sided_Bricks_Vert);
            entries.add(ModBlocks.Mossy_Bricks_Vert);
            entries.add(ModBlocks.Rotten_Door);
            entries.add(ModBlocks.Cracked_Iron_Block);
            entries.add(ModBlocks.Iron_Pile);
            entries.add(ModBlocks.Cracked_Bricks);
            entries.add(ModBlocks.Boney_Sand);
            entries.add(ModBlocks.Sand_Pile);
            entries.add(ModBlocks.Sandy_Bricks_Vert);
            entries.add(ModBlocks.Sandy_Sided_Bricks_Vert);
            entries.add(ModBlocks.Sandy_Bricks);
            entries.add(ModBlocks.Half_Sandy_Bricks);
            entries.add(ModBlocks.Lower_Half_Sandy_Bricks);
            entries.add(ModBlocks.Mossy_Rotten_Planks);
            entries.add(ModBlocks.Mossy_Sided_Rotten_Planks_Vert);
            entries.add(ModBlocks.Lower_Half_Mossy_Rotten_Planks);
            entries.add(ModBlocks.Half_Mossy_Rotten_Planks);

            entries.add(ModBlocks.Sandy_Rotten_Planks);
            entries.add(ModBlocks.Sandy_Rotten_Planks_Vert);
            entries.add(ModBlocks.Sandy_Sided_Rotten_Planks_Vert);
            entries.add(ModBlocks.Half_Sandy_Rotten_Planks);
            entries.add(ModBlocks.Lower_Half_Sandy_Rotten_Planks);

            entries.add(ModBlocks.Sandy_Rotten_Log);
            entries.add(ModBlocks.Sandy_Rotten_Log_Vert);
            entries.add(ModBlocks.Sandy_Sided_Rotten_Log_Vert);
            entries.add(ModBlocks.Half_Sandy_Rotten_Log);
            entries.add(ModBlocks.Lower_Half_Sandy_Rotten_Log);

            entries.add(ModBlocks.Burning_Rotten_Stairs);
            entries.add(ModBlocks.Burning_Rotten_Slab);

            entries.add(ModBlocks.Snowy_Bricks);
            entries.add(ModBlocks.Snowy_Bricks_Vert);
            entries.add(ModBlocks.Snowy_Sided_Bricks_Vert);
            entries.add(ModBlocks.Half_Snowy_Bricks);
            entries.add(ModBlocks.Lower_Half_Snowy_Bricks);

            entries.add(ModBlocks.Snowy_Rotten_Planks);
            entries.add(ModBlocks.Snowy_Rotten_Planks_Vert);
            entries.add(ModBlocks.Snowy_Sided_Rotten_Planks_Vert);
            entries.add(ModBlocks.Half_Snowy_Rotten_Planks);
            entries.add(ModBlocks.Lower_Half_Snowy_Rotten_Planks);

            entries.add(ModBlocks.Snowy_Rotten_Log);
            entries.add(ModBlocks.Snowy_Rotten_Log_Vert);
            entries.add(ModBlocks.Snowy_Sided_Rotten_Log_Vert);
            entries.add(ModBlocks.Half_Snowy_Rotten_Log);
            entries.add(ModBlocks.Lower_Half_Snowy_Rotten_Log);
            entries.add(ModBlocks.GoldCoin);
            entries.add(ModBlocks.BigBone);
            entries.add(ModBlocks.BrokenSword);
            entries.add(ModBlocks.BrokenPickaxe);
            entries.add(ModBlocks.BrickCluster);
            entries.add(ModBlocks.Crown);
            entries.add(ModBlocks.DustBunny);
            entries.add(ModBlocks.Mossy_Vine);

            entries.add(ModBlocks.Skeleton_Corpse);
            entries.add(ModBlocks.Snowy_Skeleton_Corpse);
            entries.add(ModBlocks.Laying_Skeleton_Corpse);
            entries.add(ModBlocks.RoyalFlag);
            entries.add(ModBlocks.Headless_Laying_Skeleton_Corpse);
            entries.add(ModBlocks.Mossy_Skeleton_Corpse);
            entries.add(ModBlocks.Mossy_Laying_Skeleton_Corpse);
            entries.add(ModBlocks.Sandy_Vine);
            entries.add(ModBlocks.Snowy_Vine);
            entries.add(ModBlocks.Snowy_Laying_Skeleton_Corpse);
            entries.add(ModBlocks.Frozen_Skull);
            entries.add(ModBlocks.Sandy_Skeleton_Corpse);
            entries.add(ModBlocks.Sandy_Laying_Skeleton_Corpse);
            entries.add(ModBlocks.Burning_Skeleton_Corpse);
            entries.add(ModBlocks.Burning_Laying_Skeleton_Corpse);
            entries.add(ModBlocks.Molten_Dust_Block);
            entries.add(ModBlocks.Headless_Mossy_Laying_Skeleton_Corpse);
            entries.add(ModBlocks.Headless_Snowy_Laying_Skeleton_Corpse);
            entries.add(ModBlocks.Headless_Sandy_Laying_Skeleton_Corpse);
            entries.add(ModBlocks.Headless_Burning_Laying_Skeleton_Corpse);
            entries.add(ModBlocks.Molten_Dust_Pile);

            entries.add(ModBlocks.ClumpingTableBlock);
        });
    }
}