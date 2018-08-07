package binarydylan.custompcb;

import binarydylan.custompcb.init.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class CustomPCB {

    public void init(FMLPreInitializationEvent event) {
        ModRecipes.init();  // Registers all of the mods recipes defined in the ModRecipes class
    }

}
