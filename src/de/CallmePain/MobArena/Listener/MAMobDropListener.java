package de.CallmePain.MobArena.Listener;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import de.CallmePain.MobArena.MobArena;

public class MAMobDropListener implements Listener{
	private MobArena plugin;
	MAMobDropListener(MobArena instance) {
		plugin = instance;
	}
	@EventHandler(priority = EventPriority.LOW)
	 public void onEntityDeathEvent(EntityDeathEvent event) {
		if (event.getEntityType() == EntityType.ZOMBIE) {
		 ItemStack ItemToDrop = new ItemStack(Material.APPLE, 1);
			 event.getDrops().add(ItemToDrop);
			 plugin.getServer().broadcastMessage("jo");
		}
	 }
}
