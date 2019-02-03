package com.daniel4b.dprmod.init;

import java.util.ArrayList;
import java.util.List;

import com.daniel4b.dprmod.blocks.BeeldschermBlock;
import com.daniel4b.dprmod.blocks.BlockOpslagkistChest;
import com.daniel4b.dprmod.blocks.MuisBlock;
import com.daniel4b.dprmod.blocks.PrullenbakBlock;
import com.daniel4b.dprmod.blocks.SubwooferBlock;
import com.daniel4b.dprmod.blocks.ToetsenbordBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
    //Blocks
	public static final Block SUBWOOFER_BLOCK = new SubwooferBlock("subwoofer_block", Material.IRON);
	public static final Block BEELDSCHERM_BLOCK = new BeeldschermBlock("beeldscherm_block", Material.IRON);
	public static final Block TOETSENBORD_BLOCK = new ToetsenbordBlock("toetsenbord_block", Material.IRON);
	public static final Block MUIS_BLOCK = new MuisBlock("muis_block", Material.IRON);
	public static final Block PRULLENBAK_BLOCK = new PrullenbakBlock("prullenbak_block", Material.IRON);
    //Chests	
	public static final Block OPSLAGKIST_CHEST = new BlockOpslagkistChest("opslagkist_chest");
}
