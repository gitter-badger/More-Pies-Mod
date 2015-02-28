package net.riftnetwork.zudomc.morepies;

import net.minecraft.item.ItemPickaxe;

public class ItemPiePickaxe extends ItemPickaxe {

	public ItemPiePickaxe() {
		super(MorePies.pieTools);
		setUnlocalizedName(MorePies.MOD_ID + "_piePickaxe");
		setTextureName(MorePies.MOD_ID + ":piePickaxe");
	}

}
