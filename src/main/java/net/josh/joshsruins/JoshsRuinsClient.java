package net.josh.joshsruins;


import net.josh.joshsruins.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.AxeItem;


public class JoshsRuinsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.Rotten_Trapdoor, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.Rotten_Door, RenderLayer.getCutout());
        ModBlocks.registerStrippables();
        ModBlocks.registerStrippables();


    }
}
