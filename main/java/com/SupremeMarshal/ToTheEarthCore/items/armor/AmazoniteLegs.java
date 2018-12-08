package com.SupremeMarshal.ToTheEarthCore.items.armor;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class AmazoniteLegs extends ArmorBase 

{

	public AmazoniteLegs(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	
	public static final UUID MAX_HEALTH_AMAZONITELEGS_UUID = UUID.fromString("10544e2f-e783-425d-bd96-da6b05eb2341");
	public static final UUID KNOCKBACK_RESISTANCE_AMAZONITELEGS_UUID = UUID.fromString("a04e1e8e-fbdd-4b16-a912-1a183f09e84f");  
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_AMAZONITELEGS_UUID, "MAX_HEALTH_AMAZONITELEGS_UUID", 10, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_AMAZONITELEGS_UUID, "KNOCKBACK_RESISTANCE_AMAZONITELEGS_UUID", 10, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.LEGS) {

    		String maxhealth = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockback = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealth, new AttributeModifier (MAX_HEALTH_AMAZONITELEGS_UUID, "KNOCKBACK_RESISTANCE_AMAZONITELEGS_UUID", 10, 0));
    		mods.put(knockback, new AttributeModifier (KNOCKBACK_RESISTANCE_AMAZONITELEGS_UUID, "KNOCKBACK_RESISTANCE_AMAZONITELEGS_UUID", 10, 0));
    	}
    	return mods;
    }

}
