package com.joa.techmod;

import com.joa.techmod.blocks.ModBlocks;
import com.joa.techmod.crafting.ModCrafting;
import com.joa.techmod.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.createItems();
        ModBlocks.createBlocks();
    }
    
    public void init(FMLInitializationEvent e) {
    	ModCrafting.initCrafting();
    }
    
    public void postInit(FMLPostInitializationEvent e) {
    }
}
