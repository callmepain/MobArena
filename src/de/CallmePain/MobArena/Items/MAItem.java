package de.CallmePain.MobArena.Items;

import java.util.HashMap;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MAItem {
	private static HashMap<Integer, ItemStack> MA_RItem = new HashMap<Integer, ItemStack>();
	public static ItemStack getRandomItem() {
		Random rnd = new Random();
		Random rnd2 = new Random();
		Random rnd3 = new Random();
		Random rnd4 = new Random();
		Random rnd5 = new Random();
		Random rnd6 = new Random();
		Random rnd7 = new Random();
		ItemStack item = new ItemStack(Material.BLAZE_ROD);
		int max64 = 0;
		int max32 = 0;
		int max16 = 0;
		int max5y1 = 0;
		int max5y2 = 0;
		int max5y3 = 0;
		for (int i = 0; i < 5; i++) {
			max5y1 = rnd.nextInt(5);
			if (max5y1 <= 1) {
				max5y1 = 1;
			}
		}
		for (int i = 0; i < 23; i++) {
			max5y2 = rnd2.nextInt(5);
			if (max5y2 <= 1) {
				max5y2 = 1;
			}
		}
		for (int i = 0; i < 14; i++) {
			max5y3 = rnd3.nextInt(5);
			if (max5y3 <= 1) {
				max5y3 = 1;
			}
		}
		for (int i = 0; i < 7; i++) {
			max16 = rnd4.nextInt(16);
			if (max16 <= 5) {
				max16 = 5;
			}
		}
		for (int i = 0; i < 9; i++) {
			max32 = rnd5.nextInt(32);
			if (max32 <= 16) {
				max32 = 16;
			}
		}
		for (int i = 0; i < 13; i++) {
			max64 = rnd6.nextInt(64);
			if (max64 <= 32) {
				max64 = 32;
			}
		}
		MA_RItem.put(1, new ItemStack(Material.SADDLE, 1));
		MA_RItem.put(2, new ItemStack(Material.DIAMOND, max5y3));
		MA_RItem.put(3, new ItemStack(Material.GOLD_INGOT, max5y3));
		MA_RItem.put(4, new ItemStack(Material.IRON_INGOT, max5y3));
		MA_RItem.put(5, new ItemStack(Material.BLAZE_ROD, max5y3));
		MA_RItem.put(20, new ItemStack(Material.BLAZE_ROD, max5y3));
		MA_RItem.put(6, new ItemStack(Material.COOKED_BEEF, max16));
		MA_RItem.put(21, new ItemStack(Material.COOKED_BEEF, max16));
		MA_RItem.put(7, new ItemStack(Material.COOKED_CHICKEN, max16));
		MA_RItem.put(22, new ItemStack(Material.COOKED_CHICKEN, max16));
		MA_RItem.put(8, new ItemStack(Material.COOKIE, max16));
		MA_RItem.put(9, new ItemStack(Material.STONE, max32));
		MA_RItem.put(23, new ItemStack(Material.STONE, max64));
		MA_RItem.put(10, new ItemStack(Material.WOOD, max32));
		MA_RItem.put(24, new ItemStack(Material.WOOD, max32));
		MA_RItem.put(27, new ItemStack(Material.WOOD, max64));
		MA_RItem.put(11, new ItemStack(Material.GOLDEN_APPLE, max5y3));
		MA_RItem.put(12, new ItemStack(Material.TORCH, max64));
		MA_RItem.put(25, new ItemStack(Material.TORCH, max32));
		MA_RItem.put(13, new ItemStack(Material.GLASS, max32));
		MA_RItem.put(26, new ItemStack(Material.GLASS, max32));
		MA_RItem.put(28, new ItemStack(Material.GLASS, max64));
		MA_RItem.put(14, new ItemStack(Material.IRON_PICKAXE, 1));
		MA_RItem.put(15, new ItemStack(Material.IRON_SPADE, 1));
		MA_RItem.put(16, new ItemStack(Material.IRON_AXE, 1));
		MA_RItem.put(17, new ItemStack(Material.DIAMOND_BLOCK, 1));
		MA_RItem.put(18, new ItemStack(Material.GOLD_BLOCK, 1));
		MA_RItem.put(19, new ItemStack(Material.IRON_BLOCK, 1));
		MA_RItem.put(3001, new ItemStack(Material.EXP_BOTTLE, max5y1));
		for (int i = 0; i < 14; i++) {
			int x = rnd7.nextInt(28);
			if (x < 1) {
				item = MA_RItem.get(1);
			}
			else {
				item = MA_RItem.get(x);
			}
		}
		return (item);
	}
}
