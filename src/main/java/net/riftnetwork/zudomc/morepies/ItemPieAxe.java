package net.riftnetwork.zudomc.morepies;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;

public class ItemPieAxe extends ItemAxe {

	public ItemPieAxe() {
		super(MorePies.pieTools);
		setUnlocalizedName(MorePies.MOD_ID + "_pieAxe");
		setTextureName(MorePies.MOD_ID + ":pieAxe");
	}

}
