package binarydylan.custompcb.init;

import binarydylan.custompcb.Blocks.BaseMachineBlock;
import binarydylan.custompcb.Blocks.ModBlocks;
import binarydylan.custompcb.Blocks.Smeltifier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


// Class where we initialize our blocks with forge
@Mod.EventBusSubscriber
public class InitBlocks {
    @SubscribeEvent
    // This method registers the placeable blocks
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BaseMachineBlock());
        event.getRegistry().register(new Smeltifier());
    }

    @SubscribeEvent
    // This method registers the ItemStacks for the Block objects
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.testMachine).setRegistryName(ModBlocks.testMachine.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.smeltifier).setRegistryName(ModBlocks.smeltifier.getRegistryName()));
    }
}
