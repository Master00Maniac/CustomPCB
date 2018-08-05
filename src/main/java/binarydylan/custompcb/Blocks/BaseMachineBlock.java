package binarydylan.custompcb.Blocks;

import binarydylan.custompcb.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BaseMachineBlock extends Block{
    public BaseMachineBlock() {

        // Sets block Material (can change to whatever you feel like)
        super(Material.ROCK);

        // Used for localization in the lang file
        setUnlocalizedName(Reference.MODID + ".machineBlock");

        // What the block is registered as in the mod
        setRegistryName("machineblock");

        // This one is self explanatory :P
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
