package binarydylan.custompcb.Blocks;

import binarydylan.custompcb.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Smeltifier extends Block {
    public Smeltifier() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.MODID + ".smeltifier");
        setRegistryName("smeltifier");
        setCreativeTab(CreativeTabs.REDSTONE);

    }
}
