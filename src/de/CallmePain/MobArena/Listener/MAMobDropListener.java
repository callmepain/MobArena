package de.CallmePain.MobArena.Listener;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import de.CallmePain.MobArena.MobArena;
import de.CallmePain.MobArena.Items.MAItem;

public class MAMobDropListener implements Listener{
	private MobArena plugin;
	MAMobDropListener(MobArena instance) {
		plugin = instance;
	}
	@EventHandler(priority = EventPriority.LOW)
	 public void onEntityDeathEvent(EntityDeathEvent event) {
		if (plugin.MA_State.get("game")) {
			if (event.getEntityType() == EntityType.ZOMBIE) {
				 event.getDrops().add(MAItem.getRandomItem());
				 plugin.getServer().broadcastMessage("jo");
			}
		}
	 }
}
