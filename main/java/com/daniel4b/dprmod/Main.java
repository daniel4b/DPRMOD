package com.daniel4b.dprmod;

import com.daniel4b.dprmod.proxy.CommonProxy;
import com.daniel4b.dprmod.tabs.TutorialTab;
import com.daniel4b.dprmod.util.Reference;
import com.daniel4b.dprmod.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	public static final CreativeTabs tutorialtab = new TutorialTab("tutorialtab");
	
	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {RegistryHandler.preInitRegistries();}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {RegistryHandler.initRegistries();}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event) {}	
	
}
