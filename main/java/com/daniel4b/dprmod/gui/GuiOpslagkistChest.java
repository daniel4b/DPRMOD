package com.daniel4b.dprmod.gui;

import com.daniel4b.dprmod.gui.containers.ContainerOpslagkistChest;
import com.daniel4b.dprmod.tileentity.TileEntityOpslagkistChest;
import com.daniel4b.dprmod.util.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiOpslagkistChest extends GuiContainer
{
    private static final ResourceLocation GUI_CHEST = new ResourceLocation(Reference.MOD_ID + ":textures/gui/opslagkist_chest.png");
    private final InventoryPlayer playerInventory;
    private final TileEntityOpslagkistChest te;
    
    public GuiOpslagkistChest(InventoryPlayer playerInventory, TileEntityOpslagkistChest chestInventory, EntityPlayer player)
    {
    	super(new ContainerOpslagkistChest(playerInventory, chestInventory, player));
    	this.playerInventory = playerInventory;
    	this.te = chestInventory;
    	
    	this.xSize = 350;
    	this.ySize = 443;
    }

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
		this.fontRenderer.drawString(this.te.getDisplayName().getUnformattedText(), 8, 6, 4210752);
		this.fontRenderer.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, this.ySize - 92, 0);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTick, int mouseX, int mouseY) 
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(GUI_CHEST);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
}
