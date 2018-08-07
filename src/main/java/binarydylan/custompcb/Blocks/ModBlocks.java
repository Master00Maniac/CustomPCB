package binarydylan.custompcb.Blocks;

import binarydylan.custompcb.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

// Object constructor for all of our mod blocks
public class ModBlocks {
    @GameRegistry.ObjectHolder(Reference.MODID + ":" + "machineBlock")
    // Creates a random test machine for testing and more testing, this is where we define our blocks/machines
    public static BaseMachineBlock testMachine;

    @GameRegistry.ObjectHolder(Reference.MODID + ":" + "smeltifier")
    public static Smeltifier smeltifier;
}

