package com.daniel4b.dprmod.init;

import java.util.ArrayList;
import java.util.List;

import com.daniel4b.dprmod.items.ItemBase;
import com.daniel4b.dprmod.items.armor.ArmorBase;
import com.daniel4b.dprmod.items.food.FoodBase;
import com.daniel4b.dprmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
    //Items
	
	//Food
	public static final Item BROOD = new FoodBase("brood", 6, 3.6f, false);
	
	//Materials
	public static final ArmorMaterial ARMOR_MATERIAL_ADIDAS = EnumHelper.addArmorMaterial("armor_material_adidas", Reference.MOD_ID + ":adidas", 14, 
			new int[] {1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	
	//Armor
	public static final Item ADIDAS_HELMET = new ArmorBase("adidas_helmet", ARMOR_MATERIAL_ADIDAS, 1, EntityEquipmentSlot.HEAD);
	public static final Item ADIDAS_CHESTPLATE = new ArmorBase("adidas_chestplate", ARMOR_MATERIAL_ADIDAS, 1, EntityEquipmentSlot.CHEST);
	public static final Item ADIDAS_LEGGINGS = new ArmorBase("adidas_leggings", ARMOR_MATERIAL_ADIDAS, 1, EntityEquipmentSlot.LEGS);
	public static final Item ADIDAS_BOOTS = new ArmorBase("adidas_boots", ARMOR_MATERIAL_ADIDAS, 1, EntityEquipmentSlot.FEET);
}
