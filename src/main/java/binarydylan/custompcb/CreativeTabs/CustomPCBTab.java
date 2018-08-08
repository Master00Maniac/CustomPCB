package binarydylan.custompcb.CreativeTabs;

import binarydylan.custompcb.Items.ModItems;
import binarydylan.custompcb.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CustomPCBTab extends CreativeTabs {
    public CustomPCBTab() {
        super(Reference.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ENLIGHTENED_ALLOY);
    }
}
