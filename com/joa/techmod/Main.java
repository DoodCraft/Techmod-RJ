package com.joa.techmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

	@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME)
	public class Main {
	    public static final String MODID = "techmod";
	    public static final String NAME= "Technology Mod";
	    public static final String MODNAME = "Technology Mod";
	    public static final String VERSION = "0.0.1";
   
	    @Instance
	    public static Main instance = new Main();
	    
	    @SidedProxy(clientSide="com.joa.techmod.ClientProxy", serverSide="com.joa.techmod.ServerProxy")
	public static CommonProxy proxy;
	    
	    @EventHandler 
	    public void preInit(FMLPreInitializationEvent e) {
	    	this.proxy.preInit(e);
	    }
	    
	    @EventHandler
	    public void init(FMLInitializationEvent e){
	    	this.proxy.init(e);
		}
	    
	    @EventHandler
	    public void postInit(FMLPostInitializationEvent e) {
	    	this.proxy.postInit(e);
	    }
	    
	}