package net.josh.joshsruins.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.josh.joshsruins.JoshsRuins;
import net.josh.joshsruins.sound.ModSounds;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;

import java.util.List;


public class ModItems {




    public static final Item DUST = registerItem("dust", new Item(new Item.Settings()));

    public static final Item Moss_Clump = registerItem("moss_clump", new Item(new Item.Settings()));

    public static final Item Sandy_Dust = registerItem("sandy_dust", new Item(new Item.Settings()));

    public static final Item Snowy_Clump = registerItem("snowy_clump", new Item(new Item.Settings()));

    public static final Item Crucifix = registerItem("crucifix", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).maxCount(1).fireproof().component(DataComponentTypes.LORE,
                    new LoreComponent(List.of(Text.literal("Christ is King").formatted(Formatting.GOLD,Formatting.BOLD)))
            )));

    public static final Item Service_Music_Disc = registerItem("service_music_disc",new Item(new Item.Settings().rarity(Rarity.EPIC).jukeboxPlayable(ModSounds.Service_Key).maxCount(1)));

    public static final Item Hard_Music_Disc = registerItem("hard_music_disc",new Item(new Item.Settings().rarity(Rarity.EPIC).jukeboxPlayable(ModSounds.Hard_Key).maxCount(1)));

    public static final Item Save_Me_Music_Disc = registerItem("save_me_music_disc",new Item(new Item.Settings().rarity(Rarity.EPIC).jukeboxPlayable(ModSounds.Save_Me_Key).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(JoshsRuins.MOD_ID, name), item);
    }

    public static void registerModItems() {
        JoshsRuins.LOGGER.info("Registering Mod Items for " + JoshsRuins.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(DUST);
            entries.add(Moss_Clump);
            entries.add(Sandy_Dust);
            entries.add(Snowy_Clump);

        });
    }
}