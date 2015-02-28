package net.riftnetwork.zudomc.morepies;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;

public class ZudoPie extends Pie {
	
	public ZudoPie() {
		super(true, "Tastes like genetically-modified pork."); // Wolves will eat this because PORK.
		
		setPotionEffect(8, 30, 20, 1);
	}
}
