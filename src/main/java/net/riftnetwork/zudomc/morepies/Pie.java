package net.riftnetwork.zudomc.morepies;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;

public abstract class Pie extends ItemFood {
	
	private String lore;

	public Pie(boolean wolvesFavourite, String lore) {
		super(4, (float)1.0, wolvesFavourite);
		
		this.lore = lore;
	}
	

	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add(EnumChatFormatting.BLUE + lore);
	}

}
