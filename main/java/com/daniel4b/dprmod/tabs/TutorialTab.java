package com.daniel4b.dprmod.tabs;

import com.daniel4b.dprmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs
{
	public TutorialTab(String label) { super("tutorialtab");
	this.setBackgroundImageName("tutorial.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.BROOD);}
}