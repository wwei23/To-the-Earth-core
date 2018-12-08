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

public class SapphirBody extends ArmorBase 

{

	public SapphirBody(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
    
	public static final UUID MAX_HEALTH_SAPPHIRBODY_UUID = UUID.fromString("55d9df5c-62e7-4723-906f-fb1a71082ffa");
	public static final UUID KNOCKBACK_RESISTANCE_SAPPHIRBODY_UUID = UUID.fromString("743d9294-493d-4741-85b0-b469cbd7f5fa");  
    

    private static final Map<IAttribute, AttributeModifier> modMap = new HashMap<>();
    
    static {

		modMap.put(SharedMonsterAttributes.MAX_HEALTH, new AttributeModifier(MAX_HEALTH_SAPPHIRBODY_UUID, "MAX_HEALTH_SAPPHIRBODY_UUID", 4, 0));
		modMap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_SAPPHIRBODY_UUID, "KNOCKBACK_RESISTANCE_SAPPHIRBODY_UUID", 4, 0));
	}
   
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot,

    		ItemStack stack) {

    	Multimap<String, AttributeModifier> mods = super.getAttributeModifiers(slot, stack);
    	
    		
    	if (slot==EntityEquipmentSlot.CHEST) {

    		String maxhealthplatinumbody = SharedMonsterAttributes.MAX_HEALTH.getName();
    		String knockbackplatinumbody = SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName();

    		mods.put(maxhealthplatinumbody, new AttributeModifier (MAX_HEALTH_SAPPHIRBODY_UUID, "KNOCKBACK_RESISTANCE_SAPPHIRBODY_UUID", 4, 0));
    		mods.put(knockbackplatinumbody, new AttributeModifier (KNOCKBACK_RESISTANCE_SAPPHIRBODY_UUID, "KNOCKBACK_RESISTANCE_SAPPHIRBODY_UUID", 4, 0));
    	}
    	return mods;
    }

}
