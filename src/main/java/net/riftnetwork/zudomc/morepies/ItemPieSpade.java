package net.riftnetwork.zudomc.morepies;

import net.minecraft.item.ItemSpade;

public class ItemPieSpade extends ItemSpade {

	public ItemPieSpade() {
		super(MorePies.pieTools);
		setUnlocalizedName(MorePies.MOD_ID + "_pieSpade");
		setTextureName(MorePies.MOD_ID + ":pieSpade");
	}

}
