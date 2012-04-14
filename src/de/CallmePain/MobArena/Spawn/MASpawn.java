package de.CallmePain.MobArena.Spawn;

import org.bukkit.entity.EntityType;
import de.CallmePain.MobArena.MobArena;

public class MASpawn {
	MobArena plugin;
	
	public MASpawn( MobArena instance) {
		plugin = instance;
	}
	public void doSpawn(int phase) {
		if (phase == 1) {
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.ZOMBIE);
			}
		}
		else if (phase == 2) {
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.ZOMBIE);
			}
			for(int i = 0;i < 5; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SPIDER);
			}
		}
		else if (phase == 3) {
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.ZOMBIE);
			}
			for(int i = 0;i < 5; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SPIDER);
			}
			for(int i = 0;i < 5; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SKELETON);
			}
		}
		else if (phase == 4) {
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.ZOMBIE);
			}
			for(int i = 0;i < 5; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SPIDER);
			}
			for(int i = 0;i < 5; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SKELETON);
			}
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SILVERFISH);
			}
		}
		else if (phase == 5) {
			for(int i = 0;i < 5; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.CREEPER);
			}
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SPIDER);
			}
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SKELETON);
			}
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SILVERFISH);
			}
		}
		else if (phase == 6) {
			for(int i = 0;i < 5; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.CREEPER);
			}
			for(int i = 0;i < 5; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.BLAZE);
			}
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SKELETON);
			}
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SILVERFISH);
			}
		}
		else if (phase == 7) {
			for(int i = 0;i < 7; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.CREEPER);
			}
			for(int i = 0;i < 7; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.BLAZE);
			}
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SKELETON);
			}
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.CAVE_SPIDER);
			}
		}
		else if (phase == 8) {
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.CREEPER);
			}
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.BLAZE);
			}
			for(int i = 0;i < 15; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SKELETON);
			}
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.CAVE_SPIDER);
			}
		}
		else if (phase == 9) {
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.CREEPER);
			}
			for(int i = 0;i < 10; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.BLAZE);
			}
			for(int i = 0;i < 20; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SKELETON);
			}
			for(int i = 0;i < 15; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.CAVE_SPIDER);
			}
		}
		else if (phase == 10) {
			for(int i = 0;i < 15; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.CREEPER);
			}
			for(int i = 0;i < 15; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.BLAZE);
			}
			for(int i = 0;i < 20; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.SKELETON);
			}
			for(int i = 0;i < 20; i++) {
				plugin.MA_Sel.get("Sel1").getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.CAVE_SPIDER);
			}
		}
	}
}
