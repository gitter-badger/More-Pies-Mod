package net.riftnetwork.zudomc.morepies;

import java.util.List;

import com.sun.swing.internal.plaf.metal.resources.metal;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;

public class BlockCondensedPie extends Block {

	public BlockCondensedPie() {
		super(Material.rock);

		setBlockName(MorePies.MOD_ID + "_condensedPie");
		
		setBlockTextureName(MorePies.MOD_ID + ":condensedPie");
	}
}
