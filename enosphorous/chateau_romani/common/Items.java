package enosphorous.chateau_romani.common;

import net.minecraft.item.Item;
import enosphorous.chateau_romani.items.ItemBottledFire;
import enosphorous.chateau_romani.items.ItemBottledGhast;
import enosphorous.chateau_romani.items.ItemChateauRomani;
import enosphorous.chateau_romani.items.ItemFermentedGrains;
import enosphorous.chateau_romani.items.ItemLonLonMilk;
import enosphorous.chateau_romani.items.ItemMilkBottle;

public class Items {
	
	public static Item chateau_romani;
	public static Item milk_bottle;
	public static Item fermented_grain;
	public static Item lonlon_milk_full;
	public static Item lonlon_milk_half;
	public static Item bottled_fire;
	public static Item bottled_ghast;
	
	public static void initialize() {
		
		chateau_romani = new ItemChateauRomani(ChateauConfigLoader.chateau_romaniID);
		milk_bottle = new ItemMilkBottle(ChateauConfigLoader.milk_bottleID);
		fermented_grain = new ItemFermentedGrains(ChateauConfigLoader.fermented_grainsID);
		lonlon_milk_half = new ItemLonLonMilk(ChateauConfigLoader.lonlon_milk_halfID, Item.glassBottle, "half", 0);
		lonlon_milk_full = new ItemLonLonMilk(ChateauConfigLoader.lonlon_milk_fullID, lonlon_milk_half, "full", 1);
		bottled_fire = new ItemBottledFire(ChateauConfigLoader.bottled_fireID);
		bottled_ghast = new ItemBottledGhast(ChateauConfigLoader.bottled_ghastID);
		
		if (Reference.FORCE_DEBUG) {
			System.out.println("[CHATEAU ROMANI] Items beginning initialization. . .");
			System.out.println("[CHATEAU ROMANI] Chateau Romani added.");
			System.out.println("[CHATEAU ROMANI] Milk bottle added.");
			System.out.println("[CHATEAU ROMANI] Fermented grains added.");
			System.out.println("[CHATEAU ROMANI] LonLon Milk added.");
			System.out.println("[CHATEAU ROMANI] Bottled Fire added.");

			System.out.println("[CHATEAU ROMANI] Found and added " + Reference.ITEM_COUNT + " items.");
			System.out.println("[CHATEAU ROMANI] Found and added " + Reference.BLOCK_COUNT + " blocks.");
		}
		
	}

}