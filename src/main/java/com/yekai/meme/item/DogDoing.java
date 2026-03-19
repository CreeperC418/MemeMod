package com.yekai.meme.item;

import com.yekai.meme.sound.ModSounds;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class DogDoing extends Item {
    public DogDoing(Settings settings){
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        user.playSound(ModSounds.DOG_DOING_SOUND, 1.0F, 1.0F);
        return ActionResult.SUCCESS;
    }
}