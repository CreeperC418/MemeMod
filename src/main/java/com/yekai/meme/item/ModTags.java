package com.yekai.meme.item;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import com.yekai.meme.MemeMod;

public class ModTags {

    public static final TagKey<Item> TIN_INGOTS = 
        createTag("tin_ingots");
    
    private static TagKey<Item> createTag(String path) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(MemeMod.MOD_ID, path));
    }
}