package net.prismaxtic.thebackrooms.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.prismaxtic.thebackrooms.TheBackrooms;

public class ModSounds {

    public static final SoundEvent UNDERTALES = registerSoundEvent("undertales");

    public static final SoundEvent BURNINGMEMORY = registerSoundEvent("burningmemory");


    public static SoundEvent registerSoundEvent(String name) {
        Identifier id =  new Identifier(TheBackrooms.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        TheBackrooms.LOGGER.info("Registering Sounds For " + TheBackrooms.MOD_ID);
    }

}
