package binarydylan.custompcb.Blocks;

import binarydylan.custompcb.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class ModBlocks {

    @GameRegistry.ObjectHolder(Reference.MODID + ":smeltifier")
    public static Smeltifier smeltifier = new Smeltifier("smeltifier");

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new Smeltifier("smeltifier"));
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
            event.getRegistry().register(new ItemBlock(smeltifier).setRegistryName(smeltifier.getRegistryName()));
    }





}

