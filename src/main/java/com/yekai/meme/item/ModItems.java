package com.yekai.meme.item;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import java.util.function.Function;

import com.yekai.meme.MemeMod; 


public final class ModItems {
    private ModItems(){                                                                                                                                                                                                                                                  
    }

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
		// Create the item key.
		RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MemeMod.MOD_ID, name));

		// Create the item instance.
		Item item = itemFactory.apply(settings.registryKey(itemKey));

		// Register the item.
		Registry.register(Registries.ITEM, itemKey, item);

		return item;
	}

    //锡锭
    public static final Item TIN_INGOT = register("tin_ingot", Item::new, new Item.Settings());

    //锡剑
    public static final Item TIN_SWORD = register("tin_sword",
       Item::new, new Item.Settings().sword(ModToolMaterial.TIN, 32768f, -2.4f)
    );

    //刀盾
    public static final Item DOG_DOING = register("dog_doing", DogDoing::new, new Item.Settings());
    
    

    public static void initialize() {
    }
}
