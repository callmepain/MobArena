package de.CallmePain.MobArena.Listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import de.CallmePain.MobArena.MobArena;

public class MAPlayerInteractListener implements Listener {
	MobArena plugin;
	public MAPlayerInteractListener(MobArena instance) {
		plugin = instance;
	}
	@EventHandler(priority = EventPriority.LOW)
	public void PlayerInteract(PlayerInteractEvent event) {
		if ((event.getAction() == Action.LEFT_CLICK_BLOCK) || (event.getAction() == Action.RIGHT_CLICK_BLOCK)) {
			if (event.getPlayer().getItemInHand().getTypeId() == Material.getMaterial(plugin.MA_SelTool).getId()) {
				if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
					plugin.MA_Sel.put("Sel1", event.getClickedBlock().getLocation());
					event.getPlayer().sendMessage(ChatColor.GREEN + "Ausgewählter Primär Punkt: " + ChatColor.DARK_PURPLE + event.getClickedBlock().getLocation().getBlockX() + "," + event.getClickedBlock().getLocation().getBlockY() + "," + event.getClickedBlock().getLocation().getBlockZ());
					return;
				}
				else if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
					plugin.MA_Sel.put("Sel2", event.getClickedBlock().getLocation());
					event.getPlayer().sendMessage(ChatColor.GREEN + "Ausgewählter Sekundär Punkt: " + ChatColor.DARK_PURPLE + event.getClickedBlock().getLocation().getBlockX() + "," + event.getClickedBlock().getLocation().getBlockY() + "," + event.getClickedBlock().getLocation().getBlockZ());
					return;
				}
			}
		}
	}
}
