package de.CallmePain.MobArena.Command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import de.CallmePain.MobArena.MobArena;

public class MACommand implements CommandExecutor{
	MobArena plugin;
	public MACommand(MobArena instance) {
		plugin = instance;
	}
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
		if (args[0].equalsIgnoreCase("test")) {
			return plugin.MA_CmdManager.MA_Test.MATest(sender, cmd, label, args);
		}
		return false;
	}

}
