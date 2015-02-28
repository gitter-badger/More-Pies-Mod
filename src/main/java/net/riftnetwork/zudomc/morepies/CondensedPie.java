package net.riftnetwork.zudomc.morepies;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class CondensedPie extends Block {

	public CondensedPie() {
		super(Material.rock);
		
		setBlockName(MorePies.MOD_ID + "_condensedPie");
		setBlockTextureName(MorePies.MOD_ID + ":" + "condensedPie");
		
	}
	
}
