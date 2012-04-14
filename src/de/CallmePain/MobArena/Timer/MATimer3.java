package de.CallmePain.MobArena.Timer;

import de.CallmePain.MobArena.MobArena;

public class MATimer3 implements Runnable{
	MobArena plugin;
	public MATimer3(MobArena instance) {
		plugin = instance;
	}
	@Override
	public void run() {
		if (!plugin.MA_State.get("game")) {
//			plugin.Util.SPLTimerReset();
		}
		else {
//			plugin.Util.fill(plugin.SPL_Spawn.get("Spawn1").getWorld(), 42);
//			plugin.SPL_Player.getPlayer1().sendMessage(plugin.Chattext + "1");
//			plugin.SPL_Player.getPlayer2().sendMessage(plugin.Chattext + "1");
		}
	}
}
