package com.daniel4b.dprmod.items.food;

import com.daniel4b.dprmod.Main;
import com.daniel4b.dprmod.init.ModItems;
import com.daniel4b.dprmod.util.IHasModel;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel 
{

	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) 
	{
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tutorialtab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
