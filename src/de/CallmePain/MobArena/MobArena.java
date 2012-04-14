package de.CallmePain.MobArena;

import java.util.HashMap;
import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import de.CallmePain.MobArena.Command.MACmdManager;
import de.CallmePain.MobArena.Listener.MAListenerManager;
import de.CallmePain.MobArena.Spawn.MASpawn;
import de.CallmePain.MobArena.Timer.MATimerManager;

public class MobArena extends JavaPlugin {
	public static Logger log = Logger.getLogger("Minecraft");
	public MACmdManager MA_CmdManager;
	public MAListenerManager MA_ListenerManager;
	public MATimerManager MA_TimerManager;
	public MASpawn MA_Spawn;
	
	public HashMap<String, Location> MA_Sel = new HashMap<String, Location>();
	public HashMap<String, Boolean> MA_State = new HashMap<String, Boolean>();
	public int MA_SelTool;
	
	public void onEnable() {
		MA_CmdManager = new MACmdManager(this);
		MA_ListenerManager = new MAListenerManager(this);
		MA_TimerManager = new MATimerManager(this);
		MA_Spawn = new MASpawn(this);
		MA_State.put("game", false);
		MA_SelTool = 271;
		System.out.println(toString() + " enabled");
        log.info("Your plugin has been enabled."); 
	}
	public void onDisable() {
		System.out.println(toString() + " disabled");
		log.info("Your plugin has been disabled.");
	}
}
