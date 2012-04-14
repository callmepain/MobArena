package de.CallmePain.MobArena.Listener;

import org.bukkit.Bukkit;

import de.CallmePain.MobArena.MobArena;

public class MAListenerManager {
	MAPlayerInteractListener MA_PlayerInteractListener;
	MAMobDropListener MA_MobDropListener;
	
	public MAListenerManager(MobArena instance) {
		MA_PlayerInteractListener = new MAPlayerInteractListener(instance);
		MA_MobDropListener = new MAMobDropListener(instance);
		
		Bukkit.getServer().getPluginManager().registerEvents(MA_PlayerInteractListener, instance);
		Bukkit.getServer().getPluginManager().registerEvents(MA_MobDropListener, instance);
	}
}
