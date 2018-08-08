package binarydylan.custompcb.Items;

import binarydylan.custompcb.CustomPCB;
import binarydylan.custompcb.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS); //TEMPORARY TAB
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		CustomPCB.proxy.registerItemRenderer(this, 0, "Inventory");
		
		
	}

}
