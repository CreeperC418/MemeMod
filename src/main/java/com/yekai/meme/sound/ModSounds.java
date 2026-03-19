package com.yekai.meme.sound;

import com.yekai.meme.MemeMod;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent DOG_DOING_SOUND = SoundEvent.of(
        Identifier.of(MemeMod.MOD_ID, "dog_doing_sound")
    );
    
    public static void registerSounds() {
        //dog_doing_sound
        Registry.register(Registries.SOUND_EVENT, 
            Identifier.of(MemeMod.MOD_ID, "dog_doing_sound"), 
            DOG_DOING_SOUND);
            
    }
}
