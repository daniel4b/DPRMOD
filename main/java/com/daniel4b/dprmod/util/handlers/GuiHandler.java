package com.daniel4b.dprmod.util.handlers;

import com.daniel4b.dprmod.gui.GuiOpslagkistChest;
import com.daniel4b.dprmod.gui.containers.ContainerOpslagkistChest;
import com.daniel4b.dprmod.tileentity.TileEntityOpslagkistChest;
import com.daniel4b.dprmod.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_OPSLAGKIST_CHEST) return new ContainerOpslagkistChest(player.inventory, (TileEntityOpslagkistChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_OPSLAGKIST_CHEST) return new GuiOpslagkistChest(player.inventory, (TileEntityOpslagkistChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}
}
