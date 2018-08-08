package binarydylan.custompcb.Blocks;

import binarydylan.custompcb.CreativeTabs.CustomPCBTab;
import binarydylan.custompcb.CustomPCB;
import binarydylan.custompcb.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Smeltifier extends BaseMachineBlock {

    public Smeltifier(String name) {
        super(Material.ROCK, name);
        setHardness(5f);
        setResistance(7f);
    }
}
