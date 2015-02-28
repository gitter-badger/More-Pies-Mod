package net.riftnetwork.zudomc.morepies;

import net.minecraft.item.ItemSword;

public class ItemPieSword extends ItemSword {

	public ItemPieSword() {
		super(MorePies.pieTools);
		setUnlocalizedName(MorePies.MOD_ID + "_pieSword");
		setTextureName(MorePies.MOD_ID + ":pieSword");
	}

}
