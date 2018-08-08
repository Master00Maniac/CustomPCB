package binarydylan.custompcb;

import binarydylan.custompcb.CreativeTabs.CustomPCBTab;
import binarydylan.custompcb.init.ModRecipes;
import binarydylan.custompcb.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class CustomPCB {

	
	@Instance
	public static CustomPCB instance;

	public static CustomPCBTab creativeTab = new CustomPCBTab();
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
    public void init(FMLPreInitializationEvent event) {
        ModRecipes.init();  // Registers all of the mods recipes defined in the ModRecipes class
    }
    
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
		
	}

}
