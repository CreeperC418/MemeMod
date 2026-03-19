package com.yekai.meme.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags; 

public class ModToolMaterial {
    public static final ToolMaterial TIN = new ToolMaterial(
        BlockTags.INCORRECT_FOR_IRON_TOOL ,
		200,
		5.0F,
		2.0F,
		10,
        ModTags.TIN_INGOTS
    ); 
}
