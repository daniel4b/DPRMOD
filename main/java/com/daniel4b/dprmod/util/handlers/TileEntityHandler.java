package com.daniel4b.dprmod.util.handlers;

import com.daniel4b.dprmod.tileentity.TileEntityOpslagkistChest;
import com.daniel4b.dprmod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
    public static void registerTileEntities()
    {
    	GameRegistry.registerTileEntity(TileEntityOpslagkistChest.class, new ResourceLocation(Reference.MOD_ID + ":opslagkist_chest"));
    }
}
