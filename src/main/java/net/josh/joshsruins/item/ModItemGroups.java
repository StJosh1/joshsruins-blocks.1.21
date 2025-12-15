package net.josh.joshsruins.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.josh.joshsruins.JoshsRuins;
import net.josh.joshsruins.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup Joshs_Ruins_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(JoshsRuins.MOD_ID, "joshs_ruins_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DUST))
                    .displayName(Text.translatable("itemgroup.joshsruins.joshs_ruins_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.DUST);
                        entries.add(ModItems.Sandy_Dust);
                        entries.add(ModItems.Molten_Dust);
                        entries.add(ModItems.Moss_Clump);
                        entries.add(ModItems.Mushroom_Clump);
                        entries.add(ModItems.Snowy_Clump);
                        entries.add(ModItems.Service_Music_Disc);
                        entries.add(ModItems.Hard_Music_Disc);
                        entries.add(ModItems.Save_Me_Music_Disc);
                        entries.add(ModItems.Crucifix);

                    }).build());

    public static final ItemGroup Joshs_Ruins_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(JoshsRuins.MOD_ID, "joshs_ruins_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.Rotten_Log))
                    .displayName(Text.translatable("itemgroup.joshsruins.joshs_ruins_blocks"))
                    .entries((displayContext, entries) -> {

                        //tables
                        entries.add(ModBlocks.ClumpingTableBlock);


                        //Rotten Wood Set
                        entries.add(ModBlocks.Rotten_Log);
                        entries.add(ModBlocks.Stripped_Rotten_Log);
                        entries.add(ModBlocks.Rotten_Planks);
                        entries.add(ModBlocks.Rotten_Stairs);
                        entries.add(ModBlocks.Rotten_Slab);
                        entries.add(ModBlocks.Rotten_Trapdoor);
                        entries.add(ModBlocks.Rotten_Door);
                        entries.add(ModBlocks.Rotten_Fence_Gate);
                        entries.add(ModBlocks.Rotten_Fence);
                        entries.add(ModBlocks.Burning_Rotten_Log);
                        entries.add(ModBlocks.Burning_Rotten_Planks);
                        entries.add(ModBlocks.Burning_Rotten_Stairs);
                        entries.add(ModBlocks.Burning_Rotten_Slab);

                        entries.add(ModBlocks.Cracked_Bricks);
                        entries.add(ModBlocks.Cracked_Brick_Stairs);
                        entries.add(ModBlocks.Cracked_Brick_Slab);
                        entries.add(ModBlocks.Brick_Pile);
                        entries.add(ModBlocks.BrickCluster);

                        //Mossy Rotten Wood + moss_pile

                        entries.add(ModBlocks.Mossy_Rotten_Log_Vert);
                        entries.add(ModBlocks.Mossy_Sided_Rotten_Log_Vert);
                        entries.add(ModBlocks.Mossy_Sided_Rotten_Log);
                        entries.add(ModBlocks.Half_Mossy_Sided_Rotten_Log);
                        entries.add(ModBlocks.Lower_Half_Mossy_Sided_Rotten_Log);

                        entries.add(ModBlocks.Mossy_Rotten_Planks_Vert);
                        entries.add(ModBlocks.Mossy_Sided_Rotten_Planks_Vert);
                        entries.add(ModBlocks.Mossy_Rotten_Planks);
                        entries.add(ModBlocks.Half_Mossy_Rotten_Planks);
                        entries.add(ModBlocks.Lower_Half_Mossy_Rotten_Planks);



                        entries.add(ModBlocks.Mossy_Bricks_Vert);
                        entries.add(ModBlocks.Mossy_Sided_Bricks_Vert);
                        entries.add(ModBlocks.Mossy_Bricks);
                        entries.add(ModBlocks.Half_Mossy_Bricks);
                        entries.add(ModBlocks.Lower_Half_Mossy_Bricks);

                        entries.add(ModBlocks.Mossy_Vine);
                        entries.add(ModBlocks.Moss_Pile);

                        //SANDY

                        entries.add(ModBlocks.Sandy_Rotten_Log_Vert);
                        entries.add(ModBlocks.Sandy_Sided_Rotten_Log_Vert);
                        entries.add(ModBlocks.Sandy_Rotten_Log);
                        entries.add(ModBlocks.Half_Sandy_Rotten_Log);
                        entries.add(ModBlocks.Lower_Half_Sandy_Rotten_Log);

                        entries.add(ModBlocks.Sandy_Rotten_Planks_Vert);
                        entries.add(ModBlocks.Sandy_Sided_Rotten_Planks_Vert);
                        entries.add(ModBlocks.Sandy_Rotten_Planks);
                        entries.add(ModBlocks.Half_Sandy_Rotten_Planks);
                        entries.add(ModBlocks.Lower_Half_Sandy_Rotten_Planks);


                        //Mossy Brick Set + brick_pile


                        entries.add(ModBlocks.Sandy_Bricks);
                        entries.add(ModBlocks.Sandy_Bricks_Vert);
                        entries.add(ModBlocks.Sandy_Sided_Bricks_Vert);
                        entries.add(ModBlocks.Half_Sandy_Bricks);
                        entries.add(ModBlocks.Lower_Half_Sandy_Bricks);
                        entries.add(ModBlocks.Sandy_Vine);

                        //Snowy Logs
                        entries.add(ModBlocks.Snowy_Rotten_Log);
                        entries.add(ModBlocks.Snowy_Rotten_Log_Vert);
                        entries.add(ModBlocks.Snowy_Sided_Rotten_Log_Vert);
                        entries.add(ModBlocks.Half_Snowy_Rotten_Log);
                        entries.add(ModBlocks.Lower_Half_Snowy_Rotten_Log);

                        //SNOWY PLANKS

                        entries.add(ModBlocks.Snowy_Rotten_Planks);
                        entries.add(ModBlocks.Snowy_Rotten_Planks_Vert);
                        entries.add(ModBlocks.Snowy_Sided_Rotten_Planks_Vert);
                        entries.add(ModBlocks.Half_Snowy_Rotten_Planks);
                        entries.add(ModBlocks.Lower_Half_Snowy_Rotten_Planks);


                        //Snowy Bricks
                        entries.add(ModBlocks.Snowy_Bricks);
                        entries.add(ModBlocks.Snowy_Bricks_Vert);
                        entries.add(ModBlocks.Snowy_Sided_Bricks_Vert);
                        entries.add(ModBlocks.Half_Snowy_Bricks);
                        entries.add(ModBlocks.Lower_Half_Snowy_Bricks);

                        entries.add(ModBlocks.Snowy_Vine);

                        //Sand

                        entries.add(ModBlocks.Boney_Sand);
                        entries.add(ModBlocks.Sand_Pile);



                        //Dust
                        entries.add(ModBlocks.Dust_Block);
                        entries.add(ModBlocks.Dust_Pile);
                        entries.add(ModBlocks.Molten_Dust_Block);
                        entries.add(ModBlocks.Molten_Dust_Pile);
                        entries.add(ModBlocks.DustBunny);

                        //Charcoal after dust
                        entries.add(ModBlocks.Charcoal_Pile);

                        //Bone
                        entries.add(ModBlocks.Bone_Pile_Block);
                        entries.add(ModBlocks.Bone_Pile);
                        entries.add(ModBlocks.BigBone);

                        entries.add(ModBlocks.Skeleton_Corpse);
                        entries.add(ModBlocks.Laying_Skeleton_Corpse);
                        entries.add(ModBlocks.Headless_Laying_Skeleton_Corpse);
                        entries.add(ModBlocks.Mossy_Skeleton_Corpse);
                        entries.add(ModBlocks.Mossy_Laying_Skeleton_Corpse);
                        entries.add(ModBlocks.Headless_Mossy_Laying_Skeleton_Corpse);

                        entries.add(ModBlocks.Snowy_Skeleton_Corpse);
                        entries.add(ModBlocks.Snowy_Laying_Skeleton_Corpse);
                        entries.add(ModBlocks.Headless_Snowy_Laying_Skeleton_Corpse);

                        entries.add(ModBlocks.Sandy_Skeleton_Corpse);
                        entries.add(ModBlocks.Sandy_Laying_Skeleton_Corpse);
                        entries.add(ModBlocks.Headless_Sandy_Laying_Skeleton_Corpse);

                        entries.add(ModBlocks.Burning_Skeleton_Corpse);
                        entries.add(ModBlocks.Burning_Laying_Skeleton_Corpse);
                        entries.add(ModBlocks.Headless_Burning_Laying_Skeleton_Corpse);


                        entries.add(ModBlocks.Frozen_Skull);

                       //Cracked OREs
                        entries.add(ModBlocks.Cracked_Diamond_Block);
                        entries.add(ModBlocks.Cracked_Gold_Block);
                        entries.add(ModBlocks.Gold_Pile);
                        entries.add(ModBlocks.GoldCoin);
                        entries.add(ModBlocks.Crown);
                        entries.add(ModBlocks.Cracked_Iron_Block);

                        entries.add(ModBlocks.Iron_Pile);

                        entries.add(ModBlocks.BrokenSword);
                        entries.add(ModBlocks.BrokenPickaxe);
                        entries.add(ModBlocks.RoyalFlag);





                    }).build());


    public static void registerItemGroups() {
        JoshsRuins.LOGGER.info("Registering Item Groups for " + JoshsRuins.MOD_ID);
    }
}