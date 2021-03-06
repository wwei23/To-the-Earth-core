package com.SupremeMarshal.ToTheEarthCore.util.handlers;

import com.SupremeMarshal.ToTheEarthCore.init.ModBlocks;
import com.SupremeMarshal.ToTheEarthCore.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class HardnessHandler 
{
	
	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		Block block = (Block) dependencies.get("block");
		Entity entity = (Entity) dependencies.get("entity");
		int hardness = -1;
		int tier = 0;
		boolean random_thing;//Only here for debugging
		if (block == ModBlocks.STIFFROCK || block == ModBlocks.STIFFROCK_COAL || block == ModBlocks.STIFFROCK_SULFUR || block == ModBlocks.STIFFROCK_REDSTONE || block == ModBlocks.STIFFROCK_LAPIS 
		    		|| block == ModBlocks.STIFFROCK_IRON || block == ModBlocks.STIFFROCK_SILVER || block == ModBlocks.STIFFROCK_GOLD || block == ModBlocks.STIFFROCK_PLATINUM
		    		|| block == ModBlocks.STIFFROCK_EMERALD || block == ModBlocks.STIFFROCK_SAPHIR || block == ModBlocks.STIFFROCK_FLAMING_TOPAZ || block == ModBlocks.STIFFROCK_RUBY 
		    		|| block == ModBlocks.STIFFROCK_TOPAZ || block == ModBlocks.STIFFROCK_DIAMOND || block == ModBlocks.STIFFROCK_JADE || block == ModBlocks.STIFFROCK_AMAZONITE || block == ModBlocks.STIFFROCK_AMETHYST || block == ModBlocks.STIFFROCK_ONYX || block == ModBlocks.STIFFROCK_AZURITE)
		{hardness = 0;}
		else if (block == ModBlocks.HARDROCK || block == ModBlocks.HARDROCK_COAL || block == ModBlocks.HARDROCK_SULFUR || block == ModBlocks.HARDROCK_REDSTONE || block == ModBlocks.HARDROCK_LAPIS 
			 	|| block == ModBlocks.HARDROCK_IRON || block == ModBlocks.HARDROCK_SILVER || block == ModBlocks.HARDROCK_GOLD || block == ModBlocks.HARDROCK_PLATINUM 
			 	|| block == ModBlocks.HARDROCK_EMERALD || block == ModBlocks.HARDROCK_SAPHIR || block == ModBlocks.HARDROCK_FLAMING_TOPAZ || block == ModBlocks.HARDROCK_RUBY 
			 	|| block == ModBlocks.HARDROCK_TOPAZ || block == ModBlocks.HARDROCK_DIAMOND || block == ModBlocks.HARDROCK_JADE || block == ModBlocks.HARDROCK_AMAZONITE || block == ModBlocks.HARDROCK_AMETHYST || block == ModBlocks.HARDROCK_ONYX || block == ModBlocks.HARDROCK_AZURITE)
		{hardness = 1;}
		else if (block == ModBlocks.HARDERROCK || block == ModBlocks.HARDERROCK_COAL || block == ModBlocks.HARDERROCK_SULFUR || block == ModBlocks.HARDERROCK_REDSTONE || block == ModBlocks.HARDERROCK_LAPIS 
			 	|| block == ModBlocks.HARDERROCK_IRON || block == ModBlocks.HARDERROCK_SILVER || block == ModBlocks.HARDERROCK_GOLD || block == ModBlocks.HARDERROCK_PLATINUM 
			 	|| block == ModBlocks.HARDERROCK_EMERALD || block == ModBlocks.HARDERROCK_SAPHIR || block == ModBlocks.HARDERROCK_FLAMING_TOPAZ || block == ModBlocks.HARDERROCK_RUBY 
			 	|| block == ModBlocks.HARDERROCK_TOPAZ || block == ModBlocks.HARDERROCK_DIAMOND || block == ModBlocks.HARDERROCK_JADE || block == ModBlocks.HARDERROCK_AMAZONITE || block == ModBlocks.HARDERROCK_AMETHYST || block == ModBlocks.HARDERROCK_ONYX || block == ModBlocks.HARDERROCK_AZURITE)
		{hardness = 2;}
		else if (block == ModBlocks.REDROCK || block == ModBlocks.REDROCK_COAL || block == ModBlocks.REDROCK_SULFUR || block == ModBlocks.REDROCK_REDSTONE || block == ModBlocks.REDROCK_LAPIS 
			 	|| block == ModBlocks.REDROCK_IRON || block == ModBlocks.REDROCK_SILVER || block == ModBlocks.REDROCK_GOLD || block == ModBlocks.REDROCK_PLATINUM 
			 	|| block == ModBlocks.REDROCK_EMERALD || block == ModBlocks.REDROCK_SAPHIR || block == ModBlocks.REDROCK_FLAMING_TOPAZ || block == ModBlocks.REDROCK_RUBY 
			 	|| block == ModBlocks.REDROCK_TOPAZ || block == ModBlocks.REDROCK_DIAMOND || block == ModBlocks.REDROCK_JADE || block == ModBlocks.REDROCK_AMAZONITE || block == ModBlocks.REDROCK_AMETHYST || block == ModBlocks.REDROCK_ONYX || block == ModBlocks.REDROCK_AZURITE)
		{hardness = 3;}
		else if (block == ModBlocks.MANTLEROCK || block == ModBlocks.MANTLEROCK_COAL || block == ModBlocks.MANTLEROCK_SULFUR || block == ModBlocks.MANTLEROCK_REDSTONE || block == ModBlocks.MANTLEROCK_LAPIS 
			 	|| block == ModBlocks.MANTLEROCK_IRON || block == ModBlocks.MANTLEROCK_SILVER || block == ModBlocks.HOT_MANTLEROCK || block == ModBlocks.MANTLEROCK_GOLD || block == ModBlocks.MANTLEROCK_PLATINUM 
			 	|| block == ModBlocks.MANTLEROCK_EMERALD || block == ModBlocks.MANTLEROCK_SAPHIR || block == ModBlocks.MANTLEROCK_FLAMING_TOPAZ || block == ModBlocks.MANTLEROCK_RUBY 
			 	|| block == ModBlocks.MANTLEROCK_TOPAZ || block == ModBlocks.MANTLEROCK_DIAMOND || block == ModBlocks.MANTLEROCK_JADE || block == ModBlocks.MANTLEROCK_AMAZONITE || block == ModBlocks.MANTLEROCK_AMETHYST || block == ModBlocks.MANTLEROCK_ONYX || block == ModBlocks.MANTLEROCK_AZURITE)
		{hardness = 4;}
		else if (block == ModBlocks.LOWER_MANTLEROCK || block == ModBlocks.LOWER_MANTLEROCK_COAL || block == ModBlocks.LOWER_MANTLEROCK_SULFUR || block == ModBlocks.LOWER_MANTLEROCK_REDSTONE || block == ModBlocks.LOWER_MANTLEROCK_LAPIS
			 	|| block == ModBlocks.LOWER_MANTLEROCK_IRON || block == ModBlocks.LOWER_MANTLEROCK_SILVER || block == ModBlocks.LOWER_MANTLEROCK_GOLD || block == ModBlocks.LOWER_MANTLEROCK_PLATINUM 
			 	|| block == ModBlocks.LOWER_MANTLEROCK_EMERALD || block == ModBlocks.LOWER_MANTLEROCK_SAPHIR || block == ModBlocks.LOWER_MANTLEROCK_FLAMING_TOPAZ || block == ModBlocks.LOWER_MANTLEROCK_RUBY 
			 	|| block == ModBlocks.LOWER_MANTLEROCK_TOPAZ || block == ModBlocks.LOWER_MANTLEROCK_DIAMOND || block == ModBlocks.LOWER_MANTLEROCK_JADE || block == ModBlocks.LOWER_MANTLEROCK_AMAZONITE || block == ModBlocks.LOWER_MANTLEROCK_AMETHYST || block == ModBlocks.LOWER_MANTLEROCK_ONYX || block == ModBlocks.LOWER_MANTLEROCK_AZURITE)
		{hardness = 5;}
		else if (block == ModBlocks.COREROCK || block == ModBlocks.COREROCK_COAL || block == ModBlocks.COREROCK_SULFUR || block == ModBlocks.COREROCK_REDSTONE || block == ModBlocks.COREROCK_LAPIS
			 	|| block == ModBlocks.COREROCK_IRON || block == ModBlocks.COREROCK_SILVER || block == ModBlocks.COREROCK_GOLD || block == ModBlocks.COREROCK_PLATINUM 
			 	|| block == ModBlocks.COREROCK_EMERALD || block == ModBlocks.COREROCK_SAPHIR || block == ModBlocks.COREROCK_FLAMING_TOPAZ || block == ModBlocks.COREROCK_RUBY 
			 	|| block == ModBlocks.COREROCK_TOPAZ || block == ModBlocks.COREROCK_DIAMOND || block == ModBlocks.COREROCK_JADE || block == ModBlocks.COREROCK_AMAZONITE || block == ModBlocks.COREROCK_AMETHYST || block == ModBlocks.COREROCK_ONYX || block == ModBlocks.COREROCK_AZURITE)
		{hardness = 6;}
		else if (block == ModBlocks.INNERCOREROCK || block == ModBlocks.INNERCOREROCK_COAL || block == ModBlocks.INNERCOREROCK_SULFUR || block == ModBlocks.INNERCOREROCK_REDSTONE || block == ModBlocks.INNERCOREROCK_LAPIS
			 	|| block == ModBlocks.INNERCOREROCK_IRON || block == ModBlocks.INNERCOREROCK_SILVER || block == ModBlocks.INNERCOREROCK_GOLD || block == ModBlocks.INNERCOREROCK_PLATINUM 
			 	|| block == ModBlocks.INNERCOREROCK_EMERALD || block == ModBlocks.INNERCOREROCK_SAPHIR || block == ModBlocks.INNERCOREROCK_FLAMING_TOPAZ || block == ModBlocks.INNERCOREROCK_RUBY 
			 	|| block == ModBlocks.INNERCOREROCK_TOPAZ || block == ModBlocks.INNERCOREROCK_DIAMOND || block == ModBlocks.INNERCOREROCK_JADE || block == ModBlocks.INNERCOREROCK_AMAZONITE || block == ModBlocks.INNERCOREROCK_AMETHYST || block == ModBlocks.INNERCOREROCK_ONYX || block == ModBlocks.INNERCOREROCK_AZURITE)
		{hardness = 7;}
		else if (block == ModBlocks.BLUE_COREROCK || block == ModBlocks.BLUE_COREROCK_COAL || block == ModBlocks.BLUE_COREROCK_SULFUR || block == ModBlocks.BLUE_COREROCK_REDSTONE || block == ModBlocks.BLUE_COREROCK_LAPIS
			 	|| block == ModBlocks.BLUE_COREROCK_IRON || block == ModBlocks.BLUE_COREROCK_SILVER || block == ModBlocks.BLUE_COREROCK_GOLD || block == ModBlocks.BLUE_COREROCK_PLATINUM 
			 	|| block == ModBlocks.BLUE_COREROCK_EMERALD || block == ModBlocks.BLUE_COREROCK_SAPHIR || block == ModBlocks.BLUE_COREROCK_FLAMING_TOPAZ || block == ModBlocks.BLUE_COREROCK_RUBY 
			 	|| block == ModBlocks.BLUE_COREROCK_TOPAZ || block == ModBlocks.BLUE_COREROCK_DIAMOND || block == ModBlocks.BLUE_COREROCK_JADE || block == ModBlocks.BLUE_COREROCK_AMAZONITE || block == ModBlocks.BLUE_COREROCK_AMETHYST || block == ModBlocks.BLUE_COREROCK_ONYX || block == ModBlocks.BLUE_COREROCK_AZURITE)
		{hardness = 8;}
		else
		{hardness = -1;}
		
		if (block == ModBlocks.GOLD_ORE || block == ModBlocks.SULFUR_ORE || block == ModBlocks.SILVER_ORE 
		    		|| block == ModBlocks.STIFFROCK_GOLD || block == ModBlocks.STIFFROCK_LAPIS || block == ModBlocks.STIFFROCK_REDSTONE || block == ModBlocks.STIFFROCK_SILVER || block == ModBlocks.STIFFROCK_SULFUR 
		    		|| block == ModBlocks.HARDROCK_GOLD || block == ModBlocks.HARDROCK_LAPIS || block == ModBlocks.HARDROCK_REDSTONE || block == ModBlocks.HARDROCK_SILVER || block == ModBlocks.HARDROCK_SULFUR 
		    		|| block == ModBlocks.HARDERROCK_GOLD || block == ModBlocks.HARDERROCK_LAPIS || block == ModBlocks.HARDERROCK_REDSTONE || block == ModBlocks.HARDERROCK_SILVER || block == ModBlocks.HARDERROCK_SULFUR 
		    		|| block == ModBlocks.REDROCK_GOLD || block == ModBlocks.REDROCK_LAPIS || block == ModBlocks.REDROCK_REDSTONE || block == ModBlocks.REDROCK_SILVER || block == ModBlocks.REDROCK_SULFUR 
		    		|| block == ModBlocks.MANTLEROCK_GOLD || block == ModBlocks.MANTLEROCK_LAPIS || block == ModBlocks.MANTLEROCK_REDSTONE || block == ModBlocks.MANTLEROCK_SILVER || block == ModBlocks.MANTLEROCK_SULFUR 
		    		|| block == ModBlocks.LOWER_MANTLEROCK_GOLD || block == ModBlocks.LOWER_MANTLEROCK_LAPIS || block == ModBlocks.LOWER_MANTLEROCK_REDSTONE || block == ModBlocks.LOWER_MANTLEROCK_SILVER || block == ModBlocks.LOWER_MANTLEROCK_SULFUR 
		    		|| block == ModBlocks.COREROCK_GOLD || block == ModBlocks.COREROCK_LAPIS || block == ModBlocks.COREROCK_REDSTONE || block == ModBlocks.COREROCK_SILVER || block == ModBlocks.COREROCK_SULFUR 
		    		|| block == ModBlocks.INNERCOREROCK_GOLD || block == ModBlocks.INNERCOREROCK_LAPIS || block == ModBlocks.INNERCOREROCK_REDSTONE || block == ModBlocks.INNERCOREROCK_SILVER || block == ModBlocks.INNERCOREROCK_SULFUR 
				|| block == ModBlocks.BLUE_COREROCK_GOLD || block == ModBlocks.BLUE_COREROCK_LAPIS || block == ModBlocks.BLUE_COREROCK_REDSTONE || block == ModBlocks.BLUE_COREROCK_SILVER || block == ModBlocks.BLUE_COREROCK_SULFUR
		    		|| block == ModBlocks.COREROCK_IRON || block == ModBlocks.INNERCOREROCK_IRON || block == ModBlocks.BLUE_COREROCK_IRON
				|| block == ModBlocks.COREROCK_COAL || block == ModBlocks.INNERCOREROCK_COAL || block == ModBlocks.BLUE_COREROCK_COAL)
		{tier = 1;}
		else if (block == ModBlocks.PLATINUM_ORE || block == ModBlocks.STIFFROCK_PLATINUM || block == ModBlocks.HARDROCK_PLATINUM || block == ModBlocks.HARDERROCK_PLATINUM || block == ModBlocks.REDROCK_PLATINUM || block == ModBlocks.MANTLEROCK_PLATINUM || block == ModBlocks.LOWER_MANTLEROCK_PLATINUM || block == ModBlocks.COREROCK_PLATINUM || block == ModBlocks.INNERCOREROCK_PLATINUM || block == ModBlocks.BLUE_COREROCK_PLATINUM 
			 || block == ModBlocks.STIFFROCK_EMERALD || block == ModBlocks.HARDROCK_EMERALD || block == ModBlocks.HARDERROCK_EMERALD || block == ModBlocks.REDROCK_EMERALD || block == ModBlocks.MANTLEROCK_EMERALD || block == ModBlocks.LOWER_MANTLEROCK_EMERALD || block == ModBlocks.COREROCK_EMERALD || block == ModBlocks.INNERCOREROCK_EMERALD || block == ModBlocks.BLUE_COREROCK_EMERALD)
		{tier = 2;}
		else if (block == ModBlocks.SAPHIR_ORE || block == ModBlocks.STIFFROCK_SAPHIR || block == ModBlocks.HARDROCK_SAPHIR || block == ModBlocks.HARDERROCK_SAPHIR || block == ModBlocks.REDROCK_SAPHIR || block == ModBlocks.MANTLEROCK_SAPHIR || block == ModBlocks.LOWER_MANTLEROCK_SAPHIR || block == ModBlocks.COREROCK_SAPHIR || block == ModBlocks.INNERCOREROCK_SAPHIR || block == ModBlocks.BLUE_COREROCK_SAPHIR)
		{tier = 3;}
		else if (block == ModBlocks.FLAMING_TOPAZ_ORE || block == ModBlocks.STIFFROCK_FLAMING_TOPAZ || block == ModBlocks.HARDROCK_FLAMING_TOPAZ || block == ModBlocks.HARDERROCK_FLAMING_TOPAZ || block == ModBlocks.REDROCK_FLAMING_TOPAZ || block == ModBlocks.MANTLEROCK_FLAMING_TOPAZ || block == ModBlocks.LOWER_MANTLEROCK_FLAMING_TOPAZ || block == ModBlocks.COREROCK_FLAMING_TOPAZ || block == ModBlocks.INNERCOREROCK_FLAMING_TOPAZ || block == ModBlocks.BLUE_COREROCK_FLAMING_TOPAZ)
		{tier = 3;}
		else if (block == ModBlocks.RUBY_ORE || block == ModBlocks.STIFFROCK_RUBY || block == ModBlocks.HARDROCK_RUBY || block == ModBlocks.HARDERROCK_RUBY || block == ModBlocks.REDROCK_RUBY || block == ModBlocks.MANTLEROCK_RUBY || block == ModBlocks.LOWER_MANTLEROCK_RUBY || block == ModBlocks.COREROCK_RUBY || block == ModBlocks.INNERCOREROCK_RUBY || block == ModBlocks.BLUE_COREROCK_RUBY)
		{tier = 4;}
		else if (block == ModBlocks.TOPAZ_ORE || block == ModBlocks.STIFFROCK_TOPAZ || block == ModBlocks.HARDROCK_TOPAZ || block == ModBlocks.HARDERROCK_TOPAZ || block == ModBlocks.REDROCK_TOPAZ || block == ModBlocks.MANTLEROCK_TOPAZ || block == ModBlocks.LOWER_MANTLEROCK_TOPAZ || block == ModBlocks.COREROCK_TOPAZ || block == ModBlocks.INNERCOREROCK_TOPAZ || block == ModBlocks.BLUE_COREROCK_TOPAZ)
		{tier = 4;}
		else if (block == ModBlocks.DIAMOND_ORE || block == ModBlocks.STIFFROCK_DIAMOND || block == ModBlocks.HARDROCK_DIAMOND || block == ModBlocks.HARDERROCK_DIAMOND || block == ModBlocks.REDROCK_DIAMOND || block == ModBlocks.MANTLEROCK_DIAMOND || block == ModBlocks.LOWER_MANTLEROCK_DIAMOND || block == ModBlocks.COREROCK_DIAMOND || block == ModBlocks.INNERCOREROCK_DIAMOND || block == ModBlocks.BLUE_COREROCK_DIAMOND)
		{tier = 5;}
		else if (block == ModBlocks.JADE_ORE || block == ModBlocks.STIFFROCK_JADE || block == ModBlocks.HARDROCK_JADE || block == ModBlocks.HARDERROCK_JADE || block == ModBlocks.REDROCK_JADE || block == ModBlocks.MANTLEROCK_JADE || block == ModBlocks.LOWER_MANTLEROCK_JADE || block == ModBlocks.COREROCK_JADE || block == ModBlocks.INNERCOREROCK_JADE || block == ModBlocks.BLUE_COREROCK_JADE)
		{tier = 5;}
		else if (block == ModBlocks.AMAZONITE_ORE || block == ModBlocks.STIFFROCK_AMAZONITE || block == ModBlocks.HARDROCK_AMAZONITE || block == ModBlocks.HARDERROCK_AMAZONITE || block == ModBlocks.REDROCK_AMAZONITE || block == ModBlocks.MANTLEROCK_AMAZONITE || block == ModBlocks.LOWER_MANTLEROCK_AMAZONITE || block == ModBlocks.COREROCK_AMAZONITE || block == ModBlocks.INNERCOREROCK_AMAZONITE || block == ModBlocks.BLUE_COREROCK_AMAZONITE)
		{tier = 6;}
		else if (block == ModBlocks.AMETHYST_ORE || block == ModBlocks.STIFFROCK_AMETHYST || block == ModBlocks.HARDROCK_AMETHYST || block == ModBlocks.HARDERROCK_AMETHYST || block == ModBlocks.REDROCK_AMETHYST || block == ModBlocks.MANTLEROCK_AMETHYST || block == ModBlocks.LOWER_MANTLEROCK_AMETHYST || block == ModBlocks.COREROCK_AMETHYST || block == ModBlocks.INNERCOREROCK_AMETHYST || block == ModBlocks.BLUE_COREROCK_AMETHYST)
		{tier = 6;}
		else if (block == ModBlocks.ONYX_ORE || block == ModBlocks.STIFFROCK_ONYX || block == ModBlocks.HARDROCK_ONYX || block == ModBlocks.HARDERROCK_ONYX || block == ModBlocks.REDROCK_ONYX || block == ModBlocks.MANTLEROCK_ONYX || block == ModBlocks.LOWER_MANTLEROCK_ONYX || block == ModBlocks.COREROCK_ONYX || block == ModBlocks.INNERCOREROCK_ONYX || block == ModBlocks.BLUE_COREROCK_ONYX)
		{tier = 7;}
		else if (block == ModBlocks.AZURITE_ORE || block == ModBlocks.STIFFROCK_AZURITE || block == ModBlocks.HARDROCK_AZURITE || block == ModBlocks.HARDERROCK_AZURITE || block == ModBlocks.REDROCK_AZURITE || block == ModBlocks.MANTLEROCK_AZURITE || block == ModBlocks.LOWER_MANTLEROCK_AZURITE || block == ModBlocks.COREROCK_AZURITE || block == ModBlocks.INNERCOREROCK_AZURITE || block == ModBlocks.BLUE_COREROCK_AZURITE)
		{tier = 8;}
		else if (block == ModBlocks.IRON_ORE || block == ModBlocks.STIFFROCK_IRON || block == ModBlocks.HARDROCK_IRON || block == ModBlocks.HARDERROCK_IRON || block == ModBlocks.REDROCK_IRON || block == ModBlocks.MANTLEROCK_IRON || block == ModBlocks.LOWER_MANTLEROCK_IRON 
			 || block == ModBlocks.STIFFROCK_COAL || block == ModBlocks.HARDROCK_COAL || block == ModBlocks.HARDERROCK_COAL || block == ModBlocks.REDROCK_COAL || block == ModBlocks.MANTLEROCK_COAL || block == ModBlocks.LOWER_MANTLEROCK_IRON)
		{tier = 0;}
	
		if (((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.IRON_PICKAXE, (int) (1)).getItem())
			|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.STEEL_PICKAXE, (int) (1)).getItem())
			/*|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.SILVER_PICKAXE, (int) (1)).getItem())*/)
			&& ((int)hardness == 0 || (int)hardness == 1 || (int)hardness == 2 || (int)hardness == 3 || (int)hardness == 4 || (int)hardness == 5 || (int)hardness == 6 || (int)hardness == 7 || (int)hardness == 8))
		{
			block.setHardness((float) -1.0F);
		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(Items.WOODEN_PICKAXE, (int) (1)).getItem()) && (int)hardness == -1)
		{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 9.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK ) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(Items.STONE_PICKAXE, (int) (1)).getItem()) && (int)hardness == -1)
		{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 8.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(16.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.IRON_PICKAXE, (int) (1)).getItem()) && (int)hardness == -1)
		{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 8.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 20.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(12.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(16.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}


		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.STEEL_PICKAXE, (int) (1)).getItem()) && (int)hardness == -1)
		{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 8.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 17.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 30.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(11.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.SILVER_PICKAXE, (int) (1)).getItem()))
		{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 6.8F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 13.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 13.0F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 25.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(25.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.GOLD_PICKAXE, (int) (1)).getItem()))
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 6.5F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 12.5F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 8.3F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 14.0F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 13.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 25.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(9.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(14.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(19.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(24.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(29.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.PLATINUM_PICKAXE, (int) (1)).getItem())) 
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 17.5F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 12.5F);}
			else if ((int)hardness == 0 && (int)tier == 3) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 8.3F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 14.0F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 2 && (int)tier == 1) { block.setHardness((float) 20F);}
			else if ((int)hardness == 2 && (int)tier == 2) { block.setHardness((float) 25F);}
			else if ((int)hardness == 2 && (int)tier == 3) { block.setHardness((float) 30F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(8.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(13.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(18.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(23.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(28.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(35.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(35.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.EMERALD_PICKAXE, (int) (1)).getItem())
					|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.SAPHIR_PICKAXE, (int) (1)).getItem()))
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 0 && (int)tier == 3) { block.setHardness((float) 12.0F);}
			else if ((int)hardness == 0 && (int)tier == 4) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 12.5F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 1 && (int)tier == 4) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 6.0F);}
			else if ((int)hardness == 2 && (int)tier == 1) { block.setHardness((float) 10F);}
			else if ((int)hardness == 2 && (int)tier == 2) { block.setHardness((float) 15F);}
			else if ((int)hardness == 2 && (int)tier == 3) { block.setHardness((float) 25F);}
			else if ((int)hardness == 2 && (int)tier == 4) { block.setHardness((float) 35F);}
			else if ((int)hardness == 3 && (int)tier == 0) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 3 && (int)tier == 1) { block.setHardness((float) 20F);}
			else if ((int)hardness == 3 && (int)tier == 2) { block.setHardness((float) 25F);}
			else if ((int)hardness == 3 && (int)tier == 3) { block.setHardness((float) 30F);}
			else if ((int)hardness == 3 && (int)tier == 4) { block.setHardness((float) 40F);}
			else { block.setHardness((float) -1.0F); }
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(7.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(12.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(17.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(22.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(27.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(34.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(34.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(50.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(50.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.RUBY_PICKAXE, (int) (1)).getItem())
					|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.FLAMING_TOPAZ_PICKAXE, (int) (1)).getItem())) 
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == -1 && (int)tier == 5) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 4.5F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 5F);}
			else if ((int)hardness == 0 && (int)tier == 3) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 0 && (int)tier == 4) { block.setHardness((float) 12.0F);}
			else if ((int)hardness == 0 && (int)tier == 5) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 12.0F);}
			else if ((int)hardness == 1 && (int)tier == 4) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 1 && (int)tier == 5) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 4.5F);}
			else if ((int)hardness == 2 && (int)tier == 1) { block.setHardness((float) 5F);}
			else if ((int)hardness == 2 && (int)tier == 2) { block.setHardness((float) 10F);}
			else if ((int)hardness == 2 && (int)tier == 3) { block.setHardness((float) 15F);}
			else if ((int)hardness == 2 && (int)tier == 4) { block.setHardness((float) 20F);}
			else if ((int)hardness == 2 && (int)tier == 5) { block.setHardness((float) 30F);}
			else if ((int)hardness == 3 && (int)tier == 0) { block.setHardness((float) 6.0F);}
			else if ((int)hardness == 3 && (int)tier == 1) { block.setHardness((float) 10F);}
			else if ((int)hardness == 3 && (int)tier == 2) { block.setHardness((float) 15F);}
			else if ((int)hardness == 3 && (int)tier == 3) { block.setHardness((float) 25F);}
			else if ((int)hardness == 3 && (int)tier == 4) { block.setHardness((float) 35F);}
			else if ((int)hardness == 3 && (int)tier == 5) { block.setHardness((float) 50F);}
			else if ((int)hardness == 4 && (int)tier == 0) { block.setHardness((float) 20F);}
			else if ((int)hardness == 4 && (int)tier == 1) { block.setHardness((float) 25F);}
			else if ((int)hardness == 4 && (int)tier == 2) { block.setHardness((float) 30F);}
			else if ((int)hardness == 4 && (int)tier == 3) { block.setHardness((float) 35F);}
			else if ((int)hardness == 4 && (int)tier == 4) { block.setHardness((float) 50F);}
			else if ((int)hardness == 4 && (int)tier == 5) { block.setHardness((float) 60F);}
			else { block.setHardness((float) -1.0F); }
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(6.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(25.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(33.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(33.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(44.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(44.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(60.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(60.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.DIAMOND_PICKAXE, (int) (1)).getItem()) 
					|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.TOPAZ_PICKAXE, (int) (1)).getItem())) 
			{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == -1 && (int)tier == 5) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == -1 && (int)tier == 6) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 3) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 0 && (int)tier == 4) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 0 && (int)tier == 5) { block.setHardness((float) 12.0F);}
			else if ((int)hardness == 0 && (int)tier == 6) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 4.5F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 5F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 1 && (int)tier == 4) { block.setHardness((float) 12.0F);}
			else if ((int)hardness == 1 && (int)tier == 5) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 1 && (int)tier == 6) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 2) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 2 && (int)tier == 3) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 2 && (int)tier == 4) { block.setHardness((float) 10F);}
			else if ((int)hardness == 2 && (int)tier == 5) { block.setHardness((float) 15F);}
			else if ((int)hardness == 2 && (int)tier == 6) { block.setHardness((float) 30F);}
			else if ((int)hardness == 3 && (int)tier == 0) { block.setHardness((float) 4.5F);}
			else if ((int)hardness == 3 && (int)tier == 1) { block.setHardness((float) 5F);}
			else if ((int)hardness == 3 && (int)tier == 2) { block.setHardness((float) 10F);}
			else if ((int)hardness == 3 && (int)tier == 3) { block.setHardness((float) 15F);}
			else if ((int)hardness == 3 && (int)tier == 4) { block.setHardness((float) 20F);}
			else if ((int)hardness == 3 && (int)tier == 5) { block.setHardness((float) 30F);}
			else if ((int)hardness == 3 && (int)tier == 6) { block.setHardness((float) 60F);}
			else if ((int)hardness == 4 && (int)tier == 0) { block.setHardness((float) 7.0F);}
			else if ((int)hardness == 4 && (int)tier == 1) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == 4 && (int)tier == 2) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 4 && (int)tier == 3) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 4 && (int)tier == 4) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 4 && (int)tier == 5) { block.setHardness((float) 40.0F);}
			else if ((int)hardness == 4 && (int)tier == 6) { block.setHardness((float) 50.0F);}
			else if ((int)hardness == 5 && (int)tier == 0) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 5 && (int)tier == 1) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 5 && (int)tier == 2) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 5 && (int)tier == 3) { block.setHardness((float) 35.0F);}
			else if ((int)hardness == 5 && (int)tier == 4) { block.setHardness((float) 40.0F);}
			else if ((int)hardness == 5 && (int)tier == 5) { block.setHardness((float) 50.0F);}
			else if ((int)hardness == 5 && (int)tier == 6) { block.setHardness((float) 60.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(5.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(8.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(11.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(16.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(22.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(40.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(40.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(55.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(55.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(100.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(100.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(-1.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}

		}
		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.AMAZONITE_PICKAXE, (int) (1)).getItem())
			 		|| (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.JADE_PICKAXE, (int) (1)).getItem())) {
			if ((int) hardness == -1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 6.0F);}
			else if ((int)hardness == -1 && (int)tier == 5) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == -1 && (int)tier == 6) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == -1 && (int)tier == 7) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 1 && (int)tier == 4) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 1 && (int)tier == 5) { block.setHardness((float) 12.0F);}
			else if ((int)hardness == 1 && (int)tier == 6) { block.setHardness((float) 18.0F);}
			else if ((int)hardness == 1 && (int)tier == 7) { block.setHardness((float) 24.0F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 2) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 3 && (int)tier == 3) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 3 && (int)tier == 4) { block.setHardness((float) 10F);}
			else if ((int)hardness == 3 && (int)tier == 5) { block.setHardness((float) 15F);}
			else if ((int)hardness == 3 && (int)tier == 6) { block.setHardness((float) 30F);}
			else if ((int)hardness == 3 && (int)tier == 7) { block.setHardness((float) 45F);}
			else if ((int)hardness == 4 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 1) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 4 && (int)tier == 2) { block.setHardness((float) 7.5F);}
			else if ((int)hardness == 4 && (int)tier == 3) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == 4 && (int)tier == 4) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 4 && (int)tier == 5) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 4 && (int)tier == 6) { block.setHardness((float) 40.0F);}
			else if ((int)hardness == 4 && (int)tier == 7) { block.setHardness((float) 50.0F);}
			else if ((int)hardness == 5 && (int)tier == 0) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == 5 && (int)tier == 1) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 5 && (int)tier == 2) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 5 && (int)tier == 3) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 5 && (int)tier == 4) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 5 && (int)tier == 5) { block.setHardness((float) 35.0F);}
			else if ((int)hardness == 5 && (int)tier == 6) { block.setHardness((float) 40.0F);}
			else if ((int)hardness == 5 && (int)tier == 7) { block.setHardness((float) 50.0F);}
			else if ((int)hardness == 6 && (int)tier == 0) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 6 && (int)tier == 1) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 6 && (int)tier == 2) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 6 && (int)tier == 3) { block.setHardness((float) 35.0F);}
			else if ((int)hardness == 6 && (int)tier == 4) { block.setHardness((float) 40.0F);}
			else if ((int)hardness == 6 && (int)tier == 5) { block.setHardness((float) 50.0F);}
			else if ((int)hardness == 6 && (int)tier == 6) { block.setHardness((float) 60.0F);}
			else if ((int)hardness == 6 && (int)tier == 7) { block.setHardness((float) 90.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(4.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(5.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(40.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(40.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(50.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(50.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(80.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(80.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(100.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(-1.0f);}
		}

		else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.ONYX_PICKAXE, (int) (1)).getItem()) || (new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.AMETHYST_PICKAXE, (int) (1)).getItem()))
		{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 6 && (int)tier == 0) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == 6 && (int)tier == 1) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 6 && (int)tier == 2) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 6 && (int)tier == 3) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 6 && (int)tier == 4) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 6 && (int)tier == 5) { block.setHardness((float) 35.0F);}
			else if ((int)hardness == 6 && (int)tier == 6) { block.setHardness((float) 40.0F);}
			else if ((int)hardness == 6 && (int)tier == 7) { block.setHardness((float) 50.0F);}
			else if ((int)hardness == 6 && (int)tier == 7) { block.setHardness((float) 60.0F);}
			else if ((int)hardness == 7 && (int)tier == 0) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 7 && (int)tier == 1) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 7 && (int)tier == 2) { block.setHardness((float) 40.0F);}
			else if ((int)hardness == 7 && (int)tier == 3) { block.setHardness((float) 50.0F);}
			else if ((int)hardness == 7 && (int)tier == 4) { block.setHardness((float) 60.0F);}
			else if ((int)hardness == 7 && (int)tier == 5) { block.setHardness((float) 70.0F);}
			else if ((int)hardness == 7 && (int)tier == 6) { block.setHardness((float) 80.0F);}
			else if ((int)hardness == 7 && (int)tier == 7) { block.setHardness((float) 100.0F);}
			else if ((int)hardness == 7 && (int)tier == 8) { block.setHardness((float) 120.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(4.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(4.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(5.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(6.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(7.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(50.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(100.0f);}
		}
else if ((new ItemStack(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand().getItem() : null), (int) (1)).getItem() == new ItemStack(ModItems.AZURITE_PICKAXE, (int) (1)).getItem()))
		{
			if ((int)hardness == -1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == -1 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 0 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 1 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 2 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 3 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 4 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 5 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 6 && (int)tier == 0) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 6 && (int)tier == 1) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 6 && (int)tier == 2) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 6 && (int)tier == 3) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 6 && (int)tier == 4) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 6 && (int)tier == 5) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 6 && (int)tier == 6) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 6 && (int)tier == 7) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 6 && (int)tier == 8) { block.setHardness((float) 4.0F);}
			else if ((int)hardness == 7 && (int)tier == 0) { block.setHardness((float) 5.0F);}
			else if ((int)hardness == 7 && (int)tier == 1) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == 7 && (int)tier == 2) { block.setHardness((float) 15.0F);}
			else if ((int)hardness == 7 && (int)tier == 3) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 7 && (int)tier == 4) { block.setHardness((float) 25.0F);}
			else if ((int)hardness == 7 && (int)tier == 5) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 7 && (int)tier == 6) { block.setHardness((float) 35.0F);}
			else if ((int)hardness == 7 && (int)tier == 7) { block.setHardness((float) 40.0F);}
			else if ((int)hardness == 7 && (int)tier == 8) { block.setHardness((float) 45.0F);}
			else if ((int)hardness == 8 && (int)tier == 0) { block.setHardness((float) 10.0F);}
			else if ((int)hardness == 8 && (int)tier == 1) { block.setHardness((float) 20.0F);}
			else if ((int)hardness == 8 && (int)tier == 2) { block.setHardness((float) 30.0F);}
			else if ((int)hardness == 8 && (int)tier == 3) { block.setHardness((float) 40.0F);}
			else if ((int)hardness == 8 && (int)tier == 4) { block.setHardness((float) 50.0F);}
			else if ((int)hardness == 8 && (int)tier == 5) { block.setHardness((float) 60.0F);}
			else if ((int)hardness == 8 && (int)tier == 6) { block.setHardness((float) 70.0F);}
			else if ((int)hardness == 8 && (int)tier == 7) { block.setHardness((float) 80.0F);}
			else if ((int)hardness == 8 && (int)tier == 8) { block.setHardness((float) 90.0F);}
			else { block.setHardness((float) -1.0F);}
			if (block == ModBlocks.IRON_BLOCK) { block.setHardness(4.0f);}
			else if (block == ModBlocks.STEEL_BLOCK) { block.setHardness(4.0f);}
			else if (block == ModBlocks.SILVER_BLOCK) { block.setHardness(5.0f);}
			else if (block == ModBlocks.GOLD_BLOCK) { block.setHardness(6.0f);}
			else if (block == ModBlocks.PLATINUM_BLOCK) { block.setHardness(7.0f);}
			else if (block == ModBlocks.SAPHIR_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.FLAMING_TOPAZ_BLOCK) { block.setHardness(10.0f);}
			else if (block == ModBlocks.RUBY_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.TOPAZ_BLOCK) { block.setHardness(15.0f);}
			else if (block == ModBlocks.DIAMOND_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.JADE_BLOCK) { block.setHardness(20.0f);}
			else if (block == ModBlocks.AMAZONITE_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.AMETHYST_BLOCK) { block.setHardness(30.0f);}
			else if (block == ModBlocks.ONYX_BLOCK) { block.setHardness(50.0f);}
			else if (block == ModBlocks.AZURITE_BLOCK) { block.setHardness(100.0f);}
		}
		else block.setHardness((float) -1.0F);
		}
}
