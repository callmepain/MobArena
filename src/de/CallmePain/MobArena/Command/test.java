package de.CallmePain.MobArena.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import de.CallmePain.MobArena.MobArena;

public class test {
	MobArena plugin;
	public test(MobArena instance) {
		plugin = instance;
	}
	public boolean MATest(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
//		if (!player.hasPermission("MA.join")) {
//			player.sendMessage(ChatColor.RED + "Du hast keine Berechtigung diesen Befehl zu nutzen!");
//			return true;
//		}
//		else {
		Vector vec = player.getLocation().toVector(); // get player's location vector
		Vector dir = player.getLocation().getDirection(); // get player's facing
		vec = vec.add(dir.multiply(3)); // add player's direction * 3 to the location (getting ~3 blocks in front of player)
//		Location location = vec.toLocation(player.getWorld()); // convert back to location
		for(int i = 0;i < 1; i++) {
			player.getWorld().spawnCreature(plugin.MA_Sel.get("Sel1"), EntityType.ZOMBIE);
		}
		player.sendMessage("1");
//		}
		return true;
	}
}
