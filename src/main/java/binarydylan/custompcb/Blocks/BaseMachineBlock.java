package binarydylan.custompcb.Blocks;

import binarydylan.custompcb.CustomPCB;
import binarydylan.custompcb.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseMachineBlock extends Block{

    protected String name;
    public BaseMachineBlock(Material material, String name) {
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CustomPCB.creativeTab);
    }}