package net.riftnetwork.zudomc.morepies;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = MorePies.MOD_ID, version = MorePies.MOD_VER, name = MorePies.MOD_NAME)
public class MorePies {

	public static final String MOD_ID = "morepies";
	public static final String MOD_VER = "1.0";
	public static final String MOD_NAME = "More Pies Mod";
	
	public static Block condensedPie;
	
	public static Item zudoPie;
	
	public static CreativeTabs tabMorePies;
	
	@EventHandler
	public void init(FMLInitializationEvent evt) {
		
	}
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent evt) {
		condensedPie = new CondensedPie();
		
		//zudoPie = new ZudoPie();
		
		tabMorePies = new CreativeTabs("tabMorePies") {
			
			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return Items.pumpkin_pie;
			}
		};
		
		condensedPie.setCreativeTab(tabMorePies);
		zudoPie.setCreativeTab(tabMorePies);
		
		GameRegistry.registerItem(zudoPie, "zudoPie");
		
		GameRegistry.registerBlock(condensedPie, "condensedPie");
	}
	
}
