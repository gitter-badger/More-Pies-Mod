package net.riftnetwork.zudomc.morepies;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemZudoPie extends ItemFood {
	
	private String unlocalisedName = "zudoPie";
	private String lore = "Tastes like pork, with a hint of redstone.";

	public ItemZudoPie() {		
		super(4, (float)1.0, true);
		
		setUnlocalizedName(MorePies.MOD_ID + "_" + unlocalisedName);
		setTextureName(MorePies.MOD_ID + ":" + unlocalisedName);
		setAlwaysEdible();
	}

	@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
		
		player.setVelocity(0, 3, 0);
	}
	

	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add(EnumChatFormatting.BLUE + lore);
	}
}
