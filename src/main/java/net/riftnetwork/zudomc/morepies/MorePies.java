package net.riftnetwork.zudomc.morepies;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
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
	
	public static Item pieAxe;
	public static Item piePickaxe;
	public static Item pieScythe;
	public static Item pieSpade;
	public static Item pieSword;
	
	public static ToolMaterial pieTools = EnumHelper.addToolMaterial("Pie", 2, 1024, 12.0f, 4.0f, 22);
	
	public static CreativeTabs tabMorePies;
	
	@EventHandler
	public void init(FMLInitializationEvent evt) {
		
	}
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent evt) {
		
		condensedPie = new BlockCondensedPie();
		
		zudoPie = new ItemZudoPie();
		
		pieAxe = new ItemPieAxe();
		piePickaxe = new ItemPiePickaxe();
		pieScythe = new ItemPieScythe();
		pieSpade = new ItemPieSpade();
		pieSword = new ItemPieSword();
		
		tabMorePies = new CreativeTabs("tabMorePies") {
			
			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return Items.pumpkin_pie;
			}
		};
		
		condensedPie.setCreativeTab(tabMorePies);
		zudoPie.setCreativeTab(tabMorePies);
		
		pieAxe.setCreativeTab(tabMorePies);
		piePickaxe.setCreativeTab(tabMorePies);
		pieScythe.setCreativeTab(tabMorePies);
		pieSpade.setCreativeTab(tabMorePies);
		pieSword.setCreativeTab(tabMorePies);
		
		GameRegistry.registerItem(zudoPie, "zudoPie");
		
		GameRegistry.registerItem(pieAxe, "pieAxe");
		GameRegistry.registerItem(piePickaxe, "piePickaxe");
		GameRegistry.registerItem(pieScythe, "pieScythe");
		GameRegistry.registerItem(pieSpade, "pieSpade");
		GameRegistry.registerItem(pieSword, "pieSword");
				
		GameRegistry.registerBlock(condensedPie, "condensedPie");
	}
	
}
