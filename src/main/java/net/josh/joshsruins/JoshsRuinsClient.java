package net.josh.joshsruins;


import net.josh.joshsruins.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

import net.minecraft.block.VineBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.SkullBlockEntityRenderer;
import net.minecraft.item.AxeItem;
import org.intellij.lang.annotations.Identifier;


public class JoshsRuinsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.Rotten_Trapdoor, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.Rotten_Door, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.Mossy_Vine);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.Sandy_Vine);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.Snowy_Vine);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.Frozen_Skull);


        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.Skeleton_Corpse, RenderLayer.getCutout());

        ModBlocks.registerStrippables();
        ModBlocks.registerStrippables();



    }
}
