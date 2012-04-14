package de.CallmePain.MobArena.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import de.CallmePain.MobArena.MobArena;

public class test {
	MobArena plugin;
	public test(MobArena instance) {
		plugin = instance;
	}
	public boolean MATest(CommandSender sender, Command cmd, String label, String[] args) {
//		Player player = (Player) sender;
//		if (!player.hasPermission("MA.join")) {
//			player.sendMessage(ChatColor.RED + "Du hast keine Berechtigung diesen Befehl zu nutzen!");
//			return true;
//		}
//		else {
//		Vector vec = player.getLocation().toVector(); // get player's location vector
//		Vector dir = player.getLocation().getDirection(); // get player's facing
//		vec = vec.add(dir.multiply(3)); // add player's direction * 3 to the location (getting ~3 blocks in front of player)
//		Location location = vec.toLocation(player.getWorld()); // convert back to location
		plugin.MA_State.put("game", true);
		plugin.MA_Spawn.doSpawn(2);
//		}
		return true;
	}
}
