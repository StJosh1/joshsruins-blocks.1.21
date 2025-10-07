package net.josh.joshsruins.sound;

import net.josh.joshsruins.JoshsRuins;
import net.josh.joshsruins.JoshsRuins;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class ModSounds {

public static final SoundEvent Service = registerSoundsEvent("service");
    public static final SoundEvent Hard = registerSoundsEvent("hard");
    public static final SoundEvent Save_Me = registerSoundsEvent("save_me");

public static final RegistryKey<JukeboxSong> Service_Key =
        RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(JoshsRuins.MOD_ID,"service"));

    public static final RegistryKey<JukeboxSong> Hard_Key =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(JoshsRuins.MOD_ID,"hard"));

    public static final RegistryKey<JukeboxSong> Save_Me_Key =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(JoshsRuins.MOD_ID,"save_me"));

public static SoundEvent registerSoundsEvent (String name) {
    Identifier id = Identifier.of(JoshsRuins.MOD_ID, name);
    return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
}

    public static void registerSounds() {
        JoshsRuins.LOGGER.info("Registering Mod Sounds for " + JoshsRuins.MOD_ID);
    }
}